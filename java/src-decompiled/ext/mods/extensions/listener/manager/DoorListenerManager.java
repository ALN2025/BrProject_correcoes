// Bytecode for: ext.mods.extensions.listener.manager.DoorListenerManager
// File: ext\mods\extensions\listener\manager\DoorListenerManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/extensions/listener/manager/DoorListenerManager.class
  Last modified 9 de jul de 2026; size 1934 bytes
  MD5 checksum 9f9abd9db84dbad9178a2f7025073156
  Compiled from "DoorListenerManager.java"
public class ext.mods.extensions.listener.manager.DoorListenerManager
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/extensions/listener/manager/DoorListenerManager
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 2, methods: 7, attributes: 1
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
  #10 = Fieldref           #11.#12        // ext/mods/extensions/listener/manager/DoorListenerManager.openCloseListeners:Ljava/util/List;
  #11 = Class              #13            // ext/mods/extensions/listener/manager/DoorListenerManager
  #12 = NameAndType        #14:#15        // openCloseListeners:Ljava/util/List;
  #13 = Utf8               ext/mods/extensions/listener/manager/DoorListenerManager
  #14 = Utf8               openCloseListeners
  #15 = Utf8               Ljava/util/List;
  #16 = Fieldref           #11.#17        // ext/mods/extensions/listener/manager/DoorListenerManager.INSTANCE:Lext/mods/extensions/listener/manager/DoorListenerManager;
  #17 = NameAndType        #18:#19        // INSTANCE:Lext/mods/extensions/listener/manager/DoorListenerManager;
  #18 = Utf8               INSTANCE
  #19 = Utf8               Lext/mods/extensions/listener/manager/DoorListenerManager;
  #20 = InterfaceMethodref #21.#22        // java/util/List.add:(Ljava/lang/Object;)Z
  #21 = Class              #23            // java/util/List
  #22 = NameAndType        #24:#25        // add:(Ljava/lang/Object;)Z
  #23 = Utf8               java/util/List
  #24 = Utf8               add
  #25 = Utf8               (Ljava/lang/Object;)Z
  #26 = InterfaceMethodref #21.#27        // java/util/List.remove:(Ljava/lang/Object;)Z
  #27 = NameAndType        #28:#25        // remove:(Ljava/lang/Object;)Z
  #28 = Utf8               remove
  #29 = InterfaceMethodref #21.#30        // java/util/List.iterator:()Ljava/util/Iterator;
  #30 = NameAndType        #31:#32        // iterator:()Ljava/util/Iterator;
  #31 = Utf8               iterator
  #32 = Utf8               ()Ljava/util/Iterator;
  #33 = InterfaceMethodref #34.#35        // java/util/Iterator.hasNext:()Z
  #34 = Class              #36            // java/util/Iterator
  #35 = NameAndType        #37:#38        // hasNext:()Z
  #36 = Utf8               java/util/Iterator
  #37 = Utf8               hasNext
  #38 = Utf8               ()Z
  #39 = InterfaceMethodref #34.#40        // java/util/Iterator.next:()Ljava/lang/Object;
  #40 = NameAndType        #41:#42        // next:()Ljava/lang/Object;
  #41 = Utf8               next
  #42 = Utf8               ()Ljava/lang/Object;
  #43 = Class              #44            // ext/mods/extensions/listener/actor/door/OnOpenCloseListener
  #44 = Utf8               ext/mods/extensions/listener/actor/door/OnOpenCloseListener
  #45 = InterfaceMethodref #43.#46        // ext/mods/extensions/listener/actor/door/OnOpenCloseListener.onOpen:(Lext/mods/gameserver/model/actor/instance/Door;)V
  #46 = NameAndType        #47:#48        // onOpen:(Lext/mods/gameserver/model/actor/instance/Door;)V
  #47 = Utf8               onOpen
  #48 = Utf8               (Lext/mods/gameserver/model/actor/instance/Door;)V
  #49 = InterfaceMethodref #43.#50        // ext/mods/extensions/listener/actor/door/OnOpenCloseListener.onClose:(Lext/mods/gameserver/model/actor/instance/Door;)V
  #50 = NameAndType        #51:#48        // onClose:(Lext/mods/gameserver/model/actor/instance/Door;)V
  #51 = Utf8               onClose
  #52 = Methodref          #11.#3         // ext/mods/extensions/listener/manager/DoorListenerManager."<init>":()V
  #53 = Utf8               Signature
  #54 = Utf8               Ljava/util/List<Lext/mods/extensions/listener/actor/door/OnOpenCloseListener;>;
  #55 = Utf8               Code
  #56 = Utf8               LineNumberTable
  #57 = Utf8               LocalVariableTable
  #58 = Utf8               this
  #59 = Utf8               getInstance
  #60 = Utf8               ()Lext/mods/extensions/listener/manager/DoorListenerManager;
  #61 = Utf8               registerOpenCloseListener
  #62 = Utf8               (Lext/mods/extensions/listener/actor/door/OnOpenCloseListener;)V
  #63 = Utf8               listener
  #64 = Utf8               Lext/mods/extensions/listener/actor/door/OnOpenCloseListener;
  #65 = Utf8               unregisterOpenCloseListener
  #66 = Utf8               notifyDoorOpen
  #67 = Utf8               door
  #68 = Utf8               Lext/mods/gameserver/model/actor/instance/Door;
  #69 = Utf8               StackMapTable
  #70 = Utf8               notifyDoorClose
  #71 = Utf8               <clinit>
  #72 = Utf8               SourceFile
  #73 = Utf8               DoorListenerManager.java
{
  public static ext.mods.extensions.listener.manager.DoorListenerManager getInstance();
    descriptor: ()Lext/mods/extensions/listener/manager/DoorListenerManager;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #16                 // Field INSTANCE:Lext/mods/extensions/listener/manager/DoorListenerManager;
         3: areturn
      LineNumberTable:
        line 38: 0

  public void registerOpenCloseListener(ext.mods.extensions.listener.actor.door.OnOpenCloseListener);
    descriptor: (Lext/mods/extensions/listener/actor/door/OnOpenCloseListener;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field openCloseListeners:Ljava/util/List;
         4: aload_1
         5: invokeinterface #20,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 43: 0
        line 44: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/extensions/listener/manager/DoorListenerManager;
            0      12     1 listener   Lext/mods/extensions/listener/actor/door/OnOpenCloseListener;

  public void unregisterOpenCloseListener(ext.mods.extensions.listener.actor.door.OnOpenCloseListener);
    descriptor: (Lext/mods/extensions/listener/actor/door/OnOpenCloseListener;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field openCloseListeners:Ljava/util/List;
         4: aload_1
         5: invokeinterface #26,  2           // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 48: 0
        line 49: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/extensions/listener/manager/DoorListenerManager;
            0      12     1 listener   Lext/mods/extensions/listener/actor/door/OnOpenCloseListener;

  public void notifyDoorOpen(ext.mods.gameserver.model.actor.instance.Door);
    descriptor: (Lext/mods/gameserver/model/actor/instance/Door;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=2
         0: aload_0
         1: getfield      #10                 // Field openCloseListeners:Ljava/util/List;
         4: invokeinterface #29,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore_2
        10: aload_2
        11: invokeinterface #33,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          39
        19: aload_2
        20: invokeinterface #39,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #43                 // class ext/mods/extensions/listener/actor/door/OnOpenCloseListener
        28: astore_3
        29: aload_3
        30: aload_1
        31: invokeinterface #45,  2           // InterfaceMethod ext/mods/extensions/listener/actor/door/OnOpenCloseListener.onOpen:(Lext/mods/gameserver/model/actor/instance/Door;)V
        36: goto          10
        39: return
      LineNumberTable:
        line 53: 0
        line 55: 29
        line 56: 36
        line 57: 39
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           29       7     3 listener   Lext/mods/extensions/listener/actor/door/OnOpenCloseListener;
            0      40     0  this   Lext/mods/extensions/listener/manager/DoorListenerManager;
            0      40     1  door   Lext/mods/gameserver/model/actor/instance/Door;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 28

  public void notifyDoorClose(ext.mods.gameserver.model.actor.instance.Door);
    descriptor: (Lext/mods/gameserver/model/actor/instance/Door;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=2
         0: aload_0
         1: getfield      #10                 // Field openCloseListeners:Ljava/util/List;
         4: invokeinterface #29,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore_2
        10: aload_2
        11: invokeinterface #33,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          39
        19: aload_2
        20: invokeinterface #39,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #43                 // class ext/mods/extensions/listener/actor/door/OnOpenCloseListener
        28: astore_3
        29: aload_3
        30: aload_1
        31: invokeinterface #49,  2           // InterfaceMethod ext/mods/extensions/listener/actor/door/OnOpenCloseListener.onClose:(Lext/mods/gameserver/model/actor/instance/Door;)V
        36: goto          10
        39: return
      LineNumberTable:
        line 61: 0
        line 63: 29
        line 64: 36
        line 65: 39
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           29       7     3 listener   Lext/mods/extensions/listener/actor/door/OnOpenCloseListener;
            0      40     0  this   Lext/mods/extensions/listener/manager/DoorListenerManager;
            0      40     1  door   Lext/mods/gameserver/model/actor/instance/Door;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 28

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: new           #11                 // class ext/mods/extensions/listener/manager/DoorListenerManager
         3: dup
         4: invokespecial #52                 // Method "<init>":()V
         7: putstatic     #16                 // Field INSTANCE:Lext/mods/extensions/listener/manager/DoorListenerManager;
        10: return
      LineNumberTable:
        line 28: 0
}
SourceFile: "DoorListenerManager.java"
