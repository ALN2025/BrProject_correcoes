// Bytecode for: ext.mods.gameserver.config.MovementConfig
// File: ext\mods\gameserver\config\MovementConfig.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/config/MovementConfig.class
  Last modified 9 de jul de 2026; size 950 bytes
  MD5 checksum 73c8efa422412da1c36bad72999c6ec1
  Compiled from "MovementConfig.java"
public class ext.mods.gameserver.config.MovementConfig
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #7                          // ext/mods/gameserver/config/MovementConfig
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 8, methods: 4, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Class              #8             // ext/mods/gameserver/config/MovementConfig
   #8 = Utf8               ext/mods/gameserver/config/MovementConfig
   #9 = Utf8               PEACE_ZONE_CACHE_DURATION
  #10 = Utf8               J
  #11 = Utf8               ConstantValue
  #12 = Long               1000l
  #14 = Utf8               MOVE_SPEED_CACHE_DURATION
  #15 = Long               100l
  #17 = Utf8               DISTANCE_CACHE_DURATION
  #18 = Long               50l
  #20 = Utf8               ENABLE_PEACE_ZONE_COLLISION_BYPASS
  #21 = Utf8               Z
  #22 = Integer            1
  #23 = Utf8               ENABLE_MOVEMENT_CACHE
  #24 = Utf8               ENABLE_DEBUG_LOGGING
  #25 = Integer            0
  #26 = Utf8               MAX_CACHE_ENTRIES
  #27 = Utf8               I
  #28 = Integer            1000
  #29 = Utf8               CACHE_CLEANUP_INTERVAL
  #30 = Long               300000l
  #32 = Utf8               Code
  #33 = Utf8               LineNumberTable
  #34 = Utf8               LocalVariableTable
  #35 = Utf8               this
  #36 = Utf8               Lext/mods/gameserver/config/MovementConfig;
  #37 = Utf8               isPeaceZoneCollisionBypassEnabled
  #38 = Utf8               ()Z
  #39 = Utf8               isMovementCacheEnabled
  #40 = Utf8               isDebugLoggingEnabled
  #41 = Utf8               SourceFile
  #42 = Utf8               MovementConfig.java
{
  public static final long PEACE_ZONE_CACHE_DURATION;
    descriptor: J
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: long 1000l

  public static final long MOVE_SPEED_CACHE_DURATION;
    descriptor: J
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: long 100l

  public static final long DISTANCE_CACHE_DURATION;
    descriptor: J
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: long 50l

  public static final boolean ENABLE_PEACE_ZONE_COLLISION_BYPASS;
    descriptor: Z
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 1

  public static final boolean ENABLE_MOVEMENT_CACHE;
    descriptor: Z
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 1

  public static final boolean ENABLE_DEBUG_LOGGING;
    descriptor: Z
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 0

  public static final int MAX_CACHE_ENTRIES;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 1000

  public static final long CACHE_CLEANUP_INTERVAL;
    descriptor: J
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: long 300000l

  public ext.mods.gameserver.config.MovementConfig();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 23: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/config/MovementConfig;

  public static boolean isPeaceZoneCollisionBypassEnabled();
    descriptor: ()Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: iconst_1
         1: ireturn
      LineNumberTable:
        line 42: 0

  public static boolean isMovementCacheEnabled();
    descriptor: ()Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: iconst_1
         1: ireturn
      LineNumberTable:
        line 51: 0

  public static boolean isDebugLoggingEnabled();
    descriptor: ()Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 60: 0
}
SourceFile: "MovementConfig.java"
