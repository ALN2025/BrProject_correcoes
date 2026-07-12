// Bytecode for: ext.mods.battlerboss.cinematic.CinematicTaskEpicTrailer
// File: ext\mods\battlerboss\cinematic\CinematicTaskEpicTrailer.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer.class
  Last modified 9 de jul de 2026; size 3497 bytes
  MD5 checksum 6db094d03df02d7e65da86e7089f1d97
  Compiled from "CinematicTaskEpicTrailer.java"
public class ext.mods.battlerboss.cinematic.CinematicTaskEpicTrailer
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #40                         // ext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 4, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/model/actor/Npc.getObjectId:()I
    #8 = Class              #10           // ext/mods/gameserver/model/actor/Npc
    #9 = NameAndType        #11:#12       // getObjectId:()I
   #10 = Utf8               ext/mods/gameserver/model/actor/Npc
   #11 = Utf8               getObjectId
   #12 = Utf8               ()I
   #13 = Methodref          #8.#14        // ext/mods/gameserver/model/actor/Npc.setIsParalyzed:(Z)V
   #14 = NameAndType        #15:#16       // setIsParalyzed:(Z)V
   #15 = Utf8               setIsParalyzed
   #16 = Utf8               (Z)V
   #17 = Class              #18           // ext/mods/gameserver/network/serverpackets/StopMove
   #18 = Utf8               ext/mods/gameserver/network/serverpackets/StopMove
   #19 = Methodref          #17.#20       // ext/mods/gameserver/network/serverpackets/StopMove."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
   #20 = NameAndType        #5:#21        // "<init>":(Lext/mods/gameserver/model/actor/Creature;)V
   #21 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
   #22 = Methodref          #8.#23        // ext/mods/gameserver/model/actor/Npc.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #23 = NameAndType        #24:#25       // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #24 = Utf8               broadcastPacket
   #25 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #26 = Methodref          #27.#28       // ext/mods/gameserver/model/actor/Player.setInvul:(Z)V
   #27 = Class              #29           // ext/mods/gameserver/model/actor/Player
   #28 = NameAndType        #30:#16       // setInvul:(Z)V
   #29 = Utf8               ext/mods/gameserver/model/actor/Player
   #30 = Utf8               setInvul
   #31 = Methodref          #27.#32       // ext/mods/gameserver/model/actor/Player.setIsImmobilized:(Z)V
   #32 = NameAndType        #33:#16       // setIsImmobilized:(Z)V
   #33 = Utf8               setIsImmobilized
   #34 = Class              #35           // ext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep
   #35 = Utf8               ext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep
   #36 = Methodref          #34.#37       // ext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep."<init>":(IIIII)V
   #37 = NameAndType        #5:#38        // "<init>":(IIIII)V
   #38 = Utf8               (IIIII)V
   #39 = Methodref          #40.#41       // ext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer.runStep:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;I[Lext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep;I)V
   #40 = Class              #42           // ext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer
   #41 = NameAndType        #43:#44       // runStep:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;I[Lext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep;I)V
   #42 = Utf8               ext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer
   #43 = Utf8               runStep
   #44 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;I[Lext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep;I)V
   #45 = Fieldref           #46.#47       // ext/mods/gameserver/network/serverpackets/NormalCamera.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/NormalCamera;
   #46 = Class              #48           // ext/mods/gameserver/network/serverpackets/NormalCamera
   #47 = NameAndType        #49:#50       // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/NormalCamera;
   #48 = Utf8               ext/mods/gameserver/network/serverpackets/NormalCamera
   #49 = Utf8               STATIC_PACKET
   #50 = Utf8               Lext/mods/gameserver/network/serverpackets/NormalCamera;
   #51 = Methodref          #27.#52       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #52 = NameAndType        #53:#25       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #53 = Utf8               sendPacket
   #54 = Methodref          #8.#55        // ext/mods/gameserver/model/actor/Npc.setTarget:(Lext/mods/gameserver/model/WorldObject;)V
   #55 = NameAndType        #56:#57       // setTarget:(Lext/mods/gameserver/model/WorldObject;)V
   #56 = Utf8               setTarget
   #57 = Utf8               (Lext/mods/gameserver/model/WorldObject;)V
   #58 = Methodref          #8.#59        // ext/mods/gameserver/model/actor/Npc.getAttack:()Lext/mods/gameserver/model/actor/attack/NpcAttack;
   #59 = NameAndType        #60:#61       // getAttack:()Lext/mods/gameserver/model/actor/attack/NpcAttack;
   #60 = Utf8               getAttack
   #61 = Utf8               ()Lext/mods/gameserver/model/actor/attack/NpcAttack;
   #62 = Methodref          #63.#64       // ext/mods/gameserver/model/actor/attack/NpcAttack.doAttack:(Lext/mods/gameserver/model/actor/Creature;)V
   #63 = Class              #65           // ext/mods/gameserver/model/actor/attack/NpcAttack
   #64 = NameAndType        #66:#21       // doAttack:(Lext/mods/gameserver/model/actor/Creature;)V
   #65 = Utf8               ext/mods/gameserver/model/actor/attack/NpcAttack
   #66 = Utf8               doAttack
   #67 = Class              #68           // ext/mods/gameserver/network/serverpackets/SpecialCamera
   #68 = Utf8               ext/mods/gameserver/network/serverpackets/SpecialCamera
   #69 = Methodref          #34.#70       // ext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep.dist:()I
   #70 = NameAndType        #71:#12       // dist:()I
   #71 = Utf8               dist
   #72 = Methodref          #34.#73       // ext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep.yaw:()I
   #73 = NameAndType        #74:#12       // yaw:()I
   #74 = Utf8               yaw
   #75 = Methodref          #34.#76       // ext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep.pitch:()I
   #76 = NameAndType        #77:#12       // pitch:()I
   #77 = Utf8               pitch
   #78 = Methodref          #34.#79       // ext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep.time:()I
   #79 = NameAndType        #80:#12       // time:()I
   #80 = Utf8               time
   #81 = Methodref          #34.#82       // ext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep.duration:()I
   #82 = NameAndType        #83:#12       // duration:()I
   #83 = Utf8               duration
   #84 = Methodref          #67.#85       // ext/mods/gameserver/network/serverpackets/SpecialCamera."<init>":(IIIIIIIIII)V
   #85 = NameAndType        #5:#86        // "<init>":(IIIIIIIIII)V
   #86 = Utf8               (IIIIIIIIII)V
   #87 = InvokeDynamic      #0:#88        // #0:run:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;I[Lext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep;I)Ljava/lang/Runnable;
   #88 = NameAndType        #89:#90       // run:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;I[Lext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep;I)Ljava/lang/Runnable;
   #89 = Utf8               run
   #90 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;I[Lext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep;I)Ljava/lang/Runnable;
   #91 = Methodref          #92.#93       // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #92 = Class              #94           // ext/mods/commons/pool/ThreadPool
   #93 = NameAndType        #95:#96       // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #94 = Utf8               ext/mods/commons/pool/ThreadPool
   #95 = Utf8               schedule
   #96 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #97 = Utf8               Code
   #98 = Utf8               LineNumberTable
   #99 = Utf8               LocalVariableTable
  #100 = Utf8               this
  #101 = Utf8               Lext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer;
  #102 = Utf8               playNpcCinematic
  #103 = Utf8               (Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
  #104 = Utf8               boss
  #105 = Utf8               Lext/mods/gameserver/model/actor/Npc;
  #106 = Utf8               player
  #107 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #108 = Utf8               objId
  #109 = Utf8               I
  #110 = Utf8               steps
  #111 = Utf8               [Lext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep;
  #112 = Utf8               index
  #113 = Utf8               step
  #114 = Utf8               Lext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep;
  #115 = Utf8               StackMapTable
  #116 = Utf8               lambda$runStep$0
  #117 = Utf8               SourceFile
  #118 = Utf8               CinematicTaskEpicTrailer.java
  #119 = Utf8               NestMembers
  #120 = Utf8               BootstrapMethods
  #121 = MethodType         #6            //  ()V
  #122 = MethodHandle       6:#123        // REF_invokeStatic ext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer.lambda$runStep$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;I[Lext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep;I)V
  #123 = Methodref          #40.#124      // ext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer.lambda$runStep$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;I[Lext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep;I)V
  #124 = NameAndType        #116:#44      // lambda$runStep$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;I[Lext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep;I)V
  #125 = MethodHandle       6:#126        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #126 = Methodref          #127.#128     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #127 = Class              #129          // java/lang/invoke/LambdaMetafactory
  #128 = NameAndType        #130:#131     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #129 = Utf8               java/lang/invoke/LambdaMetafactory
  #130 = Utf8               metafactory
  #131 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #132 = Utf8               InnerClasses
  #133 = Utf8               CameraStep
  #134 = Class              #135          // java/lang/invoke/MethodHandles$Lookup
  #135 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #136 = Class              #137          // java/lang/invoke/MethodHandles
  #137 = Utf8               java/lang/invoke/MethodHandles
  #138 = Utf8               Lookup
{
  public ext.mods.battlerboss.cinematic.CinematicTaskEpicTrailer();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 27: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer;

  public static void playNpcCinematic(ext.mods.gameserver.model.actor.Npc, ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=10, locals=4, args_size=2
         0: aload_0
         1: invokevirtual #7                  // Method ext/mods/gameserver/model/actor/Npc.getObjectId:()I
         4: istore_2
         5: aload_0
         6: iconst_1
         7: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Npc.setIsParalyzed:(Z)V
        10: aload_0
        11: new           #17                 // class ext/mods/gameserver/network/serverpackets/StopMove
        14: dup
        15: aload_0
        16: invokespecial #19                 // Method ext/mods/gameserver/network/serverpackets/StopMove."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
        19: invokevirtual #22                 // Method ext/mods/gameserver/model/actor/Npc.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        22: aload_1
        23: iconst_1
        24: invokevirtual #26                 // Method ext/mods/gameserver/model/actor/Player.setInvul:(Z)V
        27: aload_1
        28: iconst_1
        29: invokevirtual #31                 // Method ext/mods/gameserver/model/actor/Player.setIsImmobilized:(Z)V
        32: bipush        6
        34: anewarray     #34                 // class ext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep
        37: dup
        38: iconst_0
        39: new           #34                 // class ext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep
        42: dup
        43: bipush        100
        45: sipush        180
        48: bipush        30
        50: sipush        3000
        53: sipush        5000
        56: invokespecial #36                 // Method ext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep."<init>":(IIIII)V
        59: aastore
        60: dup
        61: iconst_1
        62: new           #34                 // class ext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep
        65: dup
        66: sipush        150
        69: sipush        270
        72: bipush        25
        74: sipush        3000
        77: sipush        5000
        80: invokespecial #36                 // Method ext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep."<init>":(IIIII)V
        83: aastore
        84: dup
        85: iconst_2
        86: new           #34                 // class ext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep
        89: dup
        90: sipush        160
        93: sipush        360
        96: bipush        20
        98: sipush        3000
       101: sipush        5000
       104: invokespecial #36                 // Method ext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep."<init>":(IIIII)V
       107: aastore
       108: dup
       109: iconst_3
       110: new           #34                 // class ext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep
       113: dup
       114: sipush        160
       117: sipush        450
       120: bipush        10
       122: sipush        3000
       125: sipush        5000
       128: invokespecial #36                 // Method ext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep."<init>":(IIIII)V
       131: aastore
       132: dup
       133: iconst_4
       134: new           #34                 // class ext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep
       137: dup
       138: sipush        160
       141: sipush        560
       144: iconst_0
       145: sipush        7000
       148: sipush        10000
       151: invokespecial #36                 // Method ext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep."<init>":(IIIII)V
       154: aastore
       155: dup
       156: iconst_5
       157: new           #34                 // class ext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep
       160: dup
       161: bipush        70
       163: sipush        560
       166: iconst_0
       167: sipush        500
       170: sipush        1000
       173: invokespecial #36                 // Method ext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep."<init>":(IIIII)V
       176: aastore
       177: astore_3
       178: aload_1
       179: aload_0
       180: iload_2
       181: aload_3
       182: iconst_0
       183: invokestatic  #39                 // Method runStep:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;I[Lext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep;I)V
       186: return
      LineNumberTable:
        line 35: 0
        line 37: 5
        line 38: 10
        line 39: 22
        line 40: 27
        line 42: 32
        line 52: 178
        line 53: 186
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     187     0  boss   Lext/mods/gameserver/model/actor/Npc;
            0     187     1 player   Lext/mods/gameserver/model/actor/Player;
            5     182     2 objId   I
          178       9     3 steps   [Lext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep;
}
SourceFile: "CinematicTaskEpicTrailer.java"
NestMembers:
  ext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep
BootstrapMethods:
  0: #125 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #121 ()V
      #122 REF_invokeStatic ext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer.lambda$runStep$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;I[Lext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep;I)V
      #121 ()V
InnerClasses:
  public static final #138= #134 of #136; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
