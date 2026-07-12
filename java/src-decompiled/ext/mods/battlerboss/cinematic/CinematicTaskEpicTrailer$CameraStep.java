// Bytecode for: ext.mods.battlerboss.cinematic.CinematicTaskEpicTrailer$CameraStep
// File: ext\mods\battlerboss\cinematic\CinematicTaskEpicTrailer$CameraStep.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep.class
  Last modified 9 de jul de 2026; size 2158 bytes
  MD5 checksum 10dcdfc51acb9b6b529594b74d9eaed5
  Compiled from "CinematicTaskEpicTrailer.java"
final class ext.mods.battlerboss.cinematic.CinematicTaskEpicTrailer$CameraStep extends java.lang.Record
  minor version: 0
  major version: 69
  flags: (0x0030) ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep
  super_class: #2                         // java/lang/Record
  interfaces: 0, fields: 5, methods: 9, attributes: 5
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Record."<init>":()V
   #2 = Class              #4             // java/lang/Record
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Record
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep.dist:I
   #8 = Class              #10            // ext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep
   #9 = NameAndType        #11:#12        // dist:I
  #10 = Utf8               ext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep
  #11 = Utf8               dist
  #12 = Utf8               I
  #13 = Fieldref           #8.#14         // ext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep.yaw:I
  #14 = NameAndType        #15:#12        // yaw:I
  #15 = Utf8               yaw
  #16 = Fieldref           #8.#17         // ext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep.pitch:I
  #17 = NameAndType        #18:#12        // pitch:I
  #18 = Utf8               pitch
  #19 = Fieldref           #8.#20         // ext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep.time:I
  #20 = NameAndType        #21:#12        // time:I
  #21 = Utf8               time
  #22 = Fieldref           #8.#23         // ext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep.duration:I
  #23 = NameAndType        #24:#12        // duration:I
  #24 = Utf8               duration
  #25 = InvokeDynamic      #0:#26         // #0:toString:(Lext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep;)Ljava/lang/String;
  #26 = NameAndType        #27:#28        // toString:(Lext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep;)Ljava/lang/String;
  #27 = Utf8               toString
  #28 = Utf8               (Lext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep;)Ljava/lang/String;
  #29 = InvokeDynamic      #0:#30         // #0:hashCode:(Lext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep;)I
  #30 = NameAndType        #31:#32        // hashCode:(Lext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep;)I
  #31 = Utf8               hashCode
  #32 = Utf8               (Lext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep;)I
  #33 = InvokeDynamic      #0:#34         // #0:equals:(Lext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep;Ljava/lang/Object;)Z
  #34 = NameAndType        #35:#36        // equals:(Lext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep;Ljava/lang/Object;)Z
  #35 = Utf8               equals
  #36 = Utf8               (Lext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep;Ljava/lang/Object;)Z
  #37 = Utf8               (IIIII)V
  #38 = Utf8               Code
  #39 = Utf8               LineNumberTable
  #40 = Utf8               LocalVariableTable
  #41 = Utf8               this
  #42 = Utf8               Lext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep;
  #43 = Utf8               MethodParameters
  #44 = Utf8               ()Ljava/lang/String;
  #45 = Utf8               ()I
  #46 = Utf8               (Ljava/lang/Object;)Z
  #47 = Utf8               o
  #48 = Utf8               Ljava/lang/Object;
  #49 = Utf8               SourceFile
  #50 = Utf8               CinematicTaskEpicTrailer.java
  #51 = Utf8               NestHost
  #52 = Class              #53            // ext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer
  #53 = Utf8               ext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer
  #54 = Utf8               Record
  #55 = Utf8               BootstrapMethods
  #56 = String             #57            // dist;yaw;pitch;time;duration
  #57 = Utf8               dist;yaw;pitch;time;duration
  #58 = MethodHandle       1:#7           // REF_getField ext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep.dist:I
  #59 = MethodHandle       1:#13          // REF_getField ext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep.yaw:I
  #60 = MethodHandle       1:#16          // REF_getField ext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep.pitch:I
  #61 = MethodHandle       1:#19          // REF_getField ext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep.time:I
  #62 = MethodHandle       1:#22          // REF_getField ext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep.duration:I
  #63 = MethodHandle       6:#64          // REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #64 = Methodref          #65.#66        // java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #65 = Class              #67            // java/lang/runtime/ObjectMethods
  #66 = NameAndType        #68:#69        // bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #67 = Utf8               java/lang/runtime/ObjectMethods
  #68 = Utf8               bootstrap
  #69 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #70 = Utf8               InnerClasses
  #71 = Utf8               CameraStep
  #72 = Class              #73            // java/lang/invoke/MethodHandles$Lookup
  #73 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #74 = Class              #75            // java/lang/invoke/MethodHandles
  #75 = Utf8               java/lang/invoke/MethodHandles
  #76 = Utf8               Lookup
{
  public final java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #25,  0             // InvokeDynamic #0:toString:(Lext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep;)Ljava/lang/String;
         6: areturn
      LineNumberTable:
        line 29: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep;

  public final int hashCode();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #29,  0             // InvokeDynamic #0:hashCode:(Lext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep;)I
         6: ireturn
      LineNumberTable:
        line 29: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep;

  public final boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokedynamic #33,  0             // InvokeDynamic #0:equals:(Lext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep;Ljava/lang/Object;)Z
         7: ireturn
      LineNumberTable:
        line 29: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep;
            0       8     1     o   Ljava/lang/Object;

  public int dist();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field dist:I
         4: ireturn
      LineNumberTable:
        line 29: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep;

  public int yaw();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field yaw:I
         4: ireturn
      LineNumberTable:
        line 29: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep;

  public int pitch();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field pitch:I
         4: ireturn
      LineNumberTable:
        line 29: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep;

  public int time();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field time:I
         4: ireturn
      LineNumberTable:
        line 29: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep;

  public int duration();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field duration:I
         4: ireturn
      LineNumberTable:
        line 29: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep;
}
SourceFile: "CinematicTaskEpicTrailer.java"
NestHost: class ext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer
  Record: length = 0x20 (unknown attribute)
   00 05 00 0B 00 0C 00 00 00 0F 00 0C 00 00 00 12
   00 0C 00 00 00 15 00 0C 00 00 00 18 00 0C 00 00

BootstrapMethods:
  0: #63 REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
    Method arguments:
      #8 ext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep
      #56 dist;yaw;pitch;time;duration
      #58 REF_getField ext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep.dist:I
      #59 REF_getField ext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep.yaw:I
      #60 REF_getField ext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep.pitch:I
      #61 REF_getField ext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep.time:I
      #62 REF_getField ext/mods/battlerboss/cinematic/CinematicTaskEpicTrailer$CameraStep.duration:I
InnerClasses:
  public static final #76= #72 of #74;    // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
