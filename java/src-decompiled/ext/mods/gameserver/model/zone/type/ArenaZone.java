// Bytecode for: ext.mods.gameserver.model.zone.type.ArenaZone
// File: ext\mods\gameserver\model\zone\type\ArenaZone.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/zone/type/ArenaZone.class
  Last modified 9 de jul de 2026; size 1364 bytes
  MD5 checksum 5a3b5b40d11e207f0626e041a2462703
  Compiled from "ArenaZone.java"
public class ext.mods.gameserver.model.zone.type.ArenaZone extends ext.mods.gameserver.model.zone.type.subtype.SpawnZoneType
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #37                         // ext/mods/gameserver/model/zone/type/ArenaZone
  super_class: #2                         // ext/mods/gameserver/model/zone/type/subtype/SpawnZoneType
  interfaces: 0, fields: 0, methods: 3, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/model/zone/type/subtype/SpawnZoneType."<init>":(I)V
   #2 = Class              #4             // ext/mods/gameserver/model/zone/type/subtype/SpawnZoneType
   #3 = NameAndType        #5:#6          // "<init>":(I)V
   #4 = Utf8               ext/mods/gameserver/model/zone/type/subtype/SpawnZoneType
   #5 = Utf8               <init>
   #6 = Utf8               (I)V
   #7 = Class              #8             // ext/mods/gameserver/model/actor/Player
   #8 = Utf8               ext/mods/gameserver/model/actor/Player
   #9 = Fieldref           #10.#11        // ext/mods/gameserver/network/SystemMessageId.ENTERED_COMBAT_ZONE:Lext/mods/gameserver/network/SystemMessageId;
  #10 = Class              #12            // ext/mods/gameserver/network/SystemMessageId
  #11 = NameAndType        #13:#14        // ENTERED_COMBAT_ZONE:Lext/mods/gameserver/network/SystemMessageId;
  #12 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #13 = Utf8               ENTERED_COMBAT_ZONE
  #14 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #15 = Methodref          #7.#16         // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #16 = NameAndType        #17:#18        // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #17 = Utf8               sendPacket
  #18 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #19 = Fieldref           #20.#21        // ext/mods/gameserver/enums/ZoneId.PVP:Lext/mods/gameserver/enums/ZoneId;
  #20 = Class              #22            // ext/mods/gameserver/enums/ZoneId
  #21 = NameAndType        #23:#24        // PVP:Lext/mods/gameserver/enums/ZoneId;
  #22 = Utf8               ext/mods/gameserver/enums/ZoneId
  #23 = Utf8               PVP
  #24 = Utf8               Lext/mods/gameserver/enums/ZoneId;
  #25 = Methodref          #26.#27        // ext/mods/gameserver/model/actor/Creature.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
  #26 = Class              #28            // ext/mods/gameserver/model/actor/Creature
  #27 = NameAndType        #29:#30        // setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
  #28 = Utf8               ext/mods/gameserver/model/actor/Creature
  #29 = Utf8               setInsideZone
  #30 = Utf8               (Lext/mods/gameserver/enums/ZoneId;Z)V
  #31 = Fieldref           #20.#32        // ext/mods/gameserver/enums/ZoneId.NO_SUMMON_FRIEND:Lext/mods/gameserver/enums/ZoneId;
  #32 = NameAndType        #33:#24        // NO_SUMMON_FRIEND:Lext/mods/gameserver/enums/ZoneId;
  #33 = Utf8               NO_SUMMON_FRIEND
  #34 = Fieldref           #10.#35        // ext/mods/gameserver/network/SystemMessageId.LEFT_COMBAT_ZONE:Lext/mods/gameserver/network/SystemMessageId;
  #35 = NameAndType        #36:#14        // LEFT_COMBAT_ZONE:Lext/mods/gameserver/network/SystemMessageId;
  #36 = Utf8               LEFT_COMBAT_ZONE
  #37 = Class              #38            // ext/mods/gameserver/model/zone/type/ArenaZone
  #38 = Utf8               ext/mods/gameserver/model/zone/type/ArenaZone
  #39 = Utf8               Code
  #40 = Utf8               LineNumberTable
  #41 = Utf8               LocalVariableTable
  #42 = Utf8               this
  #43 = Utf8               Lext/mods/gameserver/model/zone/type/ArenaZone;
  #44 = Utf8               id
  #45 = Utf8               I
  #46 = Utf8               onEnter
  #47 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
  #48 = Utf8               player
  #49 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #50 = Utf8               creature
  #51 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #52 = Utf8               StackMapTable
  #53 = Utf8               onExit
  #54 = Utf8               SourceFile
  #55 = Utf8               ArenaZone.java
{
  public ext.mods.gameserver.model.zone.type.ArenaZone(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/zone/type/subtype/SpawnZoneType."<init>":(I)V
         5: return
      LineNumberTable:
        line 34: 0
        line 35: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/zone/type/ArenaZone;
            0       6     1    id   I

  protected void onEnter(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=3, args_size=2
         0: aload_1
         1: instanceof    #7                  // class ext/mods/gameserver/model/actor/Player
         4: ifeq          19
         7: aload_1
         8: checkcast     #7                  // class ext/mods/gameserver/model/actor/Player
        11: astore_2
        12: aload_2
        13: getstatic     #9                  // Field ext/mods/gameserver/network/SystemMessageId.ENTERED_COMBAT_ZONE:Lext/mods/gameserver/network/SystemMessageId;
        16: invokevirtual #15                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        19: aload_1
        20: getstatic     #19                 // Field ext/mods/gameserver/enums/ZoneId.PVP:Lext/mods/gameserver/enums/ZoneId;
        23: iconst_1
        24: invokevirtual #25                 // Method ext/mods/gameserver/model/actor/Creature.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
        27: aload_1
        28: getstatic     #31                 // Field ext/mods/gameserver/enums/ZoneId.NO_SUMMON_FRIEND:Lext/mods/gameserver/enums/ZoneId;
        31: iconst_1
        32: invokevirtual #25                 // Method ext/mods/gameserver/model/actor/Creature.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
        35: return
      LineNumberTable:
        line 40: 0
        line 41: 12
        line 43: 19
        line 44: 27
        line 45: 35
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           12       7     2 player   Lext/mods/gameserver/model/actor/Player;
            0      36     0  this   Lext/mods/gameserver/model/zone/type/ArenaZone;
            0      36     1 creature   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 1
        frame_type = 19 /* same */

  protected void onExit(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=3, args_size=2
         0: aload_1
         1: getstatic     #19                 // Field ext/mods/gameserver/enums/ZoneId.PVP:Lext/mods/gameserver/enums/ZoneId;
         4: iconst_0
         5: invokevirtual #25                 // Method ext/mods/gameserver/model/actor/Creature.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
         8: aload_1
         9: getstatic     #31                 // Field ext/mods/gameserver/enums/ZoneId.NO_SUMMON_FRIEND:Lext/mods/gameserver/enums/ZoneId;
        12: iconst_0
        13: invokevirtual #25                 // Method ext/mods/gameserver/model/actor/Creature.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
        16: aload_1
        17: instanceof    #7                  // class ext/mods/gameserver/model/actor/Player
        20: ifeq          35
        23: aload_1
        24: checkcast     #7                  // class ext/mods/gameserver/model/actor/Player
        27: astore_2
        28: aload_2
        29: getstatic     #34                 // Field ext/mods/gameserver/network/SystemMessageId.LEFT_COMBAT_ZONE:Lext/mods/gameserver/network/SystemMessageId;
        32: invokevirtual #15                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        35: return
      LineNumberTable:
        line 50: 0
        line 51: 8
        line 53: 16
        line 54: 28
        line 55: 35
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           28       7     2 player   Lext/mods/gameserver/model/actor/Player;
            0      36     0  this   Lext/mods/gameserver/model/zone/type/ArenaZone;
            0      36     1 creature   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 1
        frame_type = 35 /* same */
}
SourceFile: "ArenaZone.java"
