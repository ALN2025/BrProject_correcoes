// Bytecode for: ext.mods.gameserver.data.manager.BotsPreventionManager$countdown
// File: ext\mods\gameserver\data\manager\BotsPreventionManager$countdown.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/manager/BotsPreventionManager$countdown.class
  Last modified 9 de jul de 2026; size 2632 bytes
  MD5 checksum 8eadf36a2331df887f63ccd5d81ccdb8
  Compiled from "BotsPreventionManager.java"
public class ext.mods.gameserver.data.manager.BotsPreventionManager$countdown implements java.lang.Runnable
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/data/manager/BotsPreventionManager$countdown
  super_class: #14                        // java/lang/Object
  interfaces: 1, fields: 3, methods: 2, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
    #2 = Class              #4            // java/util/Objects
    #3 = NameAndType        #5:#6         // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
    #4 = Utf8               java/util/Objects
    #5 = Utf8               requireNonNull
    #6 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/data/manager/BotsPreventionManager$countdown.this$0:Lext/mods/gameserver/data/manager/BotsPreventionManager;
    #8 = Class              #10           // ext/mods/gameserver/data/manager/BotsPreventionManager$countdown
    #9 = NameAndType        #11:#12       // this$0:Lext/mods/gameserver/data/manager/BotsPreventionManager;
   #10 = Utf8               ext/mods/gameserver/data/manager/BotsPreventionManager$countdown
   #11 = Utf8               this$0
   #12 = Utf8               Lext/mods/gameserver/data/manager/BotsPreventionManager;
   #13 = Methodref          #14.#15       // java/lang/Object."<init>":()V
   #14 = Class              #16           // java/lang/Object
   #15 = NameAndType        #17:#18       // "<init>":()V
   #16 = Utf8               java/lang/Object
   #17 = Utf8               <init>
   #18 = Utf8               ()V
   #19 = Fieldref           #8.#20        // ext/mods/gameserver/data/manager/BotsPreventionManager$countdown._time:I
   #20 = NameAndType        #21:#22       // _time:I
   #21 = Utf8               _time
   #22 = Utf8               I
   #23 = Fieldref           #8.#24        // ext/mods/gameserver/data/manager/BotsPreventionManager$countdown._player:Lext/mods/gameserver/model/actor/Player;
   #24 = NameAndType        #25:#26       // _player:Lext/mods/gameserver/model/actor/Player;
   #25 = Utf8               _player
   #26 = Utf8               Lext/mods/gameserver/model/actor/Player;
   #27 = Methodref          #28.#29       // ext/mods/gameserver/model/actor/Player.isOnline:()Z
   #28 = Class              #30           // ext/mods/gameserver/model/actor/Player
   #29 = NameAndType        #31:#32       // isOnline:()Z
   #30 = Utf8               ext/mods/gameserver/model/actor/Player
   #31 = Utf8               isOnline
   #32 = Utf8               ()Z
   #33 = Fieldref           #34.#35       // ext/mods/gameserver/data/manager/BotsPreventionManager._validation:Ljava/util/Map;
   #34 = Class              #36           // ext/mods/gameserver/data/manager/BotsPreventionManager
   #35 = NameAndType        #37:#38       // _validation:Ljava/util/Map;
   #36 = Utf8               ext/mods/gameserver/data/manager/BotsPreventionManager
   #37 = Utf8               _validation
   #38 = Utf8               Ljava/util/Map;
   #39 = Methodref          #28.#40       // ext/mods/gameserver/model/actor/Player.getObjectId:()I
   #40 = NameAndType        #41:#42       // getObjectId:()I
   #41 = Utf8               getObjectId
   #42 = Utf8               ()I
   #43 = Methodref          #44.#45       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #44 = Class              #46           // java/lang/Integer
   #45 = NameAndType        #47:#48       // valueOf:(I)Ljava/lang/Integer;
   #46 = Utf8               java/lang/Integer
   #47 = Utf8               valueOf
   #48 = Utf8               (I)Ljava/lang/Integer;
   #49 = InterfaceMethodref #50.#51       // java/util/Map.containsKey:(Ljava/lang/Object;)Z
   #50 = Class              #52           // java/util/Map
   #51 = NameAndType        #53:#54       // containsKey:(Ljava/lang/Object;)Z
   #52 = Utf8               java/util/Map
   #53 = Utf8               containsKey
   #54 = Utf8               (Ljava/lang/Object;)Z
   #55 = InterfaceMethodref #50.#56       // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #56 = NameAndType        #57:#6        // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #57 = Utf8               get
   #58 = Class              #59           // ext/mods/gameserver/data/manager/BotsPreventionManager$PlayerData
   #59 = Utf8               ext/mods/gameserver/data/manager/BotsPreventionManager$PlayerData
   #60 = Fieldref           #58.#61       // ext/mods/gameserver/data/manager/BotsPreventionManager$PlayerData.firstWindow:Z
   #61 = NameAndType        #62:#63       // firstWindow:Z
   #62 = Utf8               firstWindow
   #63 = Utf8               Z
   #64 = Fieldref           #34.#65       // ext/mods/gameserver/data/manager/BotsPreventionManager.WINDOW_DELAY:I
   #65 = NameAndType        #66:#22       // WINDOW_DELAY:I
   #66 = Utf8               WINDOW_DELAY
   #67 = Methodref          #34.#68       // ext/mods/gameserver/data/manager/BotsPreventionManager.preValidationWindow:(Lext/mods/gameserver/model/actor/Player;)V
   #68 = NameAndType        #69:#70       // preValidationWindow:(Lext/mods/gameserver/model/actor/Player;)V
   #69 = Utf8               preValidationWindow
   #70 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #71 = InvokeDynamic      #0:#72        // #0:makeConcatWithConstants:(I)Ljava/lang/String;
   #72 = NameAndType        #73:#74       // makeConcatWithConstants:(I)Ljava/lang/String;
   #73 = Utf8               makeConcatWithConstants
   #74 = Utf8               (I)Ljava/lang/String;
   #75 = Methodref          #28.#76       // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #76 = NameAndType        #77:#78       // sendMessage:(Ljava/lang/String;)V
   #77 = Utf8               sendMessage
   #78 = Utf8               (Ljava/lang/String;)V
   #79 = InvokeDynamic      #1:#72        // #1:makeConcatWithConstants:(I)Ljava/lang/String;
   #80 = Methodref          #8.#81        // ext/mods/gameserver/data/manager/BotsPreventionManager$countdown."<init>":(Lext/mods/gameserver/data/manager/BotsPreventionManager;Lext/mods/gameserver/model/actor/Player;I)V
   #81 = NameAndType        #17:#82       // "<init>":(Lext/mods/gameserver/data/manager/BotsPreventionManager;Lext/mods/gameserver/model/actor/Player;I)V
   #82 = Utf8               (Lext/mods/gameserver/data/manager/BotsPreventionManager;Lext/mods/gameserver/model/actor/Player;I)V
   #83 = Long               1000l
   #85 = Methodref          #86.#87       // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #86 = Class              #88           // ext/mods/commons/pool/ThreadPool
   #87 = NameAndType        #89:#90       // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #88 = Utf8               ext/mods/commons/pool/ThreadPool
   #89 = Utf8               schedule
   #90 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #91 = Class              #92           // java/lang/Runnable
   #92 = Utf8               java/lang/Runnable
   #93 = Utf8               Code
   #94 = Utf8               LineNumberTable
   #95 = Utf8               LocalVariableTable
   #96 = Utf8               this
   #97 = Utf8               Lext/mods/gameserver/data/manager/BotsPreventionManager$countdown;
   #98 = Utf8               player
   #99 = Utf8               time
  #100 = Utf8               MethodParameters
  #101 = Utf8               run
  #102 = Utf8               StackMapTable
  #103 = Utf8               SourceFile
  #104 = Utf8               BotsPreventionManager.java
  #105 = Utf8               NestHost
  #106 = Utf8               BootstrapMethods
  #107 = String             #108          // \u0001 minute(s) to match colors.
  #108 = Utf8               \u0001 minute(s) to match colors.
  #109 = String             #110          // \u0001 second(s) to match colors!
  #110 = Utf8               \u0001 second(s) to match colors!
  #111 = MethodHandle       6:#112        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #112 = Methodref          #113.#114     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #113 = Class              #115          // java/lang/invoke/StringConcatFactory
  #114 = NameAndType        #73:#116      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #115 = Utf8               java/lang/invoke/StringConcatFactory
  #116 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #117 = Utf8               InnerClasses
  #118 = Utf8               countdown
  #119 = Utf8               PlayerData
  #120 = Class              #121          // java/lang/invoke/MethodHandles$Lookup
  #121 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #122 = Class              #123          // java/lang/invoke/MethodHandles
  #123 = Utf8               java/lang/invoke/MethodHandles
  #124 = Utf8               Lookup
{
  final ext.mods.gameserver.data.manager.BotsPreventionManager this$0;
    descriptor: Lext/mods/gameserver/data/manager/BotsPreventionManager;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  public ext.mods.gameserver.data.manager.BotsPreventionManager$countdown(ext.mods.gameserver.data.manager.BotsPreventionManager, ext.mods.gameserver.model.actor.Player, int);
    descriptor: (Lext/mods/gameserver/data/manager/BotsPreventionManager;Lext/mods/gameserver/model/actor/Player;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=4
         0: aload_0
         1: aload_1
         2: dup
         3: invokestatic  #1                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
         6: pop
         7: putfield      #7                  // Field this$0:Lext/mods/gameserver/data/manager/BotsPreventionManager;
        10: aload_0
        11: invokespecial #13                 // Method java/lang/Object."<init>":()V
        14: aload_0
        15: iload_3
        16: putfield      #19                 // Field _time:I
        19: aload_0
        20: aload_2
        21: putfield      #23                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        24: return
      LineNumberTable:
        line 332: 0
        line 333: 14
        line 334: 19
        line 335: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/data/manager/BotsPreventionManager$countdown;
            0      25     1 this$0   Lext/mods/gameserver/data/manager/BotsPreventionManager;
            0      25     2 player   Lext/mods/gameserver/model/actor/Player;
            0      25     3  time   I
    MethodParameters:
      Name                           Flags
      <no name>                      final mandated
      <no name>
      <no name>

  public void run();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field _player:Lext/mods/gameserver/model/actor/Player;
         4: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
         7: ifeq          291
        10: getstatic     #33                 // Field ext/mods/gameserver/data/manager/BotsPreventionManager._validation:Ljava/util/Map;
        13: aload_0
        14: getfield      #23                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        17: invokevirtual #39                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        20: invokestatic  #43                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        23: invokeinterface #49,  2           // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
        28: ifeq          84
        31: getstatic     #33                 // Field ext/mods/gameserver/data/manager/BotsPreventionManager._validation:Ljava/util/Map;
        34: aload_0
        35: getfield      #23                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        38: invokevirtual #39                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        41: invokestatic  #43                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        44: invokeinterface #55,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        49: checkcast     #58                 // class ext/mods/gameserver/data/manager/BotsPreventionManager$PlayerData
        52: getfield      #60                 // Field ext/mods/gameserver/data/manager/BotsPreventionManager$PlayerData.firstWindow:Z
        55: ifeq          84
        58: aload_0
        59: getfield      #19                 // Field _time:I
        62: aload_0
        63: getfield      #7                  // Field this$0:Lext/mods/gameserver/data/manager/BotsPreventionManager;
        66: getfield      #64                 // Field ext/mods/gameserver/data/manager/BotsPreventionManager.WINDOW_DELAY:I
        69: irem
        70: ifne          84
        73: aload_0
        74: getfield      #7                  // Field this$0:Lext/mods/gameserver/data/manager/BotsPreventionManager;
        77: aload_0
        78: getfield      #23                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        81: invokevirtual #67                 // Method ext/mods/gameserver/data/manager/BotsPreventionManager.preValidationWindow:(Lext/mods/gameserver/model/actor/Player;)V
        84: aload_0
        85: getfield      #19                 // Field _time:I
        88: lookupswitch  { // 12

                       1: 218

                       2: 218

                       3: 218

                       4: 218

                       5: 218

                      10: 218

                      30: 218

                      60: 196

                     120: 196

                     180: 196

                     240: 196

                     300: 196
                 default: 234
            }
       196: aload_0
       197: getfield      #23                 // Field _player:Lext/mods/gameserver/model/actor/Player;
       200: aload_0
       201: getfield      #19                 // Field _time:I
       204: bipush        60
       206: idiv
       207: invokedynamic #71,  0             // InvokeDynamic #0:makeConcatWithConstants:(I)Ljava/lang/String;
       212: invokevirtual #75                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       215: goto          234
       218: aload_0
       219: getfield      #23                 // Field _player:Lext/mods/gameserver/model/actor/Player;
       222: aload_0
       223: getfield      #19                 // Field _time:I
       226: invokedynamic #79,  0             // InvokeDynamic #1:makeConcatWithConstants:(I)Ljava/lang/String;
       231: invokevirtual #75                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       234: aload_0
       235: getfield      #19                 // Field _time:I
       238: iconst_1
       239: if_icmple     291
       242: getstatic     #33                 // Field ext/mods/gameserver/data/manager/BotsPreventionManager._validation:Ljava/util/Map;
       245: aload_0
       246: getfield      #23                 // Field _player:Lext/mods/gameserver/model/actor/Player;
       249: invokevirtual #39                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       252: invokestatic  #43                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       255: invokeinterface #49,  2           // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
       260: ifeq          291
       263: new           #8                  // class ext/mods/gameserver/data/manager/BotsPreventionManager$countdown
       266: dup
       267: aload_0
       268: getfield      #7                  // Field this$0:Lext/mods/gameserver/data/manager/BotsPreventionManager;
       271: aload_0
       272: getfield      #23                 // Field _player:Lext/mods/gameserver/model/actor/Player;
       275: aload_0
       276: getfield      #19                 // Field _time:I
       279: iconst_1
       280: isub
       281: invokespecial #80                 // Method "<init>":(Lext/mods/gameserver/data/manager/BotsPreventionManager;Lext/mods/gameserver/model/actor/Player;I)V
       284: ldc2_w        #83                 // long 1000l
       287: invokestatic  #85                 // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
       290: pop
       291: return
      LineNumberTable:
        line 340: 0
        line 342: 10
        line 344: 58
        line 345: 73
        line 348: 84
        line 355: 196
        line 356: 215
        line 364: 218
        line 368: 234
        line 369: 263
        line 371: 291
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     292     0  this   Lext/mods/gameserver/data/manager/BotsPreventionManager$countdown;
      StackMapTable: number_of_entries = 5
        frame_type = 251 /* same_frame_extended */
          offset_delta = 84
        frame_type = 251 /* same_frame_extended */
          offset_delta = 111
        frame_type = 21 /* same */
        frame_type = 15 /* same */
        frame_type = 56 /* same */
}
SourceFile: "BotsPreventionManager.java"
NestHost: class ext/mods/gameserver/data/manager/BotsPreventionManager
BootstrapMethods:
  0: #111 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #107 \u0001 minute(s) to match colors.
  1: #111 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #109 \u0001 second(s) to match colors!
InnerClasses:
  protected #118= #8 of #34;              // countdown=class ext/mods/gameserver/data/manager/BotsPreventionManager$countdown of class ext/mods/gameserver/data/manager/BotsPreventionManager
  public #119= #58 of #34;                // PlayerData=class ext/mods/gameserver/data/manager/BotsPreventionManager$PlayerData of class ext/mods/gameserver/data/manager/BotsPreventionManager
  public static final #124= #120 of #122; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
