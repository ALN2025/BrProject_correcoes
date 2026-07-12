// Bytecode for: ext.mods.commons.util.ArraysUtil
// File: ext\mods\commons\util\ArraysUtil.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/util/ArraysUtil.class
  Last modified 9 de jul de 2026; size 2894 bytes
  MD5 checksum c48669be6a5e240fbc259b40e8155672
  Compiled from "ArraysUtil.java"
public class ext.mods.commons.util.ArraysUtil
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #31                         // ext/mods/commons/util/ArraysUtil
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 1, methods: 8, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Class              #8             // java/lang/IllegalStateException
   #8 = Utf8               java/lang/IllegalStateException
   #9 = String             #10            // Utility class
  #10 = Utf8               Utility class
  #11 = Methodref          #7.#12         // java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
  #12 = NameAndType        #5:#13         // "<init>":(Ljava/lang/String;)V
  #13 = Utf8               (Ljava/lang/String;)V
  #14 = Methodref          #2.#15         // java/lang/Object.equals:(Ljava/lang/Object;)Z
  #15 = NameAndType        #16:#17        // equals:(Ljava/lang/Object;)Z
  #16 = Utf8               equals
  #17 = Utf8               (Ljava/lang/Object;)Z
  #18 = Methodref          #19.#20        // java/util/Arrays.copyOf:([Ljava/lang/Object;I)[Ljava/lang/Object;
  #19 = Class              #21            // java/util/Arrays
  #20 = NameAndType        #22:#23        // copyOf:([Ljava/lang/Object;I)[Ljava/lang/Object;
  #21 = Utf8               java/util/Arrays
  #22 = Utf8               copyOf
  #23 = Utf8               ([Ljava/lang/Object;I)[Ljava/lang/Object;
  #24 = Methodref          #25.#26        // java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
  #25 = Class              #27            // java/lang/System
  #26 = NameAndType        #28:#29        // arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
  #27 = Utf8               java/lang/System
  #28 = Utf8               arraycopy
  #29 = Utf8               (Ljava/lang/Object;ILjava/lang/Object;II)V
  #30 = Fieldref           #31.#32        // ext/mods/commons/util/ArraysUtil.EMPTY_INT_ARRAY:[I
  #31 = Class              #33            // ext/mods/commons/util/ArraysUtil
  #32 = NameAndType        #34:#35        // EMPTY_INT_ARRAY:[I
  #33 = Utf8               ext/mods/commons/util/ArraysUtil
  #34 = Utf8               EMPTY_INT_ARRAY
  #35 = Utf8               [I
  #36 = Utf8               Code
  #37 = Utf8               LineNumberTable
  #38 = Utf8               LocalVariableTable
  #39 = Utf8               this
  #40 = Utf8               Lext/mods/commons/util/ArraysUtil;
  #41 = Utf8               isEmpty
  #42 = Utf8               ([Ljava/lang/Object;)Z
  #43 = Utf8               array
  #44 = Utf8               [Ljava/lang/Object;
  #45 = Utf8               LocalVariableTypeTable
  #46 = Utf8               [TT;
  #47 = Utf8               StackMapTable
  #48 = Utf8               Signature
  #49 = Utf8               <T:Ljava/lang/Object;>([TT;)Z
  #50 = Utf8               contains
  #51 = Utf8               ([Ljava/lang/Object;Ljava/lang/Object;)Z
  #52 = Utf8               element
  #53 = Utf8               Ljava/lang/Object;
  #54 = Utf8               obj
  #55 = Utf8               TT;
  #56 = Class              #44            // "[Ljava/lang/Object;"
  #57 = Utf8               <T:Ljava/lang/Object;>([TT;TT;)Z
  #58 = Utf8               ([Ljava/lang/Object;[Ljava/lang/Object;)Z
  #59 = Utf8               element2
  #60 = Utf8               element1
  #61 = Utf8               array1
  #62 = Utf8               array2
  #63 = Utf8               <T:Ljava/lang/Object;>([TT;[TT;)Z
  #64 = Utf8               ([II)Z
  #65 = Utf8               I
  #66 = Class              #35            // "[I"
  #67 = Utf8               concat
  #68 = Utf8               ([Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;
  #69 = Utf8               first
  #70 = Utf8               second
  #71 = Utf8               result
  #72 = Utf8               <T:Ljava/lang/Object;>([TT;[TT;)[TT;
  #73 = Utf8               concatAll
  #74 = Utf8               ([Ljava/lang/Object;[[Ljava/lang/Object;)[Ljava/lang/Object;
  #75 = Utf8               rest
  #76 = Utf8               [[Ljava/lang/Object;
  #77 = Utf8               totalLength
  #78 = Utf8               offset
  #79 = Utf8               [[TT;
  #80 = Class              #76            // "[[Ljava/lang/Object;"
  #81 = Utf8               <T:Ljava/lang/Object;>([TT;[[TT;)[TT;
  #82 = Utf8               RuntimeVisibleAnnotations
  #83 = Utf8               Ljava/lang/SafeVarargs;
  #84 = Utf8               <clinit>
  #85 = Utf8               SourceFile
  #86 = Utf8               ArraysUtil.java
{
  public static final int[] EMPTY_INT_ARRAY;
    descriptor: [I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public static <T extends java.lang.Object> boolean isEmpty(T[]);
    descriptor: ([Ljava/lang/Object;)Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: ifnull        9
         4: aload_0
         5: arraylength
         6: ifne          13
         9: iconst_1
        10: goto          14
        13: iconst_0
        14: ireturn
      LineNumberTable:
        line 38: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0 array   [Ljava/lang/Object;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      15     0 array   [TT;
      StackMapTable: number_of_entries = 3
        frame_type = 9 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
    Signature: #49                          // <T:Ljava/lang/Object;>([TT;)Z

  public static <T extends java.lang.Object> boolean contains(T[], T);
    descriptor: ([Ljava/lang/Object;Ljava/lang/Object;)Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=6, args_size=2
         0: aload_0
         1: ifnull        9
         4: aload_0
         5: arraylength
         6: ifne          11
         9: iconst_0
        10: ireturn
        11: aload_0
        12: astore_2
        13: aload_2
        14: arraylength
        15: istore_3
        16: iconst_0
        17: istore        4
        19: iload         4
        21: iload_3
        22: if_icmpge     48
        25: aload_2
        26: iload         4
        28: aaload
        29: astore        5
        31: aload         5
        33: aload_1
        34: invokevirtual #14                 // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
        37: ifeq          42
        40: iconst_1
        41: ireturn
        42: iinc          4, 1
        45: goto          19
        48: iconst_0
        49: ireturn
      LineNumberTable:
        line 49: 0
        line 50: 9
        line 52: 11
        line 53: 31
        line 54: 40
        line 52: 42
        line 56: 48
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           31      11     5 element   Ljava/lang/Object;
            0      50     0 array   [Ljava/lang/Object;
            0      50     1   obj   Ljava/lang/Object;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           31      11     5 element   TT;
            0      50     0 array   [TT;
            0      50     1   obj   TT;
      StackMapTable: number_of_entries = 5
        frame_type = 9 /* same */
        frame_type = 1 /* same */
        frame_type = 254 /* append */
          offset_delta = 7
          locals = [ class "[Ljava/lang/Object;", int, int ]
        frame_type = 22 /* same */
        frame_type = 248 /* chop */
          offset_delta = 5
    Signature: #57                          // <T:Ljava/lang/Object;>([TT;TT;)Z

  public static <T extends java.lang.Object> boolean contains(T[], T[]);
    descriptor: ([Ljava/lang/Object;[Ljava/lang/Object;)Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=10, args_size=2
         0: aload_0
         1: ifnull        9
         4: aload_0
         5: arraylength
         6: ifne          11
         9: iconst_0
        10: ireturn
        11: aload_1
        12: ifnull        20
        15: aload_1
        16: arraylength
        17: ifne          22
        20: iconst_0
        21: ireturn
        22: aload_0
        23: astore_2
        24: aload_2
        25: arraylength
        26: istore_3
        27: iconst_0
        28: istore        4
        30: iload         4
        32: iload_3
        33: if_icmpge     91
        36: aload_2
        37: iload         4
        39: aaload
        40: astore        5
        42: aload_1
        43: astore        6
        45: aload         6
        47: arraylength
        48: istore        7
        50: iconst_0
        51: istore        8
        53: iload         8
        55: iload         7
        57: if_icmpge     85
        60: aload         6
        62: iload         8
        64: aaload
        65: astore        9
        67: aload         9
        69: aload         5
        71: invokevirtual #14                 // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
        74: ifeq          79
        77: iconst_1
        78: ireturn
        79: iinc          8, 1
        82: goto          53
        85: iinc          4, 1
        88: goto          30
        91: iconst_0
        92: ireturn
      LineNumberTable:
        line 67: 0
        line 68: 9
        line 70: 11
        line 71: 20
        line 73: 22
        line 75: 42
        line 76: 67
        line 77: 77
        line 75: 79
        line 73: 85
        line 79: 91
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           67      12     9 element2   Ljava/lang/Object;
           42      43     5 element1   Ljava/lang/Object;
            0      93     0 array1   [Ljava/lang/Object;
            0      93     1 array2   [Ljava/lang/Object;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           67      12     9 element2   TT;
           42      43     5 element1   TT;
            0      93     0 array1   [TT;
            0      93     1 array2   [TT;
      StackMapTable: number_of_entries = 9
        frame_type = 9 /* same */
        frame_type = 1 /* same */
        frame_type = 8 /* same */
        frame_type = 1 /* same */
        frame_type = 254 /* append */
          offset_delta = 7
          locals = [ class "[Ljava/lang/Object;", int, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 22
          locals = [ class "[Ljava/lang/Object;", class "[Ljava/lang/Object;", class "[Ljava/lang/Object;", int, int, class java/lang/Object, class "[Ljava/lang/Object;", int, int ]
          stack = []
        frame_type = 25 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 5
          locals = [ class "[Ljava/lang/Object;", class "[Ljava/lang/Object;", class "[Ljava/lang/Object;", int, int ]
          stack = []
        frame_type = 248 /* chop */
          offset_delta = 5
    Signature: #63                          // <T:Ljava/lang/Object;>([TT;[TT;)Z

  public static boolean contains(int[], int);
    descriptor: ([II)Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=6, args_size=2
         0: aload_0
         1: ifnull        9
         4: aload_0
         5: arraylength
         6: ifne          11
         9: iconst_0
        10: ireturn
        11: aload_0
        12: astore_2
        13: aload_2
        14: arraylength
        15: istore_3
        16: iconst_0
        17: istore        4
        19: iload         4
        21: iload_3
        22: if_icmpge     45
        25: aload_2
        26: iload         4
        28: iaload
        29: istore        5
        31: iload         5
        33: iload_1
        34: if_icmpne     39
        37: iconst_1
        38: ireturn
        39: iinc          4, 1
        42: goto          19
        45: iconst_0
        46: ireturn
      LineNumberTable:
        line 89: 0
        line 90: 9
        line 92: 11
        line 93: 31
        line 94: 37
        line 92: 39
        line 96: 45
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           31       8     5 element   I
            0      47     0 array   [I
            0      47     1   obj   I
      StackMapTable: number_of_entries = 5
        frame_type = 9 /* same */
        frame_type = 1 /* same */
        frame_type = 254 /* append */
          offset_delta = 7
          locals = [ class "[I", int, int ]
        frame_type = 19 /* same */
        frame_type = 248 /* chop */
          offset_delta = 5

  public static <T extends java.lang.Object> T[] concat(T[], T[]);
    descriptor: ([Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=5, locals=3, args_size=2
         0: aload_0
         1: aload_0
         2: arraylength
         3: aload_1
         4: arraylength
         5: iadd
         6: invokestatic  #18                 // Method java/util/Arrays.copyOf:([Ljava/lang/Object;I)[Ljava/lang/Object;
         9: astore_2
        10: aload_1
        11: iconst_0
        12: aload_2
        13: aload_0
        14: arraylength
        15: aload_1
        16: arraylength
        17: invokestatic  #24                 // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        20: aload_2
        21: areturn
      LineNumberTable:
        line 108: 0
        line 109: 10
        line 110: 20
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0 first   [Ljava/lang/Object;
            0      22     1 second   [Ljava/lang/Object;
           10      12     2 result   [Ljava/lang/Object;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      22     0 first   [TT;
            0      22     1 second   [TT;
           10      12     2 result   [TT;
    Signature: #72                          // <T:Ljava/lang/Object;>([TT;[TT;)[TT;

  public static <T extends java.lang.Object> T[] concatAll(T[], T[]...);
    descriptor: ([Ljava/lang/Object;[[Ljava/lang/Object;)[Ljava/lang/Object;
    flags: (0x0089) ACC_PUBLIC, ACC_STATIC, ACC_VARARGS
    Code:
      stack=5, locals=9, args_size=2
         0: aload_0
         1: arraylength
         2: istore_2
         3: aload_1
         4: astore_3
         5: aload_3
         6: arraylength
         7: istore        4
         9: iconst_0
        10: istore        5
        12: iload         5
        14: iload         4
        16: if_icmpge     37
        19: aload_3
        20: iload         5
        22: aaload
        23: astore        6
        25: iload_2
        26: aload         6
        28: arraylength
        29: iadd
        30: istore_2
        31: iinc          5, 1
        34: goto          12
        37: aload_0
        38: iload_2
        39: invokestatic  #18                 // Method java/util/Arrays.copyOf:([Ljava/lang/Object;I)[Ljava/lang/Object;
        42: astore_3
        43: aload_0
        44: arraylength
        45: istore        4
        47: aload_1
        48: astore        5
        50: aload         5
        52: arraylength
        53: istore        6
        55: iconst_0
        56: istore        7
        58: iload         7
        60: iload         6
        62: if_icmpge     98
        65: aload         5
        67: iload         7
        69: aaload
        70: astore        8
        72: aload         8
        74: iconst_0
        75: aload_3
        76: iload         4
        78: aload         8
        80: arraylength
        81: invokestatic  #24                 // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        84: iload         4
        86: aload         8
        88: arraylength
        89: iadd
        90: istore        4
        92: iinc          7, 1
        95: goto          58
        98: aload_3
        99: areturn
      LineNumberTable:
        line 123: 0
        line 124: 3
        line 125: 25
        line 124: 31
        line 127: 37
        line 128: 43
        line 129: 47
        line 131: 72
        line 132: 84
        line 129: 92
        line 134: 98
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           25       6     6 array   [Ljava/lang/Object;
           72      20     8 array   [Ljava/lang/Object;
            0     100     0 first   [Ljava/lang/Object;
            0     100     1  rest   [[Ljava/lang/Object;
            3      97     2 totalLength   I
           43      57     3 result   [Ljava/lang/Object;
           47      53     4 offset   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           25       6     6 array   [TT;
           72      20     8 array   [TT;
            0     100     0 first   [TT;
            0     100     1  rest   [[TT;
           43      57     3 result   [TT;
      StackMapTable: number_of_entries = 4
        frame_type = 255 /* full_frame */
          offset_delta = 12
          locals = [ class "[Ljava/lang/Object;", class "[[Ljava/lang/Object;", int, class "[[Ljava/lang/Object;", int, int ]
          stack = []
        frame_type = 248 /* chop */
          offset_delta = 24
        frame_type = 255 /* full_frame */
          offset_delta = 20
          locals = [ class "[Ljava/lang/Object;", class "[[Ljava/lang/Object;", int, class "[Ljava/lang/Object;", int, class "[[Ljava/lang/Object;", int, int ]
          stack = []
        frame_type = 248 /* chop */
          offset_delta = 39
    Signature: #81                          // <T:Ljava/lang/Object;>([TT;[[TT;)[TT;
    RuntimeVisibleAnnotations:
      0: #83()
        java.lang.SafeVarargs

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: iconst_0
         1: newarray       int
         3: putstatic     #30                 // Field EMPTY_INT_ARRAY:[I
         6: return
      LineNumberTable:
        line 29: 0
}
SourceFile: "ArraysUtil.java"
