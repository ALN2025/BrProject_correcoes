// Bytecode for: ext.mods.commons.util.LinTime
// File: ext\mods\commons\util\LinTime.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/util/LinTime.class
  Last modified 9 de jul de 2026; size 1075 bytes
  MD5 checksum 49691e272c1c8f3217a3173eaa372164
  Compiled from "LinTime.java"
public class ext.mods.commons.util.LinTime
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/commons/util/LinTime
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 1, methods: 7, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/commons/util/LinTime.dt:J
   #8 = Class              #10            // ext/mods/commons/util/LinTime
   #9 = NameAndType        #11:#12        // dt:J
  #10 = Utf8               ext/mods/commons/util/LinTime
  #11 = Utf8               dt
  #12 = Utf8               J
  #13 = Methodref          #14.#15        // java/lang/System.currentTimeMillis:()J
  #14 = Class              #16            // java/lang/System
  #15 = NameAndType        #17:#18        // currentTimeMillis:()J
  #16 = Utf8               java/lang/System
  #17 = Utf8               currentTimeMillis
  #18 = Utf8               ()J
  #19 = Methodref          #20.#21        // ext/mods/gameserver/taskmanager/GameTimeTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/GameTimeTaskManager;
  #20 = Class              #22            // ext/mods/gameserver/taskmanager/GameTimeTaskManager
  #21 = NameAndType        #23:#24        // getInstance:()Lext/mods/gameserver/taskmanager/GameTimeTaskManager;
  #22 = Utf8               ext/mods/gameserver/taskmanager/GameTimeTaskManager
  #23 = Utf8               getInstance
  #24 = Utf8               ()Lext/mods/gameserver/taskmanager/GameTimeTaskManager;
  #25 = Methodref          #20.#26        // ext/mods/gameserver/taskmanager/GameTimeTaskManager.getCurrentTick:()I
  #26 = NameAndType        #27:#28        // getCurrentTick:()I
  #27 = Utf8               getCurrentTick
  #28 = Utf8               ()I
  #29 = Fieldref           #30.#31        // java/util/concurrent/TimeUnit.MILLISECONDS:Ljava/util/concurrent/TimeUnit;
  #30 = Class              #32            // java/util/concurrent/TimeUnit
  #31 = NameAndType        #33:#34        // MILLISECONDS:Ljava/util/concurrent/TimeUnit;
  #32 = Utf8               java/util/concurrent/TimeUnit
  #33 = Utf8               MILLISECONDS
  #34 = Utf8               Ljava/util/concurrent/TimeUnit;
  #35 = Methodref          #30.#36        // java/util/concurrent/TimeUnit.toSeconds:(J)J
  #36 = NameAndType        #37:#38        // toSeconds:(J)J
  #37 = Utf8               toSeconds
  #38 = Utf8               (J)J
  #39 = Utf8               Code
  #40 = Utf8               LineNumberTable
  #41 = Utf8               LocalVariableTable
  #42 = Utf8               this
  #43 = Utf8               Lext/mods/commons/util/LinTime;
  #44 = Utf8               resetDeltaTime
  #45 = Utf8               setDeltaTime
  #46 = Utf8               (J)V
  #47 = Utf8               addDeltaTime
  #48 = Utf8               deltaTime
  #49 = Utf8               elapsedTime
  #50 = Utf8               SourceFile
  #51 = Utf8               LinTime.java
{
  public ext.mods.commons.util.LinTime();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 24: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/util/LinTime;

  public static void resetDeltaTime();
    descriptor: ()V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: lconst_0
         1: putstatic     #7                  // Field dt:J
         4: return
      LineNumberTable:
        line 30: 0
        line 31: 4

  public static void setDeltaTime(long);
    descriptor: (J)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=2, args_size=1
         0: lload_0
         1: putstatic     #7                  // Field dt:J
         4: return
      LineNumberTable:
        line 35: 0
        line 36: 4
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0    dt   J

  public static void addDeltaTime(long);
    descriptor: (J)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=4, locals=2, args_size=1
         0: getstatic     #7                  // Field dt:J
         3: lload_0
         4: ladd
         5: putstatic     #7                  // Field dt:J
         8: return
      LineNumberTable:
        line 40: 0
        line 41: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0    dt   J

  public static long deltaTime();
    descriptor: ()J
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: getstatic     #7                  // Field dt:J
         3: lreturn
      LineNumberTable:
        line 45: 0

  public static long currentTimeMillis();
    descriptor: ()J
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: invokestatic  #13                 // Method java/lang/System.currentTimeMillis:()J
         3: getstatic     #7                  // Field dt:J
         6: ladd
         7: lreturn
      LineNumberTable:
        line 50: 0

  public static long elapsedTime();
    descriptor: ()J
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=5, locals=0, args_size=0
         0: invokestatic  #19                 // Method ext/mods/gameserver/taskmanager/GameTimeTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/GameTimeTaskManager;
         3: invokevirtual #25                 // Method ext/mods/gameserver/taskmanager/GameTimeTaskManager.getCurrentTick:()I
         6: i2l
         7: getstatic     #29                 // Field java/util/concurrent/TimeUnit.MILLISECONDS:Ljava/util/concurrent/TimeUnit;
        10: getstatic     #7                  // Field dt:J
        13: invokevirtual #35                 // Method java/util/concurrent/TimeUnit.toSeconds:(J)J
        16: ladd
        17: lreturn
      LineNumberTable:
        line 55: 0
}
SourceFile: "LinTime.java"
