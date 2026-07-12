// Bytecode for: ext.mods.gameserver.model.zone.type.WaterZone
// File: ext\mods\gameserver\model\zone\type\WaterZone.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/zone/type/WaterZone.class
  Last modified 9 de jul de 2026; size 3691 bytes
  MD5 checksum 115e8e5359fba240231ecc425c79fbd1
  Compiled from "WaterZone.java"
public class ext.mods.gameserver.model.zone.type.WaterZone extends ext.mods.gameserver.model.zone.type.subtype.ZoneType
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #60                         // ext/mods/gameserver/model/zone/type/WaterZone
  super_class: #2                         // ext/mods/gameserver/model/zone/type/subtype/ZoneType
  interfaces: 0, fields: 0, methods: 6, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/zone/type/subtype/ZoneType."<init>":(I)V
    #2 = Class              #4            // ext/mods/gameserver/model/zone/type/subtype/ZoneType
    #3 = NameAndType        #5:#6         // "<init>":(I)V
    #4 = Utf8               ext/mods/gameserver/model/zone/type/subtype/ZoneType
    #5 = Utf8               <init>
    #6 = Utf8               (I)V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/enums/ZoneId.WATER:Lext/mods/gameserver/enums/ZoneId;
    #8 = Class              #10           // ext/mods/gameserver/enums/ZoneId
    #9 = NameAndType        #11:#12       // WATER:Lext/mods/gameserver/enums/ZoneId;
   #10 = Utf8               ext/mods/gameserver/enums/ZoneId
   #11 = Utf8               WATER
   #12 = Utf8               Lext/mods/gameserver/enums/ZoneId;
   #13 = Methodref          #14.#15       // ext/mods/gameserver/model/actor/Creature.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
   #14 = Class              #16           // ext/mods/gameserver/model/actor/Creature
   #15 = NameAndType        #17:#18       // isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
   #16 = Utf8               ext/mods/gameserver/model/actor/Creature
   #17 = Utf8               isInsideZone
   #18 = Utf8               (Lext/mods/gameserver/enums/ZoneId;)Z
   #19 = Methodref          #14.#20       // ext/mods/gameserver/model/actor/Creature.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
   #20 = NameAndType        #21:#22       // setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
   #21 = Utf8               setInsideZone
   #22 = Utf8               (Lext/mods/gameserver/enums/ZoneId;Z)V
   #23 = Methodref          #14.#24       // ext/mods/gameserver/model/actor/Creature.getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
   #24 = NameAndType        #25:#26       // getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
   #25 = Utf8               getMove
   #26 = Utf8               ()Lext/mods/gameserver/model/actor/move/CreatureMove;
   #27 = Fieldref           #28.#29       // ext/mods/gameserver/enums/actors/MoveType.SWIM:Lext/mods/gameserver/enums/actors/MoveType;
   #28 = Class              #30           // ext/mods/gameserver/enums/actors/MoveType
   #29 = NameAndType        #31:#32       // SWIM:Lext/mods/gameserver/enums/actors/MoveType;
   #30 = Utf8               ext/mods/gameserver/enums/actors/MoveType
   #31 = Utf8               SWIM
   #32 = Utf8               Lext/mods/gameserver/enums/actors/MoveType;
   #33 = Methodref          #34.#35       // ext/mods/gameserver/model/actor/move/CreatureMove.addMoveType:(Lext/mods/gameserver/enums/actors/MoveType;)V
   #34 = Class              #36           // ext/mods/gameserver/model/actor/move/CreatureMove
   #35 = NameAndType        #37:#38       // addMoveType:(Lext/mods/gameserver/enums/actors/MoveType;)V
   #36 = Utf8               ext/mods/gameserver/model/actor/move/CreatureMove
   #37 = Utf8               addMoveType
   #38 = Utf8               (Lext/mods/gameserver/enums/actors/MoveType;)V
   #39 = Class              #40           // ext/mods/gameserver/model/actor/Player
   #40 = Utf8               ext/mods/gameserver/model/actor/Player
   #41 = Methodref          #39.#42       // ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
   #42 = NameAndType        #43:#44       // broadcastUserInfo:()V
   #43 = Utf8               broadcastUserInfo
   #44 = Utf8               ()V
   #45 = Class              #46           // ext/mods/gameserver/model/actor/Npc
   #46 = Utf8               ext/mods/gameserver/model/actor/Npc
   #47 = InvokeDynamic      #0:#48        // #0:accept:(Lext/mods/gameserver/model/actor/Npc;)Ljava/util/function/Consumer;
   #48 = NameAndType        #49:#50       // accept:(Lext/mods/gameserver/model/actor/Npc;)Ljava/util/function/Consumer;
   #49 = Utf8               accept
   #50 = Utf8               (Lext/mods/gameserver/model/actor/Npc;)Ljava/util/function/Consumer;
   #51 = Methodref          #45.#52       // ext/mods/gameserver/model/actor/Npc.forEachKnownType:(Ljava/lang/Class;Ljava/util/function/Consumer;)V
   #52 = NameAndType        #53:#54       // forEachKnownType:(Ljava/lang/Class;Ljava/util/function/Consumer;)V
   #53 = Utf8               forEachKnownType
   #54 = Utf8               (Ljava/lang/Class;Ljava/util/function/Consumer;)V
   #55 = Methodref          #34.#56       // ext/mods/gameserver/model/actor/move/CreatureMove.removeMoveType:(Lext/mods/gameserver/enums/actors/MoveType;)V
   #56 = NameAndType        #57:#38       // removeMoveType:(Lext/mods/gameserver/enums/actors/MoveType;)V
   #57 = Utf8               removeMoveType
   #58 = InvokeDynamic      #1:#48        // #1:accept:(Lext/mods/gameserver/model/actor/Npc;)Ljava/util/function/Consumer;
   #59 = Methodref          #60.#61       // ext/mods/gameserver/model/zone/type/WaterZone.getZone:()Lext/mods/gameserver/model/zone/ZoneForm;
   #60 = Class              #62           // ext/mods/gameserver/model/zone/type/WaterZone
   #61 = NameAndType        #63:#64       // getZone:()Lext/mods/gameserver/model/zone/ZoneForm;
   #62 = Utf8               ext/mods/gameserver/model/zone/type/WaterZone
   #63 = Utf8               getZone
   #64 = Utf8               ()Lext/mods/gameserver/model/zone/ZoneForm;
   #65 = Methodref          #66.#67       // ext/mods/gameserver/model/zone/ZoneForm.getHighZ:()I
   #66 = Class              #68           // ext/mods/gameserver/model/zone/ZoneForm
   #67 = NameAndType        #69:#70       // getHighZ:()I
   #68 = Utf8               ext/mods/gameserver/model/zone/ZoneForm
   #69 = Utf8               getHighZ
   #70 = Utf8               ()I
   #71 = Methodref          #45.#72       // ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
   #72 = NameAndType        #73:#74       // getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
   #73 = Utf8               getStatus
   #74 = Utf8               ()Lext/mods/gameserver/model/actor/status/NpcStatus;
   #75 = Methodref          #76.#77       // ext/mods/gameserver/model/actor/status/NpcStatus.getMoveSpeed:()F
   #76 = Class              #78           // ext/mods/gameserver/model/actor/status/NpcStatus
   #77 = NameAndType        #79:#80       // getMoveSpeed:()F
   #78 = Utf8               ext/mods/gameserver/model/actor/status/NpcStatus
   #79 = Utf8               getMoveSpeed
   #80 = Utf8               ()F
   #81 = Class              #82           // ext/mods/gameserver/network/serverpackets/ServerObjectInfo
   #82 = Utf8               ext/mods/gameserver/network/serverpackets/ServerObjectInfo
   #83 = Methodref          #81.#84       // ext/mods/gameserver/network/serverpackets/ServerObjectInfo."<init>":(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;)V
   #84 = NameAndType        #5:#85        // "<init>":(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;)V
   #85 = Utf8               (Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;)V
   #86 = Methodref          #39.#87       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #87 = NameAndType        #88:#89       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #88 = Utf8               sendPacket
   #89 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #90 = Class              #91           // ext/mods/gameserver/network/serverpackets/AbstractNpcInfo$NpcInfo
   #91 = Utf8               ext/mods/gameserver/network/serverpackets/AbstractNpcInfo$NpcInfo
   #92 = Methodref          #90.#93       // ext/mods/gameserver/network/serverpackets/AbstractNpcInfo$NpcInfo."<init>":(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
   #93 = NameAndType        #5:#94        // "<init>":(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
   #94 = Utf8               (Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
   #95 = Utf8               Code
   #96 = Utf8               LineNumberTable
   #97 = Utf8               LocalVariableTable
   #98 = Utf8               this
   #99 = Utf8               Lext/mods/gameserver/model/zone/type/WaterZone;
  #100 = Utf8               id
  #101 = Utf8               I
  #102 = Utf8               onEnter
  #103 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
  #104 = Utf8               player
  #105 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #106 = Utf8               npc
  #107 = Utf8               Lext/mods/gameserver/model/actor/Npc;
  #108 = Utf8               creature
  #109 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #110 = Utf8               wasInsideWater
  #111 = Utf8               Z
  #112 = Utf8               StackMapTable
  #113 = Utf8               onExit
  #114 = Utf8               getWaterZ
  #115 = Utf8               lambda$onExit$0
  #116 = Utf8               lambda$onEnter$0
  #117 = Utf8               SourceFile
  #118 = Utf8               WaterZone.java
  #119 = Utf8               BootstrapMethods
  #120 = MethodType         #121          //  (Ljava/lang/Object;)V
  #121 = Utf8               (Ljava/lang/Object;)V
  #122 = MethodHandle       6:#123        // REF_invokeStatic ext/mods/gameserver/model/zone/type/WaterZone.lambda$onEnter$0:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
  #123 = Methodref          #60.#124      // ext/mods/gameserver/model/zone/type/WaterZone.lambda$onEnter$0:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
  #124 = NameAndType        #116:#94      // lambda$onEnter$0:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
  #125 = MethodType         #126          //  (Lext/mods/gameserver/model/actor/Player;)V
  #126 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #127 = MethodHandle       6:#128        // REF_invokeStatic ext/mods/gameserver/model/zone/type/WaterZone.lambda$onExit$0:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
  #128 = Methodref          #60.#129      // ext/mods/gameserver/model/zone/type/WaterZone.lambda$onExit$0:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
  #129 = NameAndType        #115:#94      // lambda$onExit$0:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
  #130 = MethodHandle       6:#131        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #131 = Methodref          #132.#133     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #132 = Class              #134          // java/lang/invoke/LambdaMetafactory
  #133 = NameAndType        #135:#136     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #134 = Utf8               java/lang/invoke/LambdaMetafactory
  #135 = Utf8               metafactory
  #136 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #137 = Utf8               InnerClasses
  #138 = Class              #139          // ext/mods/gameserver/network/serverpackets/AbstractNpcInfo
  #139 = Utf8               ext/mods/gameserver/network/serverpackets/AbstractNpcInfo
  #140 = Utf8               NpcInfo
  #141 = Class              #142          // java/lang/invoke/MethodHandles$Lookup
  #142 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #143 = Class              #144          // java/lang/invoke/MethodHandles
  #144 = Utf8               java/lang/invoke/MethodHandles
  #145 = Utf8               Lookup
{
  public ext.mods.gameserver.model.zone.type.WaterZone(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/zone/type/subtype/ZoneType."<init>":(I)V
         5: return
      LineNumberTable:
        line 36: 0
        line 37: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/zone/type/WaterZone;
            0       6     1    id   I

  protected void onEnter(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=5, args_size=2
         0: aload_1
         1: getstatic     #7                  // Field ext/mods/gameserver/enums/ZoneId.WATER:Lext/mods/gameserver/enums/ZoneId;
         4: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Creature.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
         7: istore_2
         8: aload_1
         9: getstatic     #7                  // Field ext/mods/gameserver/enums/ZoneId.WATER:Lext/mods/gameserver/enums/ZoneId;
        12: iconst_1
        13: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Creature.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
        16: iload_2
        17: ifeq          21
        20: return
        21: aload_1
        22: invokevirtual #23                 // Method ext/mods/gameserver/model/actor/Creature.getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
        25: getstatic     #27                 // Field ext/mods/gameserver/enums/actors/MoveType.SWIM:Lext/mods/gameserver/enums/actors/MoveType;
        28: invokevirtual #33                 // Method ext/mods/gameserver/model/actor/move/CreatureMove.addMoveType:(Lext/mods/gameserver/enums/actors/MoveType;)V
        31: aload_1
        32: instanceof    #39                 // class ext/mods/gameserver/model/actor/Player
        35: ifeq          50
        38: aload_1
        39: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
        42: astore_3
        43: aload_3
        44: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
        47: goto          77
        50: aload_1
        51: instanceof    #45                 // class ext/mods/gameserver/model/actor/Npc
        54: ifeq          77
        57: aload_1
        58: checkcast     #45                 // class ext/mods/gameserver/model/actor/Npc
        61: astore        4
        63: aload         4
        65: ldc           #39                 // class ext/mods/gameserver/model/actor/Player
        67: aload         4
        69: invokedynamic #47,  0             // InvokeDynamic #0:accept:(Lext/mods/gameserver/model/actor/Npc;)Ljava/util/function/Consumer;
        74: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Npc.forEachKnownType:(Ljava/lang/Class;Ljava/util/function/Consumer;)V
        77: return
      LineNumberTable:
        line 42: 0
        line 43: 8
        line 45: 16
        line 46: 20
        line 48: 21
        line 50: 31
        line 51: 43
        line 52: 50
        line 54: 63
        line 62: 77
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           43       7     3 player   Lext/mods/gameserver/model/actor/Player;
           63      14     4   npc   Lext/mods/gameserver/model/actor/Npc;
            0      78     0  this   Lext/mods/gameserver/model/zone/type/WaterZone;
            0      78     1 creature   Lext/mods/gameserver/model/actor/Creature;
            8      70     2 wasInsideWater   Z
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 21
          locals = [ int ]
        frame_type = 28 /* same */
        frame_type = 26 /* same */

  protected void onExit(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=4, args_size=2
         0: aload_1
         1: getstatic     #7                  // Field ext/mods/gameserver/enums/ZoneId.WATER:Lext/mods/gameserver/enums/ZoneId;
         4: iconst_0
         5: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Creature.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
         8: aload_1
         9: getstatic     #7                  // Field ext/mods/gameserver/enums/ZoneId.WATER:Lext/mods/gameserver/enums/ZoneId;
        12: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Creature.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
        15: ifeq          19
        18: return
        19: aload_1
        20: invokevirtual #23                 // Method ext/mods/gameserver/model/actor/Creature.getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
        23: getstatic     #27                 // Field ext/mods/gameserver/enums/actors/MoveType.SWIM:Lext/mods/gameserver/enums/actors/MoveType;
        26: invokevirtual #55                 // Method ext/mods/gameserver/model/actor/move/CreatureMove.removeMoveType:(Lext/mods/gameserver/enums/actors/MoveType;)V
        29: aload_1
        30: instanceof    #39                 // class ext/mods/gameserver/model/actor/Player
        33: ifeq          48
        36: aload_1
        37: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
        40: astore_2
        41: aload_2
        42: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
        45: goto          72
        48: aload_1
        49: instanceof    #45                 // class ext/mods/gameserver/model/actor/Npc
        52: ifeq          72
        55: aload_1
        56: checkcast     #45                 // class ext/mods/gameserver/model/actor/Npc
        59: astore_3
        60: aload_3
        61: ldc           #39                 // class ext/mods/gameserver/model/actor/Player
        63: aload_3
        64: invokedynamic #58,  0             // InvokeDynamic #1:accept:(Lext/mods/gameserver/model/actor/Npc;)Ljava/util/function/Consumer;
        69: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Npc.forEachKnownType:(Ljava/lang/Class;Ljava/util/function/Consumer;)V
        72: return
      LineNumberTable:
        line 67: 0
        line 69: 8
        line 70: 18
        line 72: 19
        line 74: 29
        line 75: 41
        line 76: 48
        line 78: 60
        line 86: 72
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           41       7     2 player   Lext/mods/gameserver/model/actor/Player;
           60      12     3   npc   Lext/mods/gameserver/model/actor/Npc;
            0      73     0  this   Lext/mods/gameserver/model/zone/type/WaterZone;
            0      73     1 creature   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 3
        frame_type = 19 /* same */
        frame_type = 28 /* same */
        frame_type = 23 /* same */

  public int getWaterZ();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #59                 // Method getZone:()Lext/mods/gameserver/model/zone/ZoneForm;
         4: invokevirtual #65                 // Method ext/mods/gameserver/model/zone/ZoneForm.getHighZ:()I
         7: ireturn
      LineNumberTable:
        line 90: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/zone/type/WaterZone;
}
SourceFile: "WaterZone.java"
BootstrapMethods:
  0: #130 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #120 (Ljava/lang/Object;)V
      #122 REF_invokeStatic ext/mods/gameserver/model/zone/type/WaterZone.lambda$onEnter$0:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
      #125 (Lext/mods/gameserver/model/actor/Player;)V
  1: #130 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #120 (Ljava/lang/Object;)V
      #127 REF_invokeStatic ext/mods/gameserver/model/zone/type/WaterZone.lambda$onExit$0:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
      #125 (Lext/mods/gameserver/model/actor/Player;)V
InnerClasses:
  public static #140= #90 of #138;        // NpcInfo=class ext/mods/gameserver/network/serverpackets/AbstractNpcInfo$NpcInfo of class ext/mods/gameserver/network/serverpackets/AbstractNpcInfo
  public static final #145= #141 of #143; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
