// Bytecode for: ext.mods.gameserver.enums.PrivateStoreType
// File: ext\mods\gameserver\enums\PrivateStoreType.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/enums/PrivateStoreType.class
  Last modified 9 de jul de 2026; size 1345 bytes
  MD5 checksum 46180c7138f7d607cbc594fd7589fe3a
  Compiled from "PrivateStoreType.java"
public final class ext.mods.gameserver.enums.PrivateStoreType extends java.lang.Enum<ext.mods.gameserver.enums.PrivateStoreType>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/enums/PrivateStoreType
  super_class: #29                        // java/lang/Enum
  interfaces: 0, fields: 6, methods: 5, attributes: 2
Constant pool:
   #1 = Class              #2             // ext/mods/gameserver/enums/PrivateStoreType
   #2 = Utf8               ext/mods/gameserver/enums/PrivateStoreType
   #3 = Fieldref           #1.#4          // ext/mods/gameserver/enums/PrivateStoreType.NONE:Lext/mods/gameserver/enums/PrivateStoreType;
   #4 = NameAndType        #5:#6          // NONE:Lext/mods/gameserver/enums/PrivateStoreType;
   #5 = Utf8               NONE
   #6 = Utf8               Lext/mods/gameserver/enums/PrivateStoreType;
   #7 = Fieldref           #1.#8          // ext/mods/gameserver/enums/PrivateStoreType.SELL:Lext/mods/gameserver/enums/PrivateStoreType;
   #8 = NameAndType        #9:#6          // SELL:Lext/mods/gameserver/enums/PrivateStoreType;
   #9 = Utf8               SELL
  #10 = Fieldref           #1.#11         // ext/mods/gameserver/enums/PrivateStoreType.BUY:Lext/mods/gameserver/enums/PrivateStoreType;
  #11 = NameAndType        #12:#6         // BUY:Lext/mods/gameserver/enums/PrivateStoreType;
  #12 = Utf8               BUY
  #13 = Fieldref           #1.#14         // ext/mods/gameserver/enums/PrivateStoreType.MANUFACTURE:Lext/mods/gameserver/enums/PrivateStoreType;
  #14 = NameAndType        #15:#6         // MANUFACTURE:Lext/mods/gameserver/enums/PrivateStoreType;
  #15 = Utf8               MANUFACTURE
  #16 = Fieldref           #1.#17         // ext/mods/gameserver/enums/PrivateStoreType.PACKAGE_SELL:Lext/mods/gameserver/enums/PrivateStoreType;
  #17 = NameAndType        #18:#6         // PACKAGE_SELL:Lext/mods/gameserver/enums/PrivateStoreType;
  #18 = Utf8               PACKAGE_SELL
  #19 = Fieldref           #1.#20         // ext/mods/gameserver/enums/PrivateStoreType.$VALUES:[Lext/mods/gameserver/enums/PrivateStoreType;
  #20 = NameAndType        #21:#22        // $VALUES:[Lext/mods/gameserver/enums/PrivateStoreType;
  #21 = Utf8               $VALUES
  #22 = Utf8               [Lext/mods/gameserver/enums/PrivateStoreType;
  #23 = Methodref          #24.#25        // "[Lext/mods/gameserver/enums/PrivateStoreType;".clone:()Ljava/lang/Object;
  #24 = Class              #22            // "[Lext/mods/gameserver/enums/PrivateStoreType;"
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
  #38 = String             #5             // NONE
  #39 = Methodref          #1.#35         // ext/mods/gameserver/enums/PrivateStoreType."<init>":(Ljava/lang/String;I)V
  #40 = String             #9             // SELL
  #41 = String             #12            // BUY
  #42 = String             #15            // MANUFACTURE
  #43 = String             #18            // PACKAGE_SELL
  #44 = Methodref          #1.#45         // ext/mods/gameserver/enums/PrivateStoreType.$values:()[Lext/mods/gameserver/enums/PrivateStoreType;
  #45 = NameAndType        #46:#47        // $values:()[Lext/mods/gameserver/enums/PrivateStoreType;
  #46 = Utf8               $values
  #47 = Utf8               ()[Lext/mods/gameserver/enums/PrivateStoreType;
  #48 = Utf8               values
  #49 = Utf8               Code
  #50 = Utf8               LineNumberTable
  #51 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/PrivateStoreType;
  #52 = Utf8               LocalVariableTable
  #53 = Utf8               name
  #54 = Utf8               Ljava/lang/String;
  #55 = Utf8               MethodParameters
  #56 = Utf8               this
  #57 = Utf8               Signature
  #58 = Utf8               ()V
  #59 = Utf8               <clinit>
  #60 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/enums/PrivateStoreType;>;
  #61 = Utf8               SourceFile
  #62 = Utf8               PrivateStoreType.java
{
  public static final ext.mods.gameserver.enums.PrivateStoreType NONE;
    descriptor: Lext/mods/gameserver/enums/PrivateStoreType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.PrivateStoreType SELL;
    descriptor: Lext/mods/gameserver/enums/PrivateStoreType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.PrivateStoreType BUY;
    descriptor: Lext/mods/gameserver/enums/PrivateStoreType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.PrivateStoreType MANUFACTURE;
    descriptor: Lext/mods/gameserver/enums/PrivateStoreType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.PrivateStoreType PACKAGE_SELL;
    descriptor: Lext/mods/gameserver/enums/PrivateStoreType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static ext.mods.gameserver.enums.PrivateStoreType[] values();
    descriptor: ()[Lext/mods/gameserver/enums/PrivateStoreType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #19                 // Field $VALUES:[Lext/mods/gameserver/enums/PrivateStoreType;
         3: invokevirtual #23                 // Method "[Lext/mods/gameserver/enums/PrivateStoreType;".clone:()Ljava/lang/Object;
         6: checkcast     #24                 // class "[Lext/mods/gameserver/enums/PrivateStoreType;"
         9: areturn
      LineNumberTable:
        line 20: 0

  public static ext.mods.gameserver.enums.PrivateStoreType valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/enums/PrivateStoreType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/enums/PrivateStoreType
         2: aload_0
         3: invokestatic  #28                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/enums/PrivateStoreType
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
         0: new           #1                  // class ext/mods/gameserver/enums/PrivateStoreType
         3: dup
         4: ldc           #38                 // String NONE
         6: iconst_0
         7: invokespecial #39                 // Method "<init>":(Ljava/lang/String;I)V
        10: putstatic     #3                  // Field NONE:Lext/mods/gameserver/enums/PrivateStoreType;
        13: new           #1                  // class ext/mods/gameserver/enums/PrivateStoreType
        16: dup
        17: ldc           #40                 // String SELL
        19: iconst_1
        20: invokespecial #39                 // Method "<init>":(Ljava/lang/String;I)V
        23: putstatic     #7                  // Field SELL:Lext/mods/gameserver/enums/PrivateStoreType;
        26: new           #1                  // class ext/mods/gameserver/enums/PrivateStoreType
        29: dup
        30: ldc           #41                 // String BUY
        32: iconst_2
        33: invokespecial #39                 // Method "<init>":(Ljava/lang/String;I)V
        36: putstatic     #10                 // Field BUY:Lext/mods/gameserver/enums/PrivateStoreType;
        39: new           #1                  // class ext/mods/gameserver/enums/PrivateStoreType
        42: dup
        43: ldc           #42                 // String MANUFACTURE
        45: iconst_3
        46: invokespecial #39                 // Method "<init>":(Ljava/lang/String;I)V
        49: putstatic     #13                 // Field MANUFACTURE:Lext/mods/gameserver/enums/PrivateStoreType;
        52: new           #1                  // class ext/mods/gameserver/enums/PrivateStoreType
        55: dup
        56: ldc           #43                 // String PACKAGE_SELL
        58: iconst_4
        59: invokespecial #39                 // Method "<init>":(Ljava/lang/String;I)V
        62: putstatic     #16                 // Field PACKAGE_SELL:Lext/mods/gameserver/enums/PrivateStoreType;
        65: invokestatic  #44                 // Method $values:()[Lext/mods/gameserver/enums/PrivateStoreType;
        68: putstatic     #19                 // Field $VALUES:[Lext/mods/gameserver/enums/PrivateStoreType;
        71: return
      LineNumberTable:
        line 22: 0
        line 23: 13
        line 24: 26
        line 25: 39
        line 26: 52
        line 20: 65
}
Signature: #60                          // Ljava/lang/Enum<Lext/mods/gameserver/enums/PrivateStoreType;>;
SourceFile: "PrivateStoreType.java"
