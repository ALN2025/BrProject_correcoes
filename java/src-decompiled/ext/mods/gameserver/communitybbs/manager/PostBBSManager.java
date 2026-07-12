// Bytecode for: ext.mods.gameserver.communitybbs.manager.PostBBSManager
// File: ext\mods\gameserver\communitybbs\manager\PostBBSManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/communitybbs/manager/PostBBSManager.class
  Last modified 9 de jul de 2026; size 9870 bytes
  MD5 checksum 9aba140fcccae33200f93934d84ec0f8
  Compiled from "PostBBSManager.java"
public class ext.mods.gameserver.communitybbs.manager.PostBBSManager extends ext.mods.gameserver.communitybbs.manager.BaseBBSManager
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #45                         // ext/mods/gameserver/communitybbs/manager/PostBBSManager
  super_class: #2                         // ext/mods/gameserver/communitybbs/manager/BaseBBSManager
  interfaces: 0, fields: 0, methods: 5, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/communitybbs/manager/BaseBBSManager."<init>":()V
    #2 = Class              #4            // ext/mods/gameserver/communitybbs/manager/BaseBBSManager
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               ext/mods/gameserver/communitybbs/manager/BaseBBSManager
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = String             #8            // _bbsposts;read;
    #8 = Utf8               _bbsposts;read;
    #9 = Methodref          #10.#11       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #10 = Class              #12           // java/lang/String
   #11 = NameAndType        #13:#14       // startsWith:(Ljava/lang/String;)Z
   #12 = Utf8               java/lang/String
   #13 = Utf8               startsWith
   #14 = Utf8               (Ljava/lang/String;)Z
   #15 = Class              #16           // java/util/StringTokenizer
   #16 = Utf8               java/util/StringTokenizer
   #17 = String             #18           // ;
   #18 = Utf8               ;
   #19 = Methodref          #15.#20       // java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #20 = NameAndType        #5:#21        // "<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #21 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #22 = Methodref          #15.#23       // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
   #23 = NameAndType        #24:#25       // nextToken:()Ljava/lang/String;
   #24 = Utf8               nextToken
   #25 = Utf8               ()Ljava/lang/String;
   #26 = Methodref          #27.#28       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #27 = Class              #29           // java/lang/Integer
   #28 = NameAndType        #30:#31       // parseInt:(Ljava/lang/String;)I
   #29 = Utf8               java/lang/Integer
   #30 = Utf8               parseInt
   #31 = Utf8               (Ljava/lang/String;)I
   #32 = Methodref          #33.#34       // ext/mods/gameserver/communitybbs/CommunityBoard.getInstance:()Lext/mods/gameserver/communitybbs/CommunityBoard;
   #33 = Class              #35           // ext/mods/gameserver/communitybbs/CommunityBoard
   #34 = NameAndType        #36:#37       // getInstance:()Lext/mods/gameserver/communitybbs/CommunityBoard;
   #35 = Utf8               ext/mods/gameserver/communitybbs/CommunityBoard
   #36 = Utf8               getInstance
   #37 = Utf8               ()Lext/mods/gameserver/communitybbs/CommunityBoard;
   #38 = Methodref          #33.#39       // ext/mods/gameserver/communitybbs/CommunityBoard.getForumByID:(I)Lext/mods/gameserver/communitybbs/model/Forum;
   #39 = NameAndType        #40:#41       // getForumByID:(I)Lext/mods/gameserver/communitybbs/model/Forum;
   #40 = Utf8               getForumByID
   #41 = Utf8               (I)Lext/mods/gameserver/communitybbs/model/Forum;
   #42 = String             #43           // <html><body><br><br><center>This forum doesn\'t exist.</center></body></html>
   #43 = Utf8               <html><body><br><br><center>This forum doesn\'t exist.</center></body></html>
   #44 = Methodref          #45.#46       // ext/mods/gameserver/communitybbs/manager/PostBBSManager.separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #45 = Class              #47           // ext/mods/gameserver/communitybbs/manager/PostBBSManager
   #46 = NameAndType        #48:#49       // separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #47 = Utf8               ext/mods/gameserver/communitybbs/manager/PostBBSManager
   #48 = Utf8               separateAndSend
   #49 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #50 = Methodref          #51.#52       // ext/mods/gameserver/communitybbs/model/Forum.getTopicById:(I)Lext/mods/gameserver/communitybbs/model/Topic;
   #51 = Class              #53           // ext/mods/gameserver/communitybbs/model/Forum
   #52 = NameAndType        #54:#55       // getTopicById:(I)Lext/mods/gameserver/communitybbs/model/Topic;
   #53 = Utf8               ext/mods/gameserver/communitybbs/model/Forum
   #54 = Utf8               getTopicById
   #55 = Utf8               (I)Lext/mods/gameserver/communitybbs/model/Topic;
   #56 = String             #57           // <html><body><br><br><center>This topic doesn\'t exist.</center></body></html>
   #57 = Utf8               <html><body><br><br><center>This topic doesn\'t exist.</center></body></html>
   #58 = Methodref          #51.#59       // ext/mods/gameserver/communitybbs/model/Forum.getType:()Lext/mods/gameserver/enums/bbs/ForumType;
   #59 = NameAndType        #60:#61       // getType:()Lext/mods/gameserver/enums/bbs/ForumType;
   #60 = Utf8               getType
   #61 = Utf8               ()Lext/mods/gameserver/enums/bbs/ForumType;
   #62 = Fieldref           #63.#64       // ext/mods/gameserver/enums/bbs/ForumType.MEMO:Lext/mods/gameserver/enums/bbs/ForumType;
   #63 = Class              #65           // ext/mods/gameserver/enums/bbs/ForumType
   #64 = NameAndType        #66:#67       // MEMO:Lext/mods/gameserver/enums/bbs/ForumType;
   #65 = Utf8               ext/mods/gameserver/enums/bbs/ForumType
   #66 = Utf8               MEMO
   #67 = Utf8               Lext/mods/gameserver/enums/bbs/ForumType;
   #68 = Methodref          #45.#69       // ext/mods/gameserver/communitybbs/manager/PostBBSManager.showMemoPost:(Lext/mods/gameserver/communitybbs/model/Topic;Lext/mods/gameserver/model/actor/Player;)V
   #69 = NameAndType        #70:#71       // showMemoPost:(Lext/mods/gameserver/communitybbs/model/Topic;Lext/mods/gameserver/model/actor/Player;)V
   #70 = Utf8               showMemoPost
   #71 = Utf8               (Lext/mods/gameserver/communitybbs/model/Topic;Lext/mods/gameserver/model/actor/Player;)V
   #72 = String             #73           // <html><body><br><br><center>The forum is off-limits.</center></body></html>
   #73 = Utf8               <html><body><br><br><center>The forum is off-limits.</center></body></html>
   #74 = String             #75           // _bbsposts;edit;
   #75 = Utf8               _bbsposts;edit;
   #76 = Methodref          #77.#78       // ext/mods/gameserver/communitybbs/model/Topic.getPost:(I)Lext/mods/gameserver/communitybbs/model/Post;
   #77 = Class              #79           // ext/mods/gameserver/communitybbs/model/Topic
   #78 = NameAndType        #80:#81       // getPost:(I)Lext/mods/gameserver/communitybbs/model/Post;
   #79 = Utf8               ext/mods/gameserver/communitybbs/model/Topic
   #80 = Utf8               getPost
   #81 = Utf8               (I)Lext/mods/gameserver/communitybbs/model/Post;
   #82 = String             #83           // <html><body><br><br><center>This post doesn\'t exist.</center></body></html>
   #83 = Utf8               <html><body><br><br><center>This post doesn\'t exist.</center></body></html>
   #84 = Methodref          #77.#85       // ext/mods/gameserver/communitybbs/model/Topic.getName:()Ljava/lang/String;
   #85 = NameAndType        #86:#25       // getName:()Ljava/lang/String;
   #86 = Utf8               getName
   #87 = Methodref          #51.#88       // ext/mods/gameserver/communitybbs/model/Forum.getId:()I
   #88 = NameAndType        #89:#90       // getId:()I
   #89 = Utf8               getId
   #90 = Utf8               ()I
   #91 = Methodref          #77.#88       // ext/mods/gameserver/communitybbs/model/Topic.getId:()I
   #92 = InvokeDynamic      #0:#93        // #0:makeConcatWithConstants:(Ljava/lang/String;II)Ljava/lang/String;
   #93 = NameAndType        #94:#95       // makeConcatWithConstants:(Ljava/lang/String;II)Ljava/lang/String;
   #94 = Utf8               makeConcatWithConstants
   #95 = Utf8               (Ljava/lang/String;II)Ljava/lang/String;
   #96 = Methodref          #45.#97       // ext/mods/gameserver/communitybbs/manager/PostBBSManager.send1001:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #97 = NameAndType        #98:#49       // send1001:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #98 = Utf8               send1001
   #99 = Methodref          #100.#101     // ext/mods/gameserver/communitybbs/model/Post.getText:()Ljava/lang/String;
  #100 = Class              #102          // ext/mods/gameserver/communitybbs/model/Post
  #101 = NameAndType        #103:#25      // getText:()Ljava/lang/String;
  #102 = Utf8               ext/mods/gameserver/communitybbs/model/Post
  #103 = Utf8               getText
  #104 = Methodref          #105.#106     // java/text/DateFormat.getInstance:()Ljava/text/DateFormat;
  #105 = Class              #107          // java/text/DateFormat
  #106 = NameAndType        #36:#108      // getInstance:()Ljava/text/DateFormat;
  #107 = Utf8               java/text/DateFormat
  #108 = Utf8               ()Ljava/text/DateFormat;
  #109 = Class              #110          // java/util/Date
  #110 = Utf8               java/util/Date
  #111 = Methodref          #77.#112      // ext/mods/gameserver/communitybbs/model/Topic.getDate:()J
  #112 = NameAndType        #113:#114     // getDate:()J
  #113 = Utf8               getDate
  #114 = Utf8               ()J
  #115 = Methodref          #109.#116     // java/util/Date."<init>":(J)V
  #116 = NameAndType        #5:#117       // "<init>":(J)V
  #117 = Utf8               (J)V
  #118 = Methodref          #105.#119     // java/text/DateFormat.format:(Ljava/util/Date;)Ljava/lang/String;
  #119 = NameAndType        #120:#121     // format:(Ljava/util/Date;)Ljava/lang/String;
  #120 = Utf8               format
  #121 = Utf8               (Ljava/util/Date;)Ljava/lang/String;
  #122 = Methodref          #45.#123      // ext/mods/gameserver/communitybbs/manager/PostBBSManager.send1002:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
  #123 = NameAndType        #124:#125     // send1002:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
  #124 = Utf8               send1002
  #125 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
  #126 = Methodref          #2.#127       // ext/mods/gameserver/communitybbs/manager/BaseBBSManager.parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #127 = NameAndType        #128:#49      // parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #128 = Utf8               parseCmd
  #129 = InvokeDynamic      #1:#130       // #1:makeConcatWithConstants:(I)Ljava/lang/String;
  #130 = NameAndType        #94:#131      // makeConcatWithConstants:(I)Ljava/lang/String;
  #131 = Utf8               (I)Ljava/lang/String;
  #132 = Methodref          #51.#133      // ext/mods/gameserver/communitybbs/model/Forum.getTopic:(I)Lext/mods/gameserver/communitybbs/model/Topic;
  #133 = NameAndType        #134:#55      // getTopic:(I)Lext/mods/gameserver/communitybbs/model/Topic;
  #134 = Utf8               getTopic
  #135 = InvokeDynamic      #2:#130       // #2:makeConcatWithConstants:(I)Ljava/lang/String;
  #136 = InvokeDynamic      #3:#130       // #3:makeConcatWithConstants:(I)Ljava/lang/String;
  #137 = Methodref          #100.#138     // ext/mods/gameserver/communitybbs/model/Post.updateText:(ILjava/lang/String;)V
  #138 = NameAndType        #139:#140     // updateText:(ILjava/lang/String;)V
  #139 = Utf8               updateText
  #140 = Utf8               (ILjava/lang/String;)V
  #141 = InvokeDynamic      #4:#142       // #4:makeConcatWithConstants:(II)Ljava/lang/String;
  #142 = NameAndType        #94:#143      // makeConcatWithConstants:(II)Ljava/lang/String;
  #143 = Utf8               (II)Ljava/lang/String;
  #144 = Methodref          #45.#127      // ext/mods/gameserver/communitybbs/manager/PostBBSManager.parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #145 = String             #146          // >
  #146 = Utf8               >
  #147 = String             #148          // &gt;
  #148 = Utf8               &gt;
  #149 = Methodref          #10.#150      // java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #150 = NameAndType        #151:#152     // replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #151 = Utf8               replace
  #152 = Utf8               (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #153 = String             #154          // <
  #154 = Utf8               <
  #155 = String             #156          // &lt;
  #156 = Utf8               &lt;
  #157 = String             #158          // \n
  #158 = Utf8               \n
  #159 = String             #160          // <br1>
  #160 = Utf8               <br1>
  #161 = Methodref          #77.#162      // ext/mods/gameserver/communitybbs/model/Topic.getOwnerName:()Ljava/lang/String;
  #162 = NameAndType        #163:#25      // getOwnerName:()Ljava/lang/String;
  #163 = Utf8               getOwnerName
  #164 = Class              #165          // java/text/SimpleDateFormat
  #165 = Utf8               java/text/SimpleDateFormat
  #166 = String             #167          // yyyy-MM-dd HH:mm:ss
  #167 = Utf8               yyyy-MM-dd HH:mm:ss
  #168 = Methodref          #164.#169     // java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
  #169 = NameAndType        #5:#170       // "<init>":(Ljava/lang/String;)V
  #170 = Utf8               (Ljava/lang/String;)V
  #171 = Methodref          #100.#112     // ext/mods/gameserver/communitybbs/model/Post.getDate:()J
  #172 = Methodref          #173.#174     // java/lang/Long.valueOf:(J)Ljava/lang/Long;
  #173 = Class              #175          // java/lang/Long
  #174 = NameAndType        #176:#177     // valueOf:(J)Ljava/lang/Long;
  #175 = Utf8               java/lang/Long
  #176 = Utf8               valueOf
  #177 = Utf8               (J)Ljava/lang/Long;
  #178 = Methodref          #164.#179     // java/text/SimpleDateFormat.format:(Ljava/lang/Object;)Ljava/lang/String;
  #179 = NameAndType        #120:#180     // format:(Ljava/lang/Object;)Ljava/lang/String;
  #180 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
  #181 = Methodref          #77.#182      // ext/mods/gameserver/communitybbs/model/Topic.getForumId:()I
  #182 = NameAndType        #183:#90      // getForumId:()I
  #183 = Utf8               getForumId
  #184 = InvokeDynamic      #5:#185       // #5:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIII)Ljava/lang/String;
  #185 = NameAndType        #94:#186      // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIII)Ljava/lang/String;
  #186 = Utf8               (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIII)Ljava/lang/String;
  #187 = Fieldref           #188.#189     // ext/mods/gameserver/communitybbs/manager/PostBBSManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/communitybbs/manager/PostBBSManager;
  #188 = Class              #190          // ext/mods/gameserver/communitybbs/manager/PostBBSManager$SingletonHolder
  #189 = NameAndType        #191:#192     // INSTANCE:Lext/mods/gameserver/communitybbs/manager/PostBBSManager;
  #190 = Utf8               ext/mods/gameserver/communitybbs/manager/PostBBSManager$SingletonHolder
  #191 = Utf8               INSTANCE
  #192 = Utf8               Lext/mods/gameserver/communitybbs/manager/PostBBSManager;
  #193 = Utf8               Code
  #194 = Utf8               LineNumberTable
  #195 = Utf8               LocalVariableTable
  #196 = Utf8               this
  #197 = Utf8               st
  #198 = Utf8               Ljava/util/StringTokenizer;
  #199 = Utf8               forumId
  #200 = Utf8               I
  #201 = Utf8               topicId
  #202 = Utf8               forum
  #203 = Utf8               Lext/mods/gameserver/communitybbs/model/Forum;
  #204 = Utf8               topic
  #205 = Utf8               Lext/mods/gameserver/communitybbs/model/Topic;
  #206 = Utf8               post
  #207 = Utf8               Lext/mods/gameserver/communitybbs/model/Post;
  #208 = Utf8               html
  #209 = Utf8               Ljava/lang/String;
  #210 = Utf8               command
  #211 = Utf8               player
  #212 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #213 = Utf8               StackMapTable
  #214 = Class              #215          // ext/mods/gameserver/model/actor/Player
  #215 = Utf8               ext/mods/gameserver/model/actor/Player
  #216 = Utf8               parseWrite
  #217 = Utf8               (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #218 = Utf8               ar1
  #219 = Utf8               ar2
  #220 = Utf8               ar3
  #221 = Utf8               ar4
  #222 = Utf8               ar5
  #223 = Utf8               pageId
  #224 = Utf8               mes
  #225 = Utf8               ()Lext/mods/gameserver/communitybbs/manager/PostBBSManager;
  #226 = Utf8               SourceFile
  #227 = Utf8               PostBBSManager.java
  #228 = Utf8               NestMembers
  #229 = Utf8               BootstrapMethods
  #230 = String             #231          // <html><body><br><br><table border=0 width=610><tr><td width=10></td><td width=600 align=left><a action=\"bypass _bbshome\">HOME</a>&nbsp;>&nbsp;<a action=\"bypass _bbsmemo\">Memo Form</a></td></tr></table><img src=\"L2UI.squareblank\" width=\"1\" height=\"10\"><center><table border=0 cellspacing=0 cellpadding=0><tr><td width=610><img src=\"sek.cbui355\" width=\"610\" height=\"1\"><br1><img src=\"sek.cbui355\" width=\"610\" height=\"1\"></td></tr></table><table fixwidth=610 border=0 cellspacing=0 cellpadding=0><tr><td><img src=\"l2ui.mini_logo\" width=5 height=20></td></tr><tr><td><img src=\"l2ui.mini_logo\" width=5 height=1></td><td align=center FIXWIDTH=60 height=29>&$413;</td><td FIXWIDTH=540>\u0001</td><td><img src=\"l2ui.mini_logo\" width=5 height=1></td></tr></table><table fixwidth=610 border=0 cellspacing=0 cellpadding=0><tr><td><img src=\"l2ui.mini_logo\" width=5 height=10></td></tr><tr><td><img src=\"l2ui.mini_logo\" width=5 height=1></td><td align=center FIXWIDTH=60 height=29 valign=top>&$427;</td><td align=center FIXWIDTH=540><MultiEdit var =\"Content\" width=535 height=313></td><td><img src=\"l2ui.mini_logo\" width=5 height=1></td></tr><tr><td><img src=\"l2ui.mini_logo\" width=5 height=10></td></tr></table><table fixwidth=610 border=0 cellspacing=0 cellpadding=0><tr><td><img src=\"l2ui.mini_logo\" width=5 height=10></td></tr><tr><td><img src=\"l2ui.mini_logo\" width=5 height=1></td><td align=center FIXWIDTH=60 height=29>&nbsp;</td><td align=center FIXWIDTH=70><button value=\"&$140;\" action=\"Write Post \u0001;\u0001;0 _ Content Content Content\" back=\"l2ui_ch3.smallbutton2_down\" width=65 height=20 fore=\"l2ui_ch3.smallbutton2\" ></td><td align=center FIXWIDTH=70><button value = \"&$141;\" action=\"bypass _bbsmemo\" back=\"l2ui_ch3.smallbutton2_down\" width=65 height=20 fore=\"l2ui_ch3.smallbutton2\"> </td><td align=center FIXWIDTH=400>&nbsp;</td><td><img src=\"l2ui.mini_logo\" width=5 height=1></td></tr></table></center></body></html>
  #231 = Utf8               <html><body><br><br><table border=0 width=610><tr><td width=10></td><td width=600 align=left><a action=\"bypass _bbshome\">HOME</a>&nbsp;>&nbsp;<a action=\"bypass _bbsmemo\">Memo Form</a></td></tr></table><img src=\"L2UI.squareblank\" width=\"1\" height=\"10\"><center><table border=0 cellspacing=0 cellpadding=0><tr><td width=610><img src=\"sek.cbui355\" width=\"610\" height=\"1\"><br1><img src=\"sek.cbui355\" width=\"610\" height=\"1\"></td></tr></table><table fixwidth=610 border=0 cellspacing=0 cellpadding=0><tr><td><img src=\"l2ui.mini_logo\" width=5 height=20></td></tr><tr><td><img src=\"l2ui.mini_logo\" width=5 height=1></td><td align=center FIXWIDTH=60 height=29>&$413;</td><td FIXWIDTH=540>\u0001</td><td><img src=\"l2ui.mini_logo\" width=5 height=1></td></tr></table><table fixwidth=610 border=0 cellspacing=0 cellpadding=0><tr><td><img src=\"l2ui.mini_logo\" width=5 height=10></td></tr><tr><td><img src=\"l2ui.mini_logo\" width=5 height=1></td><td align=center FIXWIDTH=60 height=29 valign=top>&$427;</td><td align=center FIXWIDTH=540><MultiEdit var =\"Content\" width=535 height=313></td><td><img src=\"l2ui.mini_logo\" width=5 height=1></td></tr><tr><td><img src=\"l2ui.mini_logo\" width=5 height=10></td></tr></table><table fixwidth=610 border=0 cellspacing=0 cellpadding=0><tr><td><img src=\"l2ui.mini_logo\" width=5 height=10></td></tr><tr><td><img src=\"l2ui.mini_logo\" width=5 height=1></td><td align=center FIXWIDTH=60 height=29>&nbsp;</td><td align=center FIXWIDTH=70><button value=\"&$140;\" action=\"Write Post \u0001;\u0001;0 _ Content Content Content\" back=\"l2ui_ch3.smallbutton2_down\" width=65 height=20 fore=\"l2ui_ch3.smallbutton2\" ></td><td align=center FIXWIDTH=70><button value = \"&$141;\" action=\"bypass _bbsmemo\" back=\"l2ui_ch3.smallbutton2_down\" width=65 height=20 fore=\"l2ui_ch3.smallbutton2\"> </td><td align=center FIXWIDTH=400>&nbsp;</td><td><img src=\"l2ui.mini_logo\" width=5 height=1></td></tr></table></center></body></html>
  #232 = String             #233          // <html><body><br><br><center>The forum named \'\u0001\' doesn\'t exist.</center></body></html>
  #233 = Utf8               <html><body><br><br><center>The forum named \'\u0001\' doesn\'t exist.</center></body></html>
  #234 = String             #235          // <html><body><br><br><center>The topic named \'\u0001\' doesn\'t exist.</center></body></html>
  #235 = Utf8               <html><body><br><br><center>The topic named \'\u0001\' doesn\'t exist.</center></body></html>
  #236 = String             #237          // <html><body><br><br><center>The post named \'\u0001\' doesn\'t exist.</center></body></html>
  #237 = Utf8               <html><body><br><br><center>The post named \'\u0001\' doesn\'t exist.</center></body></html>
  #238 = String             #239          // _bbsposts;read;\u0001;\u0001
  #239 = Utf8               _bbsposts;read;\u0001;\u0001
  #240 = String             #241          // <html><body><br><br><table border=0 width=610><tr><td width=10></td><td width=600 align=left><a action=\"bypass _bbshome\">HOME</a>&nbsp;>&nbsp;<a action=\"bypass _bbsmemo\">Memo Form</a></td></tr></table><img src=\"L2UI.squareblank\" width=\"1\" height=\"10\"><center><table border=0 cellspacing=0 cellpadding=0 bgcolor=333333><tr><td height=10></td></tr><tr><td fixWIDTH=55 align=right valign=top>&$413; : &nbsp;</td><td fixWIDTH=380 valign=top>\u0001</td><td fixwidth=5></td><td fixwidth=50></td><td fixWIDTH=120></td></tr><tr><td height=10></td></tr><tr><td align=right><font color=\"AAAAAA\" >&$417; : &nbsp;</font></td><td><font color=\"AAAAAA\">\u0001</font></td><td></td><td><font color=\"AAAAAA\">&$418; :</font></td><td><font color=\"AAAAAA\">\u0001</font></td></tr><tr><td height=10></td></tr></table><br><table border=0 cellspacing=0 cellpadding=0><tr><td fixwidth=5></td><td FIXWIDTH=600 align=left>\u0001</td><td fixqqwidth=5></td></tr></table><br><img src=\"L2UI.squareblank\" width=\"1\" height=\"5\"><img src=\"L2UI.squaregray\" width=\"610\" height=\"1\"><img src=\"L2UI.squareblank\" width=\"1\" height=\"5\"><table border=0 cellspacing=0 cellpadding=0 FIXWIDTH=610><tr><td width=50><button value=\"&$422;\" action=\"bypass _bbsmemo\" back=\"l2ui_ch3.smallbutton2_down\" width=65 height=20 fore=\"l2ui_ch3.smallbutton2\"></td><td width=560 align=right><table border=0 cellspacing=0><tr><td FIXWIDTH=300></td><td><button value = \"&$424;\" action=\"bypass _bbsposts;edit;\u0001;\u0001;0\" back=\"l2ui_ch3.smallbutton2_down\" width=65 height=20 fore=\"l2ui_ch3.smallbutton2\" ></td>&nbsp;<td><button value = \"&$425;\" action=\"bypass _bbstopics;del;\u0001;\u0001\" back=\"l2ui_ch3.smallbutton2_down\" width=65 height=20 fore=\"l2ui_ch3.smallbutton2\" ></td>&nbsp;<td><button value = \"&$421;\" action=\"bypass _bbstopics;crea;\u0001\" back=\"l2ui_ch3.smallbutton2_down\" width=65 height=20 fore=\"l2ui_ch3.smallbutton2\" ></td>&nbsp;</tr></table></td></tr></table><br><br><br></center></body></html>
  #241 = Utf8               <html><body><br><br><table border=0 width=610><tr><td width=10></td><td width=600 align=left><a action=\"bypass _bbshome\">HOME</a>&nbsp;>&nbsp;<a action=\"bypass _bbsmemo\">Memo Form</a></td></tr></table><img src=\"L2UI.squareblank\" width=\"1\" height=\"10\"><center><table border=0 cellspacing=0 cellpadding=0 bgcolor=333333><tr><td height=10></td></tr><tr><td fixWIDTH=55 align=right valign=top>&$413; : &nbsp;</td><td fixWIDTH=380 valign=top>\u0001</td><td fixwidth=5></td><td fixwidth=50></td><td fixWIDTH=120></td></tr><tr><td height=10></td></tr><tr><td align=right><font color=\"AAAAAA\" >&$417; : &nbsp;</font></td><td><font color=\"AAAAAA\">\u0001</font></td><td></td><td><font color=\"AAAAAA\">&$418; :</font></td><td><font color=\"AAAAAA\">\u0001</font></td></tr><tr><td height=10></td></tr></table><br><table border=0 cellspacing=0 cellpadding=0><tr><td fixwidth=5></td><td FIXWIDTH=600 align=left>\u0001</td><td fixqqwidth=5></td></tr></table><br><img src=\"L2UI.squareblank\" width=\"1\" height=\"5\"><img src=\"L2UI.squaregray\" width=\"610\" height=\"1\"><img src=\"L2UI.squareblank\" width=\"1\" height=\"5\"><table border=0 cellspacing=0 cellpadding=0 FIXWIDTH=610><tr><td width=50><button value=\"&$422;\" action=\"bypass _bbsmemo\" back=\"l2ui_ch3.smallbutton2_down\" width=65 height=20 fore=\"l2ui_ch3.smallbutton2\"></td><td width=560 align=right><table border=0 cellspacing=0><tr><td FIXWIDTH=300></td><td><button value = \"&$424;\" action=\"bypass _bbsposts;edit;\u0001;\u0001;0\" back=\"l2ui_ch3.smallbutton2_down\" width=65 height=20 fore=\"l2ui_ch3.smallbutton2\" ></td>&nbsp;<td><button value = \"&$425;\" action=\"bypass _bbstopics;del;\u0001;\u0001\" back=\"l2ui_ch3.smallbutton2_down\" width=65 height=20 fore=\"l2ui_ch3.smallbutton2\" ></td>&nbsp;<td><button value = \"&$421;\" action=\"bypass _bbstopics;crea;\u0001\" back=\"l2ui_ch3.smallbutton2_down\" width=65 height=20 fore=\"l2ui_ch3.smallbutton2\" ></td>&nbsp;</tr></table></td></tr></table><br><br><br></center></body></html>
  #242 = MethodHandle       6:#243        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #243 = Methodref          #244.#245     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #244 = Class              #246          // java/lang/invoke/StringConcatFactory
  #245 = NameAndType        #94:#247      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #246 = Utf8               java/lang/invoke/StringConcatFactory
  #247 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #248 = Utf8               InnerClasses
  #249 = Utf8               SingletonHolder
  #250 = Class              #251          // java/lang/invoke/MethodHandles$Lookup
  #251 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #252 = Class              #253          // java/lang/invoke/MethodHandles
  #253 = Utf8               java/lang/invoke/MethodHandles
  #254 = Utf8               Lookup
{
  protected ext.mods.gameserver.communitybbs.manager.PostBBSManager();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/communitybbs/manager/BaseBBSManager."<init>":()V
         4: return
      LineNumberTable:
        line 35: 0
        line 36: 4
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/communitybbs/manager/PostBBSManager;

  public void parseCmd(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=10, args_size=3
         0: aload_1
         1: ldc           #7                  // String _bbsposts;read;
         3: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
         6: ifeq          120
         9: new           #15                 // class java/util/StringTokenizer
        12: dup
        13: aload_1
        14: ldc           #17                 // String ;
        16: invokespecial #19                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
        19: astore_3
        20: aload_3
        21: invokevirtual #22                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        24: pop
        25: aload_3
        26: invokevirtual #22                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        29: pop
        30: aload_3
        31: invokevirtual #22                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        34: invokestatic  #26                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        37: istore        4
        39: aload_3
        40: invokevirtual #22                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        43: invokestatic  #26                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        46: istore        5
        48: invokestatic  #32                 // Method ext/mods/gameserver/communitybbs/CommunityBoard.getInstance:()Lext/mods/gameserver/communitybbs/CommunityBoard;
        51: iload         4
        53: invokevirtual #38                 // Method ext/mods/gameserver/communitybbs/CommunityBoard.getForumByID:(I)Lext/mods/gameserver/communitybbs/model/Forum;
        56: astore        6
        58: aload         6
        60: ifnonnull     70
        63: ldc           #42                 // String <html><body><br><br><center>This forum doesn\'t exist.</center></body></html>
        65: aload_2
        66: invokestatic  #44                 // Method separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
        69: return
        70: aload         6
        72: iload         5
        74: invokevirtual #50                 // Method ext/mods/gameserver/communitybbs/model/Forum.getTopicById:(I)Lext/mods/gameserver/communitybbs/model/Topic;
        77: astore        7
        79: aload         7
        81: ifnonnull     91
        84: ldc           #56                 // String <html><body><br><br><center>This topic doesn\'t exist.</center></body></html>
        86: aload_2
        87: invokestatic  #44                 // Method separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
        90: return
        91: aload         6
        93: invokevirtual #58                 // Method ext/mods/gameserver/communitybbs/model/Forum.getType:()Lext/mods/gameserver/enums/bbs/ForumType;
        96: getstatic     #62                 // Field ext/mods/gameserver/enums/bbs/ForumType.MEMO:Lext/mods/gameserver/enums/bbs/ForumType;
        99: if_acmpne     111
       102: aload         7
       104: aload_2
       105: invokestatic  #68                 // Method showMemoPost:(Lext/mods/gameserver/communitybbs/model/Topic;Lext/mods/gameserver/model/actor/Player;)V
       108: goto          117
       111: ldc           #72                 // String <html><body><br><br><center>The forum is off-limits.</center></body></html>
       113: aload_2
       114: invokestatic  #44                 // Method separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       117: goto          300
       120: aload_1
       121: ldc           #74                 // String _bbsposts;edit;
       123: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       126: ifeq          294
       129: new           #15                 // class java/util/StringTokenizer
       132: dup
       133: aload_1
       134: ldc           #17                 // String ;
       136: invokespecial #19                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
       139: astore_3
       140: aload_3
       141: invokevirtual #22                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       144: pop
       145: aload_3
       146: invokevirtual #22                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       149: pop
       150: aload_3
       151: invokevirtual #22                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       154: invokestatic  #26                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       157: istore        4
       159: aload_3
       160: invokevirtual #22                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       163: invokestatic  #26                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       166: istore        5
       168: invokestatic  #32                 // Method ext/mods/gameserver/communitybbs/CommunityBoard.getInstance:()Lext/mods/gameserver/communitybbs/CommunityBoard;
       171: iload         4
       173: invokevirtual #38                 // Method ext/mods/gameserver/communitybbs/CommunityBoard.getForumByID:(I)Lext/mods/gameserver/communitybbs/model/Forum;
       176: astore        6
       178: aload         6
       180: ifnonnull     190
       183: ldc           #42                 // String <html><body><br><br><center>This forum doesn\'t exist.</center></body></html>
       185: aload_2
       186: invokestatic  #44                 // Method separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       189: return
       190: aload         6
       192: iload         5
       194: invokevirtual #50                 // Method ext/mods/gameserver/communitybbs/model/Forum.getTopicById:(I)Lext/mods/gameserver/communitybbs/model/Topic;
       197: astore        7
       199: aload         7
       201: ifnonnull     211
       204: ldc           #56                 // String <html><body><br><br><center>This topic doesn\'t exist.</center></body></html>
       206: aload_2
       207: invokestatic  #44                 // Method separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       210: return
       211: aload         7
       213: iconst_0
       214: invokevirtual #76                 // Method ext/mods/gameserver/communitybbs/model/Topic.getPost:(I)Lext/mods/gameserver/communitybbs/model/Post;
       217: astore        8
       219: aload         8
       221: ifnonnull     231
       224: ldc           #82                 // String <html><body><br><br><center>This post doesn\'t exist.</center></body></html>
       226: aload_2
       227: invokestatic  #44                 // Method separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       230: return
       231: aload         7
       233: invokevirtual #84                 // Method ext/mods/gameserver/communitybbs/model/Topic.getName:()Ljava/lang/String;
       236: aload         6
       238: invokevirtual #87                 // Method ext/mods/gameserver/communitybbs/model/Forum.getId:()I
       241: aload         7
       243: invokevirtual #91                 // Method ext/mods/gameserver/communitybbs/model/Topic.getId:()I
       246: invokedynamic #92,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;II)Ljava/lang/String;
       251: astore        9
       253: aload         9
       255: aload_2
       256: invokestatic  #96                 // Method send1001:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       259: aload_2
       260: aload         8
       262: invokevirtual #99                 // Method ext/mods/gameserver/communitybbs/model/Post.getText:()Ljava/lang/String;
       265: aload         7
       267: invokevirtual #84                 // Method ext/mods/gameserver/communitybbs/model/Topic.getName:()Ljava/lang/String;
       270: invokestatic  #104                // Method java/text/DateFormat.getInstance:()Ljava/text/DateFormat;
       273: new           #109                // class java/util/Date
       276: dup
       277: aload         7
       279: invokevirtual #111                // Method ext/mods/gameserver/communitybbs/model/Topic.getDate:()J
       282: invokespecial #115                // Method java/util/Date."<init>":(J)V
       285: invokevirtual #118                // Method java/text/DateFormat.format:(Ljava/util/Date;)Ljava/lang/String;
       288: invokestatic  #122                // Method send1002:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
       291: goto          300
       294: aload_0
       295: aload_1
       296: aload_2
       297: invokespecial #126                // Method ext/mods/gameserver/communitybbs/manager/BaseBBSManager.parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       300: return
      LineNumberTable:
        line 41: 0
        line 43: 9
        line 44: 20
        line 45: 25
        line 47: 30
        line 48: 39
        line 50: 48
        line 51: 58
        line 53: 63
        line 54: 69
        line 57: 70
        line 58: 79
        line 60: 84
        line 61: 90
        line 64: 91
        line 65: 102
        line 67: 111
        line 68: 117
        line 69: 120
        line 71: 129
        line 72: 140
        line 73: 145
        line 75: 150
        line 76: 159
        line 78: 168
        line 79: 178
        line 81: 183
        line 82: 189
        line 85: 190
        line 86: 199
        line 88: 204
        line 89: 210
        line 92: 211
        line 93: 219
        line 95: 224
        line 96: 230
        line 99: 231
        line 100: 253
        line 101: 259
        line 102: 291
        line 104: 294
        line 105: 300
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           20      97     3    st   Ljava/util/StringTokenizer;
           39      78     4 forumId   I
           48      69     5 topicId   I
           58      59     6 forum   Lext/mods/gameserver/communitybbs/model/Forum;
           79      38     7 topic   Lext/mods/gameserver/communitybbs/model/Topic;
          140     151     3    st   Ljava/util/StringTokenizer;
          159     132     4 forumId   I
          168     123     5 topicId   I
          178     113     6 forum   Lext/mods/gameserver/communitybbs/model/Forum;
          199      92     7 topic   Lext/mods/gameserver/communitybbs/model/Topic;
          219      72     8  post   Lext/mods/gameserver/communitybbs/model/Post;
          253      38     9  html   Ljava/lang/String;
            0     301     0  this   Lext/mods/gameserver/communitybbs/manager/PostBBSManager;
            0     301     1 command   Ljava/lang/String;
            0     301     2 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 10
        frame_type = 255 /* full_frame */
          offset_delta = 70
          locals = [ class ext/mods/gameserver/communitybbs/manager/PostBBSManager, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, int, int, class ext/mods/gameserver/communitybbs/model/Forum ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/communitybbs/model/Topic ]
        frame_type = 19 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 5
          locals = [ class ext/mods/gameserver/communitybbs/manager/PostBBSManager, class java/lang/String, class ext/mods/gameserver/model/actor/Player ]
          stack = []
        frame_type = 2 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 69
          locals = [ class ext/mods/gameserver/communitybbs/manager/PostBBSManager, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, int, int, class ext/mods/gameserver/communitybbs/model/Forum ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/communitybbs/model/Topic ]
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/communitybbs/model/Post ]
        frame_type = 255 /* full_frame */
          offset_delta = 62
          locals = [ class ext/mods/gameserver/communitybbs/manager/PostBBSManager, class java/lang/String, class ext/mods/gameserver/model/actor/Player ]
          stack = []
        frame_type = 5 /* same */

  public void parseWrite(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=14, args_size=7
         0: new           #15                 // class java/util/StringTokenizer
         3: dup
         4: aload_1
         5: ldc           #17                 // String ;
         7: invokespecial #19                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
        10: astore        7
        12: aload         7
        14: invokevirtual #22                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        17: invokestatic  #26                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        20: istore        8
        22: aload         7
        24: invokevirtual #22                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        27: invokestatic  #26                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        30: istore        9
        32: aload         7
        34: invokevirtual #22                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        37: invokestatic  #26                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        40: istore        10
        42: invokestatic  #32                 // Method ext/mods/gameserver/communitybbs/CommunityBoard.getInstance:()Lext/mods/gameserver/communitybbs/CommunityBoard;
        45: iload         8
        47: invokevirtual #38                 // Method ext/mods/gameserver/communitybbs/CommunityBoard.getForumByID:(I)Lext/mods/gameserver/communitybbs/model/Forum;
        50: astore        11
        52: aload         11
        54: ifnonnull     70
        57: iload         8
        59: invokedynamic #129,  0            // InvokeDynamic #1:makeConcatWithConstants:(I)Ljava/lang/String;
        64: aload         6
        66: invokestatic  #44                 // Method separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
        69: return
        70: aload         11
        72: iload         9
        74: invokevirtual #132                // Method ext/mods/gameserver/communitybbs/model/Forum.getTopic:(I)Lext/mods/gameserver/communitybbs/model/Topic;
        77: astore        12
        79: aload         12
        81: ifnonnull     97
        84: iload         9
        86: invokedynamic #135,  0            // InvokeDynamic #2:makeConcatWithConstants:(I)Ljava/lang/String;
        91: aload         6
        93: invokestatic  #44                 // Method separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
        96: return
        97: aload         12
        99: iload         10
       101: invokevirtual #76                 // Method ext/mods/gameserver/communitybbs/model/Topic.getPost:(I)Lext/mods/gameserver/communitybbs/model/Post;
       104: astore        13
       106: aload         13
       108: ifnonnull     124
       111: iload         10
       113: invokedynamic #136,  0            // InvokeDynamic #3:makeConcatWithConstants:(I)Ljava/lang/String;
       118: aload         6
       120: invokestatic  #44                 // Method separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       123: return
       124: aload         13
       126: iload         10
       128: aload         4
       130: invokevirtual #137                // Method ext/mods/gameserver/communitybbs/model/Post.updateText:(ILjava/lang/String;)V
       133: aload_0
       134: aload         11
       136: invokevirtual #87                 // Method ext/mods/gameserver/communitybbs/model/Forum.getId:()I
       139: aload         12
       141: invokevirtual #91                 // Method ext/mods/gameserver/communitybbs/model/Topic.getId:()I
       144: invokedynamic #141,  0            // InvokeDynamic #4:makeConcatWithConstants:(II)Ljava/lang/String;
       149: aload         6
       151: invokevirtual #144                // Method parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       154: return
      LineNumberTable:
        line 110: 0
        line 112: 12
        line 113: 22
        line 114: 32
        line 116: 42
        line 117: 52
        line 119: 57
        line 120: 69
        line 123: 70
        line 124: 79
        line 126: 84
        line 127: 96
        line 130: 97
        line 131: 106
        line 133: 111
        line 134: 123
        line 137: 124
        line 139: 133
        line 140: 154
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     155     0  this   Lext/mods/gameserver/communitybbs/manager/PostBBSManager;
            0     155     1   ar1   Ljava/lang/String;
            0     155     2   ar2   Ljava/lang/String;
            0     155     3   ar3   Ljava/lang/String;
            0     155     4   ar4   Ljava/lang/String;
            0     155     5   ar5   Ljava/lang/String;
            0     155     6 player   Lext/mods/gameserver/model/actor/Player;
           12     143     7    st   Ljava/util/StringTokenizer;
           22     133     8 forumId   I
           32     123     9 topicId   I
           42     113    10 pageId   I
           52     103    11 forum   Lext/mods/gameserver/communitybbs/model/Forum;
           79      76    12 topic   Lext/mods/gameserver/communitybbs/model/Topic;
          106      49    13  post   Lext/mods/gameserver/communitybbs/model/Post;
      StackMapTable: number_of_entries = 3
        frame_type = 255 /* full_frame */
          offset_delta = 70
          locals = [ class ext/mods/gameserver/communitybbs/manager/PostBBSManager, class java/lang/String, class java/lang/String, class java/lang/String, class java/lang/String, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, int, int, int, class ext/mods/gameserver/communitybbs/model/Forum ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/communitybbs/model/Topic ]
        frame_type = 252 /* append */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/communitybbs/model/Post ]

  public static ext.mods.gameserver.communitybbs.manager.PostBBSManager getInstance();
    descriptor: ()Lext/mods/gameserver/communitybbs/manager/PostBBSManager;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #187                // Field ext/mods/gameserver/communitybbs/manager/PostBBSManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/communitybbs/manager/PostBBSManager;
         3: areturn
      LineNumberTable:
        line 156: 0
}
SourceFile: "PostBBSManager.java"
NestMembers:
  ext/mods/gameserver/communitybbs/manager/PostBBSManager$SingletonHolder
