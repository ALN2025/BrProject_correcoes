// Bytecode for: ext.mods.gameserver.model.residence.castle.Castle$CastleFunction$FunctionTask
// File: ext\mods\gameserver\model\residence\castle\Castle$CastleFunction$FunctionTask.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/residence/castle/Castle$CastleFunction$FunctionTask.class
  Last modified 9 de jul de 2026; size 2634 bytes
  MD5 checksum 4fcc715dbccda1ecd597e68f0f4c5570
  Compiled from "Castle.java"
class ext.mods.gameserver.model.residence.castle.Castle$CastleFunction$FunctionTask implements java.lang.Runnable
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/residence/castle/Castle$CastleFunction$FunctionTask
  super_class: #14                        // java/lang/Object
  interfaces: 1, fields: 1, methods: 2, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
    #2 = Class              #4            // java/util/Objects
    #3 = NameAndType        #5:#6         // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
    #4 = Utf8               java/util/Objects
    #5 = Utf8               requireNonNull
    #6 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/residence/castle/Castle$CastleFunction$FunctionTask.this$1:Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
    #8 = Class              #10           // ext/mods/gameserver/model/residence/castle/Castle$CastleFunction$FunctionTask
    #9 = NameAndType        #11:#12       // this$1:Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
   #10 = Utf8               ext/mods/gameserver/model/residence/castle/Castle$CastleFunction$FunctionTask
   #11 = Utf8               this$1
   #12 = Utf8               Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
   #13 = Methodref          #14.#15       // java/lang/Object."<init>":()V
   #14 = Class              #16           // java/lang/Object
   #15 = NameAndType        #17:#18       // "<init>":()V
   #16 = Utf8               java/lang/Object
   #17 = Utf8               <init>
   #18 = Utf8               ()V
   #19 = Fieldref           #20.#21       // ext/mods/gameserver/model/residence/castle/Castle$CastleFunction._cwh:Z
   #20 = Class              #22           // ext/mods/gameserver/model/residence/castle/Castle$CastleFunction
   #21 = NameAndType        #23:#24       // _cwh:Z
   #22 = Utf8               ext/mods/gameserver/model/residence/castle/Castle$CastleFunction
   #23 = Utf8               _cwh
   #24 = Utf8               Z
   #25 = Fieldref           #20.#26       // ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.this$0:Lext/mods/gameserver/model/residence/castle/Castle;
   #26 = NameAndType        #27:#28       // this$0:Lext/mods/gameserver/model/residence/castle/Castle;
   #27 = Utf8               this$0
   #28 = Utf8               Lext/mods/gameserver/model/residence/castle/Castle;
   #29 = Methodref          #30.#31       // ext/mods/gameserver/model/residence/castle/Castle.getOwnerId:()I
   #30 = Class              #32           // ext/mods/gameserver/model/residence/castle/Castle
   #31 = NameAndType        #33:#34       // getOwnerId:()I
   #32 = Utf8               ext/mods/gameserver/model/residence/castle/Castle
   #33 = Utf8               getOwnerId
   #34 = Utf8               ()I
   #35 = Methodref          #36.#37       // ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
   #36 = Class              #38           // ext/mods/gameserver/data/sql/ClanTable
   #37 = NameAndType        #39:#40       // getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
   #38 = Utf8               ext/mods/gameserver/data/sql/ClanTable
   #39 = Utf8               getInstance
   #40 = Utf8               ()Lext/mods/gameserver/data/sql/ClanTable;
   #41 = Methodref          #36.#42       // ext/mods/gameserver/data/sql/ClanTable.getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
   #42 = NameAndType        #43:#44       // getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
   #43 = Utf8               getClan
   #44 = Utf8               (I)Lext/mods/gameserver/model/pledge/Clan;
   #45 = Methodref          #46.#47       // ext/mods/gameserver/model/pledge/Clan.getWarehouse:()Lext/mods/gameserver/model/itemcontainer/ItemContainer;
   #46 = Class              #48           // ext/mods/gameserver/model/pledge/Clan
   #47 = NameAndType        #49:#50       // getWarehouse:()Lext/mods/gameserver/model/itemcontainer/ItemContainer;
   #48 = Utf8               ext/mods/gameserver/model/pledge/Clan
   #49 = Utf8               getWarehouse
   #50 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/ItemContainer;
   #51 = Methodref          #52.#53       // ext/mods/gameserver/model/itemcontainer/ItemContainer.getAdena:()I
   #52 = Class              #54           // ext/mods/gameserver/model/itemcontainer/ItemContainer
   #53 = NameAndType        #55:#34       // getAdena:()I
   #54 = Utf8               ext/mods/gameserver/model/itemcontainer/ItemContainer
   #55 = Utf8               getAdena
   #56 = Fieldref           #20.#57       // ext/mods/gameserver/model/residence/castle/Castle$CastleFunction._fee:I
   #57 = NameAndType        #58:#59       // _fee:I
   #58 = Utf8               _fee
   #59 = Utf8               I
   #60 = Methodref          #20.#61       // ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.getEndTime:()J
   #61 = NameAndType        #62:#63       // getEndTime:()J
   #62 = Utf8               getEndTime
   #63 = Utf8               ()J
   #64 = Long               -1l
   #66 = Fieldref           #20.#67       // ext/mods/gameserver/model/residence/castle/Castle$CastleFunction._tempFee:I
   #67 = NameAndType        #68:#59       // _tempFee:I
   #68 = Utf8               _tempFee
   #69 = Methodref          #70.#71       // java/lang/System.currentTimeMillis:()J
   #70 = Class              #72           // java/lang/System
   #71 = NameAndType        #73:#63       // currentTimeMillis:()J
   #72 = Utf8               java/lang/System
   #73 = Utf8               currentTimeMillis
   #74 = Methodref          #20.#75       // ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.getRate:()J
   #75 = NameAndType        #76:#63       // getRate:()J
   #76 = Utf8               getRate
   #77 = Methodref          #20.#78       // ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.setEndTime:(J)V
   #78 = NameAndType        #79:#80       // setEndTime:(J)V
   #79 = Utf8               setEndTime
   #80 = Utf8               (J)V
   #81 = Methodref          #20.#82       // ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.dbSave:()V
   #82 = NameAndType        #83:#18       // dbSave:()V
   #83 = Utf8               dbSave
   #84 = Class              #85           // ext/mods/gameserver/model/itemcontainer/PcInventory
   #85 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
   #86 = Methodref          #52.#87       // ext/mods/gameserver/model/itemcontainer/ItemContainer.destroyItemByItemId:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #87 = NameAndType        #88:#89       // destroyItemByItemId:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #88 = Utf8               destroyItemByItemId
   #89 = Utf8               (II)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #90 = Methodref          #8.#91        // ext/mods/gameserver/model/residence/castle/Castle$CastleFunction$FunctionTask."<init>":(Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;Z)V
   #91 = NameAndType        #17:#92       // "<init>":(Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;Z)V
   #92 = Utf8               (Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;Z)V
   #93 = Methodref          #94.#95       // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #94 = Class              #96           // ext/mods/commons/pool/ThreadPool
   #95 = NameAndType        #97:#98       // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #96 = Utf8               ext/mods/commons/pool/ThreadPool
   #97 = Utf8               schedule
   #98 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #99 = Methodref          #20.#100      // ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.getType:()I
  #100 = NameAndType        #101:#34      // getType:()I
  #101 = Utf8               getType
  #102 = Methodref          #30.#103      // ext/mods/gameserver/model/residence/castle/Castle.removeFunction:(I)V
  #103 = NameAndType        #104:#105     // removeFunction:(I)V
  #104 = Utf8               removeFunction
  #105 = Utf8               (I)V
  #106 = Class              #107          // java/lang/Exception
  #107 = Utf8               java/lang/Exception
  #108 = Fieldref           #30.#109      // ext/mods/gameserver/model/residence/castle/Castle.LOGGER:Lext/mods/commons/logging/CLogger;
  #109 = NameAndType        #110:#111     // LOGGER:Lext/mods/commons/logging/CLogger;
  #110 = Utf8               LOGGER
  #111 = Utf8               Lext/mods/commons/logging/CLogger;
  #112 = String             #113          //
  #113 = Utf8
  #114 = Methodref          #115.#116     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #115 = Class              #117          // ext/mods/commons/logging/CLogger
  #116 = NameAndType        #118:#119     // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #117 = Utf8               ext/mods/commons/logging/CLogger
  #118 = Utf8               error
  #119 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
  #120 = Class              #121          // java/lang/Runnable
  #121 = Utf8               java/lang/Runnable
  #122 = Utf8               Code
  #123 = Utf8               LineNumberTable
  #124 = Utf8               LocalVariableTable
  #125 = Utf8               this
  #126 = Utf8               Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction$FunctionTask;
  #127 = Utf8               cwh
  #128 = Utf8               MethodParameters
  #129 = Utf8               run
  #130 = Utf8               fee
  #131 = Utf8               e
  #132 = Utf8               Ljava/lang/Exception;
  #133 = Utf8               StackMapTable
  #134 = Utf8               SourceFile
  #135 = Utf8               Castle.java
  #136 = Utf8               NestHost
  #137 = Utf8               InnerClasses
  #138 = Utf8               CastleFunction
  #139 = Utf8               FunctionTask
{
  final ext.mods.gameserver.model.residence.castle.Castle$CastleFunction this$1;
    descriptor: Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  public ext.mods.gameserver.model.residence.castle.Castle$CastleFunction$FunctionTask(ext.mods.gameserver.model.residence.castle.Castle$CastleFunction, boolean);
    descriptor: (Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: dup
         3: invokestatic  #1                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
         6: pop
         7: putfield      #7                  // Field this$1:Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
        10: aload_0
        11: invokespecial #13                 // Method java/lang/Object."<init>":()V
        14: aload_1
        15: iload_2
        16: putfield      #19                 // Field ext/mods/gameserver/model/residence/castle/Castle$CastleFunction._cwh:Z
        19: return
      LineNumberTable:
        line 1169: 0
        line 1170: 14
        line 1171: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction$FunctionTask;
            0      20     2   cwh   Z
    MethodParameters:
      Name                           Flags
      <no name>                      final synthetic
      <no name>

  public void run();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=2, args_size=1
         0: aload_0
         1: getfield      #7                  // Field this$1:Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
         4: getfield      #25                 // Field ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.this$0:Lext/mods/gameserver/model/residence/castle/Castle;
         7: invokevirtual #29                 // Method ext/mods/gameserver/model/residence/castle/Castle.getOwnerId:()I
        10: ifgt          14
        13: return
        14: invokestatic  #35                 // Method ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
        17: aload_0
        18: getfield      #7                  // Field this$1:Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
        21: getfield      #25                 // Field ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.this$0:Lext/mods/gameserver/model/residence/castle/Castle;
        24: invokevirtual #29                 // Method ext/mods/gameserver/model/residence/castle/Castle.getOwnerId:()I
        27: invokevirtual #41                 // Method ext/mods/gameserver/data/sql/ClanTable.getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
        30: invokevirtual #45                 // Method ext/mods/gameserver/model/pledge/Clan.getWarehouse:()Lext/mods/gameserver/model/itemcontainer/ItemContainer;
        33: invokevirtual #51                 // Method ext/mods/gameserver/model/itemcontainer/ItemContainer.getAdena:()I
        36: aload_0
        37: getfield      #7                  // Field this$1:Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
        40: getfield      #56                 // Field ext/mods/gameserver/model/residence/castle/Castle$CastleFunction._fee:I
        43: if_icmpge     56
        46: aload_0
        47: getfield      #7                  // Field this$1:Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
        50: getfield      #19                 // Field ext/mods/gameserver/model/residence/castle/Castle$CastleFunction._cwh:Z
        53: ifne          173
        56: aload_0
        57: getfield      #7                  // Field this$1:Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
        60: getfield      #56                 // Field ext/mods/gameserver/model/residence/castle/Castle$CastleFunction._fee:I
        63: istore_1
        64: aload_0
        65: getfield      #7                  // Field this$1:Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
        68: invokevirtual #60                 // Method ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.getEndTime:()J
        71: ldc2_w        #64                 // long -1l
        74: lcmp
        75: ifne          86
        78: aload_0
        79: getfield      #7                  // Field this$1:Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
        82: getfield      #66                 // Field ext/mods/gameserver/model/residence/castle/Castle$CastleFunction._tempFee:I
        85: istore_1
        86: aload_0
        87: getfield      #7                  // Field this$1:Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
        90: invokestatic  #69                 // Method java/lang/System.currentTimeMillis:()J
        93: aload_0
        94: getfield      #7                  // Field this$1:Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
        97: invokevirtual #74                 // Method ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.getRate:()J
       100: ladd
       101: invokevirtual #77                 // Method ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.setEndTime:(J)V
       104: aload_0
       105: getfield      #7                  // Field this$1:Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
       108: invokevirtual #81                 // Method ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.dbSave:()V
       111: aload_0
       112: getfield      #7                  // Field this$1:Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
       115: getfield      #19                 // Field ext/mods/gameserver/model/residence/castle/Castle$CastleFunction._cwh:Z
       118: ifeq          147
       121: invokestatic  #35                 // Method ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
       124: aload_0
       125: getfield      #7                  // Field this$1:Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
       128: getfield      #25                 // Field ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.this$0:Lext/mods/gameserver/model/residence/castle/Castle;
       131: invokevirtual #29                 // Method ext/mods/gameserver/model/residence/castle/Castle.getOwnerId:()I
       134: invokevirtual #41                 // Method ext/mods/gameserver/data/sql/ClanTable.getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
       137: invokevirtual #45                 // Method ext/mods/gameserver/model/pledge/Clan.getWarehouse:()Lext/mods/gameserver/model/itemcontainer/ItemContainer;
       140: bipush        57
       142: iload_1
       143: invokevirtual #86                 // Method ext/mods/gameserver/model/itemcontainer/ItemContainer.destroyItemByItemId:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
       146: pop
       147: new           #8                  // class ext/mods/gameserver/model/residence/castle/Castle$CastleFunction$FunctionTask
       150: dup
       151: aload_0
       152: getfield      #7                  // Field this$1:Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
       155: iconst_1
       156: invokespecial #90                 // Method "<init>":(Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;Z)V
       159: aload_0
       160: getfield      #7                  // Field this$1:Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
       163: invokevirtual #74                 // Method ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.getRate:()J
       166: invokestatic  #93                 // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
       169: pop
       170: goto          190
       173: aload_0
       174: getfield      #7                  // Field this$1:Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
       177: getfield      #25                 // Field ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.this$0:Lext/mods/gameserver/model/residence/castle/Castle;
       180: aload_0
       181: getfield      #7                  // Field this$1:Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
       184: invokevirtual #99                 // Method ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.getType:()I
       187: invokevirtual #102                // Method ext/mods/gameserver/model/residence/castle/Castle.removeFunction:(I)V
       190: goto          203
       193: astore_1
       194: getstatic     #108                // Field ext/mods/gameserver/model/residence/castle/Castle.LOGGER:Lext/mods/commons/logging/CLogger;
       197: ldc           #112                // String
       199: aload_1
       200: invokevirtual #114                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       203: return
      Exception table:
         from    to  target type
             0    13   193   Class java/lang/Exception
            14   190   193   Class java/lang/Exception
      LineNumberTable:
        line 1178: 0
        line 1179: 13
        line 1181: 14
        line 1183: 56
        line 1184: 64
        line 1185: 78
        line 1187: 86
        line 1188: 104
        line 1189: 111
        line 1190: 121
        line 1192: 147
        line 1193: 170
        line 1195: 173
        line 1200: 190
        line 1197: 193
        line 1199: 194
        line 1201: 203
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           64     106     1   fee   I
          194       9     1     e   Ljava/lang/Exception;
            0     204     0  this   Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction$FunctionTask;
      StackMapTable: number_of_entries = 8
        frame_type = 14 /* same */
        frame_type = 41 /* same */
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ int ]
        frame_type = 60 /* same */
        frame_type = 250 /* chop */
          offset_delta = 25
        frame_type = 16 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 9 /* same */
}
SourceFile: "Castle.java"
NestHost: class ext/mods/gameserver/model/residence/castle/Castle
InnerClasses:
  public #138= #20 of #30;                // CastleFunction=class ext/mods/gameserver/model/residence/castle/Castle$CastleFunction of class ext/mods/gameserver/model/residence/castle/Castle
