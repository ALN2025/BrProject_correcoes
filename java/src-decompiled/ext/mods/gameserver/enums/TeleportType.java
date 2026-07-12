// Bytecode for: ext.mods.gameserver.enums.TeleportType
// File: ext\mods\gameserver\enums\TeleportType.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/enums/TeleportType.class
  Last modified 9 de jul de 2026; size 1473 bytes
  MD5 checksum 14b92f3ac90aabe5880b503e4347852d
  Compiled from "TeleportType.java"
public final class ext.mods.gameserver.enums.TeleportType extends java.lang.Enum<ext.mods.gameserver.enums.TeleportType>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/enums/TeleportType
  super_class: #35                        // java/lang/Enum
  interfaces: 0, fields: 8, methods: 5, attributes: 2
Constant pool:
   #1 = Class              #2             // ext/mods/gameserver/enums/TeleportType
   #2 = Utf8               ext/mods/gameserver/enums/TeleportType
   #3 = Fieldref           #1.#4          // ext/mods/gameserver/enums/TeleportType.STANDARD:Lext/mods/gameserver/enums/TeleportType;
   #4 = NameAndType        #5:#6          // STANDARD:Lext/mods/gameserver/enums/TeleportType;
   #5 = Utf8               STANDARD
   #6 = Utf8               Lext/mods/gameserver/enums/TeleportType;
   #7 = Fieldref           #1.#8          // ext/mods/gameserver/enums/TeleportType.NEWBIE_TOKEN:Lext/mods/gameserver/enums/TeleportType;
   #8 = NameAndType        #9:#6          // NEWBIE_TOKEN:Lext/mods/gameserver/enums/TeleportType;
   #9 = Utf8               NEWBIE_TOKEN
  #10 = Fieldref           #1.#11         // ext/mods/gameserver/enums/TeleportType.NOBLE_HUNTING_ZONE_PASS:Lext/mods/gameserver/enums/TeleportType;
  #11 = NameAndType        #12:#6         // NOBLE_HUNTING_ZONE_PASS:Lext/mods/gameserver/enums/TeleportType;
  #12 = Utf8               NOBLE_HUNTING_ZONE_PASS
  #13 = Fieldref           #1.#14         // ext/mods/gameserver/enums/TeleportType.NOBLE_HUNTING_ZONE_ADENA:Lext/mods/gameserver/enums/TeleportType;
  #14 = NameAndType        #15:#6         // NOBLE_HUNTING_ZONE_ADENA:Lext/mods/gameserver/enums/TeleportType;
  #15 = Utf8               NOBLE_HUNTING_ZONE_ADENA
  #16 = Fieldref           #1.#17         // ext/mods/gameserver/enums/TeleportType.ALLY:Lext/mods/gameserver/enums/TeleportType;
  #17 = NameAndType        #18:#6         // ALLY:Lext/mods/gameserver/enums/TeleportType;
  #18 = Utf8               ALLY
  #19 = Fieldref           #1.#20         // ext/mods/gameserver/enums/TeleportType.CHF_LEVEL_1:Lext/mods/gameserver/enums/TeleportType;
  #20 = NameAndType        #21:#6         // CHF_LEVEL_1:Lext/mods/gameserver/enums/TeleportType;
  #21 = Utf8               CHF_LEVEL_1
  #22 = Fieldref           #1.#23         // ext/mods/gameserver/enums/TeleportType.CHF_LEVEL_2:Lext/mods/gameserver/enums/TeleportType;
  #23 = NameAndType        #24:#6         // CHF_LEVEL_2:Lext/mods/gameserver/enums/TeleportType;
  #24 = Utf8               CHF_LEVEL_2
  #25 = Fieldref           #1.#26         // ext/mods/gameserver/enums/TeleportType.$VALUES:[Lext/mods/gameserver/enums/TeleportType;
  #26 = NameAndType        #27:#28        // $VALUES:[Lext/mods/gameserver/enums/TeleportType;
  #27 = Utf8               $VALUES
  #28 = Utf8               [Lext/mods/gameserver/enums/TeleportType;
  #29 = Methodref          #30.#31        // "[Lext/mods/gameserver/enums/TeleportType;".clone:()Ljava/lang/Object;
  #30 = Class              #28            // "[Lext/mods/gameserver/enums/TeleportType;"
  #31 = NameAndType        #32:#33        // clone:()Ljava/lang/Object;
  #32 = Utf8               clone
  #33 = Utf8               ()Ljava/lang/Object;
  #34 = Methodref          #35.#36        // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #35 = Class              #37            // java/lang/Enum
  #36 = NameAndType        #38:#39        // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #37 = Utf8               java/lang/Enum
  #38 = Utf8               valueOf
  #39 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #40 = Methodref          #35.#41        // java/lang/Enum."<init>":(Ljava/lang/String;I)V
  #41 = NameAndType        #42:#43        // "<init>":(Ljava/lang/String;I)V
  #42 = Utf8               <init>
  #43 = Utf8               (Ljava/lang/String;I)V
  #44 = String             #5             // STANDARD
  #45 = Methodref          #1.#41         // ext/mods/gameserver/enums/TeleportType."<init>":(Ljava/lang/String;I)V
  #46 = String             #9             // NEWBIE_TOKEN
  #47 = String             #12            // NOBLE_HUNTING_ZONE_PASS
  #48 = String             #15            // NOBLE_HUNTING_ZONE_ADENA
  #49 = String             #18            // ALLY
  #50 = String             #21            // CHF_LEVEL_1
  #51 = String             #24            // CHF_LEVEL_2
  #52 = Methodref          #1.#53         // ext/mods/gameserver/enums/TeleportType.$values:()[Lext/mods/gameserver/enums/TeleportType;
  #53 = NameAndType        #54:#55        // $values:()[Lext/mods/gameserver/enums/TeleportType;
  #54 = Utf8               $values
  #55 = Utf8               ()[Lext/mods/gameserver/enums/TeleportType;
  #56 = Utf8               values
  #57 = Utf8               Code
  #58 = Utf8               LineNumberTable
  #59 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/TeleportType;
  #60 = Utf8               LocalVariableTable
  #61 = Utf8               name
  #62 = Utf8               Ljava/lang/String;
  #63 = Utf8               MethodParameters
  #64 = Utf8               this
  #65 = Utf8               Signature
  #66 = Utf8               ()V
  #67 = Utf8               <clinit>
  #68 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/enums/TeleportType;>;
  #69 = Utf8               SourceFile
  #70 = Utf8               TeleportType.java
{
  public static final ext.mods.gameserver.enums.TeleportType STANDARD;
    descriptor: Lext/mods/gameserver/enums/TeleportType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.TeleportType NEWBIE_TOKEN;
    descriptor: Lext/mods/gameserver/enums/TeleportType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.TeleportType NOBLE_HUNTING_ZONE_PASS;
    descriptor: Lext/mods/gameserver/enums/TeleportType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.TeleportType NOBLE_HUNTING_ZONE_ADENA;
    descriptor: Lext/mods/gameserver/enums/TeleportType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.TeleportType ALLY;
    descriptor: Lext/mods/gameserver/enums/TeleportType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.TeleportType CHF_LEVEL_1;
    descriptor: Lext/mods/gameserver/enums/TeleportType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.TeleportType CHF_LEVEL_2;
    descriptor: Lext/mods/gameserver/enums/TeleportType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static ext.mods.gameserver.enums.TeleportType[] values();
    descriptor: ()[Lext/mods/gameserver/enums/TeleportType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #25                 // Field $VALUES:[Lext/mods/gameserver/enums/TeleportType;
         3: invokevirtual #29                 // Method "[Lext/mods/gameserver/enums/TeleportType;".clone:()Ljava/lang/Object;
         6: checkcast     #30                 // class "[Lext/mods/gameserver/enums/TeleportType;"
         9: areturn
      LineNumberTable:
        line 23: 0

  public static ext.mods.gameserver.enums.TeleportType valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/enums/TeleportType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/enums/TeleportType
         2: aload_0
         3: invokestatic  #34                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/enums/TeleportType
         9: areturn
      LineNumberTable:
        line 23: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  name   Ljava/lang/String;
    MethodParameters:
      Name                           Flags
      <no name>                      mandated

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: new           #1                  // class ext/mods/gameserver/enums/TeleportType
         3: dup
         4: ldc           #44                 // String STANDARD
         6: iconst_0
         7: invokespecial #45                 // Method "<init>":(Ljava/lang/String;I)V
        10: putstatic     #3                  // Field STANDARD:Lext/mods/gameserver/enums/TeleportType;
        13: new           #1                  // class ext/mods/gameserver/enums/TeleportType
        16: dup
        17: ldc           #46                 // String NEWBIE_TOKEN
        19: iconst_1
        20: invokespecial #45                 // Method "<init>":(Ljava/lang/String;I)V
        23: putstatic     #7                  // Field NEWBIE_TOKEN:Lext/mods/gameserver/enums/TeleportType;
        26: new           #1                  // class ext/mods/gameserver/enums/TeleportType
        29: dup
        30: ldc           #47                 // String NOBLE_HUNTING_ZONE_PASS
        32: iconst_2
        33: invokespecial #45                 // Method "<init>":(Ljava/lang/String;I)V
        36: putstatic     #10                 // Field NOBLE_HUNTING_ZONE_PASS:Lext/mods/gameserver/enums/TeleportType;
        39: new           #1                  // class ext/mods/gameserver/enums/TeleportType
        42: dup
        43: ldc           #48                 // String NOBLE_HUNTING_ZONE_ADENA
        45: iconst_3
        46: invokespecial #45                 // Method "<init>":(Ljava/lang/String;I)V
        49: putstatic     #13                 // Field NOBLE_HUNTING_ZONE_ADENA:Lext/mods/gameserver/enums/TeleportType;
        52: new           #1                  // class ext/mods/gameserver/enums/TeleportType
        55: dup
        56: ldc           #49                 // String ALLY
        58: iconst_4
        59: invokespecial #45                 // Method "<init>":(Ljava/lang/String;I)V
        62: putstatic     #16                 // Field ALLY:Lext/mods/gameserver/enums/TeleportType;
        65: new           #1                  // class ext/mods/gameserver/enums/TeleportType
        68: dup
        69: ldc           #50                 // String CHF_LEVEL_1
        71: iconst_5
        72: invokespecial #45                 // Method "<init>":(Ljava/lang/String;I)V
        75: putstatic     #19                 // Field CHF_LEVEL_1:Lext/mods/gameserver/enums/TeleportType;
        78: new           #1                  // class ext/mods/gameserver/enums/TeleportType
        81: dup
        82: ldc           #51                 // String CHF_LEVEL_2
        84: bipush        6
        86: invokespecial #45                 // Method "<init>":(Ljava/lang/String;I)V
        89: putstatic     #22                 // Field CHF_LEVEL_2:Lext/mods/gameserver/enums/TeleportType;
        92: invokestatic  #52                 // Method $values:()[Lext/mods/gameserver/enums/TeleportType;
        95: putstatic     #25                 // Field $VALUES:[Lext/mods/gameserver/enums/TeleportType;
        98: return
      LineNumberTable:
        line 29: 0
        line 35: 13
        line 41: 26
        line 47: 39
        line 53: 52
        line 59: 65
        line 65: 78
        line 23: 92
}
Signature: #68                          // Ljava/lang/Enum<Lext/mods/gameserver/enums/TeleportType;>;
SourceFile: "TeleportType.java"
