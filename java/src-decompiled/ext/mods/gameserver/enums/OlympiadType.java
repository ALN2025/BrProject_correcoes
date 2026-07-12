// Bytecode for: ext.mods.gameserver.enums.OlympiadType
// File: ext\mods\gameserver\enums\OlympiadType.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/enums/OlympiadType.class
  Last modified 9 de jul de 2026; size 1414 bytes
  MD5 checksum 5b23eda44d835406c21972d8e2176edf
  Compiled from "OlympiadType.java"
public final class ext.mods.gameserver.enums.OlympiadType extends java.lang.Enum<ext.mods.gameserver.enums.OlympiadType>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/enums/OlympiadType
  super_class: #20                        // java/lang/Enum
  interfaces: 0, fields: 4, methods: 6, attributes: 2
Constant pool:
   #1 = Class              #2             // ext/mods/gameserver/enums/OlympiadType
   #2 = Utf8               ext/mods/gameserver/enums/OlympiadType
   #3 = Fieldref           #1.#4          // ext/mods/gameserver/enums/OlympiadType.CLASSED:Lext/mods/gameserver/enums/OlympiadType;
   #4 = NameAndType        #5:#6          // CLASSED:Lext/mods/gameserver/enums/OlympiadType;
   #5 = Utf8               CLASSED
   #6 = Utf8               Lext/mods/gameserver/enums/OlympiadType;
   #7 = Fieldref           #1.#8          // ext/mods/gameserver/enums/OlympiadType.NON_CLASSED:Lext/mods/gameserver/enums/OlympiadType;
   #8 = NameAndType        #9:#6          // NON_CLASSED:Lext/mods/gameserver/enums/OlympiadType;
   #9 = Utf8               NON_CLASSED
  #10 = Fieldref           #1.#11         // ext/mods/gameserver/enums/OlympiadType.$VALUES:[Lext/mods/gameserver/enums/OlympiadType;
  #11 = NameAndType        #12:#13        // $VALUES:[Lext/mods/gameserver/enums/OlympiadType;
  #12 = Utf8               $VALUES
  #13 = Utf8               [Lext/mods/gameserver/enums/OlympiadType;
  #14 = Methodref          #15.#16        // "[Lext/mods/gameserver/enums/OlympiadType;".clone:()Ljava/lang/Object;
  #15 = Class              #13            // "[Lext/mods/gameserver/enums/OlympiadType;"
  #16 = NameAndType        #17:#18        // clone:()Ljava/lang/Object;
  #17 = Utf8               clone
  #18 = Utf8               ()Ljava/lang/Object;
  #19 = Methodref          #20.#21        // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #20 = Class              #22            // java/lang/Enum
  #21 = NameAndType        #23:#24        // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #22 = Utf8               java/lang/Enum
  #23 = Utf8               valueOf
  #24 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #25 = Methodref          #20.#26        // java/lang/Enum."<init>":(Ljava/lang/String;I)V
  #26 = NameAndType        #27:#28        // "<init>":(Ljava/lang/String;I)V
  #27 = Utf8               <init>
  #28 = Utf8               (Ljava/lang/String;I)V
  #29 = Fieldref           #1.#30         // ext/mods/gameserver/enums/OlympiadType._name:Ljava/lang/String;
  #30 = NameAndType        #31:#32        // _name:Ljava/lang/String;
  #31 = Utf8               _name
  #32 = Utf8               Ljava/lang/String;
  #33 = String             #5             // CLASSED
  #34 = String             #35            // classed
  #35 = Utf8               classed
  #36 = Methodref          #1.#37         // ext/mods/gameserver/enums/OlympiadType."<init>":(Ljava/lang/String;ILjava/lang/String;)V
  #37 = NameAndType        #27:#38        // "<init>":(Ljava/lang/String;ILjava/lang/String;)V
  #38 = Utf8               (Ljava/lang/String;ILjava/lang/String;)V
  #39 = String             #9             // NON_CLASSED
  #40 = String             #41            // non-classed
  #41 = Utf8               non-classed
  #42 = Methodref          #1.#43         // ext/mods/gameserver/enums/OlympiadType.$values:()[Lext/mods/gameserver/enums/OlympiadType;
  #43 = NameAndType        #44:#45        // $values:()[Lext/mods/gameserver/enums/OlympiadType;
  #44 = Utf8               $values
  #45 = Utf8               ()[Lext/mods/gameserver/enums/OlympiadType;
  #46 = Utf8               values
  #47 = Utf8               Code
  #48 = Utf8               LineNumberTable
  #49 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/OlympiadType;
  #50 = Utf8               LocalVariableTable
  #51 = Utf8               name
  #52 = Utf8               MethodParameters
  #53 = Utf8               this
  #54 = Utf8               Signature
  #55 = Utf8               (Ljava/lang/String;)V
  #56 = Utf8               toString
  #57 = Utf8               ()Ljava/lang/String;
  #58 = Utf8               <clinit>
  #59 = Utf8               ()V
  #60 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/enums/OlympiadType;>;
  #61 = Utf8               SourceFile
  #62 = Utf8               OlympiadType.java
{
  public static final ext.mods.gameserver.enums.OlympiadType CLASSED;
    descriptor: Lext/mods/gameserver/enums/OlympiadType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.OlympiadType NON_CLASSED;
    descriptor: Lext/mods/gameserver/enums/OlympiadType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static ext.mods.gameserver.enums.OlympiadType[] values();
    descriptor: ()[Lext/mods/gameserver/enums/OlympiadType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #10                 // Field $VALUES:[Lext/mods/gameserver/enums/OlympiadType;
         3: invokevirtual #14                 // Method "[Lext/mods/gameserver/enums/OlympiadType;".clone:()Ljava/lang/Object;
         6: checkcast     #15                 // class "[Lext/mods/gameserver/enums/OlympiadType;"
         9: areturn
      LineNumberTable:
        line 20: 0

  public static ext.mods.gameserver.enums.OlympiadType valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/enums/OlympiadType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/enums/OlympiadType
         2: aload_0
         3: invokestatic  #19                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/enums/OlympiadType
         9: areturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  name   Ljava/lang/String;
    MethodParameters:
      Name                           Flags
      <no name>                      mandated

  public final java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #29                 // Field _name:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 35: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/OlympiadType;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=5, locals=0, args_size=0
         0: new           #1                  // class ext/mods/gameserver/enums/OlympiadType
         3: dup
         4: ldc           #33                 // String CLASSED
         6: iconst_0
         7: ldc           #34                 // String classed
         9: invokespecial #36                 // Method "<init>":(Ljava/lang/String;ILjava/lang/String;)V
        12: putstatic     #3                  // Field CLASSED:Lext/mods/gameserver/enums/OlympiadType;
        15: new           #1                  // class ext/mods/gameserver/enums/OlympiadType
        18: dup
        19: ldc           #39                 // String NON_CLASSED
        21: iconst_1
        22: ldc           #40                 // String non-classed
        24: invokespecial #36                 // Method "<init>":(Ljava/lang/String;ILjava/lang/String;)V
        27: putstatic     #7                  // Field NON_CLASSED:Lext/mods/gameserver/enums/OlympiadType;
        30: invokestatic  #42                 // Method $values:()[Lext/mods/gameserver/enums/OlympiadType;
        33: putstatic     #10                 // Field $VALUES:[Lext/mods/gameserver/enums/OlympiadType;
        36: return
      LineNumberTable:
        line 22: 0
        line 23: 15
        line 20: 30
}
Signature: #60                          // Ljava/lang/Enum<Lext/mods/gameserver/enums/OlympiadType;>;
SourceFile: "OlympiadType.java"
