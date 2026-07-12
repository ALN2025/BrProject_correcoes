// Bytecode for: ext.mods.gameserver.enums.ScheduleType
// File: ext\mods\gameserver\enums\ScheduleType.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/enums/ScheduleType.class
  Last modified 9 de jul de 2026; size 1659 bytes
  MD5 checksum e99e8aef716c28eeb86bed11efe9de89
  Compiled from "ScheduleType.java"
public final class ext.mods.gameserver.enums.ScheduleType extends java.lang.Enum<ext.mods.gameserver.enums.ScheduleType>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/enums/ScheduleType
  super_class: #35                        // java/lang/Enum
  interfaces: 0, fields: 9, methods: 6, attributes: 2
Constant pool:
   #1 = Class              #2             // ext/mods/gameserver/enums/ScheduleType
   #2 = Utf8               ext/mods/gameserver/enums/ScheduleType
   #3 = Fieldref           #1.#4          // ext/mods/gameserver/enums/ScheduleType.HOURLY:Lext/mods/gameserver/enums/ScheduleType;
   #4 = NameAndType        #5:#6          // HOURLY:Lext/mods/gameserver/enums/ScheduleType;
   #5 = Utf8               HOURLY
   #6 = Utf8               Lext/mods/gameserver/enums/ScheduleType;
   #7 = Fieldref           #1.#8          // ext/mods/gameserver/enums/ScheduleType.DAILY:Lext/mods/gameserver/enums/ScheduleType;
   #8 = NameAndType        #9:#6          // DAILY:Lext/mods/gameserver/enums/ScheduleType;
   #9 = Utf8               DAILY
  #10 = Fieldref           #1.#11         // ext/mods/gameserver/enums/ScheduleType.WEEKLY:Lext/mods/gameserver/enums/ScheduleType;
  #11 = NameAndType        #12:#6         // WEEKLY:Lext/mods/gameserver/enums/ScheduleType;
  #12 = Utf8               WEEKLY
  #13 = Fieldref           #1.#14         // ext/mods/gameserver/enums/ScheduleType.MONTHLY_DAY:Lext/mods/gameserver/enums/ScheduleType;
  #14 = NameAndType        #15:#6         // MONTHLY_DAY:Lext/mods/gameserver/enums/ScheduleType;
  #15 = Utf8               MONTHLY_DAY
  #16 = Fieldref           #1.#17         // ext/mods/gameserver/enums/ScheduleType.MONTHLY_WEEK:Lext/mods/gameserver/enums/ScheduleType;
  #17 = NameAndType        #18:#6         // MONTHLY_WEEK:Lext/mods/gameserver/enums/ScheduleType;
  #18 = Utf8               MONTHLY_WEEK
  #19 = Fieldref           #1.#20         // ext/mods/gameserver/enums/ScheduleType.YEARLY_DAY:Lext/mods/gameserver/enums/ScheduleType;
  #20 = NameAndType        #21:#6         // YEARLY_DAY:Lext/mods/gameserver/enums/ScheduleType;
  #21 = Utf8               YEARLY_DAY
  #22 = Fieldref           #1.#23         // ext/mods/gameserver/enums/ScheduleType.YEARLY_WEEK:Lext/mods/gameserver/enums/ScheduleType;
  #23 = NameAndType        #24:#6         // YEARLY_WEEK:Lext/mods/gameserver/enums/ScheduleType;
  #24 = Utf8               YEARLY_WEEK
  #25 = Fieldref           #1.#26         // ext/mods/gameserver/enums/ScheduleType.$VALUES:[Lext/mods/gameserver/enums/ScheduleType;
  #26 = NameAndType        #27:#28        // $VALUES:[Lext/mods/gameserver/enums/ScheduleType;
  #27 = Utf8               $VALUES
  #28 = Utf8               [Lext/mods/gameserver/enums/ScheduleType;
  #29 = Methodref          #30.#31        // "[Lext/mods/gameserver/enums/ScheduleType;".clone:()Ljava/lang/Object;
  #30 = Class              #28            // "[Lext/mods/gameserver/enums/ScheduleType;"
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
  #44 = Fieldref           #1.#45         // ext/mods/gameserver/enums/ScheduleType._period:I
  #45 = NameAndType        #46:#47        // _period:I
  #46 = Utf8               _period
  #47 = Utf8               I
  #48 = String             #5             // HOURLY
  #49 = Class              #50            // java/util/Calendar
  #50 = Utf8               java/util/Calendar
  #51 = Methodref          #1.#52         // ext/mods/gameserver/enums/ScheduleType."<init>":(Ljava/lang/String;II)V
  #52 = NameAndType        #42:#53        // "<init>":(Ljava/lang/String;II)V
  #53 = Utf8               (Ljava/lang/String;II)V
  #54 = String             #9             // DAILY
  #55 = String             #12            // WEEKLY
  #56 = String             #15            // MONTHLY_DAY
  #57 = String             #18            // MONTHLY_WEEK
  #58 = String             #21            // YEARLY_DAY
  #59 = String             #24            // YEARLY_WEEK
  #60 = Methodref          #1.#61         // ext/mods/gameserver/enums/ScheduleType.$values:()[Lext/mods/gameserver/enums/ScheduleType;
  #61 = NameAndType        #62:#63        // $values:()[Lext/mods/gameserver/enums/ScheduleType;
  #62 = Utf8               $values
  #63 = Utf8               ()[Lext/mods/gameserver/enums/ScheduleType;
  #64 = Utf8               values
  #65 = Utf8               Code
  #66 = Utf8               LineNumberTable
  #67 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/ScheduleType;
  #68 = Utf8               LocalVariableTable
  #69 = Utf8               name
  #70 = Utf8               Ljava/lang/String;
  #71 = Utf8               MethodParameters
  #72 = Utf8               this
  #73 = Utf8               period
  #74 = Utf8               Signature
  #75 = Utf8               (I)V
  #76 = Utf8               getPeriod
  #77 = Utf8               ()I
  #78 = Utf8               <clinit>
  #79 = Utf8               ()V
  #80 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/enums/ScheduleType;>;
  #81 = Utf8               SourceFile
  #82 = Utf8               ScheduleType.java
{
  public static final ext.mods.gameserver.enums.ScheduleType HOURLY;
    descriptor: Lext/mods/gameserver/enums/ScheduleType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.ScheduleType DAILY;
    descriptor: Lext/mods/gameserver/enums/ScheduleType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.ScheduleType WEEKLY;
    descriptor: Lext/mods/gameserver/enums/ScheduleType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.ScheduleType MONTHLY_DAY;
    descriptor: Lext/mods/gameserver/enums/ScheduleType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.ScheduleType MONTHLY_WEEK;
    descriptor: Lext/mods/gameserver/enums/ScheduleType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.ScheduleType YEARLY_DAY;
    descriptor: Lext/mods/gameserver/enums/ScheduleType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.ScheduleType YEARLY_WEEK;
    descriptor: Lext/mods/gameserver/enums/ScheduleType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static ext.mods.gameserver.enums.ScheduleType[] values();
    descriptor: ()[Lext/mods/gameserver/enums/ScheduleType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #25                 // Field $VALUES:[Lext/mods/gameserver/enums/ScheduleType;
         3: invokevirtual #29                 // Method "[Lext/mods/gameserver/enums/ScheduleType;".clone:()Ljava/lang/Object;
         6: checkcast     #30                 // class "[Lext/mods/gameserver/enums/ScheduleType;"
         9: areturn
      LineNumberTable:
        line 25: 0

  public static ext.mods.gameserver.enums.ScheduleType valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/enums/ScheduleType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/enums/ScheduleType
         2: aload_0
         3: invokestatic  #34                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/enums/ScheduleType
         9: areturn
      LineNumberTable:
        line 25: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  name   Ljava/lang/String;
    MethodParameters:
      Name                           Flags
      <no name>                      mandated

  public final int getPeriod();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #44                 // Field _period:I
         4: ireturn
      LineNumberTable:
        line 44: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/ScheduleType;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=5, locals=0, args_size=0
         0: new           #1                  // class ext/mods/gameserver/enums/ScheduleType
         3: dup
         4: ldc           #48                 // String HOURLY
         6: iconst_0
         7: bipush        10
         9: invokespecial #51                 // Method "<init>":(Ljava/lang/String;II)V
        12: putstatic     #3                  // Field HOURLY:Lext/mods/gameserver/enums/ScheduleType;
        15: new           #1                  // class ext/mods/gameserver/enums/ScheduleType
        18: dup
        19: ldc           #54                 // String DAILY
        21: iconst_1
        22: bipush        6
        24: invokespecial #51                 // Method "<init>":(Ljava/lang/String;II)V
        27: putstatic     #7                  // Field DAILY:Lext/mods/gameserver/enums/ScheduleType;
        30: new           #1                  // class ext/mods/gameserver/enums/ScheduleType
        33: dup
        34: ldc           #55                 // String WEEKLY
        36: iconst_2
        37: iconst_3
        38: invokespecial #51                 // Method "<init>":(Ljava/lang/String;II)V
        41: putstatic     #10                 // Field WEEKLY:Lext/mods/gameserver/enums/ScheduleType;
        44: new           #1                  // class ext/mods/gameserver/enums/ScheduleType
        47: dup
        48: ldc           #56                 // String MONTHLY_DAY
        50: iconst_3
        51: iconst_2
        52: invokespecial #51                 // Method "<init>":(Ljava/lang/String;II)V
        55: putstatic     #13                 // Field MONTHLY_DAY:Lext/mods/gameserver/enums/ScheduleType;
        58: new           #1                  // class ext/mods/gameserver/enums/ScheduleType
        61: dup
        62: ldc           #57                 // String MONTHLY_WEEK
        64: iconst_4
        65: iconst_2
        66: invokespecial #51                 // Method "<init>":(Ljava/lang/String;II)V
        69: putstatic     #16                 // Field MONTHLY_WEEK:Lext/mods/gameserver/enums/ScheduleType;
        72: new           #1                  // class ext/mods/gameserver/enums/ScheduleType
        75: dup
        76: ldc           #58                 // String YEARLY_DAY
        78: iconst_5
        79: iconst_1
        80: invokespecial #51                 // Method "<init>":(Ljava/lang/String;II)V
        83: putstatic     #19                 // Field YEARLY_DAY:Lext/mods/gameserver/enums/ScheduleType;
        86: new           #1                  // class ext/mods/gameserver/enums/ScheduleType
        89: dup
        90: ldc           #59                 // String YEARLY_WEEK
        92: bipush        6
        94: iconst_1
        95: invokespecial #51                 // Method "<init>":(Ljava/lang/String;II)V
        98: putstatic     #22                 // Field YEARLY_WEEK:Lext/mods/gameserver/enums/ScheduleType;
       101: invokestatic  #60                 // Method $values:()[Lext/mods/gameserver/enums/ScheduleType;
       104: putstatic     #25                 // Field $VALUES:[Lext/mods/gameserver/enums/ScheduleType;
       107: return
      LineNumberTable:
        line 27: 0
        line 28: 15
        line 29: 30
        line 30: 44
        line 31: 58
        line 32: 72
        line 33: 86
        line 25: 101
}
Signature: #80                          // Ljava/lang/Enum<Lext/mods/gameserver/enums/ScheduleType;>;
SourceFile: "ScheduleType.java"
