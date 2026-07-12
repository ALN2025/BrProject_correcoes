// Bytecode for: ext.mods.gameserver.handler.itemhandlers.ScrollsOfResurrection
// File: ext\mods\gameserver\handler\itemhandlers\ScrollsOfResurrection.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/itemhandlers/ScrollsOfResurrection.class
  Last modified 9 de jul de 2026; size 4990 bytes
  MD5 checksum 72400f0509941bf5c155b94de3e7f1cf
  Compiled from "ScrollsOfResurrection.java"
public class ext.mods.gameserver.handler.itemhandlers.ScrollsOfResurrection implements ext.mods.gameserver.handler.IItemHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #138                        // ext/mods/gameserver/handler/itemhandlers/ScrollsOfResurrection
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 0, methods: 2, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/model/actor/Playable.getTarget:()Lext/mods/gameserver/model/WorldObject;
    #8 = Class              #10           // ext/mods/gameserver/model/actor/Playable
    #9 = NameAndType        #11:#12       // getTarget:()Lext/mods/gameserver/model/WorldObject;
   #10 = Utf8               ext/mods/gameserver/model/actor/Playable
   #11 = Utf8               getTarget
   #12 = Utf8               ()Lext/mods/gameserver/model/WorldObject;
   #13 = Class              #14           // ext/mods/gameserver/model/actor/Creature
   #14 = Utf8               ext/mods/gameserver/model/actor/Creature
   #15 = Fieldref           #16.#17       // ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
   #16 = Class              #18           // ext/mods/gameserver/network/SystemMessageId
   #17 = NameAndType        #19:#20       // INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
   #18 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #19 = Utf8               INVALID_TARGET
   #20 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #21 = Methodref          #8.#22        // ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #22 = NameAndType        #23:#24       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #23 = Utf8               sendPacket
   #24 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #25 = Methodref          #13.#26       // ext/mods/gameserver/model/actor/Creature.isDead:()Z
   #26 = NameAndType        #27:#28       // isDead:()Z
   #27 = Utf8               isDead
   #28 = Utf8               ()Z
   #29 = Class              #30           // ext/mods/gameserver/model/actor/Player
   #30 = Utf8               ext/mods/gameserver/model/actor/Player
   #31 = Fieldref           #32.#33       // ext/mods/gameserver/enums/ZoneId.SIEGE:Lext/mods/gameserver/enums/ZoneId;
   #32 = Class              #34           // ext/mods/gameserver/enums/ZoneId
   #33 = NameAndType        #35:#36       // SIEGE:Lext/mods/gameserver/enums/ZoneId;
   #34 = Utf8               ext/mods/gameserver/enums/ZoneId
   #35 = Utf8               SIEGE
   #36 = Utf8               Lext/mods/gameserver/enums/ZoneId;
   #37 = Methodref          #29.#38       // ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
   #38 = NameAndType        #39:#40       // isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
   #39 = Utf8               isInsideZone
   #40 = Utf8               (Lext/mods/gameserver/enums/ZoneId;)Z
   #41 = Methodref          #29.#42       // ext/mods/gameserver/model/actor/Player.getSiegeState:()I
   #42 = NameAndType        #43:#44       // getSiegeState:()I
   #43 = Utf8               getSiegeState
   #44 = Utf8               ()I
   #45 = Fieldref           #16.#46       // ext/mods/gameserver/network/SystemMessageId.CANNOT_BE_RESURRECTED_DURING_SIEGE:Lext/mods/gameserver/network/SystemMessageId;
   #46 = NameAndType        #47:#20       // CANNOT_BE_RESURRECTED_DURING_SIEGE:Lext/mods/gameserver/network/SystemMessageId;
   #47 = Utf8               CANNOT_BE_RESURRECTED_DURING_SIEGE
   #48 = Methodref          #49.#50       // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #49 = Class              #51           // ext/mods/gameserver/network/serverpackets/SystemMessage
   #50 = NameAndType        #52:#53       // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #51 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
   #52 = Utf8               getSystemMessage
   #53 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #54 = Methodref          #8.#55        // ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #55 = NameAndType        #23:#56       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #56 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #57 = Methodref          #58.#59       // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
   #58 = Class              #60           // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent
   #59 = NameAndType        #61:#62       // getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
   #60 = Utf8               ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent
   #61 = Utf8               getInstance
   #62 = Utf8               ()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
   #63 = Methodref          #29.#64       // ext/mods/gameserver/model/actor/Player.getObjectId:()I
   #64 = NameAndType        #65:#44       // getObjectId:()I
   #65 = Utf8               getObjectId
   #66 = Methodref          #58.#67       // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.onScrollUse:(I)Z
   #67 = NameAndType        #68:#69       // onScrollUse:(I)Z
   #68 = Utf8               onScrollUse
   #69 = Utf8               (I)Z
   #70 = Methodref          #71.#72       // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
   #71 = Class              #73           // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent
   #72 = NameAndType        #61:#74       // getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
   #73 = Utf8               ext/mods/gameserver/model/entity/events/deathmatch/DMEvent
   #74 = Utf8               ()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
   #75 = Methodref          #71.#67       // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.onScrollUse:(I)Z
   #76 = Methodref          #77.#78       // ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
   #77 = Class              #79           // ext/mods/gameserver/model/entity/events/lastman/LMEvent
   #78 = NameAndType        #61:#80       // getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
   #79 = Utf8               ext/mods/gameserver/model/entity/events/lastman/LMEvent
   #80 = Utf8               ()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
   #81 = Methodref          #77.#67       // ext/mods/gameserver/model/entity/events/lastman/LMEvent.onScrollUse:(I)Z
   #82 = Methodref          #83.#84       // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
   #83 = Class              #85           // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent
   #84 = NameAndType        #61:#86       // getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
   #85 = Utf8               ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent
   #86 = Utf8               ()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
   #87 = Methodref          #83.#67       // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.onScrollUse:(I)Z
   #88 = Fieldref           #89.#90       // ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #89 = Class              #91           // ext/mods/gameserver/network/serverpackets/ActionFailed
   #90 = NameAndType        #92:#93       // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #91 = Utf8               ext/mods/gameserver/network/serverpackets/ActionFailed
   #92 = Utf8               STATIC_PACKET
   #93 = Utf8               Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #94 = Methodref          #29.#95       // ext/mods/gameserver/model/actor/Player.isFestivalParticipant:()Z
   #95 = NameAndType        #96:#28       // isFestivalParticipant:()Z
   #96 = Utf8               isFestivalParticipant
   #97 = String             #98           // You may not resurrect participants in a festival.
   #98 = Utf8               You may not resurrect participants in a festival.
   #99 = Methodref          #8.#100       // ext/mods/gameserver/model/actor/Playable.sendMessage:(Ljava/lang/String;)V
  #100 = NameAndType        #101:#102     // sendMessage:(Ljava/lang/String;)V
  #101 = Utf8               sendMessage
  #102 = Utf8               (Ljava/lang/String;)V
  #103 = Methodref          #29.#104      // ext/mods/gameserver/model/actor/Player.isReviveRequested:()Z
  #104 = NameAndType        #105:#28      // isReviveRequested:()Z
  #105 = Utf8               isReviveRequested
  #106 = Methodref          #29.#107      // ext/mods/gameserver/model/actor/Player.isRevivingPet:()Z
  #107 = NameAndType        #108:#28      // isRevivingPet:()Z
  #108 = Utf8               isRevivingPet
  #109 = Fieldref           #16.#110      // ext/mods/gameserver/network/SystemMessageId.CANNOT_RES_MASTER:Lext/mods/gameserver/network/SystemMessageId;
  #110 = NameAndType        #111:#20      // CANNOT_RES_MASTER:Lext/mods/gameserver/network/SystemMessageId;
  #111 = Utf8               CANNOT_RES_MASTER
  #112 = Methodref          #29.#22       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #113 = Fieldref           #16.#114      // ext/mods/gameserver/network/SystemMessageId.RES_HAS_ALREADY_BEEN_PROPOSED:Lext/mods/gameserver/network/SystemMessageId;
  #114 = NameAndType        #115:#20      // RES_HAS_ALREADY_BEEN_PROPOSED:Lext/mods/gameserver/network/SystemMessageId;
  #115 = Utf8               RES_HAS_ALREADY_BEEN_PROPOSED
  #116 = Class              #117          // ext/mods/gameserver/model/actor/instance/Pet
  #117 = Utf8               ext/mods/gameserver/model/actor/instance/Pet
  #118 = Methodref          #116.#119     // ext/mods/gameserver/model/actor/instance/Pet.getOwner:()Lext/mods/gameserver/model/actor/Player;
  #119 = NameAndType        #120:#121     // getOwner:()Lext/mods/gameserver/model/actor/Player;
  #120 = Utf8               getOwner
  #121 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #122 = Fieldref           #16.#123      // ext/mods/gameserver/network/SystemMessageId.CANNOT_RES_PET2:Lext/mods/gameserver/network/SystemMessageId;
  #123 = NameAndType        #124:#20      // CANNOT_RES_PET2:Lext/mods/gameserver/network/SystemMessageId;
  #124 = Utf8               CANNOT_RES_PET2
  #125 = Methodref          #126.#127     // ext/mods/gameserver/model/item/instance/ItemInstance.getEtcItem:()Lext/mods/gameserver/model/item/kind/EtcItem;
  #126 = Class              #128          // ext/mods/gameserver/model/item/instance/ItemInstance
  #127 = NameAndType        #129:#130     // getEtcItem:()Lext/mods/gameserver/model/item/kind/EtcItem;
  #128 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #129 = Utf8               getEtcItem
  #130 = Utf8               ()Lext/mods/gameserver/model/item/kind/EtcItem;
  #131 = Methodref          #132.#133     // ext/mods/gameserver/model/item/kind/EtcItem.getSkills:()[Lext/mods/gameserver/model/holder/IntIntHolder;
  #132 = Class              #134          // ext/mods/gameserver/model/item/kind/EtcItem
  #133 = NameAndType        #135:#136     // getSkills:()[Lext/mods/gameserver/model/holder/IntIntHolder;
  #134 = Utf8               ext/mods/gameserver/model/item/kind/EtcItem
  #135 = Utf8               getSkills
  #136 = Utf8               ()[Lext/mods/gameserver/model/holder/IntIntHolder;
  #137 = Fieldref           #138.#139     // ext/mods/gameserver/handler/itemhandlers/ScrollsOfResurrection.LOGGER:Lext/mods/commons/logging/CLogger;
  #138 = Class              #140          // ext/mods/gameserver/handler/itemhandlers/ScrollsOfResurrection
  #139 = NameAndType        #141:#142     // LOGGER:Lext/mods/commons/logging/CLogger;
  #140 = Utf8               ext/mods/gameserver/handler/itemhandlers/ScrollsOfResurrection
  #141 = Utf8               LOGGER
  #142 = Utf8               Lext/mods/commons/logging/CLogger;
  #143 = String             #144          // {} doesn\'t have any registered skill for handler.
  #144 = Utf8               {} doesn\'t have any registered skill for handler.
  #145 = Methodref          #126.#146     // ext/mods/gameserver/model/item/instance/ItemInstance.getName:()Ljava/lang/String;
  #146 = NameAndType        #147:#148     // getName:()Ljava/lang/String;
  #147 = Utf8               getName
  #148 = Utf8               ()Ljava/lang/String;
  #149 = Methodref          #150.#151     // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #150 = Class              #152          // ext/mods/commons/logging/CLogger
  #151 = NameAndType        #153:#154     // warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #152 = Utf8               ext/mods/commons/logging/CLogger
  #153 = Utf8               warn
  #154 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
  #155 = Methodref          #156.#157     // ext/mods/gameserver/model/holder/IntIntHolder.getSkill:()Lext/mods/gameserver/skills/L2Skill;
  #156 = Class              #158          // ext/mods/gameserver/model/holder/IntIntHolder
  #157 = NameAndType        #159:#160     // getSkill:()Lext/mods/gameserver/skills/L2Skill;
  #158 = Utf8               ext/mods/gameserver/model/holder/IntIntHolder
  #159 = Utf8               getSkill
  #160 = Utf8               ()Lext/mods/gameserver/skills/L2Skill;
  #161 = Methodref          #8.#162       // ext/mods/gameserver/model/actor/Playable.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
  #162 = NameAndType        #163:#164     // getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
  #163 = Utf8               getAI
  #164 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
  #165 = Methodref          #166.#167     // ext/mods/gameserver/model/actor/ai/type/PlayableAI.tryToCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #166 = Class              #168          // ext/mods/gameserver/model/actor/ai/type/PlayableAI
  #167 = NameAndType        #169:#170     // tryToCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #168 = Utf8               ext/mods/gameserver/model/actor/ai/type/PlayableAI
  #169 = Utf8               tryToCast
  #170 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #171 = Class              #172          // ext/mods/gameserver/handler/IItemHandler
  #172 = Utf8               ext/mods/gameserver/handler/IItemHandler
  #173 = Utf8               Code
  #174 = Utf8               LineNumberTable
  #175 = Utf8               LocalVariableTable
  #176 = Utf8               this
  #177 = Utf8               Lext/mods/gameserver/handler/itemhandlers/ScrollsOfResurrection;
  #178 = Utf8               useItem
  #179 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #180 = Utf8               targetCreature
  #181 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #182 = Utf8               player
  #183 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #184 = Utf8               targetPlayer
  #185 = Utf8               targetPet
  #186 = Utf8               Lext/mods/gameserver/model/actor/instance/Pet;
  #187 = Utf8               itemSkill
  #188 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #189 = Utf8               skillInfo
  #190 = Utf8               Lext/mods/gameserver/model/holder/IntIntHolder;
  #191 = Utf8               playable
  #192 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #193 = Utf8               item
  #194 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #195 = Utf8               forceUse
  #196 = Utf8               Z
  #197 = Utf8               obj
  #198 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #199 = Utf8               skills
  #200 = Utf8               [Lext/mods/gameserver/model/holder/IntIntHolder;
  #201 = Utf8               StackMapTable
  #202 = Class              #203          // ext/mods/gameserver/model/WorldObject
  #203 = Utf8               ext/mods/gameserver/model/WorldObject
  #204 = Class              #200          // "[Lext/mods/gameserver/model/holder/IntIntHolder;"
  #205 = Class              #206          // ext/mods/gameserver/skills/L2Skill
  #206 = Utf8               ext/mods/gameserver/skills/L2Skill
  #207 = Utf8               SourceFile
  #208 = Utf8               ScrollsOfResurrection.java
{
  public ext.mods.gameserver.handler.itemhandlers.ScrollsOfResurrection();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 38: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/itemhandlers/ScrollsOfResurrection;

  public void useItem(ext.mods.gameserver.model.actor.Playable, ext.mods.gameserver.model.item.instance.ItemInstance, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=12, args_size=4
         0: aload_1
         1: invokevirtual #7                  // Method ext/mods/gameserver/model/actor/Playable.getTarget:()Lext/mods/gameserver/model/WorldObject;
         4: astore        4
         6: aload         4
         8: instanceof    #13                 // class ext/mods/gameserver/model/actor/Creature
        11: ifeq          24
        14: aload         4
        16: checkcast     #13                 // class ext/mods/gameserver/model/actor/Creature
        19: astore        5
        21: goto          32
        24: aload_1
        25: getstatic     #15                 // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
        28: invokevirtual #21                 // Method ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        31: return
        32: aload         5
        34: invokevirtual #25                 // Method ext/mods/gameserver/model/actor/Creature.isDead:()Z
        37: ifeq          279
        40: aload         5
        42: instanceof    #29                 // class ext/mods/gameserver/model/actor/Player
        45: ifeq          206
        48: aload         5
        50: checkcast     #29                 // class ext/mods/gameserver/model/actor/Player
        53: astore        6
        55: aload         6
        57: getstatic     #31                 // Field ext/mods/gameserver/enums/ZoneId.SIEGE:Lext/mods/gameserver/enums/ZoneId;
        60: invokevirtual #37                 // Method ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
        63: ifeq          85
        66: aload         6
        68: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getSiegeState:()I
        71: ifne          85
        74: aload_1
        75: getstatic     #45                 // Field ext/mods/gameserver/network/SystemMessageId.CANNOT_BE_RESURRECTED_DURING_SIEGE:Lext/mods/gameserver/network/SystemMessageId;
        78: invokestatic  #48                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        81: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        84: return
        85: invokestatic  #57                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
        88: aload         6
        90: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        93: invokevirtual #66                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.onScrollUse:(I)Z
        96: ifeq          141
        99: invokestatic  #70                 // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
       102: aload         6
       104: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       107: invokevirtual #75                 // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.onScrollUse:(I)Z
       110: ifeq          141
       113: invokestatic  #76                 // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
       116: aload         6
       118: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       121: invokevirtual #81                 // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.onScrollUse:(I)Z
       124: ifeq          141
       127: invokestatic  #82                 // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
       130: aload         6
       132: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       135: invokevirtual #87                 // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.onScrollUse:(I)Z
       138: ifne          149
       141: aload_1
       142: getstatic     #88                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       145: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       148: return
       149: aload         6
       151: invokevirtual #94                 // Method ext/mods/gameserver/model/actor/Player.isFestivalParticipant:()Z
       154: ifeq          164
       157: aload_1
       158: ldc           #97                 // String You may not resurrect participants in a festival.
       160: invokevirtual #99                 // Method ext/mods/gameserver/model/actor/Playable.sendMessage:(Ljava/lang/String;)V
       163: return
       164: aload         6
       166: invokevirtual #103                // Method ext/mods/gameserver/model/actor/Player.isReviveRequested:()Z
       169: ifeq          279
       172: aload_1
       173: checkcast     #29                 // class ext/mods/gameserver/model/actor/Player
       176: astore        8
       178: aload         6
       180: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.isRevivingPet:()Z
       183: ifeq          197
       186: aload         8
       188: getstatic     #109                // Field ext/mods/gameserver/network/SystemMessageId.CANNOT_RES_MASTER:Lext/mods/gameserver/network/SystemMessageId;
       191: invokevirtual #112                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       194: goto          205
       197: aload         8
       199: getstatic     #113                // Field ext/mods/gameserver/network/SystemMessageId.RES_HAS_ALREADY_BEEN_PROPOSED:Lext/mods/gameserver/network/SystemMessageId;
       202: invokevirtual #112                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       205: return
       206: aload         5
       208: instanceof    #116                // class ext/mods/gameserver/model/actor/instance/Pet
       211: ifeq          279
       214: aload         5
       216: checkcast     #116                // class ext/mods/gameserver/model/actor/instance/Pet
       219: astore        7
       221: aload_1
       222: checkcast     #29                 // class ext/mods/gameserver/model/actor/Player
       225: astore        8
       227: aload         7
       229: invokevirtual #118                // Method ext/mods/gameserver/model/actor/instance/Pet.getOwner:()Lext/mods/gameserver/model/actor/Player;
       232: aload         8
       234: if_acmpeq     279
       237: aload         7
       239: invokevirtual #118                // Method ext/mods/gameserver/model/actor/instance/Pet.getOwner:()Lext/mods/gameserver/model/actor/Player;
       242: invokevirtual #103                // Method ext/mods/gameserver/model/actor/Player.isReviveRequested:()Z
       245: ifeq          279
       248: aload         7
       250: invokevirtual #118                // Method ext/mods/gameserver/model/actor/instance/Pet.getOwner:()Lext/mods/gameserver/model/actor/Player;
       253: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.isRevivingPet:()Z
       256: ifeq          270
       259: aload         8
       261: getstatic     #113                // Field ext/mods/gameserver/network/SystemMessageId.RES_HAS_ALREADY_BEEN_PROPOSED:Lext/mods/gameserver/network/SystemMessageId;
       264: invokevirtual #112                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       267: goto          278
       270: aload         8
       272: getstatic     #122                // Field ext/mods/gameserver/network/SystemMessageId.CANNOT_RES_PET2:Lext/mods/gameserver/network/SystemMessageId;
       275: invokevirtual #112                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       278: return
       279: aload_2
       280: invokevirtual #125                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEtcItem:()Lext/mods/gameserver/model/item/kind/EtcItem;
       283: invokevirtual #131                // Method ext/mods/gameserver/model/item/kind/EtcItem.getSkills:()[Lext/mods/gameserver/model/holder/IntIntHolder;
       286: astore        6
       288: aload         6
       290: ifnonnull     313
       293: getstatic     #137                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       296: ldc           #143                // String {} doesn\'t have any registered skill for handler.
       298: iconst_1
       299: anewarray     #2                  // class java/lang/Object
       302: dup
       303: iconst_0
       304: aload_2
       305: invokevirtual #145                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getName:()Ljava/lang/String;
       308: aastore
       309: invokevirtual #149                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
       312: return
       313: aload         6
       315: astore        7
       317: aload         7
       319: arraylength
       320: istore        8
       322: iconst_0
       323: istore        9
       325: iload         9
       327: iload         8
       329: if_icmpge     379
       332: aload         7
       334: iload         9
       336: aaload
       337: astore        10
       339: aload         10
       341: ifnonnull     347
       344: goto          373
       347: aload         10
       349: invokevirtual #155                // Method ext/mods/gameserver/model/holder/IntIntHolder.getSkill:()Lext/mods/gameserver/skills/L2Skill;
       352: astore        11
       354: aload         11
       356: ifnonnull     362
       359: goto          373
       362: aload_1
       363: invokevirtual #161                // Method ext/mods/gameserver/model/actor/Playable.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
       366: aload         5
       368: aload         11
       370: invokevirtual #165                // Method ext/mods/gameserver/model/actor/ai/type/PlayableAI.tryToCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
       373: iinc          9, 1
       376: goto          325
       379: return
      LineNumberTable:
        line 43: 0
        line 44: 6
        line 46: 24
        line 47: 31
        line 50: 32
        line 52: 40
        line 54: 55
        line 56: 74
        line 57: 84
        line 60: 85
        line 62: 141
        line 63: 148
        line 66: 149
        line 68: 157
        line 69: 163
        line 72: 164
        line 74: 172
        line 76: 178
        line 77: 186
        line 79: 197
        line 81: 205
        line 84: 206
        line 86: 221
        line 88: 227
        line 90: 248
        line 91: 259
        line 93: 270
        line 95: 278
        line 100: 279
        line 101: 288
        line 103: 293
        line 104: 312
        line 107: 313
        line 109: 339
        line 110: 344
        line 112: 347
        line 113: 354
        line 114: 359
        line 116: 362
        line 107: 373
        line 118: 379
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           21       3     5 targetCreature   Lext/mods/gameserver/model/actor/Creature;
          178      28     8 player   Lext/mods/gameserver/model/actor/Player;
           55     151     6 targetPlayer   Lext/mods/gameserver/model/actor/Player;
          227      52     8 player   Lext/mods/gameserver/model/actor/Player;
          221      58     7 targetPet   Lext/mods/gameserver/model/actor/instance/Pet;
          354      19    11 itemSkill   Lext/mods/gameserver/skills/L2Skill;
          339      34    10 skillInfo   Lext/mods/gameserver/model/holder/IntIntHolder;
            0     380     0  this   Lext/mods/gameserver/handler/itemhandlers/ScrollsOfResurrection;
            0     380     1 playable   Lext/mods/gameserver/model/actor/Playable;
            0     380     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0     380     3 forceUse   Z
            6     374     4   obj   Lext/mods/gameserver/model/WorldObject;
           32     348     5 targetCreature   Lext/mods/gameserver/model/actor/Creature;
          288      92     6 skills   [Lext/mods/gameserver/model/holder/IntIntHolder;
      StackMapTable: number_of_entries = 18
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ class ext/mods/gameserver/model/WorldObject ]
        frame_type = 252 /* append */
          offset_delta = 7
          locals = [ class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 252 /* append */
          offset_delta = 52
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 55 /* same */
        frame_type = 7 /* same */
        frame_type = 14 /* same */
        frame_type = 253 /* append */
          offset_delta = 32
          locals = [ top, class ext/mods/gameserver/model/actor/Player ]
        frame_type = 7 /* same */
        frame_type = 248 /* chop */
          offset_delta = 0
        frame_type = 254 /* append */
          offset_delta = 63
          locals = [ top, class ext/mods/gameserver/model/actor/instance/Pet, class ext/mods/gameserver/model/actor/Player ]
        frame_type = 7 /* same */
        frame_type = 248 /* chop */
          offset_delta = 0
        frame_type = 252 /* append */
          offset_delta = 33
          locals = [ class "[Lext/mods/gameserver/model/holder/IntIntHolder;" ]
        frame_type = 254 /* append */
          offset_delta = 11
          locals = [ class "[Lext/mods/gameserver/model/holder/IntIntHolder;", int, int ]
        frame_type = 252 /* append */
          offset_delta = 21
          locals = [ class ext/mods/gameserver/model/holder/IntIntHolder ]
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/skills/L2Skill ]
        frame_type = 249 /* chop */
          offset_delta = 10
        frame_type = 248 /* chop */
          offset_delta = 5
}
SourceFile: "ScrollsOfResurrection.java"
