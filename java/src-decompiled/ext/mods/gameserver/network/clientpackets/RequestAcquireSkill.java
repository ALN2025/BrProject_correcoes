// Bytecode for: ext.mods.gameserver.network.clientpackets.RequestAcquireSkill
// File: ext\mods\gameserver\network\clientpackets\RequestAcquireSkill.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/network/clientpackets/RequestAcquireSkill.class
  Last modified 9 de jul de 2026; size 6001 bytes
  MD5 checksum dc64412da97bbd4b323cf59a749ddf5c
  Compiled from "RequestAcquireSkill.java"
public class ext.mods.gameserver.network.clientpackets.RequestAcquireSkill extends ext.mods.gameserver.network.clientpackets.L2GameClientPacket
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/network/clientpackets/RequestAcquireSkill
  super_class: #2                         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
  interfaces: 0, fields: 3, methods: 3, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
    #2 = Class              #4            // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               ext/mods/gameserver/network/clientpackets/L2GameClientPacket
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/network/clientpackets/RequestAcquireSkill.readD:()I
    #8 = Class              #10           // ext/mods/gameserver/network/clientpackets/RequestAcquireSkill
    #9 = NameAndType        #11:#12       // readD:()I
   #10 = Utf8               ext/mods/gameserver/network/clientpackets/RequestAcquireSkill
   #11 = Utf8               readD
   #12 = Utf8               ()I
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/network/clientpackets/RequestAcquireSkill._skillId:I
   #14 = NameAndType        #15:#16       // _skillId:I
   #15 = Utf8               _skillId
   #16 = Utf8               I
   #17 = Fieldref           #8.#18        // ext/mods/gameserver/network/clientpackets/RequestAcquireSkill._skillLevel:I
   #18 = NameAndType        #19:#16       // _skillLevel:I
   #19 = Utf8               _skillLevel
   #20 = Fieldref           #8.#21        // ext/mods/gameserver/network/clientpackets/RequestAcquireSkill._skillType:I
   #21 = NameAndType        #22:#16       // _skillType:I
   #22 = Utf8               _skillType
   #23 = Methodref          #8.#24        // ext/mods/gameserver/network/clientpackets/RequestAcquireSkill.getClient:()Lext/mods/commons/mmocore/MMOClient;
   #24 = NameAndType        #25:#26       // getClient:()Lext/mods/commons/mmocore/MMOClient;
   #25 = Utf8               getClient
   #26 = Utf8               ()Lext/mods/commons/mmocore/MMOClient;
   #27 = Class              #28           // ext/mods/gameserver/network/GameClient
   #28 = Utf8               ext/mods/gameserver/network/GameClient
   #29 = Methodref          #27.#30       // ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
   #30 = NameAndType        #31:#32       // getPlayer:()Lext/mods/gameserver/model/actor/Player;
   #31 = Utf8               getPlayer
   #32 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #33 = Methodref          #34.#35       // ext/mods/gameserver/model/actor/Player.getCurrentFolk:()Lext/mods/gameserver/model/actor/instance/Folk;
   #34 = Class              #36           // ext/mods/gameserver/model/actor/Player
   #35 = NameAndType        #37:#38       // getCurrentFolk:()Lext/mods/gameserver/model/actor/instance/Folk;
   #36 = Utf8               ext/mods/gameserver/model/actor/Player
   #37 = Utf8               getCurrentFolk
   #38 = Utf8               ()Lext/mods/gameserver/model/actor/instance/Folk;
   #39 = Methodref          #34.#40       // ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
   #40 = NameAndType        #41:#42       // getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
   #41 = Utf8               getAI
   #42 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
   #43 = Methodref          #44.#45       // ext/mods/gameserver/model/actor/ai/type/PlayerAI.canDoInteract:(Lext/mods/gameserver/model/WorldObject;)Z
   #44 = Class              #46           // ext/mods/gameserver/model/actor/ai/type/PlayerAI
   #45 = NameAndType        #47:#48       // canDoInteract:(Lext/mods/gameserver/model/WorldObject;)Z
   #46 = Utf8               ext/mods/gameserver/model/actor/ai/type/PlayerAI
   #47 = Utf8               canDoInteract
   #48 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Z
   #49 = Methodref          #50.#51       // ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
   #50 = Class              #52           // ext/mods/gameserver/data/SkillTable
   #51 = NameAndType        #53:#54       // getInstance:()Lext/mods/gameserver/data/SkillTable;
   #52 = Utf8               ext/mods/gameserver/data/SkillTable
   #53 = Utf8               getInstance
   #54 = Utf8               ()Lext/mods/gameserver/data/SkillTable;
   #55 = Methodref          #50.#56       // ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
   #56 = NameAndType        #57:#58       // getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
   #57 = Utf8               getInfo
   #58 = Utf8               (II)Lext/mods/gameserver/skills/L2Skill;
   #59 = Methodref          #34.#60       // ext/mods/gameserver/model/actor/Player.getSkillLevel:(I)I
   #60 = NameAndType        #61:#62       // getSkillLevel:(I)I
   #61 = Utf8               getSkillLevel
   #62 = Utf8               (I)I
   #63 = Methodref          #34.#64       // ext/mods/gameserver/model/actor/Player.getTemplate:()Lext/mods/gameserver/model/actor/template/PlayerTemplate;
   #64 = NameAndType        #65:#66       // getTemplate:()Lext/mods/gameserver/model/actor/template/PlayerTemplate;
   #65 = Utf8               getTemplate
   #66 = Utf8               ()Lext/mods/gameserver/model/actor/template/PlayerTemplate;
   #67 = Methodref          #68.#69       // ext/mods/gameserver/model/actor/template/PlayerTemplate.findSkill:(II)Lext/mods/gameserver/model/holder/skillnode/GeneralSkillNode;
   #68 = Class              #70           // ext/mods/gameserver/model/actor/template/PlayerTemplate
   #69 = NameAndType        #71:#72       // findSkill:(II)Lext/mods/gameserver/model/holder/skillnode/GeneralSkillNode;
   #70 = Utf8               ext/mods/gameserver/model/actor/template/PlayerTemplate
   #71 = Utf8               findSkill
   #72 = Utf8               (II)Lext/mods/gameserver/model/holder/skillnode/GeneralSkillNode;
   #73 = Methodref          #34.#74       // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #74 = NameAndType        #75:#76       // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #75 = Utf8               getStatus
   #76 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #77 = Methodref          #78.#79       // ext/mods/gameserver/model/actor/status/PlayerStatus.getSp:()I
   #78 = Class              #80           // ext/mods/gameserver/model/actor/status/PlayerStatus
   #79 = NameAndType        #81:#12       // getSp:()I
   #80 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
   #81 = Utf8               getSp
   #82 = Methodref          #83.#84       // ext/mods/gameserver/model/holder/skillnode/GeneralSkillNode.getCorrectedCost:()I
   #83 = Class              #85           // ext/mods/gameserver/model/holder/skillnode/GeneralSkillNode
   #84 = NameAndType        #86:#12       // getCorrectedCost:()I
   #85 = Utf8               ext/mods/gameserver/model/holder/skillnode/GeneralSkillNode
   #86 = Utf8               getCorrectedCost
   #87 = Fieldref           #88.#89       // ext/mods/gameserver/network/SystemMessageId.NOT_ENOUGH_SP_TO_LEARN_SKILL:Lext/mods/gameserver/network/SystemMessageId;
   #88 = Class              #90           // ext/mods/gameserver/network/SystemMessageId
   #89 = NameAndType        #91:#92       // NOT_ENOUGH_SP_TO_LEARN_SKILL:Lext/mods/gameserver/network/SystemMessageId;
   #90 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #91 = Utf8               NOT_ENOUGH_SP_TO_LEARN_SKILL
   #92 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #93 = Methodref          #34.#94       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #94 = NameAndType        #95:#96       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #95 = Utf8               sendPacket
   #96 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #97 = Methodref          #98.#99       // ext/mods/gameserver/model/actor/instance/Folk.showSkillList:(Lext/mods/gameserver/model/actor/Player;)V
   #98 = Class              #100          // ext/mods/gameserver/model/actor/instance/Folk
   #99 = NameAndType        #101:#102     // showSkillList:(Lext/mods/gameserver/model/actor/Player;)V
  #100 = Utf8               ext/mods/gameserver/model/actor/instance/Folk
  #101 = Utf8               showSkillList
  #102 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #103 = Methodref          #104.#105     // ext/mods/gameserver/data/xml/SpellbookData.getInstance:()Lext/mods/gameserver/data/xml/SpellbookData;
  #104 = Class              #106          // ext/mods/gameserver/data/xml/SpellbookData
  #105 = NameAndType        #53:#107      // getInstance:()Lext/mods/gameserver/data/xml/SpellbookData;
  #106 = Utf8               ext/mods/gameserver/data/xml/SpellbookData
  #107 = Utf8               ()Lext/mods/gameserver/data/xml/SpellbookData;
  #108 = Methodref          #104.#109     // ext/mods/gameserver/data/xml/SpellbookData.getBookForSkill:(II)I
  #109 = NameAndType        #110:#111     // getBookForSkill:(II)I
  #110 = Utf8               getBookForSkill
  #111 = Utf8               (II)I
  #112 = Methodref          #34.#113      // ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
  #113 = NameAndType        #114:#115     // destroyItemByItemId:(IIZ)Z
  #114 = Utf8               destroyItemByItemId
  #115 = Utf8               (IIZ)Z
  #116 = Fieldref           #88.#117      // ext/mods/gameserver/network/SystemMessageId.ITEM_MISSING_TO_LEARN_SKILL:Lext/mods/gameserver/network/SystemMessageId;
  #117 = NameAndType        #118:#92      // ITEM_MISSING_TO_LEARN_SKILL:Lext/mods/gameserver/network/SystemMessageId;
  #118 = Utf8               ITEM_MISSING_TO_LEARN_SKILL
  #119 = Methodref          #34.#120      // ext/mods/gameserver/model/actor/Player.removeExpAndSp:(JI)V
  #120 = NameAndType        #121:#122     // removeExpAndSp:(JI)V
  #121 = Utf8               removeExpAndSp
  #122 = Utf8               (JI)V
  #123 = Methodref          #34.#124      // ext/mods/gameserver/model/actor/Player.addSkill:(Lext/mods/gameserver/skills/L2Skill;ZZ)Z
  #124 = NameAndType        #125:#126     // addSkill:(Lext/mods/gameserver/skills/L2Skill;ZZ)Z
  #125 = Utf8               addSkill
  #126 = Utf8               (Lext/mods/gameserver/skills/L2Skill;ZZ)Z
  #127 = Fieldref           #88.#128      // ext/mods/gameserver/network/SystemMessageId.LEARNED_SKILL_S1:Lext/mods/gameserver/network/SystemMessageId;
  #128 = NameAndType        #129:#92      // LEARNED_SKILL_S1:Lext/mods/gameserver/network/SystemMessageId;
  #129 = Utf8               LEARNED_SKILL_S1
  #130 = Methodref          #131.#132     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #131 = Class              #133          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #132 = NameAndType        #134:#135     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #133 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #134 = Utf8               getSystemMessage
  #135 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #136 = Methodref          #131.#137     // ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #137 = NameAndType        #138:#139     // addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #138 = Utf8               addSkillName
  #139 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #140 = Methodref          #34.#141      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #141 = NameAndType        #95:#142      // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #142 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #143 = Class              #144          // ext/mods/gameserver/network/serverpackets/SkillList
  #144 = Utf8               ext/mods/gameserver/network/serverpackets/SkillList
  #145 = Methodref          #143.#146     // ext/mods/gameserver/network/serverpackets/SkillList."<init>":(Lext/mods/gameserver/model/actor/Player;)V
  #146 = NameAndType        #5:#102       // "<init>":(Lext/mods/gameserver/model/actor/Player;)V
  #147 = Class              #148          // ext/mods/gameserver/network/serverpackets/UserInfo
  #148 = Utf8               ext/mods/gameserver/network/serverpackets/UserInfo
  #149 = Methodref          #147.#146     // ext/mods/gameserver/network/serverpackets/UserInfo."<init>":(Lext/mods/gameserver/model/actor/Player;)V
  #150 = Methodref          #151.#152     // ext/mods/gameserver/data/xml/SkillTreeData.getInstance:()Lext/mods/gameserver/data/xml/SkillTreeData;
  #151 = Class              #153          // ext/mods/gameserver/data/xml/SkillTreeData
  #152 = NameAndType        #53:#154      // getInstance:()Lext/mods/gameserver/data/xml/SkillTreeData;
  #153 = Utf8               ext/mods/gameserver/data/xml/SkillTreeData
  #154 = Utf8               ()Lext/mods/gameserver/data/xml/SkillTreeData;
  #155 = Methodref          #151.#156     // ext/mods/gameserver/data/xml/SkillTreeData.getFishingSkillFor:(Lext/mods/gameserver/model/actor/Player;II)Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;
  #156 = NameAndType        #157:#158     // getFishingSkillFor:(Lext/mods/gameserver/model/actor/Player;II)Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;
  #157 = Utf8               getFishingSkillFor
  #158 = Utf8               (Lext/mods/gameserver/model/actor/Player;II)Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;
  #159 = Methodref          #160.#161     // ext/mods/gameserver/model/holder/skillnode/FishingSkillNode.getItemId:()I
  #160 = Class              #162          // ext/mods/gameserver/model/holder/skillnode/FishingSkillNode
  #161 = NameAndType        #163:#12      // getItemId:()I
  #162 = Utf8               ext/mods/gameserver/model/holder/skillnode/FishingSkillNode
  #163 = Utf8               getItemId
  #164 = Methodref          #160.#165     // ext/mods/gameserver/model/holder/skillnode/FishingSkillNode.getItemCount:()I
  #165 = NameAndType        #166:#12      // getItemCount:()I
  #166 = Utf8               getItemCount
  #167 = Methodref          #168.#169     // ext/mods/gameserver/model/actor/instance/Fisherman.showFishSkillList:(Lext/mods/gameserver/model/actor/Player;)V
  #168 = Class              #170          // ext/mods/gameserver/model/actor/instance/Fisherman
  #169 = NameAndType        #171:#102     // showFishSkillList:(Lext/mods/gameserver/model/actor/Player;)V
  #170 = Utf8               ext/mods/gameserver/model/actor/instance/Fisherman
  #171 = Utf8               showFishSkillList
  #172 = Class              #173          // ext/mods/gameserver/network/serverpackets/ExStorageMaxCount
  #173 = Utf8               ext/mods/gameserver/network/serverpackets/ExStorageMaxCount
  #174 = Methodref          #172.#146     // ext/mods/gameserver/network/serverpackets/ExStorageMaxCount."<init>":(Lext/mods/gameserver/model/actor/Player;)V
  #175 = Methodref          #34.#176      // ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
  #176 = NameAndType        #177:#178     // isClanLeader:()Z
  #177 = Utf8               isClanLeader
  #178 = Utf8               ()Z
  #179 = Methodref          #151.#180     // ext/mods/gameserver/data/xml/SkillTreeData.getClanSkillFor:(Lext/mods/gameserver/model/actor/Player;II)Lext/mods/gameserver/model/holder/skillnode/ClanSkillNode;
  #180 = NameAndType        #181:#182     // getClanSkillFor:(Lext/mods/gameserver/model/actor/Player;II)Lext/mods/gameserver/model/holder/skillnode/ClanSkillNode;
  #181 = Utf8               getClanSkillFor
  #182 = Utf8               (Lext/mods/gameserver/model/actor/Player;II)Lext/mods/gameserver/model/holder/skillnode/ClanSkillNode;
  #183 = Methodref          #34.#184      // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #184 = NameAndType        #185:#186     // getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #185 = Utf8               getClan
  #186 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
  #187 = Methodref          #188.#189     // ext/mods/gameserver/model/pledge/Clan.getReputationScore:()I
  #188 = Class              #190          // ext/mods/gameserver/model/pledge/Clan
  #189 = NameAndType        #191:#12      // getReputationScore:()I
  #190 = Utf8               ext/mods/gameserver/model/pledge/Clan
  #191 = Utf8               getReputationScore
  #192 = Methodref          #193.#194     // ext/mods/gameserver/model/holder/skillnode/ClanSkillNode.getCost:()I
  #193 = Class              #195          // ext/mods/gameserver/model/holder/skillnode/ClanSkillNode
  #194 = NameAndType        #196:#12      // getCost:()I
  #195 = Utf8               ext/mods/gameserver/model/holder/skillnode/ClanSkillNode
  #196 = Utf8               getCost
  #197 = Fieldref           #88.#198      // ext/mods/gameserver/network/SystemMessageId.ACQUIRE_SKILL_FAILED_BAD_CLAN_REP_SCORE:Lext/mods/gameserver/network/SystemMessageId;
  #198 = NameAndType        #199:#92      // ACQUIRE_SKILL_FAILED_BAD_CLAN_REP_SCORE:Lext/mods/gameserver/network/SystemMessageId;
  #199 = Utf8               ACQUIRE_SKILL_FAILED_BAD_CLAN_REP_SCORE
  #200 = Methodref          #201.#202     // ext/mods/gameserver/model/actor/instance/VillageMaster.showPledgeSkillList:(Lext/mods/gameserver/model/actor/Player;)V
  #201 = Class              #203          // ext/mods/gameserver/model/actor/instance/VillageMaster
  #202 = NameAndType        #204:#102     // showPledgeSkillList:(Lext/mods/gameserver/model/actor/Player;)V
  #203 = Utf8               ext/mods/gameserver/model/actor/instance/VillageMaster
  #204 = Utf8               showPledgeSkillList
  #205 = Fieldref           #206.#207     // ext/mods/Config.LIFE_CRYSTAL_NEEDED:Z
  #206 = Class              #208          // ext/mods/Config
  #207 = NameAndType        #209:#210     // LIFE_CRYSTAL_NEEDED:Z
  #208 = Utf8               ext/mods/Config
  #209 = Utf8               LIFE_CRYSTAL_NEEDED
  #210 = Utf8               Z
  #211 = Methodref          #193.#161     // ext/mods/gameserver/model/holder/skillnode/ClanSkillNode.getItemId:()I
  #212 = Methodref          #188.#213     // ext/mods/gameserver/model/pledge/Clan.takeReputationScore:(I)Z
  #213 = NameAndType        #214:#215     // takeReputationScore:(I)Z
  #214 = Utf8               takeReputationScore
  #215 = Utf8               (I)Z
  #216 = Fieldref           #88.#217      // ext/mods/gameserver/network/SystemMessageId.S1_DEDUCTED_FROM_CLAN_REP:Lext/mods/gameserver/network/SystemMessageId;
  #217 = NameAndType        #218:#92      // S1_DEDUCTED_FROM_CLAN_REP:Lext/mods/gameserver/network/SystemMessageId;
  #218 = Utf8               S1_DEDUCTED_FROM_CLAN_REP
  #219 = Methodref          #131.#220     // ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #220 = NameAndType        #221:#222     // addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #221 = Utf8               addNumber
  #222 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #223 = Methodref          #188.#224     // ext/mods/gameserver/model/pledge/Clan.addClanSkill:(Lext/mods/gameserver/skills/L2Skill;Z)Z
  #224 = NameAndType        #225:#226     // addClanSkill:(Lext/mods/gameserver/skills/L2Skill;Z)Z
  #225 = Utf8               addClanSkill
  #226 = Utf8               (Lext/mods/gameserver/skills/L2Skill;Z)Z
  #227 = Utf8               Code
  #228 = Utf8               LineNumberTable
  #229 = Utf8               LocalVariableTable
  #230 = Utf8               this
  #231 = Utf8               Lext/mods/gameserver/network/clientpackets/RequestAcquireSkill;
  #232 = Utf8               readImpl
  #233 = Utf8               runImpl
  #234 = Utf8               skillLvl
  #235 = Utf8               gsn
  #236 = Utf8               Lext/mods/gameserver/model/holder/skillnode/GeneralSkillNode;
  #237 = Utf8               bookId
  #238 = Utf8               fsn
  #239 = Utf8               Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;
  #240 = Utf8               csn
  #241 = Utf8               Lext/mods/gameserver/model/holder/skillnode/ClanSkillNode;
  #242 = Utf8               needRefresh
  #243 = Utf8               player
  #244 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #245 = Utf8               folk
  #246 = Utf8               Lext/mods/gameserver/model/actor/instance/Folk;
  #247 = Utf8               skill
  #248 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #249 = Utf8               StackMapTable
  #250 = Class              #251          // ext/mods/gameserver/skills/L2Skill
  #251 = Utf8               ext/mods/gameserver/skills/L2Skill
  #252 = Utf8               SourceFile
  #253 = Utf8               RequestAcquireSkill.java
{
  public ext.mods.gameserver.network.clientpackets.RequestAcquireSkill();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
         4: return
      LineNumberTable:
        line 38: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/network/clientpackets/RequestAcquireSkill;

  protected void readImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: aload_0
         2: invokevirtual #7                  // Method readD:()I
         5: putfield      #13                 // Field _skillId:I
         8: aload_0
         9: aload_0
        10: invokevirtual #7                  // Method readD:()I
        13: putfield      #17                 // Field _skillLevel:I
        16: aload_0
        17: aload_0
        18: invokevirtual #7                  // Method readD:()I
        21: putfield      #20                 // Field _skillType:I
        24: return
      LineNumberTable:
        line 47: 0
        line 48: 8
        line 49: 16
        line 50: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/network/clientpackets/RequestAcquireSkill;

  protected void runImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=4, locals=10, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _skillId:I
         4: ifle          14
         7: aload_0
         8: getfield      #17                 // Field _skillLevel:I
        11: ifgt          15
        14: return
        15: aload_0
        16: invokevirtual #23                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
        19: checkcast     #27                 // class ext/mods/gameserver/network/GameClient
        22: invokevirtual #29                 // Method ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        25: astore_1
        26: aload_1
        27: ifnonnull     31
        30: return
        31: aload_1
        32: invokevirtual #33                 // Method ext/mods/gameserver/model/actor/Player.getCurrentFolk:()Lext/mods/gameserver/model/actor/instance/Folk;
        35: astore_2
        36: aload_2
        37: ifnull        51
        40: aload_1
        41: invokevirtual #39                 // Method ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
        44: aload_2
        45: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/ai/type/PlayerAI.canDoInteract:(Lext/mods/gameserver/model/WorldObject;)Z
        48: ifne          52
        51: return
        52: invokestatic  #49                 // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
        55: aload_0
        56: getfield      #13                 // Field _skillId:I
        59: aload_0
        60: getfield      #17                 // Field _skillLevel:I
        63: invokevirtual #55                 // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
        66: astore_3
        67: aload_3
        68: ifnonnull     72
        71: return
        72: aload_0
        73: getfield      #20                 // Field _skillType:I
        76: tableswitch   { // 0 to 2

                       0: 104

                       1: 296

                       2: 454
                 default: 592
            }
       104: aload_1
       105: aload_0
       106: getfield      #13                 // Field _skillId:I
       109: invokevirtual #59                 // Method ext/mods/gameserver/model/actor/Player.getSkillLevel:(I)I
       112: istore        4
       114: iload         4
       116: aload_0
       117: getfield      #17                 // Field _skillLevel:I
       120: if_icmplt     124
       123: return
       124: iload         4
       126: aload_0
       127: getfield      #17                 // Field _skillLevel:I
       130: iconst_1
       131: isub
       132: if_icmpeq     136
       135: return
       136: aload_1
       137: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.getTemplate:()Lext/mods/gameserver/model/actor/template/PlayerTemplate;
       140: aload_0
       141: getfield      #13                 // Field _skillId:I
       144: aload_0
       145: getfield      #17                 // Field _skillLevel:I
       148: invokevirtual #67                 // Method ext/mods/gameserver/model/actor/template/PlayerTemplate.findSkill:(II)Lext/mods/gameserver/model/holder/skillnode/GeneralSkillNode;
       151: astore        5
       153: aload         5
       155: ifnonnull     159
       158: return
       159: aload_1
       160: invokevirtual #73                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       163: invokevirtual #77                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getSp:()I
       166: aload         5
       168: invokevirtual #82                 // Method ext/mods/gameserver/model/holder/skillnode/GeneralSkillNode.getCorrectedCost:()I
       171: if_icmpge     187
       174: aload_1
       175: getstatic     #87                 // Field ext/mods/gameserver/network/SystemMessageId.NOT_ENOUGH_SP_TO_LEARN_SKILL:Lext/mods/gameserver/network/SystemMessageId;
       178: invokevirtual #93                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       181: aload_2
       182: aload_1
       183: invokevirtual #97                 // Method ext/mods/gameserver/model/actor/instance/Folk.showSkillList:(Lext/mods/gameserver/model/actor/Player;)V
       186: return
       187: invokestatic  #103                // Method ext/mods/gameserver/data/xml/SpellbookData.getInstance:()Lext/mods/gameserver/data/xml/SpellbookData;
       190: aload_0
       191: getfield      #13                 // Field _skillId:I
       194: aload_0
       195: getfield      #17                 // Field _skillLevel:I
       198: invokevirtual #108                // Method ext/mods/gameserver/data/xml/SpellbookData.getBookForSkill:(II)I
       201: istore        6
       203: iload         6
       205: ifle          232
       208: aload_1
       209: iload         6
       211: iconst_1
       212: iconst_1
       213: invokevirtual #112                // Method ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
       216: ifne          232
       219: aload_1
       220: getstatic     #116                // Field ext/mods/gameserver/network/SystemMessageId.ITEM_MISSING_TO_LEARN_SKILL:Lext/mods/gameserver/network/SystemMessageId;
       223: invokevirtual #93                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       226: aload_2
       227: aload_1
       228: invokevirtual #97                 // Method ext/mods/gameserver/model/actor/instance/Folk.showSkillList:(Lext/mods/gameserver/model/actor/Player;)V
       231: return
       232: aload_1
       233: lconst_0
       234: aload         5
       236: invokevirtual #82                 // Method ext/mods/gameserver/model/holder/skillnode/GeneralSkillNode.getCorrectedCost:()I
       239: invokevirtual #119                // Method ext/mods/gameserver/model/actor/Player.removeExpAndSp:(JI)V
       242: aload_1
       243: aload_3
       244: iconst_1
       245: iconst_1
       246: invokevirtual #123                // Method ext/mods/gameserver/model/actor/Player.addSkill:(Lext/mods/gameserver/skills/L2Skill;ZZ)Z
       249: pop
       250: aload_1
       251: getstatic     #127                // Field ext/mods/gameserver/network/SystemMessageId.LEARNED_SKILL_S1:Lext/mods/gameserver/network/SystemMessageId;
       254: invokestatic  #130                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       257: aload_3
       258: invokevirtual #136                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       261: invokevirtual #140                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       264: aload_1
       265: new           #143                // class ext/mods/gameserver/network/serverpackets/SkillList
       268: dup
       269: aload_1
       270: invokespecial #145                // Method ext/mods/gameserver/network/serverpackets/SkillList."<init>":(Lext/mods/gameserver/model/actor/Player;)V
       273: invokevirtual #140                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       276: aload_1
       277: new           #147                // class ext/mods/gameserver/network/serverpackets/UserInfo
       280: dup
       281: aload_1
       282: invokespecial #149                // Method ext/mods/gameserver/network/serverpackets/UserInfo."<init>":(Lext/mods/gameserver/model/actor/Player;)V
       285: invokevirtual #140                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       288: aload_2
       289: aload_1
       290: invokevirtual #97                 // Method ext/mods/gameserver/model/actor/instance/Folk.showSkillList:(Lext/mods/gameserver/model/actor/Player;)V
       293: goto          592
       296: aload_1
       297: aload_0
       298: getfield      #13                 // Field _skillId:I
       301: invokevirtual #59                 // Method ext/mods/gameserver/model/actor/Player.getSkillLevel:(I)I
       304: istore        4
       306: iload         4
       308: aload_0
       309: getfield      #17                 // Field _skillLevel:I
       312: if_icmplt     316
       315: return
       316: iload         4
       318: aload_0
       319: getfield      #17                 // Field _skillLevel:I
       322: iconst_1
       323: isub
       324: if_icmpeq     328
       327: return
       328: invokestatic  #150                // Method ext/mods/gameserver/data/xml/SkillTreeData.getInstance:()Lext/mods/gameserver/data/xml/SkillTreeData;
       331: aload_1
       332: aload_0
       333: getfield      #13                 // Field _skillId:I
       336: aload_0
       337: getfield      #17                 // Field _skillLevel:I
       340: invokevirtual #155                // Method ext/mods/gameserver/data/xml/SkillTreeData.getFishingSkillFor:(Lext/mods/gameserver/model/actor/Player;II)Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;
       343: astore        7
       345: aload         7
       347: ifnonnull     351
       350: return
       351: aload_1
       352: aload         7
       354: invokevirtual #159                // Method ext/mods/gameserver/model/holder/skillnode/FishingSkillNode.getItemId:()I
       357: aload         7
       359: invokevirtual #164                // Method ext/mods/gameserver/model/holder/skillnode/FishingSkillNode.getItemCount:()I
       362: iconst_1
       363: invokevirtual #112                // Method ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
       366: ifne          381
       369: aload_1
       370: getstatic     #116                // Field ext/mods/gameserver/network/SystemMessageId.ITEM_MISSING_TO_LEARN_SKILL:Lext/mods/gameserver/network/SystemMessageId;
       373: invokevirtual #93                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       376: aload_1
       377: invokestatic  #167                // Method ext/mods/gameserver/model/actor/instance/Fisherman.showFishSkillList:(Lext/mods/gameserver/model/actor/Player;)V
       380: return
       381: aload_1
       382: aload_3
       383: iconst_1
       384: iconst_1
       385: invokevirtual #123                // Method ext/mods/gameserver/model/actor/Player.addSkill:(Lext/mods/gameserver/skills/L2Skill;ZZ)Z
       388: pop
       389: aload_1
       390: getstatic     #127                // Field ext/mods/gameserver/network/SystemMessageId.LEARNED_SKILL_S1:Lext/mods/gameserver/network/SystemMessageId;
       393: invokestatic  #130                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       396: aload_3
       397: invokevirtual #136                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       400: invokevirtual #140                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       403: aload_0
       404: getfield      #13                 // Field _skillId:I
       407: sipush        1368
       410: if_icmplt     435
       413: aload_0
       414: getfield      #13                 // Field _skillId:I
       417: sipush        1372
       420: if_icmpgt     435
       423: aload_1
       424: new           #172                // class ext/mods/gameserver/network/serverpackets/ExStorageMaxCount
       427: dup
       428: aload_1
       429: invokespecial #174                // Method ext/mods/gameserver/network/serverpackets/ExStorageMaxCount."<init>":(Lext/mods/gameserver/model/actor/Player;)V
       432: invokevirtual #140                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       435: aload_1
       436: new           #143                // class ext/mods/gameserver/network/serverpackets/SkillList
       439: dup
       440: aload_1
       441: invokespecial #145                // Method ext/mods/gameserver/network/serverpackets/SkillList."<init>":(Lext/mods/gameserver/model/actor/Player;)V
       444: invokevirtual #140                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       447: aload_1
       448: invokestatic  #167                // Method ext/mods/gameserver/model/actor/instance/Fisherman.showFishSkillList:(Lext/mods/gameserver/model/actor/Player;)V
       451: goto          592
       454: aload_1
       455: invokevirtual #175                // Method ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
       458: ifne          462
       461: return
       462: invokestatic  #150                // Method ext/mods/gameserver/data/xml/SkillTreeData.getInstance:()Lext/mods/gameserver/data/xml/SkillTreeData;
       465: aload_1
       466: aload_0
       467: getfield      #13                 // Field _skillId:I
       470: aload_0
       471: getfield      #17                 // Field _skillLevel:I
       474: invokevirtual #179                // Method ext/mods/gameserver/data/xml/SkillTreeData.getClanSkillFor:(Lext/mods/gameserver/model/actor/Player;II)Lext/mods/gameserver/model/holder/skillnode/ClanSkillNode;
       477: astore        8
       479: aload         8
       481: ifnonnull     485
       484: return
       485: aload_1
       486: invokevirtual #183                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       489: invokevirtual #187                // Method ext/mods/gameserver/model/pledge/Clan.getReputationScore:()I
       492: aload         8
       494: invokevirtual #192                // Method ext/mods/gameserver/model/holder/skillnode/ClanSkillNode.getCost:()I
       497: if_icmpge     512
       500: aload_1
       501: getstatic     #197                // Field ext/mods/gameserver/network/SystemMessageId.ACQUIRE_SKILL_FAILED_BAD_CLAN_REP_SCORE:Lext/mods/gameserver/network/SystemMessageId;
       504: invokevirtual #93                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       507: aload_1
       508: invokestatic  #200                // Method ext/mods/gameserver/model/actor/instance/VillageMaster.showPledgeSkillList:(Lext/mods/gameserver/model/actor/Player;)V
       511: return
       512: getstatic     #205                // Field ext/mods/Config.LIFE_CRYSTAL_NEEDED:Z
       515: ifeq          544
       518: aload_1
       519: aload         8
       521: invokevirtual #211                // Method ext/mods/gameserver/model/holder/skillnode/ClanSkillNode.getItemId:()I
       524: iconst_1
       525: iconst_1
       526: invokevirtual #112                // Method ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
       529: ifne          544
       532: aload_1
       533: getstatic     #116                // Field ext/mods/gameserver/network/SystemMessageId.ITEM_MISSING_TO_LEARN_SKILL:Lext/mods/gameserver/network/SystemMessageId;
       536: invokevirtual #93                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       539: aload_1
       540: invokestatic  #200                // Method ext/mods/gameserver/model/actor/instance/VillageMaster.showPledgeSkillList:(Lext/mods/gameserver/model/actor/Player;)V
       543: return
       544: aload_1
       545: invokevirtual #183                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       548: aload         8
       550: invokevirtual #192                // Method ext/mods/gameserver/model/holder/skillnode/ClanSkillNode.getCost:()I
       553: invokevirtual #212                // Method ext/mods/gameserver/model/pledge/Clan.takeReputationScore:(I)Z
       556: istore        9
       558: aload_1
       559: getstatic     #216                // Field ext/mods/gameserver/network/SystemMessageId.S1_DEDUCTED_FROM_CLAN_REP:Lext/mods/gameserver/network/SystemMessageId;
       562: invokestatic  #130                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       565: aload         8
       567: invokevirtual #192                // Method ext/mods/gameserver/model/holder/skillnode/ClanSkillNode.getCost:()I
       570: invokevirtual #219                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       573: invokevirtual #140                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       576: aload_1
       577: invokevirtual #183                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       580: aload_3
       581: iload         9
       583: invokevirtual #223                // Method ext/mods/gameserver/model/pledge/Clan.addClanSkill:(Lext/mods/gameserver/skills/L2Skill;Z)Z
       586: pop
       587: aload_1
       588: invokestatic  #200                // Method ext/mods/gameserver/model/actor/instance/VillageMaster.showPledgeSkillList:(Lext/mods/gameserver/model/actor/Player;)V
       591: return
       592: return
      LineNumberTable:
        line 55: 0
        line 56: 14
        line 58: 15
        line 59: 26
        line 60: 30
        line 62: 31
        line 63: 36
        line 64: 51
        line 66: 52
        line 67: 67
        line 68: 71
        line 70: 72
        line 73: 104
        line 74: 114
        line 75: 123
        line 77: 124
        line 78: 135
        line 80: 136
        line 81: 153
        line 82: 158
        line 84: 159
        line 86: 174
        line 87: 181
        line 88: 186
        line 91: 187
        line 92: 203
        line 94: 219
        line 95: 226
        line 96: 231
        line 99: 232
        line 101: 242
        line 102: 250
        line 104: 264
        line 105: 276
        line 106: 288
        line 107: 293
        line 110: 296
        line 111: 306
        line 112: 315
        line 114: 316
        line 115: 327
        line 117: 328
        line 118: 345
        line 119: 350
        line 121: 351
        line 123: 369
        line 124: 376
        line 125: 380
        line 128: 381
        line 129: 389
        line 131: 403
        line 132: 423
        line 134: 435
        line 135: 447
        line 136: 451
        line 139: 454
        line 140: 461
        line 142: 462
        line 143: 479
        line 144: 484
        line 146: 485
        line 148: 500
        line 149: 507
        line 150: 511
        line 153: 512
        line 155: 532
        line 156: 539
        line 157: 543
        line 160: 544
        line 162: 558
        line 164: 576
        line 166: 587
        line 167: 591
        line 169: 592
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          114     182     4 skillLvl   I
          153     143     5   gsn   Lext/mods/gameserver/model/holder/skillnode/GeneralSkillNode;
          203      93     6 bookId   I
          306     148     4 skillLvl   I
          345     109     7   fsn   Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;
          479     113     8   csn   Lext/mods/gameserver/model/holder/skillnode/ClanSkillNode;
          558      34     9 needRefresh   Z
            0     593     0  this   Lext/mods/gameserver/network/clientpackets/RequestAcquireSkill;
           26     567     1 player   Lext/mods/gameserver/model/actor/Player;
           36     557     2  folk   Lext/mods/gameserver/model/actor/instance/Folk;
           67     526     3 skill   Lext/mods/gameserver/skills/L2Skill;
      StackMapTable: number_of_entries = 24
        frame_type = 14 /* same */
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/actor/instance/Folk ]
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/skills/L2Skill ]
        frame_type = 31 /* same */
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ int ]
        frame_type = 11 /* same */
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ class ext/mods/gameserver/model/holder/skillnode/GeneralSkillNode ]
        frame_type = 27 /* same */
        frame_type = 252 /* append */
          offset_delta = 44
          locals = [ int ]
        frame_type = 248 /* chop */
          offset_delta = 63
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ int ]
        frame_type = 11 /* same */
        frame_type = 254 /* append */
          offset_delta = 22
          locals = [ top, top, class ext/mods/gameserver/model/holder/skillnode/FishingSkillNode ]
        frame_type = 29 /* same */
        frame_type = 53 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 18
          locals = [ class ext/mods/gameserver/network/clientpackets/RequestAcquireSkill, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/instance/Folk, class ext/mods/gameserver/skills/L2Skill ]
          stack = []
        frame_type = 7 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 22
          locals = [ class ext/mods/gameserver/network/clientpackets/RequestAcquireSkill, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/instance/Folk, class ext/mods/gameserver/skills/L2Skill, top, top, top, top, class ext/mods/gameserver/model/holder/skillnode/ClanSkillNode ]
          stack = []
        frame_type = 26 /* same */
        frame_type = 31 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 47
          locals = [ class ext/mods/gameserver/network/clientpackets/RequestAcquireSkill, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/instance/Folk, class ext/mods/gameserver/skills/L2Skill ]
          stack = []
}
SourceFile: "RequestAcquireSkill.java"
