// Bytecode for: ext.mods.gameserver.communitybbs.model.Topic
// File: ext\mods\gameserver\communitybbs\model\Topic.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/communitybbs/model/Topic.class
  Last modified 9 de jul de 2026; size 6522 bytes
  MD5 checksum 631e10c4088a08af4492b13d05957c7b
  Compiled from "Topic.java"
public class ext.mods.gameserver.communitybbs.model.Topic
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/communitybbs/model/Topic
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 12, methods: 12, attributes: 3
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
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/communitybbs/model/Topic._posts:Ljava/util/List;
   #11 = Class              #13           // ext/mods/gameserver/communitybbs/model/Topic
   #12 = NameAndType        #14:#15       // _posts:Ljava/util/List;
   #13 = Utf8               ext/mods/gameserver/communitybbs/model/Topic
   #14 = Utf8               _posts
   #15 = Utf8               Ljava/util/List;
   #16 = Methodref          #17.#18       // java/lang/System.currentTimeMillis:()J
   #17 = Class              #19           // java/lang/System
   #18 = NameAndType        #20:#21       // currentTimeMillis:()J
   #19 = Utf8               java/lang/System
   #20 = Utf8               currentTimeMillis
   #21 = Utf8               ()J
   #22 = Methodref          #23.#24       // ext/mods/gameserver/communitybbs/model/Forum.getANewTopicId:()I
   #23 = Class              #25           // ext/mods/gameserver/communitybbs/model/Forum
   #24 = NameAndType        #26:#27       // getANewTopicId:()I
   #25 = Utf8               ext/mods/gameserver/communitybbs/model/Forum
   #26 = Utf8               getANewTopicId
   #27 = Utf8               ()I
   #28 = Fieldref           #11.#29       // ext/mods/gameserver/communitybbs/model/Topic._id:I
   #29 = NameAndType        #30:#31       // _id:I
   #30 = Utf8               _id
   #31 = Utf8               I
   #32 = Methodref          #23.#33       // ext/mods/gameserver/communitybbs/model/Forum.getId:()I
   #33 = NameAndType        #34:#27       // getId:()I
   #34 = Utf8               getId
   #35 = Fieldref           #11.#36       // ext/mods/gameserver/communitybbs/model/Topic._forumId:I
   #36 = NameAndType        #37:#31       // _forumId:I
   #37 = Utf8               _forumId
   #38 = Fieldref           #11.#39       // ext/mods/gameserver/communitybbs/model/Topic._name:Ljava/lang/String;
   #39 = NameAndType        #40:#41       // _name:Ljava/lang/String;
   #40 = Utf8               _name
   #41 = Utf8               Ljava/lang/String;
   #42 = Fieldref           #11.#43       // ext/mods/gameserver/communitybbs/model/Topic._date:J
   #43 = NameAndType        #44:#45       // _date:J
   #44 = Utf8               _date
   #45 = Utf8               J
   #46 = Fieldref           #11.#47       // ext/mods/gameserver/communitybbs/model/Topic._ownerName:Ljava/lang/String;
   #47 = NameAndType        #48:#41       // _ownerName:Ljava/lang/String;
   #48 = Utf8               _ownerName
   #49 = Fieldref           #11.#50       // ext/mods/gameserver/communitybbs/model/Topic._ownerId:I
   #50 = NameAndType        #51:#31       // _ownerId:I
   #51 = Utf8               _ownerId
   #52 = Class              #53           // ext/mods/gameserver/communitybbs/model/Post
   #53 = Utf8               ext/mods/gameserver/communitybbs/model/Post
   #54 = Methodref          #52.#55       // ext/mods/gameserver/communitybbs/model/Post."<init>":(ILjava/lang/String;IJIILjava/lang/String;)V
   #55 = NameAndType        #5:#56        // "<init>":(ILjava/lang/String;IJIILjava/lang/String;)V
   #56 = Utf8               (ILjava/lang/String;IJIILjava/lang/String;)V
   #57 = InterfaceMethodref #58.#59       // java/util/List.add:(Ljava/lang/Object;)Z
   #58 = Class              #60           // java/util/List
   #59 = NameAndType        #61:#62       // add:(Ljava/lang/Object;)Z
   #60 = Utf8               java/util/List
   #61 = Utf8               add
   #62 = Utf8               (Ljava/lang/Object;)Z
   #63 = Methodref          #64.#65       // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
   #64 = Class              #66           // ext/mods/commons/pool/ConnectionPool
   #65 = NameAndType        #67:#68       // getConnection:()Ljava/sql/Connection;
   #66 = Utf8               ext/mods/commons/pool/ConnectionPool
   #67 = Utf8               getConnection
   #68 = Utf8               ()Ljava/sql/Connection;
   #69 = String             #70           // INSERT INTO bbs_topic (id,forum_id,name,date,owner_name,owner_id) VALUES (?,?,?,?,?,?)
   #70 = Utf8               INSERT INTO bbs_topic (id,forum_id,name,date,owner_name,owner_id) VALUES (?,?,?,?,?,?)
   #71 = InterfaceMethodref #72.#73       // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #72 = Class              #74           // java/sql/Connection
   #73 = NameAndType        #75:#76       // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #74 = Utf8               java/sql/Connection
   #75 = Utf8               prepareStatement
   #76 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #77 = String             #78           // INSERT INTO bbs_post (id,owner_name,owner_id,date,topic_id,forum_id,txt) values (?,?,?,?,?,?,?)
   #78 = Utf8               INSERT INTO bbs_post (id,owner_name,owner_id,date,topic_id,forum_id,txt) values (?,?,?,?,?,?,?)
   #79 = InterfaceMethodref #80.#81       // java/sql/PreparedStatement.setInt:(II)V
   #80 = Class              #82           // java/sql/PreparedStatement
   #81 = NameAndType        #83:#84       // setInt:(II)V
   #82 = Utf8               java/sql/PreparedStatement
   #83 = Utf8               setInt
   #84 = Utf8               (II)V
   #85 = InterfaceMethodref #80.#86       // java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
   #86 = NameAndType        #87:#88       // setString:(ILjava/lang/String;)V
   #87 = Utf8               setString
   #88 = Utf8               (ILjava/lang/String;)V
   #89 = InterfaceMethodref #80.#90       // java/sql/PreparedStatement.setLong:(IJ)V
   #90 = NameAndType        #91:#92       // setLong:(IJ)V
   #91 = Utf8               setLong
   #92 = Utf8               (IJ)V
   #93 = InterfaceMethodref #80.#94       // java/sql/PreparedStatement.execute:()Z
   #94 = NameAndType        #95:#96       // execute:()Z
   #95 = Utf8               execute
   #96 = Utf8               ()Z
   #97 = InterfaceMethodref #80.#98       // java/sql/PreparedStatement.close:()V
   #98 = NameAndType        #99:#6        // close:()V
   #99 = Utf8               close
  #100 = Class              #101          // java/lang/Throwable
  #101 = Utf8               java/lang/Throwable
  #102 = Methodref          #100.#103     // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
  #103 = NameAndType        #104:#105     // addSuppressed:(Ljava/lang/Throwable;)V
  #104 = Utf8               addSuppressed
  #105 = Utf8               (Ljava/lang/Throwable;)V
  #106 = InterfaceMethodref #72.#98       // java/sql/Connection.close:()V
  #107 = Class              #108          // java/lang/Exception
  #108 = Utf8               java/lang/Exception
  #109 = Fieldref           #11.#110      // ext/mods/gameserver/communitybbs/model/Topic.LOGGER:Lext/mods/commons/logging/CLogger;
  #110 = NameAndType        #111:#112     // LOGGER:Lext/mods/commons/logging/CLogger;
  #111 = Utf8               LOGGER
  #112 = Utf8               Lext/mods/commons/logging/CLogger;
  #113 = String             #114          // Couldn\'t save new Topic.
  #114 = Utf8               Couldn\'t save new Topic.
  #115 = Methodref          #116.#117     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #116 = Class              #118          // ext/mods/commons/logging/CLogger
  #117 = NameAndType        #119:#120     // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #118 = Utf8               ext/mods/commons/logging/CLogger
  #119 = Utf8               error
  #120 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
  #121 = String             #122          // id
  #122 = Utf8               id
  #123 = InterfaceMethodref #124.#125     // java/sql/ResultSet.getInt:(Ljava/lang/String;)I
  #124 = Class              #126          // java/sql/ResultSet
  #125 = NameAndType        #127:#128     // getInt:(Ljava/lang/String;)I
  #126 = Utf8               java/sql/ResultSet
  #127 = Utf8               getInt
  #128 = Utf8               (Ljava/lang/String;)I
  #129 = String             #130          // forum_id
  #130 = Utf8               forum_id
  #131 = String             #132          // name
  #132 = Utf8               name
  #133 = InterfaceMethodref #124.#134     // java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
  #134 = NameAndType        #135:#136     // getString:(Ljava/lang/String;)Ljava/lang/String;
  #135 = Utf8               getString
  #136 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #137 = String             #138          // date
  #138 = Utf8               date
  #139 = InterfaceMethodref #124.#140     // java/sql/ResultSet.getLong:(Ljava/lang/String;)J
  #140 = NameAndType        #141:#142     // getLong:(Ljava/lang/String;)J
  #141 = Utf8               getLong
  #142 = Utf8               (Ljava/lang/String;)J
  #143 = String             #144          // owner_name
  #144 = Utf8               owner_name
  #145 = String             #146          // owner_id
  #146 = Utf8               owner_id
  #147 = Methodref          #23.#148      // ext/mods/gameserver/communitybbs/model/Forum.removeTopic:(I)V
  #148 = NameAndType        #149:#150     // removeTopic:(I)V
  #149 = Utf8               removeTopic
  #150 = Utf8               (I)V
  #151 = String             #152          // DELETE FROM bbs_topic WHERE id=? AND forum_id=?
  #152 = Utf8               DELETE FROM bbs_topic WHERE id=? AND forum_id=?
  #153 = String             #154          // DELETE FROM bbs_post WHERE forum_id=? AND topic_id=?
  #154 = Utf8               DELETE FROM bbs_post WHERE forum_id=? AND topic_id=?
  #155 = String             #156          // Couldn\'t delete topic.
  #156 = Utf8               Couldn\'t delete topic.
  #157 = InterfaceMethodref #58.#158      // java/util/List.clear:()V
  #158 = NameAndType        #159:#6       // clear:()V
  #159 = Utf8               clear
  #160 = InterfaceMethodref #58.#161      // java/util/List.stream:()Ljava/util/stream/Stream;
  #161 = NameAndType        #162:#163     // stream:()Ljava/util/stream/Stream;
  #162 = Utf8               stream
  #163 = Utf8               ()Ljava/util/stream/Stream;
  #164 = InvokeDynamic      #0:#165       // #0:test:(I)Ljava/util/function/Predicate;
  #165 = NameAndType        #166:#167     // test:(I)Ljava/util/function/Predicate;
  #166 = Utf8               test
  #167 = Utf8               (I)Ljava/util/function/Predicate;
  #168 = InterfaceMethodref #169.#170     // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #169 = Class              #171          // java/util/stream/Stream
  #170 = NameAndType        #172:#173     // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #171 = Utf8               java/util/stream/Stream
  #172 = Utf8               filter
  #173 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #174 = InterfaceMethodref #169.#175     // java/util/stream/Stream.findFirst:()Ljava/util/Optional;
  #175 = NameAndType        #176:#177     // findFirst:()Ljava/util/Optional;
  #176 = Utf8               findFirst
  #177 = Utf8               ()Ljava/util/Optional;
  #178 = Methodref          #179.#180     // java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
  #179 = Class              #181          // java/util/Optional
  #180 = NameAndType        #182:#183     // orElse:(Ljava/lang/Object;)Ljava/lang/Object;
  #181 = Utf8               java/util/Optional
  #182 = Utf8               orElse
  #183 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #184 = Methodref          #52.#33       // ext/mods/gameserver/communitybbs/model/Post.getId:()I
  #185 = Methodref          #186.#187     // java/lang/Class.getName:()Ljava/lang/String;
  #186 = Class              #188          // java/lang/Class
  #187 = NameAndType        #189:#190     // getName:()Ljava/lang/String;
  #188 = Utf8               java/lang/Class
  #189 = Utf8               getName
  #190 = Utf8               ()Ljava/lang/String;
  #191 = Methodref          #116.#192     // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #192 = NameAndType        #5:#193       // "<init>":(Ljava/lang/String;)V
  #193 = Utf8               (Ljava/lang/String;)V
  #194 = Utf8               INSERT_TOPIC
  #195 = Utf8               ConstantValue
  #196 = Utf8               DELETE_TOPIC
  #197 = Utf8               INSERT_POST
  #198 = Utf8               DELETE_POST
  #199 = Utf8               Signature
  #200 = Utf8               Ljava/util/List<Lext/mods/gameserver/communitybbs/model/Post;>;
  #201 = Utf8               (Lext/mods/gameserver/communitybbs/model/Forum;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
  #202 = Utf8               Code
  #203 = Utf8               LineNumberTable
  #204 = Utf8               LocalVariableTable
  #205 = Utf8               ps2
  #206 = Utf8               Ljava/sql/PreparedStatement;
  #207 = Utf8               ps
  #208 = Utf8               con
  #209 = Utf8               Ljava/sql/Connection;
  #210 = Utf8               e
  #211 = Utf8               Ljava/lang/Exception;
  #212 = Utf8               this
  #213 = Utf8               Lext/mods/gameserver/communitybbs/model/Topic;
  #214 = Utf8               forum
  #215 = Utf8               Lext/mods/gameserver/communitybbs/model/Forum;
  #216 = Utf8               ownerName
  #217 = Utf8               ownerId
  #218 = Utf8               text
  #219 = Utf8               StackMapTable
  #220 = Class              #221          // java/lang/String
  #221 = Utf8               java/lang/String
  #222 = Utf8               (Ljava/sql/ResultSet;)V
  #223 = Utf8               rs
  #224 = Utf8               Ljava/sql/ResultSet;
  #225 = Utf8               Exceptions
  #226 = Class              #227          // java/sql/SQLException
  #227 = Utf8               java/sql/SQLException
  #228 = Utf8               getForumId
  #229 = Utf8               getOwnerName
  #230 = Utf8               getDate
  #231 = Utf8               deleteMe
  #232 = Utf8               (Lext/mods/gameserver/communitybbs/model/Forum;)V
  #233 = Utf8               getPost
  #234 = Utf8               (I)Lext/mods/gameserver/communitybbs/model/Post;
  #235 = Utf8               addPost
  #236 = Utf8               (Lext/mods/gameserver/communitybbs/model/Post;)V
  #237 = Utf8               post
  #238 = Utf8               Lext/mods/gameserver/communitybbs/model/Post;
  #239 = Utf8               lambda$getPost$0
  #240 = Utf8               (ILext/mods/gameserver/communitybbs/model/Post;)Z
  #241 = Utf8               p
  #242 = Utf8               <clinit>
  #243 = Utf8               SourceFile
  #244 = Utf8               Topic.java
  #245 = Utf8               BootstrapMethods
  #246 = MethodType         #62           //  (Ljava/lang/Object;)Z
  #247 = MethodHandle       6:#248        // REF_invokeStatic ext/mods/gameserver/communitybbs/model/Topic.lambda$getPost$0:(ILext/mods/gameserver/communitybbs/model/Post;)Z
  #248 = Methodref          #11.#249      // ext/mods/gameserver/communitybbs/model/Topic.lambda$getPost$0:(ILext/mods/gameserver/communitybbs/model/Post;)Z
  #249 = NameAndType        #239:#240     // lambda$getPost$0:(ILext/mods/gameserver/communitybbs/model/Post;)Z
  #250 = MethodType         #251          //  (Lext/mods/gameserver/communitybbs/model/Post;)Z
  #251 = Utf8               (Lext/mods/gameserver/communitybbs/model/Post;)Z
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
  public ext.mods.gameserver.communitybbs.model.Topic(ext.mods.gameserver.communitybbs.model.Forum, java.lang.String, java.lang.String, int, java.lang.String);
    descriptor: (Lext/mods/gameserver/communitybbs/model/Forum;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=11, locals=13, args_size=6
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/ArrayList
         8: dup
         9: invokespecial #9                  // Method java/util/ArrayList."<init>":()V
        12: putfield      #10                 // Field _posts:Ljava/util/List;
        15: invokestatic  #16                 // Method java/lang/System.currentTimeMillis:()J
        18: lstore        6
        20: aload_0
        21: aload_1
        22: invokevirtual #22                 // Method ext/mods/gameserver/communitybbs/model/Forum.getANewTopicId:()I
        25: putfield      #28                 // Field _id:I
        28: aload_0
        29: aload_1
        30: invokevirtual #32                 // Method ext/mods/gameserver/communitybbs/model/Forum.getId:()I
        33: putfield      #35                 // Field _forumId:I
        36: aload_0
        37: aload_2
        38: putfield      #38                 // Field _name:Ljava/lang/String;
        41: aload_0
        42: lload         6
        44: putfield      #42                 // Field _date:J
        47: aload_0
        48: aload_3
        49: putfield      #46                 // Field _ownerName:Ljava/lang/String;
        52: aload_0
        53: iload         4
        55: putfield      #49                 // Field _ownerId:I
        58: aload_0
        59: getfield      #10                 // Field _posts:Ljava/util/List;
        62: new           #52                 // class ext/mods/gameserver/communitybbs/model/Post
        65: dup
        66: iconst_0
        67: aload_3
        68: iload         4
        70: lload         6
        72: aload_0
        73: getfield      #28                 // Field _id:I
        76: aload_0
        77: getfield      #35                 // Field _forumId:I
        80: aload         5
        82: invokespecial #54                 // Method ext/mods/gameserver/communitybbs/model/Post."<init>":(ILjava/lang/String;IJIILjava/lang/String;)V
        85: invokeinterface #57,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        90: pop
        91: invokestatic  #63                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        94: astore        8
        96: aload         8
        98: ldc           #69                 // String INSERT INTO bbs_topic (id,forum_id,name,date,owner_name,owner_id) VALUES (?,?,?,?,?,?)
       100: invokeinterface #71,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       105: astore        9
       107: aload         8
       109: ldc           #77                 // String INSERT INTO bbs_post (id,owner_name,owner_id,date,topic_id,forum_id,txt) values (?,?,?,?,?,?,?)
       111: invokeinterface #71,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       116: astore        10
       118: aload         9
       120: iconst_1
       121: aload_0
       122: getfield      #28                 // Field _id:I
       125: invokeinterface #79,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       130: aload         9
       132: iconst_2
       133: aload_0
       134: getfield      #35                 // Field _forumId:I
       137: invokeinterface #79,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       142: aload         9
       144: iconst_3
       145: aload_0
       146: getfield      #38                 // Field _name:Ljava/lang/String;
       149: invokeinterface #85,  3           // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
       154: aload         9
       156: iconst_4
       157: aload_0
       158: getfield      #42                 // Field _date:J
       161: invokeinterface #89,  4           // InterfaceMethod java/sql/PreparedStatement.setLong:(IJ)V
       166: aload         9
       168: iconst_5
       169: aload_0
       170: getfield      #46                 // Field _ownerName:Ljava/lang/String;
       173: invokeinterface #85,  3           // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
       178: aload         9
       180: bipush        6
       182: aload_0
       183: getfield      #49                 // Field _ownerId:I
       186: invokeinterface #79,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       191: aload         9
       193: invokeinterface #93,  1           // InterfaceMethod java/sql/PreparedStatement.execute:()Z
       198: pop
       199: aload         10
       201: iconst_1
       202: iconst_0
       203: invokeinterface #79,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       208: aload         10
       210: iconst_2
       211: aload_3
       212: invokeinterface #85,  3           // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
       217: aload         10
       219: iconst_3
       220: iload         4
       222: invokeinterface #79,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       227: aload         10
       229: iconst_4
       230: lload         6
       232: invokeinterface #89,  4           // InterfaceMethod java/sql/PreparedStatement.setLong:(IJ)V
       237: aload         10
       239: iconst_5
       240: aload_0
       241: getfield      #28                 // Field _id:I
       244: invokeinterface #79,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       249: aload         10
       251: bipush        6
       253: aload_0
       254: getfield      #35                 // Field _forumId:I
       257: invokeinterface #79,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       262: aload         10
       264: bipush        7
       266: aload         5
       268: invokeinterface #85,  3           // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
       273: aload         10
       275: invokeinterface #93,  1           // InterfaceMethod java/sql/PreparedStatement.execute:()Z
       280: pop
       281: aload         10
       283: ifnull        325
       286: aload         10
       288: invokeinterface #97,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       293: goto          325
       296: astore        11
       298: aload         10
       300: ifnull        322
       303: aload         10
       305: invokeinterface #97,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       310: goto          322
       313: astore        12
       315: aload         11
       317: aload         12
       319: invokevirtual #102                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       322: aload         11
       324: athrow
       325: aload         9
       327: ifnull        369
       330: aload         9
       332: invokeinterface #97,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       337: goto          369
       340: astore        10
       342: aload         9
       344: ifnull        366
       347: aload         9
       349: invokeinterface #97,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       354: goto          366
       357: astore        11
       359: aload         10
       361: aload         11
       363: invokevirtual #102                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       366: aload         10
       368: athrow
       369: aload         8
       371: ifnull        413
       374: aload         8
       376: invokeinterface #106,  1          // InterfaceMethod java/sql/Connection.close:()V
       381: goto          413
       384: astore        9
       386: aload         8
       388: ifnull        410
       391: aload         8
       393: invokeinterface #106,  1          // InterfaceMethod java/sql/Connection.close:()V
       398: goto          410
       401: astore        10
       403: aload         9
       405: aload         10
       407: invokevirtual #102                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       410: aload         9
       412: athrow
       413: goto          428
       416: astore        8
       418: getstatic     #109                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       421: ldc           #113                // String Couldn\'t save new Topic.
       423: aload         8
       425: invokevirtual #115                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       428: return
      Exception table:
         from    to  target type
           118   281   296   Class java/lang/Throwable
           303   310   313   Class java/lang/Throwable
           107   325   340   Class java/lang/Throwable
           347   354   357   Class java/lang/Throwable
            96   369   384   Class java/lang/Throwable
           391   398   401   Class java/lang/Throwable
            91   413   416   Class java/lang/Exception
      LineNumberTable:
        line 49: 0
        line 39: 4
        line 50: 15
        line 52: 20
        line 53: 28
        line 54: 36
        line 55: 41
        line 56: 47
        line 57: 52
        line 59: 58
        line 61: 91
        line 62: 96
        line 63: 107
        line 65: 118
        line 66: 130
        line 67: 142
        line 68: 154
        line 69: 166
        line 70: 178
        line 71: 191
        line 73: 199
        line 74: 208
        line 75: 217
        line 76: 227
        line 77: 237
        line 78: 249
        line 79: 262
        line 80: 273
        line 81: 281
        line 61: 296
        line 81: 325
        line 61: 340
        line 81: 369
        line 61: 384
        line 85: 413
        line 82: 416
        line 84: 418
        line 86: 428
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          118     207    10   ps2   Ljava/sql/PreparedStatement;
          107     262     9    ps   Ljava/sql/PreparedStatement;
           96     317     8   con   Ljava/sql/Connection;
          418      10     8     e   Ljava/lang/Exception;
            0     429     0  this   Lext/mods/gameserver/communitybbs/model/Topic;
            0     429     1 forum   Lext/mods/gameserver/communitybbs/model/Forum;
            0     429     2  name   Ljava/lang/String;
            0     429     3 ownerName   Ljava/lang/String;
            0     429     4 ownerId   I
            0     429     5  text   Ljava/lang/String;
           20     409     6  date   J
      StackMapTable: number_of_entries = 14
        frame_type = 255 /* full_frame */
          offset_delta = 296
          locals = [ class ext/mods/gameserver/communitybbs/model/Topic, class ext/mods/gameserver/communitybbs/model/Forum, class java/lang/String, class java/lang/String, int, class java/lang/String, long, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/communitybbs/model/Topic, class ext/mods/gameserver/communitybbs/model/Forum, class java/lang/String, class java/lang/String, int, class java/lang/String, long, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/communitybbs/model/Topic, class ext/mods/gameserver/communitybbs/model/Forum, class java/lang/String, class java/lang/String, int, class java/lang/String, long, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/communitybbs/model/Topic, class ext/mods/gameserver/communitybbs/model/Forum, class java/lang/String, class java/lang/String, int, class java/lang/String, long, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 11 /* same */

  public ext.mods.gameserver.communitybbs.model.Topic(java.sql.ResultSet) throws java.sql.SQLException;
    descriptor: (Ljava/sql/ResultSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/ArrayList
         8: dup
         9: invokespecial #9                  // Method java/util/ArrayList."<init>":()V
        12: putfield      #10                 // Field _posts:Ljava/util/List;
        15: aload_0
        16: aload_1
        17: ldc           #121                // String id
        19: invokeinterface #123,  2          // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        24: putfield      #28                 // Field _id:I
        27: aload_0
        28: aload_1
        29: ldc           #129                // String forum_id
        31: invokeinterface #123,  2          // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        36: putfield      #35                 // Field _forumId:I
        39: aload_0
        40: aload_1
        41: ldc           #131                // String name
        43: invokeinterface #133,  2          // InterfaceMethod java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
        48: putfield      #38                 // Field _name:Ljava/lang/String;
        51: aload_0
        52: aload_1
        53: ldc           #137                // String date
        55: invokeinterface #139,  2          // InterfaceMethod java/sql/ResultSet.getLong:(Ljava/lang/String;)J
        60: putfield      #42                 // Field _date:J
        63: aload_0
        64: aload_1
        65: ldc           #143                // String owner_name
        67: invokeinterface #133,  2          // InterfaceMethod java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
        72: putfield      #46                 // Field _ownerName:Ljava/lang/String;
        75: aload_0
        76: aload_1
        77: ldc           #145                // String owner_id
        79: invokeinterface #123,  2          // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        84: putfield      #49                 // Field _ownerId:I
        87: return
      LineNumberTable:
        line 89: 0
        line 39: 4
        line 90: 15
        line 91: 27
        line 92: 39
        line 93: 51
        line 94: 63
        line 95: 75
        line 96: 87
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      88     0  this   Lext/mods/gameserver/communitybbs/model/Topic;
            0      88     1    rs   Ljava/sql/ResultSet;
    Exceptions:
      throws java.sql.SQLException

  public int getId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #28                 // Field _id:I
         4: ireturn
      LineNumberTable:
        line 100: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/communitybbs/model/Topic;

  public int getForumId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #35                 // Field _forumId:I
         4: ireturn
      LineNumberTable:
        line 105: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/communitybbs/model/Topic;

  public java.lang.String getName();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #38                 // Field _name:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 110: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/communitybbs/model/Topic;

  public java.lang.String getOwnerName();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #46                 // Field _ownerName:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 115: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/communitybbs/model/Topic;

  public long getDate();
    descriptor: ()J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #42                 // Field _date:J
         4: lreturn
      LineNumberTable:
        line 120: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/communitybbs/model/Topic;

  public void deleteMe(ext.mods.gameserver.communitybbs.model.Forum);
    descriptor: (Lext/mods/gameserver/communitybbs/model/Forum;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=7, args_size=2
         0: aload_1
         1: aload_0
         2: getfield      #28                 // Field _id:I
         5: invokevirtual #147                // Method ext/mods/gameserver/communitybbs/model/Forum.removeTopic:(I)V
         8: invokestatic  #63                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        11: astore_2
        12: aload_2
        13: ldc           #151                // String DELETE FROM bbs_topic WHERE id=? AND forum_id=?
        15: invokeinterface #71,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        20: astore_3
        21: aload_2
        22: ldc           #153                // String DELETE FROM bbs_post WHERE forum_id=? AND topic_id=?
        24: invokeinterface #71,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        29: astore        4
        31: aload_3
        32: iconst_1
        33: aload_0
        34: getfield      #28                 // Field _id:I
        37: invokeinterface #79,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        42: aload_3
        43: iconst_2
        44: aload_1
        45: invokevirtual #32                 // Method ext/mods/gameserver/communitybbs/model/Forum.getId:()I
        48: invokeinterface #79,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        53: aload_3
        54: invokeinterface #93,  1           // InterfaceMethod java/sql/PreparedStatement.execute:()Z
        59: pop
        60: aload         4
        62: iconst_1
        63: aload_1
        64: invokevirtual #32                 // Method ext/mods/gameserver/communitybbs/model/Forum.getId:()I
        67: invokeinterface #79,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        72: aload         4
        74: iconst_2
        75: aload_0
        76: getfield      #28                 // Field _id:I
        79: invokeinterface #79,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        84: aload         4
        86: invokeinterface #93,  1           // InterfaceMethod java/sql/PreparedStatement.execute:()Z
        91: pop
        92: aload         4
        94: ifnull        136
        97: aload         4
        99: invokeinterface #97,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       104: goto          136
       107: astore        5
       109: aload         4
       111: ifnull        133
       114: aload         4
       116: invokeinterface #97,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       121: goto          133
       124: astore        6
       126: aload         5
       128: aload         6
       130: invokevirtual #102                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       133: aload         5
       135: athrow
       136: aload_3
       137: ifnull        176
       140: aload_3
       141: invokeinterface #97,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       146: goto          176
       149: astore        4
       151: aload_3
       152: ifnull        173
       155: aload_3
       156: invokeinterface #97,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       161: goto          173
       164: astore        5
       166: aload         4
       168: aload         5
       170: invokevirtual #102                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       173: aload         4
       175: athrow
       176: aload_2
       177: ifnull        213
       180: aload_2
       181: invokeinterface #106,  1          // InterfaceMethod java/sql/Connection.close:()V
       186: goto          213
       189: astore_3
       190: aload_2
       191: ifnull        211
       194: aload_2
       195: invokeinterface #106,  1          // InterfaceMethod java/sql/Connection.close:()V
       200: goto          211
       203: astore        4
       205: aload_3
       206: aload         4
       208: invokevirtual #102                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       211: aload_3
       212: athrow
       213: goto          226
       216: astore_2
       217: getstatic     #109                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       220: ldc           #155                // String Couldn\'t delete topic.
       222: aload_2
       223: invokevirtual #115                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       226: aload_0
       227: getfield      #10                 // Field _posts:Ljava/util/List;
       230: invokeinterface #157,  1          // InterfaceMethod java/util/List.clear:()V
       235: return
      Exception table:
         from    to  target type
            31    92   107   Class java/lang/Throwable
           114   121   124   Class java/lang/Throwable
            21   136   149   Class java/lang/Throwable
           155   161   164   Class java/lang/Throwable
            12   176   189   Class java/lang/Throwable
           194   200   203   Class java/lang/Throwable
             8   213   216   Class java/lang/Exception
      LineNumberTable:
        line 129: 0
        line 131: 8
        line 132: 12
        line 133: 21
        line 135: 31
        line 136: 42
        line 137: 53
        line 139: 60
        line 140: 72
        line 141: 84
        line 142: 92
        line 131: 107
        line 142: 136
        line 131: 149
        line 142: 176
        line 131: 189
        line 146: 213
        line 143: 216
        line 145: 217
        line 147: 226
        line 148: 235
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           31     105     4   ps2   Ljava/sql/PreparedStatement;
           21     155     3    ps   Ljava/sql/PreparedStatement;
           12     201     2   con   Ljava/sql/Connection;
          217       9     2     e   Ljava/lang/Exception;
            0     236     0  this   Lext/mods/gameserver/communitybbs/model/Topic;
            0     236     1 forum   Lext/mods/gameserver/communitybbs/model/Forum;
      StackMapTable: number_of_entries = 14
        frame_type = 255 /* full_frame */
          offset_delta = 107
          locals = [ class ext/mods/gameserver/communitybbs/model/Topic, class ext/mods/gameserver/communitybbs/model/Forum, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/communitybbs/model/Topic, class ext/mods/gameserver/communitybbs/model/Forum, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/communitybbs/model/Topic, class ext/mods/gameserver/communitybbs/model/Forum, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/communitybbs/model/Topic, class ext/mods/gameserver/communitybbs/model/Forum, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 9 /* same */

  public ext.mods.gameserver.communitybbs.model.Post getPost(int);
    descriptor: (I)Lext/mods/gameserver/communitybbs/model/Post;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _posts:Ljava/util/List;
         4: invokeinterface #160,  1          // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
         9: iload_1
        10: invokedynamic #164,  0            // InvokeDynamic #0:test:(I)Ljava/util/function/Predicate;
        15: invokeinterface #168,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        20: invokeinterface #174,  1          // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
        25: aconst_null
        26: invokevirtual #178                // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        29: checkcast     #52                 // class ext/mods/gameserver/communitybbs/model/Post
        32: areturn
      LineNumberTable:
        line 152: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lext/mods/gameserver/communitybbs/model/Topic;
            0      33     1    id   I

  public void addPost(ext.mods.gameserver.communitybbs.model.Post);
    descriptor: (Lext/mods/gameserver/communitybbs/model/Post;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _posts:Ljava/util/List;
         4: aload_1
         5: invokeinterface #57,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 157: 0
        line 158: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/communitybbs/model/Topic;
            0      12     1  post   Lext/mods/gameserver/communitybbs/model/Post;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #116                // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #11                 // class ext/mods/gameserver/communitybbs/model/Topic
         6: invokevirtual #185                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #191                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #109                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 32: 0
}
SourceFile: "Topic.java"
BootstrapMethods:
  0: #252 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #246 (Ljava/lang/Object;)Z
      #247 REF_invokeStatic ext/mods/gameserver/communitybbs/model/Topic.lambda$getPost$0:(ILext/mods/gameserver/communitybbs/model/Post;)Z
      #250 (Lext/mods/gameserver/communitybbs/model/Post;)Z
InnerClasses:
  public static final #264= #260 of #262; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