BootstrapMethods:
  0: #242 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #230 <html><body><br><br><table border=0 width=610><tr><td width=10></td><td width=600 align=left><a action=\"bypass _bbshome\">HOME</a>&nbsp;>&nbsp;<a action=\"bypass _bbsmemo\">Memo Form</a></td></tr></table><img src=\"L2UI.squareblank\" width=\"1\" height=\"10\"><center><table border=0 cellspacing=0 cellpadding=0><tr><td width=610><img src=\"sek.cbui355\" width=\"610\" height=\"1\"><br1><img src=\"sek.cbui355\" width=\"610\" height=\"1\"></td></tr></table><table fixwidth=610 border=0 cellspacing=0 cellpadding=0><tr><td><img src=\"l2ui.mini_logo\" width=5 height=20></td></tr><tr><td><img src=\"l2ui.mini_logo\" width=5 height=1></td><td align=center FIXWIDTH=60 height=29>&$413;</td><td FIXWIDTH=540>\u0001</td><td><img src=\"l2ui.mini_logo\" width=5 height=1></td></tr></table><table fixwidth=610 border=0 cellspacing=0 cellpadding=0><tr><td><img src=\"l2ui.mini_logo\" width=5 height=10></td></tr><tr><td><img src=\"l2ui.mini_logo\" width=5 height=1></td><td align=center FIXWIDTH=60 height=29 valign=top>&$427;</td><td align=center FIXWIDTH=540><MultiEdit var =\"Content\" width=535 height=313></td><td><img src=\"l2ui.mini_logo\" width=5 height=1></td></tr><tr><td><img src=\"l2ui.mini_logo\" width=5 height=10></td></tr></table><table fixwidth=610 border=0 cellspacing=0 cellpadding=0><tr><td><img src=\"l2ui.mini_logo\" width=5 height=10></td></tr><tr><td><img src=\"l2ui.mini_logo\" width=5 height=1></td><td align=center FIXWIDTH=60 height=29>&nbsp;</td><td align=center FIXWIDTH=70><button value=\"&$140;\" action=\"Write Post \u0001;\u0001;0 _ Content Content Content\" back=\"l2ui_ch3.smallbutton2_down\" width=65 height=20 fore=\"l2ui_ch3.smallbutton2\" ></td><td align=center FIXWIDTH=70><button value = \"&$141;\" action=\"bypass _bbsmemo\" back=\"l2ui_ch3.smallbutton2_down\" width=65 height=20 fore=\"l2ui_ch3.smallbutton2\"> </td><td align=center FIXWIDTH=400>&nbsp;</td><td><img src=\"l2ui.mini_logo\" width=5 height=1></td></tr></table></center></body></html>
  1: #242 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #232 <html><body><br><br><center>The forum named \'\u0001\' doesn\'t exist.</center></body></html>
  2: #242 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #234 <html><body><br><br><center>The topic named \'\u0001\' doesn\'t exist.</center></body></html>
  3: #242 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #236 <html><body><br><br><center>The post named \'\u0001\' doesn\'t exist.</center></body></html>
  4: #242 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #238 _bbsposts;read;\u0001;\u0001
  5: #242 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #240 <html><body><br><br><table border=0 width=610><tr><td width=10></td><td width=600 align=left><a action=\"bypass _bbshome\">HOME</a>&nbsp;>&nbsp;<a action=\"bypass _bbsmemo\">Memo Form</a></td></tr></table><img src=\"L2UI.squareblank\" width=\"1\" height=\"10\"><center><table border=0 cellspacing=0 cellpadding=0 bgcolor=333333><tr><td height=10></td></tr><tr><td fixWIDTH=55 align=right valign=top>&$413; : &nbsp;</td><td fixWIDTH=380 valign=top>\u0001</td><td fixwidth=5></td><td fixwidth=50></td><td fixWIDTH=120></td></tr><tr><td height=10></td></tr><tr><td align=right><font color=\"AAAAAA\" >&$417; : &nbsp;</font></td><td><font color=\"AAAAAA\">\u0001</font></td><td></td><td><font color=\"AAAAAA\">&$418; :</font></td><td><font color=\"AAAAAA\">\u0001</font></td></tr><tr><td height=10></td></tr></table><br><table border=0 cellspacing=0 cellpadding=0><tr><td fixwidth=5></td><td FIXWIDTH=600 align=left>\u0001</td><td fixqqwidth=5></td></tr></table><br><img src=\"L2UI.squareblank\" width=\"1\" height=\"5\"><img src=\"L2UI.squaregray\" width=\"610\" height=\"1\"><img src=\"L2UI.squareblank\" width=\"1\" height=\"5\"><table border=0 cellspacing=0 cellpadding=0 FIXWIDTH=610><tr><td width=50><button value=\"&$422;\" action=\"bypass _bbsmemo\" back=\"l2ui_ch3.smallbutton2_down\" width=65 height=20 fore=\"l2ui_ch3.smallbutton2\"></td><td width=560 align=right><table border=0 cellspacing=0><tr><td FIXWIDTH=300></td><td><button value = \"&$424;\" action=\"bypass _bbsposts;edit;\u0001;\u0001;0\" back=\"l2ui_ch3.smallbutton2_down\" width=65 height=20 fore=\"l2ui_ch3.smallbutton2\" ></td>&nbsp;<td><button value = \"&$425;\" action=\"bypass _bbstopics;del;\u0001;\u0001\" back=\"l2ui_ch3.smallbutton2_down\" width=65 height=20 fore=\"l2ui_ch3.smallbutton2\" ></td>&nbsp;<td><button value = \"&$421;\" action=\"bypass _bbstopics;crea;\u0001\" back=\"l2ui_ch3.smallbutton2_down\" width=65 height=20 fore=\"l2ui_ch3.smallbutton2\" ></td>&nbsp;</tr></table></td></tr></table><br><br><br></center></body></html>
InnerClasses:
  public static final #254= #250 of #252; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
