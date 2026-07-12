// Bytecode for: ext.mods.gameserver.model.Announcement
// File: ext\mods\gameserver\model\Announcement.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/Announcement.class
  Last modified 9 de jul de 2026; size 2577 bytes
  MD5 checksum e9417ba967830d6f276d3e7107fbf22a
  Compiled from "Announcement.java"
public class ext.mods.gameserver.model.Announcement implements java.lang.Runnable
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/Announcement
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 9, methods: 11, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/Announcement._message:Ljava/lang/String;
   #8 = Class              #10            // ext/mods/gameserver/model/Announcement
   #9 = NameAndType        #11:#12        // _message:Ljava/lang/String;
  #10 = Utf8               ext/mods/gameserver/model/Announcement
  #11 = Utf8               _message
  #12 = Utf8               Ljava/lang/String;
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/model/Announcement._critical:Z
  #14 = NameAndType        #15:#16        // _critical:Z
  #15 = Utf8               _critical
  #16 = Utf8               Z
  #17 = Fieldref           #8.#18         // ext/mods/gameserver/model/Announcement._auto:Z
  #18 = NameAndType        #19:#16        // _auto:Z
  #19 = Utf8               _auto
  #20 = Fieldref           #8.#21         // ext/mods/gameserver/model/Announcement._initialDelay:I
  #21 = NameAndType        #22:#23        // _initialDelay:I
  #22 = Utf8               _initialDelay
  #23 = Utf8               I
  #24 = Fieldref           #8.#25         // ext/mods/gameserver/model/Announcement._delay:I
  #25 = NameAndType        #26:#23        // _delay:I
  #26 = Utf8               _delay
  #27 = Fieldref           #8.#28         // ext/mods/gameserver/model/Announcement._limit:I
  #28 = NameAndType        #29:#23        // _limit:I
  #29 = Utf8               _limit
  #30 = Long               1000l
  #32 = Methodref          #33.#34        // ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
  #33 = Class              #35            // ext/mods/commons/pool/ThreadPool
  #34 = NameAndType        #36:#37        // scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
  #35 = Utf8               ext/mods/commons/pool/ThreadPool
  #36 = Utf8               scheduleAtFixedRate
  #37 = Utf8               (Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
  #38 = Fieldref           #8.#39         // ext/mods/gameserver/model/Announcement._task:Ljava/util/concurrent/ScheduledFuture;
  #39 = NameAndType        #40:#41        // _task:Ljava/util/concurrent/ScheduledFuture;
  #40 = Utf8               _task
  #41 = Utf8               Ljava/util/concurrent/ScheduledFuture;
  #42 = Fieldref           #8.#43         // ext/mods/gameserver/model/Announcement._unlimited:Z
  #43 = NameAndType        #44:#16        // _unlimited:Z
  #44 = Utf8               _unlimited
  #45 = Methodref          #33.#46        // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #46 = NameAndType        #47:#48        // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #47 = Utf8               schedule
  #48 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #49 = Fieldref           #8.#50         // ext/mods/gameserver/model/Announcement._tempLimit:I
  #50 = NameAndType        #51:#23        // _tempLimit:I
  #51 = Utf8               _tempLimit
  #52 = Methodref          #53.#54        // ext/mods/gameserver/model/World.announceToOnlinePlayers:(Ljava/lang/String;Z)V
  #53 = Class              #55            // ext/mods/gameserver/model/World
  #54 = NameAndType        #56:#57        // announceToOnlinePlayers:(Ljava/lang/String;Z)V
  #55 = Utf8               ext/mods/gameserver/model/World
  #56 = Utf8               announceToOnlinePlayers
  #57 = Utf8               (Ljava/lang/String;Z)V
  #58 = InterfaceMethodref #59.#60        // java/util/concurrent/ScheduledFuture.cancel:(Z)Z
  #59 = Class              #61            // java/util/concurrent/ScheduledFuture
  #60 = NameAndType        #62:#63        // cancel:(Z)Z
  #61 = Utf8               java/util/concurrent/ScheduledFuture
  #62 = Utf8               cancel
  #63 = Utf8               (Z)Z
  #64 = Methodref          #8.#65         // ext/mods/gameserver/model/Announcement.stopTask:()V
  #65 = NameAndType        #66:#6         // stopTask:()V
  #66 = Utf8               stopTask
  #67 = Class              #68            // java/lang/Runnable
  #68 = Utf8               java/lang/Runnable
  #69 = Utf8               Signature
  #70 = Utf8               Ljava/util/concurrent/ScheduledFuture<*>;
  #71 = Utf8               Code
  #72 = Utf8               LineNumberTable
  #73 = Utf8               LocalVariableTable
  #74 = Utf8               this
  #75 = Utf8               Lext/mods/gameserver/model/Announcement;
  #76 = Utf8               message
  #77 = Utf8               critical
  #78 = Utf8               (Ljava/lang/String;ZZIII)V
  #79 = Utf8               auto
  #80 = Utf8               initialDelay
  #81 = Utf8               delay
  #82 = Utf8               limit
  #83 = Utf8               StackMapTable
  #84 = Class              #85            // java/lang/String
  #85 = Utf8               java/lang/String
  #86 = Utf8               run
  #87 = Utf8               getMessage
  #88 = Utf8               ()Ljava/lang/String;
  #89 = Utf8               isCritical
  #90 = Utf8               ()Z
  #91 = Utf8               isAuto
  #92 = Utf8               getInitialDelay
  #93 = Utf8               ()I
  #94 = Utf8               getDelay
  #95 = Utf8               getLimit
  #96 = Utf8               reloadTask
  #97 = Utf8               SourceFile
  #98 = Utf8               Announcement.java
{
  protected final java.lang.String _message;
    descriptor: Ljava/lang/String;
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL

  protected boolean _critical;
    descriptor: Z
    flags: (0x0004) ACC_PROTECTED

  protected boolean _auto;
    descriptor: Z
    flags: (0x0004) ACC_PROTECTED

  protected boolean _unlimited;
    descriptor: Z
    flags: (0x0004) ACC_PROTECTED

  protected int _initialDelay;
    descriptor: I
    flags: (0x0004) ACC_PROTECTED

  protected int _delay;
    descriptor: I
    flags: (0x0004) ACC_PROTECTED

  protected int _limit;
    descriptor: I
    flags: (0x0004) ACC_PROTECTED

  protected int _tempLimit;
    descriptor: I
    flags: (0x0004) ACC_PROTECTED

  protected java.util.concurrent.ScheduledFuture<?> _task;
    descriptor: Ljava/util/concurrent/ScheduledFuture;
    flags: (0x0004) ACC_PROTECTED
    Signature: #70                          // Ljava/util/concurrent/ScheduledFuture<*>;

  public ext.mods.gameserver.model.Announcement(java.lang.String, boolean);
    descriptor: (Ljava/lang/String;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #7                  // Field _message:Ljava/lang/String;
         9: aload_0
        10: iload_2
        11: putfield      #13                 // Field _critical:Z
        14: return
      LineNumberTable:
        line 43: 0
        line 44: 4
        line 45: 9
        line 46: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/model/Announcement;
            0      15     1 message   Ljava/lang/String;
            0      15     2 critical   Z

  public ext.mods.gameserver.model.Announcement(java.lang.String, boolean, boolean, int, int, int);
    descriptor: (Ljava/lang/String;ZZIII)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=7, args_size=7
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #7                  // Field _message:Ljava/lang/String;
         9: aload_0
        10: iload_2
        11: putfield      #13                 // Field _critical:Z
        14: aload_0
        15: iload_3
        16: putfield      #17                 // Field _auto:Z
        19: aload_0
        20: iload         4
        22: putfield      #20                 // Field _initialDelay:I
        25: aload_0
        26: iload         5
        28: putfield      #24                 // Field _delay:I
        31: aload_0
        32: iload         6
        34: putfield      #27                 // Field _limit:I
        37: aload_0
        38: getfield      #17                 // Field _auto:Z
        41: ifeq          127
        44: aload_0
        45: getfield      #27                 // Field _limit:I
        48: lookupswitch  { // 1

                       0: 68
                 default: 102
            }
        68: aload_0
        69: aload_0
        70: aload_0
        71: getfield      #20                 // Field _initialDelay:I
        74: i2l
        75: ldc2_w        #30                 // long 1000l
        78: lmul
        79: aload_0
        80: getfield      #24                 // Field _delay:I
        83: i2l
        84: ldc2_w        #30                 // long 1000l
        87: lmul
        88: invokestatic  #32                 // Method ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
        91: putfield      #38                 // Field _task:Ljava/util/concurrent/ScheduledFuture;
        94: aload_0
        95: iconst_1
        96: putfield      #42                 // Field _unlimited:Z
        99: goto          127
       102: aload_0
       103: aload_0
       104: aload_0
       105: getfield      #20                 // Field _initialDelay:I
       108: i2l
       109: ldc2_w        #30                 // long 1000l
       112: lmul
       113: invokestatic  #45                 // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
       116: putfield      #38                 // Field _task:Ljava/util/concurrent/ScheduledFuture;
       119: aload_0
       120: aload_0
       121: getfield      #27                 // Field _limit:I
       124: putfield      #49                 // Field _tempLimit:I
       127: return
      LineNumberTable:
        line 49: 0
        line 50: 4
        line 51: 9
        line 52: 14
        line 53: 19
        line 54: 25
        line 55: 31
        line 57: 37
        line 59: 44
        line 62: 68
        line 63: 94
        line 64: 99
        line 67: 102
        line 68: 119
        line 72: 127
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     128     0  this   Lext/mods/gameserver/model/Announcement;
            0     128     1 message   Ljava/lang/String;
            0     128     2 critical   Z
            0     128     3  auto   Z
            0     128     4 initialDelay   I
            0     128     5 delay   I
            0     128     6 limit   I
      StackMapTable: number_of_entries = 3
        frame_type = 255 /* full_frame */
          offset_delta = 68
          locals = [ class ext/mods/gameserver/model/Announcement, class java/lang/String, int, int, int, int, int ]
          stack = []
        frame_type = 33 /* same */
        frame_type = 24 /* same */

  public void run();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: getfield      #42                 // Field _unlimited:Z
         4: ifne          42
         7: aload_0
         8: getfield      #49                 // Field _tempLimit:I
        11: ifne          15
        14: return
        15: aload_0
        16: aload_0
        17: aload_0
        18: getfield      #24                 // Field _delay:I
        21: i2l
        22: ldc2_w        #30                 // long 1000l
        25: lmul
        26: invokestatic  #45                 // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
        29: putfield      #38                 // Field _task:Ljava/util/concurrent/ScheduledFuture;
        32: aload_0
        33: dup
        34: getfield      #49                 // Field _tempLimit:I
        37: iconst_1
        38: isub
        39: putfield      #49                 // Field _tempLimit:I
        42: aload_0
        43: getfield      #7                  // Field _message:Ljava/lang/String;
        46: aload_0
        47: getfield      #13                 // Field _critical:Z
        50: invokestatic  #52                 // Method ext/mods/gameserver/model/World.announceToOnlinePlayers:(Ljava/lang/String;Z)V
        53: return
      LineNumberTable:
        line 77: 0
        line 79: 7
        line 80: 14
        line 82: 15
        line 83: 32
        line 85: 42
        line 86: 53
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      54     0  this   Lext/mods/gameserver/model/Announcement;
      StackMapTable: number_of_entries = 2
        frame_type = 15 /* same */
        frame_type = 26 /* same */

  public java.lang.String getMessage();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _message:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 90: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/Announcement;

  public boolean isCritical();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _critical:Z
         4: ireturn
      LineNumberTable:
        line 95: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/Announcement;

  public boolean isAuto();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field _auto:Z
         4: ireturn
      LineNumberTable:
        line 100: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/Announcement;

  public int getInitialDelay();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #20                 // Field _initialDelay:I
         4: ireturn
      LineNumberTable:
        line 105: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/Announcement;

  public int getDelay();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #24                 // Field _delay:I
         4: ireturn
      LineNumberTable:
        line 110: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/Announcement;

  public int getLimit();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #27                 // Field _limit:I
         4: ireturn
      LineNumberTable:
        line 115: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/Announcement;

  public void stopTask();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #38                 // Field _task:Ljava/util/concurrent/ScheduledFuture;
         4: ifnull        23
         7: aload_0
         8: getfield      #38                 // Field _task:Ljava/util/concurrent/ScheduledFuture;
        11: iconst_1
        12: invokeinterface #58,  2           // InterfaceMethod java/util/concurrent/ScheduledFuture.cancel:(Z)Z
        17: pop
        18: aload_0
        19: aconst_null
        20: putfield      #38                 // Field _task:Ljava/util/concurrent/ScheduledFuture;
        23: return
      LineNumberTable:
        line 120: 0
        line 122: 7
        line 123: 18
        line 125: 23
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/gameserver/model/Announcement;
      StackMapTable: number_of_entries = 1
        frame_type = 23 /* same */

  public void reloadTask();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #64                 // Method stopTask:()V
         4: aload_0
         5: getfield      #17                 // Field _auto:Z
         8: ifeq          91
        11: aload_0
        12: getfield      #27                 // Field _limit:I
        15: lookupswitch  { // 1

                       0: 32
                 default: 66
            }
        32: aload_0
        33: aload_0
        34: aload_0
        35: getfield      #20                 // Field _initialDelay:I
        38: i2l
        39: ldc2_w        #30                 // long 1000l
        42: lmul
        43: aload_0
        44: getfield      #24                 // Field _delay:I
        47: i2l
        48: ldc2_w        #30                 // long 1000l
        51: lmul
        52: invokestatic  #32                 // Method ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
        55: putfield      #38                 // Field _task:Ljava/util/concurrent/ScheduledFuture;
        58: aload_0
        59: iconst_1
        60: putfield      #42                 // Field _unlimited:Z
        63: goto          91
        66: aload_0
        67: aload_0
        68: aload_0
        69: getfield      #20                 // Field _initialDelay:I
        72: i2l
        73: ldc2_w        #30                 // long 1000l
        76: lmul
        77: invokestatic  #45                 // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
        80: putfield      #38                 // Field _task:Ljava/util/concurrent/ScheduledFuture;
        83: aload_0
        84: aload_0
        85: getfield      #27                 // Field _limit:I
        88: putfield      #49                 // Field _tempLimit:I
        91: return
      LineNumberTable:
        line 129: 0
        line 131: 4
        line 133: 11
        line 136: 32
        line 137: 58
        line 138: 63
        line 141: 66
        line 142: 83
        line 146: 91
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      92     0  this   Lext/mods/gameserver/model/Announcement;
      StackMapTable: number_of_entries = 3
        frame_type = 32 /* same */
        frame_type = 33 /* same */
        frame_type = 24 /* same */
}
SourceFile: "Announcement.java"
