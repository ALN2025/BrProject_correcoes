// Bytecode for: ext.mods.gameserver.enums.PunishmentType
// File: ext\mods\gameserver\enums\PunishmentType.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/enums/PunishmentType.class
  Last modified 9 de jul de 2026; size 1667 bytes
  MD5 checksum 53ea7c3410152e23697ca563838ebcf8
  Compiled from "PunishmentType.java"
public final class ext.mods.gameserver.enums.PunishmentType extends java.lang.Enum<ext.mods.gameserver.enums.PunishmentType>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/enums/PunishmentType
  super_class: #29                        // java/lang/Enum
  interfaces: 0, fields: 8, methods: 6, attributes: 2
Constant pool:
   #1 = Class              #2             // ext/mods/gameserver/enums/PunishmentType
   #2 = Utf8               ext/mods/gameserver/enums/PunishmentType
   #3 = Fieldref           #1.#4          // ext/mods/gameserver/enums/PunishmentType.NONE:Lext/mods/gameserver/enums/PunishmentType;
   #4 = NameAndType        #5:#6          // NONE:Lext/mods/gameserver/enums/PunishmentType;
   #5 = Utf8               NONE
   #6 = Utf8               Lext/mods/gameserver/enums/PunishmentType;
   #7 = Fieldref           #1.#8          // ext/mods/gameserver/enums/PunishmentType.CHAT:Lext/mods/gameserver/enums/PunishmentType;
   #8 = NameAndType        #9:#6          // CHAT:Lext/mods/gameserver/enums/PunishmentType;
   #9 = Utf8               CHAT
  #10 = Fieldref           #1.#11         // ext/mods/gameserver/enums/PunishmentType.JAIL:Lext/mods/gameserver/enums/PunishmentType;
  #11 = NameAndType        #12:#6         // JAIL:Lext/mods/gameserver/enums/PunishmentType;
  #12 = Utf8               JAIL
  #13 = Fieldref           #1.#14         // ext/mods/gameserver/enums/PunishmentType.CHAR:Lext/mods/gameserver/enums/PunishmentType;
  #14 = NameAndType        #15:#6         // CHAR:Lext/mods/gameserver/enums/PunishmentType;
  #15 = Utf8               CHAR
  #16 = Fieldref           #1.#17         // ext/mods/gameserver/enums/PunishmentType.ACC:Lext/mods/gameserver/enums/PunishmentType;
  #17 = NameAndType        #18:#6         // ACC:Lext/mods/gameserver/enums/PunishmentType;
  #18 = Utf8               ACC
  #19 = Fieldref           #1.#20         // ext/mods/gameserver/enums/PunishmentType.$VALUES:[Lext/mods/gameserver/enums/PunishmentType;
  #20 = NameAndType        #21:#22        // $VALUES:[Lext/mods/gameserver/enums/PunishmentType;
  #21 = Utf8               $VALUES
  #22 = Utf8               [Lext/mods/gameserver/enums/PunishmentType;
  #23 = Methodref          #24.#25        // "[Lext/mods/gameserver/enums/PunishmentType;".clone:()Ljava/lang/Object;
  #24 = Class              #22            // "[Lext/mods/gameserver/enums/PunishmentType;"
  #25 = NameAndType        #26:#27        // clone:()Ljava/lang/Object;
  #26 = Utf8               clone
  #27 = Utf8               ()Ljava/lang/Object;
  #28 = Methodref          #29.#30        // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #29 = Class              #31            // java/lang/Enum
  #30 = NameAndType        #32:#33        // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #31 = Utf8               java/lang/Enum
  #32 = Utf8               valueOf
  #33 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #34 = Methodref          #29.#35        // java/lang/Enum."<init>":(Ljava/lang/String;I)V
  #35 = NameAndType        #36:#37        // "<init>":(Ljava/lang/String;I)V
  #36 = Utf8               <init>
  #37 = Utf8               (Ljava/lang/String;I)V
  #38 = Fieldref           #1.#39         // ext/mods/gameserver/enums/PunishmentType._description:Ljava/lang/String;
  #39 = NameAndType        #40:#41        // _description:Ljava/lang/String;
  #40 = Utf8               _description
  #41 = Utf8               Ljava/lang/String;
  #42 = String             #5             // NONE
  #43 = String             #44            //
  #44 = Utf8
  #45 = Methodref          #1.#46         // ext/mods/gameserver/enums/PunishmentType."<init>":(Ljava/lang/String;ILjava/lang/String;)V
  #46 = NameAndType        #36:#47        // "<init>":(Ljava/lang/String;ILjava/lang/String;)V
  #47 = Utf8               (Ljava/lang/String;ILjava/lang/String;)V
  #48 = String             #9             // CHAT
  #49 = String             #50            // chat banned
  #50 = Utf8               chat banned
  #51 = String             #12            // JAIL
  #52 = String             #53            // jailed
  #53 = Utf8               jailed
  #54 = String             #15            // CHAR
  #55 = String             #56            // banned
  #56 = Utf8               banned
  #57 = String             #18            // ACC
  #58 = Methodref          #1.#59         // ext/mods/gameserver/enums/PunishmentType.$values:()[Lext/mods/gameserver/enums/PunishmentType;
  #59 = NameAndType        #60:#61        // $values:()[Lext/mods/gameserver/enums/PunishmentType;
  #60 = Utf8               $values
  #61 = Utf8               ()[Lext/mods/gameserver/enums/PunishmentType;
  #62 = Methodref          #1.#63         // ext/mods/gameserver/enums/PunishmentType.values:()[Lext/mods/gameserver/enums/PunishmentType;
  #63 = NameAndType        #64:#61        // values:()[Lext/mods/gameserver/enums/PunishmentType;
  #64 = Utf8               values
  #65 = Fieldref           #1.#66         // ext/mods/gameserver/enums/PunishmentType.VALUES:[Lext/mods/gameserver/enums/PunishmentType;
  #66 = NameAndType        #67:#22        // VALUES:[Lext/mods/gameserver/enums/PunishmentType;
  #67 = Utf8               VALUES
  #68 = Utf8               Code
  #69 = Utf8               LineNumberTable
  #70 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/PunishmentType;
  #71 = Utf8               LocalVariableTable
  #72 = Utf8               name
  #73 = Utf8               MethodParameters
  #74 = Utf8               this
  #75 = Utf8               description
  #76 = Utf8               Signature
  #77 = Utf8               (Ljava/lang/String;)V
  #78 = Utf8               getDescription
  #79 = Utf8               ()Ljava/lang/String;
  #80 = Utf8               <clinit>
  #81 = Utf8               ()V
  #82 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/enums/PunishmentType;>;
  #83 = Utf8               SourceFile
  #84 = Utf8               PunishmentType.java
{
  public static final ext.mods.gameserver.enums.PunishmentType NONE;
    descriptor: Lext/mods/gameserver/enums/PunishmentType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.PunishmentType CHAT;
    descriptor: Lext/mods/gameserver/enums/PunishmentType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.PunishmentType JAIL;
    descriptor: Lext/mods/gameserver/enums/PunishmentType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.PunishmentType CHAR;
    descriptor: Lext/mods/gameserver/enums/PunishmentType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.PunishmentType ACC;
    descriptor: Lext/mods/gameserver/enums/PunishmentType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.PunishmentType[] VALUES;
    descriptor: [Lext/mods/gameserver/enums/PunishmentType;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public static ext.mods.gameserver.enums.PunishmentType[] values();
    descriptor: ()[Lext/mods/gameserver/enums/PunishmentType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #19                 // Field $VALUES:[Lext/mods/gameserver/enums/PunishmentType;
         3: invokevirtual #23                 // Method "[Lext/mods/gameserver/enums/PunishmentType;".clone:()Ljava/lang/Object;
         6: checkcast     #24                 // class "[Lext/mods/gameserver/enums/PunishmentType;"
         9: areturn
      LineNumberTable:
        line 20: 0

  public static ext.mods.gameserver.enums.PunishmentType valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/enums/PunishmentType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/enums/PunishmentType
         2: aload_0
         3: invokestatic  #28                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/enums/PunishmentType
         9: areturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  name   Ljava/lang/String;
    MethodParameters:
      Name                           Flags
      <no name>                      mandated

  public java.lang.String getDescription();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #38                 // Field _description:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 37: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/PunishmentType;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=5, locals=0, args_size=0
         0: new           #1                  // class ext/mods/gameserver/enums/PunishmentType
         3: dup
         4: ldc           #42                 // String NONE
         6: iconst_0
         7: ldc           #43                 // String
         9: invokespecial #45                 // Method "<init>":(Ljava/lang/String;ILjava/lang/String;)V
        12: putstatic     #3                  // Field NONE:Lext/mods/gameserver/enums/PunishmentType;
        15: new           #1                  // class ext/mods/gameserver/enums/PunishmentType
        18: dup
        19: ldc           #48                 // String CHAT
        21: iconst_1
        22: ldc           #49                 // String chat banned
        24: invokespecial #45                 // Method "<init>":(Ljava/lang/String;ILjava/lang/String;)V
        27: putstatic     #7                  // Field CHAT:Lext/mods/gameserver/enums/PunishmentType;
        30: new           #1                  // class ext/mods/gameserver/enums/PunishmentType
        33: dup
        34: ldc           #51                 // String JAIL
        36: iconst_2
        37: ldc           #52                 // String jailed
        39: invokespecial #45                 // Method "<init>":(Ljava/lang/String;ILjava/lang/String;)V
        42: putstatic     #10                 // Field JAIL:Lext/mods/gameserver/enums/PunishmentType;
        45: new           #1                  // class ext/mods/gameserver/enums/PunishmentType
        48: dup
        49: ldc           #54                 // String CHAR
        51: iconst_3
        52: ldc           #55                 // String banned
        54: invokespecial #45                 // Method "<init>":(Ljava/lang/String;ILjava/lang/String;)V
        57: putstatic     #13                 // Field CHAR:Lext/mods/gameserver/enums/PunishmentType;
        60: new           #1                  // class ext/mods/gameserver/enums/PunishmentType
        63: dup
        64: ldc           #57                 // String ACC
        66: iconst_4
        67: ldc           #55                 // String banned
        69: invokespecial #45                 // Method "<init>":(Ljava/lang/String;ILjava/lang/String;)V
        72: putstatic     #16                 // Field ACC:Lext/mods/gameserver/enums/PunishmentType;
        75: invokestatic  #58                 // Method $values:()[Lext/mods/gameserver/enums/PunishmentType;
        78: putstatic     #19                 // Field $VALUES:[Lext/mods/gameserver/enums/PunishmentType;
        81: invokestatic  #62                 // Method values:()[Lext/mods/gameserver/enums/PunishmentType;
        84: putstatic     #65                 // Field VALUES:[Lext/mods/gameserver/enums/PunishmentType;
        87: return
      LineNumberTable:
        line 22: 0
        line 23: 15
        line 24: 30
        line 25: 45
        line 26: 60
        line 20: 75
        line 40: 81
}
Signature: #82                          // Ljava/lang/Enum<Lext/mods/gameserver/enums/PunishmentType;>;
SourceFile: "PunishmentType.java"
