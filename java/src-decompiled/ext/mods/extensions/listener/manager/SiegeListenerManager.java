// Bytecode for: ext.mods.extensions.listener.manager.SiegeListenerManager
// File: ext\mods\extensions\listener\manager\SiegeListenerManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/extensions/listener/manager/SiegeListenerManager.class
  Last modified 9 de jul de 2026; size 4091 bytes
  MD5 checksum 96e7c81e851ae0b1a9251141ecac1f93
  Compiled from "SiegeListenerManager.java"
public class ext.mods.extensions.listener.manager.SiegeListenerManager
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/extensions/listener/manager/SiegeListenerManager
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 4, methods: 13, attributes: 1
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
   #10 = Fieldref           #11.#12       // ext/mods/extensions/listener/manager/SiegeListenerManager.listeners:Ljava/util/List;
   #11 = Class              #13           // ext/mods/extensions/listener/manager/SiegeListenerManager
   #12 = NameAndType        #14:#15       // listeners:Ljava/util/List;
   #13 = Utf8               ext/mods/extensions/listener/manager/SiegeListenerManager
   #14 = Utf8               listeners
   #15 = Utf8               Ljava/util/List;
   #16 = Fieldref           #11.#17       // ext/mods/extensions/listener/manager/SiegeListenerManager.attackerListeners:Ljava/util/List;
   #17 = NameAndType        #18:#15       // attackerListeners:Ljava/util/List;
   #18 = Utf8               attackerListeners
   #19 = Fieldref           #11.#20       // ext/mods/extensions/listener/manager/SiegeListenerManager.defenderListeners:Ljava/util/List;
   #20 = NameAndType        #21:#15       // defenderListeners:Ljava/util/List;
   #21 = Utf8               defenderListeners
   #22 = Fieldref           #11.#23       // ext/mods/extensions/listener/manager/SiegeListenerManager.INSTANCE:Lext/mods/extensions/listener/manager/SiegeListenerManager;
   #23 = NameAndType        #24:#25       // INSTANCE:Lext/mods/extensions/listener/manager/SiegeListenerManager;
   #24 = Utf8               INSTANCE
   #25 = Utf8               Lext/mods/extensions/listener/manager/SiegeListenerManager;
   #26 = InterfaceMethodref #27.#28       // java/util/List.add:(Ljava/lang/Object;)Z
   #27 = Class              #29           // java/util/List
   #28 = NameAndType        #30:#31       // add:(Ljava/lang/Object;)Z
   #29 = Utf8               java/util/List
   #30 = Utf8               add
   #31 = Utf8               (Ljava/lang/Object;)Z
   #32 = InterfaceMethodref #27.#33       // java/util/List.remove:(Ljava/lang/Object;)Z
   #33 = NameAndType        #34:#31       // remove:(Ljava/lang/Object;)Z
   #34 = Utf8               remove
   #35 = InterfaceMethodref #27.#36       // java/util/List.iterator:()Ljava/util/Iterator;
   #36 = NameAndType        #37:#38       // iterator:()Ljava/util/Iterator;
   #37 = Utf8               iterator
   #38 = Utf8               ()Ljava/util/Iterator;
   #39 = InterfaceMethodref #40.#41       // java/util/Iterator.hasNext:()Z
   #40 = Class              #42           // java/util/Iterator
   #41 = NameAndType        #43:#44       // hasNext:()Z
   #42 = Utf8               java/util/Iterator
   #43 = Utf8               hasNext
   #44 = Utf8               ()Z
   #45 = InterfaceMethodref #40.#46       // java/util/Iterator.next:()Ljava/lang/Object;
   #46 = NameAndType        #47:#48       // next:()Ljava/lang/Object;
   #47 = Utf8               next
   #48 = Utf8               ()Ljava/lang/Object;
   #49 = Class              #50           // ext/mods/extensions/listener/siege/OnSiegeListener
   #50 = Utf8               ext/mods/extensions/listener/siege/OnSiegeListener
   #51 = InterfaceMethodref #49.#52       // ext/mods/extensions/listener/siege/OnSiegeListener.onSiegeStart:(Lext/mods/gameserver/model/residence/castle/Siege;)V
   #52 = NameAndType        #53:#54       // onSiegeStart:(Lext/mods/gameserver/model/residence/castle/Siege;)V
   #53 = Utf8               onSiegeStart
   #54 = Utf8               (Lext/mods/gameserver/model/residence/castle/Siege;)V
   #55 = Class              #56           // java/lang/Exception
   #56 = Utf8               java/lang/Exception
   #57 = Methodref          #55.#58       // java/lang/Exception.printStackTrace:()V
   #58 = NameAndType        #59:#6        // printStackTrace:()V
   #59 = Utf8               printStackTrace
   #60 = InterfaceMethodref #49.#61       // ext/mods/extensions/listener/siege/OnSiegeListener.onSiegeEnd:(Lext/mods/gameserver/model/residence/castle/Siege;)V
   #61 = NameAndType        #62:#54       // onSiegeEnd:(Lext/mods/gameserver/model/residence/castle/Siege;)V
   #62 = Utf8               onSiegeEnd
   #63 = Class              #64           // ext/mods/extensions/listener/siege/OnSiegeRegisterAttackerListener
   #64 = Utf8               ext/mods/extensions/listener/siege/OnSiegeRegisterAttackerListener
   #65 = InterfaceMethodref #63.#66       // ext/mods/extensions/listener/siege/OnSiegeRegisterAttackerListener.onRegisterAttacker:(Lext/mods/gameserver/model/residence/castle/Siege;Lext/mods/gameserver/model/actor/Player;)V
   #66 = NameAndType        #67:#68       // onRegisterAttacker:(Lext/mods/gameserver/model/residence/castle/Siege;Lext/mods/gameserver/model/actor/Player;)V
   #67 = Utf8               onRegisterAttacker
   #68 = Utf8               (Lext/mods/gameserver/model/residence/castle/Siege;Lext/mods/gameserver/model/actor/Player;)V
   #69 = Class              #70           // ext/mods/extensions/listener/siege/OnSiegeRegisterDefenderListener
   #70 = Utf8               ext/mods/extensions/listener/siege/OnSiegeRegisterDefenderListener
   #71 = InterfaceMethodref #69.#72       // ext/mods/extensions/listener/siege/OnSiegeRegisterDefenderListener.onRegisterDefender:(Lext/mods/gameserver/model/residence/castle/Siege;Lext/mods/gameserver/model/actor/Player;)V
   #72 = NameAndType        #73:#68       // onRegisterDefender:(Lext/mods/gameserver/model/residence/castle/Siege;Lext/mods/gameserver/model/actor/Player;)V
   #73 = Utf8               onRegisterDefender
   #74 = Methodref          #11.#3        // ext/mods/extensions/listener/manager/SiegeListenerManager."<init>":()V
   #75 = Utf8               Signature
   #76 = Utf8               Ljava/util/List<Lext/mods/extensions/listener/siege/OnSiegeListener;>;
   #77 = Utf8               Ljava/util/List<Lext/mods/extensions/listener/siege/OnSiegeRegisterAttackerListener;>;
   #78 = Utf8               Ljava/util/List<Lext/mods/extensions/listener/siege/OnSiegeRegisterDefenderListener;>;
   #79 = Utf8               Code
   #80 = Utf8               LineNumberTable
   #81 = Utf8               LocalVariableTable
   #82 = Utf8               this
   #83 = Utf8               getInstance
   #84 = Utf8               ()Lext/mods/extensions/listener/manager/SiegeListenerManager;
   #85 = Utf8               registerListener
   #86 = Utf8               (Lext/mods/extensions/listener/siege/OnSiegeListener;)V
   #87 = Utf8               listener
   #88 = Utf8               Lext/mods/extensions/listener/siege/OnSiegeListener;
   #89 = Utf8               unregisterListener
   #90 = Utf8               notifySiegeStart
   #91 = Utf8               e
   #92 = Utf8               Ljava/lang/Exception;
   #93 = Utf8               l
   #94 = Utf8               siege
   #95 = Utf8               Lext/mods/gameserver/model/residence/castle/Siege;
   #96 = Utf8               StackMapTable
   #97 = Class              #98           // ext/mods/gameserver/model/residence/castle/Siege
   #98 = Utf8               ext/mods/gameserver/model/residence/castle/Siege
   #99 = Utf8               notifySiegeEnd
  #100 = Utf8               registerAttackerListener
  #101 = Utf8               (Lext/mods/extensions/listener/siege/OnSiegeRegisterAttackerListener;)V
  #102 = Utf8               Lext/mods/extensions/listener/siege/OnSiegeRegisterAttackerListener;
  #103 = Utf8               unregisterAttackerListener
  #104 = Utf8               registerDefenderListener
  #105 = Utf8               (Lext/mods/extensions/listener/siege/OnSiegeRegisterDefenderListener;)V
  #106 = Utf8               Lext/mods/extensions/listener/siege/OnSiegeRegisterDefenderListener;
  #107 = Utf8               unregisterDefenderListener
  #108 = Utf8               notifyRegisterAttacker
  #109 = Utf8               player
  #110 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #111 = Class              #112          // ext/mods/gameserver/model/actor/Player
  #112 = Utf8               ext/mods/gameserver/model/actor/Player
  #113 = Utf8               notifyRegisterDefender
  #114 = Utf8               <clinit>
  #115 = Utf8               SourceFile
  #116 = Utf8               SiegeListenerManager.java
{
  public static ext.mods.extensions.listener.manager.SiegeListenerManager getInstance();
    descriptor: ()Lext/mods/extensions/listener/manager/SiegeListenerManager;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #22                 // Field INSTANCE:Lext/mods/extensions/listener/manager/SiegeListenerManager;
         3: areturn
      LineNumberTable:
        line 42: 0

  public void registerListener(ext.mods.extensions.listener.siege.OnSiegeListener);
    descriptor: (Lext/mods/extensions/listener/siege/OnSiegeListener;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field listeners:Ljava/util/List;
         4: aload_1
         5: invokeinterface #26,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 47: 0
        line 48: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/extensions/listener/manager/SiegeListenerManager;
            0      12     1 listener   Lext/mods/extensions/listener/siege/OnSiegeListener;

  public void unregisterListener(ext.mods.extensions.listener.siege.OnSiegeListener);
    descriptor: (Lext/mods/extensions/listener/siege/OnSiegeListener;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field listeners:Ljava/util/List;
         4: aload_1
         5: invokeinterface #32,  2           // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 52: 0
        line 53: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/extensions/listener/manager/SiegeListenerManager;
            0      12     1 listener   Lext/mods/extensions/listener/siege/OnSiegeListener;

  public void notifySiegeStart(ext.mods.gameserver.model.residence.castle.Siege);
    descriptor: (Lext/mods/gameserver/model/residence/castle/Siege;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=2
         0: aload_0
         1: getfield      #10                 // Field listeners:Ljava/util/List;
         4: invokeinterface #35,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore_2
        10: aload_2
        11: invokeinterface #39,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          49
        19: aload_2
        20: invokeinterface #45,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #49                 // class ext/mods/extensions/listener/siege/OnSiegeListener
        28: astore_3
        29: aload_3
        30: aload_1
        31: invokeinterface #51,  2           // InterfaceMethod ext/mods/extensions/listener/siege/OnSiegeListener.onSiegeStart:(Lext/mods/gameserver/model/residence/castle/Siege;)V
        36: goto          46
        39: astore        4
        41: aload         4
        43: invokevirtual #57                 // Method java/lang/Exception.printStackTrace:()V
        46: goto          10
        49: return
      Exception table:
         from    to  target type
            29    36    39   Class java/lang/Exception
      LineNumberTable:
        line 57: 0
        line 61: 29
        line 66: 36
        line 63: 39
        line 65: 41
        line 67: 46
        line 68: 49
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           41       5     4     e   Ljava/lang/Exception;
           29      17     3     l   Lext/mods/extensions/listener/siege/OnSiegeListener;
            0      50     0  this   Lext/mods/extensions/listener/manager/SiegeListenerManager;
            0      50     1 siege   Lext/mods/gameserver/model/residence/castle/Siege;
      StackMapTable: number_of_entries = 4
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 255 /* full_frame */
          offset_delta = 28
          locals = [ class ext/mods/extensions/listener/manager/SiegeListenerManager, class ext/mods/gameserver/model/residence/castle/Siege, class java/util/Iterator, class ext/mods/extensions/listener/siege/OnSiegeListener ]
          stack = [ class java/lang/Exception ]
        frame_type = 250 /* chop */
          offset_delta = 6
        frame_type = 250 /* chop */
          offset_delta = 2

  public void notifySiegeEnd(ext.mods.gameserver.model.residence.castle.Siege);
    descriptor: (Lext/mods/gameserver/model/residence/castle/Siege;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=2
         0: aload_0
         1: getfield      #10                 // Field listeners:Ljava/util/List;
         4: invokeinterface #35,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore_2
        10: aload_2
        11: invokeinterface #39,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          49
        19: aload_2
        20: invokeinterface #45,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #49                 // class ext/mods/extensions/listener/siege/OnSiegeListener
        28: astore_3
        29: aload_3
        30: aload_1
        31: invokeinterface #60,  2           // InterfaceMethod ext/mods/extensions/listener/siege/OnSiegeListener.onSiegeEnd:(Lext/mods/gameserver/model/residence/castle/Siege;)V
        36: goto          46
        39: astore        4
        41: aload         4
        43: invokevirtual #57                 // Method java/lang/Exception.printStackTrace:()V
        46: goto          10
        49: return
      Exception table:
         from    to  target type
            29    36    39   Class java/lang/Exception
      LineNumberTable:
        line 72: 0
        line 76: 29
        line 81: 36
        line 78: 39
        line 80: 41
        line 82: 46
        line 83: 49
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           41       5     4     e   Ljava/lang/Exception;
           29      17     3     l   Lext/mods/extensions/listener/siege/OnSiegeListener;
            0      50     0  this   Lext/mods/extensions/listener/manager/SiegeListenerManager;
            0      50     1 siege   Lext/mods/gameserver/model/residence/castle/Siege;
      StackMapTable: number_of_entries = 4
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 255 /* full_frame */
          offset_delta = 28
          locals = [ class ext/mods/extensions/listener/manager/SiegeListenerManager, class ext/mods/gameserver/model/residence/castle/Siege, class java/util/Iterator, class ext/mods/extensions/listener/siege/OnSiegeListener ]
          stack = [ class java/lang/Exception ]
        frame_type = 250 /* chop */
          offset_delta = 6
        frame_type = 250 /* chop */
          offset_delta = 2

  public void registerAttackerListener(ext.mods.extensions.listener.siege.OnSiegeRegisterAttackerListener);
    descriptor: (Lext/mods/extensions/listener/siege/OnSiegeRegisterAttackerListener;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #16                 // Field attackerListeners:Ljava/util/List;
         4: aload_1
         5: invokeinterface #26,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 87: 0
        line 88: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/extensions/listener/manager/SiegeListenerManager;
            0      12     1 listener   Lext/mods/extensions/listener/siege/OnSiegeRegisterAttackerListener;

  public void unregisterAttackerListener(ext.mods.extensions.listener.siege.OnSiegeRegisterAttackerListener);
    descriptor: (Lext/mods/extensions/listener/siege/OnSiegeRegisterAttackerListener;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #16                 // Field attackerListeners:Ljava/util/List;
         4: aload_1
         5: invokeinterface #32,  2           // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 92: 0
        line 93: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/extensions/listener/manager/SiegeListenerManager;
            0      12     1 listener   Lext/mods/extensions/listener/siege/OnSiegeRegisterAttackerListener;

  public void registerDefenderListener(ext.mods.extensions.listener.siege.OnSiegeRegisterDefenderListener);
    descriptor: (Lext/mods/extensions/listener/siege/OnSiegeRegisterDefenderListener;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #19                 // Field defenderListeners:Ljava/util/List;
         4: aload_1
         5: invokeinterface #26,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 97: 0
        line 98: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/extensions/listener/manager/SiegeListenerManager;
            0      12     1 listener   Lext/mods/extensions/listener/siege/OnSiegeRegisterDefenderListener;

  public void unregisterDefenderListener(ext.mods.extensions.listener.siege.OnSiegeRegisterDefenderListener);
    descriptor: (Lext/mods/extensions/listener/siege/OnSiegeRegisterDefenderListener;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #19                 // Field defenderListeners:Ljava/util/List;
         4: aload_1
         5: invokeinterface #32,  2           // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 102: 0
        line 103: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/extensions/listener/manager/SiegeListenerManager;
            0      12     1 listener   Lext/mods/extensions/listener/siege/OnSiegeRegisterDefenderListener;

  public void notifyRegisterAttacker(ext.mods.gameserver.model.residence.castle.Siege, ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/residence/castle/Siege;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=6, args_size=3
         0: aload_0
         1: getfield      #16                 // Field attackerListeners:Ljava/util/List;
         4: invokeinterface #35,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore_3
        10: aload_3
        11: invokeinterface #39,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          52
        19: aload_3
        20: invokeinterface #45,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #63                 // class ext/mods/extensions/listener/siege/OnSiegeRegisterAttackerListener
        28: astore        4
        30: aload         4
        32: aload_1
        33: aload_2
        34: invokeinterface #65,  3           // InterfaceMethod ext/mods/extensions/listener/siege/OnSiegeRegisterAttackerListener.onRegisterAttacker:(Lext/mods/gameserver/model/residence/castle/Siege;Lext/mods/gameserver/model/actor/Player;)V
        39: goto          49
        42: astore        5
        44: aload         5
        46: invokevirtual #57                 // Method java/lang/Exception.printStackTrace:()V
        49: goto          10
        52: return
      Exception table:
         from    to  target type
            30    39    42   Class java/lang/Exception
      LineNumberTable:
        line 107: 0
        line 111: 30
        line 116: 39
        line 113: 42
        line 115: 44
        line 117: 49
        line 118: 52
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           44       5     5     e   Ljava/lang/Exception;
           30      19     4     l   Lext/mods/extensions/listener/siege/OnSiegeRegisterAttackerListener;
            0      53     0  this   Lext/mods/extensions/listener/manager/SiegeListenerManager;
            0      53     1 siege   Lext/mods/gameserver/model/residence/castle/Siege;
            0      53     2 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 4
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 255 /* full_frame */
          offset_delta = 31
          locals = [ class ext/mods/extensions/listener/manager/SiegeListenerManager, class ext/mods/gameserver/model/residence/castle/Siege, class ext/mods/gameserver/model/actor/Player, class java/util/Iterator, class ext/mods/extensions/listener/siege/OnSiegeRegisterAttackerListener ]
          stack = [ class java/lang/Exception ]
        frame_type = 250 /* chop */
          offset_delta = 6
        frame_type = 250 /* chop */
          offset_delta = 2

  public void notifyRegisterDefender(ext.mods.gameserver.model.residence.castle.Siege, ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/residence/castle/Siege;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=6, args_size=3
         0: aload_0
         1: getfield      #19                 // Field defenderListeners:Ljava/util/List;
         4: invokeinterface #35,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore_3
        10: aload_3
        11: invokeinterface #39,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          52
        19: aload_3
        20: invokeinterface #45,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #69                 // class ext/mods/extensions/listener/siege/OnSiegeRegisterDefenderListener
        28: astore        4
        30: aload         4
        32: aload_1
        33: aload_2
        34: invokeinterface #71,  3           // InterfaceMethod ext/mods/extensions/listener/siege/OnSiegeRegisterDefenderListener.onRegisterDefender:(Lext/mods/gameserver/model/residence/castle/Siege;Lext/mods/gameserver/model/actor/Player;)V
        39: goto          49
        42: astore        5
        44: aload         5
        46: invokevirtual #57                 // Method java/lang/Exception.printStackTrace:()V
        49: goto          10
        52: return
      Exception table:
         from    to  target type
            30    39    42   Class java/lang/Exception
      LineNumberTable:
        line 122: 0
        line 126: 30
        line 131: 39
        line 128: 42
        line 130: 44
        line 132: 49
        line 133: 52
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           44       5     5     e   Ljava/lang/Exception;
           30      19     4     l   Lext/mods/extensions/listener/siege/OnSiegeRegisterDefenderListener;
            0      53     0  this   Lext/mods/extensions/listener/manager/SiegeListenerManager;
            0      53     1 siege   Lext/mods/gameserver/model/residence/castle/Siege;
            0      53     2 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 4
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 255 /* full_frame */
          offset_delta = 31
          locals = [ class ext/mods/extensions/listener/manager/SiegeListenerManager, class ext/mods/gameserver/model/residence/castle/Siege, class ext/mods/gameserver/model/actor/Player, class java/util/Iterator, class ext/mods/extensions/listener/siege/OnSiegeRegisterDefenderListener ]
          stack = [ class java/lang/Exception ]
        frame_type = 250 /* chop */
          offset_delta = 6
        frame_type = 250 /* chop */
          offset_delta = 2

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: new           #11                 // class ext/mods/extensions/listener/manager/SiegeListenerManager
         3: dup
         4: invokespecial #74                 // Method "<init>":()V
         7: putstatic     #22                 // Field INSTANCE:Lext/mods/extensions/listener/manager/SiegeListenerManager;
        10: return
      LineNumberTable:
        line 31: 0
}
SourceFile: "SiegeListenerManager.java"
