// Bytecode for: ext.mods.gameserver.model.actor.instance.EffectPoint
// File: ext\mods\gameserver\model\actor\instance\EffectPoint.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/EffectPoint.class
  Last modified 9 de jul de 2026; size 1711 bytes
  MD5 checksum 82cc9ae5d32341f7735d05cd6e4606db
  Compiled from "EffectPoint.java"
public class ext.mods.gameserver.model.actor.instance.EffectPoint extends ext.mods.gameserver.model.actor.Npc
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #14                         // ext/mods/gameserver/model/actor/instance/EffectPoint
  super_class: #2                         // ext/mods/gameserver/model/actor/Npc
  interfaces: 0, fields: 1, methods: 4, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/model/actor/Npc."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
   #2 = Class              #4             // ext/mods/gameserver/model/actor/Npc
   #3 = NameAndType        #5:#6          // "<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
   #4 = Utf8               ext/mods/gameserver/model/actor/Npc
   #5 = Utf8               <init>
   #6 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
   #7 = Methodref          #8.#9          // ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #8 = Class              #10            // ext/mods/gameserver/model/actor/Creature
   #9 = NameAndType        #11:#12        // getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
  #10 = Utf8               ext/mods/gameserver/model/actor/Creature
  #11 = Utf8               getActingPlayer
  #12 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #13 = Fieldref           #14.#15        // ext/mods/gameserver/model/actor/instance/EffectPoint._owner:Lext/mods/gameserver/model/actor/Player;
  #14 = Class              #16            // ext/mods/gameserver/model/actor/instance/EffectPoint
  #15 = NameAndType        #17:#18        // _owner:Lext/mods/gameserver/model/actor/Player;
  #16 = Utf8               ext/mods/gameserver/model/actor/instance/EffectPoint
  #17 = Utf8               _owner
  #18 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #19 = Fieldref           #20.#21        // ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #20 = Class              #22            // ext/mods/gameserver/network/serverpackets/ActionFailed
  #21 = NameAndType        #23:#24        // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #22 = Utf8               ext/mods/gameserver/network/serverpackets/ActionFailed
  #23 = Utf8               STATIC_PACKET
  #24 = Utf8               Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #25 = Methodref          #26.#27        // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #26 = Class              #28            // ext/mods/gameserver/model/actor/Player
  #27 = NameAndType        #29:#30        // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #28 = Utf8               ext/mods/gameserver/model/actor/Player
  #29 = Utf8               sendPacket
  #30 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #31 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Creature;)V
  #32 = Utf8               Code
  #33 = Utf8               LineNumberTable
  #34 = Utf8               LocalVariableTable
  #35 = Utf8               this
  #36 = Utf8               Lext/mods/gameserver/model/actor/instance/EffectPoint;
  #37 = Utf8               objectId
  #38 = Utf8               I
  #39 = Utf8               template
  #40 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #41 = Utf8               owner
  #42 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #43 = Utf8               StackMapTable
  #44 = Class              #45            // ext/mods/gameserver/model/actor/template/NpcTemplate
  #45 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
  #46 = Utf8               onAction
  #47 = Utf8               (Lext/mods/gameserver/model/actor/Player;ZZ)V
  #48 = Utf8               player
  #49 = Utf8               isCtrlPressed
  #50 = Utf8               Z
  #51 = Utf8               isShiftPressed
  #52 = Utf8               isAttackableBy
  #53 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
  #54 = Utf8               attacker
  #55 = Utf8               SourceFile
  #56 = Utf8               EffectPoint.java
{
  public ext.mods.gameserver.model.actor.instance.EffectPoint(int, ext.mods.gameserver.model.actor.template.NpcTemplate, ext.mods.gameserver.model.actor.Creature);
    descriptor: (ILext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=4
         0: aload_0
         1: iload_1
         2: aload_2
         3: invokespecial #1                  // Method ext/mods/gameserver/model/actor/Npc."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
         6: aload_0
         7: aload_3
         8: ifnonnull     15
        11: aconst_null
        12: goto          19
        15: aload_3
        16: invokevirtual #7                  // Method ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        19: putfield      #13                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
        22: return
      LineNumberTable:
        line 32: 0
        line 34: 6
        line 35: 22
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/model/actor/instance/EffectPoint;
            0      23     1 objectId   I
            0      23     2 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;
            0      23     3 owner   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/model/actor/instance/EffectPoint, int, class ext/mods/gameserver/model/actor/template/NpcTemplate, class ext/mods/gameserver/model/actor/Creature ]
          stack = [ class ext/mods/gameserver/model/actor/instance/EffectPoint ]
        frame_type = 255 /* full_frame */
          offset_delta = 3
          locals = [ class ext/mods/gameserver/model/actor/instance/EffectPoint, int, class ext/mods/gameserver/model/actor/template/NpcTemplate, class ext/mods/gameserver/model/actor/Creature ]
          stack = [ class ext/mods/gameserver/model/actor/instance/EffectPoint, class ext/mods/gameserver/model/actor/Player ]

  public ext.mods.gameserver.model.actor.Player getActingPlayer();
    descriptor: ()Lext/mods/gameserver/model/actor/Player;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
         4: areturn
      LineNumberTable:
        line 40: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/instance/EffectPoint;

  public void onAction(ext.mods.gameserver.model.actor.Player, boolean, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Player;ZZ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=4
         0: aload_1
         1: getstatic     #19                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
         4: invokevirtual #25                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
         7: return
      LineNumberTable:
        line 46: 0
        line 47: 7
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/instance/EffectPoint;
            0       8     1 player   Lext/mods/gameserver/model/actor/Player;
            0       8     2 isCtrlPressed   Z
            0       8     3 isShiftPressed   Z

  public boolean isAttackableBy(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=2, args_size=2
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 52: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/instance/EffectPoint;
            0       2     1 attacker   Lext/mods/gameserver/model/actor/Creature;
}
SourceFile: "EffectPoint.java"
