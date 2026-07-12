// Bytecode for: ext.mods.gameserver.enums.actors.ClassRace
// File: ext\mods\gameserver\enums\actors\ClassRace.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/enums/actors/ClassRace.class
  Last modified 9 de jul de 2026; size 2468 bytes
  MD5 checksum 5905d5115e750c6ee35c1fc98d3b88d7
  Compiled from "ClassRace.java"
public final class ext.mods.gameserver.enums.actors.ClassRace extends java.lang.Enum<ext.mods.gameserver.enums.actors.ClassRace>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/enums/actors/ClassRace
  super_class: #29                        // java/lang/Enum
  interfaces: 0, fields: 8, methods: 7, attributes: 2
Constant pool:
    #1 = Class              #2            // ext/mods/gameserver/enums/actors/ClassRace
    #2 = Utf8               ext/mods/gameserver/enums/actors/ClassRace
    #3 = Fieldref           #1.#4         // ext/mods/gameserver/enums/actors/ClassRace.HUMAN:Lext/mods/gameserver/enums/actors/ClassRace;
    #4 = NameAndType        #5:#6         // HUMAN:Lext/mods/gameserver/enums/actors/ClassRace;
    #5 = Utf8               HUMAN
    #6 = Utf8               Lext/mods/gameserver/enums/actors/ClassRace;
    #7 = Fieldref           #1.#8         // ext/mods/gameserver/enums/actors/ClassRace.ELF:Lext/mods/gameserver/enums/actors/ClassRace;
    #8 = NameAndType        #9:#6         // ELF:Lext/mods/gameserver/enums/actors/ClassRace;
    #9 = Utf8               ELF
   #10 = Fieldref           #1.#11        // ext/mods/gameserver/enums/actors/ClassRace.DARK_ELF:Lext/mods/gameserver/enums/actors/ClassRace;
   #11 = NameAndType        #12:#6        // DARK_ELF:Lext/mods/gameserver/enums/actors/ClassRace;
   #12 = Utf8               DARK_ELF
   #13 = Fieldref           #1.#14        // ext/mods/gameserver/enums/actors/ClassRace.ORC:Lext/mods/gameserver/enums/actors/ClassRace;
   #14 = NameAndType        #15:#6        // ORC:Lext/mods/gameserver/enums/actors/ClassRace;
   #15 = Utf8               ORC
   #16 = Fieldref           #1.#17        // ext/mods/gameserver/enums/actors/ClassRace.DWARF:Lext/mods/gameserver/enums/actors/ClassRace;
   #17 = NameAndType        #18:#6        // DWARF:Lext/mods/gameserver/enums/actors/ClassRace;
   #18 = Utf8               DWARF
   #19 = Fieldref           #1.#20        // ext/mods/gameserver/enums/actors/ClassRace.$VALUES:[Lext/mods/gameserver/enums/actors/ClassRace;
   #20 = NameAndType        #21:#22       // $VALUES:[Lext/mods/gameserver/enums/actors/ClassRace;
   #21 = Utf8               $VALUES
   #22 = Utf8               [Lext/mods/gameserver/enums/actors/ClassRace;
   #23 = Methodref          #24.#25       // "[Lext/mods/gameserver/enums/actors/ClassRace;".clone:()Ljava/lang/Object;
   #24 = Class              #22           // "[Lext/mods/gameserver/enums/actors/ClassRace;"
   #25 = NameAndType        #26:#27       // clone:()Ljava/lang/Object;
   #26 = Utf8               clone
   #27 = Utf8               ()Ljava/lang/Object;
   #28 = Methodref          #29.#30       // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #29 = Class              #31           // java/lang/Enum
   #30 = NameAndType        #32:#33       // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #31 = Utf8               java/lang/Enum
   #32 = Utf8               valueOf
   #33 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #34 = Methodref          #29.#35       // java/lang/Enum."<init>":(Ljava/lang/String;I)V
   #35 = NameAndType        #36:#37       // "<init>":(Ljava/lang/String;I)V
   #36 = Utf8               <init>
   #37 = Utf8               (Ljava/lang/String;I)V
   #38 = Fieldref           #1.#39        // ext/mods/gameserver/enums/actors/ClassRace._breathMultiplier:D
   #39 = NameAndType        #40:#41       // _breathMultiplier:D
   #40 = Utf8               _breathMultiplier
   #41 = Utf8               D
   #42 = Methodref          #43.#44       // java/lang/String.hashCode:()I
   #43 = Class              #45           // java/lang/String
   #44 = NameAndType        #46:#47       // hashCode:()I
   #45 = Utf8               java/lang/String
   #46 = Utf8               hashCode
   #47 = Utf8               ()I
   #48 = String             #49           // @race_human
   #49 = Utf8               @race_human
   #50 = Methodref          #43.#51       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #51 = NameAndType        #52:#53       // equals:(Ljava/lang/Object;)Z
   #52 = Utf8               equals
   #53 = Utf8               (Ljava/lang/Object;)Z
   #54 = String             #55           // @race_elf
   #55 = Utf8               @race_elf
   #56 = String             #57           // @race_dark_elf
   #57 = Utf8               @race_dark_elf
   #58 = String             #59           // @race_orc
   #59 = Utf8               @race_orc
   #60 = String             #61           // @race_dwarf
   #61 = Utf8               @race_dwarf
   #62 = Methodref          #63.#64       // ext/mods/gameserver/model/actor/Player.getRace:()Lext/mods/gameserver/enums/actors/ClassRace;
   #63 = Class              #65           // ext/mods/gameserver/model/actor/Player
   #64 = NameAndType        #66:#67       // getRace:()Lext/mods/gameserver/enums/actors/ClassRace;
   #65 = Utf8               ext/mods/gameserver/model/actor/Player
   #66 = Utf8               getRace
   #67 = Utf8               ()Lext/mods/gameserver/enums/actors/ClassRace;
   #68 = String             #5            // HUMAN
   #69 = Methodref          #1.#70        // ext/mods/gameserver/enums/actors/ClassRace."<init>":(Ljava/lang/String;ID)V
   #70 = NameAndType        #36:#71       // "<init>":(Ljava/lang/String;ID)V
   #71 = Utf8               (Ljava/lang/String;ID)V
   #72 = String             #9            // ELF
   #73 = Double             1.5d
   #75 = String             #12           // DARK_ELF
   #76 = String             #15           // ORC
   #77 = Double             0.9d
   #79 = String             #18           // DWARF
   #80 = Double             0.8d
   #82 = Methodref          #1.#83        // ext/mods/gameserver/enums/actors/ClassRace.$values:()[Lext/mods/gameserver/enums/actors/ClassRace;
   #83 = NameAndType        #84:#85       // $values:()[Lext/mods/gameserver/enums/actors/ClassRace;
   #84 = Utf8               $values
   #85 = Utf8               ()[Lext/mods/gameserver/enums/actors/ClassRace;
   #86 = Methodref          #1.#87        // ext/mods/gameserver/enums/actors/ClassRace.values:()[Lext/mods/gameserver/enums/actors/ClassRace;
   #87 = NameAndType        #88:#85       // values:()[Lext/mods/gameserver/enums/actors/ClassRace;
   #88 = Utf8               values
   #89 = Fieldref           #1.#90        // ext/mods/gameserver/enums/actors/ClassRace.VALUES:[Lext/mods/gameserver/enums/actors/ClassRace;
   #90 = NameAndType        #91:#22       // VALUES:[Lext/mods/gameserver/enums/actors/ClassRace;
   #91 = Utf8               VALUES
   #92 = Utf8               Code
   #93 = Utf8               LineNumberTable
   #94 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/actors/ClassRace;
   #95 = Utf8               LocalVariableTable
   #96 = Utf8               name
   #97 = Utf8               Ljava/lang/String;
   #98 = Utf8               MethodParameters
   #99 = Utf8               this
  #100 = Utf8               breathMultiplier
  #101 = Utf8               Signature
  #102 = Utf8               (D)V
  #103 = Utf8               getBreathMultiplier
  #104 = Utf8               ()D
  #105 = Utf8               isSameRace
  #106 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
  #107 = Utf8               player
  #108 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #109 = Utf8               race
  #110 = Utf8               StackMapTable
  #111 = Utf8               <clinit>
  #112 = Utf8               ()V
  #113 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/enums/actors/ClassRace;>;
  #114 = Utf8               SourceFile
  #115 = Utf8               ClassRace.java
{
  public static final ext.mods.gameserver.enums.actors.ClassRace HUMAN;
    descriptor: Lext/mods/gameserver/enums/actors/ClassRace;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassRace ELF;
    descriptor: Lext/mods/gameserver/enums/actors/ClassRace;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassRace DARK_ELF;
    descriptor: Lext/mods/gameserver/enums/actors/ClassRace;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassRace ORC;
    descriptor: Lext/mods/gameserver/enums/actors/ClassRace;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassRace DWARF;
    descriptor: Lext/mods/gameserver/enums/actors/ClassRace;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassRace[] VALUES;
    descriptor: [Lext/mods/gameserver/enums/actors/ClassRace;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public static ext.mods.gameserver.enums.actors.ClassRace[] values();
    descriptor: ()[Lext/mods/gameserver/enums/actors/ClassRace;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #19                 // Field $VALUES:[Lext/mods/gameserver/enums/actors/ClassRace;
         3: invokevirtual #23                 // Method "[Lext/mods/gameserver/enums/actors/ClassRace;".clone:()Ljava/lang/Object;
         6: checkcast     #24                 // class "[Lext/mods/gameserver/enums/actors/ClassRace;"
         9: areturn
      LineNumberTable:
        line 25: 0

  public static ext.mods.gameserver.enums.actors.ClassRace valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/enums/actors/ClassRace;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/enums/actors/ClassRace
         2: aload_0
         3: invokestatic  #28                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/enums/actors/ClassRace
         9: areturn
      LineNumberTable:
        line 25: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  name   Ljava/lang/String;
    MethodParameters:
      Name                           Flags
      <no name>                      mandated

  public double getBreathMultiplier();
    descriptor: ()D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #38                 // Field _breathMultiplier:D
         4: dreturn
      LineNumberTable:
        line 47: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/actors/ClassRace;

  public static final boolean isSameRace(ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=2, locals=4, args_size=2
         0: aload_0
         1: ifnull        8
         4: aload_1
         5: ifnonnull     10
         8: iconst_0
         9: ireturn
        10: aload_1
        11: astore_2
        12: iconst_m1
        13: istore_3
        14: aload_2
        15: invokevirtual #42                 // Method java/lang/String.hashCode:()I
        18: lookupswitch  { // 5

              -494010828: 124

              -490365313: 68

               -88742460: 96

               222950001: 82

               222959794: 110
                 default: 135
            }
        68: aload_2
        69: ldc           #48                 // String @race_human
        71: invokevirtual #50                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        74: ifeq          135
        77: iconst_0
        78: istore_3
        79: goto          135
        82: aload_2
        83: ldc           #54                 // String @race_elf
        85: invokevirtual #50                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        88: ifeq          135
        91: iconst_1
        92: istore_3
        93: goto          135
        96: aload_2
        97: ldc           #56                 // String @race_dark_elf
        99: invokevirtual #50                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       102: ifeq          135
       105: iconst_2
       106: istore_3
       107: goto          135
       110: aload_2
       111: ldc           #58                 // String @race_orc
       113: invokevirtual #50                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       116: ifeq          135
       119: iconst_3
       120: istore_3
       121: goto          135
       124: aload_2
       125: ldc           #60                 // String @race_dwarf
       127: invokevirtual #50                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       130: ifeq          135
       133: iconst_4
       134: istore_3
       135: iload_3
       136: tableswitch   { // 0 to 4

                       0: 172

                       1: 188

                       2: 204

                       3: 220

                       4: 236
                 default: 252
            }
       172: aload_0
       173: invokevirtual #62                 // Method ext/mods/gameserver/model/actor/Player.getRace:()Lext/mods/gameserver/enums/actors/ClassRace;
       176: getstatic     #3                  // Field HUMAN:Lext/mods/gameserver/enums/actors/ClassRace;
       179: if_acmpne     186
       182: iconst_1
       183: goto          187
       186: iconst_0
       187: ireturn
       188: aload_0
       189: invokevirtual #62                 // Method ext/mods/gameserver/model/actor/Player.getRace:()Lext/mods/gameserver/enums/actors/ClassRace;
       192: getstatic     #7                  // Field ELF:Lext/mods/gameserver/enums/actors/ClassRace;
       195: if_acmpne     202
       198: iconst_1
       199: goto          203
       202: iconst_0
       203: ireturn
       204: aload_0
       205: invokevirtual #62                 // Method ext/mods/gameserver/model/actor/Player.getRace:()Lext/mods/gameserver/enums/actors/ClassRace;
       208: getstatic     #10                 // Field DARK_ELF:Lext/mods/gameserver/enums/actors/ClassRace;
       211: if_acmpne     218
       214: iconst_1
       215: goto          219
       218: iconst_0
       219: ireturn
       220: aload_0
       221: invokevirtual #62                 // Method ext/mods/gameserver/model/actor/Player.getRace:()Lext/mods/gameserver/enums/actors/ClassRace;
       224: getstatic     #13                 // Field ORC:Lext/mods/gameserver/enums/actors/ClassRace;
       227: if_acmpne     234
       230: iconst_1
       231: goto          235
       234: iconst_0
       235: ireturn
       236: aload_0
       237: invokevirtual #62                 // Method ext/mods/gameserver/model/actor/Player.getRace:()Lext/mods/gameserver/enums/actors/ClassRace;
       240: getstatic     #16                 // Field DWARF:Lext/mods/gameserver/enums/actors/ClassRace;
       243: if_acmpne     250
       246: iconst_1
       247: goto          251
       250: iconst_0
       251: ireturn
       252: iconst_0
       253: ireturn
      LineNumberTable:
        line 52: 0
        line 53: 8
        line 55: 10
        line 58: 172
        line 61: 188
        line 64: 204
        line 67: 220
        line 70: 236
        line 72: 252
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     254     0 player   Lext/mods/gameserver/model/actor/Player;
            0     254     1  race   Ljava/lang/String;
      StackMapTable: number_of_entries = 24
        frame_type = 8 /* same */
        frame_type = 1 /* same */
        frame_type = 253 /* append */
          offset_delta = 57
          locals = [ class java/lang/String, int ]
        frame_type = 13 /* same */
        frame_type = 13 /* same */
        frame_type = 13 /* same */
        frame_type = 13 /* same */
        frame_type = 10 /* same */
        frame_type = 36 /* same */
        frame_type = 13 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 0 /* same */
        frame_type = 13 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 0 /* same */
        frame_type = 13 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 0 /* same */
        frame_type = 13 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 0 /* same */
        frame_type = 13 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 249 /* chop */
          offset_delta = 0

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=6, locals=0, args_size=0
         0: new           #1                  // class ext/mods/gameserver/enums/actors/ClassRace
         3: dup
         4: ldc           #68                 // String HUMAN
         6: iconst_0
         7: dconst_1
         8: invokespecial #69                 // Method "<init>":(Ljava/lang/String;ID)V
        11: putstatic     #3                  // Field HUMAN:Lext/mods/gameserver/enums/actors/ClassRace;
        14: new           #1                  // class ext/mods/gameserver/enums/actors/ClassRace
        17: dup
        18: ldc           #72                 // String ELF
        20: iconst_1
        21: ldc2_w        #73                 // double 1.5d
        24: invokespecial #69                 // Method "<init>":(Ljava/lang/String;ID)V
        27: putstatic     #7                  // Field ELF:Lext/mods/gameserver/enums/actors/ClassRace;
        30: new           #1                  // class ext/mods/gameserver/enums/actors/ClassRace
        33: dup
        34: ldc           #75                 // String DARK_ELF
        36: iconst_2
        37: ldc2_w        #73                 // double 1.5d
        40: invokespecial #69                 // Method "<init>":(Ljava/lang/String;ID)V
        43: putstatic     #10                 // Field DARK_ELF:Lext/mods/gameserver/enums/actors/ClassRace;
        46: new           #1                  // class ext/mods/gameserver/enums/actors/ClassRace
        49: dup
        50: ldc           #76                 // String ORC
        52: iconst_3
        53: ldc2_w        #77                 // double 0.9d
        56: invokespecial #69                 // Method "<init>":(Ljava/lang/String;ID)V
        59: putstatic     #13                 // Field ORC:Lext/mods/gameserver/enums/actors/ClassRace;
        62: new           #1                  // class ext/mods/gameserver/enums/actors/ClassRace
        65: dup
        66: ldc           #79                 // String DWARF
        68: iconst_4
        69: ldc2_w        #80                 // double 0.8d
        72: invokespecial #69                 // Method "<init>":(Ljava/lang/String;ID)V
        75: putstatic     #16                 // Field DWARF:Lext/mods/gameserver/enums/actors/ClassRace;
        78: invokestatic  #82                 // Method $values:()[Lext/mods/gameserver/enums/actors/ClassRace;
        81: putstatic     #19                 // Field $VALUES:[Lext/mods/gameserver/enums/actors/ClassRace;
        84: invokestatic  #86                 // Method values:()[Lext/mods/gameserver/enums/actors/ClassRace;
        87: putstatic     #89                 // Field VALUES:[Lext/mods/gameserver/enums/actors/ClassRace;
        90: return
      LineNumberTable:
        line 27: 0
        line 28: 14
        line 29: 30
        line 30: 46
        line 31: 62
        line 25: 78
        line 33: 84
}
Signature: #113                         // Ljava/lang/Enum<Lext/mods/gameserver/enums/actors/ClassRace;>;
SourceFile: "ClassRace.java"
