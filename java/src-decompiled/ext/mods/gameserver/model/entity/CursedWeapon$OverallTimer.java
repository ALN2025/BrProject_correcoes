// Bytecode for: ext.mods.gameserver.model.entity.CursedWeapon$OverallTimer
// File: ext\mods\gameserver\model\entity\CursedWeapon$OverallTimer.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/entity/CursedWeapon$OverallTimer.class
  Last modified 9 de jul de 2026; size 2375 bytes
  MD5 checksum af95bf5b7e0ec4be5a7f137baf91fd5f
  Compiled from "CursedWeapon.java"
class ext.mods.gameserver.model.entity.CursedWeapon$OverallTimer implements java.lang.Runnable
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #10                         // ext/mods/gameserver/model/entity/CursedWeapon$OverallTimer
  super_class: #16                        // java/lang/Object
  interfaces: 1, fields: 1, methods: 2, attributes: 3
Constant pool:
    #1 = Class              #2            // ext/mods/gameserver/model/entity/CursedWeapon
    #2 = Utf8               ext/mods/gameserver/model/entity/CursedWeapon
    #3 = Methodref          #4.#5         // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
    #4 = Class              #6            // java/util/Objects
    #5 = NameAndType        #7:#8         // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
    #6 = Utf8               java/util/Objects
    #7 = Utf8               requireNonNull
    #8 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
    #9 = Fieldref           #10.#11       // ext/mods/gameserver/model/entity/CursedWeapon$OverallTimer.this$0:Lext/mods/gameserver/model/entity/CursedWeapon;
   #10 = Class              #12           // ext/mods/gameserver/model/entity/CursedWeapon$OverallTimer
   #11 = NameAndType        #13:#14       // this$0:Lext/mods/gameserver/model/entity/CursedWeapon;
   #12 = Utf8               ext/mods/gameserver/model/entity/CursedWeapon$OverallTimer
   #13 = Utf8               this$0
   #14 = Utf8               Lext/mods/gameserver/model/entity/CursedWeapon;
   #15 = Methodref          #16.#17       // java/lang/Object."<init>":()V
   #16 = Class              #18           // java/lang/Object
   #17 = NameAndType        #19:#20       // "<init>":()V
   #18 = Utf8               java/lang/Object
   #19 = Utf8               <init>
   #20 = Utf8               ()V
   #21 = Methodref          #22.#23       // java/lang/System.currentTimeMillis:()J
   #22 = Class              #24           // java/lang/System
   #23 = NameAndType        #25:#26       // currentTimeMillis:()J
   #24 = Utf8               java/lang/System
   #25 = Utf8               currentTimeMillis
   #26 = Utf8               ()J
   #27 = Fieldref           #1.#28        // ext/mods/gameserver/model/entity/CursedWeapon._endTime:J
   #28 = NameAndType        #29:#30       // _endTime:J
   #29 = Utf8               _endTime
   #30 = Utf8               J
   #31 = Methodref          #1.#32        // ext/mods/gameserver/model/entity/CursedWeapon.endOfLife:()V
   #32 = NameAndType        #33:#20       // endOfLife:()V
   #33 = Utf8               endOfLife
   #34 = Methodref          #35.#36       // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
   #35 = Class              #37           // ext/mods/commons/pool/ConnectionPool
   #36 = NameAndType        #38:#39       // getConnection:()Ljava/sql/Connection;
   #37 = Utf8               ext/mods/commons/pool/ConnectionPool
   #38 = Utf8               getConnection
   #39 = Utf8               ()Ljava/sql/Connection;
   #40 = String             #41           // UPDATE cursed_weapons SET nbKills=?, currentStage=?, numberBeforeNextStage=?, hungryTime=?, endTime=? WHERE itemId=?
   #41 = Utf8               UPDATE cursed_weapons SET nbKills=?, currentStage=?, numberBeforeNextStage=?, hungryTime=?, endTime=? WHERE itemId=?
   #42 = InterfaceMethodref #43.#44       // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #43 = Class              #45           // java/sql/Connection
   #44 = NameAndType        #46:#47       // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #45 = Utf8               java/sql/Connection
   #46 = Utf8               prepareStatement
   #47 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #48 = Fieldref           #1.#49        // ext/mods/gameserver/model/entity/CursedWeapon._nbKills:I
   #49 = NameAndType        #50:#51       // _nbKills:I
   #50 = Utf8               _nbKills
   #51 = Utf8               I
   #52 = InterfaceMethodref #53.#54       // java/sql/PreparedStatement.setInt:(II)V
   #53 = Class              #55           // java/sql/PreparedStatement
   #54 = NameAndType        #56:#57       // setInt:(II)V
   #55 = Utf8               java/sql/PreparedStatement
   #56 = Utf8               setInt
   #57 = Utf8               (II)V
   #58 = Fieldref           #1.#59        // ext/mods/gameserver/model/entity/CursedWeapon._currentStage:I
   #59 = NameAndType        #60:#51       // _currentStage:I
   #60 = Utf8               _currentStage
   #61 = Fieldref           #1.#62        // ext/mods/gameserver/model/entity/CursedWeapon._numberBeforeNextStage:I
   #62 = NameAndType        #63:#51       // _numberBeforeNextStage:I
   #63 = Utf8               _numberBeforeNextStage
   #64 = Fieldref           #1.#65        // ext/mods/gameserver/model/entity/CursedWeapon._hungryTime:I
   #65 = NameAndType        #66:#51       // _hungryTime:I
   #66 = Utf8               _hungryTime
   #67 = InterfaceMethodref #53.#68       // java/sql/PreparedStatement.setLong:(IJ)V
   #68 = NameAndType        #69:#70       // setLong:(IJ)V
   #69 = Utf8               setLong
   #70 = Utf8               (IJ)V
   #71 = Fieldref           #1.#72        // ext/mods/gameserver/model/entity/CursedWeapon._itemId:I
   #72 = NameAndType        #73:#51       // _itemId:I
   #73 = Utf8               _itemId
   #74 = InterfaceMethodref #53.#75       // java/sql/PreparedStatement.executeUpdate:()I
   #75 = NameAndType        #76:#77       // executeUpdate:()I
   #76 = Utf8               executeUpdate
   #77 = Utf8               ()I
   #78 = InterfaceMethodref #53.#79       // java/sql/PreparedStatement.close:()V
   #79 = NameAndType        #80:#20       // close:()V
   #80 = Utf8               close
   #81 = Class              #82           // java/lang/Throwable
   #82 = Utf8               java/lang/Throwable
   #83 = Methodref          #81.#84       // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
   #84 = NameAndType        #85:#86       // addSuppressed:(Ljava/lang/Throwable;)V
   #85 = Utf8               addSuppressed
   #86 = Utf8               (Ljava/lang/Throwable;)V
   #87 = InterfaceMethodref #43.#79       // java/sql/Connection.close:()V
   #88 = Class              #89           // java/lang/Exception
   #89 = Utf8               java/lang/Exception
   #90 = Fieldref           #1.#91        // ext/mods/gameserver/model/entity/CursedWeapon.LOGGER:Lext/mods/commons/logging/CLogger;
   #91 = NameAndType        #92:#93       // LOGGER:Lext/mods/commons/logging/CLogger;
   #92 = Utf8               LOGGER
   #93 = Utf8               Lext/mods/commons/logging/CLogger;
   #94 = String             #95           // Failed to update cursed weapon data.
   #95 = Utf8               Failed to update cursed weapon data.
   #96 = Methodref          #97.#98       // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
   #97 = Class              #99           // ext/mods/commons/logging/CLogger
   #98 = NameAndType        #100:#101     // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
   #99 = Utf8               ext/mods/commons/logging/CLogger
  #100 = Utf8               error
  #101 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
  #102 = Class              #103          // java/lang/Runnable
  #103 = Utf8               java/lang/Runnable
  #104 = Utf8               (Lext/mods/gameserver/model/entity/CursedWeapon;)V
  #105 = Utf8               Code
  #106 = Utf8               LineNumberTable
  #107 = Utf8               LocalVariableTable
  #108 = Utf8               this
  #109 = Utf8               Lext/mods/gameserver/model/entity/CursedWeapon$OverallTimer;
  #110 = Utf8               MethodParameters
  #111 = Utf8               run
  #112 = Utf8               ps
  #113 = Utf8               Ljava/sql/PreparedStatement;
  #114 = Utf8               con
  #115 = Utf8               Ljava/sql/Connection;
  #116 = Utf8               e
  #117 = Utf8               Ljava/lang/Exception;
  #118 = Utf8               StackMapTable
  #119 = Utf8               SourceFile
  #120 = Utf8               CursedWeapon.java
  #121 = Utf8               NestHost
  #122 = Utf8               InnerClasses
  #123 = Utf8               OverallTimer
{
  final ext.mods.gameserver.model.entity.CursedWeapon this$0;
    descriptor: Lext/mods/gameserver/model/entity/CursedWeapon;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  protected ext.mods.gameserver.model.entity.CursedWeapon$OverallTimer(ext.mods.gameserver.model.entity.CursedWeapon);
    descriptor: (Lext/mods/gameserver/model/entity/CursedWeapon;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: dup
         3: invokestatic  #3                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
         6: pop
         7: putfield      #9                  // Field this$0:Lext/mods/gameserver/model/entity/CursedWeapon;
        10: aload_0
        11: invokespecial #15                 // Method java/lang/Object."<init>":()V
        14: return
      LineNumberTable:
        line 721: 0
        line 722: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/model/entity/CursedWeapon$OverallTimer;
    MethodParameters:
      Name                           Flags
      <no name>                      final synthetic

  public void run();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=5, args_size=1
         0: invokestatic  #21                 // Method java/lang/System.currentTimeMillis:()J
         3: aload_0
         4: getfield      #9                  // Field this$0:Lext/mods/gameserver/model/entity/CursedWeapon;
         7: getfield      #27                 // Field ext/mods/gameserver/model/entity/CursedWeapon._endTime:J
        10: lcmp
        11: iflt          24
        14: aload_0
        15: getfield      #9                  // Field this$0:Lext/mods/gameserver/model/entity/CursedWeapon;
        18: invokevirtual #31                 // Method ext/mods/gameserver/model/entity/CursedWeapon.endOfLife:()V
        21: goto          214
        24: invokestatic  #34                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        27: astore_1
        28: aload_1
        29: ldc           #40                 // String UPDATE cursed_weapons SET nbKills=?, currentStage=?, numberBeforeNextStage=?, hungryTime=?, endTime=? WHERE itemId=?
        31: invokeinterface #42,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        36: astore_2
        37: aload_2
        38: iconst_1
        39: aload_0
        40: getfield      #9                  // Field this$0:Lext/mods/gameserver/model/entity/CursedWeapon;
        43: getfield      #48                 // Field ext/mods/gameserver/model/entity/CursedWeapon._nbKills:I
        46: invokeinterface #52,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        51: aload_2
        52: iconst_2
        53: aload_0
        54: getfield      #9                  // Field this$0:Lext/mods/gameserver/model/entity/CursedWeapon;
        57: getfield      #58                 // Field ext/mods/gameserver/model/entity/CursedWeapon._currentStage:I
        60: invokeinterface #52,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        65: aload_2
        66: iconst_3
        67: aload_0
        68: getfield      #9                  // Field this$0:Lext/mods/gameserver/model/entity/CursedWeapon;
        71: getfield      #61                 // Field ext/mods/gameserver/model/entity/CursedWeapon._numberBeforeNextStage:I
        74: invokeinterface #52,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        79: aload_2
        80: iconst_4
        81: aload_0
        82: getfield      #9                  // Field this$0:Lext/mods/gameserver/model/entity/CursedWeapon;
        85: getfield      #64                 // Field ext/mods/gameserver/model/entity/CursedWeapon._hungryTime:I
        88: invokeinterface #52,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        93: aload_2
        94: iconst_5
        95: aload_0
        96: getfield      #9                  // Field this$0:Lext/mods/gameserver/model/entity/CursedWeapon;
        99: getfield      #27                 // Field ext/mods/gameserver/model/entity/CursedWeapon._endTime:J
       102: invokeinterface #67,  4           // InterfaceMethod java/sql/PreparedStatement.setLong:(IJ)V
       107: aload_2
       108: bipush        6
       110: aload_0
       111: getfield      #9                  // Field this$0:Lext/mods/gameserver/model/entity/CursedWeapon;
       114: getfield      #71                 // Field ext/mods/gameserver/model/entity/CursedWeapon._itemId:I
       117: invokeinterface #52,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       122: aload_2
       123: invokeinterface #74,  1           // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
       128: pop
       129: aload_2
       130: ifnull        166
       133: aload_2
       134: invokeinterface #78,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       139: goto          166
       142: astore_3
       143: aload_2
       144: ifnull        164
       147: aload_2
       148: invokeinterface #78,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       153: goto          164
       156: astore        4
       158: aload_3
       159: aload         4
       161: invokevirtual #83                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       164: aload_3
       165: athrow
       166: aload_1
       167: ifnull        201
       170: aload_1
       171: invokeinterface #87,  1           // InterfaceMethod java/sql/Connection.close:()V
       176: goto          201
       179: astore_2
       180: aload_1
       181: ifnull        199
       184: aload_1
       185: invokeinterface #87,  1           // InterfaceMethod java/sql/Connection.close:()V
       190: goto          199
       193: astore_3
       194: aload_2
       195: aload_3
       196: invokevirtual #83                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       199: aload_2
       200: athrow
       201: goto          214
       204: astore_1
       205: getstatic     #90                 // Field ext/mods/gameserver/model/entity/CursedWeapon.LOGGER:Lext/mods/commons/logging/CLogger;
       208: ldc           #94                 // String Failed to update cursed weapon data.
       210: aload_1
       211: invokevirtual #96                 // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       214: return
      Exception table:
         from    to  target type
            37   129   142   Class java/lang/Throwable
           147   153   156   Class java/lang/Throwable
            28   166   179   Class java/lang/Throwable
           184   190   193   Class java/lang/Throwable
            24   201   204   Class java/lang/Exception
      LineNumberTable:
        line 727: 0
        line 728: 14
        line 731: 24
        line 733: 28
        line 735: 37
        line 736: 51
        line 737: 65
        line 738: 79
        line 739: 93
        line 740: 107
        line 741: 122
        line 742: 129
        line 733: 142
        line 743: 166
        line 731: 179
        line 747: 201
        line 744: 204
        line 746: 205
        line 749: 214
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           37     129     2    ps   Ljava/sql/PreparedStatement;
           28     173     1   con   Ljava/sql/Connection;
          205       9     1     e   Ljava/lang/Exception;
            0     215     0  this   Lext/mods/gameserver/model/entity/CursedWeapon$OverallTimer;
      StackMapTable: number_of_entries = 11
        frame_type = 24 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 117
          locals = [ class ext/mods/gameserver/model/entity/CursedWeapon$OverallTimer, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/entity/CursedWeapon$OverallTimer, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/entity/CursedWeapon$OverallTimer, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 9 /* same */
}
SourceFile: "CursedWeapon.java"
NestHost: class ext/mods/gameserver/model/entity/CursedWeapon
