// Bytecode for: ext.mods.gameserver.communitybbs.model.Mail
// File: ext\mods\gameserver\communitybbs\model\Mail.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/communitybbs/model/Mail.class
  Last modified 9 de jul de 2026; size 3254 bytes
  MD5 checksum 0c242ccd64fe16146ca1bb5ab11c4d08
  Compiled from "Mail.java"
public class ext.mods.gameserver.communitybbs.model.Mail
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #16                         // ext/mods/gameserver/communitybbs/model/Mail
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 10, methods: 14, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = String             #8            // id
    #8 = Utf8               id
    #9 = InterfaceMethodref #10.#11       // java/sql/ResultSet.getInt:(Ljava/lang/String;)I
   #10 = Class              #12           // java/sql/ResultSet
   #11 = NameAndType        #13:#14       // getInt:(Ljava/lang/String;)I
   #12 = Utf8               java/sql/ResultSet
   #13 = Utf8               getInt
   #14 = Utf8               (Ljava/lang/String;)I
   #15 = Fieldref           #16.#17       // ext/mods/gameserver/communitybbs/model/Mail._id:I
   #16 = Class              #18           // ext/mods/gameserver/communitybbs/model/Mail
   #17 = NameAndType        #19:#20       // _id:I
   #18 = Utf8               ext/mods/gameserver/communitybbs/model/Mail
   #19 = Utf8               _id
   #20 = Utf8               I
   #21 = String             #22           // receiver_id
   #22 = Utf8               receiver_id
   #23 = Fieldref           #16.#24       // ext/mods/gameserver/communitybbs/model/Mail._receiverId:I
   #24 = NameAndType        #25:#20       // _receiverId:I
   #25 = Utf8               _receiverId
   #26 = String             #27           // sender_id
   #27 = Utf8               sender_id
   #28 = Fieldref           #16.#29       // ext/mods/gameserver/communitybbs/model/Mail._senderId:I
   #29 = NameAndType        #30:#20       // _senderId:I
   #30 = Utf8               _senderId
   #31 = Class              #32           // ext/mods/gameserver/enums/MailType
   #32 = Utf8               ext/mods/gameserver/enums/MailType
   #33 = String             #34           // location
   #34 = Utf8               location
   #35 = InterfaceMethodref #10.#36       // java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
   #36 = NameAndType        #37:#38       // getString:(Ljava/lang/String;)Ljava/lang/String;
   #37 = Utf8               getString
   #38 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #39 = Methodref          #40.#41       // java/lang/String.toUpperCase:()Ljava/lang/String;
   #40 = Class              #42           // java/lang/String
   #41 = NameAndType        #43:#44       // toUpperCase:()Ljava/lang/String;
   #42 = Utf8               java/lang/String
   #43 = Utf8               toUpperCase
   #44 = Utf8               ()Ljava/lang/String;
   #45 = Methodref          #46.#47       // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #46 = Class              #48           // java/lang/Enum
   #47 = NameAndType        #49:#50       // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #48 = Utf8               java/lang/Enum
   #49 = Utf8               valueOf
   #50 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #51 = Fieldref           #16.#52       // ext/mods/gameserver/communitybbs/model/Mail._mailType:Lext/mods/gameserver/enums/MailType;
   #52 = NameAndType        #53:#54       // _mailType:Lext/mods/gameserver/enums/MailType;
   #53 = Utf8               _mailType
   #54 = Utf8               Lext/mods/gameserver/enums/MailType;
   #55 = String             #56           // recipients
   #56 = Utf8               recipients
   #57 = Fieldref           #16.#58       // ext/mods/gameserver/communitybbs/model/Mail._recipients:Ljava/lang/String;
   #58 = NameAndType        #59:#60       // _recipients:Ljava/lang/String;
   #59 = Utf8               _recipients
   #60 = Utf8               Ljava/lang/String;
   #61 = String             #62           // subject
   #62 = Utf8               subject
   #63 = Fieldref           #16.#64       // ext/mods/gameserver/communitybbs/model/Mail._subject:Ljava/lang/String;
   #64 = NameAndType        #65:#60       // _subject:Ljava/lang/String;
   #65 = Utf8               _subject
   #66 = String             #67           // message
   #67 = Utf8               message
   #68 = Fieldref           #16.#69       // ext/mods/gameserver/communitybbs/model/Mail._message:Ljava/lang/String;
   #69 = NameAndType        #70:#60       // _message:Ljava/lang/String;
   #70 = Utf8               _message
   #71 = String             #72           // sent_date
   #72 = Utf8               sent_date
   #73 = InterfaceMethodref #10.#74       // java/sql/ResultSet.getTimestamp:(Ljava/lang/String;)Ljava/sql/Timestamp;
   #74 = NameAndType        #75:#76       // getTimestamp:(Ljava/lang/String;)Ljava/sql/Timestamp;
   #75 = Utf8               getTimestamp
   #76 = Utf8               (Ljava/lang/String;)Ljava/sql/Timestamp;
   #77 = Fieldref           #16.#78       // ext/mods/gameserver/communitybbs/model/Mail._sentDate:Ljava/sql/Timestamp;
   #78 = NameAndType        #79:#80       // _sentDate:Ljava/sql/Timestamp;
   #79 = Utf8               _sentDate
   #80 = Utf8               Ljava/sql/Timestamp;
   #81 = Class              #82           // java/text/SimpleDateFormat
   #82 = Utf8               java/text/SimpleDateFormat
   #83 = String             #84           // yyyy-MM-dd HH:mm
   #84 = Utf8               yyyy-MM-dd HH:mm
   #85 = Methodref          #81.#86       // java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
   #86 = NameAndType        #5:#87        // "<init>":(Ljava/lang/String;)V
   #87 = Utf8               (Ljava/lang/String;)V
   #88 = Methodref          #81.#89       // java/text/SimpleDateFormat.format:(Ljava/util/Date;)Ljava/lang/String;
   #89 = NameAndType        #90:#91       // format:(Ljava/util/Date;)Ljava/lang/String;
   #90 = Utf8               format
   #91 = Utf8               (Ljava/util/Date;)Ljava/lang/String;
   #92 = Fieldref           #16.#93       // ext/mods/gameserver/communitybbs/model/Mail._formattedSentDate:Ljava/lang/String;
   #93 = NameAndType        #94:#60       // _formattedSentDate:Ljava/lang/String;
   #94 = Utf8               _formattedSentDate
   #95 = String             #96           // is_unread
   #96 = Utf8               is_unread
   #97 = Fieldref           #16.#98       // ext/mods/gameserver/communitybbs/model/Mail._isUnread:Z
   #98 = NameAndType        #99:#100      // _isUnread:Z
   #99 = Utf8               _isUnread
  #100 = Utf8               Z
  #101 = Utf8               (Ljava/sql/ResultSet;)V
  #102 = Utf8               Code
  #103 = Utf8               LineNumberTable
  #104 = Utf8               LocalVariableTable
  #105 = Utf8               this
  #106 = Utf8               Lext/mods/gameserver/communitybbs/model/Mail;
  #107 = Utf8               rs
  #108 = Utf8               Ljava/sql/ResultSet;
  #109 = Utf8               StackMapTable
  #110 = Utf8               Exceptions
  #111 = Class              #112          // java/sql/SQLException
  #112 = Utf8               java/sql/SQLException
  #113 = Utf8               (IIILext/mods/gameserver/enums/MailType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/sql/Timestamp;Ljava/lang/String;Z)V
  #114 = Utf8               receiverId
  #115 = Utf8               senderId
  #116 = Utf8               sentDate
  #117 = Utf8               formattedSentDate
  #118 = Utf8               isUnread
  #119 = Utf8               getId
  #120 = Utf8               ()I
  #121 = Utf8               getReceiverId
  #122 = Utf8               getSenderId
  #123 = Utf8               getMailType
  #124 = Utf8               ()Lext/mods/gameserver/enums/MailType;
  #125 = Utf8               setMailType
  #126 = Utf8               (Lext/mods/gameserver/enums/MailType;)V
  #127 = Utf8               mailType
  #128 = Utf8               getRecipients
  #129 = Utf8               getSubject
  #130 = Utf8               getMessage
  #131 = Utf8               getSentDate
  #132 = Utf8               ()Ljava/sql/Timestamp;
  #133 = Utf8               getFormattedSentDate
  #134 = Utf8               ()Z
  #135 = Utf8               setAsRead
  #136 = Utf8               SourceFile
  #137 = Utf8               Mail.java
{
  public ext.mods.gameserver.communitybbs.model.Mail(java.sql.ResultSet) throws java.sql.SQLException;
    descriptor: (Ljava/sql/ResultSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: ldc           #7                  // String id
         8: invokeinterface #9,  2            // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        13: putfield      #15                 // Field _id:I
        16: aload_0
        17: aload_1
        18: ldc           #21                 // String receiver_id
        20: invokeinterface #9,  2            // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        25: putfield      #23                 // Field _receiverId:I
        28: aload_0
        29: aload_1
        30: ldc           #26                 // String sender_id
        32: invokeinterface #9,  2            // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        37: putfield      #28                 // Field _senderId:I
        40: aload_0
        41: ldc           #31                 // class ext/mods/gameserver/enums/MailType
        43: aload_1
        44: ldc           #33                 // String location
        46: invokeinterface #35,  2           // InterfaceMethod java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
        51: invokevirtual #39                 // Method java/lang/String.toUpperCase:()Ljava/lang/String;
        54: invokestatic  #45                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
        57: checkcast     #31                 // class ext/mods/gameserver/enums/MailType
        60: putfield      #51                 // Field _mailType:Lext/mods/gameserver/enums/MailType;
        63: aload_0
        64: aload_1
        65: ldc           #55                 // String recipients
        67: invokeinterface #35,  2           // InterfaceMethod java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
        72: putfield      #57                 // Field _recipients:Ljava/lang/String;
        75: aload_0
        76: aload_1
        77: ldc           #61                 // String subject
        79: invokeinterface #35,  2           // InterfaceMethod java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
        84: putfield      #63                 // Field _subject:Ljava/lang/String;
        87: aload_0
        88: aload_1
        89: ldc           #66                 // String message
        91: invokeinterface #35,  2           // InterfaceMethod java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
        96: putfield      #68                 // Field _message:Ljava/lang/String;
        99: aload_0
       100: aload_1
       101: ldc           #71                 // String sent_date
       103: invokeinterface #73,  2           // InterfaceMethod java/sql/ResultSet.getTimestamp:(Ljava/lang/String;)Ljava/sql/Timestamp;
       108: putfield      #77                 // Field _sentDate:Ljava/sql/Timestamp;
       111: aload_0
       112: new           #81                 // class java/text/SimpleDateFormat
       115: dup
       116: ldc           #83                 // String yyyy-MM-dd HH:mm
       118: invokespecial #85                 // Method java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
       121: aload_0
       122: getfield      #77                 // Field _sentDate:Ljava/sql/Timestamp;
       125: invokevirtual #88                 // Method java/text/SimpleDateFormat.format:(Ljava/util/Date;)Ljava/lang/String;
       128: putfield      #92                 // Field _formattedSentDate:Ljava/lang/String;
       131: aload_0
       132: aload_1
       133: ldc           #95                 // String is_unread
       135: invokeinterface #9,  2            // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       140: ifeq          147
       143: iconst_1
       144: goto          148
       147: iconst_0
       148: putfield      #97                 // Field _isUnread:Z
       151: return
      LineNumberTable:
        line 46: 0
        line 47: 4
        line 48: 16
        line 49: 28
        line 50: 40
        line 51: 63
        line 52: 75
        line 53: 87
        line 54: 99
        line 55: 111
        line 56: 131
        line 57: 151
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     152     0  this   Lext/mods/gameserver/communitybbs/model/Mail;
            0     152     1    rs   Ljava/sql/ResultSet;
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 147
          locals = [ class ext/mods/gameserver/communitybbs/model/Mail, class java/sql/ResultSet ]
          stack = [ class ext/mods/gameserver/communitybbs/model/Mail ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/communitybbs/model/Mail, class java/sql/ResultSet ]
          stack = [ class ext/mods/gameserver/communitybbs/model/Mail, int ]
    Exceptions:
      throws java.sql.SQLException

  public ext.mods.gameserver.communitybbs.model.Mail(int, int, int, ext.mods.gameserver.enums.MailType, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.lang.String, boolean);
    descriptor: (IIILext/mods/gameserver/enums/MailType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/sql/Timestamp;Ljava/lang/String;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=11, args_size=11
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #15                 // Field _id:I
         9: aload_0
        10: iload_2
        11: putfield      #23                 // Field _receiverId:I
        14: aload_0
        15: iload_3
        16: putfield      #28                 // Field _senderId:I
        19: aload_0
        20: aload         4
        22: putfield      #51                 // Field _mailType:Lext/mods/gameserver/enums/MailType;
        25: aload_0
        26: aload         5
        28: putfield      #57                 // Field _recipients:Ljava/lang/String;
        31: aload_0
        32: aload         6
        34: putfield      #63                 // Field _subject:Ljava/lang/String;
        37: aload_0
        38: aload         7
        40: putfield      #68                 // Field _message:Ljava/lang/String;
        43: aload_0
        44: aload         8
        46: putfield      #77                 // Field _sentDate:Ljava/sql/Timestamp;
        49: aload_0
        50: aload         9
        52: putfield      #92                 // Field _formattedSentDate:Ljava/lang/String;
        55: aload_0
        56: iload         10
        58: putfield      #97                 // Field _isUnread:Z
        61: return
      LineNumberTable:
        line 60: 0
        line 61: 4
        line 62: 9
        line 63: 14
        line 64: 19
        line 65: 25
        line 66: 31
        line 67: 37
        line 68: 43
        line 69: 49
        line 70: 55
        line 71: 61
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      62     0  this   Lext/mods/gameserver/communitybbs/model/Mail;
            0      62     1    id   I
            0      62     2 receiverId   I
            0      62     3 senderId   I
            0      62     4 location   Lext/mods/gameserver/enums/MailType;
            0      62     5 recipients   Ljava/lang/String;
            0      62     6 subject   Ljava/lang/String;
            0      62     7 message   Ljava/lang/String;
            0      62     8 sentDate   Ljava/sql/Timestamp;
            0      62     9 formattedSentDate   Ljava/lang/String;
            0      62    10 isUnread   Z

  public int getId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #15                 // Field _id:I
         4: ireturn
      LineNumberTable:
        line 75: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/communitybbs/model/Mail;

  public int getReceiverId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field _receiverId:I
         4: ireturn
      LineNumberTable:
        line 80: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/communitybbs/model/Mail;

  public int getSenderId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #28                 // Field _senderId:I
         4: ireturn
      LineNumberTable:
        line 85: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/communitybbs/model/Mail;

  public ext.mods.gameserver.enums.MailType getMailType();
    descriptor: ()Lext/mods/gameserver/enums/MailType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #51                 // Field _mailType:Lext/mods/gameserver/enums/MailType;
         4: areturn
      LineNumberTable:
        line 90: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/communitybbs/model/Mail;

  public void setMailType(ext.mods.gameserver.enums.MailType);
    descriptor: (Lext/mods/gameserver/enums/MailType;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #51                 // Field _mailType:Lext/mods/gameserver/enums/MailType;
         5: return
      LineNumberTable:
        line 95: 0
        line 96: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/communitybbs/model/Mail;
            0       6     1 mailType   Lext/mods/gameserver/enums/MailType;

  public java.lang.String getRecipients();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #57                 // Field _recipients:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 100: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/communitybbs/model/Mail;

  public java.lang.String getSubject();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #63                 // Field _subject:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 105: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/communitybbs/model/Mail;

  public java.lang.String getMessage();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #68                 // Field _message:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 110: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/communitybbs/model/Mail;

  public java.sql.Timestamp getSentDate();
    descriptor: ()Ljava/sql/Timestamp;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #77                 // Field _sentDate:Ljava/sql/Timestamp;
         4: areturn
      LineNumberTable:
        line 115: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/communitybbs/model/Mail;

  public java.lang.String getFormattedSentDate();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #92                 // Field _formattedSentDate:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 120: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/communitybbs/model/Mail;

  public boolean isUnread();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #97                 // Field _isUnread:Z
         4: ireturn
      LineNumberTable:
        line 125: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/communitybbs/model/Mail;

  public void setAsRead();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: iconst_0
         2: putfield      #97                 // Field _isUnread:Z
         5: return
      LineNumberTable:
        line 130: 0
        line 131: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/communitybbs/model/Mail;
}
SourceFile: "Mail.java"
