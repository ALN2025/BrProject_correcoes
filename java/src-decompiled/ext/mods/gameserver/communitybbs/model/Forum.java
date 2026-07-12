// Bytecode for: ext.mods.gameserver.communitybbs.model.Forum
// File: ext\mods\gameserver\communitybbs\model\Forum.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/communitybbs/model/Forum.class
  Last modified 9 de jul de 2026; size 5925 bytes
  MD5 checksum 78ee5fee0b3313ffd120409986a2344b
  Compiled from "Forum.java"
public class ext.mods.gameserver.communitybbs.model.Forum
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/communitybbs/model/Forum
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 8, methods: 16, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/concurrent/ConcurrentHashMap
    #8 = Utf8               java/util/concurrent/ConcurrentHashMap
    #9 = Methodref          #7.#3         // java/util/concurrent/ConcurrentHashMap."<init>":()V
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/communitybbs/model/Forum._topics:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/gameserver/communitybbs/model/Forum
   #12 = NameAndType        #14:#15       // _topics:Ljava/util/Map;
   #13 = Utf8               ext/mods/gameserver/communitybbs/model/Forum
   #14 = Utf8               _topics
   #15 = Utf8               Ljava/util/Map;
   #16 = Fieldref           #11.#17       // ext/mods/gameserver/communitybbs/model/Forum._lastTopicId:I
   #17 = NameAndType        #18:#19       // _lastTopicId:I
   #18 = Utf8               _lastTopicId
   #19 = Utf8               I
   #20 = Methodref          #21.#22       // ext/mods/gameserver/communitybbs/CommunityBoard.getInstance:()Lext/mods/gameserver/communitybbs/CommunityBoard;
   #21 = Class              #23           // ext/mods/gameserver/communitybbs/CommunityBoard
   #22 = NameAndType        #24:#25       // getInstance:()Lext/mods/gameserver/communitybbs/CommunityBoard;
   #23 = Utf8               ext/mods/gameserver/communitybbs/CommunityBoard
   #24 = Utf8               getInstance
   #25 = Utf8               ()Lext/mods/gameserver/communitybbs/CommunityBoard;
   #26 = Methodref          #21.#27       // ext/mods/gameserver/communitybbs/CommunityBoard.getANewForumId:()I
   #27 = NameAndType        #28:#29       // getANewForumId:()I
   #28 = Utf8               getANewForumId
   #29 = Utf8               ()I
   #30 = Fieldref           #11.#31       // ext/mods/gameserver/communitybbs/model/Forum._id:I
   #31 = NameAndType        #32:#19       // _id:I
   #32 = Utf8               _id
   #33 = Fieldref           #11.#34       // ext/mods/gameserver/communitybbs/model/Forum._type:Lext/mods/gameserver/enums/bbs/ForumType;
   #34 = NameAndType        #35:#36       // _type:Lext/mods/gameserver/enums/bbs/ForumType;
   #35 = Utf8               _type
   #36 = Utf8               Lext/mods/gameserver/enums/bbs/ForumType;
   #37 = Fieldref           #11.#38       // ext/mods/gameserver/communitybbs/model/Forum._access:Lext/mods/gameserver/enums/bbs/ForumAccess;
   #38 = NameAndType        #39:#40       // _access:Lext/mods/gameserver/enums/bbs/ForumAccess;
   #39 = Utf8               _access
   #40 = Utf8               Lext/mods/gameserver/enums/bbs/ForumAccess;
   #41 = Fieldref           #11.#42       // ext/mods/gameserver/communitybbs/model/Forum._ownerId:I
   #42 = NameAndType        #43:#19       // _ownerId:I
   #43 = Utf8               _ownerId
   #44 = String             #45           // id
   #45 = Utf8               id
   #46 = InterfaceMethodref #47.#48       // java/sql/ResultSet.getInt:(Ljava/lang/String;)I
   #47 = Class              #49           // java/sql/ResultSet
   #48 = NameAndType        #50:#51       // getInt:(Ljava/lang/String;)I
   #49 = Utf8               java/sql/ResultSet
   #50 = Utf8               getInt
   #51 = Utf8               (Ljava/lang/String;)I
   #52 = Class              #53           // ext/mods/gameserver/enums/bbs/ForumType
   #53 = Utf8               ext/mods/gameserver/enums/bbs/ForumType
   #54 = String             #55           // type
   #55 = Utf8               type
   #56 = InterfaceMethodref #47.#57       // java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
   #57 = NameAndType        #58:#59       // getString:(Ljava/lang/String;)Ljava/lang/String;
   #58 = Utf8               getString
   #59 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #60 = Methodref          #61.#62       // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #61 = Class              #63           // java/lang/Enum
   #62 = NameAndType        #64:#65       // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #63 = Utf8               java/lang/Enum
   #64 = Utf8               valueOf
   #65 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #66 = Class              #67           // ext/mods/gameserver/enums/bbs/ForumAccess
   #67 = Utf8               ext/mods/gameserver/enums/bbs/ForumAccess
   #68 = String             #69           // access
   #69 = Utf8               access
   #70 = String             #71           // owner_id
   #71 = Utf8               owner_id
   #72 = InterfaceMethodref #73.#74       // java/util/Map.size:()I
   #73 = Class              #75           // java/util/Map
   #74 = NameAndType        #76:#29       // size:()I
   #75 = Utf8               java/util/Map
   #76 = Utf8               size
   #77 = Methodref          #78.#79       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #78 = Class              #80           // java/lang/Integer
   #79 = NameAndType        #64:#81       // valueOf:(I)Ljava/lang/Integer;
   #80 = Utf8               java/lang/Integer
   #81 = Utf8               (I)Ljava/lang/Integer;
   #82 = InterfaceMethodref #73.#83       // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #83 = NameAndType        #84:#85       // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #84 = Utf8               get
   #85 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #86 = Class              #87           // ext/mods/gameserver/communitybbs/model/Topic
   #87 = Utf8               ext/mods/gameserver/communitybbs/model/Topic
   #88 = InterfaceMethodref #73.#89       // java/util/Map.values:()Ljava/util/Collection;
   #89 = NameAndType        #90:#91       // values:()Ljava/util/Collection;
   #90 = Utf8               values
   #91 = Utf8               ()Ljava/util/Collection;
   #92 = InterfaceMethodref #93.#94       // java/util/Collection.stream:()Ljava/util/stream/Stream;
   #93 = Class              #95           // java/util/Collection
   #94 = NameAndType        #96:#97       // stream:()Ljava/util/stream/Stream;
   #95 = Utf8               java/util/Collection
   #96 = Utf8               stream
   #97 = Utf8               ()Ljava/util/stream/Stream;
   #98 = InvokeDynamic      #0:#99        // #0:test:(I)Ljava/util/function/Predicate;
   #99 = NameAndType        #100:#101     // test:(I)Ljava/util/function/Predicate;
  #100 = Utf8               test
  #101 = Utf8               (I)Ljava/util/function/Predicate;
  #102 = InterfaceMethodref #103.#104     // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #103 = Class              #105          // java/util/stream/Stream
  #104 = NameAndType        #106:#107     // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #105 = Utf8               java/util/stream/Stream
  #106 = Utf8               filter
  #107 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #108 = InterfaceMethodref #103.#109     // java/util/stream/Stream.findFirst:()Ljava/util/Optional;
  #109 = NameAndType        #110:#111     // findFirst:()Ljava/util/Optional;
  #110 = Utf8               findFirst
  #111 = Utf8               ()Ljava/util/Optional;
  #112 = Methodref          #113.#114     // java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
  #113 = Class              #115          // java/util/Optional
  #114 = NameAndType        #116:#85      // orElse:(Ljava/lang/Object;)Ljava/lang/Object;
  #115 = Utf8               java/util/Optional
  #116 = Utf8               orElse
  #117 = Methodref          #86.#118      // ext/mods/gameserver/communitybbs/model/Topic.getId:()I
  #118 = NameAndType        #119:#29      // getId:()I
  #119 = Utf8               getId
  #120 = InterfaceMethodref #73.#121      // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #121 = NameAndType        #122:#123     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #122 = Utf8               put
  #123 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #124 = Methodref          #11.#125      // ext/mods/gameserver/communitybbs/model/Forum.getCurrentTopicId:()I
  #125 = NameAndType        #126:#29      // getCurrentTopicId:()I
  #126 = Utf8               getCurrentTopicId
  #127 = InterfaceMethodref #73.#128      // java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #128 = NameAndType        #129:#85      // remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #129 = Utf8               remove
  #130 = Methodref          #131.#132     // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
  #131 = Class              #133          // ext/mods/commons/pool/ConnectionPool
  #132 = NameAndType        #134:#135     // getConnection:()Ljava/sql/Connection;
  #133 = Utf8               ext/mods/commons/pool/ConnectionPool
  #134 = Utf8               getConnection
  #135 = Utf8               ()Ljava/sql/Connection;
  #136 = String             #137          // INSERT INTO bbs_forum (id,type,access,owner_id) VALUES (?,?,?,?)
  #137 = Utf8               INSERT INTO bbs_forum (id,type,access,owner_id) VALUES (?,?,?,?)
  #138 = InterfaceMethodref #139.#140     // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #139 = Class              #141          // java/sql/Connection
  #140 = NameAndType        #142:#143     // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #141 = Utf8               java/sql/Connection
  #142 = Utf8               prepareStatement
  #143 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #144 = InterfaceMethodref #145.#146     // java/sql/PreparedStatement.setInt:(II)V
  #145 = Class              #147          // java/sql/PreparedStatement
  #146 = NameAndType        #148:#149     // setInt:(II)V
  #147 = Utf8               java/sql/PreparedStatement
  #148 = Utf8               setInt
  #149 = Utf8               (II)V
  #150 = Methodref          #52.#151      // ext/mods/gameserver/enums/bbs/ForumType.toString:()Ljava/lang/String;
  #151 = NameAndType        #152:#153     // toString:()Ljava/lang/String;
  #152 = Utf8               toString
  #153 = Utf8               ()Ljava/lang/String;
  #154 = InterfaceMethodref #145.#155     // java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
  #155 = NameAndType        #156:#157     // setString:(ILjava/lang/String;)V
  #156 = Utf8               setString
  #157 = Utf8               (ILjava/lang/String;)V
  #158 = Methodref          #66.#151      // ext/mods/gameserver/enums/bbs/ForumAccess.toString:()Ljava/lang/String;
  #159 = InterfaceMethodref #145.#160     // java/sql/PreparedStatement.execute:()Z
  #160 = NameAndType        #161:#162     // execute:()Z
  #161 = Utf8               execute
  #162 = Utf8               ()Z
  #163 = InterfaceMethodref #145.#164     // java/sql/PreparedStatement.close:()V
  #164 = NameAndType        #165:#6       // close:()V
  #165 = Utf8               close
  #166 = Class              #167          // java/lang/Throwable
  #167 = Utf8               java/lang/Throwable
  #168 = Methodref          #166.#169     // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
  #169 = NameAndType        #170:#171     // addSuppressed:(Ljava/lang/Throwable;)V
  #170 = Utf8               addSuppressed
  #171 = Utf8               (Ljava/lang/Throwable;)V
  #172 = InterfaceMethodref #139.#164     // java/sql/Connection.close:()V
  #173 = Class              #174          // java/lang/Exception
  #174 = Utf8               java/lang/Exception
  #175 = Fieldref           #11.#176      // ext/mods/gameserver/communitybbs/model/Forum.LOGGER:Lext/mods/commons/logging/CLogger;
  #176 = NameAndType        #177:#178     // LOGGER:Lext/mods/commons/logging/CLogger;
  #177 = Utf8               LOGGER
  #178 = Utf8               Lext/mods/commons/logging/CLogger;
  #179 = String             #180          // Couldn\'t save new Forum.
  #180 = Utf8               Couldn\'t save new Forum.
  #181 = Methodref          #182.#183     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #182 = Class              #184          // ext/mods/commons/logging/CLogger
  #183 = NameAndType        #185:#186     // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #184 = Utf8               ext/mods/commons/logging/CLogger
  #185 = Utf8               error
  #186 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
  #187 = Methodref          #188.#189     // java/lang/Class.getName:()Ljava/lang/String;
  #188 = Class              #190          // java/lang/Class
  #189 = NameAndType        #191:#153     // getName:()Ljava/lang/String;
  #190 = Utf8               java/lang/Class
  #191 = Utf8               getName
  #192 = Methodref          #182.#193     // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #193 = NameAndType        #5:#194       // "<init>":(Ljava/lang/String;)V
  #194 = Utf8               (Ljava/lang/String;)V
  #195 = Utf8               ADD_FORUM
  #196 = Utf8               Ljava/lang/String;
  #197 = Utf8               ConstantValue
  #198 = Utf8               Signature
  #199 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/communitybbs/model/Topic;>;
  #200 = Utf8               (Lext/mods/gameserver/enums/bbs/ForumType;Lext/mods/gameserver/enums/bbs/ForumAccess;I)V
  #201 = Utf8               Code
  #202 = Utf8               LineNumberTable
  #203 = Utf8               LocalVariableTable
  #204 = Utf8               this
  #205 = Utf8               Lext/mods/gameserver/communitybbs/model/Forum;
  #206 = Utf8               ownerId
  #207 = Utf8               (Ljava/sql/ResultSet;)V
  #208 = Utf8               rs
  #209 = Utf8               Ljava/sql/ResultSet;
  #210 = Utf8               Exceptions
  #211 = Class              #212          // java/sql/SQLException
  #212 = Utf8               java/sql/SQLException
  #213 = Utf8               getTopicSize
  #214 = Utf8               getTopic
  #215 = Utf8               (I)Lext/mods/gameserver/communitybbs/model/Topic;
  #216 = Utf8               getTopicById
  #217 = Utf8               forumId
  #218 = Utf8               addTopic
  #219 = Utf8               (Lext/mods/gameserver/communitybbs/model/Topic;)V
  #220 = Utf8               topic
  #221 = Utf8               Lext/mods/gameserver/communitybbs/model/Topic;
  #222 = Utf8               StackMapTable
  #223 = Utf8               getOwnerId
  #224 = Utf8               getType
  #225 = Utf8               ()Lext/mods/gameserver/enums/bbs/ForumType;
  #226 = Utf8               getAccess
  #227 = Utf8               ()Lext/mods/gameserver/enums/bbs/ForumAccess;
  #228 = Utf8               removeTopic
  #229 = Utf8               (I)V
  #230 = Utf8               insertIntoDb
  #231 = Utf8               ps
  #232 = Utf8               Ljava/sql/PreparedStatement;
  #233 = Utf8               con
  #234 = Utf8               Ljava/sql/Connection;
  #235 = Utf8               e
  #236 = Utf8               Ljava/lang/Exception;
  #237 = Utf8               getANewTopicId
  #238 = Utf8               lambda$getTopicById$0
  #239 = Utf8               (ILext/mods/gameserver/communitybbs/model/Topic;)Z
  #240 = Utf8               t
  #241 = Utf8               <clinit>
  #242 = Utf8               SourceFile
  #243 = Utf8               Forum.java
  #244 = Utf8               BootstrapMethods
  #245 = MethodType         #246          //  (Ljava/lang/Object;)Z
  #246 = Utf8               (Ljava/lang/Object;)Z
  #247 = MethodHandle       6:#248        // REF_invokeStatic ext/mods/gameserver/communitybbs/model/Forum.lambda$getTopicById$0:(ILext/mods/gameserver/communitybbs/model/Topic;)Z
  #248 = Methodref          #11.#249      // ext/mods/gameserver/communitybbs/model/Forum.lambda$getTopicById$0:(ILext/mods/gameserver/communitybbs/model/Topic;)Z
  #249 = NameAndType        #238:#239     // lambda$getTopicById$0:(ILext/mods/gameserver/communitybbs/model/Topic;)Z
  #250 = MethodType         #251          //  (Lext/mods/gameserver/communitybbs/model/Topic;)Z
  #251 = Utf8               (Lext/mods/gameserver/communitybbs/model/Topic;)Z
  #252 = MethodHandle       6:#253        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #253 = Methodref          #254.#255     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #254 = Class              #256          // java/lang/invoke/LambdaMetafactory
  #255 = NameAndType        #257:#258     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #256 = Utf8               java/lang/invoke/LambdaMetafactory
  #257 = Utf8               metafactory
  #258 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #259 = Utf8               InnerClasses
  #260 = Class              #261          // java/lang/invoke/MethodHandles$Lookup
  #261 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #262 = Class              #263          // java/lang/invoke/MethodHandles
  #263 = Utf8               java/lang/invoke/MethodHandles
  #264 = Utf8               Lookup
{
  public ext.mods.gameserver.communitybbs.model.Forum(ext.mods.gameserver.enums.bbs.ForumType, ext.mods.gameserver.enums.bbs.ForumAccess, int);
    descriptor: (Lext/mods/gameserver/enums/bbs/ForumType;Lext/mods/gameserver/enums/bbs/ForumAccess;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=4
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/concurrent/ConcurrentHashMap
         8: dup
         9: invokespecial #9                  // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        12: putfield      #10                 // Field _topics:Ljava/util/Map;
        15: aload_0
        16: iconst_0
        17: putfield      #16                 // Field _lastTopicId:I
        20: aload_0
        21: invokestatic  #20                 // Method ext/mods/gameserver/communitybbs/CommunityBoard.getInstance:()Lext/mods/gameserver/communitybbs/CommunityBoard;
        24: invokevirtual #26                 // Method ext/mods/gameserver/communitybbs/CommunityBoard.getANewForumId:()I
        27: putfield      #30                 // Field _id:I
        30: aload_0
        31: aload_1
        32: putfield      #33                 // Field _type:Lext/mods/gameserver/enums/bbs/ForumType;
        35: aload_0
        36: aload_2
        37: putfield      #37                 // Field _access:Lext/mods/gameserver/enums/bbs/ForumAccess;
        40: aload_0
        41: iload_3
        42: putfield      #41                 // Field _ownerId:I
        45: return
      LineNumberTable:
        line 50: 0
        line 40: 4
        line 47: 15
        line 51: 20
        line 52: 30
        line 53: 35
        line 54: 40
        line 55: 45
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      46     0  this   Lext/mods/gameserver/communitybbs/model/Forum;
            0      46     1  type   Lext/mods/gameserver/enums/bbs/ForumType;
            0      46     2 access   Lext/mods/gameserver/enums/bbs/ForumAccess;
            0      46     3 ownerId   I

  public ext.mods.gameserver.communitybbs.model.Forum(java.sql.ResultSet) throws java.sql.SQLException;
    descriptor: (Ljava/sql/ResultSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/concurrent/ConcurrentHashMap
         8: dup
         9: invokespecial #9                  // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        12: putfield      #10                 // Field _topics:Ljava/util/Map;
        15: aload_0
        16: iconst_0
        17: putfield      #16                 // Field _lastTopicId:I
        20: aload_0
        21: aload_1
        22: ldc           #44                 // String id
        24: invokeinterface #46,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        29: putfield      #30                 // Field _id:I
        32: aload_0
        33: ldc           #52                 // class ext/mods/gameserver/enums/bbs/ForumType
        35: aload_1
        36: ldc           #54                 // String type
        38: invokeinterface #56,  2           // InterfaceMethod java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
        43: invokestatic  #60                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
        46: checkcast     #52                 // class ext/mods/gameserver/enums/bbs/ForumType
        49: putfield      #33                 // Field _type:Lext/mods/gameserver/enums/bbs/ForumType;
        52: aload_0
        53: ldc           #66                 // class ext/mods/gameserver/enums/bbs/ForumAccess
        55: aload_1
        56: ldc           #68                 // String access
        58: invokeinterface #56,  2           // InterfaceMethod java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
        63: invokestatic  #60                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
        66: checkcast     #66                 // class ext/mods/gameserver/enums/bbs/ForumAccess
        69: putfield      #37                 // Field _access:Lext/mods/gameserver/enums/bbs/ForumAccess;
        72: aload_0
        73: aload_1
        74: ldc           #70                 // String owner_id
        76: invokeinterface #46,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        81: putfield      #41                 // Field _ownerId:I
        84: return
      LineNumberTable:
        line 58: 0
        line 40: 4
        line 47: 15
        line 59: 20
        line 60: 32
        line 61: 52
        line 62: 72
        line 63: 84
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      85     0  this   Lext/mods/gameserver/communitybbs/model/Forum;
            0      85     1    rs   Ljava/sql/ResultSet;
    Exceptions:
      throws java.sql.SQLException

  public int getTopicSize();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _topics:Ljava/util/Map;
         4: invokeinterface #72,  1           // InterfaceMethod java/util/Map.size:()I
         9: ireturn
      LineNumberTable:
        line 67: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/communitybbs/model/Forum;

  public ext.mods.gameserver.communitybbs.model.Topic getTopic(int);
    descriptor: (I)Lext/mods/gameserver/communitybbs/model/Topic;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _topics:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #77                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #82,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #86                 // class ext/mods/gameserver/communitybbs/model/Topic
        16: areturn
      LineNumberTable:
        line 72: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/communitybbs/model/Forum;
            0      17     1    id   I

  public ext.mods.gameserver.communitybbs.model.Topic getTopicById(int);
    descriptor: (I)Lext/mods/gameserver/communitybbs/model/Topic;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _topics:Ljava/util/Map;
         4: invokeinterface #88,  1           // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: invokeinterface #92,  1           // InterfaceMethod java/util/Collection.stream:()Ljava/util/stream/Stream;
        14: iload_1
        15: invokedynamic #98,  0             // InvokeDynamic #0:test:(I)Ljava/util/function/Predicate;
        20: invokeinterface #102,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        25: invokeinterface #108,  1          // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
        30: aconst_null
        31: invokevirtual #112                // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        34: checkcast     #86                 // class ext/mods/gameserver/communitybbs/model/Topic
        37: areturn
      LineNumberTable:
        line 77: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      38     0  this   Lext/mods/gameserver/communitybbs/model/Forum;
            0      38     1 forumId   I

  public void addTopic(ext.mods.gameserver.communitybbs.model.Topic);
    descriptor: (Lext/mods/gameserver/communitybbs/model/Topic;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _topics:Ljava/util/Map;
         4: aload_1
         5: invokevirtual #117                // Method ext/mods/gameserver/communitybbs/model/Topic.getId:()I
         8: invokestatic  #77                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        11: aload_1
        12: invokeinterface #120,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        17: pop
        18: aload_1
        19: invokevirtual #117                // Method ext/mods/gameserver/communitybbs/model/Topic.getId:()I
        22: aload_0
        23: invokevirtual #124                // Method getCurrentTopicId:()I
        26: if_icmple     37
        29: aload_0
        30: aload_1
        31: invokevirtual #117                // Method ext/mods/gameserver/communitybbs/model/Topic.getId:()I
        34: putfield      #16                 // Field _lastTopicId:I
        37: return
      LineNumberTable:
        line 82: 0
        line 84: 18
        line 85: 29
        line 86: 37
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      38     0  this   Lext/mods/gameserver/communitybbs/model/Forum;
            0      38     1 topic   Lext/mods/gameserver/communitybbs/model/Topic;
      StackMapTable: number_of_entries = 1
        frame_type = 37 /* same */

  public int getId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #30                 // Field _id:I
         4: ireturn
      LineNumberTable:
        line 90: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/communitybbs/model/Forum;

  public int getOwnerId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #41                 // Field _ownerId:I
         4: ireturn
      LineNumberTable:
        line 95: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/communitybbs/model/Forum;

  public ext.mods.gameserver.enums.bbs.ForumType getType();
    descriptor: ()Lext/mods/gameserver/enums/bbs/ForumType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #33                 // Field _type:Lext/mods/gameserver/enums/bbs/ForumType;
         4: areturn
      LineNumberTable:
        line 100: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/communitybbs/model/Forum;

  public ext.mods.gameserver.enums.bbs.ForumAccess getAccess();
    descriptor: ()Lext/mods/gameserver/enums/bbs/ForumAccess;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #37                 // Field _access:Lext/mods/gameserver/enums/bbs/ForumAccess;
         4: areturn
      LineNumberTable:
        line 105: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/communitybbs/model/Forum;

  public void removeTopic(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _topics:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #77                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #127,  2          // InterfaceMethod java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        13: pop
        14: return
      LineNumberTable:
        line 110: 0
        line 111: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/communitybbs/model/Forum;
            0      15     1    id   I

  public void insertIntoDb();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=1
         0: invokestatic  #130                // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         3: astore_1
         4: aload_1
         5: ldc           #136                // String INSERT INTO bbs_forum (id,type,access,owner_id) VALUES (?,?,?,?)
         7: invokeinterface #138,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        12: astore_2
        13: aload_2
        14: iconst_1
        15: aload_0
        16: getfield      #30                 // Field _id:I
        19: invokeinterface #144,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        24: aload_2
        25: iconst_2
        26: aload_0
        27: getfield      #33                 // Field _type:Lext/mods/gameserver/enums/bbs/ForumType;
        30: invokevirtual #150                // Method ext/mods/gameserver/enums/bbs/ForumType.toString:()Ljava/lang/String;
        33: invokeinterface #154,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
        38: aload_2
        39: iconst_3
        40: aload_0
        41: getfield      #37                 // Field _access:Lext/mods/gameserver/enums/bbs/ForumAccess;
        44: invokevirtual #158                // Method ext/mods/gameserver/enums/bbs/ForumAccess.toString:()Ljava/lang/String;
        47: invokeinterface #154,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
        52: aload_2
        53: iconst_4
        54: aload_0
        55: getfield      #41                 // Field _ownerId:I
        58: invokeinterface #144,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        63: aload_2
        64: invokeinterface #159,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
        69: pop
        70: aload_2
        71: ifnull        107
        74: aload_2
        75: invokeinterface #163,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        80: goto          107
        83: astore_3
        84: aload_2
        85: ifnull        105
        88: aload_2
        89: invokeinterface #163,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        94: goto          105
        97: astore        4
        99: aload_3
       100: aload         4
       102: invokevirtual #168                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       105: aload_3
       106: athrow
       107: aload_1
       108: ifnull        142
       111: aload_1
       112: invokeinterface #172,  1          // InterfaceMethod java/sql/Connection.close:()V
       117: goto          142
       120: astore_2
       121: aload_1
       122: ifnull        140
       125: aload_1
       126: invokeinterface #172,  1          // InterfaceMethod java/sql/Connection.close:()V
       131: goto          140
       134: astore_3
       135: aload_2
       136: aload_3
       137: invokevirtual #168                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       140: aload_2
       141: athrow
       142: goto          155
       145: astore_1
       146: getstatic     #175                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       149: ldc           #179                // String Couldn\'t save new Forum.
       151: aload_1
       152: invokevirtual #181                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       155: return
      Exception table:
         from    to  target type
            13    70    83   Class java/lang/Throwable
            88    94    97   Class java/lang/Throwable
             4   107   120   Class java/lang/Throwable
           125   131   134   Class java/lang/Throwable
             0   142   145   Class java/lang/Exception
      LineNumberTable:
        line 115: 0
        line 116: 4
        line 118: 13
        line 119: 24
        line 120: 38
        line 121: 52
        line 122: 63
        line 123: 70
        line 115: 83
        line 123: 107
        line 115: 120
        line 127: 142
        line 124: 145
        line 126: 146
        line 128: 155
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           13      94     2    ps   Ljava/sql/PreparedStatement;
            4     138     1   con   Ljava/sql/Connection;
          146       9     1     e   Ljava/lang/Exception;
            0     156     0  this   Lext/mods/gameserver/communitybbs/model/Forum;
      StackMapTable: number_of_entries = 10
        frame_type = 255 /* full_frame */
          offset_delta = 83
          locals = [ class ext/mods/gameserver/communitybbs/model/Forum, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/communitybbs/model/Forum, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/communitybbs/model/Forum, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 9 /* same */

  public synchronized int getANewTopicId();
    descriptor: ()I
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: dup
         2: getfield      #16                 // Field _lastTopicId:I
         5: iconst_1
         6: iadd
         7: dup_x1
         8: putfield      #16                 // Field _lastTopicId:I
        11: ireturn
      LineNumberTable:
        line 132: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/communitybbs/model/Forum;

  public synchronized int getCurrentTopicId();
    descriptor: ()I
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field _lastTopicId:I
         4: ireturn
      LineNumberTable:
        line 137: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/communitybbs/model/Forum;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #182                // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #11                 // class ext/mods/gameserver/communitybbs/model/Forum
         6: invokevirtual #187                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #192                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #175                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 36: 0
}
SourceFile: "Forum.java"
BootstrapMethods:
  0: #252 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #245 (Ljava/lang/Object;)Z
      #247 REF_invokeStatic ext/mods/gameserver/communitybbs/model/Forum.lambda$getTopicById$0:(ILext/mods/gameserver/communitybbs/model/Topic;)Z
      #250 (Lext/mods/gameserver/communitybbs/model/Topic;)Z
InnerClasses:
  public static final #264= #260 of #262; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
