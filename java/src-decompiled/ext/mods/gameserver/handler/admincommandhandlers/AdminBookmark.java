// Bytecode for: ext.mods.gameserver.handler.admincommandhandlers.AdminBookmark
// File: ext\mods\gameserver\handler\admincommandhandlers\AdminBookmark.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/admincommandhandlers/AdminBookmark.class
  Last modified 9 de jul de 2026; size 4487 bytes
  MD5 checksum 0a04c18f1f7ac742283df950006714e0
  Compiled from "AdminBookmark.java"
public class ext.mods.gameserver.handler.admincommandhandlers.AdminBookmark implements ext.mods.gameserver.handler.IAdminCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #83                         // ext/mods/gameserver/handler/admincommandhandlers/AdminBookmark
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 5, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/StringTokenizer
    #8 = Utf8               java/util/StringTokenizer
    #9 = String             #10           //
   #10 = Utf8
   #11 = Methodref          #7.#12        // java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #12 = NameAndType        #5:#13        // "<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #13 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #14 = Methodref          #7.#15        // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
   #15 = NameAndType        #16:#17       // nextToken:()Ljava/lang/String;
   #16 = Utf8               nextToken
   #17 = Utf8               ()Ljava/lang/String;
   #18 = String             #19           // admin_bk
   #19 = Utf8               admin_bk
   #20 = Methodref          #21.#22       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #21 = Class              #23           // java/lang/String
   #22 = NameAndType        #24:#25       // startsWith:(Ljava/lang/String;)Z
   #23 = Utf8               java/lang/String
   #24 = Utf8               startsWith
   #25 = Utf8               (Ljava/lang/String;)Z
   #26 = Methodref          #7.#27        // java/util/StringTokenizer.hasMoreTokens:()Z
   #27 = NameAndType        #28:#29       // hasMoreTokens:()Z
   #28 = Utf8               hasMoreTokens
   #29 = Utf8               ()Z
   #30 = Methodref          #31.#32       // ext/mods/commons/lang/StringUtil.isDigit:(Ljava/lang/String;)Z
   #31 = Class              #33           // ext/mods/commons/lang/StringUtil
   #32 = NameAndType        #34:#25       // isDigit:(Ljava/lang/String;)Z
   #33 = Utf8               ext/mods/commons/lang/StringUtil
   #34 = Utf8               isDigit
   #35 = Methodref          #36.#37       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #36 = Class              #38           // java/lang/Integer
   #37 = NameAndType        #39:#40       // parseInt:(Ljava/lang/String;)I
   #38 = Utf8               java/lang/Integer
   #39 = Utf8               parseInt
   #40 = Utf8               (Ljava/lang/String;)I
   #41 = Methodref          #21.#42       // java/lang/String.length:()I
   #42 = NameAndType        #43:#44       // length:()I
   #43 = Utf8               length
   #44 = Utf8               ()I
   #45 = String             #46           // The bookmark name is too long.
   #46 = Utf8               The bookmark name is too long.
   #47 = Methodref          #48.#49       // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #48 = Class              #50           // ext/mods/gameserver/model/actor/Player
   #49 = NameAndType        #51:#52       // sendMessage:(Ljava/lang/String;)V
   #50 = Utf8               ext/mods/gameserver/model/actor/Player
   #51 = Utf8               sendMessage
   #52 = Utf8               (Ljava/lang/String;)V
   #53 = Methodref          #54.#55       // ext/mods/gameserver/data/sql/BookmarkTable.getInstance:()Lext/mods/gameserver/data/sql/BookmarkTable;
   #54 = Class              #56           // ext/mods/gameserver/data/sql/BookmarkTable
   #55 = NameAndType        #57:#58       // getInstance:()Lext/mods/gameserver/data/sql/BookmarkTable;
   #56 = Utf8               ext/mods/gameserver/data/sql/BookmarkTable
   #57 = Utf8               getInstance
   #58 = Utf8               ()Lext/mods/gameserver/data/sql/BookmarkTable;
   #59 = Methodref          #48.#60       // ext/mods/gameserver/model/actor/Player.getObjectId:()I
   #60 = NameAndType        #61:#44       // getObjectId:()I
   #61 = Utf8               getObjectId
   #62 = Methodref          #54.#63       // ext/mods/gameserver/data/sql/BookmarkTable.isExisting:(Ljava/lang/String;I)Z
   #63 = NameAndType        #64:#65       // isExisting:(Ljava/lang/String;I)Z
   #64 = Utf8               isExisting
   #65 = Utf8               (Ljava/lang/String;I)Z
   #66 = String             #67           // The bookmark name already exists.
   #67 = Utf8               The bookmark name already exists.
   #68 = Methodref          #54.#69       // ext/mods/gameserver/data/sql/BookmarkTable.saveBookmark:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #69 = NameAndType        #70:#71       // saveBookmark:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #70 = Utf8               saveBookmark
   #71 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #72 = String             #73           // admin_delbk
   #73 = Utf8               admin_delbk
   #74 = String             #75           // The command delbk must be followed by a valid name.
   #75 = Utf8               The command delbk must be followed by a valid name.
   #76 = String             #77           // That bookmark doesn\'t exist.
   #77 = Utf8               That bookmark doesn\'t exist.
   #78 = Methodref          #54.#79       // ext/mods/gameserver/data/sql/BookmarkTable.deleteBookmark:(Ljava/lang/String;I)V
   #79 = NameAndType        #80:#81       // deleteBookmark:(Ljava/lang/String;I)V
   #80 = Utf8               deleteBookmark
   #81 = Utf8               (Ljava/lang/String;I)V
   #82 = Methodref          #83.#84       // ext/mods/gameserver/handler/admincommandhandlers/AdminBookmark.showBookmarks:(Lext/mods/gameserver/model/actor/Player;I)V
   #83 = Class              #85           // ext/mods/gameserver/handler/admincommandhandlers/AdminBookmark
   #84 = NameAndType        #86:#87       // showBookmarks:(Lext/mods/gameserver/model/actor/Player;I)V
   #85 = Utf8               ext/mods/gameserver/handler/admincommandhandlers/AdminBookmark
   #86 = Utf8               showBookmarks
   #87 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
   #88 = Fieldref           #83.#89       // ext/mods/gameserver/handler/admincommandhandlers/AdminBookmark.ADMIN_COMMANDS:[Ljava/lang/String;
   #89 = NameAndType        #90:#91       // ADMIN_COMMANDS:[Ljava/lang/String;
   #90 = Utf8               ADMIN_COMMANDS
   #91 = Utf8               [Ljava/lang/String;
   #92 = Class              #93           // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #93 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #94 = Methodref          #92.#95       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
   #95 = NameAndType        #5:#96        // "<init>":(I)V
   #96 = Utf8               (I)V
   #97 = Methodref          #48.#98       // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
   #98 = NameAndType        #99:#100      // getLocale:()Ljava/util/Locale;
   #99 = Utf8               getLocale
  #100 = Utf8               ()Ljava/util/Locale;
  #101 = String             #102          // html/admin/bk.htm
  #102 = Utf8               html/admin/bk.htm
  #103 = Methodref          #92.#104      // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #104 = NameAndType        #105:#106     // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #105 = Utf8               setFile
  #106 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
  #107 = Class              #108          // ext/mods/commons/data/Pagination
  #108 = Utf8               ext/mods/commons/data/Pagination
  #109 = Methodref          #54.#110      // ext/mods/gameserver/data/sql/BookmarkTable.getBookmarks:(I)Ljava/util/List;
  #110 = NameAndType        #111:#112     // getBookmarks:(I)Ljava/util/List;
  #111 = Utf8               getBookmarks
  #112 = Utf8               (I)Ljava/util/List;
  #113 = InterfaceMethodref #114.#115     // java/util/List.stream:()Ljava/util/stream/Stream;
  #114 = Class              #116          // java/util/List
  #115 = NameAndType        #117:#118     // stream:()Ljava/util/stream/Stream;
  #116 = Utf8               java/util/List
  #117 = Utf8               stream
  #118 = Utf8               ()Ljava/util/stream/Stream;
  #119 = Class              #120          // ext/mods/gameserver/handler/IAdminCommandHandler
  #120 = Utf8               ext/mods/gameserver/handler/IAdminCommandHandler
  #121 = Methodref          #107.#122     // ext/mods/commons/data/Pagination."<init>":(Ljava/util/stream/Stream;II)V
  #122 = NameAndType        #5:#123       // "<init>":(Ljava/util/stream/Stream;II)V
  #123 = Utf8               (Ljava/util/stream/Stream;II)V
  #124 = Methodref          #107.#125     // ext/mods/commons/data/Pagination.iterator:()Ljava/util/Iterator;
  #125 = NameAndType        #126:#127     // iterator:()Ljava/util/Iterator;
  #126 = Utf8               iterator
  #127 = Utf8               ()Ljava/util/Iterator;
  #128 = InterfaceMethodref #129.#130     // java/util/Iterator.hasNext:()Z
  #129 = Class              #131          // java/util/Iterator
  #130 = NameAndType        #132:#29      // hasNext:()Z
  #131 = Utf8               java/util/Iterator
  #132 = Utf8               hasNext
  #133 = InterfaceMethodref #129.#134     // java/util/Iterator.next:()Ljava/lang/Object;
  #134 = NameAndType        #135:#136     // next:()Ljava/lang/Object;
  #135 = Utf8               next
  #136 = Utf8               ()Ljava/lang/Object;
  #137 = Class              #138          // ext/mods/gameserver/model/records/Bookmark
  #138 = Utf8               ext/mods/gameserver/model/records/Bookmark
  #139 = String             #140          // <table width=280 bgcolor=000000><tr>
  #140 = Utf8               <table width=280 bgcolor=000000><tr>
  #141 = String             #142          // <table width=280><tr>
  #142 = Utf8               <table width=280><tr>
  #143 = Methodref          #107.#144     // ext/mods/commons/data/Pagination.append:([Ljava/lang/Object;)V
  #144 = NameAndType        #145:#146     // append:([Ljava/lang/Object;)V
  #145 = Utf8               append
  #146 = Utf8               ([Ljava/lang/Object;)V
  #147 = String             #148          // <td width=230><a action=\"bypass -h admin_teleport
  #148 = Utf8               <td width=230><a action=\"bypass -h admin_teleport
  #149 = Methodref          #137.#150     // ext/mods/gameserver/model/records/Bookmark.x:()I
  #150 = NameAndType        #151:#44      // x:()I
  #151 = Utf8               x
  #152 = Methodref          #36.#153      // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #153 = NameAndType        #154:#155     // valueOf:(I)Ljava/lang/Integer;
  #154 = Utf8               valueOf
  #155 = Utf8               (I)Ljava/lang/Integer;
  #156 = Methodref          #137.#157     // ext/mods/gameserver/model/records/Bookmark.y:()I
  #157 = NameAndType        #158:#44      // y:()I
  #158 = Utf8               y
  #159 = Methodref          #137.#160     // ext/mods/gameserver/model/records/Bookmark.z:()I
  #160 = NameAndType        #161:#44      // z:()I
  #161 = Utf8               z
  #162 = String             #163          // \">
  #163 = Utf8               \">
  #164 = Methodref          #137.#165     // ext/mods/gameserver/model/records/Bookmark.name:()Ljava/lang/String;
  #165 = NameAndType        #166:#17      // name:()Ljava/lang/String;
  #166 = Utf8               name
  #167 = String             #168          //  (
  #168 = Utf8                (
  #169 = String             #170          // )
  #170 = Utf8               )
  #171 = String             #172          // </a></td><td width=50><a action=\"bypass -h admin_delbk
  #172 = Utf8               </a></td><td width=50><a action=\"bypass -h admin_delbk
  #173 = String             #174          // \">Remove</a></td>
  #174 = Utf8               \">Remove</a></td>
  #175 = String             #176          // </tr></table><img src=\"L2UI.SquareGray\" width=280 height=1>
  #176 = Utf8               </tr></table><img src=\"L2UI.SquareGray\" width=280 height=1>
  #177 = Methodref          #107.#178     // ext/mods/commons/data/Pagination.generateSpace:(I)V
  #178 = NameAndType        #179:#96      // generateSpace:(I)V
  #179 = Utf8               generateSpace
  #180 = String             #181          // bypass admin_bk %page%
  #181 = Utf8               bypass admin_bk %page%
  #182 = Methodref          #107.#183     // ext/mods/commons/data/Pagination.generatePages:(Ljava/lang/String;)V
  #183 = NameAndType        #184:#52      // generatePages:(Ljava/lang/String;)V
  #184 = Utf8               generatePages
  #185 = String             #186          // %content%
  #186 = Utf8               %content%
  #187 = Methodref          #107.#188     // ext/mods/commons/data/Pagination.getContent:()Ljava/lang/String;
  #188 = NameAndType        #189:#17      // getContent:()Ljava/lang/String;
  #189 = Utf8               getContent
  #190 = Methodref          #92.#191      // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
  #191 = NameAndType        #192:#13      // replace:(Ljava/lang/String;Ljava/lang/String;)V
  #192 = Utf8               replace
  #193 = Methodref          #48.#194      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #194 = NameAndType        #195:#196     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #195 = Utf8               sendPacket
  #196 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #197 = Utf8               Code
  #198 = Utf8               LineNumberTable
  #199 = Utf8               LocalVariableTable
  #200 = Utf8               this
  #201 = Utf8               Lext/mods/gameserver/handler/admincommandhandlers/AdminBookmark;
  #202 = Utf8               useAdminCommand
  #203 = Utf8               param
  #204 = Utf8               Ljava/lang/String;
  #205 = Utf8               command
  #206 = Utf8               player
  #207 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #208 = Utf8               st
  #209 = Utf8               Ljava/util/StringTokenizer;
  #210 = Utf8               page
  #211 = Utf8               I
  #212 = Utf8               StackMapTable
  #213 = Utf8               getAdminCommandList
  #214 = Utf8               ()[Ljava/lang/String;
  #215 = Utf8               bk
  #216 = Utf8               Lext/mods/gameserver/model/records/Bookmark;
  #217 = Utf8               html
  #218 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #219 = Utf8               row
  #220 = Utf8               list
  #221 = Utf8               Lext/mods/commons/data/Pagination;
  #222 = Utf8               LocalVariableTypeTable
  #223 = Utf8               Lext/mods/commons/data/Pagination<Lext/mods/gameserver/model/records/Bookmark;>;
  #224 = Class              #225          // "[Ljava/lang/Object;"
  #225 = Utf8               [Ljava/lang/Object;
  #226 = Utf8               <clinit>
  #227 = Utf8               SourceFile
  #228 = Utf8               AdminBookmark.java
{
  public ext.mods.gameserver.handler.admincommandhandlers.AdminBookmark();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 31: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminBookmark;

  public void useAdminCommand(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=6, args_size=3
         0: new           #7                  // class java/util/StringTokenizer
         3: dup
         4: aload_1
         5: ldc           #9                  // String
         7: invokespecial #11                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
        10: astore_3
        11: aload_3
        12: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        15: pop
        16: iconst_1
        17: istore        4
        19: aload_1
        20: ldc           #18                 // String admin_bk
        22: invokevirtual #20                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        25: ifeq          110
        28: aload_3
        29: invokevirtual #26                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
        32: ifeq          173
        35: aload_3
        36: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        39: astore        5
        41: aload         5
        43: invokestatic  #30                 // Method ext/mods/commons/lang/StringUtil.isDigit:(Ljava/lang/String;)Z
        46: ifeq          59
        49: aload         5
        51: invokestatic  #35                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        54: istore        4
        56: goto          107
        59: aload         5
        61: invokevirtual #41                 // Method java/lang/String.length:()I
        64: bipush        15
        66: if_icmple     76
        69: aload_2
        70: ldc           #45                 // String The bookmark name is too long.
        72: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        75: return
        76: invokestatic  #53                 // Method ext/mods/gameserver/data/sql/BookmarkTable.getInstance:()Lext/mods/gameserver/data/sql/BookmarkTable;
        79: aload         5
        81: aload_2
        82: invokevirtual #59                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        85: invokevirtual #62                 // Method ext/mods/gameserver/data/sql/BookmarkTable.isExisting:(Ljava/lang/String;I)Z
        88: ifeq          98
        91: aload_2
        92: ldc           #66                 // String The bookmark name already exists.
        94: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        97: return
        98: invokestatic  #53                 // Method ext/mods/gameserver/data/sql/BookmarkTable.getInstance:()Lext/mods/gameserver/data/sql/BookmarkTable;
       101: aload         5
       103: aload_2
       104: invokevirtual #68                 // Method ext/mods/gameserver/data/sql/BookmarkTable.saveBookmark:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       107: goto          173
       110: aload_1
       111: ldc           #72                 // String admin_delbk
       113: invokevirtual #20                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       116: ifeq          173
       119: aload_3
       120: invokevirtual #26                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
       123: ifne          133
       126: aload_2
       127: ldc           #74                 // String The command delbk must be followed by a valid name.
       129: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       132: return
       133: aload_3
       134: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       137: astore        5
       139: invokestatic  #53                 // Method ext/mods/gameserver/data/sql/BookmarkTable.getInstance:()Lext/mods/gameserver/data/sql/BookmarkTable;
       142: aload         5
       144: aload_2
       145: invokevirtual #59                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       148: invokevirtual #62                 // Method ext/mods/gameserver/data/sql/BookmarkTable.isExisting:(Ljava/lang/String;I)Z
       151: ifne          161
       154: aload_2
       155: ldc           #76                 // String That bookmark doesn\'t exist.
       157: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       160: return
       161: invokestatic  #53                 // Method ext/mods/gameserver/data/sql/BookmarkTable.getInstance:()Lext/mods/gameserver/data/sql/BookmarkTable;
       164: aload         5
       166: aload_2
       167: invokevirtual #59                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       170: invokevirtual #78                 // Method ext/mods/gameserver/data/sql/BookmarkTable.deleteBookmark:(Ljava/lang/String;I)V
       173: aload_2
       174: iload         4
       176: invokestatic  #82                 // Method showBookmarks:(Lext/mods/gameserver/model/actor/Player;I)V
       179: return
      LineNumberTable:
        line 42: 0
        line 43: 11
        line 45: 16
        line 47: 19
        line 49: 28
        line 51: 35
        line 52: 41
        line 53: 49
        line 56: 59
        line 58: 69
        line 59: 75
        line 62: 76
        line 64: 91
        line 65: 97
        line 68: 98
        line 70: 107
        line 72: 110
        line 74: 119
        line 76: 126
        line 77: 132
        line 80: 133
        line 82: 139
        line 84: 154
        line 85: 160
        line 88: 161
        line 90: 173
        line 91: 179
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           41      66     5 param   Ljava/lang/String;
          139      34     5 param   Ljava/lang/String;
            0     180     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminBookmark;
            0     180     1 command   Ljava/lang/String;
            0     180     2 player   Lext/mods/gameserver/model/actor/Player;
           11     169     3    st   Ljava/util/StringTokenizer;
           19     161     4  page   I
      StackMapTable: number_of_entries = 8
        frame_type = 254 /* append */
          offset_delta = 59
          locals = [ class java/util/StringTokenizer, int, class java/lang/String ]
        frame_type = 16 /* same */
        frame_type = 21 /* same */
        frame_type = 250 /* chop */
          offset_delta = 8
        frame_type = 2 /* same */
        frame_type = 22 /* same */
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ class java/lang/String ]
        frame_type = 250 /* chop */
          offset_delta = 11

  public java.lang.String[] getAdminCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #88                 // Field ADMIN_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 96: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminBookmark;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_2
         1: anewarray     #21                 // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #18                 // String admin_bk
         8: aastore
         9: dup
        10: iconst_1
        11: ldc           #72                 // String admin_delbk
        13: aastore
        14: putstatic     #88                 // Field ADMIN_COMMANDS:[Ljava/lang/String;
        17: return
      LineNumberTable:
        line 33: 0
}
SourceFile: "AdminBookmark.java"
