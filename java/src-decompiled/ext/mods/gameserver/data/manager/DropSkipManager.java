// Bytecode for: ext.mods.gameserver.data.manager.DropSkipManager
// File: ext\mods\gameserver\data\manager\DropSkipManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/manager/DropSkipManager.class
  Last modified 9 de jul de 2026; size 4813 bytes
  MD5 checksum 7a41d0143e632a35b3d123ea152a419c
  Compiled from "DropSkipManager.java"
public class ext.mods.gameserver.data.manager.DropSkipManager
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/data/manager/DropSkipManager
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 1, methods: 8, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/HashMap
    #8 = Utf8               java/util/HashMap
    #9 = Methodref          #7.#3         // java/util/HashMap."<init>":()V
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/data/manager/DropSkipManager._playerSkips:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/gameserver/data/manager/DropSkipManager
   #12 = NameAndType        #14:#15       // _playerSkips:Ljava/util/Map;
   #13 = Utf8               ext/mods/gameserver/data/manager/DropSkipManager
   #14 = Utf8               _playerSkips
   #15 = Utf8               Ljava/util/Map;
   #16 = Methodref          #17.#18       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #17 = Class              #19           // java/lang/Integer
   #18 = NameAndType        #20:#21       // valueOf:(I)Ljava/lang/Integer;
   #19 = Utf8               java/lang/Integer
   #20 = Utf8               valueOf
   #21 = Utf8               (I)Ljava/lang/Integer;
   #22 = Methodref          #23.#24       // java/util/Collections.emptySet:()Ljava/util/Set;
   #23 = Class              #25           // java/util/Collections
   #24 = NameAndType        #26:#27       // emptySet:()Ljava/util/Set;
   #25 = Utf8               java/util/Collections
   #26 = Utf8               emptySet
   #27 = Utf8               ()Ljava/util/Set;
   #28 = InterfaceMethodref #29.#30       // java/util/Map.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #29 = Class              #31           // java/util/Map
   #30 = NameAndType        #32:#33       // getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #31 = Utf8               java/util/Map
   #32 = Utf8               getOrDefault
   #33 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #34 = Class              #35           // java/util/Set
   #35 = Utf8               java/util/Set
   #36 = InterfaceMethodref #34.#37       // java/util/Set.contains:(Ljava/lang/Object;)Z
   #37 = NameAndType        #38:#39       // contains:(Ljava/lang/Object;)Z
   #38 = Utf8               contains
   #39 = Utf8               (Ljava/lang/Object;)Z
   #40 = InvokeDynamic      #0:#41        // #0:apply:()Ljava/util/function/Function;
   #41 = NameAndType        #42:#43       // apply:()Ljava/util/function/Function;
   #42 = Utf8               apply
   #43 = Utf8               ()Ljava/util/function/Function;
   #44 = InterfaceMethodref #29.#45       // java/util/Map.computeIfAbsent:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
   #45 = NameAndType        #46:#47       // computeIfAbsent:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
   #46 = Utf8               computeIfAbsent
   #47 = Utf8               (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
   #48 = InterfaceMethodref #34.#49       // java/util/Set.remove:(Ljava/lang/Object;)Z
   #49 = NameAndType        #50:#39       // remove:(Ljava/lang/Object;)Z
   #50 = Utf8               remove
   #51 = Methodref          #11.#52       // ext/mods/gameserver/data/manager/DropSkipManager.removeFromDb:(II)V
   #52 = NameAndType        #53:#54       // removeFromDb:(II)V
   #53 = Utf8               removeFromDb
   #54 = Utf8               (II)V
   #55 = InterfaceMethodref #34.#56       // java/util/Set.add:(Ljava/lang/Object;)Z
   #56 = NameAndType        #57:#39       // add:(Ljava/lang/Object;)Z
   #57 = Utf8               add
   #58 = Methodref          #11.#59       // ext/mods/gameserver/data/manager/DropSkipManager.insertToDb:(II)V
   #59 = NameAndType        #60:#54       // insertToDb:(II)V
   #60 = Utf8               insertToDb
   #61 = Methodref          #62.#63       // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
   #62 = Class              #64           // ext/mods/commons/pool/ConnectionPool
   #63 = NameAndType        #65:#66       // getConnection:()Ljava/sql/Connection;
   #64 = Utf8               ext/mods/commons/pool/ConnectionPool
   #65 = Utf8               getConnection
   #66 = Utf8               ()Ljava/sql/Connection;
   #67 = String             #68           // INSERT IGNORE INTO player_droplist_config (player_id, item_id) VALUES (?, ?)
   #68 = Utf8               INSERT IGNORE INTO player_droplist_config (player_id, item_id) VALUES (?, ?)
   #69 = InterfaceMethodref #70.#71       // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #70 = Class              #72           // java/sql/Connection
   #71 = NameAndType        #73:#74       // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #72 = Utf8               java/sql/Connection
   #73 = Utf8               prepareStatement
   #74 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #75 = InterfaceMethodref #76.#77       // java/sql/PreparedStatement.setInt:(II)V
   #76 = Class              #78           // java/sql/PreparedStatement
   #77 = NameAndType        #79:#54       // setInt:(II)V
   #78 = Utf8               java/sql/PreparedStatement
   #79 = Utf8               setInt
   #80 = InterfaceMethodref #76.#81       // java/sql/PreparedStatement.executeUpdate:()I
   #81 = NameAndType        #82:#83       // executeUpdate:()I
   #82 = Utf8               executeUpdate
   #83 = Utf8               ()I
   #84 = InterfaceMethodref #76.#85       // java/sql/PreparedStatement.close:()V
   #85 = NameAndType        #86:#6        // close:()V
   #86 = Utf8               close
   #87 = Class              #88           // java/lang/Throwable
   #88 = Utf8               java/lang/Throwable
   #89 = Methodref          #87.#90       // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
   #90 = NameAndType        #91:#92       // addSuppressed:(Ljava/lang/Throwable;)V
   #91 = Utf8               addSuppressed
   #92 = Utf8               (Ljava/lang/Throwable;)V
   #93 = InterfaceMethodref #70.#85       // java/sql/Connection.close:()V
   #94 = Class              #95           // java/lang/Exception
   #95 = Utf8               java/lang/Exception
   #96 = Methodref          #94.#97       // java/lang/Exception.printStackTrace:()V
   #97 = NameAndType        #98:#6        // printStackTrace:()V
   #98 = Utf8               printStackTrace
   #99 = String             #100          // DELETE FROM player_droplist_config WHERE player_id = ? AND item_id = ?
  #100 = Utf8               DELETE FROM player_droplist_config WHERE player_id = ? AND item_id = ?
  #101 = Class              #102          // java/util/HashSet
  #102 = Utf8               java/util/HashSet
  #103 = Methodref          #101.#3       // java/util/HashSet."<init>":()V
  #104 = String             #105          // SELECT item_id FROM player_droplist_config WHERE player_id = ?
  #105 = Utf8               SELECT item_id FROM player_droplist_config WHERE player_id = ?
  #106 = InterfaceMethodref #76.#107      // java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
  #107 = NameAndType        #108:#109     // executeQuery:()Ljava/sql/ResultSet;
  #108 = Utf8               executeQuery
  #109 = Utf8               ()Ljava/sql/ResultSet;
  #110 = InterfaceMethodref #111.#112     // java/sql/ResultSet.next:()Z
  #111 = Class              #113          // java/sql/ResultSet
  #112 = NameAndType        #114:#115     // next:()Z
  #113 = Utf8               java/sql/ResultSet
  #114 = Utf8               next
  #115 = Utf8               ()Z
  #116 = String             #117          // item_id
  #117 = Utf8               item_id
  #118 = InterfaceMethodref #111.#119     // java/sql/ResultSet.getInt:(Ljava/lang/String;)I
  #119 = NameAndType        #120:#121     // getInt:(Ljava/lang/String;)I
  #120 = Utf8               getInt
  #121 = Utf8               (Ljava/lang/String;)I
  #122 = InterfaceMethodref #29.#123      // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #123 = NameAndType        #124:#33      // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #124 = Utf8               put
  #125 = Fieldref           #126.#127     // ext/mods/gameserver/data/manager/DropSkipManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/manager/DropSkipManager;
  #126 = Class              #128          // ext/mods/gameserver/data/manager/DropSkipManager$SingletonHolder
  #127 = NameAndType        #129:#130     // INSTANCE:Lext/mods/gameserver/data/manager/DropSkipManager;
  #128 = Utf8               ext/mods/gameserver/data/manager/DropSkipManager$SingletonHolder
  #129 = Utf8               INSTANCE
  #130 = Utf8               Lext/mods/gameserver/data/manager/DropSkipManager;
  #131 = Utf8               Signature
  #132 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/util/Set<Ljava/lang/Integer;>;>;
  #133 = Utf8               Code
  #134 = Utf8               LineNumberTable
  #135 = Utf8               LocalVariableTable
  #136 = Utf8               this
  #137 = Utf8               isSkipped
  #138 = Utf8               (II)Z
  #139 = Utf8               playerId
  #140 = Utf8               I
  #141 = Utf8               itemId
  #142 = Utf8               toggleSkip
  #143 = Utf8               skipped
  #144 = Utf8               Ljava/util/Set;
  #145 = Utf8               LocalVariableTypeTable
  #146 = Utf8               Ljava/util/Set<Ljava/lang/Integer;>;
  #147 = Utf8               StackMapTable
  #148 = Utf8               ps
  #149 = Utf8               Ljava/sql/PreparedStatement;
  #150 = Utf8               con
  #151 = Utf8               Ljava/sql/Connection;
  #152 = Utf8               e
  #153 = Utf8               Ljava/lang/Exception;
  #154 = Utf8               loadPlayer
  #155 = Utf8               (I)V
  #156 = Utf8               rs
  #157 = Utf8               Ljava/sql/ResultSet;
  #158 = Utf8               items
  #159 = Utf8               getInstance
  #160 = Utf8               ()Lext/mods/gameserver/data/manager/DropSkipManager;
  #161 = Utf8               lambda$toggleSkip$0
  #162 = Utf8               (Ljava/lang/Integer;)Ljava/util/Set;
  #163 = Utf8               k
  #164 = Utf8               Ljava/lang/Integer;
  #165 = Utf8               SourceFile
  #166 = Utf8               DropSkipManager.java
  #167 = Utf8               NestMembers
  #168 = Utf8               BootstrapMethods
  #169 = MethodType         #170          //  (Ljava/lang/Object;)Ljava/lang/Object;
  #170 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #171 = MethodHandle       6:#172        // REF_invokeStatic ext/mods/gameserver/data/manager/DropSkipManager.lambda$toggleSkip$0:(Ljava/lang/Integer;)Ljava/util/Set;
  #172 = Methodref          #11.#173      // ext/mods/gameserver/data/manager/DropSkipManager.lambda$toggleSkip$0:(Ljava/lang/Integer;)Ljava/util/Set;
  #173 = NameAndType        #161:#162     // lambda$toggleSkip$0:(Ljava/lang/Integer;)Ljava/util/Set;
  #174 = MethodType         #162          //  (Ljava/lang/Integer;)Ljava/util/Set;
  #175 = MethodHandle       6:#176        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #176 = Methodref          #177.#178     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #177 = Class              #179          // java/lang/invoke/LambdaMetafactory
  #178 = NameAndType        #180:#181     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #179 = Utf8               java/lang/invoke/LambdaMetafactory
  #180 = Utf8               metafactory
  #181 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #182 = Utf8               InnerClasses
  #183 = Utf8               SingletonHolder
  #184 = Class              #185          // java/lang/invoke/MethodHandles$Lookup
  #185 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #186 = Class              #187          // java/lang/invoke/MethodHandles
  #187 = Utf8               java/lang/invoke/MethodHandles
  #188 = Utf8               Lookup
{
  public ext.mods.gameserver.data.manager.DropSkipManager();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/HashMap
         8: dup
         9: invokespecial #9                  // Method java/util/HashMap."<init>":()V
        12: putfield      #10                 // Field _playerSkips:Ljava/util/Map;
        15: return
      LineNumberTable:
        line 31: 0
        line 33: 4
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/data/manager/DropSkipManager;

  public boolean isSkipped(int, int);
    descriptor: (II)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: getfield      #10                 // Field _playerSkips:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #16                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokestatic  #22                 // Method java/util/Collections.emptySet:()Ljava/util/Set;
        11: invokeinterface #28,  3           // InterfaceMethod java/util/Map.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        16: checkcast     #34                 // class java/util/Set
        19: iload_2
        20: invokestatic  #16                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        23: invokeinterface #36,  2           // InterfaceMethod java/util/Set.contains:(Ljava/lang/Object;)Z
        28: ireturn
      LineNumberTable:
        line 37: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/data/manager/DropSkipManager;
            0      29     1 playerId   I
            0      29     2 itemId   I

  public void toggleSkip(int, int);
    descriptor: (II)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=3
         0: aload_0
         1: getfield      #10                 // Field _playerSkips:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #16                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokedynamic #40,  0             // InvokeDynamic #0:apply:()Ljava/util/function/Function;
        13: invokeinterface #44,  3           // InterfaceMethod java/util/Map.computeIfAbsent:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
        18: checkcast     #34                 // class java/util/Set
        21: astore_3
        22: aload_3
        23: iload_2
        24: invokestatic  #16                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        27: invokeinterface #36,  2           // InterfaceMethod java/util/Set.contains:(Ljava/lang/Object;)Z
        32: ifeq          55
        35: aload_3
        36: iload_2
        37: invokestatic  #16                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        40: invokeinterface #48,  2           // InterfaceMethod java/util/Set.remove:(Ljava/lang/Object;)Z
        45: pop
        46: aload_0
        47: iload_1
        48: iload_2
        49: invokevirtual #51                 // Method removeFromDb:(II)V
        52: goto          72
        55: aload_3
        56: iload_2
        57: invokestatic  #16                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        60: invokeinterface #55,  2           // InterfaceMethod java/util/Set.add:(Ljava/lang/Object;)Z
        65: pop
        66: aload_0
        67: iload_1
        68: iload_2
        69: invokevirtual #58                 // Method insertToDb:(II)V
        72: return
      LineNumberTable:
        line 42: 0
        line 43: 22
        line 45: 35
        line 46: 46
        line 50: 55
        line 51: 66
        line 54: 72
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      73     0  this   Lext/mods/gameserver/data/manager/DropSkipManager;
            0      73     1 playerId   I
            0      73     2 itemId   I
           22      51     3 skipped   Ljava/util/Set;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           22      51     3 skipped   Ljava/util/Set<Ljava/lang/Integer;>;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 55
          locals = [ class java/util/Set ]
        frame_type = 16 /* same */

  public void loadPlayer(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=7, args_size=2
         0: new           #101                // class java/util/HashSet
         3: dup
         4: invokespecial #103                // Method java/util/HashSet."<init>":()V
         7: astore_2
         8: invokestatic  #61                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        11: astore_3
        12: aload_3
        13: ldc           #104                // String SELECT item_id FROM player_droplist_config WHERE player_id = ?
        15: invokeinterface #69,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        20: astore        4
        22: aload         4
        24: iconst_1
        25: iload_1
        26: invokeinterface #75,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        31: aload         4
        33: invokeinterface #106,  1          // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
        38: astore        5
        40: aload         5
        42: invokeinterface #110,  1          // InterfaceMethod java/sql/ResultSet.next:()Z
        47: ifeq          72
        50: aload_2
        51: aload         5
        53: ldc           #116                // String item_id
        55: invokeinterface #118,  2          // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        60: invokestatic  #16                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        63: invokeinterface #55,  2           // InterfaceMethod java/util/Set.add:(Ljava/lang/Object;)Z
        68: pop
        69: goto          40
        72: aload         4
        74: ifnull        116
        77: aload         4
        79: invokeinterface #84,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
        84: goto          116
        87: astore        5
        89: aload         4
        91: ifnull        113
        94: aload         4
        96: invokeinterface #84,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       101: goto          113
       104: astore        6
       106: aload         5
       108: aload         6
       110: invokevirtual #89                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       113: aload         5
       115: athrow
       116: aload_3
       117: ifnull        156
       120: aload_3
       121: invokeinterface #93,  1           // InterfaceMethod java/sql/Connection.close:()V
       126: goto          156
       129: astore        4
       131: aload_3
       132: ifnull        153
       135: aload_3
       136: invokeinterface #93,  1           // InterfaceMethod java/sql/Connection.close:()V
       141: goto          153
       144: astore        5
       146: aload         4
       148: aload         5
       150: invokevirtual #89                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       153: aload         4
       155: athrow
       156: goto          164
       159: astore_3
       160: aload_3
       161: invokevirtual #96                 // Method java/lang/Exception.printStackTrace:()V
       164: aload_0
       165: getfield      #10                 // Field _playerSkips:Ljava/util/Map;
       168: iload_1
       169: invokestatic  #16                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       172: aload_2
       173: invokeinterface #122,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       178: pop
       179: return
      Exception table:
         from    to  target type
            22    72    87   Class java/lang/Throwable
            94   101   104   Class java/lang/Throwable
            12   116   129   Class java/lang/Throwable
           135   141   144   Class java/lang/Throwable
             8   156   159   Class java/lang/Exception
      LineNumberTable:
        line 88: 0
        line 89: 8
        line 90: 12
        line 92: 22
        line 93: 31
        line 94: 40
        line 95: 50
        line 96: 72
        line 89: 87
        line 96: 116
        line 89: 129
        line 100: 156
        line 97: 159
        line 99: 160
        line 102: 164
        line 103: 179
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           40      32     5    rs   Ljava/sql/ResultSet;
           22      94     4    ps   Ljava/sql/PreparedStatement;
           12     144     3   con   Ljava/sql/Connection;
          160       4     3     e   Ljava/lang/Exception;
            0     180     0  this   Lext/mods/gameserver/data/manager/DropSkipManager;
            0     180     1 playerId   I
            8     172     2 items   Ljava/util/Set;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            8     172     2 items   Ljava/util/Set<Ljava/lang/Integer;>;
      StackMapTable: number_of_entries = 12
        frame_type = 255 /* full_frame */
          offset_delta = 40
          locals = [ class ext/mods/gameserver/data/manager/DropSkipManager, int, class java/util/Set, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet ]
          stack = []
        frame_type = 250 /* chop */
          offset_delta = 31
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/data/manager/DropSkipManager, int, class java/util/Set, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/data/manager/DropSkipManager, int, class java/util/Set, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 4 /* same */

  public static ext.mods.gameserver.data.manager.DropSkipManager getInstance();
    descriptor: ()Lext/mods/gameserver/data/manager/DropSkipManager;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #125                // Field ext/mods/gameserver/data/manager/DropSkipManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/manager/DropSkipManager;
         3: areturn
      LineNumberTable:
        line 107: 0
}
SourceFile: "DropSkipManager.java"
NestMembers:
  ext/mods/gameserver/data/manager/DropSkipManager$SingletonHolder
BootstrapMethods:
  0: #175 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #169 (Ljava/lang/Object;)Ljava/lang/Object;
      #171 REF_invokeStatic ext/mods/gameserver/data/manager/DropSkipManager.lambda$toggleSkip$0:(Ljava/lang/Integer;)Ljava/util/Set;
      #174 (Ljava/lang/Integer;)Ljava/util/Set;
InnerClasses:
  public static final #188= #184 of #186; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
