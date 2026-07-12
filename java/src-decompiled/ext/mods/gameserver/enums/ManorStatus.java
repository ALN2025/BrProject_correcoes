// Bytecode for: ext.mods.gameserver.enums.ManorStatus
// File: ext\mods\gameserver\enums\ManorStatus.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/enums/ManorStatus.class
  Last modified 9 de jul de 2026; size 1266 bytes
  MD5 checksum 60ddf01f5357e2fd2451a48d10f712dd
  Compiled from "ManorStatus.java"
public final class ext.mods.gameserver.enums.ManorStatus extends java.lang.Enum<ext.mods.gameserver.enums.ManorStatus>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/enums/ManorStatus
  super_class: #26                        // java/lang/Enum
  interfaces: 0, fields: 5, methods: 5, attributes: 2
Constant pool:
   #1 = Class              #2             // ext/mods/gameserver/enums/ManorStatus
   #2 = Utf8               ext/mods/gameserver/enums/ManorStatus
   #3 = Fieldref           #1.#4          // ext/mods/gameserver/enums/ManorStatus.DISABLED:Lext/mods/gameserver/enums/ManorStatus;
   #4 = NameAndType        #5:#6          // DISABLED:Lext/mods/gameserver/enums/ManorStatus;
   #5 = Utf8               DISABLED
   #6 = Utf8               Lext/mods/gameserver/enums/ManorStatus;
   #7 = Fieldref           #1.#8          // ext/mods/gameserver/enums/ManorStatus.MODIFIABLE:Lext/mods/gameserver/enums/ManorStatus;
   #8 = NameAndType        #9:#6          // MODIFIABLE:Lext/mods/gameserver/enums/ManorStatus;
   #9 = Utf8               MODIFIABLE
  #10 = Fieldref           #1.#11         // ext/mods/gameserver/enums/ManorStatus.MAINTENANCE:Lext/mods/gameserver/enums/ManorStatus;
  #11 = NameAndType        #12:#6         // MAINTENANCE:Lext/mods/gameserver/enums/ManorStatus;
  #12 = Utf8               MAINTENANCE
  #13 = Fieldref           #1.#14         // ext/mods/gameserver/enums/ManorStatus.APPROVED:Lext/mods/gameserver/enums/ManorStatus;
  #14 = NameAndType        #15:#6         // APPROVED:Lext/mods/gameserver/enums/ManorStatus;
  #15 = Utf8               APPROVED
  #16 = Fieldref           #1.#17         // ext/mods/gameserver/enums/ManorStatus.$VALUES:[Lext/mods/gameserver/enums/ManorStatus;
  #17 = NameAndType        #18:#19        // $VALUES:[Lext/mods/gameserver/enums/ManorStatus;
  #18 = Utf8               $VALUES
  #19 = Utf8               [Lext/mods/gameserver/enums/ManorStatus;
  #20 = Methodref          #21.#22        // "[Lext/mods/gameserver/enums/ManorStatus;".clone:()Ljava/lang/Object;
  #21 = Class              #19            // "[Lext/mods/gameserver/enums/ManorStatus;"
  #22 = NameAndType        #23:#24        // clone:()Ljava/lang/Object;
  #23 = Utf8               clone
  #24 = Utf8               ()Ljava/lang/Object;
  #25 = Methodref          #26.#27        // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #26 = Class              #28            // java/lang/Enum
  #27 = NameAndType        #29:#30        // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #28 = Utf8               java/lang/Enum
  #29 = Utf8               valueOf
  #30 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #31 = Methodref          #26.#32        // java/lang/Enum."<init>":(Ljava/lang/String;I)V
  #32 = NameAndType        #33:#34        // "<init>":(Ljava/lang/String;I)V
  #33 = Utf8               <init>
  #34 = Utf8               (Ljava/lang/String;I)V
  #35 = String             #5             // DISABLED
  #36 = Methodref          #1.#32         // ext/mods/gameserver/enums/ManorStatus."<init>":(Ljava/lang/String;I)V
  #37 = String             #9             // MODIFIABLE
  #38 = String             #12            // MAINTENANCE
  #39 = String             #15            // APPROVED
  #40 = Methodref          #1.#41         // ext/mods/gameserver/enums/ManorStatus.$values:()[Lext/mods/gameserver/enums/ManorStatus;
  #41 = NameAndType        #42:#43        // $values:()[Lext/mods/gameserver/enums/ManorStatus;
  #42 = Utf8               $values
  #43 = Utf8               ()[Lext/mods/gameserver/enums/ManorStatus;
  #44 = Utf8               values
  #45 = Utf8               Code
  #46 = Utf8               LineNumberTable
  #47 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/ManorStatus;
  #48 = Utf8               LocalVariableTable
  #49 = Utf8               name
  #50 = Utf8               Ljava/lang/String;
  #51 = Utf8               MethodParameters
  #52 = Utf8               this
  #53 = Utf8               Signature
  #54 = Utf8               ()V
  #55 = Utf8               <clinit>
  #56 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/enums/ManorStatus;>;
  #57 = Utf8               SourceFile
  #58 = Utf8               ManorStatus.java
{
  public static final ext.mods.gameserver.enums.ManorStatus DISABLED;
    descriptor: Lext/mods/gameserver/enums/ManorStatus;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.ManorStatus MODIFIABLE;
    descriptor: Lext/mods/gameserver/enums/ManorStatus;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.ManorStatus MAINTENANCE;
    descriptor: Lext/mods/gameserver/enums/ManorStatus;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.ManorStatus APPROVED;
    descriptor: Lext/mods/gameserver/enums/ManorStatus;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static ext.mods.gameserver.enums.ManorStatus[] values();
    descriptor: ()[Lext/mods/gameserver/enums/ManorStatus;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #16                 // Field $VALUES:[Lext/mods/gameserver/enums/ManorStatus;
         3: invokevirtual #20                 // Method "[Lext/mods/gameserver/enums/ManorStatus;".clone:()Ljava/lang/Object;
         6: checkcast     #21                 // class "[Lext/mods/gameserver/enums/ManorStatus;"
         9: areturn
      LineNumberTable:
        line 20: 0

  public static ext.mods.gameserver.enums.ManorStatus valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/enums/ManorStatus;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/enums/ManorStatus
         2: aload_0
         3: invokestatic  #25                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/enums/ManorStatus
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
         0: new           #1                  // class ext/mods/gameserver/enums/ManorStatus
         3: dup
         4: ldc           #35                 // String DISABLED
         6: iconst_0
         7: invokespecial #36                 // Method "<init>":(Ljava/lang/String;I)V
        10: putstatic     #3                  // Field DISABLED:Lext/mods/gameserver/enums/ManorStatus;
        13: new           #1                  // class ext/mods/gameserver/enums/ManorStatus
        16: dup
        17: ldc           #37                 // String MODIFIABLE
        19: iconst_1
        20: invokespecial #36                 // Method "<init>":(Ljava/lang/String;I)V
        23: putstatic     #7                  // Field MODIFIABLE:Lext/mods/gameserver/enums/ManorStatus;
        26: new           #1                  // class ext/mods/gameserver/enums/ManorStatus
        29: dup
        30: ldc           #38                 // String MAINTENANCE
        32: iconst_2
        33: invokespecial #36                 // Method "<init>":(Ljava/lang/String;I)V
        36: putstatic     #10                 // Field MAINTENANCE:Lext/mods/gameserver/enums/ManorStatus;
        39: new           #1                  // class ext/mods/gameserver/enums/ManorStatus
        42: dup
        43: ldc           #39                 // String APPROVED
        45: iconst_3
        46: invokespecial #36                 // Method "<init>":(Ljava/lang/String;I)V
        49: putstatic     #13                 // Field APPROVED:Lext/mods/gameserver/enums/ManorStatus;
        52: invokestatic  #40                 // Method $values:()[Lext/mods/gameserver/enums/ManorStatus;
        55: putstatic     #16                 // Field $VALUES:[Lext/mods/gameserver/enums/ManorStatus;
        58: return
      LineNumberTable:
        line 22: 0
        line 23: 13
        line 24: 26
        line 25: 39
        line 20: 52
}
Signature: #56                          // Ljava/lang/Enum<Lext/mods/gameserver/enums/ManorStatus;>;
SourceFile: "ManorStatus.java"
