// Bytecode for: ext.mods.gameserver.enums.boats.BoatState
// File: ext\mods\gameserver\enums\boats\BoatState.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/enums/boats/BoatState.class
  Last modified 9 de jul de 2026; size 1354 bytes
  MD5 checksum 3107511de54c57bf909cb2d06f246971
  Compiled from "BoatState.java"
public final class ext.mods.gameserver.enums.boats.BoatState extends java.lang.Enum<ext.mods.gameserver.enums.boats.BoatState>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/enums/boats/BoatState
  super_class: #29                        // java/lang/Enum
  interfaces: 0, fields: 6, methods: 5, attributes: 2
Constant pool:
   #1 = Class              #2             // ext/mods/gameserver/enums/boats/BoatState
   #2 = Utf8               ext/mods/gameserver/enums/boats/BoatState
   #3 = Fieldref           #1.#4          // ext/mods/gameserver/enums/boats/BoatState.PREPARING:Lext/mods/gameserver/enums/boats/BoatState;
   #4 = NameAndType        #5:#6          // PREPARING:Lext/mods/gameserver/enums/boats/BoatState;
   #5 = Utf8               PREPARING
   #6 = Utf8               Lext/mods/gameserver/enums/boats/BoatState;
   #7 = Fieldref           #1.#8          // ext/mods/gameserver/enums/boats/BoatState.EXECUTE_ROUTE:Lext/mods/gameserver/enums/boats/BoatState;
   #8 = NameAndType        #9:#6          // EXECUTE_ROUTE:Lext/mods/gameserver/enums/boats/BoatState;
   #9 = Utf8               EXECUTE_ROUTE
  #10 = Fieldref           #1.#11         // ext/mods/gameserver/enums/boats/BoatState.SEALING:Lext/mods/gameserver/enums/boats/BoatState;
  #11 = NameAndType        #12:#6         // SEALING:Lext/mods/gameserver/enums/boats/BoatState;
  #12 = Utf8               SEALING
  #13 = Fieldref           #1.#14         // ext/mods/gameserver/enums/boats/BoatState.READY_TO_MOVE_TO_DOCK:Lext/mods/gameserver/enums/boats/BoatState;
  #14 = NameAndType        #15:#6         // READY_TO_MOVE_TO_DOCK:Lext/mods/gameserver/enums/boats/BoatState;
  #15 = Utf8               READY_TO_MOVE_TO_DOCK
  #16 = Fieldref           #1.#17         // ext/mods/gameserver/enums/boats/BoatState.DOCKED:Lext/mods/gameserver/enums/boats/BoatState;
  #17 = NameAndType        #18:#6         // DOCKED:Lext/mods/gameserver/enums/boats/BoatState;
  #18 = Utf8               DOCKED
  #19 = Fieldref           #1.#20         // ext/mods/gameserver/enums/boats/BoatState.$VALUES:[Lext/mods/gameserver/enums/boats/BoatState;
  #20 = NameAndType        #21:#22        // $VALUES:[Lext/mods/gameserver/enums/boats/BoatState;
  #21 = Utf8               $VALUES
  #22 = Utf8               [Lext/mods/gameserver/enums/boats/BoatState;
  #23 = Methodref          #24.#25        // "[Lext/mods/gameserver/enums/boats/BoatState;".clone:()Ljava/lang/Object;
  #24 = Class              #22            // "[Lext/mods/gameserver/enums/boats/BoatState;"
  #25 = NameAndType        #26:#27        // clone:()Ljava/lang/Object;
  #26 = Utf8               clone
  #27 = Utf8               ()Ljava/lang/Object;
  #28 = Methodref          #29.#30        // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #29 = Class              #31            // java/lang/Enum
  #30 = NameAndType        #32:#33        // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #31 = Utf8               java/lang/Enum
  #32 = Utf8               valueOf
  #33 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #34 = Methodref          #29.#35        // java/lang/Enum."<init>":(Ljava/lang/String;I)V
  #35 = NameAndType        #36:#37        // "<init>":(Ljava/lang/String;I)V
  #36 = Utf8               <init>
  #37 = Utf8               (Ljava/lang/String;I)V
  #38 = String             #5             // PREPARING
  #39 = Methodref          #1.#35         // ext/mods/gameserver/enums/boats/BoatState."<init>":(Ljava/lang/String;I)V
  #40 = String             #9             // EXECUTE_ROUTE
  #41 = String             #12            // SEALING
  #42 = String             #15            // READY_TO_MOVE_TO_DOCK
  #43 = String             #18            // DOCKED
  #44 = Methodref          #1.#45         // ext/mods/gameserver/enums/boats/BoatState.$values:()[Lext/mods/gameserver/enums/boats/BoatState;
  #45 = NameAndType        #46:#47        // $values:()[Lext/mods/gameserver/enums/boats/BoatState;
  #46 = Utf8               $values
  #47 = Utf8               ()[Lext/mods/gameserver/enums/boats/BoatState;
  #48 = Utf8               values
  #49 = Utf8               Code
  #50 = Utf8               LineNumberTable
  #51 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/boats/BoatState;
  #52 = Utf8               LocalVariableTable
  #53 = Utf8               name
  #54 = Utf8               Ljava/lang/String;
  #55 = Utf8               MethodParameters
  #56 = Utf8               this
  #57 = Utf8               Signature
  #58 = Utf8               ()V
  #59 = Utf8               <clinit>
  #60 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/enums/boats/BoatState;>;
  #61 = Utf8               SourceFile
  #62 = Utf8               BoatState.java
{
  public static final ext.mods.gameserver.enums.boats.BoatState PREPARING;
    descriptor: Lext/mods/gameserver/enums/boats/BoatState;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.boats.BoatState EXECUTE_ROUTE;
    descriptor: Lext/mods/gameserver/enums/boats/BoatState;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.boats.BoatState SEALING;
    descriptor: Lext/mods/gameserver/enums/boats/BoatState;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.boats.BoatState READY_TO_MOVE_TO_DOCK;
    descriptor: Lext/mods/gameserver/enums/boats/BoatState;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.boats.BoatState DOCKED;
    descriptor: Lext/mods/gameserver/enums/boats/BoatState;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static ext.mods.gameserver.enums.boats.BoatState[] values();
    descriptor: ()[Lext/mods/gameserver/enums/boats/BoatState;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #19                 // Field $VALUES:[Lext/mods/gameserver/enums/boats/BoatState;
         3: invokevirtual #23                 // Method "[Lext/mods/gameserver/enums/boats/BoatState;".clone:()Ljava/lang/Object;
         6: checkcast     #24                 // class "[Lext/mods/gameserver/enums/boats/BoatState;"
         9: areturn
      LineNumberTable:
        line 20: 0

  public static ext.mods.gameserver.enums.boats.BoatState valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/enums/boats/BoatState;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/enums/boats/BoatState
         2: aload_0
         3: invokestatic  #28                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/enums/boats/BoatState
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
         0: new           #1                  // class ext/mods/gameserver/enums/boats/BoatState
         3: dup
         4: ldc           #38                 // String PREPARING
         6: iconst_0
         7: invokespecial #39                 // Method "<init>":(Ljava/lang/String;I)V
        10: putstatic     #3                  // Field PREPARING:Lext/mods/gameserver/enums/boats/BoatState;
        13: new           #1                  // class ext/mods/gameserver/enums/boats/BoatState
        16: dup
        17: ldc           #40                 // String EXECUTE_ROUTE
        19: iconst_1
        20: invokespecial #39                 // Method "<init>":(Ljava/lang/String;I)V
        23: putstatic     #7                  // Field EXECUTE_ROUTE:Lext/mods/gameserver/enums/boats/BoatState;
        26: new           #1                  // class ext/mods/gameserver/enums/boats/BoatState
        29: dup
        30: ldc           #41                 // String SEALING
        32: iconst_2
        33: invokespecial #39                 // Method "<init>":(Ljava/lang/String;I)V
        36: putstatic     #10                 // Field SEALING:Lext/mods/gameserver/enums/boats/BoatState;
        39: new           #1                  // class ext/mods/gameserver/enums/boats/BoatState
        42: dup
        43: ldc           #42                 // String READY_TO_MOVE_TO_DOCK
        45: iconst_3
        46: invokespecial #39                 // Method "<init>":(Ljava/lang/String;I)V
        49: putstatic     #13                 // Field READY_TO_MOVE_TO_DOCK:Lext/mods/gameserver/enums/boats/BoatState;
        52: new           #1                  // class ext/mods/gameserver/enums/boats/BoatState
        55: dup
        56: ldc           #43                 // String DOCKED
        58: iconst_4
        59: invokespecial #39                 // Method "<init>":(Ljava/lang/String;I)V
        62: putstatic     #16                 // Field DOCKED:Lext/mods/gameserver/enums/boats/BoatState;
        65: invokestatic  #44                 // Method $values:()[Lext/mods/gameserver/enums/boats/BoatState;
        68: putstatic     #19                 // Field $VALUES:[Lext/mods/gameserver/enums/boats/BoatState;
        71: return
      LineNumberTable:
        line 22: 0
        line 23: 13
        line 24: 26
        line 25: 39
        line 26: 52
        line 20: 65
}
Signature: #60                          // Ljava/lang/Enum<Lext/mods/gameserver/enums/boats/BoatState;>;
SourceFile: "BoatState.java"
