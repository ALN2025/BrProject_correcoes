// Bytecode for: ext.mods.gameserver.communitybbs.manager.ClanBBSManager
// File: ext\mods\gameserver\communitybbs\manager\ClanBBSManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/communitybbs/manager/ClanBBSManager.class
  Last modified 9 de jul de 2026; size 10063 bytes
  MD5 checksum 1dbe66e6bba4887b309dc8bea30392e0
  Compiled from "ClanBBSManager.java"
public class ext.mods.gameserver.communitybbs.manager.ClanBBSManager extends ext.mods.gameserver.communitybbs.manager.BaseBBSManager
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #22                         // ext/mods/gameserver/communitybbs/manager/ClanBBSManager
  super_class: #2                         // ext/mods/gameserver/communitybbs/manager/BaseBBSManager
  interfaces: 0, fields: 0, methods: 10, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/communitybbs/manager/BaseBBSManager."<init>":()V
    #2 = Class              #4            // ext/mods/gameserver/communitybbs/manager/BaseBBSManager
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               ext/mods/gameserver/communitybbs/manager/BaseBBSManager
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = String             #8            // _bbsclan
    #8 = Utf8               _bbsclan
    #9 = Methodref          #10.#11       // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
   #10 = Class              #12           // java/lang/String
   #11 = NameAndType        #13:#14       // equalsIgnoreCase:(Ljava/lang/String;)Z
   #12 = Utf8               java/lang/String
   #13 = Utf8               equalsIgnoreCase
   #14 = Utf8               (Ljava/lang/String;)Z
   #15 = Methodref          #16.#17       // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
   #16 = Class              #18           // ext/mods/gameserver/model/actor/Player
   #17 = NameAndType        #19:#20       // getClan:()Lext/mods/gameserver/model/pledge/Clan;
   #18 = Utf8               ext/mods/gameserver/model/actor/Player
   #19 = Utf8               getClan
   #20 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
   #21 = Methodref          #22.#23       // ext/mods/gameserver/communitybbs/manager/ClanBBSManager.sendClanList:(Lext/mods/gameserver/model/actor/Player;I)V
   #22 = Class              #24           // ext/mods/gameserver/communitybbs/manager/ClanBBSManager
   #23 = NameAndType        #25:#26       // sendClanList:(Lext/mods/gameserver/model/actor/Player;I)V
   #24 = Utf8               ext/mods/gameserver/communitybbs/manager/ClanBBSManager
   #25 = Utf8               sendClanList
   #26 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
   #27 = Methodref          #28.#29       // ext/mods/gameserver/model/pledge/Clan.getClanId:()I
   #28 = Class              #30           // ext/mods/gameserver/model/pledge/Clan
   #29 = NameAndType        #31:#32       // getClanId:()I
   #30 = Utf8               ext/mods/gameserver/model/pledge/Clan
   #31 = Utf8               getClanId
   #32 = Utf8               ()I
   #33 = Methodref          #22.#34       // ext/mods/gameserver/communitybbs/manager/ClanBBSManager.sendClanDetails:(Lext/mods/gameserver/model/actor/Player;I)V
   #34 = NameAndType        #35:#26       // sendClanDetails:(Lext/mods/gameserver/model/actor/Player;I)V
   #35 = Utf8               sendClanDetails
   #36 = Methodref          #10.#37       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #37 = NameAndType        #38:#14       // startsWith:(Ljava/lang/String;)Z
   #38 = Utf8               startsWith
   #39 = Class              #40           // java/util/StringTokenizer
   #40 = Utf8               java/util/StringTokenizer
   #41 = String             #42           // ;
   #42 = Utf8               ;
   #43 = Methodref          #39.#44       // java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #44 = NameAndType        #5:#45        // "<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #45 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #46 = Methodref          #39.#47       // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
   #47 = NameAndType        #48:#49       // nextToken:()Ljava/lang/String;
   #48 = Utf8               nextToken
   #49 = Utf8               ()Ljava/lang/String;
   #50 = String             #51           // clan
   #51 = Utf8               clan
   #52 = Methodref          #53.#54       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #53 = Class              #55           // java/lang/Integer
   #54 = NameAndType        #56:#57       // parseInt:(Ljava/lang/String;)I
   #55 = Utf8               java/lang/Integer
   #56 = Utf8               parseInt
   #57 = Utf8               (Ljava/lang/String;)I
   #58 = String             #59           // home
   #59 = Utf8               home
   #60 = String             #61           // mail
   #61 = Utf8               mail
   #62 = Methodref          #22.#63       // ext/mods/gameserver/communitybbs/manager/ClanBBSManager.sendClanMail:(Lext/mods/gameserver/model/actor/Player;I)V
   #63 = NameAndType        #64:#26       // sendClanMail:(Lext/mods/gameserver/model/actor/Player;I)V
   #64 = Utf8               sendClanMail
   #65 = String             #66           // management
   #66 = Utf8               management
   #67 = Methodref          #22.#68       // ext/mods/gameserver/communitybbs/manager/ClanBBSManager.sendClanManagement:(Lext/mods/gameserver/model/actor/Player;I)V
   #68 = NameAndType        #69:#26       // sendClanManagement:(Lext/mods/gameserver/model/actor/Player;I)V
   #69 = Utf8               sendClanManagement
   #70 = String             #71           // notice
   #71 = Utf8               notice
   #72 = Methodref          #39.#73       // java/util/StringTokenizer.hasMoreTokens:()Z
   #73 = NameAndType        #74:#75       // hasMoreTokens:()Z
   #74 = Utf8               hasMoreTokens
   #75 = Utf8               ()Z
   #76 = Methodref          #10.#77       // java/lang/String.isEmpty:()Z
   #77 = NameAndType        #78:#75       // isEmpty:()Z
   #78 = Utf8               isEmpty
   #79 = Methodref          #80.#81       // java/lang/Boolean.parseBoolean:(Ljava/lang/String;)Z
   #80 = Class              #82           // java/lang/Boolean
   #81 = NameAndType        #83:#14       // parseBoolean:(Ljava/lang/String;)Z
   #82 = Utf8               java/lang/Boolean
   #83 = Utf8               parseBoolean
   #84 = Methodref          #28.#85       // ext/mods/gameserver/model/pledge/Clan.setNotice:(Z)V
   #85 = NameAndType        #86:#87       // setNotice:(Z)V
   #86 = Utf8               setNotice
   #87 = Utf8               (Z)V
   #88 = Methodref          #16.#29       // ext/mods/gameserver/model/actor/Player.getClanId:()I
   #89 = Methodref          #22.#90       // ext/mods/gameserver/communitybbs/manager/ClanBBSManager.sendClanNotice:(Lext/mods/gameserver/model/actor/Player;I)V
   #90 = NameAndType        #91:#26       // sendClanNotice:(Lext/mods/gameserver/model/actor/Player;I)V
   #91 = Utf8               sendClanNotice
   #92 = Methodref          #2.#93        // ext/mods/gameserver/communitybbs/manager/BaseBBSManager.parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #93 = NameAndType        #94:#95       // parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #94 = Utf8               parseCmd
   #95 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #96 = String             #97           // intro
   #97 = Utf8               intro
   #98 = Methodref          #53.#99       // java/lang/Integer.valueOf:(Ljava/lang/String;)Ljava/lang/Integer;
   #99 = NameAndType        #100:#101     // valueOf:(Ljava/lang/String;)Ljava/lang/Integer;
  #100 = Utf8               valueOf
  #101 = Utf8               (Ljava/lang/String;)Ljava/lang/Integer;
  #102 = Methodref          #53.#103      // java/lang/Integer.intValue:()I
  #103 = NameAndType        #104:#32      // intValue:()I
  #104 = Utf8               intValue
  #105 = Methodref          #106.#107     // ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
  #106 = Class              #108          // ext/mods/gameserver/data/sql/ClanTable
  #107 = NameAndType        #109:#110     // getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
  #108 = Utf8               ext/mods/gameserver/data/sql/ClanTable
  #109 = Utf8               getInstance
  #110 = Utf8               ()Lext/mods/gameserver/data/sql/ClanTable;
  #111 = Methodref          #106.#112     // ext/mods/gameserver/data/sql/ClanTable.getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
  #112 = NameAndType        #19:#113      // getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
  #113 = Utf8               (I)Lext/mods/gameserver/model/pledge/Clan;
  #114 = Methodref          #28.#115      // ext/mods/gameserver/model/pledge/Clan.setIntroduction:(Ljava/lang/String;Z)V
  #115 = NameAndType        #116:#117     // setIntroduction:(Ljava/lang/String;Z)V
  #116 = Utf8               setIntroduction
  #117 = Utf8               (Ljava/lang/String;Z)V
  #118 = Methodref          #10.#119      // java/lang/String.equals:(Ljava/lang/Object;)Z
  #119 = NameAndType        #120:#121     // equals:(Ljava/lang/Object;)Z
  #120 = Utf8               equals
  #121 = Utf8               (Ljava/lang/Object;)Z
  #122 = Methodref          #28.#123      // ext/mods/gameserver/model/pledge/Clan.setNotice:(Ljava/lang/String;)V
  #123 = NameAndType        #86:#124      // setNotice:(Ljava/lang/String;)V
  #124 = Utf8               (Ljava/lang/String;)V
  #125 = Class              #126          // java/lang/StringBuilder
  #126 = Utf8               java/lang/StringBuilder
  #127 = Methodref          #125.#3       // java/lang/StringBuilder."<init>":()V
  #128 = Methodref          #28.#129      // ext/mods/gameserver/model/pledge/Clan.getMembers:()Ljava/util/Collection;
  #129 = NameAndType        #130:#131     // getMembers:()Ljava/util/Collection;
  #130 = Utf8               getMembers
  #131 = Utf8               ()Ljava/util/Collection;
  #132 = InterfaceMethodref #133.#134     // java/util/Collection.iterator:()Ljava/util/Iterator;
  #133 = Class              #135          // java/util/Collection
  #134 = NameAndType        #136:#137     // iterator:()Ljava/util/Iterator;
  #135 = Utf8               java/util/Collection
  #136 = Utf8               iterator
  #137 = Utf8               ()Ljava/util/Iterator;
  #138 = InterfaceMethodref #139.#140     // java/util/Iterator.hasNext:()Z
  #139 = Class              #141          // java/util/Iterator
  #140 = NameAndType        #142:#75      // hasNext:()Z
  #141 = Utf8               java/util/Iterator
  #142 = Utf8               hasNext
  #143 = InterfaceMethodref #139.#144     // java/util/Iterator.next:()Ljava/lang/Object;
  #144 = NameAndType        #145:#146     // next:()Ljava/lang/Object;
  #145 = Utf8               next
  #146 = Utf8               ()Ljava/lang/Object;
  #147 = Class              #148          // ext/mods/gameserver/model/pledge/ClanMember
  #148 = Utf8               ext/mods/gameserver/model/pledge/ClanMember
  #149 = Methodref          #125.#150     // java/lang/StringBuilder.length:()I
  #150 = NameAndType        #151:#32      // length:()I
  #151 = Utf8               length
  #152 = Methodref          #125.#153     // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #153 = NameAndType        #154:#155     // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #154 = Utf8               append
  #155 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
  #156 = Methodref          #147.#157     // ext/mods/gameserver/model/pledge/ClanMember.getName:()Ljava/lang/String;
  #157 = NameAndType        #158:#49      // getName:()Ljava/lang/String;
  #158 = Utf8               getName
  #159 = Methodref          #160.#161     // ext/mods/gameserver/communitybbs/manager/MailBBSManager.getInstance:()Lext/mods/gameserver/communitybbs/manager/MailBBSManager;
  #160 = Class              #162          // ext/mods/gameserver/communitybbs/manager/MailBBSManager
  #161 = NameAndType        #109:#163     // getInstance:()Lext/mods/gameserver/communitybbs/manager/MailBBSManager;
  #162 = Utf8               ext/mods/gameserver/communitybbs/manager/MailBBSManager
  #163 = Utf8               ()Lext/mods/gameserver/communitybbs/manager/MailBBSManager;
  #164 = Methodref          #125.#165     // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #165 = NameAndType        #166:#49      // toString:()Ljava/lang/String;
  #166 = Utf8               toString
  #167 = Methodref          #160.#168     // ext/mods/gameserver/communitybbs/manager/MailBBSManager.sendMail:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #168 = NameAndType        #169:#170     // sendMail:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #169 = Utf8               sendMail
  #170 = Utf8               (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #171 = Methodref          #2.#172       // ext/mods/gameserver/communitybbs/manager/BaseBBSManager.parseWrite:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #172 = NameAndType        #173:#174     // parseWrite:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #173 = Utf8               parseWrite
  #174 = Utf8               (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #175 = String             #176          // clan/
  #176 = Utf8               clan/
  #177 = Methodref          #16.#178      // ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
  #178 = NameAndType        #179:#75      // isClanLeader:()Z
  #179 = Utf8               isClanLeader
  #180 = Fieldref           #181.#182     // ext/mods/gameserver/network/SystemMessageId.ONLY_THE_CLAN_LEADER_IS_ENABLED:Lext/mods/gameserver/network/SystemMessageId;
  #181 = Class              #183          // ext/mods/gameserver/network/SystemMessageId
  #182 = NameAndType        #184:#185     // ONLY_THE_CLAN_LEADER_IS_ENABLED:Lext/mods/gameserver/network/SystemMessageId;
  #183 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #184 = Utf8               ONLY_THE_CLAN_LEADER_IS_ENABLED
  #185 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #186 = Methodref          #16.#187      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #187 = NameAndType        #188:#189     // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #188 = Utf8               sendPacket
  #189 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #190 = Methodref          #191.#192     // ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
  #191 = Class              #193          // ext/mods/gameserver/data/HTMLData
  #192 = NameAndType        #109:#194     // getInstance:()Lext/mods/gameserver/data/HTMLData;
  #193 = Utf8               ext/mods/gameserver/data/HTMLData
  #194 = Utf8               ()Lext/mods/gameserver/data/HTMLData;
  #195 = String             #196          // html/CommunityBoard/clan/clanhome-mail.htm
  #196 = Utf8               html/CommunityBoard/clan/clanhome-mail.htm
  #197 = Methodref          #191.#198     // ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
  #198 = NameAndType        #199:#200     // getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
  #199 = Utf8               getHtm
  #200 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
  #201 = String             #202          // %clanid%
  #202 = Utf8               %clanid%
  #203 = Methodref          #53.#204      // java/lang/Integer.toString:(I)Ljava/lang/String;
  #204 = NameAndType        #166:#205     // toString:(I)Ljava/lang/String;
  #205 = Utf8               (I)Ljava/lang/String;
  #206 = Methodref          #10.#207      // java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #207 = NameAndType        #208:#209     // replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #208 = Utf8               replace
  #209 = Utf8               (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #210 = String             #211          // %clanName%
  #211 = Utf8               %clanName%
  #212 = Methodref          #28.#157      // ext/mods/gameserver/model/pledge/Clan.getName:()Ljava/lang/String;
  #213 = Methodref          #22.#214      // ext/mods/gameserver/communitybbs/manager/ClanBBSManager.separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #214 = NameAndType        #215:#95      // separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #215 = Utf8               separateAndSend
  #216 = String             #217          // html/CommunityBoard/clan/clanhome-management.htm
  #217 = Utf8               html/CommunityBoard/clan/clanhome-management.htm
  #218 = String             #219          // %curAnnNonPer%
  #219 = Utf8               %curAnnNonPer%
  #220 = Methodref          #28.#221      // ext/mods/gameserver/model/pledge/Clan.getAnnBoard:()Lext/mods/gameserver/communitybbs/model/Forum;
  #221 = NameAndType        #222:#223     // getAnnBoard:()Lext/mods/gameserver/communitybbs/model/Forum;
  #222 = Utf8               getAnnBoard
  #223 = Utf8               ()Lext/mods/gameserver/communitybbs/model/Forum;
  #224 = Methodref          #225.#226     // ext/mods/gameserver/communitybbs/model/Forum.getAccess:()Lext/mods/gameserver/enums/bbs/ForumAccess;
  #225 = Class              #227          // ext/mods/gameserver/communitybbs/model/Forum
  #226 = NameAndType        #228:#229     // getAccess:()Lext/mods/gameserver/enums/bbs/ForumAccess;
  #227 = Utf8               ext/mods/gameserver/communitybbs/model/Forum
  #228 = Utf8               getAccess
  #229 = Utf8               ()Lext/mods/gameserver/enums/bbs/ForumAccess;
  #230 = Methodref          #231.#232     // ext/mods/gameserver/enums/bbs/ForumAccess.getDesc:()Ljava/lang/String;
  #231 = Class              #233          // ext/mods/gameserver/enums/bbs/ForumAccess
  #232 = NameAndType        #234:#49      // getDesc:()Ljava/lang/String;
  #233 = Utf8               ext/mods/gameserver/enums/bbs/ForumAccess
  #234 = Utf8               getDesc
  #235 = String             #236          // %curAnnMemPer%
  #236 = Utf8               %curAnnMemPer%
  #237 = String             #238          // %curCbbNonPer%
  #238 = Utf8               %curCbbNonPer%
  #239 = Methodref          #28.#240      // ext/mods/gameserver/model/pledge/Clan.getCbbBoard:()Lext/mods/gameserver/communitybbs/model/Forum;
  #240 = NameAndType        #241:#223     // getCbbBoard:()Lext/mods/gameserver/communitybbs/model/Forum;
  #241 = Utf8               getCbbBoard
  #242 = String             #243          // %curCbbMemPer%
  #243 = Utf8               %curCbbMemPer%
  #244 = Methodref          #22.#245      // ext/mods/gameserver/communitybbs/manager/ClanBBSManager.send1001:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #245 = NameAndType        #246:#95      // send1001:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #246 = Utf8               send1001
  #247 = Methodref          #28.#248      // ext/mods/gameserver/model/pledge/Clan.getIntroduction:()Ljava/lang/String;
  #248 = NameAndType        #249:#49      // getIntroduction:()Ljava/lang/String;
  #249 = Utf8               getIntroduction
  #250 = String             #251          //
  #251 = Utf8
  #252 = Methodref          #22.#253      // ext/mods/gameserver/communitybbs/manager/ClanBBSManager.send1002:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
  #253 = NameAndType        #254:#255     // send1002:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
  #254 = Utf8               send1002
  #255 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
  #256 = Methodref          #28.#257      // ext/mods/gameserver/model/pledge/Clan.getLevel:()I
  #257 = NameAndType        #258:#32      // getLevel:()I
  #258 = Utf8               getLevel
  #259 = Fieldref           #181.#260     // ext/mods/gameserver/network/SystemMessageId.NO_CB_IN_MY_CLAN:Lext/mods/gameserver/network/SystemMessageId;
  #260 = NameAndType        #261:#185     // NO_CB_IN_MY_CLAN:Lext/mods/gameserver/network/SystemMessageId;
  #261 = Utf8               NO_CB_IN_MY_CLAN
  #262 = String             #263          // html/CommunityBoard/clan/clanhome-notice.htm
  #263 = Utf8               html/CommunityBoard/clan/clanhome-notice.htm
  #264 = String             #265          // %enabled%
  #265 = Utf8               %enabled%
  #266 = Methodref          #28.#267      // ext/mods/gameserver/model/pledge/Clan.isNoticeEnabled:()Z
  #267 = NameAndType        #268:#75      // isNoticeEnabled:()Z
  #268 = Utf8               isNoticeEnabled
  #269 = InvokeDynamic      #0:#270       // #0:makeConcatWithConstants:(Z)Ljava/lang/String;
  #270 = NameAndType        #271:#272     // makeConcatWithConstants:(Z)Ljava/lang/String;
  #271 = Utf8               makeConcatWithConstants
  #272 = Utf8               (Z)Ljava/lang/String;
  #273 = String             #274          // %flag%
  #274 = Utf8               %flag%
  #275 = Methodref          #10.#276      // java/lang/String.valueOf:(Z)Ljava/lang/String;
  #276 = NameAndType        #100:#272     // valueOf:(Z)Ljava/lang/String;
  #277 = Methodref          #28.#278      // ext/mods/gameserver/model/pledge/Clan.getNotice:()Ljava/lang/String;
  #278 = NameAndType        #279:#49      // getNotice:()Ljava/lang/String;
  #279 = Utf8               getNotice
  #280 = String             #281          // html/CommunityBoard/clan/clanlist.htm
  #281 = Utf8               html/CommunityBoard/clan/clanlist.htm
  #282 = Class              #283          // java/lang/Object
  #283 = Utf8               java/lang/Object
  #284 = String             #285          // <table width=610 bgcolor=A7A19A><tr><td width=5></td><td width=605><a action=\"bypass _bbsclan;home;
  #285 = Utf8               <table width=610 bgcolor=A7A19A><tr><td width=5></td><td width=605><a action=\"bypass _bbsclan;home;
  #286 = Methodref          #53.#287      // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #287 = NameAndType        #100:#288     // valueOf:(I)Ljava/lang/Integer;
  #288 = Utf8               (I)Ljava/lang/Integer;
  #289 = String             #290          // \">[GO TO MY CLAN]</a></td></tr></table>
  #290 = Utf8               \">[GO TO MY CLAN]</a></td></tr></table>
  #291 = Methodref          #292.#293     // ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #292 = Class              #294          // ext/mods/commons/lang/StringUtil
  #293 = NameAndType        #154:#295     // append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #294 = Utf8               ext/mods/commons/lang/StringUtil
  #295 = Utf8               (Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #296 = String             #297          // %homebar%
  #297 = Utf8               %homebar%
  #298 = Methodref          #125.#299     // java/lang/StringBuilder.setLength:(I)V
  #299 = NameAndType        #300:#301     // setLength:(I)V
  #300 = Utf8               setLength
  #301 = Utf8               (I)V
  #302 = Methodref          #106.#303     // ext/mods/gameserver/data/sql/ClanTable.getClans:()Ljava/util/Collection;
  #303 = NameAndType        #304:#131     // getClans:()Ljava/util/Collection;
  #304 = Utf8               getClans
  #305 = String             #306          // <table width=610><tr><td width=5></td><td width=150 align=center><a action=\"bypass _bbsclan;home;
  #306 = Utf8               <table width=610><tr><td width=5></td><td width=150 align=center><a action=\"bypass _bbsclan;home;
  #307 = String             #308          // \">
  #308 = Utf8               \">
  #309 = String             #310          // </a></td><td width=150 align=center>
  #310 = Utf8               </a></td><td width=150 align=center>
  #311 = Methodref          #28.#312      // ext/mods/gameserver/model/pledge/Clan.getLeaderName:()Ljava/lang/String;
  #312 = NameAndType        #313:#49      // getLeaderName:()Ljava/lang/String;
  #313 = Utf8               getLeaderName
  #314 = String             #315          // </td><td width=100 align=center>
  #315 = Utf8               </td><td width=100 align=center>
  #316 = String             #317          // </td><td width=200 align=center>
  #317 = Utf8               </td><td width=200 align=center>
  #318 = Methodref          #28.#319      // ext/mods/gameserver/model/pledge/Clan.getMembersCount:()I
  #319 = NameAndType        #320:#32      // getMembersCount:()I
  #320 = Utf8               getMembersCount
  #321 = String             #322          // </td><td width=5></td></tr></table><br1><img src=\"L2UI.Squaregray\" width=605 height=1><br1>
  #322 = Utf8               </td><td width=5></td></tr></table><br1><img src=\"L2UI.Squaregray\" width=605 height=1><br1>
  #323 = String             #324          // <table><tr>
  #324 = Utf8               <table><tr>
  #325 = String             #326          // <td><button action=\"\" back=\"l2ui_ch3.prev1_down\" fore=\"l2ui_ch3.prev1\" width=16 height=16></td>
  #326 = Utf8               <td><button action=\"\" back=\"l2ui_ch3.prev1_down\" fore=\"l2ui_ch3.prev1\" width=16 height=16></td>
  #327 = String             #328          // <td><button action=\"_bbsclan;clan;
  #328 = Utf8               <td><button action=\"_bbsclan;clan;
  #329 = String             #330          // \" back=\"l2ui_ch3.prev1_down\" fore=\"l2ui_ch3.prev1\" width=16 height=16 ></td>
  #330 = Utf8               \" back=\"l2ui_ch3.prev1_down\" fore=\"l2ui_ch3.prev1\" width=16 height=16 ></td>
  #331 = InterfaceMethodref #133.#332     // java/util/Collection.size:()I
  #332 = NameAndType        #333:#32      // size:()I
  #333 = Utf8               size
  #334 = String             #335          // <td>
  #335 = Utf8               <td>
  #336 = String             #337          //  </td>
  #337 = Utf8                </td>
  #338 = String             #339          // <td><a action=\"bypass _bbsclan;clan;
  #339 = Utf8               <td><a action=\"bypass _bbsclan;clan;
  #340 = String             #341          // \">
  #341 = Utf8               \">
  #342 = String             #343          //  </a></td>
  #343 = Utf8                </a></td>
  #344 = String             #345          // <td><button action=\"\" back=\"l2ui_ch3.next1_down\" fore=\"l2ui_ch3.next1\" width=16 height=16></td>
  #345 = Utf8               <td><button action=\"\" back=\"l2ui_ch3.next1_down\" fore=\"l2ui_ch3.next1\" width=16 height=16></td>
  #346 = String             #347          // <td><button action=\"bypass _bbsclan;clan;
  #347 = Utf8               <td><button action=\"bypass _bbsclan;clan;
  #348 = String             #349          // \" back=\"l2ui_ch3.next1_down\" fore=\"l2ui_ch3.next1\" width=16 height=16 ></td>
  #349 = Utf8               \" back=\"l2ui_ch3.next1_down\" fore=\"l2ui_ch3.next1\" width=16 height=16 ></td>
  #350 = String             #351          // </tr></table>
  #351 = Utf8               </tr></table>
  #352 = String             #353          // %clanlist%
  #353 = Utf8               %clanlist%
  #354 = String             #355          // html/CommunityBoard/clan/clanhome.htm
  #355 = Utf8               html/CommunityBoard/clan/clanhome.htm
  #356 = String             #357          // html/CommunityBoard/clan/clanhome-leader.htm
  #357 = Utf8               html/CommunityBoard/clan/clanhome-leader.htm
  #358 = String             #359          // html/CommunityBoard/clan/clanhome-member.htm
  #359 = Utf8               html/CommunityBoard/clan/clanhome-member.htm
  #360 = String             #361          // %clanIntro%
  #361 = Utf8               %clanIntro%
  #362 = String             #363          // %clanLvL%
  #363 = Utf8               %clanLvL%
  #364 = String             #365          // %clanMembers%
  #365 = Utf8               %clanMembers%
  #366 = String             #367          // %clanLeader%
  #367 = Utf8               %clanLeader%
  #368 = String             #369          // %allyName%
  #369 = Utf8               %allyName%
  #370 = Methodref          #28.#371      // ext/mods/gameserver/model/pledge/Clan.getAllyId:()I
  #371 = NameAndType        #372:#32      // getAllyId:()I
  #372 = Utf8               getAllyId
  #373 = Methodref          #28.#374      // ext/mods/gameserver/model/pledge/Clan.getAllyName:()Ljava/lang/String;
  #374 = NameAndType        #375:#49      // getAllyName:()Ljava/lang/String;
  #375 = Utf8               getAllyName
  #376 = Fieldref           #377.#378     // ext/mods/gameserver/communitybbs/manager/ClanBBSManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/communitybbs/manager/ClanBBSManager;
  #377 = Class              #379          // ext/mods/gameserver/communitybbs/manager/ClanBBSManager$SingletonHolder
  #378 = NameAndType        #380:#381     // INSTANCE:Lext/mods/gameserver/communitybbs/manager/ClanBBSManager;
  #379 = Utf8               ext/mods/gameserver/communitybbs/manager/ClanBBSManager$SingletonHolder
  #380 = Utf8               INSTANCE
  #381 = Utf8               Lext/mods/gameserver/communitybbs/manager/ClanBBSManager;
  #382 = Utf8               Code
  #383 = Utf8               LineNumberTable
  #384 = Utf8               LocalVariableTable
  #385 = Utf8               this
  #386 = Utf8               noticeCommand
  #387 = Utf8               Ljava/lang/String;
  #388 = Utf8               st
  #389 = Utf8               Ljava/util/StringTokenizer;
  #390 = Utf8               clanCommand
  #391 = Utf8               command
  #392 = Utf8               player
  #393 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #394 = Utf8               StackMapTable
  #395 = Utf8               Lext/mods/gameserver/model/pledge/Clan;
  #396 = Utf8               member
  #397 = Utf8               Lext/mods/gameserver/model/pledge/ClanMember;
  #398 = Utf8               members
  #399 = Utf8               Ljava/lang/StringBuilder;
  #400 = Utf8               ar1
  #401 = Utf8               ar2
  #402 = Utf8               ar3
  #403 = Utf8               ar4
  #404 = Utf8               ar5
  #405 = Utf8               getFolder
  #406 = Utf8               clanId
  #407 = Utf8               I
  #408 = Utf8               content
  #409 = Utf8               cl
  #410 = Utf8               index
  #411 = Utf8               sb
  #412 = Utf8               i
  #413 = Utf8               pageNumber
  #414 = Utf8               ()Lext/mods/gameserver/communitybbs/manager/ClanBBSManager;
  #415 = Utf8               SourceFile
  #416 = Utf8               ClanBBSManager.java
  #417 = Utf8               NestMembers
  #418 = Utf8               BootstrapMethods
  #419 = String             #420          // [\u0001]
  #420 = Utf8               [\u0001]
  #421 = MethodHandle       6:#422        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #422 = Methodref          #423.#424     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #423 = Class              #425          // java/lang/invoke/StringConcatFactory
  #424 = NameAndType        #271:#426     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #425 = Utf8               java/lang/invoke/StringConcatFactory
  #426 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #427 = Utf8               InnerClasses
  #428 = Utf8               SingletonHolder
  #429 = Class              #430          // java/lang/invoke/MethodHandles$Lookup
  #430 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #431 = Class              #432          // java/lang/invoke/MethodHandles
  #432 = Utf8               java/lang/invoke/MethodHandles
  #433 = Utf8               Lookup
{
  protected ext.mods.gameserver.communitybbs.manager.ClanBBSManager();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/communitybbs/manager/BaseBBSManager."<init>":()V
         4: return
      LineNumberTable:
        line 34: 0
        line 35: 4
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/communitybbs/manager/ClanBBSManager;

  public void parseCmd(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=6, args_size=3
         0: aload_1
         1: ldc           #7                  // String _bbsclan
         3: invokevirtual #9                  // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
         6: ifeq          38
         9: aload_2
        10: invokevirtual #15                 // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        13: ifnonnull     24
        16: aload_2
        17: iconst_1
        18: invokestatic  #21                 // Method sendClanList:(Lext/mods/gameserver/model/actor/Player;I)V
        21: goto          232
        24: aload_2
        25: aload_2
        26: invokevirtual #15                 // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        29: invokevirtual #27                 // Method ext/mods/gameserver/model/pledge/Clan.getClanId:()I
        32: invokestatic  #33                 // Method sendClanDetails:(Lext/mods/gameserver/model/actor/Player;I)V
        35: goto          232
        38: aload_1
        39: ldc           #7                  // String _bbsclan
        41: invokevirtual #36                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        44: ifeq          226
        47: new           #39                 // class java/util/StringTokenizer
        50: dup
        51: aload_1
        52: ldc           #41                 // String ;
        54: invokespecial #43                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
        57: astore_3
        58: aload_3
        59: invokevirtual #46                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        62: pop
        63: aload_3
        64: invokevirtual #46                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        67: astore        4
        69: aload         4
        71: ldc           #50                 // String clan
        73: invokevirtual #9                  // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        76: ifeq          93
        79: aload_2
        80: aload_3
        81: invokevirtual #46                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        84: invokestatic  #52                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        87: invokestatic  #21                 // Method sendClanList:(Lext/mods/gameserver/model/actor/Player;I)V
        90: goto          223
        93: aload         4
        95: ldc           #58                 // String home
        97: invokevirtual #9                  // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       100: ifeq          117
       103: aload_2
       104: aload_3
       105: invokevirtual #46                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       108: invokestatic  #52                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       111: invokestatic  #33                 // Method sendClanDetails:(Lext/mods/gameserver/model/actor/Player;I)V
       114: goto          223
       117: aload         4
       119: ldc           #60                 // String mail
       121: invokevirtual #9                  // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       124: ifeq          141
       127: aload_2
       128: aload_3
       129: invokevirtual #46                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       132: invokestatic  #52                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       135: invokestatic  #62                 // Method sendClanMail:(Lext/mods/gameserver/model/actor/Player;I)V
       138: goto          223
       141: aload         4
       143: ldc           #65                 // String management
       145: invokevirtual #9                  // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       148: ifeq          165
       151: aload_2
       152: aload_3
       153: invokevirtual #46                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       156: invokestatic  #52                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       159: invokestatic  #67                 // Method sendClanManagement:(Lext/mods/gameserver/model/actor/Player;I)V
       162: goto          223
       165: aload         4
       167: ldc           #70                 // String notice
       169: invokevirtual #9                  // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       172: ifeq          223
       175: aload_3
       176: invokevirtual #72                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
       179: ifeq          215
       182: aload_3
       183: invokevirtual #46                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       186: astore        5
       188: aload         5
       190: invokevirtual #76                 // Method java/lang/String.isEmpty:()Z
       193: ifne          215
       196: aload_2
       197: invokevirtual #15                 // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       200: ifnull        215
       203: aload_2
       204: invokevirtual #15                 // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       207: aload         5
       209: invokestatic  #79                 // Method java/lang/Boolean.parseBoolean:(Ljava/lang/String;)Z
       212: invokevirtual #84                 // Method ext/mods/gameserver/model/pledge/Clan.setNotice:(Z)V
       215: aload_2
       216: aload_2
       217: invokevirtual #88                 // Method ext/mods/gameserver/model/actor/Player.getClanId:()I
       220: invokestatic  #89                 // Method sendClanNotice:(Lext/mods/gameserver/model/actor/Player;I)V
       223: goto          232
       226: aload_0
       227: aload_1
       228: aload_2
       229: invokespecial #92                 // Method ext/mods/gameserver/communitybbs/manager/BaseBBSManager.parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       232: return
      LineNumberTable:
        line 40: 0
        line 42: 9
        line 43: 16
        line 45: 24
        line 47: 38
        line 49: 47
        line 50: 58
        line 52: 63
        line 53: 69
        line 54: 79
        line 55: 93
        line 56: 103
        line 57: 117
        line 58: 127
        line 59: 141
        line 60: 151
        line 61: 165
        line 63: 175
        line 65: 182
        line 66: 188
        line 67: 203
        line 69: 215
        line 71: 223
        line 73: 226
        line 74: 232
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          188      27     5 noticeCommand   Ljava/lang/String;
           58     165     3    st   Ljava/util/StringTokenizer;
           69     154     4 clanCommand   Ljava/lang/String;
            0     233     0  this   Lext/mods/gameserver/communitybbs/manager/ClanBBSManager;
            0     233     1 command   Ljava/lang/String;
            0     233     2 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 10
        frame_type = 24 /* same */
        frame_type = 13 /* same */
        frame_type = 253 /* append */
          offset_delta = 54
          locals = [ class java/util/StringTokenizer, class java/lang/String ]
        frame_type = 23 /* same */
        frame_type = 23 /* same */
        frame_type = 23 /* same */
        frame_type = 49 /* same */
        frame_type = 249 /* chop */
          offset_delta = 7
        frame_type = 2 /* same */
        frame_type = 5 /* same */

  public void parseWrite(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=11, args_size=7
         0: aload_1
         1: ldc           #96                 // String intro
         3: invokevirtual #9                  // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
         6: ifeq          66
         9: aload_2
        10: invokestatic  #98                 // Method java/lang/Integer.valueOf:(Ljava/lang/String;)Ljava/lang/Integer;
        13: invokevirtual #102                // Method java/lang/Integer.intValue:()I
        16: aload         6
        18: invokevirtual #88                 // Method ext/mods/gameserver/model/actor/Player.getClanId:()I
        21: if_icmpeq     25
        24: return
        25: invokestatic  #105                // Method ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
        28: aload         6
        30: invokevirtual #88                 // Method ext/mods/gameserver/model/actor/Player.getClanId:()I
        33: invokevirtual #111                // Method ext/mods/gameserver/data/sql/ClanTable.getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
        36: astore        7
        38: aload         7
        40: ifnonnull     44
        43: return
        44: aload         7
        46: aload_3
        47: iconst_1
        48: invokevirtual #114                // Method ext/mods/gameserver/model/pledge/Clan.setIntroduction:(Ljava/lang/String;Z)V
        51: aload         6
        53: aload_2
        54: invokestatic  #98                 // Method java/lang/Integer.valueOf:(Ljava/lang/String;)Ljava/lang/Integer;
        57: invokevirtual #102                // Method java/lang/Integer.intValue:()I
        60: invokestatic  #67                 // Method sendClanManagement:(Lext/mods/gameserver/model/actor/Player;I)V
        63: goto          267
        66: aload_1
        67: ldc           #70                 // String notice
        69: invokevirtual #118                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        72: ifeq          107
        75: aload         6
        77: invokevirtual #15                 // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        80: astore        7
        82: aload         7
        84: ifnull        104
        87: aload         7
        89: aload         4
        91: invokevirtual #122                // Method ext/mods/gameserver/model/pledge/Clan.setNotice:(Ljava/lang/String;)V
        94: aload         6
        96: aload         6
        98: invokevirtual #88                 // Method ext/mods/gameserver/model/actor/Player.getClanId:()I
       101: invokestatic  #89                 // Method sendClanNotice:(Lext/mods/gameserver/model/actor/Player;I)V
       104: goto          267
       107: aload_1
       108: ldc           #60                 // String mail
       110: invokevirtual #9                  // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       113: ifeq          254
       116: aload_2
       117: invokestatic  #98                 // Method java/lang/Integer.valueOf:(Ljava/lang/String;)Ljava/lang/Integer;
       120: invokevirtual #102                // Method java/lang/Integer.intValue:()I
       123: aload         6
       125: invokevirtual #88                 // Method ext/mods/gameserver/model/actor/Player.getClanId:()I
       128: if_icmpeq     132
       131: return
       132: invokestatic  #105                // Method ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
       135: aload         6
       137: invokevirtual #88                 // Method ext/mods/gameserver/model/actor/Player.getClanId:()I
       140: invokevirtual #111                // Method ext/mods/gameserver/data/sql/ClanTable.getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
       143: astore        7
       145: aload         7
       147: ifnonnull     151
       150: return
       151: new           #125                // class java/lang/StringBuilder
       154: dup
       155: invokespecial #127                // Method java/lang/StringBuilder."<init>":()V
       158: astore        8
       160: aload         7
       162: invokevirtual #128                // Method ext/mods/gameserver/model/pledge/Clan.getMembers:()Ljava/util/Collection;
       165: invokeinterface #132,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
       170: astore        9
       172: aload         9
       174: invokeinterface #138,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       179: ifeq          224
       182: aload         9
       184: invokeinterface #143,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       189: checkcast     #147                // class ext/mods/gameserver/model/pledge/ClanMember
       192: astore        10
       194: aload         8
       196: invokevirtual #149                // Method java/lang/StringBuilder.length:()I
       199: ifle          210
       202: aload         8
       204: ldc           #41                 // String ;
       206: invokevirtual #152                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       209: pop
       210: aload         8
       212: aload         10
       214: invokevirtual #156                // Method ext/mods/gameserver/model/pledge/ClanMember.getName:()Ljava/lang/String;
       217: invokevirtual #152                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       220: pop
       221: goto          172
       224: invokestatic  #159                // Method ext/mods/gameserver/communitybbs/manager/MailBBSManager.getInstance:()Lext/mods/gameserver/communitybbs/manager/MailBBSManager;
       227: aload         8
       229: invokevirtual #164                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
       232: aload         4
       234: aload         5
       236: aload         6
       238: invokevirtual #167                // Method ext/mods/gameserver/communitybbs/manager/MailBBSManager.sendMail:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       241: aload         6
       243: aload         6
       245: invokevirtual #88                 // Method ext/mods/gameserver/model/actor/Player.getClanId:()I
       248: invokestatic  #33                 // Method sendClanDetails:(Lext/mods/gameserver/model/actor/Player;I)V
       251: goto          267
       254: aload_0
       255: aload_1
       256: aload_2
       257: aload_3
       258: aload         4
       260: aload         5
       262: aload         6
       264: invokespecial #171                // Method ext/mods/gameserver/communitybbs/manager/BaseBBSManager.parseWrite:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       267: return
      LineNumberTable:
        line 79: 0
        line 81: 9
        line 82: 24
        line 84: 25
        line 85: 38
        line 86: 43
        line 88: 44
        line 89: 51
        line 90: 63
        line 91: 66
        line 93: 75
        line 94: 82
        line 96: 87
        line 97: 94
        line 99: 104
        line 100: 107
        line 102: 116
        line 103: 131
        line 105: 132
        line 106: 145
        line 107: 150
        line 109: 151
        line 111: 160
        line 113: 194
        line 114: 202
        line 116: 210
        line 117: 221
        line 118: 224
        line 119: 241
        line 120: 251
        line 122: 254
        line 123: 267
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           38      25     7  clan   Lext/mods/gameserver/model/pledge/Clan;
           82      22     7  clan   Lext/mods/gameserver/model/pledge/Clan;
          194      27    10 member   Lext/mods/gameserver/model/pledge/ClanMember;
          145     106     7  clan   Lext/mods/gameserver/model/pledge/Clan;
          160      91     8 members   Ljava/lang/StringBuilder;
            0     268     0  this   Lext/mods/gameserver/communitybbs/manager/ClanBBSManager;
            0     268     1   ar1   Ljava/lang/String;
            0     268     2   ar2   Ljava/lang/String;
            0     268     3   ar3   Ljava/lang/String;
            0     268     4   ar4   Ljava/lang/String;
            0     268     5   ar5   Ljava/lang/String;
            0     268     6 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 12
        frame_type = 25 /* same */
        frame_type = 252 /* append */
          offset_delta = 18
          locals = [ class ext/mods/gameserver/model/pledge/Clan ]
        frame_type = 250 /* chop */
          offset_delta = 21
        frame_type = 37 /* same */
        frame_type = 2 /* same */
        frame_type = 24 /* same */
        frame_type = 252 /* append */
          offset_delta = 18
          locals = [ class ext/mods/gameserver/model/pledge/Clan ]
        frame_type = 253 /* append */
          offset_delta = 20
          locals = [ class java/lang/StringBuilder, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 37
          locals = [ class ext/mods/gameserver/model/pledge/ClanMember ]
        frame_type = 249 /* chop */
          offset_delta = 13
        frame_type = 249 /* chop */
          offset_delta = 29
        frame_type = 12 /* same */

  protected java.lang.String getFolder();
    descriptor: ()Ljava/lang/String;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: ldc           #175                // String clan/
         2: areturn
      LineNumberTable:
        line 128: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       3     0  this   Lext/mods/gameserver/communitybbs/manager/ClanBBSManager;

  public static ext.mods.gameserver.communitybbs.manager.ClanBBSManager getInstance();
    descriptor: ()Lext/mods/gameserver/communitybbs/manager/ClanBBSManager;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #376                // Field ext/mods/gameserver/communitybbs/manager/ClanBBSManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/communitybbs/manager/ClanBBSManager;
         3: areturn
      LineNumberTable:
        line 284: 0
}
SourceFile: "ClanBBSManager.java"
NestMembers:
  ext/mods/gameserver/communitybbs/manager/ClanBBSManager$SingletonHolder
BootstrapMethods:
  0: #421 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #419 [\u0001]
InnerClasses:
  public static final #433= #429 of #431; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
