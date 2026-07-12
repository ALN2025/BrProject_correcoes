// Bytecode for: ext.mods.gameserver.model.actor.ai.type.BoatAI
// File: ext\mods\gameserver\model\actor\ai\type\BoatAI.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/ai/type/BoatAI.class
  Last modified 9 de jul de 2026; size 1699 bytes
  MD5 checksum d03774e407b6713067619f25d7387919
  Compiled from "BoatAI.java"
public class ext.mods.gameserver.model.actor.ai.type.BoatAI extends ext.mods.gameserver.model.actor.ai.type.CreatureAI<ext.mods.gameserver.model.actor.Boat>
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/ai/type/BoatAI
  super_class: #2                         // ext/mods/gameserver/model/actor/ai/type/CreatureAI
  interfaces: 0, fields: 0, methods: 6, attributes: 2
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/model/actor/ai/type/CreatureAI."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
   #2 = Class              #4             // ext/mods/gameserver/model/actor/ai/type/CreatureAI
   #3 = NameAndType        #5:#6          // "<init>":(Lext/mods/gameserver/model/actor/Creature;)V
   #4 = Utf8               ext/mods/gameserver/model/actor/ai/type/CreatureAI
   #5 = Utf8               <init>
   #6 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/actor/ai/type/BoatAI._actor:Lext/mods/gameserver/model/actor/Creature;
   #8 = Class              #10            // ext/mods/gameserver/model/actor/ai/type/BoatAI
   #9 = NameAndType        #11:#12        // _actor:Lext/mods/gameserver/model/actor/Creature;
  #10 = Utf8               ext/mods/gameserver/model/actor/ai/type/BoatAI
  #11 = Utf8               _actor
  #12 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #13 = Class              #14            // ext/mods/gameserver/model/actor/Boat
  #14 = Utf8               ext/mods/gameserver/model/actor/Boat
  #15 = Methodref          #13.#16        // ext/mods/gameserver/model/actor/Boat.isMoving:()Z
  #16 = NameAndType        #17:#18        // isMoving:()Z
  #17 = Utf8               isMoving
  #18 = Utf8               ()Z
  #19 = Class              #20            // ext/mods/gameserver/network/serverpackets/VehicleDeparture
  #20 = Utf8               ext/mods/gameserver/network/serverpackets/VehicleDeparture
  #21 = Methodref          #19.#22        // ext/mods/gameserver/network/serverpackets/VehicleDeparture."<init>":(Lext/mods/gameserver/model/actor/Boat;)V
  #22 = NameAndType        #5:#23         // "<init>":(Lext/mods/gameserver/model/actor/Boat;)V
  #23 = Utf8               (Lext/mods/gameserver/model/actor/Boat;)V
  #24 = Methodref          #25.#26        // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #25 = Class              #27            // ext/mods/gameserver/model/actor/Player
  #26 = NameAndType        #28:#29        // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #27 = Utf8               ext/mods/gameserver/model/actor/Player
  #28 = Utf8               sendPacket
  #29 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #30 = Methodref          #13.#31        // ext/mods/gameserver/model/actor/Boat.getMove:()Lext/mods/gameserver/model/actor/move/BoatMove;
  #31 = NameAndType        #32:#33        // getMove:()Lext/mods/gameserver/model/actor/move/BoatMove;
  #32 = Utf8               getMove
  #33 = Utf8               ()Lext/mods/gameserver/model/actor/move/BoatMove;
  #34 = Methodref          #35.#36        // ext/mods/gameserver/model/actor/move/BoatMove.onArrival:()V
  #35 = Class              #37            // ext/mods/gameserver/model/actor/move/BoatMove
  #36 = NameAndType        #38:#39        // onArrival:()V
  #37 = Utf8               ext/mods/gameserver/model/actor/move/BoatMove
  #38 = Utf8               onArrival
  #39 = Utf8               ()V
  #40 = Utf8               Code
  #41 = Utf8               LineNumberTable
  #42 = Utf8               LocalVariableTable
  #43 = Utf8               this
  #44 = Utf8               Lext/mods/gameserver/model/actor/ai/type/BoatAI;
  #45 = Utf8               boat
  #46 = Utf8               Lext/mods/gameserver/model/actor/Boat;
  #47 = Utf8               describeStateToPlayer
  #48 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #49 = Utf8               player
  #50 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #51 = Utf8               StackMapTable
  #52 = Utf8               onEvtAttacked
  #53 = Utf8               attacker
  #54 = Utf8               onEvtArrived
  #55 = Utf8               onEvtDead
  #56 = Utf8               onEvtFinishedCasting
  #57 = Utf8               Signature
  #58 = Utf8               Lext/mods/gameserver/model/actor/ai/type/CreatureAI<Lext/mods/gameserver/model/actor/Boat;>;
  #59 = Utf8               SourceFile
  #60 = Utf8               BoatAI.java
{
  public ext.mods.gameserver.model.actor.ai.type.BoatAI(ext.mods.gameserver.model.actor.Boat);
    descriptor: (Lext/mods/gameserver/model/actor/Boat;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/actor/ai/type/CreatureAI."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
         5: return
      LineNumberTable:
        line 29: 0
        line 30: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/ai/type/BoatAI;
            0       6     1  boat   Lext/mods/gameserver/model/actor/Boat;

  public void describeStateToPlayer(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #13                 // class ext/mods/gameserver/model/actor/Boat
         7: invokevirtual #15                 // Method ext/mods/gameserver/model/actor/Boat.isMoving:()Z
        10: ifeq          31
        13: aload_1
        14: new           #19                 // class ext/mods/gameserver/network/serverpackets/VehicleDeparture
        17: dup
        18: aload_0
        19: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        22: checkcast     #13                 // class ext/mods/gameserver/model/actor/Boat
        25: invokespecial #21                 // Method ext/mods/gameserver/network/serverpackets/VehicleDeparture."<init>":(Lext/mods/gameserver/model/actor/Boat;)V
        28: invokevirtual #24                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        31: return
      LineNumberTable:
        line 35: 0
        line 36: 13
        line 37: 31
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      32     0  this   Lext/mods/gameserver/model/actor/ai/type/BoatAI;
            0      32     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 1
        frame_type = 31 /* same */

  public void onEvtAttacked(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=2, args_size=2
         0: return
      LineNumberTable:
        line 42: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/ai/type/BoatAI;
            0       1     1 attacker   Lext/mods/gameserver/model/actor/Creature;

  protected void onEvtArrived();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #13                 // class ext/mods/gameserver/model/actor/Boat
         7: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Boat.getMove:()Lext/mods/gameserver/model/actor/move/BoatMove;
        10: invokevirtual #34                 // Method ext/mods/gameserver/model/actor/move/BoatMove.onArrival:()V
        13: return
      LineNumberTable:
        line 47: 0
        line 48: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/model/actor/ai/type/BoatAI;

  protected void onEvtDead();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=0, locals=1, args_size=1
         0: return
      LineNumberTable:
        line 53: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/ai/type/BoatAI;

  protected void onEvtFinishedCasting();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=0, locals=1, args_size=1
         0: return
      LineNumberTable:
        line 58: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/ai/type/BoatAI;
}
Signature: #58                          // Lext/mods/gameserver/model/actor/ai/type/CreatureAI<Lext/mods/gameserver/model/actor/Boat;>;
SourceFile: "BoatAI.java"
