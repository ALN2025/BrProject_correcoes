// Bytecode for: ext.mods.gameserver.enums.FailReason
// File: ext\mods\gameserver\enums\FailReason.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/enums/FailReason.class
  Last modified 9 de jul de 2026; size 1853 bytes
  MD5 checksum 05518e5627426af776cdccbd9bfe5e98
  Compiled from "FailReason.java"
public final class ext.mods.gameserver.enums.FailReason extends java.lang.Enum<ext.mods.gameserver.enums.FailReason>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/enums/FailReason
  super_class: #47                        // java/lang/Enum
  interfaces: 0, fields: 12, methods: 5, attributes: 2
Constant pool:
   #1 = Class              #2             // ext/mods/gameserver/enums/FailReason
   #2 = Utf8               ext/mods/gameserver/enums/FailReason
   #3 = Fieldref           #1.#4          // ext/mods/gameserver/enums/FailReason.NO_TEXT:Lext/mods/gameserver/enums/FailReason;
   #4 = NameAndType        #5:#6          // NO_TEXT:Lext/mods/gameserver/enums/FailReason;
   #5 = Utf8               NO_TEXT
   #6 = Utf8               Lext/mods/gameserver/enums/FailReason;
   #7 = Fieldref           #1.#8          // ext/mods/gameserver/enums/FailReason.SYSTEM_ERROR_LOGIN_LATER:Lext/mods/gameserver/enums/FailReason;
   #8 = NameAndType        #9:#6          // SYSTEM_ERROR_LOGIN_LATER:Lext/mods/gameserver/enums/FailReason;
   #9 = Utf8               SYSTEM_ERROR_LOGIN_LATER
  #10 = Fieldref           #1.#11         // ext/mods/gameserver/enums/FailReason.PASSWORD_DOES_NOT_MATCH_THIS_ACCOUNT:Lext/mods/gameserver/enums/FailReason;
  #11 = NameAndType        #12:#6         // PASSWORD_DOES_NOT_MATCH_THIS_ACCOUNT:Lext/mods/gameserver/enums/FailReason;
  #12 = Utf8               PASSWORD_DOES_NOT_MATCH_THIS_ACCOUNT
  #13 = Fieldref           #1.#14         // ext/mods/gameserver/enums/FailReason.PASSWORD_DOES_NOT_MATCH_THIS_ACCOUNT2:Lext/mods/gameserver/enums/FailReason;
  #14 = NameAndType        #15:#6         // PASSWORD_DOES_NOT_MATCH_THIS_ACCOUNT2:Lext/mods/gameserver/enums/FailReason;
  #15 = Utf8               PASSWORD_DOES_NOT_MATCH_THIS_ACCOUNT2
  #16 = Fieldref           #1.#17         // ext/mods/gameserver/enums/FailReason.ACCESS_FAILED_TRY_LATER:Lext/mods/gameserver/enums/FailReason;
  #17 = NameAndType        #18:#6         // ACCESS_FAILED_TRY_LATER:Lext/mods/gameserver/enums/FailReason;
  #18 = Utf8               ACCESS_FAILED_TRY_LATER
  #19 = Fieldref           #1.#20         // ext/mods/gameserver/enums/FailReason.INCORRECT_ACCOUNT_INFO_CONTACT_CUSTOMER_SUPPORT:Lext/mods/gameserver/enums/FailReason;
  #20 = NameAndType        #21:#6         // INCORRECT_ACCOUNT_INFO_CONTACT_CUSTOMER_SUPPORT:Lext/mods/gameserver/enums/FailReason;
  #21 = Utf8               INCORRECT_ACCOUNT_INFO_CONTACT_CUSTOMER_SUPPORT
  #22 = Fieldref           #1.#23         // ext/mods/gameserver/enums/FailReason.ACCESS_FAILED_TRY_LATER2:Lext/mods/gameserver/enums/FailReason;
  #23 = NameAndType        #24:#6         // ACCESS_FAILED_TRY_LATER2:Lext/mods/gameserver/enums/FailReason;
  #24 = Utf8               ACCESS_FAILED_TRY_LATER2
  #25 = Fieldref           #1.#26         // ext/mods/gameserver/enums/FailReason.ACOUNT_ALREADY_IN_USE:Lext/mods/gameserver/enums/FailReason;
  #26 = NameAndType        #27:#6         // ACOUNT_ALREADY_IN_USE:Lext/mods/gameserver/enums/FailReason;
  #27 = Utf8               ACOUNT_ALREADY_IN_USE
  #28 = Fieldref           #1.#29         // ext/mods/gameserver/enums/FailReason.ACCESS_FAILED_TRY_LATER3:Lext/mods/gameserver/enums/FailReason;
  #29 = NameAndType        #30:#6         // ACCESS_FAILED_TRY_LATER3:Lext/mods/gameserver/enums/FailReason;
  #30 = Utf8               ACCESS_FAILED_TRY_LATER3
  #31 = Fieldref           #1.#32         // ext/mods/gameserver/enums/FailReason.ACCESS_FAILED_TRY_LATER4:Lext/mods/gameserver/enums/FailReason;
  #32 = NameAndType        #33:#6         // ACCESS_FAILED_TRY_LATER4:Lext/mods/gameserver/enums/FailReason;
  #33 = Utf8               ACCESS_FAILED_TRY_LATER4
  #34 = Fieldref           #1.#35         // ext/mods/gameserver/enums/FailReason.ACCESS_FAILED_TRY_LATER5:Lext/mods/gameserver/enums/FailReason;
  #35 = NameAndType        #36:#6         // ACCESS_FAILED_TRY_LATER5:Lext/mods/gameserver/enums/FailReason;
  #36 = Utf8               ACCESS_FAILED_TRY_LATER5
  #37 = Fieldref           #1.#38         // ext/mods/gameserver/enums/FailReason.$VALUES:[Lext/mods/gameserver/enums/FailReason;
  #38 = NameAndType        #39:#40        // $VALUES:[Lext/mods/gameserver/enums/FailReason;
  #39 = Utf8               $VALUES
  #40 = Utf8               [Lext/mods/gameserver/enums/FailReason;
  #41 = Methodref          #42.#43        // "[Lext/mods/gameserver/enums/FailReason;".clone:()Ljava/lang/Object;
  #42 = Class              #40            // "[Lext/mods/gameserver/enums/FailReason;"
  #43 = NameAndType        #44:#45        // clone:()Ljava/lang/Object;
  #44 = Utf8               clone
  #45 = Utf8               ()Ljava/lang/Object;
  #46 = Methodref          #47.#48        // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #47 = Class              #49            // java/lang/Enum
  #48 = NameAndType        #50:#51        // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #49 = Utf8               java/lang/Enum
  #50 = Utf8               valueOf
  #51 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #52 = Methodref          #47.#53        // java/lang/Enum."<init>":(Ljava/lang/String;I)V
  #53 = NameAndType        #54:#55        // "<init>":(Ljava/lang/String;I)V
  #54 = Utf8               <init>
  #55 = Utf8               (Ljava/lang/String;I)V
  #56 = String             #5             // NO_TEXT
  #57 = Methodref          #1.#53         // ext/mods/gameserver/enums/FailReason."<init>":(Ljava/lang/String;I)V
  #58 = String             #9             // SYSTEM_ERROR_LOGIN_LATER
  #59 = String             #12            // PASSWORD_DOES_NOT_MATCH_THIS_ACCOUNT
  #60 = String             #15            // PASSWORD_DOES_NOT_MATCH_THIS_ACCOUNT2
  #61 = String             #18            // ACCESS_FAILED_TRY_LATER
  #62 = String             #21            // INCORRECT_ACCOUNT_INFO_CONTACT_CUSTOMER_SUPPORT
  #63 = String             #24            // ACCESS_FAILED_TRY_LATER2
  #64 = String             #27            // ACOUNT_ALREADY_IN_USE
  #65 = String             #30            // ACCESS_FAILED_TRY_LATER3
  #66 = String             #33            // ACCESS_FAILED_TRY_LATER4
  #67 = String             #36            // ACCESS_FAILED_TRY_LATER5
  #68 = Methodref          #1.#69         // ext/mods/gameserver/enums/FailReason.$values:()[Lext/mods/gameserver/enums/FailReason;
  #69 = NameAndType        #70:#71        // $values:()[Lext/mods/gameserver/enums/FailReason;
  #70 = Utf8               $values
  #71 = Utf8               ()[Lext/mods/gameserver/enums/FailReason;
  #72 = Utf8               values
  #73 = Utf8               Code
  #74 = Utf8               LineNumberTable
  #75 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/FailReason;
  #76 = Utf8               LocalVariableTable
  #77 = Utf8               name
  #78 = Utf8               Ljava/lang/String;
  #79 = Utf8               MethodParameters
  #80 = Utf8               this
  #81 = Utf8               Signature
  #82 = Utf8               ()V
  #83 = Utf8               <clinit>
  #84 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/enums/FailReason;>;
  #85 = Utf8               SourceFile
  #86 = Utf8               FailReason.java
{
  public static final ext.mods.gameserver.enums.FailReason NO_TEXT;
    descriptor: Lext/mods/gameserver/enums/FailReason;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.FailReason SYSTEM_ERROR_LOGIN_LATER;
    descriptor: Lext/mods/gameserver/enums/FailReason;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.FailReason PASSWORD_DOES_NOT_MATCH_THIS_ACCOUNT;
    descriptor: Lext/mods/gameserver/enums/FailReason;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.FailReason PASSWORD_DOES_NOT_MATCH_THIS_ACCOUNT2;
    descriptor: Lext/mods/gameserver/enums/FailReason;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.FailReason ACCESS_FAILED_TRY_LATER;
    descriptor: Lext/mods/gameserver/enums/FailReason;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.FailReason INCORRECT_ACCOUNT_INFO_CONTACT_CUSTOMER_SUPPORT;
    descriptor: Lext/mods/gameserver/enums/FailReason;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.FailReason ACCESS_FAILED_TRY_LATER2;
    descriptor: Lext/mods/gameserver/enums/FailReason;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.FailReason ACOUNT_ALREADY_IN_USE;
    descriptor: Lext/mods/gameserver/enums/FailReason;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.FailReason ACCESS_FAILED_TRY_LATER3;
    descriptor: Lext/mods/gameserver/enums/FailReason;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.FailReason ACCESS_FAILED_TRY_LATER4;
    descriptor: Lext/mods/gameserver/enums/FailReason;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.FailReason ACCESS_FAILED_TRY_LATER5;
    descriptor: Lext/mods/gameserver/enums/FailReason;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static ext.mods.gameserver.enums.FailReason[] values();
    descriptor: ()[Lext/mods/gameserver/enums/FailReason;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #37                 // Field $VALUES:[Lext/mods/gameserver/enums/FailReason;
         3: invokevirtual #41                 // Method "[Lext/mods/gameserver/enums/FailReason;".clone:()Ljava/lang/Object;
         6: checkcast     #42                 // class "[Lext/mods/gameserver/enums/FailReason;"
         9: areturn
      LineNumberTable:
        line 20: 0

  public static ext.mods.gameserver.enums.FailReason valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/enums/FailReason;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/enums/FailReason
         2: aload_0
         3: invokestatic  #46                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/enums/FailReason
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
         0: new           #1                  // class ext/mods/gameserver/enums/FailReason
         3: dup
         4: ldc           #56                 // String NO_TEXT
         6: iconst_0
         7: invokespecial #57                 // Method "<init>":(Ljava/lang/String;I)V
        10: putstatic     #3                  // Field NO_TEXT:Lext/mods/gameserver/enums/FailReason;
        13: new           #1                  // class ext/mods/gameserver/enums/FailReason
        16: dup
        17: ldc           #58                 // String SYSTEM_ERROR_LOGIN_LATER
        19: iconst_1
        20: invokespecial #57                 // Method "<init>":(Ljava/lang/String;I)V
        23: putstatic     #7                  // Field SYSTEM_ERROR_LOGIN_LATER:Lext/mods/gameserver/enums/FailReason;
        26: new           #1                  // class ext/mods/gameserver/enums/FailReason
        29: dup
        30: ldc           #59                 // String PASSWORD_DOES_NOT_MATCH_THIS_ACCOUNT
        32: iconst_2
        33: invokespecial #57                 // Method "<init>":(Ljava/lang/String;I)V
        36: putstatic     #10                 // Field PASSWORD_DOES_NOT_MATCH_THIS_ACCOUNT:Lext/mods/gameserver/enums/FailReason;
        39: new           #1                  // class ext/mods/gameserver/enums/FailReason
        42: dup
        43: ldc           #60                 // String PASSWORD_DOES_NOT_MATCH_THIS_ACCOUNT2
        45: iconst_3
        46: invokespecial #57                 // Method "<init>":(Ljava/lang/String;I)V
        49: putstatic     #13                 // Field PASSWORD_DOES_NOT_MATCH_THIS_ACCOUNT2:Lext/mods/gameserver/enums/FailReason;
        52: new           #1                  // class ext/mods/gameserver/enums/FailReason
        55: dup
        56: ldc           #61                 // String ACCESS_FAILED_TRY_LATER
        58: iconst_4
        59: invokespecial #57                 // Method "<init>":(Ljava/lang/String;I)V
        62: putstatic     #16                 // Field ACCESS_FAILED_TRY_LATER:Lext/mods/gameserver/enums/FailReason;
        65: new           #1                  // class ext/mods/gameserver/enums/FailReason
        68: dup
        69: ldc           #62                 // String INCORRECT_ACCOUNT_INFO_CONTACT_CUSTOMER_SUPPORT
        71: iconst_5
        72: invokespecial #57                 // Method "<init>":(Ljava/lang/String;I)V
        75: putstatic     #19                 // Field INCORRECT_ACCOUNT_INFO_CONTACT_CUSTOMER_SUPPORT:Lext/mods/gameserver/enums/FailReason;
        78: new           #1                  // class ext/mods/gameserver/enums/FailReason
        81: dup
        82: ldc           #63                 // String ACCESS_FAILED_TRY_LATER2
        84: bipush        6
        86: invokespecial #57                 // Method "<init>":(Ljava/lang/String;I)V
        89: putstatic     #22                 // Field ACCESS_FAILED_TRY_LATER2:Lext/mods/gameserver/enums/FailReason;
        92: new           #1                  // class ext/mods/gameserver/enums/FailReason
        95: dup
        96: ldc           #64                 // String ACOUNT_ALREADY_IN_USE
        98: bipush        7
       100: invokespecial #57                 // Method "<init>":(Ljava/lang/String;I)V
       103: putstatic     #25                 // Field ACOUNT_ALREADY_IN_USE:Lext/mods/gameserver/enums/FailReason;
       106: new           #1                  // class ext/mods/gameserver/enums/FailReason
       109: dup
       110: ldc           #65                 // String ACCESS_FAILED_TRY_LATER3
       112: bipush        8
       114: invokespecial #57                 // Method "<init>":(Ljava/lang/String;I)V
       117: putstatic     #28                 // Field ACCESS_FAILED_TRY_LATER3:Lext/mods/gameserver/enums/FailReason;
       120: new           #1                  // class ext/mods/gameserver/enums/FailReason
       123: dup
       124: ldc           #66                 // String ACCESS_FAILED_TRY_LATER4
       126: bipush        9
       128: invokespecial #57                 // Method "<init>":(Ljava/lang/String;I)V
       131: putstatic     #31                 // Field ACCESS_FAILED_TRY_LATER4:Lext/mods/gameserver/enums/FailReason;
       134: new           #1                  // class ext/mods/gameserver/enums/FailReason
       137: dup
       138: ldc           #67                 // String ACCESS_FAILED_TRY_LATER5
       140: bipush        10
       142: invokespecial #57                 // Method "<init>":(Ljava/lang/String;I)V
       145: putstatic     #34                 // Field ACCESS_FAILED_TRY_LATER5:Lext/mods/gameserver/enums/FailReason;
       148: invokestatic  #68                 // Method $values:()[Lext/mods/gameserver/enums/FailReason;
       151: putstatic     #37                 // Field $VALUES:[Lext/mods/gameserver/enums/FailReason;
       154: return
      LineNumberTable:
        line 22: 0
        line 23: 13
        line 24: 26
        line 25: 39
        line 26: 52
        line 27: 65
        line 28: 78
        line 29: 92
        line 30: 106
        line 31: 120
        line 32: 134
        line 20: 148
}
Signature: #84                          // Ljava/lang/Enum<Lext/mods/gameserver/enums/FailReason;>;
SourceFile: "FailReason.java"
