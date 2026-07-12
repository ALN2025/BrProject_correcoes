// Bytecode for: ext.mods.gameserver.model.actor.instance.WyvernManagerNpc
// File: ext\mods\gameserver\model\actor\instance\WyvernManagerNpc.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/WyvernManagerNpc.class
  Last modified 9 de jul de 2026; size 5259 bytes
  MD5 checksum 55dbb17a079feec185e2cdd4278f7f11
  Compiled from "WyvernManagerNpc.java"
public class ext.mods.gameserver.model.actor.instance.WyvernManagerNpc extends ext.mods.gameserver.model.actor.instance.CastleChamberlain
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #20                         // ext/mods/gameserver/model/actor/instance/WyvernManagerNpc
  super_class: #2                         // ext/mods/gameserver/model/actor/instance/CastleChamberlain
  interfaces: 0, fields: 0, methods: 5, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/instance/CastleChamberlain."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/instance/CastleChamberlain
    #3 = NameAndType        #5:#6         // "<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/instance/CastleChamberlain
    #5 = Utf8               <init>
    #6 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/model/actor/Player.getCurrentFolk:()Lext/mods/gameserver/model/actor/instance/Folk;
    #8 = Class              #10           // ext/mods/gameserver/model/actor/Player
    #9 = NameAndType        #11:#12       // getCurrentFolk:()Lext/mods/gameserver/model/actor/instance/Folk;
   #10 = Utf8               ext/mods/gameserver/model/actor/Player
   #11 = Utf8               getCurrentFolk
   #12 = Utf8               ()Lext/mods/gameserver/model/actor/instance/Folk;
   #13 = Methodref          #14.#15       // ext/mods/gameserver/model/actor/instance/Folk.getObjectId:()I
   #14 = Class              #16           // ext/mods/gameserver/model/actor/instance/Folk
   #15 = NameAndType        #17:#18       // getObjectId:()I
   #16 = Utf8               ext/mods/gameserver/model/actor/instance/Folk
   #17 = Utf8               getObjectId
   #18 = Utf8               ()I
   #19 = Methodref          #20.#15       // ext/mods/gameserver/model/actor/instance/WyvernManagerNpc.getObjectId:()I
   #20 = Class              #21           // ext/mods/gameserver/model/actor/instance/WyvernManagerNpc
   #21 = Utf8               ext/mods/gameserver/model/actor/instance/WyvernManagerNpc
   #22 = String             #23           // RideWyvern
   #23 = Utf8               RideWyvern
   #24 = Methodref          #25.#26       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #25 = Class              #27           // java/lang/String
   #26 = NameAndType        #28:#29       // startsWith:(Ljava/lang/String;)Z
   #27 = Utf8               java/lang/String
   #28 = Utf8               startsWith
   #29 = Utf8               (Ljava/lang/String;)Z
   #30 = Methodref          #20.#31       // ext/mods/gameserver/model/actor/instance/WyvernManagerNpc.isLordOwner:(Lext/mods/gameserver/model/actor/Player;)Z
   #31 = NameAndType        #32:#33       // isLordOwner:(Lext/mods/gameserver/model/actor/Player;)Z
   #32 = Utf8               isLordOwner
   #33 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
   #34 = String             #35           // 2
   #35 = Utf8               2
   #36 = Methodref          #20.#37       // ext/mods/gameserver/model/actor/instance/WyvernManagerNpc.sendHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #37 = NameAndType        #38:#39       // sendHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #38 = Utf8               sendHtm
   #39 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #40 = Methodref          #41.#42       // ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
   #41 = Class              #43           // ext/mods/gameserver/data/manager/SevenSignsManager
   #42 = NameAndType        #44:#45       // getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
   #43 = Utf8               ext/mods/gameserver/data/manager/SevenSignsManager
   #44 = Utf8               getInstance
   #45 = Utf8               ()Lext/mods/gameserver/data/manager/SevenSignsManager;
   #46 = Fieldref           #47.#48       // ext/mods/gameserver/enums/SealType.STRIFE:Lext/mods/gameserver/enums/SealType;
   #47 = Class              #49           // ext/mods/gameserver/enums/SealType
   #48 = NameAndType        #50:#51       // STRIFE:Lext/mods/gameserver/enums/SealType;
   #49 = Utf8               ext/mods/gameserver/enums/SealType
   #50 = Utf8               STRIFE
   #51 = Utf8               Lext/mods/gameserver/enums/SealType;
   #52 = Methodref          #41.#53       // ext/mods/gameserver/data/manager/SevenSignsManager.getSealOwner:(Lext/mods/gameserver/enums/SealType;)Lext/mods/gameserver/enums/CabalType;
   #53 = NameAndType        #54:#55       // getSealOwner:(Lext/mods/gameserver/enums/SealType;)Lext/mods/gameserver/enums/CabalType;
   #54 = Utf8               getSealOwner
   #55 = Utf8               (Lext/mods/gameserver/enums/SealType;)Lext/mods/gameserver/enums/CabalType;
   #56 = Fieldref           #57.#58       // ext/mods/gameserver/enums/CabalType.DUSK:Lext/mods/gameserver/enums/CabalType;
   #57 = Class              #59           // ext/mods/gameserver/enums/CabalType
   #58 = NameAndType        #60:#61       // DUSK:Lext/mods/gameserver/enums/CabalType;
   #59 = Utf8               ext/mods/gameserver/enums/CabalType
   #60 = Utf8               DUSK
   #61 = Utf8               Lext/mods/gameserver/enums/CabalType;
   #62 = String             #63           // 3
   #63 = Utf8               3
   #64 = Methodref          #8.#65        // ext/mods/gameserver/model/actor/Player.isMounted:()Z
   #65 = NameAndType        #66:#67       // isMounted:()Z
   #66 = Utf8               isMounted
   #67 = Utf8               ()Z
   #68 = Methodref          #8.#69        // ext/mods/gameserver/model/actor/Player.getMountNpcId:()I
   #69 = NameAndType        #70:#18       // getMountNpcId:()I
   #70 = Utf8               getMountNpcId
   #71 = Fieldref           #72.#73       // ext/mods/gameserver/network/SystemMessageId.YOU_MAY_ONLY_RIDE_WYVERN_WHILE_RIDING_STRIDER:Lext/mods/gameserver/network/SystemMessageId;
   #72 = Class              #74           // ext/mods/gameserver/network/SystemMessageId
   #73 = NameAndType        #75:#76       // YOU_MAY_ONLY_RIDE_WYVERN_WHILE_RIDING_STRIDER:Lext/mods/gameserver/network/SystemMessageId;
   #74 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #75 = Utf8               YOU_MAY_ONLY_RIDE_WYVERN_WHILE_RIDING_STRIDER
   #76 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #77 = Methodref          #8.#78        // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #78 = NameAndType        #79:#80       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #79 = Utf8               sendPacket
   #80 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #81 = String             #82           // 1
   #82 = Utf8               1
   #83 = Methodref          #8.#84        // ext/mods/gameserver/model/actor/Player.getMountLevel:()I
   #84 = NameAndType        #85:#18       // getMountLevel:()I
   #85 = Utf8               getMountLevel
   #86 = Fieldref           #87.#88       // ext/mods/Config.WYVERN_REQUIRED_LEVEL:I
   #87 = Class              #89           // ext/mods/Config
   #88 = NameAndType        #90:#91       // WYVERN_REQUIRED_LEVEL:I
   #89 = Utf8               ext/mods/Config
   #90 = Utf8               WYVERN_REQUIRED_LEVEL
   #91 = Utf8               I
   #92 = String             #93           // 6
   #93 = Utf8               6
   #94 = Fieldref           #87.#95       // ext/mods/Config.WYVERN_REQUIRED_CRYSTALS:I
   #95 = NameAndType        #96:#91       // WYVERN_REQUIRED_CRYSTALS:I
   #96 = Utf8               WYVERN_REQUIRED_CRYSTALS
   #97 = Methodref          #8.#98        // ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
   #98 = NameAndType        #99:#100      // destroyItemByItemId:(IIZ)Z
   #99 = Utf8               destroyItemByItemId
  #100 = Utf8               (IIZ)Z
  #101 = String             #102          // 5
  #102 = Utf8               5
  #103 = Methodref          #8.#104       // ext/mods/gameserver/model/actor/Player.dismount:()V
  #104 = NameAndType        #105:#106     // dismount:()V
  #105 = Utf8               dismount
  #106 = Utf8               ()V
  #107 = Methodref          #8.#108       // ext/mods/gameserver/model/actor/Player.mount:(II)Z
  #108 = NameAndType        #109:#110     // mount:(II)Z
  #109 = Utf8               mount
  #110 = Utf8               (II)Z
  #111 = String             #112          // 4
  #112 = Utf8               4
  #113 = String             #114          // Chat
  #114 = Utf8               Chat
  #115 = Methodref          #25.#116      // java/lang/String.substring:(I)Ljava/lang/String;
  #116 = NameAndType        #117:#118     // substring:(I)Ljava/lang/String;
  #117 = Utf8               substring
  #118 = Utf8               (I)Ljava/lang/String;
  #119 = Class              #120          // java/lang/IndexOutOfBoundsException
  #120 = Utf8               java/lang/IndexOutOfBoundsException
  #121 = Methodref          #2.#122       // ext/mods/gameserver/model/actor/instance/CastleChamberlain.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #122 = NameAndType        #123:#39      // onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #123 = Utf8               onBypassFeedback
  #124 = Methodref          #20.#125      // ext/mods/gameserver/model/actor/instance/WyvernManagerNpc.getNpcTalkCond:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/enums/actors/NpcTalkCond;
  #125 = NameAndType        #126:#127     // getNpcTalkCond:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/enums/actors/NpcTalkCond;
  #126 = Utf8               getNpcTalkCond
  #127 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/enums/actors/NpcTalkCond;
  #128 = Fieldref           #129.#130     // ext/mods/gameserver/enums/actors/NpcTalkCond.OWNER:Lext/mods/gameserver/enums/actors/NpcTalkCond;
  #129 = Class              #131          // ext/mods/gameserver/enums/actors/NpcTalkCond
  #130 = NameAndType        #132:#133     // OWNER:Lext/mods/gameserver/enums/actors/NpcTalkCond;
  #131 = Utf8               ext/mods/gameserver/enums/actors/NpcTalkCond
  #132 = Utf8               OWNER
  #133 = Utf8               Lext/mods/gameserver/enums/actors/NpcTalkCond;
  #134 = Methodref          #8.#135       // ext/mods/gameserver/model/actor/Player.isFlying:()Z
  #135 = NameAndType        #136:#67      // isFlying:()Z
  #136 = Utf8               isFlying
  #137 = String             #138          // 0
  #138 = Utf8               0
  #139 = Fieldref           #129.#140     // ext/mods/gameserver/enums/actors/NpcTalkCond.CLAN_MEMBER:Lext/mods/gameserver/enums/actors/NpcTalkCond;
  #140 = NameAndType        #141:#133     // CLAN_MEMBER:Lext/mods/gameserver/enums/actors/NpcTalkCond;
  #141 = Utf8               CLAN_MEMBER
  #142 = String             #143          // 0a
  #143 = Utf8               0a
  #144 = Methodref          #8.#145       // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #145 = NameAndType        #146:#147     // getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #146 = Utf8               getClan
  #147 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
  #148 = Methodref          #20.#149      // ext/mods/gameserver/model/actor/instance/WyvernManagerNpc.getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
  #149 = NameAndType        #150:#151     // getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
  #150 = Utf8               getCastle
  #151 = Utf8               ()Lext/mods/gameserver/model/residence/castle/Castle;
  #152 = Methodref          #153.#154     // ext/mods/gameserver/model/residence/castle/Castle.getOwnerId:()I
  #153 = Class              #155          // ext/mods/gameserver/model/residence/castle/Castle
  #154 = NameAndType        #156:#18      // getOwnerId:()I
  #155 = Utf8               ext/mods/gameserver/model/residence/castle/Castle
  #156 = Utf8               getOwnerId
  #157 = Methodref          #8.#158       // ext/mods/gameserver/model/actor/Player.getClanId:()I
  #158 = NameAndType        #159:#18      // getClanId:()I
  #159 = Utf8               getClanId
  #160 = Methodref          #20.#161      // ext/mods/gameserver/model/actor/instance/WyvernManagerNpc.getSiegableHall:()Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
  #161 = NameAndType        #162:#163     // getSiegableHall:()Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
  #162 = Utf8               getSiegableHall
  #163 = Utf8               ()Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
  #164 = Methodref          #165.#154     // ext/mods/gameserver/model/residence/clanhall/SiegableHall.getOwnerId:()I
  #165 = Class              #166          // ext/mods/gameserver/model/residence/clanhall/SiegableHall
  #166 = Utf8               ext/mods/gameserver/model/residence/clanhall/SiegableHall
  #167 = Methodref          #8.#168       // ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
  #168 = NameAndType        #169:#67      // isClanLeader:()Z
  #169 = Utf8               isClanLeader
  #170 = Fieldref           #129.#171     // ext/mods/gameserver/enums/actors/NpcTalkCond.NONE:Lext/mods/gameserver/enums/actors/NpcTalkCond;
  #171 = NameAndType        #172:#133     // NONE:Lext/mods/gameserver/enums/actors/NpcTalkCond;
  #172 = Utf8               NONE
  #173 = Class              #174          // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #174 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #175 = Methodref          #173.#176     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
  #176 = NameAndType        #5:#177       // "<init>":(I)V
  #177 = Utf8               (I)V
  #178 = Methodref          #8.#179       // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
  #179 = NameAndType        #180:#181     // getLocale:()Ljava/util/Locale;
  #180 = Utf8               getLocale
  #181 = Utf8               ()Ljava/util/Locale;
  #182 = InvokeDynamic      #0:#183       // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #183 = NameAndType        #184:#185     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #184 = Utf8               makeConcatWithConstants
  #185 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #186 = Methodref          #173.#187     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #187 = NameAndType        #188:#189     // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #188 = Utf8               setFile
  #189 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
  #190 = String             #191          // %objectId%
  #191 = Utf8               %objectId%
  #192 = Methodref          #173.#193     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
  #193 = NameAndType        #194:#195     // replace:(Ljava/lang/String;I)V
  #194 = Utf8               replace
  #195 = Utf8               (Ljava/lang/String;I)V
  #196 = String             #197          // %npcname%
  #197 = Utf8               %npcname%
  #198 = Methodref          #20.#199      // ext/mods/gameserver/model/actor/instance/WyvernManagerNpc.getName:()Ljava/lang/String;
  #199 = NameAndType        #200:#201     // getName:()Ljava/lang/String;
  #200 = Utf8               getName
  #201 = Utf8               ()Ljava/lang/String;
  #202 = Methodref          #173.#203     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
  #203 = NameAndType        #194:#204     // replace:(Ljava/lang/String;Ljava/lang/String;)V
  #204 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #205 = String             #206          // %wyvern_level%
  #206 = Utf8               %wyvern_level%
  #207 = String             #208          // %needed_crystals%
  #208 = Utf8               %needed_crystals%
  #209 = Methodref          #8.#210       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #210 = NameAndType        #79:#211      // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #211 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #212 = Fieldref           #213.#214     // ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #213 = Class              #215          // ext/mods/gameserver/network/serverpackets/ActionFailed
  #214 = NameAndType        #216:#217     // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #215 = Utf8               ext/mods/gameserver/network/serverpackets/ActionFailed
  #216 = Utf8               STATIC_PACKET
  #217 = Utf8               Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #218 = Utf8               Code
  #219 = Utf8               LineNumberTable
  #220 = Utf8               LocalVariableTable
  #221 = Utf8               this
  #222 = Utf8               Lext/mods/gameserver/model/actor/instance/WyvernManagerNpc;
  #223 = Utf8               objectId
  #224 = Utf8               template
  #225 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #226 = Utf8               val
  #227 = Utf8               Ljava/lang/String;
  #228 = Utf8               player
  #229 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #230 = Utf8               command
  #231 = Utf8               StackMapTable
  #232 = Utf8               showChatWindow
  #233 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #234 = Utf8               condition
  #235 = Utf8               html
  #236 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #237 = Utf8               SourceFile
  #238 = Utf8               WyvernManagerNpc.java
  #239 = Utf8               BootstrapMethods
  #240 = String             #241          // html/wyvernmanager/wyvernmanager-\u0001.htm
  #241 = Utf8               html/wyvernmanager/wyvernmanager-\u0001.htm
  #242 = MethodHandle       6:#243        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #243 = Methodref          #244.#245     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #244 = Class              #246          // java/lang/invoke/StringConcatFactory
  #245 = NameAndType        #184:#247     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #246 = Utf8               java/lang/invoke/StringConcatFactory
  #247 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #248 = Utf8               InnerClasses
  #249 = Class              #250          // java/lang/invoke/MethodHandles$Lookup
  #250 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #251 = Class              #252          // java/lang/invoke/MethodHandles
  #252 = Utf8               java/lang/invoke/MethodHandles
  #253 = Utf8               Lookup
{
  public ext.mods.gameserver.model.actor.instance.WyvernManagerNpc(int, ext.mods.gameserver.model.actor.template.NpcTemplate);
    descriptor: (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: aload_2
         3: invokespecial #1                  // Method ext/mods/gameserver/model/actor/instance/CastleChamberlain."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
         6: return
      LineNumberTable:
        line 45: 0
        line 46: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/actor/instance/WyvernManagerNpc;
            0       7     1 objectId   I
            0       7     2 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public void onBypassFeedback(ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=5, args_size=3
         0: aload_1
         1: invokevirtual #7                  // Method ext/mods/gameserver/model/actor/Player.getCurrentFolk:()Lext/mods/gameserver/model/actor/instance/Folk;
         4: ifnull        21
         7: aload_1
         8: invokevirtual #7                  // Method ext/mods/gameserver/model/actor/Player.getCurrentFolk:()Lext/mods/gameserver/model/actor/instance/Folk;
        11: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/instance/Folk.getObjectId:()I
        14: aload_0
        15: invokevirtual #19                 // Method getObjectId:()I
        18: if_icmpeq     22
        21: return
        22: aload_2
        23: ldc           #22                 // String RideWyvern
        25: invokevirtual #24                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        28: ifeq          187
        31: aload_0
        32: aload_1
        33: invokevirtual #30                 // Method isLordOwner:(Lext/mods/gameserver/model/actor/Player;)Z
        36: ifne          47
        39: aload_0
        40: aload_1
        41: ldc           #34                 // String 2
        43: invokevirtual #36                 // Method sendHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
        46: return
        47: invokestatic  #40                 // Method ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
        50: getstatic     #46                 // Field ext/mods/gameserver/enums/SealType.STRIFE:Lext/mods/gameserver/enums/SealType;
        53: invokevirtual #52                 // Method ext/mods/gameserver/data/manager/SevenSignsManager.getSealOwner:(Lext/mods/gameserver/enums/SealType;)Lext/mods/gameserver/enums/CabalType;
        56: getstatic     #56                 // Field ext/mods/gameserver/enums/CabalType.DUSK:Lext/mods/gameserver/enums/CabalType;
        59: if_acmpne     70
        62: aload_0
        63: aload_1
        64: ldc           #62                 // String 3
        66: invokevirtual #36                 // Method sendHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
        69: return
        70: aload_1
        71: invokevirtual #64                 // Method ext/mods/gameserver/model/actor/Player.isMounted:()Z
        74: ifeq          107
        77: aload_1
        78: invokevirtual #68                 // Method ext/mods/gameserver/model/actor/Player.getMountNpcId:()I
        81: sipush        12526
        84: if_icmpeq     122
        87: aload_1
        88: invokevirtual #68                 // Method ext/mods/gameserver/model/actor/Player.getMountNpcId:()I
        91: sipush        12527
        94: if_icmpeq     122
        97: aload_1
        98: invokevirtual #68                 // Method ext/mods/gameserver/model/actor/Player.getMountNpcId:()I
       101: sipush        12528
       104: if_icmpeq     122
       107: aload_1
       108: getstatic     #71                 // Field ext/mods/gameserver/network/SystemMessageId.YOU_MAY_ONLY_RIDE_WYVERN_WHILE_RIDING_STRIDER:Lext/mods/gameserver/network/SystemMessageId;
       111: invokevirtual #77                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       114: aload_0
       115: aload_1
       116: ldc           #81                 // String 1
       118: invokevirtual #36                 // Method sendHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       121: return
       122: aload_1
       123: invokevirtual #83                 // Method ext/mods/gameserver/model/actor/Player.getMountLevel:()I
       126: getstatic     #86                 // Field ext/mods/Config.WYVERN_REQUIRED_LEVEL:I
       129: if_icmpge     140
       132: aload_0
       133: aload_1
       134: ldc           #92                 // String 6
       136: invokevirtual #36                 // Method sendHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       139: return
       140: aload_1
       141: sipush        1460
       144: getstatic     #94                 // Field ext/mods/Config.WYVERN_REQUIRED_CRYSTALS:I
       147: iconst_1
       148: invokevirtual #97                 // Method ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
       151: ifne          162
       154: aload_0
       155: aload_1
       156: ldc           #101                // String 5
       158: invokevirtual #36                 // Method sendHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       161: return
       162: aload_1
       163: invokevirtual #103                // Method ext/mods/gameserver/model/actor/Player.dismount:()V
       166: aload_1
       167: sipush        12621
       170: iconst_0
       171: invokevirtual #107                // Method ext/mods/gameserver/model/actor/Player.mount:(II)Z
       174: ifeq          225
       177: aload_0
       178: aload_1
       179: ldc           #111                // String 4
       181: invokevirtual #36                 // Method sendHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       184: goto          225
       187: aload_2
       188: ldc           #113                // String Chat
       190: invokevirtual #24                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       193: ifeq          219
       196: ldc           #81                 // String 1
       198: astore_3
       199: aload_2
       200: iconst_5
       201: invokevirtual #115                // Method java/lang/String.substring:(I)Ljava/lang/String;
       204: astore_3
       205: goto          210
       208: astore        4
       210: aload_0
       211: aload_1
       212: aload_3
       213: invokevirtual #36                 // Method sendHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       216: goto          225
       219: aload_0
       220: aload_1
       221: aload_2
       222: invokespecial #121                // Method ext/mods/gameserver/model/actor/instance/CastleChamberlain.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       225: return
      Exception table:
         from    to  target type
           199   205   208   Class java/lang/IndexOutOfBoundsException
      LineNumberTable:
        line 51: 0
        line 52: 21
        line 54: 22
        line 56: 31
        line 58: 39
        line 59: 46
        line 62: 47
        line 64: 62
        line 65: 69
        line 68: 70
        line 70: 107
        line 71: 114
        line 72: 121
        line 75: 122
        line 77: 132
        line 78: 139
        line 81: 140
        line 83: 154
        line 84: 161
        line 87: 162
        line 89: 166
        line 90: 177
        line 92: 187
        line 94: 196
        line 97: 199
        line 101: 205
        line 99: 208
        line 103: 210
        line 104: 216
        line 106: 219
        line 107: 225
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          199      17     3   val   Ljava/lang/String;
            0     226     0  this   Lext/mods/gameserver/model/actor/instance/WyvernManagerNpc;
            0     226     1 player   Lext/mods/gameserver/model/actor/Player;
            0     226     2 command   Ljava/lang/String;
      StackMapTable: number_of_entries = 13
        frame_type = 21 /* same */
        frame_type = 0 /* same */
        frame_type = 24 /* same */
        frame_type = 22 /* same */
        frame_type = 36 /* same */
        frame_type = 14 /* same */
        frame_type = 17 /* same */
        frame_type = 21 /* same */
        frame_type = 24 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/model/actor/instance/WyvernManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/lang/String ]
          stack = [ class java/lang/IndexOutOfBoundsException ]
        frame_type = 1 /* same */
        frame_type = 250 /* chop */
          offset_delta = 8
        frame_type = 5 /* same */

  public void showChatWindow(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #124                // Method getNpcTalkCond:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/enums/actors/NpcTalkCond;
         5: astore_2
         6: aload_2
         7: getstatic     #128                // Field ext/mods/gameserver/enums/actors/NpcTalkCond.OWNER:Lext/mods/gameserver/enums/actors/NpcTalkCond;
        10: if_acmpne     35
        13: aload_0
        14: aload_1
        15: aload_1
        16: invokevirtual #134                // Method ext/mods/gameserver/model/actor/Player.isFlying:()Z
        19: ifeq          27
        22: ldc           #111                // String 4
        24: goto          29
        27: ldc           #137                // String 0
        29: invokevirtual #36                 // Method sendHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
        32: goto          59
        35: aload_2
        36: getstatic     #139                // Field ext/mods/gameserver/enums/actors/NpcTalkCond.CLAN_MEMBER:Lext/mods/gameserver/enums/actors/NpcTalkCond;
        39: if_acmpne     52
        42: aload_0
        43: aload_1
        44: ldc           #34                 // String 2
        46: invokevirtual #36                 // Method sendHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
        49: goto          59
        52: aload_0
        53: aload_1
        54: ldc           #142                // String 0a
        56: invokevirtual #36                 // Method sendHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
        59: return
      LineNumberTable:
        line 112: 0
        line 113: 6
        line 114: 13
        line 115: 35
        line 116: 42
        line 118: 52
        line 119: 59
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      60     0  this   Lext/mods/gameserver/model/actor/instance/WyvernManagerNpc;
            0      60     1 player   Lext/mods/gameserver/model/actor/Player;
            6      54     2 condition   Lext/mods/gameserver/enums/actors/NpcTalkCond;
      StackMapTable: number_of_entries = 5
        frame_type = 255 /* full_frame */
          offset_delta = 27
          locals = [ class ext/mods/gameserver/model/actor/instance/WyvernManagerNpc, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/enums/actors/NpcTalkCond ]
          stack = [ class ext/mods/gameserver/model/actor/instance/WyvernManagerNpc, class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/model/actor/instance/WyvernManagerNpc, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/enums/actors/NpcTalkCond ]
          stack = [ class ext/mods/gameserver/model/actor/instance/WyvernManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String ]
        frame_type = 5 /* same */
        frame_type = 16 /* same */
        frame_type = 6 /* same */

  protected ext.mods.gameserver.enums.actors.NpcTalkCond getNpcTalkCond(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/enums/actors/NpcTalkCond;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: invokevirtual #144                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
         4: ifnull        66
         7: aload_0
         8: invokevirtual #148                // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
        11: ifnull        28
        14: aload_0
        15: invokevirtual #148                // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
        18: invokevirtual #152                // Method ext/mods/gameserver/model/residence/castle/Castle.getOwnerId:()I
        21: aload_1
        22: invokevirtual #157                // Method ext/mods/gameserver/model/actor/Player.getClanId:()I
        25: if_icmpeq     49
        28: aload_0
        29: invokevirtual #160                // Method getSiegableHall:()Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
        32: ifnull        66
        35: aload_0
        36: invokevirtual #160                // Method getSiegableHall:()Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
        39: invokevirtual #164                // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.getOwnerId:()I
        42: aload_1
        43: invokevirtual #157                // Method ext/mods/gameserver/model/actor/Player.getClanId:()I
        46: if_icmpne     66
        49: aload_1
        50: invokevirtual #167                // Method ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
        53: ifeq          62
        56: getstatic     #128                // Field ext/mods/gameserver/enums/actors/NpcTalkCond.OWNER:Lext/mods/gameserver/enums/actors/NpcTalkCond;
        59: goto          65
        62: getstatic     #139                // Field ext/mods/gameserver/enums/actors/NpcTalkCond.CLAN_MEMBER:Lext/mods/gameserver/enums/actors/NpcTalkCond;
        65: areturn
        66: getstatic     #170                // Field ext/mods/gameserver/enums/actors/NpcTalkCond.NONE:Lext/mods/gameserver/enums/actors/NpcTalkCond;
        69: areturn
      LineNumberTable:
        line 124: 0
        line 125: 49
        line 127: 66
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      70     0  this   Lext/mods/gameserver/model/actor/instance/WyvernManagerNpc;
            0      70     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 5
        frame_type = 28 /* same */
        frame_type = 20 /* same */
        frame_type = 12 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/enums/actors/NpcTalkCond ]
        frame_type = 0 /* same */
}
SourceFile: "WyvernManagerNpc.java"
BootstrapMethods:
  0: #242 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #240 html/wyvernmanager/wyvernmanager-\u0001.htm
InnerClasses:
  public static final #253= #249 of #251; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
