// Bytecode for: ext.mods.gameserver.enums.duels.DuelResult
// File: ext\mods\gameserver\enums\duels\DuelResult.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/enums/duels/DuelResult.class
  Last modified 9 de jul de 2026; size 1477 bytes
  MD5 checksum c09b58fafaaab7c4f9a819e6d519cb25
  Compiled from "DuelResult.java"
public final class ext.mods.gameserver.enums.duels.DuelResult extends java.lang.Enum<ext.mods.gameserver.enums.duels.DuelResult>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/enums/duels/DuelResult
  super_class: #35                        // java/lang/Enum
  interfaces: 0, fields: 8, methods: 5, attributes: 2
Constant pool:
   #1 = Class              #2             // ext/mods/gameserver/enums/duels/DuelResult
   #2 = Utf8               ext/mods/gameserver/enums/duels/DuelResult
   #3 = Fieldref           #1.#4          // ext/mods/gameserver/enums/duels/DuelResult.CONTINUE:Lext/mods/gameserver/enums/duels/DuelResult;
   #4 = NameAndType        #5:#6          // CONTINUE:Lext/mods/gameserver/enums/duels/DuelResult;
   #5 = Utf8               CONTINUE
   #6 = Utf8               Lext/mods/gameserver/enums/duels/DuelResult;
   #7 = Fieldref           #1.#8          // ext/mods/gameserver/enums/duels/DuelResult.TEAM_1_WIN:Lext/mods/gameserver/enums/duels/DuelResult;
   #8 = NameAndType        #9:#6          // TEAM_1_WIN:Lext/mods/gameserver/enums/duels/DuelResult;
   #9 = Utf8               TEAM_1_WIN
  #10 = Fieldref           #1.#11         // ext/mods/gameserver/enums/duels/DuelResult.TEAM_2_WIN:Lext/mods/gameserver/enums/duels/DuelResult;
  #11 = NameAndType        #12:#6         // TEAM_2_WIN:Lext/mods/gameserver/enums/duels/DuelResult;
  #12 = Utf8               TEAM_2_WIN
  #13 = Fieldref           #1.#14         // ext/mods/gameserver/enums/duels/DuelResult.TEAM_1_SURRENDER:Lext/mods/gameserver/enums/duels/DuelResult;
  #14 = NameAndType        #15:#6         // TEAM_1_SURRENDER:Lext/mods/gameserver/enums/duels/DuelResult;
  #15 = Utf8               TEAM_1_SURRENDER
  #16 = Fieldref           #1.#17         // ext/mods/gameserver/enums/duels/DuelResult.TEAM_2_SURRENDER:Lext/mods/gameserver/enums/duels/DuelResult;
  #17 = NameAndType        #18:#6         // TEAM_2_SURRENDER:Lext/mods/gameserver/enums/duels/DuelResult;
  #18 = Utf8               TEAM_2_SURRENDER
  #19 = Fieldref           #1.#20         // ext/mods/gameserver/enums/duels/DuelResult.CANCELED:Lext/mods/gameserver/enums/duels/DuelResult;
  #20 = NameAndType        #21:#6         // CANCELED:Lext/mods/gameserver/enums/duels/DuelResult;
  #21 = Utf8               CANCELED
  #22 = Fieldref           #1.#23         // ext/mods/gameserver/enums/duels/DuelResult.TIMEOUT:Lext/mods/gameserver/enums/duels/DuelResult;
  #23 = NameAndType        #24:#6         // TIMEOUT:Lext/mods/gameserver/enums/duels/DuelResult;
  #24 = Utf8               TIMEOUT
  #25 = Fieldref           #1.#26         // ext/mods/gameserver/enums/duels/DuelResult.$VALUES:[Lext/mods/gameserver/enums/duels/DuelResult;
  #26 = NameAndType        #27:#28        // $VALUES:[Lext/mods/gameserver/enums/duels/DuelResult;
  #27 = Utf8               $VALUES
  #28 = Utf8               [Lext/mods/gameserver/enums/duels/DuelResult;
  #29 = Methodref          #30.#31        // "[Lext/mods/gameserver/enums/duels/DuelResult;".clone:()Ljava/lang/Object;
  #30 = Class              #28            // "[Lext/mods/gameserver/enums/duels/DuelResult;"
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
  #44 = String             #5             // CONTINUE
  #45 = Methodref          #1.#41         // ext/mods/gameserver/enums/duels/DuelResult."<init>":(Ljava/lang/String;I)V
  #46 = String             #9             // TEAM_1_WIN
  #47 = String             #12            // TEAM_2_WIN
  #48 = String             #15            // TEAM_1_SURRENDER
  #49 = String             #18            // TEAM_2_SURRENDER
  #50 = String             #21            // CANCELED
  #51 = String             #24            // TIMEOUT
  #52 = Methodref          #1.#53         // ext/mods/gameserver/enums/duels/DuelResult.$values:()[Lext/mods/gameserver/enums/duels/DuelResult;
  #53 = NameAndType        #54:#55        // $values:()[Lext/mods/gameserver/enums/duels/DuelResult;
  #54 = Utf8               $values
  #55 = Utf8               ()[Lext/mods/gameserver/enums/duels/DuelResult;
  #56 = Utf8               values
  #57 = Utf8               Code
  #58 = Utf8               LineNumberTable
  #59 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/duels/DuelResult;
  #60 = Utf8               LocalVariableTable
  #61 = Utf8               name
  #62 = Utf8               Ljava/lang/String;
  #63 = Utf8               MethodParameters
  #64 = Utf8               this
  #65 = Utf8               Signature
  #66 = Utf8               ()V
  #67 = Utf8               <clinit>
  #68 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/enums/duels/DuelResult;>;
  #69 = Utf8               SourceFile
  #70 = Utf8               DuelResult.java
{
  public static final ext.mods.gameserver.enums.duels.DuelResult CONTINUE;
    descriptor: Lext/mods/gameserver/enums/duels/DuelResult;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.duels.DuelResult TEAM_1_WIN;
    descriptor: Lext/mods/gameserver/enums/duels/DuelResult;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.duels.DuelResult TEAM_2_WIN;
    descriptor: Lext/mods/gameserver/enums/duels/DuelResult;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.duels.DuelResult TEAM_1_SURRENDER;
    descriptor: Lext/mods/gameserver/enums/duels/DuelResult;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.duels.DuelResult TEAM_2_SURRENDER;
    descriptor: Lext/mods/gameserver/enums/duels/DuelResult;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.duels.DuelResult CANCELED;
    descriptor: Lext/mods/gameserver/enums/duels/DuelResult;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.duels.DuelResult TIMEOUT;
    descriptor: Lext/mods/gameserver/enums/duels/DuelResult;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static ext.mods.gameserver.enums.duels.DuelResult[] values();
    descriptor: ()[Lext/mods/gameserver/enums/duels/DuelResult;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #25                 // Field $VALUES:[Lext/mods/gameserver/enums/duels/DuelResult;
         3: invokevirtual #29                 // Method "[Lext/mods/gameserver/enums/duels/DuelResult;".clone:()Ljava/lang/Object;
         6: checkcast     #30                 // class "[Lext/mods/gameserver/enums/duels/DuelResult;"
         9: areturn
      LineNumberTable:
        line 20: 0

  public static ext.mods.gameserver.enums.duels.DuelResult valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/enums/duels/DuelResult;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/enums/duels/DuelResult
         2: aload_0
         3: invokestatic  #34                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/enums/duels/DuelResult
         9: areturn
      LineNumberTable:
        line 20: 0
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
         0: new           #1                  // class ext/mods/gameserver/enums/duels/DuelResult
         3: dup
         4: ldc           #44                 // String CONTINUE
         6: iconst_0
         7: invokespecial #45                 // Method "<init>":(Ljava/lang/String;I)V
        10: putstatic     #3                  // Field CONTINUE:Lext/mods/gameserver/enums/duels/DuelResult;
        13: new           #1                  // class ext/mods/gameserver/enums/duels/DuelResult
        16: dup
        17: ldc           #46                 // String TEAM_1_WIN
        19: iconst_1
        20: invokespecial #45                 // Method "<init>":(Ljava/lang/String;I)V
        23: putstatic     #7                  // Field TEAM_1_WIN:Lext/mods/gameserver/enums/duels/DuelResult;
        26: new           #1                  // class ext/mods/gameserver/enums/duels/DuelResult
        29: dup
        30: ldc           #47                 // String TEAM_2_WIN
        32: iconst_2
        33: invokespecial #45                 // Method "<init>":(Ljava/lang/String;I)V
        36: putstatic     #10                 // Field TEAM_2_WIN:Lext/mods/gameserver/enums/duels/DuelResult;
        39: new           #1                  // class ext/mods/gameserver/enums/duels/DuelResult
        42: dup
        43: ldc           #48                 // String TEAM_1_SURRENDER
        45: iconst_3
        46: invokespecial #45                 // Method "<init>":(Ljava/lang/String;I)V
        49: putstatic     #13                 // Field TEAM_1_SURRENDER:Lext/mods/gameserver/enums/duels/DuelResult;
        52: new           #1                  // class ext/mods/gameserver/enums/duels/DuelResult
        55: dup
        56: ldc           #49                 // String TEAM_2_SURRENDER
        58: iconst_4
        59: invokespecial #45                 // Method "<init>":(Ljava/lang/String;I)V
        62: putstatic     #16                 // Field TEAM_2_SURRENDER:Lext/mods/gameserver/enums/duels/DuelResult;
        65: new           #1                  // class ext/mods/gameserver/enums/duels/DuelResult
        68: dup
        69: ldc           #50                 // String CANCELED
        71: iconst_5
        72: invokespecial #45                 // Method "<init>":(Ljava/lang/String;I)V
        75: putstatic     #19                 // Field CANCELED:Lext/mods/gameserver/enums/duels/DuelResult;
        78: new           #1                  // class ext/mods/gameserver/enums/duels/DuelResult
        81: dup
        82: ldc           #51                 // String TIMEOUT
        84: bipush        6
        86: invokespecial #45                 // Method "<init>":(Ljava/lang/String;I)V
        89: putstatic     #22                 // Field TIMEOUT:Lext/mods/gameserver/enums/duels/DuelResult;
        92: invokestatic  #52                 // Method $values:()[Lext/mods/gameserver/enums/duels/DuelResult;
        95: putstatic     #25                 // Field $VALUES:[Lext/mods/gameserver/enums/duels/DuelResult;
        98: return
      LineNumberTable:
        line 22: 0
        line 23: 13
        line 24: 26
        line 25: 39
        line 26: 52
        line 27: 65
        line 28: 78
        line 20: 92
}
Signature: #68                          // Ljava/lang/Enum<Lext/mods/gameserver/enums/duels/DuelResult;>;
SourceFile: "DuelResult.java"
