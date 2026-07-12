// Bytecode for: ext.mods.gameserver.model.actor.instance.Service
// File: ext\mods\gameserver\model\actor\instance\Service.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/Service.class
  Last modified 9 de jul de 2026; size 6238 bytes
  MD5 checksum dbe5886ae8a7d693307646e9cb0e82ea
  Compiled from "Service.java"
public final class ext.mods.gameserver.model.actor.instance.Service extends ext.mods.gameserver.model.actor.instance.Merchant
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #31                         // ext/mods/gameserver/model/actor/instance/Service
  super_class: #2                         // ext/mods/gameserver/model/actor/instance/Merchant
  interfaces: 0, fields: 0, methods: 6, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/instance/Merchant."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/instance/Merchant
    #3 = NameAndType        #5:#6         // "<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/instance/Merchant
    #5 = Utf8               <init>
    #6 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #7 = InvokeDynamic      #0:#8         // #0:makeConcatWithConstants:(I)Ljava/lang/String;
    #8 = NameAndType        #9:#10        // makeConcatWithConstants:(I)Ljava/lang/String;
    #9 = Utf8               makeConcatWithConstants
   #10 = Utf8               (I)Ljava/lang/String;
   #11 = InvokeDynamic      #1:#12        // #1:makeConcatWithConstants:(II)Ljava/lang/String;
   #12 = NameAndType        #9:#13        // makeConcatWithConstants:(II)Ljava/lang/String;
   #13 = Utf8               (II)Ljava/lang/String;
   #14 = String             #15           // html/mods/donate/%s.htm
   #15 = Utf8               html/mods/donate/%s.htm
   #16 = Class              #17           // java/lang/Object
   #17 = Utf8               java/lang/Object
   #18 = Methodref          #19.#20       // java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
   #19 = Class              #21           // java/lang/String
   #20 = NameAndType        #22:#23       // format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
   #21 = Utf8               java/lang/String
   #22 = Utf8               format
   #23 = Utf8               (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
   #24 = Methodref          #25.#26       // ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
   #25 = Class              #27           // ext/mods/gameserver/data/HTMLData
   #26 = NameAndType        #28:#29       // getInstance:()Lext/mods/gameserver/data/HTMLData;
   #27 = Utf8               ext/mods/gameserver/data/HTMLData
   #28 = Utf8               getInstance
   #29 = Utf8               ()Lext/mods/gameserver/data/HTMLData;
   #30 = Methodref          #31.#32       // ext/mods/gameserver/model/actor/instance/Service.getNpcId:()I
   #31 = Class              #33           // ext/mods/gameserver/model/actor/instance/Service
   #32 = NameAndType        #34:#35       // getNpcId:()I
   #33 = Utf8               ext/mods/gameserver/model/actor/instance/Service
   #34 = Utf8               getNpcId
   #35 = Utf8               ()I
   #36 = InvokeDynamic      #2:#8         // #2:makeConcatWithConstants:(I)Ljava/lang/String;
   #37 = Methodref          #25.#38       // ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
   #38 = NameAndType        #39:#40       // getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
   #39 = Utf8               getHtm
   #40 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
   #41 = Class              #42           // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #42 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #43 = Methodref          #31.#44       // ext/mods/gameserver/model/actor/instance/Service.getObjectId:()I
   #44 = NameAndType        #45:#35       // getObjectId:()I
   #45 = Utf8               getObjectId
   #46 = Methodref          #41.#47       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
   #47 = NameAndType        #5:#48        // "<init>":(I)V
   #48 = Utf8               (I)V
   #49 = Methodref          #41.#50       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
   #50 = NameAndType        #51:#52       // setHtml:(Ljava/lang/String;)V
   #51 = Utf8               setHtml
   #52 = Utf8               (Ljava/lang/String;)V
   #53 = Methodref          #54.#55       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #54 = Class              #56           // ext/mods/gameserver/model/actor/Player
   #55 = NameAndType        #57:#58       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #56 = Utf8               ext/mods/gameserver/model/actor/Player
   #57 = Utf8               sendPacket
   #58 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #59 = Fieldref           #60.#61       // ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #60 = Class              #62           // ext/mods/gameserver/network/serverpackets/ActionFailed
   #61 = NameAndType        #63:#64       // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #62 = Utf8               ext/mods/gameserver/network/serverpackets/ActionFailed
   #63 = Utf8               STATIC_PACKET
   #64 = Utf8               Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #65 = Class              #66           // java/util/StringTokenizer
   #66 = Utf8               java/util/StringTokenizer
   #67 = String             #68           //
   #68 = Utf8
   #69 = Methodref          #65.#70       // java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #70 = NameAndType        #5:#71        // "<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #71 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #72 = Methodref          #65.#73       // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
   #73 = NameAndType        #74:#75       // nextToken:()Ljava/lang/String;
   #74 = Utf8               nextToken
   #75 = Utf8               ()Ljava/lang/String;
   #76 = Methodref          #19.#77       // java/lang/String.hashCode:()I
   #77 = NameAndType        #78:#35       // hashCode:()I
   #78 = Utf8               hashCode
   #79 = String             #80           // nobles
   #80 = Utf8               nobles
   #81 = Methodref          #19.#82       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #82 = NameAndType        #83:#84       // equals:(Ljava/lang/Object;)Z
   #83 = Utf8               equals
   #84 = Utf8               (Ljava/lang/Object;)Z
   #85 = String             #86           // hero
   #86 = Utf8               hero
   #87 = String             #88           // setnamecolor
   #88 = Utf8               setnamecolor
   #89 = String             #90           // settitlecolor
   #90 = Utf8               settitlecolor
   #91 = String             #92           // setname
   #92 = Utf8               setname
   #93 = String             #94           // premium
   #94 = Utf8               premium
   #95 = String             #96           // gender
   #96 = Utf8               gender
   #97 = String             #98           // nullpk
   #98 = Utf8               nullpk
   #99 = String             #100          // clanlvl
  #100 = Utf8               clanlvl
  #101 = String             #102          // clanskill
  #102 = Utf8               clanskill
  #103 = String             #104          // clanrep
  #104 = Utf8               clanrep
  #105 = String             #106          // multisell
  #106 = Utf8               multisell
  #107 = Methodref          #31.#108      // ext/mods/gameserver/model/actor/instance/Service.scanService:(Ljava/util/StringTokenizer;)Lext/mods/gameserver/custom/data/DonateData$Donate;
  #108 = NameAndType        #109:#110     // scanService:(Ljava/util/StringTokenizer;)Lext/mods/gameserver/custom/data/DonateData$Donate;
  #109 = Utf8               scanService
  #110 = Utf8               (Ljava/util/StringTokenizer;)Lext/mods/gameserver/custom/data/DonateData$Donate;
  #111 = Methodref          #31.#112      // ext/mods/gameserver/model/actor/instance/Service.checkService:(Lext/mods/gameserver/custom/data/DonateData$Donate;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
  #112 = NameAndType        #113:#114     // checkService:(Lext/mods/gameserver/custom/data/DonateData$Donate;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
  #113 = Utf8               checkService
  #114 = Utf8               (Lext/mods/gameserver/custom/data/DonateData$Donate;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
  #115 = Methodref          #116.#117     // ext/mods/gameserver/custom/data/DonateData.setNobless:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;)V
  #116 = Class              #118          // ext/mods/gameserver/custom/data/DonateData
  #117 = NameAndType        #119:#120     // setNobless:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;)V
  #118 = Utf8               ext/mods/gameserver/custom/data/DonateData
  #119 = Utf8               setNobless
  #120 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;)V
  #121 = Methodref          #116.#122     // ext/mods/gameserver/custom/data/DonateData.setHero:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;)V
  #122 = NameAndType        #123:#120     // setHero:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;)V
  #123 = Utf8               setHero
  #124 = Methodref          #65.#125      // java/util/StringTokenizer.hasMoreTokens:()Z
  #125 = NameAndType        #126:#127     // hasMoreTokens:()Z
  #126 = Utf8               hasMoreTokens
  #127 = Utf8               ()Z
  #128 = Methodref          #116.#129     // ext/mods/gameserver/custom/data/DonateData.setNameColor:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;Ljava/lang/String;)V
  #129 = NameAndType        #130:#131     // setNameColor:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;Ljava/lang/String;)V
  #130 = Utf8               setNameColor
  #131 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;Ljava/lang/String;)V
  #132 = Methodref          #116.#133     // ext/mods/gameserver/custom/data/DonateData.setTitleColor:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;Ljava/lang/String;)V
  #133 = NameAndType        #134:#131     // setTitleColor:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;Ljava/lang/String;)V
  #134 = Utf8               setTitleColor
  #135 = Methodref          #116.#136     // ext/mods/gameserver/custom/data/DonateData.setName:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;Ljava/lang/String;)V
  #136 = NameAndType        #137:#131     // setName:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;Ljava/lang/String;)V
  #137 = Utf8               setName
  #138 = Methodref          #116.#139     // ext/mods/gameserver/custom/data/DonateData.setPremium:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;)V
  #139 = NameAndType        #140:#120     // setPremium:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;)V
  #140 = Utf8               setPremium
  #141 = Methodref          #116.#142     // ext/mods/gameserver/custom/data/DonateData.setGender:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;)V
  #142 = NameAndType        #143:#120     // setGender:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;)V
  #143 = Utf8               setGender
  #144 = Methodref          #116.#145     // ext/mods/gameserver/custom/data/DonateData.clearPK:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;)V
  #145 = NameAndType        #146:#120     // clearPK:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;)V
  #146 = Utf8               clearPK
  #147 = Methodref          #116.#148     // ext/mods/gameserver/custom/data/DonateData.setClanLevel:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;)V
  #148 = NameAndType        #149:#120     // setClanLevel:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;)V
  #149 = Utf8               setClanLevel
  #150 = Methodref          #116.#151     // ext/mods/gameserver/custom/data/DonateData.addClanSkill:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;)V
  #151 = NameAndType        #152:#120     // addClanSkill:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;)V
  #152 = Utf8               addClanSkill
  #153 = Methodref          #116.#154     // ext/mods/gameserver/custom/data/DonateData.addClanRep:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;)V
  #154 = NameAndType        #155:#120     // addClanRep:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;)V
  #155 = Utf8               addClanRep
  #156 = Methodref          #157.#158     // ext/mods/gameserver/data/xml/MultisellData.getInstance:()Lext/mods/gameserver/data/xml/MultisellData;
  #157 = Class              #159          // ext/mods/gameserver/data/xml/MultisellData
  #158 = NameAndType        #28:#160      // getInstance:()Lext/mods/gameserver/data/xml/MultisellData;
  #159 = Utf8               ext/mods/gameserver/data/xml/MultisellData
  #160 = Utf8               ()Lext/mods/gameserver/data/xml/MultisellData;
  #161 = Methodref          #157.#162     // ext/mods/gameserver/data/xml/MultisellData.separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Z)V
  #162 = NameAndType        #163:#164     // separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Z)V
  #163 = Utf8               separateAndSend
  #164 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Z)V
  #165 = Methodref          #2.#166       // ext/mods/gameserver/model/actor/instance/Merchant.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #166 = NameAndType        #167:#168     // onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #167 = Utf8               onBypassFeedback
  #168 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #169 = Methodref          #116.#170     // ext/mods/gameserver/custom/data/DonateData.getInstance:()Lext/mods/gameserver/custom/data/DonateData;
  #170 = NameAndType        #28:#171      // getInstance:()Lext/mods/gameserver/custom/data/DonateData;
  #171 = Utf8               ()Lext/mods/gameserver/custom/data/DonateData;
  #172 = Methodref          #173.#174     // java/lang/Integer.parseInt:(Ljava/lang/String;)I
  #173 = Class              #175          // java/lang/Integer
  #174 = NameAndType        #176:#177     // parseInt:(Ljava/lang/String;)I
  #175 = Utf8               java/lang/Integer
  #176 = Utf8               parseInt
  #177 = Utf8               (Ljava/lang/String;)I
  #178 = Methodref          #116.#179     // ext/mods/gameserver/custom/data/DonateData.getDonate:(I)Lext/mods/gameserver/custom/data/DonateData$Donate;
  #179 = NameAndType        #180:#181     // getDonate:(I)Lext/mods/gameserver/custom/data/DonateData$Donate;
  #180 = Utf8               getDonate
  #181 = Utf8               (I)Lext/mods/gameserver/custom/data/DonateData$Donate;
  #182 = Fieldref           #31.#183      // ext/mods/gameserver/model/actor/instance/Service.LOGGER:Lext/mods/commons/logging/CLogger;
  #183 = NameAndType        #184:#185     // LOGGER:Lext/mods/commons/logging/CLogger;
  #184 = Utf8               LOGGER
  #185 = Utf8               Lext/mods/commons/logging/CLogger;
  #186 = String             #187          // pc[{}] use missing service[{}]
  #187 = Utf8               pc[{}] use missing service[{}]
  #188 = Methodref          #54.#189      // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
  #189 = NameAndType        #190:#75      // getName:()Ljava/lang/String;
  #190 = Utf8               getName
  #191 = Methodref          #192.#193     // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #192 = Class              #194          // ext/mods/commons/logging/CLogger
  #193 = NameAndType        #195:#196     // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #194 = Utf8               ext/mods/commons/logging/CLogger
  #195 = Utf8               info
  #196 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
  #197 = Utf8               Code
  #198 = Utf8               LineNumberTable
  #199 = Utf8               LocalVariableTable
  #200 = Utf8               this
  #201 = Utf8               Lext/mods/gameserver/model/actor/instance/Service;
  #202 = Utf8               objectId
  #203 = Utf8               I
  #204 = Utf8               template
  #205 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #206 = Utf8               getHtmlPath
  #207 = Utf8               (Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
  #208 = Utf8               player
  #209 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #210 = Utf8               npcId
  #211 = Utf8               val
  #212 = Utf8               htmlName
  #213 = Utf8               Ljava/lang/String;
  #214 = Utf8               StackMapTable
  #215 = Utf8               showPkDenyChatWindow
  #216 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
  #217 = Utf8               html
  #218 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #219 = Utf8               type
  #220 = Utf8               content
  #221 = Utf8               service
  #222 = Utf8               Lext/mods/gameserver/custom/data/DonateData$Donate;
  #223 = Utf8               command
  #224 = Utf8               st
  #225 = Utf8               Ljava/util/StringTokenizer;
  #226 = Utf8               actualCommand
  #227 = Class              #228          // ext/mods/gameserver/custom/data/DonateData$Donate
  #228 = Utf8               ext/mods/gameserver/custom/data/DonateData$Donate
  #229 = Utf8               donate
  #230 = Utf8               pc
  #231 = Utf8               SourceFile
  #232 = Utf8               Service.java
  #233 = Utf8               BootstrapMethods
  #234 = String             #235          // \u0001
  #235 = Utf8               \u0001
  #236 = String             #237          // \u0001-\u0001
  #237 = Utf8               \u0001-\u0001
  #238 = String             #239          // html/mods/donate/\u0001-pk.htm
  #239 = Utf8               html/mods/donate/\u0001-pk.htm
  #240 = MethodHandle       6:#241        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #241 = Methodref          #242.#243     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #242 = Class              #244          // java/lang/invoke/StringConcatFactory
  #243 = NameAndType        #9:#245       // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #244 = Utf8               java/lang/invoke/StringConcatFactory
  #245 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #246 = Utf8               InnerClasses
  #247 = Utf8               Donate
  #248 = Class              #249          // java/lang/invoke/MethodHandles$Lookup
  #249 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #250 = Class              #251          // java/lang/invoke/MethodHandles
  #251 = Utf8               java/lang/invoke/MethodHandles
  #252 = Utf8               Lookup
{
  public ext.mods.gameserver.model.actor.instance.Service(int, ext.mods.gameserver.model.actor.template.NpcTemplate);
    descriptor: (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: aload_2
         3: invokespecial #1                  // Method ext/mods/gameserver/model/actor/instance/Merchant."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
         6: return
      LineNumberTable:
        line 35: 0
        line 36: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/actor/instance/Service;
            0       7     1 objectId   I
            0       7     2 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public java.lang.String getHtmlPath(ext.mods.gameserver.model.actor.Player, int, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=5, args_size=4
         0: iload_3
         1: ifne          13
         4: iload_2
         5: invokedynamic #7,  0              // InvokeDynamic #0:makeConcatWithConstants:(I)Ljava/lang/String;
        10: goto          20
        13: iload_2
        14: iload_3
        15: invokedynamic #11,  0             // InvokeDynamic #1:makeConcatWithConstants:(II)Ljava/lang/String;
        20: astore        4
        22: ldc           #14                 // String html/mods/donate/%s.htm
        24: iconst_1
        25: anewarray     #16                 // class java/lang/Object
        28: dup
        29: iconst_0
        30: aload         4
        32: aastore
        33: invokestatic  #18                 // Method java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        36: areturn
      LineNumberTable:
        line 41: 0
        line 42: 22
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      37     0  this   Lext/mods/gameserver/model/actor/instance/Service;
            0      37     1 player   Lext/mods/gameserver/model/actor/Player;
            0      37     2 npcId   I
            0      37     3   val   I
           22      15     4 htmlName   Ljava/lang/String;
      StackMapTable: number_of_entries = 2
        frame_type = 13 /* same */
        frame_type = 70 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]

  protected boolean showPkDenyChatWindow(ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=5, args_size=3
         0: invokestatic  #24                 // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
         3: aload_1
         4: aload_0
         5: invokevirtual #30                 // Method getNpcId:()I
         8: invokedynamic #36,  0             // InvokeDynamic #2:makeConcatWithConstants:(I)Ljava/lang/String;
        13: invokevirtual #37                 // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
        16: astore_3
        17: aload_3
        18: ifnull        55
        21: new           #41                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
        24: dup
        25: aload_0
        26: invokevirtual #43                 // Method getObjectId:()I
        29: invokespecial #46                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
        32: astore        4
        34: aload         4
        36: aload_3
        37: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
        40: aload_1
        41: aload         4
        43: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        46: aload_1
        47: getstatic     #59                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
        50: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        53: iconst_1
        54: ireturn
        55: iconst_0
        56: ireturn
      LineNumberTable:
        line 48: 0
        line 49: 17
        line 51: 21
        line 52: 34
        line 54: 40
        line 55: 46
        line 56: 53
        line 58: 55
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           34      21     4  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
            0      57     0  this   Lext/mods/gameserver/model/actor/instance/Service;
            0      57     1 player   Lext/mods/gameserver/model/actor/Player;
            0      57     2  type   Ljava/lang/String;
           17      40     3 content   Ljava/lang/String;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 55
          locals = [ class java/lang/String ]

  public void onBypassFeedback(ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=8, args_size=3
         0: new           #65                 // class java/util/StringTokenizer
         3: dup
         4: aload_2
         5: ldc           #67                 // String
         7: invokespecial #69                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
        10: astore_3
        11: aload_3
        12: invokevirtual #72                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        15: astore        4
        17: aload         4
        19: astore        5
        21: iconst_m1
        22: istore        6
        24: aload         5
        26: invokevirtual #76                 // Method java/lang/String.hashCode:()I
        29: lookupswitch  { // 12

             -1249512767: 232

             -1206034421: 317

             -1040223303: 136

             -1034383934: 249

              -318452137: 216

              -152162885: 283

                 3198970: 152

               772842902: 168

               853465612: 266

               853470855: 300

              1008070125: 184

              1985754605: 200
                 default: 331
            }
       136: aload         5
       138: ldc           #79                 // String nobles
       140: invokevirtual #81                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       143: ifeq          331
       146: iconst_0
       147: istore        6
       149: goto          331
       152: aload         5
       154: ldc           #85                 // String hero
       156: invokevirtual #81                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       159: ifeq          331
       162: iconst_1
       163: istore        6
       165: goto          331
       168: aload         5
       170: ldc           #87                 // String setnamecolor
       172: invokevirtual #81                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       175: ifeq          331
       178: iconst_2
       179: istore        6
       181: goto          331
       184: aload         5
       186: ldc           #89                 // String settitlecolor
       188: invokevirtual #81                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       191: ifeq          331
       194: iconst_3
       195: istore        6
       197: goto          331
       200: aload         5
       202: ldc           #91                 // String setname
       204: invokevirtual #81                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       207: ifeq          331
       210: iconst_4
       211: istore        6
       213: goto          331
       216: aload         5
       218: ldc           #93                 // String premium
       220: invokevirtual #81                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       223: ifeq          331
       226: iconst_5
       227: istore        6
       229: goto          331
       232: aload         5
       234: ldc           #95                 // String gender
       236: invokevirtual #81                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       239: ifeq          331
       242: bipush        6
       244: istore        6
       246: goto          331
       249: aload         5
       251: ldc           #97                 // String nullpk
       253: invokevirtual #81                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       256: ifeq          331
       259: bipush        7
       261: istore        6
       263: goto          331
       266: aload         5
       268: ldc           #99                 // String clanlvl
       270: invokevirtual #81                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       273: ifeq          331
       276: bipush        8
       278: istore        6
       280: goto          331
       283: aload         5
       285: ldc           #101                // String clanskill
       287: invokevirtual #81                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       290: ifeq          331
       293: bipush        9
       295: istore        6
       297: goto          331
       300: aload         5
       302: ldc           #103                // String clanrep
       304: invokevirtual #81                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       307: ifeq          331
       310: bipush        10
       312: istore        6
       314: goto          331
       317: aload         5
       319: ldc           #105                // String multisell
       321: invokevirtual #81                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       324: ifeq          331
       327: bipush        11
       329: istore        6
       331: iload         6
       333: tableswitch   { // 0 to 11

                       0: 396

                       1: 422

                       2: 448

                       3: 486

                       4: 524

                       5: 562

                       6: 588

                       7: 614

                       8: 640

                       9: 666

                      10: 692

                      11: 718
                 default: 731
            }
       396: aload_3
       397: invokestatic  #107                // Method scanService:(Ljava/util/StringTokenizer;)Lext/mods/gameserver/custom/data/DonateData$Donate;
       400: astore        7
       402: aload         7
       404: aload_1
       405: aload_2
       406: invokestatic  #111                // Method checkService:(Lext/mods/gameserver/custom/data/DonateData$Donate;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
       409: ifne          413
       412: return
       413: aload_1
       414: aload         7
       416: invokestatic  #115                // Method ext/mods/gameserver/custom/data/DonateData.setNobless:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;)V
       419: goto          731
       422: aload_3
       423: invokestatic  #107                // Method scanService:(Ljava/util/StringTokenizer;)Lext/mods/gameserver/custom/data/DonateData$Donate;
       426: astore        7
       428: aload         7
       430: aload_1
       431: aload_2
       432: invokestatic  #111                // Method checkService:(Lext/mods/gameserver/custom/data/DonateData$Donate;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
       435: ifne          439
       438: return
       439: aload_1
       440: aload         7
       442: invokestatic  #121                // Method ext/mods/gameserver/custom/data/DonateData.setHero:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;)V
       445: goto          731
       448: aload_3
       449: invokestatic  #107                // Method scanService:(Ljava/util/StringTokenizer;)Lext/mods/gameserver/custom/data/DonateData$Donate;
       452: astore        7
       454: aload         7
       456: aload_1
       457: aload_2
       458: invokestatic  #111                // Method checkService:(Lext/mods/gameserver/custom/data/DonateData$Donate;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
       461: ifne          465
       464: return
       465: aload_3
       466: invokevirtual #124                // Method java/util/StringTokenizer.hasMoreTokens:()Z
       469: ifne          473
       472: return
       473: aload_1
       474: aload         7
       476: aload_3
       477: invokevirtual #72                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       480: invokestatic  #128                // Method ext/mods/gameserver/custom/data/DonateData.setNameColor:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;Ljava/lang/String;)V
       483: goto          731
       486: aload_3
       487: invokestatic  #107                // Method scanService:(Ljava/util/StringTokenizer;)Lext/mods/gameserver/custom/data/DonateData$Donate;
       490: astore        7
       492: aload         7
       494: aload_1
       495: aload_2
       496: invokestatic  #111                // Method checkService:(Lext/mods/gameserver/custom/data/DonateData$Donate;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
       499: ifne          503
       502: return
       503: aload_3
       504: invokevirtual #124                // Method java/util/StringTokenizer.hasMoreTokens:()Z
       507: ifne          511
       510: return
       511: aload_1
       512: aload         7
       514: aload_3
       515: invokevirtual #72                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       518: invokestatic  #132                // Method ext/mods/gameserver/custom/data/DonateData.setTitleColor:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;Ljava/lang/String;)V
       521: goto          731
       524: aload_3
       525: invokestatic  #107                // Method scanService:(Ljava/util/StringTokenizer;)Lext/mods/gameserver/custom/data/DonateData$Donate;
       528: astore        7
       530: aload         7
       532: aload_1
       533: aload_2
       534: invokestatic  #111                // Method checkService:(Lext/mods/gameserver/custom/data/DonateData$Donate;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
       537: ifne          541
       540: return
       541: aload_3
       542: invokevirtual #124                // Method java/util/StringTokenizer.hasMoreTokens:()Z
       545: ifne          549
       548: return
       549: aload_1
       550: aload         7
       552: aload_3
       553: invokevirtual #72                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       556: invokestatic  #135                // Method ext/mods/gameserver/custom/data/DonateData.setName:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;Ljava/lang/String;)V
       559: goto          731
       562: aload_3
       563: invokestatic  #107                // Method scanService:(Ljava/util/StringTokenizer;)Lext/mods/gameserver/custom/data/DonateData$Donate;
       566: astore        7
       568: aload         7
       570: aload_1
       571: aload_2
       572: invokestatic  #111                // Method checkService:(Lext/mods/gameserver/custom/data/DonateData$Donate;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
       575: ifne          579
       578: return
       579: aload_1
       580: aload         7
       582: invokestatic  #138                // Method ext/mods/gameserver/custom/data/DonateData.setPremium:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;)V
       585: goto          731
       588: aload_3
       589: invokestatic  #107                // Method scanService:(Ljava/util/StringTokenizer;)Lext/mods/gameserver/custom/data/DonateData$Donate;
       592: astore        7
       594: aload         7
       596: aload_1
       597: aload_2
       598: invokestatic  #111                // Method checkService:(Lext/mods/gameserver/custom/data/DonateData$Donate;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
       601: ifne          605
       604: return
       605: aload_1
       606: aload         7
       608: invokestatic  #141                // Method ext/mods/gameserver/custom/data/DonateData.setGender:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;)V
       611: goto          731
       614: aload_3
       615: invokestatic  #107                // Method scanService:(Ljava/util/StringTokenizer;)Lext/mods/gameserver/custom/data/DonateData$Donate;
       618: astore        7
       620: aload         7
       622: aload_1
       623: aload_2
       624: invokestatic  #111                // Method checkService:(Lext/mods/gameserver/custom/data/DonateData$Donate;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
       627: ifne          631
       630: return
       631: aload_1
       632: aload         7
       634: invokestatic  #144                // Method ext/mods/gameserver/custom/data/DonateData.clearPK:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;)V
       637: goto          731
       640: aload_3
       641: invokestatic  #107                // Method scanService:(Ljava/util/StringTokenizer;)Lext/mods/gameserver/custom/data/DonateData$Donate;
       644: astore        7
       646: aload         7
       648: aload_1
       649: aload_2
       650: invokestatic  #111                // Method checkService:(Lext/mods/gameserver/custom/data/DonateData$Donate;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
       653: ifne          657
       656: return
       657: aload_1
       658: aload         7
       660: invokestatic  #147                // Method ext/mods/gameserver/custom/data/DonateData.setClanLevel:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;)V
       663: goto          731
       666: aload_3
       667: invokestatic  #107                // Method scanService:(Ljava/util/StringTokenizer;)Lext/mods/gameserver/custom/data/DonateData$Donate;
       670: astore        7
       672: aload         7
       674: aload_1
       675: aload_2
       676: invokestatic  #111                // Method checkService:(Lext/mods/gameserver/custom/data/DonateData$Donate;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
       679: ifne          683
       682: return
       683: aload_1
       684: aload         7
       686: invokestatic  #150                // Method ext/mods/gameserver/custom/data/DonateData.addClanSkill:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;)V
       689: goto          731
       692: aload_3
       693: invokestatic  #107                // Method scanService:(Ljava/util/StringTokenizer;)Lext/mods/gameserver/custom/data/DonateData$Donate;
       696: astore        7
       698: aload         7
       700: aload_1
       701: aload_2
       702: invokestatic  #111                // Method checkService:(Lext/mods/gameserver/custom/data/DonateData$Donate;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
       705: ifne          709
       708: return
       709: aload_1
       710: aload         7
       712: invokestatic  #153                // Method ext/mods/gameserver/custom/data/DonateData.addClanRep:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;)V
       715: goto          731
       718: invokestatic  #156                // Method ext/mods/gameserver/data/xml/MultisellData.getInstance:()Lext/mods/gameserver/data/xml/MultisellData;
       721: aload_3
       722: invokevirtual #72                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       725: aload_1
       726: aload_0
       727: iconst_0
       728: invokevirtual #161                // Method ext/mods/gameserver/data/xml/MultisellData.separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Z)V
       731: aload_0
       732: aload_1
       733: aload_2
       734: invokespecial #165                // Method ext/mods/gameserver/model/actor/instance/Merchant.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       737: return
      LineNumberTable:
        line 64: 0
        line 65: 11
        line 66: 17
        line 69: 396
        line 70: 402
        line 71: 412
        line 73: 413
        line 74: 419
        line 77: 422
        line 78: 428
        line 79: 438
        line 81: 439
        line 82: 445
        line 85: 448
        line 86: 454
        line 87: 464
        line 89: 465
        line 90: 472
        line 92: 473
        line 93: 483
        line 96: 486
        line 97: 492
        line 98: 502
        line 100: 503
        line 101: 510
        line 103: 511
        line 104: 521
        line 107: 524
        line 108: 530
        line 109: 540
        line 111: 541
        line 112: 548
        line 114: 549
        line 115: 559
        line 118: 562
        line 119: 568
        line 120: 578
        line 122: 579
        line 123: 585
        line 126: 588
        line 127: 594
        line 129: 604
        line 131: 605
        line 132: 611
        line 135: 614
        line 136: 620
        line 137: 630
        line 139: 631
        line 140: 637
        line 143: 640
        line 144: 646
        line 145: 656
        line 147: 657
        line 148: 663
        line 151: 666
        line 152: 672
        line 153: 682
        line 155: 683
        line 156: 689
        line 159: 692
        line 160: 698
        line 161: 708
        line 163: 709
        line 164: 715
        line 167: 718
        line 171: 731
        line 172: 737
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          402      17     7 service   Lext/mods/gameserver/custom/data/DonateData$Donate;
          428      17     7 service   Lext/mods/gameserver/custom/data/DonateData$Donate;
          454      29     7 service   Lext/mods/gameserver/custom/data/DonateData$Donate;
          492      29     7 service   Lext/mods/gameserver/custom/data/DonateData$Donate;
          530      29     7 service   Lext/mods/gameserver/custom/data/DonateData$Donate;
          568      17     7 service   Lext/mods/gameserver/custom/data/DonateData$Donate;
          594      17     7 service   Lext/mods/gameserver/custom/data/DonateData$Donate;
          620      17     7 service   Lext/mods/gameserver/custom/data/DonateData$Donate;
          646      17     7 service   Lext/mods/gameserver/custom/data/DonateData$Donate;
          672      17     7 service   Lext/mods/gameserver/custom/data/DonateData$Donate;
          698      17     7 service   Lext/mods/gameserver/custom/data/DonateData$Donate;
            0     738     0  this   Lext/mods/gameserver/model/actor/instance/Service;
            0     738     1 player   Lext/mods/gameserver/model/actor/Player;
            0     738     2 command   Ljava/lang/String;
           11     727     3    st   Ljava/util/StringTokenizer;
           17     721     4 actualCommand   Ljava/lang/String;
      StackMapTable: number_of_entries = 40
        frame_type = 255 /* full_frame */
          offset_delta = 136
          locals = [ class ext/mods/gameserver/model/actor/instance/Service, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, int ]
          stack = []
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 16 /* same */
        frame_type = 16 /* same */
        frame_type = 16 /* same */
        frame_type = 16 /* same */
        frame_type = 16 /* same */
        frame_type = 13 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 64
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/custom/data/DonateData$Donate ]
        frame_type = 250 /* chop */
          offset_delta = 8
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/custom/data/DonateData$Donate ]
        frame_type = 250 /* chop */
          offset_delta = 8
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/custom/data/DonateData$Donate ]
        frame_type = 7 /* same */
        frame_type = 250 /* chop */
          offset_delta = 12
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/custom/data/DonateData$Donate ]
        frame_type = 7 /* same */
        frame_type = 250 /* chop */
          offset_delta = 12
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/custom/data/DonateData$Donate ]
        frame_type = 7 /* same */
        frame_type = 250 /* chop */
          offset_delta = 12
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/custom/data/DonateData$Donate ]
        frame_type = 250 /* chop */
          offset_delta = 8
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/custom/data/DonateData$Donate ]
        frame_type = 250 /* chop */
          offset_delta = 8
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/custom/data/DonateData$Donate ]
        frame_type = 250 /* chop */
          offset_delta = 8
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/custom/data/DonateData$Donate ]
        frame_type = 250 /* chop */
          offset_delta = 8
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/custom/data/DonateData$Donate ]
        frame_type = 250 /* chop */
          offset_delta = 8
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/custom/data/DonateData$Donate ]
        frame_type = 250 /* chop */
          offset_delta = 8
        frame_type = 249 /* chop */
          offset_delta = 12

  public static ext.mods.gameserver.custom.data.DonateData$Donate scanService(java.util.StringTokenizer);
    descriptor: (Ljava/util/StringTokenizer;)Lext/mods/gameserver/custom/data/DonateData$Donate;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: invokestatic  #169                // Method ext/mods/gameserver/custom/data/DonateData.getInstance:()Lext/mods/gameserver/custom/data/DonateData;
         3: aload_0
         4: invokevirtual #72                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
         7: invokestatic  #172                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        10: invokevirtual #178                // Method ext/mods/gameserver/custom/data/DonateData.getDonate:(I)Lext/mods/gameserver/custom/data/DonateData$Donate;
        13: areturn
      LineNumberTable:
        line 176: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0    st   Ljava/util/StringTokenizer;

  public static boolean checkService(ext.mods.gameserver.custom.data.DonateData$Donate, ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/custom/data/DonateData$Donate;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=6, locals=3, args_size=3
         0: aload_0
         1: ifnull        6
         4: iconst_1
         5: ireturn
         6: getstatic     #182                // Field LOGGER:Lext/mods/commons/logging/CLogger;
         9: ldc           #186                // String pc[{}] use missing service[{}]
        11: iconst_2
        12: anewarray     #16                 // class java/lang/Object
        15: dup
        16: iconst_0
        17: aload_1
        18: invokevirtual #188                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
        21: aastore
        22: dup
        23: iconst_1
        24: aload_2
        25: aastore
        26: invokevirtual #191                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        29: iconst_0
        30: ireturn
      LineNumberTable:
        line 181: 0
        line 182: 4
        line 184: 6
        line 185: 29
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0 donate   Lext/mods/gameserver/custom/data/DonateData$Donate;
            0      31     1    pc   Lext/mods/gameserver/model/actor/Player;
            0      31     2 command   Ljava/lang/String;
      StackMapTable: number_of_entries = 1
        frame_type = 6 /* same */
}
SourceFile: "Service.java"
BootstrapMethods:
  0: #240 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #234 \u0001
  1: #240 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #236 \u0001-\u0001
  2: #240 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #238 html/mods/donate/\u0001-pk.htm
InnerClasses:
  public static final #247= #227 of #116; // Donate=class ext/mods/gameserver/custom/data/DonateData$Donate of class ext/mods/gameserver/custom/data/DonateData
  public static final #252= #248 of #250; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
