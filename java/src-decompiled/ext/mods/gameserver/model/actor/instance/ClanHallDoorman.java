// Bytecode for: ext.mods.gameserver.model.actor.instance.ClanHallDoorman
// File: ext\mods\gameserver\model\actor\instance\ClanHallDoorman.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/ClanHallDoorman.class
  Last modified 9 de jul de 2026; size 6109 bytes
  MD5 checksum 969530fff06e06d2f8ef37a76a959863
  Compiled from "ClanHallDoorman.java"
public class ext.mods.gameserver.model.actor.instance.ClanHallDoorman extends ext.mods.gameserver.model.actor.instance.Doorman
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #16                         // ext/mods/gameserver/model/actor/instance/ClanHallDoorman
  super_class: #2                         // ext/mods/gameserver/model/actor/instance/Doorman
  interfaces: 0, fields: 0, methods: 9, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/instance/Doorman."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/instance/Doorman
    #3 = NameAndType        #5:#6         // "<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/instance/Doorman
    #5 = Utf8               <init>
    #6 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #7 = String             #8            // wyvern_info
    #8 = Utf8               wyvern_info
    #9 = Methodref          #10.#11       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #10 = Class              #12           // java/lang/String
   #11 = NameAndType        #13:#14       // startsWith:(Ljava/lang/String;)Z
   #12 = Utf8               java/lang/String
   #13 = Utf8               startsWith
   #14 = Utf8               (Ljava/lang/String;)Z
   #15 = Methodref          #16.#17       // ext/mods/gameserver/model/actor/instance/ClanHallDoorman.canProvideWyvernService:()Z
   #16 = Class              #18           // ext/mods/gameserver/model/actor/instance/ClanHallDoorman
   #17 = NameAndType        #19:#20       // canProvideWyvernService:()Z
   #18 = Utf8               ext/mods/gameserver/model/actor/instance/ClanHallDoorman
   #19 = Utf8               canProvideWyvernService
   #20 = Utf8               ()Z
   #21 = Methodref          #16.#22       // ext/mods/gameserver/model/actor/instance/ClanHallDoorman.isOwnerClan:(Lext/mods/gameserver/model/actor/Player;)Z
   #22 = NameAndType        #23:#24       // isOwnerClan:(Lext/mods/gameserver/model/actor/Player;)Z
   #23 = Utf8               isOwnerClan
   #24 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
   #25 = String             #26           // 1
   #26 = Utf8               1
   #27 = Methodref          #16.#28       // ext/mods/gameserver/model/actor/instance/ClanHallDoorman.sendHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #28 = NameAndType        #29:#30       // sendHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #29 = Utf8               sendHtm
   #30 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #31 = String             #32           // wyvern_help
   #32 = Utf8               wyvern_help
   #33 = String             #34           // 7
   #34 = Utf8               7
   #35 = String             #36           // wyvern_ride
   #36 = Utf8               wyvern_ride
   #37 = Methodref          #38.#39       // ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
   #38 = Class              #40           // ext/mods/gameserver/model/actor/Player
   #39 = NameAndType        #41:#20       // isClanLeader:()Z
   #40 = Utf8               ext/mods/gameserver/model/actor/Player
   #41 = Utf8               isClanLeader
   #42 = Methodref          #43.#44       // ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
   #43 = Class              #45           // ext/mods/gameserver/data/manager/SevenSignsManager
   #44 = NameAndType        #46:#47       // getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
   #45 = Utf8               ext/mods/gameserver/data/manager/SevenSignsManager
   #46 = Utf8               getInstance
   #47 = Utf8               ()Lext/mods/gameserver/data/manager/SevenSignsManager;
   #48 = Fieldref           #49.#50       // ext/mods/gameserver/enums/SealType.STRIFE:Lext/mods/gameserver/enums/SealType;
   #49 = Class              #51           // ext/mods/gameserver/enums/SealType
   #50 = NameAndType        #52:#53       // STRIFE:Lext/mods/gameserver/enums/SealType;
   #51 = Utf8               ext/mods/gameserver/enums/SealType
   #52 = Utf8               STRIFE
   #53 = Utf8               Lext/mods/gameserver/enums/SealType;
   #54 = Methodref          #43.#55       // ext/mods/gameserver/data/manager/SevenSignsManager.getSealOwner:(Lext/mods/gameserver/enums/SealType;)Lext/mods/gameserver/enums/CabalType;
   #55 = NameAndType        #56:#57       // getSealOwner:(Lext/mods/gameserver/enums/SealType;)Lext/mods/gameserver/enums/CabalType;
   #56 = Utf8               getSealOwner
   #57 = Utf8               (Lext/mods/gameserver/enums/SealType;)Lext/mods/gameserver/enums/CabalType;
   #58 = Fieldref           #59.#60       // ext/mods/gameserver/enums/CabalType.DUSK:Lext/mods/gameserver/enums/CabalType;
   #59 = Class              #61           // ext/mods/gameserver/enums/CabalType
   #60 = NameAndType        #62:#63       // DUSK:Lext/mods/gameserver/enums/CabalType;
   #61 = Utf8               ext/mods/gameserver/enums/CabalType
   #62 = Utf8               DUSK
   #63 = Utf8               Lext/mods/gameserver/enums/CabalType;
   #64 = String             #65           // 3
   #65 = Utf8               3
   #66 = Methodref          #38.#67       // ext/mods/gameserver/model/actor/Player.isMounted:()Z
   #67 = NameAndType        #68:#20       // isMounted:()Z
   #68 = Utf8               isMounted
   #69 = Methodref          #38.#70       // ext/mods/gameserver/model/actor/Player.getMountNpcId:()I
   #70 = NameAndType        #71:#72       // getMountNpcId:()I
   #71 = Utf8               getMountNpcId
   #72 = Utf8               ()I
   #73 = Methodref          #38.#74       // ext/mods/gameserver/model/actor/Player.getMountLevel:()I
   #74 = NameAndType        #75:#72       // getMountLevel:()I
   #75 = Utf8               getMountLevel
   #76 = Fieldref           #77.#78       // ext/mods/Config.WYVERN_REQUIRED_LEVEL:I
   #77 = Class              #79           // ext/mods/Config
   #78 = NameAndType        #80:#81       // WYVERN_REQUIRED_LEVEL:I
   #79 = Utf8               ext/mods/Config
   #80 = Utf8               WYVERN_REQUIRED_LEVEL
   #81 = Utf8               I
   #82 = String             #83           // 8
   #83 = Utf8               8
   #84 = Fieldref           #85.#86       // ext/mods/gameserver/network/SystemMessageId.YOU_MAY_ONLY_RIDE_WYVERN_WHILE_RIDING_STRIDER:Lext/mods/gameserver/network/SystemMessageId;
   #85 = Class              #87           // ext/mods/gameserver/network/SystemMessageId
   #86 = NameAndType        #88:#89       // YOU_MAY_ONLY_RIDE_WYVERN_WHILE_RIDING_STRIDER:Lext/mods/gameserver/network/SystemMessageId;
   #87 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #88 = Utf8               YOU_MAY_ONLY_RIDE_WYVERN_WHILE_RIDING_STRIDER
   #89 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #90 = Methodref          #38.#91       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #91 = NameAndType        #92:#93       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #92 = Utf8               sendPacket
   #93 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #94 = String             #95           // 6
   #95 = Utf8               6
   #96 = Fieldref           #77.#97       // ext/mods/Config.WYVERN_REQUIRED_CRYSTALS:I
   #97 = NameAndType        #98:#81       // WYVERN_REQUIRED_CRYSTALS:I
   #98 = Utf8               WYVERN_REQUIRED_CRYSTALS
   #99 = Methodref          #38.#100      // ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
  #100 = NameAndType        #101:#102     // destroyItemByItemId:(IIZ)Z
  #101 = Utf8               destroyItemByItemId
  #102 = Utf8               (IIZ)Z
  #103 = String             #104          // 5
  #104 = Utf8               5
  #105 = Methodref          #38.#106      // ext/mods/gameserver/model/actor/Player.dismount:()V
  #106 = NameAndType        #107:#108     // dismount:()V
  #107 = Utf8               dismount
  #108 = Utf8               ()V
  #109 = Methodref          #38.#110      // ext/mods/gameserver/model/actor/Player.mount:(II)Z
  #110 = NameAndType        #111:#112     // mount:(II)Z
  #111 = Utf8               mount
  #112 = Utf8               (II)Z
  #113 = String             #114          // 4
  #114 = Utf8               4
  #115 = Methodref          #2.#116       // ext/mods/gameserver/model/actor/instance/Doorman.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #116 = NameAndType        #117:#30      // onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #117 = Utf8               onBypassFeedback
  #118 = Fieldref           #119.#120     // ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #119 = Class              #121          // ext/mods/gameserver/network/serverpackets/ActionFailed
  #120 = NameAndType        #122:#123     // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #121 = Utf8               ext/mods/gameserver/network/serverpackets/ActionFailed
  #122 = Utf8               STATIC_PACKET
  #123 = Utf8               Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #124 = Methodref          #38.#125      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #125 = NameAndType        #92:#126      // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #126 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #127 = Methodref          #16.#128      // ext/mods/gameserver/model/actor/instance/ClanHallDoorman.getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
  #128 = NameAndType        #129:#130     // getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
  #129 = Utf8               getClanHall
  #130 = Utf8               ()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
  #131 = Class              #132          // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #132 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #133 = Methodref          #16.#134      // ext/mods/gameserver/model/actor/instance/ClanHallDoorman.getObjectId:()I
  #134 = NameAndType        #135:#72      // getObjectId:()I
  #135 = Utf8               getObjectId
  #136 = Methodref          #131.#137     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
  #137 = NameAndType        #5:#138       // "<init>":(I)V
  #138 = Utf8               (I)V
  #139 = Methodref          #140.#141     // ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
  #140 = Class              #142          // ext/mods/gameserver/data/sql/ClanTable
  #141 = NameAndType        #46:#143      // getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
  #142 = Utf8               ext/mods/gameserver/data/sql/ClanTable
  #143 = Utf8               ()Lext/mods/gameserver/data/sql/ClanTable;
  #144 = Methodref          #145.#146     // ext/mods/gameserver/model/residence/clanhall/ClanHall.getOwnerId:()I
  #145 = Class              #147          // ext/mods/gameserver/model/residence/clanhall/ClanHall
  #146 = NameAndType        #148:#72      // getOwnerId:()I
  #147 = Utf8               ext/mods/gameserver/model/residence/clanhall/ClanHall
  #148 = Utf8               getOwnerId
  #149 = Methodref          #140.#150     // ext/mods/gameserver/data/sql/ClanTable.getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
  #150 = NameAndType        #151:#152     // getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
  #151 = Utf8               getClan
  #152 = Utf8               (I)Lext/mods/gameserver/model/pledge/Clan;
  #153 = Methodref          #38.#154      // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
  #154 = NameAndType        #155:#156     // getLocale:()Ljava/util/Locale;
  #155 = Utf8               getLocale
  #156 = Utf8               ()Ljava/util/Locale;
  #157 = String             #158          // html/clanHallDoormen/doormen_wyvern.htm
  #158 = Utf8               html/clanHallDoormen/doormen_wyvern.htm
  #159 = Methodref          #131.#160     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #160 = NameAndType        #161:#162     // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #161 = Utf8               setFile
  #162 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
  #163 = String             #164          // html/clanHallDoormen/doormen.htm
  #164 = Utf8               html/clanHallDoormen/doormen.htm
  #165 = String             #166          // %clanname%
  #166 = Utf8               %clanname%
  #167 = Methodref          #168.#169     // ext/mods/gameserver/model/pledge/Clan.getName:()Ljava/lang/String;
  #168 = Class              #170          // ext/mods/gameserver/model/pledge/Clan
  #169 = NameAndType        #171:#172     // getName:()Ljava/lang/String;
  #170 = Utf8               ext/mods/gameserver/model/pledge/Clan
  #171 = Utf8               getName
  #172 = Utf8               ()Ljava/lang/String;
  #173 = Methodref          #131.#174     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
  #174 = NameAndType        #175:#176     // replace:(Ljava/lang/String;Ljava/lang/String;)V
  #175 = Utf8               replace
  #176 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #177 = Methodref          #168.#178     // ext/mods/gameserver/model/pledge/Clan.getLeader:()Lext/mods/gameserver/model/pledge/ClanMember;
  #178 = NameAndType        #179:#180     // getLeader:()Lext/mods/gameserver/model/pledge/ClanMember;
  #179 = Utf8               getLeader
  #180 = Utf8               ()Lext/mods/gameserver/model/pledge/ClanMember;
  #181 = String             #182          // html/clanHallDoormen/doormen-no.htm
  #182 = Utf8               html/clanHallDoormen/doormen-no.htm
  #183 = String             #184          // %leadername%
  #184 = Utf8               %leadername%
  #185 = Methodref          #168.#186     // ext/mods/gameserver/model/pledge/Clan.getLeaderName:()Ljava/lang/String;
  #186 = NameAndType        #187:#172     // getLeaderName:()Ljava/lang/String;
  #187 = Utf8               getLeaderName
  #188 = String             #189          // html/clanHallDoormen/emptyowner.htm
  #189 = Utf8               html/clanHallDoormen/emptyowner.htm
  #190 = String             #191          // %hallname%
  #191 = Utf8               %hallname%
  #192 = Methodref          #145.#169     // ext/mods/gameserver/model/residence/clanhall/ClanHall.getName:()Ljava/lang/String;
  #193 = String             #194          // %objectId%
  #194 = Utf8               %objectId%
  #195 = Methodref          #131.#196     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
  #196 = NameAndType        #175:#197     // replace:(Ljava/lang/String;I)V
  #197 = Utf8               (Ljava/lang/String;I)V
  #198 = Methodref          #16.#199      // ext/mods/gameserver/model/actor/instance/ClanHallDoorman.showChatWindow:(Lext/mods/gameserver/model/actor/Player;)V
  #199 = NameAndType        #200:#201     // showChatWindow:(Lext/mods/gameserver/model/actor/Player;)V
  #200 = Utf8               showChatWindow
  #201 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #202 = Methodref          #145.#203     // ext/mods/gameserver/model/residence/clanhall/ClanHall.openDoors:()V
  #203 = NameAndType        #204:#108     // openDoors:()V
  #204 = Utf8               openDoors
  #205 = String             #206          // html/clanHallDoormen/doormen-opened.htm
  #206 = Utf8               html/clanHallDoormen/doormen-opened.htm
  #207 = Methodref          #145.#208     // ext/mods/gameserver/model/residence/clanhall/ClanHall.closeDoors:()V
  #208 = NameAndType        #209:#108     // closeDoors:()V
  #209 = Utf8               closeDoors
  #210 = String             #211          // html/clanHallDoormen/doormen-closed.htm
  #211 = Utf8               html/clanHallDoormen/doormen-closed.htm
  #212 = Methodref          #38.#213      // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #213 = NameAndType        #151:#214     // getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #214 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
  #215 = Methodref          #38.#216      // ext/mods/gameserver/model/actor/Player.getClanId:()I
  #216 = NameAndType        #217:#72      // getClanId:()I
  #217 = Utf8               getClanId
  #218 = InvokeDynamic      #0:#219       // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #219 = NameAndType        #220:#221     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #220 = Utf8               makeConcatWithConstants
  #221 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #222 = String             #223          // %npcname%
  #223 = Utf8               %npcname%
  #224 = Methodref          #16.#169      // ext/mods/gameserver/model/actor/instance/ClanHallDoorman.getName:()Ljava/lang/String;
  #225 = String             #226          // %wyvern_level%
  #226 = Utf8               %wyvern_level%
  #227 = String             #228          // %needed_crystals%
  #228 = Utf8               %needed_crystals%
  #229 = Methodref          #145.#230     // ext/mods/gameserver/model/residence/clanhall/ClanHall.getId:()I
  #230 = NameAndType        #231:#72      // getId:()I
  #231 = Utf8               getId
  #232 = Utf8               Code
  #233 = Utf8               LineNumberTable
  #234 = Utf8               LocalVariableTable
  #235 = Utf8               this
  #236 = Utf8               Lext/mods/gameserver/model/actor/instance/ClanHallDoorman;
  #237 = Utf8               objectId
  #238 = Utf8               template
  #239 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #240 = Utf8               player
  #241 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #242 = Utf8               command
  #243 = Utf8               Ljava/lang/String;
  #244 = Utf8               StackMapTable
  #245 = Utf8               html
  #246 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #247 = Utf8               owner
  #248 = Utf8               Lext/mods/gameserver/model/pledge/Clan;
  #249 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
  #250 = Utf8               val
  #251 = Utf8               clanHall
  #252 = Utf8               Lext/mods/gameserver/model/residence/clanhall/ClanHall;
  #253 = Utf8               SourceFile
  #254 = Utf8               ClanHallDoorman.java
  #255 = Utf8               BootstrapMethods
  #256 = String             #257          // html/clanHallDoormen/wyvernmanager-\u0001.htm
  #257 = Utf8               html/clanHallDoormen/wyvernmanager-\u0001.htm
  #258 = MethodHandle       6:#259        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #259 = Methodref          #260.#261     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #260 = Class              #262          // java/lang/invoke/StringConcatFactory
  #261 = NameAndType        #220:#263     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #262 = Utf8               java/lang/invoke/StringConcatFactory
  #263 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #264 = Utf8               InnerClasses
  #265 = Class              #266          // java/lang/invoke/MethodHandles$Lookup
  #266 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #267 = Class              #268          // java/lang/invoke/MethodHandles
  #268 = Utf8               java/lang/invoke/MethodHandles
  #269 = Utf8               Lookup
{
  public ext.mods.gameserver.model.actor.instance.ClanHallDoorman(int, ext.mods.gameserver.model.actor.template.NpcTemplate);
    descriptor: (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: aload_2
         3: invokespecial #1                  // Method ext/mods/gameserver/model/actor/instance/Doorman."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
         6: return
      LineNumberTable:
        line 42: 0
        line 43: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/actor/instance/ClanHallDoorman;
            0       7     1 objectId   I
            0       7     2 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public void onBypassFeedback(ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_2
         1: ldc           #7                  // String wyvern_info
         3: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
         6: ifeq          33
         9: aload_0
        10: invokevirtual #15                 // Method canProvideWyvernService:()Z
        13: ifne          17
        16: return
        17: aload_0
        18: aload_1
        19: invokevirtual #21                 // Method isOwnerClan:(Lext/mods/gameserver/model/actor/Player;)Z
        22: ifne          26
        25: return
        26: aload_0
        27: aload_1
        28: ldc           #25                 // String 1
        30: invokevirtual #27                 // Method sendHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
        33: aload_2
        34: ldc           #31                 // String wyvern_help
        36: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        39: ifeq          69
        42: aload_0
        43: invokevirtual #15                 // Method canProvideWyvernService:()Z
        46: ifne          50
        49: return
        50: aload_0
        51: aload_1
        52: invokevirtual #21                 // Method isOwnerClan:(Lext/mods/gameserver/model/actor/Player;)Z
        55: ifne          59
        58: return
        59: aload_0
        60: aload_1
        61: ldc           #33                 // String 7
        63: invokevirtual #27                 // Method sendHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
        66: goto          267
        69: aload_2
        70: ldc           #35                 // String wyvern_ride
        72: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        75: ifeq          261
        78: aload_0
        79: invokevirtual #15                 // Method canProvideWyvernService:()Z
        82: ifne          86
        85: return
        86: aload_0
        87: aload_1
        88: invokevirtual #21                 // Method isOwnerClan:(Lext/mods/gameserver/model/actor/Player;)Z
        91: ifne          95
        94: return
        95: aload_1
        96: invokevirtual #37                 // Method ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
        99: ifne          103
       102: return
       103: invokestatic  #42                 // Method ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
       106: getstatic     #48                 // Field ext/mods/gameserver/enums/SealType.STRIFE:Lext/mods/gameserver/enums/SealType;
       109: invokevirtual #54                 // Method ext/mods/gameserver/data/manager/SevenSignsManager.getSealOwner:(Lext/mods/gameserver/enums/SealType;)Lext/mods/gameserver/enums/CabalType;
       112: getstatic     #58                 // Field ext/mods/gameserver/enums/CabalType.DUSK:Lext/mods/gameserver/enums/CabalType;
       115: if_acmpne     126
       118: aload_0
       119: aload_1
       120: ldc           #64                 // String 3
       122: invokevirtual #27                 // Method sendHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       125: return
       126: aload_1
       127: invokevirtual #66                 // Method ext/mods/gameserver/model/actor/Player.isMounted:()Z
       130: ifeq          163
       133: aload_1
       134: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/Player.getMountNpcId:()I
       137: sipush        12526
       140: if_icmpeq     196
       143: aload_1
       144: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/Player.getMountNpcId:()I
       147: sipush        12527
       150: if_icmpeq     196
       153: aload_1
       154: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/Player.getMountNpcId:()I
       157: sipush        12528
       160: if_icmpeq     196
       163: aload_1
       164: invokevirtual #73                 // Method ext/mods/gameserver/model/actor/Player.getMountLevel:()I
       167: getstatic     #76                 // Field ext/mods/Config.WYVERN_REQUIRED_LEVEL:I
       170: if_icmpge     181
       173: aload_0
       174: aload_1
       175: ldc           #82                 // String 8
       177: invokevirtual #27                 // Method sendHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       180: return
       181: aload_1
       182: getstatic     #84                 // Field ext/mods/gameserver/network/SystemMessageId.YOU_MAY_ONLY_RIDE_WYVERN_WHILE_RIDING_STRIDER:Lext/mods/gameserver/network/SystemMessageId;
       185: invokevirtual #90                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       188: aload_0
       189: aload_1
       190: ldc           #25                 // String 1
       192: invokevirtual #27                 // Method sendHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       195: return
       196: aload_1
       197: invokevirtual #73                 // Method ext/mods/gameserver/model/actor/Player.getMountLevel:()I
       200: getstatic     #76                 // Field ext/mods/Config.WYVERN_REQUIRED_LEVEL:I
       203: if_icmpge     214
       206: aload_0
       207: aload_1
       208: ldc           #94                 // String 6
       210: invokevirtual #27                 // Method sendHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       213: return
       214: aload_1
       215: sipush        1460
       218: getstatic     #96                 // Field ext/mods/Config.WYVERN_REQUIRED_CRYSTALS:I
       221: iconst_1
       222: invokevirtual #99                 // Method ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
       225: ifne          236
       228: aload_0
       229: aload_1
       230: ldc           #103                // String 5
       232: invokevirtual #27                 // Method sendHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       235: return
       236: aload_1
       237: invokevirtual #105                // Method ext/mods/gameserver/model/actor/Player.dismount:()V
       240: aload_1
       241: sipush        12621
       244: iconst_0
       245: invokevirtual #109                // Method ext/mods/gameserver/model/actor/Player.mount:(II)Z
       248: ifeq          267
       251: aload_0
       252: aload_1
       253: ldc           #113                // String 4
       255: invokevirtual #27                 // Method sendHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       258: goto          267
       261: aload_0
       262: aload_1
       263: aload_2
       264: invokespecial #115                // Method ext/mods/gameserver/model/actor/instance/Doorman.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       267: return
      LineNumberTable:
        line 48: 0
        line 50: 9
        line 51: 16
        line 53: 17
        line 54: 25
        line 56: 26
        line 58: 33
        line 60: 42
        line 61: 49
        line 63: 50
        line 64: 58
        line 66: 59
        line 68: 69
        line 70: 78
        line 71: 85
        line 73: 86
        line 74: 94
        line 76: 95
        line 77: 102
        line 79: 103
        line 81: 118
        line 82: 125
        line 85: 126
        line 87: 163
        line 89: 173
        line 90: 180
        line 93: 181
        line 94: 188
        line 95: 195
        line 98: 196
        line 100: 206
        line 101: 213
        line 104: 214
        line 106: 228
        line 107: 235
        line 110: 236
        line 112: 240
        line 113: 251
        line 116: 261
        line 117: 267
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     268     0  this   Lext/mods/gameserver/model/actor/instance/ClanHallDoorman;
            0     268     1 player   Lext/mods/gameserver/model/actor/Player;
            0     268     2 command   Ljava/lang/String;
      StackMapTable: number_of_entries = 17
        frame_type = 17 /* same */
        frame_type = 8 /* same */
        frame_type = 6 /* same */
        frame_type = 16 /* same */
        frame_type = 8 /* same */
        frame_type = 9 /* same */
        frame_type = 16 /* same */
        frame_type = 8 /* same */
        frame_type = 7 /* same */
        frame_type = 22 /* same */
        frame_type = 36 /* same */
        frame_type = 17 /* same */
        frame_type = 14 /* same */
        frame_type = 17 /* same */
        frame_type = 21 /* same */
        frame_type = 24 /* same */
        frame_type = 5 /* same */

  public void showChatWindow(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=2
         0: aload_1
         1: getstatic     #118                // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
         4: invokevirtual #124                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
         7: aload_0
         8: invokevirtual #127                // Method getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
        11: ifnonnull     15
        14: return
        15: new           #131                // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
        18: dup
        19: aload_0
        20: invokevirtual #133                // Method getObjectId:()I
        23: invokespecial #136                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
        26: astore_2
        27: invokestatic  #139                // Method ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
        30: aload_0
        31: invokevirtual #127                // Method getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
        34: invokevirtual #144                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getOwnerId:()I
        37: invokevirtual #149                // Method ext/mods/gameserver/data/sql/ClanTable.getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
        40: astore_3
        41: aload_0
        42: aload_1
        43: invokevirtual #21                 // Method isOwnerClan:(Lext/mods/gameserver/model/actor/Player;)Z
        46: ifeq          92
        49: aload_0
        50: invokevirtual #15                 // Method canProvideWyvernService:()Z
        53: ifeq          69
        56: aload_2
        57: aload_1
        58: invokevirtual #153                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        61: ldc           #157                // String html/clanHallDoormen/doormen_wyvern.htm
        63: invokevirtual #159                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        66: goto          79
        69: aload_2
        70: aload_1
        71: invokevirtual #153                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        74: ldc           #163                // String html/clanHallDoormen/doormen.htm
        76: invokevirtual #159                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        79: aload_2
        80: ldc           #165                // String %clanname%
        82: aload_3
        83: invokevirtual #167                // Method ext/mods/gameserver/model/pledge/Clan.getName:()Ljava/lang/String;
        86: invokevirtual #173                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
        89: goto          159
        92: aload_3
        93: ifnull        136
        96: aload_3
        97: invokevirtual #177                // Method ext/mods/gameserver/model/pledge/Clan.getLeader:()Lext/mods/gameserver/model/pledge/ClanMember;
       100: ifnull        136
       103: aload_2
       104: aload_1
       105: invokevirtual #153                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       108: ldc           #181                // String html/clanHallDoormen/doormen-no.htm
       110: invokevirtual #159                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       113: aload_2
       114: ldc           #183                // String %leadername%
       116: aload_3
       117: invokevirtual #185                // Method ext/mods/gameserver/model/pledge/Clan.getLeaderName:()Ljava/lang/String;
       120: invokevirtual #173                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       123: aload_2
       124: ldc           #165                // String %clanname%
       126: aload_3
       127: invokevirtual #167                // Method ext/mods/gameserver/model/pledge/Clan.getName:()Ljava/lang/String;
       130: invokevirtual #173                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       133: goto          159
       136: aload_2
       137: aload_1
       138: invokevirtual #153                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       141: ldc           #188                // String html/clanHallDoormen/emptyowner.htm
       143: invokevirtual #159                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       146: aload_2
       147: ldc           #190                // String %hallname%
       149: aload_0
       150: invokevirtual #127                // Method getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
       153: invokevirtual #192                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getName:()Ljava/lang/String;
       156: invokevirtual #173                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       159: aload_2
       160: ldc           #193                // String %objectId%
       162: aload_0
       163: invokevirtual #133                // Method getObjectId:()I
       166: invokevirtual #195                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       169: aload_1
       170: aload_2
       171: invokevirtual #124                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       174: return
      LineNumberTable:
        line 122: 0
        line 124: 7
        line 125: 14
        line 127: 15
        line 129: 27
        line 130: 41
        line 132: 49
        line 133: 56
        line 135: 69
        line 137: 79
        line 141: 92
        line 143: 103
        line 144: 113
        line 145: 123
        line 149: 136
        line 150: 146
        line 153: 159
        line 154: 169
        line 155: 174
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     175     0  this   Lext/mods/gameserver/model/actor/instance/ClanHallDoorman;
            0     175     1 player   Lext/mods/gameserver/model/actor/Player;
           27     148     2  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
           41     134     3 owner   Lext/mods/gameserver/model/pledge/Clan;
      StackMapTable: number_of_entries = 6
        frame_type = 15 /* same */
        frame_type = 253 /* append */
          offset_delta = 53
          locals = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/pledge/Clan ]
        frame_type = 9 /* same */
        frame_type = 12 /* same */
        frame_type = 43 /* same */
        frame_type = 22 /* same */

  public void showChatWindow(ext.mods.gameserver.model.actor.Player, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: invokevirtual #198                // Method showChatWindow:(Lext/mods/gameserver/model/actor/Player;)V
         5: return
      LineNumberTable:
        line 160: 0
        line 161: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/instance/ClanHallDoorman;
            0       6     1 player   Lext/mods/gameserver/model/actor/Player;
            0       6     2   val   I

  protected final void openDoors(ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=3, locals=4, args_size=3
         0: aload_0
         1: invokevirtual #127                // Method getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
         4: invokevirtual #202                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.openDoors:()V
         7: new           #131                // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
        10: dup
        11: aload_0
        12: invokevirtual #133                // Method getObjectId:()I
        15: invokespecial #136                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
        18: astore_3
        19: aload_3
        20: aload_1
        21: invokevirtual #153                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        24: ldc           #205                // String html/clanHallDoormen/doormen-opened.htm
        26: invokevirtual #159                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        29: aload_3
        30: ldc           #193                // String %objectId%
        32: aload_0
        33: invokevirtual #133                // Method getObjectId:()I
        36: invokevirtual #195                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
        39: aload_1
        40: aload_3
        41: invokevirtual #124                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        44: return
      LineNumberTable:
        line 166: 0
        line 168: 7
        line 169: 19
        line 170: 29
        line 171: 39
        line 172: 44
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      45     0  this   Lext/mods/gameserver/model/actor/instance/ClanHallDoorman;
            0      45     1 player   Lext/mods/gameserver/model/actor/Player;
            0      45     2 command   Ljava/lang/String;
           19      26     3  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;

  protected final void closeDoors(ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=3, locals=4, args_size=3
         0: aload_0
         1: invokevirtual #127                // Method getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
         4: invokevirtual #207                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.closeDoors:()V
         7: new           #131                // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
        10: dup
        11: aload_0
        12: invokevirtual #133                // Method getObjectId:()I
        15: invokespecial #136                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
        18: astore_3
        19: aload_3
        20: aload_1
        21: invokevirtual #153                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        24: ldc           #210                // String html/clanHallDoormen/doormen-closed.htm
        26: invokevirtual #159                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        29: aload_3
        30: ldc           #193                // String %objectId%
        32: aload_0
        33: invokevirtual #133                // Method getObjectId:()I
        36: invokevirtual #195                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
        39: aload_1
        40: aload_3
        41: invokevirtual #124                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        44: return
      LineNumberTable:
        line 177: 0
        line 179: 7
        line 180: 19
        line 181: 29
        line 182: 39
        line 183: 44
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      45     0  this   Lext/mods/gameserver/model/actor/instance/ClanHallDoorman;
            0      45     1 player   Lext/mods/gameserver/model/actor/Player;
            0      45     2 command   Ljava/lang/String;
           19      26     3  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;

  protected final boolean isOwnerClan(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Z
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #127                // Method getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
         4: ifnull        32
         7: aload_1
         8: invokevirtual #212                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        11: ifnull        32
        14: aload_1
        15: invokevirtual #215                // Method ext/mods/gameserver/model/actor/Player.getClanId:()I
        18: aload_0
        19: invokevirtual #127                // Method getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
        22: invokevirtual #144                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getOwnerId:()I
        25: if_icmpne     32
        28: iconst_1
        29: goto          33
        32: iconst_0
        33: ireturn
      LineNumberTable:
        line 188: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      34     0  this   Lext/mods/gameserver/model/actor/instance/ClanHallDoorman;
            0      34     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 2
        frame_type = 32 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
}
SourceFile: "ClanHallDoorman.java"
BootstrapMethods:
  0: #258 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #256 html/clanHallDoormen/wyvernmanager-\u0001.htm
InnerClasses:
  public static final #269= #265 of #267; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
