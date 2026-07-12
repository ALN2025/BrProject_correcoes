// Bytecode for: ext.mods.gameserver.handler.admincommandhandlers.AdminKnownlist
// File: ext\mods\gameserver\handler\admincommandhandlers\AdminKnownlist.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/admincommandhandlers/AdminKnownlist.class
  Last modified 9 de jul de 2026; size 3923 bytes
  MD5 checksum 5876fb890252870e21933d79ba176e28
  Compiled from "AdminKnownlist.java"
public class ext.mods.gameserver.handler.admincommandhandlers.AdminKnownlist implements ext.mods.gameserver.handler.IAdminCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #29                         // ext/mods/gameserver/handler/admincommandhandlers/AdminKnownlist
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
   #18 = String             #19           // admin_knownlist
   #19 = Utf8               admin_knownlist
   #20 = Methodref          #21.#22       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #21 = Class              #23           // java/lang/String
   #22 = NameAndType        #24:#25       // startsWith:(Ljava/lang/String;)Z
   #23 = Utf8               java/lang/String
   #24 = Utf8               startsWith
   #25 = Utf8               (Ljava/lang/String;)Z
   #26 = Class              #27           // ext/mods/gameserver/model/WorldObject
   #27 = Utf8               ext/mods/gameserver/model/WorldObject
   #28 = Methodref          #29.#30       // ext/mods/gameserver/handler/admincommandhandlers/AdminKnownlist.getTarget:(Ljava/lang/Class;Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/WorldObject;
   #29 = Class              #31           // ext/mods/gameserver/handler/admincommandhandlers/AdminKnownlist
   #30 = NameAndType        #32:#33       // getTarget:(Ljava/lang/Class;Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/WorldObject;
   #31 = Utf8               ext/mods/gameserver/handler/admincommandhandlers/AdminKnownlist
   #32 = Utf8               getTarget
   #33 = Utf8               (Ljava/lang/Class;Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/WorldObject;
   #34 = Methodref          #7.#35        // java/util/StringTokenizer.hasMoreTokens:()Z
   #35 = NameAndType        #36:#37       // hasMoreTokens:()Z
   #36 = Utf8               hasMoreTokens
   #37 = Utf8               ()Z
   #38 = Methodref          #39.#40       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #39 = Class              #41           // java/lang/Integer
   #40 = NameAndType        #42:#43       // parseInt:(Ljava/lang/String;)I
   #41 = Utf8               java/lang/Integer
   #42 = Utf8               parseInt
   #43 = Utf8               (Ljava/lang/String;)I
   #44 = Class              #45           // java/lang/Exception
   #45 = Utf8               java/lang/Exception
   #46 = String             #47           // Usage: //knownlist [page]
   #47 = Utf8               Usage: //knownlist [page]
   #48 = Methodref          #49.#50       // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #49 = Class              #51           // ext/mods/gameserver/model/actor/Player
   #50 = NameAndType        #52:#53       // sendMessage:(Ljava/lang/String;)V
   #51 = Utf8               ext/mods/gameserver/model/actor/Player
   #52 = Utf8               sendMessage
   #53 = Utf8               (Ljava/lang/String;)V
   #54 = Methodref          #29.#55       // ext/mods/gameserver/handler/admincommandhandlers/AdminKnownlist.showKnownlist:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/WorldObject;I)V
   #55 = NameAndType        #56:#57       // showKnownlist:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/WorldObject;I)V
   #56 = Utf8               showKnownlist
   #57 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/WorldObject;I)V
   #58 = Class              #59           // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #59 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #60 = Methodref          #58.#61       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
   #61 = NameAndType        #5:#62        // "<init>":(I)V
   #62 = Utf8               (I)V
   #63 = Methodref          #49.#64       // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
   #64 = NameAndType        #65:#66       // getLocale:()Ljava/util/Locale;
   #65 = Utf8               getLocale
   #66 = Utf8               ()Ljava/util/Locale;
   #67 = String             #68           // html/admin/knownlist.htm
   #68 = Utf8               html/admin/knownlist.htm
   #69 = Methodref          #58.#70       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
   #70 = NameAndType        #71:#72       // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
   #71 = Utf8               setFile
   #72 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
   #73 = String             #74           // %target%
   #74 = Utf8               %target%
   #75 = Methodref          #26.#76       // ext/mods/gameserver/model/WorldObject.getName:()Ljava/lang/String;
   #76 = NameAndType        #77:#17       // getName:()Ljava/lang/String;
   #77 = Utf8               getName
   #78 = Methodref          #58.#79       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
   #79 = NameAndType        #80:#13       // replace:(Ljava/lang/String;Ljava/lang/String;)V
   #80 = Utf8               replace
   #81 = Class              #82           // ext/mods/commons/data/Pagination
   #82 = Utf8               ext/mods/commons/data/Pagination
   #83 = Methodref          #26.#84       // ext/mods/gameserver/model/WorldObject.getKnownType:(Ljava/lang/Class;)Ljava/util/List;
   #84 = NameAndType        #85:#86       // getKnownType:(Ljava/lang/Class;)Ljava/util/List;
   #85 = Utf8               getKnownType
   #86 = Utf8               (Ljava/lang/Class;)Ljava/util/List;
   #87 = InterfaceMethodref #88.#89       // java/util/List.stream:()Ljava/util/stream/Stream;
   #88 = Class              #90           // java/util/List
   #89 = NameAndType        #91:#92       // stream:()Ljava/util/stream/Stream;
   #90 = Utf8               java/util/List
   #91 = Utf8               stream
   #92 = Utf8               ()Ljava/util/stream/Stream;
   #93 = Class              #94           // ext/mods/gameserver/handler/IAdminCommandHandler
   #94 = Utf8               ext/mods/gameserver/handler/IAdminCommandHandler
   #95 = Methodref          #81.#96       // ext/mods/commons/data/Pagination."<init>":(Ljava/util/stream/Stream;II)V
   #96 = NameAndType        #5:#97        // "<init>":(Ljava/util/stream/Stream;II)V
   #97 = Utf8               (Ljava/util/stream/Stream;II)V
   #98 = Methodref          #81.#99       // ext/mods/commons/data/Pagination.iterator:()Ljava/util/Iterator;
   #99 = NameAndType        #100:#101     // iterator:()Ljava/util/Iterator;
  #100 = Utf8               iterator
  #101 = Utf8               ()Ljava/util/Iterator;
  #102 = InterfaceMethodref #103.#104     // java/util/Iterator.hasNext:()Z
  #103 = Class              #105          // java/util/Iterator
  #104 = NameAndType        #106:#37      // hasNext:()Z
  #105 = Utf8               java/util/Iterator
  #106 = Utf8               hasNext
  #107 = InterfaceMethodref #103.#108     // java/util/Iterator.next:()Ljava/lang/Object;
  #108 = NameAndType        #109:#110     // next:()Ljava/lang/Object;
  #109 = Utf8               next
  #110 = Utf8               ()Ljava/lang/Object;
  #111 = String             #112          // <table width=280 bgcolor=000000><tr>
  #112 = Utf8               <table width=280 bgcolor=000000><tr>
  #113 = String             #114          // <table width=280><tr>
  #114 = Utf8               <table width=280><tr>
  #115 = Methodref          #81.#116      // ext/mods/commons/data/Pagination.append:([Ljava/lang/Object;)V
  #116 = NameAndType        #117:#118     // append:([Ljava/lang/Object;)V
  #117 = Utf8               append
  #118 = Utf8               ([Ljava/lang/Object;)V
  #119 = String             #120          // <td width=160>
  #120 = Utf8               <td width=160>
  #121 = String             #122          // </td><td width=120>
  #122 = Utf8               </td><td width=120>
  #123 = Methodref          #2.#124       // java/lang/Object.getClass:()Ljava/lang/Class;
  #124 = NameAndType        #125:#126     // getClass:()Ljava/lang/Class;
  #125 = Utf8               getClass
  #126 = Utf8               ()Ljava/lang/Class;
  #127 = Methodref          #128.#129     // java/lang/Class.getSimpleName:()Ljava/lang/String;
  #128 = Class              #130          // java/lang/Class
  #129 = NameAndType        #131:#17      // getSimpleName:()Ljava/lang/String;
  #130 = Utf8               java/lang/Class
  #131 = Utf8               getSimpleName
  #132 = String             #133          // </td>
  #133 = Utf8               </td>
  #134 = String             #135          // </tr></table><img src=\"L2UI.SquareGray\" width=280 height=1>
  #135 = Utf8               </tr></table><img src=\"L2UI.SquareGray\" width=280 height=1>
  #136 = Methodref          #81.#137      // ext/mods/commons/data/Pagination.generateSpace:(I)V
  #137 = NameAndType        #138:#62      // generateSpace:(I)V
  #138 = Utf8               generateSpace
  #139 = String             #140          // bypass admin_knownlist %page%
  #140 = Utf8               bypass admin_knownlist %page%
  #141 = Methodref          #81.#142      // ext/mods/commons/data/Pagination.generatePages:(Ljava/lang/String;)V
  #142 = NameAndType        #143:#53      // generatePages:(Ljava/lang/String;)V
  #143 = Utf8               generatePages
  #144 = String             #145          // %content%
  #145 = Utf8               %content%
  #146 = Methodref          #81.#147      // ext/mods/commons/data/Pagination.getContent:()Ljava/lang/String;
  #147 = NameAndType        #148:#17      // getContent:()Ljava/lang/String;
  #148 = Utf8               getContent
  #149 = Methodref          #49.#150      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #150 = NameAndType        #151:#152     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #151 = Utf8               sendPacket
  #152 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #153 = Fieldref           #29.#154      // ext/mods/gameserver/handler/admincommandhandlers/AdminKnownlist.ADMIN_COMMANDS:[Ljava/lang/String;
  #154 = NameAndType        #155:#156     // ADMIN_COMMANDS:[Ljava/lang/String;
  #155 = Utf8               ADMIN_COMMANDS
  #156 = Utf8               [Ljava/lang/String;
  #157 = Utf8               Code
  #158 = Utf8               LineNumberTable
  #159 = Utf8               LocalVariableTable
  #160 = Utf8               this
  #161 = Utf8               Lext/mods/gameserver/handler/admincommandhandlers/AdminKnownlist;
  #162 = Utf8               useAdminCommand
  #163 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #164 = Utf8               e
  #165 = Utf8               Ljava/lang/Exception;
  #166 = Utf8               targetWorldObject
  #167 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #168 = Utf8               page
  #169 = Utf8               I
  #170 = Utf8               command
  #171 = Utf8               Ljava/lang/String;
  #172 = Utf8               player
  #173 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #174 = Utf8               st
  #175 = Utf8               Ljava/util/StringTokenizer;
  #176 = Utf8               StackMapTable
  #177 = Utf8               wo
  #178 = Utf8               worldObject
  #179 = Utf8               html
  #180 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #181 = Utf8               row
  #182 = Utf8               list
  #183 = Utf8               Lext/mods/commons/data/Pagination;
  #184 = Utf8               LocalVariableTypeTable
  #185 = Utf8               Lext/mods/commons/data/Pagination<Lext/mods/gameserver/model/WorldObject;>;
  #186 = Class              #187          // "[Ljava/lang/Object;"
  #187 = Utf8               [Ljava/lang/Object;
  #188 = Utf8               getAdminCommandList
  #189 = Utf8               ()[Ljava/lang/String;
  #190 = Utf8               <clinit>
  #191 = Utf8               SourceFile
  #192 = Utf8               AdminKnownlist.java
{
  public ext.mods.gameserver.handler.admincommandhandlers.AdminKnownlist();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 29: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminKnownlist;

  public void useAdminCommand(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=7, args_size=3
         0: new           #7                  // class java/util/StringTokenizer
         3: dup
         4: aload_1
         5: ldc           #9                  // String
         7: invokespecial #11                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
        10: astore_3
        11: aload_3
        12: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        15: pop
        16: aload_1
        17: ldc           #18                 // String admin_knownlist
        19: invokevirtual #20                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        22: ifeq          73
        25: aload_0
        26: ldc           #26                 // class ext/mods/gameserver/model/WorldObject
        28: aload_2
        29: iconst_1
        30: invokevirtual #28                 // Method getTarget:(Ljava/lang/Class;Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/WorldObject;
        33: astore        4
        35: iconst_1
        36: istore        5
        38: aload_3
        39: invokevirtual #34                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
        42: ifeq          65
        45: aload_3
        46: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        49: invokestatic  #38                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        52: istore        5
        54: goto          65
        57: astore        6
        59: aload_2
        60: ldc           #46                 // String Usage: //knownlist [page]
        62: invokevirtual #48                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        65: aload_2
        66: aload         4
        68: iload         5
        70: invokestatic  #54                 // Method showKnownlist:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/WorldObject;I)V
        73: return
      Exception table:
         from    to  target type
            45    54    57   Class java/lang/Exception
      LineNumberTable:
        line 39: 0
        line 40: 11
        line 42: 16
        line 44: 25
        line 46: 35
        line 48: 38
        line 52: 45
        line 57: 54
        line 54: 57
        line 56: 59
        line 60: 65
        line 62: 73
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           59       6     6     e   Ljava/lang/Exception;
           35      38     4 targetWorldObject   Lext/mods/gameserver/model/WorldObject;
           38      35     5  page   I
            0      74     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminKnownlist;
            0      74     1 command   Ljava/lang/String;
            0      74     2 player   Lext/mods/gameserver/model/actor/Player;
           11      63     3    st   Ljava/util/StringTokenizer;
      StackMapTable: number_of_entries = 3
        frame_type = 255 /* full_frame */
          offset_delta = 57
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminKnownlist, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class ext/mods/gameserver/model/WorldObject, int ]
          stack = [ class java/lang/Exception ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 7

  public java.lang.String[] getAdminCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #153                // Field ADMIN_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 93: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminKnownlist;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #21                 // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #18                 // String admin_knownlist
         8: aastore
         9: putstatic     #153                // Field ADMIN_COMMANDS:[Ljava/lang/String;
        12: return
      LineNumberTable:
        line 31: 0
}
SourceFile: "AdminKnownlist.java"
