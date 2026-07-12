// Bytecode for: ext.mods.commons.random.Rnd
// File: ext\mods\commons\random\Rnd.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/random/Rnd.class
  Last modified 9 de jul de 2026; size 2745 bytes
  MD5 checksum 2910300f8943ddaeb472cc6779994b0a
  Compiled from "Rnd.java"
public final class ext.mods.commons.random.Rnd
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #28                         // ext/mods/commons/random/Rnd
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 20, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/lang/IllegalStateException
    #8 = Utf8               java/lang/IllegalStateException
    #9 = String             #10           // Utility class
   #10 = Utf8               Utility class
   #11 = Methodref          #7.#12        // java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
   #12 = NameAndType        #5:#13        // "<init>":(Ljava/lang/String;)V
   #13 = Utf8               (Ljava/lang/String;)V
   #14 = Methodref          #15.#16       // java/util/concurrent/ThreadLocalRandom.current:()Ljava/util/concurrent/ThreadLocalRandom;
   #15 = Class              #17           // java/util/concurrent/ThreadLocalRandom
   #16 = NameAndType        #18:#19       // current:()Ljava/util/concurrent/ThreadLocalRandom;
   #17 = Utf8               java/util/concurrent/ThreadLocalRandom
   #18 = Utf8               current
   #19 = Utf8               ()Ljava/util/concurrent/ThreadLocalRandom;
   #20 = Methodref          #15.#21       // java/util/concurrent/ThreadLocalRandom.nextDouble:(D)D
   #21 = NameAndType        #22:#23       // nextDouble:(D)D
   #22 = Utf8               nextDouble
   #23 = Utf8               (D)D
   #24 = Methodref          #15.#25       // java/util/concurrent/ThreadLocalRandom.nextDouble:()D
   #25 = NameAndType        #22:#26       // nextDouble:()D
   #26 = Utf8               ()D
   #27 = Methodref          #28.#21       // ext/mods/commons/random/Rnd.nextDouble:(D)D
   #28 = Class              #29           // ext/mods/commons/random/Rnd
   #29 = Utf8               ext/mods/commons/random/Rnd
   #30 = Methodref          #15.#31       // java/util/concurrent/ThreadLocalRandom.nextInt:(I)I
   #31 = NameAndType        #32:#33       // nextInt:(I)I
   #32 = Utf8               nextInt
   #33 = Utf8               (I)I
   #34 = Methodref          #15.#35       // java/util/concurrent/ThreadLocalRandom.nextInt:()I
   #35 = NameAndType        #32:#36       // nextInt:()I
   #36 = Utf8               ()I
   #37 = Methodref          #28.#31       // ext/mods/commons/random/Rnd.nextInt:(I)I
   #38 = Class              #39           // java/lang/Integer
   #39 = Utf8               java/lang/Integer
   #40 = Integer            2147483647
   #41 = Methodref          #15.#42       // java/util/concurrent/ThreadLocalRandom.nextInt:(II)I
   #42 = NameAndType        #32:#43       // nextInt:(II)I
   #43 = Utf8               (II)I
   #44 = Methodref          #15.#45       // java/util/concurrent/ThreadLocalRandom.nextLong:(J)J
   #45 = NameAndType        #46:#47       // nextLong:(J)J
   #46 = Utf8               nextLong
   #47 = Utf8               (J)J
   #48 = Methodref          #15.#49       // java/util/concurrent/ThreadLocalRandom.nextLong:()J
   #49 = NameAndType        #46:#50       // nextLong:()J
   #50 = Utf8               ()J
   #51 = Methodref          #28.#45       // ext/mods/commons/random/Rnd.nextLong:(J)J
   #52 = Class              #53           // java/lang/Long
   #53 = Utf8               java/lang/Long
   #54 = Long               9223372036854775807l
   #56 = Methodref          #15.#57       // java/util/concurrent/ThreadLocalRandom.nextLong:(JJ)J
   #57 = NameAndType        #46:#58       // nextLong:(JJ)J
   #58 = Utf8               (JJ)J
   #59 = Methodref          #15.#60       // java/util/concurrent/ThreadLocalRandom.nextGaussian:()D
   #60 = NameAndType        #61:#26       // nextGaussian:()D
   #61 = Utf8               nextGaussian
   #62 = Methodref          #15.#63       // java/util/concurrent/ThreadLocalRandom.nextBoolean:()Z
   #63 = NameAndType        #64:#65       // nextBoolean:()Z
   #64 = Utf8               nextBoolean
   #65 = Utf8               ()Z
   #66 = Methodref          #28.#67       // ext/mods/commons/random/Rnd.nextBytes:([B)[B
   #67 = NameAndType        #68:#69       // nextBytes:([B)[B
   #68 = Utf8               nextBytes
   #69 = Utf8               ([B)[B
   #70 = Methodref          #15.#71       // java/util/concurrent/ThreadLocalRandom.nextBytes:([B)V
   #71 = NameAndType        #68:#72       // nextBytes:([B)V
   #72 = Utf8               ([B)V
   #73 = InterfaceMethodref #74.#75       // java/util/List.isEmpty:()Z
   #74 = Class              #76           // java/util/List
   #75 = NameAndType        #77:#65       // isEmpty:()Z
   #76 = Utf8               java/util/List
   #77 = Utf8               isEmpty
   #78 = InterfaceMethodref #74.#79       // java/util/List.size:()I
   #79 = NameAndType        #80:#36       // size:()I
   #80 = Utf8               size
   #81 = Methodref          #28.#82       // ext/mods/commons/random/Rnd.get:(I)I
   #82 = NameAndType        #83:#33       // get:(I)I
   #83 = Utf8               get
   #84 = InterfaceMethodref #74.#85       // java/util/List.get:(I)Ljava/lang/Object;
   #85 = NameAndType        #83:#86       // get:(I)Ljava/lang/Object;
   #86 = Utf8               (I)Ljava/lang/Object;
   #87 = Utf8               Code
   #88 = Utf8               LineNumberTable
   #89 = Utf8               LocalVariableTable
   #90 = Utf8               this
   #91 = Utf8               Lext/mods/commons/random/Rnd;
   #92 = Utf8               n
   #93 = Utf8               D
   #94 = Utf8               I
   #95 = Utf8               StackMapTable
   #96 = Utf8               min
   #97 = Utf8               max
   #98 = Utf8               J
   #99 = Utf8               calcChance
  #100 = Utf8               (DI)Z
  #101 = Utf8               applicableUnits
  #102 = Utf8               totalUnits
  #103 = Utf8               (I)[B
  #104 = Utf8               count
  #105 = Utf8               array
  #106 = Utf8               [B
  #107 = Utf8               (Ljava/util/List;)Ljava/lang/Object;
  #108 = Utf8               list
  #109 = Utf8               Ljava/util/List;
  #110 = Utf8               LocalVariableTypeTable
  #111 = Utf8               Ljava/util/List<TT;>;
  #112 = Utf8               Signature
  #113 = Utf8               <T:Ljava/lang/Object;>(Ljava/util/List<TT;>;)TT;
  #114 = Utf8               ([I)I
  #115 = Utf8               [I
  #116 = Utf8               ([Ljava/lang/Object;)Ljava/lang/Object;
  #117 = Utf8               [Ljava/lang/Object;
  #118 = Utf8               [TT;
  #119 = Utf8               <T:Ljava/lang/Object;>([TT;)TT;
  #120 = Utf8               SourceFile
  #121 = Utf8               Rnd.java
{
  public static double nextDouble(double);
    descriptor: (D)D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=3, locals=2, args_size=1
         0: invokestatic  #14                 // Method java/util/concurrent/ThreadLocalRandom.current:()Ljava/util/concurrent/ThreadLocalRandom;
         3: dload_0
         4: invokevirtual #20                 // Method java/util/concurrent/ThreadLocalRandom.nextDouble:(D)D
         7: dreturn
      LineNumberTable:
        line 35: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0     n   D

  public static double nextDouble();
    descriptor: ()D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: invokestatic  #14                 // Method java/util/concurrent/ThreadLocalRandom.current:()Ljava/util/concurrent/ThreadLocalRandom;
         3: invokevirtual #24                 // Method java/util/concurrent/ThreadLocalRandom.nextDouble:()D
         6: dreturn
      LineNumberTable:
        line 40: 0

  public static double get(double);
    descriptor: (D)D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=2, args_size=1
         0: dload_0
         1: invokestatic  #27                 // Method nextDouble:(D)D
         4: dreturn
      LineNumberTable:
        line 45: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0     n   D

  public static int nextInt(int);
    descriptor: (I)I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: iload_0
         1: ifne          6
         4: iconst_0
         5: ireturn
         6: invokestatic  #14                 // Method java/util/concurrent/ThreadLocalRandom.current:()Ljava/util/concurrent/ThreadLocalRandom;
         9: iload_0
        10: invokevirtual #30                 // Method java/util/concurrent/ThreadLocalRandom.nextInt:(I)I
        13: ireturn
      LineNumberTable:
        line 50: 0
        line 51: 4
        line 53: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0     n   I
      StackMapTable: number_of_entries = 1
        frame_type = 6 /* same */

  public static int nextInt();
    descriptor: ()I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: invokestatic  #14                 // Method java/util/concurrent/ThreadLocalRandom.current:()Ljava/util/concurrent/ThreadLocalRandom;
         3: invokevirtual #34                 // Method java/util/concurrent/ThreadLocalRandom.nextInt:()I
         6: ireturn
      LineNumberTable:
        line 58: 0

  public static int get(int);
    descriptor: (I)I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=1, args_size=1
         0: iload_0
         1: invokestatic  #37                 // Method nextInt:(I)I
         4: ireturn
      LineNumberTable:
        line 63: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0     n   I

  public static int get(int, int);
    descriptor: (II)I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=4, locals=2, args_size=2
         0: invokestatic  #14                 // Method java/util/concurrent/ThreadLocalRandom.current:()Ljava/util/concurrent/ThreadLocalRandom;
         3: iload_0
         4: iload_1
         5: ldc           #40                 // int 2147483647
         7: if_icmpne     14
        10: iload_1
        11: goto          17
        14: iload_1
        15: iconst_1
        16: iadd
        17: invokevirtual #41                 // Method java/util/concurrent/ThreadLocalRandom.nextInt:(II)I
        20: ireturn
      LineNumberTable:
        line 68: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0   min   I
            0      21     1   max   I
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ int, int ]
          stack = [ class java/util/concurrent/ThreadLocalRandom, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ int, int ]
          stack = [ class java/util/concurrent/ThreadLocalRandom, int, int ]

  public static long nextLong(long);
    descriptor: (J)J
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=3, locals=2, args_size=1
         0: invokestatic  #14                 // Method java/util/concurrent/ThreadLocalRandom.current:()Ljava/util/concurrent/ThreadLocalRandom;
         3: lload_0
         4: invokevirtual #44                 // Method java/util/concurrent/ThreadLocalRandom.nextLong:(J)J
         7: lreturn
      LineNumberTable:
        line 73: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0     n   J

  public static long nextLong();
    descriptor: ()J
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: invokestatic  #14                 // Method java/util/concurrent/ThreadLocalRandom.current:()Ljava/util/concurrent/ThreadLocalRandom;
         3: invokevirtual #48                 // Method java/util/concurrent/ThreadLocalRandom.nextLong:()J
         6: lreturn
      LineNumberTable:
        line 78: 0

  public static long get(long);
    descriptor: (J)J
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=2, args_size=1
         0: lload_0
         1: invokestatic  #51                 // Method nextLong:(J)J
         4: lreturn
      LineNumberTable:
        line 83: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0     n   J

  public static long get(long, long);
    descriptor: (JJ)J
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=7, locals=4, args_size=2
         0: invokestatic  #14                 // Method java/util/concurrent/ThreadLocalRandom.current:()Ljava/util/concurrent/ThreadLocalRandom;
         3: lload_0
         4: lload_2
         5: ldc2_w        #54                 // long 9223372036854775807l
         8: lcmp
         9: ifne          16
        12: lload_2
        13: goto          19
        16: lload_2
        17: lconst_1
        18: ladd
        19: invokevirtual #56                 // Method java/util/concurrent/ThreadLocalRandom.nextLong:(JJ)J
        22: lreturn
      LineNumberTable:
        line 88: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0   min   J
            0      23     2   max   J
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ long, long ]
          stack = [ class java/util/concurrent/ThreadLocalRandom, long ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ long, long ]
          stack = [ class java/util/concurrent/ThreadLocalRandom, long, long ]

  public static boolean calcChance(double, int);
    descriptor: (DI)Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=4, locals=3, args_size=2
         0: dload_0
         1: iload_2
         2: invokestatic  #37                 // Method nextInt:(I)I
         5: i2d
         6: dcmpl
         7: ifle          14
        10: iconst_1
        11: goto          15
        14: iconst_0
        15: ireturn
      LineNumberTable:
        line 93: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0 applicableUnits   D
            0      16     2 totalUnits   I
      StackMapTable: number_of_entries = 2
        frame_type = 14 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public static double nextGaussian();
    descriptor: ()D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: invokestatic  #14                 // Method java/util/concurrent/ThreadLocalRandom.current:()Ljava/util/concurrent/ThreadLocalRandom;
         3: invokevirtual #59                 // Method java/util/concurrent/ThreadLocalRandom.nextGaussian:()D
         6: dreturn
      LineNumberTable:
        line 98: 0

  public static boolean nextBoolean();
    descriptor: ()Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: invokestatic  #14                 // Method java/util/concurrent/ThreadLocalRandom.current:()Ljava/util/concurrent/ThreadLocalRandom;
         3: invokevirtual #62                 // Method java/util/concurrent/ThreadLocalRandom.nextBoolean:()Z
         6: ireturn
      LineNumberTable:
        line 103: 0

  public static byte[] nextBytes(int);
    descriptor: (I)[B
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=1, args_size=1
         0: iload_0
         1: newarray       byte
         3: invokestatic  #66                 // Method nextBytes:([B)[B
         6: areturn
      LineNumberTable:
        line 108: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0 count   I

  public static byte[] nextBytes(byte[]);
    descriptor: ([B)[B
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: invokestatic  #14                 // Method java/util/concurrent/ThreadLocalRandom.current:()Ljava/util/concurrent/ThreadLocalRandom;
         3: aload_0
         4: invokevirtual #70                 // Method java/util/concurrent/ThreadLocalRandom.nextBytes:([B)V
         7: aload_0
         8: areturn
      LineNumberTable:
        line 113: 0
        line 114: 7
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0 array   [B

  public static final <T extends java.lang.Object> T get(java.util.List<T>);
    descriptor: (Ljava/util/List;)Ljava/lang/Object;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: ifnull        13
         4: aload_0
         5: invokeinterface #73,  1           // InterfaceMethod java/util/List.isEmpty:()Z
        10: ifeq          15
        13: aconst_null
        14: areturn
        15: aload_0
        16: aload_0
        17: invokeinterface #78,  1           // InterfaceMethod java/util/List.size:()I
        22: invokestatic  #81                 // Method get:(I)I
        25: invokeinterface #84,  2           // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
        30: areturn
      LineNumberTable:
        line 125: 0
        line 126: 13
        line 128: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  list   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      31     0  list   Ljava/util/List<TT;>;
      StackMapTable: number_of_entries = 2
        frame_type = 13 /* same */
        frame_type = 1 /* same */
    Signature: #113                         // <T:Ljava/lang/Object;>(Ljava/util/List<TT;>;)TT;

  public static final int get(int[]);
    descriptor: ([I)I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: aload_0
         2: arraylength
         3: invokestatic  #81                 // Method get:(I)I
         6: iaload
         7: ireturn
      LineNumberTable:
        line 138: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0 array   [I

  public static final <T extends java.lang.Object> T get(T[]);
    descriptor: ([Ljava/lang/Object;)Ljava/lang/Object;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: aload_0
         2: arraylength
         3: invokestatic  #81                 // Method get:(I)I
         6: aaload
         7: areturn
      LineNumberTable:
        line 149: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0 array   [Ljava/lang/Object;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       8     0 array   [TT;
    Signature: #119                         // <T:Ljava/lang/Object;>([TT;)TT;
}
SourceFile: "Rnd.java"
