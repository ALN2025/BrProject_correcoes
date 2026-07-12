// Bytecode for: ext.mods.gameserver.enums.IntentionType
// File: ext\mods\gameserver\enums\IntentionType.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/enums/IntentionType.class
  Last modified 9 de jul de 2026; size 1929 bytes
  MD5 checksum 1c503aae8366fdf226d2e61512768296
  Compiled from "IntentionType.java"
public final class ext.mods.gameserver.enums.IntentionType extends java.lang.Enum<ext.mods.gameserver.enums.IntentionType>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/enums/IntentionType
  super_class: #62                        // java/lang/Enum
  interfaces: 0, fields: 17, methods: 5, attributes: 2
Constant pool:
    #1 = Class              #2            // ext/mods/gameserver/enums/IntentionType
    #2 = Utf8               ext/mods/gameserver/enums/IntentionType
    #3 = Fieldref           #1.#4         // ext/mods/gameserver/enums/IntentionType.ATTACK:Lext/mods/gameserver/enums/IntentionType;
    #4 = NameAndType        #5:#6         // ATTACK:Lext/mods/gameserver/enums/IntentionType;
    #5 = Utf8               ATTACK
    #6 = Utf8               Lext/mods/gameserver/enums/IntentionType;
    #7 = Fieldref           #1.#8         // ext/mods/gameserver/enums/IntentionType.CAST:Lext/mods/gameserver/enums/IntentionType;
    #8 = NameAndType        #9:#6         // CAST:Lext/mods/gameserver/enums/IntentionType;
    #9 = Utf8               CAST
   #10 = Fieldref           #1.#11        // ext/mods/gameserver/enums/IntentionType.FAKE_DEATH:Lext/mods/gameserver/enums/IntentionType;
   #11 = NameAndType        #12:#6        // FAKE_DEATH:Lext/mods/gameserver/enums/IntentionType;
   #12 = Utf8               FAKE_DEATH
   #13 = Fieldref           #1.#14        // ext/mods/gameserver/enums/IntentionType.FLEE:Lext/mods/gameserver/enums/IntentionType;
   #14 = NameAndType        #15:#6        // FLEE:Lext/mods/gameserver/enums/IntentionType;
   #15 = Utf8               FLEE
   #16 = Fieldref           #1.#17        // ext/mods/gameserver/enums/IntentionType.FOLLOW:Lext/mods/gameserver/enums/IntentionType;
   #17 = NameAndType        #18:#6        // FOLLOW:Lext/mods/gameserver/enums/IntentionType;
   #18 = Utf8               FOLLOW
   #19 = Fieldref           #1.#20        // ext/mods/gameserver/enums/IntentionType.IDLE:Lext/mods/gameserver/enums/IntentionType;
   #20 = NameAndType        #21:#6        // IDLE:Lext/mods/gameserver/enums/IntentionType;
   #21 = Utf8               IDLE
   #22 = Fieldref           #1.#23        // ext/mods/gameserver/enums/IntentionType.INTERACT:Lext/mods/gameserver/enums/IntentionType;
   #23 = NameAndType        #24:#6        // INTERACT:Lext/mods/gameserver/enums/IntentionType;
   #24 = Utf8               INTERACT
   #25 = Fieldref           #1.#26        // ext/mods/gameserver/enums/IntentionType.MOVE_ROUTE:Lext/mods/gameserver/enums/IntentionType;
   #26 = NameAndType        #27:#6        // MOVE_ROUTE:Lext/mods/gameserver/enums/IntentionType;
   #27 = Utf8               MOVE_ROUTE
   #28 = Fieldref           #1.#29        // ext/mods/gameserver/enums/IntentionType.MOVE_TO:Lext/mods/gameserver/enums/IntentionType;
   #29 = NameAndType        #30:#6        // MOVE_TO:Lext/mods/gameserver/enums/IntentionType;
   #30 = Utf8               MOVE_TO
   #31 = Fieldref           #1.#32        // ext/mods/gameserver/enums/IntentionType.NOTHING:Lext/mods/gameserver/enums/IntentionType;
   #32 = NameAndType        #33:#6        // NOTHING:Lext/mods/gameserver/enums/IntentionType;
   #33 = Utf8               NOTHING
   #34 = Fieldref           #1.#35        // ext/mods/gameserver/enums/IntentionType.PICK_UP:Lext/mods/gameserver/enums/IntentionType;
   #35 = NameAndType        #36:#6        // PICK_UP:Lext/mods/gameserver/enums/IntentionType;
   #36 = Utf8               PICK_UP
   #37 = Fieldref           #1.#38        // ext/mods/gameserver/enums/IntentionType.SIT:Lext/mods/gameserver/enums/IntentionType;
   #38 = NameAndType        #39:#6        // SIT:Lext/mods/gameserver/enums/IntentionType;
   #39 = Utf8               SIT
   #40 = Fieldref           #1.#41        // ext/mods/gameserver/enums/IntentionType.SOCIAL:Lext/mods/gameserver/enums/IntentionType;
   #41 = NameAndType        #42:#6        // SOCIAL:Lext/mods/gameserver/enums/IntentionType;
   #42 = Utf8               SOCIAL
   #43 = Fieldref           #1.#44        // ext/mods/gameserver/enums/IntentionType.STAND:Lext/mods/gameserver/enums/IntentionType;
   #44 = NameAndType        #45:#6        // STAND:Lext/mods/gameserver/enums/IntentionType;
   #45 = Utf8               STAND
   #46 = Fieldref           #1.#47        // ext/mods/gameserver/enums/IntentionType.USE_ITEM:Lext/mods/gameserver/enums/IntentionType;
   #47 = NameAndType        #48:#6        // USE_ITEM:Lext/mods/gameserver/enums/IntentionType;
   #48 = Utf8               USE_ITEM
   #49 = Fieldref           #1.#50        // ext/mods/gameserver/enums/IntentionType.WANDER:Lext/mods/gameserver/enums/IntentionType;
   #50 = NameAndType        #51:#6        // WANDER:Lext/mods/gameserver/enums/IntentionType;
   #51 = Utf8               WANDER
   #52 = Fieldref           #1.#53        // ext/mods/gameserver/enums/IntentionType.$VALUES:[Lext/mods/gameserver/enums/IntentionType;
   #53 = NameAndType        #54:#55       // $VALUES:[Lext/mods/gameserver/enums/IntentionType;
   #54 = Utf8               $VALUES
   #55 = Utf8               [Lext/mods/gameserver/enums/IntentionType;
   #56 = Methodref          #57.#58       // "[Lext/mods/gameserver/enums/IntentionType;".clone:()Ljava/lang/Object;
   #57 = Class              #55           // "[Lext/mods/gameserver/enums/IntentionType;"
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
   #71 = String             #5            // ATTACK
   #72 = Methodref          #1.#68        // ext/mods/gameserver/enums/IntentionType."<init>":(Ljava/lang/String;I)V
   #73 = String             #9            // CAST
   #74 = String             #12           // FAKE_DEATH
   #75 = String             #15           // FLEE
   #76 = String             #18           // FOLLOW
   #77 = String             #21           // IDLE
   #78 = String             #24           // INTERACT
   #79 = String             #27           // MOVE_ROUTE
   #80 = String             #30           // MOVE_TO
   #81 = String             #33           // NOTHING
   #82 = String             #36           // PICK_UP
   #83 = String             #39           // SIT
   #84 = String             #42           // SOCIAL
   #85 = String             #45           // STAND
   #86 = String             #48           // USE_ITEM
   #87 = String             #51           // WANDER
   #88 = Methodref          #1.#89        // ext/mods/gameserver/enums/IntentionType.$values:()[Lext/mods/gameserver/enums/IntentionType;
   #89 = NameAndType        #90:#91       // $values:()[Lext/mods/gameserver/enums/IntentionType;
   #90 = Utf8               $values
   #91 = Utf8               ()[Lext/mods/gameserver/enums/IntentionType;
   #92 = Utf8               values
   #93 = Utf8               Code
   #94 = Utf8               LineNumberTable
   #95 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/IntentionType;
   #96 = Utf8               LocalVariableTable
   #97 = Utf8               name
   #98 = Utf8               Ljava/lang/String;
   #99 = Utf8               MethodParameters
  #100 = Utf8               this
  #101 = Utf8               Signature
  #102 = Utf8               ()V
  #103 = Utf8               <clinit>
  #104 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/enums/IntentionType;>;
  #105 = Utf8               SourceFile
  #106 = Utf8               IntentionType.java
{
  public static final ext.mods.gameserver.enums.IntentionType ATTACK;
    descriptor: Lext/mods/gameserver/enums/IntentionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.IntentionType CAST;
    descriptor: Lext/mods/gameserver/enums/IntentionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.IntentionType FAKE_DEATH;
    descriptor: Lext/mods/gameserver/enums/IntentionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.IntentionType FLEE;
    descriptor: Lext/mods/gameserver/enums/IntentionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.IntentionType FOLLOW;
    descriptor: Lext/mods/gameserver/enums/IntentionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.IntentionType IDLE;
    descriptor: Lext/mods/gameserver/enums/IntentionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.IntentionType INTERACT;
    descriptor: Lext/mods/gameserver/enums/IntentionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.IntentionType MOVE_ROUTE;
    descriptor: Lext/mods/gameserver/enums/IntentionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.IntentionType MOVE_TO;
    descriptor: Lext/mods/gameserver/enums/IntentionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.IntentionType NOTHING;
    descriptor: Lext/mods/gameserver/enums/IntentionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.IntentionType PICK_UP;
    descriptor: Lext/mods/gameserver/enums/IntentionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.IntentionType SIT;
    descriptor: Lext/mods/gameserver/enums/IntentionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.IntentionType SOCIAL;
    descriptor: Lext/mods/gameserver/enums/IntentionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.IntentionType STAND;
    descriptor: Lext/mods/gameserver/enums/IntentionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.IntentionType USE_ITEM;
    descriptor: Lext/mods/gameserver/enums/IntentionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.IntentionType WANDER;
    descriptor: Lext/mods/gameserver/enums/IntentionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static ext.mods.gameserver.enums.IntentionType[] values();
    descriptor: ()[Lext/mods/gameserver/enums/IntentionType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #52                 // Field $VALUES:[Lext/mods/gameserver/enums/IntentionType;
         3: invokevirtual #56                 // Method "[Lext/mods/gameserver/enums/IntentionType;".clone:()Ljava/lang/Object;
         6: checkcast     #57                 // class "[Lext/mods/gameserver/enums/IntentionType;"
         9: areturn
      LineNumberTable:
        line 23: 0

  public static ext.mods.gameserver.enums.IntentionType valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/enums/IntentionType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/enums/IntentionType
         2: aload_0
         3: invokestatic  #61                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/enums/IntentionType
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
         0: new           #1                  // class ext/mods/gameserver/enums/IntentionType
         3: dup
         4: ldc           #71                 // String ATTACK
         6: iconst_0
         7: invokespecial #72                 // Method "<init>":(Ljava/lang/String;I)V
        10: putstatic     #3                  // Field ATTACK:Lext/mods/gameserver/enums/IntentionType;
        13: new           #1                  // class ext/mods/gameserver/enums/IntentionType
        16: dup
        17: ldc           #73                 // String CAST
        19: iconst_1
        20: invokespecial #72                 // Method "<init>":(Ljava/lang/String;I)V
        23: putstatic     #7                  // Field CAST:Lext/mods/gameserver/enums/IntentionType;
        26: new           #1                  // class ext/mods/gameserver/enums/IntentionType
        29: dup
        30: ldc           #74                 // String FAKE_DEATH
        32: iconst_2
        33: invokespecial #72                 // Method "<init>":(Ljava/lang/String;I)V
        36: putstatic     #10                 // Field FAKE_DEATH:Lext/mods/gameserver/enums/IntentionType;
        39: new           #1                  // class ext/mods/gameserver/enums/IntentionType
        42: dup
        43: ldc           #75                 // String FLEE
        45: iconst_3
        46: invokespecial #72                 // Method "<init>":(Ljava/lang/String;I)V
        49: putstatic     #13                 // Field FLEE:Lext/mods/gameserver/enums/IntentionType;
        52: new           #1                  // class ext/mods/gameserver/enums/IntentionType
        55: dup
        56: ldc           #76                 // String FOLLOW
        58: iconst_4
        59: invokespecial #72                 // Method "<init>":(Ljava/lang/String;I)V
        62: putstatic     #16                 // Field FOLLOW:Lext/mods/gameserver/enums/IntentionType;
        65: new           #1                  // class ext/mods/gameserver/enums/IntentionType
        68: dup
        69: ldc           #77                 // String IDLE
        71: iconst_5
        72: invokespecial #72                 // Method "<init>":(Ljava/lang/String;I)V
        75: putstatic     #19                 // Field IDLE:Lext/mods/gameserver/enums/IntentionType;
        78: new           #1                  // class ext/mods/gameserver/enums/IntentionType
        81: dup
        82: ldc           #78                 // String INTERACT
        84: bipush        6
        86: invokespecial #72                 // Method "<init>":(Ljava/lang/String;I)V
        89: putstatic     #22                 // Field INTERACT:Lext/mods/gameserver/enums/IntentionType;
        92: new           #1                  // class ext/mods/gameserver/enums/IntentionType
        95: dup
        96: ldc           #79                 // String MOVE_ROUTE
        98: bipush        7
       100: invokespecial #72                 // Method "<init>":(Ljava/lang/String;I)V
       103: putstatic     #25                 // Field MOVE_ROUTE:Lext/mods/gameserver/enums/IntentionType;
       106: new           #1                  // class ext/mods/gameserver/enums/IntentionType
       109: dup
       110: ldc           #80                 // String MOVE_TO
       112: bipush        8
       114: invokespecial #72                 // Method "<init>":(Ljava/lang/String;I)V
       117: putstatic     #28                 // Field MOVE_TO:Lext/mods/gameserver/enums/IntentionType;
       120: new           #1                  // class ext/mods/gameserver/enums/IntentionType
       123: dup
       124: ldc           #81                 // String NOTHING
       126: bipush        9
       128: invokespecial #72                 // Method "<init>":(Ljava/lang/String;I)V
       131: putstatic     #31                 // Field NOTHING:Lext/mods/gameserver/enums/IntentionType;
       134: new           #1                  // class ext/mods/gameserver/enums/IntentionType
       137: dup
       138: ldc           #82                 // String PICK_UP
       140: bipush        10
       142: invokespecial #72                 // Method "<init>":(Ljava/lang/String;I)V
       145: putstatic     #34                 // Field PICK_UP:Lext/mods/gameserver/enums/IntentionType;
       148: new           #1                  // class ext/mods/gameserver/enums/IntentionType
       151: dup
       152: ldc           #83                 // String SIT
       154: bipush        11
       156: invokespecial #72                 // Method "<init>":(Ljava/lang/String;I)V
       159: putstatic     #37                 // Field SIT:Lext/mods/gameserver/enums/IntentionType;
       162: new           #1                  // class ext/mods/gameserver/enums/IntentionType
       165: dup
       166: ldc           #84                 // String SOCIAL
       168: bipush        12
       170: invokespecial #72                 // Method "<init>":(Ljava/lang/String;I)V
       173: putstatic     #40                 // Field SOCIAL:Lext/mods/gameserver/enums/IntentionType;
       176: new           #1                  // class ext/mods/gameserver/enums/IntentionType
       179: dup
       180: ldc           #85                 // String STAND
       182: bipush        13
       184: invokespecial #72                 // Method "<init>":(Ljava/lang/String;I)V
       187: putstatic     #43                 // Field STAND:Lext/mods/gameserver/enums/IntentionType;
       190: new           #1                  // class ext/mods/gameserver/enums/IntentionType
       193: dup
       194: ldc           #86                 // String USE_ITEM
       196: bipush        14
       198: invokespecial #72                 // Method "<init>":(Ljava/lang/String;I)V
       201: putstatic     #46                 // Field USE_ITEM:Lext/mods/gameserver/enums/IntentionType;
       204: new           #1                  // class ext/mods/gameserver/enums/IntentionType
       207: dup
       208: ldc           #87                 // String WANDER
       210: bipush        15
       212: invokespecial #72                 // Method "<init>":(Ljava/lang/String;I)V
       215: putstatic     #49                 // Field WANDER:Lext/mods/gameserver/enums/IntentionType;
       218: invokestatic  #88                 // Method $values:()[Lext/mods/gameserver/enums/IntentionType;
       221: putstatic     #52                 // Field $VALUES:[Lext/mods/gameserver/enums/IntentionType;
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
Signature: #104                         // Ljava/lang/Enum<Lext/mods/gameserver/enums/IntentionType;>;
SourceFile: "IntentionType.java"
