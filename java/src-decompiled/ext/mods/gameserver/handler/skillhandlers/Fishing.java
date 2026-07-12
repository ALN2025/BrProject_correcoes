// Bytecode for: ext.mods.gameserver.handler.skillhandlers.Fishing
// File: ext\mods\gameserver\handler\skillhandlers\Fishing.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/skillhandlers/Fishing.class
  Last modified 9 de jul de 2026; size 4374 bytes
  MD5 checksum 26cbec2939e270eae504e95e4d44444b
  Compiled from "Fishing.java"
public class ext.mods.gameserver.handler.skillhandlers.Fishing implements ext.mods.gameserver.handler.ISkillHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #151                        // ext/mods/gameserver/handler/skillhandlers/Fishing
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // ext/mods/gameserver/model/actor/Player
    #8 = Utf8               ext/mods/gameserver/model/actor/Player
    #9 = Methodref          #7.#10        // ext/mods/gameserver/model/actor/Player.isFishing:()Z
   #10 = NameAndType        #11:#12       // isFishing:()Z
   #11 = Utf8               isFishing
   #12 = Utf8               ()Z
   #13 = Methodref          #7.#14        // ext/mods/gameserver/model/actor/Player.getFishingStance:()Lext/mods/gameserver/model/actor/container/player/FishingStance;
   #14 = NameAndType        #15:#16       // getFishingStance:()Lext/mods/gameserver/model/actor/container/player/FishingStance;
   #15 = Utf8               getFishingStance
   #16 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/FishingStance;
   #17 = Methodref          #18.#19       // ext/mods/gameserver/model/actor/container/player/FishingStance.end:(Z)V
   #18 = Class              #20           // ext/mods/gameserver/model/actor/container/player/FishingStance
   #19 = NameAndType        #21:#22       // end:(Z)V
   #20 = Utf8               ext/mods/gameserver/model/actor/container/player/FishingStance
   #21 = Utf8               end
   #22 = Utf8               (Z)V
   #23 = Fieldref           #24.#25       // ext/mods/gameserver/network/SystemMessageId.FISHING_ATTEMPT_CANCELLED:Lext/mods/gameserver/network/SystemMessageId;
   #24 = Class              #26           // ext/mods/gameserver/network/SystemMessageId
   #25 = NameAndType        #27:#28       // FISHING_ATTEMPT_CANCELLED:Lext/mods/gameserver/network/SystemMessageId;
   #26 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #27 = Utf8               FISHING_ATTEMPT_CANCELLED
   #28 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #29 = Methodref          #7.#30        // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #30 = NameAndType        #31:#32       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #31 = Utf8               sendPacket
   #32 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #33 = Methodref          #7.#34        // ext/mods/gameserver/model/actor/Player.getAttackType:()Lext/mods/gameserver/enums/items/WeaponType;
   #34 = NameAndType        #35:#36       // getAttackType:()Lext/mods/gameserver/enums/items/WeaponType;
   #35 = Utf8               getAttackType
   #36 = Utf8               ()Lext/mods/gameserver/enums/items/WeaponType;
   #37 = Fieldref           #38.#39       // ext/mods/gameserver/enums/items/WeaponType.FISHINGROD:Lext/mods/gameserver/enums/items/WeaponType;
   #38 = Class              #40           // ext/mods/gameserver/enums/items/WeaponType
   #39 = NameAndType        #41:#42       // FISHINGROD:Lext/mods/gameserver/enums/items/WeaponType;
   #40 = Utf8               ext/mods/gameserver/enums/items/WeaponType
   #41 = Utf8               FISHINGROD
   #42 = Utf8               Lext/mods/gameserver/enums/items/WeaponType;
   #43 = Fieldref           #24.#44       // ext/mods/gameserver/network/SystemMessageId.FISHING_POLE_NOT_EQUIPPED:Lext/mods/gameserver/network/SystemMessageId;
   #44 = NameAndType        #45:#28       // FISHING_POLE_NOT_EQUIPPED:Lext/mods/gameserver/network/SystemMessageId;
   #45 = Utf8               FISHING_POLE_NOT_EQUIPPED
   #46 = Methodref          #7.#47        // ext/mods/gameserver/model/actor/Player.getBoatInfo:()Lext/mods/gameserver/model/actor/container/player/BoatInfo;
   #47 = NameAndType        #48:#49       // getBoatInfo:()Lext/mods/gameserver/model/actor/container/player/BoatInfo;
   #48 = Utf8               getBoatInfo
   #49 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/BoatInfo;
   #50 = Methodref          #51.#52       // ext/mods/gameserver/model/actor/container/player/BoatInfo.isInBoat:()Z
   #51 = Class              #53           // ext/mods/gameserver/model/actor/container/player/BoatInfo
   #52 = NameAndType        #54:#12       // isInBoat:()Z
   #53 = Utf8               ext/mods/gameserver/model/actor/container/player/BoatInfo
   #54 = Utf8               isInBoat
   #55 = Fieldref           #24.#56       // ext/mods/gameserver/network/SystemMessageId.CANNOT_FISH_ON_BOAT:Lext/mods/gameserver/network/SystemMessageId;
   #56 = NameAndType        #57:#28       // CANNOT_FISH_ON_BOAT:Lext/mods/gameserver/network/SystemMessageId;
   #57 = Utf8               CANNOT_FISH_ON_BOAT
   #58 = Methodref          #7.#59        // ext/mods/gameserver/model/actor/Player.isCrafting:()Z
   #59 = NameAndType        #60:#12       // isCrafting:()Z
   #60 = Utf8               isCrafting
   #61 = Methodref          #7.#62        // ext/mods/gameserver/model/actor/Player.isOperating:()Z
   #62 = NameAndType        #63:#12       // isOperating:()Z
   #63 = Utf8               isOperating
   #64 = Fieldref           #24.#65       // ext/mods/gameserver/network/SystemMessageId.CANNOT_FISH_WHILE_USING_RECIPE_BOOK:Lext/mods/gameserver/network/SystemMessageId;
   #65 = NameAndType        #66:#28       // CANNOT_FISH_WHILE_USING_RECIPE_BOOK:Lext/mods/gameserver/network/SystemMessageId;
   #66 = Utf8               CANNOT_FISH_WHILE_USING_RECIPE_BOOK
   #67 = Methodref          #7.#68        // ext/mods/gameserver/model/actor/Player.isInWater:()Z
   #68 = NameAndType        #69:#12       // isInWater:()Z
   #69 = Utf8               isInWater
   #70 = Fieldref           #24.#71       // ext/mods/gameserver/network/SystemMessageId.CANNOT_FISH_UNDER_WATER:Lext/mods/gameserver/network/SystemMessageId;
   #71 = NameAndType        #72:#28       // CANNOT_FISH_UNDER_WATER:Lext/mods/gameserver/network/SystemMessageId;
   #72 = Utf8               CANNOT_FISH_UNDER_WATER
   #73 = Methodref          #7.#74        // ext/mods/gameserver/model/actor/Player.getSecondaryWeaponInstance:()Lext/mods/gameserver/model/item/instance/ItemInstance;
   #74 = NameAndType        #75:#76       // getSecondaryWeaponInstance:()Lext/mods/gameserver/model/item/instance/ItemInstance;
   #75 = Utf8               getSecondaryWeaponInstance
   #76 = Utf8               ()Lext/mods/gameserver/model/item/instance/ItemInstance;
   #77 = Fieldref           #24.#78       // ext/mods/gameserver/network/SystemMessageId.BAIT_ON_HOOK_BEFORE_FISHING:Lext/mods/gameserver/network/SystemMessageId;
   #78 = NameAndType        #79:#28       // BAIT_ON_HOOK_BEFORE_FISHING:Lext/mods/gameserver/network/SystemMessageId;
   #79 = Utf8               BAIT_ON_HOOK_BEFORE_FISHING
   #80 = Methodref          #7.#81        // ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
   #81 = NameAndType        #82:#83       // getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
   #82 = Utf8               getPosition
   #83 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
   #84 = Methodref          #85.#86       // ext/mods/gameserver/model/location/SpawnLocation.clone:()Lext/mods/gameserver/model/location/SpawnLocation;
   #85 = Class              #87           // ext/mods/gameserver/model/location/SpawnLocation
   #86 = NameAndType        #88:#83       // clone:()Lext/mods/gameserver/model/location/SpawnLocation;
   #87 = Utf8               ext/mods/gameserver/model/location/SpawnLocation
   #88 = Utf8               clone
   #89 = Methodref          #90.#91       // ext/mods/commons/random/Rnd.get:(I)I
   #90 = Class              #92           // ext/mods/commons/random/Rnd
   #91 = NameAndType        #93:#94       // get:(I)I
   #92 = Utf8               ext/mods/commons/random/Rnd
   #93 = Utf8               get
   #94 = Utf8               (I)I
   #95 = Methodref          #85.#96       // ext/mods/gameserver/model/location/SpawnLocation.addOffsetBasedOnHeading:(I)V
   #96 = NameAndType        #97:#98       // addOffsetBasedOnHeading:(I)V
   #97 = Utf8               addOffsetBasedOnHeading
   #98 = Utf8               (I)V
   #99 = Methodref          #100.#101     // ext/mods/gameserver/data/manager/ZoneManager.getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
  #100 = Class              #102          // ext/mods/gameserver/data/manager/ZoneManager
  #101 = NameAndType        #103:#104     // getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
  #102 = Utf8               ext/mods/gameserver/data/manager/ZoneManager
  #103 = Utf8               getInstance
  #104 = Utf8               ()Lext/mods/gameserver/data/manager/ZoneManager;
  #105 = Methodref          #85.#106      // ext/mods/gameserver/model/location/SpawnLocation.getX:()I
  #106 = NameAndType        #107:#108     // getX:()I
  #107 = Utf8               getX
  #108 = Utf8               ()I
  #109 = Methodref          #85.#110      // ext/mods/gameserver/model/location/SpawnLocation.getY:()I
  #110 = NameAndType        #111:#108     // getY:()I
  #111 = Utf8               getY
  #112 = Class              #113          // ext/mods/gameserver/model/zone/type/FishingZone
  #113 = Utf8               ext/mods/gameserver/model/zone/type/FishingZone
  #114 = Methodref          #100.#115     // ext/mods/gameserver/data/manager/ZoneManager.getZone:(IILjava/lang/Class;)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
  #115 = NameAndType        #116:#117     // getZone:(IILjava/lang/Class;)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
  #116 = Utf8               getZone
  #117 = Utf8               (IILjava/lang/Class;)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
  #118 = Methodref          #112.#119     // ext/mods/gameserver/model/zone/type/FishingZone.getWaterZ:()I
  #119 = NameAndType        #120:#108     // getWaterZ:()I
  #120 = Utf8               getWaterZ
  #121 = Methodref          #85.#122      // ext/mods/gameserver/model/location/SpawnLocation.setZ:(I)V
  #122 = NameAndType        #123:#98      // setZ:(I)V
  #123 = Utf8               setZ
  #124 = Methodref          #125.#126     // ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #125 = Class              #127          // ext/mods/gameserver/geoengine/GeoEngine
  #126 = NameAndType        #103:#128     // getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #127 = Utf8               ext/mods/gameserver/geoengine/GeoEngine
  #128 = Utf8               ()Lext/mods/gameserver/geoengine/GeoEngine;
  #129 = Methodref          #125.#130     // ext/mods/gameserver/geoengine/GeoEngine.canSeeLocation:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/location/Location;)Z
  #130 = NameAndType        #131:#132     // canSeeLocation:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/location/Location;)Z
  #131 = Utf8               canSeeLocation
  #132 = Utf8               (Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/location/Location;)Z
  #133 = Methodref          #85.#134      // ext/mods/gameserver/model/location/SpawnLocation.getZ:()I
  #134 = NameAndType        #135:#108     // getZ:()I
  #135 = Utf8               getZ
  #136 = Fieldref           #24.#137      // ext/mods/gameserver/network/SystemMessageId.CANNOT_FISH_HERE:Lext/mods/gameserver/network/SystemMessageId;
  #137 = NameAndType        #138:#28      // CANNOT_FISH_HERE:Lext/mods/gameserver/network/SystemMessageId;
  #138 = Utf8               CANNOT_FISH_HERE
  #139 = Methodref          #7.#140       // ext/mods/gameserver/model/actor/Player.destroyItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;IZ)Z
  #140 = NameAndType        #141:#142     // destroyItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;IZ)Z
  #141 = Utf8               destroyItem
  #142 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;IZ)Z
  #143 = Fieldref           #24.#144      // ext/mods/gameserver/network/SystemMessageId.NOT_ENOUGH_BAIT:Lext/mods/gameserver/network/SystemMessageId;
  #144 = NameAndType        #145:#28      // NOT_ENOUGH_BAIT:Lext/mods/gameserver/network/SystemMessageId;
  #145 = Utf8               NOT_ENOUGH_BAIT
  #146 = Methodref          #18.#147      // ext/mods/gameserver/model/actor/container/player/FishingStance.start:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #147 = NameAndType        #148:#149     // start:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #148 = Utf8               start
  #149 = Utf8               (Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #150 = Fieldref           #151.#152     // ext/mods/gameserver/handler/skillhandlers/Fishing.SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
  #151 = Class              #153          // ext/mods/gameserver/handler/skillhandlers/Fishing
  #152 = NameAndType        #154:#155     // SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
  #153 = Utf8               ext/mods/gameserver/handler/skillhandlers/Fishing
  #154 = Utf8               SKILL_IDS
  #155 = Utf8               [Lext/mods/gameserver/enums/skills/SkillType;
  #156 = Class              #157          // ext/mods/gameserver/enums/skills/SkillType
  #157 = Utf8               ext/mods/gameserver/enums/skills/SkillType
  #158 = Fieldref           #156.#159     // ext/mods/gameserver/enums/skills/SkillType.FISHING:Lext/mods/gameserver/enums/skills/SkillType;
  #159 = NameAndType        #160:#161     // FISHING:Lext/mods/gameserver/enums/skills/SkillType;
  #160 = Utf8               FISHING
  #161 = Utf8               Lext/mods/gameserver/enums/skills/SkillType;
  #162 = Class              #163          // ext/mods/gameserver/handler/ISkillHandler
  #163 = Utf8               ext/mods/gameserver/handler/ISkillHandler
  #164 = Utf8               Code
  #165 = Utf8               LineNumberTable
  #166 = Utf8               LocalVariableTable
  #167 = Utf8               this
  #168 = Utf8               Lext/mods/gameserver/handler/skillhandlers/Fishing;
  #169 = Utf8               useSkill
  #170 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #171 = Utf8               player
  #172 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #173 = Utf8               creature
  #174 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #175 = Utf8               skill
  #176 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #177 = Utf8               targets
  #178 = Utf8               [Lext/mods/gameserver/model/WorldObject;
  #179 = Utf8               item
  #180 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #181 = Utf8               lure
  #182 = Utf8               baitLoc
  #183 = Utf8               Lext/mods/gameserver/model/location/SpawnLocation;
  #184 = Utf8               canFish
  #185 = Utf8               Z
  #186 = Utf8               zone
  #187 = Utf8               Lext/mods/gameserver/model/zone/type/FishingZone;
  #188 = Utf8               StackMapTable
  #189 = Class              #190          // ext/mods/gameserver/model/item/instance/ItemInstance
  #190 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #191 = Utf8               getSkillIds
  #192 = Utf8               ()[Lext/mods/gameserver/enums/skills/SkillType;
  #193 = Utf8               <clinit>
  #194 = Utf8               SourceFile
  #195 = Utf8               Fishing.java
{
  public ext.mods.gameserver.handler.skillhandlers.Fishing();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 36: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/skillhandlers/Fishing;

  public void useSkill(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, ext.mods.gameserver.model.WorldObject[], ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=10, args_size=5
         0: aload_1
         1: instanceof    #7                  // class ext/mods/gameserver/model/actor/Player
         4: ifeq          16
         7: aload_1
         8: checkcast     #7                  // class ext/mods/gameserver/model/actor/Player
        11: astore        5
        13: goto          17
        16: return
        17: aload         5
        19: invokevirtual #9                  // Method ext/mods/gameserver/model/actor/Player.isFishing:()Z
        22: ifeq          43
        25: aload         5
        27: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Player.getFishingStance:()Lext/mods/gameserver/model/actor/container/player/FishingStance;
        30: iconst_0
        31: invokevirtual #17                 // Method ext/mods/gameserver/model/actor/container/player/FishingStance.end:(Z)V
        34: aload         5
        36: getstatic     #23                 // Field ext/mods/gameserver/network/SystemMessageId.FISHING_ATTEMPT_CANCELLED:Lext/mods/gameserver/network/SystemMessageId;
        39: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        42: return
        43: aload         5
        45: invokevirtual #33                 // Method ext/mods/gameserver/model/actor/Player.getAttackType:()Lext/mods/gameserver/enums/items/WeaponType;
        48: getstatic     #37                 // Field ext/mods/gameserver/enums/items/WeaponType.FISHINGROD:Lext/mods/gameserver/enums/items/WeaponType;
        51: if_acmpeq     63
        54: aload         5
        56: getstatic     #43                 // Field ext/mods/gameserver/network/SystemMessageId.FISHING_POLE_NOT_EQUIPPED:Lext/mods/gameserver/network/SystemMessageId;
        59: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        62: return
        63: aload         5
        65: invokevirtual #46                 // Method ext/mods/gameserver/model/actor/Player.getBoatInfo:()Lext/mods/gameserver/model/actor/container/player/BoatInfo;
        68: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/container/player/BoatInfo.isInBoat:()Z
        71: ifeq          83
        74: aload         5
        76: getstatic     #55                 // Field ext/mods/gameserver/network/SystemMessageId.CANNOT_FISH_ON_BOAT:Lext/mods/gameserver/network/SystemMessageId;
        79: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        82: return
        83: aload         5
        85: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.isCrafting:()Z
        88: ifne          99
        91: aload         5
        93: invokevirtual #61                 // Method ext/mods/gameserver/model/actor/Player.isOperating:()Z
        96: ifeq          108
        99: aload         5
       101: getstatic     #64                 // Field ext/mods/gameserver/network/SystemMessageId.CANNOT_FISH_WHILE_USING_RECIPE_BOOK:Lext/mods/gameserver/network/SystemMessageId;
       104: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       107: return
       108: aload         5
       110: invokevirtual #67                 // Method ext/mods/gameserver/model/actor/Player.isInWater:()Z
       113: ifeq          125
       116: aload         5
       118: getstatic     #70                 // Field ext/mods/gameserver/network/SystemMessageId.CANNOT_FISH_UNDER_WATER:Lext/mods/gameserver/network/SystemMessageId;
       121: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       124: return
       125: aload         5
       127: invokevirtual #73                 // Method ext/mods/gameserver/model/actor/Player.getSecondaryWeaponInstance:()Lext/mods/gameserver/model/item/instance/ItemInstance;
       130: astore        6
       132: aload         6
       134: ifnonnull     146
       137: aload         5
       139: getstatic     #77                 // Field ext/mods/gameserver/network/SystemMessageId.BAIT_ON_HOOK_BEFORE_FISHING:Lext/mods/gameserver/network/SystemMessageId;
       142: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       145: return
       146: aload         5
       148: invokevirtual #80                 // Method ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
       151: invokevirtual #84                 // Method ext/mods/gameserver/model/location/SpawnLocation.clone:()Lext/mods/gameserver/model/location/SpawnLocation;
       154: astore        7
       156: aload         7
       158: bipush        50
       160: invokestatic  #89                 // Method ext/mods/commons/random/Rnd.get:(I)I
       163: sipush        250
       166: iadd
       167: invokevirtual #95                 // Method ext/mods/gameserver/model/location/SpawnLocation.addOffsetBasedOnHeading:(I)V
       170: iconst_0
       171: istore        8
       173: invokestatic  #99                 // Method ext/mods/gameserver/data/manager/ZoneManager.getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
       176: aload         7
       178: invokevirtual #105                // Method ext/mods/gameserver/model/location/SpawnLocation.getX:()I
       181: aload         7
       183: invokevirtual #109                // Method ext/mods/gameserver/model/location/SpawnLocation.getY:()I
       186: ldc           #112                // class ext/mods/gameserver/model/zone/type/FishingZone
       188: invokevirtual #114                // Method ext/mods/gameserver/data/manager/ZoneManager.getZone:(IILjava/lang/Class;)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
       191: checkcast     #112                // class ext/mods/gameserver/model/zone/type/FishingZone
       194: astore        9
       196: aload         9
       198: ifnull        240
       201: aload         7
       203: aload         9
       205: invokevirtual #118                // Method ext/mods/gameserver/model/zone/type/FishingZone.getWaterZ:()I
       208: invokevirtual #121                // Method ext/mods/gameserver/model/location/SpawnLocation.setZ:(I)V
       211: invokestatic  #124                // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
       214: aload         5
       216: aload         7
       218: invokevirtual #129                // Method ext/mods/gameserver/geoengine/GeoEngine.canSeeLocation:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/location/Location;)Z
       221: ifeq          240
       224: aload         7
       226: aload         7
       228: invokevirtual #133                // Method ext/mods/gameserver/model/location/SpawnLocation.getZ:()I
       231: bipush        10
       233: iadd
       234: invokevirtual #121                // Method ext/mods/gameserver/model/location/SpawnLocation.setZ:(I)V
       237: iconst_1
       238: istore        8
       240: iload         8
       242: ifne          254
       245: aload         5
       247: getstatic     #136                // Field ext/mods/gameserver/network/SystemMessageId.CANNOT_FISH_HERE:Lext/mods/gameserver/network/SystemMessageId;
       250: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       253: return
       254: aload         5
       256: aload         6
       258: iconst_1
       259: iconst_0
       260: invokevirtual #139                // Method ext/mods/gameserver/model/actor/Player.destroyItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;IZ)Z
       263: ifne          275
       266: aload         5
       268: getstatic     #143                // Field ext/mods/gameserver/network/SystemMessageId.NOT_ENOUGH_BAIT:Lext/mods/gameserver/network/SystemMessageId;
       271: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       274: return
       275: aload         5
       277: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Player.getFishingStance:()Lext/mods/gameserver/model/actor/container/player/FishingStance;
       280: aload         7
       282: aload         6
       284: invokevirtual #146                // Method ext/mods/gameserver/model/actor/container/player/FishingStance.start:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
       287: return
      LineNumberTable:
        line 46: 0
        line 47: 16
        line 49: 17
        line 51: 25
        line 52: 34
        line 53: 42
        line 56: 43
        line 58: 54
        line 59: 62
        line 62: 63
        line 64: 74
        line 65: 82
        line 68: 83
        line 70: 99
        line 71: 107
        line 74: 108
        line 76: 116
        line 77: 124
        line 80: 125
        line 81: 132
        line 83: 137
        line 84: 145
        line 87: 146
        line 88: 156
        line 90: 170
        line 92: 173
        line 93: 196
        line 95: 201
        line 97: 211
        line 99: 224
        line 100: 237
        line 104: 240
        line 106: 245
        line 107: 253
        line 110: 254
        line 112: 266
        line 113: 274
        line 116: 275
        line 117: 287
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           13       3     5 player   Lext/mods/gameserver/model/actor/Player;
            0     288     0  this   Lext/mods/gameserver/handler/skillhandlers/Fishing;
            0     288     1 creature   Lext/mods/gameserver/model/actor/Creature;
            0     288     2 skill   Lext/mods/gameserver/skills/L2Skill;
            0     288     3 targets   [Lext/mods/gameserver/model/WorldObject;
            0     288     4  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
           17     271     5 player   Lext/mods/gameserver/model/actor/Player;
          132     156     6  lure   Lext/mods/gameserver/model/item/instance/ItemInstance;
          156     132     7 baitLoc   Lext/mods/gameserver/model/location/SpawnLocation;
          173     115     8 canFish   Z
          196      92     9  zone   Lext/mods/gameserver/model/zone/type/FishingZone;
      StackMapTable: number_of_entries = 12
        frame_type = 16 /* same */
        frame_type = 252 /* append */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 25 /* same */
        frame_type = 19 /* same */
        frame_type = 19 /* same */
        frame_type = 15 /* same */
        frame_type = 8 /* same */
        frame_type = 16 /* same */
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 254 /* append */
          offset_delta = 93
          locals = [ class ext/mods/gameserver/model/location/SpawnLocation, int, class ext/mods/gameserver/model/zone/type/FishingZone ]
        frame_type = 13 /* same */
        frame_type = 20 /* same */

  public ext.mods.gameserver.enums.skills.SkillType[] getSkillIds();
    descriptor: ()[Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #150                // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
         3: areturn
      LineNumberTable:
        line 122: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/skillhandlers/Fishing;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #156                // class ext/mods/gameserver/enums/skills/SkillType
         4: dup
         5: iconst_0
         6: getstatic     #158                // Field ext/mods/gameserver/enums/skills/SkillType.FISHING:Lext/mods/gameserver/enums/skills/SkillType;
         9: aastore
        10: putstatic     #150                // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
        13: return
      LineNumberTable:
        line 38: 0
}
SourceFile: "Fishing.java"
