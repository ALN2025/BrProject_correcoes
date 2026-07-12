// Bytecode for: ext.mods.gameserver.data.manager.PartyMatchRoomManager
// File: ext\mods\gameserver\data\manager\PartyMatchRoomManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/manager/PartyMatchRoomManager.class
  Last modified 9 de jul de 2026; size 7161 bytes
  MD5 checksum dc2b41a9c7fd11c27de803d91c768603
  Compiled from "PartyMatchRoomManager.java"
public class ext.mods.gameserver.data.manager.PartyMatchRoomManager
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/data/manager/PartyMatchRoomManager
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 3, methods: 18, attributes: 4
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
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/data/manager/PartyMatchRoomManager._rooms:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/gameserver/data/manager/PartyMatchRoomManager
   #12 = NameAndType        #14:#15       // _rooms:Ljava/util/Map;
   #13 = Utf8               ext/mods/gameserver/data/manager/PartyMatchRoomManager
   #14 = Utf8               _rooms
   #15 = Utf8               Ljava/util/Map;
   #16 = Methodref          #7.#17        // java/util/concurrent/ConcurrentHashMap.newKeySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
   #17 = NameAndType        #18:#19       // newKeySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
   #18 = Utf8               newKeySet
   #19 = Utf8               ()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
   #20 = Fieldref           #11.#21       // ext/mods/gameserver/data/manager/PartyMatchRoomManager._waitingMembers:Ljava/util/Set;
   #21 = NameAndType        #22:#23       // _waitingMembers:Ljava/util/Set;
   #22 = Utf8               _waitingMembers
   #23 = Utf8               Ljava/util/Set;
   #24 = Class              #25           // java/util/concurrent/atomic/AtomicInteger
   #25 = Utf8               java/util/concurrent/atomic/AtomicInteger
   #26 = Methodref          #24.#3        // java/util/concurrent/atomic/AtomicInteger."<init>":()V
   #27 = Fieldref           #11.#28       // ext/mods/gameserver/data/manager/PartyMatchRoomManager._currentId:Ljava/util/concurrent/atomic/AtomicInteger;
   #28 = NameAndType        #29:#30       // _currentId:Ljava/util/concurrent/atomic/AtomicInteger;
   #29 = Utf8               _currentId
   #30 = Utf8               Ljava/util/concurrent/atomic/AtomicInteger;
   #31 = Methodref          #24.#32       // java/util/concurrent/atomic/AtomicInteger.incrementAndGet:()I
   #32 = NameAndType        #33:#34       // incrementAndGet:()I
   #33 = Utf8               incrementAndGet
   #34 = Utf8               ()I
   #35 = Methodref          #36.#37       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #36 = Class              #38           // java/lang/Integer
   #37 = NameAndType        #39:#40       // valueOf:(I)Ljava/lang/Integer;
   #38 = Utf8               java/lang/Integer
   #39 = Utf8               valueOf
   #40 = Utf8               (I)Ljava/lang/Integer;
   #41 = InterfaceMethodref #42.#43       // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #42 = Class              #44           // java/util/Map
   #43 = NameAndType        #45:#46       // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #44 = Utf8               java/util/Map
   #45 = Utf8               get
   #46 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #47 = Class              #48           // ext/mods/gameserver/model/group/PartyMatchRoom
   #48 = Utf8               ext/mods/gameserver/model/group/PartyMatchRoom
   #49 = InterfaceMethodref #42.#50       // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #50 = NameAndType        #51:#52       // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #51 = Utf8               put
   #52 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #53 = InterfaceMethodref #42.#54       // java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
   #54 = NameAndType        #55:#46       // remove:(Ljava/lang/Object;)Ljava/lang/Object;
   #55 = Utf8               remove
   #56 = Methodref          #47.#57       // ext/mods/gameserver/model/group/PartyMatchRoom.disband:()V
   #57 = NameAndType        #58:#6        // disband:()V
   #58 = Utf8               disband
   #59 = Methodref          #11.#60       // ext/mods/gameserver/data/manager/PartyMatchRoomManager.getRooms:(Lext/mods/gameserver/model/actor/Player;II)Ljava/util/stream/Stream;
   #60 = NameAndType        #61:#62       // getRooms:(Lext/mods/gameserver/model/actor/Player;II)Ljava/util/stream/Stream;
   #61 = Utf8               getRooms
   #62 = Utf8               (Lext/mods/gameserver/model/actor/Player;II)Ljava/util/stream/Stream;
   #63 = InterfaceMethodref #64.#65       // java/util/stream/Stream.findFirst:()Ljava/util/Optional;
   #64 = Class              #66           // java/util/stream/Stream
   #65 = NameAndType        #67:#68       // findFirst:()Ljava/util/Optional;
   #66 = Utf8               java/util/stream/Stream
   #67 = Utf8               findFirst
   #68 = Utf8               ()Ljava/util/Optional;
   #69 = Methodref          #70.#71       // java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
   #70 = Class              #72           // java/util/Optional
   #71 = NameAndType        #73:#46       // orElse:(Ljava/lang/Object;)Ljava/lang/Object;
   #72 = Utf8               java/util/Optional
   #73 = Utf8               orElse
   #74 = InterfaceMethodref #64.#75       // java/util/stream/Stream.toList:()Ljava/util/List;
   #75 = NameAndType        #76:#77       // toList:()Ljava/util/List;
   #76 = Utf8               toList
   #77 = Utf8               ()Ljava/util/List;
   #78 = InvokeDynamic      #0:#79        // #0:test:()Ljava/util/function/Predicate;
   #79 = NameAndType        #80:#81       // test:()Ljava/util/function/Predicate;
   #80 = Utf8               test
   #81 = Utf8               ()Ljava/util/function/Predicate;
   #82 = InvokeDynamic      #1:#83        // #1:test:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
   #83 = NameAndType        #80:#84       // test:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
   #84 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
   #85 = InterfaceMethodref #86.#87       // java/util/function/Predicate.and:(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;
   #86 = Class              #88           // java/util/function/Predicate
   #87 = NameAndType        #89:#90       // and:(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;
   #88 = Utf8               java/util/function/Predicate
   #89 = Utf8               and
   #90 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/function/Predicate;
   #91 = InvokeDynamic      #2:#92        // #2:test:(I)Ljava/util/function/Predicate;
   #92 = NameAndType        #80:#93       // test:(I)Ljava/util/function/Predicate;
   #93 = Utf8               (I)Ljava/util/function/Predicate;
   #94 = InvokeDynamic      #3:#83        // #3:test:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
   #95 = InterfaceMethodref #42.#96       // java/util/Map.values:()Ljava/util/Collection;
   #96 = NameAndType        #97:#98       // values:()Ljava/util/Collection;
   #97 = Utf8               values
   #98 = Utf8               ()Ljava/util/Collection;
   #99 = InterfaceMethodref #100.#101     // java/util/Collection.stream:()Ljava/util/stream/Stream;
  #100 = Class              #102          // java/util/Collection
  #101 = NameAndType        #103:#104     // stream:()Ljava/util/stream/Stream;
  #102 = Utf8               java/util/Collection
  #103 = Utf8               stream
  #104 = Utf8               ()Ljava/util/stream/Stream;
  #105 = InterfaceMethodref #64.#106      // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #106 = NameAndType        #107:#108     // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #107 = Utf8               filter
  #108 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #109 = InterfaceMethodref #42.#110      // java/util/Map.size:()I
  #110 = NameAndType        #111:#34      // size:()I
  #111 = Utf8               size
  #112 = InterfaceMethodref #113.#114     // java/util/Set.add:(Ljava/lang/Object;)Z
  #113 = Class              #115          // java/util/Set
  #114 = NameAndType        #116:#117     // add:(Ljava/lang/Object;)Z
  #115 = Utf8               java/util/Set
  #116 = Utf8               add
  #117 = Utf8               (Ljava/lang/Object;)Z
  #118 = InterfaceMethodref #113.#119     // java/util/Set.remove:(Ljava/lang/Object;)Z
  #119 = NameAndType        #55:#117      // remove:(Ljava/lang/Object;)Z
  #120 = Class              #121          // java/util/ArrayList
  #121 = Utf8               java/util/ArrayList
  #122 = Methodref          #120.#3       // java/util/ArrayList."<init>":()V
  #123 = InterfaceMethodref #113.#124     // java/util/Set.iterator:()Ljava/util/Iterator;
  #124 = NameAndType        #125:#126     // iterator:()Ljava/util/Iterator;
  #125 = Utf8               iterator
  #126 = Utf8               ()Ljava/util/Iterator;
  #127 = InterfaceMethodref #128.#129     // java/util/Iterator.hasNext:()Z
  #128 = Class              #130          // java/util/Iterator
  #129 = NameAndType        #131:#132     // hasNext:()Z
  #130 = Utf8               java/util/Iterator
  #131 = Utf8               hasNext
  #132 = Utf8               ()Z
  #133 = InterfaceMethodref #128.#134     // java/util/Iterator.next:()Ljava/lang/Object;
  #134 = NameAndType        #135:#136     // next:()Ljava/lang/Object;
  #135 = Utf8               next
  #136 = Utf8               ()Ljava/lang/Object;
  #137 = Class              #138          // ext/mods/gameserver/model/actor/Player
  #138 = Utf8               ext/mods/gameserver/model/actor/Player
  #139 = Methodref          #137.#140     // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #140 = NameAndType        #141:#142     // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #141 = Utf8               getStatus
  #142 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #143 = Methodref          #144.#145     // ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
  #144 = Class              #146          // ext/mods/gameserver/model/actor/status/PlayerStatus
  #145 = NameAndType        #147:#34      // getLevel:()I
  #146 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
  #147 = Utf8               getLevel
  #148 = InterfaceMethodref #149.#114     // java/util/List.add:(Ljava/lang/Object;)Z
  #149 = Class              #150          // java/util/List
  #150 = Utf8               java/util/List
  #151 = Fieldref           #152.#153     // ext/mods/gameserver/data/manager/PartyMatchRoomManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/manager/PartyMatchRoomManager;
  #152 = Class              #154          // ext/mods/gameserver/data/manager/PartyMatchRoomManager$SingletonHolder
  #153 = NameAndType        #155:#156     // INSTANCE:Lext/mods/gameserver/data/manager/PartyMatchRoomManager;
  #154 = Utf8               ext/mods/gameserver/data/manager/PartyMatchRoomManager$SingletonHolder
  #155 = Utf8               INSTANCE
  #156 = Utf8               Lext/mods/gameserver/data/manager/PartyMatchRoomManager;
  #157 = Methodref          #47.#158      // ext/mods/gameserver/model/group/PartyMatchRoom.getMinLvl:()I
  #158 = NameAndType        #159:#34      // getMinLvl:()I
  #159 = Utf8               getMinLvl
  #160 = Methodref          #47.#161      // ext/mods/gameserver/model/group/PartyMatchRoom.getMaxLvl:()I
  #161 = NameAndType        #162:#34      // getMaxLvl:()I
  #162 = Utf8               getMaxLvl
  #163 = Methodref          #47.#164      // ext/mods/gameserver/model/group/PartyMatchRoom.getLocation:()I
  #164 = NameAndType        #165:#34      // getLocation:()I
  #165 = Utf8               getLocation
  #166 = Methodref          #47.#167      // ext/mods/gameserver/model/group/PartyMatchRoom.getLeader:()Lext/mods/gameserver/model/actor/Player;
  #167 = NameAndType        #168:#169     // getLeader:()Lext/mods/gameserver/model/actor/Player;
  #168 = Utf8               getLeader
  #169 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #170 = Methodref          #137.#171     // ext/mods/gameserver/model/actor/Player.getRegion:()Lext/mods/gameserver/model/WorldRegion;
  #171 = NameAndType        #172:#173     // getRegion:()Lext/mods/gameserver/model/WorldRegion;
  #172 = Utf8               getRegion
  #173 = Utf8               ()Lext/mods/gameserver/model/WorldRegion;
  #174 = Methodref          #47.#175      // ext/mods/gameserver/model/group/PartyMatchRoom.isFull:()Z
  #175 = NameAndType        #176:#132     // isFull:()Z
  #176 = Utf8               isFull
  #177 = Utf8               Signature
  #178 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/group/PartyMatchRoom;>;
  #179 = Utf8               Ljava/util/Set<Lext/mods/gameserver/model/actor/Player;>;
  #180 = Utf8               Code
  #181 = Utf8               LineNumberTable
  #182 = Utf8               LocalVariableTable
  #183 = Utf8               this
  #184 = Utf8               getNewRoomId
  #185 = Utf8               getRoom
  #186 = Utf8               (I)Lext/mods/gameserver/model/group/PartyMatchRoom;
  #187 = Utf8               id
  #188 = Utf8               I
  #189 = Utf8               addRoom
  #190 = Utf8               (ILext/mods/gameserver/model/group/PartyMatchRoom;)V
  #191 = Utf8               room
  #192 = Utf8               Lext/mods/gameserver/model/group/PartyMatchRoom;
  #193 = Utf8               deleteRoom
  #194 = Utf8               (I)V
  #195 = Utf8               StackMapTable
  #196 = Utf8               getFirstAvailableRoom
  #197 = Utf8               (Lext/mods/gameserver/model/actor/Player;II)Lext/mods/gameserver/model/group/PartyMatchRoom;
  #198 = Utf8               player
  #199 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #200 = Utf8               bbs
  #201 = Utf8               levelMode
  #202 = Utf8               getAvailableRooms
  #203 = Utf8               (Lext/mods/gameserver/model/actor/Player;II)Ljava/util/Collection;
  #204 = Utf8               (Lext/mods/gameserver/model/actor/Player;II)Ljava/util/Collection<Lext/mods/gameserver/model/group/PartyMatchRoom;>;
  #205 = Utf8               predicate
  #206 = Utf8               Ljava/util/function/Predicate;
  #207 = Utf8               LocalVariableTypeTable
  #208 = Utf8               Ljava/util/function/Predicate<Lext/mods/gameserver/model/group/PartyMatchRoom;>;
  #209 = Utf8               (Lext/mods/gameserver/model/actor/Player;II)Ljava/util/stream/Stream<Lext/mods/gameserver/model/group/PartyMatchRoom;>;
  #210 = Utf8               getRoomsCount
  #211 = Utf8               getWaitingPlayers
  #212 = Utf8               ()Ljava/util/Set;
  #213 = Utf8               ()Ljava/util/Set<Lext/mods/gameserver/model/actor/Player;>;
  #214 = Utf8               addWaitingPlayer
  #215 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #216 = Utf8               removeWaitingPlayer
  #217 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #218 = Utf8               getAvailableWaitingMembers
  #219 = Utf8               (Lext/mods/gameserver/model/actor/Player;II)Ljava/util/List;
  #220 = Utf8               member
  #221 = Utf8               minLvl
  #222 = Utf8               maxLvl
  #223 = Utf8               members
  #224 = Utf8               Ljava/util/List;
  #225 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;
  #226 = Utf8               (Lext/mods/gameserver/model/actor/Player;II)Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;
  #227 = Utf8               getInstance
  #228 = Utf8               ()Lext/mods/gameserver/data/manager/PartyMatchRoomManager;
  #229 = Utf8               lambda$getRooms$3
  #230 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/group/PartyMatchRoom;)Z
  #231 = Utf8               r
  #232 = Utf8               lambda$getRooms$2
  #233 = Utf8               (ILext/mods/gameserver/model/group/PartyMatchRoom;)Z
  #234 = Utf8               lambda$getRooms$1
  #235 = Utf8               lambda$getRooms$0
  #236 = Utf8               (Lext/mods/gameserver/model/group/PartyMatchRoom;)Z
  #237 = Utf8               SourceFile
  #238 = Utf8               PartyMatchRoomManager.java
  #239 = Utf8               NestMembers
  #240 = Utf8               BootstrapMethods
  #241 = MethodType         #117          //  (Ljava/lang/Object;)Z
  #242 = MethodHandle       6:#243        // REF_invokeStatic ext/mods/gameserver/data/manager/PartyMatchRoomManager.lambda$getRooms$0:(Lext/mods/gameserver/model/group/PartyMatchRoom;)Z
  #243 = Methodref          #11.#244      // ext/mods/gameserver/data/manager/PartyMatchRoomManager.lambda$getRooms$0:(Lext/mods/gameserver/model/group/PartyMatchRoom;)Z
  #244 = NameAndType        #235:#236     // lambda$getRooms$0:(Lext/mods/gameserver/model/group/PartyMatchRoom;)Z
  #245 = MethodType         #236          //  (Lext/mods/gameserver/model/group/PartyMatchRoom;)Z
  #246 = MethodHandle       6:#247        // REF_invokeStatic ext/mods/gameserver/data/manager/PartyMatchRoomManager.lambda$getRooms$1:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/group/PartyMatchRoom;)Z
  #247 = Methodref          #11.#248      // ext/mods/gameserver/data/manager/PartyMatchRoomManager.lambda$getRooms$1:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/group/PartyMatchRoom;)Z
  #248 = NameAndType        #234:#230     // lambda$getRooms$1:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/group/PartyMatchRoom;)Z
  #249 = MethodHandle       6:#250        // REF_invokeStatic ext/mods/gameserver/data/manager/PartyMatchRoomManager.lambda$getRooms$2:(ILext/mods/gameserver/model/group/PartyMatchRoom;)Z
  #250 = Methodref          #11.#251      // ext/mods/gameserver/data/manager/PartyMatchRoomManager.lambda$getRooms$2:(ILext/mods/gameserver/model/group/PartyMatchRoom;)Z
  #251 = NameAndType        #232:#233     // lambda$getRooms$2:(ILext/mods/gameserver/model/group/PartyMatchRoom;)Z
  #252 = MethodHandle       6:#253        // REF_invokeStatic ext/mods/gameserver/data/manager/PartyMatchRoomManager.lambda$getRooms$3:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/group/PartyMatchRoom;)Z
  #253 = Methodref          #11.#254      // ext/mods/gameserver/data/manager/PartyMatchRoomManager.lambda$getRooms$3:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/group/PartyMatchRoom;)Z
  #254 = NameAndType        #229:#230     // lambda$getRooms$3:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/group/PartyMatchRoom;)Z
  #255 = MethodHandle       6:#256        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #256 = Methodref          #257.#258     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #257 = Class              #259          // java/lang/invoke/LambdaMetafactory
  #258 = NameAndType        #260:#261     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #259 = Utf8               java/lang/invoke/LambdaMetafactory
  #260 = Utf8               metafactory
  #261 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #262 = Utf8               InnerClasses
  #263 = Class              #264          // java/util/concurrent/ConcurrentHashMap$KeySetView
  #264 = Utf8               java/util/concurrent/ConcurrentHashMap$KeySetView
  #265 = Utf8               KeySetView
  #266 = Utf8               SingletonHolder
  #267 = Class              #268          // java/lang/invoke/MethodHandles$Lookup
  #268 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #269 = Class              #270          // java/lang/invoke/MethodHandles
  #270 = Utf8               java/lang/invoke/MethodHandles
  #271 = Utf8               Lookup
{
  protected ext.mods.gameserver.data.manager.PartyMatchRoomManager();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/concurrent/ConcurrentHashMap
         8: dup
         9: invokespecial #9                  // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        12: putfield      #10                 // Field _rooms:Ljava/util/Map;
        15: aload_0
        16: invokestatic  #16                 // Method java/util/concurrent/ConcurrentHashMap.newKeySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
        19: putfield      #20                 // Field _waitingMembers:Ljava/util/Set;
        22: aload_0
        23: new           #24                 // class java/util/concurrent/atomic/AtomicInteger
        26: dup
        27: invokespecial #26                 // Method java/util/concurrent/atomic/AtomicInteger."<init>":()V
        30: putfield      #27                 // Field _currentId:Ljava/util/concurrent/atomic/AtomicInteger;
        33: return
      LineNumberTable:
        line 42: 0
        line 35: 4
        line 37: 15
        line 39: 22
        line 43: 33
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      34     0  this   Lext/mods/gameserver/data/manager/PartyMatchRoomManager;

  public int getNewRoomId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #27                 // Field _currentId:Ljava/util/concurrent/atomic/AtomicInteger;
         4: invokevirtual #31                 // Method java/util/concurrent/atomic/AtomicInteger.incrementAndGet:()I
         7: ireturn
      LineNumberTable:
        line 47: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/data/manager/PartyMatchRoomManager;

  public ext.mods.gameserver.model.group.PartyMatchRoom getRoom(int);
    descriptor: (I)Lext/mods/gameserver/model/group/PartyMatchRoom;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _rooms:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #35                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #41,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #47                 // class ext/mods/gameserver/model/group/PartyMatchRoom
        16: areturn
      LineNumberTable:
        line 52: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/data/manager/PartyMatchRoomManager;
            0      17     1    id   I

  public void addRoom(int, ext.mods.gameserver.model.group.PartyMatchRoom);
    descriptor: (ILext/mods/gameserver/model/group/PartyMatchRoom;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: getfield      #10                 // Field _rooms:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #35                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: aload_2
         9: invokeinterface #49,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        14: pop
        15: return
      LineNumberTable:
        line 57: 0
        line 58: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/data/manager/PartyMatchRoomManager;
            0      16     1    id   I
            0      16     2  room   Lext/mods/gameserver/model/group/PartyMatchRoom;

  public void deleteRoom(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _rooms:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #35                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #53,  2           // InterfaceMethod java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #47                 // class ext/mods/gameserver/model/group/PartyMatchRoom
        16: astore_2
        17: aload_2
        18: ifnull        25
        21: aload_2
        22: invokevirtual #56                 // Method ext/mods/gameserver/model/group/PartyMatchRoom.disband:()V
        25: return
      LineNumberTable:
        line 62: 0
        line 63: 17
        line 64: 21
        line 65: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/data/manager/PartyMatchRoomManager;
            0      26     1    id   I
           17       9     2  room   Lext/mods/gameserver/model/group/PartyMatchRoom;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 25
          locals = [ class ext/mods/gameserver/model/group/PartyMatchRoom ]

  public ext.mods.gameserver.model.group.PartyMatchRoom getFirstAvailableRoom(ext.mods.gameserver.model.actor.Player, int, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;II)Lext/mods/gameserver/model/group/PartyMatchRoom;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=4
         0: aload_0
         1: aload_1
         2: iload_2
         3: iload_3
         4: invokevirtual #59                 // Method getRooms:(Lext/mods/gameserver/model/actor/Player;II)Ljava/util/stream/Stream;
         7: invokeinterface #63,  1           // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
        12: aconst_null
        13: invokevirtual #69                 // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        16: checkcast     #47                 // class ext/mods/gameserver/model/group/PartyMatchRoom
        19: areturn
      LineNumberTable:
        line 75: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/data/manager/PartyMatchRoomManager;
            0      20     1 player   Lext/mods/gameserver/model/actor/Player;
            0      20     2   bbs   I
            0      20     3 levelMode   I

  public java.util.Collection<ext.mods.gameserver.model.group.PartyMatchRoom> getAvailableRooms(ext.mods.gameserver.model.actor.Player, int, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;II)Ljava/util/Collection;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=4
         0: aload_0
         1: aload_1
         2: iload_2
         3: iload_3
         4: invokevirtual #59                 // Method getRooms:(Lext/mods/gameserver/model/actor/Player;II)Ljava/util/stream/Stream;
         7: invokeinterface #74,  1           // InterfaceMethod java/util/stream/Stream.toList:()Ljava/util/List;
        12: areturn
      LineNumberTable:
        line 86: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/data/manager/PartyMatchRoomManager;
            0      13     1 player   Lext/mods/gameserver/model/actor/Player;
            0      13     2   bbs   I
            0      13     3 levelMode   I
    Signature: #204                         // (Lext/mods/gameserver/model/actor/Player;II)Ljava/util/Collection<Lext/mods/gameserver/model/group/PartyMatchRoom;>;

  public int getRoomsCount();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _rooms:Ljava/util/Map;
         4: invokeinterface #109,  1          // InterfaceMethod java/util/Map.size:()I
         9: ireturn
      LineNumberTable:
        line 112: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/data/manager/PartyMatchRoomManager;

  public java.util.Set<ext.mods.gameserver.model.actor.Player> getWaitingPlayers();
    descriptor: ()Ljava/util/Set;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #20                 // Field _waitingMembers:Ljava/util/Set;
         4: areturn
      LineNumberTable:
        line 117: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/manager/PartyMatchRoomManager;
    Signature: #213                         // ()Ljava/util/Set<Lext/mods/gameserver/model/actor/Player;>;

  public void addWaitingPlayer(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #20                 // Field _waitingMembers:Ljava/util/Set;
         4: aload_1
         5: invokeinterface #112,  2          // InterfaceMethod java/util/Set.add:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 122: 0
        line 123: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/data/manager/PartyMatchRoomManager;
            0      12     1 player   Lext/mods/gameserver/model/actor/Player;

  public boolean removeWaitingPlayer(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #20                 // Field _waitingMembers:Ljava/util/Set;
         4: aload_1
         5: invokeinterface #118,  2          // InterfaceMethod java/util/Set.remove:(Ljava/lang/Object;)Z
        10: ireturn
      LineNumberTable:
        line 127: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/data/manager/PartyMatchRoomManager;
            0      11     1 player   Lext/mods/gameserver/model/actor/Player;

  public java.util.List<ext.mods.gameserver.model.actor.Player> getAvailableWaitingMembers(ext.mods.gameserver.model.actor.Player, int, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;II)Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=7, args_size=4
         0: new           #120                // class java/util/ArrayList
         3: dup
         4: invokespecial #122                // Method java/util/ArrayList."<init>":()V
         7: astore        4
         9: aload_0
        10: getfield      #20                 // Field _waitingMembers:Ljava/util/Set;
        13: invokeinterface #123,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
        18: astore        5
        20: aload         5
        22: invokeinterface #127,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        27: ifeq          91
        30: aload         5
        32: invokeinterface #133,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        37: checkcast     #137                // class ext/mods/gameserver/model/actor/Player
        40: astore        6
        42: aload         6
        44: aload_1
        45: if_acmpne     51
        48: goto          20
        51: aload         6
        53: invokevirtual #139                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
        56: invokevirtual #143                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
        59: iload_2
        60: if_icmplt     20
        63: aload         6
        65: invokevirtual #139                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
        68: invokevirtual #143                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
        71: iload_3
        72: if_icmple     78
        75: goto          20
        78: aload         4
        80: aload         6
        82: invokeinterface #148,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        87: pop
        88: goto          20
        91: aload         4
        93: areturn
      LineNumberTable:
        line 132: 0
        line 134: 9
        line 136: 42
        line 137: 48
        line 139: 51
        line 140: 75
        line 142: 78
        line 143: 88
        line 144: 91
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           42      46     6 member   Lext/mods/gameserver/model/actor/Player;
            0      94     0  this   Lext/mods/gameserver/data/manager/PartyMatchRoomManager;
            0      94     1 player   Lext/mods/gameserver/model/actor/Player;
            0      94     2 minLvl   I
            0      94     3 maxLvl   I
            9      85     4 members   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            9      85     4 members   Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;
      StackMapTable: number_of_entries = 4
        frame_type = 253 /* append */
          offset_delta = 20
          locals = [ class java/util/List, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 30
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 26 /* same */
        frame_type = 249 /* chop */
          offset_delta = 12
    Signature: #226                         // (Lext/mods/gameserver/model/actor/Player;II)Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;

  public static ext.mods.gameserver.data.manager.PartyMatchRoomManager getInstance();
    descriptor: ()Lext/mods/gameserver/data/manager/PartyMatchRoomManager;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #151                // Field ext/mods/gameserver/data/manager/PartyMatchRoomManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/manager/PartyMatchRoomManager;
         3: areturn
      LineNumberTable:
        line 149: 0
}
SourceFile: "PartyMatchRoomManager.java"
NestMembers:
  ext/mods/gameserver/data/manager/PartyMatchRoomManager$SingletonHolder
BootstrapMethods:
  0: #255 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #241 (Ljava/lang/Object;)Z
      #242 REF_invokeStatic ext/mods/gameserver/data/manager/PartyMatchRoomManager.lambda$getRooms$0:(Lext/mods/gameserver/model/group/PartyMatchRoom;)Z
      #245 (Lext/mods/gameserver/model/group/PartyMatchRoom;)Z
  1: #255 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #241 (Ljava/lang/Object;)Z
      #246 REF_invokeStatic ext/mods/gameserver/data/manager/PartyMatchRoomManager.lambda$getRooms$1:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/group/PartyMatchRoom;)Z
      #245 (Lext/mods/gameserver/model/group/PartyMatchRoom;)Z
  2: #255 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #241 (Ljava/lang/Object;)Z
      #249 REF_invokeStatic ext/mods/gameserver/data/manager/PartyMatchRoomManager.lambda$getRooms$2:(ILext/mods/gameserver/model/group/PartyMatchRoom;)Z
      #245 (Lext/mods/gameserver/model/group/PartyMatchRoom;)Z
  3: #255 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #241 (Ljava/lang/Object;)Z
      #252 REF_invokeStatic ext/mods/gameserver/data/manager/PartyMatchRoomManager.lambda$getRooms$3:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/group/PartyMatchRoom;)Z
      #245 (Lext/mods/gameserver/model/group/PartyMatchRoom;)Z
InnerClasses:
  public static final #265= #263 of #7;   // KeySetView=class java/util/concurrent/ConcurrentHashMap$KeySetView of class java/util/concurrent/ConcurrentHashMap
  public static final #271= #267 of #269; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
