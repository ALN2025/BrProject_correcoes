// Bytecode for: ext.mods.email.task.EmailDeliveryTask
// File: ext\mods\email\task\EmailDeliveryTask.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/email/task/EmailDeliveryTask.class
  Last modified 9 de jul de 2026; size 4886 bytes
  MD5 checksum f65b989c6e8b0068a8a3bd1c5667c06d
  Compiled from "EmailDeliveryTask.java"
public class ext.mods.email.task.EmailDeliveryTask
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/email/task/EmailDeliveryTask
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 1, methods: 7, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/concurrent/ConcurrentHashMap
    #8 = Utf8               java/util/concurrent/ConcurrentHashMap
    #9 = Methodref          #7.#3         // java/util/concurrent/ConcurrentHashMap."<init>":()V
   #10 = Fieldref           #11.#12       // ext/mods/email/task/EmailDeliveryTask.activeTasks:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/email/task/EmailDeliveryTask
   #12 = NameAndType        #14:#15       // activeTasks:Ljava/util/Map;
   #13 = Utf8               ext/mods/email/task/EmailDeliveryTask
   #14 = Utf8               activeTasks
   #15 = Utf8               Ljava/util/Map;
   #16 = Methodref          #17.#18       // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
   #17 = Class              #19           // ext/mods/commons/pool/ConnectionPool
   #18 = NameAndType        #20:#21       // getConnection:()Ljava/sql/Connection;
   #19 = Utf8               ext/mods/commons/pool/ConnectionPool
   #20 = Utf8               getConnection
   #21 = Utf8               ()Ljava/sql/Connection;
   #22 = String             #23           // SELECT email_id, expiration_time FROM player_emails WHERE status=\'PENDING\'
   #23 = Utf8               SELECT email_id, expiration_time FROM player_emails WHERE status=\'PENDING\'
   #24 = InterfaceMethodref #25.#26       // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #25 = Class              #27           // java/sql/Connection
   #26 = NameAndType        #28:#29       // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #27 = Utf8               java/sql/Connection
   #28 = Utf8               prepareStatement
   #29 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #30 = InterfaceMethodref #31.#32       // java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
   #31 = Class              #33           // java/sql/PreparedStatement
   #32 = NameAndType        #34:#35       // executeQuery:()Ljava/sql/ResultSet;
   #33 = Utf8               java/sql/PreparedStatement
   #34 = Utf8               executeQuery
   #35 = Utf8               ()Ljava/sql/ResultSet;
   #36 = InterfaceMethodref #37.#38       // java/sql/ResultSet.next:()Z
   #37 = Class              #39           // java/sql/ResultSet
   #38 = NameAndType        #40:#41       // next:()Z
   #39 = Utf8               java/sql/ResultSet
   #40 = Utf8               next
   #41 = Utf8               ()Z
   #42 = String             #43           // email_id
   #43 = Utf8               email_id
   #44 = InterfaceMethodref #37.#45       // java/sql/ResultSet.getInt:(Ljava/lang/String;)I
   #45 = NameAndType        #46:#47       // getInt:(Ljava/lang/String;)I
   #46 = Utf8               getInt
   #47 = Utf8               (Ljava/lang/String;)I
   #48 = String             #49           // expiration_time
   #49 = Utf8               expiration_time
   #50 = InterfaceMethodref #37.#51       // java/sql/ResultSet.getLong:(Ljava/lang/String;)J
   #51 = NameAndType        #52:#53       // getLong:(Ljava/lang/String;)J
   #52 = Utf8               getLong
   #53 = Utf8               (Ljava/lang/String;)J
   #54 = Methodref          #11.#55       // ext/mods/email/task/EmailDeliveryTask.scheduleExpiration:(Lext/mods/gameserver/model/actor/Player;IJ)V
   #55 = NameAndType        #56:#57       // scheduleExpiration:(Lext/mods/gameserver/model/actor/Player;IJ)V
   #56 = Utf8               scheduleExpiration
   #57 = Utf8               (Lext/mods/gameserver/model/actor/Player;IJ)V
   #58 = InterfaceMethodref #37.#59       // java/sql/ResultSet.close:()V
   #59 = NameAndType        #60:#6        // close:()V
   #60 = Utf8               close
   #61 = Class              #62           // java/lang/Throwable
   #62 = Utf8               java/lang/Throwable
   #63 = Methodref          #61.#64       // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
   #64 = NameAndType        #65:#66       // addSuppressed:(Ljava/lang/Throwable;)V
   #65 = Utf8               addSuppressed
   #66 = Utf8               (Ljava/lang/Throwable;)V
   #67 = InterfaceMethodref #31.#59       // java/sql/PreparedStatement.close:()V
   #68 = InterfaceMethodref #25.#59       // java/sql/Connection.close:()V
   #69 = Class              #70           // java/lang/Exception
   #70 = Utf8               java/lang/Exception
   #71 = Methodref          #69.#72       // java/lang/Exception.printStackTrace:()V
   #72 = NameAndType        #73:#6        // printStackTrace:()V
   #73 = Utf8               printStackTrace
   #74 = Methodref          #75.#76       // java/lang/System.currentTimeMillis:()J
   #75 = Class              #77           // java/lang/System
   #76 = NameAndType        #78:#79       // currentTimeMillis:()J
   #77 = Utf8               java/lang/System
   #78 = Utf8               currentTimeMillis
   #79 = Utf8               ()J
   #80 = Methodref          #11.#81       // ext/mods/email/task/EmailDeliveryTask.expireEmail:(I)V
   #81 = NameAndType        #82:#83       // expireEmail:(I)V
   #82 = Utf8               expireEmail
   #83 = Utf8               (I)V
   #84 = InvokeDynamic      #0:#85        // #0:run:(Lext/mods/email/task/EmailDeliveryTask;I)Ljava/lang/Runnable;
   #85 = NameAndType        #86:#87       // run:(Lext/mods/email/task/EmailDeliveryTask;I)Ljava/lang/Runnable;
   #86 = Utf8               run
   #87 = Utf8               (Lext/mods/email/task/EmailDeliveryTask;I)Ljava/lang/Runnable;
   #88 = Methodref          #89.#90       // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #89 = Class              #91           // ext/mods/commons/pool/ThreadPool
   #90 = NameAndType        #92:#93       // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #91 = Utf8               ext/mods/commons/pool/ThreadPool
   #92 = Utf8               schedule
   #93 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #94 = Long               60000l
   #96 = Long               1000l
   #98 = InvokeDynamic      #1:#99        // #1:makeConcatWithConstants:(JJ)Ljava/lang/String;
   #99 = NameAndType        #100:#101     // makeConcatWithConstants:(JJ)Ljava/lang/String;
  #100 = Utf8               makeConcatWithConstants
  #101 = Utf8               (JJ)Ljava/lang/String;
  #102 = Methodref          #103.#104     // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
  #103 = Class              #105          // ext/mods/gameserver/model/actor/Player
  #104 = NameAndType        #106:#107     // sendMessage:(Ljava/lang/String;)V
  #105 = Utf8               ext/mods/gameserver/model/actor/Player
  #106 = Utf8               sendMessage
  #107 = Utf8               (Ljava/lang/String;)V
  #108 = InvokeDynamic      #2:#109       // #2:makeConcatWithConstants:(J)Ljava/lang/String;
  #109 = NameAndType        #100:#110     // makeConcatWithConstants:(J)Ljava/lang/String;
  #110 = Utf8               (J)Ljava/lang/String;
  #111 = Methodref          #112.#113     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #112 = Class              #114          // java/lang/Integer
  #113 = NameAndType        #115:#116     // valueOf:(I)Ljava/lang/Integer;
  #114 = Utf8               java/lang/Integer
  #115 = Utf8               valueOf
  #116 = Utf8               (I)Ljava/lang/Integer;
  #117 = InterfaceMethodref #118.#119     // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #118 = Class              #120          // java/util/Map
  #119 = NameAndType        #121:#122     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #120 = Utf8               java/util/Map
  #121 = Utf8               put
  #122 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #123 = InterfaceMethodref #118.#124     // java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #124 = NameAndType        #125:#126     // remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #125 = Utf8               remove
  #126 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #127 = Class              #128          // java/util/concurrent/ScheduledFuture
  #128 = Utf8               java/util/concurrent/ScheduledFuture
  #129 = InterfaceMethodref #127.#130     // java/util/concurrent/ScheduledFuture.cancel:(Z)Z
  #130 = NameAndType        #131:#132     // cancel:(Z)Z
  #131 = Utf8               cancel
  #132 = Utf8               (Z)Z
  #133 = Methodref          #134.#135     // ext/mods/email/sql/EmailDAO.isPending:(I)Z
  #134 = Class              #136          // ext/mods/email/sql/EmailDAO
  #135 = NameAndType        #137:#138     // isPending:(I)Z
  #136 = Utf8               ext/mods/email/sql/EmailDAO
  #137 = Utf8               isPending
  #138 = Utf8               (I)Z
  #139 = Methodref          #134.#140     // ext/mods/email/sql/EmailDAO.expireAndReturnToSender:(I)V
  #140 = NameAndType        #141:#83      // expireAndReturnToSender:(I)V
  #141 = Utf8               expireAndReturnToSender
  #142 = Fieldref           #143.#144     // ext/mods/email/task/EmailDeliveryTask$SingletonHolder._instance:Lext/mods/email/task/EmailDeliveryTask;
  #143 = Class              #145          // ext/mods/email/task/EmailDeliveryTask$SingletonHolder
  #144 = NameAndType        #146:#147     // _instance:Lext/mods/email/task/EmailDeliveryTask;
  #145 = Utf8               ext/mods/email/task/EmailDeliveryTask$SingletonHolder
  #146 = Utf8               _instance
  #147 = Utf8               Lext/mods/email/task/EmailDeliveryTask;
  #148 = Utf8               Signature
  #149 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/util/concurrent/ScheduledFuture<*>;>;
  #150 = Utf8               Code
  #151 = Utf8               LineNumberTable
  #152 = Utf8               LocalVariableTable
  #153 = Utf8               this
  #154 = Utf8               loadAllPending
  #155 = Utf8               emailId
  #156 = Utf8               I
  #157 = Utf8               expTime
  #158 = Utf8               J
  #159 = Utf8               rs
  #160 = Utf8               Ljava/sql/ResultSet;
  #161 = Utf8               ps
  #162 = Utf8               Ljava/sql/PreparedStatement;
  #163 = Utf8               con
  #164 = Utf8               Ljava/sql/Connection;
  #165 = Utf8               e
  #166 = Utf8               Ljava/lang/Exception;
  #167 = Utf8               StackMapTable
  #168 = Utf8               sender
  #169 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #170 = Utf8               expirationTime
  #171 = Utf8               currentTime
  #172 = Utf8               delay
  #173 = Utf8               task
  #174 = Utf8               Ljava/util/concurrent/ScheduledFuture;
  #175 = Utf8               minutes
  #176 = Utf8               seconds
  #177 = Utf8               LocalVariableTypeTable
  #178 = Utf8               Ljava/util/concurrent/ScheduledFuture<*>;
  #179 = Utf8               getInstance
  #180 = Utf8               ()Lext/mods/email/task/EmailDeliveryTask;
  #181 = Utf8               lambda$scheduleExpiration$0
  #182 = Utf8               SourceFile
  #183 = Utf8               EmailDeliveryTask.java
  #184 = Utf8               NestMembers
  #185 = Utf8               BootstrapMethods
  #186 = MethodType         #6            //  ()V
  #187 = MethodHandle       5:#188        // REF_invokeVirtual ext/mods/email/task/EmailDeliveryTask.lambda$scheduleExpiration$0:(I)V
  #188 = Methodref          #11.#189      // ext/mods/email/task/EmailDeliveryTask.lambda$scheduleExpiration$0:(I)V
  #189 = NameAndType        #181:#83      // lambda$scheduleExpiration$0:(I)V
  #190 = String             #191          // Tarefa agendada: o e-mail será expirado em \u0001 minuto(s) e \u0001 segundo(s).
  #191 = Utf8               Tarefa agendada: o e-mail será expirado em \u0001 minuto(s) e \u0001 segundo(s).
  #192 = String             #193          // Tarefa agendada: o e-mail será expirado em \u0001 segundo(s).
  #193 = Utf8               Tarefa agendada: o e-mail será expirado em \u0001 segundo(s).
  #194 = MethodHandle       6:#195        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #195 = Methodref          #196.#197     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #196 = Class              #198          // java/lang/invoke/LambdaMetafactory
  #197 = NameAndType        #199:#200     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #198 = Utf8               java/lang/invoke/LambdaMetafactory
  #199 = Utf8               metafactory
  #200 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #201 = MethodHandle       6:#202        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #202 = Methodref          #203.#204     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #203 = Class              #205          // java/lang/invoke/StringConcatFactory
  #204 = NameAndType        #100:#206     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #205 = Utf8               java/lang/invoke/StringConcatFactory
  #206 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #207 = Utf8               InnerClasses
  #208 = Utf8               SingletonHolder
  #209 = Class              #210          // java/lang/invoke/MethodHandles$Lookup
  #210 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #211 = Class              #212          // java/lang/invoke/MethodHandles
  #212 = Utf8               java/lang/invoke/MethodHandles
  #213 = Utf8               Lookup
{
  public ext.mods.email.task.EmailDeliveryTask();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/concurrent/ConcurrentHashMap
         8: dup
         9: invokespecial #9                  // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        12: putfield      #10                 // Field activeTasks:Ljava/util/Map;
        15: return
      LineNumberTable:
        line 32: 0
        line 34: 4
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/email/task/EmailDeliveryTask;

  public void loadAllPending();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=7, args_size=1
         0: invokestatic  #16                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         3: astore_1
         4: aload_1
         5: ldc           #22                 // String SELECT email_id, expiration_time FROM player_emails WHERE status=\'PENDING\'
         7: invokeinterface #24,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        12: astore_2
        13: aload_2
        14: invokeinterface #30,  1           // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
        19: astore_3
        20: aload_3
        21: invokeinterface #36,  1           // InterfaceMethod java/sql/ResultSet.next:()Z
        26: ifeq          61
        29: aload_3
        30: ldc           #42                 // String email_id
        32: invokeinterface #44,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        37: istore        4
        39: aload_3
        40: ldc           #48                 // String expiration_time
        42: invokeinterface #50,  2           // InterfaceMethod java/sql/ResultSet.getLong:(Ljava/lang/String;)J
        47: lstore        5
        49: aload_0
        50: aconst_null
        51: iload         4
        53: lload         5
        55: invokevirtual #54                 // Method scheduleExpiration:(Lext/mods/gameserver/model/actor/Player;IJ)V
        58: goto          20
        61: aload_3
        62: ifnull        101
        65: aload_3
        66: invokeinterface #58,  1           // InterfaceMethod java/sql/ResultSet.close:()V
        71: goto          101
        74: astore        4
        76: aload_3
        77: ifnull        98
        80: aload_3
        81: invokeinterface #58,  1           // InterfaceMethod java/sql/ResultSet.close:()V
        86: goto          98
        89: astore        5
        91: aload         4
        93: aload         5
        95: invokevirtual #63                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        98: aload         4
       100: athrow
       101: aload_2
       102: ifnull        138
       105: aload_2
       106: invokeinterface #67,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       111: goto          138
       114: astore_3
       115: aload_2
       116: ifnull        136
       119: aload_2
       120: invokeinterface #67,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       125: goto          136
       128: astore        4
       130: aload_3
       131: aload         4
       133: invokevirtual #63                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       136: aload_3
       137: athrow
       138: aload_1
       139: ifnull        173
       142: aload_1
       143: invokeinterface #68,  1           // InterfaceMethod java/sql/Connection.close:()V
       148: goto          173
       151: astore_2
       152: aload_1
       153: ifnull        171
       156: aload_1
       157: invokeinterface #68,  1           // InterfaceMethod java/sql/Connection.close:()V
       162: goto          171
       165: astore_3
       166: aload_2
       167: aload_3
       168: invokevirtual #63                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       171: aload_2
       172: athrow
       173: goto          181
       176: astore_1
       177: aload_1
       178: invokevirtual #71                 // Method java/lang/Exception.printStackTrace:()V
       181: return
      Exception table:
         from    to  target type
            20    61    74   Class java/lang/Throwable
            80    86    89   Class java/lang/Throwable
            13   101   114   Class java/lang/Throwable
           119   125   128   Class java/lang/Throwable
             4   138   151   Class java/lang/Throwable
           156   162   165   Class java/lang/Throwable
             0   173   176   Class java/lang/Exception
      LineNumberTable:
        line 38: 0
        line 39: 4
        line 41: 13
        line 43: 20
        line 45: 29
        line 46: 39
        line 47: 49
        line 48: 58
        line 49: 61
        line 41: 74
        line 50: 101
        line 38: 114
        line 50: 138
        line 38: 151
        line 54: 173
        line 51: 176
        line 53: 177
        line 55: 181
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           39      19     4 emailId   I
           49       9     5 expTime   J
           20      81     3    rs   Ljava/sql/ResultSet;
           13     125     2    ps   Ljava/sql/PreparedStatement;
            4     169     1   con   Ljava/sql/Connection;
          177       4     1     e   Ljava/lang/Exception;
            0     182     0  this   Lext/mods/email/task/EmailDeliveryTask;
      StackMapTable: number_of_entries = 16
        frame_type = 254 /* append */
          offset_delta = 20
          locals = [ class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet ]
        frame_type = 40 /* same */
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/email/task/EmailDeliveryTask, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/email/task/EmailDeliveryTask, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/email/task/EmailDeliveryTask, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 4 /* same */

  public void scheduleExpiration(ext.mods.gameserver.model.actor.Player, int, long);
    descriptor: (Lext/mods/gameserver/model/actor/Player;IJ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=14, args_size=4
         0: invokestatic  #74                 // Method java/lang/System.currentTimeMillis:()J
         3: lstore        5
         5: lload_3
         6: lload         5
         8: lsub
         9: lstore        7
        11: lload         7
        13: lconst_0
        14: lcmp
        15: ifgt          24
        18: aload_0
        19: iload_2
        20: invokevirtual #80                 // Method expireEmail:(I)V
        23: return
        24: aload_0
        25: iload_2
        26: invokedynamic #84,  0             // InvokeDynamic #0:run:(Lext/mods/email/task/EmailDeliveryTask;I)Ljava/lang/Runnable;
        31: lload         7
        33: invokestatic  #88                 // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
        36: astore        9
        38: lload         7
        40: ldc2_w        #94                 // long 60000l
        43: ldiv
        44: lstore        10
        46: lload         7
        48: ldc2_w        #94                 // long 60000l
        51: lrem
        52: ldc2_w        #96                 // long 1000l
        55: ldiv
        56: lstore        12
        58: aload_1
        59: ifnull        96
        62: lload         10
        64: lconst_0
        65: lcmp
        66: ifle          85
        69: aload_1
        70: lload         10
        72: lload         12
        74: invokedynamic #98,  0             // InvokeDynamic #1:makeConcatWithConstants:(JJ)Ljava/lang/String;
        79: invokevirtual #102                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        82: goto          96
        85: aload_1
        86: lload         12
        88: invokedynamic #108,  0            // InvokeDynamic #2:makeConcatWithConstants:(J)Ljava/lang/String;
        93: invokevirtual #102                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        96: aload_0
        97: getfield      #10                 // Field activeTasks:Ljava/util/Map;
       100: iload_2
       101: invokestatic  #111                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       104: aload         9
       106: invokeinterface #117,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       111: pop
       112: return
      LineNumberTable:
        line 60: 0
        line 61: 5
        line 63: 11
        line 65: 18
        line 66: 23
        line 69: 24
        line 75: 38
        line 76: 46
        line 78: 58
        line 79: 62
        line 80: 69
        line 82: 85
        line 86: 96
        line 87: 112
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     113     0  this   Lext/mods/email/task/EmailDeliveryTask;
            0     113     1 sender   Lext/mods/gameserver/model/actor/Player;
            0     113     2 emailId   I
            0     113     3 expirationTime   J
            5     108     5 currentTime   J
           11     102     7 delay   J
           38      75     9  task   Ljava/util/concurrent/ScheduledFuture;
           46      67    10 minutes   J
           58      55    12 seconds   J
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           38      75     9  task   Ljava/util/concurrent/ScheduledFuture<*>;
      StackMapTable: number_of_entries = 3
        frame_type = 253 /* append */
          offset_delta = 24
          locals = [ long, long ]
        frame_type = 254 /* append */
          offset_delta = 60
          locals = [ class java/util/concurrent/ScheduledFuture, long, long ]
        frame_type = 10 /* same */

  public void cancel(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: getfield      #10                 // Field activeTasks:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #111                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #123,  2          // InterfaceMethod java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #127                // class java/util/concurrent/ScheduledFuture
        16: astore_2
        17: aload_2
        18: ifnull        29
        21: aload_2
        22: iconst_0
        23: invokeinterface #129,  2          // InterfaceMethod java/util/concurrent/ScheduledFuture.cancel:(Z)Z
        28: pop
        29: return
      LineNumberTable:
        line 91: 0
        line 92: 17
        line 93: 21
        line 94: 29
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      30     0  this   Lext/mods/email/task/EmailDeliveryTask;
            0      30     1 emailId   I
           17      13     2  task   Ljava/util/concurrent/ScheduledFuture;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           17      13     2  task   Ljava/util/concurrent/ScheduledFuture<*>;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ class java/util/concurrent/ScheduledFuture ]

  public static ext.mods.email.task.EmailDeliveryTask getInstance();
    descriptor: ()Lext/mods/email/task/EmailDeliveryTask;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #142                // Field ext/mods/email/task/EmailDeliveryTask$SingletonHolder._instance:Lext/mods/email/task/EmailDeliveryTask;
         3: areturn
      LineNumberTable:
        line 103: 0
}
SourceFile: "EmailDeliveryTask.java"
NestMembers:
  ext/mods/email/task/EmailDeliveryTask$SingletonHolder
BootstrapMethods:
  0: #194 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #186 ()V
      #187 REF_invokeVirtual ext/mods/email/task/EmailDeliveryTask.lambda$scheduleExpiration$0:(I)V
      #186 ()V
  1: #201 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #190 Tarefa agendada: o e-mail será expirado em \u0001 minuto(s) e \u0001 segundo(s).
  2: #201 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #192 Tarefa agendada: o e-mail será expirado em \u0001 segundo(s).
InnerClasses:
  public static final #213= #209 of #211; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
