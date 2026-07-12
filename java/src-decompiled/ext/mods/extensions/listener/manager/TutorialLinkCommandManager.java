// Bytecode for: ext.mods.extensions.listener.manager.TutorialLinkCommandManager
// File: ext\mods\extensions\listener\manager\TutorialLinkCommandManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/extensions/listener/manager/TutorialLinkCommandManager.class
  Last modified 9 de jul de 2026; size 1803 bytes
  MD5 checksum a6c5746d66021f72cf80af43ee7069ff
  Compiled from "TutorialLinkCommandManager.java"
public class ext.mods.extensions.listener.manager.TutorialLinkCommandManager
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/extensions/listener/manager/TutorialLinkCommandManager
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 2, methods: 6, attributes: 1
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
  #10 = Fieldref           #11.#12        // ext/mods/extensions/listener/manager/TutorialLinkCommandManager.listeners:Ljava/util/List;
  #11 = Class              #13            // ext/mods/extensions/listener/manager/TutorialLinkCommandManager
  #12 = NameAndType        #14:#15        // listeners:Ljava/util/List;
  #13 = Utf8               ext/mods/extensions/listener/manager/TutorialLinkCommandManager
  #14 = Utf8               listeners
  #15 = Utf8               Ljava/util/List;
  #16 = Fieldref           #11.#17        // ext/mods/extensions/listener/manager/TutorialLinkCommandManager.INSTANCE:Lext/mods/extensions/listener/manager/TutorialLinkCommandManager;
  #17 = NameAndType        #18:#19        // INSTANCE:Lext/mods/extensions/listener/manager/TutorialLinkCommandManager;
  #18 = Utf8               INSTANCE
  #19 = Utf8               Lext/mods/extensions/listener/manager/TutorialLinkCommandManager;
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
  #43 = Class              #44            // ext/mods/extensions/listener/command/OnTutorialLinkListener
  #44 = Utf8               ext/mods/extensions/listener/command/OnTutorialLinkListener
  #45 = InterfaceMethodref #43.#46        // ext/mods/extensions/listener/command/OnTutorialLinkListener.onBypass:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
  #46 = NameAndType        #47:#48        // onBypass:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
  #47 = Utf8               onBypass
  #48 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
  #49 = Methodref          #11.#3         // ext/mods/extensions/listener/manager/TutorialLinkCommandManager."<init>":()V
  #50 = Utf8               Signature
  #51 = Utf8               Ljava/util/List<Lext/mods/extensions/listener/command/OnTutorialLinkListener;>;
  #52 = Utf8               Code
  #53 = Utf8               LineNumberTable
  #54 = Utf8               LocalVariableTable
  #55 = Utf8               this
  #56 = Utf8               getInstance
  #57 = Utf8               ()Lext/mods/extensions/listener/manager/TutorialLinkCommandManager;
  #58 = Utf8               registerListener
  #59 = Utf8               (Lext/mods/extensions/listener/command/OnTutorialLinkListener;)V
  #60 = Utf8               listener
  #61 = Utf8               Lext/mods/extensions/listener/command/OnTutorialLinkListener;
  #62 = Utf8               unregisterListener
  #63 = Utf8               notify
  #64 = Utf8               player
  #65 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #66 = Utf8               command
  #67 = Utf8               Ljava/lang/String;
  #68 = Utf8               StackMapTable
  #69 = Utf8               <clinit>
  #70 = Utf8               SourceFile
  #71 = Utf8               TutorialLinkCommandManager.java
{
  public ext.mods.extensions.listener.manager.TutorialLinkCommandManager();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/concurrent/CopyOnWriteArrayList
         8: dup
         9: invokespecial #9                  // Method java/util/concurrent/CopyOnWriteArrayList."<init>":()V
        12: putfield      #10                 // Field listeners:Ljava/util/List;
        15: return
      LineNumberTable:
        line 26: 0
        line 30: 4
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/extensions/listener/manager/TutorialLinkCommandManager;

  public static ext.mods.extensions.listener.manager.TutorialLinkCommandManager getInstance();
    descriptor: ()Lext/mods/extensions/listener/manager/TutorialLinkCommandManager;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #16                 // Field INSTANCE:Lext/mods/extensions/listener/manager/TutorialLinkCommandManager;
         3: areturn
      LineNumberTable:
        line 34: 0

  public void registerListener(ext.mods.extensions.listener.command.OnTutorialLinkListener);
    descriptor: (Lext/mods/extensions/listener/command/OnTutorialLinkListener;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field listeners:Ljava/util/List;
         4: aload_1
         5: invokeinterface #20,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 39: 0
        line 40: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/extensions/listener/manager/TutorialLinkCommandManager;
            0      12     1 listener   Lext/mods/extensions/listener/command/OnTutorialLinkListener;

  public void unregisterListener(ext.mods.extensions.listener.command.OnTutorialLinkListener);
    descriptor: (Lext/mods/extensions/listener/command/OnTutorialLinkListener;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field listeners:Ljava/util/List;
         4: aload_1
         5: invokeinterface #26,  2           // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 44: 0
        line 45: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/extensions/listener/manager/TutorialLinkCommandManager;
            0      12     1 listener   Lext/mods/extensions/listener/command/OnTutorialLinkListener;

  public boolean notify(ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=3
         0: aload_0
         1: getfield      #10                 // Field listeners:Ljava/util/List;
         4: invokeinterface #29,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore_3
        10: aload_3
        11: invokeinterface #33,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          47
        19: aload_3
        20: invokeinterface #39,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #43                 // class ext/mods/extensions/listener/command/OnTutorialLinkListener
        28: astore        4
        30: aload         4
        32: aload_1
        33: aload_2
        34: invokeinterface #45,  3           // InterfaceMethod ext/mods/extensions/listener/command/OnTutorialLinkListener.onBypass:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
        39: ifeq          44
        42: iconst_1
        43: ireturn
        44: goto          10
        47: iconst_0
        48: ireturn
      LineNumberTable:
        line 49: 0
        line 51: 30
        line 53: 42
        line 55: 44
        line 56: 47
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           30      14     4 listener   Lext/mods/extensions/listener/command/OnTutorialLinkListener;
            0      49     0  this   Lext/mods/extensions/listener/manager/TutorialLinkCommandManager;
            0      49     1 player   Lext/mods/gameserver/model/actor/Player;
            0      49     2 command   Ljava/lang/String;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 33 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: new           #11                 // class ext/mods/extensions/listener/manager/TutorialLinkCommandManager
         3: dup
         4: invokespecial #49                 // Method "<init>":()V
         7: putstatic     #16                 // Field INSTANCE:Lext/mods/extensions/listener/manager/TutorialLinkCommandManager;
        10: return
      LineNumberTable:
        line 28: 0
}
SourceFile: "TutorialLinkCommandManager.java"
