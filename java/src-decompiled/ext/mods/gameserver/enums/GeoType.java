// Bytecode for: ext.mods.gameserver.enums.GeoType
// File: ext\mods\gameserver\enums\GeoType.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/enums/GeoType.class
  Last modified 9 de jul de 2026; size 1392 bytes
  MD5 checksum 78a1f50f5e5574cb0a2df53145741426
  Compiled from "GeoType.java"
public final class ext.mods.gameserver.enums.GeoType extends java.lang.Enum<ext.mods.gameserver.enums.GeoType>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/enums/GeoType
  super_class: #20                        // java/lang/Enum
  interfaces: 0, fields: 4, methods: 6, attributes: 2
Constant pool:
   #1 = Class              #2             // ext/mods/gameserver/enums/GeoType
   #2 = Utf8               ext/mods/gameserver/enums/GeoType
   #3 = Fieldref           #1.#4          // ext/mods/gameserver/enums/GeoType.L2J:Lext/mods/gameserver/enums/GeoType;
   #4 = NameAndType        #5:#6          // L2J:Lext/mods/gameserver/enums/GeoType;
   #5 = Utf8               L2J
   #6 = Utf8               Lext/mods/gameserver/enums/GeoType;
   #7 = Fieldref           #1.#8          // ext/mods/gameserver/enums/GeoType.L2OFF:Lext/mods/gameserver/enums/GeoType;
   #8 = NameAndType        #9:#6          // L2OFF:Lext/mods/gameserver/enums/GeoType;
   #9 = Utf8               L2OFF
  #10 = Fieldref           #1.#11         // ext/mods/gameserver/enums/GeoType.$VALUES:[Lext/mods/gameserver/enums/GeoType;
  #11 = NameAndType        #12:#13        // $VALUES:[Lext/mods/gameserver/enums/GeoType;
  #12 = Utf8               $VALUES
  #13 = Utf8               [Lext/mods/gameserver/enums/GeoType;
  #14 = Methodref          #15.#16        // "[Lext/mods/gameserver/enums/GeoType;".clone:()Ljava/lang/Object;
  #15 = Class              #13            // "[Lext/mods/gameserver/enums/GeoType;"
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
  #29 = Fieldref           #1.#30         // ext/mods/gameserver/enums/GeoType._filename:Ljava/lang/String;
  #30 = NameAndType        #31:#32        // _filename:Ljava/lang/String;
  #31 = Utf8               _filename
  #32 = Utf8               Ljava/lang/String;
  #33 = String             #5             // L2J
  #34 = String             #35            // %d_%d.l2j
  #35 = Utf8               %d_%d.l2j
  #36 = Methodref          #1.#37         // ext/mods/gameserver/enums/GeoType."<init>":(Ljava/lang/String;ILjava/lang/String;)V
  #37 = NameAndType        #27:#38        // "<init>":(Ljava/lang/String;ILjava/lang/String;)V
  #38 = Utf8               (Ljava/lang/String;ILjava/lang/String;)V
  #39 = String             #9             // L2OFF
  #40 = String             #41            // %d_%d_conv.dat
  #41 = Utf8               %d_%d_conv.dat
  #42 = Methodref          #1.#43         // ext/mods/gameserver/enums/GeoType.$values:()[Lext/mods/gameserver/enums/GeoType;
  #43 = NameAndType        #44:#45        // $values:()[Lext/mods/gameserver/enums/GeoType;
  #44 = Utf8               $values
  #45 = Utf8               ()[Lext/mods/gameserver/enums/GeoType;
  #46 = Utf8               values
  #47 = Utf8               Code
  #48 = Utf8               LineNumberTable
  #49 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/GeoType;
  #50 = Utf8               LocalVariableTable
  #51 = Utf8               name
  #52 = Utf8               MethodParameters
  #53 = Utf8               this
  #54 = Utf8               filename
  #55 = Utf8               Signature
  #56 = Utf8               (Ljava/lang/String;)V
  #57 = Utf8               getFilename
  #58 = Utf8               ()Ljava/lang/String;
  #59 = Utf8               <clinit>
  #60 = Utf8               ()V
  #61 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/enums/GeoType;>;
  #62 = Utf8               SourceFile
  #63 = Utf8               GeoType.java
{
  public static final ext.mods.gameserver.enums.GeoType L2J;
    descriptor: Lext/mods/gameserver/enums/GeoType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.GeoType L2OFF;
    descriptor: Lext/mods/gameserver/enums/GeoType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static ext.mods.gameserver.enums.GeoType[] values();
    descriptor: ()[Lext/mods/gameserver/enums/GeoType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #10                 // Field $VALUES:[Lext/mods/gameserver/enums/GeoType;
         3: invokevirtual #14                 // Method "[Lext/mods/gameserver/enums/GeoType;".clone:()Ljava/lang/Object;
         6: checkcast     #15                 // class "[Lext/mods/gameserver/enums/GeoType;"
         9: areturn
      LineNumberTable:
        line 20: 0

  public static ext.mods.gameserver.enums.GeoType valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/enums/GeoType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/enums/GeoType
         2: aload_0
         3: invokestatic  #19                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/enums/GeoType
         9: areturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  name   Ljava/lang/String;
    MethodParameters:
      Name                           Flags
      <no name>                      mandated

  public java.lang.String getFilename();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #29                 // Field _filename:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 34: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/GeoType;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=5, locals=0, args_size=0
         0: new           #1                  // class ext/mods/gameserver/enums/GeoType
         3: dup
         4: ldc           #33                 // String L2J
         6: iconst_0
         7: ldc           #34                 // String %d_%d.l2j
         9: invokespecial #36                 // Method "<init>":(Ljava/lang/String;ILjava/lang/String;)V
        12: putstatic     #3                  // Field L2J:Lext/mods/gameserver/enums/GeoType;
        15: new           #1                  // class ext/mods/gameserver/enums/GeoType
        18: dup
        19: ldc           #39                 // String L2OFF
        21: iconst_1
        22: ldc           #40                 // String %d_%d_conv.dat
        24: invokespecial #36                 // Method "<init>":(Ljava/lang/String;ILjava/lang/String;)V
        27: putstatic     #7                  // Field L2OFF:Lext/mods/gameserver/enums/GeoType;
        30: invokestatic  #42                 // Method $values:()[Lext/mods/gameserver/enums/GeoType;
        33: putstatic     #10                 // Field $VALUES:[Lext/mods/gameserver/enums/GeoType;
        36: return
      LineNumberTable:
        line 22: 0
        line 23: 15
        line 20: 30
}
Signature: #61                          // Ljava/lang/Enum<Lext/mods/gameserver/enums/GeoType;>;
SourceFile: "GeoType.java"
