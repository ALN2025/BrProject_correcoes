// Bytecode for: ext.mods.extensions.listener.manager.ZoneListenerManager
// File: ext\mods\extensions\listener\manager\ZoneListenerManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/extensions/listener/manager/ZoneListenerManager.class
  Last modified 9 de jul de 2026; size 3143 bytes
  MD5 checksum ae216433f93fcc17cd6054a333cbdf0b
  Compiled from "ZoneListenerManager.java"
public class ext.mods.extensions.listener.manager.ZoneListenerManager
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/extensions/listener/manager/ZoneListenerManager
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 2, methods: 7, attributes: 3
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
   #10 = Fieldref           #11.#12       // ext/mods/extensions/listener/manager/ZoneListenerManager.zoneListeners:Ljava/util/List;
   #11 = Class              #13           // ext/mods/extensions/listener/manager/ZoneListenerManager
   #12 = NameAndType        #14:#15       // zoneListeners:Ljava/util/List;
   #13 = Utf8               ext/mods/extensions/listener/manager/ZoneListenerManager
   #14 = Utf8               zoneListeners
   #15 = Utf8               Ljava/util/List;
   #16 = Fieldref           #11.#17       // ext/mods/extensions/listener/manager/ZoneListenerManager.INSTANCE:Lext/mods/extensions/listener/manager/ZoneListenerManager;
   #17 = NameAndType        #18:#19       // INSTANCE:Lext/mods/extensions/listener/manager/ZoneListenerManager;
   #18 = Utf8               INSTANCE
   #19 = Utf8               Lext/mods/extensions/listener/manager/ZoneListenerManager;
   #20 = InterfaceMethodref #21.#22       // java/util/List.add:(Ljava/lang/Object;)Z
   #21 = Class              #23           // java/util/List
   #22 = NameAndType        #24:#25       // add:(Ljava/lang/Object;)Z
   #23 = Utf8               java/util/List
   #24 = Utf8               add
   #25 = Utf8               (Ljava/lang/Object;)Z
   #26 = InterfaceMethodref #21.#27       // java/util/List.remove:(Ljava/lang/Object;)Z
   #27 = NameAndType        #28:#25       // remove:(Ljava/lang/Object;)Z
   #28 = Utf8               remove
   #29 = InterfaceMethodref #21.#30       // java/util/List.iterator:()Ljava/util/Iterator;
   #30 = NameAndType        #31:#32       // iterator:()Ljava/util/Iterator;
   #31 = Utf8               iterator
   #32 = Utf8               ()Ljava/util/Iterator;
   #33 = InterfaceMethodref #34.#35       // java/util/Iterator.hasNext:()Z
   #34 = Class              #36           // java/util/Iterator
   #35 = NameAndType        #37:#38       // hasNext:()Z
   #36 = Utf8               java/util/Iterator
   #37 = Utf8               hasNext
   #38 = Utf8               ()Z
   #39 = InterfaceMethodref #34.#40       // java/util/Iterator.next:()Ljava/lang/Object;
   #40 = NameAndType        #41:#42       // next:()Ljava/lang/Object;
   #41 = Utf8               next
   #42 = Utf8               ()Ljava/lang/Object;
   #43 = Class              #44           // ext/mods/extensions/listener/zone/OnZoneEnterLeaveListener
   #44 = Utf8               ext/mods/extensions/listener/zone/OnZoneEnterLeaveListener
   #45 = InterfaceMethodref #43.#46       // ext/mods/extensions/listener/zone/OnZoneEnterLeaveListener.onZoneEnter:(Lext/mods/gameserver/model/zone/type/subtype/ZoneType;Lext/mods/gameserver/model/actor/Creature;)V
   #46 = NameAndType        #47:#48       // onZoneEnter:(Lext/mods/gameserver/model/zone/type/subtype/ZoneType;Lext/mods/gameserver/model/actor/Creature;)V
   #47 = Utf8               onZoneEnter
   #48 = Utf8               (Lext/mods/gameserver/model/zone/type/subtype/ZoneType;Lext/mods/gameserver/model/actor/Creature;)V
   #49 = Class              #50           // java/lang/Exception
   #50 = Utf8               java/lang/Exception
   #51 = Fieldref           #52.#53       // java/lang/System.err:Ljava/io/PrintStream;
   #52 = Class              #54           // java/lang/System
   #53 = NameAndType        #55:#56       // err:Ljava/io/PrintStream;
   #54 = Utf8               java/lang/System
   #55 = Utf8               err
   #56 = Utf8               Ljava/io/PrintStream;
   #57 = Methodref          #49.#58       // java/lang/Exception.getMessage:()Ljava/lang/String;
   #58 = NameAndType        #59:#60       // getMessage:()Ljava/lang/String;
   #59 = Utf8               getMessage
   #60 = Utf8               ()Ljava/lang/String;
   #61 = InvokeDynamic      #0:#62        // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #62 = NameAndType        #63:#64       // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #63 = Utf8               makeConcatWithConstants
   #64 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #65 = Methodref          #66.#67       // java/io/PrintStream.println:(Ljava/lang/String;)V
   #66 = Class              #68           // java/io/PrintStream
   #67 = NameAndType        #69:#70       // println:(Ljava/lang/String;)V
   #68 = Utf8               java/io/PrintStream
   #69 = Utf8               println
   #70 = Utf8               (Ljava/lang/String;)V
   #71 = Methodref          #49.#72       // java/lang/Exception.printStackTrace:()V
   #72 = NameAndType        #73:#6        // printStackTrace:()V
   #73 = Utf8               printStackTrace
   #74 = InterfaceMethodref #43.#75       // ext/mods/extensions/listener/zone/OnZoneEnterLeaveListener.onZoneLeave:(Lext/mods/gameserver/model/zone/type/subtype/ZoneType;Lext/mods/gameserver/model/actor/Creature;)V
   #75 = NameAndType        #76:#48       // onZoneLeave:(Lext/mods/gameserver/model/zone/type/subtype/ZoneType;Lext/mods/gameserver/model/actor/Creature;)V
   #76 = Utf8               onZoneLeave
   #77 = InvokeDynamic      #1:#62        // #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #78 = Methodref          #11.#3        // ext/mods/extensions/listener/manager/ZoneListenerManager."<init>":()V
   #79 = Utf8               Signature
   #80 = Utf8               Ljava/util/List<Lext/mods/extensions/listener/zone/OnZoneEnterLeaveListener;>;
   #81 = Utf8               Code
   #82 = Utf8               LineNumberTable
   #83 = Utf8               LocalVariableTable
   #84 = Utf8               this
   #85 = Utf8               getInstance
   #86 = Utf8               ()Lext/mods/extensions/listener/manager/ZoneListenerManager;
   #87 = Utf8               addZoneListener
   #88 = Utf8               (Lext/mods/extensions/listener/zone/OnZoneEnterLeaveListener;)V
   #89 = Utf8               listener
   #90 = Utf8               Lext/mods/extensions/listener/zone/OnZoneEnterLeaveListener;
   #91 = Utf8               removeZoneListener
   #92 = Utf8               notifyZoneEnter
   #93 = Utf8               e
   #94 = Utf8               Ljava/lang/Exception;
   #95 = Utf8               zone
   #96 = Utf8               Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
   #97 = Utf8               creature
   #98 = Utf8               Lext/mods/gameserver/model/actor/Creature;
   #99 = Utf8               StackMapTable
  #100 = Class              #101          // ext/mods/gameserver/model/zone/type/subtype/ZoneType
  #101 = Utf8               ext/mods/gameserver/model/zone/type/subtype/ZoneType
  #102 = Class              #103          // ext/mods/gameserver/model/actor/Creature
  #103 = Utf8               ext/mods/gameserver/model/actor/Creature
  #104 = Utf8               notifyZoneLeave
  #105 = Utf8               <clinit>
  #106 = Utf8               SourceFile
  #107 = Utf8               ZoneListenerManager.java
  #108 = Utf8               BootstrapMethods
  #109 = String             #110          // [ZoneListenerManager] Erro no onZoneEnter: \u0001
  #110 = Utf8               [ZoneListenerManager] Erro no onZoneEnter: \u0001
  #111 = String             #112          // [ZoneListenerManager] Erro no onZoneLeave: \u0001
  #112 = Utf8               [ZoneListenerManager] Erro no onZoneLeave: \u0001
  #113 = MethodHandle       6:#114        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #114 = Methodref          #115.#116     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #115 = Class              #117          // java/lang/invoke/StringConcatFactory
  #116 = NameAndType        #63:#118      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #117 = Utf8               java/lang/invoke/StringConcatFactory
  #118 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #119 = Utf8               InnerClasses
  #120 = Class              #121          // java/lang/invoke/MethodHandles$Lookup
  #121 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #122 = Class              #123          // java/lang/invoke/MethodHandles
  #123 = Utf8               java/lang/invoke/MethodHandles
  #124 = Utf8               Lookup
{
  public static ext.mods.extensions.listener.manager.ZoneListenerManager getInstance();
    descriptor: ()Lext/mods/extensions/listener/manager/ZoneListenerManager;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #16                 // Field INSTANCE:Lext/mods/extensions/listener/manager/ZoneListenerManager;
         3: areturn
      LineNumberTable:
        line 39: 0

  public void addZoneListener(ext.mods.extensions.listener.zone.OnZoneEnterLeaveListener);
    descriptor: (Lext/mods/extensions/listener/zone/OnZoneEnterLeaveListener;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field zoneListeners:Ljava/util/List;
         4: aload_1
         5: invokeinterface #20,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 44: 0
        line 45: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/extensions/listener/manager/ZoneListenerManager;
            0      12     1 listener   Lext/mods/extensions/listener/zone/OnZoneEnterLeaveListener;

  public void removeZoneListener(ext.mods.extensions.listener.zone.OnZoneEnterLeaveListener);
    descriptor: (Lext/mods/extensions/listener/zone/OnZoneEnterLeaveListener;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field zoneListeners:Ljava/util/List;
         4: aload_1
         5: invokeinterface #26,  2           // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 49: 0
        line 50: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/extensions/listener/manager/ZoneListenerManager;
            0      12     1 listener   Lext/mods/extensions/listener/zone/OnZoneEnterLeaveListener;

  public void notifyZoneEnter(ext.mods.gameserver.model.zone.type.subtype.ZoneType, ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/zone/type/subtype/ZoneType;Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=6, args_size=3
         0: aload_0
         1: getfield      #10                 // Field zoneListeners:Ljava/util/List;
         4: invokeinterface #29,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore_3
        10: aload_3
        11: invokeinterface #33,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          68
        19: aload_3
        20: invokeinterface #39,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #43                 // class ext/mods/extensions/listener/zone/OnZoneEnterLeaveListener
        28: astore        4
        30: aload         4
        32: aload_1
        33: aload_2
        34: invokeinterface #45,  3           // InterfaceMethod ext/mods/extensions/listener/zone/OnZoneEnterLeaveListener.onZoneEnter:(Lext/mods/gameserver/model/zone/type/subtype/ZoneType;Lext/mods/gameserver/model/actor/Creature;)V
        39: goto          65
        42: astore        5
        44: getstatic     #51                 // Field java/lang/System.err:Ljava/io/PrintStream;
        47: aload         5
        49: invokevirtual #57                 // Method java/lang/Exception.getMessage:()Ljava/lang/String;
        52: invokedynamic #61,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        57: invokevirtual #65                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        60: aload         5
        62: invokevirtual #71                 // Method java/lang/Exception.printStackTrace:()V
        65: goto          10
        68: return
      Exception table:
         from    to  target type
            30    39    42   Class java/lang/Exception
      LineNumberTable:
        line 54: 0
        line 58: 30
        line 64: 39
        line 60: 42
        line 62: 44
        line 63: 60
        line 65: 65
        line 66: 68
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           44      21     5     e   Ljava/lang/Exception;
           30      35     4 listener   Lext/mods/extensions/listener/zone/OnZoneEnterLeaveListener;
            0      69     0  this   Lext/mods/extensions/listener/manager/ZoneListenerManager;
            0      69     1  zone   Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
            0      69     2 creature   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 4
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 255 /* full_frame */
          offset_delta = 31
          locals = [ class ext/mods/extensions/listener/manager/ZoneListenerManager, class ext/mods/gameserver/model/zone/type/subtype/ZoneType, class ext/mods/gameserver/model/actor/Creature, class java/util/Iterator, class ext/mods/extensions/listener/zone/OnZoneEnterLeaveListener ]
          stack = [ class java/lang/Exception ]
        frame_type = 250 /* chop */
          offset_delta = 22
        frame_type = 250 /* chop */
          offset_delta = 2

  public void notifyZoneLeave(ext.mods.gameserver.model.zone.type.subtype.ZoneType, ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/zone/type/subtype/ZoneType;Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=6, args_size=3
         0: aload_0
         1: getfield      #10                 // Field zoneListeners:Ljava/util/List;
         4: invokeinterface #29,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore_3
        10: aload_3
        11: invokeinterface #33,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          68
        19: aload_3
        20: invokeinterface #39,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #43                 // class ext/mods/extensions/listener/zone/OnZoneEnterLeaveListener
        28: astore        4
        30: aload         4
        32: aload_1
        33: aload_2
        34: invokeinterface #74,  3           // InterfaceMethod ext/mods/extensions/listener/zone/OnZoneEnterLeaveListener.onZoneLeave:(Lext/mods/gameserver/model/zone/type/subtype/ZoneType;Lext/mods/gameserver/model/actor/Creature;)V
        39: goto          65
        42: astore        5
        44: getstatic     #51                 // Field java/lang/System.err:Ljava/io/PrintStream;
        47: aload         5
        49: invokevirtual #57                 // Method java/lang/Exception.getMessage:()Ljava/lang/String;
        52: invokedynamic #77,  0             // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        57: invokevirtual #65                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        60: aload         5
        62: invokevirtual #71                 // Method java/lang/Exception.printStackTrace:()V
        65: goto          10
        68: return
      Exception table:
         from    to  target type
            30    39    42   Class java/lang/Exception
      LineNumberTable:
        line 70: 0
        line 74: 30
        line 80: 39
        line 76: 42
        line 78: 44
        line 79: 60
        line 81: 65
        line 82: 68
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           44      21     5     e   Ljava/lang/Exception;
           30      35     4 listener   Lext/mods/extensions/listener/zone/OnZoneEnterLeaveListener;
            0      69     0  this   Lext/mods/extensions/listener/manager/ZoneListenerManager;
            0      69     1  zone   Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
            0      69     2 creature   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 4
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 255 /* full_frame */
          offset_delta = 31
          locals = [ class ext/mods/extensions/listener/manager/ZoneListenerManager, class ext/mods/gameserver/model/zone/type/subtype/ZoneType, class ext/mods/gameserver/model/actor/Creature, class java/util/Iterator, class ext/mods/extensions/listener/zone/OnZoneEnterLeaveListener ]
          stack = [ class java/lang/Exception ]
        frame_type = 250 /* chop */
          offset_delta = 22
        frame_type = 250 /* chop */
          offset_delta = 2

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: new           #11                 // class ext/mods/extensions/listener/manager/ZoneListenerManager
         3: dup
         4: invokespecial #78                 // Method "<init>":()V
         7: putstatic     #16                 // Field INSTANCE:Lext/mods/extensions/listener/manager/ZoneListenerManager;
        10: return
      LineNumberTable:
        line 29: 0
}
SourceFile: "ZoneListenerManager.java"
BootstrapMethods:
  0: #113 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #109 [ZoneListenerManager] Erro no onZoneEnter: \u0001
  1: #113 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #111 [ZoneListenerManager] Erro no onZoneLeave: \u0001
InnerClasses:
  public static final #124= #120 of #122; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
