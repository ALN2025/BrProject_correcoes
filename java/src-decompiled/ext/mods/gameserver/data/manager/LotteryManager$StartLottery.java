// Bytecode for: ext.mods.gameserver.data.manager.LotteryManager$StartLottery
// File: ext\mods\gameserver\data\manager\LotteryManager$StartLottery.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/manager/LotteryManager$StartLottery.class
  Last modified 9 de jul de 2026; size 4975 bytes
  MD5 checksum f7477e7ca5c5ad19bace539ca22fd2ab
  Compiled from "LotteryManager.java"
class ext.mods.gameserver.data.manager.LotteryManager$StartLottery implements java.lang.Runnable
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #10                         // ext/mods/gameserver/data/manager/LotteryManager$StartLottery
  super_class: #16                        // java/lang/Object
  interfaces: 1, fields: 1, methods: 2, attributes: 4
Constant pool:
    #1 = Class              #2            // ext/mods/gameserver/data/manager/LotteryManager
    #2 = Utf8               ext/mods/gameserver/data/manager/LotteryManager
    #3 = Methodref          #4.#5         // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
    #4 = Class              #6            // java/util/Objects
    #5 = NameAndType        #7:#8         // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
    #6 = Utf8               java/util/Objects
    #7 = Utf8               requireNonNull
    #8 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
    #9 = Fieldref           #10.#11       // ext/mods/gameserver/data/manager/LotteryManager$StartLottery.this$0:Lext/mods/gameserver/data/manager/LotteryManager;
   #10 = Class              #12           // ext/mods/gameserver/data/manager/LotteryManager$StartLottery
   #11 = NameAndType        #13:#14       // this$0:Lext/mods/gameserver/data/manager/LotteryManager;
   #12 = Utf8               ext/mods/gameserver/data/manager/LotteryManager$StartLottery
   #13 = Utf8               this$0
   #14 = Utf8               Lext/mods/gameserver/data/manager/LotteryManager;
   #15 = Methodref          #16.#17       // java/lang/Object."<init>":()V
   #16 = Class              #18           // java/lang/Object
   #17 = NameAndType        #19:#20       // "<init>":()V
   #18 = Utf8               java/lang/Object
   #19 = Utf8               <init>
   #20 = Utf8               ()V
   #21 = Methodref          #22.#23       // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
   #22 = Class              #24           // ext/mods/commons/pool/ConnectionPool
   #23 = NameAndType        #25:#26       // getConnection:()Ljava/sql/Connection;
   #24 = Utf8               ext/mods/commons/pool/ConnectionPool
   #25 = Utf8               getConnection
   #26 = Utf8               ()Ljava/sql/Connection;
   #27 = String             #28           // SELECT idnr, prize, newprize, enddate, finished FROM games WHERE id = 1 ORDER BY idnr DESC LIMIT 1
   #28 = Utf8               SELECT idnr, prize, newprize, enddate, finished FROM games WHERE id = 1 ORDER BY idnr DESC LIMIT 1
   #29 = InterfaceMethodref #30.#31       // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #30 = Class              #32           // java/sql/Connection
   #31 = NameAndType        #33:#34       // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #32 = Utf8               java/sql/Connection
   #33 = Utf8               prepareStatement
   #34 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #35 = InterfaceMethodref #36.#37       // java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
   #36 = Class              #38           // java/sql/PreparedStatement
   #37 = NameAndType        #39:#40       // executeQuery:()Ljava/sql/ResultSet;
   #38 = Utf8               java/sql/PreparedStatement
   #39 = Utf8               executeQuery
   #40 = Utf8               ()Ljava/sql/ResultSet;
   #41 = InterfaceMethodref #42.#43       // java/sql/ResultSet.next:()Z
   #42 = Class              #44           // java/sql/ResultSet
   #43 = NameAndType        #45:#46       // next:()Z
   #44 = Utf8               java/sql/ResultSet
   #45 = Utf8               next
   #46 = Utf8               ()Z
   #47 = String             #48           // idnr
   #48 = Utf8               idnr
   #49 = InterfaceMethodref #42.#50       // java/sql/ResultSet.getInt:(Ljava/lang/String;)I
   #50 = NameAndType        #51:#52       // getInt:(Ljava/lang/String;)I
   #51 = Utf8               getInt
   #52 = Utf8               (Ljava/lang/String;)I
   #53 = Fieldref           #1.#54        // ext/mods/gameserver/data/manager/LotteryManager._number:I
   #54 = NameAndType        #55:#56       // _number:I
   #55 = Utf8               _number
   #56 = Utf8               I
   #57 = String             #58           // finished
   #58 = Utf8               finished
   #59 = String             #60           // newprize
   #60 = Utf8               newprize
   #61 = Fieldref           #1.#62        // ext/mods/gameserver/data/manager/LotteryManager._prize:I
   #62 = NameAndType        #63:#56       // _prize:I
   #63 = Utf8               _prize
   #64 = String             #65           // prize
   #65 = Utf8               prize
   #66 = String             #67           // enddate
   #67 = Utf8               enddate
   #68 = InterfaceMethodref #42.#69       // java/sql/ResultSet.getLong:(Ljava/lang/String;)J
   #69 = NameAndType        #70:#71       // getLong:(Ljava/lang/String;)J
   #70 = Utf8               getLong
   #71 = Utf8               (Ljava/lang/String;)J
   #72 = Fieldref           #1.#73        // ext/mods/gameserver/data/manager/LotteryManager._endDate:J
   #73 = NameAndType        #74:#75       // _endDate:J
   #74 = Utf8               _endDate
   #75 = Utf8               J
   #76 = Methodref          #77.#78       // java/lang/System.currentTimeMillis:()J
   #77 = Class              #79           // java/lang/System
   #78 = NameAndType        #80:#81       // currentTimeMillis:()J
   #79 = Utf8               java/lang/System
   #80 = Utf8               currentTimeMillis
   #81 = Utf8               ()J
   #82 = Long               120000l
   #84 = Class              #85           // ext/mods/gameserver/data/manager/LotteryManager$FinishLottery
   #85 = Utf8               ext/mods/gameserver/data/manager/LotteryManager$FinishLottery
   #86 = Methodref          #84.#87       // ext/mods/gameserver/data/manager/LotteryManager$FinishLottery."<init>":(Lext/mods/gameserver/data/manager/LotteryManager;)V
   #87 = NameAndType        #19:#88       // "<init>":(Lext/mods/gameserver/data/manager/LotteryManager;)V
   #88 = Utf8               (Lext/mods/gameserver/data/manager/LotteryManager;)V
   #89 = Methodref          #84.#90       // ext/mods/gameserver/data/manager/LotteryManager$FinishLottery.run:()V
   #90 = NameAndType        #91:#20       // run:()V
   #91 = Utf8               run
   #92 = InterfaceMethodref #42.#93       // java/sql/ResultSet.close:()V
   #93 = NameAndType        #94:#20       // close:()V
   #94 = Utf8               close
   #95 = InterfaceMethodref #36.#93       // java/sql/PreparedStatement.close:()V
   #96 = InterfaceMethodref #30.#93       // java/sql/Connection.close:()V
   #97 = Fieldref           #1.#98        // ext/mods/gameserver/data/manager/LotteryManager._isStarted:Z
   #98 = NameAndType        #99:#100      // _isStarted:Z
   #99 = Utf8               _isStarted
  #100 = Utf8               Z
  #101 = Methodref          #102.#103     // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #102 = Class              #104          // ext/mods/commons/pool/ThreadPool
  #103 = NameAndType        #105:#106     // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #104 = Utf8               ext/mods/commons/pool/ThreadPool
  #105 = Utf8               schedule
  #106 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #107 = Long               720000l
  #109 = Fieldref           #1.#110       // ext/mods/gameserver/data/manager/LotteryManager._isSellingTickets:Z
  #110 = NameAndType        #111:#100     // _isSellingTickets:Z
  #111 = Utf8               _isSellingTickets
  #112 = Class              #113          // ext/mods/gameserver/data/manager/LotteryManager$StopSellingTickets
  #113 = Utf8               ext/mods/gameserver/data/manager/LotteryManager$StopSellingTickets
  #114 = Methodref          #112.#87      // ext/mods/gameserver/data/manager/LotteryManager$StopSellingTickets."<init>":(Lext/mods/gameserver/data/manager/LotteryManager;)V
  #115 = Long               600000l
  #117 = Class              #118          // java/lang/Throwable
  #118 = Utf8               java/lang/Throwable
  #119 = Methodref          #117.#120     // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
  #120 = NameAndType        #121:#122     // addSuppressed:(Ljava/lang/Throwable;)V
  #121 = Utf8               addSuppressed
  #122 = Utf8               (Ljava/lang/Throwable;)V
  #123 = Class              #124          // java/lang/Exception
  #124 = Utf8               java/lang/Exception
  #125 = Fieldref           #1.#126       // ext/mods/gameserver/data/manager/LotteryManager.LOGGER:Lext/mods/commons/logging/CLogger;
  #126 = NameAndType        #127:#128     // LOGGER:Lext/mods/commons/logging/CLogger;
  #127 = Utf8               LOGGER
  #128 = Utf8               Lext/mods/commons/logging/CLogger;
  #129 = String             #130          // Couldn\'t restore lottery data.
  #130 = Utf8               Couldn\'t restore lottery data.
  #131 = Methodref          #132.#133     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #132 = Class              #134          // ext/mods/commons/logging/CLogger
  #133 = NameAndType        #135:#136     // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #134 = Utf8               ext/mods/commons/logging/CLogger
  #135 = Utf8               error
  #136 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
  #137 = Methodref          #1.#138       // ext/mods/gameserver/data/manager/LotteryManager.getId:()I
  #138 = NameAndType        #139:#140     // getId:()I
  #139 = Utf8               getId
  #140 = Utf8               ()I
  #141 = InvokeDynamic      #0:#142       // #0:makeConcatWithConstants:(I)Ljava/lang/String;
  #142 = NameAndType        #143:#144     // makeConcatWithConstants:(I)Ljava/lang/String;
  #143 = Utf8               makeConcatWithConstants
  #144 = Utf8               (I)Ljava/lang/String;
  #145 = Methodref          #146.#147     // ext/mods/gameserver/model/World.announceToOnlinePlayers:(Ljava/lang/String;)V
  #146 = Class              #148          // ext/mods/gameserver/model/World
  #147 = NameAndType        #149:#150     // announceToOnlinePlayers:(Ljava/lang/String;)V
  #148 = Utf8               ext/mods/gameserver/model/World
  #149 = Utf8               announceToOnlinePlayers
  #150 = Utf8               (Ljava/lang/String;)V
  #151 = Methodref          #152.#153     // java/util/Calendar.getInstance:()Ljava/util/Calendar;
  #152 = Class              #154          // java/util/Calendar
  #153 = NameAndType        #155:#156     // getInstance:()Ljava/util/Calendar;
  #154 = Utf8               java/util/Calendar
  #155 = Utf8               getInstance
  #156 = Utf8               ()Ljava/util/Calendar;
  #157 = Methodref          #152.#158     // java/util/Calendar.setTimeInMillis:(J)V
  #158 = NameAndType        #159:#160     // setTimeInMillis:(J)V
  #159 = Utf8               setTimeInMillis
  #160 = Utf8               (J)V
  #161 = Methodref          #152.#162     // java/util/Calendar.set:(II)V
  #162 = NameAndType        #163:#164     // set:(II)V
  #163 = Utf8               set
  #164 = Utf8               (II)V
  #165 = Methodref          #152.#166     // java/util/Calendar.get:(I)I
  #166 = NameAndType        #167:#168     // get:(I)I
  #167 = Utf8               get
  #168 = Utf8               (I)I
  #169 = Methodref          #152.#170     // java/util/Calendar.getTimeInMillis:()J
  #170 = NameAndType        #171:#81      // getTimeInMillis:()J
  #171 = Utf8               getTimeInMillis
  #172 = Long               604800000l
  #174 = String             #175          // INSERT INTO games(id, idnr, enddate, prize, newprize) VALUES (?, ?, ?, ?, ?)
  #175 = Utf8               INSERT INTO games(id, idnr, enddate, prize, newprize) VALUES (?, ?, ?, ?, ?)
  #176 = InterfaceMethodref #36.#177      // java/sql/PreparedStatement.setInt:(II)V
  #177 = NameAndType        #178:#164     // setInt:(II)V
  #178 = Utf8               setInt
  #179 = Methodref          #1.#180       // ext/mods/gameserver/data/manager/LotteryManager.getEndDate:()J
  #180 = NameAndType        #181:#81      // getEndDate:()J
  #181 = Utf8               getEndDate
  #182 = InterfaceMethodref #36.#183      // java/sql/PreparedStatement.setLong:(IJ)V
  #183 = NameAndType        #184:#185     // setLong:(IJ)V
  #184 = Utf8               setLong
  #185 = Utf8               (IJ)V
  #186 = Methodref          #1.#187       // ext/mods/gameserver/data/manager/LotteryManager.getPrize:()I
  #187 = NameAndType        #188:#140     // getPrize:()I
  #188 = Utf8               getPrize
  #189 = InterfaceMethodref #36.#190      // java/sql/PreparedStatement.execute:()Z
  #190 = NameAndType        #191:#46      // execute:()Z
  #191 = Utf8               execute
  #192 = String             #193          // Couldn\'t store new lottery data.
  #193 = Utf8               Couldn\'t store new lottery data.
  #194 = Class              #195          // java/lang/Runnable
  #195 = Utf8               java/lang/Runnable
  #196 = Utf8               Code
  #197 = Utf8               LineNumberTable
  #198 = Utf8               LocalVariableTable
  #199 = Utf8               this
  #200 = Utf8               Lext/mods/gameserver/data/manager/LotteryManager$StartLottery;
  #201 = Utf8               MethodParameters
  #202 = Utf8               rs
  #203 = Utf8               Ljava/sql/ResultSet;
  #204 = Utf8               ps
  #205 = Utf8               Ljava/sql/PreparedStatement;
  #206 = Utf8               con
  #207 = Utf8               Ljava/sql/Connection;
  #208 = Utf8               e
  #209 = Utf8               Ljava/lang/Exception;
  #210 = Utf8               finishTime
  #211 = Utf8               Ljava/util/Calendar;
  #212 = Utf8               StackMapTable
  #213 = Utf8               SourceFile
  #214 = Utf8               LotteryManager.java
  #215 = Utf8               NestHost
  #216 = Utf8               BootstrapMethods
  #217 = String             #218          // Lottery tickets are now available for Lucky Lottery #\u0001.
  #218 = Utf8               Lottery tickets are now available for Lucky Lottery #\u0001.
  #219 = MethodHandle       6:#220        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #220 = Methodref          #221.#222     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #221 = Class              #223          // java/lang/invoke/StringConcatFactory
  #222 = NameAndType        #143:#224     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #223 = Utf8               java/lang/invoke/StringConcatFactory
  #224 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #225 = Utf8               InnerClasses
  #226 = Utf8               StartLottery
  #227 = Utf8               FinishLottery
  #228 = Utf8               StopSellingTickets
  #229 = Class              #230          // java/lang/invoke/MethodHandles$Lookup
  #230 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #231 = Class              #232          // java/lang/invoke/MethodHandles
  #232 = Utf8               java/lang/invoke/MethodHandles
  #233 = Utf8               Lookup
{
  final ext.mods.gameserver.data.manager.LotteryManager this$0;
    descriptor: Lext/mods/gameserver/data/manager/LotteryManager;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  protected ext.mods.gameserver.data.manager.LotteryManager$StartLottery(ext.mods.gameserver.data.manager.LotteryManager);
    descriptor: (Lext/mods/gameserver/data/manager/LotteryManager;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: dup
         3: invokestatic  #3                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
         6: pop
         7: putfield      #9                  // Field this$0:Lext/mods/gameserver/data/manager/LotteryManager;
        10: aload_0
        11: invokespecial #15                 // Method java/lang/Object."<init>":()V
        14: return
      LineNumberTable:
        line 228: 0
        line 229: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/data/manager/LotteryManager$StartLottery;
    MethodParameters:
      Name                           Flags
      <no name>                      final synthetic

  public void run();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=6, args_size=1
         0: invokestatic  #21                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         3: astore_1
         4: aload_1
         5: ldc           #27                 // String SELECT idnr, prize, newprize, enddate, finished FROM games WHERE id = 1 ORDER BY idnr DESC LIMIT 1
         7: invokeinterface #29,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        12: astore_2
        13: aload_2
        14: invokeinterface #35,  1           // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
        19: astore_3
        20: aload_3
        21: invokeinterface #41,  1           // InterfaceMethod java/sql/ResultSet.next:()Z
        26: ifeq          315
        29: aload_0
        30: getfield      #9                  // Field this$0:Lext/mods/gameserver/data/manager/LotteryManager;
        33: aload_3
        34: ldc           #47                 // String idnr
        36: invokeinterface #49,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        41: putfield      #53                 // Field ext/mods/gameserver/data/manager/LotteryManager._number:I
        44: aload_3
        45: ldc           #57                 // String finished
        47: invokeinterface #49,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        52: iconst_1
        53: if_icmpne     87
        56: aload_0
        57: getfield      #9                  // Field this$0:Lext/mods/gameserver/data/manager/LotteryManager;
        60: dup
        61: getfield      #53                 // Field ext/mods/gameserver/data/manager/LotteryManager._number:I
        64: iconst_1
        65: iadd
        66: putfield      #53                 // Field ext/mods/gameserver/data/manager/LotteryManager._number:I
        69: aload_0
        70: getfield      #9                  // Field this$0:Lext/mods/gameserver/data/manager/LotteryManager;
        73: aload_3
        74: ldc           #59                 // String newprize
        76: invokeinterface #49,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        81: putfield      #61                 // Field ext/mods/gameserver/data/manager/LotteryManager._prize:I
        84: goto          315
        87: aload_0
        88: getfield      #9                  // Field this$0:Lext/mods/gameserver/data/manager/LotteryManager;
        91: aload_3
        92: ldc           #64                 // String prize
        94: invokeinterface #49,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        99: putfield      #61                 // Field ext/mods/gameserver/data/manager/LotteryManager._prize:I
       102: aload_0
       103: getfield      #9                  // Field this$0:Lext/mods/gameserver/data/manager/LotteryManager;
       106: aload_3
       107: ldc           #66                 // String enddate
       109: invokeinterface #68,  2           // InterfaceMethod java/sql/ResultSet.getLong:(Ljava/lang/String;)J
       114: putfield      #72                 // Field ext/mods/gameserver/data/manager/LotteryManager._endDate:J
       117: aload_0
       118: getfield      #9                  // Field this$0:Lext/mods/gameserver/data/manager/LotteryManager;
       121: getfield      #72                 // Field ext/mods/gameserver/data/manager/LotteryManager._endDate:J
       124: invokestatic  #76                 // Method java/lang/System.currentTimeMillis:()J
       127: ldc2_w        #82                 // long 120000l
       130: ladd
       131: lcmp
       132: ifgt          180
       135: new           #84                 // class ext/mods/gameserver/data/manager/LotteryManager$FinishLottery
       138: dup
       139: aload_0
       140: getfield      #9                  // Field this$0:Lext/mods/gameserver/data/manager/LotteryManager;
       143: invokespecial #86                 // Method ext/mods/gameserver/data/manager/LotteryManager$FinishLottery."<init>":(Lext/mods/gameserver/data/manager/LotteryManager;)V
       146: invokevirtual #89                 // Method ext/mods/gameserver/data/manager/LotteryManager$FinishLottery.run:()V
       149: aload_3
       150: ifnull        159
       153: aload_3
       154: invokeinterface #92,  1           // InterfaceMethod java/sql/ResultSet.close:()V
       159: aload_2
       160: ifnull        169
       163: aload_2
       164: invokeinterface #95,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       169: aload_1
       170: ifnull        179
       173: aload_1
       174: invokeinterface #96,  1           // InterfaceMethod java/sql/Connection.close:()V
       179: return
       180: aload_0
       181: getfield      #9                  // Field this$0:Lext/mods/gameserver/data/manager/LotteryManager;
       184: getfield      #72                 // Field ext/mods/gameserver/data/manager/LotteryManager._endDate:J
       187: invokestatic  #76                 // Method java/lang/System.currentTimeMillis:()J
       190: lcmp
       191: ifle          315
       194: aload_0
       195: getfield      #9                  // Field this$0:Lext/mods/gameserver/data/manager/LotteryManager;
       198: iconst_1
       199: putfield      #97                 // Field ext/mods/gameserver/data/manager/LotteryManager._isStarted:Z
       202: new           #84                 // class ext/mods/gameserver/data/manager/LotteryManager$FinishLottery
       205: dup
       206: aload_0
       207: getfield      #9                  // Field this$0:Lext/mods/gameserver/data/manager/LotteryManager;
       210: invokespecial #86                 // Method ext/mods/gameserver/data/manager/LotteryManager$FinishLottery."<init>":(Lext/mods/gameserver/data/manager/LotteryManager;)V
       213: aload_0
       214: getfield      #9                  // Field this$0:Lext/mods/gameserver/data/manager/LotteryManager;
       217: getfield      #72                 // Field ext/mods/gameserver/data/manager/LotteryManager._endDate:J
       220: invokestatic  #76                 // Method java/lang/System.currentTimeMillis:()J
       223: lsub
       224: invokestatic  #101                // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
       227: pop
       228: aload_0
       229: getfield      #9                  // Field this$0:Lext/mods/gameserver/data/manager/LotteryManager;
       232: getfield      #72                 // Field ext/mods/gameserver/data/manager/LotteryManager._endDate:J
       235: invokestatic  #76                 // Method java/lang/System.currentTimeMillis:()J
       238: ldc2_w        #107                // long 720000l
       241: ladd
       242: lcmp
       243: ifle          284
       246: aload_0
       247: getfield      #9                  // Field this$0:Lext/mods/gameserver/data/manager/LotteryManager;
       250: iconst_1
       251: putfield      #109                // Field ext/mods/gameserver/data/manager/LotteryManager._isSellingTickets:Z
       254: new           #112                // class ext/mods/gameserver/data/manager/LotteryManager$StopSellingTickets
       257: dup
       258: aload_0
       259: getfield      #9                  // Field this$0:Lext/mods/gameserver/data/manager/LotteryManager;
       262: invokespecial #114                // Method ext/mods/gameserver/data/manager/LotteryManager$StopSellingTickets."<init>":(Lext/mods/gameserver/data/manager/LotteryManager;)V
       265: aload_0
       266: getfield      #9                  // Field this$0:Lext/mods/gameserver/data/manager/LotteryManager;
       269: getfield      #72                 // Field ext/mods/gameserver/data/manager/LotteryManager._endDate:J
       272: invokestatic  #76                 // Method java/lang/System.currentTimeMillis:()J
       275: lsub
       276: ldc2_w        #115                // long 600000l
       279: lsub
       280: invokestatic  #101                // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
       283: pop
       284: aload_3
       285: ifnull        294
       288: aload_3
       289: invokeinterface #92,  1           // InterfaceMethod java/sql/ResultSet.close:()V
       294: aload_2
       295: ifnull        304
       298: aload_2
       299: invokeinterface #95,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       304: aload_1
       305: ifnull        314
       308: aload_1
       309: invokeinterface #96,  1           // InterfaceMethod java/sql/Connection.close:()V
       314: return
       315: aload_3
       316: ifnull        355
       319: aload_3
       320: invokeinterface #92,  1           // InterfaceMethod java/sql/ResultSet.close:()V
       325: goto          355
       328: astore        4
       330: aload_3
       331: ifnull        352
       334: aload_3
       335: invokeinterface #92,  1           // InterfaceMethod java/sql/ResultSet.close:()V
       340: goto          352
       343: astore        5
       345: aload         4
       347: aload         5
       349: invokevirtual #119                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       352: aload         4
       354: athrow
       355: aload_2
       356: ifnull        392
       359: aload_2
       360: invokeinterface #95,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       365: goto          392
       368: astore_3
       369: aload_2
       370: ifnull        390
       373: aload_2
       374: invokeinterface #95,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       379: goto          390
       382: astore        4
       384: aload_3
       385: aload         4
       387: invokevirtual #119                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       390: aload_3
       391: athrow
       392: aload_1
       393: ifnull        427
       396: aload_1
       397: invokeinterface #96,  1           // InterfaceMethod java/sql/Connection.close:()V
       402: goto          427
       405: astore_2
       406: aload_1
       407: ifnull        425
       410: aload_1
       411: invokeinterface #96,  1           // InterfaceMethod java/sql/Connection.close:()V
       416: goto          425
       419: astore_3
       420: aload_2
       421: aload_3
       422: invokevirtual #119                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       425: aload_2
       426: athrow
       427: goto          440
       430: astore_1
       431: getstatic     #125                // Field ext/mods/gameserver/data/manager/LotteryManager.LOGGER:Lext/mods/commons/logging/CLogger;
       434: ldc           #129                // String Couldn\'t restore lottery data.
       436: aload_1
       437: invokevirtual #131                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       440: aload_0
       441: getfield      #9                  // Field this$0:Lext/mods/gameserver/data/manager/LotteryManager;
       444: iconst_1
       445: putfield      #109                // Field ext/mods/gameserver/data/manager/LotteryManager._isSellingTickets:Z
       448: aload_0
       449: getfield      #9                  // Field this$0:Lext/mods/gameserver/data/manager/LotteryManager;
       452: iconst_1
       453: putfield      #97                 // Field ext/mods/gameserver/data/manager/LotteryManager._isStarted:Z
       456: aload_0
       457: getfield      #9                  // Field this$0:Lext/mods/gameserver/data/manager/LotteryManager;
       460: invokevirtual #137                // Method ext/mods/gameserver/data/manager/LotteryManager.getId:()I
       463: invokedynamic #141,  0            // InvokeDynamic #0:makeConcatWithConstants:(I)Ljava/lang/String;
       468: invokestatic  #145                // Method ext/mods/gameserver/model/World.announceToOnlinePlayers:(Ljava/lang/String;)V
       471: invokestatic  #151                // Method java/util/Calendar.getInstance:()Ljava/util/Calendar;
       474: astore_1
       475: aload_1
       476: aload_0
       477: getfield      #9                  // Field this$0:Lext/mods/gameserver/data/manager/LotteryManager;
       480: getfield      #72                 // Field ext/mods/gameserver/data/manager/LotteryManager._endDate:J
       483: invokevirtual #157                // Method java/util/Calendar.setTimeInMillis:(J)V
       486: aload_1
       487: bipush        12
       489: iconst_0
       490: invokevirtual #161                // Method java/util/Calendar.set:(II)V
       493: aload_1
       494: bipush        13
       496: iconst_0
       497: invokevirtual #161                // Method java/util/Calendar.set:(II)V
       500: aload_1
       501: bipush        7
       503: invokevirtual #165                // Method java/util/Calendar.get:(I)I
       506: bipush        7
       508: if_icmpne     548
       511: aload_1
       512: bipush        11
       514: bipush        19
       516: invokevirtual #161                // Method java/util/Calendar.set:(II)V
       519: aload_0
       520: getfield      #9                  // Field this$0:Lext/mods/gameserver/data/manager/LotteryManager;
       523: aload_1
       524: invokevirtual #169                // Method java/util/Calendar.getTimeInMillis:()J
       527: putfield      #72                 // Field ext/mods/gameserver/data/manager/LotteryManager._endDate:J
       530: aload_0
       531: getfield      #9                  // Field this$0:Lext/mods/gameserver/data/manager/LotteryManager;
       534: dup
       535: getfield      #72                 // Field ext/mods/gameserver/data/manager/LotteryManager._endDate:J
       538: ldc2_w        #172                // long 604800000l
       541: ladd
       542: putfield      #72                 // Field ext/mods/gameserver/data/manager/LotteryManager._endDate:J
       545: goto          575
       548: aload_1
       549: bipush        7
       551: bipush        7
       553: invokevirtual #161                // Method java/util/Calendar.set:(II)V
       556: aload_1
       557: bipush        11
       559: bipush        19
       561: invokevirtual #161                // Method java/util/Calendar.set:(II)V
       564: aload_0
       565: getfield      #9                  // Field this$0:Lext/mods/gameserver/data/manager/LotteryManager;
       568: aload_1
       569: invokevirtual #169                // Method java/util/Calendar.getTimeInMillis:()J
       572: putfield      #72                 // Field ext/mods/gameserver/data/manager/LotteryManager._endDate:J
       575: new           #112                // class ext/mods/gameserver/data/manager/LotteryManager$StopSellingTickets
       578: dup
       579: aload_0
       580: getfield      #9                  // Field this$0:Lext/mods/gameserver/data/manager/LotteryManager;
       583: invokespecial #114                // Method ext/mods/gameserver/data/manager/LotteryManager$StopSellingTickets."<init>":(Lext/mods/gameserver/data/manager/LotteryManager;)V
       586: aload_0
       587: getfield      #9                  // Field this$0:Lext/mods/gameserver/data/manager/LotteryManager;
       590: getfield      #72                 // Field ext/mods/gameserver/data/manager/LotteryManager._endDate:J
       593: invokestatic  #76                 // Method java/lang/System.currentTimeMillis:()J
       596: lsub
       597: ldc2_w        #115                // long 600000l
       600: lsub
       601: invokestatic  #101                // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
       604: pop
       605: new           #84                 // class ext/mods/gameserver/data/manager/LotteryManager$FinishLottery
       608: dup
       609: aload_0
       610: getfield      #9                  // Field this$0:Lext/mods/gameserver/data/manager/LotteryManager;
       613: invokespecial #86                 // Method ext/mods/gameserver/data/manager/LotteryManager$FinishLottery."<init>":(Lext/mods/gameserver/data/manager/LotteryManager;)V
       616: aload_0
       617: getfield      #9                  // Field this$0:Lext/mods/gameserver/data/manager/LotteryManager;
       620: getfield      #72                 // Field ext/mods/gameserver/data/manager/LotteryManager._endDate:J
       623: invokestatic  #76                 // Method java/lang/System.currentTimeMillis:()J
       626: lsub
       627: invokestatic  #101                // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
       630: pop
       631: invokestatic  #21                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
       634: astore_2
       635: aload_2
       636: ldc           #174                // String INSERT INTO games(id, idnr, enddate, prize, newprize) VALUES (?, ?, ?, ?, ?)
       638: invokeinterface #29,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       643: astore_3
       644: aload_3
       645: iconst_1
       646: iconst_1
       647: invokeinterface #176,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       652: aload_3
       653: iconst_2
       654: aload_0
       655: getfield      #9                  // Field this$0:Lext/mods/gameserver/data/manager/LotteryManager;
       658: invokevirtual #137                // Method ext/mods/gameserver/data/manager/LotteryManager.getId:()I
       661: invokeinterface #176,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       666: aload_3
       667: iconst_3
       668: aload_0
       669: getfield      #9                  // Field this$0:Lext/mods/gameserver/data/manager/LotteryManager;
       672: invokevirtual #179                // Method ext/mods/gameserver/data/manager/LotteryManager.getEndDate:()J
       675: invokeinterface #182,  4          // InterfaceMethod java/sql/PreparedStatement.setLong:(IJ)V
       680: aload_3
       681: iconst_4
       682: aload_0
       683: getfield      #9                  // Field this$0:Lext/mods/gameserver/data/manager/LotteryManager;
       686: invokevirtual #186                // Method ext/mods/gameserver/data/manager/LotteryManager.getPrize:()I
       689: invokeinterface #176,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       694: aload_3
       695: iconst_5
       696: aload_0
       697: getfield      #9                  // Field this$0:Lext/mods/gameserver/data/manager/LotteryManager;
       700: invokevirtual #186                // Method ext/mods/gameserver/data/manager/LotteryManager.getPrize:()I
       703: invokeinterface #176,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       708: aload_3
       709: invokeinterface #189,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
       714: pop
       715: aload_3
       716: ifnull        755
       719: aload_3
       720: invokeinterface #95,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       725: goto          755
       728: astore        4
       730: aload_3
       731: ifnull        752
       734: aload_3
       735: invokeinterface #95,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       740: goto          752
       743: astore        5
       745: aload         4
       747: aload         5
       749: invokevirtual #119                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       752: aload         4
       754: athrow
       755: aload_2
       756: ifnull        792
       759: aload_2
       760: invokeinterface #96,  1           // InterfaceMethod java/sql/Connection.close:()V
       765: goto          792
       768: astore_3
       769: aload_2
       770: ifnull        790
       773: aload_2
       774: invokeinterface #96,  1           // InterfaceMethod java/sql/Connection.close:()V
       779: goto          790
       782: astore        4
       784: aload_3
       785: aload         4
       787: invokevirtual #119                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       790: aload_3
       791: athrow
       792: goto          805
       795: astore_2
       796: getstatic     #125                // Field ext/mods/gameserver/data/manager/LotteryManager.LOGGER:Lext/mods/commons/logging/CLogger;
       799: ldc           #192                // String Couldn\'t store new lottery data.
       801: aload_2
       802: invokevirtual #131                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       805: return
      Exception table:
         from    to  target type
            20   149   328   Class java/lang/Throwable
           180   284   328   Class java/lang/Throwable
           334   340   343   Class java/lang/Throwable
            13   159   368   Class java/lang/Throwable
           180   294   368   Class java/lang/Throwable
           315   355   368   Class java/lang/Throwable
           373   379   382   Class java/lang/Throwable
             4   169   405   Class java/lang/Throwable
           180   304   405   Class java/lang/Throwable
           315   392   405   Class java/lang/Throwable
           410   416   419   Class java/lang/Throwable
             0   179   430   Class java/lang/Exception
           180   314   430   Class java/lang/Exception
           315   427   430   Class java/lang/Exception
           644   715   728   Class java/lang/Throwable
           734   740   743   Class java/lang/Throwable
           635   755   768   Class java/lang/Throwable
           773   779   782   Class java/lang/Throwable
           631   792   795   Class java/lang/Exception
      LineNumberTable:
        line 234: 0
        line 235: 4
        line 236: 13
        line 238: 20
        line 240: 29
        line 242: 44
        line 244: 56
        line 245: 69
        line 249: 87
        line 250: 102
        line 252: 117
        line 254: 135
        line 272: 149
        line 255: 179
        line 258: 180
        line 260: 194
        line 261: 202
        line 263: 228
        line 265: 246
        line 266: 254
        line 272: 284
        line 268: 314
        line 272: 315
        line 234: 328
        line 272: 355
        line 234: 368
        line 272: 392
        line 234: 405
        line 276: 427
        line 273: 430
        line 275: 431
        line 278: 440
        line 279: 448
        line 281: 456
        line 283: 471
        line 284: 475
        line 285: 486
        line 286: 493
        line 288: 500
        line 290: 511
        line 291: 519
        line 292: 530
        line 296: 548
        line 297: 556
        line 298: 564
        line 301: 575
        line 302: 605
        line 304: 631
        line 305: 635
        line 307: 644
        line 308: 652
        line 309: 666
        line 310: 680
        line 311: 694
        line 312: 708
        line 313: 715
        line 304: 728
        line 313: 755
        line 304: 768
        line 317: 792
        line 314: 795
        line 316: 796
        line 318: 805
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           20     335     3    rs   Ljava/sql/ResultSet;
           13     379     2    ps   Ljava/sql/PreparedStatement;
            4     423     1   con   Ljava/sql/Connection;
          431       9     1     e   Ljava/lang/Exception;
          644     111     3    ps   Ljava/sql/PreparedStatement;
          635     157     2   con   Ljava/sql/Connection;
          796       9     2     e   Ljava/lang/Exception;
            0     806     0  this   Lext/mods/gameserver/data/manager/LotteryManager$StartLottery;
          475     331     1 finishTime   Ljava/util/Calendar;
      StackMapTable: number_of_entries = 36
        frame_type = 254 /* append */
          offset_delta = 87
          locals = [ class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 71
        frame_type = 9 /* same */
        frame_type = 9 /* same */
        frame_type = 0 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 103
        frame_type = 9 /* same */
        frame_type = 9 /* same */
        frame_type = 9 /* same */
        frame_type = 0 /* same */
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/data/manager/LotteryManager$StartLottery, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/data/manager/LotteryManager$StartLottery, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/data/manager/LotteryManager$StartLottery, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 9 /* same */
        frame_type = 252 /* append */
          offset_delta = 107
          locals = [ class java/util/Calendar ]
        frame_type = 26 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 152
          locals = [ class ext/mods/gameserver/data/manager/LotteryManager$StartLottery, class java/util/Calendar, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/data/manager/LotteryManager$StartLottery, class java/util/Calendar, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/data/manager/LotteryManager$StartLottery, class java/util/Calendar, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 9 /* same */
}
SourceFile: "LotteryManager.java"
NestHost: class ext/mods/gameserver/data/manager/LotteryManager
BootstrapMethods:
  0: #219 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #217 Lottery tickets are now available for Lucky Lottery #\u0001.
InnerClasses:
  public static final #233= #229 of #231; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
