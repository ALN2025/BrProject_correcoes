// Bytecode for: ext.mods.gameserver.model.actor.ai.type.DoorAI
// File: ext\mods\gameserver\model\actor\ai\type\DoorAI.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/ai/type/DoorAI.class
  Last modified 9 de jul de 2026; size 1092 bytes
  MD5 checksum c73e1cfc1a097fa33e4e1a0053010b1e
  Compiled from "DoorAI.java"
public class ext.mods.gameserver.model.actor.ai.type.DoorAI extends ext.mods.gameserver.model.actor.ai.type.CreatureAI<ext.mods.gameserver.model.actor.instance.Door>
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #7                          // ext/mods/gameserver/model/actor/ai/type/DoorAI
  super_class: #2                         // ext/mods/gameserver/model/actor/ai/type/CreatureAI
  interfaces: 0, fields: 0, methods: 6, attributes: 2
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/model/actor/ai/type/CreatureAI."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
   #2 = Class              #4             // ext/mods/gameserver/model/actor/ai/type/CreatureAI
   #3 = NameAndType        #5:#6          // "<init>":(Lext/mods/gameserver/model/actor/Creature;)V
   #4 = Utf8               ext/mods/gameserver/model/actor/ai/type/CreatureAI
   #5 = Utf8               <init>
   #6 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
   #7 = Class              #8             // ext/mods/gameserver/model/actor/ai/type/DoorAI
   #8 = Utf8               ext/mods/gameserver/model/actor/ai/type/DoorAI
   #9 = Utf8               (Lext/mods/gameserver/model/actor/instance/Door;)V
  #10 = Utf8               Code
  #11 = Utf8               LineNumberTable
  #12 = Utf8               LocalVariableTable
  #13 = Utf8               this
  #14 = Utf8               Lext/mods/gameserver/model/actor/ai/type/DoorAI;
  #15 = Utf8               door
  #16 = Utf8               Lext/mods/gameserver/model/actor/instance/Door;
  #17 = Utf8               onEvtAttacked
  #18 = Utf8               attacker
  #19 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #20 = Utf8               onEvtFinishedAttack
  #21 = Utf8               ()V
  #22 = Utf8               onEvtArrived
  #23 = Utf8               onEvtArrivedBlocked
  #24 = Utf8               onEvtDead
  #25 = Utf8               Signature
  #26 = Utf8               Lext/mods/gameserver/model/actor/ai/type/CreatureAI<Lext/mods/gameserver/model/actor/instance/Door;>;
  #27 = Utf8               SourceFile
  #28 = Utf8               DoorAI.java
{
  public ext.mods.gameserver.model.actor.ai.type.DoorAI(ext.mods.gameserver.model.actor.instance.Door);
    descriptor: (Lext/mods/gameserver/model/actor/instance/Door;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/actor/ai/type/CreatureAI."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
         5: return
      LineNumberTable:
        line 27: 0
        line 28: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/ai/type/DoorAI;
            0       6     1  door   Lext/mods/gameserver/model/actor/instance/Door;

  protected void onEvtAttacked(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=0, locals=2, args_size=2
         0: return
      LineNumberTable:
        line 33: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/ai/type/DoorAI;
            0       1     1 attacker   Lext/mods/gameserver/model/actor/Creature;

  protected void onEvtFinishedAttack();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=0, locals=1, args_size=1
         0: return
      LineNumberTable:
        line 38: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/ai/type/DoorAI;

  protected void onEvtArrived();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=0, locals=1, args_size=1
         0: return
      LineNumberTable:
        line 43: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/ai/type/DoorAI;

  protected void onEvtArrivedBlocked();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=0, locals=1, args_size=1
         0: return
      LineNumberTable:
        line 48: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/ai/type/DoorAI;

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
            0       1     0  this   Lext/mods/gameserver/model/actor/ai/type/DoorAI;
}
Signature: #26                          // Lext/mods/gameserver/model/actor/ai/type/CreatureAI<Lext/mods/gameserver/model/actor/instance/Door;>;
SourceFile: "DoorAI.java"
