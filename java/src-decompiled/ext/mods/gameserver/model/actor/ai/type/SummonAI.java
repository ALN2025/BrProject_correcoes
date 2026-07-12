// Bytecode for: ext.mods.gameserver.model.actor.ai.type.SummonAI
// File: ext\mods\gameserver\model\actor\ai\type\SummonAI.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/ai/type/SummonAI.class
  Last modified 9 de jul de 2026; size 11193 bytes
  MD5 checksum f801f52d60d0880e65a4d59ab27260b7
  Compiled from "SummonAI.java"
public class ext.mods.gameserver.model.actor.ai.type.SummonAI extends ext.mods.gameserver.model.actor.ai.type.PlayableAI<ext.mods.gameserver.model.actor.Summon>
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/ai/type/SummonAI
  super_class: #2                         // ext/mods/gameserver/model/actor/ai/type/PlayableAI
  interfaces: 0, fields: 1, methods: 17, attributes: 2
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/ai/type/PlayableAI."<init>":(Lext/mods/gameserver/model/actor/Playable;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/ai/type/PlayableAI
    #3 = NameAndType        #5:#6         // "<init>":(Lext/mods/gameserver/model/actor/Playable;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/ai/type/PlayableAI
    #5 = Utf8               <init>
    #6 = Utf8               (Lext/mods/gameserver/model/actor/Playable;)V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/actor/ai/type/SummonAI._followOwner:Z
    #8 = Class              #10           // ext/mods/gameserver/model/actor/ai/type/SummonAI
    #9 = NameAndType        #11:#12       // _followOwner:Z
   #10 = Utf8               ext/mods/gameserver/model/actor/ai/type/SummonAI
   #11 = Utf8               _followOwner
   #12 = Utf8               Z
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/model/actor/ai/type/SummonAI._nextIntention:Lext/mods/gameserver/model/actor/ai/Intention;
   #14 = NameAndType        #15:#16       // _nextIntention:Lext/mods/gameserver/model/actor/ai/Intention;
   #15 = Utf8               _nextIntention
   #16 = Utf8               Lext/mods/gameserver/model/actor/ai/Intention;
   #17 = Methodref          #18.#19       // ext/mods/gameserver/model/actor/ai/Intention.isBlank:()Z
   #18 = Class              #20           // ext/mods/gameserver/model/actor/ai/Intention
   #19 = NameAndType        #21:#22       // isBlank:()Z
   #20 = Utf8               ext/mods/gameserver/model/actor/ai/Intention
   #21 = Utf8               isBlank
   #22 = Utf8               ()Z
   #23 = Fieldref           #8.#24        // ext/mods/gameserver/model/actor/ai/type/SummonAI._previousIntention:Lext/mods/gameserver/model/actor/ai/Intention;
   #24 = NameAndType        #25:#16       // _previousIntention:Lext/mods/gameserver/model/actor/ai/Intention;
   #25 = Utf8               _previousIntention
   #26 = Methodref          #18.#27       // ext/mods/gameserver/model/actor/ai/Intention.getType:()Lext/mods/gameserver/enums/IntentionType;
   #27 = NameAndType        #28:#29       // getType:()Lext/mods/gameserver/enums/IntentionType;
   #28 = Utf8               getType
   #29 = Utf8               ()Lext/mods/gameserver/enums/IntentionType;
   #30 = Fieldref           #31.#32       // ext/mods/gameserver/enums/IntentionType.ATTACK:Lext/mods/gameserver/enums/IntentionType;
   #31 = Class              #33           // ext/mods/gameserver/enums/IntentionType
   #32 = NameAndType        #34:#35       // ATTACK:Lext/mods/gameserver/enums/IntentionType;
   #33 = Utf8               ext/mods/gameserver/enums/IntentionType
   #34 = Utf8               ATTACK
   #35 = Utf8               Lext/mods/gameserver/enums/IntentionType;
   #36 = Methodref          #8.#37        // ext/mods/gameserver/model/actor/ai/type/SummonAI.doIntention:(Lext/mods/gameserver/model/actor/ai/Intention;)V
   #37 = NameAndType        #38:#39       // doIntention:(Lext/mods/gameserver/model/actor/ai/Intention;)V
   #38 = Utf8               doIntention
   #39 = Utf8               (Lext/mods/gameserver/model/actor/ai/Intention;)V
   #40 = Methodref          #8.#41        // ext/mods/gameserver/model/actor/ai/type/SummonAI.doIdleIntention:()V
   #41 = NameAndType        #42:#43       // doIdleIntention:()V
   #42 = Utf8               doIdleIntention
   #43 = Utf8               ()V
   #44 = Methodref          #2.#45        // ext/mods/gameserver/model/actor/ai/type/PlayableAI.onEvtAttacked:(Lext/mods/gameserver/model/actor/Creature;)V
   #45 = NameAndType        #46:#47       // onEvtAttacked:(Lext/mods/gameserver/model/actor/Creature;)V
   #46 = Utf8               onEvtAttacked
   #47 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
   #48 = Fieldref           #8.#49        // ext/mods/gameserver/model/actor/ai/type/SummonAI._actor:Lext/mods/gameserver/model/actor/Creature;
   #49 = NameAndType        #50:#51       // _actor:Lext/mods/gameserver/model/actor/Creature;
   #50 = Utf8               _actor
   #51 = Utf8               Lext/mods/gameserver/model/actor/Creature;
   #52 = Class              #53           // ext/mods/gameserver/model/actor/Summon
   #53 = Utf8               ext/mods/gameserver/model/actor/Summon
   #54 = Methodref          #52.#55       // ext/mods/gameserver/model/actor/Summon.getMove:()Lext/mods/gameserver/model/actor/move/SummonMove;
   #55 = NameAndType        #56:#57       // getMove:()Lext/mods/gameserver/model/actor/move/SummonMove;
   #56 = Utf8               getMove
   #57 = Utf8               ()Lext/mods/gameserver/model/actor/move/SummonMove;
   #58 = Methodref          #59.#60       // ext/mods/gameserver/model/actor/move/SummonMove.avoidAttack:(Lext/mods/gameserver/model/actor/Creature;)V
   #59 = Class              #61           // ext/mods/gameserver/model/actor/move/SummonMove
   #60 = NameAndType        #62:#47       // avoidAttack:(Lext/mods/gameserver/model/actor/Creature;)V
   #61 = Utf8               ext/mods/gameserver/model/actor/move/SummonMove
   #62 = Utf8               avoidAttack
   #63 = Methodref          #2.#64        // ext/mods/gameserver/model/actor/ai/type/PlayableAI.onEvtEvaded:(Lext/mods/gameserver/model/actor/Creature;)V
   #64 = NameAndType        #65:#47       // onEvtEvaded:(Lext/mods/gameserver/model/actor/Creature;)V
   #65 = Utf8               onEvtEvaded
   #66 = Methodref          #52.#67       // ext/mods/gameserver/model/actor/Summon.denyAiAction:()Z
   #67 = NameAndType        #68:#22       // denyAiAction:()Z
   #68 = Utf8               denyAiAction
   #69 = Fieldref           #8.#70        // ext/mods/gameserver/model/actor/ai/type/SummonAI._currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
   #70 = NameAndType        #71:#16       // _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
   #71 = Utf8               _currentIntention
   #72 = Methodref          #18.#73       // ext/mods/gameserver/model/actor/ai/Intention.getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
   #73 = NameAndType        #74:#75       // getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
   #74 = Utf8               getFinalTarget
   #75 = Utf8               ()Lext/mods/gameserver/model/actor/Creature;
   #76 = Methodref          #8.#77        // ext/mods/gameserver/model/actor/ai/type/SummonAI.isTargetLost:(Lext/mods/gameserver/model/WorldObject;)Z
   #77 = NameAndType        #78:#79       // isTargetLost:(Lext/mods/gameserver/model/WorldObject;)Z
   #78 = Utf8               isTargetLost
   #79 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Z
   #80 = Methodref          #18.#81       // ext/mods/gameserver/model/actor/ai/Intention.isShiftPressed:()Z
   #81 = NameAndType        #82:#22       // isShiftPressed:()Z
   #82 = Utf8               isShiftPressed
   #83 = Methodref          #52.#84       // ext/mods/gameserver/model/actor/Summon.getStatus:()Lext/mods/gameserver/model/actor/status/SummonStatus;
   #84 = NameAndType        #85:#86       // getStatus:()Lext/mods/gameserver/model/actor/status/SummonStatus;
   #85 = Utf8               getStatus
   #86 = Utf8               ()Lext/mods/gameserver/model/actor/status/SummonStatus;
   #87 = Methodref          #88.#89       // ext/mods/gameserver/model/actor/status/SummonStatus.getPhysicalAttackRange:()I
   #88 = Class              #90           // ext/mods/gameserver/model/actor/status/SummonStatus
   #89 = NameAndType        #91:#92       // getPhysicalAttackRange:()I
   #90 = Utf8               ext/mods/gameserver/model/actor/status/SummonStatus
   #91 = Utf8               getPhysicalAttackRange
   #92 = Utf8               ()I
   #93 = Methodref          #59.#94       // ext/mods/gameserver/model/actor/move/SummonMove.maybeStartOffensiveFollow:(Lext/mods/gameserver/model/actor/Creature;I)Z
   #94 = NameAndType        #95:#96       // maybeStartOffensiveFollow:(Lext/mods/gameserver/model/actor/Creature;I)Z
   #95 = Utf8               maybeStartOffensiveFollow
   #96 = Utf8               (Lext/mods/gameserver/model/actor/Creature;I)Z
   #97 = Methodref          #59.#98       // ext/mods/gameserver/model/actor/move/SummonMove.stop:()V
   #98 = NameAndType        #99:#43       // stop:()V
   #99 = Utf8               stop
  #100 = Methodref          #52.#101      // ext/mods/gameserver/model/actor/Summon.getAttack:()Lext/mods/gameserver/model/actor/attack/CreatureAttack;
  #101 = NameAndType        #102:#103     // getAttack:()Lext/mods/gameserver/model/actor/attack/CreatureAttack;
  #102 = Utf8               getAttack
  #103 = Utf8               ()Lext/mods/gameserver/model/actor/attack/CreatureAttack;
  #104 = Methodref          #105.#106     // ext/mods/gameserver/model/actor/attack/CreatureAttack.canAttack:(Lext/mods/gameserver/model/actor/Creature;)Z
  #105 = Class              #107          // ext/mods/gameserver/model/actor/attack/CreatureAttack
  #106 = NameAndType        #108:#109     // canAttack:(Lext/mods/gameserver/model/actor/Creature;)Z
  #107 = Utf8               ext/mods/gameserver/model/actor/attack/CreatureAttack
  #108 = Utf8               canAttack
  #109 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
  #110 = Methodref          #105.#111     // ext/mods/gameserver/model/actor/attack/CreatureAttack.doAttack:(Lext/mods/gameserver/model/actor/Creature;)V
  #111 = NameAndType        #112:#47      // doAttack:(Lext/mods/gameserver/model/actor/Creature;)V
  #112 = Utf8               doAttack
  #113 = Fieldref           #114.#115     // ext/mods/Config.ATTACK_PTS:Z
  #114 = Class              #116          // ext/mods/Config
  #115 = NameAndType        #117:#12      // ATTACK_PTS:Z
  #116 = Utf8               ext/mods/Config
  #117 = Utf8               ATTACK_PTS
  #118 = Methodref          #8.#119       // ext/mods/gameserver/model/actor/ai/type/SummonAI.setNextIntention:(Lext/mods/gameserver/model/actor/ai/Intention;)V
  #119 = NameAndType        #120:#39      // setNextIntention:(Lext/mods/gameserver/model/actor/ai/Intention;)V
  #120 = Utf8               setNextIntention
  #121 = Methodref          #18.#122      // ext/mods/gameserver/model/actor/ai/Intention.getTarget:()Lext/mods/gameserver/model/WorldObject;
  #122 = NameAndType        #123:#124     // getTarget:()Lext/mods/gameserver/model/WorldObject;
  #123 = Utf8               getTarget
  #124 = Utf8               ()Lext/mods/gameserver/model/WorldObject;
  #125 = Methodref          #126.#127     // ext/mods/gameserver/model/WorldObject.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #126 = Class              #128          // ext/mods/gameserver/model/WorldObject
  #127 = NameAndType        #129:#130     // getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #128 = Utf8               ext/mods/gameserver/model/WorldObject
  #129 = Utf8               getPosition
  #130 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
  #131 = Methodref          #59.#132      // ext/mods/gameserver/model/actor/move/SummonMove.maybeMoveToLocation:(Lext/mods/gameserver/model/location/Location;IZZ)Z
  #132 = NameAndType        #133:#134     // maybeMoveToLocation:(Lext/mods/gameserver/model/location/Location;IZZ)Z
  #133 = Utf8               maybeMoveToLocation
  #134 = Utf8               (Lext/mods/gameserver/model/location/Location;IZZ)Z
  #135 = Methodref          #2.#136       // ext/mods/gameserver/model/actor/ai/type/PlayableAI.thinkPickUp:()Lext/mods/gameserver/model/item/instance/ItemInstance;
  #136 = NameAndType        #137:#138     // thinkPickUp:()Lext/mods/gameserver/model/item/instance/ItemInstance;
  #137 = Utf8               thinkPickUp
  #138 = Utf8               ()Lext/mods/gameserver/model/item/instance/ItemInstance;
  #139 = Methodref          #140.#141     // ext/mods/gameserver/data/manager/CursedWeaponManager.getInstance:()Lext/mods/gameserver/data/manager/CursedWeaponManager;
  #140 = Class              #142          // ext/mods/gameserver/data/manager/CursedWeaponManager
  #141 = NameAndType        #143:#144     // getInstance:()Lext/mods/gameserver/data/manager/CursedWeaponManager;
  #142 = Utf8               ext/mods/gameserver/data/manager/CursedWeaponManager
  #143 = Utf8               getInstance
  #144 = Utf8               ()Lext/mods/gameserver/data/manager/CursedWeaponManager;
  #145 = Methodref          #146.#147     // ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
  #146 = Class              #148          // ext/mods/gameserver/model/item/instance/ItemInstance
  #147 = NameAndType        #149:#92      // getItemId:()I
  #148 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #149 = Utf8               getItemId
  #150 = Methodref          #140.#151     // ext/mods/gameserver/data/manager/CursedWeaponManager.isCursed:(I)Z
  #151 = NameAndType        #152:#153     // isCursed:(I)Z
  #152 = Utf8               isCursed
  #153 = Utf8               (I)Z
  #154 = Methodref          #52.#155      // ext/mods/gameserver/model/actor/Summon.getOwner:()Lext/mods/gameserver/model/actor/Player;
  #155 = NameAndType        #156:#157     // getOwner:()Lext/mods/gameserver/model/actor/Player;
  #156 = Utf8               getOwner
  #157 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #158 = Fieldref           #159.#160     // ext/mods/gameserver/network/SystemMessageId.FAILED_TO_PICKUP_S1:Lext/mods/gameserver/network/SystemMessageId;
  #159 = Class              #161          // ext/mods/gameserver/network/SystemMessageId
  #160 = NameAndType        #162:#163     // FAILED_TO_PICKUP_S1:Lext/mods/gameserver/network/SystemMessageId;
  #161 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #162 = Utf8               FAILED_TO_PICKUP_S1
  #163 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #164 = Methodref          #165.#166     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #165 = Class              #167          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #166 = NameAndType        #168:#169     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #167 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #168 = Utf8               getSystemMessage
  #169 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #170 = Methodref          #165.#171     // ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #171 = NameAndType        #172:#173     // addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #172 = Utf8               addItemName
  #173 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #174 = Methodref          #175.#176     // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #175 = Class              #177          // ext/mods/gameserver/model/actor/Player
  #176 = NameAndType        #178:#179     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #177 = Utf8               ext/mods/gameserver/model/actor/Player
  #178 = Utf8               sendPacket
  #179 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #180 = Methodref          #146.#181     // ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
  #181 = NameAndType        #182:#183     // getItem:()Lext/mods/gameserver/model/item/kind/Item;
  #182 = Utf8               getItem
  #183 = Utf8               ()Lext/mods/gameserver/model/item/kind/Item;
  #184 = Methodref          #185.#186     // ext/mods/gameserver/model/item/kind/Item.getItemType:()Lext/mods/gameserver/enums/items/ItemType;
  #185 = Class              #187          // ext/mods/gameserver/model/item/kind/Item
  #186 = NameAndType        #188:#189     // getItemType:()Lext/mods/gameserver/enums/items/ItemType;
  #187 = Utf8               ext/mods/gameserver/model/item/kind/Item
  #188 = Utf8               getItemType
  #189 = Utf8               ()Lext/mods/gameserver/enums/items/ItemType;
  #190 = Fieldref           #191.#192     // ext/mods/gameserver/enums/items/EtcItemType.ARROW:Lext/mods/gameserver/enums/items/EtcItemType;
  #191 = Class              #193          // ext/mods/gameserver/enums/items/EtcItemType
  #192 = NameAndType        #194:#195     // ARROW:Lext/mods/gameserver/enums/items/EtcItemType;
  #193 = Utf8               ext/mods/gameserver/enums/items/EtcItemType
  #194 = Utf8               ARROW
  #195 = Utf8               Lext/mods/gameserver/enums/items/EtcItemType;
  #196 = Fieldref           #191.#197     // ext/mods/gameserver/enums/items/EtcItemType.SHOT:Lext/mods/gameserver/enums/items/EtcItemType;
  #197 = NameAndType        #198:#195     // SHOT:Lext/mods/gameserver/enums/items/EtcItemType;
  #198 = Utf8               SHOT
  #199 = Fieldref           #159.#200     // ext/mods/gameserver/network/SystemMessageId.ITEM_NOT_FOR_PETS:Lext/mods/gameserver/network/SystemMessageId;
  #200 = NameAndType        #201:#163     // ITEM_NOT_FOR_PETS:Lext/mods/gameserver/network/SystemMessageId;
  #201 = Utf8               ITEM_NOT_FOR_PETS
  #202 = Methodref          #175.#203     // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #203 = NameAndType        #178:#204     // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #204 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #205 = Methodref          #146.#206     // ext/mods/gameserver/model/item/instance/ItemInstance.isVisible:()Z
  #206 = NameAndType        #207:#22      // isVisible:()Z
  #207 = Utf8               isVisible
  #208 = Methodref          #52.#209      // ext/mods/gameserver/model/actor/Summon.getInventory:()Lext/mods/gameserver/model/itemcontainer/PetInventory;
  #209 = NameAndType        #210:#211     // getInventory:()Lext/mods/gameserver/model/itemcontainer/PetInventory;
  #210 = Utf8               getInventory
  #211 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PetInventory;
  #212 = Methodref          #213.#214     // ext/mods/gameserver/model/itemcontainer/PetInventory.validateCapacity:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
  #213 = Class              #215          // ext/mods/gameserver/model/itemcontainer/PetInventory
  #214 = NameAndType        #216:#217     // validateCapacity:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
  #215 = Utf8               ext/mods/gameserver/model/itemcontainer/PetInventory
  #216 = Utf8               validateCapacity
  #217 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
  #218 = Fieldref           #159.#219     // ext/mods/gameserver/network/SystemMessageId.YOUR_PET_CANNOT_CARRY_ANY_MORE_ITEMS:Lext/mods/gameserver/network/SystemMessageId;
  #219 = NameAndType        #220:#163     // YOUR_PET_CANNOT_CARRY_ANY_MORE_ITEMS:Lext/mods/gameserver/network/SystemMessageId;
  #220 = Utf8               YOUR_PET_CANNOT_CARRY_ANY_MORE_ITEMS
  #221 = Methodref          #146.#222     // ext/mods/gameserver/model/item/instance/ItemInstance.getWeight:()I
  #222 = NameAndType        #223:#92      // getWeight:()I
  #223 = Utf8               getWeight
  #224 = Methodref          #213.#225     // ext/mods/gameserver/model/itemcontainer/PetInventory.validateWeight:(I)Z
  #225 = NameAndType        #226:#153     // validateWeight:(I)Z
  #226 = Utf8               validateWeight
  #227 = Fieldref           #159.#228     // ext/mods/gameserver/network/SystemMessageId.UNABLE_TO_PLACE_ITEM_YOUR_PET_IS_TOO_ENCUMBERED:Lext/mods/gameserver/network/SystemMessageId;
  #228 = NameAndType        #229:#163     // UNABLE_TO_PLACE_ITEM_YOUR_PET_IS_TOO_ENCUMBERED:Lext/mods/gameserver/network/SystemMessageId;
  #229 = Utf8               UNABLE_TO_PLACE_ITEM_YOUR_PET_IS_TOO_ENCUMBERED
  #230 = Methodref          #146.#231     // ext/mods/gameserver/model/item/instance/ItemInstance.getOwnerId:()I
  #231 = NameAndType        #232:#92      // getOwnerId:()I
  #232 = Utf8               getOwnerId
  #233 = Methodref          #175.#234     // ext/mods/gameserver/model/actor/Player.isLooterOrInLooterParty:(I)Z
  #234 = NameAndType        #235:#153     // isLooterOrInLooterParty:(I)Z
  #235 = Utf8               isLooterOrInLooterParty
  #236 = Fieldref           #159.#237     // ext/mods/gameserver/network/SystemMessageId.FAILED_TO_PICKUP_S1_ADENA:Lext/mods/gameserver/network/SystemMessageId;
  #237 = NameAndType        #238:#163     // FAILED_TO_PICKUP_S1_ADENA:Lext/mods/gameserver/network/SystemMessageId;
  #238 = Utf8               FAILED_TO_PICKUP_S1_ADENA
  #239 = Methodref          #146.#240     // ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
  #240 = NameAndType        #241:#92      // getCount:()I
  #241 = Utf8               getCount
  #242 = Methodref          #165.#243     // ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #243 = NameAndType        #244:#173     // addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #244 = Utf8               addNumber
  #245 = Fieldref           #159.#246     // ext/mods/gameserver/network/SystemMessageId.FAILED_TO_PICKUP_S2_S1_S:Lext/mods/gameserver/network/SystemMessageId;
  #246 = NameAndType        #247:#163     // FAILED_TO_PICKUP_S2_S1_S:Lext/mods/gameserver/network/SystemMessageId;
  #247 = Utf8               FAILED_TO_PICKUP_S2_S1_S
  #248 = Methodref          #146.#249     // ext/mods/gameserver/model/item/instance/ItemInstance.hasDropProtection:()Z
  #249 = NameAndType        #250:#22      // hasDropProtection:()Z
  #250 = Utf8               hasDropProtection
  #251 = Methodref          #146.#252     // ext/mods/gameserver/model/item/instance/ItemInstance.removeDropProtection:()V
  #252 = NameAndType        #253:#43      // removeDropProtection:()V
  #253 = Utf8               removeDropProtection
  #254 = Methodref          #146.#255     // ext/mods/gameserver/model/item/instance/ItemInstance.pickupMe:(Lext/mods/gameserver/model/actor/Creature;)V
  #255 = NameAndType        #256:#47      // pickupMe:(Lext/mods/gameserver/model/actor/Creature;)V
  #256 = Utf8               pickupMe
  #257 = Methodref          #258.#259     // ext/mods/gameserver/taskmanager/ItemsOnGroundTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/ItemsOnGroundTaskManager;
  #258 = Class              #260          // ext/mods/gameserver/taskmanager/ItemsOnGroundTaskManager
  #259 = NameAndType        #143:#261     // getInstance:()Lext/mods/gameserver/taskmanager/ItemsOnGroundTaskManager;
  #260 = Utf8               ext/mods/gameserver/taskmanager/ItemsOnGroundTaskManager
  #261 = Utf8               ()Lext/mods/gameserver/taskmanager/ItemsOnGroundTaskManager;
  #262 = Methodref          #258.#263     // ext/mods/gameserver/taskmanager/ItemsOnGroundTaskManager.remove:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #263 = NameAndType        #264:#265     // remove:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #264 = Utf8               remove
  #265 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #266 = Methodref          #146.#186     // ext/mods/gameserver/model/item/instance/ItemInstance.getItemType:()Lext/mods/gameserver/enums/items/ItemType;
  #267 = Fieldref           #191.#268     // ext/mods/gameserver/enums/items/EtcItemType.HERB:Lext/mods/gameserver/enums/items/EtcItemType;
  #268 = NameAndType        #269:#195     // HERB:Lext/mods/gameserver/enums/items/EtcItemType;
  #269 = Utf8               HERB
  #270 = Methodref          #271.#272     // ext/mods/gameserver/handler/ItemHandler.getInstance:()Lext/mods/gameserver/handler/ItemHandler;
  #271 = Class              #273          // ext/mods/gameserver/handler/ItemHandler
  #272 = NameAndType        #143:#274     // getInstance:()Lext/mods/gameserver/handler/ItemHandler;
  #273 = Utf8               ext/mods/gameserver/handler/ItemHandler
  #274 = Utf8               ()Lext/mods/gameserver/handler/ItemHandler;
  #275 = Methodref          #146.#276     // ext/mods/gameserver/model/item/instance/ItemInstance.getEtcItem:()Lext/mods/gameserver/model/item/kind/EtcItem;
  #276 = NameAndType        #277:#278     // getEtcItem:()Lext/mods/gameserver/model/item/kind/EtcItem;
  #277 = Utf8               getEtcItem
  #278 = Utf8               ()Lext/mods/gameserver/model/item/kind/EtcItem;
  #279 = Methodref          #271.#280     // ext/mods/gameserver/handler/ItemHandler.getHandler:(Ljava/lang/Object;)Lext/mods/gameserver/handler/IItemHandler;
  #280 = NameAndType        #281:#282     // getHandler:(Ljava/lang/Object;)Lext/mods/gameserver/handler/IItemHandler;
  #281 = Utf8               getHandler
  #282 = Utf8               (Ljava/lang/Object;)Lext/mods/gameserver/handler/IItemHandler;
  #283 = Class              #284          // ext/mods/gameserver/model/actor/Playable
  #284 = Utf8               ext/mods/gameserver/model/actor/Playable
  #285 = InterfaceMethodref #286.#287     // ext/mods/gameserver/handler/IItemHandler.useItem:(Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #286 = Class              #288          // ext/mods/gameserver/handler/IItemHandler
  #287 = NameAndType        #289:#290     // useItem:(Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #288 = Utf8               ext/mods/gameserver/handler/IItemHandler
  #289 = Utf8               useItem
  #290 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #291 = Methodref          #146.#292     // ext/mods/gameserver/model/item/instance/ItemInstance.destroyMe:()V
  #292 = NameAndType        #293:#43      // destroyMe:()V
  #293 = Utf8               destroyMe
  #294 = Methodref          #88.#295      // ext/mods/gameserver/model/actor/status/SummonStatus.broadcastStatusUpdate:()V
  #295 = NameAndType        #296:#43      // broadcastStatusUpdate:()V
  #296 = Utf8               broadcastStatusUpdate
  #297 = Class              #298          // ext/mods/gameserver/enums/items/ArmorType
  #298 = Utf8               ext/mods/gameserver/enums/items/ArmorType
  #299 = Class              #300          // ext/mods/gameserver/enums/items/WeaponType
  #300 = Utf8               ext/mods/gameserver/enums/items/WeaponType
  #301 = Methodref          #146.#302     // ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
  #302 = NameAndType        #303:#92      // getEnchantLevel:()I
  #303 = Utf8               getEnchantLevel
  #304 = Fieldref           #159.#305     // ext/mods/gameserver/network/SystemMessageId.ATTENTION_S1_PET_PICKED_UP_S2_S3:Lext/mods/gameserver/network/SystemMessageId;
  #305 = NameAndType        #306:#163     // ATTENTION_S1_PET_PICKED_UP_S2_S3:Lext/mods/gameserver/network/SystemMessageId;
  #306 = Utf8               ATTENTION_S1_PET_PICKED_UP_S2_S3
  #307 = Methodref          #165.#308     // ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #308 = NameAndType        #309:#310     // addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #309 = Utf8               addCharName
  #310 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #311 = Fieldref           #159.#312     // ext/mods/gameserver/network/SystemMessageId.ATTENTION_S1_PET_PICKED_UP_S2:Lext/mods/gameserver/network/SystemMessageId;
  #312 = NameAndType        #313:#163     // ATTENTION_S1_PET_PICKED_UP_S2:Lext/mods/gameserver/network/SystemMessageId;
  #313 = Utf8               ATTENTION_S1_PET_PICKED_UP_S2
  #314 = Methodref          #175.#315     // ext/mods/gameserver/model/actor/Player.broadcastPacketInRadius:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;I)V
  #315 = NameAndType        #316:#317     // broadcastPacketInRadius:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;I)V
  #316 = Utf8               broadcastPacketInRadius
  #317 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;I)V
  #318 = Methodref          #175.#319     // ext/mods/gameserver/model/actor/Player.isInParty:()Z
  #319 = NameAndType        #320:#22      // isInParty:()Z
  #320 = Utf8               isInParty
  #321 = Methodref          #175.#322     // ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
  #322 = NameAndType        #323:#324     // getParty:()Lext/mods/gameserver/model/group/Party;
  #323 = Utf8               getParty
  #324 = Utf8               ()Lext/mods/gameserver/model/group/Party;
  #325 = Methodref          #326.#327     // ext/mods/gameserver/model/group/Party.distributeItem:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Summon;)V
  #326 = Class              #328          // ext/mods/gameserver/model/group/Party
  #327 = NameAndType        #329:#330     // distributeItem:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Summon;)V
  #328 = Utf8               ext/mods/gameserver/model/group/Party
  #329 = Utf8               distributeItem
  #330 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Summon;)V
  #331 = Methodref          #52.#332      // ext/mods/gameserver/model/actor/Summon.addItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #332 = NameAndType        #333:#334     // addItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #333 = Utf8               addItem
  #334 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #335 = Methodref          #336.#337     // ext/mods/gameserver/taskmanager/AttackStanceTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/AttackStanceTaskManager;
  #336 = Class              #338          // ext/mods/gameserver/taskmanager/AttackStanceTaskManager
  #337 = NameAndType        #143:#339     // getInstance:()Lext/mods/gameserver/taskmanager/AttackStanceTaskManager;
  #338 = Utf8               ext/mods/gameserver/taskmanager/AttackStanceTaskManager
  #339 = Utf8               ()Lext/mods/gameserver/taskmanager/AttackStanceTaskManager;
  #340 = Methodref          #336.#341     // ext/mods/gameserver/taskmanager/AttackStanceTaskManager.isInAttackStance:(Lext/mods/gameserver/model/actor/Creature;)Z
  #341 = NameAndType        #342:#109     // isInAttackStance:(Lext/mods/gameserver/model/actor/Creature;)Z
  #342 = Utf8               isInAttackStance
  #343 = Class              #344          // ext/mods/gameserver/network/serverpackets/AutoAttackStart
  #344 = Utf8               ext/mods/gameserver/network/serverpackets/AutoAttackStart
  #345 = Methodref          #52.#346      // ext/mods/gameserver/model/actor/Summon.getObjectId:()I
  #346 = NameAndType        #347:#92      // getObjectId:()I
  #347 = Utf8               getObjectId
  #348 = Methodref          #343.#349     // ext/mods/gameserver/network/serverpackets/AutoAttackStart."<init>":(I)V
  #349 = NameAndType        #5:#350       // "<init>":(I)V
  #350 = Utf8               (I)V
  #351 = Methodref          #52.#352      // ext/mods/gameserver/model/actor/Summon.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #352 = NameAndType        #353:#179     // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #353 = Utf8               broadcastPacket
  #354 = Methodref          #175.#346     // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #355 = Methodref          #175.#352     // ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #356 = Methodref          #336.#357     // ext/mods/gameserver/taskmanager/AttackStanceTaskManager.add:(Lext/mods/gameserver/model/actor/Creature;)V
  #357 = NameAndType        #358:#47      // add:(Lext/mods/gameserver/model/actor/Creature;)V
  #358 = Utf8               add
  #359 = Class              #360          // ext/mods/gameserver/network/serverpackets/AutoAttackStop
  #360 = Utf8               ext/mods/gameserver/network/serverpackets/AutoAttackStop
  #361 = Methodref          #359.#349     // ext/mods/gameserver/network/serverpackets/AutoAttackStop."<init>":(I)V
  #362 = Methodref          #8.#363       // ext/mods/gameserver/model/actor/ai/type/SummonAI.setFollowStatus:(Z)V
  #363 = NameAndType        #364:#365     // setFollowStatus:(Z)V
  #364 = Utf8               setFollowStatus
  #365 = Utf8               (Z)V
  #366 = Methodref          #8.#367       // ext/mods/gameserver/model/actor/ai/type/SummonAI.tryToFollow:(Lext/mods/gameserver/model/actor/Creature;Z)V
  #367 = NameAndType        #368:#369     // tryToFollow:(Lext/mods/gameserver/model/actor/Creature;Z)V
  #368 = Utf8               tryToFollow
  #369 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Z)V
  #370 = Methodref          #8.#371       // ext/mods/gameserver/model/actor/ai/type/SummonAI.tryToIdle:()V
  #371 = NameAndType        #372:#43      // tryToIdle:()V
  #372 = Utf8               tryToIdle
  #373 = Methodref          #2.#77        // ext/mods/gameserver/model/actor/ai/type/PlayableAI.isTargetLost:(Lext/mods/gameserver/model/WorldObject;)Z
  #374 = Methodref          #2.#375       // ext/mods/gameserver/model/actor/ai/type/PlayableAI.isTargetLost:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/skills/L2Skill;)Z
  #375 = NameAndType        #78:#376      // isTargetLost:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/skills/L2Skill;)Z
  #376 = Utf8               (Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/skills/L2Skill;)Z
  #377 = Methodref          #8.#378       // ext/mods/gameserver/model/actor/ai/type/SummonAI.doFollowIntention:(Lext/mods/gameserver/model/actor/Creature;Z)V
  #378 = NameAndType        #379:#369     // doFollowIntention:(Lext/mods/gameserver/model/actor/Creature;Z)V
  #379 = Utf8               doFollowIntention
  #380 = Methodref          #8.#381       // ext/mods/gameserver/model/actor/ai/type/SummonAI.prepareIntention:()V
  #381 = NameAndType        #382:#43      // prepareIntention:()V
  #382 = Utf8               prepareIntention
  #383 = Methodref          #18.#384      // ext/mods/gameserver/model/actor/ai/Intention.updateAsIdle:()V
  #384 = NameAndType        #385:#43      // updateAsIdle:()V
  #385 = Utf8               updateAsIdle
  #386 = Methodref          #52.#387      // ext/mods/gameserver/model/actor/Summon.isMovementDisabled:()Z
  #387 = NameAndType        #388:#22      // isMovementDisabled:()Z
  #388 = Utf8               isMovementDisabled
  #389 = Methodref          #52.#390      // ext/mods/gameserver/model/actor/Summon.distance2D:(Lext/mods/gameserver/model/WorldObject;)D
  #390 = NameAndType        #391:#392     // distance2D:(Lext/mods/gameserver/model/WorldObject;)D
  #391 = Utf8               distance2D
  #392 = Utf8               (Lext/mods/gameserver/model/WorldObject;)D
  #393 = Double             1500.0d
  #395 = Methodref          #175.#396     // ext/mods/gameserver/model/actor/Player.isTeleporting:()Z
  #396 = NameAndType        #397:#22      // isTeleporting:()Z
  #397 = Utf8               isTeleporting
  #398 = Methodref          #175.#127     // ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #399 = Methodref          #52.#400      // ext/mods/gameserver/model/actor/Summon.teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
  #400 = NameAndType        #401:#402     // teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
  #401 = Utf8               teleportTo
  #402 = Utf8               (Lext/mods/gameserver/model/location/Location;I)V
  #403 = Methodref          #59.#404      // ext/mods/gameserver/model/actor/move/SummonMove.getGeoPathFailCount:()I
  #404 = NameAndType        #405:#92      // getGeoPathFailCount:()I
  #405 = Utf8               getGeoPathFailCount
  #406 = Methodref          #52.#407      // ext/mods/gameserver/model/actor/Summon.isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
  #407 = NameAndType        #408:#409     // isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
  #408 = Utf8               isIn3DRadius
  #409 = Utf8               (Lext/mods/gameserver/model/WorldObject;I)Z
  #410 = Methodref          #59.#411      // ext/mods/gameserver/model/actor/move/SummonMove.resetGeoPathFailCount:()V
  #411 = NameAndType        #412:#43      // resetGeoPathFailCount:()V
  #412 = Utf8               resetGeoPathFailCount
  #413 = Methodref          #59.#414      // ext/mods/gameserver/model/actor/move/SummonMove.maybeStartFriendlyFollow:(Lext/mods/gameserver/model/actor/Creature;I)Z
  #414 = NameAndType        #415:#96      // maybeStartFriendlyFollow:(Lext/mods/gameserver/model/actor/Creature;I)Z
  #415 = Utf8               maybeStartFriendlyFollow
  #416 = Utf8               (Lext/mods/gameserver/model/actor/Summon;)V
  #417 = Utf8               Code
  #418 = Utf8               LineNumberTable
  #419 = Utf8               LocalVariableTable
  #420 = Utf8               this
  #421 = Utf8               Lext/mods/gameserver/model/actor/ai/type/SummonAI;
  #422 = Utf8               summon
  #423 = Utf8               Lext/mods/gameserver/model/actor/Summon;
  #424 = Utf8               onEvtFinishedCasting
  #425 = Utf8               StackMapTable
  #426 = Utf8               attacker
  #427 = Utf8               thinkAttack
  #428 = Utf8               target
  #429 = Class              #430          // ext/mods/gameserver/model/actor/Creature
  #430 = Utf8               ext/mods/gameserver/model/actor/Creature
  #431 = Utf8               thinkInteract
  #432 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #433 = Utf8               handler
  #434 = Utf8               Lext/mods/gameserver/handler/IItemHandler;
  #435 = Utf8               sm
  #436 = Utf8               Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #437 = Utf8               item
  #438 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #439 = Class              #440          // java/lang/Object
  #440 = Utf8               java/lang/Object
  #441 = Class              #442          // java/lang/Throwable
  #442 = Utf8               java/lang/Throwable
  #443 = Utf8               startAttackStance
  #444 = Utf8               stopAttackStance
  #445 = Utf8               switchFollowStatus
  #446 = Utf8               state
  #447 = Utf8               getFollowStatus
  #448 = Utf8               object
  #449 = Utf8               skill
  #450 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #451 = Utf8               thinkIdle
  #452 = Utf8               onEvtTeleported
  #453 = Utf8               thinkFollow
  #454 = Utf8               distance
  #455 = Utf8               D
  #456 = Utf8               owner
  #457 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #458 = Utf8               Signature
  #459 = Utf8               Lext/mods/gameserver/model/actor/ai/type/PlayableAI<Lext/mods/gameserver/model/actor/Summon;>;
  #460 = Utf8               SourceFile
  #461 = Utf8               SummonAI.java
{
  public ext.mods.gameserver.model.actor.ai.type.SummonAI(ext.mods.gameserver.model.actor.Summon);
    descriptor: (Lext/mods/gameserver/model/actor/Summon;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/actor/ai/type/PlayableAI."<init>":(Lext/mods/gameserver/model/actor/Playable;)V
         5: aload_0
         6: iconst_1
         7: putfield      #7                  // Field _followOwner:Z
        10: return
      LineNumberTable:
        line 47: 0
        line 43: 5
        line 48: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/actor/ai/type/SummonAI;
            0      11     1 summon   Lext/mods/gameserver/model/actor/Summon;

  protected void onEvtFinishedCasting();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _nextIntention:Lext/mods/gameserver/model/actor/ai/Intention;
         4: invokevirtual #17                 // Method ext/mods/gameserver/model/actor/ai/Intention.isBlank:()Z
         7: ifeq          41
        10: aload_0
        11: getfield      #23                 // Field _previousIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        14: invokevirtual #26                 // Method ext/mods/gameserver/model/actor/ai/Intention.getType:()Lext/mods/gameserver/enums/IntentionType;
        17: getstatic     #30                 // Field ext/mods/gameserver/enums/IntentionType.ATTACK:Lext/mods/gameserver/enums/IntentionType;
        20: if_acmpne     34
        23: aload_0
        24: aload_0
        25: getfield      #23                 // Field _previousIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        28: invokevirtual #36                 // Method doIntention:(Lext/mods/gameserver/model/actor/ai/Intention;)V
        31: goto          49
        34: aload_0
        35: invokevirtual #40                 // Method doIdleIntention:()V
        38: goto          49
        41: aload_0
        42: aload_0
        43: getfield      #13                 // Field _nextIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        46: invokevirtual #36                 // Method doIntention:(Lext/mods/gameserver/model/actor/ai/Intention;)V
        49: return
      LineNumberTable:
        line 57: 0
        line 59: 10
        line 60: 23
        line 62: 34
        line 65: 41
        line 66: 49
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      50     0  this   Lext/mods/gameserver/model/actor/ai/type/SummonAI;
      StackMapTable: number_of_entries = 3
        frame_type = 34 /* same */
        frame_type = 6 /* same */
        frame_type = 7 /* same */

  public void onEvtAttacked(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #44                 // Method ext/mods/gameserver/model/actor/ai/type/PlayableAI.onEvtAttacked:(Lext/mods/gameserver/model/actor/Creature;)V
         5: aload_0
         6: getfield      #48                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         9: checkcast     #52                 // class ext/mods/gameserver/model/actor/Summon
        12: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Summon.getMove:()Lext/mods/gameserver/model/actor/move/SummonMove;
        15: aload_1
        16: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/move/SummonMove.avoidAttack:(Lext/mods/gameserver/model/actor/Creature;)V
        19: return
      LineNumberTable:
        line 71: 0
        line 73: 5
        line 74: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/model/actor/ai/type/SummonAI;
            0      20     1 attacker   Lext/mods/gameserver/model/actor/Creature;

  protected void onEvtEvaded(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #63                 // Method ext/mods/gameserver/model/actor/ai/type/PlayableAI.onEvtEvaded:(Lext/mods/gameserver/model/actor/Creature;)V
         5: aload_0
         6: getfield      #48                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         9: checkcast     #52                 // class ext/mods/gameserver/model/actor/Summon
        12: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Summon.getMove:()Lext/mods/gameserver/model/actor/move/SummonMove;
        15: aload_1
        16: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/move/SummonMove.avoidAttack:(Lext/mods/gameserver/model/actor/Creature;)V
        19: return
      LineNumberTable:
        line 79: 0
        line 81: 5
        line 82: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/model/actor/ai/type/SummonAI;
            0      20     1 attacker   Lext/mods/gameserver/model/actor/Creature;

  public void thinkAttack();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=1
         0: aload_0
         1: getfield      #48                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #52                 // class ext/mods/gameserver/model/actor/Summon
         7: invokevirtual #66                 // Method ext/mods/gameserver/model/actor/Summon.denyAiAction:()Z
        10: ifeq          18
        13: aload_0
        14: invokevirtual #40                 // Method doIdleIntention:()V
        17: return
        18: aload_0
        19: getfield      #69                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        22: invokevirtual #72                 // Method ext/mods/gameserver/model/actor/ai/Intention.getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
        25: astore_1
        26: aload_0
        27: aload_1
        28: invokevirtual #76                 // Method isTargetLost:(Lext/mods/gameserver/model/WorldObject;)Z
        31: ifeq          39
        34: aload_0
        35: invokevirtual #40                 // Method doIdleIntention:()V
        38: return
        39: aload_0
        40: getfield      #69                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        43: invokevirtual #80                 // Method ext/mods/gameserver/model/actor/ai/Intention.isShiftPressed:()Z
        46: istore_2
        47: aload_0
        48: getfield      #48                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        51: checkcast     #52                 // class ext/mods/gameserver/model/actor/Summon
        54: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Summon.getMove:()Lext/mods/gameserver/model/actor/move/SummonMove;
        57: aload_1
        58: aload_0
        59: getfield      #48                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        62: checkcast     #52                 // class ext/mods/gameserver/model/actor/Summon
        65: invokevirtual #83                 // Method ext/mods/gameserver/model/actor/Summon.getStatus:()Lext/mods/gameserver/model/actor/status/SummonStatus;
        68: invokevirtual #87                 // Method ext/mods/gameserver/model/actor/status/SummonStatus.getPhysicalAttackRange:()I
        71: invokevirtual #93                 // Method ext/mods/gameserver/model/actor/move/SummonMove.maybeStartOffensiveFollow:(Lext/mods/gameserver/model/actor/Creature;I)Z
        74: ifeq          86
        77: iload_2
        78: ifeq          85
        81: aload_0
        82: invokevirtual #40                 // Method doIdleIntention:()V
        85: return
        86: aload_0
        87: getfield      #48                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        90: checkcast     #52                 // class ext/mods/gameserver/model/actor/Summon
        93: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Summon.getMove:()Lext/mods/gameserver/model/actor/move/SummonMove;
        96: invokevirtual #97                 // Method ext/mods/gameserver/model/actor/move/SummonMove.stop:()V
        99: aload_0
       100: getfield      #48                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       103: checkcast     #52                 // class ext/mods/gameserver/model/actor/Summon
       106: invokevirtual #100                // Method ext/mods/gameserver/model/actor/Summon.getAttack:()Lext/mods/gameserver/model/actor/attack/CreatureAttack;
       109: aload_1
       110: invokevirtual #104                // Method ext/mods/gameserver/model/actor/attack/CreatureAttack.canAttack:(Lext/mods/gameserver/model/actor/Creature;)Z
       113: ifne          121
       116: aload_0
       117: invokevirtual #40                 // Method doIdleIntention:()V
       120: return
       121: aload_0
       122: getfield      #48                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       125: checkcast     #52                 // class ext/mods/gameserver/model/actor/Summon
       128: invokevirtual #100                // Method ext/mods/gameserver/model/actor/Summon.getAttack:()Lext/mods/gameserver/model/actor/attack/CreatureAttack;
       131: aload_1
       132: invokevirtual #110                // Method ext/mods/gameserver/model/actor/attack/CreatureAttack.doAttack:(Lext/mods/gameserver/model/actor/Creature;)V
       135: getstatic     #113                // Field ext/mods/Config.ATTACK_PTS:Z
       138: ifne          149
       141: aload_0
       142: aload_0
       143: getfield      #69                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
       146: invokevirtual #118                // Method setNextIntention:(Lext/mods/gameserver/model/actor/ai/Intention;)V
       149: return
      LineNumberTable:
        line 87: 0
        line 89: 13
        line 90: 17
        line 93: 18
        line 94: 26
        line 96: 34
        line 97: 38
        line 100: 39
        line 101: 47
        line 103: 77
        line 104: 81
        line 106: 85
        line 109: 86
        line 111: 99
        line 113: 116
        line 114: 120
        line 117: 121
        line 118: 135
        line 119: 141
        line 120: 149
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     150     0  this   Lext/mods/gameserver/model/actor/ai/type/SummonAI;
           26     124     1 target   Lext/mods/gameserver/model/actor/Creature;
           47     103     2 isShiftPressed   Z
      StackMapTable: number_of_entries = 6
        frame_type = 18 /* same */
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 252 /* append */
          offset_delta = 45
          locals = [ int ]
        frame_type = 0 /* same */
        frame_type = 34 /* same */
        frame_type = 27 /* same */

  protected void thinkInteract();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=5, locals=3, args_size=1
         0: aload_0
         1: getfield      #69                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
         4: invokevirtual #121                // Method ext/mods/gameserver/model/actor/ai/Intention.getTarget:()Lext/mods/gameserver/model/WorldObject;
         7: astore_1
         8: aload_0
         9: aload_1
        10: invokevirtual #76                 // Method isTargetLost:(Lext/mods/gameserver/model/WorldObject;)Z
        13: ifeq          21
        16: aload_0
        17: invokevirtual #40                 // Method doIdleIntention:()V
        20: return
        21: aload_0
        22: getfield      #69                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        25: invokevirtual #80                 // Method ext/mods/gameserver/model/actor/ai/Intention.isShiftPressed:()Z
        28: istore_2
        29: aload_0
        30: getfield      #48                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        33: checkcast     #52                 // class ext/mods/gameserver/model/actor/Summon
        36: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Summon.getMove:()Lext/mods/gameserver/model/actor/move/SummonMove;
        39: aload_1
        40: invokevirtual #125                // Method ext/mods/gameserver/model/WorldObject.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
        43: aload_0
        44: getfield      #48                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        47: checkcast     #52                 // class ext/mods/gameserver/model/actor/Summon
        50: invokevirtual #83                 // Method ext/mods/gameserver/model/actor/Summon.getStatus:()Lext/mods/gameserver/model/actor/status/SummonStatus;
        53: invokevirtual #87                 // Method ext/mods/gameserver/model/actor/status/SummonStatus.getPhysicalAttackRange:()I
        56: iconst_1
        57: iload_2
        58: invokevirtual #131                // Method ext/mods/gameserver/model/actor/move/SummonMove.maybeMoveToLocation:(Lext/mods/gameserver/model/location/Location;IZZ)Z
        61: ifeq          73
        64: iload_2
        65: ifeq          72
        68: aload_0
        69: invokevirtual #40                 // Method doIdleIntention:()V
        72: return
        73: return
      LineNumberTable:
        line 127: 0
        line 128: 8
        line 130: 16
        line 131: 20
        line 134: 21
        line 135: 29
        line 137: 64
        line 138: 68
        line 140: 72
        line 142: 73
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      74     0  this   Lext/mods/gameserver/model/actor/ai/type/SummonAI;
            8      66     1 target   Lext/mods/gameserver/model/WorldObject;
           29      45     2 isShiftPressed   Z
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 21
          locals = [ class ext/mods/gameserver/model/WorldObject ]
        frame_type = 252 /* append */
          offset_delta = 50
          locals = [ int ]
        frame_type = 0 /* same */

  protected ext.mods.gameserver.model.item.instance.ItemInstance thinkPickUp();
    descriptor: ()Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=4, locals=4, args_size=1
         0: aload_0
         1: invokespecial #135                // Method ext/mods/gameserver/model/actor/ai/type/PlayableAI.thinkPickUp:()Lext/mods/gameserver/model/item/instance/ItemInstance;
         4: astore_1
         5: aload_1
         6: ifnonnull     11
         9: aconst_null
        10: areturn
        11: invokestatic  #139                // Method ext/mods/gameserver/data/manager/CursedWeaponManager.getInstance:()Lext/mods/gameserver/data/manager/CursedWeaponManager;
        14: aload_1
        15: invokevirtual #145                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        18: invokevirtual #150                // Method ext/mods/gameserver/data/manager/CursedWeaponManager.isCursed:(I)Z
        21: ifeq          52
        24: aload_0
        25: getfield      #48                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        28: checkcast     #52                 // class ext/mods/gameserver/model/actor/Summon
        31: invokevirtual #154                // Method ext/mods/gameserver/model/actor/Summon.getOwner:()Lext/mods/gameserver/model/actor/Player;
        34: getstatic     #158                // Field ext/mods/gameserver/network/SystemMessageId.FAILED_TO_PICKUP_S1:Lext/mods/gameserver/network/SystemMessageId;
        37: invokestatic  #164                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        40: aload_1
        41: invokevirtual #145                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        44: invokevirtual #170                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        47: invokevirtual #174                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        50: aconst_null
        51: areturn
        52: aload_1
        53: invokevirtual #180                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
        56: invokevirtual #184                // Method ext/mods/gameserver/model/item/kind/Item.getItemType:()Lext/mods/gameserver/enums/items/ItemType;
        59: getstatic     #190                // Field ext/mods/gameserver/enums/items/EtcItemType.ARROW:Lext/mods/gameserver/enums/items/EtcItemType;
        62: if_acmpeq     78
        65: aload_1
        66: invokevirtual #180                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
        69: invokevirtual #184                // Method ext/mods/gameserver/model/item/kind/Item.getItemType:()Lext/mods/gameserver/enums/items/ItemType;
        72: getstatic     #196                // Field ext/mods/gameserver/enums/items/EtcItemType.SHOT:Lext/mods/gameserver/enums/items/EtcItemType;
        75: if_acmpne     96
        78: aload_0
        79: getfield      #48                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        82: checkcast     #52                 // class ext/mods/gameserver/model/actor/Summon
        85: invokevirtual #154                // Method ext/mods/gameserver/model/actor/Summon.getOwner:()Lext/mods/gameserver/model/actor/Player;
        88: getstatic     #199                // Field ext/mods/gameserver/network/SystemMessageId.ITEM_NOT_FOR_PETS:Lext/mods/gameserver/network/SystemMessageId;
        91: invokevirtual #202                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        94: aconst_null
        95: areturn
        96: aload_1
        97: dup
        98: astore_2
        99: monitorenter
       100: aload_1
       101: invokevirtual #205                // Method ext/mods/gameserver/model/item/instance/ItemInstance.isVisible:()Z
       104: ifne          111
       107: aconst_null
       108: aload_2
       109: monitorexit
       110: areturn
       111: aload_0
       112: getfield      #48                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       115: checkcast     #52                 // class ext/mods/gameserver/model/actor/Summon
       118: invokevirtual #208                // Method ext/mods/gameserver/model/actor/Summon.getInventory:()Lext/mods/gameserver/model/itemcontainer/PetInventory;
       121: aload_1
       122: invokevirtual #212                // Method ext/mods/gameserver/model/itemcontainer/PetInventory.validateCapacity:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
       125: ifne          148
       128: aload_0
       129: getfield      #48                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       132: checkcast     #52                 // class ext/mods/gameserver/model/actor/Summon
       135: invokevirtual #154                // Method ext/mods/gameserver/model/actor/Summon.getOwner:()Lext/mods/gameserver/model/actor/Player;
       138: getstatic     #218                // Field ext/mods/gameserver/network/SystemMessageId.YOUR_PET_CANNOT_CARRY_ANY_MORE_ITEMS:Lext/mods/gameserver/network/SystemMessageId;
       141: invokevirtual #202                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       144: aconst_null
       145: aload_2
       146: monitorexit
       147: areturn
       148: aload_0
       149: getfield      #48                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       152: checkcast     #52                 // class ext/mods/gameserver/model/actor/Summon
       155: invokevirtual #208                // Method ext/mods/gameserver/model/actor/Summon.getInventory:()Lext/mods/gameserver/model/itemcontainer/PetInventory;
       158: aload_1
       159: invokevirtual #221                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getWeight:()I
       162: invokevirtual #224                // Method ext/mods/gameserver/model/itemcontainer/PetInventory.validateWeight:(I)Z
       165: ifne          188
       168: aload_0
       169: getfield      #48                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       172: checkcast     #52                 // class ext/mods/gameserver/model/actor/Summon
       175: invokevirtual #154                // Method ext/mods/gameserver/model/actor/Summon.getOwner:()Lext/mods/gameserver/model/actor/Player;
       178: getstatic     #227                // Field ext/mods/gameserver/network/SystemMessageId.UNABLE_TO_PLACE_ITEM_YOUR_PET_IS_TOO_ENCUMBERED:Lext/mods/gameserver/network/SystemMessageId;
       181: invokevirtual #202                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       184: aconst_null
       185: aload_2
       186: monitorexit
       187: areturn
       188: aload_1
       189: invokevirtual #230                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getOwnerId:()I
       192: ifeq          327
       195: aload_0
       196: getfield      #48                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       199: checkcast     #52                 // class ext/mods/gameserver/model/actor/Summon
       202: invokevirtual #154                // Method ext/mods/gameserver/model/actor/Summon.getOwner:()Lext/mods/gameserver/model/actor/Player;
       205: aload_1
       206: invokevirtual #230                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getOwnerId:()I
       209: invokevirtual #233                // Method ext/mods/gameserver/model/actor/Player.isLooterOrInLooterParty:(I)Z
       212: ifne          327
       215: aload_1
       216: invokevirtual #145                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       219: bipush        57
       221: if_icmpne     253
       224: aload_0
       225: getfield      #48                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       228: checkcast     #52                 // class ext/mods/gameserver/model/actor/Summon
       231: invokevirtual #154                // Method ext/mods/gameserver/model/actor/Summon.getOwner:()Lext/mods/gameserver/model/actor/Player;
       234: getstatic     #236                // Field ext/mods/gameserver/network/SystemMessageId.FAILED_TO_PICKUP_S1_ADENA:Lext/mods/gameserver/network/SystemMessageId;
       237: invokestatic  #164                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       240: aload_1
       241: invokevirtual #239                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
       244: invokevirtual #242                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       247: invokevirtual #174                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       250: goto          323
       253: aload_1
       254: invokevirtual #239                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
       257: iconst_1
       258: if_icmple     297
       261: aload_0
       262: getfield      #48                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       265: checkcast     #52                 // class ext/mods/gameserver/model/actor/Summon
       268: invokevirtual #154                // Method ext/mods/gameserver/model/actor/Summon.getOwner:()Lext/mods/gameserver/model/actor/Player;
       271: getstatic     #245                // Field ext/mods/gameserver/network/SystemMessageId.FAILED_TO_PICKUP_S2_S1_S:Lext/mods/gameserver/network/SystemMessageId;
       274: invokestatic  #164                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       277: aload_1
       278: invokevirtual #145                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       281: invokevirtual #170                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       284: aload_1
       285: invokevirtual #239                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
       288: invokevirtual #242                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       291: invokevirtual #174                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       294: goto          323
       297: aload_0
       298: getfield      #48                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       301: checkcast     #52                 // class ext/mods/gameserver/model/actor/Summon
       304: invokevirtual #154                // Method ext/mods/gameserver/model/actor/Summon.getOwner:()Lext/mods/gameserver/model/actor/Player;
       307: getstatic     #158                // Field ext/mods/gameserver/network/SystemMessageId.FAILED_TO_PICKUP_S1:Lext/mods/gameserver/network/SystemMessageId;
       310: invokestatic  #164                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       313: aload_1
       314: invokevirtual #145                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       317: invokevirtual #170                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       320: invokevirtual #174                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       323: aconst_null
       324: aload_2
       325: monitorexit
       326: areturn
       327: aload_1
       328: invokevirtual #248                // Method ext/mods/gameserver/model/item/instance/ItemInstance.hasDropProtection:()Z
       331: ifeq          338
       334: aload_1
       335: invokevirtual #251                // Method ext/mods/gameserver/model/item/instance/ItemInstance.removeDropProtection:()V
       338: aload_1
       339: aload_0
       340: getfield      #48                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       343: invokevirtual #254                // Method ext/mods/gameserver/model/item/instance/ItemInstance.pickupMe:(Lext/mods/gameserver/model/actor/Creature;)V
       346: invokestatic  #257                // Method ext/mods/gameserver/taskmanager/ItemsOnGroundTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/ItemsOnGroundTaskManager;
       349: aload_1
       350: invokevirtual #262                // Method ext/mods/gameserver/taskmanager/ItemsOnGroundTaskManager.remove:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
       353: aload_2
       354: monitorexit
       355: goto          363
       358: astore_3
       359: aload_2
       360: monitorexit
       361: aload_3
       362: athrow
       363: aload_1
       364: invokevirtual #266                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemType:()Lext/mods/gameserver/enums/items/ItemType;
       367: getstatic     #267                // Field ext/mods/gameserver/enums/items/EtcItemType.HERB:Lext/mods/gameserver/enums/items/EtcItemType;
       370: if_acmpne     423
       373: invokestatic  #270                // Method ext/mods/gameserver/handler/ItemHandler.getInstance:()Lext/mods/gameserver/handler/ItemHandler;
       376: aload_1
       377: invokevirtual #275                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEtcItem:()Lext/mods/gameserver/model/item/kind/EtcItem;
       380: invokevirtual #279                // Method ext/mods/gameserver/handler/ItemHandler.getHandler:(Ljava/lang/Object;)Lext/mods/gameserver/handler/IItemHandler;
       383: astore_2
       384: aload_2
       385: ifnull        403
       388: aload_2
       389: aload_0
       390: getfield      #48                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       393: checkcast     #283                // class ext/mods/gameserver/model/actor/Playable
       396: aload_1
       397: iconst_0
       398: invokeinterface #285,  4          // InterfaceMethod ext/mods/gameserver/handler/IItemHandler.useItem:(Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
       403: aload_1
       404: invokevirtual #291                // Method ext/mods/gameserver/model/item/instance/ItemInstance.destroyMe:()V
       407: aload_0
       408: getfield      #48                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       411: checkcast     #52                 // class ext/mods/gameserver/model/actor/Summon
       414: invokevirtual #83                 // Method ext/mods/gameserver/model/actor/Summon.getStatus:()Lext/mods/gameserver/model/actor/status/SummonStatus;
       417: invokevirtual #294                // Method ext/mods/gameserver/model/actor/status/SummonStatus.broadcastStatusUpdate:()V
       420: goto          596
       423: aload_1
       424: invokevirtual #266                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemType:()Lext/mods/gameserver/enums/items/ItemType;
       427: instanceof    #297                // class ext/mods/gameserver/enums/items/ArmorType
       430: ifne          443
       433: aload_1
       434: invokevirtual #266                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemType:()Lext/mods/gameserver/enums/items/ItemType;
       437: instanceof    #299                // class ext/mods/gameserver/enums/items/WeaponType
       440: ifeq          531
       443: aload_1
       444: invokevirtual #301                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
       447: ifle          487
       450: getstatic     #304                // Field ext/mods/gameserver/network/SystemMessageId.ATTENTION_S1_PET_PICKED_UP_S2_S3:Lext/mods/gameserver/network/SystemMessageId;
       453: invokestatic  #164                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       456: aload_0
       457: getfield      #48                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       460: checkcast     #52                 // class ext/mods/gameserver/model/actor/Summon
       463: invokevirtual #154                // Method ext/mods/gameserver/model/actor/Summon.getOwner:()Lext/mods/gameserver/model/actor/Player;
       466: invokevirtual #307                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       469: aload_1
       470: invokevirtual #301                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
       473: invokevirtual #242                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       476: aload_1
       477: invokevirtual #145                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       480: invokevirtual #170                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       483: astore_2
       484: goto          514
       487: getstatic     #311                // Field ext/mods/gameserver/network/SystemMessageId.ATTENTION_S1_PET_PICKED_UP_S2:Lext/mods/gameserver/network/SystemMessageId;
       490: invokestatic  #164                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       493: aload_0
       494: getfield      #48                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       497: checkcast     #52                 // class ext/mods/gameserver/model/actor/Summon
       500: invokevirtual #154                // Method ext/mods/gameserver/model/actor/Summon.getOwner:()Lext/mods/gameserver/model/actor/Player;
       503: invokevirtual #307                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       506: aload_1
       507: invokevirtual #145                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       510: invokevirtual #170                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       513: astore_2
       514: aload_0
       515: getfield      #48                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       518: checkcast     #52                 // class ext/mods/gameserver/model/actor/Summon
       521: invokevirtual #154                // Method ext/mods/gameserver/model/actor/Summon.getOwner:()Lext/mods/gameserver/model/actor/Player;
       524: aload_2
       525: sipush        1400
       528: invokevirtual #314                // Method ext/mods/gameserver/model/actor/Player.broadcastPacketInRadius:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;I)V
       531: aload_0
       532: getfield      #48                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       535: checkcast     #52                 // class ext/mods/gameserver/model/actor/Summon
       538: invokevirtual #154                // Method ext/mods/gameserver/model/actor/Summon.getOwner:()Lext/mods/gameserver/model/actor/Player;
       541: invokevirtual #318                // Method ext/mods/gameserver/model/actor/Player.isInParty:()Z
       544: ifeq          584
       547: aload_0
       548: getfield      #48                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       551: checkcast     #52                 // class ext/mods/gameserver/model/actor/Summon
       554: invokevirtual #154                // Method ext/mods/gameserver/model/actor/Summon.getOwner:()Lext/mods/gameserver/model/actor/Player;
       557: invokevirtual #321                // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
       560: aload_0
       561: getfield      #48                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       564: checkcast     #52                 // class ext/mods/gameserver/model/actor/Summon
       567: invokevirtual #154                // Method ext/mods/gameserver/model/actor/Summon.getOwner:()Lext/mods/gameserver/model/actor/Player;
       570: aload_1
       571: aload_0
       572: getfield      #48                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       575: checkcast     #52                 // class ext/mods/gameserver/model/actor/Summon
       578: invokevirtual #325                // Method ext/mods/gameserver/model/group/Party.distributeItem:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Summon;)V
       581: goto          596
       584: aload_0
       585: getfield      #48                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       588: checkcast     #52                 // class ext/mods/gameserver/model/actor/Summon
       591: aload_1
       592: iconst_1
       593: invokevirtual #331                // Method ext/mods/gameserver/model/actor/Summon.addItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
       596: aload_1
       597: areturn
      Exception table:
         from    to  target type
           100   110   358   any
           111   147   358   any
           148   187   358   any
           188   326   358   any
           327   355   358   any
           358   361   358   any
      LineNumberTable:
        line 147: 0
        line 148: 5
        line 149: 9
        line 151: 11
        line 153: 24
        line 154: 50
        line 157: 52
        line 159: 78
        line 160: 94
        line 163: 96
        line 165: 100
        line 166: 107
        line 168: 111
        line 170: 128
        line 171: 144
        line 174: 148
        line 176: 168
        line 177: 184
        line 180: 188
        line 182: 215
        line 183: 224
        line 184: 253
        line 185: 261
        line 187: 297
        line 189: 323
        line 192: 327
        line 193: 334
        line 195: 338
        line 197: 346
        line 198: 353
        line 200: 363
        line 202: 373
        line 203: 384
        line 204: 388
        line 206: 403
        line 207: 407
        line 208: 420
        line 211: 423
        line 214: 443
        line 215: 450
        line 217: 487
        line 219: 514
        line 222: 531
        line 223: 547
        line 225: 584
        line 228: 596
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          384      36     2 handler   Lext/mods/gameserver/handler/IItemHandler;
          484       3     2    sm   Lext/mods/gameserver/network/serverpackets/SystemMessage;
          514      17     2    sm   Lext/mods/gameserver/network/serverpackets/SystemMessage;
            0     598     0  this   Lext/mods/gameserver/model/actor/ai/type/SummonAI;
            5     593     1  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 22
        frame_type = 252 /* append */
          offset_delta = 11
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 40 /* same */
        frame_type = 25 /* same */
        frame_type = 17 /* same */
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ class java/lang/Object ]
        frame_type = 36 /* same */
        frame_type = 39 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 64
        frame_type = 43 /* same */
        frame_type = 25 /* same */
        frame_type = 3 /* same */
        frame_type = 10 /* same */
        frame_type = 83 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 250 /* chop */
          offset_delta = 4
        frame_type = 252 /* append */
          offset_delta = 39
          locals = [ class ext/mods/gameserver/handler/IItemHandler ]
        frame_type = 250 /* chop */
          offset_delta = 19
        frame_type = 19 /* same */
        frame_type = 43 /* same */
        frame_type = 252 /* append */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/network/serverpackets/SystemMessage ]
        frame_type = 250 /* chop */
          offset_delta = 16
        frame_type = 52 /* same */
        frame_type = 11 /* same */

  public void startAttackStance();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: invokestatic  #335                // Method ext/mods/gameserver/taskmanager/AttackStanceTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/AttackStanceTaskManager;
         3: aload_0
         4: getfield      #48                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         7: checkcast     #52                 // class ext/mods/gameserver/model/actor/Summon
        10: invokevirtual #154                // Method ext/mods/gameserver/model/actor/Summon.getOwner:()Lext/mods/gameserver/model/actor/Player;
        13: invokevirtual #340                // Method ext/mods/gameserver/taskmanager/AttackStanceTaskManager.isInAttackStance:(Lext/mods/gameserver/model/actor/Creature;)Z
        16: ifne          79
        19: aload_0
        20: getfield      #48                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        23: checkcast     #52                 // class ext/mods/gameserver/model/actor/Summon
        26: new           #343                // class ext/mods/gameserver/network/serverpackets/AutoAttackStart
        29: dup
        30: aload_0
        31: getfield      #48                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        34: checkcast     #52                 // class ext/mods/gameserver/model/actor/Summon
        37: invokevirtual #345                // Method ext/mods/gameserver/model/actor/Summon.getObjectId:()I
        40: invokespecial #348                // Method ext/mods/gameserver/network/serverpackets/AutoAttackStart."<init>":(I)V
        43: invokevirtual #351                // Method ext/mods/gameserver/model/actor/Summon.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        46: aload_0
        47: getfield      #48                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        50: checkcast     #52                 // class ext/mods/gameserver/model/actor/Summon
        53: invokevirtual #154                // Method ext/mods/gameserver/model/actor/Summon.getOwner:()Lext/mods/gameserver/model/actor/Player;
        56: new           #343                // class ext/mods/gameserver/network/serverpackets/AutoAttackStart
        59: dup
        60: aload_0
        61: getfield      #48                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        64: checkcast     #52                 // class ext/mods/gameserver/model/actor/Summon
        67: invokevirtual #154                // Method ext/mods/gameserver/model/actor/Summon.getOwner:()Lext/mods/gameserver/model/actor/Player;
        70: invokevirtual #354                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        73: invokespecial #348                // Method ext/mods/gameserver/network/serverpackets/AutoAttackStart."<init>":(I)V
        76: invokevirtual #355                // Method ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        79: invokestatic  #335                // Method ext/mods/gameserver/taskmanager/AttackStanceTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/AttackStanceTaskManager;
        82: aload_0
        83: getfield      #48                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        86: checkcast     #52                 // class ext/mods/gameserver/model/actor/Summon
        89: invokevirtual #154                // Method ext/mods/gameserver/model/actor/Summon.getOwner:()Lext/mods/gameserver/model/actor/Player;
        92: invokevirtual #356                // Method ext/mods/gameserver/taskmanager/AttackStanceTaskManager.add:(Lext/mods/gameserver/model/actor/Creature;)V
        95: return
      LineNumberTable:
        line 234: 0
        line 236: 19
        line 237: 46
        line 240: 79
        line 241: 95
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      96     0  this   Lext/mods/gameserver/model/actor/ai/type/SummonAI;
      StackMapTable: number_of_entries = 1
        frame_type = 251 /* same_frame_extended */
          offset_delta = 79

  public void stopAttackStance();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: getfield      #48                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #52                 // class ext/mods/gameserver/model/actor/Summon
         7: new           #359                // class ext/mods/gameserver/network/serverpackets/AutoAttackStop
        10: dup
        11: aload_0
        12: getfield      #48                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        15: checkcast     #52                 // class ext/mods/gameserver/model/actor/Summon
        18: invokevirtual #345                // Method ext/mods/gameserver/model/actor/Summon.getObjectId:()I
        21: invokespecial #361                // Method ext/mods/gameserver/network/serverpackets/AutoAttackStop."<init>":(I)V
        24: invokevirtual #351                // Method ext/mods/gameserver/model/actor/Summon.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        27: return
      LineNumberTable:
        line 246: 0
        line 247: 27
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/model/actor/ai/type/SummonAI;

  public void switchFollowStatus();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: aload_0
         2: getfield      #7                  // Field _followOwner:Z
         5: ifne          12
         8: iconst_1
         9: goto          13
        12: iconst_0
        13: invokevirtual #362                // Method setFollowStatus:(Z)V
        16: return
      LineNumberTable:
        line 251: 0
        line 252: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/actor/ai/type/SummonAI;
      StackMapTable: number_of_entries = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/ai/type/SummonAI ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/ai/type/SummonAI ]
          stack = [ class ext/mods/gameserver/model/actor/ai/type/SummonAI, int ]

  public void setFollowStatus(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #7                  // Field _followOwner:Z
         5: aload_0
         6: getfield      #7                  // Field _followOwner:Z
         9: ifeq          30
        12: aload_0
        13: aload_0
        14: getfield      #48                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        17: checkcast     #52                 // class ext/mods/gameserver/model/actor/Summon
        20: invokevirtual #154                // Method ext/mods/gameserver/model/actor/Summon.getOwner:()Lext/mods/gameserver/model/actor/Player;
        23: iconst_0
        24: invokevirtual #366                // Method tryToFollow:(Lext/mods/gameserver/model/actor/Creature;Z)V
        27: goto          34
        30: aload_0
        31: invokevirtual #370                // Method tryToIdle:()V
        34: return
      LineNumberTable:
        line 257: 0
        line 259: 5
        line 260: 12
        line 262: 30
        line 263: 34
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      35     0  this   Lext/mods/gameserver/model/actor/ai/type/SummonAI;
            0      35     1 state   Z
      StackMapTable: number_of_entries = 2
        frame_type = 30 /* same */
        frame_type = 3 /* same */

  public boolean getFollowStatus();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _followOwner:Z
         4: ireturn
      LineNumberTable:
        line 268: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/ai/type/SummonAI;

  public boolean isTargetLost(ext.mods.gameserver.model.WorldObject);
    descriptor: (Lext/mods/gameserver/model/WorldObject;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #373                // Method ext/mods/gameserver/model/actor/ai/type/PlayableAI.isTargetLost:(Lext/mods/gameserver/model/WorldObject;)Z
         5: istore_2
         6: iload_2
         7: ifeq          15
        10: aload_0
        11: iconst_1
        12: invokevirtual #362                // Method setFollowStatus:(Z)V
        15: iload_2
        16: ireturn
      LineNumberTable:
        line 274: 0
        line 275: 6
        line 276: 10
        line 278: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/actor/ai/type/SummonAI;
            0      17     1 object   Lext/mods/gameserver/model/WorldObject;
            6      11     2 isTargetLost   Z
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ int ]

  public boolean isTargetLost(ext.mods.gameserver.model.WorldObject, ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/skills/L2Skill;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=3
         0: aload_0
         1: aload_1
         2: aload_2
         3: invokespecial #374                // Method ext/mods/gameserver/model/actor/ai/type/PlayableAI.isTargetLost:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/skills/L2Skill;)Z
         6: istore_3
         7: iload_3
         8: ifeq          16
        11: aload_0
        12: iconst_1
        13: invokevirtual #362                // Method setFollowStatus:(Z)V
        16: iload_3
        17: ireturn
      LineNumberTable:
        line 284: 0
        line 285: 7
        line 286: 11
        line 288: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/model/actor/ai/type/SummonAI;
            0      18     1 object   Lext/mods/gameserver/model/WorldObject;
            0      18     2 skill   Lext/mods/gameserver/skills/L2Skill;
            7      11     3 isTargetLost   Z
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ int ]

  protected void thinkIdle();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _followOwner:Z
         4: ifeq          25
         7: aload_0
         8: aload_0
         9: getfield      #48                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        12: checkcast     #52                 // class ext/mods/gameserver/model/actor/Summon
        15: invokevirtual #154                // Method ext/mods/gameserver/model/actor/Summon.getOwner:()Lext/mods/gameserver/model/actor/Player;
        18: iconst_0
        19: invokevirtual #377                // Method doFollowIntention:(Lext/mods/gameserver/model/actor/Creature;Z)V
        22: goto          49
        25: aload_0
        26: invokevirtual #380                // Method prepareIntention:()V
        29: aload_0
        30: getfield      #69                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        33: invokevirtual #383                // Method ext/mods/gameserver/model/actor/ai/Intention.updateAsIdle:()V
        36: aload_0
        37: getfield      #48                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        40: checkcast     #52                 // class ext/mods/gameserver/model/actor/Summon
        43: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Summon.getMove:()Lext/mods/gameserver/model/actor/move/SummonMove;
        46: invokevirtual #97                 // Method ext/mods/gameserver/model/actor/move/SummonMove.stop:()V
        49: return
      LineNumberTable:
        line 293: 0
        line 294: 7
        line 296: 25
        line 297: 29
        line 298: 36
        line 300: 49
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      50     0  this   Lext/mods/gameserver/model/actor/ai/type/SummonAI;
      StackMapTable: number_of_entries = 2
        frame_type = 25 /* same */
        frame_type = 23 /* same */

  protected void onEvtTeleported();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: iconst_1
         2: putfield      #7                  // Field _followOwner:Z
         5: aload_0
         6: aload_0
         7: getfield      #48                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        10: checkcast     #52                 // class ext/mods/gameserver/model/actor/Summon
        13: invokevirtual #154                // Method ext/mods/gameserver/model/actor/Summon.getOwner:()Lext/mods/gameserver/model/actor/Player;
        16: iconst_0
        17: invokevirtual #377                // Method doFollowIntention:(Lext/mods/gameserver/model/actor/Creature;Z)V
        20: return
      LineNumberTable:
        line 304: 0
        line 305: 5
        line 306: 20
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/model/actor/ai/type/SummonAI;

  protected void thinkFollow();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=4, locals=5, args_size=1
         0: aload_0
         1: getfield      #48                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #52                 // class ext/mods/gameserver/model/actor/Summon
         7: invokevirtual #66                 // Method ext/mods/gameserver/model/actor/Summon.denyAiAction:()Z
        10: ifne          194
        13: aload_0
        14: getfield      #48                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        17: checkcast     #52                 // class ext/mods/gameserver/model/actor/Summon
        20: invokevirtual #386                // Method ext/mods/gameserver/model/actor/Summon.isMovementDisabled:()Z
        23: ifne          194
        26: aload_0
        27: getfield      #69                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        30: invokevirtual #72                 // Method ext/mods/gameserver/model/actor/ai/Intention.getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
        33: astore_1
        34: aload_0
        35: getfield      #48                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        38: aload_1
        39: if_acmpeq     194
        42: aload_0
        43: getfield      #48                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        46: checkcast     #52                 // class ext/mods/gameserver/model/actor/Summon
        49: invokevirtual #154                // Method ext/mods/gameserver/model/actor/Summon.getOwner:()Lext/mods/gameserver/model/actor/Player;
        52: astore_2
        53: aload_2
        54: ifnull        165
        57: aload_0
        58: getfield      #48                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        61: checkcast     #52                 // class ext/mods/gameserver/model/actor/Summon
        64: aload_2
        65: invokevirtual #389                // Method ext/mods/gameserver/model/actor/Summon.distance2D:(Lext/mods/gameserver/model/WorldObject;)D
        68: dstore_3
        69: dload_3
        70: ldc2_w        #393                // double 1500.0d
        73: dcmpl
        74: ifgt          84
        77: aload_2
        78: invokevirtual #395                // Method ext/mods/gameserver/model/actor/Player.isTeleporting:()Z
        81: ifeq          101
        84: aload_0
        85: getfield      #48                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        88: checkcast     #52                 // class ext/mods/gameserver/model/actor/Summon
        91: aload_2
        92: invokevirtual #398                // Method ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
        95: bipush        50
        97: invokevirtual #399                // Method ext/mods/gameserver/model/actor/Summon.teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
       100: return
       101: aload_0
       102: getfield      #48                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       105: checkcast     #52                 // class ext/mods/gameserver/model/actor/Summon
       108: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Summon.getMove:()Lext/mods/gameserver/model/actor/move/SummonMove;
       111: invokevirtual #403                // Method ext/mods/gameserver/model/actor/move/SummonMove.getGeoPathFailCount:()I
       114: iconst_3
       115: if_icmplt     165
       118: aload_0
       119: getfield      #48                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       122: checkcast     #52                 // class ext/mods/gameserver/model/actor/Summon
       125: aload_2
       126: sipush        300
       129: invokevirtual #406                // Method ext/mods/gameserver/model/actor/Summon.isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
       132: ifne          165
       135: aload_0
       136: getfield      #48                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       139: checkcast     #52                 // class ext/mods/gameserver/model/actor/Summon
       142: aload_2
       143: invokevirtual #398                // Method ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
       146: bipush        50
       148: invokevirtual #399                // Method ext/mods/gameserver/model/actor/Summon.teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
       151: aload_0
       152: getfield      #48                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       155: checkcast     #52                 // class ext/mods/gameserver/model/actor/Summon
       158: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Summon.getMove:()Lext/mods/gameserver/model/actor/move/SummonMove;
       161: invokevirtual #410                // Method ext/mods/gameserver/model/actor/move/SummonMove.resetGeoPathFailCount:()V
       164: return
       165: aload_0
       166: getfield      #69                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
       169: invokevirtual #80                 // Method ext/mods/gameserver/model/actor/ai/Intention.isShiftPressed:()Z
       172: istore_3
       173: iload_3
       174: ifne          194
       177: aload_0
       178: getfield      #48                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       181: checkcast     #52                 // class ext/mods/gameserver/model/actor/Summon
       184: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Summon.getMove:()Lext/mods/gameserver/model/actor/move/SummonMove;
       187: aload_1
       188: bipush        70
       190: invokevirtual #413                // Method ext/mods/gameserver/model/actor/move/SummonMove.maybeStartFriendlyFollow:(Lext/mods/gameserver/model/actor/Creature;I)Z
       193: pop
       194: return
      LineNumberTable:
        line 310: 0
        line 311: 26
        line 312: 34
        line 313: 42
        line 314: 53
        line 315: 57
        line 316: 69
        line 317: 84
        line 318: 100
        line 320: 101
        line 321: 135
        line 322: 151
        line 323: 164
        line 326: 165
        line 327: 173
        line 328: 177
        line 332: 194
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           69      96     3 distance   D
           53     141     2 owner   Lext/mods/gameserver/model/actor/Player;
          173      21     3 isShiftPressed   Z
           34     160     1 target   Lext/mods/gameserver/model/actor/Creature;
            0     195     0  this   Lext/mods/gameserver/model/actor/ai/type/SummonAI;
      StackMapTable: number_of_entries = 4
        frame_type = 254 /* append */
          offset_delta = 84
          locals = [ class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/model/actor/Player, double ]
        frame_type = 16 /* same */
        frame_type = 250 /* chop */
          offset_delta = 63
        frame_type = 249 /* chop */
          offset_delta = 28
}
Signature: #459                         // Lext/mods/gameserver/model/actor/ai/type/PlayableAI<Lext/mods/gameserver/model/actor/Summon;>;
SourceFile: "SummonAI.java"
