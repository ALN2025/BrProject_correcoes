// Bytecode for: ext.mods.email.items.EmailStorage
// File: ext\mods\email\items\EmailStorage.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/email/items/EmailStorage.class
  Last modified 9 de jul de 2026; size 2693 bytes
  MD5 checksum 354a8ca624fea5df6b81b75093b270ed
  Compiled from "EmailStorage.java"
public class ext.mods.email.items.EmailStorage
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #96                         // ext/mods/email/items/EmailStorage
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 2, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
    #8 = Class              #10           // ext/mods/commons/pool/ConnectionPool
    #9 = NameAndType        #11:#12       // getConnection:()Ljava/sql/Connection;
   #10 = Utf8               ext/mods/commons/pool/ConnectionPool
   #11 = Utf8               getConnection
   #12 = Utf8               ()Ljava/sql/Connection;
   #13 = String             #14           // INSERT INTO player_emails (email_id, sender_id, target_id, item_object_id, item_id, count, enchant_level, is_augmented, augment_id, is_paid, payment_item_id, payment_item_count, expiration_time, created_time) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
   #14 = Utf8               INSERT INTO player_emails (email_id, sender_id, target_id, item_object_id, item_id, count, enchant_level, is_augmented, augment_id, is_paid, payment_item_id, payment_item_count, expiration_time, created_time) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
   #15 = InterfaceMethodref #16.#17       // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #16 = Class              #18           // java/sql/Connection
   #17 = NameAndType        #19:#20       // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #18 = Utf8               java/sql/Connection
   #19 = Utf8               prepareStatement
   #20 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #21 = InterfaceMethodref #22.#23       // java/sql/PreparedStatement.setInt:(II)V
   #22 = Class              #24           // java/sql/PreparedStatement
   #23 = NameAndType        #25:#26       // setInt:(II)V
   #24 = Utf8               java/sql/PreparedStatement
   #25 = Utf8               setInt
   #26 = Utf8               (II)V
   #27 = Methodref          #28.#29       // ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
   #28 = Class              #30           // ext/mods/gameserver/model/item/instance/ItemInstance
   #29 = NameAndType        #31:#32       // getObjectId:()I
   #30 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
   #31 = Utf8               getObjectId
   #32 = Utf8               ()I
   #33 = Methodref          #28.#34       // ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
   #34 = NameAndType        #35:#32       // getItemId:()I
   #35 = Utf8               getItemId
   #36 = Methodref          #28.#37       // ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
   #37 = NameAndType        #38:#32       // getCount:()I
   #38 = Utf8               getCount
   #39 = Methodref          #28.#40       // ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
   #40 = NameAndType        #41:#32       // getEnchantLevel:()I
   #41 = Utf8               getEnchantLevel
   #42 = Methodref          #28.#43       // ext/mods/gameserver/model/item/instance/ItemInstance.isAugmented:()Z
   #43 = NameAndType        #44:#45       // isAugmented:()Z
   #44 = Utf8               isAugmented
   #45 = Utf8               ()Z
   #46 = InterfaceMethodref #22.#47       // java/sql/PreparedStatement.setBoolean:(IZ)V
   #47 = NameAndType        #48:#49       // setBoolean:(IZ)V
   #48 = Utf8               setBoolean
   #49 = Utf8               (IZ)V
   #50 = Methodref          #28.#51       // ext/mods/gameserver/model/item/instance/ItemInstance.getAugmentation:()Lext/mods/gameserver/model/Augmentation;
   #51 = NameAndType        #52:#53       // getAugmentation:()Lext/mods/gameserver/model/Augmentation;
   #52 = Utf8               getAugmentation
   #53 = Utf8               ()Lext/mods/gameserver/model/Augmentation;
   #54 = Methodref          #55.#56       // ext/mods/gameserver/model/Augmentation.getId:()I
   #55 = Class              #57           // ext/mods/gameserver/model/Augmentation
   #56 = NameAndType        #58:#32       // getId:()I
   #57 = Utf8               ext/mods/gameserver/model/Augmentation
   #58 = Utf8               getId
   #59 = Methodref          #60.#61       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #60 = Class              #62           // java/lang/Integer
   #61 = NameAndType        #63:#64       // valueOf:(I)Ljava/lang/Integer;
   #62 = Utf8               java/lang/Integer
   #63 = Utf8               valueOf
   #64 = Utf8               (I)Ljava/lang/Integer;
   #65 = InterfaceMethodref #22.#66       // java/sql/PreparedStatement.setObject:(ILjava/lang/Object;)V
   #66 = NameAndType        #67:#68       // setObject:(ILjava/lang/Object;)V
   #67 = Utf8               setObject
   #68 = Utf8               (ILjava/lang/Object;)V
   #69 = InterfaceMethodref #22.#70       // java/sql/PreparedStatement.setLong:(IJ)V
   #70 = NameAndType        #71:#72       // setLong:(IJ)V
   #71 = Utf8               setLong
   #72 = Utf8               (IJ)V
   #73 = Methodref          #74.#75       // java/lang/System.currentTimeMillis:()J
   #74 = Class              #76           // java/lang/System
   #75 = NameAndType        #77:#78       // currentTimeMillis:()J
   #76 = Utf8               java/lang/System
   #77 = Utf8               currentTimeMillis
   #78 = Utf8               ()J
   #79 = InterfaceMethodref #22.#80       // java/sql/PreparedStatement.executeUpdate:()I
   #80 = NameAndType        #81:#32       // executeUpdate:()I
   #81 = Utf8               executeUpdate
   #82 = InterfaceMethodref #16.#83       // java/sql/Connection.close:()V
   #83 = NameAndType        #84:#6        // close:()V
   #84 = Utf8               close
   #85 = Class              #86           // java/lang/Throwable
   #86 = Utf8               java/lang/Throwable
   #87 = Methodref          #85.#88       // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
   #88 = NameAndType        #89:#90       // addSuppressed:(Ljava/lang/Throwable;)V
   #89 = Utf8               addSuppressed
   #90 = Utf8               (Ljava/lang/Throwable;)V
   #91 = Class              #92           // java/lang/Exception
   #92 = Utf8               java/lang/Exception
   #93 = Methodref          #91.#94       // java/lang/Exception.printStackTrace:()V
   #94 = NameAndType        #95:#6        // printStackTrace:()V
   #95 = Utf8               printStackTrace
   #96 = Class              #97           // ext/mods/email/items/EmailStorage
   #97 = Utf8               ext/mods/email/items/EmailStorage
   #98 = Utf8               Code
   #99 = Utf8               LineNumberTable
  #100 = Utf8               LocalVariableTable
  #101 = Utf8               this
  #102 = Utf8               Lext/mods/email/items/EmailStorage;
  #103 = Utf8               saveEmail
  #104 = Utf8               (IIILext/mods/gameserver/model/item/instance/ItemInstance;ZIIJ)V
  #105 = Utf8               ps
  #106 = Utf8               Ljava/sql/PreparedStatement;
  #107 = Utf8               con
  #108 = Utf8               Ljava/sql/Connection;
  #109 = Utf8               e
  #110 = Utf8               Ljava/lang/Exception;
  #111 = Utf8               emailId
  #112 = Utf8               I
  #113 = Utf8               senderId
  #114 = Utf8               targetId
  #115 = Utf8               item
  #116 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #117 = Utf8               isPaid
  #118 = Utf8               Z
  #119 = Utf8               paymentItemId
  #120 = Utf8               paymentItemCount
  #121 = Utf8               expirationTime
  #122 = Utf8               J
  #123 = Utf8               StackMapTable
  #124 = Utf8               SourceFile
  #125 = Utf8               EmailStorage.java
{
  public ext.mods.email.items.EmailStorage();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 27: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/email/items/EmailStorage;

  public static void saveEmail(int, int, int, ext.mods.gameserver.model.item.instance.ItemInstance, boolean, int, int, long);
    descriptor: (IIILext/mods/gameserver/model/item/instance/ItemInstance;ZIIJ)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=4, locals=12, args_size=8
         0: invokestatic  #7                  // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         3: astore        9
         5: aload         9
         7: ldc           #13                 // String INSERT INTO player_emails (email_id, sender_id, target_id, item_object_id, item_id, count, enchant_level, is_augmented, augment_id, is_paid, payment_item_id, payment_item_count, expiration_time, created_time) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
         9: invokeinterface #15,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        14: astore        10
        16: aload         10
        18: iconst_1
        19: iload_0
        20: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        25: aload         10
        27: iconst_2
        28: iload_1
        29: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        34: aload         10
        36: iconst_3
        37: iload_2
        38: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        43: aload         10
        45: iconst_4
        46: aload_3
        47: invokevirtual #27                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
        50: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        55: aload         10
        57: iconst_5
        58: aload_3
        59: invokevirtual #33                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        62: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        67: aload         10
        69: bipush        6
        71: aload_3
        72: invokevirtual #36                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
        75: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        80: aload         10
        82: bipush        7
        84: aload_3
        85: invokevirtual #39                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
        88: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        93: aload         10
        95: bipush        8
        97: aload_3
        98: invokevirtual #42                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.isAugmented:()Z
       101: invokeinterface #46,  3           // InterfaceMethod java/sql/PreparedStatement.setBoolean:(IZ)V
       106: aload         10
       108: bipush        9
       110: aload_3
       111: invokevirtual #42                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.isAugmented:()Z
       114: ifeq          127
       117: aload_3
       118: invokevirtual #50                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getAugmentation:()Lext/mods/gameserver/model/Augmentation;
       121: invokevirtual #54                 // Method ext/mods/gameserver/model/Augmentation.getId:()I
       124: goto          128
       127: iconst_0
       128: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       133: aload         10
       135: bipush        10
       137: iload         4
       139: invokeinterface #46,  3           // InterfaceMethod java/sql/PreparedStatement.setBoolean:(IZ)V
       144: aload         10
       146: bipush        11
       148: iload         4
       150: ifeq          161
       153: iload         5
       155: invokestatic  #59                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       158: goto          162
       161: aconst_null
       162: invokeinterface #65,  3           // InterfaceMethod java/sql/PreparedStatement.setObject:(ILjava/lang/Object;)V
       167: aload         10
       169: bipush        12
       171: iload         4
       173: ifeq          184
       176: iload         6
       178: invokestatic  #59                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       181: goto          185
       184: aconst_null
       185: invokeinterface #65,  3           // InterfaceMethod java/sql/PreparedStatement.setObject:(ILjava/lang/Object;)V
       190: aload         10
       192: bipush        13
       194: lload         7
       196: invokeinterface #69,  4           // InterfaceMethod java/sql/PreparedStatement.setLong:(IJ)V
       201: aload         10
       203: bipush        14
       205: invokestatic  #73                 // Method java/lang/System.currentTimeMillis:()J
       208: invokeinterface #69,  4           // InterfaceMethod java/sql/PreparedStatement.setLong:(IJ)V
       213: aload         10
       215: invokeinterface #79,  1           // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
       220: pop
       221: aload         9
       223: ifnull        265
       226: aload         9
       228: invokeinterface #82,  1           // InterfaceMethod java/sql/Connection.close:()V
       233: goto          265
       236: astore        10
       238: aload         9
       240: ifnull        262
       243: aload         9
       245: invokeinterface #82,  1           // InterfaceMethod java/sql/Connection.close:()V
       250: goto          262
       253: astore        11
       255: aload         10
       257: aload         11
       259: invokevirtual #87                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       262: aload         10
       264: athrow
       265: goto          275
       268: astore        9
       270: aload         9
       272: invokevirtual #93                 // Method java/lang/Exception.printStackTrace:()V
       275: return
      Exception table:
         from    to  target type
             5   221   236   Class java/lang/Throwable
           243   250   253   Class java/lang/Throwable
             0   265   268   Class java/lang/Exception
      LineNumberTable:
        line 32: 0
        line 34: 5
        line 36: 16
        line 37: 25
        line 38: 34
        line 39: 43
        line 40: 55
        line 41: 67
        line 42: 80
        line 43: 93
        line 44: 106
        line 45: 133
        line 46: 144
        line 47: 167
        line 48: 190
        line 49: 201
        line 51: 213
        line 52: 221
        line 32: 236
        line 56: 265
        line 53: 268
        line 55: 270
        line 57: 275
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           16     205    10    ps   Ljava/sql/PreparedStatement;
            5     260     9   con   Ljava/sql/Connection;
          270       5     9     e   Ljava/lang/Exception;
            0     276     0 emailId   I
            0     276     1 senderId   I
            0     276     2 targetId   I
            0     276     3  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0     276     4 isPaid   Z
            0     276     5 paymentItemId   I
            0     276     6 paymentItemCount   I
            0     276     7 expirationTime   J
      StackMapTable: number_of_entries = 12
        frame_type = 255 /* full_frame */
          offset_delta = 127
          locals = [ int, int, int, class ext/mods/gameserver/model/item/instance/ItemInstance, int, int, int, long, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/sql/PreparedStatement, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ int, int, int, class ext/mods/gameserver/model/item/instance/ItemInstance, int, int, int, long, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/sql/PreparedStatement, int, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 32
          locals = [ int, int, int, class ext/mods/gameserver/model/item/instance/ItemInstance, int, int, int, long, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/sql/PreparedStatement, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ int, int, int, class ext/mods/gameserver/model/item/instance/ItemInstance, int, int, int, long, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/sql/PreparedStatement, int, class java/lang/Integer ]
        frame_type = 255 /* full_frame */
          offset_delta = 21
          locals = [ int, int, int, class ext/mods/gameserver/model/item/instance/ItemInstance, int, int, int, long, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/sql/PreparedStatement, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ int, int, int, class ext/mods/gameserver/model/item/instance/ItemInstance, int, int, int, long, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/sql/PreparedStatement, int, class java/lang/Integer ]
        frame_type = 255 /* full_frame */
          offset_delta = 50
          locals = [ int, int, int, class ext/mods/gameserver/model/item/instance/ItemInstance, int, int, int, long, class java/sql/Connection ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ int, int, int, class ext/mods/gameserver/model/item/instance/ItemInstance, int, int, int, long, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 6 /* same */
}
SourceFile: "EmailStorage.java"
