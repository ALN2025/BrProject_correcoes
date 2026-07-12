// Bytecode for: ext.mods.gameserver.model.actor.container.attackable.HateList
// File: ext\mods\gameserver\model\actor\container\attackable\HateList.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/container/attackable/HateList.class
  Last modified 9 de jul de 2026; size 6109 bytes
  MD5 checksum 3e6cb58961b482ba8f5bda2291b7cfc4
  Compiled from "HateList.java"
public class ext.mods.gameserver.model.actor.container.attackable.HateList extends java.util.concurrent.ConcurrentHashMap<ext.mods.gameserver.model.actor.Creature, java.lang.Double>
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/container/attackable/HateList
  super_class: #2                         // java/util/concurrent/ConcurrentHashMap
  interfaces: 0, fields: 2, methods: 14, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/util/concurrent/ConcurrentHashMap."<init>":()V
    #2 = Class              #4            // java/util/concurrent/ConcurrentHashMap
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/util/concurrent/ConcurrentHashMap
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/actor/container/attackable/HateList._owner:Lext/mods/gameserver/model/actor/Npc;
    #8 = Class              #10           // ext/mods/gameserver/model/actor/container/attackable/HateList
    #9 = NameAndType        #11:#12       // _owner:Lext/mods/gameserver/model/actor/Npc;
   #10 = Utf8               ext/mods/gameserver/model/actor/container/attackable/HateList
   #11 = Utf8               _owner
   #12 = Utf8               Lext/mods/gameserver/model/actor/Npc;
   #13 = Methodref          #14.#15       // ext/mods/gameserver/model/actor/Npc.isInMyTerritory:()Z
   #14 = Class              #16           // ext/mods/gameserver/model/actor/Npc
   #15 = NameAndType        #17:#18       // isInMyTerritory:()Z
   #16 = Utf8               ext/mods/gameserver/model/actor/Npc
   #17 = Utf8               isInMyTerritory
   #18 = Utf8               ()Z
   #19 = String             #20           // SetAggressiveTime
   #20 = Utf8               SetAggressiveTime
   #21 = Methodref          #22.#23       // ext/mods/gameserver/scripting/script/ai/individual/DefaultNpc.getNpcIntAIParam:(Lext/mods/gameserver/model/actor/Npc;Ljava/lang/String;)I
   #22 = Class              #24           // ext/mods/gameserver/scripting/script/ai/individual/DefaultNpc
   #23 = NameAndType        #25:#26       // getNpcIntAIParam:(Lext/mods/gameserver/model/actor/Npc;Ljava/lang/String;)I
   #24 = Utf8               ext/mods/gameserver/scripting/script/ai/individual/DefaultNpc
   #25 = Utf8               getNpcIntAIParam
   #26 = Utf8               (Lext/mods/gameserver/model/actor/Npc;Ljava/lang/String;)I
   #27 = Methodref          #14.#28       // ext/mods/gameserver/model/actor/Npc.getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
   #28 = NameAndType        #29:#30       // getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
   #29 = Utf8               getAI
   #30 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
   #31 = Methodref          #32.#33       // ext/mods/gameserver/model/actor/ai/type/NpcAI.getLifeTime:()I
   #32 = Class              #34           // ext/mods/gameserver/model/actor/ai/type/NpcAI
   #33 = NameAndType        #35:#36       // getLifeTime:()I
   #34 = Utf8               ext/mods/gameserver/model/actor/ai/type/NpcAI
   #35 = Utf8               getLifeTime
   #36 = Utf8               ()I
   #37 = Methodref          #38.#39       // ext/mods/commons/random/Rnd.get:(I)I
   #38 = Class              #40           // ext/mods/commons/random/Rnd
   #39 = NameAndType        #41:#42       // get:(I)I
   #40 = Utf8               ext/mods/commons/random/Rnd
   #41 = Utf8               get
   #42 = Utf8               (I)I
   #43 = Methodref          #8.#44        // ext/mods/gameserver/model/actor/container/attackable/HateList.isEmpty:()Z
   #44 = NameAndType        #45:#18       // isEmpty:()Z
   #45 = Utf8               isEmpty
   #46 = Double             300.0d
   #48 = Double             100.0d
   #50 = Methodref          #8.#51        // ext/mods/gameserver/model/actor/container/attackable/HateList.addHateInfo:(Lext/mods/gameserver/model/actor/Creature;D)V
   #51 = NameAndType        #52:#53       // addHateInfo:(Lext/mods/gameserver/model/actor/Creature;D)V
   #52 = Utf8               addHateInfo
   #53 = Utf8               (Lext/mods/gameserver/model/actor/Creature;D)V
   #54 = Class              #55           // ext/mods/gameserver/model/actor/instance/SiegeGuard
   #55 = Utf8               ext/mods/gameserver/model/actor/instance/SiegeGuard
   #56 = Methodref          #57.#58       // java/lang/Double.valueOf:(D)Ljava/lang/Double;
   #57 = Class              #59           // java/lang/Double
   #58 = NameAndType        #60:#61       // valueOf:(D)Ljava/lang/Double;
   #59 = Utf8               java/lang/Double
   #60 = Utf8               valueOf
   #61 = Utf8               (D)Ljava/lang/Double;
   #62 = InvokeDynamic      #0:#63        // #0:apply:()Ljava/util/function/BiFunction;
   #63 = NameAndType        #64:#65       // apply:()Ljava/util/function/BiFunction;
   #64 = Utf8               apply
   #65 = Utf8               ()Ljava/util/function/BiFunction;
   #66 = Methodref          #8.#67        // ext/mods/gameserver/model/actor/container/attackable/HateList.merge:(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
   #67 = NameAndType        #68:#69       // merge:(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
   #68 = Utf8               merge
   #69 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
   #70 = Methodref          #14.#71       // ext/mods/gameserver/model/actor/Npc.isAlikeDead:()Z
   #71 = NameAndType        #72:#18       // isAlikeDead:()Z
   #72 = Utf8               isAlikeDead
   #73 = Methodref          #8.#74        // ext/mods/gameserver/model/actor/container/attackable/HateList.entrySet:()Ljava/util/Set;
   #74 = NameAndType        #75:#76       // entrySet:()Ljava/util/Set;
   #75 = Utf8               entrySet
   #76 = Utf8               ()Ljava/util/Set;
   #77 = InterfaceMethodref #78.#79       // java/util/Map$Entry.comparingByValue:()Ljava/util/Comparator;
   #78 = Class              #80           // java/util/Map$Entry
   #79 = NameAndType        #81:#82       // comparingByValue:()Ljava/util/Comparator;
   #80 = Utf8               java/util/Map$Entry
   #81 = Utf8               comparingByValue
   #82 = Utf8               ()Ljava/util/Comparator;
   #83 = Methodref          #84.#85       // java/util/Collections.max:(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;
   #84 = Class              #86           // java/util/Collections
   #85 = NameAndType        #87:#88       // max:(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;
   #86 = Utf8               java/util/Collections
   #87 = Utf8               max
   #88 = Utf8               (Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;
   #89 = InterfaceMethodref #78.#90       // java/util/Map$Entry.getKey:()Ljava/lang/Object;
   #90 = NameAndType        #91:#92       // getKey:()Ljava/lang/Object;
   #91 = Utf8               getKey
   #92 = Utf8               ()Ljava/lang/Object;
   #93 = Class              #94           // ext/mods/gameserver/model/actor/Creature
   #94 = Utf8               ext/mods/gameserver/model/actor/Creature
   #95 = Methodref          #8.#96        // ext/mods/gameserver/model/actor/container/attackable/HateList.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #96 = NameAndType        #97:#98       // getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #97 = Utf8               getOrDefault
   #98 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #99 = Methodref          #57.#100      // java/lang/Double.doubleValue:()D
  #100 = NameAndType        #101:#102     // doubleValue:()D
  #101 = Utf8               doubleValue
  #102 = Utf8               ()D
  #103 = Methodref          #8.#104       // ext/mods/gameserver/model/actor/container/attackable/HateList.remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #104 = NameAndType        #105:#106     // remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #105 = Utf8               remove
  #106 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #107 = InvokeDynamic      #1:#108       // #1:apply:(D)Ljava/util/function/BiFunction;
  #108 = NameAndType        #64:#109      // apply:(D)Ljava/util/function/BiFunction;
  #109 = Utf8               (D)Ljava/util/function/BiFunction;
  #110 = Methodref          #8.#111       // ext/mods/gameserver/model/actor/container/attackable/HateList.replaceAll:(Ljava/util/function/BiFunction;)V
  #111 = NameAndType        #112:#113     // replaceAll:(Ljava/util/function/BiFunction;)V
  #112 = Utf8               replaceAll
  #113 = Utf8               (Ljava/util/function/BiFunction;)V
  #114 = InvokeDynamic      #2:#63        // #2:apply:()Ljava/util/function/BiFunction;
  #115 = Methodref          #8.#116       // ext/mods/gameserver/model/actor/container/attackable/HateList.keySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
  #116 = NameAndType        #117:#118     // keySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
  #117 = Utf8               keySet
  #118 = Utf8               ()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
  #119 = InvokeDynamic      #3:#120       // #3:test:(Lext/mods/gameserver/model/actor/container/attackable/HateList;)Ljava/util/function/Predicate;
  #120 = NameAndType        #121:#122     // test:(Lext/mods/gameserver/model/actor/container/attackable/HateList;)Ljava/util/function/Predicate;
  #121 = Utf8               test
  #122 = Utf8               (Lext/mods/gameserver/model/actor/container/attackable/HateList;)Ljava/util/function/Predicate;
  #123 = Methodref          #124.#125     // java/util/concurrent/ConcurrentHashMap$KeySetView.removeIf:(Ljava/util/function/Predicate;)Z
  #124 = Class              #126          // java/util/concurrent/ConcurrentHashMap$KeySetView
  #125 = NameAndType        #127:#128     // removeIf:(Ljava/util/function/Predicate;)Z
  #126 = Utf8               java/util/concurrent/ConcurrentHashMap$KeySetView
  #127 = Utf8               removeIf
  #128 = Utf8               (Ljava/util/function/Predicate;)Z
  #129 = InvokeDynamic      #4:#130       // #4:test:(Lext/mods/gameserver/model/actor/container/attackable/HateList;I)Ljava/util/function/Predicate;
  #130 = NameAndType        #121:#131     // test:(Lext/mods/gameserver/model/actor/container/attackable/HateList;I)Ljava/util/function/Predicate;
  #131 = Utf8               (Lext/mods/gameserver/model/actor/container/attackable/HateList;I)Ljava/util/function/Predicate;
  #132 = Methodref          #14.#133      // ext/mods/gameserver/model/actor/Npc.isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
  #133 = NameAndType        #134:#135     // isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
  #134 = Utf8               isIn3DRadius
  #135 = Utf8               (Lext/mods/gameserver/model/WorldObject;I)Z
  #136 = Methodref          #93.#71       // ext/mods/gameserver/model/actor/Creature.isAlikeDead:()Z
  #137 = Methodref          #93.#138      // ext/mods/gameserver/model/actor/Creature.isVisible:()Z
  #138 = NameAndType        #139:#18      // isVisible:()Z
  #139 = Utf8               isVisible
  #140 = Methodref          #14.#141      // ext/mods/gameserver/model/actor/Npc.knows:(Lext/mods/gameserver/model/WorldObject;)Z
  #141 = NameAndType        #142:#143     // knows:(Lext/mods/gameserver/model/WorldObject;)Z
  #142 = Utf8               knows
  #143 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Z
  #144 = Methodref          #93.#145      // ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
  #145 = NameAndType        #146:#147     // getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
  #146 = Utf8               getActingPlayer
  #147 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #148 = Methodref          #149.#150     // ext/mods/gameserver/model/actor/Player.getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
  #149 = Class              #151          // ext/mods/gameserver/model/actor/Player
  #150 = NameAndType        #152:#153     // getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
  #151 = Utf8               ext/mods/gameserver/model/actor/Player
  #152 = Utf8               getAppearance
  #153 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/Appearance;
  #154 = Methodref          #155.#138     // ext/mods/gameserver/model/actor/container/player/Appearance.isVisible:()Z
  #155 = Class              #156          // ext/mods/gameserver/model/actor/container/player/Appearance
  #156 = Utf8               ext/mods/gameserver/model/actor/container/player/Appearance
  #157 = Utf8               serialVersionUID
  #158 = Utf8               J
  #159 = Utf8               ConstantValue
  #160 = Long               1l
  #162 = Utf8               (Lext/mods/gameserver/model/actor/Npc;)V
  #163 = Utf8               Code
  #164 = Utf8               LineNumberTable
  #165 = Utf8               LocalVariableTable
  #166 = Utf8               this
  #167 = Utf8               Lext/mods/gameserver/model/actor/container/attackable/HateList;
  #168 = Utf8               owner
  #169 = Utf8               addDefaultHateInfo
  #170 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
  #171 = Utf8               aggressiveTime
  #172 = Utf8               I
  #173 = Utf8               attacker
  #174 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #175 = Utf8               i0
  #176 = Utf8               StackMapTable
  #177 = Utf8               hateAmount
  #178 = Utf8               D
  #179 = Utf8               getMostHatedCreature
  #180 = Utf8               ()Lext/mods/gameserver/model/actor/Creature;
  #181 = Utf8               getHate
  #182 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)D
  #183 = Utf8               target
  #184 = Utf8               stopHate
  #185 = Utf8               reduceAllHate
  #186 = Utf8               (D)V
  #187 = Utf8               amount
  #188 = Utf8               cleanAllHate
  #189 = Utf8               refresh
  #190 = Utf8               removeIfOutOfRange
  #191 = Utf8               (I)V
  #192 = Utf8               range
  #193 = Utf8               lambda$removeIfOutOfRange$0
  #194 = Utf8               (ILext/mods/gameserver/model/actor/Creature;)Z
  #195 = Utf8               c
  #196 = Utf8               lambda$refresh$0
  #197 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
  #198 = Utf8               lambda$cleanAllHate$0
  #199 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Ljava/lang/Double;)Ljava/lang/Double;
  #200 = Utf8               k
  #201 = Utf8               v
  #202 = Utf8               Ljava/lang/Double;
  #203 = Utf8               lambda$reduceAllHate$0
  #204 = Utf8               (DLext/mods/gameserver/model/actor/Creature;Ljava/lang/Double;)Ljava/lang/Double;
  #205 = Utf8               Signature
  #206 = Utf8               Ljava/util/concurrent/ConcurrentHashMap<Lext/mods/gameserver/model/actor/Creature;Ljava/lang/Double;>;
  #207 = Utf8               SourceFile
  #208 = Utf8               HateList.java
  #209 = Utf8               BootstrapMethods
  #210 = MethodType         #98           //  (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #211 = MethodHandle       6:#212        // REF_invokeStatic java/lang/Double.sum:(DD)D
  #212 = Methodref          #57.#213      // java/lang/Double.sum:(DD)D
  #213 = NameAndType        #214:#215     // sum:(DD)D
  #214 = Utf8               sum
  #215 = Utf8               (DD)D
  #216 = MethodType         #217          //  (Ljava/lang/Double;Ljava/lang/Double;)Ljava/lang/Double;
  #217 = Utf8               (Ljava/lang/Double;Ljava/lang/Double;)Ljava/lang/Double;
  #218 = MethodHandle       6:#219        // REF_invokeStatic ext/mods/gameserver/model/actor/container/attackable/HateList.lambda$reduceAllHate$0:(DLext/mods/gameserver/model/actor/Creature;Ljava/lang/Double;)Ljava/lang/Double;
  #219 = Methodref          #8.#220       // ext/mods/gameserver/model/actor/container/attackable/HateList.lambda$reduceAllHate$0:(DLext/mods/gameserver/model/actor/Creature;Ljava/lang/Double;)Ljava/lang/Double;
  #220 = NameAndType        #203:#204     // lambda$reduceAllHate$0:(DLext/mods/gameserver/model/actor/Creature;Ljava/lang/Double;)Ljava/lang/Double;
  #221 = MethodType         #199          //  (Lext/mods/gameserver/model/actor/Creature;Ljava/lang/Double;)Ljava/lang/Double;
  #222 = MethodHandle       6:#223        // REF_invokeStatic ext/mods/gameserver/model/actor/container/attackable/HateList.lambda$cleanAllHate$0:(Lext/mods/gameserver/model/actor/Creature;Ljava/lang/Double;)Ljava/lang/Double;
  #223 = Methodref          #8.#224       // ext/mods/gameserver/model/actor/container/attackable/HateList.lambda$cleanAllHate$0:(Lext/mods/gameserver/model/actor/Creature;Ljava/lang/Double;)Ljava/lang/Double;
  #224 = NameAndType        #198:#199     // lambda$cleanAllHate$0:(Lext/mods/gameserver/model/actor/Creature;Ljava/lang/Double;)Ljava/lang/Double;
  #225 = MethodType         #226          //  (Ljava/lang/Object;)Z
  #226 = Utf8               (Ljava/lang/Object;)Z
  #227 = MethodHandle       5:#228        // REF_invokeVirtual ext/mods/gameserver/model/actor/container/attackable/HateList.lambda$refresh$0:(Lext/mods/gameserver/model/actor/Creature;)Z
  #228 = Methodref          #8.#229       // ext/mods/gameserver/model/actor/container/attackable/HateList.lambda$refresh$0:(Lext/mods/gameserver/model/actor/Creature;)Z
  #229 = NameAndType        #196:#197     // lambda$refresh$0:(Lext/mods/gameserver/model/actor/Creature;)Z
  #230 = MethodType         #197          //  (Lext/mods/gameserver/model/actor/Creature;)Z
  #231 = MethodHandle       5:#232        // REF_invokeVirtual ext/mods/gameserver/model/actor/container/attackable/HateList.lambda$removeIfOutOfRange$0:(ILext/mods/gameserver/model/actor/Creature;)Z
  #232 = Methodref          #8.#233       // ext/mods/gameserver/model/actor/container/attackable/HateList.lambda$removeIfOutOfRange$0:(ILext/mods/gameserver/model/actor/Creature;)Z
  #233 = NameAndType        #193:#194     // lambda$removeIfOutOfRange$0:(ILext/mods/gameserver/model/actor/Creature;)Z
  #234 = MethodHandle       6:#235        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #235 = Methodref          #236.#237     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #236 = Class              #238          // java/lang/invoke/LambdaMetafactory
  #237 = NameAndType        #239:#240     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #238 = Utf8               java/lang/invoke/LambdaMetafactory
  #239 = Utf8               metafactory
  #240 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #241 = Utf8               InnerClasses
  #242 = Class              #243          // java/util/Map
  #243 = Utf8               java/util/Map
  #244 = Utf8               Entry
  #245 = Utf8               KeySetView
  #246 = Class              #247          // java/lang/invoke/MethodHandles$Lookup
  #247 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #248 = Class              #249          // java/lang/invoke/MethodHandles
  #249 = Utf8               java/lang/invoke/MethodHandles
  #250 = Utf8               Lookup
{
  public ext.mods.gameserver.model.actor.container.attackable.HateList(ext.mods.gameserver.model.actor.Npc);
    descriptor: (Lext/mods/gameserver/model/actor/Npc;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Npc;
         9: return
      LineNumberTable:
        line 39: 0
        line 41: 4
        line 42: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/actor/container/attackable/HateList;
            0      10     1 owner   Lext/mods/gameserver/model/actor/Npc;

  public void addDefaultHateInfo(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=2
         0: iconst_0
         1: istore_2
         2: aload_0
         3: getfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Npc;
         6: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Npc.isInMyTerritory:()Z
         9: ifeq          97
        12: aload_0
        13: getfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Npc;
        16: ldc           #19                 // String SetAggressiveTime
        18: invokestatic  #21                 // Method ext/mods/gameserver/scripting/script/ai/individual/DefaultNpc.getNpcIntAIParam:(Lext/mods/gameserver/model/actor/Npc;Ljava/lang/String;)I
        21: istore_3
        22: iload_3
        23: iconst_m1
        24: if_icmpne     51
        27: aload_0
        28: getfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Npc;
        31: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/Npc.getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
        34: invokevirtual #31                 // Method ext/mods/gameserver/model/actor/ai/type/NpcAI.getLifeTime:()I
        37: iconst_5
        38: invokestatic  #37                 // Method ext/mods/commons/random/Rnd.get:(I)I
        41: iconst_3
        42: iadd
        43: if_icmplt     81
        46: iconst_1
        47: istore_2
        48: goto          81
        51: iload_3
        52: ifne          60
        55: iconst_1
        56: istore_2
        57: goto          81
        60: aload_0
        61: getfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Npc;
        64: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/Npc.getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
        67: invokevirtual #31                 // Method ext/mods/gameserver/model/actor/ai/type/NpcAI.getLifeTime:()I
        70: iload_3
        71: iconst_4
        72: invokestatic  #37                 // Method ext/mods/commons/random/Rnd.get:(I)I
        75: iadd
        76: if_icmple     81
        79: iconst_1
        80: istore_2
        81: aload_0
        82: getfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Npc;
        85: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/Npc.getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
        88: invokevirtual #31                 // Method ext/mods/gameserver/model/actor/ai/type/NpcAI.getLifeTime:()I
        91: iconst_m1
        92: if_icmple     97
        95: iconst_1
        96: istore_2
        97: aload_0
        98: aload_1
        99: aload_0
       100: invokevirtual #43                 // Method isEmpty:()Z
       103: ifeq          117
       106: iload_2
       107: iconst_1
       108: if_icmpne     117
       111: ldc2_w        #46                 // double 300.0d
       114: goto          120
       117: ldc2_w        #48                 // double 100.0d
       120: invokevirtual #50                 // Method addHateInfo:(Lext/mods/gameserver/model/actor/Creature;D)V
       123: return
      LineNumberTable:
        line 50: 0
        line 52: 2
        line 54: 12
        line 55: 22
        line 57: 27
        line 58: 46
        line 60: 51
        line 61: 55
        line 62: 60
        line 63: 79
        line 65: 81
        line 66: 95
        line 69: 97
        line 70: 123
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           22      75     3 aggressiveTime   I
            0     124     0  this   Lext/mods/gameserver/model/actor/container/attackable/HateList;
            0     124     1 attacker   Lext/mods/gameserver/model/actor/Creature;
            2     122     2    i0   I
      StackMapTable: number_of_entries = 6
        frame_type = 253 /* append */
          offset_delta = 51
          locals = [ int, int ]
        frame_type = 8 /* same */
        frame_type = 20 /* same */
        frame_type = 250 /* chop */
          offset_delta = 15
        frame_type = 255 /* full_frame */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/actor/container/attackable/HateList, class ext/mods/gameserver/model/actor/Creature, int ]
          stack = [ class ext/mods/gameserver/model/actor/container/attackable/HateList, class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/actor/container/attackable/HateList, class ext/mods/gameserver/model/actor/Creature, int ]
          stack = [ class ext/mods/gameserver/model/actor/container/attackable/HateList, class ext/mods/gameserver/model/actor/Creature, double ]

  public void addHateInfo(ext.mods.gameserver.model.actor.Creature, double);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;D)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=3
         0: aload_1
         1: ifnull        21
         4: aload_0
         5: getfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Npc;
         8: instanceof    #54                 // class ext/mods/gameserver/model/actor/instance/SiegeGuard
        11: ifeq          22
        14: aload_1
        15: instanceof    #54                 // class ext/mods/gameserver/model/actor/instance/SiegeGuard
        18: ifeq          22
        21: return
        22: aload_0
        23: aload_1
        24: dload_2
        25: invokestatic  #56                 // Method java/lang/Double.valueOf:(D)Ljava/lang/Double;
        28: invokedynamic #62,  0             // InvokeDynamic #0:apply:()Ljava/util/function/BiFunction;
        33: invokevirtual #66                 // Method merge:(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
        36: pop
        37: return
      LineNumberTable:
        line 79: 0
        line 80: 21
        line 82: 22
        line 83: 37
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      38     0  this   Lext/mods/gameserver/model/actor/container/attackable/HateList;
            0      38     1 attacker   Lext/mods/gameserver/model/actor/Creature;
            0      38     2 hateAmount   D
      StackMapTable: number_of_entries = 2
        frame_type = 21 /* same */
        frame_type = 0 /* same */

  public ext.mods.gameserver.model.actor.Creature getMostHatedCreature();
    descriptor: ()Lext/mods/gameserver/model/actor/Creature;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #43                 // Method isEmpty:()Z
         4: ifne          17
         7: aload_0
         8: getfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Npc;
        11: invokevirtual #70                 // Method ext/mods/gameserver/model/actor/Npc.isAlikeDead:()Z
        14: ifeq          19
        17: aconst_null
        18: areturn
        19: aload_0
        20: invokevirtual #73                 // Method entrySet:()Ljava/util/Set;
        23: invokestatic  #77                 // InterfaceMethod java/util/Map$Entry.comparingByValue:()Ljava/util/Comparator;
        26: invokestatic  #83                 // Method java/util/Collections.max:(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;
        29: checkcast     #78                 // class java/util/Map$Entry
        32: invokeinterface #89,  1           // InterfaceMethod java/util/Map$Entry.getKey:()Ljava/lang/Object;
        37: checkcast     #93                 // class ext/mods/gameserver/model/actor/Creature
        40: areturn
      LineNumberTable:
        line 90: 0
        line 91: 17
        line 93: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      41     0  this   Lext/mods/gameserver/model/actor/container/attackable/HateList;
      StackMapTable: number_of_entries = 2
        frame_type = 17 /* same */
        frame_type = 1 /* same */

  public double getHate(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: dconst_0
         3: invokestatic  #56                 // Method java/lang/Double.valueOf:(D)Ljava/lang/Double;
         6: invokevirtual #95                 // Method getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
         9: checkcast     #57                 // class java/lang/Double
        12: invokevirtual #99                 // Method java/lang/Double.doubleValue:()D
        15: dreturn
      LineNumberTable:
        line 102: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/actor/container/attackable/HateList;
            0      16     1 target   Lext/mods/gameserver/model/actor/Creature;

  public void stopHate(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #103                // Method remove:(Ljava/lang/Object;)Ljava/lang/Object;
         5: pop
         6: return
      LineNumberTable:
        line 111: 0
        line 112: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/actor/container/attackable/HateList;
            0       7     1 target   Lext/mods/gameserver/model/actor/Creature;

  public void reduceAllHate(double);
    descriptor: (D)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=2
         0: aload_0
         1: invokevirtual #43                 // Method isEmpty:()Z
         4: ifeq          8
         7: return
         8: aload_0
         9: dload_1
        10: invokedynamic #107,  0            // InvokeDynamic #1:apply:(D)Ljava/util/function/BiFunction;
        15: invokevirtual #110                // Method replaceAll:(Ljava/util/function/BiFunction;)V
        18: return
      LineNumberTable:
        line 120: 0
        line 121: 7
        line 123: 8
        line 125: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/actor/container/attackable/HateList;
            0      19     1 amount   D
      StackMapTable: number_of_entries = 1
        frame_type = 8 /* same */

  public void cleanAllHate();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #43                 // Method isEmpty:()Z
         4: ifeq          8
         7: return
         8: aload_0
         9: invokedynamic #114,  0            // InvokeDynamic #2:apply:()Ljava/util/function/BiFunction;
        14: invokevirtual #110                // Method replaceAll:(Ljava/util/function/BiFunction;)V
        17: return
      LineNumberTable:
        line 132: 0
        line 133: 7
        line 135: 8
        line 136: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/model/actor/container/attackable/HateList;
      StackMapTable: number_of_entries = 1
        frame_type = 8 /* same */

  public void refresh();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #43                 // Method isEmpty:()Z
         4: ifeq          8
         7: return
         8: aload_0
         9: invokevirtual #115                // Method keySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
        12: aload_0
        13: invokedynamic #119,  0            // InvokeDynamic #3:test:(Lext/mods/gameserver/model/actor/container/attackable/HateList;)Ljava/util/function/Predicate;
        18: invokevirtual #123                // Method java/util/concurrent/ConcurrentHashMap$KeySetView.removeIf:(Ljava/util/function/Predicate;)Z
        21: pop
        22: return
      LineNumberTable:
        line 147: 0
        line 148: 7
        line 150: 8
        line 151: 22
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/model/actor/container/attackable/HateList;
      StackMapTable: number_of_entries = 1
        frame_type = 8 /* same */

  public void removeIfOutOfRange(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #43                 // Method isEmpty:()Z
         4: ifeq          8
         7: return
         8: aload_0
         9: invokevirtual #115                // Method keySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
        12: aload_0
        13: iload_1
        14: invokedynamic #129,  0            // InvokeDynamic #4:test:(Lext/mods/gameserver/model/actor/container/attackable/HateList;I)Ljava/util/function/Predicate;
        19: invokevirtual #123                // Method java/util/concurrent/ConcurrentHashMap$KeySetView.removeIf:(Ljava/util/function/Predicate;)Z
        22: pop
        23: return
      LineNumberTable:
        line 159: 0
        line 160: 7
        line 162: 8
        line 163: 23
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/gameserver/model/actor/container/attackable/HateList;
            0      24     1 range   I
      StackMapTable: number_of_entries = 1
        frame_type = 8 /* same */
}
Signature: #206                         // Ljava/util/concurrent/ConcurrentHashMap<Lext/mods/gameserver/model/actor/Creature;Ljava/lang/Double;>;
SourceFile: "HateList.java"
BootstrapMethods:
  0: #234 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #210 (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      #211 REF_invokeStatic java/lang/Double.sum:(DD)D
      #216 (Ljava/lang/Double;Ljava/lang/Double;)Ljava/lang/Double;
  1: #234 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #210 (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      #218 REF_invokeStatic ext/mods/gameserver/model/actor/container/attackable/HateList.lambda$reduceAllHate$0:(DLext/mods/gameserver/model/actor/Creature;Ljava/lang/Double;)Ljava/lang/Double;
      #221 (Lext/mods/gameserver/model/actor/Creature;Ljava/lang/Double;)Ljava/lang/Double;
  2: #234 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #210 (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      #222 REF_invokeStatic ext/mods/gameserver/model/actor/container/attackable/HateList.lambda$cleanAllHate$0:(Lext/mods/gameserver/model/actor/Creature;Ljava/lang/Double;)Ljava/lang/Double;
      #221 (Lext/mods/gameserver/model/actor/Creature;Ljava/lang/Double;)Ljava/lang/Double;
  3: #234 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #225 (Ljava/lang/Object;)Z
      #227 REF_invokeVirtual ext/mods/gameserver/model/actor/container/attackable/HateList.lambda$refresh$0:(Lext/mods/gameserver/model/actor/Creature;)Z
      #230 (Lext/mods/gameserver/model/actor/Creature;)Z
  4: #234 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #225 (Ljava/lang/Object;)Z
      #231 REF_invokeVirtual ext/mods/gameserver/model/actor/container/attackable/HateList.lambda$removeIfOutOfRange$0:(ILext/mods/gameserver/model/actor/Creature;)Z
      #230 (Lext/mods/gameserver/model/actor/Creature;)Z
InnerClasses:
  public static #244= #78 of #242;        // Entry=class java/util/Map$Entry of class java/util/Map
  public static final #245= #124 of #2;   // KeySetView=class java/util/concurrent/ConcurrentHashMap$KeySetView of class java/util/concurrent/ConcurrentHashMap
  public static final #250= #246 of #248; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
