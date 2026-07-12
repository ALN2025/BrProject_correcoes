// Bytecode for: ext.mods.gameserver.enums.skills.EffectState
// File: ext\mods\gameserver\enums\skills\EffectState.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/enums/skills/EffectState.class
  Last modified 9 de jul de 2026; size 1246 bytes
  MD5 checksum ead851a27a44ecb1669aca5fda902803
  Compiled from "EffectState.java"
public final class ext.mods.gameserver.enums.skills.EffectState extends java.lang.Enum<ext.mods.gameserver.enums.skills.EffectState>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/enums/skills/EffectState
  super_class: #23                        // java/lang/Enum
  interfaces: 0, fields: 4, methods: 5, attributes: 2
Constant pool:
   #1 = Class              #2             // ext/mods/gameserver/enums/skills/EffectState
   #2 = Utf8               ext/mods/gameserver/enums/skills/EffectState
   #3 = Fieldref           #1.#4          // ext/mods/gameserver/enums/skills/EffectState.CREATED:Lext/mods/gameserver/enums/skills/EffectState;
   #4 = NameAndType        #5:#6          // CREATED:Lext/mods/gameserver/enums/skills/EffectState;
   #5 = Utf8               CREATED
   #6 = Utf8               Lext/mods/gameserver/enums/skills/EffectState;
   #7 = Fieldref           #1.#8          // ext/mods/gameserver/enums/skills/EffectState.ACTING:Lext/mods/gameserver/enums/skills/EffectState;
   #8 = NameAndType        #9:#6          // ACTING:Lext/mods/gameserver/enums/skills/EffectState;
   #9 = Utf8               ACTING
  #10 = Fieldref           #1.#11         // ext/mods/gameserver/enums/skills/EffectState.FINISHING:Lext/mods/gameserver/enums/skills/EffectState;
  #11 = NameAndType        #12:#6         // FINISHING:Lext/mods/gameserver/enums/skills/EffectState;
  #12 = Utf8               FINISHING
  #13 = Fieldref           #1.#14         // ext/mods/gameserver/enums/skills/EffectState.$VALUES:[Lext/mods/gameserver/enums/skills/EffectState;
  #14 = NameAndType        #15:#16        // $VALUES:[Lext/mods/gameserver/enums/skills/EffectState;
  #15 = Utf8               $VALUES
  #16 = Utf8               [Lext/mods/gameserver/enums/skills/EffectState;
  #17 = Methodref          #18.#19        // "[Lext/mods/gameserver/enums/skills/EffectState;".clone:()Ljava/lang/Object;
  #18 = Class              #16            // "[Lext/mods/gameserver/enums/skills/EffectState;"
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
  #32 = String             #5             // CREATED
  #33 = Methodref          #1.#29         // ext/mods/gameserver/enums/skills/EffectState."<init>":(Ljava/lang/String;I)V
  #34 = String             #9             // ACTING
  #35 = String             #12            // FINISHING
  #36 = Methodref          #1.#37         // ext/mods/gameserver/enums/skills/EffectState.$values:()[Lext/mods/gameserver/enums/skills/EffectState;
  #37 = NameAndType        #38:#39        // $values:()[Lext/mods/gameserver/enums/skills/EffectState;
  #38 = Utf8               $values
  #39 = Utf8               ()[Lext/mods/gameserver/enums/skills/EffectState;
  #40 = Utf8               values
  #41 = Utf8               Code
  #42 = Utf8               LineNumberTable
  #43 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/skills/EffectState;
  #44 = Utf8               LocalVariableTable
  #45 = Utf8               name
  #46 = Utf8               Ljava/lang/String;
  #47 = Utf8               MethodParameters
  #48 = Utf8               this
  #49 = Utf8               Signature
  #50 = Utf8               ()V
  #51 = Utf8               <clinit>
  #52 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/enums/skills/EffectState;>;
  #53 = Utf8               SourceFile
  #54 = Utf8               EffectState.java
{
  public static final ext.mods.gameserver.enums.skills.EffectState CREATED;
    descriptor: Lext/mods/gameserver/enums/skills/EffectState;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectState ACTING;
    descriptor: Lext/mods/gameserver/enums/skills/EffectState;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectState FINISHING;
    descriptor: Lext/mods/gameserver/enums/skills/EffectState;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static ext.mods.gameserver.enums.skills.EffectState[] values();
    descriptor: ()[Lext/mods/gameserver/enums/skills/EffectState;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #13                 // Field $VALUES:[Lext/mods/gameserver/enums/skills/EffectState;
         3: invokevirtual #17                 // Method "[Lext/mods/gameserver/enums/skills/EffectState;".clone:()Ljava/lang/Object;
         6: checkcast     #18                 // class "[Lext/mods/gameserver/enums/skills/EffectState;"
         9: areturn
      LineNumberTable:
        line 20: 0

  public static ext.mods.gameserver.enums.skills.EffectState valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/enums/skills/EffectState;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/enums/skills/EffectState
         2: aload_0
         3: invokestatic  #22                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/enums/skills/EffectState
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
         0: new           #1                  // class ext/mods/gameserver/enums/skills/EffectState
         3: dup
         4: ldc           #32                 // String CREATED
         6: iconst_0
         7: invokespecial #33                 // Method "<init>":(Ljava/lang/String;I)V
        10: putstatic     #3                  // Field CREATED:Lext/mods/gameserver/enums/skills/EffectState;
        13: new           #1                  // class ext/mods/gameserver/enums/skills/EffectState
        16: dup
        17: ldc           #34                 // String ACTING
        19: iconst_1
        20: invokespecial #33                 // Method "<init>":(Ljava/lang/String;I)V
        23: putstatic     #7                  // Field ACTING:Lext/mods/gameserver/enums/skills/EffectState;
        26: new           #1                  // class ext/mods/gameserver/enums/skills/EffectState
        29: dup
        30: ldc           #35                 // String FINISHING
        32: iconst_2
        33: invokespecial #33                 // Method "<init>":(Ljava/lang/String;I)V
        36: putstatic     #10                 // Field FINISHING:Lext/mods/gameserver/enums/skills/EffectState;
        39: invokestatic  #36                 // Method $values:()[Lext/mods/gameserver/enums/skills/EffectState;
        42: putstatic     #13                 // Field $VALUES:[Lext/mods/gameserver/enums/skills/EffectState;
        45: return
      LineNumberTable:
        line 22: 0
        line 23: 13
        line 24: 26
        line 20: 39
}
Signature: #52                          // Ljava/lang/Enum<Lext/mods/gameserver/enums/skills/EffectState;>;
SourceFile: "EffectState.java"
