// Bytecode for: ext.mods.gameserver.model.entity.autofarm.AutoFarmTask
// File: ext\mods\gameserver\model\entity\autofarm\AutoFarmTask.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/entity/autofarm/AutoFarmTask.class
  Last modified 9 de jul de 2026; size 3650 bytes
  MD5 checksum 565f1e428660747fbdf43fba0b41320b
  Compiled from "AutoFarmTask.java"
public class ext.mods.gameserver.model.entity.autofarm.AutoFarmTask implements java.lang.Runnable
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #20                         // ext/mods/gameserver/model/entity/autofarm/AutoFarmTask
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 2, methods: 4, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = InvokeDynamic      #0:#8         // #0:run:(Lext/mods/gameserver/model/entity/autofarm/AutoFarmTask;)Ljava/lang/Runnable;
    #8 = NameAndType        #9:#10        // run:(Lext/mods/gameserver/model/entity/autofarm/AutoFarmTask;)Ljava/lang/Runnable;
    #9 = Utf8               run
   #10 = Utf8               (Lext/mods/gameserver/model/entity/autofarm/AutoFarmTask;)Ljava/lang/Runnable;
   #11 = Long               400l
   #13 = Methodref          #14.#15       // ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #14 = Class              #16           // ext/mods/commons/pool/ThreadPool
   #15 = NameAndType        #17:#18       // scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #16 = Utf8               ext/mods/commons/pool/ThreadPool
   #17 = Utf8               scheduleAtFixedRate
   #18 = Utf8               (Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #19 = Fieldref           #20.#21       // ext/mods/gameserver/model/entity/autofarm/AutoFarmTask._runTick:I
   #20 = Class              #22           // ext/mods/gameserver/model/entity/autofarm/AutoFarmTask
   #21 = NameAndType        #23:#24       // _runTick:I
   #22 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmTask
   #23 = Utf8               _runTick
   #24 = Utf8               I
   #25 = Methodref          #26.#27       // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.getInstance:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
   #26 = Class              #28           // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager
   #27 = NameAndType        #29:#30       // getInstance:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
   #28 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmManager
   #29 = Utf8               getInstance
   #30 = Utf8               ()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
   #31 = Methodref          #26.#32       // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.getPlayers:()Ljava/util/Collection;
   #32 = NameAndType        #33:#34       // getPlayers:()Ljava/util/Collection;
   #33 = Utf8               getPlayers
   #34 = Utf8               ()Ljava/util/Collection;
   #35 = InterfaceMethodref #36.#37       // java/util/Collection.iterator:()Ljava/util/Iterator;
   #36 = Class              #38           // java/util/Collection
   #37 = NameAndType        #39:#40       // iterator:()Ljava/util/Iterator;
   #38 = Utf8               java/util/Collection
   #39 = Utf8               iterator
   #40 = Utf8               ()Ljava/util/Iterator;
   #41 = InterfaceMethodref #42.#43       // java/util/Iterator.hasNext:()Z
   #42 = Class              #44           // java/util/Iterator
   #43 = NameAndType        #45:#46       // hasNext:()Z
   #44 = Utf8               java/util/Iterator
   #45 = Utf8               hasNext
   #46 = Utf8               ()Z
   #47 = InterfaceMethodref #42.#48       // java/util/Iterator.next:()Ljava/lang/Object;
   #48 = NameAndType        #49:#50       // next:()Ljava/lang/Object;
   #49 = Utf8               next
   #50 = Utf8               ()Ljava/lang/Object;
   #51 = Class              #52           // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile
   #52 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile
   #53 = Methodref          #51.#54       // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.isEnabled:()Z
   #54 = NameAndType        #55:#46       // isEnabled:()Z
   #55 = Utf8               isEnabled
   #56 = Methodref          #51.#57       // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.startRoutine:()V
   #57 = NameAndType        #58:#6        // startRoutine:()V
   #58 = Utf8               startRoutine
   #59 = Methodref          #60.#61       // java/lang/System.currentTimeMillis:()J
   #60 = Class              #62           // java/lang/System
   #61 = NameAndType        #63:#64       // currentTimeMillis:()J
   #62 = Utf8               java/lang/System
   #63 = Utf8               currentTimeMillis
   #64 = Utf8               ()J
   #65 = Methodref          #51.#66       // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getLastActiveTime:()J
   #66 = NameAndType        #67:#64       // getLastActiveTime:()J
   #67 = Utf8               getLastActiveTime
   #68 = Long               600000l
   #70 = Methodref          #51.#71       // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getAreas:()Ljava/util/Map;
   #71 = NameAndType        #72:#73       // getAreas:()Ljava/util/Map;
   #72 = Utf8               getAreas
   #73 = Utf8               ()Ljava/util/Map;
   #74 = InterfaceMethodref #75.#76       // java/util/Map.values:()Ljava/util/Collection;
   #75 = Class              #77           // java/util/Map
   #76 = NameAndType        #78:#34       // values:()Ljava/util/Collection;
   #77 = Utf8               java/util/Map
   #78 = Utf8               values
   #79 = Class              #80           // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea
   #80 = Utf8               ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea
   #81 = Methodref          #79.#82       // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getId:()I
   #82 = NameAndType        #83:#84       // getId:()I
   #83 = Utf8               getId
   #84 = Utf8               ()I
   #85 = Methodref          #51.#86       // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getSelectedAreaId:()I
   #86 = NameAndType        #87:#84       // getSelectedAreaId:()I
   #87 = Utf8               getSelectedAreaId
   #88 = Methodref          #79.#89       // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.isFromDb:()Z
   #89 = NameAndType        #90:#46       // isFromDb:()Z
   #90 = Utf8               isFromDb
   #91 = Methodref          #79.#92       // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getType:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
   #92 = NameAndType        #93:#94       // getType:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
   #93 = Utf8               getType
   #94 = Utf8               ()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
   #95 = Fieldref           #96.#97       // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.ZONA:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
   #96 = Class              #98           // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType
   #97 = NameAndType        #99:#100      // ZONA:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
   #98 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType
   #99 = Utf8               ZONA
  #100 = Utf8               Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
  #101 = Methodref          #79.#102      // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getFarmZone:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone;
  #102 = NameAndType        #103:#104     // getFarmZone:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone;
  #103 = Utf8               getFarmZone
  #104 = Utf8               ()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone;
  #105 = Methodref          #106.#107     // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone.isBuilt:()Z
  #106 = Class              #108          // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone
  #107 = NameAndType        #109:#46      // isBuilt:()Z
  #108 = Utf8               ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone
  #109 = Utf8               isBuilt
  #110 = Methodref          #106.#111     // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone.removeFromWorld:()V
  #111 = NameAndType        #112:#6       // removeFromWorld:()V
  #112 = Utf8               removeFromWorld
  #113 = Fieldref           #114.#115     // ext/mods/gameserver/model/entity/autofarm/AutoFarmTask$SingletonHolder.INSTANCE:Lext/mods/gameserver/model/entity/autofarm/AutoFarmTask;
  #114 = Class              #116          // ext/mods/gameserver/model/entity/autofarm/AutoFarmTask$SingletonHolder
  #115 = NameAndType        #117:#118     // INSTANCE:Lext/mods/gameserver/model/entity/autofarm/AutoFarmTask;
  #116 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmTask$SingletonHolder
  #117 = Utf8               INSTANCE
  #118 = Utf8               Lext/mods/gameserver/model/entity/autofarm/AutoFarmTask;
  #119 = Methodref          #14.#120      // ext/mods/commons/pool/ThreadPool.executeIO:(Ljava/lang/Runnable;)V
  #120 = NameAndType        #121:#122     // executeIO:(Ljava/lang/Runnable;)V
  #121 = Utf8               executeIO
  #122 = Utf8               (Ljava/lang/Runnable;)V
  #123 = Class              #124          // java/lang/Runnable
  #124 = Utf8               java/lang/Runnable
  #125 = Utf8               INACTIVE_TIMEOUT
  #126 = Utf8               J
  #127 = Utf8               ConstantValue
  #128 = Utf8               Code
  #129 = Utf8               LineNumberTable
  #130 = Utf8               LocalVariableTable
  #131 = Utf8               this
  #132 = Utf8               profile
  #133 = Utf8               Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
  #134 = Utf8               area
  #135 = Utf8               Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
  #136 = Utf8               autoFarmProfile
  #137 = Utf8               currentTime
  #138 = Utf8               players
  #139 = Utf8               Ljava/util/Collection;
  #140 = Utf8               LocalVariableTypeTable
  #141 = Utf8               Ljava/util/Collection<Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;>;
  #142 = Utf8               StackMapTable
  #143 = Utf8               ()Lext/mods/gameserver/model/entity/autofarm/AutoFarmTask;
  #144 = Utf8               lambda$new$0
  #145 = Utf8               SourceFile
  #146 = Utf8               AutoFarmTask.java
  #147 = Utf8               NestMembers
  #148 = Utf8               BootstrapMethods
  #149 = MethodType         #6            //  ()V
  #150 = MethodHandle       5:#151        // REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/AutoFarmTask.lambda$new$0:()V
  #151 = Methodref          #20.#152      // ext/mods/gameserver/model/entity/autofarm/AutoFarmTask.lambda$new$0:()V
  #152 = NameAndType        #144:#6       // lambda$new$0:()V
  #153 = MethodHandle       6:#154        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #154 = Methodref          #155.#156     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #155 = Class              #157          // java/lang/invoke/LambdaMetafactory
  #156 = NameAndType        #158:#159     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #157 = Utf8               java/lang/invoke/LambdaMetafactory
  #158 = Utf8               metafactory
  #159 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #160 = Utf8               InnerClasses
  #161 = Utf8               AutoFarmType
  #162 = Utf8               SingletonHolder
  #163 = Class              #164          // java/lang/invoke/MethodHandles$Lookup
  #164 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #165 = Class              #166          // java/lang/invoke/MethodHandles
  #166 = Utf8               java/lang/invoke/MethodHandles
  #167 = Utf8               Lookup
{
  public ext.mods.gameserver.model.entity.autofarm.AutoFarmTask();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: invokedynamic #7,  0              // InvokeDynamic #0:run:(Lext/mods/gameserver/model/entity/autofarm/AutoFarmTask;)Ljava/lang/Runnable;
        10: ldc2_w        #11                 // long 400l
        13: ldc2_w        #11                 // long 400l
        16: invokestatic  #13                 // Method ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
        19: pop
        20: return
      LineNumberTable:
        line 34: 0
        line 35: 4
        line 36: 20
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmTask;

  public void run();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=8, args_size=1
         0: aload_0
         1: dup
         2: getfield      #19                 // Field _runTick:I
         5: iconst_1
         6: iadd
         7: putfield      #19                 // Field _runTick:I
        10: invokestatic  #25                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.getInstance:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
        13: invokevirtual #31                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.getPlayers:()Ljava/util/Collection;
        16: astore_1
        17: aload_1
        18: invokeinterface #35,  1           // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        23: astore_2
        24: aload_2
        25: invokeinterface #41,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        30: ifeq          57
        33: aload_2
        34: invokeinterface #47,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        39: checkcast     #51                 // class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile
        42: astore_3
        43: aload_3
        44: invokevirtual #53                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.isEnabled:()Z
        47: ifeq          54
        50: aload_3
        51: invokevirtual #56                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.startRoutine:()V
        54: goto          24
        57: aload_0
        58: getfield      #19                 // Field _runTick:I
        61: bipush        60
        63: if_icmplt     226
        66: invokestatic  #59                 // Method java/lang/System.currentTimeMillis:()J
        69: lstore_2
        70: aload_1
        71: invokeinterface #35,  1           // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        76: astore        4
        78: aload         4
        80: invokeinterface #41,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        85: ifeq          221
        88: aload         4
        90: invokeinterface #47,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        95: checkcast     #51                 // class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile
        98: astore        5
       100: aload         5
       102: invokevirtual #53                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.isEnabled:()Z
       105: ifeq          111
       108: goto          78
       111: lload_2
       112: aload         5
       114: invokevirtual #65                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getLastActiveTime:()J
       117: ldc2_w        #68                 // long 600000l
       120: ladd
       121: lcmp
       122: ifle          218
       125: aload         5
       127: invokevirtual #70                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getAreas:()Ljava/util/Map;
       130: invokeinterface #74,  1           // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
       135: invokeinterface #35,  1           // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
       140: astore        6
       142: aload         6
       144: invokeinterface #41,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       149: ifeq          218
       152: aload         6
       154: invokeinterface #47,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       159: checkcast     #79                 // class ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea
       162: astore        7
       164: aload         7
       166: invokevirtual #81                 // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getId:()I
       169: aload         5
       171: invokevirtual #85                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getSelectedAreaId:()I
       174: if_icmpeq     215
       177: aload         7
       179: invokevirtual #88                 // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.isFromDb:()Z
       182: ifeq          215
       185: aload         7
       187: invokevirtual #91                 // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getType:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
       190: getstatic     #95                 // Field ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.ZONA:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
       193: if_acmpne     215
       196: aload         7
       198: invokevirtual #101                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getFarmZone:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone;
       201: invokevirtual #105                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone.isBuilt:()Z
       204: ifeq          215
       207: aload         7
       209: invokevirtual #101                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getFarmZone:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone;
       212: invokevirtual #110                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone.removeFromWorld:()V
       215: goto          142
       218: goto          78
       221: aload_0
       222: iconst_0
       223: putfield      #19                 // Field _runTick:I
       226: return
      LineNumberTable:
        line 41: 0
        line 43: 10
        line 44: 17
        line 46: 43
        line 48: 50
        line 50: 54
        line 52: 57
        line 54: 66
        line 56: 70
        line 58: 100
        line 59: 108
        line 61: 111
        line 63: 125
        line 65: 164
        line 66: 179
        line 67: 187
        line 68: 198
        line 70: 207
        line 72: 215
        line 74: 218
        line 76: 221
        line 78: 226
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           43      11     3 profile   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
          164      51     7  area   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
          100     118     5 autoFarmProfile   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
           70     156     2 currentTime   J
            0     227     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmTask;
           17     210     1 players   Ljava/util/Collection;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           17     210     1 players   Ljava/util/Collection<Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;>;
      StackMapTable: number_of_entries = 10
        frame_type = 253 /* append */
          offset_delta = 24
          locals = [ class java/util/Collection, class java/util/Iterator ]
        frame_type = 29 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 253 /* append */
          offset_delta = 20
          locals = [ long, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 32
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile ]
        frame_type = 252 /* append */
          offset_delta = 30
          locals = [ class java/util/Iterator ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 72
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 250 /* chop */
          offset_delta = 4

  public static final ext.mods.gameserver.model.entity.autofarm.AutoFarmTask getInstance();
    descriptor: ()Lext/mods/gameserver/model/entity/autofarm/AutoFarmTask;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #113                // Field ext/mods/gameserver/model/entity/autofarm/AutoFarmTask$SingletonHolder.INSTANCE:Lext/mods/gameserver/model/entity/autofarm/AutoFarmTask;
         3: areturn
      LineNumberTable:
        line 82: 0
}
SourceFile: "AutoFarmTask.java"
NestMembers:
  ext/mods/gameserver/model/entity/autofarm/AutoFarmTask$SingletonHolder
BootstrapMethods:
  0: #153 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #149 ()V
      #150 REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/AutoFarmTask.lambda$new$0:()V
      #149 ()V
InnerClasses:
  public static final #161= #96 of #26;   // AutoFarmType=class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType of class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager
  public static final #167= #163 of #165; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
