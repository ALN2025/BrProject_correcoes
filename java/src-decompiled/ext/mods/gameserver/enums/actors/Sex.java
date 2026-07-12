// Bytecode for: ext.mods.gameserver.enums.actors.Sex
// File: ext\mods\gameserver\enums\actors\Sex.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/enums/actors/Sex.class
  Last modified 9 de jul de 2026; size 1228 bytes
  MD5 checksum b974a9d6dda2def50d44f08902eeb4de
  Compiled from "Sex.java"
public final class ext.mods.gameserver.enums.actors.Sex extends java.lang.Enum<ext.mods.gameserver.enums.actors.Sex>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/enums/actors/Sex
  super_class: #23                        // java/lang/Enum
  interfaces: 0, fields: 5, methods: 5, attributes: 2
Constant pool:
   #1 = Class              #2             // ext/mods/gameserver/enums/actors/Sex
   #2 = Utf8               ext/mods/gameserver/enums/actors/Sex
   #3 = Fieldref           #1.#4          // ext/mods/gameserver/enums/actors/Sex.MALE:Lext/mods/gameserver/enums/actors/Sex;
   #4 = NameAndType        #5:#6          // MALE:Lext/mods/gameserver/enums/actors/Sex;
   #5 = Utf8               MALE
   #6 = Utf8               Lext/mods/gameserver/enums/actors/Sex;
   #7 = Fieldref           #1.#8          // ext/mods/gameserver/enums/actors/Sex.FEMALE:Lext/mods/gameserver/enums/actors/Sex;
   #8 = NameAndType        #9:#6          // FEMALE:Lext/mods/gameserver/enums/actors/Sex;
   #9 = Utf8               FEMALE
  #10 = Fieldref           #1.#11         // ext/mods/gameserver/enums/actors/Sex.ETC:Lext/mods/gameserver/enums/actors/Sex;
  #11 = NameAndType        #12:#6         // ETC:Lext/mods/gameserver/enums/actors/Sex;
  #12 = Utf8               ETC
  #13 = Fieldref           #1.#14         // ext/mods/gameserver/enums/actors/Sex.$VALUES:[Lext/mods/gameserver/enums/actors/Sex;
  #14 = NameAndType        #15:#16        // $VALUES:[Lext/mods/gameserver/enums/actors/Sex;
  #15 = Utf8               $VALUES
  #16 = Utf8               [Lext/mods/gameserver/enums/actors/Sex;
  #17 = Methodref          #18.#19        // "[Lext/mods/gameserver/enums/actors/Sex;".clone:()Ljava/lang/Object;
  #18 = Class              #16            // "[Lext/mods/gameserver/enums/actors/Sex;"
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
  #32 = String             #5             // MALE
  #33 = Methodref          #1.#29         // ext/mods/gameserver/enums/actors/Sex."<init>":(Ljava/lang/String;I)V
  #34 = String             #9             // FEMALE
  #35 = String             #12            // ETC
  #36 = Methodref          #1.#37         // ext/mods/gameserver/enums/actors/Sex.$values:()[Lext/mods/gameserver/enums/actors/Sex;
  #37 = NameAndType        #38:#39        // $values:()[Lext/mods/gameserver/enums/actors/Sex;
  #38 = Utf8               $values
  #39 = Utf8               ()[Lext/mods/gameserver/enums/actors/Sex;
  #40 = Methodref          #1.#41         // ext/mods/gameserver/enums/actors/Sex.values:()[Lext/mods/gameserver/enums/actors/Sex;
  #41 = NameAndType        #42:#39        // values:()[Lext/mods/gameserver/enums/actors/Sex;
  #42 = Utf8               values
  #43 = Fieldref           #1.#44         // ext/mods/gameserver/enums/actors/Sex.VALUES:[Lext/mods/gameserver/enums/actors/Sex;
  #44 = NameAndType        #45:#16        // VALUES:[Lext/mods/gameserver/enums/actors/Sex;
  #45 = Utf8               VALUES
  #46 = Utf8               Code
  #47 = Utf8               LineNumberTable
  #48 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/actors/Sex;
  #49 = Utf8               LocalVariableTable
  #50 = Utf8               name
  #51 = Utf8               Ljava/lang/String;
  #52 = Utf8               MethodParameters
  #53 = Utf8               this
  #54 = Utf8               Signature
  #55 = Utf8               ()V
  #56 = Utf8               <clinit>
  #57 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/enums/actors/Sex;>;
  #58 = Utf8               SourceFile
  #59 = Utf8               Sex.java
{
  public static final ext.mods.gameserver.enums.actors.Sex MALE;
    descriptor: Lext/mods/gameserver/enums/actors/Sex;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.Sex FEMALE;
    descriptor: Lext/mods/gameserver/enums/actors/Sex;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.Sex ETC;
    descriptor: Lext/mods/gameserver/enums/actors/Sex;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.Sex[] VALUES;
    descriptor: [Lext/mods/gameserver/enums/actors/Sex;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public static ext.mods.gameserver.enums.actors.Sex[] values();
    descriptor: ()[Lext/mods/gameserver/enums/actors/Sex;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #13                 // Field $VALUES:[Lext/mods/gameserver/enums/actors/Sex;
         3: invokevirtual #17                 // Method "[Lext/mods/gameserver/enums/actors/Sex;".clone:()Ljava/lang/Object;
         6: checkcast     #18                 // class "[Lext/mods/gameserver/enums/actors/Sex;"
         9: areturn
      LineNumberTable:
        line 20: 0

  public static ext.mods.gameserver.enums.actors.Sex valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/enums/actors/Sex;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/enums/actors/Sex
         2: aload_0
         3: invokestatic  #22                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/enums/actors/Sex
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
         0: new           #1                  // class ext/mods/gameserver/enums/actors/Sex
         3: dup
         4: ldc           #32                 // String MALE
         6: iconst_0
         7: invokespecial #33                 // Method "<init>":(Ljava/lang/String;I)V
        10: putstatic     #3                  // Field MALE:Lext/mods/gameserver/enums/actors/Sex;
        13: new           #1                  // class ext/mods/gameserver/enums/actors/Sex
        16: dup
        17: ldc           #34                 // String FEMALE
        19: iconst_1
        20: invokespecial #33                 // Method "<init>":(Ljava/lang/String;I)V
        23: putstatic     #7                  // Field FEMALE:Lext/mods/gameserver/enums/actors/Sex;
        26: new           #1                  // class ext/mods/gameserver/enums/actors/Sex
        29: dup
        30: ldc           #35                 // String ETC
        32: iconst_2
        33: invokespecial #33                 // Method "<init>":(Ljava/lang/String;I)V
        36: putstatic     #10                 // Field ETC:Lext/mods/gameserver/enums/actors/Sex;
        39: invokestatic  #36                 // Method $values:()[Lext/mods/gameserver/enums/actors/Sex;
        42: putstatic     #13                 // Field $VALUES:[Lext/mods/gameserver/enums/actors/Sex;
        45: invokestatic  #40                 // Method values:()[Lext/mods/gameserver/enums/actors/Sex;
        48: putstatic     #43                 // Field VALUES:[Lext/mods/gameserver/enums/actors/Sex;
        51: return
      LineNumberTable:
        line 22: 0
        line 23: 13
        line 24: 26
        line 20: 39
        line 26: 45
}
Signature: #57                          // Ljava/lang/Enum<Lext/mods/gameserver/enums/actors/Sex;>;
SourceFile: "Sex.java"
