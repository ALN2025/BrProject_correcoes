// Bytecode for: ext.mods.gameserver.data.sql.ServerMemoTable
// File: ext\mods\gameserver\data\sql\ServerMemoTable.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/sql/ServerMemoTable.class
  Last modified 9 de jul de 2026; size 3925 bytes
  MD5 checksum e47dd681fdfe2a22f12689a81dbe1b80
  Compiled from "ServerMemoTable.java"
public class ext.mods.gameserver.data.sql.ServerMemoTable extends ext.mods.commons.data.MemoSet
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #13                         // ext/mods/gameserver/data/sql/ServerMemoTable
  super_class: #2                         // ext/mods/commons/data/MemoSet
  interfaces: 0, fields: 5, methods: 5, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/commons/data/MemoSet."<init>":()V
    #2 = Class              #4            // ext/mods/commons/data/MemoSet
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               ext/mods/commons/data/MemoSet
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
    #8 = Class              #10           // ext/mods/commons/pool/ConnectionPool
    #9 = NameAndType        #11:#12       // getConnection:()Ljava/sql/Connection;
   #10 = Utf8               ext/mods/commons/pool/ConnectionPool
   #11 = Utf8               getConnection
   #12 = Utf8               ()Ljava/sql/Connection;
   #13 = Class              #14           // ext/mods/gameserver/data/sql/ServerMemoTable
   #14 = Utf8               ext/mods/gameserver/data/sql/ServerMemoTable
   #15 = String             #16           // SELECT * FROM server_memo
   #16 = Utf8               SELECT * FROM server_memo
   #17 = InterfaceMethodref #18.#19       // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #18 = Class              #20           // java/sql/Connection
   #19 = NameAndType        #21:#22       // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #20 = Utf8               java/sql/Connection
   #21 = Utf8               prepareStatement
   #22 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #23 = InterfaceMethodref #24.#25       // java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
   #24 = Class              #26           // java/sql/PreparedStatement
   #25 = NameAndType        #27:#28       // executeQuery:()Ljava/sql/ResultSet;
   #26 = Utf8               java/sql/PreparedStatement
   #27 = Utf8               executeQuery
   #28 = Utf8               ()Ljava/sql/ResultSet;
   #29 = InterfaceMethodref #30.#31       // java/sql/ResultSet.next:()Z
   #30 = Class              #32           // java/sql/ResultSet
   #31 = NameAndType        #33:#34       // next:()Z
   #32 = Utf8               java/sql/ResultSet
   #33 = Utf8               next
   #34 = Utf8               ()Z
   #35 = String             #36           // var
   #36 = Utf8               var
   #37 = InterfaceMethodref #30.#38       // java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
   #38 = NameAndType        #39:#40       // getString:(Ljava/lang/String;)Ljava/lang/String;
   #39 = Utf8               getString
   #40 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #41 = String             #42           // value
   #42 = Utf8               value
   #43 = Methodref          #13.#44       // ext/mods/gameserver/data/sql/ServerMemoTable.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #44 = NameAndType        #45:#46       // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #45 = Utf8               put
   #46 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #47 = InterfaceMethodref #30.#48       // java/sql/ResultSet.close:()V
   #48 = NameAndType        #49:#6        // close:()V
   #49 = Utf8               close
   #50 = Class              #51           // java/lang/Throwable
   #51 = Utf8               java/lang/Throwable
   #52 = Methodref          #50.#53       // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
   #53 = NameAndType        #54:#55       // addSuppressed:(Ljava/lang/Throwable;)V
   #54 = Utf8               addSuppressed
   #55 = Utf8               (Ljava/lang/Throwable;)V
   #56 = InterfaceMethodref #24.#48       // java/sql/PreparedStatement.close:()V
   #57 = InterfaceMethodref #18.#48       // java/sql/Connection.close:()V
   #58 = Class              #59           // java/lang/Exception
   #59 = Utf8               java/lang/Exception
   #60 = Fieldref           #13.#61       // ext/mods/gameserver/data/sql/ServerMemoTable.LOGGER:Lext/mods/commons/logging/CLogger;
   #61 = NameAndType        #62:#63       // LOGGER:Lext/mods/commons/logging/CLogger;
   #62 = Utf8               LOGGER
   #63 = Utf8               Lext/mods/commons/logging/CLogger;
   #64 = String             #65           // Couldn\'t restore server variables.
   #65 = Utf8               Couldn\'t restore server variables.
   #66 = Methodref          #67.#68       // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
   #67 = Class              #69           // ext/mods/commons/logging/CLogger
   #68 = NameAndType        #70:#71       // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
   #69 = Utf8               ext/mods/commons/logging/CLogger
   #70 = Utf8               error
   #71 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
   #72 = String             #73           // Loaded {} server variables.
   #73 = Utf8               Loaded {} server variables.
   #74 = Class              #75           // java/lang/Object
   #75 = Utf8               java/lang/Object
   #76 = Methodref          #13.#77       // ext/mods/gameserver/data/sql/ServerMemoTable.size:()I
   #77 = NameAndType        #78:#79       // size:()I
   #78 = Utf8               size
   #79 = Utf8               ()I
   #80 = Methodref          #81.#82       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #81 = Class              #83           // java/lang/Integer
   #82 = NameAndType        #84:#85       // valueOf:(I)Ljava/lang/Integer;
   #83 = Utf8               java/lang/Integer
   #84 = Utf8               valueOf
   #85 = Utf8               (I)Ljava/lang/Integer;
   #86 = Methodref          #67.#87       // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #87 = NameAndType        #88:#89       // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #88 = Utf8               info
   #89 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
   #90 = String             #91           // INSERT INTO server_memo (var, value) VALUES (?, ?) ON DUPLICATE KEY UPDATE value = VALUES(value)
   #91 = Utf8               INSERT INTO server_memo (var, value) VALUES (?, ?) ON DUPLICATE KEY UPDATE value = VALUES(value)
   #92 = InterfaceMethodref #24.#93       // java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
   #93 = NameAndType        #94:#95       // setString:(ILjava/lang/String;)V
   #94 = Utf8               setString
   #95 = Utf8               (ILjava/lang/String;)V
   #96 = InterfaceMethodref #24.#97       // java/sql/PreparedStatement.execute:()Z
   #97 = NameAndType        #98:#34       // execute:()Z
   #98 = Utf8               execute
   #99 = String             #100          // Couldn\'t set {} server memo.
  #100 = Utf8               Couldn\'t set {} server memo.
  #101 = Methodref          #67.#102      // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #102 = NameAndType        #70:#103      // error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #103 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #104 = String             #105          // DELETE FROM server_memo WHERE var = ?
  #105 = Utf8               DELETE FROM server_memo WHERE var = ?
  #106 = String             #107          // Couldn\'t unset {} server memo.
  #107 = Utf8               Couldn\'t unset {} server memo.
  #108 = Fieldref           #109.#110     // ext/mods/gameserver/data/sql/ServerMemoTable$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/sql/ServerMemoTable;
  #109 = Class              #111          // ext/mods/gameserver/data/sql/ServerMemoTable$SingletonHolder
  #110 = NameAndType        #112:#113     // INSTANCE:Lext/mods/gameserver/data/sql/ServerMemoTable;
  #111 = Utf8               ext/mods/gameserver/data/sql/ServerMemoTable$SingletonHolder
  #112 = Utf8               INSTANCE
  #113 = Utf8               Lext/mods/gameserver/data/sql/ServerMemoTable;
  #114 = Methodref          #115.#116     // java/lang/Class.getName:()Ljava/lang/String;
  #115 = Class              #117          // java/lang/Class
  #116 = NameAndType        #118:#119     // getName:()Ljava/lang/String;
  #117 = Utf8               java/lang/Class
  #118 = Utf8               getName
  #119 = Utf8               ()Ljava/lang/String;
  #120 = Methodref          #67.#121      // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #121 = NameAndType        #5:#122       // "<init>":(Ljava/lang/String;)V
  #122 = Utf8               (Ljava/lang/String;)V
  #123 = Utf8               serialVersionUID
  #124 = Utf8               J
  #125 = Utf8               ConstantValue
  #126 = Long               1l
  #128 = Utf8               SELECT_MEMOS
  #129 = Utf8               Ljava/lang/String;
  #130 = Utf8               DELETE_MEMO
  #131 = Utf8               INSERT_OR_UPDATE_MEMO
  #132 = Utf8               Code
  #133 = Utf8               LineNumberTable
  #134 = Utf8               LocalVariableTable
  #135 = Utf8               rs
  #136 = Utf8               Ljava/sql/ResultSet;
  #137 = Utf8               ps
  #138 = Utf8               Ljava/sql/PreparedStatement;
  #139 = Utf8               con
  #140 = Utf8               Ljava/sql/Connection;
  #141 = Utf8               e
  #142 = Utf8               Ljava/lang/Exception;
  #143 = Utf8               this
  #144 = Utf8               StackMapTable
  #145 = Utf8               onSet
  #146 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #147 = Utf8               key
  #148 = Class              #149          // java/lang/String
  #149 = Utf8               java/lang/String
  #150 = Utf8               onUnset
  #151 = Utf8               getInstance
  #152 = Utf8               ()Lext/mods/gameserver/data/sql/ServerMemoTable;
  #153 = Utf8               <clinit>
  #154 = Utf8               SourceFile
  #155 = Utf8               ServerMemoTable.java
  #156 = Utf8               NestMembers
  #157 = Utf8               InnerClasses
  #158 = Utf8               SingletonHolder
{
  protected ext.mods.gameserver.data.sql.ServerMemoTable();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=6, locals=6, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/commons/data/MemoSet."<init>":()V
         4: invokestatic  #7                  // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         7: astore_1
         8: aload_1
         9: ldc           #15                 // String SELECT * FROM server_memo
        11: invokeinterface #17,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        16: astore_2
        17: aload_2
        18: invokeinterface #23,  1           // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
        23: astore_3
        24: aload_3
        25: invokeinterface #29,  1           // InterfaceMethod java/sql/ResultSet.next:()Z
        30: ifeq          57
        33: aload_0
        34: aload_3
        35: ldc           #35                 // String var
        37: invokeinterface #37,  2           // InterfaceMethod java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
        42: aload_3
        43: ldc           #41                 // String value
        45: invokeinterface #37,  2           // InterfaceMethod java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
        50: invokevirtual #43                 // Method put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        53: pop
        54: goto          24
        57: aload_3
        58: ifnull        97
        61: aload_3
        62: invokeinterface #47,  1           // InterfaceMethod java/sql/ResultSet.close:()V
        67: goto          97
        70: astore        4
        72: aload_3
        73: ifnull        94
        76: aload_3
        77: invokeinterface #47,  1           // InterfaceMethod java/sql/ResultSet.close:()V
        82: goto          94
        85: astore        5
        87: aload         4
        89: aload         5
        91: invokevirtual #52                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        94: aload         4
        96: athrow
        97: aload_2
        98: ifnull        134
       101: aload_2
       102: invokeinterface #56,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       107: goto          134
       110: astore_3
       111: aload_2
       112: ifnull        132
       115: aload_2
       116: invokeinterface #56,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       121: goto          132
       124: astore        4
       126: aload_3
       127: aload         4
       129: invokevirtual #52                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       132: aload_3
       133: athrow
       134: aload_1
       135: ifnull        169
       138: aload_1
       139: invokeinterface #57,  1           // InterfaceMethod java/sql/Connection.close:()V
       144: goto          169
       147: astore_2
       148: aload_1
       149: ifnull        167
       152: aload_1
       153: invokeinterface #57,  1           // InterfaceMethod java/sql/Connection.close:()V
       158: goto          167
       161: astore_3
       162: aload_2
       163: aload_3
       164: invokevirtual #52                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       167: aload_2
       168: athrow
       169: goto          182
       172: astore_1
       173: getstatic     #60                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       176: ldc           #64                 // String Couldn\'t restore server variables.
       178: aload_1
       179: invokevirtual #66                 // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       182: getstatic     #60                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       185: ldc           #72                 // String Loaded {} server variables.
       187: iconst_1
       188: anewarray     #74                 // class java/lang/Object
       191: dup
       192: iconst_0
       193: aload_0
       194: invokevirtual #76                 // Method size:()I
       197: invokestatic  #80                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       200: aastore
       201: invokevirtual #86                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
       204: return
      Exception table:
         from    to  target type
            24    57    70   Class java/lang/Throwable
            76    82    85   Class java/lang/Throwable
            17    97   110   Class java/lang/Throwable
           115   121   124   Class java/lang/Throwable
             8   134   147   Class java/lang/Throwable
           152   158   161   Class java/lang/Throwable
             4   169   172   Class java/lang/Exception
      LineNumberTable:
        line 42: 0
        line 43: 4
        line 44: 8
        line 45: 17
        line 47: 24
        line 48: 33
        line 49: 57
        line 43: 70
        line 49: 97
        line 43: 110
        line 49: 134
        line 43: 147
        line 53: 169
        line 50: 172
        line 52: 173
        line 54: 182
        line 55: 204
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           24      73     3    rs   Ljava/sql/ResultSet;
           17     117     2    ps   Ljava/sql/PreparedStatement;
            8     161     1   con   Ljava/sql/Connection;
          173       9     1     e   Ljava/lang/Exception;
            0     205     0  this   Lext/mods/gameserver/data/sql/ServerMemoTable;
      StackMapTable: number_of_entries = 16
        frame_type = 255 /* full_frame */
          offset_delta = 24
          locals = [ class ext/mods/gameserver/data/sql/ServerMemoTable, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet ]
          stack = []
        frame_type = 32 /* same */
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/data/sql/ServerMemoTable, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/data/sql/ServerMemoTable, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/data/sql/ServerMemoTable, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 9 /* same */

  protected void onSet(java.lang.String, java.lang.String);
    descriptor: (Ljava/lang/String;Ljava/lang/String;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=7, locals=7, args_size=3
         0: invokestatic  #7                  // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         3: astore_3
         4: aload_3
         5: ldc           #90                 // String INSERT INTO server_memo (var, value) VALUES (?, ?) ON DUPLICATE KEY UPDATE value = VALUES(value)
         7: invokeinterface #17,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        12: astore        4
        14: aload         4
        16: iconst_1
        17: aload_1
        18: invokeinterface #92,  3           // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
        23: aload         4
        25: iconst_2
        26: aload_2
        27: invokeinterface #92,  3           // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
        32: aload         4
        34: invokeinterface #96,  1           // InterfaceMethod java/sql/PreparedStatement.execute:()Z
        39: pop
        40: aload         4
        42: ifnull        84
        45: aload         4
        47: invokeinterface #56,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
        52: goto          84
        55: astore        5
        57: aload         4
        59: ifnull        81
        62: aload         4
        64: invokeinterface #56,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
        69: goto          81
        72: astore        6
        74: aload         5
        76: aload         6
        78: invokevirtual #52                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        81: aload         5
        83: athrow
        84: aload_3
        85: ifnull        124
        88: aload_3
        89: invokeinterface #57,  1           // InterfaceMethod java/sql/Connection.close:()V
        94: goto          124
        97: astore        4
        99: aload_3
       100: ifnull        121
       103: aload_3
       104: invokeinterface #57,  1           // InterfaceMethod java/sql/Connection.close:()V
       109: goto          121
       112: astore        5
       114: aload         4
       116: aload         5
       118: invokevirtual #52                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       121: aload         4
       123: athrow
       124: goto          145
       127: astore_3
       128: getstatic     #60                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       131: ldc           #99                 // String Couldn\'t set {} server memo.
       133: aload_3
       134: iconst_1
       135: anewarray     #74                 // class java/lang/Object
       138: dup
       139: iconst_0
       140: aload_1
       141: aastore
       142: invokevirtual #101                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
       145: return
      Exception table:
         from    to  target type
            14    40    55   Class java/lang/Throwable
            62    69    72   Class java/lang/Throwable
             4    84    97   Class java/lang/Throwable
           103   109   112   Class java/lang/Throwable
             0   124   127   Class java/lang/Exception
      LineNumberTable:
        line 60: 0
        line 61: 4
        line 63: 14
        line 64: 23
        line 65: 32
        line 66: 40
        line 60: 55
        line 66: 84
        line 60: 97
        line 70: 124
        line 67: 127
        line 69: 128
        line 71: 145
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           14      70     4    ps   Ljava/sql/PreparedStatement;
            4     120     3   con   Ljava/sql/Connection;
          128      17     3     e   Ljava/lang/Exception;
            0     146     0  this   Lext/mods/gameserver/data/sql/ServerMemoTable;
            0     146     1   key   Ljava/lang/String;
            0     146     2 value   Ljava/lang/String;
      StackMapTable: number_of_entries = 10
        frame_type = 255 /* full_frame */
          offset_delta = 55
          locals = [ class ext/mods/gameserver/data/sql/ServerMemoTable, class java/lang/String, class java/lang/String, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/data/sql/ServerMemoTable, class java/lang/String, class java/lang/String, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/data/sql/ServerMemoTable, class java/lang/String, class java/lang/String, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 17 /* same */

  protected void onUnset(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=7, locals=6, args_size=2
         0: invokestatic  #7                  // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         3: astore_2
         4: aload_2
         5: ldc           #104                // String DELETE FROM server_memo WHERE var = ?
         7: invokeinterface #17,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        12: astore_3
        13: aload_3
        14: iconst_1
        15: aload_1
        16: invokeinterface #92,  3           // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
        21: aload_3
        22: invokeinterface #96,  1           // InterfaceMethod java/sql/PreparedStatement.execute:()Z
        27: pop
        28: aload_3
        29: ifnull        68
        32: aload_3
        33: invokeinterface #56,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
        38: goto          68
        41: astore        4
        43: aload_3
        44: ifnull        65
        47: aload_3
        48: invokeinterface #56,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
        53: goto          65
        56: astore        5
        58: aload         4
        60: aload         5
        62: invokevirtual #52                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        65: aload         4
        67: athrow
        68: aload_2
        69: ifnull        105
        72: aload_2
        73: invokeinterface #57,  1           // InterfaceMethod java/sql/Connection.close:()V
        78: goto          105
        81: astore_3
        82: aload_2
        83: ifnull        103
        86: aload_2
        87: invokeinterface #57,  1           // InterfaceMethod java/sql/Connection.close:()V
        92: goto          103
        95: astore        4
        97: aload_3
        98: aload         4
       100: invokevirtual #52                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       103: aload_3
       104: athrow
       105: goto          126
       108: astore_2
       109: getstatic     #60                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       112: ldc           #106                // String Couldn\'t unset {} server memo.
       114: aload_2
       115: iconst_1
       116: anewarray     #74                 // class java/lang/Object
       119: dup
       120: iconst_0
       121: aload_1
       122: aastore
       123: invokevirtual #101                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
       126: return
      Exception table:
         from    to  target type
            13    28    41   Class java/lang/Throwable
            47    53    56   Class java/lang/Throwable
             4    68    81   Class java/lang/Throwable
            86    92    95   Class java/lang/Throwable
             0   105   108   Class java/lang/Exception
      LineNumberTable:
        line 76: 0
        line 77: 4
        line 79: 13
        line 80: 21
        line 81: 28
        line 76: 41
        line 81: 68
        line 76: 81
        line 85: 105
        line 82: 108
        line 84: 109
        line 86: 126
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           13      55     3    ps   Ljava/sql/PreparedStatement;
            4     101     2   con   Ljava/sql/Connection;
          109      17     2     e   Ljava/lang/Exception;
            0     127     0  this   Lext/mods/gameserver/data/sql/ServerMemoTable;
            0     127     1   key   Ljava/lang/String;
      StackMapTable: number_of_entries = 10
        frame_type = 255 /* full_frame */
          offset_delta = 41
          locals = [ class ext/mods/gameserver/data/sql/ServerMemoTable, class java/lang/String, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/data/sql/ServerMemoTable, class java/lang/String, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/data/sql/ServerMemoTable, class java/lang/String, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 17 /* same */

  public static final ext.mods.gameserver.data.sql.ServerMemoTable getInstance();
    descriptor: ()Lext/mods/gameserver/data/sql/ServerMemoTable;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #108                // Field ext/mods/gameserver/data/sql/ServerMemoTable$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/sql/ServerMemoTable;
         3: areturn
      LineNumberTable:
        line 90: 0

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #67                 // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #13                 // class ext/mods/gameserver/data/sql/ServerMemoTable
         6: invokevirtual #114                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #120                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #60                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 35: 0
}
SourceFile: "ServerMemoTable.java"
NestMembers:
  ext/mods/gameserver/data/sql/ServerMemoTable$SingletonHolder
