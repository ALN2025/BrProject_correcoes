// Bytecode for: ext.mods.extensions.listener.manager.GameListenerManager
// File: ext\mods\extensions\listener\manager\GameListenerManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/extensions/listener/manager/GameListenerManager.class
  Last modified 9 de jul de 2026; size 3082 bytes
  MD5 checksum 14a9b4ea4f216d035f9a3187a95fa2a3
  Compiled from "GameListenerManager.java"
public class ext.mods.extensions.listener.manager.GameListenerManager
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/extensions/listener/manager/GameListenerManager
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 4, methods: 12, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Class              #8             // java/util/concurrent/CopyOnWriteArrayList
   #8 = Utf8               java/util/concurrent/CopyOnWriteArrayList
   #9 = Methodref          #7.#3          // java/util/concurrent/CopyOnWriteArrayList."<init>":()V
  #10 = Fieldref           #11.#12        // ext/mods/extensions/listener/manager/GameListenerManager.characterDeleteListeners:Ljava/util/List;
  #11 = Class              #13            // ext/mods/extensions/listener/manager/GameListenerManager
  #12 = NameAndType        #14:#15        // characterDeleteListeners:Ljava/util/List;
  #13 = Utf8               ext/mods/extensions/listener/manager/GameListenerManager
  #14 = Utf8               characterDeleteListeners
  #15 = Utf8               Ljava/util/List;
  #16 = Fieldref           #11.#17        // ext/mods/extensions/listener/manager/GameListenerManager.shutdownListeners:Ljava/util/List;
  #17 = NameAndType        #18:#15        // shutdownListeners:Ljava/util/List;
  #18 = Utf8               shutdownListeners
  #19 = Fieldref           #11.#20        // ext/mods/extensions/listener/manager/GameListenerManager.startListeners:Ljava/util/List;
  #20 = NameAndType        #21:#15        // startListeners:Ljava/util/List;
  #21 = Utf8               startListeners
  #22 = Fieldref           #11.#23        // ext/mods/extensions/listener/manager/GameListenerManager.INSTANCE:Lext/mods/extensions/listener/manager/GameListenerManager;
  #23 = NameAndType        #24:#25        // INSTANCE:Lext/mods/extensions/listener/manager/GameListenerManager;
  #24 = Utf8               INSTANCE
  #25 = Utf8               Lext/mods/extensions/listener/manager/GameListenerManager;
  #26 = InterfaceMethodref #27.#28        // java/util/List.add:(Ljava/lang/Object;)Z
  #27 = Class              #29            // java/util/List
  #28 = NameAndType        #30:#31        // add:(Ljava/lang/Object;)Z
  #29 = Utf8               java/util/List
  #30 = Utf8               add
  #31 = Utf8               (Ljava/lang/Object;)Z
  #32 = InterfaceMethodref #27.#33        // java/util/List.remove:(Ljava/lang/Object;)Z
  #33 = NameAndType        #34:#31        // remove:(Ljava/lang/Object;)Z
  #34 = Utf8               remove
  #35 = InterfaceMethodref #27.#36        // java/util/List.iterator:()Ljava/util/Iterator;
  #36 = NameAndType        #37:#38        // iterator:()Ljava/util/Iterator;
  #37 = Utf8               iterator
  #38 = Utf8               ()Ljava/util/Iterator;
  #39 = InterfaceMethodref #40.#41        // java/util/Iterator.hasNext:()Z
  #40 = Class              #42            // java/util/Iterator
  #41 = NameAndType        #43:#44        // hasNext:()Z
  #42 = Utf8               java/util/Iterator
  #43 = Utf8               hasNext
  #44 = Utf8               ()Z
  #45 = InterfaceMethodref #40.#46        // java/util/Iterator.next:()Ljava/lang/Object;
  #46 = NameAndType        #47:#48        // next:()Ljava/lang/Object;
  #47 = Utf8               next
  #48 = Utf8               ()Ljava/lang/Object;
  #49 = Class              #50            // ext/mods/extensions/listener/game/OnCharacterDeleteListener
  #50 = Utf8               ext/mods/extensions/listener/game/OnCharacterDeleteListener
  #51 = InterfaceMethodref #49.#52        // ext/mods/extensions/listener/game/OnCharacterDeleteListener.onCharacterDelete:(I)V
  #52 = NameAndType        #53:#54        // onCharacterDelete:(I)V
  #53 = Utf8               onCharacterDelete
  #54 = Utf8               (I)V
  #55 = Class              #56            // ext/mods/extensions/listener/game/OnShutdownListener
  #56 = Utf8               ext/mods/extensions/listener/game/OnShutdownListener
  #57 = InterfaceMethodref #55.#58        // ext/mods/extensions/listener/game/OnShutdownListener.onShutdown:()V
  #58 = NameAndType        #59:#6         // onShutdown:()V
  #59 = Utf8               onShutdown
  #60 = Class              #61            // ext/mods/extensions/listener/game/OnStartListener
  #61 = Utf8               ext/mods/extensions/listener/game/OnStartListener
  #62 = InterfaceMethodref #60.#63        // ext/mods/extensions/listener/game/OnStartListener.onStart:()V
  #63 = NameAndType        #64:#6         // onStart:()V
  #64 = Utf8               onStart
  #65 = Methodref          #11.#3         // ext/mods/extensions/listener/manager/GameListenerManager."<init>":()V
  #66 = Utf8               Signature
  #67 = Utf8               Ljava/util/List<Lext/mods/extensions/listener/game/OnCharacterDeleteListener;>;
  #68 = Utf8               Ljava/util/List<Lext/mods/extensions/listener/game/OnShutdownListener;>;
  #69 = Utf8               Ljava/util/List<Lext/mods/extensions/listener/game/OnStartListener;>;
  #70 = Utf8               Code
  #71 = Utf8               LineNumberTable
  #72 = Utf8               LocalVariableTable
  #73 = Utf8               this
  #74 = Utf8               getInstance
  #75 = Utf8               ()Lext/mods/extensions/listener/manager/GameListenerManager;
  #76 = Utf8               registerCharacterDeleteListener
  #77 = Utf8               (Lext/mods/extensions/listener/game/OnCharacterDeleteListener;)V
  #78 = Utf8               listener
  #79 = Utf8               Lext/mods/extensions/listener/game/OnCharacterDeleteListener;
  #80 = Utf8               unregisterCharacterDeleteListener
  #81 = Utf8               registerShutdownListener
  #82 = Utf8               (Lext/mods/extensions/listener/game/OnShutdownListener;)V
  #83 = Utf8               Lext/mods/extensions/listener/game/OnShutdownListener;
  #84 = Utf8               unregisterShutdownListener
  #85 = Utf8               registerStartListener
  #86 = Utf8               (Lext/mods/extensions/listener/game/OnStartListener;)V
  #87 = Utf8               Lext/mods/extensions/listener/game/OnStartListener;
  #88 = Utf8               unregisterStartListener
  #89 = Utf8               notifyCharacterDelete
  #90 = Utf8               objectId
  #91 = Utf8               I
  #92 = Utf8               StackMapTable
  #93 = Utf8               notifyShutdown
  #94 = Utf8               notifyStart
  #95 = Utf8               <clinit>
  #96 = Utf8               SourceFile
  #97 = Utf8               GameListenerManager.java
{
  public static ext.mods.extensions.listener.manager.GameListenerManager getInstance();
    descriptor: ()Lext/mods/extensions/listener/manager/GameListenerManager;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #22                 // Field INSTANCE:Lext/mods/extensions/listener/manager/GameListenerManager;
         3: areturn
      LineNumberTable:
        line 41: 0

  public void registerCharacterDeleteListener(ext.mods.extensions.listener.game.OnCharacterDeleteListener);
    descriptor: (Lext/mods/extensions/listener/game/OnCharacterDeleteListener;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field characterDeleteListeners:Ljava/util/List;
         4: aload_1
         5: invokeinterface #26,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 46: 0
        line 47: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/extensions/listener/manager/GameListenerManager;
            0      12     1 listener   Lext/mods/extensions/listener/game/OnCharacterDeleteListener;

  public void unregisterCharacterDeleteListener(ext.mods.extensions.listener.game.OnCharacterDeleteListener);
    descriptor: (Lext/mods/extensions/listener/game/OnCharacterDeleteListener;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field characterDeleteListeners:Ljava/util/List;
         4: aload_1
         5: invokeinterface #32,  2           // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 51: 0
        line 52: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/extensions/listener/manager/GameListenerManager;
            0      12     1 listener   Lext/mods/extensions/listener/game/OnCharacterDeleteListener;

  public void registerShutdownListener(ext.mods.extensions.listener.game.OnShutdownListener);
    descriptor: (Lext/mods/extensions/listener/game/OnShutdownListener;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #16                 // Field shutdownListeners:Ljava/util/List;
         4: aload_1
         5: invokeinterface #26,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 56: 0
        line 57: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/extensions/listener/manager/GameListenerManager;
            0      12     1 listener   Lext/mods/extensions/listener/game/OnShutdownListener;

  public void unregisterShutdownListener(ext.mods.extensions.listener.game.OnShutdownListener);
    descriptor: (Lext/mods/extensions/listener/game/OnShutdownListener;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #16                 // Field shutdownListeners:Ljava/util/List;
         4: aload_1
         5: invokeinterface #32,  2           // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 61: 0
        line 62: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/extensions/listener/manager/GameListenerManager;
            0      12     1 listener   Lext/mods/extensions/listener/game/OnShutdownListener;

  public void registerStartListener(ext.mods.extensions.listener.game.OnStartListener);
    descriptor: (Lext/mods/extensions/listener/game/OnStartListener;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #19                 // Field startListeners:Ljava/util/List;
         4: aload_1
         5: invokeinterface #26,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 66: 0
        line 67: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/extensions/listener/manager/GameListenerManager;
            0      12     1 listener   Lext/mods/extensions/listener/game/OnStartListener;

  public void unregisterStartListener(ext.mods.extensions.listener.game.OnStartListener);
    descriptor: (Lext/mods/extensions/listener/game/OnStartListener;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #19                 // Field startListeners:Ljava/util/List;
         4: aload_1
         5: invokeinterface #32,  2           // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 71: 0
        line 72: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/extensions/listener/manager/GameListenerManager;
            0      12     1 listener   Lext/mods/extensions/listener/game/OnStartListener;

  public void notifyCharacterDelete(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=2
         0: aload_0
         1: getfield      #10                 // Field characterDeleteListeners:Ljava/util/List;
         4: invokeinterface #35,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore_2
        10: aload_2
        11: invokeinterface #39,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          39
        19: aload_2
        20: invokeinterface #45,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #49                 // class ext/mods/extensions/listener/game/OnCharacterDeleteListener
        28: astore_3
        29: aload_3
        30: iload_1
        31: invokeinterface #51,  2           // InterfaceMethod ext/mods/extensions/listener/game/OnCharacterDeleteListener.onCharacterDelete:(I)V
        36: goto          10
        39: return
      LineNumberTable:
        line 76: 0
        line 78: 29
        line 79: 36
        line 80: 39
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           29       7     3 listener   Lext/mods/extensions/listener/game/OnCharacterDeleteListener;
            0      40     0  this   Lext/mods/extensions/listener/manager/GameListenerManager;
            0      40     1 objectId   I
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 28

  public void notifyShutdown();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=3, args_size=1
         0: aload_0
         1: getfield      #16                 // Field shutdownListeners:Ljava/util/List;
         4: invokeinterface #35,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore_1
        10: aload_1
        11: invokeinterface #39,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          38
        19: aload_1
        20: invokeinterface #45,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #55                 // class ext/mods/extensions/listener/game/OnShutdownListener
        28: astore_2
        29: aload_2
        30: invokeinterface #57,  1           // InterfaceMethod ext/mods/extensions/listener/game/OnShutdownListener.onShutdown:()V
        35: goto          10
        38: return
      LineNumberTable:
        line 84: 0
        line 86: 29
        line 87: 35
        line 88: 38
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           29       6     2 listener   Lext/mods/extensions/listener/game/OnShutdownListener;
            0      39     0  this   Lext/mods/extensions/listener/manager/GameListenerManager;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 27

  public void notifyStart();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=3, args_size=1
         0: aload_0
         1: getfield      #19                 // Field startListeners:Ljava/util/List;
         4: invokeinterface #35,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore_1
        10: aload_1
        11: invokeinterface #39,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          38
        19: aload_1
        20: invokeinterface #45,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #60                 // class ext/mods/extensions/listener/game/OnStartListener
        28: astore_2
        29: aload_2
        30: invokeinterface #62,  1           // InterfaceMethod ext/mods/extensions/listener/game/OnStartListener.onStart:()V
        35: goto          10
        38: return
      LineNumberTable:
        line 92: 0
        line 94: 29
        line 95: 35
        line 96: 38
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           29       6     2 listener   Lext/mods/extensions/listener/game/OnStartListener;
            0      39     0  this   Lext/mods/extensions/listener/manager/GameListenerManager;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 27

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: new           #11                 // class ext/mods/extensions/listener/manager/GameListenerManager
         3: dup
         4: invokespecial #65                 // Method "<init>":()V
         7: putstatic     #22                 // Field INSTANCE:Lext/mods/extensions/listener/manager/GameListenerManager;
        10: return
      LineNumberTable:
        line 29: 0
}
SourceFile: "GameListenerManager.java"
