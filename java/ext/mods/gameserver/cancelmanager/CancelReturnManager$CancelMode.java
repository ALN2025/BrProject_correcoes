// Bytecode for: ext.mods.gameserver.cancelmanager.CancelReturnManager$CancelMode
// File: ext\mods\gameserver\cancelmanager\CancelReturnManager$CancelMode.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode.class
  Last modified 9 de jul de 2026; size 2211 bytes
  MD5 checksum 4c27133aa708c19d1e327faaea810cfe
  Compiled from "CancelReturnManager.java"
public final class ext.mods.gameserver.cancelmanager.CancelReturnManager$CancelMode extends java.lang.Enum<ext.mods.gameserver.cancelmanager.CancelReturnManager$CancelMode>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode
  super_class: #23                        // java/lang/Enum
  interfaces: 0, fields: 5, methods: 7, attributes: 4
Constant pool:
   #1 = Class              #2             // ext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode
   #2 = Utf8               ext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode
   #3 = Fieldref           #1.#4          // ext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode.CANCEL_ONLY:Lext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode;
   #4 = NameAndType        #5:#6          // CANCEL_ONLY:Lext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode;
   #5 = Utf8               CANCEL_ONLY
   #6 = Utf8               Lext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode;
   #7 = Fieldref           #1.#8          // ext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode.CANCEL_AND_NEGATE:Lext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode;
   #8 = NameAndType        #9:#6          // CANCEL_AND_NEGATE:Lext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode;
   #9 = Utf8               CANCEL_AND_NEGATE
  #10 = Fieldref           #1.#11         // ext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode.ALL:Lext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode;
  #11 = NameAndType        #12:#6         // ALL:Lext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode;
  #12 = Utf8               ALL
  #13 = Fieldref           #1.#14         // ext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode.$VALUES:[Lext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode;
  #14 = NameAndType        #15:#16        // $VALUES:[Lext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode;
  #15 = Utf8               $VALUES
  #16 = Utf8               [Lext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode;
  #17 = Methodref          #18.#19        // "[Lext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode;".clone:()Ljava/lang/Object;
  #18 = Class              #16            // "[Lext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode;"
  #19 = NameAndType        #20:#21        // clone:()Ljava/lang/Object;
  #20 = Utf8               clone
  #21 = Utf8               ()Ljava/lang/Object;
  #22 = Methodref          #23.#24        // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #23 = Class              #25            // java/lang/Enum
  #24 = NameAndType        #26:#27        // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #25 = Utf8               java/lang/Enum
  #26 = Utf8               valueOf
  #27 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #28 = Methodref          #23.#29        // java/lang/Enum."<init>":(Ljava/lang/String;I)V
  #29 = NameAndType        #30:#31        // "<init>":(Ljava/lang/String;I)V
  #30 = Utf8               <init>
  #31 = Utf8               (Ljava/lang/String;I)V
  #32 = Fieldref           #1.#33         // ext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode.description:Ljava/lang/String;
  #33 = NameAndType        #34:#35        // description:Ljava/lang/String;
  #34 = Utf8               description
  #35 = Utf8               Ljava/lang/String;
  #36 = Methodref          #37.#38        // java/lang/String.toUpperCase:()Ljava/lang/String;
  #37 = Class              #39            // java/lang/String
  #38 = NameAndType        #40:#41        // toUpperCase:()Ljava/lang/String;
  #39 = Utf8               java/lang/String
  #40 = Utf8               toUpperCase
  #41 = Utf8               ()Ljava/lang/String;
  #42 = Methodref          #37.#43        // java/lang/String.hashCode:()I
  #43 = NameAndType        #44:#45        // hashCode:()I
  #44 = Utf8               hashCode
  #45 = Utf8               ()I
  #46 = String             #5             // CANCEL_ONLY
  #47 = Methodref          #37.#48        // java/lang/String.equals:(Ljava/lang/Object;)Z
  #48 = NameAndType        #49:#50        // equals:(Ljava/lang/Object;)Z
  #49 = Utf8               equals
  #50 = Utf8               (Ljava/lang/Object;)Z
  #51 = String             #9             // CANCEL_AND_NEGATE
  #52 = String             #12            // ALL
  #53 = String             #54            // Apenas skills de cancel
  #54 = Utf8               Apenas skills de cancel
  #55 = Methodref          #1.#56         // ext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode."<init>":(Ljava/lang/String;ILjava/lang/String;)V
  #56 = NameAndType        #30:#57        // "<init>":(Ljava/lang/String;ILjava/lang/String;)V
  #57 = Utf8               (Ljava/lang/String;ILjava/lang/String;)V
  #58 = String             #59            // Cancel e negate
  #59 = Utf8               Cancel e negate
  #60 = String             #61            // Todos os tipos
  #61 = Utf8               Todos os tipos
  #62 = Methodref          #1.#63         // ext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode.$values:()[Lext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode;
  #63 = NameAndType        #64:#65        // $values:()[Lext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode;
  #64 = Utf8               $values
  #65 = Utf8               ()[Lext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode;
  #66 = Utf8               values
  #67 = Utf8               Code
  #68 = Utf8               LineNumberTable
  #69 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode;
  #70 = Utf8               LocalVariableTable
  #71 = Utf8               name
  #72 = Utf8               MethodParameters
  #73 = Utf8               this
  #74 = Utf8               Signature
  #75 = Utf8               (Ljava/lang/String;)V
  #76 = Utf8               getDescription
  #77 = Utf8               fromString
  #78 = Utf8               value
  #79 = Utf8               StackMapTable
  #80 = Utf8               <clinit>
  #81 = Utf8               ()V
  #82 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode;>;
  #83 = Utf8               SourceFile
  #84 = Utf8               CancelReturnManager.java
  #85 = Utf8               NestHost
  #86 = Class              #87            // ext/mods/gameserver/cancelmanager/CancelReturnManager
  #87 = Utf8               ext/mods/gameserver/cancelmanager/CancelReturnManager
  #88 = Utf8               InnerClasses
  #89 = Utf8               CancelMode
{
  public static final ext.mods.gameserver.cancelmanager.CancelReturnManager$CancelMode CANCEL_ONLY;
    descriptor: Lext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.cancelmanager.CancelReturnManager$CancelMode CANCEL_AND_NEGATE;
    descriptor: Lext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.cancelmanager.CancelReturnManager$CancelMode ALL;
    descriptor: Lext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static ext.mods.gameserver.cancelmanager.CancelReturnManager$CancelMode[] values();
    descriptor: ()[Lext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #13                 // Field $VALUES:[Lext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode;
         3: invokevirtual #17                 // Method "[Lext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode;".clone:()Ljava/lang/Object;
         6: checkcast     #18                 // class "[Lext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode;"
         9: areturn
      LineNumberTable:
        line 72: 0

  public static ext.mods.gameserver.cancelmanager.CancelReturnManager$CancelMode valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode
         2: aload_0
         3: invokestatic  #22                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode
         9: areturn
      LineNumberTable:
        line 72: 0
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
         1: getfield      #32                 // Field description:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 87: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode;

  public static ext.mods.gameserver.cancelmanager.CancelReturnManager$CancelMode fromString(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=3, args_size=1
         0: aload_0
         1: invokevirtual #36                 // Method java/lang/String.toUpperCase:()Ljava/lang/String;
         4: astore_1
         5: iconst_m1
         6: istore_2
         7: aload_1
         8: invokevirtual #42                 // Method java/lang/String.hashCode:()I
        11: lookupswitch  { // 3

             -1458056849: 58

                   64897: 72

               610740817: 44
                 default: 83
            }
        44: aload_1
        45: ldc           #46                 // String CANCEL_ONLY
        47: invokevirtual #47                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        50: ifeq          83
        53: iconst_0
        54: istore_2
        55: goto          83
        58: aload_1
        59: ldc           #51                 // String CANCEL_AND_NEGATE
        61: invokevirtual #47                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        64: ifeq          83
        67: iconst_1
        68: istore_2
        69: goto          83
        72: aload_1
        73: ldc           #52                 // String ALL
        75: invokevirtual #47                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        78: ifeq          83
        81: iconst_2
        82: istore_2
        83: iload_2
        84: tableswitch   { // 0 to 2

                       0: 112

                       1: 118

                       2: 124
                 default: 130
            }
       112: getstatic     #3                  // Field CANCEL_ONLY:Lext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode;
       115: goto          133
       118: getstatic     #7                  // Field CANCEL_AND_NEGATE:Lext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode;
       121: goto          133
       124: getstatic     #10                 // Field ALL:Lext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode;
       127: goto          133
       130: getstatic     #3                  // Field CANCEL_ONLY:Lext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode;
       133: areturn
      LineNumberTable:
        line 92: 0
        line 94: 112
        line 95: 118
        line 96: 124
        line 97: 130
        line 92: 133
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     134     0 value   Ljava/lang/String;
      StackMapTable: number_of_entries = 9
        frame_type = 253 /* append */
          offset_delta = 44
          locals = [ class java/lang/String, int ]
        frame_type = 13 /* same */
        frame_type = 13 /* same */
        frame_type = 10 /* same */
        frame_type = 28 /* same */
        frame_type = 5 /* same */
        frame_type = 5 /* same */
        frame_type = 5 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class java/lang/String ]
          stack = [ class ext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode ]

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=5, locals=0, args_size=0
         0: new           #1                  // class ext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode
         3: dup
         4: ldc           #46                 // String CANCEL_ONLY
         6: iconst_0
         7: ldc           #53                 // String Apenas skills de cancel
         9: invokespecial #55                 // Method "<init>":(Ljava/lang/String;ILjava/lang/String;)V
        12: putstatic     #3                  // Field CANCEL_ONLY:Lext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode;
        15: new           #1                  // class ext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode
        18: dup
        19: ldc           #51                 // String CANCEL_AND_NEGATE
        21: iconst_1
        22: ldc           #58                 // String Cancel e negate
        24: invokespecial #55                 // Method "<init>":(Ljava/lang/String;ILjava/lang/String;)V
        27: putstatic     #7                  // Field CANCEL_AND_NEGATE:Lext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode;
        30: new           #1                  // class ext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode
        33: dup
        34: ldc           #52                 // String ALL
        36: iconst_2
        37: ldc           #60                 // String Todos os tipos
        39: invokespecial #55                 // Method "<init>":(Ljava/lang/String;ILjava/lang/String;)V
        42: putstatic     #10                 // Field ALL:Lext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode;
        45: invokestatic  #62                 // Method $values:()[Lext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode;
        48: putstatic     #13                 // Field $VALUES:[Lext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode;
        51: return
      LineNumberTable:
        line 74: 0
        line 75: 15
        line 76: 30
        line 72: 45
}
Signature: #82                          // Ljava/lang/Enum<Lext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode;>;
SourceFile: "CancelReturnManager.java"
NestHost: class ext/mods/gameserver/cancelmanager/CancelReturnManager
InnerClasses:
  public static final #89= #1 of #86;     // CancelMode=class ext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode of class ext/mods/gameserver/cancelmanager/CancelReturnManager
