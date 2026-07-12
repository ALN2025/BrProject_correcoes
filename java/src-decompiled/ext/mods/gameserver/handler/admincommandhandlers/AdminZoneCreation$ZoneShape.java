// Bytecode for: ext.mods.gameserver.handler.admincommandhandlers.AdminZoneCreation$ZoneShape
// File: ext\mods\gameserver\handler\admincommandhandlers\AdminZoneCreation$ZoneShape.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape.class
  Last modified 9 de jul de 2026; size 1626 bytes
  MD5 checksum 5bcdb16c2c3f2929bc00183ecbf7afbe
  Compiled from "AdminZoneCreation.java"
final class ext.mods.gameserver.handler.admincommandhandlers.AdminZoneCreation$ZoneShape extends java.lang.Enum<ext.mods.gameserver.handler.admincommandhandlers.AdminZoneCreation$ZoneShape>
  minor version: 0
  major version: 69
  flags: (0x4030) ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape
  super_class: #26                        // java/lang/Enum
  interfaces: 0, fields: 5, methods: 5, attributes: 4
Constant pool:
   #1 = Class              #2             // ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape
   #2 = Utf8               ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape
   #3 = Fieldref           #1.#4          // ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape.NONE:Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape;
   #4 = NameAndType        #5:#6          // NONE:Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape;
   #5 = Utf8               NONE
   #6 = Utf8               Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape;
   #7 = Fieldref           #1.#8          // ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape.NPoly:Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape;
   #8 = NameAndType        #9:#6          // NPoly:Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape;
   #9 = Utf8               NPoly
  #10 = Fieldref           #1.#11         // ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape.Cuboid:Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape;
  #11 = NameAndType        #12:#6         // Cuboid:Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape;
  #12 = Utf8               Cuboid
  #13 = Fieldref           #1.#14         // ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape.Cylinder:Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape;
  #14 = NameAndType        #15:#6         // Cylinder:Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape;
  #15 = Utf8               Cylinder
  #16 = Fieldref           #1.#17         // ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape.$VALUES:[Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape;
  #17 = NameAndType        #18:#19        // $VALUES:[Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape;
  #18 = Utf8               $VALUES
  #19 = Utf8               [Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape;
  #20 = Methodref          #21.#22        // "[Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape;".clone:()Ljava/lang/Object;
  #21 = Class              #19            // "[Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape;"
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
  #35 = String             #5             // NONE
  #36 = Methodref          #1.#32         // ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape."<init>":(Ljava/lang/String;I)V
  #37 = String             #9             // NPoly
  #38 = String             #12            // Cuboid
  #39 = String             #15            // Cylinder
  #40 = Methodref          #1.#41         // ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape.$values:()[Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape;
  #41 = NameAndType        #42:#43        // $values:()[Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape;
  #42 = Utf8               $values
  #43 = Utf8               ()[Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape;
  #44 = Utf8               values
  #45 = Utf8               Code
  #46 = Utf8               LineNumberTable
  #47 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape;
  #48 = Utf8               LocalVariableTable
  #49 = Utf8               name
  #50 = Utf8               Ljava/lang/String;
  #51 = Utf8               MethodParameters
  #52 = Utf8               this
  #53 = Utf8               Signature
  #54 = Utf8               ()V
  #55 = Utf8               <clinit>
  #56 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape;>;
  #57 = Utf8               SourceFile
  #58 = Utf8               AdminZoneCreation.java
  #59 = Utf8               NestHost
  #60 = Class              #61            // ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation
  #61 = Utf8               ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation
  #62 = Utf8               InnerClasses
  #63 = Utf8               ZoneShape
{
  public static final ext.mods.gameserver.handler.admincommandhandlers.AdminZoneCreation$ZoneShape NONE;
    descriptor: Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.handler.admincommandhandlers.AdminZoneCreation$ZoneShape NPoly;
    descriptor: Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.handler.admincommandhandlers.AdminZoneCreation$ZoneShape Cuboid;
    descriptor: Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.handler.admincommandhandlers.AdminZoneCreation$ZoneShape Cylinder;
    descriptor: Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static ext.mods.gameserver.handler.admincommandhandlers.AdminZoneCreation$ZoneShape[] values();
    descriptor: ()[Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #16                 // Field $VALUES:[Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape;
         3: invokevirtual #20                 // Method "[Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape;".clone:()Ljava/lang/Object;
         6: checkcast     #21                 // class "[Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape;"
         9: areturn
      LineNumberTable:
        line 44: 0

  public static ext.mods.gameserver.handler.admincommandhandlers.AdminZoneCreation$ZoneShape valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape
         2: aload_0
         3: invokestatic  #25                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape
         9: areturn
      LineNumberTable:
        line 44: 0
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
         0: new           #1                  // class ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape
         3: dup
         4: ldc           #35                 // String NONE
         6: iconst_0
         7: invokespecial #36                 // Method "<init>":(Ljava/lang/String;I)V
        10: putstatic     #3                  // Field NONE:Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape;
        13: new           #1                  // class ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape
        16: dup
        17: ldc           #37                 // String NPoly
        19: iconst_1
        20: invokespecial #36                 // Method "<init>":(Ljava/lang/String;I)V
        23: putstatic     #7                  // Field NPoly:Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape;
        26: new           #1                  // class ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape
        29: dup
        30: ldc           #38                 // String Cuboid
        32: iconst_2
        33: invokespecial #36                 // Method "<init>":(Ljava/lang/String;I)V
        36: putstatic     #10                 // Field Cuboid:Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape;
        39: new           #1                  // class ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape
        42: dup
        43: ldc           #39                 // String Cylinder
        45: iconst_3
        46: invokespecial #36                 // Method "<init>":(Ljava/lang/String;I)V
        49: putstatic     #13                 // Field Cylinder:Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape;
        52: invokestatic  #40                 // Method $values:()[Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape;
        55: putstatic     #16                 // Field $VALUES:[Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape;
        58: return
      LineNumberTable:
        line 46: 0
        line 47: 13
        line 48: 26
        line 49: 39
        line 44: 52
}
Signature: #56                          // Ljava/lang/Enum<Lext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation$ZoneShape;>;
SourceFile: "AdminZoneCreation.java"
NestHost: class ext/mods/gameserver/handler/admincommandhandlers/AdminZoneCreation
