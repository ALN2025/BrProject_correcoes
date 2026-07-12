// Bytecode for: ext.mods.gameserver.model.actor.move.MovementTelemetry
// File: ext\mods\gameserver\model\actor\move\MovementTelemetry.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/move/MovementTelemetry.class
  Last modified 9 de jul de 2026; size 3173 bytes
  MD5 checksum 23a88b45cc90ce6ff59462084b73cf64
  Compiled from "MovementTelemetry.java"
public class ext.mods.gameserver.model.actor.move.MovementTelemetry
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/move/MovementTelemetry
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 2, methods: 6, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/actor/move/MovementTelemetry.ENABLED:Z
    #8 = Class              #10           // ext/mods/gameserver/model/actor/move/MovementTelemetry
    #9 = NameAndType        #11:#12       // ENABLED:Z
   #10 = Utf8               ext/mods/gameserver/model/actor/move/MovementTelemetry
   #11 = Utf8               ENABLED
   #12 = Utf8               Z
   #13 = Fieldref           #14.#15       // ext/mods/gameserver/model/actor/move/MovementConfig.DEBUG_ENABLED:Z
   #14 = Class              #16           // ext/mods/gameserver/model/actor/move/MovementConfig
   #15 = NameAndType        #17:#12       // DEBUG_ENABLED:Z
   #16 = Utf8               ext/mods/gameserver/model/actor/move/MovementConfig
   #17 = Utf8               DEBUG_ENABLED
   #18 = Class              #19           // ext/mods/gameserver/model/actor/Npc
   #19 = Utf8               ext/mods/gameserver/model/actor/Npc
   #20 = Class              #21           // ext/mods/gameserver/model/actor/Player
   #21 = Utf8               ext/mods/gameserver/model/actor/Player
   #22 = String             #23           // MOVING
   #23 = Utf8               MOVING
   #24 = String             #25           // ATTACKING
   #25 = Utf8               ATTACKING
   #26 = String             #27           // [ATK] %s -> %s | Dist: %.0f | Range: %.0f | Act: %s
   #27 = Utf8               [ATK] %s -> %s | Dist: %.0f | Range: %.0f | Act: %s
   #28 = Methodref          #29.#30       // ext/mods/gameserver/model/actor/Creature.getName:()Ljava/lang/String;
   #29 = Class              #31           // ext/mods/gameserver/model/actor/Creature
   #30 = NameAndType        #32:#33       // getName:()Ljava/lang/String;
   #31 = Utf8               ext/mods/gameserver/model/actor/Creature
   #32 = Utf8               getName
   #33 = Utf8               ()Ljava/lang/String;
   #34 = Methodref          #35.#36       // java/lang/Double.valueOf:(D)Ljava/lang/Double;
   #35 = Class              #37           // java/lang/Double
   #36 = NameAndType        #38:#39       // valueOf:(D)Ljava/lang/Double;
   #37 = Utf8               java/lang/Double
   #38 = Utf8               valueOf
   #39 = Utf8               (D)Ljava/lang/Double;
   #40 = Methodref          #41.#42       // java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
   #41 = Class              #43           // java/lang/String
   #42 = NameAndType        #44:#45       // format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
   #43 = Utf8               java/lang/String
   #44 = Utf8               format
   #45 = Utf8               (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
   #46 = Methodref          #8.#47        // ext/mods/gameserver/model/actor/move/MovementTelemetry.sendToInterface:(Ljava/lang/String;)V
   #47 = NameAndType        #48:#49       // sendToInterface:(Ljava/lang/String;)V
   #48 = Utf8               sendToInterface
   #49 = Utf8               (Ljava/lang/String;)V
   #50 = Methodref          #8.#51        // ext/mods/gameserver/model/actor/move/MovementTelemetry.isTargetingPlayer:(Lext/mods/gameserver/model/actor/Creature;)Z
   #51 = NameAndType        #52:#53       // isTargetingPlayer:(Lext/mods/gameserver/model/actor/Creature;)Z
   #52 = Utf8               isTargetingPlayer
   #53 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
   #54 = String             #55           // [PHY] %s | %s | Move: %.1f,%.1f | Repul: %.1f,%.1f | %s
   #55 = Utf8               [PHY] %s | %s | Move: %.1f,%.1f | Repul: %.1f,%.1f | %s
   #56 = String             #57           // OK
   #57 = Utf8               OK
   #58 = String             #59           // BLOCKED
   #59 = Utf8               BLOCKED
   #60 = Methodref          #29.#61       // ext/mods/gameserver/model/actor/Creature.getTarget:()Lext/mods/gameserver/model/WorldObject;
   #61 = NameAndType        #62:#63       // getTarget:()Lext/mods/gameserver/model/WorldObject;
   #62 = Utf8               getTarget
   #63 = Utf8               ()Lext/mods/gameserver/model/WorldObject;
   #64 = Methodref          #29.#65       // ext/mods/gameserver/model/actor/Creature.getAI:()Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
   #65 = NameAndType        #66:#67       // getAI:()Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
   #66 = Utf8               getAI
   #67 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
   #68 = Methodref          #69.#70       // ext/mods/gameserver/model/actor/ai/type/CreatureAI.getCurrentIntention:()Lext/mods/gameserver/model/actor/ai/Intention;
   #69 = Class              #71           // ext/mods/gameserver/model/actor/ai/type/CreatureAI
   #70 = NameAndType        #72:#73       // getCurrentIntention:()Lext/mods/gameserver/model/actor/ai/Intention;
   #71 = Utf8               ext/mods/gameserver/model/actor/ai/type/CreatureAI
   #72 = Utf8               getCurrentIntention
   #73 = Utf8               ()Lext/mods/gameserver/model/actor/ai/Intention;
   #74 = Methodref          #75.#76       // ext/mods/gameserver/model/actor/ai/Intention.getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
   #75 = Class              #77           // ext/mods/gameserver/model/actor/ai/Intention
   #76 = NameAndType        #78:#79       // getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
   #77 = Utf8               ext/mods/gameserver/model/actor/ai/Intention
   #78 = Utf8               getFinalTarget
   #79 = Utf8               ()Lext/mods/gameserver/model/actor/Creature;
   #80 = Methodref          #14.#81       // ext/mods/gameserver/model/actor/move/MovementConfig.log:(Ljava/lang/String;)V
   #81 = NameAndType        #82:#49       // log:(Ljava/lang/String;)V
   #82 = Utf8               log
   #83 = Class              #84           // ext/mods/commons/logging/CLogger
   #84 = Utf8               ext/mods/commons/logging/CLogger
   #85 = String             #86           // PhysicsDebug
   #86 = Utf8               PhysicsDebug
   #87 = Methodref          #83.#88       // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
   #88 = NameAndType        #5:#49        // "<init>":(Ljava/lang/String;)V
   #89 = Fieldref           #8.#90        // ext/mods/gameserver/model/actor/move/MovementTelemetry.LOGGER:Lext/mods/commons/logging/CLogger;
   #90 = NameAndType        #91:#92       // LOGGER:Lext/mods/commons/logging/CLogger;
   #91 = Utf8               LOGGER
   #92 = Utf8               Lext/mods/commons/logging/CLogger;
   #93 = Utf8               Code
   #94 = Utf8               LineNumberTable
   #95 = Utf8               LocalVariableTable
   #96 = Utf8               this
   #97 = Utf8               Lext/mods/gameserver/model/actor/move/MovementTelemetry;
   #98 = Utf8               logAttackDecision
   #99 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;DIIZ)V
  #100 = Utf8               actor
  #101 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #102 = Utf8               target
  #103 = Utf8               dist
  #104 = Utf8               D
  #105 = Utf8               weaponRange
  #106 = Utf8               I
  #107 = Utf8               collision
  #108 = Utf8               willMove
  #109 = Utf8               attackBorder
  #110 = Utf8               decision
  #111 = Utf8               Ljava/lang/String;
  #112 = Utf8               msg
  #113 = Utf8               StackMapTable
  #114 = Utf8               logPhysics
  #115 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Ljava/lang/String;DDDDZ)V
  #116 = Utf8               type
  #117 = Utf8               moveX
  #118 = Utf8               moveY
  #119 = Utf8               repulseX
  #120 = Utf8               repulseY
  #121 = Utf8               moved
  #122 = Class              #123          // "[Ljava/lang/Object;"
  #123 = Utf8               [Ljava/lang/Object;
  #124 = Utf8               aiTarget
  #125 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #126 = Class              #127          // ext/mods/gameserver/model/WorldObject
  #127 = Utf8               ext/mods/gameserver/model/WorldObject
  #128 = Utf8               <clinit>
  #129 = Utf8               SourceFile
  #130 = Utf8               MovementTelemetry.java
{
  public static volatile boolean ENABLED;
    descriptor: Z
    flags: (0x0049) ACC_PUBLIC, ACC_STATIC, ACC_VOLATILE

  public ext.mods.gameserver.model.actor.move.MovementTelemetry();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 30: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/move/MovementTelemetry;

  public static void logAttackDecision(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.model.actor.Creature, double, int, int, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;DIIZ)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=6, locals=11, args_size=6
         0: getstatic     #7                  // Field ENABLED:Z
         3: ifeq          12
         6: getstatic     #13                 // Field ext/mods/gameserver/model/actor/move/MovementConfig.DEBUG_ENABLED:Z
         9: ifne          13
        12: return
        13: aload_0
        14: instanceof    #18                 // class ext/mods/gameserver/model/actor/Npc
        17: ifne          21
        20: return
        21: aload_1
        22: ifnull        32
        25: aload_1
        26: instanceof    #20                 // class ext/mods/gameserver/model/actor/Player
        29: ifne          33
        32: return
        33: iload         4
        35: iload         5
        37: iadd
        38: i2d
        39: dstore        7
        41: iload         6
        43: ifeq          51
        46: ldc           #22                 // String MOVING
        48: goto          53
        51: ldc           #24                 // String ATTACKING
        53: astore        9
        55: ldc           #26                 // String [ATK] %s -> %s | Dist: %.0f | Range: %.0f | Act: %s
        57: iconst_5
        58: anewarray     #2                  // class java/lang/Object
        61: dup
        62: iconst_0
        63: aload_0
        64: invokevirtual #28                 // Method ext/mods/gameserver/model/actor/Creature.getName:()Ljava/lang/String;
        67: aastore
        68: dup
        69: iconst_1
        70: aload_1
        71: invokevirtual #28                 // Method ext/mods/gameserver/model/actor/Creature.getName:()Ljava/lang/String;
        74: aastore
        75: dup
        76: iconst_2
        77: dload_2
        78: invokestatic  #34                 // Method java/lang/Double.valueOf:(D)Ljava/lang/Double;
        81: aastore
        82: dup
        83: iconst_3
        84: dload         7
        86: invokestatic  #34                 // Method java/lang/Double.valueOf:(D)Ljava/lang/Double;
        89: aastore
        90: dup
        91: iconst_4
        92: aload         9
        94: aastore
        95: invokestatic  #40                 // Method java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        98: astore        10
       100: aload         10
       102: invokestatic  #46                 // Method sendToInterface:(Ljava/lang/String;)V
       105: return
      LineNumberTable:
        line 37: 0
        line 39: 13
        line 41: 21
        line 43: 33
        line 44: 41
        line 46: 55
        line 48: 64
        line 46: 95
        line 51: 100
        line 52: 105
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     106     0 actor   Lext/mods/gameserver/model/actor/Creature;
            0     106     1 target   Lext/mods/gameserver/model/actor/Creature;
            0     106     2  dist   D
            0     106     4 weaponRange   I
            0     106     5 collision   I
            0     106     6 willMove   Z
           41      65     7 attackBorder   D
           55      51     9 decision   Ljava/lang/String;
          100       6    10   msg   Ljava/lang/String;
      StackMapTable: number_of_entries = 7
        frame_type = 12 /* same */
        frame_type = 0 /* same */
        frame_type = 7 /* same */
        frame_type = 10 /* same */
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ double ]
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]

  public static void logPhysics(ext.mods.gameserver.model.actor.Creature, java.lang.String, double, double, double, double, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Ljava/lang/String;DDDDZ)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=6, locals=12, args_size=7
         0: getstatic     #7                  // Field ENABLED:Z
         3: ifeq          12
         6: getstatic     #13                 // Field ext/mods/gameserver/model/actor/move/MovementConfig.DEBUG_ENABLED:Z
         9: ifne          13
        12: return
        13: aload_0
        14: instanceof    #18                 // class ext/mods/gameserver/model/actor/Npc
        17: ifne          21
        20: return
        21: aload_0
        22: invokestatic  #50                 // Method isTargetingPlayer:(Lext/mods/gameserver/model/actor/Creature;)Z
        25: ifne          29
        28: return
        29: iload         10
        31: ifeq          62
        34: dload         6
        36: dconst_0
        37: dcmpl
        38: ifne          62
        41: dload         8
        43: dconst_0
        44: dcmpl
        45: ifne          62
        48: dload_2
        49: dconst_0
        50: dcmpl
        51: ifne          62
        54: dload         4
        56: dconst_0
        57: dcmpl
        58: ifne          62
        61: return
        62: ldc           #54                 // String [PHY] %s | %s | Move: %.1f,%.1f | Repul: %.1f,%.1f | %s
        64: bipush        7
        66: anewarray     #2                  // class java/lang/Object
        69: dup
        70: iconst_0
        71: aload_0
        72: invokevirtual #28                 // Method ext/mods/gameserver/model/actor/Creature.getName:()Ljava/lang/String;
        75: aastore
        76: dup
        77: iconst_1
        78: aload_1
        79: aastore
        80: dup
        81: iconst_2
        82: dload_2
        83: invokestatic  #34                 // Method java/lang/Double.valueOf:(D)Ljava/lang/Double;
        86: aastore
        87: dup
        88: iconst_3
        89: dload         4
        91: invokestatic  #34                 // Method java/lang/Double.valueOf:(D)Ljava/lang/Double;
        94: aastore
        95: dup
        96: iconst_4
        97: dload         6
        99: invokestatic  #34                 // Method java/lang/Double.valueOf:(D)Ljava/lang/Double;
       102: aastore
       103: dup
       104: iconst_5
       105: dload         8
       107: invokestatic  #34                 // Method java/lang/Double.valueOf:(D)Ljava/lang/Double;
       110: aastore
       111: dup
       112: bipush        6
       114: iload         10
       116: ifeq          124
       119: ldc           #56                 // String OK
       121: goto          126
       124: ldc           #58                 // String BLOCKED
       126: aastore
       127: invokestatic  #40                 // Method java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
       130: astore        11
       132: aload         11
       134: invokestatic  #46                 // Method sendToInterface:(Ljava/lang/String;)V
       137: return
      LineNumberTable:
        line 55: 0
        line 56: 13
        line 58: 21
        line 60: 29
        line 62: 62
        line 64: 72
        line 62: 127
        line 67: 132
        line 68: 137
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     138     0 actor   Lext/mods/gameserver/model/actor/Creature;
            0     138     1  type   Ljava/lang/String;
            0     138     2 moveX   D
            0     138     4 moveY   D
            0     138     6 repulseX   D
            0     138     8 repulseY   D
            0     138    10 moved   Z
          132       6    11   msg   Ljava/lang/String;
      StackMapTable: number_of_entries = 7
        frame_type = 12 /* same */
        frame_type = 0 /* same */
        frame_type = 7 /* same */
        frame_type = 7 /* same */
        frame_type = 32 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 61
          locals = [ class ext/mods/gameserver/model/actor/Creature, class java/lang/String, double, double, double, double, int ]
          stack = [ class java/lang/String, class "[Ljava/lang/Object;", class "[Ljava/lang/Object;", int ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/model/actor/Creature, class java/lang/String, double, double, double, double, int ]
          stack = [ class java/lang/String, class "[Ljava/lang/Object;", class "[Ljava/lang/Object;", int, class java/lang/String ]

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: iconst_1
         1: putstatic     #7                  // Field ENABLED:Z
         4: new           #83                 // class ext/mods/commons/logging/CLogger
         7: dup
         8: ldc           #85                 // String PhysicsDebug
        10: invokespecial #87                 // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        13: putstatic     #89                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        16: return
      LineNumberTable:
        line 32: 0
        line 34: 4
}
SourceFile: "MovementTelemetry.java"
