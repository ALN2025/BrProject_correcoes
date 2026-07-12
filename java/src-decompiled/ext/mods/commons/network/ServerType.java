// Bytecode for: ext.mods.commons.network.ServerType
// File: ext\mods\commons\network\ServerType.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/network/ServerType.class
  Last modified 9 de jul de 2026; size 1823 bytes
  MD5 checksum d2fada4b8322a259e6f67de79856c24a
  Compiled from "ServerType.java"
public final class ext.mods.commons.network.ServerType extends java.lang.Enum<ext.mods.commons.network.ServerType>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/commons/network/ServerType
  super_class: #32                        // java/lang/Enum
  interfaces: 0, fields: 10, methods: 7, attributes: 2
Constant pool:
   #1 = Class              #2             // ext/mods/commons/network/ServerType
   #2 = Utf8               ext/mods/commons/network/ServerType
   #3 = Fieldref           #1.#4          // ext/mods/commons/network/ServerType.AUTO:Lext/mods/commons/network/ServerType;
   #4 = NameAndType        #5:#6          // AUTO:Lext/mods/commons/network/ServerType;
   #5 = Utf8               AUTO
   #6 = Utf8               Lext/mods/commons/network/ServerType;
   #7 = Fieldref           #1.#8          // ext/mods/commons/network/ServerType.GOOD:Lext/mods/commons/network/ServerType;
   #8 = NameAndType        #9:#6          // GOOD:Lext/mods/commons/network/ServerType;
   #9 = Utf8               GOOD
  #10 = Fieldref           #1.#11         // ext/mods/commons/network/ServerType.NORMAL:Lext/mods/commons/network/ServerType;
  #11 = NameAndType        #12:#6         // NORMAL:Lext/mods/commons/network/ServerType;
  #12 = Utf8               NORMAL
  #13 = Fieldref           #1.#14         // ext/mods/commons/network/ServerType.FULL:Lext/mods/commons/network/ServerType;
  #14 = NameAndType        #15:#6         // FULL:Lext/mods/commons/network/ServerType;
  #15 = Utf8               FULL
  #16 = Fieldref           #1.#17         // ext/mods/commons/network/ServerType.DOWN:Lext/mods/commons/network/ServerType;
  #17 = NameAndType        #18:#6         // DOWN:Lext/mods/commons/network/ServerType;
  #18 = Utf8               DOWN
  #19 = Fieldref           #1.#20         // ext/mods/commons/network/ServerType.GM_ONLY:Lext/mods/commons/network/ServerType;
  #20 = NameAndType        #21:#6         // GM_ONLY:Lext/mods/commons/network/ServerType;
  #21 = Utf8               GM_ONLY
  #22 = Fieldref           #1.#23         // ext/mods/commons/network/ServerType.$VALUES:[Lext/mods/commons/network/ServerType;
  #23 = NameAndType        #24:#25        // $VALUES:[Lext/mods/commons/network/ServerType;
  #24 = Utf8               $VALUES
  #25 = Utf8               [Lext/mods/commons/network/ServerType;
  #26 = Methodref          #27.#28        // "[Lext/mods/commons/network/ServerType;".clone:()Ljava/lang/Object;
  #27 = Class              #25            // "[Lext/mods/commons/network/ServerType;"
  #28 = NameAndType        #29:#30        // clone:()Ljava/lang/Object;
  #29 = Utf8               clone
  #30 = Utf8               ()Ljava/lang/Object;
  #31 = Methodref          #32.#33        // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #32 = Class              #34            // java/lang/Enum
  #33 = NameAndType        #35:#36        // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #34 = Utf8               java/lang/Enum
  #35 = Utf8               valueOf
  #36 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #37 = Methodref          #32.#38        // java/lang/Enum."<init>":(Ljava/lang/String;I)V
  #38 = NameAndType        #39:#40        // "<init>":(Ljava/lang/String;I)V
  #39 = Utf8               <init>
  #40 = Utf8               (Ljava/lang/String;I)V
  #41 = Fieldref           #1.#42         // ext/mods/commons/network/ServerType._id:I
  #42 = NameAndType        #43:#44        // _id:I
  #43 = Utf8               _id
  #44 = Utf8               I
  #45 = Fieldref           #1.#46         // ext/mods/commons/network/ServerType._name:Ljava/lang/String;
  #46 = NameAndType        #47:#48        // _name:Ljava/lang/String;
  #47 = Utf8               _name
  #48 = Utf8               Ljava/lang/String;
  #49 = String             #5             // AUTO
  #50 = String             #51            // Auto
  #51 = Utf8               Auto
  #52 = Methodref          #1.#53         // ext/mods/commons/network/ServerType."<init>":(Ljava/lang/String;IILjava/lang/String;)V
  #53 = NameAndType        #39:#54        // "<init>":(Ljava/lang/String;IILjava/lang/String;)V
  #54 = Utf8               (Ljava/lang/String;IILjava/lang/String;)V
  #55 = String             #9             // GOOD
  #56 = String             #57            // Good
  #57 = Utf8               Good
  #58 = String             #12            // NORMAL
  #59 = String             #60            // Normal
  #60 = Utf8               Normal
  #61 = String             #15            // FULL
  #62 = String             #63            // Full
  #63 = Utf8               Full
  #64 = String             #18            // DOWN
  #65 = String             #66            // Down
  #66 = Utf8               Down
  #67 = String             #21            // GM_ONLY
  #68 = String             #69            // Gm Only
  #69 = Utf8               Gm Only
  #70 = Methodref          #1.#71         // ext/mods/commons/network/ServerType.$values:()[Lext/mods/commons/network/ServerType;
  #71 = NameAndType        #72:#73        // $values:()[Lext/mods/commons/network/ServerType;
  #72 = Utf8               $values
  #73 = Utf8               ()[Lext/mods/commons/network/ServerType;
  #74 = Methodref          #1.#75         // ext/mods/commons/network/ServerType.values:()[Lext/mods/commons/network/ServerType;
  #75 = NameAndType        #76:#73        // values:()[Lext/mods/commons/network/ServerType;
  #76 = Utf8               values
  #77 = Fieldref           #1.#78         // ext/mods/commons/network/ServerType.VALUES:[Lext/mods/commons/network/ServerType;
  #78 = NameAndType        #79:#25        // VALUES:[Lext/mods/commons/network/ServerType;
  #79 = Utf8               VALUES
  #80 = Utf8               Code
  #81 = Utf8               LineNumberTable
  #82 = Utf8               (Ljava/lang/String;)Lext/mods/commons/network/ServerType;
  #83 = Utf8               LocalVariableTable
  #84 = Utf8               name
  #85 = Utf8               MethodParameters
  #86 = Utf8               this
  #87 = Utf8               id
  #88 = Utf8               Signature
  #89 = Utf8               (ILjava/lang/String;)V
  #90 = Utf8               getId
  #91 = Utf8               ()I
  #92 = Utf8               getName
  #93 = Utf8               ()Ljava/lang/String;
  #94 = Utf8               <clinit>
  #95 = Utf8               ()V
  #96 = Utf8               Ljava/lang/Enum<Lext/mods/commons/network/ServerType;>;
  #97 = Utf8               SourceFile
  #98 = Utf8               ServerType.java
{
  public static final ext.mods.commons.network.ServerType AUTO;
    descriptor: Lext/mods/commons/network/ServerType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.commons.network.ServerType GOOD;
    descriptor: Lext/mods/commons/network/ServerType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.commons.network.ServerType NORMAL;
    descriptor: Lext/mods/commons/network/ServerType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.commons.network.ServerType FULL;
    descriptor: Lext/mods/commons/network/ServerType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.commons.network.ServerType DOWN;
    descriptor: Lext/mods/commons/network/ServerType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.commons.network.ServerType GM_ONLY;
    descriptor: Lext/mods/commons/network/ServerType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.commons.network.ServerType[] VALUES;
    descriptor: [Lext/mods/commons/network/ServerType;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public static ext.mods.commons.network.ServerType[] values();
    descriptor: ()[Lext/mods/commons/network/ServerType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #22                 // Field $VALUES:[Lext/mods/commons/network/ServerType;
         3: invokevirtual #26                 // Method "[Lext/mods/commons/network/ServerType;".clone:()Ljava/lang/Object;
         6: checkcast     #27                 // class "[Lext/mods/commons/network/ServerType;"
         9: areturn
      LineNumberTable:
        line 20: 0

  public static ext.mods.commons.network.ServerType valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/commons/network/ServerType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/commons/network/ServerType
         2: aload_0
         3: invokestatic  #31                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/commons/network/ServerType
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
         1: getfield      #41                 // Field _id:I
         4: ireturn
      LineNumberTable:
        line 40: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/network/ServerType;

  public java.lang.String getName();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #45                 // Field _name:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 45: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/network/ServerType;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=6, locals=0, args_size=0
         0: new           #1                  // class ext/mods/commons/network/ServerType
         3: dup
         4: ldc           #49                 // String AUTO
         6: iconst_0
         7: iconst_0
         8: ldc           #50                 // String Auto
        10: invokespecial #52                 // Method "<init>":(Ljava/lang/String;IILjava/lang/String;)V
        13: putstatic     #3                  // Field AUTO:Lext/mods/commons/network/ServerType;
        16: new           #1                  // class ext/mods/commons/network/ServerType
        19: dup
        20: ldc           #55                 // String GOOD
        22: iconst_1
        23: iconst_1
        24: ldc           #56                 // String Good
        26: invokespecial #52                 // Method "<init>":(Ljava/lang/String;IILjava/lang/String;)V
        29: putstatic     #7                  // Field GOOD:Lext/mods/commons/network/ServerType;
        32: new           #1                  // class ext/mods/commons/network/ServerType
        35: dup
        36: ldc           #58                 // String NORMAL
        38: iconst_2
        39: iconst_2
        40: ldc           #59                 // String Normal
        42: invokespecial #52                 // Method "<init>":(Ljava/lang/String;IILjava/lang/String;)V
        45: putstatic     #10                 // Field NORMAL:Lext/mods/commons/network/ServerType;
        48: new           #1                  // class ext/mods/commons/network/ServerType
        51: dup
        52: ldc           #61                 // String FULL
        54: iconst_3
        55: iconst_3
        56: ldc           #62                 // String Full
        58: invokespecial #52                 // Method "<init>":(Ljava/lang/String;IILjava/lang/String;)V
        61: putstatic     #13                 // Field FULL:Lext/mods/commons/network/ServerType;
        64: new           #1                  // class ext/mods/commons/network/ServerType
        67: dup
        68: ldc           #64                 // String DOWN
        70: iconst_4
        71: iconst_4
        72: ldc           #65                 // String Down
        74: invokespecial #52                 // Method "<init>":(Ljava/lang/String;IILjava/lang/String;)V
        77: putstatic     #16                 // Field DOWN:Lext/mods/commons/network/ServerType;
        80: new           #1                  // class ext/mods/commons/network/ServerType
        83: dup
        84: ldc           #67                 // String GM_ONLY
        86: iconst_5
        87: iconst_5
        88: ldc           #68                 // String Gm Only
        90: invokespecial #52                 // Method "<init>":(Ljava/lang/String;IILjava/lang/String;)V
        93: putstatic     #19                 // Field GM_ONLY:Lext/mods/commons/network/ServerType;
        96: invokestatic  #70                 // Method $values:()[Lext/mods/commons/network/ServerType;
        99: putstatic     #22                 // Field $VALUES:[Lext/mods/commons/network/ServerType;
       102: invokestatic  #74                 // Method values:()[Lext/mods/commons/network/ServerType;
       105: putstatic     #77                 // Field VALUES:[Lext/mods/commons/network/ServerType;
       108: return
      LineNumberTable:
        line 22: 0
        line 23: 16
        line 24: 32
        line 25: 48
        line 26: 64
        line 27: 80
        line 20: 96
        line 48: 102
}
Signature: #96                          // Ljava/lang/Enum<Lext/mods/commons/network/ServerType;>;
SourceFile: "ServerType.java"
