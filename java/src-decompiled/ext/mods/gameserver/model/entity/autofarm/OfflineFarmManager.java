// Bytecode for: ext.mods.gameserver.model.entity.autofarm.OfflineFarmManager
// File: ext\mods\gameserver\model\entity\autofarm\OfflineFarmManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/entity/autofarm/OfflineFarmManager.class
  Last modified 9 de jul de 2026; size 2796 bytes
  MD5 checksum 0958388b082b39e9d03d921f11555c63
  Compiled from "OfflineFarmManager.java"
public class ext.mods.gameserver.model.entity.autofarm.OfflineFarmManager
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/model/entity/autofarm/OfflineFarmManager
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 1, methods: 6, attributes: 3
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
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/model/entity/autofarm/OfflineFarmManager._offlinePlayers:Ljava/util/concurrent/ConcurrentHashMap;
   #11 = Class              #13           // ext/mods/gameserver/model/entity/autofarm/OfflineFarmManager
   #12 = NameAndType        #14:#15       // _offlinePlayers:Ljava/util/concurrent/ConcurrentHashMap;
   #13 = Utf8               ext/mods/gameserver/model/entity/autofarm/OfflineFarmManager
   #14 = Utf8               _offlinePlayers
   #15 = Utf8               Ljava/util/concurrent/ConcurrentHashMap;
   #16 = Methodref          #17.#18       // ext/mods/gameserver/model/actor/Player.isOfflineFarm:()Z
   #17 = Class              #19           // ext/mods/gameserver/model/actor/Player
   #18 = NameAndType        #20:#21       // isOfflineFarm:()Z
   #19 = Utf8               ext/mods/gameserver/model/actor/Player
   #20 = Utf8               isOfflineFarm
   #21 = Utf8               ()Z
   #22 = Class              #23           // ext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine
   #23 = Utf8               ext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine
   #24 = Methodref          #22.#25       // ext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine."<init>":(Lext/mods/gameserver/model/actor/Player;)V
   #25 = NameAndType        #5:#26        // "<init>":(Lext/mods/gameserver/model/actor/Player;)V
   #26 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #27 = Methodref          #7.#28        // java/util/concurrent/ConcurrentHashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #28 = NameAndType        #29:#30       // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #29 = Utf8               put
   #30 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #31 = Methodref          #17.#32       // ext/mods/gameserver/model/actor/Player.startOfflineFarm:()V
   #32 = NameAndType        #33:#6        // startOfflineFarm:()V
   #33 = Utf8               startOfflineFarm
   #34 = Methodref          #22.#35       // ext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine.start:()V
   #35 = NameAndType        #36:#6        // start:()V
   #36 = Utf8               start
   #37 = Methodref          #7.#38        // java/util/concurrent/ConcurrentHashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
   #38 = NameAndType        #39:#40       // remove:(Ljava/lang/Object;)Ljava/lang/Object;
   #39 = Utf8               remove
   #40 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #41 = Methodref          #22.#42       // ext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine.stop:()V
   #42 = NameAndType        #43:#6        // stop:()V
   #43 = Utf8               stop
   #44 = Methodref          #17.#45       // ext/mods/gameserver/model/actor/Player.stopOfflineFarm:()V
   #45 = NameAndType        #46:#6        // stopOfflineFarm:()V
   #46 = Utf8               stopOfflineFarm
   #47 = Methodref          #11.#48       // ext/mods/gameserver/model/entity/autofarm/OfflineFarmManager.stopOfflineFarm:(Lext/mods/gameserver/model/actor/Player;)V
   #48 = NameAndType        #46:#26       // stopOfflineFarm:(Lext/mods/gameserver/model/actor/Player;)V
   #49 = Methodref          #50.#51       // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.getInstance:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
   #50 = Class              #52           // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager
   #51 = NameAndType        #53:#54       // getInstance:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
   #52 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmManager
   #53 = Utf8               getInstance
   #54 = Utf8               ()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
   #55 = Methodref          #17.#56       // ext/mods/gameserver/model/actor/Player.getObjectId:()I
   #56 = NameAndType        #57:#58       // getObjectId:()I
   #57 = Utf8               getObjectId
   #58 = Utf8               ()I
   #59 = Methodref          #50.#60       // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.getPlayer:(I)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
   #60 = NameAndType        #61:#62       // getPlayer:(I)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
   #61 = Utf8               getPlayer
   #62 = Utf8               (I)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
   #63 = Methodref          #64.#65       // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.isEnabled:()Z
   #64 = Class              #66           // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile
   #65 = NameAndType        #67:#21       // isEnabled:()Z
   #66 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile
   #67 = Utf8               isEnabled
   #68 = Methodref          #64.#69       // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.isDeathReturnEnabled:()Z
   #69 = NameAndType        #70:#21       // isDeathReturnEnabled:()Z
   #70 = Utf8               isDeathReturnEnabled
   #71 = Methodref          #7.#72        // java/util/concurrent/ConcurrentHashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #72 = NameAndType        #73:#40       // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #73 = Utf8               get
   #74 = Methodref          #22.#75       // ext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine.respawnAndRestoreBuffs:()V
   #75 = NameAndType        #76:#6        // respawnAndRestoreBuffs:()V
   #76 = Utf8               respawnAndRestoreBuffs
   #77 = Fieldref           #78.#79       // ext/mods/Config.OFFLINE_FARM_LOGOUT_ON_DEATH:Z
   #78 = Class              #80           // ext/mods/Config
   #79 = NameAndType        #81:#82       // OFFLINE_FARM_LOGOUT_ON_DEATH:Z
   #80 = Utf8               ext/mods/Config
   #81 = Utf8               OFFLINE_FARM_LOGOUT_ON_DEATH
   #82 = Utf8               Z
   #83 = Fieldref           #84.#85       // ext/mods/gameserver/model/entity/autofarm/OfflineFarmManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/model/entity/autofarm/OfflineFarmManager;
   #84 = Class              #86           // ext/mods/gameserver/model/entity/autofarm/OfflineFarmManager$SingletonHolder
   #85 = NameAndType        #87:#88       // INSTANCE:Lext/mods/gameserver/model/entity/autofarm/OfflineFarmManager;
   #86 = Utf8               ext/mods/gameserver/model/entity/autofarm/OfflineFarmManager$SingletonHolder
   #87 = Utf8               INSTANCE
   #88 = Utf8               Lext/mods/gameserver/model/entity/autofarm/OfflineFarmManager;
   #89 = Utf8               Signature
   #90 = Utf8               Ljava/util/concurrent/ConcurrentHashMap<Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine;>;
   #91 = Utf8               Code
   #92 = Utf8               LineNumberTable
   #93 = Utf8               LocalVariableTable
   #94 = Utf8               this
   #95 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
   #96 = Utf8               player
   #97 = Utf8               Lext/mods/gameserver/model/actor/Player;
   #98 = Utf8               routine
   #99 = Utf8               Lext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine;
  #100 = Utf8               StackMapTable
  #101 = Utf8               onPlayerLogout
  #102 = Utf8               onPlayerDeath
  #103 = Utf8               profile
  #104 = Utf8               Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
  #105 = Utf8               ()Lext/mods/gameserver/model/entity/autofarm/OfflineFarmManager;
  #106 = Utf8               SourceFile
  #107 = Utf8               OfflineFarmManager.java
  #108 = Utf8               NestMembers
  #109 = Utf8               InnerClasses
  #110 = Utf8               SingletonHolder
{
  public ext.mods.gameserver.model.entity.autofarm.OfflineFarmManager();
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
        12: putfield      #10                 // Field _offlinePlayers:Ljava/util/concurrent/ConcurrentHashMap;
        15: return
      LineNumberTable:
        line 29: 0
        line 31: 4
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/entity/autofarm/OfflineFarmManager;

  public boolean startOfflineFarm(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=2
         0: aload_1
         1: ifnull        11
         4: aload_1
         5: invokevirtual #16                 // Method ext/mods/gameserver/model/actor/Player.isOfflineFarm:()Z
         8: ifeq          13
        11: iconst_0
        12: ireturn
        13: new           #22                 // class ext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine
        16: dup
        17: aload_1
        18: invokespecial #24                 // Method ext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine."<init>":(Lext/mods/gameserver/model/actor/Player;)V
        21: astore_2
        22: aload_0
        23: getfield      #10                 // Field _offlinePlayers:Ljava/util/concurrent/ConcurrentHashMap;
        26: aload_1
        27: aload_2
        28: invokevirtual #27                 // Method java/util/concurrent/ConcurrentHashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        31: pop
        32: aload_1
        33: invokevirtual #31                 // Method ext/mods/gameserver/model/actor/Player.startOfflineFarm:()V
        36: aload_2
        37: invokevirtual #34                 // Method ext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine.start:()V
        40: iconst_1
        41: ireturn
      LineNumberTable:
        line 35: 0
        line 36: 11
        line 38: 13
        line 39: 22
        line 40: 32
        line 41: 36
        line 43: 40
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      42     0  this   Lext/mods/gameserver/model/entity/autofarm/OfflineFarmManager;
            0      42     1 player   Lext/mods/gameserver/model/actor/Player;
           22      20     2 routine   Lext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine;
      StackMapTable: number_of_entries = 2
        frame_type = 11 /* same */
        frame_type = 1 /* same */

  public void stopOfflineFarm(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_1
         1: ifnonnull     5
         4: return
         5: aload_0
         6: getfield      #10                 // Field _offlinePlayers:Ljava/util/concurrent/ConcurrentHashMap;
         9: aload_1
        10: invokevirtual #37                 // Method java/util/concurrent/ConcurrentHashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #22                 // class ext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine
        16: astore_2
        17: aload_2
        18: ifnull        25
        21: aload_2
        22: invokevirtual #41                 // Method ext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine.stop:()V
        25: aload_1
        26: invokevirtual #44                 // Method ext/mods/gameserver/model/actor/Player.stopOfflineFarm:()V
        29: return
      LineNumberTable:
        line 48: 0
        line 49: 4
        line 51: 5
        line 52: 17
        line 53: 21
        line 55: 25
        line 56: 29
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      30     0  this   Lext/mods/gameserver/model/entity/autofarm/OfflineFarmManager;
            0      30     1 player   Lext/mods/gameserver/model/actor/Player;
           17      13     2 routine   Lext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine;
      StackMapTable: number_of_entries = 2
        frame_type = 5 /* same */
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine ]

  public void onPlayerLogout(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: ifnull        16
         4: aload_1
         5: invokevirtual #16                 // Method ext/mods/gameserver/model/actor/Player.isOfflineFarm:()Z
         8: ifeq          16
        11: aload_0
        12: aload_1
        13: invokevirtual #47                 // Method stopOfflineFarm:(Lext/mods/gameserver/model/actor/Player;)V
        16: return
      LineNumberTable:
        line 60: 0
        line 61: 11
        line 62: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/entity/autofarm/OfflineFarmManager;
            0      17     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 1
        frame_type = 16 /* same */

  public void onPlayerDeath(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=2
         0: aload_1
         1: ifnull        67
         4: aload_1
         5: invokevirtual #16                 // Method ext/mods/gameserver/model/actor/Player.isOfflineFarm:()Z
         8: ifeq          67
        11: invokestatic  #49                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.getInstance:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
        14: aload_1
        15: invokevirtual #55                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        18: invokevirtual #59                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.getPlayer:(I)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
        21: astore_2
        22: aload_2
        23: ifnull        41
        26: aload_2
        27: invokevirtual #63                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.isEnabled:()Z
        30: ifeq          41
        33: aload_2
        34: invokevirtual #68                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.isDeathReturnEnabled:()Z
        37: ifeq          41
        40: return
        41: aload_0
        42: getfield      #10                 // Field _offlinePlayers:Ljava/util/concurrent/ConcurrentHashMap;
        45: aload_1
        46: invokevirtual #71                 // Method java/util/concurrent/ConcurrentHashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        49: checkcast     #22                 // class ext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine
        52: astore_3
        53: aload_3
        54: ifnull        61
        57: aload_3
        58: invokevirtual #74                 // Method ext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine.respawnAndRestoreBuffs:()V
        61: getstatic     #77                 // Field ext/mods/Config.OFFLINE_FARM_LOGOUT_ON_DEATH:Z
        64: ifeq          67
        67: return
      LineNumberTable:
        line 66: 0
        line 68: 11
        line 69: 22
        line 70: 40
        line 72: 41
        line 73: 53
        line 75: 57
        line 78: 61
        line 82: 67
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           22      45     2 profile   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
           53      14     3 routine   Lext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine;
            0      68     0  this   Lext/mods/gameserver/model/entity/autofarm/OfflineFarmManager;
            0      68     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 41
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile ]
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine ]
        frame_type = 249 /* chop */
          offset_delta = 5

  public static ext.mods.gameserver.model.entity.autofarm.OfflineFarmManager getInstance();
    descriptor: ()Lext/mods/gameserver/model/entity/autofarm/OfflineFarmManager;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #83                 // Field ext/mods/gameserver/model/entity/autofarm/OfflineFarmManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/model/entity/autofarm/OfflineFarmManager;
         3: areturn
      LineNumberTable:
        line 86: 0
}
SourceFile: "OfflineFarmManager.java"
NestMembers:
  ext/mods/gameserver/model/entity/autofarm/OfflineFarmManager$SingletonHolder
