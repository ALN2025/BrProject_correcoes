// Bytecode for: ext.mods.gameserver.model.residence.castle.Castle$CastleFunction
// File: ext\mods\gameserver\model\residence\castle\Castle$CastleFunction.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.class
  Last modified 9 de jul de 2026; size 4371 bytes
  MD5 checksum 8c29ddc9c58f6c76857ada13fd130746
  Compiled from "Castle.java"
public class ext.mods.gameserver.model.residence.castle.Castle$CastleFunction
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #10                         // ext/mods/gameserver/model/residence/castle/Castle$CastleFunction
  super_class: #16                        // java/lang/Object
  interfaces: 0, fields: 9, methods: 11, attributes: 4
Constant pool:
    #1 = Class              #2            // ext/mods/gameserver/model/residence/castle/Castle
    #2 = Utf8               ext/mods/gameserver/model/residence/castle/Castle
    #3 = Methodref          #4.#5         // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
    #4 = Class              #6            // java/util/Objects
    #5 = NameAndType        #7:#8         // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
    #6 = Utf8               java/util/Objects
    #7 = Utf8               requireNonNull
    #8 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
    #9 = Fieldref           #10.#11       // ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.this$0:Lext/mods/gameserver/model/residence/castle/Castle;
   #10 = Class              #12           // ext/mods/gameserver/model/residence/castle/Castle$CastleFunction
   #11 = NameAndType        #13:#14       // this$0:Lext/mods/gameserver/model/residence/castle/Castle;
   #12 = Utf8               ext/mods/gameserver/model/residence/castle/Castle$CastleFunction
   #13 = Utf8               this$0
   #14 = Utf8               Lext/mods/gameserver/model/residence/castle/Castle;
   #15 = Methodref          #16.#17       // java/lang/Object."<init>":()V
   #16 = Class              #18           // java/lang/Object
   #17 = NameAndType        #19:#20       // "<init>":()V
   #18 = Utf8               java/lang/Object
   #19 = Utf8               <init>
   #20 = Utf8               ()V
   #21 = Fieldref           #10.#22       // ext/mods/gameserver/model/residence/castle/Castle$CastleFunction._type:I
   #22 = NameAndType        #23:#24       // _type:I
   #23 = Utf8               _type
   #24 = Utf8               I
   #25 = Fieldref           #10.#26       // ext/mods/gameserver/model/residence/castle/Castle$CastleFunction._lvl:I
   #26 = NameAndType        #27:#24       // _lvl:I
   #27 = Utf8               _lvl
   #28 = Fieldref           #10.#29       // ext/mods/gameserver/model/residence/castle/Castle$CastleFunction._fee:I
   #29 = NameAndType        #30:#24       // _fee:I
   #30 = Utf8               _fee
   #31 = Fieldref           #10.#32       // ext/mods/gameserver/model/residence/castle/Castle$CastleFunction._tempFee:I
   #32 = NameAndType        #33:#24       // _tempFee:I
   #33 = Utf8               _tempFee
   #34 = Fieldref           #10.#35       // ext/mods/gameserver/model/residence/castle/Castle$CastleFunction._rate:J
   #35 = NameAndType        #36:#37       // _rate:J
   #36 = Utf8               _rate
   #37 = Utf8               J
   #38 = Fieldref           #10.#39       // ext/mods/gameserver/model/residence/castle/Castle$CastleFunction._endDate:J
   #39 = NameAndType        #40:#37       // _endDate:J
   #40 = Utf8               _endDate
   #41 = Methodref          #10.#42       // ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.initializeTask:(Z)V
   #42 = NameAndType        #43:#44       // initializeTask:(Z)V
   #43 = Utf8               initializeTask
   #44 = Utf8               (Z)V
   #45 = Methodref          #1.#46        // ext/mods/gameserver/model/residence/castle/Castle.getOwnerId:()I
   #46 = NameAndType        #47:#48       // getOwnerId:()I
   #47 = Utf8               getOwnerId
   #48 = Utf8               ()I
   #49 = Methodref          #50.#51       // java/lang/System.currentTimeMillis:()J
   #50 = Class              #52           // java/lang/System
   #51 = NameAndType        #53:#54       // currentTimeMillis:()J
   #52 = Utf8               java/lang/System
   #53 = Utf8               currentTimeMillis
   #54 = Utf8               ()J
   #55 = Class              #56           // ext/mods/gameserver/model/residence/castle/Castle$CastleFunction$FunctionTask
   #56 = Utf8               ext/mods/gameserver/model/residence/castle/Castle$CastleFunction$FunctionTask
   #57 = Methodref          #55.#58       // ext/mods/gameserver/model/residence/castle/Castle$CastleFunction$FunctionTask."<init>":(Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;Z)V
   #58 = NameAndType        #19:#59       // "<init>":(Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;Z)V
   #59 = Utf8               (Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;Z)V
   #60 = Methodref          #61.#62       // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #61 = Class              #63           // ext/mods/commons/pool/ThreadPool
   #62 = NameAndType        #64:#65       // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #63 = Utf8               ext/mods/commons/pool/ThreadPool
   #64 = Utf8               schedule
   #65 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #66 = Methodref          #67.#68       // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
   #67 = Class              #69           // ext/mods/commons/pool/ConnectionPool
   #68 = NameAndType        #70:#71       // getConnection:()Ljava/sql/Connection;
   #69 = Utf8               ext/mods/commons/pool/ConnectionPool
   #70 = Utf8               getConnection
   #71 = Utf8               ()Ljava/sql/Connection;
   #72 = String             #73           // REPLACE INTO castle_functions (castle_id, type, lvl, lease, rate, endTime) VALUES (?,?,?,?,?,?)
   #73 = Utf8               REPLACE INTO castle_functions (castle_id, type, lvl, lease, rate, endTime) VALUES (?,?,?,?,?,?)
   #74 = InterfaceMethodref #75.#76       // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #75 = Class              #77           // java/sql/Connection
   #76 = NameAndType        #78:#79       // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #77 = Utf8               java/sql/Connection
   #78 = Utf8               prepareStatement
   #79 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #80 = Methodref          #1.#81        // ext/mods/gameserver/model/residence/castle/Castle.getId:()I
   #81 = NameAndType        #82:#48       // getId:()I
   #82 = Utf8               getId
   #83 = InterfaceMethodref #84.#85       // java/sql/PreparedStatement.setInt:(II)V
   #84 = Class              #86           // java/sql/PreparedStatement
   #85 = NameAndType        #87:#88       // setInt:(II)V
   #86 = Utf8               java/sql/PreparedStatement
   #87 = Utf8               setInt
   #88 = Utf8               (II)V
   #89 = Methodref          #10.#90       // ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.getType:()I
   #90 = NameAndType        #91:#48       // getType:()I
   #91 = Utf8               getType
   #92 = Methodref          #10.#93       // ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.getLvl:()I
   #93 = NameAndType        #94:#48       // getLvl:()I
   #94 = Utf8               getLvl
   #95 = Methodref          #10.#96       // ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.getLease:()I
   #96 = NameAndType        #97:#48       // getLease:()I
   #97 = Utf8               getLease
   #98 = Methodref          #10.#99       // ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.getRate:()J
   #99 = NameAndType        #100:#54      // getRate:()J
  #100 = Utf8               getRate
  #101 = InterfaceMethodref #84.#102      // java/sql/PreparedStatement.setLong:(IJ)V
  #102 = NameAndType        #103:#104     // setLong:(IJ)V
  #103 = Utf8               setLong
  #104 = Utf8               (IJ)V
  #105 = Methodref          #10.#106      // ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.getEndTime:()J
  #106 = NameAndType        #107:#54      // getEndTime:()J
  #107 = Utf8               getEndTime
  #108 = InterfaceMethodref #84.#109      // java/sql/PreparedStatement.execute:()Z
  #109 = NameAndType        #110:#111     // execute:()Z
  #110 = Utf8               execute
  #111 = Utf8               ()Z
  #112 = InterfaceMethodref #84.#113      // java/sql/PreparedStatement.close:()V
  #113 = NameAndType        #114:#20      // close:()V
  #114 = Utf8               close
  #115 = Class              #116          // java/lang/Throwable
  #116 = Utf8               java/lang/Throwable
  #117 = Methodref          #115.#118     // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
  #118 = NameAndType        #119:#120     // addSuppressed:(Ljava/lang/Throwable;)V
  #119 = Utf8               addSuppressed
  #120 = Utf8               (Ljava/lang/Throwable;)V
  #121 = InterfaceMethodref #75.#113      // java/sql/Connection.close:()V
  #122 = Class              #123          // java/lang/Exception
  #123 = Utf8               java/lang/Exception
  #124 = Fieldref           #1.#125       // ext/mods/gameserver/model/residence/castle/Castle.LOGGER:Lext/mods/commons/logging/CLogger;
  #125 = NameAndType        #126:#127     // LOGGER:Lext/mods/commons/logging/CLogger;
  #126 = Utf8               LOGGER
  #127 = Utf8               Lext/mods/commons/logging/CLogger;
  #128 = Methodref          #122.#129     // java/lang/Exception.getMessage:()Ljava/lang/String;
  #129 = NameAndType        #130:#131     // getMessage:()Ljava/lang/String;
  #130 = Utf8               getMessage
  #131 = Utf8               ()Ljava/lang/String;
  #132 = InvokeDynamic      #0:#133       // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #133 = NameAndType        #134:#135     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #134 = Utf8               makeConcatWithConstants
  #135 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #136 = Methodref          #137.#138     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #137 = Class              #139          // ext/mods/commons/logging/CLogger
  #138 = NameAndType        #140:#141     // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #139 = Utf8               ext/mods/commons/logging/CLogger
  #140 = Utf8               error
  #141 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
  #142 = Utf8               _inDebt
  #143 = Utf8               Z
  #144 = Utf8               _cwh
  #145 = Utf8               (Lext/mods/gameserver/model/residence/castle/Castle;IIIIJJZ)V
  #146 = Utf8               Code
  #147 = Utf8               LineNumberTable
  #148 = Utf8               LocalVariableTable
  #149 = Utf8               this
  #150 = Utf8               Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
  #151 = Utf8               type
  #152 = Utf8               lvl
  #153 = Utf8               lease
  #154 = Utf8               tempLease
  #155 = Utf8               rate
  #156 = Utf8               time
  #157 = Utf8               cwh
  #158 = Utf8               MethodParameters
  #159 = Utf8               setLvl
  #160 = Utf8               (I)V
  #161 = Utf8               setLease
  #162 = Utf8               setEndTime
  #163 = Utf8               (J)V
  #164 = Utf8               currentTime
  #165 = Utf8               StackMapTable
  #166 = Utf8               dbSave
  #167 = Utf8               statement
  #168 = Utf8               Ljava/sql/PreparedStatement;
  #169 = Utf8               con
  #170 = Utf8               Ljava/sql/Connection;
  #171 = Utf8               e
  #172 = Utf8               Ljava/lang/Exception;
  #173 = Utf8               SourceFile
  #174 = Utf8               Castle.java
  #175 = Utf8               NestHost
  #176 = Utf8               BootstrapMethods
  #177 = String             #178          // Exception: Castle.updateFunctions(int type, int lvl, int lease, long rate, long time, boolean addNew): \u0001
  #178 = Utf8               Exception: Castle.updateFunctions(int type, int lvl, int lease, long rate, long time, boolean addNew): \u0001
  #179 = MethodHandle       6:#180        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #180 = Methodref          #181.#182     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #181 = Class              #183          // java/lang/invoke/StringConcatFactory
  #182 = NameAndType        #134:#184     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #183 = Utf8               java/lang/invoke/StringConcatFactory
  #184 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #185 = Utf8               InnerClasses
  #186 = Utf8               CastleFunction
  #187 = Utf8               FunctionTask
  #188 = Class              #189          // java/lang/invoke/MethodHandles$Lookup
  #189 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #190 = Class              #191          // java/lang/invoke/MethodHandles
  #191 = Utf8               java/lang/invoke/MethodHandles
  #192 = Utf8               Lookup
{
  protected int _fee;
    descriptor: I
    flags: (0x0004) ACC_PROTECTED

  protected int _tempFee;
    descriptor: I
    flags: (0x0004) ACC_PROTECTED

  protected boolean _inDebt;
    descriptor: Z
    flags: (0x0004) ACC_PROTECTED

  public boolean _cwh;
    descriptor: Z
    flags: (0x0001) ACC_PUBLIC

  final ext.mods.gameserver.model.residence.castle.Castle this$0;
    descriptor: Lext/mods/gameserver/model/residence/castle/Castle;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  public ext.mods.gameserver.model.residence.castle.Castle$CastleFunction(ext.mods.gameserver.model.residence.castle.Castle, int, int, int, int, long, long, boolean);
    descriptor: (Lext/mods/gameserver/model/residence/castle/Castle;IIIIJJZ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=11, args_size=9
         0: aload_0
         1: aload_1
         2: dup
         3: invokestatic  #3                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
         6: pop
         7: putfield      #9                  // Field this$0:Lext/mods/gameserver/model/residence/castle/Castle;
        10: aload_0
        11: invokespecial #15                 // Method java/lang/Object."<init>":()V
        14: aload_0
        15: iload_2
        16: putfield      #21                 // Field _type:I
        19: aload_0
        20: iload_3
        21: putfield      #25                 // Field _lvl:I
        24: aload_0
        25: iload         4
        27: putfield      #28                 // Field _fee:I
        30: aload_0
        31: iload         5
        33: putfield      #31                 // Field _tempFee:I
        36: aload_0
        37: lload         6
        39: putfield      #34                 // Field _rate:J
        42: aload_0
        43: lload         8
        45: putfield      #38                 // Field _endDate:J
        48: aload_0
        49: iload         10
        51: invokevirtual #41                 // Method initializeTask:(Z)V
        54: return
      LineNumberTable:
        line 1104: 0
        line 1105: 14
        line 1106: 19
        line 1107: 24
        line 1108: 30
        line 1109: 36
        line 1110: 42
        line 1111: 48
        line 1112: 54
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      55     0  this   Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
            0      55     1 this$0   Lext/mods/gameserver/model/residence/castle/Castle;
            0      55     2  type   I
            0      55     3   lvl   I
            0      55     4 lease   I
            0      55     5 tempLease   I
            0      55     6  rate   J
            0      55     8  time   J
            0      55    10   cwh   Z
    MethodParameters:
      Name                           Flags
      <no name>                      final mandated
      <no name>
      <no name>
      <no name>
      <no name>
      <no name>
      <no name>
      <no name>

  public int getType();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #21                 // Field _type:I
         4: ireturn
      LineNumberTable:
        line 1116: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;

  public int getLvl();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #25                 // Field _lvl:I
         4: ireturn
      LineNumberTable:
        line 1121: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;

  public int getLease();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #28                 // Field _fee:I
         4: ireturn
      LineNumberTable:
        line 1126: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;

  public long getRate();
    descriptor: ()J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #34                 // Field _rate:J
         4: lreturn
      LineNumberTable:
        line 1131: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;

  public long getEndTime();
    descriptor: ()J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #38                 // Field _endDate:J
         4: lreturn
      LineNumberTable:
        line 1136: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;

  public void setLvl(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #25                 // Field _lvl:I
         5: return
      LineNumberTable:
        line 1141: 0
        line 1142: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
            0       6     1   lvl   I

  public void setLease(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #28                 // Field _fee:I
         5: return
      LineNumberTable:
        line 1146: 0
        line 1147: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
            0       6     1 lease   I

  public void setEndTime(long);
    descriptor: (J)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=2
         0: aload_0
         1: lload_1
         2: putfield      #38                 // Field _endDate:J
         5: return
      LineNumberTable:
        line 1151: 0
        line 1152: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
            0       6     1  time   J

  public void dbSave();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=5, args_size=1
         0: invokestatic  #66                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         3: astore_1
         4: aload_1
         5: ldc           #72                 // String REPLACE INTO castle_functions (castle_id, type, lvl, lease, rate, endTime) VALUES (?,?,?,?,?,?)
         7: invokeinterface #74,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        12: astore_2
        13: aload_2
        14: iconst_1
        15: aload_0
        16: getfield      #9                  // Field this$0:Lext/mods/gameserver/model/residence/castle/Castle;
        19: invokevirtual #80                 // Method ext/mods/gameserver/model/residence/castle/Castle.getId:()I
        22: invokeinterface #83,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        27: aload_2
        28: iconst_2
        29: aload_0
        30: invokevirtual #89                 // Method getType:()I
        33: invokeinterface #83,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        38: aload_2
        39: iconst_3
        40: aload_0
        41: invokevirtual #92                 // Method getLvl:()I
        44: invokeinterface #83,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        49: aload_2
        50: iconst_4
        51: aload_0
        52: invokevirtual #95                 // Method getLease:()I
        55: invokeinterface #83,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        60: aload_2
        61: iconst_5
        62: aload_0
        63: invokevirtual #98                 // Method getRate:()J
        66: invokeinterface #101,  4          // InterfaceMethod java/sql/PreparedStatement.setLong:(IJ)V
        71: aload_2
        72: bipush        6
        74: aload_0
        75: invokevirtual #105                // Method getEndTime:()J
        78: invokeinterface #101,  4          // InterfaceMethod java/sql/PreparedStatement.setLong:(IJ)V
        83: aload_2
        84: invokeinterface #108,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
        89: pop
        90: aload_2
        91: ifnull        127
        94: aload_2
        95: invokeinterface #112,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       100: goto          127
       103: astore_3
       104: aload_2
       105: ifnull        125
       108: aload_2
       109: invokeinterface #112,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       114: goto          125
       117: astore        4
       119: aload_3
       120: aload         4
       122: invokevirtual #117                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       125: aload_3
       126: athrow
       127: aload_1
       128: ifnull        162
       131: aload_1
       132: invokeinterface #121,  1          // InterfaceMethod java/sql/Connection.close:()V
       137: goto          162
       140: astore_2
       141: aload_1
       142: ifnull        160
       145: aload_1
       146: invokeinterface #121,  1          // InterfaceMethod java/sql/Connection.close:()V
       151: goto          160
       154: astore_3
       155: aload_2
       156: aload_3
       157: invokevirtual #117                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       160: aload_2
       161: athrow
       162: goto          182
       165: astore_1
       166: getstatic     #124                // Field ext/mods/gameserver/model/residence/castle/Castle.LOGGER:Lext/mods/commons/logging/CLogger;
       169: aload_1
       170: invokevirtual #128                // Method java/lang/Exception.getMessage:()Ljava/lang/String;
       173: invokedynamic #132,  0            // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       178: aload_1
       179: invokevirtual #136                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       182: return
      Exception table:
         from    to  target type
            13    90   103   Class java/lang/Throwable
           108   114   117   Class java/lang/Throwable
             4   127   140   Class java/lang/Throwable
           145   151   154   Class java/lang/Throwable
             0   162   165   Class java/lang/Exception
      LineNumberTable:
        line 1206: 0
        line 1207: 4
        line 1209: 13
        line 1210: 27
        line 1211: 38
        line 1212: 49
        line 1213: 60
        line 1214: 71
        line 1215: 83
        line 1216: 90
        line 1206: 103
        line 1216: 127
        line 1206: 140
        line 1220: 162
        line 1217: 165
        line 1219: 166
        line 1221: 182
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           13     114     2 statement   Ljava/sql/PreparedStatement;
            4     158     1   con   Ljava/sql/Connection;
          166      16     1     e   Ljava/lang/Exception;
            0     183     0  this   Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
      StackMapTable: number_of_entries = 10
        frame_type = 255 /* full_frame */
          offset_delta = 103
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle$CastleFunction, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle$CastleFunction, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle$CastleFunction, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 16 /* same */
}
SourceFile: "Castle.java"
NestHost: class ext/mods/gameserver/model/residence/castle/Castle
BootstrapMethods:
  0: #179 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #177 Exception: Castle.updateFunctions(int type, int lvl, int lease, long rate, long time, boolean addNew): \u0001
InnerClasses:
  public #186= #10 of #1;                 // CastleFunction=class ext/mods/gameserver/model/residence/castle/Castle$CastleFunction of class ext/mods/gameserver/model/residence/castle/Castle
  public static final #192= #188 of #190; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
