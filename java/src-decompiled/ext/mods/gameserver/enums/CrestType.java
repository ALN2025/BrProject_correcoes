// Bytecode for: ext.mods.gameserver.enums.CrestType
// File: ext\mods\gameserver\enums\CrestType.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/enums/CrestType.class
  Last modified 9 de jul de 2026; size 1597 bytes
  MD5 checksum ae93a64e41dea83f50162ebe9179f9d2
  Compiled from "CrestType.java"
public final class ext.mods.gameserver.enums.CrestType extends java.lang.Enum<ext.mods.gameserver.enums.CrestType>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/enums/CrestType
  super_class: #23                        // java/lang/Enum
  interfaces: 0, fields: 6, methods: 7, attributes: 2
Constant pool:
   #1 = Class              #2             // ext/mods/gameserver/enums/CrestType
   #2 = Utf8               ext/mods/gameserver/enums/CrestType
   #3 = Fieldref           #1.#4          // ext/mods/gameserver/enums/CrestType.PLEDGE:Lext/mods/gameserver/enums/CrestType;
   #4 = NameAndType        #5:#6          // PLEDGE:Lext/mods/gameserver/enums/CrestType;
   #5 = Utf8               PLEDGE
   #6 = Utf8               Lext/mods/gameserver/enums/CrestType;
   #7 = Fieldref           #1.#8          // ext/mods/gameserver/enums/CrestType.PLEDGE_LARGE:Lext/mods/gameserver/enums/CrestType;
   #8 = NameAndType        #9:#6          // PLEDGE_LARGE:Lext/mods/gameserver/enums/CrestType;
   #9 = Utf8               PLEDGE_LARGE
  #10 = Fieldref           #1.#11         // ext/mods/gameserver/enums/CrestType.ALLY:Lext/mods/gameserver/enums/CrestType;
  #11 = NameAndType        #12:#6         // ALLY:Lext/mods/gameserver/enums/CrestType;
  #12 = Utf8               ALLY
  #13 = Fieldref           #1.#14         // ext/mods/gameserver/enums/CrestType.$VALUES:[Lext/mods/gameserver/enums/CrestType;
  #14 = NameAndType        #15:#16        // $VALUES:[Lext/mods/gameserver/enums/CrestType;
  #15 = Utf8               $VALUES
  #16 = Utf8               [Lext/mods/gameserver/enums/CrestType;
  #17 = Methodref          #18.#19        // "[Lext/mods/gameserver/enums/CrestType;".clone:()Ljava/lang/Object;
  #18 = Class              #16            // "[Lext/mods/gameserver/enums/CrestType;"
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
  #32 = Fieldref           #1.#33         // ext/mods/gameserver/enums/CrestType._prefix:Ljava/lang/String;
  #33 = NameAndType        #34:#35        // _prefix:Ljava/lang/String;
  #34 = Utf8               _prefix
  #35 = Utf8               Ljava/lang/String;
  #36 = Fieldref           #1.#37         // ext/mods/gameserver/enums/CrestType._size:I
  #37 = NameAndType        #38:#39        // _size:I
  #38 = Utf8               _size
  #39 = Utf8               I
  #40 = String             #5             // PLEDGE
  #41 = String             #42            // Crest_
  #42 = Utf8               Crest_
  #43 = Methodref          #1.#44         // ext/mods/gameserver/enums/CrestType."<init>":(Ljava/lang/String;ILjava/lang/String;I)V
  #44 = NameAndType        #30:#45        // "<init>":(Ljava/lang/String;ILjava/lang/String;I)V
  #45 = Utf8               (Ljava/lang/String;ILjava/lang/String;I)V
  #46 = String             #9             // PLEDGE_LARGE
  #47 = String             #48            // LargeCrest_
  #48 = Utf8               LargeCrest_
  #49 = String             #12            // ALLY
  #50 = String             #51            // AllyCrest_
  #51 = Utf8               AllyCrest_
  #52 = Methodref          #1.#53         // ext/mods/gameserver/enums/CrestType.$values:()[Lext/mods/gameserver/enums/CrestType;
  #53 = NameAndType        #54:#55        // $values:()[Lext/mods/gameserver/enums/CrestType;
  #54 = Utf8               $values
  #55 = Utf8               ()[Lext/mods/gameserver/enums/CrestType;
  #56 = Utf8               values
  #57 = Utf8               Code
  #58 = Utf8               LineNumberTable
  #59 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/CrestType;
  #60 = Utf8               LocalVariableTable
  #61 = Utf8               name
  #62 = Utf8               MethodParameters
  #63 = Utf8               this
  #64 = Utf8               prefix
  #65 = Utf8               size
  #66 = Utf8               Signature
  #67 = Utf8               getPrefix
  #68 = Utf8               ()Ljava/lang/String;
  #69 = Utf8               getSize
  #70 = Utf8               ()I
  #71 = Utf8               <clinit>
  #72 = Utf8               ()V
  #73 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/enums/CrestType;>;
  #74 = Utf8               SourceFile
  #75 = Utf8               CrestType.java
{
  public static final ext.mods.gameserver.enums.CrestType PLEDGE;
    descriptor: Lext/mods/gameserver/enums/CrestType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.CrestType PLEDGE_LARGE;
    descriptor: Lext/mods/gameserver/enums/CrestType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.CrestType ALLY;
    descriptor: Lext/mods/gameserver/enums/CrestType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static ext.mods.gameserver.enums.CrestType[] values();
    descriptor: ()[Lext/mods/gameserver/enums/CrestType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #13                 // Field $VALUES:[Lext/mods/gameserver/enums/CrestType;
         3: invokevirtual #17                 // Method "[Lext/mods/gameserver/enums/CrestType;".clone:()Ljava/lang/Object;
         6: checkcast     #18                 // class "[Lext/mods/gameserver/enums/CrestType;"
         9: areturn
      LineNumberTable:
        line 20: 0

  public static ext.mods.gameserver.enums.CrestType valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/enums/CrestType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/enums/CrestType
         2: aload_0
         3: invokestatic  #22                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/enums/CrestType
         9: areturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  name   Ljava/lang/String;
    MethodParameters:
      Name                           Flags
      <no name>                      mandated

  public final java.lang.String getPrefix();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #32                 // Field _prefix:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 37: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/CrestType;

  public final int getSize();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #36                 // Field _size:I
         4: ireturn
      LineNumberTable:
        line 42: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/CrestType;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=6, locals=0, args_size=0
         0: new           #1                  // class ext/mods/gameserver/enums/CrestType
         3: dup
         4: ldc           #40                 // String PLEDGE
         6: iconst_0
         7: ldc           #41                 // String Crest_
         9: sipush        256
        12: invokespecial #43                 // Method "<init>":(Ljava/lang/String;ILjava/lang/String;I)V
        15: putstatic     #3                  // Field PLEDGE:Lext/mods/gameserver/enums/CrestType;
        18: new           #1                  // class ext/mods/gameserver/enums/CrestType
        21: dup
        22: ldc           #46                 // String PLEDGE_LARGE
        24: iconst_1
        25: ldc           #47                 // String LargeCrest_
        27: sipush        2176
        30: invokespecial #43                 // Method "<init>":(Ljava/lang/String;ILjava/lang/String;I)V
        33: putstatic     #7                  // Field PLEDGE_LARGE:Lext/mods/gameserver/enums/CrestType;
        36: new           #1                  // class ext/mods/gameserver/enums/CrestType
        39: dup
        40: ldc           #49                 // String ALLY
        42: iconst_2
        43: ldc           #50                 // String AllyCrest_
        45: sipush        192
        48: invokespecial #43                 // Method "<init>":(Ljava/lang/String;ILjava/lang/String;I)V
        51: putstatic     #10                 // Field ALLY:Lext/mods/gameserver/enums/CrestType;
        54: invokestatic  #52                 // Method $values:()[Lext/mods/gameserver/enums/CrestType;
        57: putstatic     #13                 // Field $VALUES:[Lext/mods/gameserver/enums/CrestType;
        60: return
      LineNumberTable:
        line 22: 0
        line 23: 18
        line 24: 36
        line 20: 54
}
Signature: #73                          // Ljava/lang/Enum<Lext/mods/gameserver/enums/CrestType;>;
SourceFile: "CrestType.java"
