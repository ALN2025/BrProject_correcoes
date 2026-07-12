// Bytecode for: ext.mods.gameserver.enums.actors.OperateType
// File: ext\mods\gameserver\enums\actors\OperateType.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/enums/actors/OperateType.class
  Last modified 9 de jul de 2026; size 1839 bytes
  MD5 checksum 54634c710fdf19fb7668e0f6b0fbf76b
  Compiled from "OperateType.java"
public final class ext.mods.gameserver.enums.actors.OperateType extends java.lang.Enum<ext.mods.gameserver.enums.actors.OperateType>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/enums/actors/OperateType
  super_class: #44                        // java/lang/Enum
  interfaces: 0, fields: 12, methods: 6, attributes: 2
Constant pool:
   #1 = Class              #2             // ext/mods/gameserver/enums/actors/OperateType
   #2 = Utf8               ext/mods/gameserver/enums/actors/OperateType
   #3 = Fieldref           #1.#4          // ext/mods/gameserver/enums/actors/OperateType.NONE:Lext/mods/gameserver/enums/actors/OperateType;
   #4 = NameAndType        #5:#6          // NONE:Lext/mods/gameserver/enums/actors/OperateType;
   #5 = Utf8               NONE
   #6 = Utf8               Lext/mods/gameserver/enums/actors/OperateType;
   #7 = Fieldref           #1.#8          // ext/mods/gameserver/enums/actors/OperateType.SELL:Lext/mods/gameserver/enums/actors/OperateType;
   #8 = NameAndType        #9:#6          // SELL:Lext/mods/gameserver/enums/actors/OperateType;
   #9 = Utf8               SELL
  #10 = Fieldref           #1.#11         // ext/mods/gameserver/enums/actors/OperateType.SELL_MANAGE:Lext/mods/gameserver/enums/actors/OperateType;
  #11 = NameAndType        #12:#6         // SELL_MANAGE:Lext/mods/gameserver/enums/actors/OperateType;
  #12 = Utf8               SELL_MANAGE
  #13 = Fieldref           #1.#14         // ext/mods/gameserver/enums/actors/OperateType.BUY:Lext/mods/gameserver/enums/actors/OperateType;
  #14 = NameAndType        #15:#6         // BUY:Lext/mods/gameserver/enums/actors/OperateType;
  #15 = Utf8               BUY
  #16 = Fieldref           #1.#17         // ext/mods/gameserver/enums/actors/OperateType.BUY_MANAGE:Lext/mods/gameserver/enums/actors/OperateType;
  #17 = NameAndType        #18:#6         // BUY_MANAGE:Lext/mods/gameserver/enums/actors/OperateType;
  #18 = Utf8               BUY_MANAGE
  #19 = Fieldref           #1.#20         // ext/mods/gameserver/enums/actors/OperateType.MANUFACTURE:Lext/mods/gameserver/enums/actors/OperateType;
  #20 = NameAndType        #21:#6         // MANUFACTURE:Lext/mods/gameserver/enums/actors/OperateType;
  #21 = Utf8               MANUFACTURE
  #22 = Fieldref           #1.#23         // ext/mods/gameserver/enums/actors/OperateType.MANUFACTURE_MANAGE:Lext/mods/gameserver/enums/actors/OperateType;
  #23 = NameAndType        #24:#6         // MANUFACTURE_MANAGE:Lext/mods/gameserver/enums/actors/OperateType;
  #24 = Utf8               MANUFACTURE_MANAGE
  #25 = Fieldref           #1.#26         // ext/mods/gameserver/enums/actors/OperateType.OBSERVE:Lext/mods/gameserver/enums/actors/OperateType;
  #26 = NameAndType        #27:#6         // OBSERVE:Lext/mods/gameserver/enums/actors/OperateType;
  #27 = Utf8               OBSERVE
  #28 = Fieldref           #1.#29         // ext/mods/gameserver/enums/actors/OperateType.PACKAGE_SELL:Lext/mods/gameserver/enums/actors/OperateType;
  #29 = NameAndType        #30:#6         // PACKAGE_SELL:Lext/mods/gameserver/enums/actors/OperateType;
  #30 = Utf8               PACKAGE_SELL
  #31 = Fieldref           #1.#32         // ext/mods/gameserver/enums/actors/OperateType.SELL_BUFFS:Lext/mods/gameserver/enums/actors/OperateType;
  #32 = NameAndType        #33:#6         // SELL_BUFFS:Lext/mods/gameserver/enums/actors/OperateType;
  #33 = Utf8               SELL_BUFFS
  #34 = Fieldref           #1.#35         // ext/mods/gameserver/enums/actors/OperateType.$VALUES:[Lext/mods/gameserver/enums/actors/OperateType;
  #35 = NameAndType        #36:#37        // $VALUES:[Lext/mods/gameserver/enums/actors/OperateType;
  #36 = Utf8               $VALUES
  #37 = Utf8               [Lext/mods/gameserver/enums/actors/OperateType;
  #38 = Methodref          #39.#40        // "[Lext/mods/gameserver/enums/actors/OperateType;".clone:()Ljava/lang/Object;
  #39 = Class              #37            // "[Lext/mods/gameserver/enums/actors/OperateType;"
  #40 = NameAndType        #41:#42        // clone:()Ljava/lang/Object;
  #41 = Utf8               clone
  #42 = Utf8               ()Ljava/lang/Object;
  #43 = Methodref          #44.#45        // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #44 = Class              #46            // java/lang/Enum
  #45 = NameAndType        #47:#48        // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #46 = Utf8               java/lang/Enum
  #47 = Utf8               valueOf
  #48 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #49 = Methodref          #44.#50        // java/lang/Enum."<init>":(Ljava/lang/String;I)V
  #50 = NameAndType        #51:#52        // "<init>":(Ljava/lang/String;I)V
  #51 = Utf8               <init>
  #52 = Utf8               (Ljava/lang/String;I)V
  #53 = Fieldref           #1.#54         // ext/mods/gameserver/enums/actors/OperateType._id:I
  #54 = NameAndType        #55:#56        // _id:I
  #55 = Utf8               _id
  #56 = Utf8               I
  #57 = String             #5             // NONE
  #58 = Methodref          #1.#59         // ext/mods/gameserver/enums/actors/OperateType."<init>":(Ljava/lang/String;II)V
  #59 = NameAndType        #51:#60        // "<init>":(Ljava/lang/String;II)V
  #60 = Utf8               (Ljava/lang/String;II)V
  #61 = String             #9             // SELL
  #62 = String             #12            // SELL_MANAGE
  #63 = String             #15            // BUY
  #64 = String             #18            // BUY_MANAGE
  #65 = String             #21            // MANUFACTURE
  #66 = String             #24            // MANUFACTURE_MANAGE
  #67 = String             #27            // OBSERVE
  #68 = String             #30            // PACKAGE_SELL
  #69 = String             #33            // SELL_BUFFS
  #70 = Methodref          #1.#71         // ext/mods/gameserver/enums/actors/OperateType.$values:()[Lext/mods/gameserver/enums/actors/OperateType;
  #71 = NameAndType        #72:#73        // $values:()[Lext/mods/gameserver/enums/actors/OperateType;
  #72 = Utf8               $values
  #73 = Utf8               ()[Lext/mods/gameserver/enums/actors/OperateType;
  #74 = Utf8               values
  #75 = Utf8               Code
  #76 = Utf8               LineNumberTable
  #77 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/actors/OperateType;
  #78 = Utf8               LocalVariableTable
  #79 = Utf8               name
  #80 = Utf8               Ljava/lang/String;
  #81 = Utf8               MethodParameters
  #82 = Utf8               this
  #83 = Utf8               id
  #84 = Utf8               Signature
  #85 = Utf8               (I)V
  #86 = Utf8               getId
  #87 = Utf8               ()I
  #88 = Utf8               <clinit>
  #89 = Utf8               ()V
  #90 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/enums/actors/OperateType;>;
  #91 = Utf8               SourceFile
  #92 = Utf8               OperateType.java
{
  public static final ext.mods.gameserver.enums.actors.OperateType NONE;
    descriptor: Lext/mods/gameserver/enums/actors/OperateType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.OperateType SELL;
    descriptor: Lext/mods/gameserver/enums/actors/OperateType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.OperateType SELL_MANAGE;
    descriptor: Lext/mods/gameserver/enums/actors/OperateType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.OperateType BUY;
    descriptor: Lext/mods/gameserver/enums/actors/OperateType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.OperateType BUY_MANAGE;
    descriptor: Lext/mods/gameserver/enums/actors/OperateType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.OperateType MANUFACTURE;
    descriptor: Lext/mods/gameserver/enums/actors/OperateType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.OperateType MANUFACTURE_MANAGE;
    descriptor: Lext/mods/gameserver/enums/actors/OperateType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.OperateType OBSERVE;
    descriptor: Lext/mods/gameserver/enums/actors/OperateType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.OperateType PACKAGE_SELL;
    descriptor: Lext/mods/gameserver/enums/actors/OperateType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.OperateType SELL_BUFFS;
    descriptor: Lext/mods/gameserver/enums/actors/OperateType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static ext.mods.gameserver.enums.actors.OperateType[] values();
    descriptor: ()[Lext/mods/gameserver/enums/actors/OperateType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #34                 // Field $VALUES:[Lext/mods/gameserver/enums/actors/OperateType;
         3: invokevirtual #38                 // Method "[Lext/mods/gameserver/enums/actors/OperateType;".clone:()Ljava/lang/Object;
         6: checkcast     #39                 // class "[Lext/mods/gameserver/enums/actors/OperateType;"
         9: areturn
      LineNumberTable:
        line 20: 0

  public static ext.mods.gameserver.enums.actors.OperateType valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/enums/actors/OperateType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/enums/actors/OperateType
         2: aload_0
         3: invokestatic  #43                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/enums/actors/OperateType
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
         1: getfield      #53                 // Field _id:I
         4: ireturn
      LineNumberTable:
        line 42: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/actors/OperateType;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=5, locals=0, args_size=0
         0: new           #1                  // class ext/mods/gameserver/enums/actors/OperateType
         3: dup
         4: ldc           #57                 // String NONE
         6: iconst_0
         7: iconst_0
         8: invokespecial #58                 // Method "<init>":(Ljava/lang/String;II)V
        11: putstatic     #3                  // Field NONE:Lext/mods/gameserver/enums/actors/OperateType;
        14: new           #1                  // class ext/mods/gameserver/enums/actors/OperateType
        17: dup
        18: ldc           #61                 // String SELL
        20: iconst_1
        21: iconst_1
        22: invokespecial #58                 // Method "<init>":(Ljava/lang/String;II)V
        25: putstatic     #7                  // Field SELL:Lext/mods/gameserver/enums/actors/OperateType;
        28: new           #1                  // class ext/mods/gameserver/enums/actors/OperateType
        31: dup
        32: ldc           #62                 // String SELL_MANAGE
        34: iconst_2
        35: iconst_2
        36: invokespecial #58                 // Method "<init>":(Ljava/lang/String;II)V
        39: putstatic     #10                 // Field SELL_MANAGE:Lext/mods/gameserver/enums/actors/OperateType;
        42: new           #1                  // class ext/mods/gameserver/enums/actors/OperateType
        45: dup
        46: ldc           #63                 // String BUY
        48: iconst_3
        49: iconst_3
        50: invokespecial #58                 // Method "<init>":(Ljava/lang/String;II)V
        53: putstatic     #13                 // Field BUY:Lext/mods/gameserver/enums/actors/OperateType;
        56: new           #1                  // class ext/mods/gameserver/enums/actors/OperateType
        59: dup
        60: ldc           #64                 // String BUY_MANAGE
        62: iconst_4
        63: iconst_4
        64: invokespecial #58                 // Method "<init>":(Ljava/lang/String;II)V
        67: putstatic     #16                 // Field BUY_MANAGE:Lext/mods/gameserver/enums/actors/OperateType;
        70: new           #1                  // class ext/mods/gameserver/enums/actors/OperateType
        73: dup
        74: ldc           #65                 // String MANUFACTURE
        76: iconst_5
        77: iconst_5
        78: invokespecial #58                 // Method "<init>":(Ljava/lang/String;II)V
        81: putstatic     #19                 // Field MANUFACTURE:Lext/mods/gameserver/enums/actors/OperateType;
        84: new           #1                  // class ext/mods/gameserver/enums/actors/OperateType
        87: dup
        88: ldc           #66                 // String MANUFACTURE_MANAGE
        90: bipush        6
        92: bipush        6
        94: invokespecial #58                 // Method "<init>":(Ljava/lang/String;II)V
        97: putstatic     #22                 // Field MANUFACTURE_MANAGE:Lext/mods/gameserver/enums/actors/OperateType;
       100: new           #1                  // class ext/mods/gameserver/enums/actors/OperateType
       103: dup
       104: ldc           #67                 // String OBSERVE
       106: bipush        7
       108: bipush        7
       110: invokespecial #58                 // Method "<init>":(Ljava/lang/String;II)V
       113: putstatic     #25                 // Field OBSERVE:Lext/mods/gameserver/enums/actors/OperateType;
       116: new           #1                  // class ext/mods/gameserver/enums/actors/OperateType
       119: dup
       120: ldc           #68                 // String PACKAGE_SELL
       122: bipush        8
       124: bipush        8
       126: invokespecial #58                 // Method "<init>":(Ljava/lang/String;II)V
       129: putstatic     #28                 // Field PACKAGE_SELL:Lext/mods/gameserver/enums/actors/OperateType;
       132: new           #1                  // class ext/mods/gameserver/enums/actors/OperateType
       135: dup
       136: ldc           #69                 // String SELL_BUFFS
       138: bipush        9
       140: bipush        9
       142: invokespecial #58                 // Method "<init>":(Ljava/lang/String;II)V
       145: putstatic     #31                 // Field SELL_BUFFS:Lext/mods/gameserver/enums/actors/OperateType;
       148: invokestatic  #70                 // Method $values:()[Lext/mods/gameserver/enums/actors/OperateType;
       151: putstatic     #34                 // Field $VALUES:[Lext/mods/gameserver/enums/actors/OperateType;
       154: return
      LineNumberTable:
        line 22: 0
        line 23: 14
        line 24: 28
        line 25: 42
        line 26: 56
        line 27: 70
        line 28: 84
        line 29: 100
        line 30: 116
        line 31: 132
        line 20: 148
}
Signature: #90                          // Ljava/lang/Enum<Lext/mods/gameserver/enums/actors/OperateType;>;
SourceFile: "OperateType.java"
