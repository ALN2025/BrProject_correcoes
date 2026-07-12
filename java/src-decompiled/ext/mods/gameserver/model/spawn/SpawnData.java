// Bytecode for: ext.mods.gameserver.model.spawn.SpawnData
// File: ext\mods\gameserver\model\spawn\SpawnData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/spawn/SpawnData.class
  Last modified 9 de jul de 2026; size 3915 bytes
  MD5 checksum 88a8a6ed0ef0a2019fd31c55a471f90c
  Compiled from "SpawnData.java"
public class ext.mods.gameserver.model.spawn.SpawnData extends ext.mods.gameserver.model.location.SpawnLocation
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/spawn/SpawnData
  super_class: #2                         // ext/mods/gameserver/model/location/SpawnLocation
  interfaces: 0, fields: 6, methods: 16, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/location/SpawnLocation."<init>":(IIII)V
    #2 = Class              #4            // ext/mods/gameserver/model/location/SpawnLocation
    #3 = NameAndType        #5:#6         // "<init>":(IIII)V
    #4 = Utf8               ext/mods/gameserver/model/location/SpawnLocation
    #5 = Utf8               <init>
    #6 = Utf8               (IIII)V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/spawn/SpawnData._name:Ljava/lang/String;
    #8 = Class              #10           // ext/mods/gameserver/model/spawn/SpawnData
    #9 = NameAndType        #11:#12       // _name:Ljava/lang/String;
   #10 = Utf8               ext/mods/gameserver/model/spawn/SpawnData
   #11 = Utf8               _name
   #12 = Utf8               Ljava/lang/String;
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/model/spawn/SpawnData._status:B
   #14 = NameAndType        #15:#16       // _status:B
   #15 = Utf8               _status
   #16 = Utf8               B
   #17 = Fieldref           #8.#18        // ext/mods/gameserver/model/spawn/SpawnData._currentHp:I
   #18 = NameAndType        #19:#20       // _currentHp:I
   #19 = Utf8               _currentHp
   #20 = Utf8               I
   #21 = Fieldref           #8.#22        // ext/mods/gameserver/model/spawn/SpawnData._currentMp:I
   #22 = NameAndType        #23:#20       // _currentMp:I
   #23 = Utf8               _currentMp
   #24 = Fieldref           #8.#25        // ext/mods/gameserver/model/spawn/SpawnData._dbValue:I
   #25 = NameAndType        #26:#20       // _dbValue:I
   #26 = Utf8               _dbValue
   #27 = Fieldref           #8.#28        // ext/mods/gameserver/model/spawn/SpawnData._respawnTime:J
   #28 = NameAndType        #29:#30       // _respawnTime:J
   #29 = Utf8               _respawnTime
   #30 = Utf8               J
   #31 = String             #32           // loc_x
   #32 = Utf8               loc_x
   #33 = InterfaceMethodref #34.#35       // java/sql/ResultSet.getInt:(Ljava/lang/String;)I
   #34 = Class              #36           // java/sql/ResultSet
   #35 = NameAndType        #37:#38       // getInt:(Ljava/lang/String;)I
   #36 = Utf8               java/sql/ResultSet
   #37 = Utf8               getInt
   #38 = Utf8               (Ljava/lang/String;)I
   #39 = String             #40           // loc_y
   #40 = Utf8               loc_y
   #41 = String             #42           // loc_z
   #42 = Utf8               loc_z
   #43 = String             #44           // heading
   #44 = Utf8               heading
   #45 = String             #46           // status
   #46 = Utf8               status
   #47 = InterfaceMethodref #34.#48       // java/sql/ResultSet.getByte:(Ljava/lang/String;)B
   #48 = NameAndType        #49:#50       // getByte:(Ljava/lang/String;)B
   #49 = Utf8               getByte
   #50 = Utf8               (Ljava/lang/String;)B
   #51 = String             #52           // current_hp
   #52 = Utf8               current_hp
   #53 = String             #54           // current_mp
   #54 = Utf8               current_mp
   #55 = String             #56           // db_value
   #56 = Utf8               db_value
   #57 = String             #58           // respawn_time
   #58 = Utf8               respawn_time
   #59 = InterfaceMethodref #34.#60       // java/sql/ResultSet.getLong:(Ljava/lang/String;)J
   #60 = NameAndType        #61:#62       // getLong:(Ljava/lang/String;)J
   #61 = Utf8               getLong
   #62 = Utf8               (Ljava/lang/String;)J
   #63 = Methodref          #64.#65       // java/lang/System.currentTimeMillis:()J
   #64 = Class              #66           // java/lang/System
   #65 = NameAndType        #67:#68       // currentTimeMillis:()J
   #66 = Utf8               java/lang/System
   #67 = Utf8               currentTimeMillis
   #68 = Utf8               ()J
   #69 = Methodref          #8.#70        // ext/mods/gameserver/model/spawn/SpawnData.set:(Lext/mods/gameserver/model/location/SpawnLocation;)V
   #70 = NameAndType        #71:#72       // set:(Lext/mods/gameserver/model/location/SpawnLocation;)V
   #71 = Utf8               set
   #72 = Utf8               (Lext/mods/gameserver/model/location/SpawnLocation;)V
   #73 = Methodref          #74.#75       // ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
   #74 = Class              #76           // ext/mods/gameserver/model/actor/Npc
   #75 = NameAndType        #77:#78       // getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
   #76 = Utf8               ext/mods/gameserver/model/actor/Npc
   #77 = Utf8               getStatus
   #78 = Utf8               ()Lext/mods/gameserver/model/actor/status/NpcStatus;
   #79 = Methodref          #80.#81       // ext/mods/gameserver/model/actor/status/NpcStatus.getHp:()D
   #80 = Class              #82           // ext/mods/gameserver/model/actor/status/NpcStatus
   #81 = NameAndType        #83:#84       // getHp:()D
   #82 = Utf8               ext/mods/gameserver/model/actor/status/NpcStatus
   #83 = Utf8               getHp
   #84 = Utf8               ()D
   #85 = Methodref          #80.#86       // ext/mods/gameserver/model/actor/status/NpcStatus.getMp:()D
   #86 = NameAndType        #87:#84       // getMp:()D
   #87 = Utf8               getMp
   #88 = Methodref          #74.#89       // ext/mods/gameserver/model/actor/Npc.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
   #89 = NameAndType        #90:#91       // getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
   #90 = Utf8               getPosition
   #91 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
   #92 = Methodref          #8.#93        // ext/mods/gameserver/model/spawn/SpawnData.set:(IIII)V
   #93 = NameAndType        #71:#6        // set:(IIII)V
   #94 = Methodref          #8.#95        // ext/mods/gameserver/model/spawn/SpawnData.getName:()Ljava/lang/String;
   #95 = NameAndType        #96:#97       // getName:()Ljava/lang/String;
   #96 = Utf8               getName
   #97 = Utf8               ()Ljava/lang/String;
   #98 = InterfaceMethodref #99.#100      // java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
   #99 = Class              #101          // java/sql/PreparedStatement
  #100 = NameAndType        #102:#103     // setString:(ILjava/lang/String;)V
  #101 = Utf8               java/sql/PreparedStatement
  #102 = Utf8               setString
  #103 = Utf8               (ILjava/lang/String;)V
  #104 = Methodref          #8.#105       // ext/mods/gameserver/model/spawn/SpawnData.getStatus:()B
  #105 = NameAndType        #77:#106      // getStatus:()B
  #106 = Utf8               ()B
  #107 = InterfaceMethodref #99.#108      // java/sql/PreparedStatement.setInt:(II)V
  #108 = NameAndType        #109:#110     // setInt:(II)V
  #109 = Utf8               setInt
  #110 = Utf8               (II)V
  #111 = Methodref          #8.#112       // ext/mods/gameserver/model/spawn/SpawnData.getCurrentHp:()I
  #112 = NameAndType        #113:#114     // getCurrentHp:()I
  #113 = Utf8               getCurrentHp
  #114 = Utf8               ()I
  #115 = Methodref          #8.#116       // ext/mods/gameserver/model/spawn/SpawnData.getCurrentMp:()I
  #116 = NameAndType        #117:#114     // getCurrentMp:()I
  #117 = Utf8               getCurrentMp
  #118 = Methodref          #8.#119       // ext/mods/gameserver/model/spawn/SpawnData.getX:()I
  #119 = NameAndType        #120:#114     // getX:()I
  #120 = Utf8               getX
  #121 = Methodref          #8.#122       // ext/mods/gameserver/model/spawn/SpawnData.getY:()I
  #122 = NameAndType        #123:#114     // getY:()I
  #123 = Utf8               getY
  #124 = Methodref          #8.#125       // ext/mods/gameserver/model/spawn/SpawnData.getZ:()I
  #125 = NameAndType        #126:#114     // getZ:()I
  #126 = Utf8               getZ
  #127 = Methodref          #8.#128       // ext/mods/gameserver/model/spawn/SpawnData.getHeading:()I
  #128 = NameAndType        #129:#114     // getHeading:()I
  #129 = Utf8               getHeading
  #130 = Methodref          #8.#131       // ext/mods/gameserver/model/spawn/SpawnData.getDBValue:()I
  #131 = NameAndType        #132:#114     // getDBValue:()I
  #132 = Utf8               getDBValue
  #133 = Methodref          #8.#134       // ext/mods/gameserver/model/spawn/SpawnData.getRespawnTime:()J
  #134 = NameAndType        #135:#68      // getRespawnTime:()J
  #135 = Utf8               getRespawnTime
  #136 = InterfaceMethodref #99.#137      // java/sql/PreparedStatement.setLong:(IJ)V
  #137 = NameAndType        #138:#139     // setLong:(IJ)V
  #138 = Utf8               setLong
  #139 = Utf8               (IJ)V
  #140 = Utf8               (Ljava/lang/String;)V
  #141 = Utf8               Code
  #142 = Utf8               LineNumberTable
  #143 = Utf8               LocalVariableTable
  #144 = Utf8               this
  #145 = Utf8               Lext/mods/gameserver/model/spawn/SpawnData;
  #146 = Utf8               name
  #147 = Utf8               (Ljava/lang/String;Ljava/sql/ResultSet;)V
  #148 = Utf8               rset
  #149 = Utf8               Ljava/sql/ResultSet;
  #150 = Utf8               Exceptions
  #151 = Class              #152          // java/sql/SQLException
  #152 = Utf8               java/sql/SQLException
  #153 = Utf8               checkDead
  #154 = Utf8               ()Z
  #155 = Utf8               StackMapTable
  #156 = Utf8               checkAlive
  #157 = Utf8               (Lext/mods/gameserver/model/location/SpawnLocation;DD)Z
  #158 = Utf8               loc
  #159 = Utf8               Lext/mods/gameserver/model/location/SpawnLocation;
  #160 = Utf8               maxHp
  #161 = Utf8               D
  #162 = Utf8               maxMp
  #163 = Utf8               setStatus
  #164 = Utf8               (B)V
  #165 = Utf8               setDBValue
  #166 = Utf8               (I)V
  #167 = Utf8               value
  #168 = Utf8               setStats
  #169 = Utf8               (Lext/mods/gameserver/model/actor/Npc;)V
  #170 = Utf8               npc
  #171 = Utf8               Lext/mods/gameserver/model/actor/Npc;
  #172 = Utf8               setRespawn
  #173 = Utf8               (J)V
  #174 = Utf8               respawnDelay
  #175 = Utf8               cancelRespawn
  #176 = Utf8               ()V
  #177 = Utf8               save
  #178 = Utf8               (Ljava/sql/PreparedStatement;)V
  #179 = Utf8               ps
  #180 = Utf8               Ljava/sql/PreparedStatement;
  #181 = Utf8               SourceFile
  #182 = Utf8               SpawnData.java
{
  public ext.mods.gameserver.model.spawn.SpawnData(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=2, args_size=2
         0: aload_0
         1: iconst_0
         2: iconst_0
         3: iconst_0
         4: iconst_0
         5: invokespecial #1                  // Method ext/mods/gameserver/model/location/SpawnLocation."<init>":(IIII)V
         8: aload_0
         9: aload_1
        10: putfield      #7                  // Field _name:Ljava/lang/String;
        13: aload_0
        14: iconst_m1
        15: putfield      #13                 // Field _status:B
        18: aload_0
        19: iconst_0
        20: putfield      #17                 // Field _currentHp:I
        23: aload_0
        24: iconst_0
        25: putfield      #21                 // Field _currentMp:I
        28: aload_0
        29: iconst_0
        30: putfield      #24                 // Field _dbValue:I
        33: aload_0
        34: lconst_0
        35: putfield      #27                 // Field _respawnTime:J
        38: return
      LineNumberTable:
        line 57: 0
        line 59: 8
        line 61: 13
        line 63: 18
        line 64: 23
        line 66: 28
        line 68: 33
        line 69: 38
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      39     0  this   Lext/mods/gameserver/model/spawn/SpawnData;
            0      39     1  name   Ljava/lang/String;

  public ext.mods.gameserver.model.spawn.SpawnData(java.lang.String, java.sql.ResultSet) throws java.sql.SQLException;
    descriptor: (Ljava/lang/String;Ljava/sql/ResultSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=3, args_size=3
         0: aload_0
         1: aload_2
         2: ldc           #31                 // String loc_x
         4: invokeinterface #33,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
         9: aload_2
        10: ldc           #39                 // String loc_y
        12: invokeinterface #33,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        17: aload_2
        18: ldc           #41                 // String loc_z
        20: invokeinterface #33,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        25: aload_2
        26: ldc           #43                 // String heading
        28: invokeinterface #33,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        33: invokespecial #1                  // Method ext/mods/gameserver/model/location/SpawnLocation."<init>":(IIII)V
        36: aload_0
        37: aload_1
        38: putfield      #7                  // Field _name:Ljava/lang/String;
        41: aload_0
        42: aload_2
        43: ldc           #45                 // String status
        45: invokeinterface #47,  2           // InterfaceMethod java/sql/ResultSet.getByte:(Ljava/lang/String;)B
        50: putfield      #13                 // Field _status:B
        53: aload_0
        54: aload_2
        55: ldc           #51                 // String current_hp
        57: invokeinterface #33,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        62: putfield      #17                 // Field _currentHp:I
        65: aload_0
        66: aload_2
        67: ldc           #53                 // String current_mp
        69: invokeinterface #33,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        74: putfield      #21                 // Field _currentMp:I
        77: aload_0
        78: aload_2
        79: ldc           #55                 // String db_value
        81: invokeinterface #33,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        86: putfield      #24                 // Field _dbValue:I
        89: aload_0
        90: aload_2
        91: ldc           #57                 // String respawn_time
        93: invokeinterface #59,  2           // InterfaceMethod java/sql/ResultSet.getLong:(Ljava/lang/String;)J
        98: putfield      #27                 // Field _respawnTime:J
       101: return
      LineNumberTable:
        line 79: 0
        line 81: 36
        line 83: 41
        line 85: 53
        line 86: 65
        line 88: 77
        line 90: 89
        line 91: 101
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     102     0  this   Lext/mods/gameserver/model/spawn/SpawnData;
            0     102     1  name   Ljava/lang/String;
            0     102     2  rset   Ljava/sql/ResultSet;
    Exceptions:
      throws java.sql.SQLException

  public final java.lang.String getName();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _name:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 98: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/spawn/SpawnData;

  public final byte getStatus();
    descriptor: ()B
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _status:B
         4: ireturn
      LineNumberTable:
        line 106: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/spawn/SpawnData;

  public final int getCurrentHp();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field _currentHp:I
         4: ireturn
      LineNumberTable:
        line 114: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/spawn/SpawnData;

  public final int getCurrentMp();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #21                 // Field _currentMp:I
         4: ireturn
      LineNumberTable:
        line 122: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/spawn/SpawnData;

  public final int getDBValue();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #24                 // Field _dbValue:I
         4: ireturn
      LineNumberTable:
        line 130: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/spawn/SpawnData;

  public final long getRespawnTime();
    descriptor: ()J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #27                 // Field _respawnTime:J
         4: lreturn
      LineNumberTable:
        line 138: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/spawn/SpawnData;

  public final boolean checkDead();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _status:B
         4: ifne          31
         7: aload_0
         8: getfield      #27                 // Field _respawnTime:J
        11: lconst_0
        12: lcmp
        13: ifle          31
        16: aload_0
        17: getfield      #27                 // Field _respawnTime:J
        20: invokestatic  #63                 // Method java/lang/System.currentTimeMillis:()J
        23: lcmp
        24: ifle          31
        27: iconst_1
        28: goto          32
        31: iconst_0
        32: ireturn
      LineNumberTable:
        line 146: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lext/mods/gameserver/model/spawn/SpawnData;
      StackMapTable: number_of_entries = 2
        frame_type = 31 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public final boolean checkAlive(ext.mods.gameserver.model.location.SpawnLocation, double, double);
    descriptor: (Lext/mods/gameserver/model/location/SpawnLocation;DD)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=6, args_size=4
         0: aload_0
         1: getfield      #13                 // Field _status:B
         4: ifne          27
         7: aload_0
         8: getfield      #27                 // Field _respawnTime:J
        11: lconst_0
        12: lcmp
        13: ifle          27
        16: aload_0
        17: getfield      #27                 // Field _respawnTime:J
        20: invokestatic  #63                 // Method java/lang/System.currentTimeMillis:()J
        23: lcmp
        24: ifle          34
        27: aload_0
        28: getfield      #13                 // Field _status:B
        31: ifge          64
        34: aload_0
        35: iconst_1
        36: putfield      #13                 // Field _status:B
        39: aload_0
        40: dload_2
        41: d2i
        42: putfield      #17                 // Field _currentHp:I
        45: aload_0
        46: dload         4
        48: d2i
        49: putfield      #21                 // Field _currentMp:I
        52: aload_0
        53: aload_1
        54: invokevirtual #69                 // Method set:(Lext/mods/gameserver/model/location/SpawnLocation;)V
        57: aload_0
        58: lconst_0
        59: putfield      #27                 // Field _respawnTime:J
        62: iconst_0
        63: ireturn
        64: iconst_1
        65: ireturn
      LineNumberTable:
        line 159: 0
        line 161: 34
        line 163: 39
        line 164: 45
        line 166: 52
        line 168: 57
        line 169: 62
        line 172: 64
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      66     0  this   Lext/mods/gameserver/model/spawn/SpawnData;
            0      66     1   loc   Lext/mods/gameserver/model/location/SpawnLocation;
            0      66     2 maxHp   D
            0      66     4 maxMp   D
      StackMapTable: number_of_entries = 3
        frame_type = 27 /* same */
        frame_type = 6 /* same */
        frame_type = 29 /* same */

  public final void setStatus(byte);
    descriptor: (B)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #13                 // Field _status:B
         5: return
      LineNumberTable:
        line 181: 0
        line 182: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/spawn/SpawnData;
            0       6     1 status   B

  public final void setDBValue(int);
    descriptor: (I)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #24                 // Field _dbValue:I
         5: return
      LineNumberTable:
        line 190: 0
        line 191: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/spawn/SpawnData;
            0       6     1 value   I

  public final void setStats(ext.mods.gameserver.model.actor.Npc);
    descriptor: (Lext/mods/gameserver/model/actor/Npc;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: getfield      #13                 // Field _status:B
         4: ifne          8
         7: return
         8: aload_0
         9: aload_1
        10: invokevirtual #73                 // Method ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
        13: invokevirtual #79                 // Method ext/mods/gameserver/model/actor/status/NpcStatus.getHp:()D
        16: d2i
        17: putfield      #17                 // Field _currentHp:I
        20: aload_0
        21: aload_1
        22: invokevirtual #73                 // Method ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
        25: invokevirtual #85                 // Method ext/mods/gameserver/model/actor/status/NpcStatus.getMp:()D
        28: d2i
        29: putfield      #21                 // Field _currentMp:I
        32: aload_0
        33: aload_1
        34: invokevirtual #88                 // Method ext/mods/gameserver/model/actor/Npc.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
        37: invokevirtual #69                 // Method set:(Lext/mods/gameserver/model/location/SpawnLocation;)V
        40: aload_0
        41: lconst_0
        42: putfield      #27                 // Field _respawnTime:J
        45: return
      LineNumberTable:
        line 199: 0
        line 200: 7
        line 202: 8
        line 203: 20
        line 204: 32
        line 206: 40
        line 207: 45
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      46     0  this   Lext/mods/gameserver/model/spawn/SpawnData;
            0      46     1   npc   Lext/mods/gameserver/model/actor/Npc;
      StackMapTable: number_of_entries = 1
        frame_type = 8 /* same */

  public final void setRespawn(long);
    descriptor: (J)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=5, locals=3, args_size=2
         0: aload_0
         1: iconst_0
         2: putfield      #13                 // Field _status:B
         5: aload_0
         6: iconst_0
         7: putfield      #17                 // Field _currentHp:I
        10: aload_0
        11: iconst_0
        12: putfield      #21                 // Field _currentMp:I
        15: aload_0
        16: iconst_0
        17: iconst_0
        18: iconst_0
        19: iconst_0
        20: invokevirtual #92                 // Method set:(IIII)V
        23: aload_0
        24: invokestatic  #63                 // Method java/lang/System.currentTimeMillis:()J
        27: lload_1
        28: ladd
        29: putfield      #27                 // Field _respawnTime:J
        32: return
      LineNumberTable:
        line 215: 0
        line 216: 5
        line 217: 10
        line 218: 15
        line 220: 23
        line 221: 32
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lext/mods/gameserver/model/spawn/SpawnData;
            0      33     1 respawnDelay   J

  public final void cancelRespawn();
    descriptor: ()V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: lconst_1
         2: putfield      #27                 // Field _respawnTime:J
         5: return
      LineNumberTable:
        line 228: 0
        line 229: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/spawn/SpawnData;

  public void save(java.sql.PreparedStatement) throws java.sql.SQLException;
    descriptor: (Ljava/sql/PreparedStatement;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_1
         1: iconst_1
         2: aload_0
         3: invokevirtual #94                 // Method getName:()Ljava/lang/String;
         6: invokeinterface #98,  3           // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
        11: aload_1
        12: iconst_2
        13: aload_0
        14: invokevirtual #104                // Method getStatus:()B
        17: invokeinterface #107,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        22: aload_1
        23: iconst_3
        24: aload_0
        25: invokevirtual #111                // Method getCurrentHp:()I
        28: invokeinterface #107,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        33: aload_1
        34: iconst_4
        35: aload_0
        36: invokevirtual #115                // Method getCurrentMp:()I
        39: invokeinterface #107,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        44: aload_1
        45: iconst_5
        46: aload_0
        47: invokevirtual #118                // Method getX:()I
        50: invokeinterface #107,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        55: aload_1
        56: bipush        6
        58: aload_0
        59: invokevirtual #121                // Method getY:()I
        62: invokeinterface #107,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        67: aload_1
        68: bipush        7
        70: aload_0
        71: invokevirtual #124                // Method getZ:()I
        74: invokeinterface #107,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        79: aload_1
        80: bipush        8
        82: aload_0
        83: invokevirtual #127                // Method getHeading:()I
        86: invokeinterface #107,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        91: aload_1
        92: bipush        9
        94: aload_0
        95: invokevirtual #130                // Method getDBValue:()I
        98: invokeinterface #107,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       103: aload_1
       104: bipush        10
       106: aload_0
       107: invokevirtual #133                // Method getRespawnTime:()J
       110: invokeinterface #136,  4          // InterfaceMethod java/sql/PreparedStatement.setLong:(IJ)V
       115: return
      LineNumberTable:
        line 233: 0
        line 234: 11
        line 235: 22
        line 236: 33
        line 237: 44
        line 238: 55
        line 239: 67
        line 240: 79
        line 241: 91
        line 242: 103
        line 243: 115
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     116     0  this   Lext/mods/gameserver/model/spawn/SpawnData;
            0     116     1    ps   Ljava/sql/PreparedStatement;
    Exceptions:
      throws java.sql.SQLException
}
SourceFile: "SpawnData.java"
