// Bytecode for: ext.mods.gameserver.enums.duels.DuelState
// File: ext\mods\gameserver\enums\duels\DuelState.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/enums/duels/DuelState.class
  Last modified 9 de jul de 2026; size 1394 bytes
  MD5 checksum f72bbd66d0fc1a6386853cebff8331cf
  Compiled from "DuelState.java"
public final class ext.mods.gameserver.enums.duels.DuelState extends java.lang.Enum<ext.mods.gameserver.enums.duels.DuelState>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/enums/duels/DuelState
  super_class: #32                        // java/lang/Enum
  interfaces: 0, fields: 7, methods: 5, attributes: 2
Constant pool:
   #1 = Class              #2             // ext/mods/gameserver/enums/duels/DuelState
   #2 = Utf8               ext/mods/gameserver/enums/duels/DuelState
   #3 = Fieldref           #1.#4          // ext/mods/gameserver/enums/duels/DuelState.NO_DUEL:Lext/mods/gameserver/enums/duels/DuelState;
   #4 = NameAndType        #5:#6          // NO_DUEL:Lext/mods/gameserver/enums/duels/DuelState;
   #5 = Utf8               NO_DUEL
   #6 = Utf8               Lext/mods/gameserver/enums/duels/DuelState;
   #7 = Fieldref           #1.#8          // ext/mods/gameserver/enums/duels/DuelState.ON_COUNTDOWN:Lext/mods/gameserver/enums/duels/DuelState;
   #8 = NameAndType        #9:#6          // ON_COUNTDOWN:Lext/mods/gameserver/enums/duels/DuelState;
   #9 = Utf8               ON_COUNTDOWN
  #10 = Fieldref           #1.#11         // ext/mods/gameserver/enums/duels/DuelState.DUELLING:Lext/mods/gameserver/enums/duels/DuelState;
  #11 = NameAndType        #12:#6         // DUELLING:Lext/mods/gameserver/enums/duels/DuelState;
  #12 = Utf8               DUELLING
  #13 = Fieldref           #1.#14         // ext/mods/gameserver/enums/duels/DuelState.DEAD:Lext/mods/gameserver/enums/duels/DuelState;
  #14 = NameAndType        #15:#6         // DEAD:Lext/mods/gameserver/enums/duels/DuelState;
  #15 = Utf8               DEAD
  #16 = Fieldref           #1.#17         // ext/mods/gameserver/enums/duels/DuelState.WINNER:Lext/mods/gameserver/enums/duels/DuelState;
  #17 = NameAndType        #18:#6         // WINNER:Lext/mods/gameserver/enums/duels/DuelState;
  #18 = Utf8               WINNER
  #19 = Fieldref           #1.#20         // ext/mods/gameserver/enums/duels/DuelState.INTERRUPTED:Lext/mods/gameserver/enums/duels/DuelState;
  #20 = NameAndType        #21:#6         // INTERRUPTED:Lext/mods/gameserver/enums/duels/DuelState;
  #21 = Utf8               INTERRUPTED
  #22 = Fieldref           #1.#23         // ext/mods/gameserver/enums/duels/DuelState.$VALUES:[Lext/mods/gameserver/enums/duels/DuelState;
  #23 = NameAndType        #24:#25        // $VALUES:[Lext/mods/gameserver/enums/duels/DuelState;
  #24 = Utf8               $VALUES
  #25 = Utf8               [Lext/mods/gameserver/enums/duels/DuelState;
  #26 = Methodref          #27.#28        // "[Lext/mods/gameserver/enums/duels/DuelState;".clone:()Ljava/lang/Object;
  #27 = Class              #25            // "[Lext/mods/gameserver/enums/duels/DuelState;"
  #28 = NameAndType        #29:#30        // clone:()Ljava/lang/Object;
  #29 = Utf8               clone
  #30 = Utf8               ()Ljava/lang/Object;
  #31 = Methodref          #32.#33        // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #32 = Class              #34            // java/lang/Enum
  #33 = NameAndType        #35:#36        // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #34 = Utf8               java/lang/Enum
  #35 = Utf8               valueOf
  #36 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #37 = Methodref          #32.#38        // java/lang/Enum."<init>":(Ljava/lang/String;I)V
  #38 = NameAndType        #39:#40        // "<init>":(Ljava/lang/String;I)V
  #39 = Utf8               <init>
  #40 = Utf8               (Ljava/lang/String;I)V
  #41 = String             #5             // NO_DUEL
  #42 = Methodref          #1.#38         // ext/mods/gameserver/enums/duels/DuelState."<init>":(Ljava/lang/String;I)V
  #43 = String             #9             // ON_COUNTDOWN
  #44 = String             #12            // DUELLING
  #45 = String             #15            // DEAD
  #46 = String             #18            // WINNER
  #47 = String             #21            // INTERRUPTED
  #48 = Methodref          #1.#49         // ext/mods/gameserver/enums/duels/DuelState.$values:()[Lext/mods/gameserver/enums/duels/DuelState;
  #49 = NameAndType        #50:#51        // $values:()[Lext/mods/gameserver/enums/duels/DuelState;
  #50 = Utf8               $values
  #51 = Utf8               ()[Lext/mods/gameserver/enums/duels/DuelState;
  #52 = Utf8               values
  #53 = Utf8               Code
  #54 = Utf8               LineNumberTable
  #55 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/duels/DuelState;
  #56 = Utf8               LocalVariableTable
  #57 = Utf8               name
  #58 = Utf8               Ljava/lang/String;
  #59 = Utf8               MethodParameters
  #60 = Utf8               this
  #61 = Utf8               Signature
  #62 = Utf8               ()V
  #63 = Utf8               <clinit>
  #64 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/enums/duels/DuelState;>;
  #65 = Utf8               SourceFile
  #66 = Utf8               DuelState.java
{
  public static final ext.mods.gameserver.enums.duels.DuelState NO_DUEL;
    descriptor: Lext/mods/gameserver/enums/duels/DuelState;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.duels.DuelState ON_COUNTDOWN;
    descriptor: Lext/mods/gameserver/enums/duels/DuelState;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.duels.DuelState DUELLING;
    descriptor: Lext/mods/gameserver/enums/duels/DuelState;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.duels.DuelState DEAD;
    descriptor: Lext/mods/gameserver/enums/duels/DuelState;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.duels.DuelState WINNER;
    descriptor: Lext/mods/gameserver/enums/duels/DuelState;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.duels.DuelState INTERRUPTED;
    descriptor: Lext/mods/gameserver/enums/duels/DuelState;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static ext.mods.gameserver.enums.duels.DuelState[] values();
    descriptor: ()[Lext/mods/gameserver/enums/duels/DuelState;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #22                 // Field $VALUES:[Lext/mods/gameserver/enums/duels/DuelState;
         3: invokevirtual #26                 // Method "[Lext/mods/gameserver/enums/duels/DuelState;".clone:()Ljava/lang/Object;
         6: checkcast     #27                 // class "[Lext/mods/gameserver/enums/duels/DuelState;"
         9: areturn
      LineNumberTable:
        line 20: 0

  public static ext.mods.gameserver.enums.duels.DuelState valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/enums/duels/DuelState;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/enums/duels/DuelState
         2: aload_0
         3: invokestatic  #31                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/enums/duels/DuelState
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
         0: new           #1                  // class ext/mods/gameserver/enums/duels/DuelState
         3: dup
         4: ldc           #41                 // String NO_DUEL
         6: iconst_0
         7: invokespecial #42                 // Method "<init>":(Ljava/lang/String;I)V
        10: putstatic     #3                  // Field NO_DUEL:Lext/mods/gameserver/enums/duels/DuelState;
        13: new           #1                  // class ext/mods/gameserver/enums/duels/DuelState
        16: dup
        17: ldc           #43                 // String ON_COUNTDOWN
        19: iconst_1
        20: invokespecial #42                 // Method "<init>":(Ljava/lang/String;I)V
        23: putstatic     #7                  // Field ON_COUNTDOWN:Lext/mods/gameserver/enums/duels/DuelState;
        26: new           #1                  // class ext/mods/gameserver/enums/duels/DuelState
        29: dup
        30: ldc           #44                 // String DUELLING
        32: iconst_2
        33: invokespecial #42                 // Method "<init>":(Ljava/lang/String;I)V
        36: putstatic     #10                 // Field DUELLING:Lext/mods/gameserver/enums/duels/DuelState;
        39: new           #1                  // class ext/mods/gameserver/enums/duels/DuelState
        42: dup
        43: ldc           #45                 // String DEAD
        45: iconst_3
        46: invokespecial #42                 // Method "<init>":(Ljava/lang/String;I)V
        49: putstatic     #13                 // Field DEAD:Lext/mods/gameserver/enums/duels/DuelState;
        52: new           #1                  // class ext/mods/gameserver/enums/duels/DuelState
        55: dup
        56: ldc           #46                 // String WINNER
        58: iconst_4
        59: invokespecial #42                 // Method "<init>":(Ljava/lang/String;I)V
        62: putstatic     #16                 // Field WINNER:Lext/mods/gameserver/enums/duels/DuelState;
        65: new           #1                  // class ext/mods/gameserver/enums/duels/DuelState
        68: dup
        69: ldc           #47                 // String INTERRUPTED
        71: iconst_5
        72: invokespecial #42                 // Method "<init>":(Ljava/lang/String;I)V
        75: putstatic     #19                 // Field INTERRUPTED:Lext/mods/gameserver/enums/duels/DuelState;
        78: invokestatic  #48                 // Method $values:()[Lext/mods/gameserver/enums/duels/DuelState;
        81: putstatic     #22                 // Field $VALUES:[Lext/mods/gameserver/enums/duels/DuelState;
        84: return
      LineNumberTable:
        line 22: 0
        line 23: 13
        line 24: 26
        line 25: 39
        line 26: 52
        line 27: 65
        line 20: 78
}
Signature: #64                          // Ljava/lang/Enum<Lext/mods/gameserver/enums/duels/DuelState;>;
SourceFile: "DuelState.java"
