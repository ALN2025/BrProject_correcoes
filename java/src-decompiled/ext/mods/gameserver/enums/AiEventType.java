// Bytecode for: ext.mods.gameserver.enums.AiEventType
// File: ext\mods\gameserver\enums\AiEventType.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/enums/AiEventType.class
  Last modified 9 de jul de 2026; size 1982 bytes
  MD5 checksum 35d97524d36e3fb551bff0fd5a1f031e
  Compiled from "AiEventType.java"
public final class ext.mods.gameserver.enums.AiEventType extends java.lang.Enum<ext.mods.gameserver.enums.AiEventType>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/enums/AiEventType
  super_class: #62                        // java/lang/Enum
  interfaces: 0, fields: 17, methods: 5, attributes: 2
Constant pool:
    #1 = Class              #2            // ext/mods/gameserver/enums/AiEventType
    #2 = Utf8               ext/mods/gameserver/enums/AiEventType
    #3 = Fieldref           #1.#4         // ext/mods/gameserver/enums/AiEventType.THINK:Lext/mods/gameserver/enums/AiEventType;
    #4 = NameAndType        #5:#6         // THINK:Lext/mods/gameserver/enums/AiEventType;
    #5 = Utf8               THINK
    #6 = Utf8               Lext/mods/gameserver/enums/AiEventType;
    #7 = Fieldref           #1.#8         // ext/mods/gameserver/enums/AiEventType.ATTACKED:Lext/mods/gameserver/enums/AiEventType;
    #8 = NameAndType        #9:#6         // ATTACKED:Lext/mods/gameserver/enums/AiEventType;
    #9 = Utf8               ATTACKED
   #10 = Fieldref           #1.#11        // ext/mods/gameserver/enums/AiEventType.AGGRESSION:Lext/mods/gameserver/enums/AiEventType;
   #11 = NameAndType        #12:#6        // AGGRESSION:Lext/mods/gameserver/enums/AiEventType;
   #12 = Utf8               AGGRESSION
   #13 = Fieldref           #1.#14        // ext/mods/gameserver/enums/AiEventType.EVADED:Lext/mods/gameserver/enums/AiEventType;
   #14 = NameAndType        #15:#6        // EVADED:Lext/mods/gameserver/enums/AiEventType;
   #15 = Utf8               EVADED
   #16 = Fieldref           #1.#17        // ext/mods/gameserver/enums/AiEventType.FINISHED_ATTACK:Lext/mods/gameserver/enums/AiEventType;
   #17 = NameAndType        #18:#6        // FINISHED_ATTACK:Lext/mods/gameserver/enums/AiEventType;
   #18 = Utf8               FINISHED_ATTACK
   #19 = Fieldref           #1.#20        // ext/mods/gameserver/enums/AiEventType.ARRIVED:Lext/mods/gameserver/enums/AiEventType;
   #20 = NameAndType        #21:#6        // ARRIVED:Lext/mods/gameserver/enums/AiEventType;
   #21 = Utf8               ARRIVED
   #22 = Fieldref           #1.#23        // ext/mods/gameserver/enums/AiEventType.ARRIVED_BLOCKED:Lext/mods/gameserver/enums/AiEventType;
   #23 = NameAndType        #24:#6        // ARRIVED_BLOCKED:Lext/mods/gameserver/enums/AiEventType;
   #24 = Utf8               ARRIVED_BLOCKED
   #25 = Fieldref           #1.#26        // ext/mods/gameserver/enums/AiEventType.CANCEL:Lext/mods/gameserver/enums/AiEventType;
   #26 = NameAndType        #27:#6        // CANCEL:Lext/mods/gameserver/enums/AiEventType;
   #27 = Utf8               CANCEL
   #28 = Fieldref           #1.#29        // ext/mods/gameserver/enums/AiEventType.DEAD:Lext/mods/gameserver/enums/AiEventType;
   #29 = NameAndType        #30:#6        // DEAD:Lext/mods/gameserver/enums/AiEventType;
   #30 = Utf8               DEAD
   #31 = Fieldref           #1.#32        // ext/mods/gameserver/enums/AiEventType.FINISHED_CASTING:Lext/mods/gameserver/enums/AiEventType;
   #32 = NameAndType        #33:#6        // FINISHED_CASTING:Lext/mods/gameserver/enums/AiEventType;
   #33 = Utf8               FINISHED_CASTING
   #34 = Fieldref           #1.#35        // ext/mods/gameserver/enums/AiEventType.SAT_DOWN:Lext/mods/gameserver/enums/AiEventType;
   #35 = NameAndType        #36:#6        // SAT_DOWN:Lext/mods/gameserver/enums/AiEventType;
   #36 = Utf8               SAT_DOWN
   #37 = Fieldref           #1.#38        // ext/mods/gameserver/enums/AiEventType.STOOD_UP:Lext/mods/gameserver/enums/AiEventType;
   #38 = NameAndType        #39:#6        // STOOD_UP:Lext/mods/gameserver/enums/AiEventType;
   #39 = Utf8               STOOD_UP
   #40 = Fieldref           #1.#41        // ext/mods/gameserver/enums/AiEventType.FINISHED_ATTACK_BOW:Lext/mods/gameserver/enums/AiEventType;
   #41 = NameAndType        #42:#6        // FINISHED_ATTACK_BOW:Lext/mods/gameserver/enums/AiEventType;
   #42 = Utf8               FINISHED_ATTACK_BOW
   #43 = Fieldref           #1.#44        // ext/mods/gameserver/enums/AiEventType.BOW_ATTACK_REUSED:Lext/mods/gameserver/enums/AiEventType;
   #44 = NameAndType        #45:#6        // BOW_ATTACK_REUSED:Lext/mods/gameserver/enums/AiEventType;
   #45 = Utf8               BOW_ATTACK_REUSED
   #46 = Fieldref           #1.#47        // ext/mods/gameserver/enums/AiEventType.OWNER_ATTACKED:Lext/mods/gameserver/enums/AiEventType;
   #47 = NameAndType        #48:#6        // OWNER_ATTACKED:Lext/mods/gameserver/enums/AiEventType;
   #48 = Utf8               OWNER_ATTACKED
   #49 = Fieldref           #1.#50        // ext/mods/gameserver/enums/AiEventType.TELEPORTED:Lext/mods/gameserver/enums/AiEventType;
   #50 = NameAndType        #51:#6        // TELEPORTED:Lext/mods/gameserver/enums/AiEventType;
   #51 = Utf8               TELEPORTED
   #52 = Fieldref           #1.#53        // ext/mods/gameserver/enums/AiEventType.$VALUES:[Lext/mods/gameserver/enums/AiEventType;
   #53 = NameAndType        #54:#55       // $VALUES:[Lext/mods/gameserver/enums/AiEventType;
   #54 = Utf8               $VALUES
   #55 = Utf8               [Lext/mods/gameserver/enums/AiEventType;
   #56 = Methodref          #57.#58       // "[Lext/mods/gameserver/enums/AiEventType;".clone:()Ljava/lang/Object;
   #57 = Class              #55           // "[Lext/mods/gameserver/enums/AiEventType;"
   #58 = NameAndType        #59:#60       // clone:()Ljava/lang/Object;
   #59 = Utf8               clone
   #60 = Utf8               ()Ljava/lang/Object;
   #61 = Methodref          #62.#63       // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #62 = Class              #64           // java/lang/Enum
   #63 = NameAndType        #65:#66       // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #64 = Utf8               java/lang/Enum
   #65 = Utf8               valueOf
   #66 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #67 = Methodref          #62.#68       // java/lang/Enum."<init>":(Ljava/lang/String;I)V
   #68 = NameAndType        #69:#70       // "<init>":(Ljava/lang/String;I)V
   #69 = Utf8               <init>
   #70 = Utf8               (Ljava/lang/String;I)V
   #71 = String             #5            // THINK
   #72 = Methodref          #1.#68        // ext/mods/gameserver/enums/AiEventType."<init>":(Ljava/lang/String;I)V
   #73 = String             #9            // ATTACKED
   #74 = String             #12           // AGGRESSION
   #75 = String             #15           // EVADED
   #76 = String             #18           // FINISHED_ATTACK
   #77 = String             #21           // ARRIVED
   #78 = String             #24           // ARRIVED_BLOCKED
   #79 = String             #27           // CANCEL
   #80 = String             #30           // DEAD
   #81 = String             #33           // FINISHED_CASTING
   #82 = String             #36           // SAT_DOWN
   #83 = String             #39           // STOOD_UP
   #84 = String             #42           // FINISHED_ATTACK_BOW
   #85 = String             #45           // BOW_ATTACK_REUSED
   #86 = String             #48           // OWNER_ATTACKED
   #87 = String             #51           // TELEPORTED
   #88 = Methodref          #1.#89        // ext/mods/gameserver/enums/AiEventType.$values:()[Lext/mods/gameserver/enums/AiEventType;
   #89 = NameAndType        #90:#91       // $values:()[Lext/mods/gameserver/enums/AiEventType;
   #90 = Utf8               $values
   #91 = Utf8               ()[Lext/mods/gameserver/enums/AiEventType;
   #92 = Utf8               values
   #93 = Utf8               Code
   #94 = Utf8               LineNumberTable
   #95 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/AiEventType;
   #96 = Utf8               LocalVariableTable
   #97 = Utf8               name
   #98 = Utf8               Ljava/lang/String;
   #99 = Utf8               MethodParameters
  #100 = Utf8               this
  #101 = Utf8               Signature
  #102 = Utf8               ()V
  #103 = Utf8               <clinit>
  #104 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/enums/AiEventType;>;
  #105 = Utf8               SourceFile
  #106 = Utf8               AiEventType.java
{
  public static final ext.mods.gameserver.enums.AiEventType THINK;
    descriptor: Lext/mods/gameserver/enums/AiEventType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.AiEventType ATTACKED;
    descriptor: Lext/mods/gameserver/enums/AiEventType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.AiEventType AGGRESSION;
    descriptor: Lext/mods/gameserver/enums/AiEventType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.AiEventType EVADED;
    descriptor: Lext/mods/gameserver/enums/AiEventType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.AiEventType FINISHED_ATTACK;
    descriptor: Lext/mods/gameserver/enums/AiEventType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.AiEventType ARRIVED;
    descriptor: Lext/mods/gameserver/enums/AiEventType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.AiEventType ARRIVED_BLOCKED;
    descriptor: Lext/mods/gameserver/enums/AiEventType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.AiEventType CANCEL;
    descriptor: Lext/mods/gameserver/enums/AiEventType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.AiEventType DEAD;
    descriptor: Lext/mods/gameserver/enums/AiEventType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.AiEventType FINISHED_CASTING;
    descriptor: Lext/mods/gameserver/enums/AiEventType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.AiEventType SAT_DOWN;
    descriptor: Lext/mods/gameserver/enums/AiEventType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.AiEventType STOOD_UP;
    descriptor: Lext/mods/gameserver/enums/AiEventType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.AiEventType FINISHED_ATTACK_BOW;
    descriptor: Lext/mods/gameserver/enums/AiEventType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.AiEventType BOW_ATTACK_REUSED;
    descriptor: Lext/mods/gameserver/enums/AiEventType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.AiEventType OWNER_ATTACKED;
    descriptor: Lext/mods/gameserver/enums/AiEventType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.AiEventType TELEPORTED;
    descriptor: Lext/mods/gameserver/enums/AiEventType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static ext.mods.gameserver.enums.AiEventType[] values();
    descriptor: ()[Lext/mods/gameserver/enums/AiEventType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #52                 // Field $VALUES:[Lext/mods/gameserver/enums/AiEventType;
         3: invokevirtual #56                 // Method "[Lext/mods/gameserver/enums/AiEventType;".clone:()Ljava/lang/Object;
         6: checkcast     #57                 // class "[Lext/mods/gameserver/enums/AiEventType;"
         9: areturn
      LineNumberTable:
        line 23: 0

  public static ext.mods.gameserver.enums.AiEventType valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/enums/AiEventType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/enums/AiEventType
         2: aload_0
         3: invokestatic  #61                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/enums/AiEventType
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
         0: new           #1                  // class ext/mods/gameserver/enums/AiEventType
         3: dup
         4: ldc           #71                 // String THINK
         6: iconst_0
         7: invokespecial #72                 // Method "<init>":(Ljava/lang/String;I)V
        10: putstatic     #3                  // Field THINK:Lext/mods/gameserver/enums/AiEventType;
        13: new           #1                  // class ext/mods/gameserver/enums/AiEventType
        16: dup
        17: ldc           #73                 // String ATTACKED
        19: iconst_1
        20: invokespecial #72                 // Method "<init>":(Ljava/lang/String;I)V
        23: putstatic     #7                  // Field ATTACKED:Lext/mods/gameserver/enums/AiEventType;
        26: new           #1                  // class ext/mods/gameserver/enums/AiEventType
        29: dup
        30: ldc           #74                 // String AGGRESSION
        32: iconst_2
        33: invokespecial #72                 // Method "<init>":(Ljava/lang/String;I)V
        36: putstatic     #10                 // Field AGGRESSION:Lext/mods/gameserver/enums/AiEventType;
        39: new           #1                  // class ext/mods/gameserver/enums/AiEventType
        42: dup
        43: ldc           #75                 // String EVADED
        45: iconst_3
        46: invokespecial #72                 // Method "<init>":(Ljava/lang/String;I)V
        49: putstatic     #13                 // Field EVADED:Lext/mods/gameserver/enums/AiEventType;
        52: new           #1                  // class ext/mods/gameserver/enums/AiEventType
        55: dup
        56: ldc           #76                 // String FINISHED_ATTACK
        58: iconst_4
        59: invokespecial #72                 // Method "<init>":(Ljava/lang/String;I)V
        62: putstatic     #16                 // Field FINISHED_ATTACK:Lext/mods/gameserver/enums/AiEventType;
        65: new           #1                  // class ext/mods/gameserver/enums/AiEventType
        68: dup
        69: ldc           #77                 // String ARRIVED
        71: iconst_5
        72: invokespecial #72                 // Method "<init>":(Ljava/lang/String;I)V
        75: putstatic     #19                 // Field ARRIVED:Lext/mods/gameserver/enums/AiEventType;
        78: new           #1                  // class ext/mods/gameserver/enums/AiEventType
        81: dup
        82: ldc           #78                 // String ARRIVED_BLOCKED
        84: bipush        6
        86: invokespecial #72                 // Method "<init>":(Ljava/lang/String;I)V
        89: putstatic     #22                 // Field ARRIVED_BLOCKED:Lext/mods/gameserver/enums/AiEventType;
        92: new           #1                  // class ext/mods/gameserver/enums/AiEventType
        95: dup
        96: ldc           #79                 // String CANCEL
        98: bipush        7
       100: invokespecial #72                 // Method "<init>":(Ljava/lang/String;I)V
       103: putstatic     #25                 // Field CANCEL:Lext/mods/gameserver/enums/AiEventType;
       106: new           #1                  // class ext/mods/gameserver/enums/AiEventType
       109: dup
       110: ldc           #80                 // String DEAD
       112: bipush        8
       114: invokespecial #72                 // Method "<init>":(Ljava/lang/String;I)V
       117: putstatic     #28                 // Field DEAD:Lext/mods/gameserver/enums/AiEventType;
       120: new           #1                  // class ext/mods/gameserver/enums/AiEventType
       123: dup
       124: ldc           #81                 // String FINISHED_CASTING
       126: bipush        9
       128: invokespecial #72                 // Method "<init>":(Ljava/lang/String;I)V
       131: putstatic     #31                 // Field FINISHED_CASTING:Lext/mods/gameserver/enums/AiEventType;
       134: new           #1                  // class ext/mods/gameserver/enums/AiEventType
       137: dup
       138: ldc           #82                 // String SAT_DOWN
       140: bipush        10
       142: invokespecial #72                 // Method "<init>":(Ljava/lang/String;I)V
       145: putstatic     #34                 // Field SAT_DOWN:Lext/mods/gameserver/enums/AiEventType;
       148: new           #1                  // class ext/mods/gameserver/enums/AiEventType
       151: dup
       152: ldc           #83                 // String STOOD_UP
       154: bipush        11
       156: invokespecial #72                 // Method "<init>":(Ljava/lang/String;I)V
       159: putstatic     #37                 // Field STOOD_UP:Lext/mods/gameserver/enums/AiEventType;
       162: new           #1                  // class ext/mods/gameserver/enums/AiEventType
       165: dup
       166: ldc           #84                 // String FINISHED_ATTACK_BOW
       168: bipush        12
       170: invokespecial #72                 // Method "<init>":(Ljava/lang/String;I)V
       173: putstatic     #40                 // Field FINISHED_ATTACK_BOW:Lext/mods/gameserver/enums/AiEventType;
       176: new           #1                  // class ext/mods/gameserver/enums/AiEventType
       179: dup
       180: ldc           #85                 // String BOW_ATTACK_REUSED
       182: bipush        13
       184: invokespecial #72                 // Method "<init>":(Ljava/lang/String;I)V
       187: putstatic     #43                 // Field BOW_ATTACK_REUSED:Lext/mods/gameserver/enums/AiEventType;
       190: new           #1                  // class ext/mods/gameserver/enums/AiEventType
       193: dup
       194: ldc           #86                 // String OWNER_ATTACKED
       196: bipush        14
       198: invokespecial #72                 // Method "<init>":(Ljava/lang/String;I)V
       201: putstatic     #46                 // Field OWNER_ATTACKED:Lext/mods/gameserver/enums/AiEventType;
       204: new           #1                  // class ext/mods/gameserver/enums/AiEventType
       207: dup
       208: ldc           #87                 // String TELEPORTED
       210: bipush        15
       212: invokespecial #72                 // Method "<init>":(Ljava/lang/String;I)V
       215: putstatic     #49                 // Field TELEPORTED:Lext/mods/gameserver/enums/AiEventType;
       218: invokestatic  #88                 // Method $values:()[Lext/mods/gameserver/enums/AiEventType;
       221: putstatic     #52                 // Field $VALUES:[Lext/mods/gameserver/enums/AiEventType;
       224: return
      LineNumberTable:
        line 26: 0
        line 28: 13
        line 30: 26
        line 32: 39
        line 34: 52
        line 36: 65
        line 38: 78
        line 40: 92
        line 42: 106
        line 44: 120
        line 46: 134
        line 48: 148
        line 50: 162
        line 52: 176
        line 54: 190
        line 56: 204
        line 23: 218
}
Signature: #104                         // Ljava/lang/Enum<Lext/mods/gameserver/enums/AiEventType;>;
SourceFile: "AiEventType.java"
