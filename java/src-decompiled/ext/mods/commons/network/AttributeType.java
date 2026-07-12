// Bytecode for: ext.mods.commons.network.AttributeType
// File: ext\mods\commons\network\AttributeType.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/network/AttributeType.class
  Last modified 9 de jul de 2026; size 1724 bytes
  MD5 checksum 3d38f449963091b275a15e03dbe68874
  Compiled from "AttributeType.java"
public final class ext.mods.commons.network.AttributeType extends java.lang.Enum<ext.mods.commons.network.AttributeType>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/commons/network/AttributeType
  super_class: #38                        // java/lang/Enum
  interfaces: 0, fields: 11, methods: 6, attributes: 2
Constant pool:
   #1 = Class              #2             // ext/mods/commons/network/AttributeType
   #2 = Utf8               ext/mods/commons/network/AttributeType
   #3 = Fieldref           #1.#4          // ext/mods/commons/network/AttributeType.NONE:Lext/mods/commons/network/AttributeType;
   #4 = NameAndType        #5:#6          // NONE:Lext/mods/commons/network/AttributeType;
   #5 = Utf8               NONE
   #6 = Utf8               Lext/mods/commons/network/AttributeType;
   #7 = Fieldref           #1.#8          // ext/mods/commons/network/AttributeType.STATUS:Lext/mods/commons/network/AttributeType;
   #8 = NameAndType        #9:#6          // STATUS:Lext/mods/commons/network/AttributeType;
   #9 = Utf8               STATUS
  #10 = Fieldref           #1.#11         // ext/mods/commons/network/AttributeType.CLOCK:Lext/mods/commons/network/AttributeType;
  #11 = NameAndType        #12:#6         // CLOCK:Lext/mods/commons/network/AttributeType;
  #12 = Utf8               CLOCK
  #13 = Fieldref           #1.#14         // ext/mods/commons/network/AttributeType.BRACKETS:Lext/mods/commons/network/AttributeType;
  #14 = NameAndType        #15:#6         // BRACKETS:Lext/mods/commons/network/AttributeType;
  #15 = Utf8               BRACKETS
  #16 = Fieldref           #1.#17         // ext/mods/commons/network/AttributeType.AGE_LIMIT:Lext/mods/commons/network/AttributeType;
  #17 = NameAndType        #18:#6         // AGE_LIMIT:Lext/mods/commons/network/AttributeType;
  #18 = Utf8               AGE_LIMIT
  #19 = Fieldref           #1.#20         // ext/mods/commons/network/AttributeType.TEST_SERVER:Lext/mods/commons/network/AttributeType;
  #20 = NameAndType        #21:#6         // TEST_SERVER:Lext/mods/commons/network/AttributeType;
  #21 = Utf8               TEST_SERVER
  #22 = Fieldref           #1.#23         // ext/mods/commons/network/AttributeType.PVP_SERVER:Lext/mods/commons/network/AttributeType;
  #23 = NameAndType        #24:#6         // PVP_SERVER:Lext/mods/commons/network/AttributeType;
  #24 = Utf8               PVP_SERVER
  #25 = Fieldref           #1.#26         // ext/mods/commons/network/AttributeType.MAX_PLAYERS:Lext/mods/commons/network/AttributeType;
  #26 = NameAndType        #27:#6         // MAX_PLAYERS:Lext/mods/commons/network/AttributeType;
  #27 = Utf8               MAX_PLAYERS
  #28 = Fieldref           #1.#29         // ext/mods/commons/network/AttributeType.$VALUES:[Lext/mods/commons/network/AttributeType;
  #29 = NameAndType        #30:#31        // $VALUES:[Lext/mods/commons/network/AttributeType;
  #30 = Utf8               $VALUES
  #31 = Utf8               [Lext/mods/commons/network/AttributeType;
  #32 = Methodref          #33.#34        // "[Lext/mods/commons/network/AttributeType;".clone:()Ljava/lang/Object;
  #33 = Class              #31            // "[Lext/mods/commons/network/AttributeType;"
  #34 = NameAndType        #35:#36        // clone:()Ljava/lang/Object;
  #35 = Utf8               clone
  #36 = Utf8               ()Ljava/lang/Object;
  #37 = Methodref          #38.#39        // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #38 = Class              #40            // java/lang/Enum
  #39 = NameAndType        #41:#42        // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #40 = Utf8               java/lang/Enum
  #41 = Utf8               valueOf
  #42 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #43 = Methodref          #38.#44        // java/lang/Enum."<init>":(Ljava/lang/String;I)V
  #44 = NameAndType        #45:#46        // "<init>":(Ljava/lang/String;I)V
  #45 = Utf8               <init>
  #46 = Utf8               (Ljava/lang/String;I)V
  #47 = Fieldref           #1.#48         // ext/mods/commons/network/AttributeType._id:I
  #48 = NameAndType        #49:#50        // _id:I
  #49 = Utf8               _id
  #50 = Utf8               I
  #51 = String             #5             // NONE
  #52 = Methodref          #1.#53         // ext/mods/commons/network/AttributeType."<init>":(Ljava/lang/String;II)V
  #53 = NameAndType        #45:#54        // "<init>":(Ljava/lang/String;II)V
  #54 = Utf8               (Ljava/lang/String;II)V
  #55 = String             #9             // STATUS
  #56 = String             #12            // CLOCK
  #57 = String             #15            // BRACKETS
  #58 = String             #18            // AGE_LIMIT
  #59 = String             #21            // TEST_SERVER
  #60 = String             #24            // PVP_SERVER
  #61 = String             #27            // MAX_PLAYERS
  #62 = Methodref          #1.#63         // ext/mods/commons/network/AttributeType.$values:()[Lext/mods/commons/network/AttributeType;
  #63 = NameAndType        #64:#65        // $values:()[Lext/mods/commons/network/AttributeType;
  #64 = Utf8               $values
  #65 = Utf8               ()[Lext/mods/commons/network/AttributeType;
  #66 = Methodref          #1.#67         // ext/mods/commons/network/AttributeType.values:()[Lext/mods/commons/network/AttributeType;
  #67 = NameAndType        #68:#65        // values:()[Lext/mods/commons/network/AttributeType;
  #68 = Utf8               values
  #69 = Fieldref           #1.#70         // ext/mods/commons/network/AttributeType.VALUES:[Lext/mods/commons/network/AttributeType;
  #70 = NameAndType        #71:#31        // VALUES:[Lext/mods/commons/network/AttributeType;
  #71 = Utf8               VALUES
  #72 = Utf8               Code
  #73 = Utf8               LineNumberTable
  #74 = Utf8               (Ljava/lang/String;)Lext/mods/commons/network/AttributeType;
  #75 = Utf8               LocalVariableTable
  #76 = Utf8               name
  #77 = Utf8               Ljava/lang/String;
  #78 = Utf8               MethodParameters
  #79 = Utf8               this
  #80 = Utf8               id
  #81 = Utf8               Signature
  #82 = Utf8               (I)V
  #83 = Utf8               getId
  #84 = Utf8               ()I
  #85 = Utf8               <clinit>
  #86 = Utf8               ()V
  #87 = Utf8               Ljava/lang/Enum<Lext/mods/commons/network/AttributeType;>;
  #88 = Utf8               SourceFile
  #89 = Utf8               AttributeType.java
{
  public static final ext.mods.commons.network.AttributeType NONE;
    descriptor: Lext/mods/commons/network/AttributeType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.commons.network.AttributeType STATUS;
    descriptor: Lext/mods/commons/network/AttributeType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.commons.network.AttributeType CLOCK;
    descriptor: Lext/mods/commons/network/AttributeType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.commons.network.AttributeType BRACKETS;
    descriptor: Lext/mods/commons/network/AttributeType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.commons.network.AttributeType AGE_LIMIT;
    descriptor: Lext/mods/commons/network/AttributeType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.commons.network.AttributeType TEST_SERVER;
    descriptor: Lext/mods/commons/network/AttributeType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.commons.network.AttributeType PVP_SERVER;
    descriptor: Lext/mods/commons/network/AttributeType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.commons.network.AttributeType MAX_PLAYERS;
    descriptor: Lext/mods/commons/network/AttributeType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.commons.network.AttributeType[] VALUES;
    descriptor: [Lext/mods/commons/network/AttributeType;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public static ext.mods.commons.network.AttributeType[] values();
    descriptor: ()[Lext/mods/commons/network/AttributeType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #28                 // Field $VALUES:[Lext/mods/commons/network/AttributeType;
         3: invokevirtual #32                 // Method "[Lext/mods/commons/network/AttributeType;".clone:()Ljava/lang/Object;
         6: checkcast     #33                 // class "[Lext/mods/commons/network/AttributeType;"
         9: areturn
      LineNumberTable:
        line 20: 0

  public static ext.mods.commons.network.AttributeType valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/commons/network/AttributeType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/commons/network/AttributeType
         2: aload_0
         3: invokestatic  #37                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/commons/network/AttributeType
         9: areturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  name   Ljava/lang/String;
    MethodParameters:
      Name                           Flags
      <no name>                      mandated

  public int getId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #47                 // Field _id:I
         4: ireturn
      LineNumberTable:
        line 40: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/network/AttributeType;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=5, locals=0, args_size=0
         0: new           #1                  // class ext/mods/commons/network/AttributeType
         3: dup
         4: ldc           #51                 // String NONE
         6: iconst_0
         7: iconst_0
         8: invokespecial #52                 // Method "<init>":(Ljava/lang/String;II)V
        11: putstatic     #3                  // Field NONE:Lext/mods/commons/network/AttributeType;
        14: new           #1                  // class ext/mods/commons/network/AttributeType
        17: dup
        18: ldc           #55                 // String STATUS
        20: iconst_1
        21: iconst_1
        22: invokespecial #52                 // Method "<init>":(Ljava/lang/String;II)V
        25: putstatic     #7                  // Field STATUS:Lext/mods/commons/network/AttributeType;
        28: new           #1                  // class ext/mods/commons/network/AttributeType
        31: dup
        32: ldc           #56                 // String CLOCK
        34: iconst_2
        35: iconst_2
        36: invokespecial #52                 // Method "<init>":(Ljava/lang/String;II)V
        39: putstatic     #10                 // Field CLOCK:Lext/mods/commons/network/AttributeType;
        42: new           #1                  // class ext/mods/commons/network/AttributeType
        45: dup
        46: ldc           #57                 // String BRACKETS
        48: iconst_3
        49: iconst_3
        50: invokespecial #52                 // Method "<init>":(Ljava/lang/String;II)V
        53: putstatic     #13                 // Field BRACKETS:Lext/mods/commons/network/AttributeType;
        56: new           #1                  // class ext/mods/commons/network/AttributeType
        59: dup
        60: ldc           #58                 // String AGE_LIMIT
        62: iconst_4
        63: iconst_4
        64: invokespecial #52                 // Method "<init>":(Ljava/lang/String;II)V
        67: putstatic     #16                 // Field AGE_LIMIT:Lext/mods/commons/network/AttributeType;
        70: new           #1                  // class ext/mods/commons/network/AttributeType
        73: dup
        74: ldc           #59                 // String TEST_SERVER
        76: iconst_5
        77: iconst_5
        78: invokespecial #52                 // Method "<init>":(Ljava/lang/String;II)V
        81: putstatic     #19                 // Field TEST_SERVER:Lext/mods/commons/network/AttributeType;
        84: new           #1                  // class ext/mods/commons/network/AttributeType
        87: dup
        88: ldc           #60                 // String PVP_SERVER
        90: bipush        6
        92: bipush        6
        94: invokespecial #52                 // Method "<init>":(Ljava/lang/String;II)V
        97: putstatic     #22                 // Field PVP_SERVER:Lext/mods/commons/network/AttributeType;
       100: new           #1                  // class ext/mods/commons/network/AttributeType
       103: dup
       104: ldc           #61                 // String MAX_PLAYERS
       106: bipush        7
       108: bipush        7
       110: invokespecial #52                 // Method "<init>":(Ljava/lang/String;II)V
       113: putstatic     #25                 // Field MAX_PLAYERS:Lext/mods/commons/network/AttributeType;
       116: invokestatic  #62                 // Method $values:()[Lext/mods/commons/network/AttributeType;
       119: putstatic     #28                 // Field $VALUES:[Lext/mods/commons/network/AttributeType;
       122: invokestatic  #66                 // Method values:()[Lext/mods/commons/network/AttributeType;
       125: putstatic     #69                 // Field VALUES:[Lext/mods/commons/network/AttributeType;
       128: return
      LineNumberTable:
        line 22: 0
        line 23: 14
        line 24: 28
        line 25: 42
        line 26: 56
        line 27: 70
        line 28: 84
        line 29: 100
        line 20: 116
        line 43: 122
}
Signature: #87                          // Ljava/lang/Enum<Lext/mods/commons/network/AttributeType;>;
SourceFile: "AttributeType.java"
