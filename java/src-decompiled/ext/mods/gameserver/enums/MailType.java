// Bytecode for: ext.mods.gameserver.enums.MailType
// File: ext\mods\gameserver\enums\MailType.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/enums/MailType.class
  Last modified 9 de jul de 2026; size 2017 bytes
  MD5 checksum 501930ad617a652c67bcd3b9a8797dc6
  Compiled from "MailType.java"
public final class ext.mods.gameserver.enums.MailType extends java.lang.Enum<ext.mods.gameserver.enums.MailType>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/enums/MailType
  super_class: #26                        // java/lang/Enum
  interfaces: 0, fields: 8, methods: 7, attributes: 2
Constant pool:
   #1 = Class              #2             // ext/mods/gameserver/enums/MailType
   #2 = Utf8               ext/mods/gameserver/enums/MailType
   #3 = Fieldref           #1.#4          // ext/mods/gameserver/enums/MailType.INBOX:Lext/mods/gameserver/enums/MailType;
   #4 = NameAndType        #5:#6          // INBOX:Lext/mods/gameserver/enums/MailType;
   #5 = Utf8               INBOX
   #6 = Utf8               Lext/mods/gameserver/enums/MailType;
   #7 = Fieldref           #1.#8          // ext/mods/gameserver/enums/MailType.SENTBOX:Lext/mods/gameserver/enums/MailType;
   #8 = NameAndType        #9:#6          // SENTBOX:Lext/mods/gameserver/enums/MailType;
   #9 = Utf8               SENTBOX
  #10 = Fieldref           #1.#11         // ext/mods/gameserver/enums/MailType.ARCHIVE:Lext/mods/gameserver/enums/MailType;
  #11 = NameAndType        #12:#6         // ARCHIVE:Lext/mods/gameserver/enums/MailType;
  #12 = Utf8               ARCHIVE
  #13 = Fieldref           #1.#14         // ext/mods/gameserver/enums/MailType.TEMPARCHIVE:Lext/mods/gameserver/enums/MailType;
  #14 = NameAndType        #15:#6         // TEMPARCHIVE:Lext/mods/gameserver/enums/MailType;
  #15 = Utf8               TEMPARCHIVE
  #16 = Fieldref           #1.#17         // ext/mods/gameserver/enums/MailType.$VALUES:[Lext/mods/gameserver/enums/MailType;
  #17 = NameAndType        #18:#19        // $VALUES:[Lext/mods/gameserver/enums/MailType;
  #18 = Utf8               $VALUES
  #19 = Utf8               [Lext/mods/gameserver/enums/MailType;
  #20 = Methodref          #21.#22        // "[Lext/mods/gameserver/enums/MailType;".clone:()Ljava/lang/Object;
  #21 = Class              #19            // "[Lext/mods/gameserver/enums/MailType;"
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
  #35 = Fieldref           #1.#36         // ext/mods/gameserver/enums/MailType._description:Ljava/lang/String;
  #36 = NameAndType        #37:#38        // _description:Ljava/lang/String;
  #37 = Utf8               _description
  #38 = Utf8               Ljava/lang/String;
  #39 = Fieldref           #1.#40         // ext/mods/gameserver/enums/MailType._bypass:Ljava/lang/String;
  #40 = NameAndType        #41:#38        // _bypass:Ljava/lang/String;
  #41 = Utf8               _bypass
  #42 = String             #5             // INBOX
  #43 = String             #44            // Inbox
  #44 = Utf8               Inbox
  #45 = String             #46            // <a action=\"bypass _bbsmail\">Inbox</a>
  #46 = Utf8               <a action=\"bypass _bbsmail\">Inbox</a>
  #47 = Methodref          #1.#48         // ext/mods/gameserver/enums/MailType."<init>":(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
  #48 = NameAndType        #33:#49        // "<init>":(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
  #49 = Utf8               (Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
  #50 = String             #9             // SENTBOX
  #51 = String             #52            // Sent Box
  #52 = Utf8               Sent Box
  #53 = String             #54            // <a action=\"bypass _bbsmail;sentbox\">Sent Box</a>
  #54 = Utf8               <a action=\"bypass _bbsmail;sentbox\">Sent Box</a>
  #55 = String             #12            // ARCHIVE
  #56 = String             #57            // Mail Archive
  #57 = Utf8               Mail Archive
  #58 = String             #59            // <a action=\"bypass _bbsmail;archive\">Mail Archive</a>
  #59 = Utf8               <a action=\"bypass _bbsmail;archive\">Mail Archive</a>
  #60 = String             #15            // TEMPARCHIVE
  #61 = String             #62            // Temporary Mail Archive
  #62 = Utf8               Temporary Mail Archive
  #63 = String             #64            // <a action=\"bypass _bbsmail;temp_archive\">Temporary Mail Archive</a>
  #64 = Utf8               <a action=\"bypass _bbsmail;temp_archive\">Temporary Mail Archive</a>
  #65 = Methodref          #1.#66         // ext/mods/gameserver/enums/MailType.$values:()[Lext/mods/gameserver/enums/MailType;
  #66 = NameAndType        #67:#68        // $values:()[Lext/mods/gameserver/enums/MailType;
  #67 = Utf8               $values
  #68 = Utf8               ()[Lext/mods/gameserver/enums/MailType;
  #69 = Methodref          #1.#70         // ext/mods/gameserver/enums/MailType.values:()[Lext/mods/gameserver/enums/MailType;
  #70 = NameAndType        #71:#68        // values:()[Lext/mods/gameserver/enums/MailType;
  #71 = Utf8               values
  #72 = Fieldref           #1.#73         // ext/mods/gameserver/enums/MailType.VALUES:[Lext/mods/gameserver/enums/MailType;
  #73 = NameAndType        #74:#19        // VALUES:[Lext/mods/gameserver/enums/MailType;
  #74 = Utf8               VALUES
  #75 = Utf8               Code
  #76 = Utf8               LineNumberTable
  #77 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/MailType;
  #78 = Utf8               LocalVariableTable
  #79 = Utf8               name
  #80 = Utf8               MethodParameters
  #81 = Utf8               this
  #82 = Utf8               description
  #83 = Utf8               bypass
  #84 = Utf8               Signature
  #85 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #86 = Utf8               getDescription
  #87 = Utf8               ()Ljava/lang/String;
  #88 = Utf8               getBypass
  #89 = Utf8               <clinit>
  #90 = Utf8               ()V
  #91 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/enums/MailType;>;
  #92 = Utf8               SourceFile
  #93 = Utf8               MailType.java
{
  public static final ext.mods.gameserver.enums.MailType INBOX;
    descriptor: Lext/mods/gameserver/enums/MailType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.MailType SENTBOX;
    descriptor: Lext/mods/gameserver/enums/MailType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.MailType ARCHIVE;
    descriptor: Lext/mods/gameserver/enums/MailType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.MailType TEMPARCHIVE;
    descriptor: Lext/mods/gameserver/enums/MailType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.MailType[] VALUES;
    descriptor: [Lext/mods/gameserver/enums/MailType;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public static ext.mods.gameserver.enums.MailType[] values();
    descriptor: ()[Lext/mods/gameserver/enums/MailType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #16                 // Field $VALUES:[Lext/mods/gameserver/enums/MailType;
         3: invokevirtual #20                 // Method "[Lext/mods/gameserver/enums/MailType;".clone:()Ljava/lang/Object;
         6: checkcast     #21                 // class "[Lext/mods/gameserver/enums/MailType;"
         9: areturn
      LineNumberTable:
        line 20: 0

  public static ext.mods.gameserver.enums.MailType valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/enums/MailType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/enums/MailType
         2: aload_0
         3: invokestatic  #25                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/enums/MailType
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
         1: getfield      #35                 // Field _description:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 38: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/MailType;

  public java.lang.String getBypass();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #39                 // Field _bypass:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 43: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/MailType;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=6, locals=0, args_size=0
         0: new           #1                  // class ext/mods/gameserver/enums/MailType
         3: dup
         4: ldc           #42                 // String INBOX
         6: iconst_0
         7: ldc           #43                 // String Inbox
         9: ldc           #45                 // String <a action=\"bypass _bbsmail\">Inbox</a>
        11: invokespecial #47                 // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
        14: putstatic     #3                  // Field INBOX:Lext/mods/gameserver/enums/MailType;
        17: new           #1                  // class ext/mods/gameserver/enums/MailType
        20: dup
        21: ldc           #50                 // String SENTBOX
        23: iconst_1
        24: ldc           #51                 // String Sent Box
        26: ldc           #53                 // String <a action=\"bypass _bbsmail;sentbox\">Sent Box</a>
        28: invokespecial #47                 // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
        31: putstatic     #7                  // Field SENTBOX:Lext/mods/gameserver/enums/MailType;
        34: new           #1                  // class ext/mods/gameserver/enums/MailType
        37: dup
        38: ldc           #55                 // String ARCHIVE
        40: iconst_2
        41: ldc           #56                 // String Mail Archive
        43: ldc           #58                 // String <a action=\"bypass _bbsmail;archive\">Mail Archive</a>
        45: invokespecial #47                 // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
        48: putstatic     #10                 // Field ARCHIVE:Lext/mods/gameserver/enums/MailType;
        51: new           #1                  // class ext/mods/gameserver/enums/MailType
        54: dup
        55: ldc           #60                 // String TEMPARCHIVE
        57: iconst_3
        58: ldc           #61                 // String Temporary Mail Archive
        60: ldc           #63                 // String <a action=\"bypass _bbsmail;temp_archive\">Temporary Mail Archive</a>
        62: invokespecial #47                 // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
        65: putstatic     #13                 // Field TEMPARCHIVE:Lext/mods/gameserver/enums/MailType;
        68: invokestatic  #65                 // Method $values:()[Lext/mods/gameserver/enums/MailType;
        71: putstatic     #16                 // Field $VALUES:[Lext/mods/gameserver/enums/MailType;
        74: invokestatic  #69                 // Method values:()[Lext/mods/gameserver/enums/MailType;
        77: putstatic     #72                 // Field VALUES:[Lext/mods/gameserver/enums/MailType;
        80: return
      LineNumberTable:
        line 22: 0
        line 23: 17
        line 24: 34
        line 25: 51
        line 20: 68
        line 46: 74
}
Signature: #91                          // Ljava/lang/Enum<Lext/mods/gameserver/enums/MailType;>;
SourceFile: "MailType.java"
