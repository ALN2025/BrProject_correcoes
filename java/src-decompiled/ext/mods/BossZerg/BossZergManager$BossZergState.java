// Bytecode for: ext.mods.BossZerg.BossZergManager$BossZergState
// File: ext\mods\BossZerg\BossZergManager$BossZergState.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/BossZerg/BossZergManager$BossZergState.class
  Last modified 9 de jul de 2026; size 3419 bytes
  MD5 checksum ef677de2efc4f855e4d2da3107759554
  Compiled from "BossZergManager.java"
class ext.mods.BossZerg.BossZergManager$BossZergState
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #11                         // ext/mods/BossZerg/BossZergManager$BossZergState
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 6, methods: 8, attributes: 3
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
   #10 = Fieldref           #11.#12       // ext/mods/BossZerg/BossZergManager$BossZergState.partyAnnounceTimes:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/BossZerg/BossZergManager$BossZergState
   #12 = NameAndType        #14:#15       // partyAnnounceTimes:Ljava/util/Map;
   #13 = Utf8               ext/mods/BossZerg/BossZergManager$BossZergState
   #14 = Utf8               partyAnnounceTimes
   #15 = Utf8               Ljava/util/Map;
   #16 = Fieldref           #11.#17       // ext/mods/BossZerg/BossZergManager$BossZergState.playerEntryTimes:Ljava/util/Map;
   #17 = NameAndType        #18:#15       // playerEntryTimes:Ljava/util/Map;
   #18 = Utf8               playerEntryTimes
   #19 = Methodref          #7.#20        // java/util/concurrent/ConcurrentHashMap.newKeySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
   #20 = NameAndType        #21:#22       // newKeySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
   #21 = Utf8               newKeySet
   #22 = Utf8               ()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
   #23 = Fieldref           #11.#24       // ext/mods/BossZerg/BossZergManager$BossZergState.zergPlayers:Ljava/util/Set;
   #24 = NameAndType        #25:#26       // zergPlayers:Ljava/util/Set;
   #25 = Utf8               zergPlayers
   #26 = Utf8               Ljava/util/Set;
   #27 = Fieldref           #11.#28       // ext/mods/BossZerg/BossZergManager$BossZergState.previewPlayers:Ljava/util/Set;
   #28 = NameAndType        #29:#26       // previewPlayers:Ljava/util/Set;
   #29 = Utf8               previewPlayers
   #30 = Fieldref           #11.#31       // ext/mods/BossZerg/BossZergManager$BossZergState.flagPreviewPlayers:Ljava/util/Set;
   #31 = NameAndType        #32:#26       // flagPreviewPlayers:Ljava/util/Set;
   #32 = Utf8               flagPreviewPlayers
   #33 = Fieldref           #11.#34       // ext/mods/BossZerg/BossZergManager$BossZergState.activePartyLeaders:Ljava/util/Set;
   #34 = NameAndType        #35:#26       // activePartyLeaders:Ljava/util/Set;
   #35 = Utf8               activePartyLeaders
   #36 = InterfaceMethodref #37.#38       // java/util/Set.clear:()V
   #37 = Class              #39           // java/util/Set
   #38 = NameAndType        #40:#6        // clear:()V
   #39 = Utf8               java/util/Set
   #40 = Utf8               clear
   #41 = InterfaceMethodref #37.#42       // java/util/Set.addAll:(Ljava/util/Collection;)Z
   #42 = NameAndType        #43:#44       // addAll:(Ljava/util/Collection;)Z
   #43 = Utf8               addAll
   #44 = Utf8               (Ljava/util/Collection;)Z
   #45 = Methodref          #46.#47       // java/lang/System.currentTimeMillis:()J
   #46 = Class              #48           // java/lang/System
   #47 = NameAndType        #49:#50       // currentTimeMillis:()J
   #48 = Utf8               java/lang/System
   #49 = Utf8               currentTimeMillis
   #50 = Utf8               ()J
   #51 = Class              #52           // java/util/HashSet
   #52 = Utf8               java/util/HashSet
   #53 = Methodref          #51.#3        // java/util/HashSet."<init>":()V
   #54 = InterfaceMethodref #55.#56       // java/util/List.iterator:()Ljava/util/Iterator;
   #55 = Class              #57           // java/util/List
   #56 = NameAndType        #58:#59       // iterator:()Ljava/util/Iterator;
   #57 = Utf8               java/util/List
   #58 = Utf8               iterator
   #59 = Utf8               ()Ljava/util/Iterator;
   #60 = InterfaceMethodref #61.#62       // java/util/Iterator.hasNext:()Z
   #61 = Class              #63           // java/util/Iterator
   #62 = NameAndType        #64:#65       // hasNext:()Z
   #63 = Utf8               java/util/Iterator
   #64 = Utf8               hasNext
   #65 = Utf8               ()Z
   #66 = InterfaceMethodref #61.#67       // java/util/Iterator.next:()Ljava/lang/Object;
   #67 = NameAndType        #68:#69       // next:()Ljava/lang/Object;
   #68 = Utf8               next
   #69 = Utf8               ()Ljava/lang/Object;
   #70 = Class              #71           // ext/mods/gameserver/model/actor/Player
   #71 = Utf8               ext/mods/gameserver/model/actor/Player
   #72 = Methodref          #70.#73       // ext/mods/gameserver/model/actor/Player.getObjectId:()I
   #73 = NameAndType        #74:#75       // getObjectId:()I
   #74 = Utf8               getObjectId
   #75 = Utf8               ()I
   #76 = Methodref          #77.#78       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #77 = Class              #79           // java/lang/Integer
   #78 = NameAndType        #80:#81       // valueOf:(I)Ljava/lang/Integer;
   #79 = Utf8               java/lang/Integer
   #80 = Utf8               valueOf
   #81 = Utf8               (I)Ljava/lang/Integer;
   #82 = InterfaceMethodref #37.#83       // java/util/Set.add:(Ljava/lang/Object;)Z
   #83 = NameAndType        #84:#85       // add:(Ljava/lang/Object;)Z
   #84 = Utf8               add
   #85 = Utf8               (Ljava/lang/Object;)Z
   #86 = InterfaceMethodref #87.#88       // java/util/Map.keySet:()Ljava/util/Set;
   #87 = Class              #89           // java/util/Map
   #88 = NameAndType        #90:#91       // keySet:()Ljava/util/Set;
   #89 = Utf8               java/util/Map
   #90 = Utf8               keySet
   #91 = Utf8               ()Ljava/util/Set;
   #92 = InterfaceMethodref #37.#93       // java/util/Set.retainAll:(Ljava/util/Collection;)Z
   #93 = NameAndType        #94:#44       // retainAll:(Ljava/util/Collection;)Z
   #94 = Utf8               retainAll
   #95 = Methodref          #96.#97       // java/lang/Long.valueOf:(J)Ljava/lang/Long;
   #96 = Class              #98           // java/lang/Long
   #97 = NameAndType        #80:#99       // valueOf:(J)Ljava/lang/Long;
   #98 = Utf8               java/lang/Long
   #99 = Utf8               (J)Ljava/lang/Long;
  #100 = InterfaceMethodref #87.#101      // java/util/Map.putIfAbsent:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #101 = NameAndType        #102:#103     // putIfAbsent:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #102 = Utf8               putIfAbsent
  #103 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #104 = InterfaceMethodref #37.#105      // java/util/Set.contains:(Ljava/lang/Object;)Z
  #105 = NameAndType        #106:#85      // contains:(Ljava/lang/Object;)Z
  #106 = Utf8               contains
  #107 = Utf8               Signature
  #108 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Long;>;
  #109 = Utf8               Ljava/util/Set<Ljava/lang/Integer;>;
  #110 = Utf8               Code
  #111 = Utf8               LineNumberTable
  #112 = Utf8               LocalVariableTable
  #113 = Utf8               this
  #114 = Utf8               Lext/mods/BossZerg/BossZergManager$BossZergState;
  #115 = Utf8               replaceZergPlayers
  #116 = Utf8               (Ljava/util/Set;)V
  #117 = Utf8               playerIds
  #118 = Utf8               LocalVariableTypeTable
  #119 = Utf8               (Ljava/util/Set<Ljava/lang/Integer;>;)V
  #120 = Utf8               replacePreviewPlayers
  #121 = Utf8               replaceFlagPreviewPlayers
  #122 = Utf8               replaceActiveParties
  #123 = Utf8               partyLeaderIds
  #124 = Utf8               updateEntryTimes
  #125 = Utf8               (Ljava/util/List;)V
  #126 = Utf8               player
  #127 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #128 = Utf8               playersInRange
  #129 = Utf8               Ljava/util/List;
  #130 = Utf8               now
  #131 = Utf8               J
  #132 = Utf8               currentIds
  #133 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;
  #134 = Utf8               StackMapTable
  #135 = Utf8               (Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;)V
  #136 = Utf8               isZergPlayer
  #137 = Utf8               (I)Z
  #138 = Utf8               playerId
  #139 = Utf8               I
  #140 = Utf8               isFlagPreviewPlayer
  #141 = Utf8               SourceFile
  #142 = Utf8               BossZergManager.java
  #143 = Utf8               NestHost
  #144 = Class              #145          // ext/mods/BossZerg/BossZergManager
  #145 = Utf8               ext/mods/BossZerg/BossZergManager
  #146 = Utf8               InnerClasses
  #147 = Utf8               BossZergState
  #148 = Class              #149          // java/util/concurrent/ConcurrentHashMap$KeySetView
  #149 = Utf8               java/util/concurrent/ConcurrentHashMap$KeySetView
  #150 = Utf8               KeySetView
{
}
SourceFile: "BossZergManager.java"
NestHost: class ext/mods/BossZerg/BossZergManager
InnerClasses:
  public static final #150= #148 of #7;   // KeySetView=class java/util/concurrent/ConcurrentHashMap$KeySetView of class java/util/concurrent/ConcurrentHashMap
