// Bytecode for: ext.mods.gameserver.enums.bbs.ForumAccess
// File: ext\mods\gameserver\enums\bbs\ForumAccess.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/enums/bbs/ForumAccess.class
  Last modified 9 de jul de 2026; size 1569 bytes
  MD5 checksum 95b3debfc0d47168bd021e3ec06a0fbc
  Compiled from "ForumAccess.java"
public final class ext.mods.gameserver.enums.bbs.ForumAccess extends java.lang.Enum<ext.mods.gameserver.enums.bbs.ForumAccess>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/enums/bbs/ForumAccess
  super_class: #26                        // java/lang/Enum
  interfaces: 0, fields: 6, methods: 6, attributes: 2
Constant pool:
   #1 = Class              #2             // ext/mods/gameserver/enums/bbs/ForumAccess
   #2 = Utf8               ext/mods/gameserver/enums/bbs/ForumAccess
   #3 = Fieldref           #1.#4          // ext/mods/gameserver/enums/bbs/ForumAccess.NONE:Lext/mods/gameserver/enums/bbs/ForumAccess;
   #4 = NameAndType        #5:#6          // NONE:Lext/mods/gameserver/enums/bbs/ForumAccess;
   #5 = Utf8               NONE
   #6 = Utf8               Lext/mods/gameserver/enums/bbs/ForumAccess;
   #7 = Fieldref           #1.#8          // ext/mods/gameserver/enums/bbs/ForumAccess.READ:Lext/mods/gameserver/enums/bbs/ForumAccess;
   #8 = NameAndType        #9:#6          // READ:Lext/mods/gameserver/enums/bbs/ForumAccess;
   #9 = Utf8               READ
  #10 = Fieldref           #1.#11         // ext/mods/gameserver/enums/bbs/ForumAccess.WRITE:Lext/mods/gameserver/enums/bbs/ForumAccess;
  #11 = NameAndType        #12:#6         // WRITE:Lext/mods/gameserver/enums/bbs/ForumAccess;
  #12 = Utf8               WRITE
  #13 = Fieldref           #1.#14         // ext/mods/gameserver/enums/bbs/ForumAccess.ALL:Lext/mods/gameserver/enums/bbs/ForumAccess;
  #14 = NameAndType        #15:#6         // ALL:Lext/mods/gameserver/enums/bbs/ForumAccess;
  #15 = Utf8               ALL
  #16 = Fieldref           #1.#17         // ext/mods/gameserver/enums/bbs/ForumAccess.$VALUES:[Lext/mods/gameserver/enums/bbs/ForumAccess;
  #17 = NameAndType        #18:#19        // $VALUES:[Lext/mods/gameserver/enums/bbs/ForumAccess;
  #18 = Utf8               $VALUES
  #19 = Utf8               [Lext/mods/gameserver/enums/bbs/ForumAccess;
  #20 = Methodref          #21.#22        // "[Lext/mods/gameserver/enums/bbs/ForumAccess;".clone:()Ljava/lang/Object;
  #21 = Class              #19            // "[Lext/mods/gameserver/enums/bbs/ForumAccess;"
  #22 = NameAndType        #23:#24        // clone:()Ljava/lang/Object;
  #23 = Utf8               clone
  #24 = Utf8               ()Ljava/lang/Object;
  #25 = Methodref          #26.#27        // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #26 = Class              #28            // java/lang/Enum
  #27 = NameAndType        #29:#30        // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #28 = Utf8               java/lang/Enum
  #29 = Utf8               valueOf
  #30 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #31 = Methodref          #26.#32        // java/lang/Enum."<init>":(Ljava/lang/String;I)V
  #32 = NameAndType        #33:#34        // "<init>":(Ljava/lang/String;I)V
  #33 = Utf8               <init>
  #34 = Utf8               (Ljava/lang/String;I)V
  #35 = Fieldref           #1.#36         // ext/mods/gameserver/enums/bbs/ForumAccess._desc:Ljava/lang/String;
  #36 = NameAndType        #37:#38        // _desc:Ljava/lang/String;
  #37 = Utf8               _desc
  #38 = Utf8               Ljava/lang/String;
  #39 = String             #5             // NONE
  #40 = String             #41            // No access
  #41 = Utf8               No access
  #42 = Methodref          #1.#43         // ext/mods/gameserver/enums/bbs/ForumAccess."<init>":(Ljava/lang/String;ILjava/lang/String;)V
  #43 = NameAndType        #33:#44        // "<init>":(Ljava/lang/String;ILjava/lang/String;)V
  #44 = Utf8               (Ljava/lang/String;ILjava/lang/String;)V
  #45 = String             #9             // READ
  #46 = String             #47            // Read access
  #47 = Utf8               Read access
  #48 = String             #12            // WRITE
  #49 = String             #50            // Write access
  #50 = Utf8               Write access
  #51 = String             #15            // ALL
  #52 = String             #53            // All access
  #53 = Utf8               All access
  #54 = Methodref          #1.#55         // ext/mods/gameserver/enums/bbs/ForumAccess.$values:()[Lext/mods/gameserver/enums/bbs/ForumAccess;
  #55 = NameAndType        #56:#57        // $values:()[Lext/mods/gameserver/enums/bbs/ForumAccess;
  #56 = Utf8               $values
  #57 = Utf8               ()[Lext/mods/gameserver/enums/bbs/ForumAccess;
  #58 = Utf8               values
  #59 = Utf8               Code
  #60 = Utf8               LineNumberTable
  #61 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/bbs/ForumAccess;
  #62 = Utf8               LocalVariableTable
  #63 = Utf8               name
  #64 = Utf8               MethodParameters
  #65 = Utf8               this
  #66 = Utf8               desc
  #67 = Utf8               Signature
  #68 = Utf8               (Ljava/lang/String;)V
  #69 = Utf8               getDesc
  #70 = Utf8               ()Ljava/lang/String;
  #71 = Utf8               <clinit>
  #72 = Utf8               ()V
  #73 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/enums/bbs/ForumAccess;>;
  #74 = Utf8               SourceFile
  #75 = Utf8               ForumAccess.java
{
  public static final ext.mods.gameserver.enums.bbs.ForumAccess NONE;
    descriptor: Lext/mods/gameserver/enums/bbs/ForumAccess;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.bbs.ForumAccess READ;
    descriptor: Lext/mods/gameserver/enums/bbs/ForumAccess;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.bbs.ForumAccess WRITE;
    descriptor: Lext/mods/gameserver/enums/bbs/ForumAccess;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.bbs.ForumAccess ALL;
    descriptor: Lext/mods/gameserver/enums/bbs/ForumAccess;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static ext.mods.gameserver.enums.bbs.ForumAccess[] values();
    descriptor: ()[Lext/mods/gameserver/enums/bbs/ForumAccess;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #16                 // Field $VALUES:[Lext/mods/gameserver/enums/bbs/ForumAccess;
         3: invokevirtual #20                 // Method "[Lext/mods/gameserver/enums/bbs/ForumAccess;".clone:()Ljava/lang/Object;
         6: checkcast     #21                 // class "[Lext/mods/gameserver/enums/bbs/ForumAccess;"
         9: areturn
      LineNumberTable:
        line 20: 0

  public static ext.mods.gameserver.enums.bbs.ForumAccess valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/enums/bbs/ForumAccess;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/enums/bbs/ForumAccess
         2: aload_0
         3: invokestatic  #25                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/enums/bbs/ForumAccess
         9: areturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  name   Ljava/lang/String;
    MethodParameters:
      Name                           Flags
      <no name>                      mandated

  public java.lang.String getDesc();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #35                 // Field _desc:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 36: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/bbs/ForumAccess;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=5, locals=0, args_size=0
         0: new           #1                  // class ext/mods/gameserver/enums/bbs/ForumAccess
         3: dup
         4: ldc           #39                 // String NONE
         6: iconst_0
         7: ldc           #40                 // String No access
         9: invokespecial #42                 // Method "<init>":(Ljava/lang/String;ILjava/lang/String;)V
        12: putstatic     #3                  // Field NONE:Lext/mods/gameserver/enums/bbs/ForumAccess;
        15: new           #1                  // class ext/mods/gameserver/enums/bbs/ForumAccess
        18: dup
        19: ldc           #45                 // String READ
        21: iconst_1
        22: ldc           #46                 // String Read access
        24: invokespecial #42                 // Method "<init>":(Ljava/lang/String;ILjava/lang/String;)V
        27: putstatic     #7                  // Field READ:Lext/mods/gameserver/enums/bbs/ForumAccess;
        30: new           #1                  // class ext/mods/gameserver/enums/bbs/ForumAccess
        33: dup
        34: ldc           #48                 // String WRITE
        36: iconst_2
        37: ldc           #49                 // String Write access
        39: invokespecial #42                 // Method "<init>":(Ljava/lang/String;ILjava/lang/String;)V
        42: putstatic     #10                 // Field WRITE:Lext/mods/gameserver/enums/bbs/ForumAccess;
        45: new           #1                  // class ext/mods/gameserver/enums/bbs/ForumAccess
        48: dup
        49: ldc           #51                 // String ALL
        51: iconst_3
        52: ldc           #52                 // String All access
        54: invokespecial #42                 // Method "<init>":(Ljava/lang/String;ILjava/lang/String;)V
        57: putstatic     #13                 // Field ALL:Lext/mods/gameserver/enums/bbs/ForumAccess;
        60: invokestatic  #54                 // Method $values:()[Lext/mods/gameserver/enums/bbs/ForumAccess;
        63: putstatic     #16                 // Field $VALUES:[Lext/mods/gameserver/enums/bbs/ForumAccess;
        66: return
      LineNumberTable:
        line 22: 0
        line 23: 15
        line 24: 30
        line 25: 45
        line 20: 60
}
Signature: #73                          // Ljava/lang/Enum<Lext/mods/gameserver/enums/bbs/ForumAccess;>;
SourceFile: "ForumAccess.java"
