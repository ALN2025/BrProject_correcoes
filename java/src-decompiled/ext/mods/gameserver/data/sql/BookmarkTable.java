// Bytecode for: ext.mods.gameserver.data.sql.BookmarkTable
// File: ext\mods\gameserver\data\sql\BookmarkTable.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/sql/BookmarkTable.class
  Last modified 9 de jul de 2026; size 6256 bytes
  MD5 checksum d06ebad887d4c45051a17547a39c0df0
  Compiled from "BookmarkTable.java"
public class ext.mods.gameserver.data.sql.BookmarkTable
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/data/sql/BookmarkTable
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 2, methods: 9, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/ArrayList
    #8 = Utf8               java/util/ArrayList
    #9 = Methodref          #7.#3         // java/util/ArrayList."<init>":()V
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/data/sql/BookmarkTable._bks:Ljava/util/List;
   #11 = Class              #13           // ext/mods/gameserver/data/sql/BookmarkTable
   #12 = NameAndType        #14:#15       // _bks:Ljava/util/List;
   #13 = Utf8               ext/mods/gameserver/data/sql/BookmarkTable
   #14 = Utf8               _bks
   #15 = Utf8               Ljava/util/List;
   #16 = Methodref          #17.#18       // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
   #17 = Class              #19           // ext/mods/commons/pool/ConnectionPool
   #18 = NameAndType        #20:#21       // getConnection:()Ljava/sql/Connection;
   #19 = Utf8               ext/mods/commons/pool/ConnectionPool
   #20 = Utf8               getConnection
   #21 = Utf8               ()Ljava/sql/Connection;
   #22 = String             #23           // SELECT * FROM bookmarks
   #23 = Utf8               SELECT * FROM bookmarks
   #24 = InterfaceMethodref #25.#26       // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #25 = Class              #27           // java/sql/Connection
   #26 = NameAndType        #28:#29       // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #27 = Utf8               java/sql/Connection
   #28 = Utf8               prepareStatement
   #29 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #30 = InterfaceMethodref #31.#32       // java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
   #31 = Class              #33           // java/sql/PreparedStatement
   #32 = NameAndType        #34:#35       // executeQuery:()Ljava/sql/ResultSet;
   #33 = Utf8               java/sql/PreparedStatement
   #34 = Utf8               executeQuery
   #35 = Utf8               ()Ljava/sql/ResultSet;
   #36 = InterfaceMethodref #37.#38       // java/sql/ResultSet.next:()Z
   #37 = Class              #39           // java/sql/ResultSet
   #38 = NameAndType        #40:#41       // next:()Z
   #39 = Utf8               java/sql/ResultSet
   #40 = Utf8               next
   #41 = Utf8               ()Z
   #42 = Class              #43           // ext/mods/gameserver/model/records/Bookmark
   #43 = Utf8               ext/mods/gameserver/model/records/Bookmark
   #44 = String             #45           // name
   #45 = Utf8               name
   #46 = InterfaceMethodref #37.#47       // java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
   #47 = NameAndType        #48:#49       // getString:(Ljava/lang/String;)Ljava/lang/String;
   #48 = Utf8               getString
   #49 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #50 = String             #51           // obj_Id
   #51 = Utf8               obj_Id
   #52 = InterfaceMethodref #37.#53       // java/sql/ResultSet.getInt:(Ljava/lang/String;)I
   #53 = NameAndType        #54:#55       // getInt:(Ljava/lang/String;)I
   #54 = Utf8               getInt
   #55 = Utf8               (Ljava/lang/String;)I
   #56 = String             #57           // x
   #57 = Utf8               x
   #58 = String             #59           // y
   #59 = Utf8               y
   #60 = String             #61           // z
   #61 = Utf8               z
   #62 = Methodref          #42.#63       // ext/mods/gameserver/model/records/Bookmark."<init>":(Ljava/lang/String;IIII)V
   #63 = NameAndType        #5:#64        // "<init>":(Ljava/lang/String;IIII)V
   #64 = Utf8               (Ljava/lang/String;IIII)V
   #65 = InterfaceMethodref #66.#67       // java/util/List.add:(Ljava/lang/Object;)Z
   #66 = Class              #68           // java/util/List
   #67 = NameAndType        #69:#70       // add:(Ljava/lang/Object;)Z
   #68 = Utf8               java/util/List
   #69 = Utf8               add
   #70 = Utf8               (Ljava/lang/Object;)Z
   #71 = InterfaceMethodref #37.#72       // java/sql/ResultSet.close:()V
   #72 = NameAndType        #73:#6        // close:()V
   #73 = Utf8               close
   #74 = Class              #75           // java/lang/Throwable
   #75 = Utf8               java/lang/Throwable
   #76 = Methodref          #74.#77       // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
   #77 = NameAndType        #78:#79       // addSuppressed:(Ljava/lang/Throwable;)V
   #78 = Utf8               addSuppressed
   #79 = Utf8               (Ljava/lang/Throwable;)V
   #80 = InterfaceMethodref #31.#72       // java/sql/PreparedStatement.close:()V
   #81 = InterfaceMethodref #25.#72       // java/sql/Connection.close:()V
   #82 = Class              #83           // java/lang/Exception
   #83 = Utf8               java/lang/Exception
   #84 = Fieldref           #11.#85       // ext/mods/gameserver/data/sql/BookmarkTable.LOGGER:Lext/mods/commons/logging/CLogger;
   #85 = NameAndType        #86:#87       // LOGGER:Lext/mods/commons/logging/CLogger;
   #86 = Utf8               LOGGER
   #87 = Utf8               Lext/mods/commons/logging/CLogger;
   #88 = String             #89           // Couldn\'t restore bookmarks.
   #89 = Utf8               Couldn\'t restore bookmarks.
   #90 = Methodref          #91.#92       // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
   #91 = Class              #93           // ext/mods/commons/logging/CLogger
   #92 = NameAndType        #94:#95       // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
   #93 = Utf8               ext/mods/commons/logging/CLogger
   #94 = Utf8               error
   #95 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
   #96 = String             #97           // Loaded {} bookmarks.
   #97 = Utf8               Loaded {} bookmarks.
   #98 = InterfaceMethodref #66.#99       // java/util/List.size:()I
   #99 = NameAndType        #100:#101     // size:()I
  #100 = Utf8               size
  #101 = Utf8               ()I
  #102 = Methodref          #103.#104     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #103 = Class              #105          // java/lang/Integer
  #104 = NameAndType        #106:#107     // valueOf:(I)Ljava/lang/Integer;
  #105 = Utf8               java/lang/Integer
  #106 = Utf8               valueOf
  #107 = Utf8               (I)Ljava/lang/Integer;
  #108 = Methodref          #91.#109      // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #109 = NameAndType        #110:#111     // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #110 = Utf8               info
  #111 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
  #112 = Methodref          #11.#113      // ext/mods/gameserver/data/sql/BookmarkTable.getBookmark:(Ljava/lang/String;I)Lext/mods/gameserver/model/records/Bookmark;
  #113 = NameAndType        #114:#115     // getBookmark:(Ljava/lang/String;I)Lext/mods/gameserver/model/records/Bookmark;
  #114 = Utf8               getBookmark
  #115 = Utf8               (Ljava/lang/String;I)Lext/mods/gameserver/model/records/Bookmark;
  #116 = InterfaceMethodref #66.#117      // java/util/List.iterator:()Ljava/util/Iterator;
  #117 = NameAndType        #118:#119     // iterator:()Ljava/util/Iterator;
  #118 = Utf8               iterator
  #119 = Utf8               ()Ljava/util/Iterator;
  #120 = InterfaceMethodref #121.#122     // java/util/Iterator.hasNext:()Z
  #121 = Class              #123          // java/util/Iterator
  #122 = NameAndType        #124:#41      // hasNext:()Z
  #123 = Utf8               java/util/Iterator
  #124 = Utf8               hasNext
  #125 = InterfaceMethodref #121.#126     // java/util/Iterator.next:()Ljava/lang/Object;
  #126 = NameAndType        #40:#127      // next:()Ljava/lang/Object;
  #127 = Utf8               ()Ljava/lang/Object;
  #128 = Methodref          #42.#129      // ext/mods/gameserver/model/records/Bookmark.name:()Ljava/lang/String;
  #129 = NameAndType        #45:#130      // name:()Ljava/lang/String;
  #130 = Utf8               ()Ljava/lang/String;
  #131 = Methodref          #132.#133     // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
  #132 = Class              #134          // java/lang/String
  #133 = NameAndType        #135:#136     // equalsIgnoreCase:(Ljava/lang/String;)Z
  #134 = Utf8               java/lang/String
  #135 = Utf8               equalsIgnoreCase
  #136 = Utf8               (Ljava/lang/String;)Z
  #137 = Methodref          #42.#138      // ext/mods/gameserver/model/records/Bookmark.id:()I
  #138 = NameAndType        #139:#101     // id:()I
  #139 = Utf8               id
  #140 = InterfaceMethodref #66.#141      // java/util/List.stream:()Ljava/util/stream/Stream;
  #141 = NameAndType        #142:#143     // stream:()Ljava/util/stream/Stream;
  #142 = Utf8               stream
  #143 = Utf8               ()Ljava/util/stream/Stream;
  #144 = InvokeDynamic      #0:#145       // #0:test:(I)Ljava/util/function/Predicate;
  #145 = NameAndType        #146:#147     // test:(I)Ljava/util/function/Predicate;
  #146 = Utf8               test
  #147 = Utf8               (I)Ljava/util/function/Predicate;
  #148 = InterfaceMethodref #149.#150     // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #149 = Class              #151          // java/util/stream/Stream
  #150 = NameAndType        #152:#153     // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #151 = Utf8               java/util/stream/Stream
  #152 = Utf8               filter
  #153 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #154 = InterfaceMethodref #149.#155     // java/util/stream/Stream.toList:()Ljava/util/List;
  #155 = NameAndType        #156:#157     // toList:()Ljava/util/List;
  #156 = Utf8               toList
  #157 = Utf8               ()Ljava/util/List;
  #158 = Methodref          #159.#160     // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #159 = Class              #161          // ext/mods/gameserver/model/actor/Player
  #160 = NameAndType        #162:#101     // getObjectId:()I
  #161 = Utf8               ext/mods/gameserver/model/actor/Player
  #162 = Utf8               getObjectId
  #163 = Methodref          #159.#164     // ext/mods/gameserver/model/actor/Player.getX:()I
  #164 = NameAndType        #165:#101     // getX:()I
  #165 = Utf8               getX
  #166 = Methodref          #159.#167     // ext/mods/gameserver/model/actor/Player.getY:()I
  #167 = NameAndType        #168:#101     // getY:()I
  #168 = Utf8               getY
  #169 = Methodref          #159.#170     // ext/mods/gameserver/model/actor/Player.getZ:()I
  #170 = NameAndType        #171:#101     // getZ:()I
  #171 = Utf8               getZ
  #172 = String             #173          // INSERT INTO bookmarks (name, obj_Id, x, y, z) values (?,?,?,?,?)
  #173 = Utf8               INSERT INTO bookmarks (name, obj_Id, x, y, z) values (?,?,?,?,?)
  #174 = InterfaceMethodref #31.#175      // java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
  #175 = NameAndType        #176:#177     // setString:(ILjava/lang/String;)V
  #176 = Utf8               setString
  #177 = Utf8               (ILjava/lang/String;)V
  #178 = InterfaceMethodref #31.#179      // java/sql/PreparedStatement.setInt:(II)V
  #179 = NameAndType        #180:#181     // setInt:(II)V
  #180 = Utf8               setInt
  #181 = Utf8               (II)V
  #182 = InterfaceMethodref #31.#183      // java/sql/PreparedStatement.execute:()Z
  #183 = NameAndType        #184:#41      // execute:()Z
  #184 = Utf8               execute
  #185 = String             #186          // Couldn\'t save bookmark.
  #186 = Utf8               Couldn\'t save bookmark.
  #187 = InterfaceMethodref #66.#188      // java/util/List.remove:(Ljava/lang/Object;)Z
  #188 = NameAndType        #189:#70      // remove:(Ljava/lang/Object;)Z
  #189 = Utf8               remove
  #190 = String             #191          // DELETE FROM bookmarks WHERE name=? AND obj_Id=?
  #191 = Utf8               DELETE FROM bookmarks WHERE name=? AND obj_Id=?
  #192 = String             #193          // Couldn\'t delete bookmark.
  #193 = Utf8               Couldn\'t delete bookmark.
  #194 = Fieldref           #195.#196     // ext/mods/gameserver/data/sql/BookmarkTable$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/sql/BookmarkTable;
  #195 = Class              #197          // ext/mods/gameserver/data/sql/BookmarkTable$SingletonHolder
  #196 = NameAndType        #198:#199     // INSTANCE:Lext/mods/gameserver/data/sql/BookmarkTable;
  #197 = Utf8               ext/mods/gameserver/data/sql/BookmarkTable$SingletonHolder
  #198 = Utf8               INSTANCE
  #199 = Utf8               Lext/mods/gameserver/data/sql/BookmarkTable;
  #200 = Methodref          #201.#202     // java/lang/Class.getName:()Ljava/lang/String;
  #201 = Class              #203          // java/lang/Class
  #202 = NameAndType        #204:#130     // getName:()Ljava/lang/String;
  #203 = Utf8               java/lang/Class
  #204 = Utf8               getName
  #205 = Methodref          #91.#206      // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #206 = NameAndType        #5:#207       // "<init>":(Ljava/lang/String;)V
  #207 = Utf8               (Ljava/lang/String;)V
  #208 = Utf8               Signature
  #209 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/records/Bookmark;>;
  #210 = Utf8               Code
  #211 = Utf8               LineNumberTable
  #212 = Utf8               LocalVariableTable
  #213 = Utf8               rs
  #214 = Utf8               Ljava/sql/ResultSet;
  #215 = Utf8               ps
  #216 = Utf8               Ljava/sql/PreparedStatement;
  #217 = Utf8               con
  #218 = Utf8               Ljava/sql/Connection;
  #219 = Utf8               e
  #220 = Utf8               Ljava/lang/Exception;
  #221 = Utf8               this
  #222 = Utf8               StackMapTable
  #223 = Utf8               isExisting
  #224 = Utf8               (Ljava/lang/String;I)Z
  #225 = Utf8               Ljava/lang/String;
  #226 = Utf8               objId
  #227 = Utf8               I
  #228 = Utf8               bk
  #229 = Utf8               Lext/mods/gameserver/model/records/Bookmark;
  #230 = Utf8               getBookmarks
  #231 = Utf8               (I)Ljava/util/List;
  #232 = Utf8               (I)Ljava/util/List<Lext/mods/gameserver/model/records/Bookmark;>;
  #233 = Utf8               saveBookmark
  #234 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #235 = Utf8               player
  #236 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #237 = Utf8               deleteBookmark
  #238 = Utf8               (Ljava/lang/String;I)V
  #239 = Utf8               bookmark
  #240 = Utf8               getInstance
  #241 = Utf8               ()Lext/mods/gameserver/data/sql/BookmarkTable;
  #242 = Utf8               lambda$getBookmarks$0
  #243 = Utf8               (ILext/mods/gameserver/model/records/Bookmark;)Z
  #244 = Utf8               <clinit>
  #245 = Utf8               SourceFile
  #246 = Utf8               BookmarkTable.java
  #247 = Utf8               NestMembers
  #248 = Utf8               BootstrapMethods
  #249 = MethodType         #70           //  (Ljava/lang/Object;)Z
  #250 = MethodHandle       6:#251        // REF_invokeStatic ext/mods/gameserver/data/sql/BookmarkTable.lambda$getBookmarks$0:(ILext/mods/gameserver/model/records/Bookmark;)Z
  #251 = Methodref          #11.#252      // ext/mods/gameserver/data/sql/BookmarkTable.lambda$getBookmarks$0:(ILext/mods/gameserver/model/records/Bookmark;)Z
  #252 = NameAndType        #242:#243     // lambda$getBookmarks$0:(ILext/mods/gameserver/model/records/Bookmark;)Z
  #253 = MethodType         #254          //  (Lext/mods/gameserver/model/records/Bookmark;)Z
  #254 = Utf8               (Lext/mods/gameserver/model/records/Bookmark;)Z
  #255 = MethodHandle       6:#256        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #256 = Methodref          #257.#258     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #257 = Class              #259          // java/lang/invoke/LambdaMetafactory
  #258 = NameAndType        #260:#261     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #259 = Utf8               java/lang/invoke/LambdaMetafactory
  #260 = Utf8               metafactory
  #261 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #262 = Utf8               InnerClasses
  #263 = Utf8               SingletonHolder
  #264 = Class              #265          // java/lang/invoke/MethodHandles$Lookup
  #265 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #266 = Class              #267          // java/lang/invoke/MethodHandles
  #267 = Utf8               java/lang/invoke/MethodHandles
  #268 = Utf8               Lookup
{
  protected ext.mods.gameserver.data.sql.BookmarkTable();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=9, locals=6, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/ArrayList
         8: dup
         9: invokespecial #9                  // Method java/util/ArrayList."<init>":()V
        12: putfield      #10                 // Field _bks:Ljava/util/List;
        15: invokestatic  #16                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        18: astore_1
        19: aload_1
        20: ldc           #22                 // String SELECT * FROM bookmarks
        22: invokeinterface #24,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        27: astore_2
        28: aload_2
        29: invokeinterface #30,  1           // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
        34: astore_3
        35: aload_3
        36: invokeinterface #36,  1           // InterfaceMethod java/sql/ResultSet.next:()Z
        41: ifeq          104
        44: aload_0
        45: getfield      #10                 // Field _bks:Ljava/util/List;
        48: new           #42                 // class ext/mods/gameserver/model/records/Bookmark
        51: dup
        52: aload_3
        53: ldc           #44                 // String name
        55: invokeinterface #46,  2           // InterfaceMethod java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
        60: aload_3
        61: ldc           #50                 // String obj_Id
        63: invokeinterface #52,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        68: aload_3
        69: ldc           #56                 // String x
        71: invokeinterface #52,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        76: aload_3
        77: ldc           #58                 // String y
        79: invokeinterface #52,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        84: aload_3
        85: ldc           #60                 // String z
        87: invokeinterface #52,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        92: invokespecial #62                 // Method ext/mods/gameserver/model/records/Bookmark."<init>":(Ljava/lang/String;IIII)V
        95: invokeinterface #65,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       100: pop
       101: goto          35
       104: aload_3
       105: ifnull        144
       108: aload_3
       109: invokeinterface #71,  1           // InterfaceMethod java/sql/ResultSet.close:()V
       114: goto          144
       117: astore        4
       119: aload_3
       120: ifnull        141
       123: aload_3
       124: invokeinterface #71,  1           // InterfaceMethod java/sql/ResultSet.close:()V
       129: goto          141
       132: astore        5
       134: aload         4
       136: aload         5
       138: invokevirtual #76                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       141: aload         4
       143: athrow
       144: aload_2
       145: ifnull        181
       148: aload_2
       149: invokeinterface #80,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       154: goto          181
       157: astore_3
       158: aload_2
       159: ifnull        179
       162: aload_2
       163: invokeinterface #80,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       168: goto          179
       171: astore        4
       173: aload_3
       174: aload         4
       176: invokevirtual #76                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       179: aload_3
       180: athrow
       181: aload_1
       182: ifnull        216
       185: aload_1
       186: invokeinterface #81,  1           // InterfaceMethod java/sql/Connection.close:()V
       191: goto          216
       194: astore_2
       195: aload_1
       196: ifnull        214
       199: aload_1
       200: invokeinterface #81,  1           // InterfaceMethod java/sql/Connection.close:()V
       205: goto          214
       208: astore_3
       209: aload_2
       210: aload_3
       211: invokevirtual #76                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       214: aload_2
       215: athrow
       216: goto          229
       219: astore_1
       220: getstatic     #84                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       223: ldc           #88                 // String Couldn\'t restore bookmarks.
       225: aload_1
       226: invokevirtual #90                 // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       229: getstatic     #84                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       232: ldc           #96                 // String Loaded {} bookmarks.
       234: iconst_1
       235: anewarray     #2                  // class java/lang/Object
       238: dup
       239: iconst_0
       240: aload_0
       241: getfield      #10                 // Field _bks:Ljava/util/List;
       244: invokeinterface #98,  1           // InterfaceMethod java/util/List.size:()I
       249: invokestatic  #102                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       252: aastore
       253: invokevirtual #108                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
       256: return
      Exception table:
         from    to  target type
            35   104   117   Class java/lang/Throwable
           123   129   132   Class java/lang/Throwable
            28   144   157   Class java/lang/Throwable
           162   168   171   Class java/lang/Throwable
            19   181   194   Class java/lang/Throwable
           199   205   208   Class java/lang/Throwable
            15   216   219   Class java/lang/Exception
      LineNumberTable:
        line 43: 0
        line 40: 4
        line 44: 15
        line 45: 19
        line 46: 28
        line 48: 35
        line 49: 44
        line 50: 104
        line 44: 117
        line 50: 144
        line 44: 157
        line 50: 181
        line 44: 194
        line 54: 216
        line 51: 219
        line 53: 220
        line 55: 229
        line 56: 256
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           35     109     3    rs   Ljava/sql/ResultSet;
           28     153     2    ps   Ljava/sql/PreparedStatement;
           19     197     1   con   Ljava/sql/Connection;
          220       9     1     e   Ljava/lang/Exception;
            0     257     0  this   Lext/mods/gameserver/data/sql/BookmarkTable;
      StackMapTable: number_of_entries = 16
        frame_type = 255 /* full_frame */
          offset_delta = 35
          locals = [ class ext/mods/gameserver/data/sql/BookmarkTable, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet ]
          stack = []
        frame_type = 251 /* same_frame_extended */
          offset_delta = 68
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/data/sql/BookmarkTable, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/data/sql/BookmarkTable, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/data/sql/BookmarkTable, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 9 /* same */

  public boolean isExisting(java.lang.String, int);
    descriptor: (Ljava/lang/String;I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: iload_2
         3: invokevirtual #112                // Method getBookmark:(Ljava/lang/String;I)Lext/mods/gameserver/model/records/Bookmark;
         6: ifnull        13
         9: iconst_1
        10: goto          14
        13: iconst_0
        14: ireturn
      LineNumberTable:
        line 66: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/data/sql/BookmarkTable;
            0      15     1  name   Ljava/lang/String;
            0      15     2 objId   I
      StackMapTable: number_of_entries = 2
        frame_type = 13 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public ext.mods.gameserver.model.records.Bookmark getBookmark(java.lang.String, int);
    descriptor: (Ljava/lang/String;I)Lext/mods/gameserver/model/records/Bookmark;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=3
         0: aload_0
         1: getfield      #10                 // Field _bks:Ljava/util/List;
         4: invokeinterface #116,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore_3
        10: aload_3
        11: invokeinterface #120,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          57
        19: aload_3
        20: invokeinterface #125,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #42                 // class ext/mods/gameserver/model/records/Bookmark
        28: astore        4
        30: aload         4
        32: invokevirtual #128                // Method ext/mods/gameserver/model/records/Bookmark.name:()Ljava/lang/String;
        35: aload_1
        36: invokevirtual #131                // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        39: ifeq          54
        42: aload         4
        44: invokevirtual #137                // Method ext/mods/gameserver/model/records/Bookmark.id:()I
        47: iload_2
        48: if_icmpne     54
        51: aload         4
        53: areturn
        54: goto          10
        57: aconst_null
        58: areturn
      LineNumberTable:
        line 77: 0
        line 79: 30
        line 80: 51
        line 81: 54
        line 82: 57
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           30      24     4    bk   Lext/mods/gameserver/model/records/Bookmark;
            0      59     0  this   Lext/mods/gameserver/data/sql/BookmarkTable;
            0      59     1  name   Ljava/lang/String;
            0      59     2 objId   I
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 43 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2

  public java.util.List<ext.mods.gameserver.model.records.Bookmark> getBookmarks(int);
    descriptor: (I)Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _bks:Ljava/util/List;
         4: invokeinterface #140,  1          // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
         9: iload_1
        10: invokedynamic #144,  0            // InvokeDynamic #0:test:(I)Ljava/util/function/Predicate;
        15: invokeinterface #148,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        20: invokeinterface #154,  1          // InterfaceMethod java/util/stream/Stream.toList:()Ljava/util/List;
        25: areturn
      LineNumberTable:
        line 91: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/data/sql/BookmarkTable;
            0      26     1 objId   I
    Signature: #232                         // (I)Ljava/util/List<Lext/mods/gameserver/model/records/Bookmark;>;

  public void saveBookmark(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=11, args_size=3
         0: aload_2
         1: invokevirtual #158                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
         4: istore_3
         5: aload_2
         6: invokevirtual #163                // Method ext/mods/gameserver/model/actor/Player.getX:()I
         9: istore        4
        11: aload_2
        12: invokevirtual #166                // Method ext/mods/gameserver/model/actor/Player.getY:()I
        15: istore        5
        17: aload_2
        18: invokevirtual #169                // Method ext/mods/gameserver/model/actor/Player.getZ:()I
        21: istore        6
        23: aload_0
        24: getfield      #10                 // Field _bks:Ljava/util/List;
        27: new           #42                 // class ext/mods/gameserver/model/records/Bookmark
        30: dup
        31: aload_1
        32: iload_3
        33: iload         4
        35: iload         5
        37: iload         6
        39: invokespecial #62                 // Method ext/mods/gameserver/model/records/Bookmark."<init>":(Ljava/lang/String;IIII)V
        42: invokeinterface #65,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        47: pop
        48: invokestatic  #16                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        51: astore        7
        53: aload         7
        55: ldc           #172                // String INSERT INTO bookmarks (name, obj_Id, x, y, z) values (?,?,?,?,?)
        57: invokeinterface #24,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        62: astore        8
        64: aload         8
        66: iconst_1
        67: aload_1
        68: invokeinterface #174,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
        73: aload         8
        75: iconst_2
        76: iload_3
        77: invokeinterface #178,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        82: aload         8
        84: iconst_3
        85: iload         4
        87: invokeinterface #178,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        92: aload         8
        94: iconst_4
        95: iload         5
        97: invokeinterface #178,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       102: aload         8
       104: iconst_5
       105: iload         6
       107: invokeinterface #178,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       112: aload         8
       114: invokeinterface #182,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
       119: pop
       120: aload         8
       122: ifnull        164
       125: aload         8
       127: invokeinterface #80,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       132: goto          164
       135: astore        9
       137: aload         8
       139: ifnull        161
       142: aload         8
       144: invokeinterface #80,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       149: goto          161
       152: astore        10
       154: aload         9
       156: aload         10
       158: invokevirtual #76                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       161: aload         9
       163: athrow
       164: aload         7
       166: ifnull        208
       169: aload         7
       171: invokeinterface #81,  1           // InterfaceMethod java/sql/Connection.close:()V
       176: goto          208
       179: astore        8
       181: aload         7
       183: ifnull        205
       186: aload         7
       188: invokeinterface #81,  1           // InterfaceMethod java/sql/Connection.close:()V
       193: goto          205
       196: astore        9
       198: aload         8
       200: aload         9
       202: invokevirtual #76                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       205: aload         8
       207: athrow
       208: goto          223
       211: astore        7
       213: getstatic     #84                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       216: ldc           #185                // String Couldn\'t save bookmark.
       218: aload         7
       220: invokevirtual #90                 // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       223: return
      Exception table:
         from    to  target type
            64   120   135   Class java/lang/Throwable
           142   149   152   Class java/lang/Throwable
            53   164   179   Class java/lang/Throwable
           186   193   196   Class java/lang/Throwable
            48   208   211   Class java/lang/Exception
      LineNumberTable:
        line 101: 0
        line 102: 5
        line 103: 11
        line 104: 17
        line 106: 23
        line 108: 48
        line 109: 53
        line 111: 64
        line 112: 73
        line 113: 82
        line 114: 92
        line 115: 102
        line 116: 112
        line 117: 120
        line 108: 135
        line 117: 164
        line 108: 179
        line 121: 208
        line 118: 211
        line 120: 213
        line 122: 223
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           64     100     8    ps   Ljava/sql/PreparedStatement;
           53     155     7   con   Ljava/sql/Connection;
          213      10     7     e   Ljava/lang/Exception;
            0     224     0  this   Lext/mods/gameserver/data/sql/BookmarkTable;
            0     224     1  name   Ljava/lang/String;
            0     224     2 player   Lext/mods/gameserver/model/actor/Player;
            5     219     3 objId   I
           11     213     4     x   I
           17     207     5     y   I
           23     201     6     z   I
      StackMapTable: number_of_entries = 10
        frame_type = 255 /* full_frame */
          offset_delta = 135
          locals = [ class ext/mods/gameserver/data/sql/BookmarkTable, class java/lang/String, class ext/mods/gameserver/model/actor/Player, int, int, int, int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/data/sql/BookmarkTable, class java/lang/String, class ext/mods/gameserver/model/actor/Player, int, int, int, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/data/sql/BookmarkTable, class java/lang/String, class ext/mods/gameserver/model/actor/Player, int, int, int, int, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 11 /* same */

  public void deleteBookmark(java.lang.String, int);
    descriptor: (Ljava/lang/String;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=8, args_size=3
         0: aload_0
         1: aload_1
         2: iload_2
         3: invokevirtual #112                // Method getBookmark:(Ljava/lang/String;I)Lext/mods/gameserver/model/records/Bookmark;
         6: astore_3
         7: aload_3
         8: ifnull        167
        11: aload_0
        12: getfield      #10                 // Field _bks:Ljava/util/List;
        15: aload_3
        16: invokeinterface #187,  2          // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
        21: pop
        22: invokestatic  #16                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        25: astore        4
        27: aload         4
        29: ldc           #190                // String DELETE FROM bookmarks WHERE name=? AND obj_Id=?
        31: invokeinterface #24,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        36: astore        5
        38: aload         5
        40: iconst_1
        41: aload_1
        42: invokeinterface #174,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
        47: aload         5
        49: iconst_2
        50: iload_2
        51: invokeinterface #178,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        56: aload         5
        58: invokeinterface #182,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
        63: pop
        64: aload         5
        66: ifnull        108
        69: aload         5
        71: invokeinterface #80,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
        76: goto          108
        79: astore        6
        81: aload         5
        83: ifnull        105
        86: aload         5
        88: invokeinterface #80,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
        93: goto          105
        96: astore        7
        98: aload         6
       100: aload         7
       102: invokevirtual #76                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       105: aload         6
       107: athrow
       108: aload         4
       110: ifnull        152
       113: aload         4
       115: invokeinterface #81,  1           // InterfaceMethod java/sql/Connection.close:()V
       120: goto          152
       123: astore        5
       125: aload         4
       127: ifnull        149
       130: aload         4
       132: invokeinterface #81,  1           // InterfaceMethod java/sql/Connection.close:()V
       137: goto          149
       140: astore        6
       142: aload         5
       144: aload         6
       146: invokevirtual #76                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       149: aload         5
       151: athrow
       152: goto          167
       155: astore        4
       157: getstatic     #84                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       160: ldc           #192                // String Couldn\'t delete bookmark.
       162: aload         4
       164: invokevirtual #90                 // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       167: return
      Exception table:
         from    to  target type
            38    64    79   Class java/lang/Throwable
            86    93    96   Class java/lang/Throwable
            27   108   123   Class java/lang/Throwable
           130   137   140   Class java/lang/Throwable
            22   152   155   Class java/lang/Exception
      LineNumberTable:
        line 131: 0
        line 132: 7
        line 134: 11
        line 136: 22
        line 137: 27
        line 139: 38
        line 140: 47
        line 141: 56
        line 142: 64
        line 136: 79
        line 142: 108
        line 136: 123
        line 146: 152
        line 143: 155
        line 145: 157
        line 148: 167
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           38      70     5    ps   Ljava/sql/PreparedStatement;
           27     125     4   con   Ljava/sql/Connection;
          157      10     4     e   Ljava/lang/Exception;
            0     168     0  this   Lext/mods/gameserver/data/sql/BookmarkTable;
            0     168     1  name   Ljava/lang/String;
            0     168     2 objId   I
            7     161     3 bookmark   Lext/mods/gameserver/model/records/Bookmark;
      StackMapTable: number_of_entries = 10
        frame_type = 255 /* full_frame */
          offset_delta = 79
          locals = [ class ext/mods/gameserver/data/sql/BookmarkTable, class java/lang/String, int, class ext/mods/gameserver/model/records/Bookmark, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/data/sql/BookmarkTable, class java/lang/String, int, class ext/mods/gameserver/model/records/Bookmark, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/data/sql/BookmarkTable, class java/lang/String, int, class ext/mods/gameserver/model/records/Bookmark, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 11 /* same */

  public static ext.mods.gameserver.data.sql.BookmarkTable getInstance();
    descriptor: ()Lext/mods/gameserver/data/sql/BookmarkTable;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #194                // Field ext/mods/gameserver/data/sql/BookmarkTable$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/sql/BookmarkTable;
         3: areturn
      LineNumberTable:
        line 152: 0

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #91                 // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #11                 // class ext/mods/gameserver/data/sql/BookmarkTable
         6: invokevirtual #200                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #205                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #84                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 38: 0
}
SourceFile: "BookmarkTable.java"
NestMembers:
  ext/mods/gameserver/data/sql/BookmarkTable$SingletonHolder
BootstrapMethods:
  0: #255 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #249 (Ljava/lang/Object;)Z
      #250 REF_invokeStatic ext/mods/gameserver/data/sql/BookmarkTable.lambda$getBookmarks$0:(ILext/mods/gameserver/model/records/Bookmark;)Z
      #253 (Lext/mods/gameserver/model/records/Bookmark;)Z
InnerClasses:
  public static final #268= #264 of #266; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
