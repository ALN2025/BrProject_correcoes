// Bytecode for: ext.mods.gameserver.model.actor.instance.HolyThing
// File: ext\mods\gameserver\model\actor\instance\HolyThing.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/HolyThing.class
  Last modified 9 de jul de 2026; size 1747 bytes
  MD5 checksum aacec6cf61b15f493d76334d5f319f1a
  Compiled from "HolyThing.java"
public final class ext.mods.gameserver.model.actor.instance.HolyThing extends ext.mods.gameserver.model.actor.instance.Folk
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #18                         // ext/mods/gameserver/model/actor/instance/HolyThing
  super_class: #2                         // ext/mods/gameserver/model/actor/instance/Folk
  interfaces: 0, fields: 0, methods: 6, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/model/actor/instance/Folk."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
   #2 = Class              #4             // ext/mods/gameserver/model/actor/instance/Folk
   #3 = NameAndType        #5:#6          // "<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
   #4 = Utf8               ext/mods/gameserver/model/actor/instance/Folk
   #5 = Utf8               <init>
   #6 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
   #7 = Class              #8             // ext/mods/gameserver/network/serverpackets/ServerObjectInfo
   #8 = Utf8               ext/mods/gameserver/network/serverpackets/ServerObjectInfo
   #9 = Methodref          #7.#10         // ext/mods/gameserver/network/serverpackets/ServerObjectInfo."<init>":(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;)V
  #10 = NameAndType        #5:#11         // "<init>":(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;)V
  #11 = Utf8               (Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;)V
  #12 = Methodref          #13.#14        // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #13 = Class              #15            // ext/mods/gameserver/model/actor/Player
  #14 = NameAndType        #16:#17        // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #15 = Utf8               ext/mods/gameserver/model/actor/Player
  #16 = Utf8               sendPacket
  #17 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #18 = Class              #19            // ext/mods/gameserver/model/actor/instance/HolyThing
  #19 = Utf8               ext/mods/gameserver/model/actor/instance/HolyThing
  #20 = Utf8               Code
  #21 = Utf8               LineNumberTable
  #22 = Utf8               LocalVariableTable
  #23 = Utf8               this
  #24 = Utf8               Lext/mods/gameserver/model/actor/instance/HolyThing;
  #25 = Utf8               objectId
  #26 = Utf8               I
  #27 = Utf8               template
  #28 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #29 = Utf8               isAttackableBy
  #30 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
  #31 = Utf8               attacker
  #32 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #33 = Utf8               reduceCurrentHp
  #34 = Utf8               (DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #35 = Utf8               damage
  #36 = Utf8               D
  #37 = Utf8               skill
  #38 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #39 = Utf8               (DLext/mods/gameserver/model/actor/Creature;ZZLext/mods/gameserver/skills/L2Skill;)V
  #40 = Utf8               awake
  #41 = Utf8               Z
  #42 = Utf8               isDOT
  #43 = Utf8               onInteract
  #44 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #45 = Utf8               player
  #46 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #47 = Utf8               sendInfo
  #48 = Utf8               SourceFile
  #49 = Utf8               HolyThing.java
{
  public ext.mods.gameserver.model.actor.instance.HolyThing(int, ext.mods.gameserver.model.actor.template.NpcTemplate);
    descriptor: (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: aload_2
         3: invokespecial #1                  // Method ext/mods/gameserver/model/actor/instance/Folk."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
         6: return
      LineNumberTable:
        line 30: 0
        line 31: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/actor/instance/HolyThing;
            0       7     1 objectId   I
            0       7     2 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public boolean isAttackableBy(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=2, args_size=2
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 36: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/instance/HolyThing;
            0       2     1 attacker   Lext/mods/gameserver/model/actor/Creature;

  public void reduceCurrentHp(double, ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill);
    descriptor: (DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=5, args_size=4
         0: return
      LineNumberTable:
        line 42: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/instance/HolyThing;
            0       1     1 damage   D
            0       1     3 attacker   Lext/mods/gameserver/model/actor/Creature;
            0       1     4 skill   Lext/mods/gameserver/skills/L2Skill;

  public void reduceCurrentHp(double, ext.mods.gameserver.model.actor.Creature, boolean, boolean, ext.mods.gameserver.skills.L2Skill);
    descriptor: (DLext/mods/gameserver/model/actor/Creature;ZZLext/mods/gameserver/skills/L2Skill;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=7, args_size=6
         0: return
      LineNumberTable:
        line 47: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/instance/HolyThing;
            0       1     1 damage   D
            0       1     3 attacker   Lext/mods/gameserver/model/actor/Creature;
            0       1     4 awake   Z
            0       1     5 isDOT   Z
            0       1     6 skill   Lext/mods/gameserver/skills/L2Skill;

  public void onInteract(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=2, args_size=2
         0: return
      LineNumberTable:
        line 52: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/instance/HolyThing;
            0       1     1 player   Lext/mods/gameserver/model/actor/Player;

  public void sendInfo(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=2, args_size=2
         0: aload_1
         1: new           #7                  // class ext/mods/gameserver/network/serverpackets/ServerObjectInfo
         4: dup
         5: aload_0
         6: aload_1
         7: invokespecial #9                  // Method ext/mods/gameserver/network/serverpackets/ServerObjectInfo."<init>":(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;)V
        10: invokevirtual #12                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        13: return
      LineNumberTable:
        line 57: 0
        line 58: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/model/actor/instance/HolyThing;
            0      14     1 player   Lext/mods/gameserver/model/actor/Player;
}
SourceFile: "HolyThing.java"
