// Bytecode for: ext.mods.gameserver.communitybbs.manager.MailBBSManager
// File: ext\mods\gameserver\communitybbs\manager\MailBBSManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/communitybbs/manager/MailBBSManager.class
  Last modified 9 de jul de 2026; size 23057 bytes
  MD5 checksum 3b5780bc36f9171492a90e10f1e3bf3a
  Compiled from "MailBBSManager.java"
public class ext.mods.gameserver.communitybbs.manager.MailBBSManager extends ext.mods.gameserver.communitybbs.manager.BaseBBSManager
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/communitybbs/manager/MailBBSManager
  super_class: #2                         // ext/mods/gameserver/communitybbs/manager/BaseBBSManager
  interfaces: 0, fields: 7, methods: 27, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/communitybbs/manager/BaseBBSManager."<init>":()V
    #2 = Class              #4            // ext/mods/gameserver/communitybbs/manager/BaseBBSManager
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               ext/mods/gameserver/communitybbs/manager/BaseBBSManager
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/concurrent/ConcurrentHashMap
    #8 = Utf8               java/util/concurrent/ConcurrentHashMap
    #9 = Methodref          #7.#3         // java/util/concurrent/ConcurrentHashMap."<init>":()V
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/communitybbs/manager/MailBBSManager._mails:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/gameserver/communitybbs/manager/MailBBSManager
   #12 = NameAndType        #14:#15       // _mails:Ljava/util/Map;
   #13 = Utf8               ext/mods/gameserver/communitybbs/manager/MailBBSManager
   #14 = Utf8               _mails
   #15 = Utf8               Ljava/util/Map;
   #16 = Fieldref           #11.#17       // ext/mods/gameserver/communitybbs/manager/MailBBSManager._lastMailId:I
   #17 = NameAndType        #18:#19       // _lastMailId:I
   #18 = Utf8               _lastMailId
   #19 = Utf8               I
   #20 = Methodref          #21.#22       // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
   #21 = Class              #23           // ext/mods/commons/pool/ConnectionPool
   #22 = NameAndType        #24:#25       // getConnection:()Ljava/sql/Connection;
   #23 = Utf8               ext/mods/commons/pool/ConnectionPool
   #24 = Utf8               getConnection
   #25 = Utf8               ()Ljava/sql/Connection;
   #26 = String             #27           // SELECT * FROM bbs_mail ORDER BY id ASC
   #27 = Utf8               SELECT * FROM bbs_mail ORDER BY id ASC
   #28 = InterfaceMethodref #29.#30       // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #29 = Class              #31           // java/sql/Connection
   #30 = NameAndType        #32:#33       // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #31 = Utf8               java/sql/Connection
   #32 = Utf8               prepareStatement
   #33 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #34 = InterfaceMethodref #35.#36       // java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
   #35 = Class              #37           // java/sql/PreparedStatement
   #36 = NameAndType        #38:#39       // executeQuery:()Ljava/sql/ResultSet;
   #37 = Utf8               java/sql/PreparedStatement
   #38 = Utf8               executeQuery
   #39 = Utf8               ()Ljava/sql/ResultSet;
   #40 = InterfaceMethodref #41.#42       // java/sql/ResultSet.next:()Z
   #41 = Class              #43           // java/sql/ResultSet
   #42 = NameAndType        #44:#45       // next:()Z
   #43 = Utf8               java/sql/ResultSet
   #44 = Utf8               next
   #45 = Utf8               ()Z
   #46 = String             #47           // receiver_id
   #47 = Utf8               receiver_id
   #48 = InterfaceMethodref #41.#49       // java/sql/ResultSet.getInt:(Ljava/lang/String;)I
   #49 = NameAndType        #50:#51       // getInt:(Ljava/lang/String;)I
   #50 = Utf8               getInt
   #51 = Utf8               (Ljava/lang/String;)I
   #52 = Methodref          #53.#54       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #53 = Class              #55           // java/lang/Integer
   #54 = NameAndType        #56:#57       // valueOf:(I)Ljava/lang/Integer;
   #55 = Utf8               java/lang/Integer
   #56 = Utf8               valueOf
   #57 = Utf8               (I)Ljava/lang/Integer;
   #58 = InvokeDynamic      #0:#59        // #0:apply:()Ljava/util/function/Function;
   #59 = NameAndType        #60:#61       // apply:()Ljava/util/function/Function;
   #60 = Utf8               apply
   #61 = Utf8               ()Ljava/util/function/Function;
   #62 = InterfaceMethodref #63.#64       // java/util/Map.computeIfAbsent:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
   #63 = Class              #65           // java/util/Map
   #64 = NameAndType        #66:#67       // computeIfAbsent:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
   #65 = Utf8               java/util/Map
   #66 = Utf8               computeIfAbsent
   #67 = Utf8               (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
   #68 = Class              #69           // java/util/Set
   #69 = Utf8               java/util/Set
   #70 = Class              #71           // ext/mods/gameserver/communitybbs/model/Mail
   #71 = Utf8               ext/mods/gameserver/communitybbs/model/Mail
   #72 = Methodref          #70.#73       // ext/mods/gameserver/communitybbs/model/Mail."<init>":(Ljava/sql/ResultSet;)V
   #73 = NameAndType        #5:#74        // "<init>":(Ljava/sql/ResultSet;)V
   #74 = Utf8               (Ljava/sql/ResultSet;)V
   #75 = InterfaceMethodref #68.#76       // java/util/Set.add:(Ljava/lang/Object;)Z
   #76 = NameAndType        #77:#78       // add:(Ljava/lang/Object;)Z
   #77 = Utf8               add
   #78 = Utf8               (Ljava/lang/Object;)Z
   #79 = String             #80           // id
   #80 = Utf8               id
   #81 = InterfaceMethodref #41.#82       // java/sql/ResultSet.close:()V
   #82 = NameAndType        #83:#6        // close:()V
   #83 = Utf8               close
   #84 = Class              #85           // java/lang/Throwable
   #85 = Utf8               java/lang/Throwable
   #86 = Methodref          #84.#87       // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
   #87 = NameAndType        #88:#89       // addSuppressed:(Ljava/lang/Throwable;)V
   #88 = Utf8               addSuppressed
   #89 = Utf8               (Ljava/lang/Throwable;)V
   #90 = InterfaceMethodref #35.#82       // java/sql/PreparedStatement.close:()V
   #91 = InterfaceMethodref #29.#82       // java/sql/Connection.close:()V
   #92 = Class              #93           // java/lang/Exception
   #93 = Utf8               java/lang/Exception
   #94 = Fieldref           #11.#95       // ext/mods/gameserver/communitybbs/manager/MailBBSManager.LOGGER:Lext/mods/commons/logging/CLogger;
   #95 = NameAndType        #96:#97       // LOGGER:Lext/mods/commons/logging/CLogger;
   #96 = Utf8               LOGGER
   #97 = Utf8               Lext/mods/commons/logging/CLogger;
   #98 = String             #99           // Couldn\'t load mails.
   #99 = Utf8               Couldn\'t load mails.
  #100 = Methodref          #101.#102     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #101 = Class              #103          // ext/mods/commons/logging/CLogger
  #102 = NameAndType        #104:#105     // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #103 = Utf8               ext/mods/commons/logging/CLogger
  #104 = Utf8               error
  #105 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
  #106 = String             #107          // _bbsmail
  #107 = Utf8               _bbsmail
  #108 = Methodref          #109.#110     // java/lang/String.equals:(Ljava/lang/Object;)Z
  #109 = Class              #111          // java/lang/String
  #110 = NameAndType        #112:#78      // equals:(Ljava/lang/Object;)Z
  #111 = Utf8               java/lang/String
  #112 = Utf8               equals
  #113 = String             #114          // _maillist_0_1_0_
  #114 = Utf8               _maillist_0_1_0_
  #115 = Fieldref           #116.#117     // ext/mods/gameserver/enums/MailType.INBOX:Lext/mods/gameserver/enums/MailType;
  #116 = Class              #118          // ext/mods/gameserver/enums/MailType
  #117 = NameAndType        #119:#120     // INBOX:Lext/mods/gameserver/enums/MailType;
  #118 = Utf8               ext/mods/gameserver/enums/MailType
  #119 = Utf8               INBOX
  #120 = Utf8               Lext/mods/gameserver/enums/MailType;
  #121 = Methodref          #11.#122      // ext/mods/gameserver/communitybbs/manager/MailBBSManager.showMailList:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/enums/MailType;)V
  #122 = NameAndType        #123:#124     // showMailList:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/enums/MailType;)V
  #123 = Utf8               showMailList
  #124 = Utf8               (Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/enums/MailType;)V
  #125 = Methodref          #109.#126     // java/lang/String.startsWith:(Ljava/lang/String;)Z
  #126 = NameAndType        #127:#128     // startsWith:(Ljava/lang/String;)Z
  #127 = Utf8               startsWith
  #128 = Utf8               (Ljava/lang/String;)Z
  #129 = Class              #130          // java/util/StringTokenizer
  #130 = Utf8               java/util/StringTokenizer
  #131 = String             #132          // ;
  #132 = Utf8               ;
  #133 = Methodref          #129.#134     // java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
  #134 = NameAndType        #5:#135       // "<init>":(Ljava/lang/String;Ljava/lang/String;)V
  #135 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #136 = Methodref          #129.#137     // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
  #137 = NameAndType        #138:#139     // nextToken:()Ljava/lang/String;
  #138 = Utf8               nextToken
  #139 = Utf8               ()Ljava/lang/String;
  #140 = String             #141          // inbox
  #141 = Utf8               inbox
  #142 = String             #143          // sentbox
  #143 = Utf8               sentbox
  #144 = String             #145          // archive
  #145 = Utf8               archive
  #146 = String             #147          // temparchive
  #147 = Utf8               temparchive
  #148 = Methodref          #129.#149     // java/util/StringTokenizer.hasMoreTokens:()Z
  #149 = NameAndType        #150:#45      // hasMoreTokens:()Z
  #150 = Utf8               hasMoreTokens
  #151 = Methodref          #53.#152      // java/lang/Integer.parseInt:(Ljava/lang/String;)I
  #152 = NameAndType        #153:#51      // parseInt:(Ljava/lang/String;)I
  #153 = Utf8               parseInt
  #154 = String             #155          //
  #155 = Utf8
  #156 = Methodref          #109.#157     // java/lang/String.toUpperCase:()Ljava/lang/String;
  #157 = NameAndType        #158:#139     // toUpperCase:()Ljava/lang/String;
  #158 = Utf8               toUpperCase
  #159 = Methodref          #160.#161     // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #160 = Class              #162          // java/lang/Enum
  #161 = NameAndType        #56:#163      // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #162 = Utf8               java/lang/Enum
  #163 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #164 = Methodref          #11.#165      // ext/mods/gameserver/communitybbs/manager/MailBBSManager.showMailList:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/enums/MailType;Ljava/lang/String;Ljava/lang/String;)V
  #165 = NameAndType        #123:#166     // showMailList:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/enums/MailType;Ljava/lang/String;Ljava/lang/String;)V
  #166 = Utf8               (Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/enums/MailType;Ljava/lang/String;Ljava/lang/String;)V
  #167 = String             #168          // crea
  #168 = Utf8               crea
  #169 = Methodref          #11.#170      // ext/mods/gameserver/communitybbs/manager/MailBBSManager.showWriteView:(Lext/mods/gameserver/model/actor/Player;)V
  #170 = NameAndType        #171:#172     // showWriteView:(Lext/mods/gameserver/model/actor/Player;)V
  #171 = Utf8               showWriteView
  #172 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #173 = Methodref          #11.#174      // ext/mods/gameserver/communitybbs/manager/MailBBSManager.getMail:(Lext/mods/gameserver/model/actor/Player;I)Lext/mods/gameserver/communitybbs/model/Mail;
  #174 = NameAndType        #175:#176     // getMail:(Lext/mods/gameserver/model/actor/Player;I)Lext/mods/gameserver/communitybbs/model/Mail;
  #175 = Utf8               getMail
  #176 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)Lext/mods/gameserver/communitybbs/model/Mail;
  #177 = Methodref          #11.#178      // ext/mods/gameserver/communitybbs/manager/MailBBSManager.showLastForum:(Lext/mods/gameserver/model/actor/Player;)V
  #178 = NameAndType        #179:#172     // showLastForum:(Lext/mods/gameserver/model/actor/Player;)V
  #179 = Utf8               showLastForum
  #180 = String             #181          // view
  #181 = Utf8               view
  #182 = Methodref          #11.#183      // ext/mods/gameserver/communitybbs/manager/MailBBSManager.showMailView:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/communitybbs/model/Mail;)V
  #183 = NameAndType        #184:#185     // showMailView:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/communitybbs/model/Mail;)V
  #184 = Utf8               showMailView
  #185 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/communitybbs/model/Mail;)V
  #186 = Methodref          #70.#187      // ext/mods/gameserver/communitybbs/model/Mail.isUnread:()Z
  #187 = NameAndType        #188:#45      // isUnread:()Z
  #188 = Utf8               isUnread
  #189 = Methodref          #70.#190      // ext/mods/gameserver/communitybbs/model/Mail.getId:()I
  #190 = NameAndType        #191:#192     // getId:()I
  #191 = Utf8               getId
  #192 = Utf8               ()I
  #193 = Methodref          #11.#194      // ext/mods/gameserver/communitybbs/manager/MailBBSManager.setMailAsRead:(Lext/mods/gameserver/model/actor/Player;I)V
  #194 = NameAndType        #195:#196     // setMailAsRead:(Lext/mods/gameserver/model/actor/Player;I)V
  #195 = Utf8               setMailAsRead
  #196 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
  #197 = String             #198          // reply
  #198 = Utf8               reply
  #199 = Methodref          #11.#200      // ext/mods/gameserver/communitybbs/manager/MailBBSManager.showWriteView:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/communitybbs/model/Mail;)V
  #200 = NameAndType        #171:#185     // showWriteView:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/communitybbs/model/Mail;)V
  #201 = String             #202          // del
  #202 = Utf8               del
  #203 = Methodref          #11.#204      // ext/mods/gameserver/communitybbs/manager/MailBBSManager.deleteMail:(Lext/mods/gameserver/model/actor/Player;I)V
  #204 = NameAndType        #205:#196     // deleteMail:(Lext/mods/gameserver/model/actor/Player;I)V
  #205 = Utf8               deleteMail
  #206 = String             #207          // store
  #207 = Utf8               store
  #208 = Fieldref           #116.#209     // ext/mods/gameserver/enums/MailType.ARCHIVE:Lext/mods/gameserver/enums/MailType;
  #209 = NameAndType        #210:#120     // ARCHIVE:Lext/mods/gameserver/enums/MailType;
  #210 = Utf8               ARCHIVE
  #211 = Methodref          #11.#212      // ext/mods/gameserver/communitybbs/manager/MailBBSManager.setMailLocation:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/enums/MailType;)V
  #212 = NameAndType        #213:#124     // setMailLocation:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/enums/MailType;)V
  #213 = Utf8               setMailLocation
  #214 = Methodref          #2.#215       // ext/mods/gameserver/communitybbs/manager/BaseBBSManager.parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #215 = NameAndType        #216:#217     // parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #216 = Utf8               parseCmd
  #217 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #218 = String             #219          // Send
  #219 = Utf8               Send
  #220 = Methodref          #11.#221      // ext/mods/gameserver/communitybbs/manager/MailBBSManager.sendMail:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #221 = NameAndType        #222:#223     // sendMail:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #222 = Utf8               sendMail
  #223 = Utf8               (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #224 = Fieldref           #116.#225     // ext/mods/gameserver/enums/MailType.SENTBOX:Lext/mods/gameserver/enums/MailType;
  #225 = NameAndType        #226:#120     // SENTBOX:Lext/mods/gameserver/enums/MailType;
  #226 = Utf8               SENTBOX
  #227 = String             #228          // Search
  #228 = Utf8               Search
  #229 = Methodref          #2.#230       // ext/mods/gameserver/communitybbs/manager/BaseBBSManager.parseWrite:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #230 = NameAndType        #231:#232     // parseWrite:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #231 = Utf8               parseWrite
  #232 = Utf8               (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #233 = InvokeDynamic      #1:#59        // #1:apply:()Ljava/util/function/Function;
  #234 = Methodref          #235.#236     // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #235 = Class              #237          // ext/mods/gameserver/model/actor/Player
  #236 = NameAndType        #238:#192     // getObjectId:()I
  #237 = Utf8               ext/mods/gameserver/model/actor/Player
  #238 = Utf8               getObjectId
  #239 = Methodref          #11.#240      // ext/mods/gameserver/communitybbs/manager/MailBBSManager.getMails:(I)Ljava/util/Set;
  #240 = NameAndType        #241:#242     // getMails:(I)Ljava/util/Set;
  #241 = Utf8               getMails
  #242 = Utf8               (I)Ljava/util/Set;
  #243 = InterfaceMethodref #68.#244      // java/util/Set.stream:()Ljava/util/stream/Stream;
  #244 = NameAndType        #245:#246     // stream:()Ljava/util/stream/Stream;
  #245 = Utf8               stream
  #246 = Utf8               ()Ljava/util/stream/Stream;
  #247 = InvokeDynamic      #2:#248       // #2:test:(I)Ljava/util/function/Predicate;
  #248 = NameAndType        #249:#250     // test:(I)Ljava/util/function/Predicate;
  #249 = Utf8               test
  #250 = Utf8               (I)Ljava/util/function/Predicate;
  #251 = InterfaceMethodref #252.#253     // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #252 = Class              #254          // java/util/stream/Stream
  #253 = NameAndType        #255:#256     // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #254 = Utf8               java/util/stream/Stream
  #255 = Utf8               filter
  #256 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #257 = InterfaceMethodref #252.#258     // java/util/stream/Stream.findFirst:()Ljava/util/Optional;
  #258 = NameAndType        #259:#260     // findFirst:()Ljava/util/Optional;
  #259 = Utf8               findFirst
  #260 = Utf8               ()Ljava/util/Optional;
  #261 = Methodref          #262.#263     // java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
  #262 = Class              #264          // java/util/Optional
  #263 = NameAndType        #265:#266     // orElse:(Ljava/lang/Object;)Ljava/lang/Object;
  #264 = Utf8               java/util/Optional
  #265 = Utf8               orElse
  #266 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #267 = InvokeDynamic      #3:#268       // #3:test:()Ljava/util/function/Predicate;
  #268 = NameAndType        #249:#269     // test:()Ljava/util/function/Predicate;
  #269 = Utf8               ()Ljava/util/function/Predicate;
  #270 = InterfaceMethodref #252.#271     // java/util/stream/Stream.anyMatch:(Ljava/util/function/Predicate;)Z
  #271 = NameAndType        #272:#273     // anyMatch:(Ljava/util/function/Predicate;)Z
  #272 = Utf8               anyMatch
  #273 = Utf8               (Ljava/util/function/Predicate;)Z
  #274 = Methodref          #7.#275       // java/util/concurrent/ConcurrentHashMap.newKeySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
  #275 = NameAndType        #276:#277     // newKeySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
  #276 = Utf8               newKeySet
  #277 = Utf8               ()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
  #278 = String             #279          // title
  #279 = Utf8               title
  #280 = Methodref          #109.#281     // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
  #281 = NameAndType        #282:#128     // equalsIgnoreCase:(Ljava/lang/String;)Z
  #282 = Utf8               equalsIgnoreCase
  #283 = InterfaceMethodref #68.#284      // java/util/Set.iterator:()Ljava/util/Iterator;
  #284 = NameAndType        #285:#286     // iterator:()Ljava/util/Iterator;
  #285 = Utf8               iterator
  #286 = Utf8               ()Ljava/util/Iterator;
  #287 = InterfaceMethodref #288.#289     // java/util/Iterator.hasNext:()Z
  #288 = Class              #290          // java/util/Iterator
  #289 = NameAndType        #291:#45      // hasNext:()Z
  #290 = Utf8               java/util/Iterator
  #291 = Utf8               hasNext
  #292 = InterfaceMethodref #288.#293     // java/util/Iterator.next:()Ljava/lang/Object;
  #293 = NameAndType        #44:#294      // next:()Ljava/lang/Object;
  #294 = Utf8               ()Ljava/lang/Object;
  #295 = Methodref          #70.#296      // ext/mods/gameserver/communitybbs/model/Mail.getSubject:()Ljava/lang/String;
  #296 = NameAndType        #297:#139     // getSubject:()Ljava/lang/String;
  #297 = Utf8               getSubject
  #298 = Methodref          #109.#299     // java/lang/String.toLowerCase:()Ljava/lang/String;
  #299 = NameAndType        #300:#139     // toLowerCase:()Ljava/lang/String;
  #300 = Utf8               toLowerCase
  #301 = Methodref          #109.#302     // java/lang/String.contains:(Ljava/lang/CharSequence;)Z
  #302 = NameAndType        #303:#304     // contains:(Ljava/lang/CharSequence;)Z
  #303 = Utf8               contains
  #304 = Utf8               (Ljava/lang/CharSequence;)Z
  #305 = Methodref          #70.#306      // ext/mods/gameserver/communitybbs/model/Mail.getSenderId:()I
  #306 = NameAndType        #307:#192     // getSenderId:()I
  #307 = Utf8               getSenderId
  #308 = Methodref          #11.#309      // ext/mods/gameserver/communitybbs/manager/MailBBSManager.getPlayerName:(I)Ljava/lang/String;
  #309 = NameAndType        #310:#311     // getPlayerName:(I)Ljava/lang/String;
  #310 = Utf8               getPlayerName
  #311 = Utf8               (I)Ljava/lang/String;
  #312 = Methodref          #11.#313      // ext/mods/gameserver/communitybbs/manager/MailBBSManager.getMailCount:(ILext/mods/gameserver/enums/MailType;Ljava/lang/String;Ljava/lang/String;)I
  #313 = NameAndType        #314:#315     // getMailCount:(ILext/mods/gameserver/enums/MailType;Ljava/lang/String;Ljava/lang/String;)I
  #314 = Utf8               getMailCount
  #315 = Utf8               (ILext/mods/gameserver/enums/MailType;Ljava/lang/String;Ljava/lang/String;)I
  #316 = Methodref          #11.#317      // ext/mods/gameserver/communitybbs/manager/MailBBSManager.getPagesCount:(I)I
  #317 = NameAndType        #318:#319     // getPagesCount:(I)I
  #318 = Utf8               getPagesCount
  #319 = Utf8               (I)I
  #320 = Methodref          #235.#321     // ext/mods/gameserver/model/actor/Player.setMailPosition:(I)V
  #321 = NameAndType        #322:#323     // setMailPosition:(I)V
  #322 = Utf8               setMailPosition
  #323 = Utf8               (I)V
  #324 = Methodref          #325.#326     // ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
  #325 = Class              #327          // ext/mods/gameserver/data/HTMLData
  #326 = NameAndType        #328:#329     // getInstance:()Lext/mods/gameserver/data/HTMLData;
  #327 = Utf8               ext/mods/gameserver/data/HTMLData
  #328 = Utf8               getInstance
  #329 = Utf8               ()Lext/mods/gameserver/data/HTMLData;
  #330 = String             #331          // html/CommunityBoard/mail/mail.htm
  #331 = Utf8               html/CommunityBoard/mail/mail.htm
  #332 = Methodref          #325.#333     // ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
  #333 = NameAndType        #334:#335     // getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
  #334 = Utf8               getHtm
  #335 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
  #336 = String             #337          // %inbox%
  #337 = Utf8               %inbox%
  #338 = Methodref          #53.#339      // java/lang/Integer.toString:(I)Ljava/lang/String;
  #339 = NameAndType        #340:#311     // toString:(I)Ljava/lang/String;
  #340 = Utf8               toString
  #341 = Methodref          #109.#342     // java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #342 = NameAndType        #343:#344     // replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #343 = Utf8               replace
  #344 = Utf8               (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #345 = String             #346          // %sentbox%
  #346 = Utf8               %sentbox%
  #347 = String             #348          // %archive%
  #348 = Utf8               %archive%
  #349 = String             #350          // %temparchive%
  #350 = Utf8               %temparchive%
  #351 = Fieldref           #116.#352     // ext/mods/gameserver/enums/MailType.TEMPARCHIVE:Lext/mods/gameserver/enums/MailType;
  #352 = NameAndType        #353:#120     // TEMPARCHIVE:Lext/mods/gameserver/enums/MailType;
  #353 = Utf8               TEMPARCHIVE
  #354 = String             #355          // %type%
  #355 = Utf8               %type%
  #356 = Methodref          #116.#357     // ext/mods/gameserver/enums/MailType.getDescription:()Ljava/lang/String;
  #357 = NameAndType        #358:#139     // getDescription:()Ljava/lang/String;
  #358 = Utf8               getDescription
  #359 = String             #360          // %htype%
  #360 = Utf8               %htype%
  #361 = Methodref          #116.#362     // ext/mods/gameserver/enums/MailType.toString:()Ljava/lang/String;
  #362 = NameAndType        #340:#139     // toString:()Ljava/lang/String;
  #363 = Class              #364          // java/lang/StringBuilder
  #364 = Utf8               java/lang/StringBuilder
  #365 = Methodref          #363.#3       // java/lang/StringBuilder."<init>":()V
  #366 = Methodref          #70.#367      // ext/mods/gameserver/communitybbs/model/Mail.getMailType:()Lext/mods/gameserver/enums/MailType;
  #367 = NameAndType        #368:#369     // getMailType:()Lext/mods/gameserver/enums/MailType;
  #368 = Utf8               getMailType
  #369 = Utf8               ()Lext/mods/gameserver/enums/MailType;
  #370 = Methodref          #116.#110     // ext/mods/gameserver/enums/MailType.equals:(Ljava/lang/Object;)Z
  #371 = Class              #372          // java/lang/Object
  #372 = Utf8               java/lang/Object
  #373 = String             #374          // <table width=610><tr><td width=5></td><td width=150>
  #374 = Utf8               <table width=610><tr><td width=5></td><td width=150>
  #375 = String             #376          // </td><td width=300><a action=\"bypass _bbsmail;view;
  #376 = Utf8               </td><td width=300><a action=\"bypass _bbsmail;view;
  #377 = String             #378          // \">
  #378 = Utf8               \">
  #379 = Methodref          #380.#381     // ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #380 = Class              #382          // ext/mods/commons/lang/StringUtil
  #381 = NameAndType        #383:#384     // append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #382 = Utf8               ext/mods/commons/lang/StringUtil
  #383 = Utf8               append
  #384 = Utf8               (Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #385 = String             #386          // <font color=\"LEVEL\">
  #386 = Utf8               <font color=\"LEVEL\">
  #387 = Methodref          #363.#388     // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #388 = NameAndType        #383:#389     // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #389 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
  #390 = Methodref          #380.#391     // ext/mods/commons/lang/StringUtil.trimAndDress:(Ljava/lang/String;I)Ljava/lang/String;
  #391 = NameAndType        #392:#393     // trimAndDress:(Ljava/lang/String;I)Ljava/lang/String;
  #392 = Utf8               trimAndDress
  #393 = Utf8               (Ljava/lang/String;I)Ljava/lang/String;
  #394 = String             #395          // </font>
  #395 = Utf8               </font>
  #396 = String             #397          // </a></td><td width=150>
  #397 = Utf8               </a></td><td width=150>
  #398 = Methodref          #70.#399      // ext/mods/gameserver/communitybbs/model/Mail.getFormattedSentDate:()Ljava/lang/String;
  #399 = NameAndType        #400:#139     // getFormattedSentDate:()Ljava/lang/String;
  #400 = Utf8               getFormattedSentDate
  #401 = String             #402          // </td><td width=5></td></tr></table><img src=\"L2UI.Squaregray\" width=610 height=1>
  #402 = Utf8               </td><td width=5></td></tr></table><img src=\"L2UI.Squaregray\" width=610 height=1>
  #403 = String             #404          // %maillist%
  #404 = Utf8               %maillist%
  #405 = Methodref          #363.#362     // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #406 = Methodref          #363.#407     // java/lang/StringBuilder.setLength:(I)V
  #407 = NameAndType        #408:#323     // setLength:(I)V
  #408 = Utf8               setLength
  #409 = InvokeDynamic      #4:#410       // #4:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #410 = NameAndType        #411:#412     // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #411 = Utf8               makeConcatWithConstants
  #412 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #413 = String             #414          // <td><table><tr><td></td></tr><tr><td><button action=\"bypass _bbsmail;
  #414 = Utf8               <td><table><tr><td></td></tr><tr><td><button action=\"bypass _bbsmail;
  #415 = String             #416          // \" back=\"l2ui_ch3.prev1_down\" fore=\"l2ui_ch3.prev1\" width=16 height=16></td></tr></table></td>
  #416 = Utf8               \" back=\"l2ui_ch3.prev1_down\" fore=\"l2ui_ch3.prev1\" width=16 height=16></td></tr></table></td>
  #417 = String             #418          // <td>
  #418 = Utf8               <td>
  #419 = String             #420          //  </td>
  #420 = Utf8                </td>
  #421 = String             #422          // <td><a action=\"bypass _bbsmail;
  #422 = Utf8               <td><a action=\"bypass _bbsmail;
  #423 = String             #424          // \">
  #424 = Utf8               \">
  #425 = String             #426          //  </a></td>
  #426 = Utf8                </a></td>
  #427 = String             #428          // \" back=\"l2ui_ch3.next1_down\" fore=\"l2ui_ch3.next1\" width=16 height=16 ></td></tr></table></td>
  #428 = Utf8               \" back=\"l2ui_ch3.next1_down\" fore=\"l2ui_ch3.next1\" width=16 height=16 ></td></tr></table></td>
  #429 = String             #430          // %maillistlength%
  #430 = Utf8               %maillistlength%
  #431 = Methodref          #11.#432      // ext/mods/gameserver/communitybbs/manager/MailBBSManager.separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #432 = NameAndType        #433:#217     // separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #433 = Utf8               separateAndSend
  #434 = String             #435          // html/CommunityBoard/mail/mail-show.htm
  #435 = Utf8               html/CommunityBoard/mail/mail-show.htm
  #436 = Methodref          #116.#437     // ext/mods/gameserver/enums/MailType.getBypass:()Ljava/lang/String;
  #437 = NameAndType        #438:#139     // getBypass:()Ljava/lang/String;
  #438 = Utf8               getBypass
  #439 = InvokeDynamic      #5:#410       // #5:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #440 = String             #441          // %maillink%
  #441 = Utf8               %maillink%
  #442 = String             #443          // %writer%
  #443 = Utf8               %writer%
  #444 = String             #445          // %sentDate%
  #445 = Utf8               %sentDate%
  #446 = String             #447          // %receiver%
  #447 = Utf8               %receiver%
  #448 = Methodref          #70.#449      // ext/mods/gameserver/communitybbs/model/Mail.getRecipients:()Ljava/lang/String;
  #449 = NameAndType        #450:#139     // getRecipients:()Ljava/lang/String;
  #450 = Utf8               getRecipients
  #451 = String             #452          // %delDate%
  #452 = Utf8               %delDate%
  #453 = String             #454          // Unknown
  #454 = Utf8               Unknown
  #455 = String             #456          // %title%
  #456 = Utf8               %title%
  #457 = String             #458          // <
  #458 = Utf8               <
  #459 = String             #460          // &lt;
  #460 = Utf8               &lt;
  #461 = Methodref          #109.#462     // java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #462 = NameAndType        #463:#412     // replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #463 = Utf8               replaceAll
  #464 = String             #465          // >
  #465 = Utf8               >
  #466 = String             #467          // &gt;
  #467 = Utf8               &gt;
  #468 = String             #469          // \"
  #469 = Utf8               \"
  #470 = String             #471          // &quot;
  #471 = Utf8               &quot;
  #472 = String             #473          // %mes%
  #473 = Utf8               %mes%
  #474 = Methodref          #70.#475      // ext/mods/gameserver/communitybbs/model/Mail.getMessage:()Ljava/lang/String;
  #475 = NameAndType        #476:#139     // getMessage:()Ljava/lang/String;
  #476 = Utf8               getMessage
  #477 = String             #478          // \r\n
  #478 = Utf8               \r\n
  #479 = String             #480          // <br>
  #480 = Utf8               <br>
  #481 = String             #482          // <br1>
  #482 = Utf8               <br1>
  #483 = String             #484          // |||BR1|||
  #484 = Utf8               |||BR1|||
  #485 = String             #486          // |||BR|||
  #486 = Utf8               |||BR|||
  #487 = String             #488          // %mailId%
  #488 = Utf8               %mailId%
  #489 = InvokeDynamic      #6:#490       // #6:makeConcatWithConstants:(I)Ljava/lang/String;
  #490 = NameAndType        #411:#311     // makeConcatWithConstants:(I)Ljava/lang/String;
  #491 = String             #492          // html/CommunityBoard/mail/mail-write.htm
  #492 = Utf8               html/CommunityBoard/mail/mail-write.htm
  #493 = String             #494          // html/CommunityBoard/mail/mail-reply.htm
  #494 = Utf8               html/CommunityBoard/mail/mail-reply.htm
  #495 = InvokeDynamic      #7:#496       // #7:makeConcatWithConstants:(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
  #496 = NameAndType        #411:#497     // makeConcatWithConstants:(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
  #497 = Utf8               (Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
  #498 = String             #499          // %recipients%
  #499 = Utf8               %recipients%
  #500 = Methodref          #11.#501      // ext/mods/gameserver/communitybbs/manager/MailBBSManager.send1001:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #501 = NameAndType        #502:#217     // send1001:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #502 = Utf8               send1001
  #503 = String             #504          //
  #504 = Utf8
  #505 = InvokeDynamic      #8:#506       // #8:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #506 = NameAndType        #411:#507     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #507 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #508 = String             #509          // 0
  #509 = Utf8               0
  #510 = Methodref          #11.#511      // ext/mods/gameserver/communitybbs/manager/MailBBSManager.send1002:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
  #511 = NameAndType        #512:#513     // send1002:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
  #512 = Utf8               send1002
  #513 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
  #514 = Methodref          #515.#516     // java/util/Calendar.getInstance:()Ljava/util/Calendar;
  #515 = Class              #517          // java/util/Calendar
  #516 = NameAndType        #328:#518     // getInstance:()Ljava/util/Calendar;
  #517 = Utf8               java/util/Calendar
  #518 = Utf8               ()Ljava/util/Calendar;
  #519 = Methodref          #515.#520     // java/util/Calendar.getTimeInMillis:()J
  #520 = NameAndType        #521:#522     // getTimeInMillis:()J
  #521 = Utf8               getTimeInMillis
  #522 = Utf8               ()J
  #523 = Class              #524          // java/sql/Timestamp
  #524 = Utf8               java/sql/Timestamp
  #525 = Long               86400000l
  #527 = Methodref          #523.#528     // java/sql/Timestamp."<init>":(J)V
  #528 = NameAndType        #5:#529       // "<init>":(J)V
  #529 = Utf8               (J)V
  #530 = InvokeDynamic      #9:#531       // #9:test:(Ljava/sql/Timestamp;)Ljava/util/function/Predicate;
  #531 = NameAndType        #249:#532     // test:(Ljava/sql/Timestamp;)Ljava/util/function/Predicate;
  #532 = Utf8               (Ljava/sql/Timestamp;)Ljava/util/function/Predicate;
  #533 = InterfaceMethodref #252.#534     // java/util/stream/Stream.count:()J
  #534 = NameAndType        #535:#522     // count:()J
  #535 = Utf8               count
  #536 = Long               10l
  #538 = Fieldref           #539.#540     // ext/mods/gameserver/network/SystemMessageId.NO_MORE_MESSAGES_TODAY:Lext/mods/gameserver/network/SystemMessageId;
  #539 = Class              #541          // ext/mods/gameserver/network/SystemMessageId
  #540 = NameAndType        #542:#543     // NO_MORE_MESSAGES_TODAY:Lext/mods/gameserver/network/SystemMessageId;
  #541 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #542 = Utf8               NO_MORE_MESSAGES_TODAY
  #543 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #544 = Methodref          #235.#545     // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #545 = NameAndType        #546:#547     // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #546 = Utf8               sendPacket
  #547 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #548 = Methodref          #109.#549     // java/lang/String.trim:()Ljava/lang/String;
  #549 = NameAndType        #550:#139     // trim:()Ljava/lang/String;
  #550 = Utf8               trim
  #551 = Methodref          #109.#552     // java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
  #552 = NameAndType        #553:#554     // split:(Ljava/lang/String;)[Ljava/lang/String;
  #553 = Utf8               split
  #554 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
  #555 = Methodref          #235.#556     // ext/mods/gameserver/model/actor/Player.isGM:()Z
  #556 = NameAndType        #557:#45      // isGM:()Z
  #557 = Utf8               isGM
  #558 = Fieldref           #539.#559     // ext/mods/gameserver/network/SystemMessageId.ONLY_FIVE_RECIPIENTS:Lext/mods/gameserver/network/SystemMessageId;
  #559 = NameAndType        #560:#543     // ONLY_FIVE_RECIPIENTS:Lext/mods/gameserver/network/SystemMessageId;
  #560 = Utf8               ONLY_FIVE_RECIPIENTS
  #561 = String             #562          // (no subject)
  #562 = Utf8               (no subject)
  #563 = Methodref          #380.#564     // ext/mods/commons/lang/StringUtil.trim:(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
  #564 = NameAndType        #550:#497     // trim:(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
  #565 = String             #566          // \n
  #566 = Utf8               \n
  #567 = Class              #568          // java/text/SimpleDateFormat
  #568 = Utf8               java/text/SimpleDateFormat
  #569 = String             #570          // yyyy-MM-dd HH:mm
  #570 = Utf8               yyyy-MM-dd HH:mm
  #571 = Methodref          #567.#572     // java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
  #572 = NameAndType        #5:#573       // "<init>":(Ljava/lang/String;)V
  #573 = Utf8               (Ljava/lang/String;)V
  #574 = Methodref          #567.#575     // java/text/SimpleDateFormat.format:(Ljava/util/Date;)Ljava/lang/String;
  #575 = NameAndType        #576:#577     // format:(Ljava/util/Date;)Ljava/lang/String;
  #576 = Utf8               format
  #577 = Utf8               (Ljava/util/Date;)Ljava/lang/String;
  #578 = String             #579          // INSERT INTO bbs_mail (id,receiver_id,sender_id,location,recipients,subject,message,sent_date,is_unread) VALUES (?,?,?,?,?,?,?,?,?)
  #579 = Utf8               INSERT INTO bbs_mail (id,receiver_id,sender_id,location,recipients,subject,message,sent_date,is_unread) VALUES (?,?,?,?,?,?,?,?,?)
  #580 = InterfaceMethodref #35.#581      // java/sql/PreparedStatement.setInt:(II)V
  #581 = NameAndType        #582:#583     // setInt:(II)V
  #582 = Utf8               setInt
  #583 = Utf8               (II)V
  #584 = InterfaceMethodref #35.#585      // java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
  #585 = NameAndType        #586:#587     // setString:(ILjava/lang/String;)V
  #586 = Utf8               setString
  #587 = Utf8               (ILjava/lang/String;)V
  #588 = InterfaceMethodref #35.#589      // java/sql/PreparedStatement.setTimestamp:(ILjava/sql/Timestamp;)V
  #589 = NameAndType        #590:#591     // setTimestamp:(ILjava/sql/Timestamp;)V
  #590 = Utf8               setTimestamp
  #591 = Utf8               (ILjava/sql/Timestamp;)V
  #592 = Methodref          #593.#594     // ext/mods/gameserver/data/sql/PlayerInfoTable.getInstance:()Lext/mods/gameserver/data/sql/PlayerInfoTable;
  #593 = Class              #595          // ext/mods/gameserver/data/sql/PlayerInfoTable
  #594 = NameAndType        #328:#596     // getInstance:()Lext/mods/gameserver/data/sql/PlayerInfoTable;
  #595 = Utf8               ext/mods/gameserver/data/sql/PlayerInfoTable
  #596 = Utf8               ()Lext/mods/gameserver/data/sql/PlayerInfoTable;
  #597 = Methodref          #593.#598     // ext/mods/gameserver/data/sql/PlayerInfoTable.getPlayerObjectId:(Ljava/lang/String;)I
  #598 = NameAndType        #599:#51      // getPlayerObjectId:(Ljava/lang/String;)I
  #599 = Utf8               getPlayerObjectId
  #600 = Fieldref           #539.#601     // ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
  #601 = NameAndType        #602:#543     // INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
  #602 = Utf8               INVALID_TARGET
  #603 = Methodref          #604.#605     // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
  #604 = Class              #606          // ext/mods/gameserver/model/World
  #605 = NameAndType        #328:#607     // getInstance:()Lext/mods/gameserver/model/World;
  #606 = Utf8               ext/mods/gameserver/model/World
  #607 = Utf8               ()Lext/mods/gameserver/model/World;
  #608 = Methodref          #604.#609     // ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
  #609 = NameAndType        #610:#611     // getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
  #610 = Utf8               getPlayer
  #611 = Utf8               (I)Lext/mods/gameserver/model/actor/Player;
  #612 = Methodref          #593.#613     // ext/mods/gameserver/data/sql/PlayerInfoTable.getPlayerAccessLevel:(I)I
  #613 = NameAndType        #614:#319     // getPlayerAccessLevel:(I)I
  #614 = Utf8               getPlayerAccessLevel
  #615 = Fieldref           #539.#616     // ext/mods/gameserver/network/SystemMessageId.CANNOT_MAIL_GM_S1:Lext/mods/gameserver/network/SystemMessageId;
  #616 = NameAndType        #617:#543     // CANNOT_MAIL_GM_S1:Lext/mods/gameserver/network/SystemMessageId;
  #617 = Utf8               CANNOT_MAIL_GM_S1
  #618 = Methodref          #619.#620     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #619 = Class              #621          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #620 = NameAndType        #622:#623     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #621 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #622 = Utf8               getSystemMessage
  #623 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #624 = Methodref          #619.#625     // ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #625 = NameAndType        #626:#627     // addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #626 = Utf8               addString
  #627 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #628 = Methodref          #235.#629     // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #629 = NameAndType        #546:#630     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #630 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #631 = Methodref          #235.#632     // ext/mods/gameserver/model/actor/Player.isBlockingAll:()Z
  #632 = NameAndType        #633:#45      // isBlockingAll:()Z
  #633 = Utf8               isBlockingAll
  #634 = Fieldref           #539.#635     // ext/mods/gameserver/network/SystemMessageId.S1_BLOCKED_EVERYTHING:Lext/mods/gameserver/network/SystemMessageId;
  #635 = NameAndType        #636:#543     // S1_BLOCKED_EVERYTHING:Lext/mods/gameserver/network/SystemMessageId;
  #636 = Utf8               S1_BLOCKED_EVERYTHING
  #637 = Methodref          #638.#639     // ext/mods/gameserver/data/manager/RelationManager.getInstance:()Lext/mods/gameserver/data/manager/RelationManager;
  #638 = Class              #640          // ext/mods/gameserver/data/manager/RelationManager
  #639 = NameAndType        #328:#641     // getInstance:()Lext/mods/gameserver/data/manager/RelationManager;
  #640 = Utf8               ext/mods/gameserver/data/manager/RelationManager
  #641 = Utf8               ()Lext/mods/gameserver/data/manager/RelationManager;
  #642 = Methodref          #638.#643     // ext/mods/gameserver/data/manager/RelationManager.isInBlockList:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)Z
  #643 = NameAndType        #644:#645     // isInBlockList:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)Z
  #644 = Utf8               isInBlockList
  #645 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)Z
  #646 = Fieldref           #539.#647     // ext/mods/gameserver/network/SystemMessageId.S1_BLOCKED_YOU_CANNOT_MAIL:Lext/mods/gameserver/network/SystemMessageId;
  #647 = NameAndType        #648:#543     // S1_BLOCKED_YOU_CANNOT_MAIL:Lext/mods/gameserver/network/SystemMessageId;
  #648 = Utf8               S1_BLOCKED_YOU_CANNOT_MAIL
  #649 = Methodref          #11.#650      // ext/mods/gameserver/communitybbs/manager/MailBBSManager.isInboxFull:(I)Z
  #650 = NameAndType        #651:#652     // isInboxFull:(I)Z
  #651 = Utf8               isInboxFull
  #652 = Utf8               (I)Z
  #653 = Fieldref           #539.#654     // ext/mods/gameserver/network/SystemMessageId.MESSAGE_NOT_SENT:Lext/mods/gameserver/network/SystemMessageId;
  #654 = NameAndType        #655:#543     // MESSAGE_NOT_SENT:Lext/mods/gameserver/network/SystemMessageId;
  #655 = Utf8               MESSAGE_NOT_SENT
  #656 = Fieldref           #539.#657     // ext/mods/gameserver/network/SystemMessageId.MAILBOX_FULL:Lext/mods/gameserver/network/SystemMessageId;
  #657 = NameAndType        #658:#543     // MAILBOX_FULL:Lext/mods/gameserver/network/SystemMessageId;
  #658 = Utf8               MAILBOX_FULL
  #659 = Methodref          #11.#660      // ext/mods/gameserver/communitybbs/manager/MailBBSManager.getNewMailId:()I
  #660 = NameAndType        #661:#192     // getNewMailId:()I
  #661 = Utf8               getNewMailId
  #662 = InterfaceMethodref #35.#663      // java/sql/PreparedStatement.addBatch:()V
  #663 = NameAndType        #664:#6       // addBatch:()V
  #664 = Utf8               addBatch
  #665 = Methodref          #70.#666      // ext/mods/gameserver/communitybbs/model/Mail."<init>":(IIILext/mods/gameserver/enums/MailType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/sql/Timestamp;Ljava/lang/String;Z)V
  #666 = NameAndType        #5:#667       // "<init>":(IIILext/mods/gameserver/enums/MailType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/sql/Timestamp;Ljava/lang/String;Z)V
  #667 = Utf8               (IIILext/mods/gameserver/enums/MailType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/sql/Timestamp;Ljava/lang/String;Z)V
  #668 = Fieldref           #539.#669     // ext/mods/gameserver/network/SystemMessageId.NEW_MAIL:Lext/mods/gameserver/network/SystemMessageId;
  #669 = NameAndType        #670:#543     // NEW_MAIL:Lext/mods/gameserver/network/SystemMessageId;
  #670 = Utf8               NEW_MAIL
  #671 = Class              #672          // ext/mods/gameserver/network/serverpackets/PlaySound
  #672 = Utf8               ext/mods/gameserver/network/serverpackets/PlaySound
  #673 = String             #674          // systemmsg_e.1233
  #674 = Utf8               systemmsg_e.1233
  #675 = Methodref          #671.#572     // ext/mods/gameserver/network/serverpackets/PlaySound."<init>":(Ljava/lang/String;)V
  #676 = Fieldref           #677.#678     // ext/mods/gameserver/network/serverpackets/ExMailArrived.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ExMailArrived;
  #677 = Class              #679          // ext/mods/gameserver/network/serverpackets/ExMailArrived
  #678 = NameAndType        #680:#681     // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ExMailArrived;
  #679 = Utf8               ext/mods/gameserver/network/serverpackets/ExMailArrived
  #680 = Utf8               STATIC_PACKET
  #681 = Utf8               Lext/mods/gameserver/network/serverpackets/ExMailArrived;
  #682 = InterfaceMethodref #35.#683      // java/sql/PreparedStatement.executeBatch:()[I
  #683 = NameAndType        #684:#685     // executeBatch:()[I
  #684 = Utf8               executeBatch
  #685 = Utf8               ()[I
  #686 = InterfaceMethodref #35.#687      // java/sql/PreparedStatement.execute:()Z
  #687 = NameAndType        #688:#45      // execute:()Z
  #688 = Utf8               execute
  #689 = Fieldref           #539.#690     // ext/mods/gameserver/network/SystemMessageId.SENT_MAIL:Lext/mods/gameserver/network/SystemMessageId;
  #690 = NameAndType        #691:#543     // SENT_MAIL:Lext/mods/gameserver/network/SystemMessageId;
  #691 = Utf8               SENT_MAIL
  #692 = String             #693          // Couldn\'t send mail for {}.
  #693 = Utf8               Couldn\'t send mail for {}.
  #694 = Methodref          #235.#695     // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
  #695 = NameAndType        #696:#139     // getName:()Ljava/lang/String;
  #696 = Utf8               getName
  #697 = Methodref          #101.#698     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #698 = NameAndType        #104:#699     // error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #699 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #700 = InvokeDynamic      #10:#248      // #10:test:(I)Ljava/util/function/Predicate;
  #701 = InterfaceMethodref #68.#702      // java/util/Set.removeIf:(Ljava/util/function/Predicate;)Z
  #702 = NameAndType        #703:#273     // removeIf:(Ljava/util/function/Predicate;)Z
  #703 = Utf8               removeIf
  #704 = String             #705          // DELETE FROM bbs_mail WHERE id=?
  #705 = Utf8               DELETE FROM bbs_mail WHERE id=?
  #706 = String             #707          // Couldn\'t delete mail #{}.
  #707 = Utf8               Couldn\'t delete mail #{}.
  #708 = Methodref          #70.#709      // ext/mods/gameserver/communitybbs/model/Mail.setAsRead:()V
  #709 = NameAndType        #710:#6       // setAsRead:()V
  #710 = Utf8               setAsRead
  #711 = String             #712          // UPDATE bbs_mail SET is_unread=0 WHERE id=?
  #712 = Utf8               UPDATE bbs_mail SET is_unread=0 WHERE id=?
  #713 = String             #714          // Couldn\'t set read status for mail #{}.
  #714 = Utf8               Couldn\'t set read status for mail #{}.
  #715 = Methodref          #70.#716      // ext/mods/gameserver/communitybbs/model/Mail.setMailType:(Lext/mods/gameserver/enums/MailType;)V
  #716 = NameAndType        #717:#718     // setMailType:(Lext/mods/gameserver/enums/MailType;)V
  #717 = Utf8               setMailType
  #718 = Utf8               (Lext/mods/gameserver/enums/MailType;)V
  #719 = String             #720          // UPDATE bbs_mail SET location=? WHERE id=?
  #720 = Utf8               UPDATE bbs_mail SET location=? WHERE id=?
  #721 = String             #722          // Couldn\'t set mail #{} location.
  #722 = Utf8               Couldn\'t set mail #{} location.
  #723 = Methodref          #235.#724     // ext/mods/gameserver/model/actor/Player.getMailPosition:()I
  #724 = NameAndType        #725:#192     // getMailPosition:()I
  #725 = Utf8               getMailPosition
  #726 = Fieldref           #116.#727     // ext/mods/gameserver/enums/MailType.VALUES:[Lext/mods/gameserver/enums/MailType;
  #727 = NameAndType        #728:#729     // VALUES:[Lext/mods/gameserver/enums/MailType;
  #728 = Utf8               VALUES
  #729 = Utf8               [Lext/mods/gameserver/enums/MailType;
  #730 = Methodref          #593.#309     // ext/mods/gameserver/data/sql/PlayerInfoTable.getPlayerName:(I)Ljava/lang/String;
  #731 = Fieldref           #732.#733     // ext/mods/gameserver/communitybbs/manager/MailBBSManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/communitybbs/manager/MailBBSManager;
  #732 = Class              #734          // ext/mods/gameserver/communitybbs/manager/MailBBSManager$SingletonHolder
  #733 = NameAndType        #735:#736     // INSTANCE:Lext/mods/gameserver/communitybbs/manager/MailBBSManager;
  #734 = Utf8               ext/mods/gameserver/communitybbs/manager/MailBBSManager$SingletonHolder
  #735 = Utf8               INSTANCE
  #736 = Utf8               Lext/mods/gameserver/communitybbs/manager/MailBBSManager;
  #737 = Methodref          #70.#738      // ext/mods/gameserver/communitybbs/model/Mail.getSentDate:()Ljava/sql/Timestamp;
  #738 = NameAndType        #739:#740     // getSentDate:()Ljava/sql/Timestamp;
  #739 = Utf8               getSentDate
  #740 = Utf8               ()Ljava/sql/Timestamp;
  #741 = Methodref          #523.#742     // java/sql/Timestamp.after:(Ljava/sql/Timestamp;)Z
  #742 = NameAndType        #743:#744     // after:(Ljava/sql/Timestamp;)Z
  #743 = Utf8               after
  #744 = Utf8               (Ljava/sql/Timestamp;)Z
  #745 = Utf8               SELECT_MAILS
  #746 = Utf8               Ljava/lang/String;
  #747 = Utf8               ConstantValue
  #748 = Utf8               INSERT_MAIL
  #749 = Utf8               DELETE_MAIL
  #750 = Utf8               UPDATE_MAIL_AS_READ
  #751 = Utf8               UPDATE_MAIL_LOCATION
  #752 = Utf8               Signature
  #753 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/util/Set<Lext/mods/gameserver/communitybbs/model/Mail;>;>;
  #754 = Utf8               Code
  #755 = Utf8               LineNumberTable
  #756 = Utf8               LocalVariableTable
  #757 = Utf8               mails
  #758 = Utf8               Ljava/util/Set;
  #759 = Utf8               mailId
  #760 = Utf8               rs
  #761 = Utf8               Ljava/sql/ResultSet;
  #762 = Utf8               ps
  #763 = Utf8               Ljava/sql/PreparedStatement;
  #764 = Utf8               con
  #765 = Utf8               Ljava/sql/Connection;
  #766 = Utf8               e
  #767 = Utf8               Ljava/lang/Exception;
  #768 = Utf8               this
  #769 = Utf8               LocalVariableTypeTable
  #770 = Utf8               Ljava/util/Set<Lext/mods/gameserver/communitybbs/model/Mail;>;
  #771 = Utf8               StackMapTable
  #772 = Utf8               page
  #773 = Utf8               sType
  #774 = Utf8               search
  #775 = Utf8               mail
  #776 = Utf8               Lext/mods/gameserver/communitybbs/model/Mail;
  #777 = Utf8               st
  #778 = Utf8               Ljava/util/StringTokenizer;
  #779 = Utf8               action
  #780 = Utf8               command
  #781 = Utf8               player
  #782 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #783 = Utf8               ar1
  #784 = Utf8               ar2
  #785 = Utf8               ar3
  #786 = Utf8               ar4
  #787 = Utf8               ar5
  #788 = Utf8               objectId
  #789 = Utf8               (I)Ljava/util/Set<Lext/mods/gameserver/communitybbs/model/Mail;>;
  #790 = Utf8               checkIfUnreadMail
  #791 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #792 = Utf8               type
  #793 = Utf8               writer
  #794 = Utf8               byTitle
  #795 = Utf8               Z
  #796 = Utf8               countMails
  #797 = Utf8               maxpage
  #798 = Utf8               index
  #799 = Utf8               minIndex
  #800 = Utf8               maxIndex
  #801 = Utf8               content
  #802 = Utf8               sb
  #803 = Utf8               Ljava/lang/StringBuilder;
  #804 = Utf8               fullSearch
  #805 = Utf8               i
  #806 = Class              #807          // "[Ljava/lang/Object;"
  #807 = Utf8               [Ljava/lang/Object;
  #808 = Utf8               link
  #809 = Utf8               recipientId
  #810 = Utf8               recipientPlayer
  #811 = Utf8               recipientName
  #812 = Utf8               result
  #813 = Utf8               [I
  #814 = Utf8               recipients
  #815 = Utf8               subject
  #816 = Utf8               message
  #817 = Utf8               currentDate
  #818 = Utf8               J
  #819 = Utf8               ts
  #820 = Utf8               Ljava/sql/Timestamp;
  #821 = Utf8               recipientNames
  #822 = Utf8               [Ljava/lang/String;
  #823 = Utf8               time
  #824 = Utf8               formattedTime
  #825 = Class              #822          // "[Ljava/lang/String;"
  #826 = Utf8               location
  #827 = Utf8               name
  #828 = Utf8               mailCount
  #829 = Utf8               ()Lext/mods/gameserver/communitybbs/manager/MailBBSManager;
  #830 = Utf8               lambda$deleteMail$0
  #831 = Utf8               (ILext/mods/gameserver/communitybbs/model/Mail;)Z
  #832 = Utf8               m
  #833 = Utf8               lambda$sendMail$0
  #834 = Utf8               (Ljava/sql/Timestamp;Lext/mods/gameserver/communitybbs/model/Mail;)Z
  #835 = Utf8               l
  #836 = Utf8               lambda$getMail$0
  #837 = Utf8               lambda$getMails$0
  #838 = Utf8               (Ljava/lang/Integer;)Ljava/util/Set;
  #839 = Utf8               Ljava/lang/Integer;
  #840 = Utf8               lambda$new$0
  #841 = Utf8               SourceFile
  #842 = Utf8               MailBBSManager.java
  #843 = Utf8               NestMembers
  #844 = Utf8               BootstrapMethods
  #845 = MethodType         #266          //  (Ljava/lang/Object;)Ljava/lang/Object;
  #846 = MethodHandle       6:#847        // REF_invokeStatic ext/mods/gameserver/communitybbs/manager/MailBBSManager.lambda$new$0:(Ljava/lang/Integer;)Ljava/util/Set;
  #847 = Methodref          #11.#848      // ext/mods/gameserver/communitybbs/manager/MailBBSManager.lambda$new$0:(Ljava/lang/Integer;)Ljava/util/Set;
  #848 = NameAndType        #840:#838     // lambda$new$0:(Ljava/lang/Integer;)Ljava/util/Set;
  #849 = MethodType         #838          //  (Ljava/lang/Integer;)Ljava/util/Set;
  #850 = MethodHandle       6:#851        // REF_invokeStatic ext/mods/gameserver/communitybbs/manager/MailBBSManager.lambda$getMails$0:(Ljava/lang/Integer;)Ljava/util/Set;
  #851 = Methodref          #11.#852      // ext/mods/gameserver/communitybbs/manager/MailBBSManager.lambda$getMails$0:(Ljava/lang/Integer;)Ljava/util/Set;
  #852 = NameAndType        #837:#838     // lambda$getMails$0:(Ljava/lang/Integer;)Ljava/util/Set;
  #853 = MethodType         #78           //  (Ljava/lang/Object;)Z
  #854 = MethodHandle       6:#855        // REF_invokeStatic ext/mods/gameserver/communitybbs/manager/MailBBSManager.lambda$getMail$0:(ILext/mods/gameserver/communitybbs/model/Mail;)Z
  #855 = Methodref          #11.#856      // ext/mods/gameserver/communitybbs/manager/MailBBSManager.lambda$getMail$0:(ILext/mods/gameserver/communitybbs/model/Mail;)Z
  #856 = NameAndType        #836:#831     // lambda$getMail$0:(ILext/mods/gameserver/communitybbs/model/Mail;)Z
  #857 = MethodType         #858          //  (Lext/mods/gameserver/communitybbs/model/Mail;)Z
  #858 = Utf8               (Lext/mods/gameserver/communitybbs/model/Mail;)Z
  #859 = MethodHandle       5:#186        // REF_invokeVirtual ext/mods/gameserver/communitybbs/model/Mail.isUnread:()Z
  #860 = String             #861          // ;\u0001;\u0001
  #861 = Utf8               ;\u0001;\u0001
  #862 = String             #863          // \u0001&nbsp;&gt;&nbsp;\u0001
  #863 = Utf8               \u0001&nbsp;&gt;&nbsp;\u0001
  #864 = String             #865          // \u0001
  #865 = Utf8               \u0001
  #866 = String             #867          // \u0001&nbsp;&gt;&nbsp;<a action=\"bypass _bbsmail;view;\u0001\">\u0001</a>&nbsp;&gt;&nbsp;
  #867 = Utf8               \u0001&nbsp;&gt;&nbsp;<a action=\"bypass _bbsmail;view;\u0001\">\u0001</a>&nbsp;&gt;&nbsp;
  #868 = String             #869          // Re: \u0001
  #869 = Utf8               Re: \u0001
  #870 = MethodHandle       6:#871        // REF_invokeStatic ext/mods/gameserver/communitybbs/manager/MailBBSManager.lambda$sendMail$0:(Ljava/sql/Timestamp;Lext/mods/gameserver/communitybbs/model/Mail;)Z
  #871 = Methodref          #11.#872      // ext/mods/gameserver/communitybbs/manager/MailBBSManager.lambda$sendMail$0:(Ljava/sql/Timestamp;Lext/mods/gameserver/communitybbs/model/Mail;)Z
  #872 = NameAndType        #833:#834     // lambda$sendMail$0:(Ljava/sql/Timestamp;Lext/mods/gameserver/communitybbs/model/Mail;)Z
  #873 = MethodHandle       6:#874        // REF_invokeStatic ext/mods/gameserver/communitybbs/manager/MailBBSManager.lambda$deleteMail$0:(ILext/mods/gameserver/communitybbs/model/Mail;)Z
  #874 = Methodref          #11.#875      // ext/mods/gameserver/communitybbs/manager/MailBBSManager.lambda$deleteMail$0:(ILext/mods/gameserver/communitybbs/model/Mail;)Z
  #875 = NameAndType        #830:#831     // lambda$deleteMail$0:(ILext/mods/gameserver/communitybbs/model/Mail;)Z
  #876 = MethodHandle       6:#877        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #877 = Methodref          #878.#879     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #878 = Class              #880          // java/lang/invoke/LambdaMetafactory
  #879 = NameAndType        #881:#882     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #880 = Utf8               java/lang/invoke/LambdaMetafactory
  #881 = Utf8               metafactory
  #882 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #883 = MethodHandle       6:#884        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #884 = Methodref          #885.#886     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #885 = Class              #887          // java/lang/invoke/StringConcatFactory
  #886 = NameAndType        #411:#888     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #887 = Utf8               java/lang/invoke/StringConcatFactory
  #888 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #889 = Utf8               InnerClasses
  #890 = Class              #891          // java/util/concurrent/ConcurrentHashMap$KeySetView
  #891 = Utf8               java/util/concurrent/ConcurrentHashMap$KeySetView
  #892 = Utf8               KeySetView
  #893 = Utf8               SingletonHolder
  #894 = Class              #895          // java/lang/invoke/MethodHandles$Lookup
  #895 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #896 = Class              #897          // java/lang/invoke/MethodHandles
  #897 = Utf8               java/lang/invoke/MethodHandles
  #898 = Utf8               Lookup
{
  protected ext.mods.gameserver.communitybbs.manager.MailBBSManager();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=4, locals=6, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/communitybbs/manager/BaseBBSManager."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/concurrent/ConcurrentHashMap
         8: dup
         9: invokespecial #9                  // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        12: putfield      #10                 // Field _mails:Ljava/util/Map;
        15: aload_0
        16: iconst_0
        17: putfield      #16                 // Field _lastMailId:I
        20: invokestatic  #20                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        23: astore_1
        24: aload_1
        25: ldc           #26                 // String SELECT * FROM bbs_mail ORDER BY id ASC
        27: invokeinterface #28,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        32: astore_2
        33: aload_2
        34: invokeinterface #34,  1           // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
        39: astore_3
        40: aload_3
        41: invokeinterface #40,  1           // InterfaceMethod java/sql/ResultSet.next:()Z
        46: ifeq          123
        49: aload_0
        50: getfield      #10                 // Field _mails:Ljava/util/Map;
        53: aload_3
        54: ldc           #46                 // String receiver_id
        56: invokeinterface #48,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        61: invokestatic  #52                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        64: invokedynamic #58,  0             // InvokeDynamic #0:apply:()Ljava/util/function/Function;
        69: invokeinterface #62,  3           // InterfaceMethod java/util/Map.computeIfAbsent:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
        74: checkcast     #68                 // class java/util/Set
        77: astore        4
        79: aload         4
        81: new           #70                 // class ext/mods/gameserver/communitybbs/model/Mail
        84: dup
        85: aload_3
        86: invokespecial #72                 // Method ext/mods/gameserver/communitybbs/model/Mail."<init>":(Ljava/sql/ResultSet;)V
        89: invokeinterface #75,  2           // InterfaceMethod java/util/Set.add:(Ljava/lang/Object;)Z
        94: pop
        95: aload_3
        96: ldc           #79                 // String id
        98: invokeinterface #48,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       103: istore        5
       105: iload         5
       107: aload_0
       108: getfield      #16                 // Field _lastMailId:I
       111: if_icmple     120
       114: aload_0
       115: iload         5
       117: putfield      #16                 // Field _lastMailId:I
       120: goto          40
       123: aload_3
       124: ifnull        163
       127: aload_3
       128: invokeinterface #81,  1           // InterfaceMethod java/sql/ResultSet.close:()V
       133: goto          163
       136: astore        4
       138: aload_3
       139: ifnull        160
       142: aload_3
       143: invokeinterface #81,  1           // InterfaceMethod java/sql/ResultSet.close:()V
       148: goto          160
       151: astore        5
       153: aload         4
       155: aload         5
       157: invokevirtual #86                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       160: aload         4
       162: athrow
       163: aload_2
       164: ifnull        200
       167: aload_2
       168: invokeinterface #90,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       173: goto          200
       176: astore_3
       177: aload_2
       178: ifnull        198
       181: aload_2
       182: invokeinterface #90,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       187: goto          198
       190: astore        4
       192: aload_3
       193: aload         4
       195: invokevirtual #86                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       198: aload_3
       199: athrow
       200: aload_1
       201: ifnull        235
       204: aload_1
       205: invokeinterface #91,  1           // InterfaceMethod java/sql/Connection.close:()V
       210: goto          235
       213: astore_2
       214: aload_1
       215: ifnull        233
       218: aload_1
       219: invokeinterface #91,  1           // InterfaceMethod java/sql/Connection.close:()V
       224: goto          233
       227: astore_3
       228: aload_2
       229: aload_3
       230: invokevirtual #86                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       233: aload_2
       234: athrow
       235: goto          248
       238: astore_1
       239: getstatic     #94                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       242: ldc           #98                 // String Couldn\'t load mails.
       244: aload_1
       245: invokevirtual #100                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       248: return
      Exception table:
         from    to  target type
            40   123   136   Class java/lang/Throwable
           142   148   151   Class java/lang/Throwable
            33   163   176   Class java/lang/Throwable
           181   187   190   Class java/lang/Throwable
            24   200   213   Class java/lang/Throwable
           218   224   227   Class java/lang/Throwable
            20   235   238   Class java/lang/Exception
      LineNumberTable:
        line 59: 0
        line 54: 4
        line 56: 15
        line 60: 20
        line 61: 24
        line 62: 33
        line 64: 40
        line 66: 49
        line 67: 79
        line 69: 95
        line 70: 105
        line 71: 114
        line 72: 120
        line 73: 123
        line 60: 136
        line 73: 163
        line 60: 176
        line 73: 200
        line 60: 213
        line 77: 235
        line 74: 238
        line 76: 239
        line 78: 248
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           79      41     4 mails   Ljava/util/Set;
          105      15     5 mailId   I
           40     123     3    rs   Ljava/sql/ResultSet;
           33     167     2    ps   Ljava/sql/PreparedStatement;
           24     211     1   con   Ljava/sql/Connection;
          239       9     1     e   Ljava/lang/Exception;
            0     249     0  this   Lext/mods/gameserver/communitybbs/manager/MailBBSManager;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           79      41     4 mails   Ljava/util/Set<Lext/mods/gameserver/communitybbs/model/Mail;>;
      StackMapTable: number_of_entries = 17
        frame_type = 255 /* full_frame */
          offset_delta = 40
          locals = [ class ext/mods/gameserver/communitybbs/manager/MailBBSManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet ]
          stack = []
        frame_type = 251 /* same_frame_extended */
          offset_delta = 79
        frame_type = 2 /* same */
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/communitybbs/manager/MailBBSManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/communitybbs/manager/MailBBSManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/communitybbs/manager/MailBBSManager, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 9 /* same */

  public void parseCmd(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=8, args_size=3
         0: aload_1
         1: ldc           #106                // String _bbsmail
         3: invokevirtual #108                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
         6: ifne          18
         9: aload_1
        10: ldc           #113                // String _maillist_0_1_0_
        12: invokevirtual #108                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        15: ifeq          30
        18: aload_0
        19: aload_2
        20: iconst_1
        21: getstatic     #115                // Field ext/mods/gameserver/enums/MailType.INBOX:Lext/mods/gameserver/enums/MailType;
        24: invokevirtual #121                // Method showMailList:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/enums/MailType;)V
        27: goto          363
        30: aload_1
        31: ldc           #106                // String _bbsmail
        33: invokevirtual #125                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        36: ifeq          357
        39: new           #129                // class java/util/StringTokenizer
        42: dup
        43: aload_1
        44: ldc           #131                // String ;
        46: invokespecial #133                // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
        49: astore_3
        50: aload_3
        51: invokevirtual #136                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        54: pop
        55: aload_3
        56: invokevirtual #136                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        59: astore        4
        61: aload         4
        63: ldc           #140                // String inbox
        65: invokevirtual #108                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        68: ifne          101
        71: aload         4
        73: ldc           #142                // String sentbox
        75: invokevirtual #108                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        78: ifne          101
        81: aload         4
        83: ldc           #144                // String archive
        85: invokevirtual #108                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        88: ifne          101
        91: aload         4
        93: ldc           #146                // String temparchive
        95: invokevirtual #108                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        98: ifeq          184
       101: aload_3
       102: invokevirtual #148                // Method java/util/StringTokenizer.hasMoreTokens:()Z
       105: ifeq          118
       108: aload_3
       109: invokevirtual #136                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       112: invokestatic  #151                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       115: goto          119
       118: iconst_1
       119: istore        5
       121: aload_3
       122: invokevirtual #148                // Method java/util/StringTokenizer.hasMoreTokens:()Z
       125: ifeq          135
       128: aload_3
       129: invokevirtual #136                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       132: goto          137
       135: ldc           #154                // String
       137: astore        6
       139: aload_3
       140: invokevirtual #148                // Method java/util/StringTokenizer.hasMoreTokens:()Z
       143: ifeq          153
       146: aload_3
       147: invokevirtual #136                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       150: goto          155
       153: ldc           #154                // String
       155: astore        7
       157: aload_0
       158: aload_2
       159: iload         5
       161: ldc           #116                // class ext/mods/gameserver/enums/MailType
       163: aload         4
       165: invokevirtual #156                // Method java/lang/String.toUpperCase:()Ljava/lang/String;
       168: invokestatic  #159                // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
       171: checkcast     #116                // class ext/mods/gameserver/enums/MailType
       174: aload         6
       176: aload         7
       178: invokevirtual #164                // Method showMailList:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/enums/MailType;Ljava/lang/String;Ljava/lang/String;)V
       181: goto          354
       184: aload         4
       186: ldc           #167                // String crea
       188: invokevirtual #108                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       191: ifeq          201
       194: aload_2
       195: invokestatic  #169                // Method showWriteView:(Lext/mods/gameserver/model/actor/Player;)V
       198: goto          354
       201: aload_0
       202: aload_2
       203: aload_3
       204: invokevirtual #148                // Method java/util/StringTokenizer.hasMoreTokens:()Z
       207: ifeq          220
       210: aload_3
       211: invokevirtual #136                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       214: invokestatic  #151                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       217: goto          221
       220: iconst_m1
       221: invokevirtual #173                // Method getMail:(Lext/mods/gameserver/model/actor/Player;I)Lext/mods/gameserver/communitybbs/model/Mail;
       224: astore        5
       226: aload         5
       228: ifnonnull     237
       231: aload_0
       232: aload_2
       233: invokevirtual #177                // Method showLastForum:(Lext/mods/gameserver/model/actor/Player;)V
       236: return
       237: aload         4
       239: ldc           #180                // String view
       241: invokevirtual #108                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       244: ifeq          275
       247: aload_0
       248: aload_2
       249: aload         5
       251: invokevirtual #182                // Method showMailView:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/communitybbs/model/Mail;)V
       254: aload         5
       256: invokevirtual #186                // Method ext/mods/gameserver/communitybbs/model/Mail.isUnread:()Z
       259: ifeq          354
       262: aload_0
       263: aload_2
       264: aload         5
       266: invokevirtual #189                // Method ext/mods/gameserver/communitybbs/model/Mail.getId:()I
       269: invokevirtual #193                // Method setMailAsRead:(Lext/mods/gameserver/model/actor/Player;I)V
       272: goto          354
       275: aload         4
       277: ldc           #197                // String reply
       279: invokevirtual #108                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       282: ifeq          294
       285: aload_2
       286: aload         5
       288: invokestatic  #199                // Method showWriteView:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/communitybbs/model/Mail;)V
       291: goto          354
       294: aload         4
       296: ldc           #201                // String del
       298: invokevirtual #108                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       301: ifeq          322
       304: aload_0
       305: aload_2
       306: aload         5
       308: invokevirtual #189                // Method ext/mods/gameserver/communitybbs/model/Mail.getId:()I
       311: invokevirtual #203                // Method deleteMail:(Lext/mods/gameserver/model/actor/Player;I)V
       314: aload_0
       315: aload_2
       316: invokevirtual #177                // Method showLastForum:(Lext/mods/gameserver/model/actor/Player;)V
       319: goto          354
       322: aload         4
       324: ldc           #206                // String store
       326: invokevirtual #108                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       329: ifeq          354
       332: aload_0
       333: aload_2
       334: aload         5
       336: invokevirtual #189                // Method ext/mods/gameserver/communitybbs/model/Mail.getId:()I
       339: getstatic     #208                // Field ext/mods/gameserver/enums/MailType.ARCHIVE:Lext/mods/gameserver/enums/MailType;
       342: invokevirtual #211                // Method setMailLocation:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/enums/MailType;)V
       345: aload_0
       346: aload_2
       347: iconst_1
       348: getstatic     #208                // Field ext/mods/gameserver/enums/MailType.ARCHIVE:Lext/mods/gameserver/enums/MailType;
       351: invokevirtual #121                // Method showMailList:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/enums/MailType;)V
       354: goto          363
       357: aload_0
       358: aload_1
       359: aload_2
       360: invokespecial #214                // Method ext/mods/gameserver/communitybbs/manager/BaseBBSManager.parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       363: return
      LineNumberTable:
        line 83: 0
        line 84: 18
        line 85: 30
        line 87: 39
        line 88: 50
        line 90: 55
        line 92: 61
        line 94: 101
        line 95: 121
        line 96: 139
        line 98: 157
        line 99: 181
        line 100: 184
        line 101: 194
        line 104: 201
        line 105: 226
        line 107: 231
        line 108: 236
        line 111: 237
        line 113: 247
        line 114: 254
        line 115: 262
        line 117: 275
        line 118: 285
        line 119: 294
        line 121: 304
        line 122: 314
        line 124: 322
        line 126: 332
        line 127: 345
        line 130: 354
        line 132: 357
        line 133: 363
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          121      60     5  page   I
          139      42     6 sType   Ljava/lang/String;
          157      24     7 search   Ljava/lang/String;
          226     128     5  mail   Lext/mods/gameserver/communitybbs/model/Mail;
           50     304     3    st   Ljava/util/StringTokenizer;
           61     293     4 action   Ljava/lang/String;
            0     364     0  this   Lext/mods/gameserver/communitybbs/manager/MailBBSManager;
            0     364     1 command   Ljava/lang/String;
            0     364     2 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 20
        frame_type = 18 /* same */
        frame_type = 11 /* same */
        frame_type = 253 /* append */
          offset_delta = 70
          locals = [ class java/util/StringTokenizer, class java/lang/String ]
        frame_type = 16 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ int ]
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class java/lang/String ]
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]
        frame_type = 249 /* chop */
          offset_delta = 28
        frame_type = 16 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 18
          locals = [ class ext/mods/gameserver/communitybbs/manager/MailBBSManager, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String ]
          stack = [ class ext/mods/gameserver/communitybbs/manager/MailBBSManager, class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/communitybbs/manager/MailBBSManager, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String ]
          stack = [ class ext/mods/gameserver/communitybbs/manager/MailBBSManager, class ext/mods/gameserver/model/actor/Player, int ]
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/communitybbs/model/Mail ]
        frame_type = 37 /* same */
        frame_type = 18 /* same */
        frame_type = 27 /* same */
        frame_type = 248 /* chop */
          offset_delta = 31
        frame_type = 2 /* same */
        frame_type = 5 /* same */

  public void parseWrite(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=8, args_size=7
         0: aload_1
         1: ldc           #218                // String Send
         3: invokevirtual #108                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
         6: ifeq          33
         9: aload_0
        10: aload_3
        11: aload         4
        13: aload         5
        15: aload         6
        17: invokevirtual #220                // Method sendMail:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
        20: aload_0
        21: aload         6
        23: iconst_1
        24: getstatic     #224                // Field ext/mods/gameserver/enums/MailType.SENTBOX:Lext/mods/gameserver/enums/MailType;
        27: invokevirtual #121                // Method showMailList:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/enums/MailType;)V
        30: goto          103
        33: aload_1
        34: ldc           #227                // String Search
        36: invokevirtual #125                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        39: ifeq          90
        42: new           #129                // class java/util/StringTokenizer
        45: dup
        46: aload_1
        47: ldc           #131                // String ;
        49: invokespecial #133                // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
        52: astore        7
        54: aload         7
        56: invokevirtual #136                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        59: pop
        60: aload_0
        61: aload         6
        63: iconst_1
        64: ldc           #116                // class ext/mods/gameserver/enums/MailType
        66: aload         7
        68: invokevirtual #136                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        71: invokevirtual #156                // Method java/lang/String.toUpperCase:()Ljava/lang/String;
        74: invokestatic  #159                // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
        77: checkcast     #116                // class ext/mods/gameserver/enums/MailType
        80: aload         4
        82: aload         5
        84: invokevirtual #164                // Method showMailList:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/enums/MailType;Ljava/lang/String;Ljava/lang/String;)V
        87: goto          103
        90: aload_0
        91: aload_1
        92: aload_2
        93: aload_3
        94: aload         4
        96: aload         5
        98: aload         6
       100: invokespecial #229                // Method ext/mods/gameserver/communitybbs/manager/BaseBBSManager.parseWrite:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       103: return
      LineNumberTable:
        line 138: 0
        line 140: 9
        line 141: 20
        line 143: 33
        line 145: 42
        line 146: 54
        line 148: 60
        line 149: 87
        line 151: 90
        line 152: 103
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           54      33     7    st   Ljava/util/StringTokenizer;
            0     104     0  this   Lext/mods/gameserver/communitybbs/manager/MailBBSManager;
            0     104     1   ar1   Ljava/lang/String;
            0     104     2   ar2   Ljava/lang/String;
            0     104     3   ar3   Ljava/lang/String;
            0     104     4   ar4   Ljava/lang/String;
            0     104     5   ar5   Ljava/lang/String;
            0     104     6 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 3
        frame_type = 33 /* same */
        frame_type = 56 /* same */
        frame_type = 12 /* same */

  public boolean checkIfUnreadMail(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #234                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
         5: invokevirtual #239                // Method getMails:(I)Ljava/util/Set;
         8: invokeinterface #243,  1          // InterfaceMethod java/util/Set.stream:()Ljava/util/stream/Stream;
        13: invokedynamic #267,  0            // InvokeDynamic #3:test:()Ljava/util/function/Predicate;
        18: invokeinterface #270,  2          // InterfaceMethod java/util/stream/Stream.anyMatch:(Ljava/util/function/Predicate;)Z
        23: ireturn
      LineNumberTable:
        line 171: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/gameserver/communitybbs/manager/MailBBSManager;
            0      24     1 player   Lext/mods/gameserver/model/actor/Player;

  public void sendMail(java.lang.String, java.lang.String, java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=13, locals=20, args_size=5
         0: invokestatic  #514                // Method java/util/Calendar.getInstance:()Ljava/util/Calendar;
         3: invokevirtual #519                // Method java/util/Calendar.getTimeInMillis:()J
         6: lstore        5
         8: new           #523                // class java/sql/Timestamp
        11: dup
        12: lload         5
        14: ldc2_w        #525                // long 86400000l
        17: lsub
        18: invokespecial #527                // Method java/sql/Timestamp."<init>":(J)V
        21: astore        7
        23: aload_0
        24: aload         4
        26: invokevirtual #234                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        29: invokevirtual #239                // Method getMails:(I)Ljava/util/Set;
        32: invokeinterface #243,  1          // InterfaceMethod java/util/Set.stream:()Ljava/util/stream/Stream;
        37: aload         7
        39: invokedynamic #530,  0            // InvokeDynamic #9:test:(Ljava/sql/Timestamp;)Ljava/util/function/Predicate;
        44: invokeinterface #251,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        49: invokeinterface #533,  1          // InterfaceMethod java/util/stream/Stream.count:()J
        54: ldc2_w        #536                // long 10l
        57: lcmp
        58: iflt          70
        61: aload         4
        63: getstatic     #538                // Field ext/mods/gameserver/network/SystemMessageId.NO_MORE_MESSAGES_TODAY:Lext/mods/gameserver/network/SystemMessageId;
        66: invokevirtual #544                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        69: return
        70: aload_1
        71: invokevirtual #548                // Method java/lang/String.trim:()Ljava/lang/String;
        74: ldc           #131                // String ;
        76: invokevirtual #551                // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        79: astore        8
        81: aload         8
        83: arraylength
        84: iconst_5
        85: if_icmple     105
        88: aload         4
        90: invokevirtual #555                // Method ext/mods/gameserver/model/actor/Player.isGM:()Z
        93: ifne          105
        96: aload         4
        98: getstatic     #558                // Field ext/mods/gameserver/network/SystemMessageId.ONLY_FIVE_RECIPIENTS:Lext/mods/gameserver/network/SystemMessageId;
       101: invokevirtual #544                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       104: return
       105: aload_2
       106: sipush        128
       109: ldc_w         #561                // String (no subject)
       112: invokestatic  #563                // Method ext/mods/commons/lang/StringUtil.trim:(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
       115: astore_2
       116: aload_3
       117: ldc_w         #565                // String \n
       120: ldc_w         #481                // String <br1>
       123: invokevirtual #461                // Method java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       126: astore_3
       127: new           #523                // class java/sql/Timestamp
       130: dup
       131: lload         5
       133: invokespecial #527                // Method java/sql/Timestamp."<init>":(J)V
       136: astore        9
       138: new           #567                // class java/text/SimpleDateFormat
       141: dup
       142: ldc_w         #569                // String yyyy-MM-dd HH:mm
       145: invokespecial #571                // Method java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
       148: aload         9
       150: invokevirtual #574                // Method java/text/SimpleDateFormat.format:(Ljava/util/Date;)Ljava/lang/String;
       153: astore        10
       155: invokestatic  #20                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
       158: astore        11
       160: aload         11
       162: ldc_w         #578                // String INSERT INTO bbs_mail (id,receiver_id,sender_id,location,recipients,subject,message,sent_date,is_unread) VALUES (?,?,?,?,?,?,?,?,?)
       165: invokeinterface #28,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       170: astore        12
       172: aload         12
       174: iconst_3
       175: aload         4
       177: invokevirtual #234                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       180: invokeinterface #580,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       185: aload         12
       187: iconst_4
       188: ldc           #140                // String inbox
       190: invokeinterface #584,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
       195: aload         12
       197: iconst_5
       198: aload_1
       199: invokeinterface #584,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
       204: aload         12
       206: bipush        6
       208: aload_2
       209: invokeinterface #584,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
       214: aload         12
       216: bipush        7
       218: aload_3
       219: invokeinterface #584,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
       224: aload         12
       226: bipush        8
       228: aload         9
       230: invokeinterface #588,  3          // InterfaceMethod java/sql/PreparedStatement.setTimestamp:(ILjava/sql/Timestamp;)V
       235: aload         12
       237: bipush        9
       239: iconst_1
       240: invokeinterface #580,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       245: aload         8
       247: astore        13
       249: aload         13
       251: arraylength
       252: istore        14
       254: iconst_0
       255: istore        15
       257: iload         15
       259: iload         14
       261: if_icmpge     566
       264: aload         13
       266: iload         15
       268: aaload
       269: astore        16
       271: invokestatic  #592                // Method ext/mods/gameserver/data/sql/PlayerInfoTable.getInstance:()Lext/mods/gameserver/data/sql/PlayerInfoTable;
       274: aload         16
       276: invokevirtual #597                // Method ext/mods/gameserver/data/sql/PlayerInfoTable.getPlayerObjectId:(Ljava/lang/String;)I
       279: istore        17
       281: iload         17
       283: ifle          296
       286: iload         17
       288: aload         4
       290: invokevirtual #234                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       293: if_icmpne     307
       296: aload         4
       298: getstatic     #600                // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
       301: invokevirtual #544                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       304: goto          560
       307: invokestatic  #603                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
       310: iload         17
       312: invokevirtual #608                // Method ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
       315: astore        18
       317: aload         4
       319: invokevirtual #555                // Method ext/mods/gameserver/model/actor/Player.isGM:()Z
       322: ifne          452
       325: invokestatic  #592                // Method ext/mods/gameserver/data/sql/PlayerInfoTable.getInstance:()Lext/mods/gameserver/data/sql/PlayerInfoTable;
       328: iload         17
       330: invokevirtual #612                // Method ext/mods/gameserver/data/sql/PlayerInfoTable.getPlayerAccessLevel:(I)I
       333: ifle          355
       336: aload         4
       338: getstatic     #615                // Field ext/mods/gameserver/network/SystemMessageId.CANNOT_MAIL_GM_S1:Lext/mods/gameserver/network/SystemMessageId;
       341: invokestatic  #618                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       344: aload         16
       346: invokevirtual #624                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       349: invokevirtual #628                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       352: goto          560
       355: aload         18
       357: ifnull        419
       360: aload         18
       362: invokevirtual #631                // Method ext/mods/gameserver/model/actor/Player.isBlockingAll:()Z
       365: ifeq          387
       368: aload         4
       370: getstatic     #634                // Field ext/mods/gameserver/network/SystemMessageId.S1_BLOCKED_EVERYTHING:Lext/mods/gameserver/network/SystemMessageId;
       373: invokestatic  #618                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       376: aload         16
       378: invokevirtual #624                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       381: invokevirtual #628                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       384: goto          560
       387: invokestatic  #637                // Method ext/mods/gameserver/data/manager/RelationManager.getInstance:()Lext/mods/gameserver/data/manager/RelationManager;
       390: aload         18
       392: aload         4
       394: invokevirtual #642                // Method ext/mods/gameserver/data/manager/RelationManager.isInBlockList:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)Z
       397: ifeq          419
       400: aload         4
       402: getstatic     #646                // Field ext/mods/gameserver/network/SystemMessageId.S1_BLOCKED_YOU_CANNOT_MAIL:Lext/mods/gameserver/network/SystemMessageId;
       405: invokestatic  #618                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       408: aload         16
       410: invokevirtual #624                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       413: invokevirtual #628                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       416: goto          560
       419: aload_0
       420: iload         17
       422: invokevirtual #649                // Method isInboxFull:(I)Z
       425: ifeq          452
       428: aload         4
       430: getstatic     #653                // Field ext/mods/gameserver/network/SystemMessageId.MESSAGE_NOT_SENT:Lext/mods/gameserver/network/SystemMessageId;
       433: invokevirtual #544                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       436: aload         18
       438: ifnull        560
       441: aload         18
       443: getstatic     #656                // Field ext/mods/gameserver/network/SystemMessageId.MAILBOX_FULL:Lext/mods/gameserver/network/SystemMessageId;
       446: invokevirtual #544                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       449: goto          560
       452: aload_0
       453: invokevirtual #659                // Method getNewMailId:()I
       456: istore        19
       458: aload         12
       460: iconst_1
       461: iload         19
       463: invokeinterface #580,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       468: aload         12
       470: iconst_2
       471: iload         17
       473: invokeinterface #580,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       478: aload         12
       480: invokeinterface #662,  1          // InterfaceMethod java/sql/PreparedStatement.addBatch:()V
       485: aload_0
       486: iload         17
       488: invokevirtual #239                // Method getMails:(I)Ljava/util/Set;
       491: new           #70                 // class ext/mods/gameserver/communitybbs/model/Mail
       494: dup
       495: iload         19
       497: iload         17
       499: aload         4
       501: invokevirtual #234                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       504: getstatic     #115                // Field ext/mods/gameserver/enums/MailType.INBOX:Lext/mods/gameserver/enums/MailType;
       507: aload_1
       508: aload_2
       509: aload_3
       510: aload         9
       512: aload         10
       514: iconst_1
       515: invokespecial #665                // Method ext/mods/gameserver/communitybbs/model/Mail."<init>":(IIILext/mods/gameserver/enums/MailType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/sql/Timestamp;Ljava/lang/String;Z)V
       518: invokeinterface #75,  2           // InterfaceMethod java/util/Set.add:(Ljava/lang/Object;)Z
       523: pop
       524: aload         18
       526: ifnull        560
       529: aload         18
       531: getstatic     #668                // Field ext/mods/gameserver/network/SystemMessageId.NEW_MAIL:Lext/mods/gameserver/network/SystemMessageId;
       534: invokevirtual #544                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       537: aload         18
       539: new           #671                // class ext/mods/gameserver/network/serverpackets/PlaySound
       542: dup
       543: ldc_w         #673                // String systemmsg_e.1233
       546: invokespecial #675                // Method ext/mods/gameserver/network/serverpackets/PlaySound."<init>":(Ljava/lang/String;)V
       549: invokevirtual #628                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       552: aload         18
       554: getstatic     #676                // Field ext/mods/gameserver/network/serverpackets/ExMailArrived.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ExMailArrived;
       557: invokevirtual #628                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       560: iinc          15, 1
       563: goto          257
       566: aload         12
       568: invokeinterface #682,  1          // InterfaceMethod java/sql/PreparedStatement.executeBatch:()[I
       573: astore        13
       575: aload         13
       577: arraylength
       578: ifle          744
       581: aload_0
       582: invokevirtual #659                // Method getNewMailId:()I
       585: istore        14
       587: aload         12
       589: iconst_1
       590: iload         14
       592: invokeinterface #580,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       597: aload         12
       599: iconst_2
       600: aload         4
       602: invokevirtual #234                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       605: invokeinterface #580,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       610: aload         12
       612: iconst_3
       613: aload         4
       615: invokevirtual #234                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       618: invokeinterface #580,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       623: aload         12
       625: iconst_4
       626: ldc           #142                // String sentbox
       628: invokeinterface #584,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
       633: aload         12
       635: iconst_5
       636: aload_1
       637: invokeinterface #584,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
       642: aload         12
       644: bipush        6
       646: aload_2
       647: invokeinterface #584,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
       652: aload         12
       654: bipush        7
       656: aload_3
       657: invokeinterface #584,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
       662: aload         12
       664: bipush        8
       666: aload         9
       668: invokeinterface #588,  3          // InterfaceMethod java/sql/PreparedStatement.setTimestamp:(ILjava/sql/Timestamp;)V
       673: aload         12
       675: bipush        9
       677: iconst_0
       678: invokeinterface #580,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       683: aload         12
       685: invokeinterface #686,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
       690: pop
       691: aload_0
       692: aload         4
       694: invokevirtual #234                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       697: invokevirtual #239                // Method getMails:(I)Ljava/util/Set;
       700: new           #70                 // class ext/mods/gameserver/communitybbs/model/Mail
       703: dup
       704: iload         14
       706: aload         4
       708: invokevirtual #234                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       711: aload         4
       713: invokevirtual #234                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       716: getstatic     #224                // Field ext/mods/gameserver/enums/MailType.SENTBOX:Lext/mods/gameserver/enums/MailType;
       719: aload_1
       720: aload_2
       721: aload_3
       722: aload         9
       724: aload         10
       726: iconst_0
       727: invokespecial #665                // Method ext/mods/gameserver/communitybbs/model/Mail."<init>":(IIILext/mods/gameserver/enums/MailType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/sql/Timestamp;Ljava/lang/String;Z)V
       730: invokeinterface #75,  2           // InterfaceMethod java/util/Set.add:(Ljava/lang/Object;)Z
       735: pop
       736: aload         4
       738: getstatic     #689                // Field ext/mods/gameserver/network/SystemMessageId.SENT_MAIL:Lext/mods/gameserver/network/SystemMessageId;
       741: invokevirtual #544                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       744: aload         12
       746: ifnull        788
       749: aload         12
       751: invokeinterface #90,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       756: goto          788
       759: astore        13
       761: aload         12
       763: ifnull        785
       766: aload         12
       768: invokeinterface #90,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       773: goto          785
       776: astore        14
       778: aload         13
       780: aload         14
       782: invokevirtual #86                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       785: aload         13
       787: athrow
       788: aload         11
       790: ifnull        832
       793: aload         11
       795: invokeinterface #91,  1           // InterfaceMethod java/sql/Connection.close:()V
       800: goto          832
       803: astore        12
       805: aload         11
       807: ifnull        829
       810: aload         11
       812: invokeinterface #91,  1           // InterfaceMethod java/sql/Connection.close:()V
       817: goto          829
       820: astore        13
       822: aload         12
       824: aload         13
       826: invokevirtual #86                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       829: aload         12
       831: athrow
       832: goto          860
       835: astore        11
       837: getstatic     #94                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       840: ldc_w         #692                // String Couldn\'t send mail for {}.
       843: aload         11
       845: iconst_1
       846: anewarray     #371                // class java/lang/Object
       849: dup
       850: iconst_0
       851: aload         4
       853: invokevirtual #694                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       856: aastore
       857: invokevirtual #697                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
       860: return
      Exception table:
         from    to  target type
           172   744   759   Class java/lang/Throwable
           766   773   776   Class java/lang/Throwable
           160   788   803   Class java/lang/Throwable
           810   817   820   Class java/lang/Throwable
           155   832   835   Class java/lang/Exception
      LineNumberTable:
        line 367: 0
        line 369: 8
        line 371: 23
        line 373: 61
        line 374: 69
        line 377: 70
        line 378: 81
        line 380: 96
        line 381: 104
        line 384: 105
        line 386: 116
        line 388: 127
        line 389: 138
        line 391: 155
        line 392: 160
        line 394: 172
        line 395: 185
        line 396: 195
        line 397: 204
        line 398: 214
        line 399: 224
        line 400: 235
        line 402: 245
        line 404: 271
        line 405: 281
        line 407: 296
        line 408: 304
        line 411: 307
        line 413: 317
        line 415: 325
        line 417: 336
        line 418: 352
        line 421: 355
        line 423: 360
        line 425: 368
        line 426: 384
        line 429: 387
        line 431: 400
        line 432: 416
        line 436: 419
        line 438: 428
        line 439: 436
        line 440: 441
        line 446: 452
        line 448: 458
        line 449: 468
        line 450: 478
        line 452: 485
        line 454: 524
        line 456: 529
        line 457: 537
        line 458: 552
        line 402: 560
        line 462: 566
        line 463: 575
        line 465: 581
        line 467: 587
        line 468: 597
        line 469: 610
        line 470: 623
        line 471: 633
        line 472: 642
        line 473: 652
        line 474: 662
        line 475: 673
        line 476: 683
        line 478: 691
        line 480: 736
        line 482: 744
        line 391: 759
        line 482: 788
        line 391: 803
        line 486: 832
        line 483: 835
        line 485: 837
        line 487: 860
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          281     279    17 recipientId   I
          317     243    18 recipientPlayer   Lext/mods/gameserver/model/actor/Player;
          458     102    19    id   I
          271     289    16 recipientName   Ljava/lang/String;
          587     157    14    id   I
          575     169    13 result   [I
          172     616    12    ps   Ljava/sql/PreparedStatement;
          160     672    11   con   Ljava/sql/Connection;
          837      23    11     e   Ljava/lang/Exception;
            0     861     0  this   Lext/mods/gameserver/communitybbs/manager/MailBBSManager;
            0     861     1 recipients   Ljava/lang/String;
            0     861     2 subject   Ljava/lang/String;
            0     861     3 message   Ljava/lang/String;
            0     861     4 player   Lext/mods/gameserver/model/actor/Player;
            8     853     5 currentDate   J
           23     838     7    ts   Ljava/sql/Timestamp;
           81     780     8 recipientNames   [Ljava/lang/String;
          138     723     9  time   Ljava/sql/Timestamp;
          155     706    10 formattedTime   Ljava/lang/String;
      StackMapTable: number_of_entries = 22
        frame_type = 253 /* append */
          offset_delta = 70
          locals = [ long, class java/sql/Timestamp ]
        frame_type = 252 /* append */
          offset_delta = 34
          locals = [ class "[Ljava/lang/String;" ]
        frame_type = 255 /* full_frame */
          offset_delta = 151
          locals = [ class ext/mods/gameserver/communitybbs/manager/MailBBSManager, class java/lang/String, class java/lang/String, class java/lang/String, class ext/mods/gameserver/model/actor/Player, long, class java/sql/Timestamp, class "[Ljava/lang/String;", class java/sql/Timestamp, class java/lang/String, class java/sql/Connection, class java/sql/PreparedStatement, class "[Ljava/lang/String;", int, int ]
          stack = []
        frame_type = 253 /* append */
          offset_delta = 38
          locals = [ class java/lang/String, int ]
        frame_type = 10 /* same */
        frame_type = 252 /* append */
          offset_delta = 47
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 31 /* same */
        frame_type = 31 /* same */
        frame_type = 32 /* same */
        frame_type = 248 /* chop */
          offset_delta = 107
        frame_type = 248 /* chop */
          offset_delta = 5
        frame_type = 251 /* same_frame_extended */
          offset_delta = 177
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/communitybbs/manager/MailBBSManager, class java/lang/String, class java/lang/String, class java/lang/String, class ext/mods/gameserver/model/actor/Player, long, class java/sql/Timestamp, class "[Ljava/lang/String;", class java/sql/Timestamp, class java/lang/String, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/communitybbs/manager/MailBBSManager, class java/lang/String, class java/lang/String, class java/lang/String, class ext/mods/gameserver/model/actor/Player, long, class java/sql/Timestamp, class "[Ljava/lang/String;", class java/sql/Timestamp, class java/lang/String, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 24 /* same */

  public static ext.mods.gameserver.communitybbs.manager.MailBBSManager getInstance();
    descriptor: ()Lext/mods/gameserver/communitybbs/manager/MailBBSManager;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #731                // Field ext/mods/gameserver/communitybbs/manager/MailBBSManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/communitybbs/manager/MailBBSManager;
         3: areturn
      LineNumberTable:
        line 606: 0
}
SourceFile: "MailBBSManager.java"
NestMembers:
  ext/mods/gameserver/communitybbs/manager/MailBBSManager$SingletonHolder
BootstrapMethods:
  0: #876 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #845 (Ljava/lang/Object;)Ljava/lang/Object;
      #846 REF_invokeStatic ext/mods/gameserver/communitybbs/manager/MailBBSManager.lambda$new$0:(Ljava/lang/Integer;)Ljava/util/Set;
      #849 (Ljava/lang/Integer;)Ljava/util/Set;
  1: #876 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #845 (Ljava/lang/Object;)Ljava/lang/Object;
      #850 REF_invokeStatic ext/mods/gameserver/communitybbs/manager/MailBBSManager.lambda$getMails$0:(Ljava/lang/Integer;)Ljava/util/Set;
      #849 (Ljava/lang/Integer;)Ljava/util/Set;
  2: #876 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #853 (Ljava/lang/Object;)Z
      #854 REF_invokeStatic ext/mods/gameserver/communitybbs/manager/MailBBSManager.lambda$getMail$0:(ILext/mods/gameserver/communitybbs/model/Mail;)Z
      #857 (Lext/mods/gameserver/communitybbs/model/Mail;)Z
  3: #876 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #853 (Ljava/lang/Object;)Z
      #859 REF_invokeVirtual ext/mods/gameserver/communitybbs/model/Mail.isUnread:()Z
      #857 (Lext/mods/gameserver/communitybbs/model/Mail;)Z
  4: #883 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #860 ;\u0001;\u0001
  5: #883 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #862 \u0001&nbsp;&gt;&nbsp;\u0001
  6: #883 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #864 \u0001
  7: #883 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #866 \u0001&nbsp;&gt;&nbsp;<a action=\"bypass _bbsmail;view;\u0001\">\u0001</a>&nbsp;&gt;&nbsp;
  8: #883 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #868 Re: \u0001
  9: #876 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #853 (Ljava/lang/Object;)Z
      #870 REF_invokeStatic ext/mods/gameserver/communitybbs/manager/MailBBSManager.lambda$sendMail$0:(Ljava/sql/Timestamp;Lext/mods/gameserver/communitybbs/model/Mail;)Z
      #857 (Lext/mods/gameserver/communitybbs/model/Mail;)Z
  10: #876 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #853 (Ljava/lang/Object;)Z
      #873 REF_invokeStatic ext/mods/gameserver/communitybbs/manager/MailBBSManager.lambda$deleteMail$0:(ILext/mods/gameserver/communitybbs/model/Mail;)Z
      #857 (Lext/mods/gameserver/communitybbs/model/Mail;)Z
InnerClasses:
  public static final #892= #890 of #7;   // KeySetView=class java/util/concurrent/ConcurrentHashMap$KeySetView of class java/util/concurrent/ConcurrentHashMap
  public static final #898= #894 of #896; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
