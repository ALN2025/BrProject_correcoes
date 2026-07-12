// Bytecode for: ext.mods.gameserver.model.entity.autofarm.AutoFarmRoutine$CombatRole
// File: ext\mods\gameserver\model\entity\autofarm\AutoFarmRoutine$CombatRole.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole.class
  Last modified 9 de jul de 2026; size 1515 bytes
  MD5 checksum f5a83bbc64612b9ddf7c405e2f269798
  Compiled from "AutoFarmRoutine.java"
final class ext.mods.gameserver.model.entity.autofarm.AutoFarmRoutine$CombatRole extends java.lang.Enum<ext.mods.gameserver.model.entity.autofarm.AutoFarmRoutine$CombatRole>
  minor version: 0
  major version: 69
  flags: (0x4030) ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole
  super_class: #23                        // java/lang/Enum
  interfaces: 0, fields: 4, methods: 5, attributes: 4
Constant pool:
   #1 = Class              #2             // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole
   #2 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole
   #3 = Fieldref           #1.#4          // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole.MAGE:Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole;
   #4 = NameAndType        #5:#6          // MAGE:Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole;
   #5 = Utf8               MAGE
   #6 = Utf8               Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole;
   #7 = Fieldref           #1.#8          // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole.FIGHTER:Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole;
   #8 = NameAndType        #9:#6          // FIGHTER:Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole;
   #9 = Utf8               FIGHTER
  #10 = Fieldref           #1.#11         // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole.ARCHER:Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole;
  #11 = NameAndType        #12:#6         // ARCHER:Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole;
  #12 = Utf8               ARCHER
  #13 = Fieldref           #1.#14         // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole.$VALUES:[Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole;
  #14 = NameAndType        #15:#16        // $VALUES:[Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole;
  #15 = Utf8               $VALUES
  #16 = Utf8               [Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole;
  #17 = Methodref          #18.#19        // "[Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole;".clone:()Ljava/lang/Object;
  #18 = Class              #16            // "[Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole;"
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
  #32 = String             #5             // MAGE
  #33 = Methodref          #1.#29         // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole."<init>":(Ljava/lang/String;I)V
  #34 = String             #9             // FIGHTER
  #35 = String             #12            // ARCHER
  #36 = Methodref          #1.#37         // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole.$values:()[Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole;
  #37 = NameAndType        #38:#39        // $values:()[Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole;
  #38 = Utf8               $values
  #39 = Utf8               ()[Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole;
  #40 = Utf8               values
  #41 = Utf8               Code
  #42 = Utf8               LineNumberTable
  #43 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole;
  #44 = Utf8               LocalVariableTable
  #45 = Utf8               name
  #46 = Utf8               Ljava/lang/String;
  #47 = Utf8               MethodParameters
  #48 = Utf8               this
  #49 = Utf8               Signature
  #50 = Utf8               ()V
  #51 = Utf8               <clinit>
  #52 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole;>;
  #53 = Utf8               SourceFile
  #54 = Utf8               AutoFarmRoutine.java
  #55 = Utf8               NestHost
  #56 = Class              #57            // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine
  #57 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine
  #58 = Utf8               InnerClasses
  #59 = Utf8               CombatRole
{
  public static final ext.mods.gameserver.model.entity.autofarm.AutoFarmRoutine$CombatRole MAGE;
    descriptor: Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.model.entity.autofarm.AutoFarmRoutine$CombatRole FIGHTER;
    descriptor: Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.model.entity.autofarm.AutoFarmRoutine$CombatRole ARCHER;
    descriptor: Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static ext.mods.gameserver.model.entity.autofarm.AutoFarmRoutine$CombatRole[] values();
    descriptor: ()[Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #13                 // Field $VALUES:[Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole;
         3: invokevirtual #17                 // Method "[Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole;".clone:()Ljava/lang/Object;
         6: checkcast     #18                 // class "[Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole;"
         9: areturn
      LineNumberTable:
        line 138: 0

  public static ext.mods.gameserver.model.entity.autofarm.AutoFarmRoutine$CombatRole valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole
         2: aload_0
         3: invokestatic  #22                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole
         9: areturn
      LineNumberTable:
        line 138: 0
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
         0: new           #1                  // class ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole
         3: dup
         4: ldc           #32                 // String MAGE
         6: iconst_0
         7: invokespecial #33                 // Method "<init>":(Ljava/lang/String;I)V
        10: putstatic     #3                  // Field MAGE:Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole;
        13: new           #1                  // class ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole
        16: dup
        17: ldc           #34                 // String FIGHTER
        19: iconst_1
        20: invokespecial #33                 // Method "<init>":(Ljava/lang/String;I)V
        23: putstatic     #7                  // Field FIGHTER:Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole;
        26: new           #1                  // class ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole
        29: dup
        30: ldc           #35                 // String ARCHER
        32: iconst_2
        33: invokespecial #33                 // Method "<init>":(Ljava/lang/String;I)V
        36: putstatic     #10                 // Field ARCHER:Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole;
        39: invokestatic  #36                 // Method $values:()[Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole;
        42: putstatic     #13                 // Field $VALUES:[Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole;
        45: return
      LineNumberTable:
        line 140: 0
        line 141: 13
        line 142: 26
        line 138: 39
}
Signature: #52                          // Ljava/lang/Enum<Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole;>;
SourceFile: "AutoFarmRoutine.java"
NestHost: class ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine
