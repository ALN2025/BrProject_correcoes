// Bytecode for: ext.mods.gameserver.model.actor.instance.CTFFlag
// File: ext\mods\gameserver\model\actor\instance\CTFFlag.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/CTFFlag.class
  Last modified 9 de jul de 2026; size 5451 bytes
  MD5 checksum 9ae84bd9b992f3273259cb80de2a2e5a
  Compiled from "CTFFlag.java"
public class ext.mods.gameserver.model.actor.instance.CTFFlag extends ext.mods.gameserver.model.actor.instance.Folk
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #40                         // ext/mods/gameserver/model/actor/instance/CTFFlag
  super_class: #2                         // ext/mods/gameserver/model/actor/instance/Folk
  interfaces: 0, fields: 1, methods: 3, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/instance/Folk."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/instance/Folk
    #3 = NameAndType        #5:#6         // "<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/instance/Folk
    #5 = Utf8               <init>
    #6 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
    #8 = Class              #10           // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent
    #9 = NameAndType        #11:#12       // getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
   #10 = Utf8               ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent
   #11 = Utf8               getInstance
   #12 = Utf8               ()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
   #13 = Methodref          #8.#14        // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isStarting:()Z
   #14 = NameAndType        #15:#16       // isStarting:()Z
   #15 = Utf8               isStarting
   #16 = Utf8               ()Z
   #17 = Methodref          #8.#18        // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isStarted:()Z
   #18 = NameAndType        #19:#16       // isStarted:()Z
   #19 = Utf8               isStarted
   #20 = Methodref          #21.#22       // ext/mods/gameserver/model/actor/Player.getObjectId:()I
   #21 = Class              #23           // ext/mods/gameserver/model/actor/Player
   #22 = NameAndType        #24:#25       // getObjectId:()I
   #23 = Utf8               ext/mods/gameserver/model/actor/Player
   #24 = Utf8               getObjectId
   #25 = Utf8               ()I
   #26 = Methodref          #8.#27        // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getParticipantTeam:(I)Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
   #27 = NameAndType        #28:#29       // getParticipantTeam:(I)Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
   #28 = Utf8               getParticipantTeam
   #29 = Utf8               (I)Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
   #30 = Methodref          #31.#32       // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.getName:()Ljava/lang/String;
   #31 = Class              #33           // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam
   #32 = NameAndType        #34:#35       // getName:()Ljava/lang/String;
   #33 = Utf8               ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam
   #34 = Utf8               getName
   #35 = Utf8               ()Ljava/lang/String;
   #36 = Methodref          #8.#37        // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getParticipantEnemyTeam:(I)Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
   #37 = NameAndType        #38:#29       // getParticipantEnemyTeam:(I)Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
   #38 = Utf8               getParticipantEnemyTeam
   #39 = Methodref          #40.#41       // ext/mods/gameserver/model/actor/instance/CTFFlag.getTitle:()Ljava/lang/String;
   #40 = Class              #42           // ext/mods/gameserver/model/actor/instance/CTFFlag
   #41 = NameAndType        #43:#35       // getTitle:()Ljava/lang/String;
   #42 = Utf8               ext/mods/gameserver/model/actor/instance/CTFFlag
   #43 = Utf8               getTitle
   #44 = Methodref          #8.#45        // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getEnemyCarrier:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/actor/Player;
   #45 = NameAndType        #46:#47       // getEnemyCarrier:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/actor/Player;
   #46 = Utf8               getEnemyCarrier
   #47 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/actor/Player;
   #48 = Methodref          #49.#50       // ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
   #49 = Class              #51           // ext/mods/gameserver/data/HTMLData
   #50 = NameAndType        #11:#52       // getInstance:()Lext/mods/gameserver/data/HTMLData;
   #51 = Utf8               ext/mods/gameserver/data/HTMLData
   #52 = Utf8               ()Lext/mods/gameserver/data/HTMLData;
   #53 = String             #54           // html/mods/events/ctf/flags/flag_friendly_missing.htm
   #54 = Utf8               html/mods/events/ctf/flags/flag_friendly_missing.htm
   #55 = Methodref          #49.#56       // ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
   #56 = NameAndType        #57:#58       // getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
   #57 = Utf8               getHtm
   #58 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
   #59 = Class              #60           // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #60 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #61 = Methodref          #40.#22       // ext/mods/gameserver/model/actor/instance/CTFFlag.getObjectId:()I
   #62 = Methodref          #59.#63       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
   #63 = NameAndType        #5:#64        // "<init>":(I)V
   #64 = Utf8               (I)V
   #65 = Methodref          #59.#66       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
   #66 = NameAndType        #67:#68       // setHtml:(Ljava/lang/String;)V
   #67 = Utf8               setHtml
   #68 = Utf8               (Ljava/lang/String;)V
   #69 = String             #70           // %enemyteam%
   #70 = Utf8               %enemyteam%
   #71 = Methodref          #59.#72       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
   #72 = NameAndType        #73:#74       // replace:(Ljava/lang/String;Ljava/lang/String;)V
   #73 = Utf8               replace
   #74 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #75 = String             #76           // %team%
   #76 = Utf8               %team%
   #77 = String             #78           // %player%
   #78 = Utf8               %player%
   #79 = Methodref          #21.#32       // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
   #80 = Methodref          #21.#81       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #81 = NameAndType        #82:#83       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #82 = Utf8               sendPacket
   #83 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #84 = Methodref          #8.#85        // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getTeamCarrier:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/actor/Player;
   #85 = NameAndType        #86:#47       // getTeamCarrier:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/actor/Player;
   #86 = Utf8               getTeamCarrier
   #87 = Fieldref           #88.#89       // ext/mods/Config.CTF_EVENT_CAPTURE_SKILL:I
   #88 = Class              #90           // ext/mods/Config
   #89 = NameAndType        #91:#92       // CTF_EVENT_CAPTURE_SKILL:I
   #90 = Utf8               ext/mods/Config
   #91 = Utf8               CTF_EVENT_CAPTURE_SKILL
   #92 = Utf8               I
   #93 = Class              #94           // ext/mods/gameserver/network/serverpackets/MagicSkillUse
   #94 = Utf8               ext/mods/gameserver/network/serverpackets/MagicSkillUse
   #95 = Methodref          #93.#96       // ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;IIII)V
   #96 = NameAndType        #5:#97        // "<init>":(Lext/mods/gameserver/model/actor/Creature;IIII)V
   #97 = Utf8               (Lext/mods/gameserver/model/actor/Creature;IIII)V
   #98 = Methodref          #21.#99       // ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #99 = NameAndType        #100:#83      // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #100 = Utf8               broadcastPacket
  #101 = Methodref          #8.#102       // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.removeFlagCarrier:(Lext/mods/gameserver/model/actor/Player;)V
  #102 = NameAndType        #103:#104     // removeFlagCarrier:(Lext/mods/gameserver/model/actor/Player;)V
  #103 = Utf8               removeFlagCarrier
  #104 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #105 = Methodref          #31.#106      // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.increasePoints:()V
  #106 = NameAndType        #107:#108     // increasePoints:()V
  #107 = Utf8               increasePoints
  #108 = Utf8               ()V
  #109 = InvokeDynamic      #0:#110       // #0:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #110 = NameAndType        #111:#112     // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #111 = Utf8               makeConcatWithConstants
  #112 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #113 = Methodref          #8.#114       // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.broadcastScreenMessage:(Ljava/lang/String;I)V
  #114 = NameAndType        #115:#116     // broadcastScreenMessage:(Ljava/lang/String;I)V
  #115 = Utf8               broadcastScreenMessage
  #116 = Utf8               (Ljava/lang/String;I)V
  #117 = String             #118          // html/mods/events/ctf/flags/flag_friendly.htm
  #118 = Utf8               html/mods/events/ctf/flags/flag_friendly.htm
  #119 = Methodref          #8.#120       // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.playerIsCarrier:(Lext/mods/gameserver/model/actor/Player;)Z
  #120 = NameAndType        #121:#122     // playerIsCarrier:(Lext/mods/gameserver/model/actor/Player;)Z
  #121 = Utf8               playerIsCarrier
  #122 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #123 = String             #124          // html/mods/events/ctf/flags/flag_enemy.htm
  #124 = Utf8               html/mods/events/ctf/flags/flag_enemy.htm
  #125 = String             #126          // html/mods/events/ctf/flags/flag_enemy_missing.htm
  #126 = Utf8               html/mods/events/ctf/flags/flag_enemy_missing.htm
  #127 = Methodref          #21.#128      // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #128 = NameAndType        #129:#130     // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #129 = Utf8               getInventory
  #130 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #131 = Fieldref           #132.#133     // ext/mods/gameserver/enums/Paperdoll.RHAND:Lext/mods/gameserver/enums/Paperdoll;
  #132 = Class              #134          // ext/mods/gameserver/enums/Paperdoll
  #133 = NameAndType        #135:#136     // RHAND:Lext/mods/gameserver/enums/Paperdoll;
  #134 = Utf8               ext/mods/gameserver/enums/Paperdoll
  #135 = Utf8               RHAND
  #136 = Utf8               Lext/mods/gameserver/enums/Paperdoll;
  #137 = Methodref          #138.#139     // ext/mods/gameserver/model/itemcontainer/PcInventory.getItemFrom:(Lext/mods/gameserver/enums/Paperdoll;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #138 = Class              #140          // ext/mods/gameserver/model/itemcontainer/PcInventory
  #139 = NameAndType        #141:#142     // getItemFrom:(Lext/mods/gameserver/enums/Paperdoll;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #140 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
  #141 = Utf8               getItemFrom
  #142 = Utf8               (Lext/mods/gameserver/enums/Paperdoll;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #143 = Fieldref           #132.#144     // ext/mods/gameserver/enums/Paperdoll.LHAND:Lext/mods/gameserver/enums/Paperdoll;
  #144 = NameAndType        #145:#136     // LHAND:Lext/mods/gameserver/enums/Paperdoll;
  #145 = Utf8               LHAND
  #146 = Methodref          #8.#147       // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.setCarrierUnequippedWeapons:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #147 = NameAndType        #148:#149     // setCarrierUnequippedWeapons:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #148 = Utf8               setCarrierUnequippedWeapons
  #149 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #150 = Methodref          #8.#151       // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getEnemyTeamFlagId:(Lext/mods/gameserver/model/actor/Player;)I
  #151 = NameAndType        #152:#153     // getEnemyTeamFlagId:(Lext/mods/gameserver/model/actor/Player;)I
  #152 = Utf8               getEnemyTeamFlagId
  #153 = Utf8               (Lext/mods/gameserver/model/actor/Player;)I
  #154 = Methodref          #155.#156     // ext/mods/gameserver/model/item/instance/ItemInstance.create:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #155 = Class              #157          // ext/mods/gameserver/model/item/instance/ItemInstance
  #156 = NameAndType        #158:#159     // create:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #157 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #158 = Utf8               create
  #159 = Utf8               (II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #160 = Methodref          #138.#161     // ext/mods/gameserver/model/itemcontainer/PcInventory.equipItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #161 = NameAndType        #162:#163     // equipItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #162 = Utf8               equipItem
  #163 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #164 = Methodref          #138.#165     // ext/mods/gameserver/model/itemcontainer/PcInventory.blockAllItems:()V
  #165 = NameAndType        #166:#108     // blockAllItems:()V
  #166 = Utf8               blockAllItems
  #167 = Methodref          #21.#168      // ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
  #168 = NameAndType        #169:#108     // broadcastUserInfo:()V
  #169 = Utf8               broadcastUserInfo
  #170 = Methodref          #8.#171       // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.setTeamCarrier:(Lext/mods/gameserver/model/actor/Player;)V
  #171 = NameAndType        #172:#104     // setTeamCarrier:(Lext/mods/gameserver/model/actor/Player;)V
  #172 = Utf8               setTeamCarrier
  #173 = InvokeDynamic      #1:#110       // #1:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #174 = Fieldref           #175.#176     // ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #175 = Class              #177          // ext/mods/gameserver/network/serverpackets/ActionFailed
  #176 = NameAndType        #178:#179     // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #177 = Utf8               ext/mods/gameserver/network/serverpackets/ActionFailed
  #178 = Utf8               STATIC_PACKET
  #179 = Utf8               Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #180 = Utf8               flagsPath
  #181 = Utf8               Ljava/lang/String;
  #182 = Utf8               ConstantValue
  #183 = String             #184          // html/mods/events/ctf/flags/
  #184 = Utf8               html/mods/events/ctf/flags/
  #185 = Utf8               Code
  #186 = Utf8               LineNumberTable
  #187 = Utf8               LocalVariableTable
  #188 = Utf8               this
  #189 = Utf8               Lext/mods/gameserver/model/actor/instance/CTFFlag;
  #190 = Utf8               objectId
  #191 = Utf8               template
  #192 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #193 = Utf8               showChatWindow
  #194 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
  #195 = Utf8               htmContent
  #196 = Utf8               npcHtmlMessage
  #197 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #198 = Utf8               team
  #199 = Utf8               enemyteam
  #200 = Utf8               player
  #201 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #202 = Utf8               val
  #203 = Utf8               StackMapTable
  #204 = Class              #205          // java/lang/String
  #205 = Utf8               java/lang/String
  #206 = Utf8               isInvul
  #207 = Utf8               SourceFile
  #208 = Utf8               CTFFlag.java
  #209 = Utf8               BootstrapMethods
  #210 = String             #211          // \u0001 scored for the \u0001 team!
  #211 = Utf8               \u0001 scored for the \u0001 team!
  #212 = String             #213          // \u0001 has taken the \u0001 flag team!
  #213 = Utf8               \u0001 has taken the \u0001 flag team!
  #214 = MethodHandle       6:#215        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #215 = Methodref          #216.#217     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #216 = Class              #218          // java/lang/invoke/StringConcatFactory
  #217 = NameAndType        #111:#219     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #218 = Utf8               java/lang/invoke/StringConcatFactory
  #219 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #220 = Utf8               InnerClasses
  #221 = Class              #222          // java/lang/invoke/MethodHandles$Lookup
  #222 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #223 = Class              #224          // java/lang/invoke/MethodHandles
  #224 = Utf8               java/lang/invoke/MethodHandles
  #225 = Utf8               Lookup
{
  public ext.mods.gameserver.model.actor.instance.CTFFlag(int, ext.mods.gameserver.model.actor.template.NpcTemplate);
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
        line 37: 0
        line 38: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/actor/instance/CTFFlag;
            0       7     1 objectId   I
            0       7     2 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public void showChatWindow(ext.mods.gameserver.model.actor.Player, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=7, args_size=3
         0: aload_1
         1: ifnonnull     5
         4: return
         5: invokestatic  #7                  // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
         8: invokevirtual #13                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isStarting:()Z
        11: ifne          23
        14: invokestatic  #7                  // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
        17: invokevirtual #17                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isStarted:()Z
        20: ifeq          541
        23: invokestatic  #7                  // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
        26: aload_1
        27: invokevirtual #20                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        30: invokevirtual #26                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getParticipantTeam:(I)Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
        33: invokevirtual #30                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.getName:()Ljava/lang/String;
        36: astore_3
        37: invokestatic  #7                  // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
        40: aload_1
        41: invokevirtual #20                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        44: invokevirtual #36                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getParticipantEnemyTeam:(I)Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
        47: invokevirtual #30                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.getName:()Ljava/lang/String;
        50: astore        4
        52: aload_0
        53: invokevirtual #39                 // Method getTitle:()Ljava/lang/String;
        56: aload_3
        57: if_acmpne     282
        60: invokestatic  #7                  // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
        63: aload_1
        64: invokevirtual #44                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getEnemyCarrier:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/actor/Player;
        67: ifnull        138
        70: invokestatic  #48                 // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
        73: aload_1
        74: ldc           #53                 // String html/mods/events/ctf/flags/flag_friendly_missing.htm
        76: invokevirtual #55                 // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
        79: astore        5
        81: new           #59                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
        84: dup
        85: aload_0
        86: invokevirtual #61                 // Method getObjectId:()I
        89: invokespecial #62                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
        92: astore        6
        94: aload         6
        96: aload         5
        98: invokevirtual #65                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       101: aload         6
       103: ldc           #69                 // String %enemyteam%
       105: aload         4
       107: invokevirtual #71                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       110: aload         6
       112: ldc           #75                 // String %team%
       114: aload_3
       115: invokevirtual #71                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       118: aload         6
       120: ldc           #77                 // String %player%
       122: aload_1
       123: invokevirtual #79                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       126: invokevirtual #71                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       129: aload_1
       130: aload         6
       132: invokevirtual #80                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       135: goto          541
       138: aload_1
       139: invokestatic  #7                  // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
       142: aload_1
       143: invokevirtual #84                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getTeamCarrier:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/actor/Player;
       146: if_acmpne     214
       149: getstatic     #87                 // Field ext/mods/Config.CTF_EVENT_CAPTURE_SKILL:I
       152: ifle          173
       155: aload_1
       156: new           #93                 // class ext/mods/gameserver/network/serverpackets/MagicSkillUse
       159: dup
       160: aload_1
       161: getstatic     #87                 // Field ext/mods/Config.CTF_EVENT_CAPTURE_SKILL:I
       164: iconst_1
       165: iconst_1
       166: iconst_1
       167: invokespecial #95                 // Method ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;IIII)V
       170: invokevirtual #98                 // Method ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       173: invokestatic  #7                  // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
       176: aload_1
       177: invokevirtual #101                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.removeFlagCarrier:(Lext/mods/gameserver/model/actor/Player;)V
       180: invokestatic  #7                  // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
       183: aload_1
       184: invokevirtual #20                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       187: invokevirtual #26                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getParticipantTeam:(I)Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
       190: invokevirtual #105                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.increasePoints:()V
       193: invokestatic  #7                  // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
       196: aload_1
       197: invokevirtual #79                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       200: aload_3
       201: invokedynamic #109,  0            // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       206: bipush        7
       208: invokevirtual #113                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.broadcastScreenMessage:(Ljava/lang/String;I)V
       211: goto          541
       214: invokestatic  #48                 // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
       217: aload_1
       218: ldc           #117                // String html/mods/events/ctf/flags/flag_friendly.htm
       220: invokevirtual #55                 // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
       223: astore        5
       225: new           #59                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       228: dup
       229: aload_0
       230: invokevirtual #61                 // Method getObjectId:()I
       233: invokespecial #62                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       236: astore        6
       238: aload         6
       240: aload         5
       242: invokevirtual #65                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       245: aload         6
       247: ldc           #69                 // String %enemyteam%
       249: aload         4
       251: invokevirtual #71                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       254: aload         6
       256: ldc           #75                 // String %team%
       258: aload_3
       259: invokevirtual #71                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       262: aload         6
       264: ldc           #77                 // String %player%
       266: aload_1
       267: invokevirtual #79                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       270: invokevirtual #71                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       273: aload_1
       274: aload         6
       276: invokevirtual #80                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       279: goto          541
       282: invokestatic  #7                  // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
       285: aload_1
       286: invokevirtual #119                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.playerIsCarrier:(Lext/mods/gameserver/model/actor/Player;)Z
       289: ifeq          360
       292: invokestatic  #48                 // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
       295: aload_1
       296: ldc           #123                // String html/mods/events/ctf/flags/flag_enemy.htm
       298: invokevirtual #55                 // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
       301: astore        5
       303: new           #59                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       306: dup
       307: aload_0
       308: invokevirtual #61                 // Method getObjectId:()I
       311: invokespecial #62                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       314: astore        6
       316: aload         6
       318: aload         5
       320: invokevirtual #65                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       323: aload         6
       325: ldc           #69                 // String %enemyteam%
       327: aload         4
       329: invokevirtual #71                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       332: aload         6
       334: ldc           #75                 // String %team%
       336: aload_3
       337: invokevirtual #71                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       340: aload         6
       342: ldc           #77                 // String %player%
       344: aload_1
       345: invokevirtual #79                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       348: invokevirtual #71                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       351: aload_1
       352: aload         6
       354: invokevirtual #80                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       357: goto          541
       360: invokestatic  #7                  // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
       363: aload_1
       364: invokevirtual #84                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getTeamCarrier:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/actor/Player;
       367: ifnull        436
       370: invokestatic  #48                 // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
       373: aload_1
       374: ldc           #125                // String html/mods/events/ctf/flags/flag_enemy_missing.htm
       376: invokevirtual #55                 // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
       379: astore        5
       381: new           #59                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       384: dup
       385: aload_0
       386: invokevirtual #61                 // Method getObjectId:()I
       389: invokespecial #62                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       392: astore        6
       394: aload         6
       396: aload         5
       398: invokevirtual #65                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       401: aload         6
       403: ldc           #69                 // String %enemyteam%
       405: aload         4
       407: invokevirtual #71                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       410: aload         6
       412: ldc           #77                 // String %player%
       414: invokestatic  #7                  // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
       417: aload_1
       418: invokevirtual #84                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getTeamCarrier:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/actor/Player;
       421: invokevirtual #79                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       424: invokevirtual #71                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       427: aload_1
       428: aload         6
       430: invokevirtual #80                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       433: goto          541
       436: getstatic     #87                 // Field ext/mods/Config.CTF_EVENT_CAPTURE_SKILL:I
       439: ifle          460
       442: aload_1
       443: new           #93                 // class ext/mods/gameserver/network/serverpackets/MagicSkillUse
       446: dup
       447: aload_1
       448: getstatic     #87                 // Field ext/mods/Config.CTF_EVENT_CAPTURE_SKILL:I
       451: iconst_1
       452: iconst_1
       453: iconst_1
       454: invokespecial #95                 // Method ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;IIII)V
       457: invokevirtual #98                 // Method ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       460: invokestatic  #7                  // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
       463: aload_1
       464: aload_1
       465: invokevirtual #127                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       468: getstatic     #131                // Field ext/mods/gameserver/enums/Paperdoll.RHAND:Lext/mods/gameserver/enums/Paperdoll;
       471: invokevirtual #137                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemFrom:(Lext/mods/gameserver/enums/Paperdoll;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       474: aload_1
       475: invokevirtual #127                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       478: getstatic     #143                // Field ext/mods/gameserver/enums/Paperdoll.LHAND:Lext/mods/gameserver/enums/Paperdoll;
       481: invokevirtual #137                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemFrom:(Lext/mods/gameserver/enums/Paperdoll;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       484: invokevirtual #146                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.setCarrierUnequippedWeapons:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
       487: aload_1
       488: invokevirtual #127                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       491: invokestatic  #7                  // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
       494: aload_1
       495: invokevirtual #150                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getEnemyTeamFlagId:(Lext/mods/gameserver/model/actor/Player;)I
       498: iconst_1
       499: invokestatic  #154                // Method ext/mods/gameserver/model/item/instance/ItemInstance.create:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
       502: invokevirtual #160                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.equipItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
       505: aload_1
       506: invokevirtual #127                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       509: invokevirtual #164                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.blockAllItems:()V
       512: aload_1
       513: invokevirtual #167                // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
       516: invokestatic  #7                  // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
       519: aload_1
       520: invokevirtual #170                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.setTeamCarrier:(Lext/mods/gameserver/model/actor/Player;)V
       523: invokestatic  #7                  // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
       526: aload_1
       527: invokevirtual #79                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       530: aload         4
       532: invokedynamic #173,  0            // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       537: iconst_5
       538: invokevirtual #113                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.broadcastScreenMessage:(Ljava/lang/String;I)V
       541: aload_1
       542: getstatic     #174                // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       545: invokevirtual #80                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       548: return
      LineNumberTable:
        line 43: 0
        line 44: 4
        line 46: 5
        line 48: 23
        line 49: 37
        line 51: 52
        line 53: 60
        line 55: 70
        line 56: 81
        line 58: 94
        line 59: 101
        line 60: 110
        line 61: 118
        line 62: 129
        line 63: 135
        line 64: 138
        line 66: 149
        line 67: 155
        line 69: 173
        line 70: 180
        line 71: 193
        line 75: 214
        line 76: 225
        line 78: 238
        line 79: 245
        line 80: 254
        line 81: 262
        line 82: 273
        line 83: 279
        line 87: 282
        line 89: 292
        line 90: 303
        line 92: 316
        line 93: 323
        line 94: 332
        line 95: 340
        line 96: 351
        line 97: 357
        line 98: 360
        line 100: 370
        line 101: 381
        line 103: 394
        line 104: 401
        line 105: 410
        line 106: 427
        line 107: 433
        line 110: 436
        line 111: 442
        line 113: 460
        line 114: 487
        line 115: 505
        line 116: 512
        line 117: 516
        line 118: 523
        line 123: 541
        line 124: 548
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           81      54     5 htmContent   Ljava/lang/String;
           94      41     6 npcHtmlMessage   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
          225      54     5 htmContent   Ljava/lang/String;
          238      41     6 npcHtmlMessage   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
          303      54     5 htmContent   Ljava/lang/String;
          316      41     6 npcHtmlMessage   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
          381      52     5 htmContent   Ljava/lang/String;
          394      39     6 npcHtmlMessage   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
           37     504     3  team   Ljava/lang/String;
           52     489     4 enemyteam   Ljava/lang/String;
            0     549     0  this   Lext/mods/gameserver/model/actor/instance/CTFFlag;
            0     549     1 player   Lext/mods/gameserver/model/actor/Player;
            0     549     2   val   I
      StackMapTable: number_of_entries = 10
        frame_type = 5 /* same */
        frame_type = 17 /* same */
        frame_type = 253 /* append */
          offset_delta = 114
          locals = [ class java/lang/String, class java/lang/String ]
        frame_type = 34 /* same */
        frame_type = 40 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 67
        frame_type = 251 /* same_frame_extended */
          offset_delta = 77
        frame_type = 251 /* same_frame_extended */
          offset_delta = 75
        frame_type = 23 /* same */
        frame_type = 249 /* chop */
          offset_delta = 80

  public boolean isInvul();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_1
         1: ireturn
      LineNumberTable:
        line 129: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/instance/CTFFlag;
}
SourceFile: "CTFFlag.java"
BootstrapMethods:
  0: #214 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #210 \u0001 scored for the \u0001 team!
  1: #214 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #212 \u0001 has taken the \u0001 flag team!
InnerClasses:
  public static final #225= #221 of #223; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
