// Bytecode for: ext.mods.gameserver.model.actor.instance.MercenaryManagerNpc
// File: ext\mods\gameserver\model\actor\instance\MercenaryManagerNpc.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/MercenaryManagerNpc.class
  Last modified 9 de jul de 2026; size 5946 bytes
  MD5 checksum ffa1ae99c8804b03f5afaa010cdd429c
  Compiled from "MercenaryManagerNpc.java"
public final class ext.mods.gameserver.model.actor.instance.MercenaryManagerNpc extends ext.mods.gameserver.model.actor.instance.Folk
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/instance/MercenaryManagerNpc
  super_class: #2                         // ext/mods/gameserver/model/actor/instance/Folk
  interfaces: 0, fields: 0, methods: 4, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/instance/Folk."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/instance/Folk
    #3 = NameAndType        #5:#6         // "<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/instance/Folk
    #5 = Utf8               <init>
    #6 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/model/actor/instance/MercenaryManagerNpc.getNpcTalkCond:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/enums/actors/NpcTalkCond;
    #8 = Class              #10           // ext/mods/gameserver/model/actor/instance/MercenaryManagerNpc
    #9 = NameAndType        #11:#12       // getNpcTalkCond:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/enums/actors/NpcTalkCond;
   #10 = Utf8               ext/mods/gameserver/model/actor/instance/MercenaryManagerNpc
   #11 = Utf8               getNpcTalkCond
   #12 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/enums/actors/NpcTalkCond;
   #13 = Fieldref           #14.#15       // ext/mods/gameserver/enums/actors/NpcTalkCond.OWNER:Lext/mods/gameserver/enums/actors/NpcTalkCond;
   #14 = Class              #16           // ext/mods/gameserver/enums/actors/NpcTalkCond
   #15 = NameAndType        #17:#18       // OWNER:Lext/mods/gameserver/enums/actors/NpcTalkCond;
   #16 = Utf8               ext/mods/gameserver/enums/actors/NpcTalkCond
   #17 = Utf8               OWNER
   #18 = Utf8               Lext/mods/gameserver/enums/actors/NpcTalkCond;
   #19 = String             #20           // back
   #20 = Utf8               back
   #21 = Methodref          #22.#23       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #22 = Class              #24           // java/lang/String
   #23 = NameAndType        #25:#26       // startsWith:(Ljava/lang/String;)Z
   #24 = Utf8               java/lang/String
   #25 = Utf8               startsWith
   #26 = Utf8               (Ljava/lang/String;)Z
   #27 = Methodref          #8.#28        // ext/mods/gameserver/model/actor/instance/MercenaryManagerNpc.showChatWindow:(Lext/mods/gameserver/model/actor/Player;)V
   #28 = NameAndType        #29:#30       // showChatWindow:(Lext/mods/gameserver/model/actor/Player;)V
   #29 = Utf8               showChatWindow
   #30 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #31 = String             #32           // how_to
   #32 = Utf8               how_to
   #33 = Class              #34           // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #34 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #35 = Methodref          #8.#36        // ext/mods/gameserver/model/actor/instance/MercenaryManagerNpc.getObjectId:()I
   #36 = NameAndType        #37:#38       // getObjectId:()I
   #37 = Utf8               getObjectId
   #38 = Utf8               ()I
   #39 = Methodref          #33.#40       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
   #40 = NameAndType        #5:#41        // "<init>":(I)V
   #41 = Utf8               (I)V
   #42 = Methodref          #43.#44       // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
   #43 = Class              #45           // ext/mods/gameserver/model/actor/Player
   #44 = NameAndType        #46:#47       // getLocale:()Ljava/util/Locale;
   #45 = Utf8               ext/mods/gameserver/model/actor/Player
   #46 = Utf8               getLocale
   #47 = Utf8               ()Ljava/util/Locale;
   #48 = String             #49           // html/mercmanager/mseller005.htm
   #49 = Utf8               html/mercmanager/mseller005.htm
   #50 = Methodref          #33.#51       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
   #51 = NameAndType        #52:#53       // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
   #52 = Utf8               setFile
   #53 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
   #54 = String             #55           // %objectId%
   #55 = Utf8               %objectId%
   #56 = Methodref          #33.#57       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
   #57 = NameAndType        #58:#59       // replace:(Ljava/lang/String;I)V
   #58 = Utf8               replace
   #59 = Utf8               (Ljava/lang/String;I)V
   #60 = Methodref          #43.#61       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #61 = NameAndType        #62:#63       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #62 = Utf8               sendPacket
   #63 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #64 = String             #65           // hire
   #65 = Utf8               hire
   #66 = Methodref          #67.#68       // ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
   #67 = Class              #69           // ext/mods/gameserver/data/manager/SevenSignsManager
   #68 = NameAndType        #70:#71       // getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
   #69 = Utf8               ext/mods/gameserver/data/manager/SevenSignsManager
   #70 = Utf8               getInstance
   #71 = Utf8               ()Lext/mods/gameserver/data/manager/SevenSignsManager;
   #72 = Methodref          #67.#73       // ext/mods/gameserver/data/manager/SevenSignsManager.isSealValidationPeriod:()Z
   #73 = NameAndType        #74:#75       // isSealValidationPeriod:()Z
   #74 = Utf8               isSealValidationPeriod
   #75 = Utf8               ()Z
   #76 = String             #77           // html/mercmanager/msellerdenial.htm
   #77 = Utf8               html/mercmanager/msellerdenial.htm
   #78 = Class              #79           // java/util/StringTokenizer
   #79 = Utf8               java/util/StringTokenizer
   #80 = String             #81           //
   #81 = Utf8
   #82 = Methodref          #78.#83       // java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #83 = NameAndType        #5:#84        // "<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #84 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #85 = Methodref          #78.#86       // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
   #86 = NameAndType        #87:#88       // nextToken:()Ljava/lang/String;
   #87 = Utf8               nextToken
   #88 = Utf8               ()Ljava/lang/String;
   #89 = Methodref          #90.#91       // ext/mods/gameserver/data/manager/BuyListManager.getInstance:()Lext/mods/gameserver/data/manager/BuyListManager;
   #90 = Class              #92           // ext/mods/gameserver/data/manager/BuyListManager
   #91 = NameAndType        #70:#93       // getInstance:()Lext/mods/gameserver/data/manager/BuyListManager;
   #92 = Utf8               ext/mods/gameserver/data/manager/BuyListManager
   #93 = Utf8               ()Lext/mods/gameserver/data/manager/BuyListManager;
   #94 = Methodref          #8.#95        // ext/mods/gameserver/model/actor/instance/MercenaryManagerNpc.getNpcId:()I
   #95 = NameAndType        #96:#38       // getNpcId:()I
   #96 = Utf8               getNpcId
   #97 = InvokeDynamic      #0:#98        // #0:makeConcatWithConstants:(ILjava/lang/String;)Ljava/lang/String;
   #98 = NameAndType        #99:#100      // makeConcatWithConstants:(ILjava/lang/String;)Ljava/lang/String;
   #99 = Utf8               makeConcatWithConstants
  #100 = Utf8               (ILjava/lang/String;)Ljava/lang/String;
  #101 = Methodref          #102.#103     // java/lang/Integer.parseInt:(Ljava/lang/String;)I
  #102 = Class              #104          // java/lang/Integer
  #103 = NameAndType        #105:#106     // parseInt:(Ljava/lang/String;)I
  #104 = Utf8               java/lang/Integer
  #105 = Utf8               parseInt
  #106 = Utf8               (Ljava/lang/String;)I
  #107 = Methodref          #90.#108      // ext/mods/gameserver/data/manager/BuyListManager.getBuyList:(I)Lext/mods/gameserver/model/buylist/NpcBuyList;
  #108 = NameAndType        #109:#110     // getBuyList:(I)Lext/mods/gameserver/model/buylist/NpcBuyList;
  #109 = Utf8               getBuyList
  #110 = Utf8               (I)Lext/mods/gameserver/model/buylist/NpcBuyList;
  #111 = Methodref          #112.#113     // ext/mods/gameserver/model/buylist/NpcBuyList.isNpcAllowed:(I)Z
  #112 = Class              #114          // ext/mods/gameserver/model/buylist/NpcBuyList
  #113 = NameAndType        #115:#116     // isNpcAllowed:(I)Z
  #114 = Utf8               ext/mods/gameserver/model/buylist/NpcBuyList
  #115 = Utf8               isNpcAllowed
  #116 = Utf8               (I)Z
  #117 = Methodref          #43.#118      // ext/mods/gameserver/model/actor/Player.tempInventoryDisable:()V
  #118 = NameAndType        #119:#120     // tempInventoryDisable:()V
  #119 = Utf8               tempInventoryDisable
  #120 = Utf8               ()V
  #121 = Class              #122          // ext/mods/gameserver/network/serverpackets/BuyList
  #122 = Utf8               ext/mods/gameserver/network/serverpackets/BuyList
  #123 = Methodref          #43.#124      // ext/mods/gameserver/model/actor/Player.getAdena:()I
  #124 = NameAndType        #125:#38      // getAdena:()I
  #125 = Utf8               getAdena
  #126 = Methodref          #121.#127     // ext/mods/gameserver/network/serverpackets/BuyList."<init>":(Lext/mods/gameserver/model/buylist/NpcBuyList;ID)V
  #127 = NameAndType        #5:#128       // "<init>":(Lext/mods/gameserver/model/buylist/NpcBuyList;ID)V
  #128 = Utf8               (Lext/mods/gameserver/model/buylist/NpcBuyList;ID)V
  #129 = String             #130          // html/mercmanager/mseller004.htm
  #130 = Utf8               html/mercmanager/mseller004.htm
  #131 = String             #132          // merc_limit
  #132 = Utf8               merc_limit
  #133 = Methodref          #8.#134       // ext/mods/gameserver/model/actor/instance/MercenaryManagerNpc.getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
  #134 = NameAndType        #135:#136     // getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
  #135 = Utf8               getCastle
  #136 = Utf8               ()Lext/mods/gameserver/model/residence/castle/Castle;
  #137 = Methodref          #138.#139     // ext/mods/gameserver/model/residence/castle/Castle.getId:()I
  #138 = Class              #140          // ext/mods/gameserver/model/residence/castle/Castle
  #139 = NameAndType        #141:#38      // getId:()I
  #140 = Utf8               ext/mods/gameserver/model/residence/castle/Castle
  #141 = Utf8               getId
  #142 = String             #143          // aden_msellerLimit.htm
  #143 = Utf8               aden_msellerLimit.htm
  #144 = String             #145          // msellerLimit.htm
  #145 = Utf8               msellerLimit.htm
  #146 = InvokeDynamic      #1:#147       // #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #147 = NameAndType        #99:#148      // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #148 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #149 = String             #150          // %castleName%
  #150 = Utf8               %castleName%
  #151 = Methodref          #138.#152     // ext/mods/gameserver/model/residence/castle/Castle.getName:()Ljava/lang/String;
  #152 = NameAndType        #153:#88      // getName:()Ljava/lang/String;
  #153 = Utf8               getName
  #154 = Methodref          #33.#155      // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
  #155 = NameAndType        #58:#84       // replace:(Ljava/lang/String;Ljava/lang/String;)V
  #156 = Methodref          #2.#157       // ext/mods/gameserver/model/actor/instance/Folk.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #157 = NameAndType        #158:#159     // onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #158 = Utf8               onBypassFeedback
  #159 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #160 = Fieldref           #161.#162     // ext/mods/gameserver/model/actor/instance/MercenaryManagerNpc$1.$SwitchMap$ext$mods$gameserver$enums$actors$NpcTalkCond:[I
  #161 = Class              #163          // ext/mods/gameserver/model/actor/instance/MercenaryManagerNpc$1
  #162 = NameAndType        #164:#165     // $SwitchMap$ext$mods$gameserver$enums$actors$NpcTalkCond:[I
  #163 = Utf8               ext/mods/gameserver/model/actor/instance/MercenaryManagerNpc$1
  #164 = Utf8               $SwitchMap$ext$mods$gameserver$enums$actors$NpcTalkCond
  #165 = Utf8               [I
  #166 = Methodref          #14.#167      // ext/mods/gameserver/enums/actors/NpcTalkCond.ordinal:()I
  #167 = NameAndType        #168:#38      // ordinal:()I
  #168 = Utf8               ordinal
  #169 = String             #170          // html/mercmanager/mseller002.htm
  #170 = Utf8               html/mercmanager/mseller002.htm
  #171 = String             #172          // html/mercmanager/mseller003.htm
  #172 = Utf8               html/mercmanager/mseller003.htm
  #173 = Fieldref           #161.#174     // ext/mods/gameserver/model/actor/instance/MercenaryManagerNpc$1.$SwitchMap$ext$mods$gameserver$enums$CabalType:[I
  #174 = NameAndType        #175:#165     // $SwitchMap$ext$mods$gameserver$enums$CabalType:[I
  #175 = Utf8               $SwitchMap$ext$mods$gameserver$enums$CabalType
  #176 = Fieldref           #177.#178     // ext/mods/gameserver/enums/SealType.STRIFE:Lext/mods/gameserver/enums/SealType;
  #177 = Class              #179          // ext/mods/gameserver/enums/SealType
  #178 = NameAndType        #180:#181     // STRIFE:Lext/mods/gameserver/enums/SealType;
  #179 = Utf8               ext/mods/gameserver/enums/SealType
  #180 = Utf8               STRIFE
  #181 = Utf8               Lext/mods/gameserver/enums/SealType;
  #182 = Methodref          #67.#183      // ext/mods/gameserver/data/manager/SevenSignsManager.getSealOwner:(Lext/mods/gameserver/enums/SealType;)Lext/mods/gameserver/enums/CabalType;
  #183 = NameAndType        #184:#185     // getSealOwner:(Lext/mods/gameserver/enums/SealType;)Lext/mods/gameserver/enums/CabalType;
  #184 = Utf8               getSealOwner
  #185 = Utf8               (Lext/mods/gameserver/enums/SealType;)Lext/mods/gameserver/enums/CabalType;
  #186 = Methodref          #187.#167     // ext/mods/gameserver/enums/CabalType.ordinal:()I
  #187 = Class              #188          // ext/mods/gameserver/enums/CabalType
  #188 = Utf8               ext/mods/gameserver/enums/CabalType
  #189 = String             #190          // html/mercmanager/mseller001_dawn.htm
  #190 = Utf8               html/mercmanager/mseller001_dawn.htm
  #191 = String             #192          // html/mercmanager/mseller001_dusk.htm
  #192 = Utf8               html/mercmanager/mseller001_dusk.htm
  #193 = String             #194          // html/mercmanager/mseller001.htm
  #194 = Utf8               html/mercmanager/mseller001.htm
  #195 = Methodref          #43.#196      // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #196 = NameAndType        #197:#198     // getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #197 = Utf8               getClan
  #198 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
  #199 = Methodref          #138.#200     // ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
  #200 = NameAndType        #201:#202     // getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
  #201 = Utf8               getSiege
  #202 = Utf8               ()Lext/mods/gameserver/model/residence/castle/Siege;
  #203 = Methodref          #204.#205     // ext/mods/gameserver/model/residence/castle/Siege.isInProgress:()Z
  #204 = Class              #206          // ext/mods/gameserver/model/residence/castle/Siege
  #205 = NameAndType        #207:#75      // isInProgress:()Z
  #206 = Utf8               ext/mods/gameserver/model/residence/castle/Siege
  #207 = Utf8               isInProgress
  #208 = Fieldref           #14.#209      // ext/mods/gameserver/enums/actors/NpcTalkCond.UNDER_SIEGE:Lext/mods/gameserver/enums/actors/NpcTalkCond;
  #209 = NameAndType        #210:#18      // UNDER_SIEGE:Lext/mods/gameserver/enums/actors/NpcTalkCond;
  #210 = Utf8               UNDER_SIEGE
  #211 = Methodref          #138.#212     // ext/mods/gameserver/model/residence/castle/Castle.getOwnerId:()I
  #212 = NameAndType        #213:#38      // getOwnerId:()I
  #213 = Utf8               getOwnerId
  #214 = Methodref          #43.#215      // ext/mods/gameserver/model/actor/Player.getClanId:()I
  #215 = NameAndType        #216:#38      // getClanId:()I
  #216 = Utf8               getClanId
  #217 = Fieldref           #218.#219     // ext/mods/gameserver/enums/PrivilegeType.CP_MERCENARIES:Lext/mods/gameserver/enums/PrivilegeType;
  #218 = Class              #220          // ext/mods/gameserver/enums/PrivilegeType
  #219 = NameAndType        #221:#222     // CP_MERCENARIES:Lext/mods/gameserver/enums/PrivilegeType;
  #220 = Utf8               ext/mods/gameserver/enums/PrivilegeType
  #221 = Utf8               CP_MERCENARIES
  #222 = Utf8               Lext/mods/gameserver/enums/PrivilegeType;
  #223 = Methodref          #43.#224      // ext/mods/gameserver/model/actor/Player.hasClanPrivileges:(Lext/mods/gameserver/enums/PrivilegeType;)Z
  #224 = NameAndType        #225:#226     // hasClanPrivileges:(Lext/mods/gameserver/enums/PrivilegeType;)Z
  #225 = Utf8               hasClanPrivileges
  #226 = Utf8               (Lext/mods/gameserver/enums/PrivilegeType;)Z
  #227 = Fieldref           #14.#228      // ext/mods/gameserver/enums/actors/NpcTalkCond.NONE:Lext/mods/gameserver/enums/actors/NpcTalkCond;
  #228 = NameAndType        #229:#18      // NONE:Lext/mods/gameserver/enums/actors/NpcTalkCond;
  #229 = Utf8               NONE
  #230 = Utf8               Code
  #231 = Utf8               LineNumberTable
  #232 = Utf8               LocalVariableTable
  #233 = Utf8               this
  #234 = Utf8               Lext/mods/gameserver/model/actor/instance/MercenaryManagerNpc;
  #235 = Utf8               objectId
  #236 = Utf8               I
  #237 = Utf8               template
  #238 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #239 = Utf8               html
  #240 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #241 = Utf8               st
  #242 = Utf8               Ljava/util/StringTokenizer;
  #243 = Utf8               buyList
  #244 = Utf8               Lext/mods/gameserver/model/buylist/NpcBuyList;
  #245 = Utf8               player
  #246 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #247 = Utf8               command
  #248 = Utf8               Ljava/lang/String;
  #249 = Utf8               condition
  #250 = Utf8               StackMapTable
  #251 = Class              #252          // java/util/Locale
  #252 = Utf8               java/util/Locale
  #253 = Utf8               SourceFile
  #254 = Utf8               MercenaryManagerNpc.java
  #255 = Utf8               NestMembers
  #256 = Utf8               BootstrapMethods
  #257 = String             #258          // \u0001\u0001
  #258 = Utf8               \u0001\u0001
  #259 = String             #260          // html/mercmanager/\u0001
  #260 = Utf8               html/mercmanager/\u0001
  #261 = MethodHandle       6:#262        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #262 = Methodref          #263.#264     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #263 = Class              #265          // java/lang/invoke/StringConcatFactory
  #264 = NameAndType        #99:#266      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #265 = Utf8               java/lang/invoke/StringConcatFactory
  #266 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #267 = Utf8               InnerClasses
  #268 = Class              #269          // java/lang/invoke/MethodHandles$Lookup
  #269 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #270 = Class              #271          // java/lang/invoke/MethodHandles
  #271 = Utf8               java/lang/invoke/MethodHandles
  #272 = Utf8               Lookup
{
  public ext.mods.gameserver.model.actor.instance.MercenaryManagerNpc(int, ext.mods.gameserver.model.actor.template.NpcTemplate);
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
            0       7     0  this   Lext/mods/gameserver/model/actor/instance/MercenaryManagerNpc;
            0       7     1 objectId   I
            0       7     2 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public void onBypassFeedback(ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=7, args_size=3
         0: aload_0
         1: aload_1
         2: invokevirtual #7                  // Method getNpcTalkCond:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/enums/actors/NpcTalkCond;
         5: astore_3
         6: aload_3
         7: getstatic     #13                 // Field ext/mods/gameserver/enums/actors/NpcTalkCond.OWNER:Lext/mods/gameserver/enums/actors/NpcTalkCond;
        10: if_acmpeq     14
        13: return
        14: aload_2
        15: ldc           #19                 // String back
        17: invokevirtual #21                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        20: ifeq          31
        23: aload_0
        24: aload_1
        25: invokevirtual #27                 // Method showChatWindow:(Lext/mods/gameserver/model/actor/Player;)V
        28: goto          354
        31: aload_2
        32: ldc           #31                 // String how_to
        34: invokevirtual #21                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        37: ifeq          84
        40: new           #33                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
        43: dup
        44: aload_0
        45: invokevirtual #35                 // Method getObjectId:()I
        48: invokespecial #39                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
        51: astore        4
        53: aload         4
        55: aload_1
        56: invokevirtual #42                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        59: ldc           #48                 // String html/mercmanager/mseller005.htm
        61: invokevirtual #50                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        64: aload         4
        66: ldc           #54                 // String %objectId%
        68: aload_0
        69: invokevirtual #35                 // Method getObjectId:()I
        72: invokevirtual #56                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
        75: aload_1
        76: aload         4
        78: invokevirtual #60                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        81: goto          354
        84: aload_2
        85: ldc           #64                 // String hire
        87: invokevirtual #21                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        90: ifeq          260
        93: invokestatic  #66                 // Method ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
        96: invokevirtual #72                 // Method ext/mods/gameserver/data/manager/SevenSignsManager.isSealValidationPeriod:()Z
        99: ifne          144
       102: new           #33                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       105: dup
       106: aload_0
       107: invokevirtual #35                 // Method getObjectId:()I
       110: invokespecial #39                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       113: astore        4
       115: aload         4
       117: aload_1
       118: invokevirtual #42                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       121: ldc           #76                 // String html/mercmanager/msellerdenial.htm
       123: invokevirtual #50                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       126: aload         4
       128: ldc           #54                 // String %objectId%
       130: aload_0
       131: invokevirtual #35                 // Method getObjectId:()I
       134: invokevirtual #56                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       137: aload_1
       138: aload         4
       140: invokevirtual #60                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       143: return
       144: new           #78                 // class java/util/StringTokenizer
       147: dup
       148: aload_2
       149: ldc           #80                 // String
       151: invokespecial #82                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
       154: astore        4
       156: aload         4
       158: invokevirtual #85                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       161: pop
       162: invokestatic  #89                 // Method ext/mods/gameserver/data/manager/BuyListManager.getInstance:()Lext/mods/gameserver/data/manager/BuyListManager;
       165: aload_0
       166: invokevirtual #94                 // Method getNpcId:()I
       169: aload         4
       171: invokevirtual #85                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       174: invokedynamic #97,  0             // InvokeDynamic #0:makeConcatWithConstants:(ILjava/lang/String;)Ljava/lang/String;
       179: invokestatic  #101                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       182: invokevirtual #107                // Method ext/mods/gameserver/data/manager/BuyListManager.getBuyList:(I)Lext/mods/gameserver/model/buylist/NpcBuyList;
       185: astore        5
       187: aload         5
       189: ifnull        204
       192: aload         5
       194: aload_0
       195: invokevirtual #94                 // Method getNpcId:()I
       198: invokevirtual #111                // Method ext/mods/gameserver/model/buylist/NpcBuyList.isNpcAllowed:(I)Z
       201: ifne          205
       204: return
       205: aload_1
       206: invokevirtual #117                // Method ext/mods/gameserver/model/actor/Player.tempInventoryDisable:()V
       209: aload_1
       210: new           #121                // class ext/mods/gameserver/network/serverpackets/BuyList
       213: dup
       214: aload         5
       216: aload_1
       217: invokevirtual #123                // Method ext/mods/gameserver/model/actor/Player.getAdena:()I
       220: dconst_0
       221: invokespecial #126                // Method ext/mods/gameserver/network/serverpackets/BuyList."<init>":(Lext/mods/gameserver/model/buylist/NpcBuyList;ID)V
       224: invokevirtual #60                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       227: new           #33                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       230: dup
       231: aload_0
       232: invokevirtual #35                 // Method getObjectId:()I
       235: invokespecial #39                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       238: astore        6
       240: aload         6
       242: aload_1
       243: invokevirtual #42                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       246: ldc           #129                // String html/mercmanager/mseller004.htm
       248: invokevirtual #50                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       251: aload_1
       252: aload         6
       254: invokevirtual #60                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       257: goto          354
       260: aload_2
       261: ldc           #131                // String merc_limit
       263: invokevirtual #21                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       266: ifeq          348
       269: new           #33                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       272: dup
       273: aload_0
       274: invokevirtual #35                 // Method getObjectId:()I
       277: invokespecial #39                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       280: astore        4
       282: aload         4
       284: aload_1
       285: invokevirtual #42                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       288: aload_0
       289: invokevirtual #133                // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
       292: invokevirtual #137                // Method ext/mods/gameserver/model/residence/castle/Castle.getId:()I
       295: iconst_5
       296: if_icmpne     304
       299: ldc           #142                // String aden_msellerLimit.htm
       301: goto          306
       304: ldc           #144                // String msellerLimit.htm
       306: invokedynamic #146,  0            // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       311: invokevirtual #50                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       314: aload         4
       316: ldc           #149                // String %castleName%
       318: aload_0
       319: invokevirtual #133                // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
       322: invokevirtual #151                // Method ext/mods/gameserver/model/residence/castle/Castle.getName:()Ljava/lang/String;
       325: invokevirtual #154                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       328: aload         4
       330: ldc           #54                 // String %objectId%
       332: aload_0
       333: invokevirtual #35                 // Method getObjectId:()I
       336: invokevirtual #56                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       339: aload_1
       340: aload         4
       342: invokevirtual #60                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       345: goto          354
       348: aload_0
       349: aload_1
       350: aload_2
       351: invokespecial #156                // Method ext/mods/gameserver/model/actor/instance/Folk.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       354: return
      LineNumberTable:
        line 43: 0
        line 44: 6
        line 45: 13
        line 47: 14
        line 48: 23
        line 49: 31
        line 51: 40
        line 52: 53
        line 53: 64
        line 54: 75
        line 55: 81
        line 56: 84
        line 58: 93
        line 60: 102
        line 61: 115
        line 62: 126
        line 63: 137
        line 64: 143
        line 67: 144
        line 68: 156
        line 70: 162
        line 71: 187
        line 72: 204
        line 74: 205
        line 75: 209
        line 77: 227
        line 78: 240
        line 79: 251
        line 80: 257
        line 81: 260
        line 83: 269
        line 84: 282
        line 85: 314
        line 86: 328
        line 87: 339
        line 88: 345
        line 90: 348
        line 91: 354
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           53      28     4  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
          115      29     4  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
          156     101     4    st   Ljava/util/StringTokenizer;
          187      70     5 buyList   Lext/mods/gameserver/model/buylist/NpcBuyList;
          240      17     6  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
          282      63     4  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
            0     355     0  this   Lext/mods/gameserver/model/actor/instance/MercenaryManagerNpc;
            0     355     1 player   Lext/mods/gameserver/model/actor/Player;
            0     355     2 command   Ljava/lang/String;
            6     349     3 condition   Lext/mods/gameserver/enums/actors/NpcTalkCond;
      StackMapTable: number_of_entries = 11
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/enums/actors/NpcTalkCond ]
        frame_type = 16 /* same */
        frame_type = 52 /* same */
        frame_type = 59 /* same */
        frame_type = 253 /* append */
          offset_delta = 59
          locals = [ class java/util/StringTokenizer, class ext/mods/gameserver/model/buylist/NpcBuyList ]
        frame_type = 0 /* same */
        frame_type = 249 /* chop */
          offset_delta = 54
        frame_type = 255 /* full_frame */
          offset_delta = 43
          locals = [ class ext/mods/gameserver/model/actor/instance/MercenaryManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/util/Locale ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/model/actor/instance/MercenaryManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/util/Locale, class java/lang/String ]
        frame_type = 250 /* chop */
          offset_delta = 41
        frame_type = 5 /* same */

  public void showChatWindow(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=2
         0: new           #33                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
         3: dup
         4: aload_0
         5: invokevirtual #35                 // Method getObjectId:()I
         8: invokespecial #39                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
        11: astore_2
        12: getstatic     #160                // Field ext/mods/gameserver/model/actor/instance/MercenaryManagerNpc$1.$SwitchMap$ext$mods$gameserver$enums$actors$NpcTalkCond:[I
        15: aload_0
        16: aload_1
        17: invokevirtual #7                  // Method getNpcTalkCond:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/enums/actors/NpcTalkCond;
        20: invokevirtual #166                // Method ext/mods/gameserver/enums/actors/NpcTalkCond.ordinal:()I
        23: iaload
        24: lookupswitch  { // 2

                       1: 52

                       2: 65
                 default: 78
            }
        52: aload_2
        53: aload_1
        54: invokevirtual #42                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        57: ldc           #169                // String html/mercmanager/mseller002.htm
        59: invokevirtual #50                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        62: goto          156
        65: aload_2
        66: aload_1
        67: invokevirtual #42                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        70: ldc           #171                // String html/mercmanager/mseller003.htm
        72: invokevirtual #50                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        75: goto          156
        78: getstatic     #173                // Field ext/mods/gameserver/model/actor/instance/MercenaryManagerNpc$1.$SwitchMap$ext$mods$gameserver$enums$CabalType:[I
        81: invokestatic  #66                 // Method ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
        84: getstatic     #176                // Field ext/mods/gameserver/enums/SealType.STRIFE:Lext/mods/gameserver/enums/SealType;
        87: invokevirtual #182                // Method ext/mods/gameserver/data/manager/SevenSignsManager.getSealOwner:(Lext/mods/gameserver/enums/SealType;)Lext/mods/gameserver/enums/CabalType;
        90: invokevirtual #186                // Method ext/mods/gameserver/enums/CabalType.ordinal:()I
        93: iaload
        94: lookupswitch  { // 2

                       1: 120

                       2: 133
                 default: 146
            }
       120: aload_2
       121: aload_1
       122: invokevirtual #42                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       125: ldc           #189                // String html/mercmanager/mseller001_dawn.htm
       127: invokevirtual #50                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       130: goto          156
       133: aload_2
       134: aload_1
       135: invokevirtual #42                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       138: ldc           #191                // String html/mercmanager/mseller001_dusk.htm
       140: invokevirtual #50                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       143: goto          156
       146: aload_2
       147: aload_1
       148: invokevirtual #42                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       151: ldc           #193                // String html/mercmanager/mseller001.htm
       153: invokevirtual #50                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       156: aload_2
       157: ldc           #54                 // String %objectId%
       159: aload_0
       160: invokevirtual #35                 // Method getObjectId:()I
       163: invokevirtual #56                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       166: aload_1
       167: aload_2
       168: invokevirtual #60                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       171: return
      LineNumberTable:
        line 96: 0
        line 98: 12
        line 101: 52
        line 102: 62
        line 105: 65
        line 106: 75
        line 109: 78
        line 112: 120
        line 113: 130
        line 116: 133
        line 117: 143
        line 120: 146
        line 126: 156
        line 127: 166
        line 128: 171
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     172     0  this   Lext/mods/gameserver/model/actor/instance/MercenaryManagerNpc;
            0     172     1 player   Lext/mods/gameserver/model/actor/Player;
           12     160     2  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
      StackMapTable: number_of_entries = 7
        frame_type = 252 /* append */
          offset_delta = 52
          locals = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
        frame_type = 12 /* same */
        frame_type = 12 /* same */
        frame_type = 41 /* same */
        frame_type = 12 /* same */
        frame_type = 12 /* same */
        frame_type = 9 /* same */

  protected ext.mods.gameserver.enums.actors.NpcTalkCond getNpcTalkCond(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/enums/actors/NpcTalkCond;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #133                // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
         4: ifnull        59
         7: aload_1
         8: invokevirtual #195                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        11: ifnull        59
        14: aload_0
        15: invokevirtual #133                // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
        18: invokevirtual #199                // Method ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
        21: invokevirtual #203                // Method ext/mods/gameserver/model/residence/castle/Siege.isInProgress:()Z
        24: ifeq          31
        27: getstatic     #208                // Field ext/mods/gameserver/enums/actors/NpcTalkCond.UNDER_SIEGE:Lext/mods/gameserver/enums/actors/NpcTalkCond;
        30: areturn
        31: aload_0
        32: invokevirtual #133                // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
        35: invokevirtual #211                // Method ext/mods/gameserver/model/residence/castle/Castle.getOwnerId:()I
        38: aload_1
        39: invokevirtual #214                // Method ext/mods/gameserver/model/actor/Player.getClanId:()I
        42: if_icmpne     59
        45: aload_1
        46: getstatic     #217                // Field ext/mods/gameserver/enums/PrivilegeType.CP_MERCENARIES:Lext/mods/gameserver/enums/PrivilegeType;
        49: invokevirtual #223                // Method ext/mods/gameserver/model/actor/Player.hasClanPrivileges:(Lext/mods/gameserver/enums/PrivilegeType;)Z
        52: ifeq          59
        55: getstatic     #13                 // Field ext/mods/gameserver/enums/actors/NpcTalkCond.OWNER:Lext/mods/gameserver/enums/actors/NpcTalkCond;
        58: areturn
        59: getstatic     #227                // Field ext/mods/gameserver/enums/actors/NpcTalkCond.NONE:Lext/mods/gameserver/enums/actors/NpcTalkCond;
        62: areturn
      LineNumberTable:
        line 133: 0
        line 135: 14
        line 136: 27
        line 138: 31
        line 139: 55
        line 141: 59
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      63     0  this   Lext/mods/gameserver/model/actor/instance/MercenaryManagerNpc;
            0      63     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 2
        frame_type = 31 /* same */
        frame_type = 27 /* same */
}
SourceFile: "MercenaryManagerNpc.java"
NestMembers:
  ext/mods/gameserver/model/actor/instance/MercenaryManagerNpc$1
BootstrapMethods:
  0: #261 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #257 \u0001\u0001
  1: #261 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #259 html/mercmanager/\u0001
InnerClasses:
  static #161;                            // class ext/mods/gameserver/model/actor/instance/MercenaryManagerNpc$1
  public static final #272= #268 of #270; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
