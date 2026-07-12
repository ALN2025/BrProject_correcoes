// Bytecode for: ext.mods.BossZerg.BossZergManager$PartyPresence
// File: ext\mods\BossZerg\BossZergManager$PartyPresence.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/BossZerg/BossZergManager$PartyPresence.class
  Last modified 9 de jul de 2026; size 5067 bytes
  MD5 checksum ec041efcc586497aa8dc82e80a6604e5
  Compiled from "BossZergManager.java"
class ext.mods.BossZerg.BossZergManager$PartyPresence
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #11                         // ext/mods/BossZerg/BossZergManager$PartyPresence
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 5, methods: 7, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/ArrayList
    #8 = Utf8               java/util/ArrayList
    #9 = Methodref          #7.#3         // java/util/ArrayList."<init>":()V
   #10 = Fieldref           #11.#12       // ext/mods/BossZerg/BossZergManager$PartyPresence.players:Ljava/util/List;
   #11 = Class              #13           // ext/mods/BossZerg/BossZergManager$PartyPresence
   #12 = NameAndType        #14:#15       // players:Ljava/util/List;
   #13 = Utf8               ext/mods/BossZerg/BossZergManager$PartyPresence
   #14 = Utf8               players
   #15 = Utf8               Ljava/util/List;
   #16 = Class              #17           // java/util/HashMap
   #17 = Utf8               java/util/HashMap
   #18 = Methodref          #16.#3        // java/util/HashMap."<init>":()V
   #19 = Fieldref           #11.#20       // ext/mods/BossZerg/BossZergManager$PartyPresence.clanCounts:Ljava/util/Map;
   #20 = NameAndType        #21:#22       // clanCounts:Ljava/util/Map;
   #21 = Utf8               clanCounts
   #22 = Utf8               Ljava/util/Map;
   #23 = Fieldref           #11.#24       // ext/mods/BossZerg/BossZergManager$PartyPresence.clanNames:Ljava/util/Map;
   #24 = NameAndType        #25:#22       // clanNames:Ljava/util/Map;
   #25 = Utf8               clanNames
   #26 = Fieldref           #11.#27       // ext/mods/BossZerg/BossZergManager$PartyPresence.party:Lext/mods/gameserver/model/group/Party;
   #27 = NameAndType        #28:#29       // party:Lext/mods/gameserver/model/group/Party;
   #28 = Utf8               party
   #29 = Utf8               Lext/mods/gameserver/model/group/Party;
   #30 = InterfaceMethodref #31.#32       // java/util/List.add:(Ljava/lang/Object;)Z
   #31 = Class              #33           // java/util/List
   #32 = NameAndType        #34:#35       // add:(Ljava/lang/Object;)Z
   #33 = Utf8               java/util/List
   #34 = Utf8               add
   #35 = Utf8               (Ljava/lang/Object;)Z
   #36 = Methodref          #37.#38       // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
   #37 = Class              #39           // ext/mods/gameserver/model/actor/Player
   #38 = NameAndType        #40:#41       // getClan:()Lext/mods/gameserver/model/pledge/Clan;
   #39 = Utf8               ext/mods/gameserver/model/actor/Player
   #40 = Utf8               getClan
   #41 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
   #42 = Fieldref           #11.#43       // ext/mods/BossZerg/BossZergManager$PartyPresence.noClanCount:I
   #43 = NameAndType        #44:#45       // noClanCount:I
   #44 = Utf8               noClanCount
   #45 = Utf8               I
   #46 = Methodref          #47.#48       // ext/mods/gameserver/model/pledge/Clan.getClanId:()I
   #47 = Class              #49           // ext/mods/gameserver/model/pledge/Clan
   #48 = NameAndType        #50:#51       // getClanId:()I
   #49 = Utf8               ext/mods/gameserver/model/pledge/Clan
   #50 = Utf8               getClanId
   #51 = Utf8               ()I
   #52 = Methodref          #53.#54       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #53 = Class              #55           // java/lang/Integer
   #54 = NameAndType        #56:#57       // valueOf:(I)Ljava/lang/Integer;
   #55 = Utf8               java/lang/Integer
   #56 = Utf8               valueOf
   #57 = Utf8               (I)Ljava/lang/Integer;
   #58 = InvokeDynamic      #0:#59        // #0:apply:()Ljava/util/function/BiFunction;
   #59 = NameAndType        #60:#61       // apply:()Ljava/util/function/BiFunction;
   #60 = Utf8               apply
   #61 = Utf8               ()Ljava/util/function/BiFunction;
   #62 = InterfaceMethodref #63.#64       // java/util/Map.merge:(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
   #63 = Class              #65           // java/util/Map
   #64 = NameAndType        #66:#67       // merge:(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
   #65 = Utf8               java/util/Map
   #66 = Utf8               merge
   #67 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
   #68 = Methodref          #47.#69       // ext/mods/gameserver/model/pledge/Clan.getName:()Ljava/lang/String;
   #69 = NameAndType        #70:#71       // getName:()Ljava/lang/String;
   #70 = Utf8               getName
   #71 = Utf8               ()Ljava/lang/String;
   #72 = InterfaceMethodref #63.#73       // java/util/Map.putIfAbsent:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #73 = NameAndType        #74:#75       // putIfAbsent:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #74 = Utf8               putIfAbsent
   #75 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #76 = InterfaceMethodref #63.#77       // java/util/Map.isEmpty:()Z
   #77 = NameAndType        #78:#79       // isEmpty:()Z
   #78 = Utf8               isEmpty
   #79 = Utf8               ()Z
   #80 = InterfaceMethodref #63.#81       // java/util/Map.size:()I
   #81 = NameAndType        #82:#51       // size:()I
   #82 = Utf8               size
   #83 = InterfaceMethodref #63.#84       // java/util/Map.keySet:()Ljava/util/Set;
   #84 = NameAndType        #85:#86       // keySet:()Ljava/util/Set;
   #85 = Utf8               keySet
   #86 = Utf8               ()Ljava/util/Set;
   #87 = InterfaceMethodref #88.#89       // java/util/Set.iterator:()Ljava/util/Iterator;
   #88 = Class              #90           // java/util/Set
   #89 = NameAndType        #91:#92       // iterator:()Ljava/util/Iterator;
   #90 = Utf8               java/util/Set
   #91 = Utf8               iterator
   #92 = Utf8               ()Ljava/util/Iterator;
   #93 = InterfaceMethodref #94.#95       // java/util/Iterator.next:()Ljava/lang/Object;
   #94 = Class              #96           // java/util/Iterator
   #95 = NameAndType        #97:#98       // next:()Ljava/lang/Object;
   #96 = Utf8               java/util/Iterator
   #97 = Utf8               next
   #98 = Utf8               ()Ljava/lang/Object;
   #99 = String             #100          //
  #100 = Utf8
  #101 = InterfaceMethodref #63.#102      // java/util/Map.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #102 = NameAndType        #103:#75      // getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #103 = Utf8               getOrDefault
  #104 = Class              #105          // java/lang/String
  #105 = Utf8               java/lang/String
  #106 = InterfaceMethodref #63.#107      // java/util/Map.entrySet:()Ljava/util/Set;
  #107 = NameAndType        #108:#86      // entrySet:()Ljava/util/Set;
  #108 = Utf8               entrySet
  #109 = InterfaceMethodref #88.#110      // java/util/Set.stream:()Ljava/util/stream/Stream;
  #110 = NameAndType        #111:#112     // stream:()Ljava/util/stream/Stream;
  #111 = Utf8               stream
  #112 = Utf8               ()Ljava/util/stream/Stream;
  #113 = InvokeDynamic      #1:#114       // #1:test:()Ljava/util/function/Predicate;
  #114 = NameAndType        #115:#116     // test:()Ljava/util/function/Predicate;
  #115 = Utf8               test
  #116 = Utf8               ()Ljava/util/function/Predicate;
  #117 = InterfaceMethodref #118.#119     // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #118 = Class              #120          // java/util/stream/Stream
  #119 = NameAndType        #121:#122     // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #120 = Utf8               java/util/stream/Stream
  #121 = Utf8               filter
  #122 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #123 = InvokeDynamic      #2:#124       // #2:applyAsInt:()Ljava/util/function/ToIntFunction;
  #124 = NameAndType        #125:#126     // applyAsInt:()Ljava/util/function/ToIntFunction;
  #125 = Utf8               applyAsInt
  #126 = Utf8               ()Ljava/util/function/ToIntFunction;
  #127 = InterfaceMethodref #128.#129     // java/util/Comparator.comparingInt:(Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;
  #128 = Class              #130          // java/util/Comparator
  #129 = NameAndType        #131:#132     // comparingInt:(Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;
  #130 = Utf8               java/util/Comparator
  #131 = Utf8               comparingInt
  #132 = Utf8               (Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;
  #133 = InvokeDynamic      #3:#134       // #3:apply:(Lext/mods/BossZerg/BossZergManager$PartyPresence;)Ljava/util/function/Function;
  #134 = NameAndType        #60:#135      // apply:(Lext/mods/BossZerg/BossZergManager$PartyPresence;)Ljava/util/function/Function;
  #135 = Utf8               (Lext/mods/BossZerg/BossZergManager$PartyPresence;)Ljava/util/function/Function;
  #136 = InterfaceMethodref #128.#137     // java/util/Comparator.thenComparing:(Ljava/util/function/Function;)Ljava/util/Comparator;
  #137 = NameAndType        #138:#139     // thenComparing:(Ljava/util/function/Function;)Ljava/util/Comparator;
  #138 = Utf8               thenComparing
  #139 = Utf8               (Ljava/util/function/Function;)Ljava/util/Comparator;
  #140 = InterfaceMethodref #118.#141     // java/util/stream/Stream.max:(Ljava/util/Comparator;)Ljava/util/Optional;
  #141 = NameAndType        #142:#143     // max:(Ljava/util/Comparator;)Ljava/util/Optional;
  #142 = Utf8               max
  #143 = Utf8               (Ljava/util/Comparator;)Ljava/util/Optional;
  #144 = InvokeDynamic      #4:#134       // #4:apply:(Lext/mods/BossZerg/BossZergManager$PartyPresence;)Ljava/util/function/Function;
  #145 = Methodref          #146.#147     // java/util/Optional.map:(Ljava/util/function/Function;)Ljava/util/Optional;
  #146 = Class              #148          // java/util/Optional
  #147 = NameAndType        #149:#150     // map:(Ljava/util/function/Function;)Ljava/util/Optional;
  #148 = Utf8               java/util/Optional
  #149 = Utf8               map
  #150 = Utf8               (Ljava/util/function/Function;)Ljava/util/Optional;
  #151 = Methodref          #146.#152     // java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
  #152 = NameAndType        #153:#154     // orElse:(Ljava/lang/Object;)Ljava/lang/Object;
  #153 = Utf8               orElse
  #154 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #155 = Class              #156          // java/util/HashSet
  #156 = Utf8               java/util/HashSet
  #157 = Methodref          #155.#3       // java/util/HashSet."<init>":()V
  #158 = InterfaceMethodref #31.#89       // java/util/List.iterator:()Ljava/util/Iterator;
  #159 = InterfaceMethodref #94.#160      // java/util/Iterator.hasNext:()Z
  #160 = NameAndType        #161:#79      // hasNext:()Z
  #161 = Utf8               hasNext
  #162 = Methodref          #37.#163      // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #163 = NameAndType        #164:#51      // getObjectId:()I
  #164 = Utf8               getObjectId
  #165 = InterfaceMethodref #88.#32       // java/util/Set.add:(Ljava/lang/Object;)Z
  #166 = InterfaceMethodref #167.#168     // java/util/Map$Entry.getKey:()Ljava/lang/Object;
  #167 = Class              #169          // java/util/Map$Entry
  #168 = NameAndType        #170:#98      // getKey:()Ljava/lang/Object;
  #169 = Utf8               java/util/Map$Entry
  #170 = Utf8               getKey
  #171 = InterfaceMethodref #167.#172     // java/util/Map$Entry.getValue:()Ljava/lang/Object;
  #172 = NameAndType        #173:#98      // getValue:()Ljava/lang/Object;
  #173 = Utf8               getValue
  #174 = Methodref          #53.#175      // java/lang/Integer.intValue:()I
  #175 = NameAndType        #176:#51      // intValue:()I
  #176 = Utf8               intValue
  #177 = Utf8               Signature
  #178 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;
  #179 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;
  #180 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/String;>;
  #181 = Utf8               (Lext/mods/gameserver/model/group/Party;)V
  #182 = Utf8               Code
  #183 = Utf8               LineNumberTable
  #184 = Utf8               LocalVariableTable
  #185 = Utf8               this
  #186 = Utf8               Lext/mods/BossZerg/BossZergManager$PartyPresence;
  #187 = Utf8               addPlayer
  #188 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #189 = Utf8               player
  #190 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #191 = Utf8               clan
  #192 = Utf8               Lext/mods/gameserver/model/pledge/Clan;
  #193 = Utf8               clanId
  #194 = Utf8               StackMapTable
  #195 = Utf8               getDominantClanName
  #196 = Utf8               Ljava/lang/Integer;
  #197 = Utf8               getPlayerIds
  #198 = Utf8               ids
  #199 = Utf8               Ljava/util/Set;
  #200 = Utf8               LocalVariableTypeTable
  #201 = Utf8               Ljava/util/Set<Ljava/lang/Integer;>;
  #202 = Utf8               ()Ljava/util/Set<Ljava/lang/Integer;>;
  #203 = Utf8               lambda$getDominantClanName$2
  #204 = Utf8               (Ljava/util/Map$Entry;)Ljava/lang/String;
  #205 = Utf8               entry
  #206 = Utf8               Ljava/util/Map$Entry;
  #207 = Utf8               lambda$getDominantClanName$1
  #208 = Utf8               lambda$getDominantClanName$0
  #209 = Utf8               (Ljava/util/Map$Entry;)Z
  #210 = Utf8               SourceFile
  #211 = Utf8               BossZergManager.java
  #212 = Utf8               NestHost
  #213 = Class              #214          // ext/mods/BossZerg/BossZergManager
  #214 = Utf8               ext/mods/BossZerg/BossZergManager
  #215 = Utf8               BootstrapMethods
  #216 = MethodType         #75           //  (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #217 = MethodHandle       6:#218        // REF_invokeStatic java/lang/Integer.sum:(II)I
  #218 = Methodref          #53.#219      // java/lang/Integer.sum:(II)I
  #219 = NameAndType        #220:#221     // sum:(II)I
  #220 = Utf8               sum
  #221 = Utf8               (II)I
  #222 = MethodType         #223          //  (Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/Integer;
  #223 = Utf8               (Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/Integer;
  #224 = MethodType         #35           //  (Ljava/lang/Object;)Z
  #225 = MethodHandle       6:#226        // REF_invokeStatic ext/mods/BossZerg/BossZergManager$PartyPresence.lambda$getDominantClanName$0:(Ljava/util/Map$Entry;)Z
  #226 = Methodref          #11.#227      // ext/mods/BossZerg/BossZergManager$PartyPresence.lambda$getDominantClanName$0:(Ljava/util/Map$Entry;)Z
  #227 = NameAndType        #208:#209     // lambda$getDominantClanName$0:(Ljava/util/Map$Entry;)Z
  #228 = MethodType         #209          //  (Ljava/util/Map$Entry;)Z
  #229 = MethodType         #230          //  (Ljava/lang/Object;)I
  #230 = Utf8               (Ljava/lang/Object;)I
  #231 = MethodHandle       9:#171        // REF_invokeInterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
  #232 = MethodType         #233          //  (Ljava/util/Map$Entry;)I
  #233 = Utf8               (Ljava/util/Map$Entry;)I
  #234 = MethodType         #154          //  (Ljava/lang/Object;)Ljava/lang/Object;
  #235 = MethodHandle       5:#236        // REF_invokeVirtual ext/mods/BossZerg/BossZergManager$PartyPresence.lambda$getDominantClanName$1:(Ljava/util/Map$Entry;)Ljava/lang/String;
  #236 = Methodref          #11.#237      // ext/mods/BossZerg/BossZergManager$PartyPresence.lambda$getDominantClanName$1:(Ljava/util/Map$Entry;)Ljava/lang/String;
  #237 = NameAndType        #207:#204     // lambda$getDominantClanName$1:(Ljava/util/Map$Entry;)Ljava/lang/String;
  #238 = MethodType         #204          //  (Ljava/util/Map$Entry;)Ljava/lang/String;
  #239 = MethodHandle       5:#240        // REF_invokeVirtual ext/mods/BossZerg/BossZergManager$PartyPresence.lambda$getDominantClanName$2:(Ljava/util/Map$Entry;)Ljava/lang/String;
  #240 = Methodref          #11.#241      // ext/mods/BossZerg/BossZergManager$PartyPresence.lambda$getDominantClanName$2:(Ljava/util/Map$Entry;)Ljava/lang/String;
  #241 = NameAndType        #203:#204     // lambda$getDominantClanName$2:(Ljava/util/Map$Entry;)Ljava/lang/String;
  #242 = MethodHandle       6:#243        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #243 = Methodref          #244.#245     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #244 = Class              #246          // java/lang/invoke/LambdaMetafactory
  #245 = NameAndType        #247:#248     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #246 = Utf8               java/lang/invoke/LambdaMetafactory
  #247 = Utf8               metafactory
  #248 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #249 = Utf8               InnerClasses
  #250 = Utf8               PartyPresence
  #251 = Utf8               Entry
  #252 = Class              #253          // java/lang/invoke/MethodHandles$Lookup
  #253 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #254 = Class              #255          // java/lang/invoke/MethodHandles
  #255 = Utf8               java/lang/invoke/MethodHandles
  #256 = Utf8               Lookup
{
}
SourceFile: "BossZergManager.java"
NestHost: class ext/mods/BossZerg/BossZergManager
BootstrapMethods:
  0: #242 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #216 (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      #217 REF_invokeStatic java/lang/Integer.sum:(II)I
      #222 (Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/Integer;
  1: #242 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #224 (Ljava/lang/Object;)Z
      #225 REF_invokeStatic ext/mods/BossZerg/BossZergManager$PartyPresence.lambda$getDominantClanName$0:(Ljava/util/Map$Entry;)Z
      #228 (Ljava/util/Map$Entry;)Z
  2: #242 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #229 (Ljava/lang/Object;)I
      #231 REF_invokeInterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
      #232 (Ljava/util/Map$Entry;)I
  3: #242 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #234 (Ljava/lang/Object;)Ljava/lang/Object;
      #235 REF_invokeVirtual ext/mods/BossZerg/BossZergManager$PartyPresence.lambda$getDominantClanName$1:(Ljava/util/Map$Entry;)Ljava/lang/String;
      #238 (Ljava/util/Map$Entry;)Ljava/lang/String;
  4: #242 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #234 (Ljava/lang/Object;)Ljava/lang/Object;
      #239 REF_invokeVirtual ext/mods/BossZerg/BossZergManager$PartyPresence.lambda$getDominantClanName$2:(Ljava/util/Map$Entry;)Ljava/lang/String;
      #238 (Ljava/util/Map$Entry;)Ljava/lang/String;
InnerClasses:
  public static #251= #167 of #63;        // Entry=class java/util/Map$Entry of class java/util/Map
  public static final #256= #252 of #254; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
