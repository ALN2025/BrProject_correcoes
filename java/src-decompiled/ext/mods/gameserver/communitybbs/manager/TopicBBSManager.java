// Bytecode for: ext.mods.gameserver.communitybbs.manager.TopicBBSManager
// File: ext\mods\gameserver\communitybbs\manager\TopicBBSManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/communitybbs/manager/TopicBBSManager.class
  Last modified 9 de jul de 2026; size 11313 bytes
  MD5 checksum 3addb8971bc1cd0e0c721b05ed61b70d
  Compiled from "TopicBBSManager.java"
public class ext.mods.gameserver.communitybbs.manager.TopicBBSManager extends ext.mods.gameserver.communitybbs.manager.BaseBBSManager
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #36                         // ext/mods/gameserver/communitybbs/manager/TopicBBSManager
  super_class: #2                         // ext/mods/gameserver/communitybbs/manager/BaseBBSManager
  interfaces: 0, fields: 0, methods: 8, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/communitybbs/manager/BaseBBSManager."<init>":()V
    #2 = Class              #4            // ext/mods/gameserver/communitybbs/manager/BaseBBSManager
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               ext/mods/gameserver/communitybbs/manager/BaseBBSManager
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = String             #8            // crea
    #8 = Utf8               crea
    #9 = Methodref          #10.#11       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #10 = Class              #12           // java/lang/String
   #11 = NameAndType        #13:#14       // equals:(Ljava/lang/Object;)Z
   #12 = Utf8               java/lang/String
   #13 = Utf8               equals
   #14 = Utf8               (Ljava/lang/Object;)Z
   #15 = Methodref          #16.#17       // ext/mods/gameserver/communitybbs/CommunityBoard.getInstance:()Lext/mods/gameserver/communitybbs/CommunityBoard;
   #16 = Class              #18           // ext/mods/gameserver/communitybbs/CommunityBoard
   #17 = NameAndType        #19:#20       // getInstance:()Lext/mods/gameserver/communitybbs/CommunityBoard;
   #18 = Utf8               ext/mods/gameserver/communitybbs/CommunityBoard
   #19 = Utf8               getInstance
   #20 = Utf8               ()Lext/mods/gameserver/communitybbs/CommunityBoard;
   #21 = Methodref          #22.#23       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #22 = Class              #24           // java/lang/Integer
   #23 = NameAndType        #25:#26       // parseInt:(Ljava/lang/String;)I
   #24 = Utf8               java/lang/Integer
   #25 = Utf8               parseInt
   #26 = Utf8               (Ljava/lang/String;)I
   #27 = Methodref          #16.#28       // ext/mods/gameserver/communitybbs/CommunityBoard.getForumByID:(I)Lext/mods/gameserver/communitybbs/model/Forum;
   #28 = NameAndType        #29:#30       // getForumByID:(I)Lext/mods/gameserver/communitybbs/model/Forum;
   #29 = Utf8               getForumByID
   #30 = Utf8               (I)Lext/mods/gameserver/communitybbs/model/Forum;
   #31 = InvokeDynamic      #0:#32        // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #32 = NameAndType        #33:#34       // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #33 = Utf8               makeConcatWithConstants
   #34 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #35 = Methodref          #36.#37       // ext/mods/gameserver/communitybbs/manager/TopicBBSManager.separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #36 = Class              #38           // ext/mods/gameserver/communitybbs/manager/TopicBBSManager
   #37 = NameAndType        #39:#40       // separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #38 = Utf8               ext/mods/gameserver/communitybbs/manager/TopicBBSManager
   #39 = Utf8               separateAndSend
   #40 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #41 = Class              #42           // ext/mods/gameserver/communitybbs/model/Topic
   #42 = Utf8               ext/mods/gameserver/communitybbs/model/Topic
   #43 = Methodref          #44.#45       // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
   #44 = Class              #46           // ext/mods/gameserver/model/actor/Player
   #45 = NameAndType        #47:#48       // getName:()Ljava/lang/String;
   #46 = Utf8               ext/mods/gameserver/model/actor/Player
   #47 = Utf8               getName
   #48 = Utf8               ()Ljava/lang/String;
   #49 = Methodref          #44.#50       // ext/mods/gameserver/model/actor/Player.getObjectId:()I
   #50 = NameAndType        #51:#52       // getObjectId:()I
   #51 = Utf8               getObjectId
   #52 = Utf8               ()I
   #53 = Methodref          #41.#54       // ext/mods/gameserver/communitybbs/model/Topic."<init>":(Lext/mods/gameserver/communitybbs/model/Forum;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
   #54 = NameAndType        #5:#55        // "<init>":(Lext/mods/gameserver/communitybbs/model/Forum;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
   #55 = Utf8               (Lext/mods/gameserver/communitybbs/model/Forum;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
   #56 = Methodref          #57.#58       // ext/mods/gameserver/communitybbs/model/Forum.addTopic:(Lext/mods/gameserver/communitybbs/model/Topic;)V
   #57 = Class              #59           // ext/mods/gameserver/communitybbs/model/Forum
   #58 = NameAndType        #60:#61       // addTopic:(Lext/mods/gameserver/communitybbs/model/Topic;)V
   #59 = Utf8               ext/mods/gameserver/communitybbs/model/Forum
   #60 = Utf8               addTopic
   #61 = Utf8               (Lext/mods/gameserver/communitybbs/model/Topic;)V
   #62 = String             #63           // _bbsmemo
   #63 = Utf8               _bbsmemo
   #64 = Methodref          #36.#65       // ext/mods/gameserver/communitybbs/manager/TopicBBSManager.parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #65 = NameAndType        #66:#40       // parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #66 = Utf8               parseCmd
   #67 = String             #68           // del
   #68 = Utf8               del
   #69 = Methodref          #57.#70       // ext/mods/gameserver/communitybbs/model/Forum.getTopic:(I)Lext/mods/gameserver/communitybbs/model/Topic;
   #70 = NameAndType        #71:#72       // getTopic:(I)Lext/mods/gameserver/communitybbs/model/Topic;
   #71 = Utf8               getTopic
   #72 = Utf8               (I)Lext/mods/gameserver/communitybbs/model/Topic;
   #73 = InvokeDynamic      #1:#32        // #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #74 = Methodref          #41.#75       // ext/mods/gameserver/communitybbs/model/Topic.deleteMe:(Lext/mods/gameserver/communitybbs/model/Forum;)V
   #75 = NameAndType        #76:#77       // deleteMe:(Lext/mods/gameserver/communitybbs/model/Forum;)V
   #76 = Utf8               deleteMe
   #77 = Utf8               (Lext/mods/gameserver/communitybbs/model/Forum;)V
   #78 = Methodref          #2.#79        // ext/mods/gameserver/communitybbs/manager/BaseBBSManager.parseWrite:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #79 = NameAndType        #80:#81       // parseWrite:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #80 = Utf8               parseWrite
   #81 = Utf8               (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #82 = Methodref          #44.#83       // ext/mods/gameserver/model/actor/Player.getMemo:()Lext/mods/gameserver/communitybbs/model/Forum;
   #83 = NameAndType        #84:#85       // getMemo:()Lext/mods/gameserver/communitybbs/model/Forum;
   #84 = Utf8               getMemo
   #85 = Utf8               ()Lext/mods/gameserver/communitybbs/model/Forum;
   #86 = Methodref          #57.#87       // ext/mods/gameserver/communitybbs/model/Forum.getId:()I
   #87 = NameAndType        #88:#52       // getId:()I
   #88 = Utf8               getId
   #89 = Methodref          #36.#90       // ext/mods/gameserver/communitybbs/manager/TopicBBSManager.showTopics:(Lext/mods/gameserver/communitybbs/model/Forum;Lext/mods/gameserver/model/actor/Player;II)V
   #90 = NameAndType        #91:#92       // showTopics:(Lext/mods/gameserver/communitybbs/model/Forum;Lext/mods/gameserver/model/actor/Player;II)V
   #91 = Utf8               showTopics
   #92 = Utf8               (Lext/mods/gameserver/communitybbs/model/Forum;Lext/mods/gameserver/model/actor/Player;II)V
   #93 = String             #94           // _bbstopics;read
   #94 = Utf8               _bbstopics;read
   #95 = Methodref          #10.#96       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #96 = NameAndType        #97:#98       // startsWith:(Ljava/lang/String;)Z
   #97 = Utf8               startsWith
   #98 = Utf8               (Ljava/lang/String;)Z
   #99 = Class              #100          // java/util/StringTokenizer
  #100 = Utf8               java/util/StringTokenizer
  #101 = String             #102          // ;
  #102 = Utf8               ;
  #103 = Methodref          #99.#104      // java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
  #104 = NameAndType        #5:#105       // "<init>":(Ljava/lang/String;Ljava/lang/String;)V
  #105 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #106 = Methodref          #99.#107      // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
  #107 = NameAndType        #108:#48      // nextToken:()Ljava/lang/String;
  #108 = Utf8               nextToken
  #109 = Methodref          #99.#110      // java/util/StringTokenizer.hasMoreTokens:()Z
  #110 = NameAndType        #111:#112     // hasMoreTokens:()Z
  #111 = Utf8               hasMoreTokens
  #112 = Utf8               ()Z
  #113 = String             #114          // _bbstopics;crea
  #114 = Utf8               _bbstopics;crea
  #115 = Methodref          #36.#116      // ext/mods/gameserver/communitybbs/manager/TopicBBSManager.showNewTopic:(Lext/mods/gameserver/communitybbs/model/Forum;Lext/mods/gameserver/model/actor/Player;I)V
  #116 = NameAndType        #117:#118     // showNewTopic:(Lext/mods/gameserver/communitybbs/model/Forum;Lext/mods/gameserver/model/actor/Player;I)V
  #117 = Utf8               showNewTopic
  #118 = Utf8               (Lext/mods/gameserver/communitybbs/model/Forum;Lext/mods/gameserver/model/actor/Player;I)V
  #119 = String             #120          // _bbstopics;del
  #120 = Utf8               _bbstopics;del
  #121 = InvokeDynamic      #2:#122       // #2:makeConcatWithConstants:(I)Ljava/lang/String;
  #122 = NameAndType        #33:#123      // makeConcatWithConstants:(I)Ljava/lang/String;
  #123 = Utf8               (I)Ljava/lang/String;
  #124 = InvokeDynamic      #3:#122       // #3:makeConcatWithConstants:(I)Ljava/lang/String;
  #125 = Methodref          #2.#65        // ext/mods/gameserver/communitybbs/manager/BaseBBSManager.parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #126 = Methodref          #57.#127      // ext/mods/gameserver/communitybbs/model/Forum.getType:()Lext/mods/gameserver/enums/bbs/ForumType;
  #127 = NameAndType        #128:#129     // getType:()Lext/mods/gameserver/enums/bbs/ForumType;
  #128 = Utf8               getType
  #129 = Utf8               ()Lext/mods/gameserver/enums/bbs/ForumType;
  #130 = Fieldref           #131.#132     // ext/mods/gameserver/enums/bbs/ForumType.MEMO:Lext/mods/gameserver/enums/bbs/ForumType;
  #131 = Class              #133          // ext/mods/gameserver/enums/bbs/ForumType
  #132 = NameAndType        #134:#135     // MEMO:Lext/mods/gameserver/enums/bbs/ForumType;
  #133 = Utf8               ext/mods/gameserver/enums/bbs/ForumType
  #134 = Utf8               MEMO
  #135 = Utf8               Lext/mods/gameserver/enums/bbs/ForumType;
  #136 = Methodref          #36.#137      // ext/mods/gameserver/communitybbs/manager/TopicBBSManager.showMemoNewTopics:(Lext/mods/gameserver/communitybbs/model/Forum;Lext/mods/gameserver/model/actor/Player;)V
  #137 = NameAndType        #138:#139     // showMemoNewTopics:(Lext/mods/gameserver/communitybbs/model/Forum;Lext/mods/gameserver/model/actor/Player;)V
  #138 = Utf8               showMemoNewTopics
  #139 = Utf8               (Lext/mods/gameserver/communitybbs/model/Forum;Lext/mods/gameserver/model/actor/Player;)V
  #140 = InvokeDynamic      #4:#122       // #4:makeConcatWithConstants:(I)Ljava/lang/String;
  #141 = Methodref          #36.#142      // ext/mods/gameserver/communitybbs/manager/TopicBBSManager.send1001:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #142 = NameAndType        #143:#40      // send1001:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #143 = Utf8               send1001
  #144 = Methodref          #36.#145      // ext/mods/gameserver/communitybbs/manager/TopicBBSManager.send1002:(Lext/mods/gameserver/model/actor/Player;)V
  #145 = NameAndType        #146:#147     // send1002:(Lext/mods/gameserver/model/actor/Player;)V
  #146 = Utf8               send1002
  #147 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #148 = Methodref          #36.#149      // ext/mods/gameserver/communitybbs/manager/TopicBBSManager.showMemoTopics:(Lext/mods/gameserver/communitybbs/model/Forum;Lext/mods/gameserver/model/actor/Player;I)V
  #149 = NameAndType        #150:#118     // showMemoTopics:(Lext/mods/gameserver/communitybbs/model/Forum;Lext/mods/gameserver/model/actor/Player;I)V
  #150 = Utf8               showMemoTopics
  #151 = Class              #152          // java/lang/StringBuilder
  #152 = Utf8               java/lang/StringBuilder
  #153 = String             #154          // <html><body><br><br><table border=0 width=610><tr><td width=10></td><td width=600 align=left><a action=\"bypass _bbshome\">HOME</a>&nbsp;>&nbsp;<a action=\"bypass _bbsmemo\">Memo Form</a></td></tr></table><img src=\"L2UI.squareblank\" width=\"1\" height=\"10\"><center><table border=0 cellspacing=0 cellpadding=2 bgcolor=888888 width=610><tr><td FIXWIDTH=5></td><td FIXWIDTH=415 align=center>&$413;</td><td FIXWIDTH=120 align=center></td><td FIXWIDTH=70 align=center>&$418;</td></tr></table>
  #154 = Utf8               <html><body><br><br><table border=0 width=610><tr><td width=10></td><td width=600 align=left><a action=\"bypass _bbshome\">HOME</a>&nbsp;>&nbsp;<a action=\"bypass _bbsmemo\">Memo Form</a></td></tr></table><img src=\"L2UI.squareblank\" width=\"1\" height=\"10\"><center><table border=0 cellspacing=0 cellpadding=2 bgcolor=888888 width=610><tr><td FIXWIDTH=5></td><td FIXWIDTH=415 align=center>&$413;</td><td FIXWIDTH=120 align=center></td><td FIXWIDTH=70 align=center>&$418;</td></tr></table>
  #155 = Methodref          #151.#156     // java/lang/StringBuilder."<init>":(Ljava/lang/String;)V
  #156 = NameAndType        #5:#157       // "<init>":(Ljava/lang/String;)V
  #157 = Utf8               (Ljava/lang/String;)V
  #158 = Methodref          #159.#160     // java/text/DateFormat.getInstance:()Ljava/text/DateFormat;
  #159 = Class              #161          // java/text/DateFormat
  #160 = NameAndType        #19:#162      // getInstance:()Ljava/text/DateFormat;
  #161 = Utf8               java/text/DateFormat
  #162 = Utf8               ()Ljava/text/DateFormat;
  #163 = Methodref          #57.#164      // ext/mods/gameserver/communitybbs/model/Forum.getCurrentTopicId:()I
  #164 = NameAndType        #165:#52      // getCurrentTopicId:()I
  #165 = Utf8               getCurrentTopicId
  #166 = Class              #167          // java/lang/Object
  #167 = Utf8               java/lang/Object
  #168 = String             #169          // <table border=0 cellspacing=0 cellpadding=5 WIDTH=610><tr><td FIXWIDTH=5></td><td FIXWIDTH=415><a action=\"bypass _bbsposts;read;
  #169 = Utf8               <table border=0 cellspacing=0 cellpadding=5 WIDTH=610><tr><td FIXWIDTH=5></td><td FIXWIDTH=415><a action=\"bypass _bbsposts;read;
  #170 = Methodref          #22.#171      // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #171 = NameAndType        #172:#173     // valueOf:(I)Ljava/lang/Integer;
  #172 = Utf8               valueOf
  #173 = Utf8               (I)Ljava/lang/Integer;
  #174 = Methodref          #41.#87       // ext/mods/gameserver/communitybbs/model/Topic.getId:()I
  #175 = String             #176          // \">
  #176 = Utf8               \">
  #177 = Methodref          #41.#45       // ext/mods/gameserver/communitybbs/model/Topic.getName:()Ljava/lang/String;
  #178 = String             #179          // </a></td><td FIXWIDTH=120 align=center></td><td FIXWIDTH=70 align=center>
  #179 = Utf8               </a></td><td FIXWIDTH=120 align=center></td><td FIXWIDTH=70 align=center>
  #180 = Class              #181          // java/util/Date
  #181 = Utf8               java/util/Date
  #182 = Methodref          #41.#183      // ext/mods/gameserver/communitybbs/model/Topic.getDate:()J
  #183 = NameAndType        #184:#185     // getDate:()J
  #184 = Utf8               getDate
  #185 = Utf8               ()J
  #186 = Methodref          #180.#187     // java/util/Date."<init>":(J)V
  #187 = NameAndType        #5:#188       // "<init>":(J)V
  #188 = Utf8               (J)V
  #189 = Methodref          #159.#190     // java/text/DateFormat.format:(Ljava/util/Date;)Ljava/lang/String;
  #190 = NameAndType        #191:#192     // format:(Ljava/util/Date;)Ljava/lang/String;
  #191 = Utf8               format
  #192 = Utf8               (Ljava/util/Date;)Ljava/lang/String;
  #193 = String             #194          // </td></tr></table><img src=\"L2UI.Squaregray\" width=\"610\" height=\"1\">
  #194 = Utf8               </td></tr></table><img src=\"L2UI.Squaregray\" width=\"610\" height=\"1\">
  #195 = Methodref          #196.#197     // ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #196 = Class              #198          // ext/mods/commons/lang/StringUtil
  #197 = NameAndType        #199:#200     // append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #198 = Utf8               ext/mods/commons/lang/StringUtil
  #199 = Utf8               append
  #200 = Utf8               (Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #201 = String             #202          // <br><table width=610 cellspace=0 cellpadding=0><tr><td width=50><button value=\"&$422;\" action=\"bypass _bbsmemo\" back=\"l2ui_ch3.smallbutton2_down\" width=65 height=20 fore=\"l2ui_ch3.smallbutton2\"></td><td width=510 align=center><table border=0><tr>
  #202 = Utf8               <br><table width=610 cellspace=0 cellpadding=0><tr><td width=50><button value=\"&$422;\" action=\"bypass _bbsmemo\" back=\"l2ui_ch3.smallbutton2_down\" width=65 height=20 fore=\"l2ui_ch3.smallbutton2\"></td><td width=510 align=center><table border=0><tr>
  #203 = Methodref          #151.#204     // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #204 = NameAndType        #199:#205     // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #205 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
  #206 = String             #207          // <td><button action=\"\" back=\"l2ui_ch3.prev1_down\" fore=\"l2ui_ch3.prev1\" width=16 height=16 ></td>
  #207 = Utf8               <td><button action=\"\" back=\"l2ui_ch3.prev1_down\" fore=\"l2ui_ch3.prev1\" width=16 height=16 ></td>
  #208 = String             #209          // <td><button action=\"bypass _bbstopics;read;
  #209 = Utf8               <td><button action=\"bypass _bbstopics;read;
  #210 = String             #211          // \" back=\"l2ui_ch3.prev1_down\" fore=\"l2ui_ch3.prev1\" width=16 height=16 ></td>
  #211 = Utf8               \" back=\"l2ui_ch3.prev1_down\" fore=\"l2ui_ch3.prev1\" width=16 height=16 ></td>
  #212 = Methodref          #57.#213      // ext/mods/gameserver/communitybbs/model/Forum.getTopicSize:()I
  #213 = NameAndType        #214:#52      // getTopicSize:()I
  #214 = Utf8               getTopicSize
  #215 = Methodref          #216.#217     // ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
  #216 = Class              #218          // ext/mods/gameserver/data/sql/ClanTable
  #217 = NameAndType        #19:#219      // getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
  #218 = Utf8               ext/mods/gameserver/data/sql/ClanTable
  #219 = Utf8               ()Lext/mods/gameserver/data/sql/ClanTable;
  #220 = Methodref          #216.#221     // ext/mods/gameserver/data/sql/ClanTable.getClans:()Ljava/util/Collection;
  #221 = NameAndType        #222:#223     // getClans:()Ljava/util/Collection;
  #222 = Utf8               getClans
  #223 = Utf8               ()Ljava/util/Collection;
  #224 = InterfaceMethodref #225.#226     // java/util/Collection.size:()I
  #225 = Class              #227          // java/util/Collection
  #226 = NameAndType        #228:#52      // size:()I
  #227 = Utf8               java/util/Collection
  #228 = Utf8               size
  #229 = String             #230          // <td>
  #230 = Utf8               <td>
  #231 = String             #232          //  </td>
  #232 = Utf8                </td>
  #233 = String             #234          // <td><a action=\"bypass _bbstopics;read;
  #234 = Utf8               <td><a action=\"bypass _bbstopics;read;
  #235 = String             #236          // \">
  #236 = Utf8               \">
  #237 = String             #238          //  </a></td>
  #238 = Utf8                </a></td>
  #239 = String             #240          // <td><button action=\"\" back=\"l2ui_ch3.next1_down\" fore=\"l2ui_ch3.next1\" width=16 height=16 ></td>
  #240 = Utf8               <td><button action=\"\" back=\"l2ui_ch3.next1_down\" fore=\"l2ui_ch3.next1\" width=16 height=16 ></td>
  #241 = String             #242          // \" back=\"l2ui_ch3.next1_down\" fore=\"l2ui_ch3.next1\" width=16 height=16 ></td>
  #242 = Utf8               \" back=\"l2ui_ch3.next1_down\" fore=\"l2ui_ch3.next1\" width=16 height=16 ></td>
  #243 = String             #244          // </tr></table></td><td align=right><button value = \"&$421;\" action=\"bypass _bbstopics;crea;
  #244 = Utf8               </tr></table></td><td align=right><button value = \"&$421;\" action=\"bypass _bbstopics;crea;
  #245 = String             #246          // \" back=\"l2ui_ch3.smallbutton2_down\" width=65 height=20 fore=\"l2ui_ch3.smallbutton2\" ></td></tr><tr><td><img src=\"l2ui.mini_logo\" width=5 height=10></td></tr><tr><td></td><td align=center><table border=0><tr><td></td><td><edit var = \"Search\" width=130 height=11></td><td><button value=\"&$420;\" action=\"Write 5 -2 0 Search _ _\" back=\"l2ui_ch3.smallbutton2_down\" width=65 height=20 fore=\"l2ui_ch3.smallbutton2\"></td></tr></table></td></tr></table><br><br><br></center></body></html>
  #246 = Utf8               \" back=\"l2ui_ch3.smallbutton2_down\" width=65 height=20 fore=\"l2ui_ch3.smallbutton2\" ></td></tr><tr><td><img src=\"l2ui.mini_logo\" width=5 height=10></td></tr><tr><td></td><td align=center><table border=0><tr><td></td><td><edit var = \"Search\" width=130 height=11></td><td><button value=\"&$420;\" action=\"Write 5 -2 0 Search _ _\" back=\"l2ui_ch3.smallbutton2_down\" width=65 height=20 fore=\"l2ui_ch3.smallbutton2\"></td></tr></table></td></tr></table><br><br><br></center></body></html>
  #247 = Methodref          #151.#248     // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #248 = NameAndType        #249:#48      // toString:()Ljava/lang/String;
  #249 = Utf8               toString
  #250 = Fieldref           #251.#252     // ext/mods/gameserver/communitybbs/manager/TopicBBSManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/communitybbs/manager/TopicBBSManager;
  #251 = Class              #253          // ext/mods/gameserver/communitybbs/manager/TopicBBSManager$SingletonHolder
  #252 = NameAndType        #254:#255     // INSTANCE:Lext/mods/gameserver/communitybbs/manager/TopicBBSManager;
  #253 = Utf8               ext/mods/gameserver/communitybbs/manager/TopicBBSManager$SingletonHolder
  #254 = Utf8               INSTANCE
  #255 = Utf8               Lext/mods/gameserver/communitybbs/manager/TopicBBSManager;
  #256 = Utf8               Code
  #257 = Utf8               LineNumberTable
  #258 = Utf8               LocalVariableTable
  #259 = Utf8               this
  #260 = Utf8               forum
  #261 = Utf8               Lext/mods/gameserver/communitybbs/model/Forum;
  #262 = Utf8               topic
  #263 = Utf8               Lext/mods/gameserver/communitybbs/model/Topic;
  #264 = Utf8               ar1
  #265 = Utf8               Ljava/lang/String;
  #266 = Utf8               ar2
  #267 = Utf8               ar3
  #268 = Utf8               ar4
  #269 = Utf8               ar5
  #270 = Utf8               player
  #271 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #272 = Utf8               StackMapTable
  #273 = Utf8               st
  #274 = Utf8               Ljava/util/StringTokenizer;
  #275 = Utf8               forumId
  #276 = Utf8               I
  #277 = Utf8               index
  #278 = Utf8               ind
  #279 = Utf8               topicId
  #280 = Utf8               command
  #281 = Utf8               html
  #282 = Utf8               i
  #283 = Utf8               j
  #284 = Utf8               sb
  #285 = Utf8               Ljava/lang/StringBuilder;
  #286 = Utf8               dateFormat
  #287 = Utf8               Ljava/text/DateFormat;
  #288 = Utf8               pageNumber
  #289 = Utf8               ()Lext/mods/gameserver/communitybbs/manager/TopicBBSManager;
  #290 = Utf8               SourceFile
  #291 = Utf8               TopicBBSManager.java
  #292 = Utf8               NestMembers
  #293 = Utf8               BootstrapMethods
  #294 = String             #295          // <html><body><br><br><center>The forum named \'\u0001\' doesn\'t exist.</center></body></html>
  #295 = Utf8               <html><body><br><br><center>The forum named \'\u0001\' doesn\'t exist.</center></body></html>
  #296 = String             #297          // <html><body><br><br><center>The topic named \'\u0001\' doesn\'t exist.</center></body></html>
  #297 = Utf8               <html><body><br><br><center>The topic named \'\u0001\' doesn\'t exist.</center></body></html>
  #298 = String             #299          // <html><body><br><br><center>The forum #\u0001 doesn\'t exist.</center></body></html>
  #299 = Utf8               <html><body><br><br><center>The forum #\u0001 doesn\'t exist.</center></body></html>
  #300 = String             #301          // <html><body><br><br><center>The topic #\u0001 doesn\'t exist.</center></body></html>
  #301 = Utf8               <html><body><br><br><center>The topic #\u0001 doesn\'t exist.</center></body></html>
  #302 = String             #303          // <html><body><br><br><table border=0 width=610><tr><td width=10></td><td width=600 align=left><a action=\"bypass _bbshome\">HOME</a>&nbsp;>&nbsp;<a action=\"bypass _bbsmemo\">Memo Form</a></td></tr></table><img src=\"L2UI.squareblank\" width=\"1\" height=\"10\"><center><table border=0 cellspacing=0 cellpadding=0><tr><td width=610><img src=\"sek.cbui355\" width=\"610\" height=\"1\"><br1><img src=\"sek.cbui355\" width=\"610\" height=\"1\"></td></tr></table><table fixwidth=610 border=0 cellspacing=0 cellpadding=0><tr><td><img src=\"l2ui.mini_logo\" width=5 height=20></td></tr><tr><td><img src=\"l2ui.mini_logo\" width=5 height=1></td><td align=center FIXWIDTH=60 height=29>&$413;</td><td FIXWIDTH=540><edit var = \"Title\" width=540 height=13></td><td><img src=\"l2ui.mini_logo\" width=5 height=1></td></tr></table><table fixwidth=610 border=0 cellspacing=0 cellpadding=0><tr><td><img src=\"l2ui.mini_logo\" width=5 height=10></td></tr><tr><td><img src=\"l2ui.mini_logo\" width=5 height=1></td><td align=center FIXWIDTH=60 height=29 valign=top>&$427;</td><td align=center FIXWIDTH=540><MultiEdit var =\"Content\" width=535 height=313></td><td><img src=\"l2ui.mini_logo\" width=5 height=1></td></tr><tr><td><img src=\"l2ui.mini_logo\" width=5 height=10></td></tr></table><table fixwidth=610 border=0 cellspacing=0 cellpadding=0><tr><td><img src=\"l2ui.mini_logo\" width=5 height=10></td></tr><tr><td><img src=\"l2ui.mini_logo\" width=5 height=1></td><td align=center FIXWIDTH=60 height=29>&nbsp;</td><td align=center FIXWIDTH=70><button value=\"&$140;\" action=\"Write Topic crea \u0001 Title Content Title\" back=\"l2ui_ch3.smallbutton2_down\" width=65 height=20 fore=\"l2ui_ch3.smallbutton2\" ></td><td align=center FIXWIDTH=70><button value = \"&$141;\" action=\"bypass _bbsmemo\" back=\"l2ui_ch3.smallbutton2_down\" width=65 height=20 fore=\"l2ui_ch3.smallbutton2\"> </td><td align=center FIXWIDTH=400>&nbsp;</td><td><img src=\"l2ui.mini_logo\" width=5 height=1></td></tr></table></center></body></html>
  #303 = Utf8               <html><body><br><br><table border=0 width=610><tr><td width=10></td><td width=600 align=left><a action=\"bypass _bbshome\">HOME</a>&nbsp;>&nbsp;<a action=\"bypass _bbsmemo\">Memo Form</a></td></tr></table><img src=\"L2UI.squareblank\" width=\"1\" height=\"10\"><center><table border=0 cellspacing=0 cellpadding=0><tr><td width=610><img src=\"sek.cbui355\" width=\"610\" height=\"1\"><br1><img src=\"sek.cbui355\" width=\"610\" height=\"1\"></td></tr></table><table fixwidth=610 border=0 cellspacing=0 cellpadding=0><tr><td><img src=\"l2ui.mini_logo\" width=5 height=20></td></tr><tr><td><img src=\"l2ui.mini_logo\" width=5 height=1></td><td align=center FIXWIDTH=60 height=29>&$413;</td><td FIXWIDTH=540><edit var = \"Title\" width=540 height=13></td><td><img src=\"l2ui.mini_logo\" width=5 height=1></td></tr></table><table fixwidth=610 border=0 cellspacing=0 cellpadding=0><tr><td><img src=\"l2ui.mini_logo\" width=5 height=10></td></tr><tr><td><img src=\"l2ui.mini_logo\" width=5 height=1></td><td align=center FIXWIDTH=60 height=29 valign=top>&$427;</td><td align=center FIXWIDTH=540><MultiEdit var =\"Content\" width=535 height=313></td><td><img src=\"l2ui.mini_logo\" width=5 height=1></td></tr><tr><td><img src=\"l2ui.mini_logo\" width=5 height=10></td></tr></table><table fixwidth=610 border=0 cellspacing=0 cellpadding=0><tr><td><img src=\"l2ui.mini_logo\" width=5 height=10></td></tr><tr><td><img src=\"l2ui.mini_logo\" width=5 height=1></td><td align=center FIXWIDTH=60 height=29>&nbsp;</td><td align=center FIXWIDTH=70><button value=\"&$140;\" action=\"Write Topic crea \u0001 Title Content Title\" back=\"l2ui_ch3.smallbutton2_down\" width=65 height=20 fore=\"l2ui_ch3.smallbutton2\" ></td><td align=center FIXWIDTH=70><button value = \"&$141;\" action=\"bypass _bbsmemo\" back=\"l2ui_ch3.smallbutton2_down\" width=65 height=20 fore=\"l2ui_ch3.smallbutton2\"> </td><td align=center FIXWIDTH=400>&nbsp;</td><td><img src=\"l2ui.mini_logo\" width=5 height=1></td></tr></table></center></body></html>
  #304 = MethodHandle       6:#305        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #305 = Methodref          #306.#307     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #306 = Class              #308          // java/lang/invoke/StringConcatFactory
  #307 = NameAndType        #33:#309      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #308 = Utf8               java/lang/invoke/StringConcatFactory
  #309 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #310 = Utf8               InnerClasses
  #311 = Utf8               SingletonHolder
  #312 = Class              #313          // java/lang/invoke/MethodHandles$Lookup
  #313 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #314 = Class              #315          // java/lang/invoke/MethodHandles
  #315 = Utf8               java/lang/invoke/MethodHandles
  #316 = Utf8               Lookup
{
  protected ext.mods.gameserver.communitybbs.manager.TopicBBSManager();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/communitybbs/manager/BaseBBSManager."<init>":()V
         4: return
      LineNumberTable:
        line 36: 0
        line 37: 4
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/communitybbs/manager/TopicBBSManager;

  public void parseWrite(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=9, args_size=7
         0: aload_1
         1: ldc           #7                  // String crea
         3: invokevirtual #9                  // Method java/lang/String.equals:(Ljava/lang/Object;)Z
         6: ifeq          77
         9: invokestatic  #15                 // Method ext/mods/gameserver/communitybbs/CommunityBoard.getInstance:()Lext/mods/gameserver/communitybbs/CommunityBoard;
        12: aload_2
        13: invokestatic  #21                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        16: invokevirtual #27                 // Method ext/mods/gameserver/communitybbs/CommunityBoard.getForumByID:(I)Lext/mods/gameserver/communitybbs/model/Forum;
        19: astore        7
        21: aload         7
        23: ifnonnull     38
        26: aload_2
        27: invokedynamic #31,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        32: aload         6
        34: invokestatic  #35                 // Method separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
        37: return
        38: aload         7
        40: new           #41                 // class ext/mods/gameserver/communitybbs/model/Topic
        43: dup
        44: aload         7
        46: aload         5
        48: aload         6
        50: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
        53: aload         6
        55: invokevirtual #49                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        58: aload         4
        60: invokespecial #53                 // Method ext/mods/gameserver/communitybbs/model/Topic."<init>":(Lext/mods/gameserver/communitybbs/model/Forum;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
        63: invokevirtual #56                 // Method ext/mods/gameserver/communitybbs/model/Forum.addTopic:(Lext/mods/gameserver/communitybbs/model/Topic;)V
        66: aload_0
        67: ldc           #62                 // String _bbsmemo
        69: aload         6
        71: invokevirtual #64                 // Method parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
        74: goto          174
        77: aload_1
        78: ldc           #67                 // String del
        80: invokevirtual #9                  // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        83: ifeq          161
        86: invokestatic  #15                 // Method ext/mods/gameserver/communitybbs/CommunityBoard.getInstance:()Lext/mods/gameserver/communitybbs/CommunityBoard;
        89: aload_2
        90: invokestatic  #21                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        93: invokevirtual #27                 // Method ext/mods/gameserver/communitybbs/CommunityBoard.getForumByID:(I)Lext/mods/gameserver/communitybbs/model/Forum;
        96: astore        7
        98: aload         7
       100: ifnonnull     115
       103: aload_2
       104: invokedynamic #31,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       109: aload         6
       111: invokestatic  #35                 // Method separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       114: return
       115: aload         7
       117: aload_3
       118: invokestatic  #21                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       121: invokevirtual #69                 // Method ext/mods/gameserver/communitybbs/model/Forum.getTopic:(I)Lext/mods/gameserver/communitybbs/model/Topic;
       124: astore        8
       126: aload         8
       128: ifnonnull     143
       131: aload_3
       132: invokedynamic #73,  0             // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       137: aload         6
       139: invokestatic  #35                 // Method separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       142: return
       143: aload         8
       145: aload         7
       147: invokevirtual #74                 // Method ext/mods/gameserver/communitybbs/model/Topic.deleteMe:(Lext/mods/gameserver/communitybbs/model/Forum;)V
       150: aload_0
       151: ldc           #62                 // String _bbsmemo
       153: aload         6
       155: invokevirtual #64                 // Method parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       158: goto          174
       161: aload_0
       162: aload_1
       163: aload_2
       164: aload_3
       165: aload         4
       167: aload         5
       169: aload         6
       171: invokespecial #78                 // Method ext/mods/gameserver/communitybbs/manager/BaseBBSManager.parseWrite:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       174: return
      LineNumberTable:
        line 42: 0
        line 44: 9
        line 45: 21
        line 47: 26
        line 48: 37
        line 51: 38
        line 53: 66
        line 54: 74
        line 55: 77
        line 57: 86
        line 58: 98
        line 60: 103
        line 61: 114
        line 64: 115
        line 65: 126
        line 67: 131
        line 68: 142
        line 71: 143
        line 73: 150
        line 74: 158
        line 76: 161
        line 77: 174
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           21      53     7 forum   Lext/mods/gameserver/communitybbs/model/Forum;
           98      60     7 forum   Lext/mods/gameserver/communitybbs/model/Forum;
          126      32     8 topic   Lext/mods/gameserver/communitybbs/model/Topic;
            0     175     0  this   Lext/mods/gameserver/communitybbs/manager/TopicBBSManager;
            0     175     1   ar1   Ljava/lang/String;
            0     175     2   ar2   Ljava/lang/String;
            0     175     3   ar3   Ljava/lang/String;
            0     175     4   ar4   Ljava/lang/String;
            0     175     5   ar5   Ljava/lang/String;
            0     175     6 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 6
        frame_type = 252 /* append */
          offset_delta = 38
          locals = [ class ext/mods/gameserver/communitybbs/model/Forum ]
        frame_type = 250 /* chop */
          offset_delta = 38
        frame_type = 252 /* append */
          offset_delta = 37
          locals = [ class ext/mods/gameserver/communitybbs/model/Forum ]
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ class ext/mods/gameserver/communitybbs/model/Topic ]
        frame_type = 249 /* chop */
          offset_delta = 17
        frame_type = 12 /* same */

  public void parseCmd(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=8, args_size=3
         0: aload_1
         1: ldc           #62                 // String _bbsmemo
         3: invokevirtual #9                  // Method java/lang/String.equals:(Ljava/lang/Object;)Z
         6: ifeq          31
         9: aload_2
        10: invokevirtual #82                 // Method ext/mods/gameserver/model/actor/Player.getMemo:()Lext/mods/gameserver/communitybbs/model/Forum;
        13: astore_3
        14: aload_3
        15: ifnull        28
        18: aload_3
        19: aload_2
        20: iconst_1
        21: aload_3
        22: invokevirtual #86                 // Method ext/mods/gameserver/communitybbs/model/Forum.getId:()I
        25: invokestatic  #89                 // Method showTopics:(Lext/mods/gameserver/communitybbs/model/Forum;Lext/mods/gameserver/model/actor/Player;II)V
        28: goto          302
        31: aload_1
        32: ldc           #93                 // String _bbstopics;read
        34: invokevirtual #95                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        37: ifeq          122
        40: new           #99                 // class java/util/StringTokenizer
        43: dup
        44: aload_1
        45: ldc           #101                // String ;
        47: invokespecial #103                // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
        50: astore_3
        51: aload_3
        52: invokevirtual #106                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        55: pop
        56: aload_3
        57: invokevirtual #106                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        60: pop
        61: aload_3
        62: invokevirtual #106                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        65: invokestatic  #21                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        68: istore        4
        70: aload_3
        71: invokevirtual #109                // Method java/util/StringTokenizer.hasMoreTokens:()Z
        74: ifeq          84
        77: aload_3
        78: invokevirtual #106                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        81: goto          85
        84: aconst_null
        85: astore        5
        87: aload         5
        89: ifnonnull     96
        92: iconst_1
        93: goto          101
        96: aload         5
        98: invokestatic  #21                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       101: istore        6
       103: invokestatic  #15                 // Method ext/mods/gameserver/communitybbs/CommunityBoard.getInstance:()Lext/mods/gameserver/communitybbs/CommunityBoard;
       106: iload         4
       108: invokevirtual #27                 // Method ext/mods/gameserver/communitybbs/CommunityBoard.getForumByID:(I)Lext/mods/gameserver/communitybbs/model/Forum;
       111: aload_2
       112: iload         6
       114: iload         4
       116: invokestatic  #89                 // Method showTopics:(Lext/mods/gameserver/communitybbs/model/Forum;Lext/mods/gameserver/model/actor/Player;II)V
       119: goto          302
       122: aload_1
       123: ldc           #113                // String _bbstopics;crea
       125: invokevirtual #95                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       128: ifeq          178
       131: new           #99                 // class java/util/StringTokenizer
       134: dup
       135: aload_1
       136: ldc           #101                // String ;
       138: invokespecial #103                // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
       141: astore_3
       142: aload_3
       143: invokevirtual #106                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       146: pop
       147: aload_3
       148: invokevirtual #106                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       151: pop
       152: aload_3
       153: invokevirtual #106                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       156: invokestatic  #21                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       159: istore        4
       161: invokestatic  #15                 // Method ext/mods/gameserver/communitybbs/CommunityBoard.getInstance:()Lext/mods/gameserver/communitybbs/CommunityBoard;
       164: iload         4
       166: invokevirtual #27                 // Method ext/mods/gameserver/communitybbs/CommunityBoard.getForumByID:(I)Lext/mods/gameserver/communitybbs/model/Forum;
       169: aload_2
       170: iload         4
       172: invokestatic  #115                // Method showNewTopic:(Lext/mods/gameserver/communitybbs/model/Forum;Lext/mods/gameserver/model/actor/Player;I)V
       175: goto          302
       178: aload_1
       179: ldc           #119                // String _bbstopics;del
       181: invokevirtual #95                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       184: ifeq          296
       187: new           #99                 // class java/util/StringTokenizer
       190: dup
       191: aload_1
       192: ldc           #101                // String ;
       194: invokespecial #103                // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
       197: astore_3
       198: aload_3
       199: invokevirtual #106                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       202: pop
       203: aload_3
       204: invokevirtual #106                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       207: pop
       208: aload_3
       209: invokevirtual #106                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       212: invokestatic  #21                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       215: istore        4
       217: aload_3
       218: invokevirtual #106                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       221: invokestatic  #21                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       224: istore        5
       226: invokestatic  #15                 // Method ext/mods/gameserver/communitybbs/CommunityBoard.getInstance:()Lext/mods/gameserver/communitybbs/CommunityBoard;
       229: iload         4
       231: invokevirtual #27                 // Method ext/mods/gameserver/communitybbs/CommunityBoard.getForumByID:(I)Lext/mods/gameserver/communitybbs/model/Forum;
       234: astore        6
       236: aload         6
       238: ifnonnull     253
       241: iload         4
       243: invokedynamic #121,  0            // InvokeDynamic #2:makeConcatWithConstants:(I)Ljava/lang/String;
       248: aload_2
       249: invokestatic  #35                 // Method separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       252: return
       253: aload         6
       255: iload         5
       257: invokevirtual #69                 // Method ext/mods/gameserver/communitybbs/model/Forum.getTopic:(I)Lext/mods/gameserver/communitybbs/model/Topic;
       260: astore        7
       262: aload         7
       264: ifnonnull     279
       267: iload         5
       269: invokedynamic #124,  0            // InvokeDynamic #3:makeConcatWithConstants:(I)Ljava/lang/String;
       274: aload_2
       275: invokestatic  #35                 // Method separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       278: return
       279: aload         7
       281: aload         6
       283: invokevirtual #74                 // Method ext/mods/gameserver/communitybbs/model/Topic.deleteMe:(Lext/mods/gameserver/communitybbs/model/Forum;)V
       286: aload_0
       287: ldc           #62                 // String _bbsmemo
       289: aload_2
       290: invokevirtual #64                 // Method parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       293: goto          302
       296: aload_0
       297: aload_1
       298: aload_2
       299: invokespecial #125                // Method ext/mods/gameserver/communitybbs/manager/BaseBBSManager.parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       302: return
      LineNumberTable:
        line 82: 0
        line 84: 9
        line 85: 14
        line 86: 18
        line 87: 28
        line 88: 31
        line 90: 40
        line 91: 51
        line 92: 56
        line 94: 61
        line 95: 70
        line 96: 87
        line 98: 103
        line 99: 119
        line 100: 122
        line 102: 131
        line 103: 142
        line 104: 147
        line 106: 152
        line 108: 161
        line 109: 175
        line 110: 178
        line 112: 187
        line 113: 198
        line 114: 203
        line 116: 208
        line 117: 217
        line 119: 226
        line 120: 236
        line 122: 241
        line 123: 252
        line 126: 253
        line 127: 262
        line 129: 267
        line 130: 278
        line 133: 279
        line 135: 286
        line 136: 293
        line 138: 296
        line 139: 302
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           14      14     3 forum   Lext/mods/gameserver/communitybbs/model/Forum;
           51      68     3    st   Ljava/util/StringTokenizer;
           70      49     4 forumId   I
           87      32     5 index   Ljava/lang/String;
          103      16     6   ind   I
          142      33     3    st   Ljava/util/StringTokenizer;
          161      14     4 forumId   I
          198      95     3    st   Ljava/util/StringTokenizer;
          217      76     4 forumId   I
          226      67     5 topicId   I
          236      57     6 forum   Lext/mods/gameserver/communitybbs/model/Forum;
          262      31     7 topic   Lext/mods/gameserver/communitybbs/model/Topic;
            0     303     0  this   Lext/mods/gameserver/communitybbs/manager/TopicBBSManager;
            0     303     1 command   Ljava/lang/String;
            0     303     2 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 12
        frame_type = 28 /* same */
        frame_type = 2 /* same */
        frame_type = 253 /* append */
          offset_delta = 52
          locals = [ class java/util/StringTokenizer, int ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/lang/String ]
        frame_type = 68 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 248 /* chop */
          offset_delta = 20
        frame_type = 55 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 74
          locals = [ class ext/mods/gameserver/communitybbs/manager/TopicBBSManager, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, int, int, class ext/mods/gameserver/communitybbs/model/Forum ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 25
          locals = [ class ext/mods/gameserver/communitybbs/model/Topic ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/communitybbs/manager/TopicBBSManager, class java/lang/String, class ext/mods/gameserver/model/actor/Player ]
          stack = []
        frame_type = 5 /* same */

  public static ext.mods.gameserver.communitybbs.manager.TopicBBSManager getInstance();
    descriptor: ()Lext/mods/gameserver/communitybbs/manager/TopicBBSManager;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #250                // Field ext/mods/gameserver/communitybbs/manager/TopicBBSManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/communitybbs/manager/TopicBBSManager;
         3: areturn
      LineNumberTable:
        line 225: 0
}
SourceFile: "TopicBBSManager.java"
NestMembers:
  ext/mods/gameserver/communitybbs/manager/TopicBBSManager$SingletonHolder
BootstrapMethods:
  0: #304 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #294 <html><body><br><br><center>The forum named \'\u0001\' doesn\'t exist.</center></body></html>
  1: #304 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #296 <html><body><br><br><center>The topic named \'\u0001\' doesn\'t exist.</center></body></html>
  2: #304 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #298 <html><body><br><br><center>The forum #\u0001 doesn\'t exist.</center></body></html>
  3: #304 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #300 <html><body><br><br><center>The topic #\u0001 doesn\'t exist.</center></body></html>
  4: #304 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #302 <html><body><br><br><table border=0 width=610><tr><td width=10></td><td width=600 align=left><a action=\"bypass _bbshome\">HOME</a>&nbsp;>&nbsp;<a action=\"bypass _bbsmemo\">Memo Form</a></td></tr></table><img src=\"L2UI.squareblank\" width=\"1\" height=\"10\"><center><table border=0 cellspacing=0 cellpadding=0><tr><td width=610><img src=\"sek.cbui355\" width=\"610\" height=\"1\"><br1><img src=\"sek.cbui355\" width=\"610\" height=\"1\"></td></tr></table><table fixwidth=610 border=0 cellspacing=0 cellpadding=0><tr><td><img src=\"l2ui.mini_logo\" width=5 height=20></td></tr><tr><td><img src=\"l2ui.mini_logo\" width=5 height=1></td><td align=center FIXWIDTH=60 height=29>&$413;</td><td FIXWIDTH=540><edit var = \"Title\" width=540 height=13></td><td><img src=\"l2ui.mini_logo\" width=5 height=1></td></tr></table><table fixwidth=610 border=0 cellspacing=0 cellpadding=0><tr><td><img src=\"l2ui.mini_logo\" width=5 height=10></td></tr><tr><td><img src=\"l2ui.mini_logo\" width=5 height=1></td><td align=center FIXWIDTH=60 height=29 valign=top>&$427;</td><td align=center FIXWIDTH=540><MultiEdit var =\"Content\" width=535 height=313></td><td><img src=\"l2ui.mini_logo\" width=5 height=1></td></tr><tr><td><img src=\"l2ui.mini_logo\" width=5 height=10></td></tr></table><table fixwidth=610 border=0 cellspacing=0 cellpadding=0><tr><td><img src=\"l2ui.mini_logo\" width=5 height=10></td></tr><tr><td><img src=\"l2ui.mini_logo\" width=5 height=1></td><td align=center FIXWIDTH=60 height=29>&nbsp;</td><td align=center FIXWIDTH=70><button value=\"&$140;\" action=\"Write Topic crea \u0001 Title Content Title\" back=\"l2ui_ch3.smallbutton2_down\" width=65 height=20 fore=\"l2ui_ch3.smallbutton2\" ></td><td align=center FIXWIDTH=70><button value = \"&$141;\" action=\"bypass _bbsmemo\" back=\"l2ui_ch3.smallbutton2_down\" width=65 height=20 fore=\"l2ui_ch3.smallbutton2\"> </td><td align=center FIXWIDTH=400>&nbsp;</td><td><img src=\"l2ui.mini_logo\" width=5 height=1></td></tr></table></center></body></html>
InnerClasses:
  public static final #316= #312 of #314; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
