// Bytecode for: ext.mods.gameserver.data.manager.LotteryManager
// File: ext\mods\gameserver\data\manager\LotteryManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/manager/LotteryManager.class
  Last modified 9 de jul de 2026; size 6361 bytes
  MD5 checksum c8cea6ce2b6ebcd0ec4bf77349b733fc
  Compiled from "LotteryManager.java"
public class ext.mods.gameserver.data.manager.LotteryManager
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/data/manager/LotteryManager
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 14, methods: 12, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/data/manager/LotteryManager._number:I
    #8 = Class              #10           // ext/mods/gameserver/data/manager/LotteryManager
    #9 = NameAndType        #11:#12       // _number:I
   #10 = Utf8               ext/mods/gameserver/data/manager/LotteryManager
   #11 = Utf8               _number
   #12 = Utf8               I
   #13 = Fieldref           #14.#15       // ext/mods/Config.LOTTERY_PRIZE:I
   #14 = Class              #16           // ext/mods/Config
   #15 = NameAndType        #17:#12       // LOTTERY_PRIZE:I
   #16 = Utf8               ext/mods/Config
   #17 = Utf8               LOTTERY_PRIZE
   #18 = Fieldref           #8.#19        // ext/mods/gameserver/data/manager/LotteryManager._prize:I
   #19 = NameAndType        #20:#12       // _prize:I
   #20 = Utf8               _prize
   #21 = Fieldref           #8.#22        // ext/mods/gameserver/data/manager/LotteryManager._isSellingTickets:Z
   #22 = NameAndType        #23:#24       // _isSellingTickets:Z
   #23 = Utf8               _isSellingTickets
   #24 = Utf8               Z
   #25 = Fieldref           #8.#26        // ext/mods/gameserver/data/manager/LotteryManager._isStarted:Z
   #26 = NameAndType        #27:#24       // _isStarted:Z
   #27 = Utf8               _isStarted
   #28 = Methodref          #29.#30       // java/lang/System.currentTimeMillis:()J
   #29 = Class              #31           // java/lang/System
   #30 = NameAndType        #32:#33       // currentTimeMillis:()J
   #31 = Utf8               java/lang/System
   #32 = Utf8               currentTimeMillis
   #33 = Utf8               ()J
   #34 = Fieldref           #8.#35        // ext/mods/gameserver/data/manager/LotteryManager._endDate:J
   #35 = NameAndType        #36:#37       // _endDate:J
   #36 = Utf8               _endDate
   #37 = Utf8               J
   #38 = Fieldref           #14.#39       // ext/mods/Config.ALLOW_LOTTERY:Z
   #39 = NameAndType        #40:#24       // ALLOW_LOTTERY:Z
   #40 = Utf8               ALLOW_LOTTERY
   #41 = Class              #42           // ext/mods/gameserver/data/manager/LotteryManager$StartLottery
   #42 = Utf8               ext/mods/gameserver/data/manager/LotteryManager$StartLottery
   #43 = Methodref          #41.#44       // ext/mods/gameserver/data/manager/LotteryManager$StartLottery."<init>":(Lext/mods/gameserver/data/manager/LotteryManager;)V
   #44 = NameAndType        #5:#45        // "<init>":(Lext/mods/gameserver/data/manager/LotteryManager;)V
   #45 = Utf8               (Lext/mods/gameserver/data/manager/LotteryManager;)V
   #46 = Methodref          #41.#47       // ext/mods/gameserver/data/manager/LotteryManager$StartLottery.run:()V
   #47 = NameAndType        #48:#6        // run:()V
   #48 = Utf8               run
   #49 = Methodref          #50.#51       // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
   #50 = Class              #52           // ext/mods/commons/pool/ConnectionPool
   #51 = NameAndType        #53:#54       // getConnection:()Ljava/sql/Connection;
   #52 = Utf8               ext/mods/commons/pool/ConnectionPool
   #53 = Utf8               getConnection
   #54 = Utf8               ()Ljava/sql/Connection;
   #55 = String             #56           // UPDATE games SET prize=?, newprize=? WHERE id = 1 AND idnr = ?
   #56 = Utf8               UPDATE games SET prize=?, newprize=? WHERE id = 1 AND idnr = ?
   #57 = InterfaceMethodref #58.#59       // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #58 = Class              #60           // java/sql/Connection
   #59 = NameAndType        #61:#62       // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #60 = Utf8               java/sql/Connection
   #61 = Utf8               prepareStatement
   #62 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #63 = Methodref          #8.#64        // ext/mods/gameserver/data/manager/LotteryManager.getPrize:()I
   #64 = NameAndType        #65:#66       // getPrize:()I
   #65 = Utf8               getPrize
   #66 = Utf8               ()I
   #67 = InterfaceMethodref #68.#69       // java/sql/PreparedStatement.setInt:(II)V
   #68 = Class              #70           // java/sql/PreparedStatement
   #69 = NameAndType        #71:#72       // setInt:(II)V
   #70 = Utf8               java/sql/PreparedStatement
   #71 = Utf8               setInt
   #72 = Utf8               (II)V
   #73 = Methodref          #8.#74        // ext/mods/gameserver/data/manager/LotteryManager.getId:()I
   #74 = NameAndType        #75:#66       // getId:()I
   #75 = Utf8               getId
   #76 = InterfaceMethodref #68.#77       // java/sql/PreparedStatement.execute:()Z
   #77 = NameAndType        #78:#79       // execute:()Z
   #78 = Utf8               execute
   #79 = Utf8               ()Z
   #80 = InterfaceMethodref #68.#81       // java/sql/PreparedStatement.close:()V
   #81 = NameAndType        #82:#6        // close:()V
   #82 = Utf8               close
   #83 = Class              #84           // java/lang/Throwable
   #84 = Utf8               java/lang/Throwable
   #85 = Methodref          #83.#86       // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
   #86 = NameAndType        #87:#88       // addSuppressed:(Ljava/lang/Throwable;)V
   #87 = Utf8               addSuppressed
   #88 = Utf8               (Ljava/lang/Throwable;)V
   #89 = InterfaceMethodref #58.#81       // java/sql/Connection.close:()V
   #90 = Class              #91           // java/lang/Exception
   #91 = Utf8               java/lang/Exception
   #92 = Fieldref           #8.#93        // ext/mods/gameserver/data/manager/LotteryManager.LOGGER:Lext/mods/commons/logging/CLogger;
   #93 = NameAndType        #94:#95       // LOGGER:Lext/mods/commons/logging/CLogger;
   #94 = Utf8               LOGGER
   #95 = Utf8               Lext/mods/commons/logging/CLogger;
   #96 = String             #97           // Couldn\'t increase current lottery prize.
   #97 = Utf8               Couldn\'t increase current lottery prize.
   #98 = Methodref          #99.#100      // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
   #99 = Class              #101          // ext/mods/commons/logging/CLogger
  #100 = NameAndType        #102:#103     // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #101 = Utf8               ext/mods/commons/logging/CLogger
  #102 = Utf8               error
  #103 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
  #104 = Double             2.0d
  #106 = Methodref          #107.#108     // ext/mods/gameserver/model/item/instance/ItemInstance.getCustomType1:()I
  #107 = Class              #109          // ext/mods/gameserver/model/item/instance/ItemInstance
  #108 = NameAndType        #110:#66      // getCustomType1:()I
  #109 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #110 = Utf8               getCustomType1
  #111 = Methodref          #107.#112     // ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
  #112 = NameAndType        #113:#66      // getEnchantLevel:()I
  #113 = Utf8               getEnchantLevel
  #114 = Methodref          #107.#115     // ext/mods/gameserver/model/item/instance/ItemInstance.getCustomType2:()I
  #115 = NameAndType        #116:#66      // getCustomType2:()I
  #116 = Utf8               getCustomType2
  #117 = Methodref          #8.#118       // ext/mods/gameserver/data/manager/LotteryManager.checkTicket:(III)[I
  #118 = NameAndType        #119:#120     // checkTicket:(III)[I
  #119 = Utf8               checkTicket
  #120 = Utf8               (III)[I
  #121 = String             #122          // SELECT number1, number2, prize1, prize2, prize3 FROM games WHERE id = 1 and idnr = ?
  #122 = Utf8               SELECT number1, number2, prize1, prize2, prize3 FROM games WHERE id = 1 and idnr = ?
  #123 = InterfaceMethodref #68.#124      // java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
  #124 = NameAndType        #125:#126     // executeQuery:()Ljava/sql/ResultSet;
  #125 = Utf8               executeQuery
  #126 = Utf8               ()Ljava/sql/ResultSet;
  #127 = InterfaceMethodref #128.#129     // java/sql/ResultSet.next:()Z
  #128 = Class              #130          // java/sql/ResultSet
  #129 = NameAndType        #131:#79      // next:()Z
  #130 = Utf8               java/sql/ResultSet
  #131 = Utf8               next
  #132 = String             #133          // number1
  #133 = Utf8               number1
  #134 = InterfaceMethodref #128.#135     // java/sql/ResultSet.getInt:(Ljava/lang/String;)I
  #135 = NameAndType        #136:#137     // getInt:(Ljava/lang/String;)I
  #136 = Utf8               getInt
  #137 = Utf8               (Ljava/lang/String;)I
  #138 = String             #139          // number2
  #139 = Utf8               number2
  #140 = InterfaceMethodref #128.#81      // java/sql/ResultSet.close:()V
  #141 = String             #142          // prize1
  #142 = Utf8               prize1
  #143 = String             #144          // prize2
  #144 = Utf8               prize2
  #145 = String             #146          // prize3
  #146 = Utf8               prize3
  #147 = Fieldref           #14.#148      // ext/mods/Config.LOTTERY_2_AND_1_NUMBER_PRIZE:I
  #148 = NameAndType        #149:#12      // LOTTERY_2_AND_1_NUMBER_PRIZE:I
  #149 = Utf8               LOTTERY_2_AND_1_NUMBER_PRIZE
  #150 = String             #151          // Couldn\'t check lottery ticket #{}.
  #151 = Utf8               Couldn\'t check lottery ticket #{}.
  #152 = Methodref          #153.#154     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #153 = Class              #155          // java/lang/Integer
  #154 = NameAndType        #156:#157     // valueOf:(I)Ljava/lang/Integer;
  #155 = Utf8               java/lang/Integer
  #156 = Utf8               valueOf
  #157 = Utf8               (I)Ljava/lang/Integer;
  #158 = Methodref          #99.#159      // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #159 = NameAndType        #102:#160     // error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #160 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #161 = Fieldref           #162.#163     // ext/mods/gameserver/data/manager/LotteryManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/manager/LotteryManager;
  #162 = Class              #164          // ext/mods/gameserver/data/manager/LotteryManager$SingletonHolder
  #163 = NameAndType        #165:#166     // INSTANCE:Lext/mods/gameserver/data/manager/LotteryManager;
  #164 = Utf8               ext/mods/gameserver/data/manager/LotteryManager$SingletonHolder
  #165 = Utf8               INSTANCE
  #166 = Utf8               Lext/mods/gameserver/data/manager/LotteryManager;
  #167 = Methodref          #168.#169     // java/lang/Class.getName:()Ljava/lang/String;
  #168 = Class              #170          // java/lang/Class
  #169 = NameAndType        #171:#172     // getName:()Ljava/lang/String;
  #170 = Utf8               java/lang/Class
  #171 = Utf8               getName
  #172 = Utf8               ()Ljava/lang/String;
  #173 = Methodref          #99.#174      // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #174 = NameAndType        #5:#175       // "<init>":(Ljava/lang/String;)V
  #175 = Utf8               (Ljava/lang/String;)V
  #176 = Utf8               SECOND
  #177 = Utf8               ConstantValue
  #178 = Long               1000l
  #180 = Utf8               MINUTE
  #181 = Long               60000l
  #183 = Utf8               INSERT_LOTTERY
  #184 = Utf8               Ljava/lang/String;
  #185 = String             #186          // INSERT INTO games(id, idnr, enddate, prize, newprize) VALUES (?, ?, ?, ?, ?)
  #186 = Utf8               INSERT INTO games(id, idnr, enddate, prize, newprize) VALUES (?, ?, ?, ?, ?)
  #187 = Utf8               UPDATE_PRICE
  #188 = Utf8               UPDATE_LOTTERY
  #189 = String             #190          // UPDATE games SET finished=1, prize=?, newprize=?, number1=?, number2=?, prize1=?, prize2=?, prize3=? WHERE id=1 AND idnr=?
  #190 = Utf8               UPDATE games SET finished=1, prize=?, newprize=?, number1=?, number2=?, prize1=?, prize2=?, prize3=? WHERE id=1 AND idnr=?
  #191 = Utf8               SELECT_LAST_LOTTERY
  #192 = String             #193          // SELECT idnr, prize, newprize, enddate, finished FROM games WHERE id = 1 ORDER BY idnr DESC LIMIT 1
  #193 = Utf8               SELECT idnr, prize, newprize, enddate, finished FROM games WHERE id = 1 ORDER BY idnr DESC LIMIT 1
  #194 = Utf8               SELECT_LOTTERY_ITEM
  #195 = String             #196          // SELECT enchant_level, custom_type2 FROM items WHERE item_id = 4442 AND custom_type1 = ?
  #196 = Utf8               SELECT enchant_level, custom_type2 FROM items WHERE item_id = 4442 AND custom_type1 = ?
  #197 = Utf8               SELECT_LOTTERY_TICKET
  #198 = Utf8               Code
  #199 = Utf8               LineNumberTable
  #200 = Utf8               LocalVariableTable
  #201 = Utf8               this
  #202 = Utf8               StackMapTable
  #203 = Utf8               getEndDate
  #204 = Utf8               isSellableTickets
  #205 = Utf8               isStarted
  #206 = Utf8               increasePrize
  #207 = Utf8               (I)V
  #208 = Utf8               ps
  #209 = Utf8               Ljava/sql/PreparedStatement;
  #210 = Utf8               con
  #211 = Utf8               Ljava/sql/Connection;
  #212 = Utf8               e
  #213 = Utf8               Ljava/lang/Exception;
  #214 = Utf8               count
  #215 = Utf8               decodeNumbers
  #216 = Utf8               (II)[I
  #217 = Utf8               val
  #218 = Utf8               enchant
  #219 = Utf8               type2
  #220 = Utf8               res
  #221 = Utf8               [I
  #222 = Utf8               id
  #223 = Utf8               nr
  #224 = Class              #221          // "[I"
  #225 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;)[I
  #226 = Utf8               item
  #227 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #228 = Utf8               val2
  #229 = Utf8               i
  #230 = Utf8               curenchant
  #231 = Utf8               curtype2
  #232 = Utf8               rs
  #233 = Utf8               Ljava/sql/ResultSet;
  #234 = Utf8               getInstance
  #235 = Utf8               ()Lext/mods/gameserver/data/manager/LotteryManager;
  #236 = Utf8               <clinit>
  #237 = Utf8               SourceFile
  #238 = Utf8               LotteryManager.java
  #239 = Utf8               NestMembers
  #240 = Class              #241          // ext/mods/gameserver/data/manager/LotteryManager$FinishLottery
  #241 = Utf8               ext/mods/gameserver/data/manager/LotteryManager$FinishLottery
  #242 = Class              #243          // ext/mods/gameserver/data/manager/LotteryManager$StopSellingTickets
  #243 = Utf8               ext/mods/gameserver/data/manager/LotteryManager$StopSellingTickets
  #244 = Utf8               InnerClasses
  #245 = Utf8               StartLottery
  #246 = Utf8               SingletonHolder
  #247 = Utf8               FinishLottery
  #248 = Utf8               StopSellingTickets
{
  public static final long SECOND;
    descriptor: J
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: long 1000l

  public static final long MINUTE;
    descriptor: J
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: long 60000l

  protected int _number;
    descriptor: I
    flags: (0x0004) ACC_PROTECTED

  protected int _prize;
    descriptor: I
    flags: (0x0004) ACC_PROTECTED

  protected boolean _isSellingTickets;
    descriptor: Z
    flags: (0x0004) ACC_PROTECTED

  protected boolean _isStarted;
    descriptor: Z
    flags: (0x0004) ACC_PROTECTED

  protected long _endDate;
    descriptor: J
    flags: (0x0004) ACC_PROTECTED

  protected ext.mods.gameserver.data.manager.LotteryManager();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iconst_1
         6: putfield      #7                  // Field _number:I
         9: aload_0
        10: getstatic     #13                 // Field ext/mods/Config.LOTTERY_PRIZE:I
        13: putfield      #18                 // Field _prize:I
        16: aload_0
        17: iconst_0
        18: putfield      #21                 // Field _isSellingTickets:Z
        21: aload_0
        22: iconst_0
        23: putfield      #25                 // Field _isStarted:Z
        26: aload_0
        27: invokestatic  #28                 // Method java/lang/System.currentTimeMillis:()J
        30: putfield      #34                 // Field _endDate:J
        33: getstatic     #38                 // Field ext/mods/Config.ALLOW_LOTTERY:Z
        36: ifeq          50
        39: new           #41                 // class ext/mods/gameserver/data/manager/LotteryManager$StartLottery
        42: dup
        43: aload_0
        44: invokespecial #43                 // Method ext/mods/gameserver/data/manager/LotteryManager$StartLottery."<init>":(Lext/mods/gameserver/data/manager/LotteryManager;)V
        47: invokevirtual #46                 // Method ext/mods/gameserver/data/manager/LotteryManager$StartLottery.run:()V
        50: return
      LineNumberTable:
        line 60: 0
        line 61: 4
        line 62: 9
        line 63: 16
        line 64: 21
        line 65: 26
        line 67: 33
        line 68: 39
        line 69: 50
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      51     0  this   Lext/mods/gameserver/data/manager/LotteryManager;
      StackMapTable: number_of_entries = 1
        frame_type = 255 /* full_frame */
          offset_delta = 50
          locals = [ class ext/mods/gameserver/data/manager/LotteryManager ]
          stack = []

  public int getId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _number:I
         4: ireturn
      LineNumberTable:
        line 73: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/manager/LotteryManager;

  public int getPrize();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #18                 // Field _prize:I
         4: ireturn
      LineNumberTable:
        line 78: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/manager/LotteryManager;

  public long getEndDate();
    descriptor: ()J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #34                 // Field _endDate:J
         4: lreturn
      LineNumberTable:
        line 83: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/manager/LotteryManager;

  public boolean isSellableTickets();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #21                 // Field _isSellingTickets:Z
         4: ireturn
      LineNumberTable:
        line 88: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/manager/LotteryManager;

  public boolean isStarted();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #25                 // Field _isStarted:Z
         4: ireturn
      LineNumberTable:
        line 93: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/manager/LotteryManager;

  public void increasePrize(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=6, args_size=2
         0: aload_0
         1: dup
         2: getfield      #18                 // Field _prize:I
         5: iload_1
         6: iadd
         7: putfield      #18                 // Field _prize:I
        10: invokestatic  #49                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        13: astore_2
        14: aload_2
        15: ldc           #55                 // String UPDATE games SET prize=?, newprize=? WHERE id = 1 AND idnr = ?
        17: invokeinterface #57,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        22: astore_3
        23: aload_3
        24: iconst_1
        25: aload_0
        26: invokevirtual #63                 // Method getPrize:()I
        29: invokeinterface #67,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        34: aload_3
        35: iconst_2
        36: aload_0
        37: invokevirtual #63                 // Method getPrize:()I
        40: invokeinterface #67,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        45: aload_3
        46: iconst_3
        47: aload_0
        48: invokevirtual #73                 // Method getId:()I
        51: invokeinterface #67,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        56: aload_3
        57: invokeinterface #76,  1           // InterfaceMethod java/sql/PreparedStatement.execute:()Z
        62: pop
        63: aload_3
        64: ifnull        103
        67: aload_3
        68: invokeinterface #80,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
        73: goto          103
        76: astore        4
        78: aload_3
        79: ifnull        100
        82: aload_3
        83: invokeinterface #80,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
        88: goto          100
        91: astore        5
        93: aload         4
        95: aload         5
        97: invokevirtual #85                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       100: aload         4
       102: athrow
       103: aload_2
       104: ifnull        140
       107: aload_2
       108: invokeinterface #89,  1           // InterfaceMethod java/sql/Connection.close:()V
       113: goto          140
       116: astore_3
       117: aload_2
       118: ifnull        138
       121: aload_2
       122: invokeinterface #89,  1           // InterfaceMethod java/sql/Connection.close:()V
       127: goto          138
       130: astore        4
       132: aload_3
       133: aload         4
       135: invokevirtual #85                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       138: aload_3
       139: athrow
       140: goto          153
       143: astore_2
       144: getstatic     #92                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       147: ldc           #96                 // String Couldn\'t increase current lottery prize.
       149: aload_2
       150: invokevirtual #98                 // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       153: return
      Exception table:
         from    to  target type
            23    63    76   Class java/lang/Throwable
            82    88    91   Class java/lang/Throwable
            14   103   116   Class java/lang/Throwable
           121   127   130   Class java/lang/Throwable
            10   140   143   Class java/lang/Exception
      LineNumberTable:
        line 98: 0
        line 100: 10
        line 101: 14
        line 103: 23
        line 104: 34
        line 105: 45
        line 106: 56
        line 107: 63
        line 100: 76
        line 107: 103
        line 100: 116
        line 111: 140
        line 108: 143
        line 110: 144
        line 112: 153
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           23      80     3    ps   Ljava/sql/PreparedStatement;
           14     126     2   con   Ljava/sql/Connection;
          144       9     2     e   Ljava/lang/Exception;
            0     154     0  this   Lext/mods/gameserver/data/manager/LotteryManager;
            0     154     1 count   I
      StackMapTable: number_of_entries = 10
        frame_type = 255 /* full_frame */
          offset_delta = 76
          locals = [ class ext/mods/gameserver/data/manager/LotteryManager, int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/data/manager/LotteryManager, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/data/manager/LotteryManager, int, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 9 /* same */

  public static int[] decodeNumbers(int, int);
    descriptor: (II)[I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=6, locals=6, args_size=2
         0: iconst_5
         1: newarray       int
         3: astore_2
         4: iconst_0
         5: istore_3
         6: iconst_1
         7: istore        4
         9: iload_0
        10: ifle          49
        13: iload_0
        14: iconst_2
        15: idiv
        16: istore        5
        18: iload         5
        20: i2d
        21: iload_0
        22: i2d
        23: ldc2_w        #104                // double 2.0d
        26: ddiv
        27: dcmpl
        28: ifeq          39
        31: aload_2
        32: iload_3
        33: iinc          3, 1
        36: iload         4
        38: iastore
        39: iload_0
        40: iconst_2
        41: idiv
        42: istore_0
        43: iinc          4, 1
        46: goto          9
        49: bipush        17
        51: istore        4
        53: iload_1
        54: ifle          93
        57: iload_1
        58: iconst_2
        59: idiv
        60: istore        5
        62: iload         5
        64: i2d
        65: iload_1
        66: i2d
        67: ldc2_w        #104                // double 2.0d
        70: ddiv
        71: dcmpl
        72: ifeq          83
        75: aload_2
        76: iload_3
        77: iinc          3, 1
        80: iload         4
        82: iastore
        83: iload_1
        84: iconst_2
        85: idiv
        86: istore_1
        87: iinc          4, 1
        90: goto          53
        93: aload_2
        94: areturn
      LineNumberTable:
        line 116: 0
        line 118: 4
        line 119: 6
        line 121: 9
        line 123: 13
        line 124: 18
        line 125: 31
        line 127: 39
        line 128: 43
        line 129: 46
        line 131: 49
        line 133: 53
        line 135: 57
        line 136: 62
        line 137: 75
        line 139: 83
        line 140: 87
        line 141: 90
        line 143: 93
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           18      28     5   val   I
           62      28     5   val   I
            0      95     0 enchant   I
            0      95     1 type2   I
            4      91     2   res   [I
            6      89     3    id   I
            9      86     4    nr   I
      StackMapTable: number_of_entries = 6
        frame_type = 254 /* append */
          offset_delta = 9
          locals = [ class "[I", int, int ]
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 9
        frame_type = 3 /* same */
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 9

  public static int[] checkTicket(ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/item/instance/ItemInstance;)[I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #106                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCustomType1:()I
         4: aload_0
         5: invokevirtual #111                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
         8: aload_0
         9: invokevirtual #114                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCustomType2:()I
        12: invokestatic  #117                // Method checkTicket:(III)[I
        15: areturn
      LineNumberTable:
        line 148: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  item   Lext/mods/gameserver/model/item/instance/ItemInstance;

  public static int[] checkTicket(int, int, int);
    descriptor: (III)[I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=7, locals=13, args_size=3
         0: iconst_2
         1: newarray       int
         3: dup
         4: iconst_0
         5: iconst_0
         6: iastore
         7: dup
         8: iconst_1
         9: iconst_0
        10: iastore
        11: astore_3
        12: invokestatic  #49                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        15: astore        4
        17: aload         4
        19: ldc           #121                // String SELECT number1, number2, prize1, prize2, prize3 FROM games WHERE id = 1 and idnr = ?
        21: invokeinterface #57,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        26: astore        5
        28: aload         5
        30: iconst_1
        31: iload_0
        32: invokeinterface #67,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        37: aload         5
        39: invokeinterface #123,  1          // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
        44: astore        6
        46: aload         6
        48: invokeinterface #127,  1          // InterfaceMethod java/sql/ResultSet.next:()Z
        53: ifeq          318
        56: aload         6
        58: ldc           #132                // String number1
        60: invokeinterface #134,  2          // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        65: iload_1
        66: iand
        67: istore        7
        69: aload         6
        71: ldc           #138                // String number2
        73: invokeinterface #134,  2          // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        78: iload_2
        79: iand
        80: istore        8
        82: iload         7
        84: ifne          134
        87: iload         8
        89: ifne          134
        92: aload_3
        93: astore        9
        95: aload         6
        97: ifnull        107
       100: aload         6
       102: invokeinterface #140,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       107: aload         5
       109: ifnull        119
       112: aload         5
       114: invokeinterface #80,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       119: aload         4
       121: ifnull        131
       124: aload         4
       126: invokeinterface #89,  1           // InterfaceMethod java/sql/Connection.close:()V
       131: aload         9
       133: areturn
       134: iconst_0
       135: istore        9
       137: iconst_1
       138: istore        10
       140: iload         10
       142: bipush        16
       144: if_icmpgt     207
       147: iload         7
       149: iconst_2
       150: idiv
       151: istore        11
       153: iload         11
       155: i2d
       156: iload         7
       158: i2d
       159: ldc2_w        #104                // double 2.0d
       162: ddiv
       163: dcmpl
       164: ifeq          170
       167: iinc          9, 1
       170: iload         8
       172: iconst_2
       173: idiv
       174: istore        12
       176: iload         12
       178: i2d
       179: iload         8
       181: i2d
       182: ldc2_w        #104                // double 2.0d
       185: ddiv
       186: dcmpl
       187: ifeq          193
       190: iinc          9, 1
       193: iload         11
       195: istore        7
       197: iload         12
       199: istore        8
       201: iinc          10, 1
       204: goto          140
       207: iload         9
       209: tableswitch   { // 0 to 5

                       0: 248

                       1: 308

                       2: 308

                       3: 289

                       4: 270

                       5: 251
                 default: 308
            }
       248: goto          318
       251: aload_3
       252: iconst_0
       253: iconst_1
       254: iastore
       255: aload_3
       256: iconst_1
       257: aload         6
       259: ldc           #141                // String prize1
       261: invokeinterface #134,  2          // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       266: iastore
       267: goto          318
       270: aload_3
       271: iconst_0
       272: iconst_2
       273: iastore
       274: aload_3
       275: iconst_1
       276: aload         6
       278: ldc           #143                // String prize2
       280: invokeinterface #134,  2          // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       285: iastore
       286: goto          318
       289: aload_3
       290: iconst_0
       291: iconst_3
       292: iastore
       293: aload_3
       294: iconst_1
       295: aload         6
       297: ldc           #145                // String prize3
       299: invokeinterface #134,  2          // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       304: iastore
       305: goto          318
       308: aload_3
       309: iconst_0
       310: iconst_4
       311: iastore
       312: aload_3
       313: iconst_1
       314: getstatic     #147                // Field ext/mods/Config.LOTTERY_2_AND_1_NUMBER_PRIZE:I
       317: iastore
       318: aload         6
       320: ifnull        362
       323: aload         6
       325: invokeinterface #140,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       330: goto          362
       333: astore        7
       335: aload         6
       337: ifnull        359
       340: aload         6
       342: invokeinterface #140,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       347: goto          359
       350: astore        8
       352: aload         7
       354: aload         8
       356: invokevirtual #85                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       359: aload         7
       361: athrow
       362: aload         5
       364: ifnull        406
       367: aload         5
       369: invokeinterface #80,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       374: goto          406
       377: astore        6
       379: aload         5
       381: ifnull        403
       384: aload         5
       386: invokeinterface #80,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       391: goto          403
       394: astore        7
       396: aload         6
       398: aload         7
       400: invokevirtual #85                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       403: aload         6
       405: athrow
       406: aload         4
       408: ifnull        450
       411: aload         4
       413: invokeinterface #89,  1           // InterfaceMethod java/sql/Connection.close:()V
       418: goto          450
       421: astore        5
       423: aload         4
       425: ifnull        447
       428: aload         4
       430: invokeinterface #89,  1           // InterfaceMethod java/sql/Connection.close:()V
       435: goto          447
       438: astore        6
       440: aload         5
       442: aload         6
       444: invokevirtual #85                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       447: aload         5
       449: athrow
       450: goto          476
       453: astore        4
       455: getstatic     #92                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       458: ldc           #150                // String Couldn\'t check lottery ticket #{}.
       460: aload         4
       462: iconst_1
       463: anewarray     #2                  // class java/lang/Object
       466: dup
       467: iconst_0
       468: iload_0
       469: invokestatic  #152                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       472: aastore
       473: invokevirtual #158                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
       476: aload_3
       477: areturn
      Exception table:
         from    to  target type
            46    95   333   Class java/lang/Throwable
           134   318   333   Class java/lang/Throwable
           340   347   350   Class java/lang/Throwable
            28   107   377   Class java/lang/Throwable
           134   362   377   Class java/lang/Throwable
           384   391   394   Class java/lang/Throwable
            17   119   421   Class java/lang/Throwable
           134   406   421   Class java/lang/Throwable
           428   435   438   Class java/lang/Throwable
            12   131   453   Class java/lang/Exception
           134   450   453   Class java/lang/Exception
      LineNumberTable:
        line 153: 0
        line 159: 12
        line 160: 17
        line 162: 28
        line 164: 37
        line 166: 46
        line 168: 56
        line 169: 69
        line 171: 82
        line 172: 92
        line 215: 95
        line 216: 107
        line 172: 131
        line 174: 134
        line 176: 137
        line 178: 147
        line 179: 153
        line 180: 167
        line 182: 170
        line 183: 176
        line 184: 190
        line 186: 193
        line 187: 197
        line 176: 201
        line 190: 207
        line 193: 248
        line 196: 251
        line 197: 255
        line 198: 267
        line 201: 270
        line 202: 274
        line 203: 286
        line 206: 289
        line 207: 293
        line 208: 305
        line 211: 308
        line 212: 312
        line 215: 318
        line 164: 333
        line 216: 362
        line 159: 377
        line 216: 406
        line 159: 421
        line 220: 450
        line 217: 453
        line 219: 455
        line 222: 476
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          153      48    11   val   I
          176      25    12  val2   I
          140      67    10     i   I
           69     249     7 curenchant   I
           82     236     8 curtype2   I
          137     181     9 count   I
           46     316     6    rs   Ljava/sql/ResultSet;
           28     378     5    ps   Ljava/sql/PreparedStatement;
           17     433     4   con   Ljava/sql/Connection;
          455      21     4     e   Ljava/lang/Exception;
            0     478     0    id   I
            0     478     1 enchant   I
            0     478     2 type2   I
           12     466     3   res   [I
      StackMapTable: number_of_entries = 28
        frame_type = 255 /* full_frame */
          offset_delta = 107
          locals = [ int, int, int, class "[I", class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, int, int, class "[I" ]
          stack = []
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 253 /* append */
          offset_delta = 5
          locals = [ int, int ]
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ int ]
        frame_type = 248 /* chop */
          offset_delta = 13
        frame_type = 40 /* same */
        frame_type = 2 /* same */
        frame_type = 18 /* same */
        frame_type = 18 /* same */
        frame_type = 18 /* same */
        frame_type = 248 /* chop */
          offset_delta = 9
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ int, int, int, class "[I", class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ int, int, int, class "[I", class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ int, int, int, class "[I", class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 22 /* same */

  public static ext.mods.gameserver.data.manager.LotteryManager getInstance();
    descriptor: ()Lext/mods/gameserver/data/manager/LotteryManager;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #161                // Field ext/mods/gameserver/data/manager/LotteryManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/manager/LotteryManager;
         3: areturn
      LineNumberTable:
        line 478: 0

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #99                 // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #8                  // class ext/mods/gameserver/data/manager/LotteryManager
         6: invokevirtual #167                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #173                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #92                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 41: 0
}
SourceFile: "LotteryManager.java"
NestMembers:
  ext/mods/gameserver/data/manager/LotteryManager$SingletonHolder
  ext/mods/gameserver/data/manager/LotteryManager$FinishLottery
  ext/mods/gameserver/data/manager/LotteryManager$StopSellingTickets
  ext/mods/gameserver/data/manager/LotteryManager$StartLottery
