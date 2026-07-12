// Bytecode for: ext.mods.gameserver.model.buylist.Product
// File: ext\mods\gameserver\model\buylist\Product.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/buylist/Product.class
  Last modified 9 de jul de 2026; size 5065 bytes
  MD5 checksum ff8d86b5ab39e28a7bfde70c658c84dc
  Compiled from "Product.java"
public class ext.mods.gameserver.model.buylist.Product
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/buylist/Product
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 9, methods: 14, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/buylist/Product._count:Ljava/util/concurrent/atomic/AtomicInteger;
    #8 = Class              #10           // ext/mods/gameserver/model/buylist/Product
    #9 = NameAndType        #11:#12       // _count:Ljava/util/concurrent/atomic/AtomicInteger;
   #10 = Utf8               ext/mods/gameserver/model/buylist/Product
   #11 = Utf8               _count
   #12 = Utf8               Ljava/util/concurrent/atomic/AtomicInteger;
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/model/buylist/Product._buyListId:I
   #14 = NameAndType        #15:#16       // _buyListId:I
   #15 = Utf8               _buyListId
   #16 = Utf8               I
   #17 = Methodref          #18.#19       // ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
   #18 = Class              #20           // ext/mods/gameserver/data/xml/ItemData
   #19 = NameAndType        #21:#22       // getInstance:()Lext/mods/gameserver/data/xml/ItemData;
   #20 = Utf8               ext/mods/gameserver/data/xml/ItemData
   #21 = Utf8               getInstance
   #22 = Utf8               ()Lext/mods/gameserver/data/xml/ItemData;
   #23 = String             #24           // id
   #24 = Utf8               id
   #25 = Methodref          #26.#27       // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
   #26 = Class              #28           // ext/mods/commons/data/StatSet
   #27 = NameAndType        #29:#30       // getInteger:(Ljava/lang/String;)I
   #28 = Utf8               ext/mods/commons/data/StatSet
   #29 = Utf8               getInteger
   #30 = Utf8               (Ljava/lang/String;)I
   #31 = Methodref          #18.#32       // ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
   #32 = NameAndType        #33:#34       // getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
   #33 = Utf8               getTemplate
   #34 = Utf8               (I)Lext/mods/gameserver/model/item/kind/Item;
   #35 = Fieldref           #8.#36        // ext/mods/gameserver/model/buylist/Product._item:Lext/mods/gameserver/model/item/kind/Item;
   #36 = NameAndType        #37:#38       // _item:Lext/mods/gameserver/model/item/kind/Item;
   #37 = Utf8               _item
   #38 = Utf8               Lext/mods/gameserver/model/item/kind/Item;
   #39 = String             #40           // price
   #40 = Utf8               price
   #41 = Methodref          #26.#42       // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
   #42 = NameAndType        #29:#43       // getInteger:(Ljava/lang/String;I)I
   #43 = Utf8               (Ljava/lang/String;I)I
   #44 = Fieldref           #8.#45        // ext/mods/gameserver/model/buylist/Product._price:I
   #45 = NameAndType        #46:#16       // _price:I
   #46 = Utf8               _price
   #47 = String             #48           // restockDelay
   #48 = Utf8               restockDelay
   #49 = Long               -1l
   #51 = Methodref          #26.#52       // ext/mods/commons/data/StatSet.getLong:(Ljava/lang/String;J)J
   #52 = NameAndType        #53:#54       // getLong:(Ljava/lang/String;J)J
   #53 = Utf8               getLong
   #54 = Utf8               (Ljava/lang/String;J)J
   #55 = Long               60000l
   #57 = Fieldref           #8.#58        // ext/mods/gameserver/model/buylist/Product._restockDelay:J
   #58 = NameAndType        #59:#60       // _restockDelay:J
   #59 = Utf8               _restockDelay
   #60 = Utf8               J
   #61 = String             #62           // count
   #62 = Utf8               count
   #63 = Fieldref           #8.#64        // ext/mods/gameserver/model/buylist/Product._maxCount:I
   #64 = NameAndType        #65:#16       // _maxCount:I
   #65 = Utf8               _maxCount
   #66 = Methodref          #8.#67        // ext/mods/gameserver/model/buylist/Product.hasLimitedStock:()Z
   #67 = NameAndType        #68:#69       // hasLimitedStock:()Z
   #68 = Utf8               hasLimitedStock
   #69 = Utf8               ()Z
   #70 = Class              #71           // java/util/concurrent/atomic/AtomicInteger
   #71 = Utf8               java/util/concurrent/atomic/AtomicInteger
   #72 = Methodref          #70.#73       // java/util/concurrent/atomic/AtomicInteger."<init>":(I)V
   #73 = NameAndType        #5:#74        // "<init>":(I)V
   #74 = Utf8               (I)V
   #75 = Methodref          #76.#77       // ext/mods/gameserver/model/item/kind/Item.getItemId:()I
   #76 = Class              #78           // ext/mods/gameserver/model/item/kind/Item
   #77 = NameAndType        #79:#80       // getItemId:()I
   #78 = Utf8               ext/mods/gameserver/model/item/kind/Item
   #79 = Utf8               getItemId
   #80 = Utf8               ()I
   #81 = Methodref          #70.#82       // java/util/concurrent/atomic/AtomicInteger.get:()I
   #82 = NameAndType        #83:#80       // get:()I
   #83 = Utf8               get
   #84 = Methodref          #70.#85       // java/util/concurrent/atomic/AtomicInteger.set:(I)V
   #85 = NameAndType        #86:#74       // set:(I)V
   #86 = Utf8               set
   #87 = Methodref          #70.#88       // java/util/concurrent/atomic/AtomicInteger.addAndGet:(I)I
   #88 = NameAndType        #89:#90       // addAndGet:(I)I
   #89 = Utf8               addAndGet
   #90 = Utf8               (I)I
   #91 = Methodref          #92.#93       // ext/mods/gameserver/taskmanager/BuyListTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/BuyListTaskManager;
   #92 = Class              #94           // ext/mods/gameserver/taskmanager/BuyListTaskManager
   #93 = NameAndType        #21:#95       // getInstance:()Lext/mods/gameserver/taskmanager/BuyListTaskManager;
   #94 = Utf8               ext/mods/gameserver/taskmanager/BuyListTaskManager
   #95 = Utf8               ()Lext/mods/gameserver/taskmanager/BuyListTaskManager;
   #96 = Methodref          #8.#97        // ext/mods/gameserver/model/buylist/Product.getRestockDelay:()J
   #97 = NameAndType        #98:#99       // getRestockDelay:()J
   #98 = Utf8               getRestockDelay
   #99 = Utf8               ()J
  #100 = Methodref          #92.#101      // ext/mods/gameserver/taskmanager/BuyListTaskManager.add:(Lext/mods/gameserver/model/buylist/Product;J)V
  #101 = NameAndType        #102:#103     // add:(Lext/mods/gameserver/model/buylist/Product;J)V
  #102 = Utf8               add
  #103 = Utf8               (Lext/mods/gameserver/model/buylist/Product;J)V
  #104 = Methodref          #105.#106     // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
  #105 = Class              #107          // ext/mods/commons/pool/ConnectionPool
  #106 = NameAndType        #108:#109     // getConnection:()Ljava/sql/Connection;
  #107 = Utf8               ext/mods/commons/pool/ConnectionPool
  #108 = Utf8               getConnection
  #109 = Utf8               ()Ljava/sql/Connection;
  #110 = String             #111          // INSERT INTO buylists (buylist_id,item_id,count,next_restock_time) VALUES(?,?,?,?) ON DUPLICATE KEY UPDATE count=VALUES(count), next_restock_time=VALUES(next_restock_time)
  #111 = Utf8               INSERT INTO buylists (buylist_id,item_id,count,next_restock_time) VALUES(?,?,?,?) ON DUPLICATE KEY UPDATE count=VALUES(count), next_restock_time=VALUES(next_restock_time)
  #112 = InterfaceMethodref #113.#114     // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #113 = Class              #115          // java/sql/Connection
  #114 = NameAndType        #116:#117     // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #115 = Utf8               java/sql/Connection
  #116 = Utf8               prepareStatement
  #117 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #118 = Methodref          #8.#119       // ext/mods/gameserver/model/buylist/Product.getBuyListId:()I
  #119 = NameAndType        #120:#80      // getBuyListId:()I
  #120 = Utf8               getBuyListId
  #121 = InterfaceMethodref #122.#123     // java/sql/PreparedStatement.setInt:(II)V
  #122 = Class              #124          // java/sql/PreparedStatement
  #123 = NameAndType        #125:#126     // setInt:(II)V
  #124 = Utf8               java/sql/PreparedStatement
  #125 = Utf8               setInt
  #126 = Utf8               (II)V
  #127 = Methodref          #8.#77        // ext/mods/gameserver/model/buylist/Product.getItemId:()I
  #128 = Methodref          #8.#129       // ext/mods/gameserver/model/buylist/Product.getCount:()I
  #129 = NameAndType        #130:#80      // getCount:()I
  #130 = Utf8               getCount
  #131 = InterfaceMethodref #122.#132     // java/sql/PreparedStatement.setLong:(IJ)V
  #132 = NameAndType        #133:#134     // setLong:(IJ)V
  #133 = Utf8               setLong
  #134 = Utf8               (IJ)V
  #135 = InterfaceMethodref #122.#136     // java/sql/PreparedStatement.executeUpdate:()I
  #136 = NameAndType        #137:#80      // executeUpdate:()I
  #137 = Utf8               executeUpdate
  #138 = InterfaceMethodref #122.#139     // java/sql/PreparedStatement.close:()V
  #139 = NameAndType        #140:#6       // close:()V
  #140 = Utf8               close
  #141 = Class              #142          // java/lang/Throwable
  #142 = Utf8               java/lang/Throwable
  #143 = Methodref          #141.#144     // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
  #144 = NameAndType        #145:#146     // addSuppressed:(Ljava/lang/Throwable;)V
  #145 = Utf8               addSuppressed
  #146 = Utf8               (Ljava/lang/Throwable;)V
  #147 = InterfaceMethodref #113.#139     // java/sql/Connection.close:()V
  #148 = Class              #149          // java/lang/Exception
  #149 = Utf8               java/lang/Exception
  #150 = Fieldref           #8.#151       // ext/mods/gameserver/model/buylist/Product.LOGGER:Lext/mods/commons/logging/CLogger;
  #151 = NameAndType        #152:#153     // LOGGER:Lext/mods/commons/logging/CLogger;
  #152 = Utf8               LOGGER
  #153 = Utf8               Lext/mods/commons/logging/CLogger;
  #154 = String             #155          // Couldn\'t save product for buylist id:{} and item id: {}.
  #155 = Utf8               Couldn\'t save product for buylist id:{} and item id: {}.
  #156 = Methodref          #157.#158     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #157 = Class              #159          // java/lang/Integer
  #158 = NameAndType        #160:#161     // valueOf:(I)Ljava/lang/Integer;
  #159 = Utf8               java/lang/Integer
  #160 = Utf8               valueOf
  #161 = Utf8               (I)Ljava/lang/Integer;
  #162 = Methodref          #163.#164     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #163 = Class              #165          // ext/mods/commons/logging/CLogger
  #164 = NameAndType        #166:#167     // error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #165 = Utf8               ext/mods/commons/logging/CLogger
  #166 = Utf8               error
  #167 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #168 = String             #169          // DELETE FROM buylists WHERE buylist_id=? AND item_id=?
  #169 = Utf8               DELETE FROM buylists WHERE buylist_id=? AND item_id=?
  #170 = String             #171          // Couldn\'t delete product for buylist id:{} and item id: {}.
  #171 = Utf8               Couldn\'t delete product for buylist id:{} and item id: {}.
  #172 = Methodref          #173.#174     // java/lang/Class.getName:()Ljava/lang/String;
  #173 = Class              #175          // java/lang/Class
  #174 = NameAndType        #176:#177     // getName:()Ljava/lang/String;
  #175 = Utf8               java/lang/Class
  #176 = Utf8               getName
  #177 = Utf8               ()Ljava/lang/String;
  #178 = Methodref          #163.#179     // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #179 = NameAndType        #5:#180       // "<init>":(Ljava/lang/String;)V
  #180 = Utf8               (Ljava/lang/String;)V
  #181 = Utf8               ADD_OR_UPDATE_BUYLIST
  #182 = Utf8               Ljava/lang/String;
  #183 = Utf8               ConstantValue
  #184 = Utf8               DELETE_BUYLIST
  #185 = Utf8               (ILext/mods/commons/data/StatSet;)V
  #186 = Utf8               Code
  #187 = Utf8               LineNumberTable
  #188 = Utf8               LocalVariableTable
  #189 = Utf8               this
  #190 = Utf8               Lext/mods/gameserver/model/buylist/Product;
  #191 = Utf8               buyListId
  #192 = Utf8               Lext/mods/commons/data/StatSet;
  #193 = Utf8               StackMapTable
  #194 = Utf8               getItem
  #195 = Utf8               ()Lext/mods/gameserver/model/item/kind/Item;
  #196 = Utf8               getPrice
  #197 = Utf8               getMaxCount
  #198 = Utf8               setCount
  #199 = Utf8               currentCount
  #200 = Utf8               decreaseCount
  #201 = Utf8               (I)Z
  #202 = Utf8               val
  #203 = Utf8               result
  #204 = Utf8               Z
  #205 = Utf8               save
  #206 = Utf8               (J)V
  #207 = Utf8               ps
  #208 = Utf8               Ljava/sql/PreparedStatement;
  #209 = Utf8               con
  #210 = Utf8               Ljava/sql/Connection;
  #211 = Utf8               e
  #212 = Utf8               Ljava/lang/Exception;
  #213 = Utf8               nextRestockTime
  #214 = Utf8               delete
  #215 = Utf8               <clinit>
  #216 = Utf8               SourceFile
  #217 = Utf8               Product.java
{
  public ext.mods.gameserver.model.buylist.Product(int, ext.mods.commons.data.StatSet);
    descriptor: (ILext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=3
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aconst_null
         6: putfield      #7                  // Field _count:Ljava/util/concurrent/atomic/AtomicInteger;
         9: aload_0
        10: iload_1
        11: putfield      #13                 // Field _buyListId:I
        14: aload_0
        15: invokestatic  #17                 // Method ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
        18: aload_2
        19: ldc           #23                 // String id
        21: invokevirtual #25                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        24: invokevirtual #31                 // Method ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
        27: putfield      #35                 // Field _item:Lext/mods/gameserver/model/item/kind/Item;
        30: aload_0
        31: aload_2
        32: ldc           #39                 // String price
        34: iconst_0
        35: invokevirtual #41                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        38: putfield      #44                 // Field _price:I
        41: aload_0
        42: aload_2
        43: ldc           #47                 // String restockDelay
        45: ldc2_w        #49                 // long -1l
        48: invokevirtual #51                 // Method ext/mods/commons/data/StatSet.getLong:(Ljava/lang/String;J)J
        51: ldc2_w        #55                 // long 60000l
        54: lmul
        55: putfield      #57                 // Field _restockDelay:J
        58: aload_0
        59: aload_2
        60: ldc           #61                 // String count
        62: iconst_m1
        63: invokevirtual #41                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        66: putfield      #63                 // Field _maxCount:I
        69: aload_0
        70: invokevirtual #66                 // Method hasLimitedStock:()Z
        73: ifeq          91
        76: aload_0
        77: new           #70                 // class java/util/concurrent/atomic/AtomicInteger
        80: dup
        81: aload_0
        82: getfield      #63                 // Field _maxCount:I
        85: invokespecial #72                 // Method java/util/concurrent/atomic/AtomicInteger."<init>":(I)V
        88: putfield      #7                  // Field _count:Ljava/util/concurrent/atomic/AtomicInteger;
        91: return
      LineNumberTable:
        line 51: 0
        line 48: 4
        line 52: 9
        line 53: 14
        line 54: 30
        line 55: 41
        line 56: 58
        line 58: 69
        line 59: 76
        line 60: 91
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      92     0  this   Lext/mods/gameserver/model/buylist/Product;
            0      92     1 buyListId   I
            0      92     2   set   Lext/mods/commons/data/StatSet;
      StackMapTable: number_of_entries = 1
        frame_type = 255 /* full_frame */
          offset_delta = 91
          locals = [ class ext/mods/gameserver/model/buylist/Product, int, class ext/mods/commons/data/StatSet ]
          stack = []

  public int getBuyListId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _buyListId:I
         4: ireturn
      LineNumberTable:
        line 64: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/buylist/Product;

  public ext.mods.gameserver.model.item.kind.Item getItem();
    descriptor: ()Lext/mods/gameserver/model/item/kind/Item;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #35                 // Field _item:Lext/mods/gameserver/model/item/kind/Item;
         4: areturn
      LineNumberTable:
        line 69: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/buylist/Product;

  public int getItemId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #35                 // Field _item:Lext/mods/gameserver/model/item/kind/Item;
         4: invokevirtual #75                 // Method ext/mods/gameserver/model/item/kind/Item.getItemId:()I
         7: ireturn
      LineNumberTable:
        line 74: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/buylist/Product;

  public int getPrice();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #44                 // Field _price:I
         4: ireturn
      LineNumberTable:
        line 79: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/buylist/Product;

  public long getRestockDelay();
    descriptor: ()J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #57                 // Field _restockDelay:J
         4: lreturn
      LineNumberTable:
        line 84: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/buylist/Product;

  public int getMaxCount();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #63                 // Field _maxCount:I
         4: ireturn
      LineNumberTable:
        line 89: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/buylist/Product;

  public int getCount();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=2, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _count:Ljava/util/concurrent/atomic/AtomicInteger;
         4: ifnonnull     9
         7: iconst_0
         8: ireturn
         9: aload_0
        10: getfield      #7                  // Field _count:Ljava/util/concurrent/atomic/AtomicInteger;
        13: invokevirtual #81                 // Method java/util/concurrent/atomic/AtomicInteger.get:()I
        16: istore_1
        17: iload_1
        18: ifle          25
        21: iload_1
        22: goto          26
        25: iconst_0
        26: ireturn
      LineNumberTable:
        line 99: 0
        line 100: 7
        line 102: 9
        line 103: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lext/mods/gameserver/model/buylist/Product;
           17      10     1 count   I
      StackMapTable: number_of_entries = 3
        frame_type = 9 /* same */
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ int ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public void setCount(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #7                  // Field _count:Ljava/util/concurrent/atomic/AtomicInteger;
         4: iload_1
         5: invokevirtual #84                 // Method java/util/concurrent/atomic/AtomicInteger.set:(I)V
         8: return
      LineNumberTable:
        line 112: 0
        line 113: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/buylist/Product;
            0       9     1 currentCount   I

  public boolean decreaseCount(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=2
         0: aload_0
         1: getfield      #7                  // Field _count:Ljava/util/concurrent/atomic/AtomicInteger;
         4: ifnonnull     9
         7: iconst_0
         8: ireturn
         9: aload_0
        10: getfield      #7                  // Field _count:Ljava/util/concurrent/atomic/AtomicInteger;
        13: iload_1
        14: ineg
        15: invokevirtual #87                 // Method java/util/concurrent/atomic/AtomicInteger.addAndGet:(I)I
        18: iflt          25
        21: iconst_1
        22: goto          26
        25: iconst_0
        26: istore_2
        27: iload_2
        28: ifeq          42
        31: invokestatic  #91                 // Method ext/mods/gameserver/taskmanager/BuyListTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/BuyListTaskManager;
        34: aload_0
        35: aload_0
        36: invokevirtual #96                 // Method getRestockDelay:()J
        39: invokevirtual #100                // Method ext/mods/gameserver/taskmanager/BuyListTaskManager.add:(Lext/mods/gameserver/model/buylist/Product;J)V
        42: iload_2
        43: ireturn
      LineNumberTable:
        line 123: 0
        line 124: 7
        line 126: 9
        line 127: 27
        line 128: 31
        line 130: 42
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      44     0  this   Lext/mods/gameserver/model/buylist/Product;
            0      44     1   val   I
           27      17     2 result   Z
      StackMapTable: number_of_entries = 4
        frame_type = 9 /* same */
        frame_type = 15 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ int ]

  public boolean hasLimitedStock();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #63                 // Field _maxCount:I
         4: iconst_m1
         5: if_icmple     12
         8: iconst_1
         9: goto          13
        12: iconst_0
        13: ireturn
      LineNumberTable:
        line 135: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/model/buylist/Product;
      StackMapTable: number_of_entries = 2
        frame_type = 12 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public void save(long);
    descriptor: (J)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=7, args_size=2
         0: invokestatic  #104                // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         3: astore_3
         4: aload_3
         5: ldc           #110                // String INSERT INTO buylists (buylist_id,item_id,count,next_restock_time) VALUES(?,?,?,?) ON DUPLICATE KEY UPDATE count=VALUES(count), next_restock_time=VALUES(next_restock_time)
         7: invokeinterface #112,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        12: astore        4
        14: aload         4
        16: iconst_1
        17: aload_0
        18: invokevirtual #118                // Method getBuyListId:()I
        21: invokeinterface #121,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        26: aload         4
        28: iconst_2
        29: aload_0
        30: invokevirtual #127                // Method getItemId:()I
        33: invokeinterface #121,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        38: aload         4
        40: iconst_3
        41: aload_0
        42: invokevirtual #128                // Method getCount:()I
        45: invokeinterface #121,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        50: aload         4
        52: iconst_4
        53: lload_1
        54: invokeinterface #131,  4          // InterfaceMethod java/sql/PreparedStatement.setLong:(IJ)V
        59: aload         4
        61: invokeinterface #135,  1          // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
        66: pop
        67: aload         4
        69: ifnull        111
        72: aload         4
        74: invokeinterface #138,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        79: goto          111
        82: astore        5
        84: aload         4
        86: ifnull        108
        89: aload         4
        91: invokeinterface #138,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        96: goto          108
        99: astore        6
       101: aload         5
       103: aload         6
       105: invokevirtual #143                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       108: aload         5
       110: athrow
       111: aload_3
       112: ifnull        151
       115: aload_3
       116: invokeinterface #147,  1          // InterfaceMethod java/sql/Connection.close:()V
       121: goto          151
       124: astore        4
       126: aload_3
       127: ifnull        148
       130: aload_3
       131: invokeinterface #147,  1          // InterfaceMethod java/sql/Connection.close:()V
       136: goto          148
       139: astore        5
       141: aload         4
       143: aload         5
       145: invokevirtual #143                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       148: aload         4
       150: athrow
       151: goto          188
       154: astore_3
       155: getstatic     #150                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       158: ldc           #154                // String Couldn\'t save product for buylist id:{} and item id: {}.
       160: aload_3
       161: iconst_2
       162: anewarray     #2                  // class java/lang/Object
       165: dup
       166: iconst_0
       167: aload_0
       168: invokevirtual #118                // Method getBuyListId:()I
       171: invokestatic  #156                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       174: aastore
       175: dup
       176: iconst_1
       177: aload_0
       178: invokevirtual #127                // Method getItemId:()I
       181: invokestatic  #156                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       184: aastore
       185: invokevirtual #162                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
       188: return
      Exception table:
         from    to  target type
            14    67    82   Class java/lang/Throwable
            89    96    99   Class java/lang/Throwable
             4   111   124   Class java/lang/Throwable
           130   136   139   Class java/lang/Throwable
             0   151   154   Class java/lang/Exception
      LineNumberTable:
        line 144: 0
        line 145: 4
        line 147: 14
        line 148: 26
        line 149: 38
        line 150: 50
        line 151: 59
        line 152: 67
        line 144: 82
        line 152: 111
        line 144: 124
        line 156: 151
        line 153: 154
        line 155: 155
        line 157: 188
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           14      97     4    ps   Ljava/sql/PreparedStatement;
            4     147     3   con   Ljava/sql/Connection;
          155      33     3     e   Ljava/lang/Exception;
            0     189     0  this   Lext/mods/gameserver/model/buylist/Product;
            0     189     1 nextRestockTime   J
      StackMapTable: number_of_entries = 10
        frame_type = 255 /* full_frame */
          offset_delta = 82
          locals = [ class ext/mods/gameserver/model/buylist/Product, long, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/buylist/Product, long, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/buylist/Product, long, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 33 /* same */

  public void delete();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=5, args_size=1
         0: invokestatic  #104                // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         3: astore_1
         4: aload_1
         5: ldc           #168                // String DELETE FROM buylists WHERE buylist_id=? AND item_id=?
         7: invokeinterface #112,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        12: astore_2
        13: aload_2
        14: iconst_1
        15: aload_0
        16: invokevirtual #118                // Method getBuyListId:()I
        19: invokeinterface #121,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        24: aload_2
        25: iconst_2
        26: aload_0
        27: invokevirtual #127                // Method getItemId:()I
        30: invokeinterface #121,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        35: aload_2
        36: invokeinterface #135,  1          // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
        41: pop
        42: aload_2
        43: ifnull        79
        46: aload_2
        47: invokeinterface #138,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        52: goto          79
        55: astore_3
        56: aload_2
        57: ifnull        77
        60: aload_2
        61: invokeinterface #138,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        66: goto          77
        69: astore        4
        71: aload_3
        72: aload         4
        74: invokevirtual #143                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        77: aload_3
        78: athrow
        79: aload_1
        80: ifnull        114
        83: aload_1
        84: invokeinterface #147,  1          // InterfaceMethod java/sql/Connection.close:()V
        89: goto          114
        92: astore_2
        93: aload_1
        94: ifnull        112
        97: aload_1
        98: invokeinterface #147,  1          // InterfaceMethod java/sql/Connection.close:()V
       103: goto          112
       106: astore_3
       107: aload_2
       108: aload_3
       109: invokevirtual #143                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       112: aload_2
       113: athrow
       114: goto          151
       117: astore_1
       118: getstatic     #150                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       121: ldc           #170                // String Couldn\'t delete product for buylist id:{} and item id: {}.
       123: aload_1
       124: iconst_2
       125: anewarray     #2                  // class java/lang/Object
       128: dup
       129: iconst_0
       130: aload_0
       131: invokevirtual #118                // Method getBuyListId:()I
       134: invokestatic  #156                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       137: aastore
       138: dup
       139: iconst_1
       140: aload_0
       141: invokevirtual #127                // Method getItemId:()I
       144: invokestatic  #156                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       147: aastore
       148: invokevirtual #162                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
       151: return
      Exception table:
         from    to  target type
            13    42    55   Class java/lang/Throwable
            60    66    69   Class java/lang/Throwable
             4    79    92   Class java/lang/Throwable
            97   103   106   Class java/lang/Throwable
             0   114   117   Class java/lang/Exception
      LineNumberTable:
        line 164: 0
        line 165: 4
        line 167: 13
        line 168: 24
        line 169: 35
        line 170: 42
        line 164: 55
        line 170: 79
        line 164: 92
        line 174: 114
        line 171: 117
        line 173: 118
        line 175: 151
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           13      66     2    ps   Ljava/sql/PreparedStatement;
            4     110     1   con   Ljava/sql/Connection;
          118      33     1     e   Ljava/lang/Exception;
            0     152     0  this   Lext/mods/gameserver/model/buylist/Product;
      StackMapTable: number_of_entries = 10
        frame_type = 255 /* full_frame */
          offset_delta = 55
          locals = [ class ext/mods/gameserver/model/buylist/Product, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/buylist/Product, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/buylist/Product, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 33 /* same */

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #163                // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #8                  // class ext/mods/gameserver/model/buylist/Product
         6: invokevirtual #172                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #178                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #150                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 37: 0
}
SourceFile: "Product.java"
