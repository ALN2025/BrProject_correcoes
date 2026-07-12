// Bytecode for: ext.mods.gameserver.communitybbs.manager.FriendsBBSManager
// File: ext\mods\gameserver\communitybbs\manager\FriendsBBSManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/communitybbs/manager/FriendsBBSManager.class
  Last modified 9 de jul de 2026; size 9466 bytes
  MD5 checksum c99546ba8197558eb3598983ac89d02f
  Compiled from "FriendsBBSManager.java"
public class ext.mods.gameserver.communitybbs.manager.FriendsBBSManager extends ext.mods.gameserver.communitybbs.manager.BaseBBSManager
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #16                         // ext/mods/gameserver/communitybbs/manager/FriendsBBSManager
  super_class: #2                         // ext/mods/gameserver/communitybbs/manager/BaseBBSManager
  interfaces: 0, fields: 2, methods: 8, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/communitybbs/manager/BaseBBSManager."<init>":()V
    #2 = Class              #4            // ext/mods/gameserver/communitybbs/manager/BaseBBSManager
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               ext/mods/gameserver/communitybbs/manager/BaseBBSManager
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = String             #8            // _friendlist
    #8 = Utf8               _friendlist
    #9 = Methodref          #10.#11       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #10 = Class              #12           // java/lang/String
   #11 = NameAndType        #13:#14       // startsWith:(Ljava/lang/String;)Z
   #12 = Utf8               java/lang/String
   #13 = Utf8               startsWith
   #14 = Utf8               (Ljava/lang/String;)Z
   #15 = Methodref          #16.#17       // ext/mods/gameserver/communitybbs/manager/FriendsBBSManager.showFriendsList:(Lext/mods/gameserver/model/actor/Player;Z)V
   #16 = Class              #18           // ext/mods/gameserver/communitybbs/manager/FriendsBBSManager
   #17 = NameAndType        #19:#20       // showFriendsList:(Lext/mods/gameserver/model/actor/Player;Z)V
   #18 = Utf8               ext/mods/gameserver/communitybbs/manager/FriendsBBSManager
   #19 = Utf8               showFriendsList
   #20 = Utf8               (Lext/mods/gameserver/model/actor/Player;Z)V
   #21 = String             #22           // _blocklist
   #22 = Utf8               _blocklist
   #23 = Methodref          #16.#24       // ext/mods/gameserver/communitybbs/manager/FriendsBBSManager.showBlockList:(Lext/mods/gameserver/model/actor/Player;Z)V
   #24 = NameAndType        #25:#20       // showBlockList:(Lext/mods/gameserver/model/actor/Player;Z)V
   #25 = Utf8               showBlockList
   #26 = String             #27           // _friend
   #27 = Utf8               _friend
   #28 = Class              #29           // java/util/StringTokenizer
   #29 = Utf8               java/util/StringTokenizer
   #30 = String             #31           // ;
   #31 = Utf8               ;
   #32 = Methodref          #28.#33       // java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #33 = NameAndType        #5:#34        // "<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #34 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #35 = Methodref          #28.#36       // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
   #36 = NameAndType        #37:#38       // nextToken:()Ljava/lang/String;
   #37 = Utf8               nextToken
   #38 = Utf8               ()Ljava/lang/String;
   #39 = String             #40           // select
   #40 = Utf8               select
   #41 = Methodref          #10.#42       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #42 = NameAndType        #43:#44       // equals:(Ljava/lang/Object;)Z
   #43 = Utf8               equals
   #44 = Utf8               (Ljava/lang/Object;)Z
   #45 = Methodref          #28.#46       // java/util/StringTokenizer.hasMoreTokens:()Z
   #46 = NameAndType        #47:#48       // hasMoreTokens:()Z
   #47 = Utf8               hasMoreTokens
   #48 = Utf8               ()Z
   #49 = Methodref          #50.#51       // java/lang/Integer.valueOf:(Ljava/lang/String;)Ljava/lang/Integer;
   #50 = Class              #52           // java/lang/Integer
   #51 = NameAndType        #53:#54       // valueOf:(Ljava/lang/String;)Ljava/lang/Integer;
   #52 = Utf8               java/lang/Integer
   #53 = Utf8               valueOf
   #54 = Utf8               (Ljava/lang/String;)Ljava/lang/Integer;
   #55 = Methodref          #50.#56       // java/lang/Integer.intValue:()I
   #56 = NameAndType        #57:#58       // intValue:()I
   #57 = Utf8               intValue
   #58 = Utf8               ()I
   #59 = Methodref          #60.#61       // ext/mods/gameserver/model/actor/Player.selectFriend:(I)V
   #60 = Class              #62           // ext/mods/gameserver/model/actor/Player
   #61 = NameAndType        #63:#64       // selectFriend:(I)V
   #62 = Utf8               ext/mods/gameserver/model/actor/Player
   #63 = Utf8               selectFriend
   #64 = Utf8               (I)V
   #65 = String             #66           // deselect
   #66 = Utf8               deselect
   #67 = Methodref          #60.#68       // ext/mods/gameserver/model/actor/Player.deselectFriend:(I)V
   #68 = NameAndType        #69:#64       // deselectFriend:(I)V
   #69 = Utf8               deselectFriend
   #70 = String             #71           // delall
   #71 = Utf8               delall
   #72 = Methodref          #73.#74       // ext/mods/gameserver/data/manager/RelationManager.getInstance:()Lext/mods/gameserver/data/manager/RelationManager;
   #73 = Class              #75           // ext/mods/gameserver/data/manager/RelationManager
   #74 = NameAndType        #76:#77       // getInstance:()Lext/mods/gameserver/data/manager/RelationManager;
   #75 = Utf8               ext/mods/gameserver/data/manager/RelationManager
   #76 = Utf8               getInstance
   #77 = Utf8               ()Lext/mods/gameserver/data/manager/RelationManager;
   #78 = Methodref          #73.#79       // ext/mods/gameserver/data/manager/RelationManager.removeAllFromFriendList:(Lext/mods/gameserver/model/actor/Player;)V
   #79 = NameAndType        #80:#81       // removeAllFromFriendList:(Lext/mods/gameserver/model/actor/Player;)V
   #80 = Utf8               removeAllFromFriendList
   #81 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #82 = Methodref          #60.#83       // ext/mods/gameserver/model/actor/Player.getSelectedFriendList:()Ljava/util/Set;
   #83 = NameAndType        #84:#85       // getSelectedFriendList:()Ljava/util/Set;
   #84 = Utf8               getSelectedFriendList
   #85 = Utf8               ()Ljava/util/Set;
   #86 = InterfaceMethodref #87.#88       // java/util/Set.clear:()V
   #87 = Class              #89           // java/util/Set
   #88 = NameAndType        #90:#6        // clear:()V
   #89 = Utf8               java/util/Set
   #90 = Utf8               clear
   #91 = String             #92           // You have cleared your friends list.
   #92 = Utf8               You have cleared your friends list.
   #93 = Methodref          #60.#94       // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #94 = NameAndType        #95:#96       // sendMessage:(Ljava/lang/String;)V
   #95 = Utf8               sendMessage
   #96 = Utf8               (Ljava/lang/String;)V
   #97 = Class              #98           // ext/mods/gameserver/network/serverpackets/FriendList
   #98 = Utf8               ext/mods/gameserver/network/serverpackets/FriendList
   #99 = Methodref          #97.#100      // ext/mods/gameserver/network/serverpackets/FriendList."<init>":(Lext/mods/gameserver/model/actor/Player;)V
  #100 = NameAndType        #5:#81        // "<init>":(Lext/mods/gameserver/model/actor/Player;)V
  #101 = Methodref          #60.#102      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #102 = NameAndType        #103:#104     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #103 = Utf8               sendPacket
  #104 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #105 = String             #106          // delconfirm
  #106 = Utf8               delconfirm
  #107 = String             #108          // del
  #108 = Utf8               del
  #109 = InterfaceMethodref #87.#110      // java/util/Set.iterator:()Ljava/util/Iterator;
  #110 = NameAndType        #111:#112     // iterator:()Ljava/util/Iterator;
  #111 = Utf8               iterator
  #112 = Utf8               ()Ljava/util/Iterator;
  #113 = InterfaceMethodref #114.#115     // java/util/Iterator.hasNext:()Z
  #114 = Class              #116          // java/util/Iterator
  #115 = NameAndType        #117:#48      // hasNext:()Z
  #116 = Utf8               java/util/Iterator
  #117 = Utf8               hasNext
  #118 = InterfaceMethodref #114.#119     // java/util/Iterator.next:()Ljava/lang/Object;
  #119 = NameAndType        #120:#121     // next:()Ljava/lang/Object;
  #120 = Utf8               next
  #121 = Utf8               ()Ljava/lang/Object;
  #122 = Methodref          #123.#124     // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
  #123 = Class              #125          // ext/mods/gameserver/model/World
  #124 = NameAndType        #76:#126      // getInstance:()Lext/mods/gameserver/model/World;
  #125 = Utf8               ext/mods/gameserver/model/World
  #126 = Utf8               ()Lext/mods/gameserver/model/World;
  #127 = Methodref          #123.#128     // ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
  #128 = NameAndType        #129:#130     // getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
  #129 = Utf8               getPlayer
  #130 = Utf8               (I)Lext/mods/gameserver/model/actor/Player;
  #131 = Methodref          #60.#132      // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #132 = NameAndType        #133:#58      // getObjectId:()I
  #133 = Utf8               getObjectId
  #134 = Methodref          #73.#135      // ext/mods/gameserver/data/manager/RelationManager.removeFromFriendList:(Lext/mods/gameserver/model/actor/Player;I)V
  #135 = NameAndType        #136:#137     // removeFromFriendList:(Lext/mods/gameserver/model/actor/Player;I)V
  #136 = Utf8               removeFromFriendList
  #137 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
  #138 = String             #139          // mail
  #139 = Utf8               mail
  #140 = InterfaceMethodref #87.#141      // java/util/Set.isEmpty:()Z
  #141 = NameAndType        #142:#48      // isEmpty:()Z
  #142 = Utf8               isEmpty
  #143 = Methodref          #16.#144      // ext/mods/gameserver/communitybbs/manager/FriendsBBSManager.showMailWrite:(Lext/mods/gameserver/model/actor/Player;)V
  #144 = NameAndType        #145:#81      // showMailWrite:(Lext/mods/gameserver/model/actor/Player;)V
  #145 = Utf8               showMailWrite
  #146 = String             #147          // _block
  #147 = Utf8               _block
  #148 = Methodref          #60.#149      // ext/mods/gameserver/model/actor/Player.selectBlock:(I)V
  #149 = NameAndType        #150:#64      // selectBlock:(I)V
  #150 = Utf8               selectBlock
  #151 = Methodref          #60.#152      // ext/mods/gameserver/model/actor/Player.deselectBlock:(I)V
  #152 = NameAndType        #153:#64      // deselectBlock:(I)V
  #153 = Utf8               deselectBlock
  #154 = Methodref          #73.#155      // ext/mods/gameserver/data/manager/RelationManager.removeAllFromBlockList:(Lext/mods/gameserver/model/actor/Player;)V
  #155 = NameAndType        #156:#81      // removeAllFromBlockList:(Lext/mods/gameserver/model/actor/Player;)V
  #156 = Utf8               removeAllFromBlockList
  #157 = Methodref          #60.#158      // ext/mods/gameserver/model/actor/Player.getSelectedBlocksList:()Ljava/util/Set;
  #158 = NameAndType        #159:#85      // getSelectedBlocksList:()Ljava/util/Set;
  #159 = Utf8               getSelectedBlocksList
  #160 = Methodref          #73.#161      // ext/mods/gameserver/data/manager/RelationManager.removeFromBlockList:(Lext/mods/gameserver/model/actor/Player;I)V
  #161 = NameAndType        #162:#137     // removeFromBlockList:(Lext/mods/gameserver/model/actor/Player;I)V
  #162 = Utf8               removeFromBlockList
  #163 = Methodref          #2.#164       // ext/mods/gameserver/communitybbs/manager/BaseBBSManager.parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #164 = NameAndType        #165:#166     // parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #165 = Utf8               parseCmd
  #166 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #167 = Methodref          #10.#168      // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
  #168 = NameAndType        #169:#14      // equalsIgnoreCase:(Ljava/lang/String;)Z
  #169 = Utf8               equalsIgnoreCase
  #170 = Methodref          #171.#172     // ext/mods/gameserver/communitybbs/manager/MailBBSManager.getInstance:()Lext/mods/gameserver/communitybbs/manager/MailBBSManager;
  #171 = Class              #173          // ext/mods/gameserver/communitybbs/manager/MailBBSManager
  #172 = NameAndType        #76:#174      // getInstance:()Lext/mods/gameserver/communitybbs/manager/MailBBSManager;
  #173 = Utf8               ext/mods/gameserver/communitybbs/manager/MailBBSManager
  #174 = Utf8               ()Lext/mods/gameserver/communitybbs/manager/MailBBSManager;
  #175 = Methodref          #171.#176     // ext/mods/gameserver/communitybbs/manager/MailBBSManager.sendMail:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #176 = NameAndType        #177:#178     // sendMail:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #177 = Utf8               sendMail
  #178 = Utf8               (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #179 = Methodref          #2.#180       // ext/mods/gameserver/communitybbs/manager/BaseBBSManager.parseWrite:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #180 = NameAndType        #181:#182     // parseWrite:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #181 = Utf8               parseWrite
  #182 = Utf8               (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #183 = String             #184          // friend/
  #184 = Utf8               friend/
  #185 = Methodref          #186.#187     // ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
  #186 = Class              #188          // ext/mods/gameserver/data/HTMLData
  #187 = NameAndType        #76:#189      // getInstance:()Lext/mods/gameserver/data/HTMLData;
  #188 = Utf8               ext/mods/gameserver/data/HTMLData
  #189 = Utf8               ()Lext/mods/gameserver/data/HTMLData;
  #190 = String             #191          // html/CommunityBoard/friend/friend-list.htm
  #191 = Utf8               html/CommunityBoard/friend/friend-list.htm
  #192 = Methodref          #186.#193     // ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
  #193 = NameAndType        #194:#195     // getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
  #194 = Utf8               getHtm
  #195 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
  #196 = Methodref          #73.#197      // ext/mods/gameserver/data/manager/RelationManager.getFriendList:(I)Ljava/util/Set;
  #197 = NameAndType        #198:#199     // getFriendList:(I)Ljava/util/Set;
  #198 = Utf8               getFriendList
  #199 = Utf8               (I)Ljava/util/Set;
  #200 = Class              #201          // java/lang/StringBuilder
  #201 = Utf8               java/lang/StringBuilder
  #202 = Methodref          #200.#3       // java/lang/StringBuilder."<init>":()V
  #203 = InterfaceMethodref #87.#204      // java/util/Set.contains:(Ljava/lang/Object;)Z
  #204 = NameAndType        #205:#44      // contains:(Ljava/lang/Object;)Z
  #205 = Utf8               contains
  #206 = Methodref          #207.#208     // ext/mods/gameserver/data/sql/PlayerInfoTable.getInstance:()Lext/mods/gameserver/data/sql/PlayerInfoTable;
  #207 = Class              #209          // ext/mods/gameserver/data/sql/PlayerInfoTable
  #208 = NameAndType        #76:#210      // getInstance:()Lext/mods/gameserver/data/sql/PlayerInfoTable;
  #209 = Utf8               ext/mods/gameserver/data/sql/PlayerInfoTable
  #210 = Utf8               ()Lext/mods/gameserver/data/sql/PlayerInfoTable;
  #211 = Methodref          #207.#212     // ext/mods/gameserver/data/sql/PlayerInfoTable.getPlayerName:(I)Ljava/lang/String;
  #212 = NameAndType        #213:#214     // getPlayerName:(I)Ljava/lang/String;
  #213 = Utf8               getPlayerName
  #214 = Utf8               (I)Ljava/lang/String;
  #215 = Class              #216          // java/lang/Object
  #216 = Utf8               java/lang/Object
  #217 = String             #218          // <a action=\"bypass _friend;select;
  #218 = Utf8               <a action=\"bypass _friend;select;
  #219 = String             #220          // \">[Select]</a>&nbsp;
  #220 = Utf8               \">[Select]</a>&nbsp;
  #221 = String             #222          //
  #222 = Utf8
  #223 = Methodref          #60.#224      // ext/mods/gameserver/model/actor/Player.isOnline:()Z
  #224 = NameAndType        #225:#48      // isOnline:()Z
  #225 = Utf8               isOnline
  #226 = String             #227          // (on)
  #227 = Utf8               (on)
  #228 = String             #229          // (off)
  #229 = Utf8               (off)
  #230 = String             #231          // <br1>
  #231 = Utf8               <br1>
  #232 = Methodref          #233.#234     // ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #233 = Class              #235          // ext/mods/commons/lang/StringUtil
  #234 = NameAndType        #236:#237     // append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #235 = Utf8               ext/mods/commons/lang/StringUtil
  #236 = Utf8               append
  #237 = Utf8               (Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #238 = String             #239          // %friendslist%
  #239 = Utf8               %friendslist%
  #240 = Methodref          #200.#241     // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #241 = NameAndType        #242:#38      // toString:()Ljava/lang/String;
  #242 = Utf8               toString
  #243 = Methodref          #10.#244      // java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #244 = NameAndType        #245:#246     // replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #245 = Utf8               replace
  #246 = Utf8               (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #247 = Methodref          #200.#248     // java/lang/StringBuilder.setLength:(I)V
  #248 = NameAndType        #249:#64      // setLength:(I)V
  #249 = Utf8               setLength
  #250 = String             #251          // <a action=\"bypass _friend;deselect;
  #251 = Utf8               <a action=\"bypass _friend;deselect;
  #252 = String             #253          // \">[Deselect]</a>&nbsp;
  #253 = Utf8               \">[Deselect]</a>&nbsp;
  #254 = String             #255          // %selectedFriendsList%
  #255 = Utf8               %selectedFriendsList%
  #256 = String             #257          // %deleteMSG%
  #257 = Utf8               %deleteMSG%
  #258 = String             #259          // <br>\n<table><tr><td width=10></td><td>Are you sure you want to delete all friends from your Friends List?</td><td width=20></td><td><button value=\"OK\" action=\"bypass _friend;delall\" back=\"l2ui_ch3.smallbutton2_down\" width=65 height=20 fore=\"l2ui_ch3.smallbutton2\"></td></tr></table>
  #259 = Utf8               <br>\n<table><tr><td width=10></td><td>Are you sure you want to delete all friends from your Friends List?</td><td width=20></td><td><button value=\"OK\" action=\"bypass _friend;delall\" back=\"l2ui_ch3.smallbutton2_down\" width=65 height=20 fore=\"l2ui_ch3.smallbutton2\"></td></tr></table>
  #260 = String             #261          //
  #261 = Utf8
  #262 = Methodref          #16.#263      // ext/mods/gameserver/communitybbs/manager/FriendsBBSManager.separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #263 = NameAndType        #264:#166     // separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #264 = Utf8               separateAndSend
  #265 = String             #266          // html/CommunityBoard/friend/friend-blocklist.htm
  #266 = Utf8               html/CommunityBoard/friend/friend-blocklist.htm
  #267 = Methodref          #73.#268      // ext/mods/gameserver/data/manager/RelationManager.getBlockList:(I)Ljava/util/Set;
  #268 = NameAndType        #269:#199     // getBlockList:(I)Ljava/util/Set;
  #269 = Utf8               getBlockList
  #270 = String             #271          // <a action=\"bypass _block;select;
  #271 = Utf8               <a action=\"bypass _block;select;
  #272 = String             #273          // %blocklist%
  #273 = Utf8               %blocklist%
  #274 = String             #275          // <a action=\"bypass _block;deselect;
  #275 = Utf8               <a action=\"bypass _block;deselect;
  #276 = String             #277          // %selectedBlocksList%
  #277 = Utf8               %selectedBlocksList%
  #278 = String             #279          // <br>\n<table><tr><td width=10></td><td>Are you sure you want to delete all players from your Block List?</td><td width=20></td><td><button value=\"OK\" action=\"bypass _block;delall\" back=\"l2ui_ch3.smallbutton2_down\" width=65 height=20 fore=\"l2ui_ch3.smallbutton2\"></td></tr></table>
  #279 = Utf8               <br>\n<table><tr><td width=10></td><td>Are you sure you want to delete all players from your Block List?</td><td width=20></td><td><button value=\"OK\" action=\"bypass _block;delall\" back=\"l2ui_ch3.smallbutton2_down\" width=65 height=20 fore=\"l2ui_ch3.smallbutton2\"></td></tr></table>
  #280 = String             #281          // html/CommunityBoard/friend/friend-mail.htm
  #281 = Utf8               html/CommunityBoard/friend/friend-mail.htm
  #282 = Methodref          #200.#283     // java/lang/StringBuilder.length:()I
  #283 = NameAndType        #284:#58      // length:()I
  #284 = Utf8               length
  #285 = Methodref          #200.#286     // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #286 = NameAndType        #236:#287     // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #287 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
  #288 = String             #289          // %list%
  #289 = Utf8               %list%
  #290 = Fieldref           #291.#292     // ext/mods/gameserver/communitybbs/manager/FriendsBBSManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/communitybbs/manager/FriendsBBSManager;
  #291 = Class              #293          // ext/mods/gameserver/communitybbs/manager/FriendsBBSManager$SingletonHolder
  #292 = NameAndType        #294:#295     // INSTANCE:Lext/mods/gameserver/communitybbs/manager/FriendsBBSManager;
  #293 = Utf8               ext/mods/gameserver/communitybbs/manager/FriendsBBSManager$SingletonHolder
  #294 = Utf8               INSTANCE
  #295 = Utf8               Lext/mods/gameserver/communitybbs/manager/FriendsBBSManager;
  #296 = Utf8               FRIENDLIST_DELETE_BUTTON
  #297 = Utf8               Ljava/lang/String;
  #298 = Utf8               ConstantValue
  #299 = Utf8               BLOCKLIST_DELETE_BUTTON
  #300 = Utf8               Code
  #301 = Utf8               LineNumberTable
  #302 = Utf8               LocalVariableTable
  #303 = Utf8               this
  #304 = Utf8               friend
  #305 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #306 = Utf8               friendId
  #307 = Utf8               I
  #308 = Utf8               st
  #309 = Utf8               Ljava/util/StringTokenizer;
  #310 = Utf8               action
  #311 = Utf8               blockId
  #312 = Utf8               delMsg
  #313 = Utf8               Z
  #314 = Utf8               command
  #315 = Utf8               player
  #316 = Utf8               StackMapTable
  #317 = Utf8               ar1
  #318 = Utf8               ar2
  #319 = Utf8               ar3
  #320 = Utf8               ar4
  #321 = Utf8               ar5
  #322 = Utf8               getFolder
  #323 = Utf8               friendName
  #324 = Utf8               id
  #325 = Utf8               Ljava/lang/Integer;
  #326 = Utf8               content
  #327 = Utf8               list
  #328 = Utf8               Ljava/util/Set;
  #329 = Utf8               selectedList
  #330 = Utf8               sb
  #331 = Utf8               Ljava/lang/StringBuilder;
  #332 = Utf8               LocalVariableTypeTable
  #333 = Utf8               Ljava/util/Set<Ljava/lang/Integer;>;
  #334 = Class              #335          // "[Ljava/lang/Object;"
  #335 = Utf8               [Ljava/lang/Object;
  #336 = Utf8               blockName
  #337 = Utf8               block
  #338 = Utf8               ()Lext/mods/gameserver/communitybbs/manager/FriendsBBSManager;
  #339 = Utf8               SourceFile
  #340 = Utf8               FriendsBBSManager.java
  #341 = Utf8               NestMembers
  #342 = Utf8               InnerClasses
  #343 = Utf8               SingletonHolder
{
  protected ext.mods.gameserver.communitybbs.manager.FriendsBBSManager();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/communitybbs/manager/BaseBBSManager."<init>":()V
         4: return
      LineNumberTable:
        line 38: 0
        line 39: 4
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/communitybbs/manager/FriendsBBSManager;

  public void parseCmd(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=8, args_size=3
         0: aload_1
         1: ldc           #7                  // String _friendlist
         3: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
         6: ifeq          17
         9: aload_2
        10: iconst_0
        11: invokestatic  #15                 // Method showFriendsList:(Lext/mods/gameserver/model/actor/Player;Z)V
        14: goto          615
        17: aload_1
        18: ldc           #21                 // String _blocklist
        20: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        23: ifeq          34
        26: aload_2
        27: iconst_0
        28: invokestatic  #23                 // Method showBlockList:(Lext/mods/gameserver/model/actor/Player;Z)V
        31: goto          615
        34: aload_1
        35: ldc           #26                 // String _friend
        37: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        40: ifeq          378
        43: new           #28                 // class java/util/StringTokenizer
        46: dup
        47: aload_1
        48: ldc           #30                 // String ;
        50: invokespecial #32                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
        53: astore_3
        54: aload_3
        55: invokevirtual #35                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        58: pop
        59: aload_3
        60: invokevirtual #35                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        63: astore        4
        65: aload         4
        67: ldc           #39                 // String select
        69: invokevirtual #41                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        72: ifeq          108
        75: aload_2
        76: aload_3
        77: invokevirtual #45                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
        80: ifeq          96
        83: aload_3
        84: invokevirtual #35                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        87: invokestatic  #49                 // Method java/lang/Integer.valueOf:(Ljava/lang/String;)Ljava/lang/Integer;
        90: invokevirtual #55                 // Method java/lang/Integer.intValue:()I
        93: goto          97
        96: iconst_0
        97: invokevirtual #59                 // Method ext/mods/gameserver/model/actor/Player.selectFriend:(I)V
       100: aload_2
       101: iconst_0
       102: invokestatic  #15                 // Method showFriendsList:(Lext/mods/gameserver/model/actor/Player;Z)V
       105: goto          375
       108: aload         4
       110: ldc           #65                 // String deselect
       112: invokevirtual #41                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       115: ifeq          151
       118: aload_2
       119: aload_3
       120: invokevirtual #45                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
       123: ifeq          139
       126: aload_3
       127: invokevirtual #35                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       130: invokestatic  #49                 // Method java/lang/Integer.valueOf:(Ljava/lang/String;)Ljava/lang/Integer;
       133: invokevirtual #55                 // Method java/lang/Integer.intValue:()I
       136: goto          140
       139: iconst_0
       140: invokevirtual #67                 // Method ext/mods/gameserver/model/actor/Player.deselectFriend:(I)V
       143: aload_2
       144: iconst_0
       145: invokestatic  #15                 // Method showFriendsList:(Lext/mods/gameserver/model/actor/Player;Z)V
       148: goto          375
       151: aload         4
       153: ldc           #70                 // String delall
       155: invokevirtual #41                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       158: ifeq          203
       161: invokestatic  #72                 // Method ext/mods/gameserver/data/manager/RelationManager.getInstance:()Lext/mods/gameserver/data/manager/RelationManager;
       164: aload_2
       165: invokevirtual #78                 // Method ext/mods/gameserver/data/manager/RelationManager.removeAllFromFriendList:(Lext/mods/gameserver/model/actor/Player;)V
       168: aload_2
       169: invokevirtual #82                 // Method ext/mods/gameserver/model/actor/Player.getSelectedFriendList:()Ljava/util/Set;
       172: invokeinterface #86,  1           // InterfaceMethod java/util/Set.clear:()V
       177: aload_2
       178: iconst_0
       179: invokestatic  #15                 // Method showFriendsList:(Lext/mods/gameserver/model/actor/Player;Z)V
       182: aload_2
       183: ldc           #91                 // String You have cleared your friends list.
       185: invokevirtual #93                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       188: aload_2
       189: new           #97                 // class ext/mods/gameserver/network/serverpackets/FriendList
       192: dup
       193: aload_2
       194: invokespecial #99                 // Method ext/mods/gameserver/network/serverpackets/FriendList."<init>":(Lext/mods/gameserver/model/actor/Player;)V
       197: invokevirtual #101                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       200: goto          375
       203: aload         4
       205: ldc           #105                // String delconfirm
       207: invokevirtual #41                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       210: ifeq          221
       213: aload_2
       214: iconst_1
       215: invokestatic  #15                 // Method showFriendsList:(Lext/mods/gameserver/model/actor/Player;Z)V
       218: goto          375
       221: aload         4
       223: ldc           #107                // String del
       225: invokevirtual #41                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       228: ifeq          349
       231: aload_2
       232: invokevirtual #82                 // Method ext/mods/gameserver/model/actor/Player.getSelectedFriendList:()Ljava/util/Set;
       235: invokeinterface #109,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
       240: astore        5
       242: aload         5
       244: invokeinterface #113,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       249: ifeq          320
       252: aload         5
       254: invokeinterface #118,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       259: checkcast     #50                 // class java/lang/Integer
       262: invokevirtual #55                 // Method java/lang/Integer.intValue:()I
       265: istore        6
       267: invokestatic  #122                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
       270: iload         6
       272: invokevirtual #127                // Method ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
       275: astore        7
       277: aload         7
       279: ifnull        308
       282: invokestatic  #72                 // Method ext/mods/gameserver/data/manager/RelationManager.getInstance:()Lext/mods/gameserver/data/manager/RelationManager;
       285: aload         7
       287: aload_2
       288: invokevirtual #131                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       291: invokevirtual #134                // Method ext/mods/gameserver/data/manager/RelationManager.removeFromFriendList:(Lext/mods/gameserver/model/actor/Player;I)V
       294: aload         7
       296: new           #97                 // class ext/mods/gameserver/network/serverpackets/FriendList
       299: dup
       300: aload         7
       302: invokespecial #99                 // Method ext/mods/gameserver/network/serverpackets/FriendList."<init>":(Lext/mods/gameserver/model/actor/Player;)V
       305: invokevirtual #101                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       308: invokestatic  #72                 // Method ext/mods/gameserver/data/manager/RelationManager.getInstance:()Lext/mods/gameserver/data/manager/RelationManager;
       311: aload_2
       312: iload         6
       314: invokevirtual #134                // Method ext/mods/gameserver/data/manager/RelationManager.removeFromFriendList:(Lext/mods/gameserver/model/actor/Player;I)V
       317: goto          242
       320: aload_2
       321: invokevirtual #82                 // Method ext/mods/gameserver/model/actor/Player.getSelectedFriendList:()Ljava/util/Set;
       324: invokeinterface #86,  1           // InterfaceMethod java/util/Set.clear:()V
       329: aload_2
       330: iconst_0
       331: invokestatic  #15                 // Method showFriendsList:(Lext/mods/gameserver/model/actor/Player;Z)V
       334: aload_2
       335: new           #97                 // class ext/mods/gameserver/network/serverpackets/FriendList
       338: dup
       339: aload_2
       340: invokespecial #99                 // Method ext/mods/gameserver/network/serverpackets/FriendList."<init>":(Lext/mods/gameserver/model/actor/Player;)V
       343: invokevirtual #101                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       346: goto          375
       349: aload         4
       351: ldc           #138                // String mail
       353: invokevirtual #41                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       356: ifeq          375
       359: aload_2
       360: invokevirtual #82                 // Method ext/mods/gameserver/model/actor/Player.getSelectedFriendList:()Ljava/util/Set;
       363: invokeinterface #140,  1          // InterfaceMethod java/util/Set.isEmpty:()Z
       368: ifne          375
       371: aload_2
       372: invokestatic  #143                // Method showMailWrite:(Lext/mods/gameserver/model/actor/Player;)V
       375: goto          615
       378: aload_1
       379: ldc           #146                // String _block
       381: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       384: ifeq          609
       387: new           #28                 // class java/util/StringTokenizer
       390: dup
       391: aload_1
       392: ldc           #30                 // String ;
       394: invokespecial #32                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
       397: astore_3
       398: aload_3
       399: invokevirtual #35                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       402: pop
       403: aload_3
       404: invokevirtual #35                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       407: astore        4
       409: iconst_0
       410: istore        5
       412: aload         4
       414: ldc           #39                 // String select
       416: invokevirtual #41                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       419: ifeq          450
       422: aload_2
       423: aload_3
       424: invokevirtual #45                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
       427: ifeq          443
       430: aload_3
       431: invokevirtual #35                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       434: invokestatic  #49                 // Method java/lang/Integer.valueOf:(Ljava/lang/String;)Ljava/lang/Integer;
       437: invokevirtual #55                 // Method java/lang/Integer.intValue:()I
       440: goto          444
       443: iconst_0
       444: invokevirtual #148                // Method ext/mods/gameserver/model/actor/Player.selectBlock:(I)V
       447: goto          600
       450: aload         4
       452: ldc           #65                 // String deselect
       454: invokevirtual #41                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       457: ifeq          488
       460: aload_2
       461: aload_3
       462: invokevirtual #45                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
       465: ifeq          481
       468: aload_3
       469: invokevirtual #35                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       472: invokestatic  #49                 // Method java/lang/Integer.valueOf:(Ljava/lang/String;)Ljava/lang/Integer;
       475: invokevirtual #55                 // Method java/lang/Integer.intValue:()I
       478: goto          482
       481: iconst_0
       482: invokevirtual #151                // Method ext/mods/gameserver/model/actor/Player.deselectBlock:(I)V
       485: goto          600
       488: aload         4
       490: ldc           #70                 // String delall
       492: invokevirtual #41                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       495: ifeq          517
       498: invokestatic  #72                 // Method ext/mods/gameserver/data/manager/RelationManager.getInstance:()Lext/mods/gameserver/data/manager/RelationManager;
       501: aload_2
       502: invokevirtual #154                // Method ext/mods/gameserver/data/manager/RelationManager.removeAllFromBlockList:(Lext/mods/gameserver/model/actor/Player;)V
       505: aload_2
       506: invokevirtual #157                // Method ext/mods/gameserver/model/actor/Player.getSelectedBlocksList:()Ljava/util/Set;
       509: invokeinterface #86,  1           // InterfaceMethod java/util/Set.clear:()V
       514: goto          600
       517: aload         4
       519: ldc           #105                // String delconfirm
       521: invokevirtual #41                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       524: ifeq          533
       527: iconst_1
       528: istore        5
       530: goto          600
       533: aload         4
       535: ldc           #107                // String del
       537: invokevirtual #41                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       540: ifeq          600
       543: aload_2
       544: invokevirtual #157                // Method ext/mods/gameserver/model/actor/Player.getSelectedBlocksList:()Ljava/util/Set;
       547: invokeinterface #109,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
       552: astore        6
       554: aload         6
       556: invokeinterface #113,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       561: ifeq          591
       564: aload         6
       566: invokeinterface #118,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       571: checkcast     #50                 // class java/lang/Integer
       574: invokevirtual #55                 // Method java/lang/Integer.intValue:()I
       577: istore        7
       579: invokestatic  #72                 // Method ext/mods/gameserver/data/manager/RelationManager.getInstance:()Lext/mods/gameserver/data/manager/RelationManager;
       582: aload_2
       583: iload         7
       585: invokevirtual #160                // Method ext/mods/gameserver/data/manager/RelationManager.removeFromBlockList:(Lext/mods/gameserver/model/actor/Player;I)V
       588: goto          554
       591: aload_2
       592: invokevirtual #157                // Method ext/mods/gameserver/model/actor/Player.getSelectedBlocksList:()Ljava/util/Set;
       595: invokeinterface #86,  1           // InterfaceMethod java/util/Set.clear:()V
       600: aload_2
       601: iload         5
       603: invokestatic  #23                 // Method showBlockList:(Lext/mods/gameserver/model/actor/Player;Z)V
       606: goto          615
       609: aload_0
       610: aload_1
       611: aload_2
       612: invokespecial #163                // Method ext/mods/gameserver/communitybbs/manager/BaseBBSManager.parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       615: return
      LineNumberTable:
        line 44: 0
        line 45: 9
        line 46: 17
        line 47: 26
        line 48: 34
        line 50: 43
        line 51: 54
        line 52: 59
        line 54: 65
        line 56: 75
        line 57: 100
        line 59: 108
        line 61: 118
        line 62: 143
        line 64: 151
        line 66: 161
        line 67: 168
        line 69: 177
        line 71: 182
        line 72: 188
        line 74: 203
        line 75: 213
        line 76: 221
        line 78: 231
        line 80: 267
        line 81: 277
        line 83: 282
        line 84: 294
        line 87: 308
        line 88: 317
        line 90: 320
        line 91: 329
        line 93: 334
        line 95: 349
        line 97: 359
        line 98: 371
        line 100: 375
        line 101: 378
        line 103: 387
        line 104: 398
        line 105: 403
        line 107: 409
        line 109: 412
        line 110: 422
        line 111: 450
        line 112: 460
        line 113: 488
        line 115: 498
        line 116: 505
        line 118: 517
        line 119: 527
        line 120: 533
        line 122: 543
        line 123: 579
        line 125: 591
        line 127: 600
        line 128: 606
        line 130: 609
        line 131: 615
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          277      40     7 friend   Lext/mods/gameserver/model/actor/Player;
          267      50     6 friendId   I
           54     321     3    st   Ljava/util/StringTokenizer;
           65     310     4 action   Ljava/lang/String;
          579       9     7 blockId   I
          398     208     3    st   Ljava/util/StringTokenizer;
          409     197     4 action   Ljava/lang/String;
          412     194     5 delMsg   Z
            0     616     0  this   Lext/mods/gameserver/communitybbs/manager/FriendsBBSManager;
            0     616     1 command   Ljava/lang/String;
            0     616     2 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 29
        frame_type = 17 /* same */
        frame_type = 16 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 61
          locals = [ class ext/mods/gameserver/communitybbs/manager/FriendsBBSManager, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String ]
          stack = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/communitybbs/manager/FriendsBBSManager, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String ]
          stack = [ class ext/mods/gameserver/model/actor/Player, int ]
        frame_type = 10 /* same */
        frame_type = 94 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/communitybbs/manager/FriendsBBSManager, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String ]
          stack = [ class ext/mods/gameserver/model/actor/Player, int ]
        frame_type = 10 /* same */
        frame_type = 51 /* same */
        frame_type = 17 /* same */
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ class java/util/Iterator ]
        frame_type = 253 /* append */
          offset_delta = 65
          locals = [ int, class ext/mods/gameserver/model/actor/Player ]
        frame_type = 248 /* chop */
          offset_delta = 11
        frame_type = 28 /* same */
        frame_type = 249 /* chop */
          offset_delta = 25
        frame_type = 2 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 64
          locals = [ class ext/mods/gameserver/communitybbs/manager/FriendsBBSManager, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, int ]
          stack = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/communitybbs/manager/FriendsBBSManager, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, int ]
          stack = [ class ext/mods/gameserver/model/actor/Player, int ]
        frame_type = 5 /* same */
        frame_type = 94 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/communitybbs/manager/FriendsBBSManager, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, int ]
          stack = [ class ext/mods/gameserver/model/actor/Player, int ]
        frame_type = 5 /* same */
        frame_type = 28 /* same */
        frame_type = 15 /* same */
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 36
        frame_type = 8 /* same */
        frame_type = 248 /* chop */
          offset_delta = 8
        frame_type = 5 /* same */

  public void parseWrite(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=7, args_size=7
         0: aload_1
         1: ldc           #138                // String mail
         3: invokevirtual #167                // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
         6: ifeq          31
         9: invokestatic  #170                // Method ext/mods/gameserver/communitybbs/manager/MailBBSManager.getInstance:()Lext/mods/gameserver/communitybbs/manager/MailBBSManager;
        12: aload_2
        13: aload         4
        15: aload         5
        17: aload         6
        19: invokevirtual #175                // Method ext/mods/gameserver/communitybbs/manager/MailBBSManager.sendMail:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
        22: aload         6
        24: iconst_0
        25: invokestatic  #15                 // Method showFriendsList:(Lext/mods/gameserver/model/actor/Player;Z)V
        28: goto          44
        31: aload_0
        32: aload_1
        33: aload_2
        34: aload_3
        35: aload         4
        37: aload         5
        39: aload         6
        41: invokespecial #179                // Method ext/mods/gameserver/communitybbs/manager/BaseBBSManager.parseWrite:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
        44: return
      LineNumberTable:
        line 136: 0
        line 138: 9
        line 139: 22
        line 142: 31
        line 143: 44
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      45     0  this   Lext/mods/gameserver/communitybbs/manager/FriendsBBSManager;
            0      45     1   ar1   Ljava/lang/String;
            0      45     2   ar2   Ljava/lang/String;
            0      45     3   ar3   Ljava/lang/String;
            0      45     4   ar4   Ljava/lang/String;
            0      45     5   ar5   Ljava/lang/String;
            0      45     6 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 2
        frame_type = 31 /* same */
        frame_type = 12 /* same */

  protected java.lang.String getFolder();
    descriptor: ()Ljava/lang/String;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: ldc           #183                // String friend/
         2: areturn
      LineNumberTable:
        line 148: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       3     0  this   Lext/mods/gameserver/communitybbs/manager/FriendsBBSManager;

  public static final void showMailWrite(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=3, locals=6, args_size=1
         0: invokestatic  #185                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
         3: aload_0
         4: ldc_w         #280                // String html/CommunityBoard/friend/friend-mail.htm
         7: invokevirtual #192                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
        10: astore_1
        11: aload_1
        12: ifnonnull     16
        15: return
        16: new           #200                // class java/lang/StringBuilder
        19: dup
        20: invokespecial #202                // Method java/lang/StringBuilder."<init>":()V
        23: astore_2
        24: aload_0
        25: invokevirtual #82                 // Method ext/mods/gameserver/model/actor/Player.getSelectedFriendList:()Ljava/util/Set;
        28: invokeinterface #109,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
        33: astore_3
        34: aload_3
        35: invokeinterface #113,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        40: ifeq          99
        43: aload_3
        44: invokeinterface #118,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        49: checkcast     #50                 // class java/lang/Integer
        52: invokevirtual #55                 // Method java/lang/Integer.intValue:()I
        55: istore        4
        57: invokestatic  #206                // Method ext/mods/gameserver/data/sql/PlayerInfoTable.getInstance:()Lext/mods/gameserver/data/sql/PlayerInfoTable;
        60: iload         4
        62: invokevirtual #211                // Method ext/mods/gameserver/data/sql/PlayerInfoTable.getPlayerName:(I)Ljava/lang/String;
        65: astore        5
        67: aload         5
        69: ifnonnull     75
        72: goto          34
        75: aload_2
        76: invokevirtual #282                // Method java/lang/StringBuilder.length:()I
        79: ifle          89
        82: aload_2
        83: ldc           #30                 // String ;
        85: invokevirtual #285                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        88: pop
        89: aload_2
        90: aload         5
        92: invokevirtual #285                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        95: pop
        96: goto          34
        99: aload_1
       100: ldc_w         #288                // String %list%
       103: aload_2
       104: invokevirtual #240                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
       107: invokevirtual #243                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       110: astore_1
       111: aload_1
       112: aload_0
       113: invokestatic  #262                // Method separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       116: return
      LineNumberTable:
        line 239: 0
        line 240: 11
        line 241: 15
        line 243: 16
        line 244: 24
        line 246: 57
        line 247: 67
        line 248: 72
        line 250: 75
        line 251: 82
        line 253: 89
        line 254: 96
        line 256: 99
        line 258: 111
        line 259: 116
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           67      29     5 friendName   Ljava/lang/String;
           57      39     4    id   I
            0     117     0 player   Lext/mods/gameserver/model/actor/Player;
           11     106     1 content   Ljava/lang/String;
           24      93     2    sb   Ljava/lang/StringBuilder;
      StackMapTable: number_of_entries = 5
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class java/lang/String ]
        frame_type = 253 /* append */
          offset_delta = 17
          locals = [ class java/lang/StringBuilder, class java/util/Iterator ]
        frame_type = 253 /* append */
          offset_delta = 40
          locals = [ int, class java/lang/String ]
        frame_type = 13 /* same */
        frame_type = 248 /* chop */
          offset_delta = 9

  public static ext.mods.gameserver.communitybbs.manager.FriendsBBSManager getInstance();
    descriptor: ()Lext/mods/gameserver/communitybbs/manager/FriendsBBSManager;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #290                // Field ext/mods/gameserver/communitybbs/manager/FriendsBBSManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/communitybbs/manager/FriendsBBSManager;
         3: areturn
      LineNumberTable:
        line 263: 0
}
SourceFile: "FriendsBBSManager.java"
NestMembers:
  ext/mods/gameserver/communitybbs/manager/FriendsBBSManager$SingletonHolder
