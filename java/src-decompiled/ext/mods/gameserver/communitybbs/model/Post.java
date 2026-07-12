// Bytecode for: ext.mods.gameserver.communitybbs.model.Post
// File: ext\mods\gameserver\communitybbs\model\Post.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/communitybbs/model/Post.class
  Last modified 9 de jul de 2026; size 3484 bytes
  MD5 checksum 705e0647c170a3c02b1344ebe4dc3e25
  Compiled from "Post.java"
public class ext.mods.gameserver.communitybbs.model.Post
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/communitybbs/model/Post
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 9, methods: 12, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/communitybbs/model/Post._id:I
    #8 = Class              #10           // ext/mods/gameserver/communitybbs/model/Post
    #9 = NameAndType        #11:#12       // _id:I
   #10 = Utf8               ext/mods/gameserver/communitybbs/model/Post
   #11 = Utf8               _id
   #12 = Utf8               I
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/communitybbs/model/Post._owner:Ljava/lang/String;
   #14 = NameAndType        #15:#16       // _owner:Ljava/lang/String;
   #15 = Utf8               _owner
   #16 = Utf8               Ljava/lang/String;
   #17 = Fieldref           #8.#18        // ext/mods/gameserver/communitybbs/model/Post._ownerId:I
   #18 = NameAndType        #19:#12       // _ownerId:I
   #19 = Utf8               _ownerId
   #20 = Fieldref           #8.#21        // ext/mods/gameserver/communitybbs/model/Post._date:J
   #21 = NameAndType        #22:#23       // _date:J
   #22 = Utf8               _date
   #23 = Utf8               J
   #24 = Fieldref           #8.#25        // ext/mods/gameserver/communitybbs/model/Post._topicId:I
   #25 = NameAndType        #26:#12       // _topicId:I
   #26 = Utf8               _topicId
   #27 = Fieldref           #8.#28        // ext/mods/gameserver/communitybbs/model/Post._forumId:I
   #28 = NameAndType        #29:#12       // _forumId:I
   #29 = Utf8               _forumId
   #30 = Fieldref           #8.#31        // ext/mods/gameserver/communitybbs/model/Post._text:Ljava/lang/String;
   #31 = NameAndType        #32:#16       // _text:Ljava/lang/String;
   #32 = Utf8               _text
   #33 = String             #34           // id
   #34 = Utf8               id
   #35 = InterfaceMethodref #36.#37       // java/sql/ResultSet.getInt:(Ljava/lang/String;)I
   #36 = Class              #38           // java/sql/ResultSet
   #37 = NameAndType        #39:#40       // getInt:(Ljava/lang/String;)I
   #38 = Utf8               java/sql/ResultSet
   #39 = Utf8               getInt
   #40 = Utf8               (Ljava/lang/String;)I
   #41 = String             #42           // owner_name
   #42 = Utf8               owner_name
   #43 = InterfaceMethodref #36.#44       // java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
   #44 = NameAndType        #45:#46       // getString:(Ljava/lang/String;)Ljava/lang/String;
   #45 = Utf8               getString
   #46 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #47 = String             #48           // owner_id
   #48 = Utf8               owner_id
   #49 = String             #50           // date
   #50 = Utf8               date
   #51 = InterfaceMethodref #36.#52       // java/sql/ResultSet.getLong:(Ljava/lang/String;)J
   #52 = NameAndType        #53:#54       // getLong:(Ljava/lang/String;)J
   #53 = Utf8               getLong
   #54 = Utf8               (Ljava/lang/String;)J
   #55 = String             #56           // topic_id
   #56 = Utf8               topic_id
   #57 = String             #58           // forum_id
   #58 = Utf8               forum_id
   #59 = String             #60           // txt
   #60 = Utf8               txt
   #61 = Methodref          #62.#63       // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
   #62 = Class              #64           // ext/mods/commons/pool/ConnectionPool
   #63 = NameAndType        #65:#66       // getConnection:()Ljava/sql/Connection;
   #64 = Utf8               ext/mods/commons/pool/ConnectionPool
   #65 = Utf8               getConnection
   #66 = Utf8               ()Ljava/sql/Connection;
   #67 = String             #68           // UPDATE bbs_post SET txt=? WHERE id=? AND topic_id=? AND forum_id=?
   #68 = Utf8               UPDATE bbs_post SET txt=? WHERE id=? AND topic_id=? AND forum_id=?
   #69 = InterfaceMethodref #70.#71       // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #70 = Class              #72           // java/sql/Connection
   #71 = NameAndType        #73:#74       // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #72 = Utf8               java/sql/Connection
   #73 = Utf8               prepareStatement
   #74 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #75 = InterfaceMethodref #76.#77       // java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
   #76 = Class              #78           // java/sql/PreparedStatement
   #77 = NameAndType        #79:#80       // setString:(ILjava/lang/String;)V
   #78 = Utf8               java/sql/PreparedStatement
   #79 = Utf8               setString
   #80 = Utf8               (ILjava/lang/String;)V
   #81 = InterfaceMethodref #76.#82       // java/sql/PreparedStatement.setInt:(II)V
   #82 = NameAndType        #83:#84       // setInt:(II)V
   #83 = Utf8               setInt
   #84 = Utf8               (II)V
   #85 = InterfaceMethodref #76.#86       // java/sql/PreparedStatement.execute:()Z
   #86 = NameAndType        #87:#88       // execute:()Z
   #87 = Utf8               execute
   #88 = Utf8               ()Z
   #89 = InterfaceMethodref #76.#90       // java/sql/PreparedStatement.close:()V
   #90 = NameAndType        #91:#6        // close:()V
   #91 = Utf8               close
   #92 = Class              #93           // java/lang/Throwable
   #93 = Utf8               java/lang/Throwable
   #94 = Methodref          #92.#95       // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
   #95 = NameAndType        #96:#97       // addSuppressed:(Ljava/lang/Throwable;)V
   #96 = Utf8               addSuppressed
   #97 = Utf8               (Ljava/lang/Throwable;)V
   #98 = InterfaceMethodref #70.#90       // java/sql/Connection.close:()V
   #99 = Class              #100          // java/lang/Exception
  #100 = Utf8               java/lang/Exception
  #101 = Fieldref           #8.#102       // ext/mods/gameserver/communitybbs/model/Post.LOGGER:Lext/mods/commons/logging/CLogger;
  #102 = NameAndType        #103:#104     // LOGGER:Lext/mods/commons/logging/CLogger;
  #103 = Utf8               LOGGER
  #104 = Utf8               Lext/mods/commons/logging/CLogger;
  #105 = String             #106          // Couldn\'t update Post text.
  #106 = Utf8               Couldn\'t update Post text.
  #107 = Methodref          #108.#109     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #108 = Class              #110          // ext/mods/commons/logging/CLogger
  #109 = NameAndType        #111:#112     // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #110 = Utf8               ext/mods/commons/logging/CLogger
  #111 = Utf8               error
  #112 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
  #113 = Methodref          #114.#115     // java/lang/Class.getName:()Ljava/lang/String;
  #114 = Class              #116          // java/lang/Class
  #115 = NameAndType        #117:#118     // getName:()Ljava/lang/String;
  #116 = Utf8               java/lang/Class
  #117 = Utf8               getName
  #118 = Utf8               ()Ljava/lang/String;
  #119 = Methodref          #108.#120     // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #120 = NameAndType        #5:#121       // "<init>":(Ljava/lang/String;)V
  #121 = Utf8               (Ljava/lang/String;)V
  #122 = Utf8               UPDATE_TEXT
  #123 = Utf8               ConstantValue
  #124 = Utf8               (ILjava/lang/String;IJIILjava/lang/String;)V
  #125 = Utf8               Code
  #126 = Utf8               LineNumberTable
  #127 = Utf8               LocalVariableTable
  #128 = Utf8               this
  #129 = Utf8               Lext/mods/gameserver/communitybbs/model/Post;
  #130 = Utf8               owner
  #131 = Utf8               ownerId
  #132 = Utf8               topicId
  #133 = Utf8               forumId
  #134 = Utf8               text
  #135 = Utf8               (Ljava/sql/ResultSet;)V
  #136 = Utf8               rs
  #137 = Utf8               Ljava/sql/ResultSet;
  #138 = Utf8               Exceptions
  #139 = Class              #140          // java/sql/SQLException
  #140 = Utf8               java/sql/SQLException
  #141 = Utf8               getId
  #142 = Utf8               ()I
  #143 = Utf8               getOwner
  #144 = Utf8               getOwnerId
  #145 = Utf8               getDate
  #146 = Utf8               ()J
  #147 = Utf8               getTopicId
  #148 = Utf8               getForumId
  #149 = Utf8               getText
  #150 = Utf8               setText
  #151 = Utf8               updateText
  #152 = Utf8               ps
  #153 = Utf8               Ljava/sql/PreparedStatement;
  #154 = Utf8               con
  #155 = Utf8               Ljava/sql/Connection;
  #156 = Utf8               e
  #157 = Utf8               Ljava/lang/Exception;
  #158 = Utf8               index
  #159 = Utf8               StackMapTable
  #160 = Class              #161          // java/lang/String
  #161 = Utf8               java/lang/String
  #162 = Utf8               <clinit>
  #163 = Utf8               SourceFile
  #164 = Utf8               Post.java
{
  public ext.mods.gameserver.communitybbs.model.Post(int, java.lang.String, int, long, int, int, java.lang.String);
    descriptor: (ILjava/lang/String;IJIILjava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=9, args_size=8
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #7                  // Field _id:I
         9: aload_0
        10: aload_2
        11: putfield      #13                 // Field _owner:Ljava/lang/String;
        14: aload_0
        15: iload_3
        16: putfield      #17                 // Field _ownerId:I
        19: aload_0
        20: lload         4
        22: putfield      #20                 // Field _date:J
        25: aload_0
        26: iload         6
        28: putfield      #24                 // Field _topicId:I
        31: aload_0
        32: iload         7
        34: putfield      #27                 // Field _forumId:I
        37: aload_0
        38: aload         8
        40: putfield      #30                 // Field _text:Ljava/lang/String;
        43: return
      LineNumberTable:
        line 44: 0
        line 45: 4
        line 46: 9
        line 47: 14
        line 48: 19
        line 49: 25
        line 50: 31
        line 51: 37
        line 52: 43
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      44     0  this   Lext/mods/gameserver/communitybbs/model/Post;
            0      44     1    id   I
            0      44     2 owner   Ljava/lang/String;
            0      44     3 ownerId   I
            0      44     4  date   J
            0      44     6 topicId   I
            0      44     7 forumId   I
            0      44     8  text   Ljava/lang/String;

  public ext.mods.gameserver.communitybbs.model.Post(java.sql.ResultSet) throws java.sql.SQLException;
    descriptor: (Ljava/sql/ResultSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: ldc           #33                 // String id
         8: invokeinterface #35,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        13: putfield      #7                  // Field _id:I
        16: aload_0
        17: aload_1
        18: ldc           #41                 // String owner_name
        20: invokeinterface #43,  2           // InterfaceMethod java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
        25: putfield      #13                 // Field _owner:Ljava/lang/String;
        28: aload_0
        29: aload_1
        30: ldc           #47                 // String owner_id
        32: invokeinterface #35,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        37: putfield      #17                 // Field _ownerId:I
        40: aload_0
        41: aload_1
        42: ldc           #49                 // String date
        44: invokeinterface #51,  2           // InterfaceMethod java/sql/ResultSet.getLong:(Ljava/lang/String;)J
        49: putfield      #20                 // Field _date:J
        52: aload_0
        53: aload_1
        54: ldc           #55                 // String topic_id
        56: invokeinterface #35,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        61: putfield      #24                 // Field _topicId:I
        64: aload_0
        65: aload_1
        66: ldc           #57                 // String forum_id
        68: invokeinterface #35,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        73: putfield      #27                 // Field _forumId:I
        76: aload_0
        77: aload_1
        78: ldc           #59                 // String txt
        80: invokeinterface #43,  2           // InterfaceMethod java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
        85: putfield      #30                 // Field _text:Ljava/lang/String;
        88: return
      LineNumberTable:
        line 55: 0
        line 56: 4
        line 57: 16
        line 58: 28
        line 59: 40
        line 60: 52
        line 61: 64
        line 62: 76
        line 63: 88
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      89     0  this   Lext/mods/gameserver/communitybbs/model/Post;
            0      89     1    rs   Ljava/sql/ResultSet;
    Exceptions:
      throws java.sql.SQLException

  public int getId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _id:I
         4: ireturn
      LineNumberTable:
        line 67: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/communitybbs/model/Post;

  public java.lang.String getOwner();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _owner:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 72: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/communitybbs/model/Post;

  public int getOwnerId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field _ownerId:I
         4: ireturn
      LineNumberTable:
        line 77: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/communitybbs/model/Post;

  public long getDate();
    descriptor: ()J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #20                 // Field _date:J
         4: lreturn
      LineNumberTable:
        line 82: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/communitybbs/model/Post;

  public int getTopicId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #24                 // Field _topicId:I
         4: ireturn
      LineNumberTable:
        line 87: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/communitybbs/model/Post;

  public int getForumId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #27                 // Field _forumId:I
         4: ireturn
      LineNumberTable:
        line 92: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/communitybbs/model/Post;

  public java.lang.String getText();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #30                 // Field _text:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 97: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/communitybbs/model/Post;

  public void setText(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #30                 // Field _text:Ljava/lang/String;
         5: return
      LineNumberTable:
        line 102: 0
        line 103: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/communitybbs/model/Post;
            0       6     1  text   Ljava/lang/String;

  public void updateText(int, java.lang.String);
    descriptor: (ILjava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=7, args_size=3
         0: aload_0
         1: aload_2
         2: putfield      #30                 // Field _text:Ljava/lang/String;
         5: invokestatic  #61                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         8: astore_3
         9: aload_3
        10: ldc           #67                 // String UPDATE bbs_post SET txt=? WHERE id=? AND topic_id=? AND forum_id=?
        12: invokeinterface #69,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        17: astore        4
        19: aload         4
        21: iconst_1
        22: aload_0
        23: getfield      #30                 // Field _text:Ljava/lang/String;
        26: invokeinterface #75,  3           // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
        31: aload         4
        33: iconst_2
        34: aload_0
        35: getfield      #7                  // Field _id:I
        38: invokeinterface #81,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        43: aload         4
        45: iconst_3
        46: aload_0
        47: getfield      #24                 // Field _topicId:I
        50: invokeinterface #81,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        55: aload         4
        57: iconst_4
        58: aload_0
        59: getfield      #27                 // Field _forumId:I
        62: invokeinterface #81,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        67: aload         4
        69: invokeinterface #85,  1           // InterfaceMethod java/sql/PreparedStatement.execute:()Z
        74: pop
        75: aload         4
        77: ifnull        119
        80: aload         4
        82: invokeinterface #89,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
        87: goto          119
        90: astore        5
        92: aload         4
        94: ifnull        116
        97: aload         4
        99: invokeinterface #89,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       104: goto          116
       107: astore        6
       109: aload         5
       111: aload         6
       113: invokevirtual #94                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       116: aload         5
       118: athrow
       119: aload_3
       120: ifnull        159
       123: aload_3
       124: invokeinterface #98,  1           // InterfaceMethod java/sql/Connection.close:()V
       129: goto          159
       132: astore        4
       134: aload_3
       135: ifnull        156
       138: aload_3
       139: invokeinterface #98,  1           // InterfaceMethod java/sql/Connection.close:()V
       144: goto          156
       147: astore        5
       149: aload         4
       151: aload         5
       153: invokevirtual #94                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       156: aload         4
       158: athrow
       159: goto          172
       162: astore_3
       163: getstatic     #101                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       166: ldc           #105                // String Couldn\'t update Post text.
       168: aload_3
       169: invokevirtual #107                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       172: return
      Exception table:
         from    to  target type
            19    75    90   Class java/lang/Throwable
            97   104   107   Class java/lang/Throwable
             9   119   132   Class java/lang/Throwable
           138   144   147   Class java/lang/Throwable
             5   159   162   Class java/lang/Exception
      LineNumberTable:
        line 107: 0
        line 109: 5
        line 110: 9
        line 112: 19
        line 113: 31
        line 114: 43
        line 115: 55
        line 116: 67
        line 117: 75
        line 109: 90
        line 117: 119
        line 109: 132
        line 121: 159
        line 118: 162
        line 120: 163
        line 122: 172
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           19     100     4    ps   Ljava/sql/PreparedStatement;
            9     150     3   con   Ljava/sql/Connection;
          163       9     3     e   Ljava/lang/Exception;
            0     173     0  this   Lext/mods/gameserver/communitybbs/model/Post;
            0     173     1 index   I
            0     173     2  text   Ljava/lang/String;
      StackMapTable: number_of_entries = 10
        frame_type = 255 /* full_frame */
          offset_delta = 90
          locals = [ class ext/mods/gameserver/communitybbs/model/Post, int, class java/lang/String, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/communitybbs/model/Post, int, class java/lang/String, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/communitybbs/model/Post, int, class java/lang/String, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 9 /* same */

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #108                // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #8                  // class ext/mods/gameserver/communitybbs/model/Post
         6: invokevirtual #113                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #119                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #101                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 30: 0
}
SourceFile: "Post.java"
