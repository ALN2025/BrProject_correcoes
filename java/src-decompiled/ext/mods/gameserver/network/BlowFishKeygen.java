// Bytecode for: ext.mods.gameserver.network.BlowFishKeygen
// File: ext\mods\gameserver\network\BlowFishKeygen.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/network/BlowFishKeygen.class
  Last modified 9 de jul de 2026; size 928 bytes
  MD5 checksum 021a3ab2c88283c073c88e2308625ebb
  Compiled from "BlowFishKeygen.java"
public class ext.mods.gameserver.network.BlowFishKeygen
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/network/BlowFishKeygen
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 2, methods: 3, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/network/BlowFishKeygen.CRYPT_KEYS:[[B
   #8 = Class              #10            // ext/mods/gameserver/network/BlowFishKeygen
   #9 = NameAndType        #11:#12        // CRYPT_KEYS:[[B
  #10 = Utf8               ext/mods/gameserver/network/BlowFishKeygen
  #11 = Utf8               CRYPT_KEYS
  #12 = Utf8               [[B
  #13 = Methodref          #14.#15        // ext/mods/commons/random/Rnd.get:([Ljava/lang/Object;)Ljava/lang/Object;
  #14 = Class              #16            // ext/mods/commons/random/Rnd
  #15 = NameAndType        #17:#18        // get:([Ljava/lang/Object;)Ljava/lang/Object;
  #16 = Utf8               ext/mods/commons/random/Rnd
  #17 = Utf8               get
  #18 = Utf8               ([Ljava/lang/Object;)Ljava/lang/Object;
  #19 = Class              #20            // "[B"
  #20 = Utf8               [B
  #21 = Class              #12            // "[[B"
  #22 = Methodref          #14.#23        // ext/mods/commons/random/Rnd.get:(I)I
  #23 = NameAndType        #17:#24        // get:(I)I
  #24 = Utf8               (I)I
  #25 = Utf8               CRYPT_KEYS_SIZE
  #26 = Utf8               I
  #27 = Utf8               ConstantValue
  #28 = Integer            20
  #29 = Utf8               Code
  #30 = Utf8               LineNumberTable
  #31 = Utf8               LocalVariableTable
  #32 = Utf8               this
  #33 = Utf8               Lext/mods/gameserver/network/BlowFishKeygen;
  #34 = Utf8               getRandomKey
  #35 = Utf8               ()[B
  #36 = Utf8               <clinit>
  #37 = Utf8               j
  #38 = Utf8               i
  #39 = Utf8               StackMapTable
  #40 = Utf8               SourceFile
  #41 = Utf8               BlowFishKeygen.java
{
  public static byte[] getRandomKey();
    descriptor: ()[B
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #7                  // Field CRYPT_KEYS:[[B
         3: invokestatic  #13                 // Method ext/mods/commons/random/Rnd.get:([Ljava/lang/Object;)Ljava/lang/Object;
         6: checkcast     #19                 // class "[B"
         9: areturn
      LineNumberTable:
        line 60: 0

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=2, args_size=0
         0: bipush        20
         2: bipush        16
         4: multianewarray #21,  2            // class "[[B"
         8: putstatic     #7                  // Field CRYPT_KEYS:[[B
        11: iconst_0
        12: istore_0
        13: iload_0
        14: bipush        20
        16: if_icmpge     136
        19: iconst_0
        20: istore_1
        21: iload_1
        22: getstatic     #7                  // Field CRYPT_KEYS:[[B
        25: iload_0
        26: aaload
        27: arraylength
        28: if_icmpge     51
        31: getstatic     #7                  // Field CRYPT_KEYS:[[B
        34: iload_0
        35: aaload
        36: iload_1
        37: sipush        255
        40: invokestatic  #22                 // Method ext/mods/commons/random/Rnd.get:(I)I
        43: i2b
        44: bastore
        45: iinc          1, 1
        48: goto          21
        51: getstatic     #7                  // Field CRYPT_KEYS:[[B
        54: iload_0
        55: aaload
        56: bipush        8
        58: bipush        -56
        60: bastore
        61: getstatic     #7                  // Field CRYPT_KEYS:[[B
        64: iload_0
        65: aaload
        66: bipush        9
        68: bipush        39
        70: bastore
        71: getstatic     #7                  // Field CRYPT_KEYS:[[B
        74: iload_0
        75: aaload
        76: bipush        10
        78: bipush        -109
        80: bastore
        81: getstatic     #7                  // Field CRYPT_KEYS:[[B
        84: iload_0
        85: aaload
        86: bipush        11
        88: iconst_1
        89: bastore
        90: getstatic     #7                  // Field CRYPT_KEYS:[[B
        93: iload_0
        94: aaload
        95: bipush        12
        97: bipush        -95
        99: bastore
       100: getstatic     #7                  // Field CRYPT_KEYS:[[B
       103: iload_0
       104: aaload
       105: bipush        13
       107: bipush        108
       109: bastore
       110: getstatic     #7                  // Field CRYPT_KEYS:[[B
       113: iload_0
       114: aaload
       115: bipush        14
       117: bipush        49
       119: bastore
       120: getstatic     #7                  // Field CRYPT_KEYS:[[B
       123: iload_0
       124: aaload
       125: bipush        15
       127: bipush        -105
       129: bastore
       130: iinc          0, 1
       133: goto          13
       136: return
      LineNumberTable:
        line 25: 0
        line 30: 11
        line 32: 19
        line 34: 31
        line 32: 45
        line 37: 51
        line 38: 61
        line 39: 71
        line 40: 81
        line 41: 90
        line 42: 100
        line 43: 110
        line 44: 120
        line 30: 130
        line 46: 136
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           21      30     1     j   I
           13     123     0     i   I
      StackMapTable: number_of_entries = 4
        frame_type = 252 /* append */
          offset_delta = 13
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 7
          locals = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 29
        frame_type = 250 /* chop */
          offset_delta = 84
}
SourceFile: "BlowFishKeygen.java"
