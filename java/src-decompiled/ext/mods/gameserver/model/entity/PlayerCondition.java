// Bytecode for: ext.mods.gameserver.model.entity.PlayerCondition
// File: ext\mods\gameserver\model\entity\PlayerCondition.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/entity/PlayerCondition.class
  Last modified 9 de jul de 2026; size 1706 bytes
  MD5 checksum 5d529bc432648cc1732823ea4464b370
  Compiled from "PlayerCondition.java"
public class ext.mods.gameserver.model.entity.PlayerCondition
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/entity/PlayerCondition
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 5, methods: 3, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/entity/PlayerCondition._player:Lext/mods/gameserver/model/actor/Player;
   #8 = Class              #10            // ext/mods/gameserver/model/entity/PlayerCondition
   #9 = NameAndType        #11:#12        // _player:Lext/mods/gameserver/model/actor/Player;
  #10 = Utf8               ext/mods/gameserver/model/entity/PlayerCondition
  #11 = Utf8               _player
  #12 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #13 = Methodref          #14.#15        // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #14 = Class              #16            // ext/mods/gameserver/model/actor/Player
  #15 = NameAndType        #17:#18        // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #16 = Utf8               ext/mods/gameserver/model/actor/Player
  #17 = Utf8               getStatus
  #18 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #19 = Methodref          #20.#21        // ext/mods/gameserver/model/actor/status/PlayerStatus.getHp:()D
  #20 = Class              #22            // ext/mods/gameserver/model/actor/status/PlayerStatus
  #21 = NameAndType        #23:#24        // getHp:()D
  #22 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
  #23 = Utf8               getHp
  #24 = Utf8               ()D
  #25 = Fieldref           #8.#26         // ext/mods/gameserver/model/entity/PlayerCondition._hp:D
  #26 = NameAndType        #27:#28        // _hp:D
  #27 = Utf8               _hp
  #28 = Utf8               D
  #29 = Methodref          #20.#30        // ext/mods/gameserver/model/actor/status/PlayerStatus.getMp:()D
  #30 = NameAndType        #31:#24        // getMp:()D
  #31 = Utf8               getMp
  #32 = Fieldref           #8.#33         // ext/mods/gameserver/model/entity/PlayerCondition._mp:D
  #33 = NameAndType        #34:#28        // _mp:D
  #34 = Utf8               _mp
  #35 = Methodref          #20.#36        // ext/mods/gameserver/model/actor/status/PlayerStatus.getCp:()D
  #36 = NameAndType        #37:#24        // getCp:()D
  #37 = Utf8               getCp
  #38 = Fieldref           #8.#39         // ext/mods/gameserver/model/entity/PlayerCondition._cp:D
  #39 = NameAndType        #40:#28        // _cp:D
  #40 = Utf8               _cp
  #41 = Methodref          #14.#42        // ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #42 = NameAndType        #43:#44        // getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #43 = Utf8               getPosition
  #44 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
  #45 = Methodref          #46.#47        // ext/mods/gameserver/model/location/SpawnLocation.clone:()Lext/mods/gameserver/model/location/SpawnLocation;
  #46 = Class              #48            // ext/mods/gameserver/model/location/SpawnLocation
  #47 = NameAndType        #49:#44        // clone:()Lext/mods/gameserver/model/location/SpawnLocation;
  #48 = Utf8               ext/mods/gameserver/model/location/SpawnLocation
  #49 = Utf8               clone
  #50 = Fieldref           #8.#51         // ext/mods/gameserver/model/entity/PlayerCondition._loc:Lext/mods/gameserver/model/location/Location;
  #51 = NameAndType        #52:#53        // _loc:Lext/mods/gameserver/model/location/Location;
  #52 = Utf8               _loc
  #53 = Utf8               Lext/mods/gameserver/model/location/Location;
  #54 = Methodref          #14.#55        // ext/mods/gameserver/model/actor/Player.storeEffect:(Z)V
  #55 = NameAndType        #56:#57        // storeEffect:(Z)V
  #56 = Utf8               storeEffect
  #57 = Utf8               (Z)V
  #58 = Methodref          #14.#59        // ext/mods/gameserver/model/actor/Player.teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
  #59 = NameAndType        #60:#61        // teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
  #60 = Utf8               teleportTo
  #61 = Utf8               (Lext/mods/gameserver/model/location/Location;I)V
  #62 = Methodref          #20.#63        // ext/mods/gameserver/model/actor/status/PlayerStatus.setCpHpMp:(DDD)V
  #63 = NameAndType        #64:#65        // setCpHpMp:(DDD)V
  #64 = Utf8               setCpHpMp
  #65 = Utf8               (DDD)V
  #66 = Methodref          #14.#67        // ext/mods/gameserver/model/actor/Player.stopAllEffects:()V
  #67 = NameAndType        #68:#6         // stopAllEffects:()V
  #68 = Utf8               stopAllEffects
  #69 = Methodref          #14.#70        // ext/mods/gameserver/model/actor/Player.restoreEffects:()V
  #70 = NameAndType        #71:#6         // restoreEffects:()V
  #71 = Utf8               restoreEffects
  #72 = Utf8               (Lext/mods/gameserver/model/actor/Player;Z)V
  #73 = Utf8               Code
  #74 = Utf8               LineNumberTable
  #75 = Utf8               LocalVariableTable
  #76 = Utf8               this
  #77 = Utf8               Lext/mods/gameserver/model/entity/PlayerCondition;
  #78 = Utf8               player
  #79 = Utf8               partyDuel
  #80 = Utf8               Z
  #81 = Utf8               StackMapTable
  #82 = Utf8               restoreCondition
  #83 = Utf8               abnormalEnd
  #84 = Utf8               getPlayer
  #85 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #86 = Utf8               SourceFile
  #87 = Utf8               PlayerCondition.java
{
  public ext.mods.gameserver.model.entity.PlayerCondition(ext.mods.gameserver.model.actor.Player, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_1
         5: ifnonnull     9
         8: return
         9: aload_0
        10: aload_1
        11: putfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
        14: aload_0
        15: aload_0
        16: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
        19: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
        22: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getHp:()D
        25: putfield      #25                 // Field _hp:D
        28: aload_0
        29: aload_0
        30: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
        33: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
        36: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getMp:()D
        39: putfield      #32                 // Field _mp:D
        42: aload_0
        43: aload_0
        44: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
        47: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
        50: invokevirtual #35                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getCp:()D
        53: putfield      #38                 // Field _cp:D
        56: iload_2
        57: ifeq          74
        60: aload_0
        61: aload_0
        62: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
        65: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
        68: invokevirtual #45                 // Method ext/mods/gameserver/model/location/SpawnLocation.clone:()Lext/mods/gameserver/model/location/SpawnLocation;
        71: putfield      #50                 // Field _loc:Lext/mods/gameserver/model/location/Location;
        74: aload_0
        75: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
        78: iconst_1
        79: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Player.storeEffect:(Z)V
        82: return
      LineNumberTable:
        line 37: 0
        line 38: 4
        line 39: 8
        line 41: 9
        line 42: 14
        line 43: 28
        line 44: 42
        line 46: 56
        line 47: 60
        line 49: 74
        line 50: 82
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      83     0  this   Lext/mods/gameserver/model/entity/PlayerCondition;
            0      83     1 player   Lext/mods/gameserver/model/actor/Player;
            0      83     2 partyDuel   Z
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 9
          locals = [ class ext/mods/gameserver/model/entity/PlayerCondition, class ext/mods/gameserver/model/actor/Player, int ]
          stack = []
        frame_type = 251 /* same_frame_extended */
          offset_delta = 64

  public void restoreCondition(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=2, args_size=2
         0: aload_0
         1: getfield      #50                 // Field _loc:Lext/mods/gameserver/model/location/Location;
         4: ifnull        19
         7: aload_0
         8: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
        11: aload_0
        12: getfield      #50                 // Field _loc:Lext/mods/gameserver/model/location/Location;
        15: iconst_0
        16: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
        19: iload_1
        20: ifeq          24
        23: return
        24: aload_0
        25: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
        28: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
        31: aload_0
        32: getfield      #38                 // Field _cp:D
        35: aload_0
        36: getfield      #25                 // Field _hp:D
        39: aload_0
        40: getfield      #32                 // Field _mp:D
        43: invokevirtual #62                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.setCpHpMp:(DDD)V
        46: aload_0
        47: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
        50: invokevirtual #66                 // Method ext/mods/gameserver/model/actor/Player.stopAllEffects:()V
        53: aload_0
        54: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
        57: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/Player.restoreEffects:()V
        60: return
      LineNumberTable:
        line 54: 0
        line 55: 7
        line 57: 19
        line 58: 23
        line 60: 24
        line 62: 46
        line 63: 53
        line 64: 60
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      61     0  this   Lext/mods/gameserver/model/entity/PlayerCondition;
            0      61     1 abnormalEnd   Z
      StackMapTable: number_of_entries = 2
        frame_type = 19 /* same */
        frame_type = 4 /* same */

  public ext.mods.gameserver.model.actor.Player getPlayer();
    descriptor: ()Lext/mods/gameserver/model/actor/Player;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
         4: areturn
      LineNumberTable:
        line 68: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/PlayerCondition;
}
SourceFile: "PlayerCondition.java"
