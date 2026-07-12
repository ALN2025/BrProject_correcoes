// Bytecode for: ext.mods.extensions.listener.manager.PlayerListenerManager
// File: ext\mods\extensions\listener\manager\PlayerListenerManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/extensions/listener/manager/PlayerListenerManager.class
  Last modified 9 de jul de 2026; size 10138 bytes
  MD5 checksum 6086d4f1f95d65fb5007d6fe96b20ab0
  Compiled from "PlayerListenerManager.java"
public class ext.mods.extensions.listener.manager.PlayerListenerManager
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/extensions/listener/manager/PlayerListenerManager
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 12, methods: 36, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/concurrent/CopyOnWriteArrayList
    #8 = Utf8               java/util/concurrent/CopyOnWriteArrayList
    #9 = Methodref          #7.#3         // java/util/concurrent/CopyOnWriteArrayList."<init>":()V
   #10 = Fieldref           #11.#12       // ext/mods/extensions/listener/manager/PlayerListenerManager.enterListeners:Ljava/util/List;
   #11 = Class              #13           // ext/mods/extensions/listener/manager/PlayerListenerManager
   #12 = NameAndType        #14:#15       // enterListeners:Ljava/util/List;
   #13 = Utf8               ext/mods/extensions/listener/manager/PlayerListenerManager
   #14 = Utf8               enterListeners
   #15 = Utf8               Ljava/util/List;
   #16 = Fieldref           #11.#17       // ext/mods/extensions/listener/manager/PlayerListenerManager.exitListeners:Ljava/util/List;
   #17 = NameAndType        #18:#15       // exitListeners:Ljava/util/List;
   #18 = Utf8               exitListeners
   #19 = Fieldref           #11.#20       // ext/mods/extensions/listener/manager/PlayerListenerManager.autoSoulShotListeners:Ljava/util/List;
   #20 = NameAndType        #21:#15       // autoSoulShotListeners:Ljava/util/List;
   #21 = Utf8               autoSoulShotListeners
   #22 = Fieldref           #11.#23       // ext/mods/extensions/listener/manager/PlayerListenerManager.levelUpListeners:Ljava/util/List;
   #23 = NameAndType        #24:#15       // levelUpListeners:Ljava/util/List;
   #24 = Utf8               levelUpListeners
   #25 = Fieldref           #11.#26       // ext/mods/extensions/listener/manager/PlayerListenerManager.pvpPkKillListeners:Ljava/util/List;
   #26 = NameAndType        #27:#15       // pvpPkKillListeners:Ljava/util/List;
   #27 = Utf8               pvpPkKillListeners
   #28 = Fieldref           #11.#29       // ext/mods/extensions/listener/manager/PlayerListenerManager.setLevelListeners:Ljava/util/List;
   #29 = NameAndType        #30:#15       // setLevelListeners:Ljava/util/List;
   #30 = Utf8               setLevelListeners
   #31 = Fieldref           #11.#32       // ext/mods/extensions/listener/manager/PlayerListenerManager.teleportListeners:Ljava/util/List;
   #32 = NameAndType        #33:#15       // teleportListeners:Ljava/util/List;
   #33 = Utf8               teleportListeners
   #34 = Fieldref           #11.#35       // ext/mods/extensions/listener/manager/PlayerListenerManager.classListeners:Ljava/util/List;
   #35 = NameAndType        #36:#15       // classListeners:Ljava/util/List;
   #36 = Utf8               classListeners
   #37 = Fieldref           #11.#38       // ext/mods/extensions/listener/manager/PlayerListenerManager.skillEnchantListeners:Ljava/util/List;
   #38 = NameAndType        #39:#15       // skillEnchantListeners:Ljava/util/List;
   #39 = Utf8               skillEnchantListeners
   #40 = Fieldref           #11.#41       // ext/mods/extensions/listener/manager/PlayerListenerManager.itemPickupListeners:Ljava/util/List;
   #41 = NameAndType        #42:#15       // itemPickupListeners:Ljava/util/List;
   #42 = Utf8               itemPickupListeners
   #43 = Fieldref           #11.#44       // ext/mods/extensions/listener/manager/PlayerListenerManager.itemDestroyListeners:Ljava/util/List;
   #44 = NameAndType        #45:#15       // itemDestroyListeners:Ljava/util/List;
   #45 = Utf8               itemDestroyListeners
   #46 = Fieldref           #11.#47       // ext/mods/extensions/listener/manager/PlayerListenerManager.INSTANCE:Lext/mods/extensions/listener/manager/PlayerListenerManager;
   #47 = NameAndType        #48:#49       // INSTANCE:Lext/mods/extensions/listener/manager/PlayerListenerManager;
   #48 = Utf8               INSTANCE
   #49 = Utf8               Lext/mods/extensions/listener/manager/PlayerListenerManager;
   #50 = InterfaceMethodref #51.#52       // java/util/List.add:(Ljava/lang/Object;)Z
   #51 = Class              #53           // java/util/List
   #52 = NameAndType        #54:#55       // add:(Ljava/lang/Object;)Z
   #53 = Utf8               java/util/List
   #54 = Utf8               add
   #55 = Utf8               (Ljava/lang/Object;)Z
   #56 = InterfaceMethodref #51.#57       // java/util/List.remove:(Ljava/lang/Object;)Z
   #57 = NameAndType        #58:#55       // remove:(Ljava/lang/Object;)Z
   #58 = Utf8               remove
   #59 = InterfaceMethodref #51.#60       // java/util/List.iterator:()Ljava/util/Iterator;
   #60 = NameAndType        #61:#62       // iterator:()Ljava/util/Iterator;
   #61 = Utf8               iterator
   #62 = Utf8               ()Ljava/util/Iterator;
   #63 = InterfaceMethodref #64.#65       // java/util/Iterator.hasNext:()Z
   #64 = Class              #66           // java/util/Iterator
   #65 = NameAndType        #67:#68       // hasNext:()Z
   #66 = Utf8               java/util/Iterator
   #67 = Utf8               hasNext
   #68 = Utf8               ()Z
   #69 = InterfaceMethodref #64.#70       // java/util/Iterator.next:()Ljava/lang/Object;
   #70 = NameAndType        #71:#72       // next:()Ljava/lang/Object;
   #71 = Utf8               next
   #72 = Utf8               ()Ljava/lang/Object;
   #73 = Class              #74           // ext/mods/extensions/listener/actor/player/OnPlayerEnterListener
   #74 = Utf8               ext/mods/extensions/listener/actor/player/OnPlayerEnterListener
   #75 = InterfaceMethodref #73.#76       // ext/mods/extensions/listener/actor/player/OnPlayerEnterListener.onPlayerEnter:(Lext/mods/gameserver/model/actor/Player;)V
   #76 = NameAndType        #77:#78       // onPlayerEnter:(Lext/mods/gameserver/model/actor/Player;)V
   #77 = Utf8               onPlayerEnter
   #78 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #79 = Class              #80           // ext/mods/extensions/listener/actor/player/OnPlayerExitListener
   #80 = Utf8               ext/mods/extensions/listener/actor/player/OnPlayerExitListener
   #81 = InterfaceMethodref #79.#82       // ext/mods/extensions/listener/actor/player/OnPlayerExitListener.onPlayerExit:(Lext/mods/gameserver/model/actor/Player;)V
   #82 = NameAndType        #83:#78       // onPlayerExit:(Lext/mods/gameserver/model/actor/Player;)V
   #83 = Utf8               onPlayerExit
   #84 = Class              #85           // ext/mods/extensions/listener/actor/player/OnAutoSoulShotListener
   #85 = Utf8               ext/mods/extensions/listener/actor/player/OnAutoSoulShotListener
   #86 = InterfaceMethodref #84.#87       // ext/mods/extensions/listener/actor/player/OnAutoSoulShotListener.onAutoSoulShot:(Lext/mods/gameserver/model/actor/Player;IZ)V
   #87 = NameAndType        #88:#89       // onAutoSoulShot:(Lext/mods/gameserver/model/actor/Player;IZ)V
   #88 = Utf8               onAutoSoulShot
   #89 = Utf8               (Lext/mods/gameserver/model/actor/Player;IZ)V
   #90 = Class              #91           // ext/mods/extensions/listener/actor/player/OnLevelUpListener
   #91 = Utf8               ext/mods/extensions/listener/actor/player/OnLevelUpListener
   #92 = InterfaceMethodref #90.#93       // ext/mods/extensions/listener/actor/player/OnLevelUpListener.onLevelUp:(Lext/mods/gameserver/model/actor/Player;)V
   #93 = NameAndType        #94:#78       // onLevelUp:(Lext/mods/gameserver/model/actor/Player;)V
   #94 = Utf8               onLevelUp
   #95 = Class              #96           // ext/mods/extensions/listener/actor/player/OnPvpPkKillListener
   #96 = Utf8               ext/mods/extensions/listener/actor/player/OnPvpPkKillListener
   #97 = InterfaceMethodref #95.#98       // ext/mods/extensions/listener/actor/player/OnPvpPkKillListener.onPvpPkKill:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;Z)V
   #98 = NameAndType        #99:#100      // onPvpPkKill:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;Z)V
   #99 = Utf8               onPvpPkKill
  #100 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;Z)V
  #101 = Class              #102          // ext/mods/extensions/listener/actor/player/OnSetLevelListener
  #102 = Utf8               ext/mods/extensions/listener/actor/player/OnSetLevelListener
  #103 = InterfaceMethodref #101.#104     // ext/mods/extensions/listener/actor/player/OnSetLevelListener.onSetLevel:(Lext/mods/gameserver/model/actor/Player;I)V
  #104 = NameAndType        #105:#106     // onSetLevel:(Lext/mods/gameserver/model/actor/Player;I)V
  #105 = Utf8               onSetLevel
  #106 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
  #107 = Class              #108          // ext/mods/extensions/listener/actor/player/OnTeleportListener
  #108 = Utf8               ext/mods/extensions/listener/actor/player/OnTeleportListener
  #109 = InterfaceMethodref #107.#110     // ext/mods/extensions/listener/actor/player/OnTeleportListener.onTeleport:(Lext/mods/gameserver/model/actor/Player;III)V
  #110 = NameAndType        #111:#112     // onTeleport:(Lext/mods/gameserver/model/actor/Player;III)V
  #111 = Utf8               onTeleport
  #112 = Utf8               (Lext/mods/gameserver/model/actor/Player;III)V
  #113 = Class              #114          // ext/mods/extensions/listener/actor/player/OnSetClassListener
  #114 = Utf8               ext/mods/extensions/listener/actor/player/OnSetClassListener
  #115 = InterfaceMethodref #113.#116     // ext/mods/extensions/listener/actor/player/OnSetClassListener.onSetClass:(Lext/mods/gameserver/model/actor/Player;I)V
  #116 = NameAndType        #117:#106     // onSetClass:(Lext/mods/gameserver/model/actor/Player;I)V
  #117 = Utf8               onSetClass
  #118 = Class              #119          // ext/mods/extensions/listener/actor/player/OnSkillEnchantSuccessListener
  #119 = Utf8               ext/mods/extensions/listener/actor/player/OnSkillEnchantSuccessListener
  #120 = InterfaceMethodref #118.#121     // ext/mods/extensions/listener/actor/player/OnSkillEnchantSuccessListener.onSkillEnchantSuccess:(Lext/mods/gameserver/model/actor/Player;II)V
  #121 = NameAndType        #122:#123     // onSkillEnchantSuccess:(Lext/mods/gameserver/model/actor/Player;II)V
  #122 = Utf8               onSkillEnchantSuccess
  #123 = Utf8               (Lext/mods/gameserver/model/actor/Player;II)V
  #124 = Class              #125          // ext/mods/extensions/listener/actor/player/OnItemPickupListener
  #125 = Utf8               ext/mods/extensions/listener/actor/player/OnItemPickupListener
  #126 = InterfaceMethodref #124.#127     // ext/mods/extensions/listener/actor/player/OnItemPickupListener.onItemPickup:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #127 = NameAndType        #128:#129     // onItemPickup:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #128 = Utf8               onItemPickup
  #129 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #130 = Class              #131          // ext/mods/extensions/listener/actor/player/OnItemDestroyListener
  #131 = Utf8               ext/mods/extensions/listener/actor/player/OnItemDestroyListener
  #132 = InterfaceMethodref #130.#133     // ext/mods/extensions/listener/actor/player/OnItemDestroyListener.onItemDestroy:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #133 = NameAndType        #134:#129     // onItemDestroy:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #134 = Utf8               onItemDestroy
  #135 = Methodref          #11.#3        // ext/mods/extensions/listener/manager/PlayerListenerManager."<init>":()V
  #136 = Utf8               Signature
  #137 = Utf8               Ljava/util/List<Lext/mods/extensions/listener/actor/player/OnPlayerEnterListener;>;
  #138 = Utf8               Ljava/util/List<Lext/mods/extensions/listener/actor/player/OnPlayerExitListener;>;
  #139 = Utf8               Ljava/util/List<Lext/mods/extensions/listener/actor/player/OnAutoSoulShotListener;>;
  #140 = Utf8               Ljava/util/List<Lext/mods/extensions/listener/actor/player/OnLevelUpListener;>;
  #141 = Utf8               Ljava/util/List<Lext/mods/extensions/listener/actor/player/OnPvpPkKillListener;>;
  #142 = Utf8               Ljava/util/List<Lext/mods/extensions/listener/actor/player/OnSetLevelListener;>;
  #143 = Utf8               Ljava/util/List<Lext/mods/extensions/listener/actor/player/OnTeleportListener;>;
  #144 = Utf8               Ljava/util/List<Lext/mods/extensions/listener/actor/player/OnSetClassListener;>;
  #145 = Utf8               Ljava/util/List<Lext/mods/extensions/listener/actor/player/OnSkillEnchantSuccessListener;>;
  #146 = Utf8               Ljava/util/List<Lext/mods/extensions/listener/actor/player/OnItemPickupListener;>;
  #147 = Utf8               Ljava/util/List<Lext/mods/extensions/listener/actor/player/OnItemDestroyListener;>;
  #148 = Utf8               Code
  #149 = Utf8               LineNumberTable
  #150 = Utf8               LocalVariableTable
  #151 = Utf8               this
  #152 = Utf8               getInstance
  #153 = Utf8               ()Lext/mods/extensions/listener/manager/PlayerListenerManager;
  #154 = Utf8               registerEnterListener
  #155 = Utf8               (Lext/mods/extensions/listener/actor/player/OnPlayerEnterListener;)V
  #156 = Utf8               listener
  #157 = Utf8               Lext/mods/extensions/listener/actor/player/OnPlayerEnterListener;
  #158 = Utf8               unregisterEnterListener
  #159 = Utf8               registerExitListener
  #160 = Utf8               (Lext/mods/extensions/listener/actor/player/OnPlayerExitListener;)V
  #161 = Utf8               Lext/mods/extensions/listener/actor/player/OnPlayerExitListener;
  #162 = Utf8               unregisterExitListener
  #163 = Utf8               notifyPlayerEnter
  #164 = Utf8               player
  #165 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #166 = Utf8               StackMapTable
  #167 = Utf8               notifyPlayerExit
  #168 = Utf8               registerAutoSoulShotListener
  #169 = Utf8               (Lext/mods/extensions/listener/actor/player/OnAutoSoulShotListener;)V
  #170 = Utf8               Lext/mods/extensions/listener/actor/player/OnAutoSoulShotListener;
  #171 = Utf8               unregisterAutoSoulShotListener
  #172 = Utf8               notifyAutoSoulShot
  #173 = Utf8               itemId
  #174 = Utf8               I
  #175 = Utf8               enabled
  #176 = Utf8               Z
  #177 = Utf8               registerLevelUpListener
  #178 = Utf8               (Lext/mods/extensions/listener/actor/player/OnLevelUpListener;)V
  #179 = Utf8               Lext/mods/extensions/listener/actor/player/OnLevelUpListener;
  #180 = Utf8               unregisterLevelUpListener
  #181 = Utf8               notifyLevelUp
  #182 = Utf8               registerPvpPkKillListener
  #183 = Utf8               (Lext/mods/extensions/listener/actor/player/OnPvpPkKillListener;)V
  #184 = Utf8               Lext/mods/extensions/listener/actor/player/OnPvpPkKillListener;
  #185 = Utf8               unregisterPvpPkKillListener
  #186 = Utf8               notifyPvpPkKill
  #187 = Utf8               killer
  #188 = Utf8               victim
  #189 = Utf8               isPvp
  #190 = Utf8               registerSetLevelListener
  #191 = Utf8               (Lext/mods/extensions/listener/actor/player/OnSetLevelListener;)V
  #192 = Utf8               Lext/mods/extensions/listener/actor/player/OnSetLevelListener;
  #193 = Utf8               unregisterSetLevelListener
  #194 = Utf8               notifySetLevel
  #195 = Utf8               newLevel
  #196 = Utf8               registerTeleportListener
  #197 = Utf8               (Lext/mods/extensions/listener/actor/player/OnTeleportListener;)V
  #198 = Utf8               Lext/mods/extensions/listener/actor/player/OnTeleportListener;
  #199 = Utf8               unregisterTeleportListener
  #200 = Utf8               notifyTeleport
  #201 = Utf8               x
  #202 = Utf8               y
  #203 = Utf8               z
  #204 = Utf8               registerSetClassListener
  #205 = Utf8               (Lext/mods/extensions/listener/actor/player/OnSetClassListener;)V
  #206 = Utf8               Lext/mods/extensions/listener/actor/player/OnSetClassListener;
  #207 = Utf8               unregisterSetClassListener
  #208 = Utf8               notifySetClass
  #209 = Utf8               newClassId
  #210 = Utf8               registerSkillEnchantSuccessListener
  #211 = Utf8               (Lext/mods/extensions/listener/actor/player/OnSkillEnchantSuccessListener;)V
  #212 = Utf8               Lext/mods/extensions/listener/actor/player/OnSkillEnchantSuccessListener;
  #213 = Utf8               unregisterSkillEnchantSuccessListener
  #214 = Utf8               notifySkillEnchantSuccess
  #215 = Utf8               skillId
  #216 = Utf8               skillLevel
  #217 = Utf8               registerItemPickupListener
  #218 = Utf8               (Lext/mods/extensions/listener/actor/player/OnItemPickupListener;)V
  #219 = Utf8               Lext/mods/extensions/listener/actor/player/OnItemPickupListener;
  #220 = Utf8               unregisterItemPickupListener
  #221 = Utf8               notifyItemPickup
  #222 = Utf8               item
  #223 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #224 = Utf8               registerItemDestroyListener
  #225 = Utf8               (Lext/mods/extensions/listener/actor/player/OnItemDestroyListener;)V
  #226 = Utf8               Lext/mods/extensions/listener/actor/player/OnItemDestroyListener;
  #227 = Utf8               unregisterItemDestroyListener
  #228 = Utf8               notifyItemDestroy
  #229 = Utf8               <clinit>
  #230 = Utf8               SourceFile
  #231 = Utf8               PlayerListenerManager.java
{
  public static ext.mods.extensions.listener.manager.PlayerListenerManager getInstance();
    descriptor: ()Lext/mods/extensions/listener/manager/PlayerListenerManager;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #46                 // Field INSTANCE:Lext/mods/extensions/listener/manager/PlayerListenerManager;
         3: areturn
      LineNumberTable:
        line 59: 0

  public void registerEnterListener(ext.mods.extensions.listener.actor.player.OnPlayerEnterListener);
    descriptor: (Lext/mods/extensions/listener/actor/player/OnPlayerEnterListener;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field enterListeners:Ljava/util/List;
         4: aload_1
         5: invokeinterface #50,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 64: 0
        line 65: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/extensions/listener/manager/PlayerListenerManager;
            0      12     1 listener   Lext/mods/extensions/listener/actor/player/OnPlayerEnterListener;

  public void unregisterEnterListener(ext.mods.extensions.listener.actor.player.OnPlayerEnterListener);
    descriptor: (Lext/mods/extensions/listener/actor/player/OnPlayerEnterListener;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field enterListeners:Ljava/util/List;
         4: aload_1
         5: invokeinterface #56,  2           // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 69: 0
        line 70: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/extensions/listener/manager/PlayerListenerManager;
            0      12     1 listener   Lext/mods/extensions/listener/actor/player/OnPlayerEnterListener;

  public void registerExitListener(ext.mods.extensions.listener.actor.player.OnPlayerExitListener);
    descriptor: (Lext/mods/extensions/listener/actor/player/OnPlayerExitListener;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #16                 // Field exitListeners:Ljava/util/List;
         4: aload_1
         5: invokeinterface #50,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 74: 0
        line 75: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/extensions/listener/manager/PlayerListenerManager;
            0      12     1 listener   Lext/mods/extensions/listener/actor/player/OnPlayerExitListener;

  public void unregisterExitListener(ext.mods.extensions.listener.actor.player.OnPlayerExitListener);
    descriptor: (Lext/mods/extensions/listener/actor/player/OnPlayerExitListener;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #16                 // Field exitListeners:Ljava/util/List;
         4: aload_1
         5: invokeinterface #56,  2           // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 79: 0
        line 80: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/extensions/listener/manager/PlayerListenerManager;
            0      12     1 listener   Lext/mods/extensions/listener/actor/player/OnPlayerExitListener;

  public void notifyPlayerEnter(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=2
         0: aload_0
         1: getfield      #10                 // Field enterListeners:Ljava/util/List;
         4: invokeinterface #59,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore_2
        10: aload_2
        11: invokeinterface #63,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          39
        19: aload_2
        20: invokeinterface #69,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #73                 // class ext/mods/extensions/listener/actor/player/OnPlayerEnterListener
        28: astore_3
        29: aload_3
        30: aload_1
        31: invokeinterface #75,  2           // InterfaceMethod ext/mods/extensions/listener/actor/player/OnPlayerEnterListener.onPlayerEnter:(Lext/mods/gameserver/model/actor/Player;)V
        36: goto          10
        39: return
      LineNumberTable:
        line 84: 0
        line 86: 29
        line 87: 36
        line 88: 39
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           29       7     3 listener   Lext/mods/extensions/listener/actor/player/OnPlayerEnterListener;
            0      40     0  this   Lext/mods/extensions/listener/manager/PlayerListenerManager;
            0      40     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 28

  public void notifyPlayerExit(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=2
         0: aload_0
         1: getfield      #16                 // Field exitListeners:Ljava/util/List;
         4: invokeinterface #59,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore_2
        10: aload_2
        11: invokeinterface #63,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          39
        19: aload_2
        20: invokeinterface #69,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #79                 // class ext/mods/extensions/listener/actor/player/OnPlayerExitListener
        28: astore_3
        29: aload_3
        30: aload_1
        31: invokeinterface #81,  2           // InterfaceMethod ext/mods/extensions/listener/actor/player/OnPlayerExitListener.onPlayerExit:(Lext/mods/gameserver/model/actor/Player;)V
        36: goto          10
        39: return
      LineNumberTable:
        line 92: 0
        line 94: 29
        line 95: 36
        line 96: 39
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           29       7     3 listener   Lext/mods/extensions/listener/actor/player/OnPlayerExitListener;
            0      40     0  this   Lext/mods/extensions/listener/manager/PlayerListenerManager;
            0      40     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 28

  public void registerAutoSoulShotListener(ext.mods.extensions.listener.actor.player.OnAutoSoulShotListener);
    descriptor: (Lext/mods/extensions/listener/actor/player/OnAutoSoulShotListener;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #19                 // Field autoSoulShotListeners:Ljava/util/List;
         4: aload_1
         5: invokeinterface #50,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 100: 0
        line 101: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/extensions/listener/manager/PlayerListenerManager;
            0      12     1 listener   Lext/mods/extensions/listener/actor/player/OnAutoSoulShotListener;

  public void unregisterAutoSoulShotListener(ext.mods.extensions.listener.actor.player.OnAutoSoulShotListener);
    descriptor: (Lext/mods/extensions/listener/actor/player/OnAutoSoulShotListener;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #19                 // Field autoSoulShotListeners:Ljava/util/List;
         4: aload_1
         5: invokeinterface #56,  2           // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 105: 0
        line 106: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/extensions/listener/manager/PlayerListenerManager;
            0      12     1 listener   Lext/mods/extensions/listener/actor/player/OnAutoSoulShotListener;

  public void notifyAutoSoulShot(ext.mods.gameserver.model.actor.Player, int, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Player;IZ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=6, args_size=4
         0: aload_0
         1: getfield      #19                 // Field autoSoulShotListeners:Ljava/util/List;
         4: invokeinterface #59,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore        4
        11: aload         4
        13: invokeinterface #63,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        18: ifeq          46
        21: aload         4
        23: invokeinterface #69,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        28: checkcast     #84                 // class ext/mods/extensions/listener/actor/player/OnAutoSoulShotListener
        31: astore        5
        33: aload         5
        35: aload_1
        36: iload_2
        37: iload_3
        38: invokeinterface #86,  4           // InterfaceMethod ext/mods/extensions/listener/actor/player/OnAutoSoulShotListener.onAutoSoulShot:(Lext/mods/gameserver/model/actor/Player;IZ)V
        43: goto          11
        46: return
      LineNumberTable:
        line 110: 0
        line 112: 33
        line 113: 43
        line 114: 46
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           33      10     5 listener   Lext/mods/extensions/listener/actor/player/OnAutoSoulShotListener;
            0      47     0  this   Lext/mods/extensions/listener/manager/PlayerListenerManager;
            0      47     1 player   Lext/mods/gameserver/model/actor/Player;
            0      47     2 itemId   I
            0      47     3 enabled   Z
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 11
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 34

  public void registerLevelUpListener(ext.mods.extensions.listener.actor.player.OnLevelUpListener);
    descriptor: (Lext/mods/extensions/listener/actor/player/OnLevelUpListener;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #22                 // Field levelUpListeners:Ljava/util/List;
         4: aload_1
         5: invokeinterface #50,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 118: 0
        line 119: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/extensions/listener/manager/PlayerListenerManager;
            0      12     1 listener   Lext/mods/extensions/listener/actor/player/OnLevelUpListener;

  public void unregisterLevelUpListener(ext.mods.extensions.listener.actor.player.OnLevelUpListener);
    descriptor: (Lext/mods/extensions/listener/actor/player/OnLevelUpListener;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #22                 // Field levelUpListeners:Ljava/util/List;
         4: aload_1
         5: invokeinterface #56,  2           // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 123: 0
        line 124: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/extensions/listener/manager/PlayerListenerManager;
            0      12     1 listener   Lext/mods/extensions/listener/actor/player/OnLevelUpListener;

  public void notifyLevelUp(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=2
         0: aload_0
         1: getfield      #22                 // Field levelUpListeners:Ljava/util/List;
         4: invokeinterface #59,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore_2
        10: aload_2
        11: invokeinterface #63,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          39
        19: aload_2
        20: invokeinterface #69,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #90                 // class ext/mods/extensions/listener/actor/player/OnLevelUpListener
        28: astore_3
        29: aload_3
        30: aload_1
        31: invokeinterface #92,  2           // InterfaceMethod ext/mods/extensions/listener/actor/player/OnLevelUpListener.onLevelUp:(Lext/mods/gameserver/model/actor/Player;)V
        36: goto          10
        39: return
      LineNumberTable:
        line 128: 0
        line 130: 29
        line 131: 36
        line 132: 39
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           29       7     3 listener   Lext/mods/extensions/listener/actor/player/OnLevelUpListener;
            0      40     0  this   Lext/mods/extensions/listener/manager/PlayerListenerManager;
            0      40     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 28

  public void registerPvpPkKillListener(ext.mods.extensions.listener.actor.player.OnPvpPkKillListener);
    descriptor: (Lext/mods/extensions/listener/actor/player/OnPvpPkKillListener;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #25                 // Field pvpPkKillListeners:Ljava/util/List;
         4: aload_1
         5: invokeinterface #50,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 136: 0
        line 137: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/extensions/listener/manager/PlayerListenerManager;
            0      12     1 listener   Lext/mods/extensions/listener/actor/player/OnPvpPkKillListener;

  public void unregisterPvpPkKillListener(ext.mods.extensions.listener.actor.player.OnPvpPkKillListener);
    descriptor: (Lext/mods/extensions/listener/actor/player/OnPvpPkKillListener;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #25                 // Field pvpPkKillListeners:Ljava/util/List;
         4: aload_1
         5: invokeinterface #56,  2           // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 141: 0
        line 142: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/extensions/listener/manager/PlayerListenerManager;
            0      12     1 listener   Lext/mods/extensions/listener/actor/player/OnPvpPkKillListener;

  public void notifyPvpPkKill(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.actor.Player, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=6, args_size=4
         0: aload_0
         1: getfield      #25                 // Field pvpPkKillListeners:Ljava/util/List;
         4: invokeinterface #59,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore        4
        11: aload         4
        13: invokeinterface #63,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        18: ifeq          46
        21: aload         4
        23: invokeinterface #69,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        28: checkcast     #95                 // class ext/mods/extensions/listener/actor/player/OnPvpPkKillListener
        31: astore        5
        33: aload         5
        35: aload_1
        36: aload_2
        37: iload_3
        38: invokeinterface #97,  4           // InterfaceMethod ext/mods/extensions/listener/actor/player/OnPvpPkKillListener.onPvpPkKill:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;Z)V
        43: goto          11
        46: return
      LineNumberTable:
        line 146: 0
        line 148: 33
        line 149: 43
        line 150: 46
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           33      10     5 listener   Lext/mods/extensions/listener/actor/player/OnPvpPkKillListener;
            0      47     0  this   Lext/mods/extensions/listener/manager/PlayerListenerManager;
            0      47     1 killer   Lext/mods/gameserver/model/actor/Player;
            0      47     2 victim   Lext/mods/gameserver/model/actor/Player;
            0      47     3 isPvp   Z
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 11
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 34

  public void registerSetLevelListener(ext.mods.extensions.listener.actor.player.OnSetLevelListener);
    descriptor: (Lext/mods/extensions/listener/actor/player/OnSetLevelListener;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #28                 // Field setLevelListeners:Ljava/util/List;
         4: aload_1
         5: invokeinterface #50,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 154: 0
        line 155: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/extensions/listener/manager/PlayerListenerManager;
            0      12     1 listener   Lext/mods/extensions/listener/actor/player/OnSetLevelListener;

  public void unregisterSetLevelListener(ext.mods.extensions.listener.actor.player.OnSetLevelListener);
    descriptor: (Lext/mods/extensions/listener/actor/player/OnSetLevelListener;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #28                 // Field setLevelListeners:Ljava/util/List;
         4: aload_1
         5: invokeinterface #56,  2           // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 159: 0
        line 160: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/extensions/listener/manager/PlayerListenerManager;
            0      12     1 listener   Lext/mods/extensions/listener/actor/player/OnSetLevelListener;

  public void notifySetLevel(ext.mods.gameserver.model.actor.Player, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=3
         0: aload_0
         1: getfield      #28                 // Field setLevelListeners:Ljava/util/List;
         4: invokeinterface #59,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore_3
        10: aload_3
        11: invokeinterface #63,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          42
        19: aload_3
        20: invokeinterface #69,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #101                // class ext/mods/extensions/listener/actor/player/OnSetLevelListener
        28: astore        4
        30: aload         4
        32: aload_1
        33: iload_2
        34: invokeinterface #103,  3          // InterfaceMethod ext/mods/extensions/listener/actor/player/OnSetLevelListener.onSetLevel:(Lext/mods/gameserver/model/actor/Player;I)V
        39: goto          10
        42: return
      LineNumberTable:
        line 164: 0
        line 166: 30
        line 167: 39
        line 168: 42
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           30       9     4 listener   Lext/mods/extensions/listener/actor/player/OnSetLevelListener;
            0      43     0  this   Lext/mods/extensions/listener/manager/PlayerListenerManager;
            0      43     1 player   Lext/mods/gameserver/model/actor/Player;
            0      43     2 newLevel   I
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 31

  public void registerTeleportListener(ext.mods.extensions.listener.actor.player.OnTeleportListener);
    descriptor: (Lext/mods/extensions/listener/actor/player/OnTeleportListener;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #31                 // Field teleportListeners:Ljava/util/List;
         4: aload_1
         5: invokeinterface #50,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 172: 0
        line 173: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/extensions/listener/manager/PlayerListenerManager;
            0      12     1 listener   Lext/mods/extensions/listener/actor/player/OnTeleportListener;

  public void unregisterTeleportListener(ext.mods.extensions.listener.actor.player.OnTeleportListener);
    descriptor: (Lext/mods/extensions/listener/actor/player/OnTeleportListener;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #31                 // Field teleportListeners:Ljava/util/List;
         4: aload_1
         5: invokeinterface #56,  2           // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 177: 0
        line 178: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/extensions/listener/manager/PlayerListenerManager;
            0      12     1 listener   Lext/mods/extensions/listener/actor/player/OnTeleportListener;

  public void notifyTeleport(ext.mods.gameserver.model.actor.Player, int, int, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;III)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=7, args_size=5
         0: aload_0
         1: getfield      #31                 // Field teleportListeners:Ljava/util/List;
         4: invokeinterface #59,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore        5
        11: aload         5
        13: invokeinterface #63,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        18: ifeq          48
        21: aload         5
        23: invokeinterface #69,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        28: checkcast     #107                // class ext/mods/extensions/listener/actor/player/OnTeleportListener
        31: astore        6
        33: aload         6
        35: aload_1
        36: iload_2
        37: iload_3
        38: iload         4
        40: invokeinterface #109,  5          // InterfaceMethod ext/mods/extensions/listener/actor/player/OnTeleportListener.onTeleport:(Lext/mods/gameserver/model/actor/Player;III)V
        45: goto          11
        48: return
      LineNumberTable:
        line 182: 0
        line 184: 33
        line 185: 45
        line 186: 48
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           33      12     6 listener   Lext/mods/extensions/listener/actor/player/OnTeleportListener;
            0      49     0  this   Lext/mods/extensions/listener/manager/PlayerListenerManager;
            0      49     1 player   Lext/mods/gameserver/model/actor/Player;
            0      49     2     x   I
            0      49     3     y   I
            0      49     4     z   I
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 11
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 36

  public void registerSetClassListener(ext.mods.extensions.listener.actor.player.OnSetClassListener);
    descriptor: (Lext/mods/extensions/listener/actor/player/OnSetClassListener;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #34                 // Field classListeners:Ljava/util/List;
         4: aload_1
         5: invokeinterface #50,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 190: 0
        line 191: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/extensions/listener/manager/PlayerListenerManager;
            0      12     1 listener   Lext/mods/extensions/listener/actor/player/OnSetClassListener;

  public void unregisterSetClassListener(ext.mods.extensions.listener.actor.player.OnSetClassListener);
    descriptor: (Lext/mods/extensions/listener/actor/player/OnSetClassListener;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #34                 // Field classListeners:Ljava/util/List;
         4: aload_1
         5: invokeinterface #56,  2           // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 195: 0
        line 196: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/extensions/listener/manager/PlayerListenerManager;
            0      12     1 listener   Lext/mods/extensions/listener/actor/player/OnSetClassListener;

  public void notifySetClass(ext.mods.gameserver.model.actor.Player, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=3
         0: aload_0
         1: getfield      #34                 // Field classListeners:Ljava/util/List;
         4: invokeinterface #59,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore_3
        10: aload_3
        11: invokeinterface #63,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          42
        19: aload_3
        20: invokeinterface #69,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #113                // class ext/mods/extensions/listener/actor/player/OnSetClassListener
        28: astore        4
        30: aload         4
        32: aload_1
        33: iload_2
        34: invokeinterface #115,  3          // InterfaceMethod ext/mods/extensions/listener/actor/player/OnSetClassListener.onSetClass:(Lext/mods/gameserver/model/actor/Player;I)V
        39: goto          10
        42: return
      LineNumberTable:
        line 200: 0
        line 202: 30
        line 203: 39
        line 204: 42
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           30       9     4 listener   Lext/mods/extensions/listener/actor/player/OnSetClassListener;
            0      43     0  this   Lext/mods/extensions/listener/manager/PlayerListenerManager;
            0      43     1 player   Lext/mods/gameserver/model/actor/Player;
            0      43     2 newClassId   I
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 31

  public void registerSkillEnchantSuccessListener(ext.mods.extensions.listener.actor.player.OnSkillEnchantSuccessListener);
    descriptor: (Lext/mods/extensions/listener/actor/player/OnSkillEnchantSuccessListener;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #37                 // Field skillEnchantListeners:Ljava/util/List;
         4: aload_1
         5: invokeinterface #50,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 208: 0
        line 209: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/extensions/listener/manager/PlayerListenerManager;
            0      12     1 listener   Lext/mods/extensions/listener/actor/player/OnSkillEnchantSuccessListener;

  public void unregisterSkillEnchantSuccessListener(ext.mods.extensions.listener.actor.player.OnSkillEnchantSuccessListener);
    descriptor: (Lext/mods/extensions/listener/actor/player/OnSkillEnchantSuccessListener;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #37                 // Field skillEnchantListeners:Ljava/util/List;
         4: aload_1
         5: invokeinterface #56,  2           // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 213: 0
        line 214: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/extensions/listener/manager/PlayerListenerManager;
            0      12     1 listener   Lext/mods/extensions/listener/actor/player/OnSkillEnchantSuccessListener;

  public void notifySkillEnchantSuccess(ext.mods.gameserver.model.actor.Player, int, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;II)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=6, args_size=4
         0: aload_0
         1: getfield      #37                 // Field skillEnchantListeners:Ljava/util/List;
         4: invokeinterface #59,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore        4
        11: aload         4
        13: invokeinterface #63,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        18: ifeq          46
        21: aload         4
        23: invokeinterface #69,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        28: checkcast     #118                // class ext/mods/extensions/listener/actor/player/OnSkillEnchantSuccessListener
        31: astore        5
        33: aload         5
        35: aload_1
        36: iload_2
        37: iload_3
        38: invokeinterface #120,  4          // InterfaceMethod ext/mods/extensions/listener/actor/player/OnSkillEnchantSuccessListener.onSkillEnchantSuccess:(Lext/mods/gameserver/model/actor/Player;II)V
        43: goto          11
        46: return
      LineNumberTable:
        line 218: 0
        line 220: 33
        line 221: 43
        line 222: 46
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           33      10     5 listener   Lext/mods/extensions/listener/actor/player/OnSkillEnchantSuccessListener;
            0      47     0  this   Lext/mods/extensions/listener/manager/PlayerListenerManager;
            0      47     1 player   Lext/mods/gameserver/model/actor/Player;
            0      47     2 skillId   I
            0      47     3 skillLevel   I
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 11
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 34

  public void registerItemPickupListener(ext.mods.extensions.listener.actor.player.OnItemPickupListener);
    descriptor: (Lext/mods/extensions/listener/actor/player/OnItemPickupListener;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #40                 // Field itemPickupListeners:Ljava/util/List;
         4: aload_1
         5: invokeinterface #50,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 226: 0
        line 227: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/extensions/listener/manager/PlayerListenerManager;
            0      12     1 listener   Lext/mods/extensions/listener/actor/player/OnItemPickupListener;

  public void unregisterItemPickupListener(ext.mods.extensions.listener.actor.player.OnItemPickupListener);
    descriptor: (Lext/mods/extensions/listener/actor/player/OnItemPickupListener;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #40                 // Field itemPickupListeners:Ljava/util/List;
         4: aload_1
         5: invokeinterface #56,  2           // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 231: 0
        line 232: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/extensions/listener/manager/PlayerListenerManager;
            0      12     1 listener   Lext/mods/extensions/listener/actor/player/OnItemPickupListener;

  public void notifyItemPickup(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=3
         0: aload_0
         1: getfield      #40                 // Field itemPickupListeners:Ljava/util/List;
         4: invokeinterface #59,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore_3
        10: aload_3
        11: invokeinterface #63,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          42
        19: aload_3
        20: invokeinterface #69,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #124                // class ext/mods/extensions/listener/actor/player/OnItemPickupListener
        28: astore        4
        30: aload         4
        32: aload_1
        33: aload_2
        34: invokeinterface #126,  3          // InterfaceMethod ext/mods/extensions/listener/actor/player/OnItemPickupListener.onItemPickup:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
        39: goto          10
        42: return
      LineNumberTable:
        line 236: 0
        line 238: 30
        line 239: 39
        line 240: 42
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           30       9     4 listener   Lext/mods/extensions/listener/actor/player/OnItemPickupListener;
            0      43     0  this   Lext/mods/extensions/listener/manager/PlayerListenerManager;
            0      43     1 player   Lext/mods/gameserver/model/actor/Player;
            0      43     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 31

  public void registerItemDestroyListener(ext.mods.extensions.listener.actor.player.OnItemDestroyListener);
    descriptor: (Lext/mods/extensions/listener/actor/player/OnItemDestroyListener;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #43                 // Field itemDestroyListeners:Ljava/util/List;
         4: aload_1
         5: invokeinterface #50,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 244: 0
        line 245: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/extensions/listener/manager/PlayerListenerManager;
            0      12     1 listener   Lext/mods/extensions/listener/actor/player/OnItemDestroyListener;

  public void unregisterItemDestroyListener(ext.mods.extensions.listener.actor.player.OnItemDestroyListener);
    descriptor: (Lext/mods/extensions/listener/actor/player/OnItemDestroyListener;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #43                 // Field itemDestroyListeners:Ljava/util/List;
         4: aload_1
         5: invokeinterface #56,  2           // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 249: 0
        line 250: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/extensions/listener/manager/PlayerListenerManager;
            0      12     1 listener   Lext/mods/extensions/listener/actor/player/OnItemDestroyListener;

  public void notifyItemDestroy(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=3
         0: aload_0
         1: getfield      #43                 // Field itemDestroyListeners:Ljava/util/List;
         4: invokeinterface #59,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore_3
        10: aload_3
        11: invokeinterface #63,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          42
        19: aload_3
        20: invokeinterface #69,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #130                // class ext/mods/extensions/listener/actor/player/OnItemDestroyListener
        28: astore        4
        30: aload         4
        32: aload_1
        33: aload_2
        34: invokeinterface #132,  3          // InterfaceMethod ext/mods/extensions/listener/actor/player/OnItemDestroyListener.onItemDestroy:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
        39: goto          10
        42: return
      LineNumberTable:
        line 254: 0
        line 256: 30
        line 257: 39
        line 258: 42
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           30       9     4 listener   Lext/mods/extensions/listener/actor/player/OnItemDestroyListener;
            0      43     0  this   Lext/mods/extensions/listener/manager/PlayerListenerManager;
            0      43     1 player   Lext/mods/gameserver/model/actor/Player;
            0      43     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 31

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: new           #11                 // class ext/mods/extensions/listener/manager/PlayerListenerManager
         3: dup
         4: invokespecial #135                // Method "<init>":()V
         7: putstatic     #46                 // Field INSTANCE:Lext/mods/extensions/listener/manager/PlayerListenerManager;
        10: return
      LineNumberTable:
        line 39: 0
}
SourceFile: "PlayerListenerManager.java"
