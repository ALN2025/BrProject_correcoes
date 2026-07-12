// Bytecode for: ext.mods.extensions.listener.manager.NpcListenerManager
// File: ext\mods\extensions\listener\manager\NpcListenerManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/extensions/listener/manager/NpcListenerManager.class
  Last modified 9 de jul de 2026; size 4161 bytes
  MD5 checksum 1a5f3f25e1e25490a63b25b7924ece76
  Compiled from "NpcListenerManager.java"
public class ext.mods.extensions.listener.manager.NpcListenerManager
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/extensions/listener/manager/NpcListenerManager
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 5, methods: 15, attributes: 1
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
   #10 = Fieldref           #11.#12       // ext/mods/extensions/listener/manager/NpcListenerManager.npcSpawnListeners:Ljava/util/List;
   #11 = Class              #13           // ext/mods/extensions/listener/manager/NpcListenerManager
   #12 = NameAndType        #14:#15       // npcSpawnListeners:Ljava/util/List;
   #13 = Utf8               ext/mods/extensions/listener/manager/NpcListenerManager
   #14 = Utf8               npcSpawnListeners
   #15 = Utf8               Ljava/util/List;
   #16 = Fieldref           #11.#17       // ext/mods/extensions/listener/manager/NpcListenerManager.npcDecayListeners:Ljava/util/List;
   #17 = NameAndType        #18:#15       // npcDecayListeners:Ljava/util/List;
   #18 = Utf8               npcDecayListeners
   #19 = Fieldref           #11.#20       // ext/mods/extensions/listener/manager/NpcListenerManager.npcInteractListeners:Ljava/util/List;
   #20 = NameAndType        #21:#15       // npcInteractListeners:Ljava/util/List;
   #21 = Utf8               npcInteractListeners
   #22 = Fieldref           #11.#23       // ext/mods/extensions/listener/manager/NpcListenerManager.npcKillListeners:Ljava/util/List;
   #23 = NameAndType        #24:#15       // npcKillListeners:Ljava/util/List;
   #24 = Utf8               npcKillListeners
   #25 = Fieldref           #11.#26       // ext/mods/extensions/listener/manager/NpcListenerManager.INSTANCE:Lext/mods/extensions/listener/manager/NpcListenerManager;
   #26 = NameAndType        #27:#28       // INSTANCE:Lext/mods/extensions/listener/manager/NpcListenerManager;
   #27 = Utf8               INSTANCE
   #28 = Utf8               Lext/mods/extensions/listener/manager/NpcListenerManager;
   #29 = InterfaceMethodref #30.#31       // java/util/List.add:(Ljava/lang/Object;)Z
   #30 = Class              #32           // java/util/List
   #31 = NameAndType        #33:#34       // add:(Ljava/lang/Object;)Z
   #32 = Utf8               java/util/List
   #33 = Utf8               add
   #34 = Utf8               (Ljava/lang/Object;)Z
   #35 = InterfaceMethodref #30.#36       // java/util/List.remove:(Ljava/lang/Object;)Z
   #36 = NameAndType        #37:#34       // remove:(Ljava/lang/Object;)Z
   #37 = Utf8               remove
   #38 = InterfaceMethodref #30.#39       // java/util/List.iterator:()Ljava/util/Iterator;
   #39 = NameAndType        #40:#41       // iterator:()Ljava/util/Iterator;
   #40 = Utf8               iterator
   #41 = Utf8               ()Ljava/util/Iterator;
   #42 = InterfaceMethodref #43.#44       // java/util/Iterator.hasNext:()Z
   #43 = Class              #45           // java/util/Iterator
   #44 = NameAndType        #46:#47       // hasNext:()Z
   #45 = Utf8               java/util/Iterator
   #46 = Utf8               hasNext
   #47 = Utf8               ()Z
   #48 = InterfaceMethodref #43.#49       // java/util/Iterator.next:()Ljava/lang/Object;
   #49 = NameAndType        #50:#51       // next:()Ljava/lang/Object;
   #50 = Utf8               next
   #51 = Utf8               ()Ljava/lang/Object;
   #52 = Class              #53           // ext/mods/extensions/listener/actor/npc/OnSpawnListener
   #53 = Utf8               ext/mods/extensions/listener/actor/npc/OnSpawnListener
   #54 = InterfaceMethodref #52.#55       // ext/mods/extensions/listener/actor/npc/OnSpawnListener.onSpawn:(Lext/mods/gameserver/model/actor/Npc;)V
   #55 = NameAndType        #56:#57       // onSpawn:(Lext/mods/gameserver/model/actor/Npc;)V
   #56 = Utf8               onSpawn
   #57 = Utf8               (Lext/mods/gameserver/model/actor/Npc;)V
   #58 = Class              #59           // ext/mods/extensions/listener/actor/npc/OnDecayListener
   #59 = Utf8               ext/mods/extensions/listener/actor/npc/OnDecayListener
   #60 = InterfaceMethodref #58.#61       // ext/mods/extensions/listener/actor/npc/OnDecayListener.onDecay:(Lext/mods/gameserver/model/actor/Npc;)V
   #61 = NameAndType        #62:#57       // onDecay:(Lext/mods/gameserver/model/actor/Npc;)V
   #62 = Utf8               onDecay
   #63 = Class              #64           // ext/mods/extensions/listener/actor/npc/OnInteractListener
   #64 = Utf8               ext/mods/extensions/listener/actor/npc/OnInteractListener
   #65 = InterfaceMethodref #63.#66       // ext/mods/extensions/listener/actor/npc/OnInteractListener.onInteract:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)Z
   #66 = NameAndType        #67:#68       // onInteract:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)Z
   #67 = Utf8               onInteract
   #68 = Utf8               (Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)Z
   #69 = Class              #70           // ext/mods/extensions/listener/actor/npc/OnNpcKillListener
   #70 = Utf8               ext/mods/extensions/listener/actor/npc/OnNpcKillListener
   #71 = InterfaceMethodref #69.#72       // ext/mods/extensions/listener/actor/npc/OnNpcKillListener.onKill:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
   #72 = NameAndType        #73:#74       // onKill:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
   #73 = Utf8               onKill
   #74 = Utf8               (Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
   #75 = Methodref          #11.#3        // ext/mods/extensions/listener/manager/NpcListenerManager."<init>":()V
   #76 = Utf8               Signature
   #77 = Utf8               Ljava/util/List<Lext/mods/extensions/listener/actor/npc/OnSpawnListener;>;
   #78 = Utf8               Ljava/util/List<Lext/mods/extensions/listener/actor/npc/OnDecayListener;>;
   #79 = Utf8               Ljava/util/List<Lext/mods/extensions/listener/actor/npc/OnInteractListener;>;
   #80 = Utf8               Ljava/util/List<Lext/mods/extensions/listener/actor/npc/OnNpcKillListener;>;
   #81 = Utf8               Code
   #82 = Utf8               LineNumberTable
   #83 = Utf8               LocalVariableTable
   #84 = Utf8               this
   #85 = Utf8               getInstance
   #86 = Utf8               ()Lext/mods/extensions/listener/manager/NpcListenerManager;
   #87 = Utf8               registerNpcSpawnListener
   #88 = Utf8               (Lext/mods/extensions/listener/actor/npc/OnSpawnListener;)V
   #89 = Utf8               listener
   #90 = Utf8               Lext/mods/extensions/listener/actor/npc/OnSpawnListener;
   #91 = Utf8               unregisterNpcSpawnListener
   #92 = Utf8               notifyNpcSpawn
   #93 = Utf8               npc
   #94 = Utf8               Lext/mods/gameserver/model/actor/Npc;
   #95 = Utf8               StackMapTable
   #96 = Utf8               registerNpcDecayListener
   #97 = Utf8               (Lext/mods/extensions/listener/actor/npc/OnDecayListener;)V
   #98 = Utf8               Lext/mods/extensions/listener/actor/npc/OnDecayListener;
   #99 = Utf8               unregisterNpcDecayListener
  #100 = Utf8               notifyNpcDecay
  #101 = Utf8               registerNpcInteractListener
  #102 = Utf8               (Lext/mods/extensions/listener/actor/npc/OnInteractListener;)V
  #103 = Utf8               Lext/mods/extensions/listener/actor/npc/OnInteractListener;
  #104 = Utf8               unregisterNpcInteractListener
  #105 = Utf8               notifyNpcInteract
  #106 = Utf8               player
  #107 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #108 = Utf8               registerNpcKillListener
  #109 = Utf8               (Lext/mods/extensions/listener/actor/npc/OnNpcKillListener;)V
  #110 = Utf8               Lext/mods/extensions/listener/actor/npc/OnNpcKillListener;
  #111 = Utf8               unregisterNpcKillListener
  #112 = Utf8               notifyNpcKill
  #113 = Utf8               killer
  #114 = Utf8               <clinit>
  #115 = Utf8               SourceFile
  #116 = Utf8               NpcListenerManager.java
{
  public static ext.mods.extensions.listener.manager.NpcListenerManager getInstance();
    descriptor: ()Lext/mods/extensions/listener/manager/NpcListenerManager;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #25                 // Field INSTANCE:Lext/mods/extensions/listener/manager/NpcListenerManager;
         3: areturn
      LineNumberTable:
        line 45: 0

  public void registerNpcSpawnListener(ext.mods.extensions.listener.actor.npc.OnSpawnListener);
    descriptor: (Lext/mods/extensions/listener/actor/npc/OnSpawnListener;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field npcSpawnListeners:Ljava/util/List;
         4: aload_1
         5: invokeinterface #29,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 50: 0
        line 51: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/extensions/listener/manager/NpcListenerManager;
            0      12     1 listener   Lext/mods/extensions/listener/actor/npc/OnSpawnListener;

  public void unregisterNpcSpawnListener(ext.mods.extensions.listener.actor.npc.OnSpawnListener);
    descriptor: (Lext/mods/extensions/listener/actor/npc/OnSpawnListener;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field npcSpawnListeners:Ljava/util/List;
         4: aload_1
         5: invokeinterface #35,  2           // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 55: 0
        line 56: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/extensions/listener/manager/NpcListenerManager;
            0      12     1 listener   Lext/mods/extensions/listener/actor/npc/OnSpawnListener;

  public void notifyNpcSpawn(ext.mods.gameserver.model.actor.Npc);
    descriptor: (Lext/mods/gameserver/model/actor/Npc;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=2
         0: aload_0
         1: getfield      #10                 // Field npcSpawnListeners:Ljava/util/List;
         4: invokeinterface #38,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore_2
        10: aload_2
        11: invokeinterface #42,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          39
        19: aload_2
        20: invokeinterface #48,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #52                 // class ext/mods/extensions/listener/actor/npc/OnSpawnListener
        28: astore_3
        29: aload_3
        30: aload_1
        31: invokeinterface #54,  2           // InterfaceMethod ext/mods/extensions/listener/actor/npc/OnSpawnListener.onSpawn:(Lext/mods/gameserver/model/actor/Npc;)V
        36: goto          10
        39: return
      LineNumberTable:
        line 60: 0
        line 62: 29
        line 63: 36
        line 64: 39
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           29       7     3 listener   Lext/mods/extensions/listener/actor/npc/OnSpawnListener;
            0      40     0  this   Lext/mods/extensions/listener/manager/NpcListenerManager;
            0      40     1   npc   Lext/mods/gameserver/model/actor/Npc;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 28

  public void registerNpcDecayListener(ext.mods.extensions.listener.actor.npc.OnDecayListener);
    descriptor: (Lext/mods/extensions/listener/actor/npc/OnDecayListener;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #16                 // Field npcDecayListeners:Ljava/util/List;
         4: aload_1
         5: invokeinterface #29,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 68: 0
        line 69: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/extensions/listener/manager/NpcListenerManager;
            0      12     1 listener   Lext/mods/extensions/listener/actor/npc/OnDecayListener;

  public void unregisterNpcDecayListener(ext.mods.extensions.listener.actor.npc.OnDecayListener);
    descriptor: (Lext/mods/extensions/listener/actor/npc/OnDecayListener;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #16                 // Field npcDecayListeners:Ljava/util/List;
         4: aload_1
         5: invokeinterface #35,  2           // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 73: 0
        line 74: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/extensions/listener/manager/NpcListenerManager;
            0      12     1 listener   Lext/mods/extensions/listener/actor/npc/OnDecayListener;

  public void notifyNpcDecay(ext.mods.gameserver.model.actor.Npc);
    descriptor: (Lext/mods/gameserver/model/actor/Npc;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=2
         0: aload_0
         1: getfield      #16                 // Field npcDecayListeners:Ljava/util/List;
         4: invokeinterface #38,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore_2
        10: aload_2
        11: invokeinterface #42,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          39
        19: aload_2
        20: invokeinterface #48,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #58                 // class ext/mods/extensions/listener/actor/npc/OnDecayListener
        28: astore_3
        29: aload_3
        30: aload_1
        31: invokeinterface #60,  2           // InterfaceMethod ext/mods/extensions/listener/actor/npc/OnDecayListener.onDecay:(Lext/mods/gameserver/model/actor/Npc;)V
        36: goto          10
        39: return
      LineNumberTable:
        line 78: 0
        line 80: 29
        line 81: 36
        line 82: 39
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           29       7     3 listener   Lext/mods/extensions/listener/actor/npc/OnDecayListener;
            0      40     0  this   Lext/mods/extensions/listener/manager/NpcListenerManager;
            0      40     1   npc   Lext/mods/gameserver/model/actor/Npc;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 28

  public void registerNpcInteractListener(ext.mods.extensions.listener.actor.npc.OnInteractListener);
    descriptor: (Lext/mods/extensions/listener/actor/npc/OnInteractListener;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #19                 // Field npcInteractListeners:Ljava/util/List;
         4: aload_1
         5: invokeinterface #29,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 86: 0
        line 87: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/extensions/listener/manager/NpcListenerManager;
            0      12     1 listener   Lext/mods/extensions/listener/actor/npc/OnInteractListener;

  public void unregisterNpcInteractListener(ext.mods.extensions.listener.actor.npc.OnInteractListener);
    descriptor: (Lext/mods/extensions/listener/actor/npc/OnInteractListener;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #19                 // Field npcInteractListeners:Ljava/util/List;
         4: aload_1
         5: invokeinterface #35,  2           // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 91: 0
        line 92: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/extensions/listener/manager/NpcListenerManager;
            0      12     1 listener   Lext/mods/extensions/listener/actor/npc/OnInteractListener;

  public boolean notifyNpcInteract(ext.mods.gameserver.model.actor.Npc, ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=3
         0: aload_0
         1: getfield      #19                 // Field npcInteractListeners:Ljava/util/List;
         4: invokeinterface #38,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore_3
        10: aload_3
        11: invokeinterface #42,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          47
        19: aload_3
        20: invokeinterface #48,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #63                 // class ext/mods/extensions/listener/actor/npc/OnInteractListener
        28: astore        4
        30: aload         4
        32: aload_1
        33: aload_2
        34: invokeinterface #65,  3           // InterfaceMethod ext/mods/extensions/listener/actor/npc/OnInteractListener.onInteract:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)Z
        39: ifeq          44
        42: iconst_1
        43: ireturn
        44: goto          10
        47: iconst_0
        48: ireturn
      LineNumberTable:
        line 96: 0
        line 98: 30
        line 99: 42
        line 100: 44
        line 101: 47
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           30      14     4 listener   Lext/mods/extensions/listener/actor/npc/OnInteractListener;
            0      49     0  this   Lext/mods/extensions/listener/manager/NpcListenerManager;
            0      49     1   npc   Lext/mods/gameserver/model/actor/Npc;
            0      49     2 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 33 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2

  public void registerNpcKillListener(ext.mods.extensions.listener.actor.npc.OnNpcKillListener);
    descriptor: (Lext/mods/extensions/listener/actor/npc/OnNpcKillListener;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #22                 // Field npcKillListeners:Ljava/util/List;
         4: aload_1
         5: invokeinterface #29,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 106: 0
        line 107: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/extensions/listener/manager/NpcListenerManager;
            0      12     1 listener   Lext/mods/extensions/listener/actor/npc/OnNpcKillListener;

  public void unregisterNpcKillListener(ext.mods.extensions.listener.actor.npc.OnNpcKillListener);
    descriptor: (Lext/mods/extensions/listener/actor/npc/OnNpcKillListener;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #22                 // Field npcKillListeners:Ljava/util/List;
         4: aload_1
         5: invokeinterface #35,  2           // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 111: 0
        line 112: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/extensions/listener/manager/NpcListenerManager;
            0      12     1 listener   Lext/mods/extensions/listener/actor/npc/OnNpcKillListener;

  public void notifyNpcKill(ext.mods.gameserver.model.actor.Npc, ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=3
         0: aload_0
         1: getfield      #22                 // Field npcKillListeners:Ljava/util/List;
         4: invokeinterface #38,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore_3
        10: aload_3
        11: invokeinterface #42,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          42
        19: aload_3
        20: invokeinterface #48,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #69                 // class ext/mods/extensions/listener/actor/npc/OnNpcKillListener
        28: astore        4
        30: aload         4
        32: aload_1
        33: aload_2
        34: invokeinterface #71,  3           // InterfaceMethod ext/mods/extensions/listener/actor/npc/OnNpcKillListener.onKill:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
        39: goto          10
        42: return
      LineNumberTable:
        line 116: 0
        line 118: 30
        line 119: 39
        line 120: 42
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           30       9     4 listener   Lext/mods/extensions/listener/actor/npc/OnNpcKillListener;
            0      43     0  this   Lext/mods/extensions/listener/manager/NpcListenerManager;
            0      43     1   npc   Lext/mods/gameserver/model/actor/Npc;
            0      43     2 killer   Lext/mods/gameserver/model/actor/Player;
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
         0: new           #11                 // class ext/mods/extensions/listener/manager/NpcListenerManager
         3: dup
         4: invokespecial #75                 // Method "<init>":()V
         7: putstatic     #25                 // Field INSTANCE:Lext/mods/extensions/listener/manager/NpcListenerManager;
        10: return
      LineNumberTable:
        line 32: 0
}
SourceFile: "NpcListenerManager.java"
