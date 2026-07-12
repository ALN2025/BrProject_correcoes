// Bytecode for: ext.mods.gameserver.communitybbs.model.Favorite
// File: ext\mods\gameserver\communitybbs\model\Favorite.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/communitybbs/model/Favorite.class
  Last modified 9 de jul de 2026; size 1613 bytes
  MD5 checksum f6e12559b8d7c853172e6bab6b5ddb15
  Compiled from "Favorite.java"
public class ext.mods.gameserver.communitybbs.model.Favorite
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #16                         // ext/mods/gameserver/communitybbs/model/Favorite
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 5, methods: 7, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = String             #8             // id
   #8 = Utf8               id
   #9 = InterfaceMethodref #10.#11        // java/sql/ResultSet.getInt:(Ljava/lang/String;)I
  #10 = Class              #12            // java/sql/ResultSet
  #11 = NameAndType        #13:#14        // getInt:(Ljava/lang/String;)I
  #12 = Utf8               java/sql/ResultSet
  #13 = Utf8               getInt
  #14 = Utf8               (Ljava/lang/String;)I
  #15 = Fieldref           #16.#17        // ext/mods/gameserver/communitybbs/model/Favorite._id:I
  #16 = Class              #18            // ext/mods/gameserver/communitybbs/model/Favorite
  #17 = NameAndType        #19:#20        // _id:I
  #18 = Utf8               ext/mods/gameserver/communitybbs/model/Favorite
  #19 = Utf8               _id
  #20 = Utf8               I
  #21 = String             #22            // player_id
  #22 = Utf8               player_id
  #23 = Fieldref           #16.#24        // ext/mods/gameserver/communitybbs/model/Favorite._playerId:I
  #24 = NameAndType        #25:#20        // _playerId:I
  #25 = Utf8               _playerId
  #26 = String             #27            // title
  #27 = Utf8               title
  #28 = InterfaceMethodref #10.#29        // java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
  #29 = NameAndType        #30:#31        // getString:(Ljava/lang/String;)Ljava/lang/String;
  #30 = Utf8               getString
  #31 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #32 = Fieldref           #16.#33        // ext/mods/gameserver/communitybbs/model/Favorite._title:Ljava/lang/String;
  #33 = NameAndType        #34:#35        // _title:Ljava/lang/String;
  #34 = Utf8               _title
  #35 = Utf8               Ljava/lang/String;
  #36 = String             #37            // bypass
  #37 = Utf8               bypass
  #38 = Fieldref           #16.#39        // ext/mods/gameserver/communitybbs/model/Favorite._bypass:Ljava/lang/String;
  #39 = NameAndType        #40:#35        // _bypass:Ljava/lang/String;
  #40 = Utf8               _bypass
  #41 = String             #42            // date
  #42 = Utf8               date
  #43 = InterfaceMethodref #10.#44        // java/sql/ResultSet.getTimestamp:(Ljava/lang/String;)Ljava/sql/Timestamp;
  #44 = NameAndType        #45:#46        // getTimestamp:(Ljava/lang/String;)Ljava/sql/Timestamp;
  #45 = Utf8               getTimestamp
  #46 = Utf8               (Ljava/lang/String;)Ljava/sql/Timestamp;
  #47 = Fieldref           #16.#48        // ext/mods/gameserver/communitybbs/model/Favorite._date:Ljava/sql/Timestamp;
  #48 = NameAndType        #49:#50        // _date:Ljava/sql/Timestamp;
  #49 = Utf8               _date
  #50 = Utf8               Ljava/sql/Timestamp;
  #51 = Utf8               (Ljava/sql/ResultSet;)V
  #52 = Utf8               Code
  #53 = Utf8               LineNumberTable
  #54 = Utf8               LocalVariableTable
  #55 = Utf8               this
  #56 = Utf8               Lext/mods/gameserver/communitybbs/model/Favorite;
  #57 = Utf8               rs
  #58 = Utf8               Ljava/sql/ResultSet;
  #59 = Utf8               Exceptions
  #60 = Class              #61            // java/sql/SQLException
  #61 = Utf8               java/sql/SQLException
  #62 = Utf8               (IILjava/lang/String;Ljava/lang/String;Ljava/sql/Timestamp;)V
  #63 = Utf8               playerId
  #64 = Utf8               getId
  #65 = Utf8               ()I
  #66 = Utf8               getPlayerId
  #67 = Utf8               getTitle
  #68 = Utf8               ()Ljava/lang/String;
  #69 = Utf8               getBypass
  #70 = Utf8               getDate
  #71 = Utf8               ()Ljava/sql/Timestamp;
  #72 = Utf8               SourceFile
  #73 = Utf8               Favorite.java
{
  public ext.mods.gameserver.communitybbs.model.Favorite(java.sql.ResultSet) throws java.sql.SQLException;
    descriptor: (Ljava/sql/ResultSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: ldc           #7                  // String id
         8: invokeinterface #9,  2            // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        13: putfield      #15                 // Field _id:I
        16: aload_0
        17: aload_1
        18: ldc           #21                 // String player_id
        20: invokeinterface #9,  2            // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        25: putfield      #23                 // Field _playerId:I
        28: aload_0
        29: aload_1
        30: ldc           #26                 // String title
        32: invokeinterface #28,  2           // InterfaceMethod java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
        37: putfield      #32                 // Field _title:Ljava/lang/String;
        40: aload_0
        41: aload_1
        42: ldc           #36                 // String bypass
        44: invokeinterface #28,  2           // InterfaceMethod java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
        49: putfield      #38                 // Field _bypass:Ljava/lang/String;
        52: aload_0
        53: aload_1
        54: ldc           #41                 // String date
        56: invokeinterface #43,  2           // InterfaceMethod java/sql/ResultSet.getTimestamp:(Ljava/lang/String;)Ljava/sql/Timestamp;
        61: putfield      #47                 // Field _date:Ljava/sql/Timestamp;
        64: return
      LineNumberTable:
        line 35: 0
        line 36: 4
        line 37: 16
        line 38: 28
        line 39: 40
        line 40: 52
        line 41: 64
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      65     0  this   Lext/mods/gameserver/communitybbs/model/Favorite;
            0      65     1    rs   Ljava/sql/ResultSet;
    Exceptions:
      throws java.sql.SQLException

  public ext.mods.gameserver.communitybbs.model.Favorite(int, int, java.lang.String, java.lang.String, java.sql.Timestamp);
    descriptor: (IILjava/lang/String;Ljava/lang/String;Ljava/sql/Timestamp;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=6, args_size=6
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #15                 // Field _id:I
         9: aload_0
        10: iload_2
        11: putfield      #23                 // Field _playerId:I
        14: aload_0
        15: aload_3
        16: putfield      #32                 // Field _title:Ljava/lang/String;
        19: aload_0
        20: aload         4
        22: putfield      #38                 // Field _bypass:Ljava/lang/String;
        25: aload_0
        26: aload         5
        28: putfield      #47                 // Field _date:Ljava/sql/Timestamp;
        31: return
      LineNumberTable:
        line 44: 0
        line 45: 4
        line 46: 9
        line 47: 14
        line 48: 19
        line 49: 25
        line 50: 31
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      32     0  this   Lext/mods/gameserver/communitybbs/model/Favorite;
            0      32     1    id   I
            0      32     2 playerId   I
            0      32     3 title   Ljava/lang/String;
            0      32     4 bypass   Ljava/lang/String;
            0      32     5  date   Ljava/sql/Timestamp;

  public int getId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #15                 // Field _id:I
         4: ireturn
      LineNumberTable:
        line 54: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/communitybbs/model/Favorite;

  public int getPlayerId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field _playerId:I
         4: ireturn
      LineNumberTable:
        line 59: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/communitybbs/model/Favorite;

  public java.lang.String getTitle();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #32                 // Field _title:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 64: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/communitybbs/model/Favorite;

  public java.lang.String getBypass();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #38                 // Field _bypass:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 69: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/communitybbs/model/Favorite;

  public java.sql.Timestamp getDate();
    descriptor: ()Ljava/sql/Timestamp;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #47                 // Field _date:Ljava/sql/Timestamp;
         4: areturn
      LineNumberTable:
        line 74: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/communitybbs/model/Favorite;
}
SourceFile: "Favorite.java"
