// Bytecode for: ext.mods.gameserver.enums.skills.ShieldDefense
// File: ext\mods\gameserver\enums\skills\ShieldDefense.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/enums/skills/ShieldDefense.class
  Last modified 9 de jul de 2026; size 1258 bytes
  MD5 checksum 7b5568e394babfc04cede79db99b5ce4
  Compiled from "ShieldDefense.java"
public final class ext.mods.gameserver.enums.skills.ShieldDefense extends java.lang.Enum<ext.mods.gameserver.enums.skills.ShieldDefense>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/enums/skills/ShieldDefense
  super_class: #23                        // java/lang/Enum
  interfaces: 0, fields: 4, methods: 5, attributes: 2
Constant pool:
   #1 = Class              #2             // ext/mods/gameserver/enums/skills/ShieldDefense
   #2 = Utf8               ext/mods/gameserver/enums/skills/ShieldDefense
   #3 = Fieldref           #1.#4          // ext/mods/gameserver/enums/skills/ShieldDefense.FAILED:Lext/mods/gameserver/enums/skills/ShieldDefense;
   #4 = NameAndType        #5:#6          // FAILED:Lext/mods/gameserver/enums/skills/ShieldDefense;
   #5 = Utf8               FAILED
   #6 = Utf8               Lext/mods/gameserver/enums/skills/ShieldDefense;
   #7 = Fieldref           #1.#8          // ext/mods/gameserver/enums/skills/ShieldDefense.SUCCESS:Lext/mods/gameserver/enums/skills/ShieldDefense;
   #8 = NameAndType        #9:#6          // SUCCESS:Lext/mods/gameserver/enums/skills/ShieldDefense;
   #9 = Utf8               SUCCESS
  #10 = Fieldref           #1.#11         // ext/mods/gameserver/enums/skills/ShieldDefense.PERFECT:Lext/mods/gameserver/enums/skills/ShieldDefense;
  #11 = NameAndType        #12:#6         // PERFECT:Lext/mods/gameserver/enums/skills/ShieldDefense;
  #12 = Utf8               PERFECT
  #13 = Fieldref           #1.#14         // ext/mods/gameserver/enums/skills/ShieldDefense.$VALUES:[Lext/mods/gameserver/enums/skills/ShieldDefense;
  #14 = NameAndType        #15:#16        // $VALUES:[Lext/mods/gameserver/enums/skills/ShieldDefense;
  #15 = Utf8               $VALUES
  #16 = Utf8               [Lext/mods/gameserver/enums/skills/ShieldDefense;
  #17 = Methodref          #18.#19        // "[Lext/mods/gameserver/enums/skills/ShieldDefense;".clone:()Ljava/lang/Object;
  #18 = Class              #16            // "[Lext/mods/gameserver/enums/skills/ShieldDefense;"
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
  #32 = String             #5             // FAILED
  #33 = Methodref          #1.#29         // ext/mods/gameserver/enums/skills/ShieldDefense."<init>":(Ljava/lang/String;I)V
  #34 = String             #9             // SUCCESS
  #35 = String             #12            // PERFECT
  #36 = Methodref          #1.#37         // ext/mods/gameserver/enums/skills/ShieldDefense.$values:()[Lext/mods/gameserver/enums/skills/ShieldDefense;
  #37 = NameAndType        #38:#39        // $values:()[Lext/mods/gameserver/enums/skills/ShieldDefense;
  #38 = Utf8               $values
  #39 = Utf8               ()[Lext/mods/gameserver/enums/skills/ShieldDefense;
  #40 = Utf8               values
  #41 = Utf8               Code
  #42 = Utf8               LineNumberTable
  #43 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/skills/ShieldDefense;
  #44 = Utf8               LocalVariableTable
  #45 = Utf8               name
  #46 = Utf8               Ljava/lang/String;
  #47 = Utf8               MethodParameters
  #48 = Utf8               this
  #49 = Utf8               Signature
  #50 = Utf8               ()V
  #51 = Utf8               <clinit>
  #52 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/enums/skills/ShieldDefense;>;
  #53 = Utf8               SourceFile
  #54 = Utf8               ShieldDefense.java
{
  public static final ext.mods.gameserver.enums.skills.ShieldDefense FAILED;
    descriptor: Lext/mods/gameserver/enums/skills/ShieldDefense;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.ShieldDefense SUCCESS;
    descriptor: Lext/mods/gameserver/enums/skills/ShieldDefense;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.ShieldDefense PERFECT;
    descriptor: Lext/mods/gameserver/enums/skills/ShieldDefense;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static ext.mods.gameserver.enums.skills.ShieldDefense[] values();
    descriptor: ()[Lext/mods/gameserver/enums/skills/ShieldDefense;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #13                 // Field $VALUES:[Lext/mods/gameserver/enums/skills/ShieldDefense;
         3: invokevirtual #17                 // Method "[Lext/mods/gameserver/enums/skills/ShieldDefense;".clone:()Ljava/lang/Object;
         6: checkcast     #18                 // class "[Lext/mods/gameserver/enums/skills/ShieldDefense;"
         9: areturn
      LineNumberTable:
        line 20: 0

  public static ext.mods.gameserver.enums.skills.ShieldDefense valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/enums/skills/ShieldDefense;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/enums/skills/ShieldDefense
         2: aload_0
         3: invokestatic  #22                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/enums/skills/ShieldDefense
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
         0: new           #1                  // class ext/mods/gameserver/enums/skills/ShieldDefense
         3: dup
         4: ldc           #32                 // String FAILED
         6: iconst_0
         7: invokespecial #33                 // Method "<init>":(Ljava/lang/String;I)V
        10: putstatic     #3                  // Field FAILED:Lext/mods/gameserver/enums/skills/ShieldDefense;
        13: new           #1                  // class ext/mods/gameserver/enums/skills/ShieldDefense
        16: dup
        17: ldc           #34                 // String SUCCESS
        19: iconst_1
        20: invokespecial #33                 // Method "<init>":(Ljava/lang/String;I)V
        23: putstatic     #7                  // Field SUCCESS:Lext/mods/gameserver/enums/skills/ShieldDefense;
        26: new           #1                  // class ext/mods/gameserver/enums/skills/ShieldDefense
        29: dup
        30: ldc           #35                 // String PERFECT
        32: iconst_2
        33: invokespecial #33                 // Method "<init>":(Ljava/lang/String;I)V
        36: putstatic     #10                 // Field PERFECT:Lext/mods/gameserver/enums/skills/ShieldDefense;
        39: invokestatic  #36                 // Method $values:()[Lext/mods/gameserver/enums/skills/ShieldDefense;
        42: putstatic     #13                 // Field $VALUES:[Lext/mods/gameserver/enums/skills/ShieldDefense;
        45: return
      LineNumberTable:
        line 22: 0
        line 23: 13
        line 24: 26
        line 20: 39
}
Signature: #52                          // Ljava/lang/Enum<Lext/mods/gameserver/enums/skills/ShieldDefense;>;
SourceFile: "ShieldDefense.java"
