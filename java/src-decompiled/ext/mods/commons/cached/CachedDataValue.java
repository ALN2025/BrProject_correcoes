// Bytecode for: ext.mods.commons.cached.CachedDataValue
// File: ext\mods\commons\cached\CachedDataValue.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/cached/CachedDataValue.class
  Last modified 9 de jul de 2026; size 3590 bytes
  MD5 checksum 5d788b1d60fa7e01b1da73014fd99f3c
  Compiled from "CachedDataValue.java"
public class ext.mods.commons.cached.CachedDataValue
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/commons/cached/CachedDataValue
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 8, methods: 8, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/commons/cached/CachedDataValue.dirty:Z
    #8 = Class              #10           // ext/mods/commons/cached/CachedDataValue
    #9 = NameAndType        #11:#12       // dirty:Z
   #10 = Utf8               ext/mods/commons/cached/CachedDataValue
   #11 = Utf8               dirty
   #12 = Utf8               Z
   #13 = Fieldref           #8.#14        // ext/mods/commons/cached/CachedDataValue.valueName:Ljava/lang/String;
   #14 = NameAndType        #15:#16       // valueName:Ljava/lang/String;
   #15 = Utf8               valueName
   #16 = Utf8               Ljava/lang/String;
   #17 = Fieldref           #8.#18        // ext/mods/commons/cached/CachedDataValue.valueData:Ljava/lang/String;
   #18 = NameAndType        #19:#16       // valueData:Ljava/lang/String;
   #19 = Utf8               valueData
   #20 = String             #21           // SELECT `valueData` FROM `character_data` WHERE `valueName`=\'%s\' AND `charId`=%d LIMIT 1
   #21 = Utf8               SELECT `valueData` FROM `character_data` WHERE `valueName`=\'%s\' AND `charId`=%d LIMIT 1
   #22 = Methodref          #23.#24       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #23 = Class              #25           // java/lang/Integer
   #24 = NameAndType        #26:#27       // valueOf:(I)Ljava/lang/Integer;
   #25 = Utf8               java/lang/Integer
   #26 = Utf8               valueOf
   #27 = Utf8               (I)Ljava/lang/Integer;
   #28 = Methodref          #29.#30       // java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
   #29 = Class              #31           // java/lang/String
   #30 = NameAndType        #32:#33       // format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
   #31 = Utf8               java/lang/String
   #32 = Utf8               format
   #33 = Utf8               (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
   #34 = Fieldref           #8.#35        // ext/mods/commons/cached/CachedDataValue.compiledLoadQuery:Ljava/lang/String;
   #35 = NameAndType        #36:#16       // compiledLoadQuery:Ljava/lang/String;
   #36 = Utf8               compiledLoadQuery
   #37 = String             #38           // INSERT INTO `character_data` (`charId`, `valueName`, `valueData`) VALUES (%d, \'%s\', ?) ON DUPLICATE KEY UPDATE `valueData`=?
   #38 = Utf8               INSERT INTO `character_data` (`charId`, `valueName`, `valueData`) VALUES (%d, \'%s\', ?) ON DUPLICATE KEY UPDATE `valueData`=?
   #39 = Fieldref           #8.#40        // ext/mods/commons/cached/CachedDataValue.compiledUpdateQuery:Ljava/lang/String;
   #40 = NameAndType        #41:#16       // compiledUpdateQuery:Ljava/lang/String;
   #41 = Utf8               compiledUpdateQuery
   #42 = Methodref          #8.#43        // ext/mods/commons/cached/CachedDataValue.save:()V
   #43 = NameAndType        #44:#6        // save:()V
   #44 = Utf8               save
   #45 = Methodref          #46.#47       // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
   #46 = Class              #48           // ext/mods/commons/pool/ConnectionPool
   #47 = NameAndType        #49:#50       // getConnection:()Ljava/sql/Connection;
   #48 = Utf8               ext/mods/commons/pool/ConnectionPool
   #49 = Utf8               getConnection
   #50 = Utf8               ()Ljava/sql/Connection;
   #51 = InterfaceMethodref #52.#53       // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #52 = Class              #54           // java/sql/Connection
   #53 = NameAndType        #55:#56       // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #54 = Utf8               java/sql/Connection
   #55 = Utf8               prepareStatement
   #56 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #57 = InterfaceMethodref #58.#59       // java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
   #58 = Class              #60           // java/sql/PreparedStatement
   #59 = NameAndType        #61:#62       // setString:(ILjava/lang/String;)V
   #60 = Utf8               java/sql/PreparedStatement
   #61 = Utf8               setString
   #62 = Utf8               (ILjava/lang/String;)V
   #63 = InterfaceMethodref #58.#64       // java/sql/PreparedStatement.executeUpdate:()I
   #64 = NameAndType        #65:#66       // executeUpdate:()I
   #65 = Utf8               executeUpdate
   #66 = Utf8               ()I
   #67 = InterfaceMethodref #58.#68       // java/sql/PreparedStatement.close:()V
   #68 = NameAndType        #69:#6        // close:()V
   #69 = Utf8               close
   #70 = Class              #71           // java/lang/Throwable
   #71 = Utf8               java/lang/Throwable
   #72 = Methodref          #70.#73       // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
   #73 = NameAndType        #74:#75       // addSuppressed:(Ljava/lang/Throwable;)V
   #74 = Utf8               addSuppressed
   #75 = Utf8               (Ljava/lang/Throwable;)V
   #76 = InterfaceMethodref #52.#68       // java/sql/Connection.close:()V
   #77 = Class              #78           // java/sql/SQLException
   #78 = Utf8               java/sql/SQLException
   #79 = Fieldref           #8.#80        // ext/mods/commons/cached/CachedDataValue.LOGGER:Lext/mods/commons/logging/CLogger;
   #80 = NameAndType        #81:#82       // LOGGER:Lext/mods/commons/logging/CLogger;
   #81 = Utf8               LOGGER
   #82 = Utf8               Lext/mods/commons/logging/CLogger;
   #83 = String             #84           // Failed save({}) character_data
   #84 = Utf8               Failed save({}) character_data
   #85 = Methodref          #86.#87       // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
   #86 = Class              #88           // ext/mods/commons/logging/CLogger
   #87 = NameAndType        #89:#90       // error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
   #88 = Utf8               ext/mods/commons/logging/CLogger
   #89 = Utf8               error
   #90 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
   #91 = InterfaceMethodref #58.#92       // java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
   #92 = NameAndType        #93:#94       // executeQuery:()Ljava/sql/ResultSet;
   #93 = Utf8               executeQuery
   #94 = Utf8               ()Ljava/sql/ResultSet;
   #95 = InterfaceMethodref #96.#97       // java/sql/ResultSet.next:()Z
   #96 = Class              #98           // java/sql/ResultSet
   #97 = NameAndType        #99:#100      // next:()Z
   #98 = Utf8               java/sql/ResultSet
   #99 = Utf8               next
  #100 = Utf8               ()Z
  #101 = InterfaceMethodref #96.#102      // java/sql/ResultSet.getString:(I)Ljava/lang/String;
  #102 = NameAndType        #103:#104     // getString:(I)Ljava/lang/String;
  #103 = Utf8               getString
  #104 = Utf8               (I)Ljava/lang/String;
  #105 = InterfaceMethodref #96.#68       // java/sql/ResultSet.close:()V
  #106 = String             #107          // Failed load({}) character_data
  #107 = Utf8               Failed load({}) character_data
  #108 = Methodref          #109.#110     // java/lang/Class.getName:()Ljava/lang/String;
  #109 = Class              #111          // java/lang/Class
  #110 = NameAndType        #112:#113     // getName:()Ljava/lang/String;
  #111 = Utf8               java/lang/Class
  #112 = Utf8               getName
  #113 = Utf8               ()Ljava/lang/String;
  #114 = Methodref          #86.#115      // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #115 = NameAndType        #5:#116       // "<init>":(Ljava/lang/String;)V
  #116 = Utf8               (Ljava/lang/String;)V
  #117 = Utf8               LOAD_QUERY
  #118 = Utf8               ConstantValue
  #119 = Utf8               UPDATE_QUERY
  #120 = Utf8               (Ljava/lang/String;Ljava/lang/String;I)V
  #121 = Utf8               Code
  #122 = Utf8               LineNumberTable
  #123 = Utf8               LocalVariableTable
  #124 = Utf8               this
  #125 = Utf8               Lext/mods/commons/cached/CachedDataValue;
  #126 = Utf8               defaultValue
  #127 = Utf8               charId
  #128 = Utf8               I
  #129 = Utf8               getKey
  #130 = Utf8               update
  #131 = Utf8               StackMapTable
  #132 = Utf8               stmt
  #133 = Utf8               Ljava/sql/PreparedStatement;
  #134 = Utf8               conn
  #135 = Utf8               Ljava/sql/Connection;
  #136 = Utf8               e
  #137 = Utf8               Ljava/sql/SQLException;
  #138 = Utf8               load
  #139 = Utf8               rs
  #140 = Utf8               Ljava/sql/ResultSet;
  #141 = Utf8               setValue
  #142 = Utf8               value
  #143 = Utf8               getValue
  #144 = Utf8               <clinit>
  #145 = Utf8               SourceFile
  #146 = Utf8               CachedDataValue.java
{
  public static final ext.mods.commons.logging.CLogger LOGGER;
    descriptor: Lext/mods/commons/logging/CLogger;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  ext.mods.commons.cached.CachedDataValue(java.lang.String, java.lang.String, int);
    descriptor: (Ljava/lang/String;Ljava/lang/String;I)V
    flags: (0x0000)
    Code:
      stack=6, locals=4, args_size=4
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iconst_0
         6: putfield      #7                  // Field dirty:Z
         9: aload_0
        10: aload_1
        11: putfield      #13                 // Field valueName:Ljava/lang/String;
        14: aload_0
        15: aload_2
        16: putfield      #17                 // Field valueData:Ljava/lang/String;
        19: aload_0
        20: ldc           #20                 // String SELECT `valueData` FROM `character_data` WHERE `valueName`=\'%s\' AND `charId`=%d LIMIT 1
        22: iconst_2
        23: anewarray     #2                  // class java/lang/Object
        26: dup
        27: iconst_0
        28: aload_1
        29: aastore
        30: dup
        31: iconst_1
        32: iload_3
        33: invokestatic  #22                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        36: aastore
        37: invokestatic  #28                 // Method java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        40: putfield      #34                 // Field compiledLoadQuery:Ljava/lang/String;
        43: aload_0
        44: ldc           #37                 // String INSERT INTO `character_data` (`charId`, `valueName`, `valueData`) VALUES (%d, \'%s\', ?) ON DUPLICATE KEY UPDATE `valueData`=?
        46: iconst_2
        47: anewarray     #2                  // class java/lang/Object
        50: dup
        51: iconst_0
        52: iload_3
        53: invokestatic  #22                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        56: aastore
        57: dup
        58: iconst_1
        59: aload_1
        60: aastore
        61: invokestatic  #28                 // Method java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        64: putfield      #39                 // Field compiledUpdateQuery:Ljava/lang/String;
        67: return
      LineNumberTable:
        line 42: 0
        line 39: 4
        line 43: 9
        line 44: 14
        line 45: 19
        line 46: 43
        line 47: 67
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      68     0  this   Lext/mods/commons/cached/CachedDataValue;
            0      68     1 valueName   Ljava/lang/String;
            0      68     2 defaultValue   Ljava/lang/String;
            0      68     3 charId   I

  public java.lang.String getKey();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field valueName:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 51: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/cached/CachedDataValue;

  synchronized void update();
    descriptor: ()V
    flags: (0x0020) ACC_SYNCHRONIZED
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field dirty:Z
         4: ifeq          16
         7: aload_0
         8: invokevirtual #42                 // Method save:()V
        11: aload_0
        12: iconst_0
        13: putfield      #7                  // Field dirty:Z
        16: return
      LineNumberTable:
        line 56: 0
        line 58: 7
        line 59: 11
        line 61: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/commons/cached/CachedDataValue;
      StackMapTable: number_of_entries = 1
        frame_type = 16 /* same */

  void save();
    descriptor: ()V
    flags: (0x0000)
    Code:
      stack=7, locals=5, args_size=1
         0: invokestatic  #45                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         3: astore_1
         4: aload_1
         5: aload_0
         6: getfield      #39                 // Field compiledUpdateQuery:Ljava/lang/String;
         9: invokeinterface #51,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        14: astore_2
        15: aload_2
        16: iconst_1
        17: aload_0
        18: getfield      #17                 // Field valueData:Ljava/lang/String;
        21: invokeinterface #57,  3           // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
        26: aload_2
        27: iconst_2
        28: aload_0
        29: getfield      #17                 // Field valueData:Ljava/lang/String;
        32: invokeinterface #57,  3           // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
        37: aload_2
        38: invokeinterface #63,  1           // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
        43: pop
        44: aload_2
        45: ifnull        81
        48: aload_2
        49: invokeinterface #67,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
        54: goto          81
        57: astore_3
        58: aload_2
        59: ifnull        79
        62: aload_2
        63: invokeinterface #67,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
        68: goto          79
        71: astore        4
        73: aload_3
        74: aload         4
        76: invokevirtual #72                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        79: aload_3
        80: athrow
        81: aload_1
        82: ifnull        116
        85: aload_1
        86: invokeinterface #76,  1           // InterfaceMethod java/sql/Connection.close:()V
        91: goto          116
        94: astore_2
        95: aload_1
        96: ifnull        114
        99: aload_1
       100: invokeinterface #76,  1           // InterfaceMethod java/sql/Connection.close:()V
       105: goto          114
       108: astore_3
       109: aload_2
       110: aload_3
       111: invokevirtual #72                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       114: aload_2
       115: athrow
       116: goto          140
       119: astore_1
       120: getstatic     #79                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       123: ldc           #83                 // String Failed save({}) character_data
       125: aload_1
       126: iconst_1
       127: anewarray     #2                  // class java/lang/Object
       130: dup
       131: iconst_0
       132: aload_0
       133: getfield      #13                 // Field valueName:Ljava/lang/String;
       136: aastore
       137: invokevirtual #85                 // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
       140: return
      Exception table:
         from    to  target type
            15    44    57   Class java/lang/Throwable
            62    68    71   Class java/lang/Throwable
             4    81    94   Class java/lang/Throwable
            99   105   108   Class java/lang/Throwable
             0   116   119   Class java/sql/SQLException
      LineNumberTable:
        line 65: 0
        line 66: 4
        line 68: 15
        line 69: 26
        line 70: 37
        line 71: 44
        line 65: 57
        line 71: 81
        line 65: 94
        line 75: 116
        line 72: 119
        line 74: 120
        line 76: 140
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           15      66     2  stmt   Ljava/sql/PreparedStatement;
            4     112     1  conn   Ljava/sql/Connection;
          120      20     1     e   Ljava/sql/SQLException;
            0     141     0  this   Lext/mods/commons/cached/CachedDataValue;
      StackMapTable: number_of_entries = 10
        frame_type = 255 /* full_frame */
          offset_delta = 57
          locals = [ class ext/mods/commons/cached/CachedDataValue, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/commons/cached/CachedDataValue, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/commons/cached/CachedDataValue, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/sql/SQLException ]
        frame_type = 20 /* same */

  void load();
    descriptor: ()V
    flags: (0x0000)
    Code:
      stack=7, locals=6, args_size=1
         0: invokestatic  #45                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         3: astore_1
         4: aload_1
         5: aload_0
         6: getfield      #34                 // Field compiledLoadQuery:Ljava/lang/String;
         9: invokeinterface #51,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        14: astore_2
        15: aload_2
        16: invokeinterface #91,  1           // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
        21: astore_3
        22: aload_3
        23: invokeinterface #95,  1           // InterfaceMethod java/sql/ResultSet.next:()Z
        28: ifeq          45
        31: aload_0
        32: aload_3
        33: iconst_1
        34: invokeinterface #101,  2          // InterfaceMethod java/sql/ResultSet.getString:(I)Ljava/lang/String;
        39: putfield      #17                 // Field valueData:Ljava/lang/String;
        42: goto          22
        45: aload_3
        46: ifnull        85
        49: aload_3
        50: invokeinterface #105,  1          // InterfaceMethod java/sql/ResultSet.close:()V
        55: goto          85
        58: astore        4
        60: aload_3
        61: ifnull        82
        64: aload_3
        65: invokeinterface #105,  1          // InterfaceMethod java/sql/ResultSet.close:()V
        70: goto          82
        73: astore        5
        75: aload         4
        77: aload         5
        79: invokevirtual #72                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        82: aload         4
        84: athrow
        85: aload_2
        86: ifnull        122
        89: aload_2
        90: invokeinterface #67,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
        95: goto          122
        98: astore_3
        99: aload_2
       100: ifnull        120
       103: aload_2
       104: invokeinterface #67,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       109: goto          120
       112: astore        4
       114: aload_3
       115: aload         4
       117: invokevirtual #72                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       120: aload_3
       121: athrow
       122: aload_1
       123: ifnull        157
       126: aload_1
       127: invokeinterface #76,  1           // InterfaceMethod java/sql/Connection.close:()V
       132: goto          157
       135: astore_2
       136: aload_1
       137: ifnull        155
       140: aload_1
       141: invokeinterface #76,  1           // InterfaceMethod java/sql/Connection.close:()V
       146: goto          155
       149: astore_3
       150: aload_2
       151: aload_3
       152: invokevirtual #72                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       155: aload_2
       156: athrow
       157: goto          181
       160: astore_1
       161: getstatic     #79                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       164: ldc           #106                // String Failed load({}) character_data
       166: aload_1
       167: iconst_1
       168: anewarray     #2                  // class java/lang/Object
       171: dup
       172: iconst_0
       173: aload_0
       174: getfield      #13                 // Field valueName:Ljava/lang/String;
       177: aastore
       178: invokevirtual #85                 // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
       181: return
      Exception table:
         from    to  target type
            22    45    58   Class java/lang/Throwable
            64    70    73   Class java/lang/Throwable
            15    85    98   Class java/lang/Throwable
           103   109   112   Class java/lang/Throwable
             4   122   135   Class java/lang/Throwable
           140   146   149   Class java/lang/Throwable
             0   157   160   Class java/sql/SQLException
      LineNumberTable:
        line 80: 0
        line 81: 4
        line 83: 15
        line 85: 22
        line 86: 31
        line 87: 45
        line 83: 58
        line 88: 85
        line 80: 98
        line 88: 122
        line 80: 135
        line 92: 157
        line 89: 160
        line 91: 161
        line 93: 181
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           22      63     3    rs   Ljava/sql/ResultSet;
           15     107     2  stmt   Ljava/sql/PreparedStatement;
            4     153     1  conn   Ljava/sql/Connection;
          161      20     1     e   Ljava/sql/SQLException;
            0     182     0  this   Lext/mods/commons/cached/CachedDataValue;
      StackMapTable: number_of_entries = 16
        frame_type = 254 /* append */
          offset_delta = 22
          locals = [ class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet ]
        frame_type = 22 /* same */
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/commons/cached/CachedDataValue, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/commons/cached/CachedDataValue, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/commons/cached/CachedDataValue, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/sql/SQLException ]
        frame_type = 20 /* same */

  public synchronized void setValue(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #17                 // Field valueData:Ljava/lang/String;
         5: aload_0
         6: iconst_1
         7: putfield      #7                  // Field dirty:Z
        10: return
      LineNumberTable:
        line 97: 0
        line 98: 5
        line 99: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/commons/cached/CachedDataValue;
            0      11     1 value   Ljava/lang/String;

  public java.lang.String getValue();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field valueData:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 103: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/cached/CachedDataValue;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #86                 // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #8                  // class ext/mods/commons/cached/CachedDataValue
         6: invokevirtual #108                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #114                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #79                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 27: 0
}
SourceFile: "CachedDataValue.java"
