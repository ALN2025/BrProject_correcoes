// Bytecode for: ext.mods.gameserver.model.entity.Events
// File: ext\mods\gameserver\model\entity\Events.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/entity/Events.class
  Last modified 9 de jul de 2026; size 3362 bytes
  MD5 checksum 6bdb5a17d40500a41197966ab827b6e1
  Compiled from "Events.java"
public class ext.mods.gameserver.model.entity.Events
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #99                         // ext/mods/gameserver/model/entity/Events
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 1, methods: 6, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = InterfaceMethodref #8.#9         // java/util/List.iterator:()Ljava/util/Iterator;
    #8 = Class              #10           // java/util/List
    #9 = NameAndType        #11:#12       // iterator:()Ljava/util/Iterator;
   #10 = Utf8               java/util/List
   #11 = Utf8               iterator
   #12 = Utf8               ()Ljava/util/Iterator;
   #13 = InterfaceMethodref #14.#15       // java/util/Iterator.hasNext:()Z
   #14 = Class              #16           // java/util/Iterator
   #15 = NameAndType        #17:#18       // hasNext:()Z
   #16 = Utf8               java/util/Iterator
   #17 = Utf8               hasNext
   #18 = Utf8               ()Z
   #19 = InterfaceMethodref #14.#20       // java/util/Iterator.next:()Ljava/lang/Object;
   #20 = NameAndType        #21:#22       // next:()Ljava/lang/Object;
   #21 = Utf8               next
   #22 = Utf8               ()Ljava/lang/Object;
   #23 = Class              #24           // java/lang/Integer
   #24 = Utf8               java/lang/Integer
   #25 = Methodref          #23.#26       // java/lang/Integer.intValue:()I
   #26 = NameAndType        #27:#28       // intValue:()I
   #27 = Utf8               intValue
   #28 = Utf8               ()I
   #29 = Methodref          #30.#31       // ext/mods/gameserver/data/xml/DoorData.getInstance:()Lext/mods/gameserver/data/xml/DoorData;
   #30 = Class              #32           // ext/mods/gameserver/data/xml/DoorData
   #31 = NameAndType        #33:#34       // getInstance:()Lext/mods/gameserver/data/xml/DoorData;
   #32 = Utf8               ext/mods/gameserver/data/xml/DoorData
   #33 = Utf8               getInstance
   #34 = Utf8               ()Lext/mods/gameserver/data/xml/DoorData;
   #35 = Methodref          #30.#36       // ext/mods/gameserver/data/xml/DoorData.getDoor:(I)Lext/mods/gameserver/model/actor/instance/Door;
   #36 = NameAndType        #37:#38       // getDoor:(I)Lext/mods/gameserver/model/actor/instance/Door;
   #37 = Utf8               getDoor
   #38 = Utf8               (I)Lext/mods/gameserver/model/actor/instance/Door;
   #39 = Methodref          #40.#41       // ext/mods/gameserver/model/actor/instance/Door.closeMe:()V
   #40 = Class              #42           // ext/mods/gameserver/model/actor/instance/Door
   #41 = NameAndType        #43:#6        // closeMe:()V
   #42 = Utf8               ext/mods/gameserver/model/actor/instance/Door
   #43 = Utf8               closeMe
   #44 = Methodref          #40.#45       // ext/mods/gameserver/model/actor/instance/Door.openMe:()V
   #45 = NameAndType        #46:#6        // openMe:()V
   #46 = Utf8               openMe
   #47 = Fieldref           #48.#49       // ext/mods/gameserver/enums/skills/AbnormalEffect.HOLD_2:Lext/mods/gameserver/enums/skills/AbnormalEffect;
   #48 = Class              #50           // ext/mods/gameserver/enums/skills/AbnormalEffect
   #49 = NameAndType        #51:#52       // HOLD_2:Lext/mods/gameserver/enums/skills/AbnormalEffect;
   #50 = Utf8               ext/mods/gameserver/enums/skills/AbnormalEffect
   #51 = Utf8               HOLD_2
   #52 = Utf8               Lext/mods/gameserver/enums/skills/AbnormalEffect;
   #53 = Methodref          #54.#55       // ext/mods/gameserver/model/actor/Player.startAbnormalEffect:(Lext/mods/gameserver/enums/skills/AbnormalEffect;)V
   #54 = Class              #56           // ext/mods/gameserver/model/actor/Player
   #55 = NameAndType        #57:#58       // startAbnormalEffect:(Lext/mods/gameserver/enums/skills/AbnormalEffect;)V
   #56 = Utf8               ext/mods/gameserver/model/actor/Player
   #57 = Utf8               startAbnormalEffect
   #58 = Utf8               (Lext/mods/gameserver/enums/skills/AbnormalEffect;)V
   #59 = Methodref          #54.#60       // ext/mods/gameserver/model/actor/Player.setIsParalyzed:(Z)V
   #60 = NameAndType        #61:#62       // setIsParalyzed:(Z)V
   #61 = Utf8               setIsParalyzed
   #62 = Utf8               (Z)V
   #63 = Methodref          #54.#64       // ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
   #64 = NameAndType        #65:#66       // getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
   #65 = Utf8               getSysString
   #66 = Utf8               (I[Ljava/lang/Object;)Ljava/lang/String;
   #67 = Methodref          #54.#68       // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #68 = NameAndType        #69:#70       // sendMessage:(Ljava/lang/String;)V
   #69 = Utf8               sendMessage
   #70 = Utf8               (Ljava/lang/String;)V
   #71 = InvokeDynamic      #0:#72        // #0:run:(Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Runnable;
   #72 = NameAndType        #73:#74       // run:(Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Runnable;
   #73 = Utf8               run
   #74 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Runnable;
   #75 = Long               15000l
   #77 = Methodref          #78.#79       // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #78 = Class              #80           // ext/mods/commons/pool/ThreadPool
   #79 = NameAndType        #81:#82       // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #80 = Utf8               ext/mods/commons/pool/ThreadPool
   #81 = Utf8               schedule
   #82 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #83 = Methodref          #54.#84       // ext/mods/gameserver/model/actor/Player.stopAbnormalEffect:(Lext/mods/gameserver/enums/skills/AbnormalEffect;)V
   #84 = NameAndType        #85:#58       // stopAbnormalEffect:(Lext/mods/gameserver/enums/skills/AbnormalEffect;)V
   #85 = Utf8               stopAbnormalEffect
   #86 = Class              #87           // ext/mods/gameserver/network/serverpackets/ExShowScreenMessage
   #87 = Utf8               ext/mods/gameserver/network/serverpackets/ExShowScreenMessage
   #88 = String             #89           // FIGHT!
   #89 = Utf8               FIGHT!
   #90 = Methodref          #86.#91       // ext/mods/gameserver/network/serverpackets/ExShowScreenMessage."<init>":(Ljava/lang/String;I)V
   #91 = NameAndType        #5:#92        // "<init>":(Ljava/lang/String;I)V
   #92 = Utf8               (Ljava/lang/String;I)V
   #93 = Methodref          #54.#94       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #94 = NameAndType        #95:#96       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #95 = Utf8               sendPacket
   #96 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #97 = Class              #98           // ext/mods/commons/logging/CLogger
   #98 = Utf8               ext/mods/commons/logging/CLogger
   #99 = Class              #100          // ext/mods/gameserver/model/entity/Events
  #100 = Utf8               ext/mods/gameserver/model/entity/Events
  #101 = Methodref          #102.#103     // java/lang/Class.getName:()Ljava/lang/String;
  #102 = Class              #104          // java/lang/Class
  #103 = NameAndType        #105:#106     // getName:()Ljava/lang/String;
  #104 = Utf8               java/lang/Class
  #105 = Utf8               getName
  #106 = Utf8               ()Ljava/lang/String;
  #107 = Methodref          #97.#108      // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #108 = NameAndType        #5:#70        // "<init>":(Ljava/lang/String;)V
  #109 = Fieldref           #99.#110      // ext/mods/gameserver/model/entity/Events.LOGGER:Lext/mods/commons/logging/CLogger;
  #110 = NameAndType        #111:#112     // LOGGER:Lext/mods/commons/logging/CLogger;
  #111 = Utf8               LOGGER
  #112 = Utf8               Lext/mods/commons/logging/CLogger;
  #113 = Utf8               Code
  #114 = Utf8               LineNumberTable
  #115 = Utf8               LocalVariableTable
  #116 = Utf8               this
  #117 = Utf8               Lext/mods/gameserver/model/entity/Events;
  #118 = Utf8               closeDoors
  #119 = Utf8               (Ljava/util/List;)V
  #120 = Utf8               door
  #121 = Utf8               Lext/mods/gameserver/model/actor/instance/Door;
  #122 = Utf8               doorId
  #123 = Utf8               I
  #124 = Utf8               doors
  #125 = Utf8               Ljava/util/List;
  #126 = Utf8               LocalVariableTypeTable
  #127 = Utf8               Ljava/util/List<Ljava/lang/Integer;>;
  #128 = Utf8               StackMapTable
  #129 = Utf8               Signature
  #130 = Utf8               (Ljava/util/List<Ljava/lang/Integer;>;)V
  #131 = Utf8               openDoors
  #132 = Utf8               spawnProtection
  #133 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #134 = Utf8               player
  #135 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #136 = Utf8               lambda$spawnProtection$0
  #137 = Utf8               <clinit>
  #138 = Utf8               SourceFile
  #139 = Utf8               Events.java
  #140 = Utf8               BootstrapMethods
  #141 = MethodType         #6            //  ()V
  #142 = MethodHandle       6:#143        // REF_invokeStatic ext/mods/gameserver/model/entity/Events.lambda$spawnProtection$0:(Lext/mods/gameserver/model/actor/Player;)V
  #143 = Methodref          #99.#144      // ext/mods/gameserver/model/entity/Events.lambda$spawnProtection$0:(Lext/mods/gameserver/model/actor/Player;)V
  #144 = NameAndType        #136:#133     // lambda$spawnProtection$0:(Lext/mods/gameserver/model/actor/Player;)V
  #145 = MethodHandle       6:#146        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #146 = Methodref          #147.#148     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #147 = Class              #149          // java/lang/invoke/LambdaMetafactory
  #148 = NameAndType        #150:#151     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #149 = Utf8               java/lang/invoke/LambdaMetafactory
  #150 = Utf8               metafactory
  #151 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #152 = Utf8               InnerClasses
  #153 = Class              #154          // java/lang/invoke/MethodHandles$Lookup
  #154 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #155 = Class              #156          // java/lang/invoke/MethodHandles
  #156 = Utf8               java/lang/invoke/MethodHandles
  #157 = Utf8               Lookup
{
  protected static final ext.mods.commons.logging.CLogger LOGGER;
    descriptor: Lext/mods/commons/logging/CLogger;
    flags: (0x001c) ACC_PROTECTED, ACC_STATIC, ACC_FINAL

  public ext.mods.gameserver.model.entity.Events();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 31: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/Events;

  protected static void closeDoors(java.util.List<java.lang.Integer>);
    descriptor: (Ljava/util/List;)V
    flags: (0x000c) ACC_PROTECTED, ACC_STATIC
    Code:
      stack=2, locals=4, args_size=1
         0: aload_0
         1: invokeinterface #7,  1            // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         6: astore_1
         7: aload_1
         8: invokeinterface #13,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        13: ifeq          48
        16: aload_1
        17: invokeinterface #19,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        22: checkcast     #23                 // class java/lang/Integer
        25: invokevirtual #25                 // Method java/lang/Integer.intValue:()I
        28: istore_2
        29: invokestatic  #29                 // Method ext/mods/gameserver/data/xml/DoorData.getInstance:()Lext/mods/gameserver/data/xml/DoorData;
        32: iload_2
        33: invokevirtual #35                 // Method ext/mods/gameserver/data/xml/DoorData.getDoor:(I)Lext/mods/gameserver/model/actor/instance/Door;
        36: astore_3
        37: aload_3
        38: ifnull        45
        41: aload_3
        42: invokevirtual #39                 // Method ext/mods/gameserver/model/actor/instance/Door.closeMe:()V
        45: goto          7
        48: return
      LineNumberTable:
        line 37: 0
        line 39: 29
        line 41: 37
        line 42: 41
        line 43: 45
        line 44: 48
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           37       8     3  door   Lext/mods/gameserver/model/actor/instance/Door;
           29      16     2 doorId   I
            0      49     0 doors   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      49     0 doors   Ljava/util/List<Ljava/lang/Integer;>;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 7
          locals = [ class java/util/Iterator ]
        frame_type = 37 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
    Signature: #130                         // (Ljava/util/List<Ljava/lang/Integer;>;)V

  protected static void openDoors(java.util.List<java.lang.Integer>);
    descriptor: (Ljava/util/List;)V
    flags: (0x000c) ACC_PROTECTED, ACC_STATIC
    Code:
      stack=2, locals=4, args_size=1
         0: aload_0
         1: invokeinterface #7,  1            // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         6: astore_1
         7: aload_1
         8: invokeinterface #13,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        13: ifeq          48
        16: aload_1
        17: invokeinterface #19,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        22: checkcast     #23                 // class java/lang/Integer
        25: invokevirtual #25                 // Method java/lang/Integer.intValue:()I
        28: istore_2
        29: invokestatic  #29                 // Method ext/mods/gameserver/data/xml/DoorData.getInstance:()Lext/mods/gameserver/data/xml/DoorData;
        32: iload_2
        33: invokevirtual #35                 // Method ext/mods/gameserver/data/xml/DoorData.getDoor:(I)Lext/mods/gameserver/model/actor/instance/Door;
        36: astore_3
        37: aload_3
        38: ifnull        45
        41: aload_3
        42: invokevirtual #44                 // Method ext/mods/gameserver/model/actor/instance/Door.openMe:()V
        45: goto          7
        48: return
      LineNumberTable:
        line 48: 0
        line 50: 29
        line 52: 37
        line 53: 41
        line 54: 45
        line 55: 48
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           37       8     3  door   Lext/mods/gameserver/model/actor/instance/Door;
           29      16     2 doorId   I
            0      49     0 doors   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      49     0 doors   Ljava/util/List<Ljava/lang/Integer;>;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 7
          locals = [ class java/util/Iterator ]
        frame_type = 37 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
    Signature: #130                         // (Ljava/util/List<Ljava/lang/Integer;>;)V

  public static void spawnProtection(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: getstatic     #47                 // Field ext/mods/gameserver/enums/skills/AbnormalEffect.HOLD_2:Lext/mods/gameserver/enums/skills/AbnormalEffect;
         4: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.startAbnormalEffect:(Lext/mods/gameserver/enums/skills/AbnormalEffect;)V
         7: aload_0
         8: iconst_1
         9: invokevirtual #59                 // Method ext/mods/gameserver/model/actor/Player.setIsParalyzed:(Z)V
        12: aload_0
        13: aload_0
        14: sipush        10175
        17: iconst_0
        18: anewarray     #2                  // class java/lang/Object
        21: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
        24: invokevirtual #67                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        27: aload_0
        28: invokedynamic #71,  0             // InvokeDynamic #0:run:(Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Runnable;
        33: ldc2_w        #75                 // long 15000l
        36: invokestatic  #77                 // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
        39: pop
        40: return
      LineNumberTable:
        line 59: 0
        line 60: 7
        line 61: 12
        line 63: 27
        line 70: 40
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      41     0 player   Lext/mods/gameserver/model/actor/Player;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #97                 // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #99                 // class ext/mods/gameserver/model/entity/Events
         6: invokevirtual #101                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #107                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #109                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 33: 0
}
SourceFile: "Events.java"
BootstrapMethods:
  0: #145 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #141 ()V
      #142 REF_invokeStatic ext/mods/gameserver/model/entity/Events.lambda$spawnProtection$0:(Lext/mods/gameserver/model/actor/Player;)V
      #141 ()V
InnerClasses:
  public static final #157= #153 of #155; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
