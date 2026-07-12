// Bytecode for: ext.mods.gameserver.data.manager.AntiFeedManager
// File: ext\mods\gameserver\data\manager\AntiFeedManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/manager/AntiFeedManager.class
  Last modified 9 de jul de 2026; size 6832 bytes
  MD5 checksum 0721c912d9f89d65dbba91da700bd321
  Compiled from "AntiFeedManager.java"
public final class ext.mods.gameserver.data.manager.AntiFeedManager
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/data/manager/AntiFeedManager
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 8, methods: 16, attributes: 4
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
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/data/manager/AntiFeedManager._lastDeathTimes:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/gameserver/data/manager/AntiFeedManager
   #12 = NameAndType        #14:#15       // _lastDeathTimes:Ljava/util/Map;
   #13 = Utf8               ext/mods/gameserver/data/manager/AntiFeedManager
   #14 = Utf8               _lastDeathTimes
   #15 = Utf8               Ljava/util/Map;
   #16 = Fieldref           #11.#17       // ext/mods/gameserver/data/manager/AntiFeedManager._eventIPs:Ljava/util/Map;
   #17 = NameAndType        #18:#15       // _eventIPs:Ljava/util/Map;
   #18 = Utf8               _eventIPs
   #19 = Methodref          #20.#21       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #20 = Class              #22           // java/lang/Integer
   #21 = NameAndType        #23:#24       // valueOf:(I)Ljava/lang/Integer;
   #22 = Utf8               java/lang/Integer
   #23 = Utf8               valueOf
   #24 = Utf8               (I)Ljava/lang/Integer;
   #25 = Methodref          #26.#27       // java/lang/System.currentTimeMillis:()J
   #26 = Class              #28           // java/lang/System
   #27 = NameAndType        #29:#30       // currentTimeMillis:()J
   #28 = Utf8               java/lang/System
   #29 = Utf8               currentTimeMillis
   #30 = Utf8               ()J
   #31 = Methodref          #32.#33       // java/lang/Long.valueOf:(J)Ljava/lang/Long;
   #32 = Class              #34           // java/lang/Long
   #33 = NameAndType        #23:#35       // valueOf:(J)Ljava/lang/Long;
   #34 = Utf8               java/lang/Long
   #35 = Utf8               (J)Ljava/lang/Long;
   #36 = InterfaceMethodref #37.#38       // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #37 = Class              #39           // java/util/Map
   #38 = NameAndType        #40:#41       // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #39 = Utf8               java/util/Map
   #40 = Utf8               put
   #41 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #42 = Fieldref           #43.#44       // ext/mods/Config.ANTIFEED_ENABLE:Z
   #43 = Class              #45           // ext/mods/Config
   #44 = NameAndType        #46:#47       // ANTIFEED_ENABLE:Z
   #45 = Utf8               ext/mods/Config
   #46 = Utf8               ANTIFEED_ENABLE
   #47 = Utf8               Z
   #48 = Methodref          #49.#50       // ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #49 = Class              #51           // ext/mods/gameserver/model/actor/Creature
   #50 = NameAndType        #52:#53       // getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #51 = Utf8               ext/mods/gameserver/model/actor/Creature
   #52 = Utf8               getActingPlayer
   #53 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #54 = Methodref          #55.#56       // ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
   #55 = Class              #57           // ext/mods/gameserver/model/actor/Player
   #56 = NameAndType        #58:#59       // getClient:()Lext/mods/gameserver/network/GameClient;
   #57 = Utf8               ext/mods/gameserver/model/actor/Player
   #58 = Utf8               getClient
   #59 = Utf8               ()Lext/mods/gameserver/network/GameClient;
   #60 = Methodref          #61.#62       // ext/mods/gameserver/network/GameClient.isDetached:()Z
   #61 = Class              #63           // ext/mods/gameserver/network/GameClient
   #62 = NameAndType        #64:#65       // isDetached:()Z
   #63 = Utf8               ext/mods/gameserver/network/GameClient
   #64 = Utf8               isDetached
   #65 = Utf8               ()Z
   #66 = Fieldref           #43.#67       // ext/mods/Config.ANTIFEED_INTERVAL:I
   #67 = NameAndType        #68:#69       // ANTIFEED_INTERVAL:I
   #68 = Utf8               ANTIFEED_INTERVAL
   #69 = Utf8               I
   #70 = Methodref          #55.#71       // ext/mods/gameserver/model/actor/Player.getObjectId:()I
   #71 = NameAndType        #72:#73       // getObjectId:()I
   #72 = Utf8               getObjectId
   #73 = Utf8               ()I
   #74 = InterfaceMethodref #37.#75       // java/util/Map.containsKey:(Ljava/lang/Object;)Z
   #75 = NameAndType        #76:#77       // containsKey:(Ljava/lang/Object;)Z
   #76 = Utf8               containsKey
   #77 = Utf8               (Ljava/lang/Object;)Z
   #78 = InterfaceMethodref #37.#79       // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #79 = NameAndType        #80:#81       // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #80 = Utf8               get
   #81 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #82 = Methodref          #32.#83       // java/lang/Long.longValue:()J
   #83 = NameAndType        #84:#30       // longValue:()J
   #84 = Utf8               longValue
   #85 = Fieldref           #43.#86       // ext/mods/Config.ANTIFEED_DUALBOX:Z
   #86 = NameAndType        #87:#47       // ANTIFEED_DUALBOX:Z
   #87 = Utf8               ANTIFEED_DUALBOX
   #88 = Fieldref           #43.#89       // ext/mods/Config.ANTIFEED_DISCONNECTED_AS_DUALBOX:Z
   #89 = NameAndType        #90:#47       // ANTIFEED_DISCONNECTED_AS_DUALBOX:Z
   #90 = Utf8               ANTIFEED_DISCONNECTED_AS_DUALBOX
   #91 = Methodref          #61.#92       // ext/mods/gameserver/network/GameClient.getConnection:()Lext/mods/commons/mmocore/MMOConnection;
   #92 = NameAndType        #93:#94       // getConnection:()Lext/mods/commons/mmocore/MMOConnection;
   #93 = Utf8               getConnection
   #94 = Utf8               ()Lext/mods/commons/mmocore/MMOConnection;
   #95 = Methodref          #96.#97       // ext/mods/commons/mmocore/MMOConnection.getInetAddress:()Ljava/net/InetAddress;
   #96 = Class              #98           // ext/mods/commons/mmocore/MMOConnection
   #97 = NameAndType        #99:#100      // getInetAddress:()Ljava/net/InetAddress;
   #98 = Utf8               ext/mods/commons/mmocore/MMOConnection
   #99 = Utf8               getInetAddress
  #100 = Utf8               ()Ljava/net/InetAddress;
  #101 = Methodref          #102.#103     // java/net/InetAddress.equals:(Ljava/lang/Object;)Z
  #102 = Class              #104          // java/net/InetAddress
  #103 = NameAndType        #105:#77      // equals:(Ljava/lang/Object;)Z
  #104 = Utf8               java/net/InetAddress
  #105 = Utf8               equals
  #106 = InterfaceMethodref #37.#107      // java/util/Map.clear:()V
  #107 = NameAndType        #108:#6       // clear:()V
  #108 = Utf8               clear
  #109 = InterfaceMethodref #37.#110      // java/util/Map.putIfAbsent:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #110 = NameAndType        #111:#41      // putIfAbsent:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #111 = Utf8               putIfAbsent
  #112 = Methodref          #11.#113      // ext/mods/gameserver/data/manager/AntiFeedManager.tryAddClient:(ILext/mods/gameserver/network/GameClient;I)Z
  #113 = NameAndType        #114:#115     // tryAddClient:(ILext/mods/gameserver/network/GameClient;I)Z
  #114 = Utf8               tryAddClient
  #115 = Utf8               (ILext/mods/gameserver/network/GameClient;I)Z
  #116 = Methodref          #102.#117     // java/net/InetAddress.hashCode:()I
  #117 = NameAndType        #118:#73      // hashCode:()I
  #118 = Utf8               hashCode
  #119 = Class              #120          // java/util/concurrent/atomic/AtomicInteger
  #120 = Utf8               java/util/concurrent/atomic/AtomicInteger
  #121 = Methodref          #119.#3       // java/util/concurrent/atomic/AtomicInteger."<init>":()V
  #122 = Methodref          #119.#123     // java/util/concurrent/atomic/AtomicInteger.get:()I
  #123 = NameAndType        #80:#73       // get:()I
  #124 = Methodref          #119.#125     // java/util/concurrent/atomic/AtomicInteger.incrementAndGet:()I
  #125 = NameAndType        #126:#73      // incrementAndGet:()I
  #126 = Utf8               incrementAndGet
  #127 = Methodref          #11.#128      // ext/mods/gameserver/data/manager/AntiFeedManager.removeClient:(ILext/mods/gameserver/network/GameClient;)Z
  #128 = NameAndType        #129:#130     // removeClient:(ILext/mods/gameserver/network/GameClient;)Z
  #129 = Utf8               removeClient
  #130 = Utf8               (ILext/mods/gameserver/network/GameClient;)Z
  #131 = InvokeDynamic      #0:#132       // #0:apply:()Ljava/util/function/BiFunction;
  #132 = NameAndType        #133:#134     // apply:()Ljava/util/function/BiFunction;
  #133 = Utf8               apply
  #134 = Utf8               ()Ljava/util/function/BiFunction;
  #135 = InterfaceMethodref #37.#136      // java/util/Map.computeIfPresent:(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
  #136 = NameAndType        #137:#138     // computeIfPresent:(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
  #137 = Utf8               computeIfPresent
  #138 = Utf8               (Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
  #139 = InvokeDynamic      #1:#140       // #1:accept:(Lext/mods/gameserver/data/manager/AntiFeedManager;Lext/mods/gameserver/network/GameClient;)Ljava/util/function/BiConsumer;
  #140 = NameAndType        #141:#142     // accept:(Lext/mods/gameserver/data/manager/AntiFeedManager;Lext/mods/gameserver/network/GameClient;)Ljava/util/function/BiConsumer;
  #141 = Utf8               accept
  #142 = Utf8               (Lext/mods/gameserver/data/manager/AntiFeedManager;Lext/mods/gameserver/network/GameClient;)Ljava/util/function/BiConsumer;
  #143 = InterfaceMethodref #37.#144      // java/util/Map.forEach:(Ljava/util/function/BiConsumer;)V
  #144 = NameAndType        #145:#146     // forEach:(Ljava/util/function/BiConsumer;)V
  #145 = Utf8               forEach
  #146 = Utf8               (Ljava/util/function/BiConsumer;)V
  #147 = Methodref          #11.#148      // ext/mods/gameserver/data/manager/AntiFeedManager.getLimit:(Lext/mods/gameserver/network/GameClient;I)I
  #148 = NameAndType        #149:#150     // getLimit:(Lext/mods/gameserver/network/GameClient;I)I
  #149 = Utf8               getLimit
  #150 = Utf8               (Lext/mods/gameserver/network/GameClient;I)I
  #151 = Fieldref           #152.#153     // ext/mods/gameserver/data/manager/AntiFeedManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/manager/AntiFeedManager;
  #152 = Class              #154          // ext/mods/gameserver/data/manager/AntiFeedManager$SingletonHolder
  #153 = NameAndType        #155:#156     // INSTANCE:Lext/mods/gameserver/data/manager/AntiFeedManager;
  #154 = Utf8               ext/mods/gameserver/data/manager/AntiFeedManager$SingletonHolder
  #155 = Utf8               INSTANCE
  #156 = Utf8               Lext/mods/gameserver/data/manager/AntiFeedManager;
  #157 = Methodref          #20.#158      // java/lang/Integer.intValue:()I
  #158 = NameAndType        #159:#73      // intValue:()I
  #159 = Utf8               intValue
  #160 = Methodref          #119.#161     // java/util/concurrent/atomic/AtomicInteger.decrementAndGet:()I
  #161 = NameAndType        #162:#73      // decrementAndGet:()I
  #162 = Utf8               decrementAndGet
  #163 = Utf8               GAME_ID
  #164 = Utf8               ConstantValue
  #165 = Integer            0
  #166 = Utf8               OLYMPIAD_ID
  #167 = Integer            1
  #168 = Utf8               CTF_ID
  #169 = Integer            2
  #170 = Utf8               DM_ID
  #171 = Integer            3
  #172 = Utf8               LM_ID
  #173 = Integer            4
  #174 = Utf8               TVT_ID
  #175 = Integer            5
  #176 = Utf8               Signature
  #177 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Long;>;
  #178 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/util/Map<Ljava/lang/Integer;Ljava/util/concurrent/atomic/AtomicInteger;>;>;
  #179 = Utf8               Code
  #180 = Utf8               LineNumberTable
  #181 = Utf8               LocalVariableTable
  #182 = Utf8               this
  #183 = Utf8               setLastDeathTime
  #184 = Utf8               (I)V
  #185 = Utf8               objectId
  #186 = Utf8               check
  #187 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Z
  #188 = Utf8               attackerPlayer
  #189 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #190 = Utf8               targetClient
  #191 = Utf8               Lext/mods/gameserver/network/GameClient;
  #192 = Utf8               attackerClient
  #193 = Utf8               attacker
  #194 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #195 = Utf8               target
  #196 = Utf8               targetPlayer
  #197 = Utf8               StackMapTable
  #198 = Utf8               registerEvent
  #199 = Utf8               eventId
  #200 = Utf8               tryAddPlayer
  #201 = Utf8               (ILext/mods/gameserver/model/actor/Player;I)Z
  #202 = Utf8               player
  #203 = Utf8               max
  #204 = Utf8               existingValue
  #205 = Utf8               Ljava/util/concurrent/atomic/AtomicInteger;
  #206 = Utf8               client
  #207 = Utf8               event
  #208 = Utf8               addrHash
  #209 = Utf8               Ljava/lang/Integer;
  #210 = Utf8               connectionCount
  #211 = Utf8               LocalVariableTypeTable
  #212 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/util/concurrent/atomic/AtomicInteger;>;
  #213 = Utf8               removePlayer
  #214 = Utf8               (ILext/mods/gameserver/model/actor/Player;)Z
  #215 = Utf8               onDisconnect
  #216 = Utf8               (Lext/mods/gameserver/network/GameClient;)V
  #217 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)I
  #218 = Utf8               getInstance
  #219 = Utf8               ()Lext/mods/gameserver/data/manager/AntiFeedManager;
  #220 = Utf8               lambda$onDisconnect$0
  #221 = Utf8               (Lext/mods/gameserver/network/GameClient;Ljava/lang/Integer;Ljava/util/Map;)V
  #222 = Utf8               k
  #223 = Utf8               v
  #224 = Utf8               lambda$removeClient$0
  #225 = Utf8               (Ljava/lang/Integer;Ljava/util/concurrent/atomic/AtomicInteger;)Ljava/util/concurrent/atomic/AtomicInteger;
  #226 = Utf8               SourceFile
  #227 = Utf8               AntiFeedManager.java
  #228 = Utf8               NestMembers
  #229 = Utf8               BootstrapMethods
  #230 = MethodType         #41           //  (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #231 = MethodHandle       6:#232        // REF_invokeStatic ext/mods/gameserver/data/manager/AntiFeedManager.lambda$removeClient$0:(Ljava/lang/Integer;Ljava/util/concurrent/atomic/AtomicInteger;)Ljava/util/concurrent/atomic/AtomicInteger;
  #232 = Methodref          #11.#233      // ext/mods/gameserver/data/manager/AntiFeedManager.lambda$removeClient$0:(Ljava/lang/Integer;Ljava/util/concurrent/atomic/AtomicInteger;)Ljava/util/concurrent/atomic/AtomicInteger;
  #233 = NameAndType        #224:#225     // lambda$removeClient$0:(Ljava/lang/Integer;Ljava/util/concurrent/atomic/AtomicInteger;)Ljava/util/concurrent/atomic/AtomicInteger;
  #234 = MethodType         #225          //  (Ljava/lang/Integer;Ljava/util/concurrent/atomic/AtomicInteger;)Ljava/util/concurrent/atomic/AtomicInteger;
  #235 = MethodType         #236          //  (Ljava/lang/Object;Ljava/lang/Object;)V
  #236 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)V
  #237 = MethodHandle       5:#238        // REF_invokeVirtual ext/mods/gameserver/data/manager/AntiFeedManager.lambda$onDisconnect$0:(Lext/mods/gameserver/network/GameClient;Ljava/lang/Integer;Ljava/util/Map;)V
  #238 = Methodref          #11.#239      // ext/mods/gameserver/data/manager/AntiFeedManager.lambda$onDisconnect$0:(Lext/mods/gameserver/network/GameClient;Ljava/lang/Integer;Ljava/util/Map;)V
  #239 = NameAndType        #220:#221     // lambda$onDisconnect$0:(Lext/mods/gameserver/network/GameClient;Ljava/lang/Integer;Ljava/util/Map;)V
  #240 = MethodType         #241          //  (Ljava/lang/Integer;Ljava/util/Map;)V
  #241 = Utf8               (Ljava/lang/Integer;Ljava/util/Map;)V
  #242 = MethodHandle       6:#243        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #243 = Methodref          #244.#245     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #244 = Class              #246          // java/lang/invoke/LambdaMetafactory
  #245 = NameAndType        #247:#248     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #246 = Utf8               java/lang/invoke/LambdaMetafactory
  #247 = Utf8               metafactory
  #248 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #249 = Utf8               InnerClasses
  #250 = Utf8               SingletonHolder
  #251 = Class              #252          // java/lang/invoke/MethodHandles$Lookup
  #252 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #253 = Class              #254          // java/lang/invoke/MethodHandles
  #254 = Utf8               java/lang/invoke/MethodHandles
  #255 = Utf8               Lookup
{
  public static final int GAME_ID;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 0

  public static final int OLYMPIAD_ID;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 1

  public static final int CTF_ID;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 2

  public static final int DM_ID;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 3

  public static final int LM_ID;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 4

  public static final int TVT_ID;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 5

  protected ext.mods.gameserver.data.manager.AntiFeedManager();
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
        12: putfield      #10                 // Field _lastDeathTimes:Ljava/util/Map;
        15: aload_0
        16: new           #7                  // class java/util/concurrent/ConcurrentHashMap
        19: dup
        20: invokespecial #9                  // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        23: putfield      #16                 // Field _eventIPs:Ljava/util/Map;
        26: return
      LineNumberTable:
        line 42: 0
        line 38: 4
        line 39: 15
        line 43: 26
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lext/mods/gameserver/data/manager/AntiFeedManager;

  public void setLastDeathTime(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _lastDeathTimes:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #19                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokestatic  #25                 // Method java/lang/System.currentTimeMillis:()J
        11: invokestatic  #31                 // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
        14: invokeinterface #36,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        19: pop
        20: return
      LineNumberTable:
        line 51: 0
        line 52: 20
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/data/manager/AntiFeedManager;
            0      21     1 objectId   I

  public boolean check(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=7, args_size=3
         0: getstatic     #42                 // Field ext/mods/Config.ANTIFEED_ENABLE:Z
         3: ifne          8
         6: iconst_1
         7: ireturn
         8: aload_2
         9: ifnonnull     14
        12: iconst_0
        13: ireturn
        14: aload_2
        15: invokevirtual #48                 // Method ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        18: astore_3
        19: aload_3
        20: ifnonnull     25
        23: iconst_0
        24: ireturn
        25: aload_3
        26: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
        29: invokevirtual #60                 // Method ext/mods/gameserver/network/GameClient.isDetached:()Z
        32: ifeq          37
        35: iconst_0
        36: ireturn
        37: getstatic     #66                 // Field ext/mods/Config.ANTIFEED_INTERVAL:I
        40: ifle          98
        43: aload_0
        44: getfield      #10                 // Field _lastDeathTimes:Ljava/util/Map;
        47: aload_3
        48: invokevirtual #70                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        51: invokestatic  #19                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        54: invokeinterface #74,  2           // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
        59: ifeq          98
        62: invokestatic  #25                 // Method java/lang/System.currentTimeMillis:()J
        65: aload_0
        66: getfield      #10                 // Field _lastDeathTimes:Ljava/util/Map;
        69: aload_3
        70: invokevirtual #70                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        73: invokestatic  #19                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        76: invokeinterface #78,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        81: checkcast     #32                 // class java/lang/Long
        84: invokevirtual #82                 // Method java/lang/Long.longValue:()J
        87: lsub
        88: getstatic     #66                 // Field ext/mods/Config.ANTIFEED_INTERVAL:I
        91: i2l
        92: lcmp
        93: ifge          98
        96: iconst_0
        97: ireturn
        98: getstatic     #85                 // Field ext/mods/Config.ANTIFEED_DUALBOX:Z
       101: ifeq          200
       104: aload_1
       105: ifnull        200
       108: aload_1
       109: invokevirtual #48                 // Method ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
       112: astore        4
       114: aload         4
       116: ifnonnull     121
       119: iconst_0
       120: ireturn
       121: aload_3
       122: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
       125: astore        5
       127: aload         4
       129: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
       132: astore        6
       134: aload         5
       136: ifnull        160
       139: aload         6
       141: ifnull        160
       144: aload         5
       146: invokevirtual #60                 // Method ext/mods/gameserver/network/GameClient.isDetached:()Z
       149: ifne          160
       152: aload         6
       154: invokevirtual #60                 // Method ext/mods/gameserver/network/GameClient.isDetached:()Z
       157: ifeq          172
       160: getstatic     #88                 // Field ext/mods/Config.ANTIFEED_DISCONNECTED_AS_DUALBOX:Z
       163: ifne          170
       166: iconst_1
       167: goto          171
       170: iconst_0
       171: ireturn
       172: aload         5
       174: invokevirtual #91                 // Method ext/mods/gameserver/network/GameClient.getConnection:()Lext/mods/commons/mmocore/MMOConnection;
       177: invokevirtual #95                 // Method ext/mods/commons/mmocore/MMOConnection.getInetAddress:()Ljava/net/InetAddress;
       180: aload         6
       182: invokevirtual #91                 // Method ext/mods/gameserver/network/GameClient.getConnection:()Lext/mods/commons/mmocore/MMOConnection;
       185: invokevirtual #95                 // Method ext/mods/commons/mmocore/MMOConnection.getInetAddress:()Ljava/net/InetAddress;
       188: invokevirtual #101                // Method java/net/InetAddress.equals:(Ljava/lang/Object;)Z
       191: ifne          198
       194: iconst_1
       195: goto          199
       198: iconst_0
       199: ireturn
       200: iconst_1
       201: ireturn
      LineNumberTable:
        line 62: 0
        line 63: 6
        line 65: 8
        line 66: 12
        line 68: 14
        line 69: 19
        line 70: 23
        line 72: 25
        line 73: 35
        line 75: 37
        line 76: 96
        line 78: 98
        line 80: 108
        line 81: 114
        line 82: 119
        line 84: 121
        line 85: 127
        line 86: 134
        line 87: 160
        line 89: 172
        line 91: 200
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          114      86     4 attackerPlayer   Lext/mods/gameserver/model/actor/Player;
          127      73     5 targetClient   Lext/mods/gameserver/network/GameClient;
          134      66     6 attackerClient   Lext/mods/gameserver/network/GameClient;
            0     202     0  this   Lext/mods/gameserver/data/manager/AntiFeedManager;
            0     202     1 attacker   Lext/mods/gameserver/model/actor/Creature;
            0     202     2 target   Lext/mods/gameserver/model/actor/Creature;
           19     183     3 targetPlayer   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 13
        frame_type = 8 /* same */
        frame_type = 5 /* same */
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 11 /* same */
        frame_type = 60 /* same */
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 253 /* append */
          offset_delta = 38
          locals = [ class ext/mods/gameserver/network/GameClient, class ext/mods/gameserver/network/GameClient ]
        frame_type = 9 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 0 /* same */
        frame_type = 25 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 248 /* chop */
          offset_delta = 0

  public void clear();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _lastDeathTimes:Ljava/util/Map;
         4: invokeinterface #106,  1          // InterfaceMethod java/util/Map.clear:()V
         9: return
      LineNumberTable:
        line 99: 0
        line 100: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/data/manager/AntiFeedManager;

  public void registerEvent(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: getfield      #16                 // Field _eventIPs:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #19                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: new           #7                  // class java/util/concurrent/ConcurrentHashMap
        11: dup
        12: invokespecial #9                  // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        15: invokeinterface #109,  3          // InterfaceMethod java/util/Map.putIfAbsent:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        20: pop
        21: return
      LineNumberTable:
        line 108: 0
        line 109: 21
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/data/manager/AntiFeedManager;
            0      22     1 eventId   I

  public final boolean tryAddPlayer(int, ext.mods.gameserver.model.actor.Player, int);
    descriptor: (ILext/mods/gameserver/model/actor/Player;I)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=4, args_size=4
         0: aload_0
         1: iload_1
         2: aload_2
         3: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
         6: iload_3
         7: invokevirtual #112                // Method tryAddClient:(ILext/mods/gameserver/network/GameClient;I)Z
        10: ireturn
      LineNumberTable:
        line 120: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/data/manager/AntiFeedManager;
            0      11     1 eventId   I
            0      11     2 player   Lext/mods/gameserver/model/actor/Player;
            0      11     3   max   I

  public boolean tryAddClient(int, ext.mods.gameserver.network.GameClient, int);
    descriptor: (ILext/mods/gameserver/network/GameClient;I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=8, args_size=4
         0: aload_2
         1: ifnonnull     6
         4: iconst_0
         5: ireturn
         6: aload_0
         7: getfield      #16                 // Field _eventIPs:Ljava/util/Map;
        10: iload_1
        11: invokestatic  #19                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        14: invokeinterface #78,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        19: checkcast     #37                 // class java/util/Map
        22: astore        4
        24: aload         4
        26: ifnonnull     31
        29: iconst_0
        30: ireturn
        31: aload_2
        32: invokevirtual #91                 // Method ext/mods/gameserver/network/GameClient.getConnection:()Lext/mods/commons/mmocore/MMOConnection;
        35: invokevirtual #95                 // Method ext/mods/commons/mmocore/MMOConnection.getInetAddress:()Ljava/net/InetAddress;
        38: invokevirtual #116                // Method java/net/InetAddress.hashCode:()I
        41: invokestatic  #19                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        44: astore        5
        46: aload         4
        48: aload         5
        50: invokeinterface #78,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        55: checkcast     #119                // class java/util/concurrent/atomic/AtomicInteger
        58: astore        6
        60: aload         6
        62: ifnonnull     99
        65: new           #119                // class java/util/concurrent/atomic/AtomicInteger
        68: dup
        69: invokespecial #121                // Method java/util/concurrent/atomic/AtomicInteger."<init>":()V
        72: astore        6
        74: aload         4
        76: aload         5
        78: aload         6
        80: invokeinterface #109,  3          // InterfaceMethod java/util/Map.putIfAbsent:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        85: checkcast     #119                // class java/util/concurrent/atomic/AtomicInteger
        88: astore        7
        90: aload         7
        92: ifnull        99
        95: aload         7
        97: astore        6
        99: aload         6
       101: invokevirtual #122                // Method java/util/concurrent/atomic/AtomicInteger.get:()I
       104: iconst_1
       105: iadd
       106: iload_3
       107: if_icmpgt     118
       110: aload         6
       112: invokevirtual #124                // Method java/util/concurrent/atomic/AtomicInteger.incrementAndGet:()I
       115: pop
       116: iconst_1
       117: ireturn
       118: iconst_0
       119: ireturn
      LineNumberTable:
        line 132: 0
        line 133: 4
        line 135: 6
        line 136: 24
        line 137: 29
        line 139: 31
        line 140: 46
        line 142: 60
        line 144: 65
        line 145: 74
        line 146: 90
        line 147: 95
        line 150: 99
        line 152: 110
        line 153: 116
        line 156: 118
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           90       9     7 existingValue   Ljava/util/concurrent/atomic/AtomicInteger;
            0     120     0  this   Lext/mods/gameserver/data/manager/AntiFeedManager;
            0     120     1 eventId   I
            0     120     2 client   Lext/mods/gameserver/network/GameClient;
            0     120     3   max   I
           24      96     4 event   Ljava/util/Map;
           46      74     5 addrHash   Ljava/lang/Integer;
           60      60     6 connectionCount   Ljava/util/concurrent/atomic/AtomicInteger;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           24      96     4 event   Ljava/util/Map<Ljava/lang/Integer;Ljava/util/concurrent/atomic/AtomicInteger;>;
      StackMapTable: number_of_entries = 4
        frame_type = 6 /* same */
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ class java/util/Map ]
        frame_type = 253 /* append */
          offset_delta = 67
          locals = [ class java/lang/Integer, class java/util/concurrent/atomic/AtomicInteger ]
        frame_type = 18 /* same */

  public boolean removePlayer(int, ext.mods.gameserver.model.actor.Player);
    descriptor: (ILext/mods/gameserver/model/actor/Player;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: aload_2
         3: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
         6: invokevirtual #127                // Method removeClient:(ILext/mods/gameserver/network/GameClient;)Z
         9: ireturn
      LineNumberTable:
        line 167: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/data/manager/AntiFeedManager;
            0      10     1 eventId   I
            0      10     2 player   Lext/mods/gameserver/model/actor/Player;

  public boolean removeClient(int, ext.mods.gameserver.network.GameClient);
    descriptor: (ILext/mods/gameserver/network/GameClient;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=3
         0: aload_2
         1: ifnonnull     6
         4: iconst_0
         5: ireturn
         6: aload_0
         7: getfield      #16                 // Field _eventIPs:Ljava/util/Map;
        10: iload_1
        11: invokestatic  #19                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        14: invokeinterface #78,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        19: checkcast     #37                 // class java/util/Map
        22: astore_3
        23: aload_3
        24: ifnonnull     29
        27: iconst_0
        28: ireturn
        29: aload_2
        30: invokevirtual #91                 // Method ext/mods/gameserver/network/GameClient.getConnection:()Lext/mods/commons/mmocore/MMOConnection;
        33: invokevirtual #95                 // Method ext/mods/commons/mmocore/MMOConnection.getInetAddress:()Ljava/net/InetAddress;
        36: invokevirtual #116                // Method java/net/InetAddress.hashCode:()I
        39: invokestatic  #19                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        42: astore        4
        44: aload_3
        45: aload         4
        47: invokedynamic #131,  0            // InvokeDynamic #0:apply:()Ljava/util/function/BiFunction;
        52: invokeinterface #135,  3          // InterfaceMethod java/util/Map.computeIfPresent:(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
        57: ifnull        64
        60: iconst_1
        61: goto          65
        64: iconst_0
        65: ireturn
      LineNumberTable:
        line 178: 0
        line 179: 4
        line 181: 6
        line 182: 23
        line 183: 27
        line 185: 29
        line 186: 44
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      66     0  this   Lext/mods/gameserver/data/manager/AntiFeedManager;
            0      66     1 eventId   I
            0      66     2 client   Lext/mods/gameserver/network/GameClient;
           23      43     3 event   Ljava/util/Map;
           44      22     4 addrHash   Ljava/lang/Integer;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           23      43     3 event   Ljava/util/Map<Ljava/lang/Integer;Ljava/util/concurrent/atomic/AtomicInteger;>;
      StackMapTable: number_of_entries = 4
        frame_type = 6 /* same */
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ class java/util/Map ]
        frame_type = 252 /* append */
          offset_delta = 34
          locals = [ class java/lang/Integer ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public void onDisconnect(ext.mods.gameserver.network.GameClient);
    descriptor: (Lext/mods/gameserver/network/GameClient;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_1
         1: ifnull        21
         4: aload_1
         5: invokevirtual #91                 // Method ext/mods/gameserver/network/GameClient.getConnection:()Lext/mods/commons/mmocore/MMOConnection;
         8: ifnull        21
        11: aload_1
        12: invokevirtual #91                 // Method ext/mods/gameserver/network/GameClient.getConnection:()Lext/mods/commons/mmocore/MMOConnection;
        15: invokevirtual #95                 // Method ext/mods/commons/mmocore/MMOConnection.getInetAddress:()Ljava/net/InetAddress;
        18: ifnonnull     22
        21: return
        22: aload_0
        23: getfield      #16                 // Field _eventIPs:Ljava/util/Map;
        26: aload_0
        27: aload_1
        28: invokedynamic #139,  0            // InvokeDynamic #1:accept:(Lext/mods/gameserver/data/manager/AntiFeedManager;Lext/mods/gameserver/network/GameClient;)Ljava/util/function/BiConsumer;
        33: invokeinterface #143,  2          // InterfaceMethod java/util/Map.forEach:(Ljava/util/function/BiConsumer;)V
        38: return
      LineNumberTable:
        line 200: 0
        line 201: 21
        line 203: 22
        line 204: 38
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      39     0  this   Lext/mods/gameserver/data/manager/AntiFeedManager;
            0      39     1 client   Lext/mods/gameserver/network/GameClient;
      StackMapTable: number_of_entries = 2
        frame_type = 21 /* same */
        frame_type = 0 /* same */

  public void clear(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: getfield      #16                 // Field _eventIPs:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #19                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #78,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #37                 // class java/util/Map
        16: astore_2
        17: aload_2
        18: ifnull        27
        21: aload_2
        22: invokeinterface #106,  1          // InterfaceMethod java/util/Map.clear:()V
        27: return
      LineNumberTable:
        line 212: 0
        line 213: 17
        line 214: 21
        line 215: 27
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/data/manager/AntiFeedManager;
            0      28     1 eventId   I
           17      11     2 event   Ljava/util/Map;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           17      11     2 event   Ljava/util/Map<Ljava/lang/Integer;Ljava/util/concurrent/atomic/AtomicInteger;>;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ class java/util/Map ]

  public int getLimit(ext.mods.gameserver.model.actor.Player, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;I)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
         5: iload_2
         6: invokevirtual #147                // Method getLimit:(Lext/mods/gameserver/network/GameClient;I)I
         9: ireturn
      LineNumberTable:
        line 224: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/data/manager/AntiFeedManager;
            0      10     1 player   Lext/mods/gameserver/model/actor/Player;
            0      10     2   max   I

  public int getLimit(ext.mods.gameserver.network.GameClient, int);
    descriptor: (Lext/mods/gameserver/network/GameClient;I)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=3, args_size=3
         0: aload_1
         1: ifnonnull     6
         4: iload_2
         5: ireturn
         6: iload_2
         7: ireturn
      LineNumberTable:
        line 234: 0
        line 235: 4
        line 237: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/data/manager/AntiFeedManager;
            0       8     1 client   Lext/mods/gameserver/network/GameClient;
            0       8     2   max   I
      StackMapTable: number_of_entries = 1
        frame_type = 6 /* same */

  public static final ext.mods.gameserver.data.manager.AntiFeedManager getInstance();
    descriptor: ()Lext/mods/gameserver/data/manager/AntiFeedManager;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #151                // Field ext/mods/gameserver/data/manager/AntiFeedManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/manager/AntiFeedManager;
         3: areturn
      LineNumberTable:
        line 242: 0
}
SourceFile: "AntiFeedManager.java"
NestMembers:
  ext/mods/gameserver/data/manager/AntiFeedManager$SingletonHolder
BootstrapMethods:
  0: #242 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #230 (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      #231 REF_invokeStatic ext/mods/gameserver/data/manager/AntiFeedManager.lambda$removeClient$0:(Ljava/lang/Integer;Ljava/util/concurrent/atomic/AtomicInteger;)Ljava/util/concurrent/atomic/AtomicInteger;
      #234 (Ljava/lang/Integer;Ljava/util/concurrent/atomic/AtomicInteger;)Ljava/util/concurrent/atomic/AtomicInteger;
  1: #242 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #235 (Ljava/lang/Object;Ljava/lang/Object;)V
      #237 REF_invokeVirtual ext/mods/gameserver/data/manager/AntiFeedManager.lambda$onDisconnect$0:(Lext/mods/gameserver/network/GameClient;Ljava/lang/Integer;Ljava/util/Map;)V
      #240 (Ljava/lang/Integer;Ljava/util/Map;)V
InnerClasses:
  public static final #255= #251 of #253; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
