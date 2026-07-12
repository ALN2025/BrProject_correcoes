// Bytecode for: ext.mods.gameserver.handler.targethandlers.TargetGround
// File: ext\mods\gameserver\handler\targethandlers\TargetGround.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/targethandlers/TargetGround.class
  Last modified 9 de jul de 2026; size 3889 bytes
  MD5 checksum 4a6996641f087c468e6d9826b87ff481
  Compiled from "TargetGround.java"
public class ext.mods.gameserver.handler.targethandlers.TargetGround implements ext.mods.gameserver.handler.ITargetHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #93                         // ext/mods/gameserver/handler/targethandlers/TargetGround
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 0, methods: 5, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/enums/skills/SkillTargetType.GROUND:Lext/mods/gameserver/enums/skills/SkillTargetType;
    #8 = Class              #10           // ext/mods/gameserver/enums/skills/SkillTargetType
    #9 = NameAndType        #11:#12       // GROUND:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #10 = Utf8               ext/mods/gameserver/enums/skills/SkillTargetType
   #11 = Utf8               GROUND
   #12 = Utf8               Lext/mods/gameserver/enums/skills/SkillTargetType;
   #13 = Class              #14           // ext/mods/gameserver/model/actor/Creature
   #14 = Utf8               ext/mods/gameserver/model/actor/Creature
   #15 = Methodref          #16.#17       // ext/mods/gameserver/model/actor/Playable.getRegion:()Lext/mods/gameserver/model/WorldRegion;
   #16 = Class              #18           // ext/mods/gameserver/model/actor/Playable
   #17 = NameAndType        #19:#20       // getRegion:()Lext/mods/gameserver/model/WorldRegion;
   #18 = Utf8               ext/mods/gameserver/model/actor/Playable
   #19 = Utf8               getRegion
   #20 = Utf8               ()Lext/mods/gameserver/model/WorldRegion;
   #21 = Class              #22           // ext/mods/gameserver/model/actor/Player
   #22 = Utf8               ext/mods/gameserver/model/actor/Player
   #23 = Methodref          #21.#24       // ext/mods/gameserver/model/actor/Player.getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
   #24 = NameAndType        #25:#26       // getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
   #25 = Utf8               getCast
   #26 = Utf8               ()Lext/mods/gameserver/model/actor/cast/PlayerCast;
   #27 = Methodref          #28.#29       // ext/mods/gameserver/model/actor/cast/PlayerCast.getSignetLocation:()Lext/mods/gameserver/model/location/Location;
   #28 = Class              #30           // ext/mods/gameserver/model/actor/cast/PlayerCast
   #29 = NameAndType        #31:#32       // getSignetLocation:()Lext/mods/gameserver/model/location/Location;
   #30 = Utf8               ext/mods/gameserver/model/actor/cast/PlayerCast
   #31 = Utf8               getSignetLocation
   #32 = Utf8               ()Lext/mods/gameserver/model/location/Location;
   #33 = Methodref          #34.#35       // ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
   #34 = Class              #36           // ext/mods/gameserver/geoengine/GeoEngine
   #35 = NameAndType        #37:#38       // getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
   #36 = Utf8               ext/mods/gameserver/geoengine/GeoEngine
   #37 = Utf8               getInstance
   #38 = Utf8               ()Lext/mods/gameserver/geoengine/GeoEngine;
   #39 = Methodref          #34.#40       // ext/mods/gameserver/geoengine/GeoEngine.canSeeLocation:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/location/Location;)Z
   #40 = NameAndType        #41:#42       // canSeeLocation:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/location/Location;)Z
   #41 = Utf8               canSeeLocation
   #42 = Utf8               (Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/location/Location;)Z
   #43 = Fieldref           #44.#45       // ext/mods/gameserver/network/SystemMessageId.CANT_SEE_TARGET:Lext/mods/gameserver/network/SystemMessageId;
   #44 = Class              #46           // ext/mods/gameserver/network/SystemMessageId
   #45 = NameAndType        #47:#48       // CANT_SEE_TARGET:Lext/mods/gameserver/network/SystemMessageId;
   #46 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #47 = Utf8               CANT_SEE_TARGET
   #48 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #49 = Methodref          #21.#50       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #50 = NameAndType        #51:#52       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #51 = Utf8               sendPacket
   #52 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #53 = Methodref          #54.#55       // ext/mods/gameserver/model/WorldRegion.checkEffectRangeInsidePeaceZone:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/location/Location;)Z
   #54 = Class              #56           // ext/mods/gameserver/model/WorldRegion
   #55 = NameAndType        #57:#58       // checkEffectRangeInsidePeaceZone:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/location/Location;)Z
   #56 = Utf8               ext/mods/gameserver/model/WorldRegion
   #57 = Utf8               checkEffectRangeInsidePeaceZone
   #58 = Utf8               (Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/location/Location;)Z
   #59 = Fieldref           #44.#60       // ext/mods/gameserver/network/SystemMessageId.S1_CANNOT_BE_USED:Lext/mods/gameserver/network/SystemMessageId;
   #60 = NameAndType        #61:#48       // S1_CANNOT_BE_USED:Lext/mods/gameserver/network/SystemMessageId;
   #61 = Utf8               S1_CANNOT_BE_USED
   #62 = Methodref          #63.#64       // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #63 = Class              #65           // ext/mods/gameserver/network/serverpackets/SystemMessage
   #64 = NameAndType        #66:#67       // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #65 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
   #66 = Utf8               getSystemMessage
   #67 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #68 = Methodref          #63.#69       // ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #69 = NameAndType        #70:#71       // addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #70 = Utf8               addSkillName
   #71 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #72 = Methodref          #21.#73       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #73 = NameAndType        #51:#74       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #74 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #75 = Methodref          #21.#76       // ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
   #76 = NameAndType        #77:#78       // getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
   #77 = Utf8               getPosition
   #78 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
   #79 = Methodref          #80.#81       // ext/mods/gameserver/model/location/SpawnLocation.setHeadingTo:(Lext/mods/gameserver/model/location/Location;)V
   #80 = Class              #82           // ext/mods/gameserver/model/location/SpawnLocation
   #81 = NameAndType        #83:#84       // setHeadingTo:(Lext/mods/gameserver/model/location/Location;)V
   #82 = Utf8               ext/mods/gameserver/model/location/SpawnLocation
   #83 = Utf8               setHeadingTo
   #84 = Utf8               (Lext/mods/gameserver/model/location/Location;)V
   #85 = Class              #86           // ext/mods/gameserver/network/serverpackets/ValidateLocation
   #86 = Utf8               ext/mods/gameserver/network/serverpackets/ValidateLocation
   #87 = Methodref          #85.#88       // ext/mods/gameserver/network/serverpackets/ValidateLocation."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
   #88 = NameAndType        #5:#89        // "<init>":(Lext/mods/gameserver/model/actor/Creature;)V
   #89 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
   #90 = Methodref          #21.#91       // ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #91 = NameAndType        #92:#74       // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #92 = Utf8               broadcastPacket
   #93 = Class              #94           // ext/mods/gameserver/handler/targethandlers/TargetGround
   #94 = Utf8               ext/mods/gameserver/handler/targethandlers/TargetGround
   #95 = Class              #96           // ext/mods/gameserver/handler/ITargetHandler
   #96 = Utf8               ext/mods/gameserver/handler/ITargetHandler
   #97 = Utf8               Code
   #98 = Utf8               LineNumberTable
   #99 = Utf8               LocalVariableTable
  #100 = Utf8               this
  #101 = Utf8               Lext/mods/gameserver/handler/targethandlers/TargetGround;
  #102 = Utf8               getTargetType
  #103 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillTargetType;
  #104 = Utf8               getTargetList
  #105 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)[Lext/mods/gameserver/model/actor/Creature;
  #106 = Utf8               caster
  #107 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #108 = Utf8               target
  #109 = Utf8               skill
  #110 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #111 = Utf8               getFinalTarget
  #112 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/actor/Creature;
  #113 = Utf8               meetCastConditions
  #114 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Z
  #115 = Utf8               player
  #116 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #117 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #118 = Utf8               isCtrlPressed
  #119 = Utf8               Z
  #120 = Utf8               region
  #121 = Utf8               Lext/mods/gameserver/model/WorldRegion;
  #122 = Utf8               signetLocation
  #123 = Utf8               Lext/mods/gameserver/model/location/Location;
  #124 = Utf8               StackMapTable
  #125 = Class              #126          // ext/mods/gameserver/model/location/Location
  #126 = Utf8               ext/mods/gameserver/model/location/Location
  #127 = Utf8               SourceFile
  #128 = Utf8               TargetGround.java
{
  public ext.mods.gameserver.handler.targethandlers.TargetGround();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 33: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/targethandlers/TargetGround;

  public ext.mods.gameserver.enums.skills.SkillTargetType getTargetType();
    descriptor: ()Lext/mods/gameserver/enums/skills/SkillTargetType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #7                  // Field ext/mods/gameserver/enums/skills/SkillTargetType.GROUND:Lext/mods/gameserver/enums/skills/SkillTargetType;
         3: areturn
      LineNumberTable:
        line 38: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/targethandlers/TargetGround;

  public ext.mods.gameserver.model.actor.Creature[] getTargetList(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)[Lext/mods/gameserver/model/actor/Creature;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=4
         0: iconst_1
         1: anewarray     #13                 // class ext/mods/gameserver/model/actor/Creature
         4: dup
         5: iconst_0
         6: aload_1
         7: aastore
         8: areturn
      LineNumberTable:
        line 44: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/handler/targethandlers/TargetGround;
            0       9     1 caster   Lext/mods/gameserver/model/actor/Creature;
            0       9     2 target   Lext/mods/gameserver/model/actor/Creature;
            0       9     3 skill   Lext/mods/gameserver/skills/L2Skill;

  public ext.mods.gameserver.model.actor.Creature getFinalTarget(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/actor/Creature;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=4, args_size=4
         0: aload_1
         1: areturn
      LineNumberTable:
        line 53: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/handler/targethandlers/TargetGround;
            0       2     1 caster   Lext/mods/gameserver/model/actor/Creature;
            0       2     2 target   Lext/mods/gameserver/model/actor/Creature;
            0       2     3 skill   Lext/mods/gameserver/skills/L2Skill;

  public boolean meetCastConditions(ext.mods.gameserver.model.actor.Playable, ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=8, args_size=5
         0: aload_1
         1: invokevirtual #15                 // Method ext/mods/gameserver/model/actor/Playable.getRegion:()Lext/mods/gameserver/model/WorldRegion;
         4: astore        5
         6: aload         5
         8: ifnull        27
        11: aload_1
        12: instanceof    #21                 // class ext/mods/gameserver/model/actor/Player
        15: ifeq          27
        18: aload_1
        19: checkcast     #21                 // class ext/mods/gameserver/model/actor/Player
        22: astore        6
        24: goto          29
        27: iconst_0
        28: ireturn
        29: aload         6
        31: invokevirtual #23                 // Method ext/mods/gameserver/model/actor/Player.getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
        34: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/cast/PlayerCast.getSignetLocation:()Lext/mods/gameserver/model/location/Location;
        37: astore        7
        39: invokestatic  #33                 // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
        42: aload         6
        44: aload         7
        46: invokevirtual #39                 // Method ext/mods/gameserver/geoengine/GeoEngine.canSeeLocation:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/location/Location;)Z
        49: ifne          62
        52: aload         6
        54: getstatic     #43                 // Field ext/mods/gameserver/network/SystemMessageId.CANT_SEE_TARGET:Lext/mods/gameserver/network/SystemMessageId;
        57: invokevirtual #49                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        60: iconst_0
        61: ireturn
        62: aload         5
        64: aload_3
        65: aload         7
        67: invokevirtual #53                 // Method ext/mods/gameserver/model/WorldRegion.checkEffectRangeInsidePeaceZone:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/location/Location;)Z
        70: ifne          90
        73: aload         6
        75: getstatic     #59                 // Field ext/mods/gameserver/network/SystemMessageId.S1_CANNOT_BE_USED:Lext/mods/gameserver/network/SystemMessageId;
        78: invokestatic  #62                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        81: aload_3
        82: invokevirtual #68                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        85: invokevirtual #72                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        88: iconst_0
        89: ireturn
        90: aload         6
        92: invokevirtual #75                 // Method ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
        95: aload         7
        97: invokevirtual #79                 // Method ext/mods/gameserver/model/location/SpawnLocation.setHeadingTo:(Lext/mods/gameserver/model/location/Location;)V
       100: aload         6
       102: new           #85                 // class ext/mods/gameserver/network/serverpackets/ValidateLocation
       105: dup
       106: aload         6
       108: invokespecial #87                 // Method ext/mods/gameserver/network/serverpackets/ValidateLocation."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
       111: invokevirtual #90                 // Method ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       114: iconst_1
       115: ireturn
      LineNumberTable:
        line 59: 0
        line 60: 6
        line 61: 27
        line 63: 29
        line 64: 39
        line 66: 52
        line 67: 60
        line 70: 62
        line 72: 73
        line 73: 88
        line 76: 90
        line 77: 100
        line 78: 114
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           24       3     6 player   Lext/mods/gameserver/model/actor/Player;
            0     116     0  this   Lext/mods/gameserver/handler/targethandlers/TargetGround;
            0     116     1 caster   Lext/mods/gameserver/model/actor/Playable;
            0     116     2 target   Lext/mods/gameserver/model/actor/Creature;
            0     116     3 skill   Lext/mods/gameserver/skills/L2Skill;
            0     116     4 isCtrlPressed   Z
            6     110     5 region   Lext/mods/gameserver/model/WorldRegion;
           29      87     6 player   Lext/mods/gameserver/model/actor/Player;
           39      77     7 signetLocation   Lext/mods/gameserver/model/location/Location;
      StackMapTable: number_of_entries = 4
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ class ext/mods/gameserver/model/WorldRegion ]
        frame_type = 252 /* append */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 252 /* append */
          offset_delta = 32
          locals = [ class ext/mods/gameserver/model/location/Location ]
        frame_type = 27 /* same */
}
SourceFile: "TargetGround.java"
