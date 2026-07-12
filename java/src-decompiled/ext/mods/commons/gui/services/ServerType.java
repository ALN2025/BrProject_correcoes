// Bytecode for: ext.mods.commons.gui.services.ServerType
// File: ext\mods\commons\gui\services\ServerType.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/gui/services/ServerType.class
  Last modified 9 de jul de 2026; size 2175 bytes
  MD5 checksum 14824e06de9d5442532dca1b97400f8a
  Compiled from "ServerType.java"
public final class ext.mods.commons.gui.services.ServerType extends java.lang.Enum<ext.mods.commons.gui.services.ServerType>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/commons/gui/services/ServerType
  super_class: #20                        // java/lang/Enum
  interfaces: 0, fields: 6, methods: 9, attributes: 2
Constant pool:
   #1 = Class              #2             // ext/mods/commons/gui/services/ServerType
   #2 = Utf8               ext/mods/commons/gui/services/ServerType
   #3 = Fieldref           #1.#4          // ext/mods/commons/gui/services/ServerType.GAME_SERVER:Lext/mods/commons/gui/services/ServerType;
   #4 = NameAndType        #5:#6          // GAME_SERVER:Lext/mods/commons/gui/services/ServerType;
   #5 = Utf8               GAME_SERVER
   #6 = Utf8               Lext/mods/commons/gui/services/ServerType;
   #7 = Fieldref           #1.#8          // ext/mods/commons/gui/services/ServerType.LOGIN_SERVER:Lext/mods/commons/gui/services/ServerType;
   #8 = NameAndType        #9:#6          // LOGIN_SERVER:Lext/mods/commons/gui/services/ServerType;
   #9 = Utf8               LOGIN_SERVER
  #10 = Fieldref           #1.#11         // ext/mods/commons/gui/services/ServerType.$VALUES:[Lext/mods/commons/gui/services/ServerType;
  #11 = NameAndType        #12:#13        // $VALUES:[Lext/mods/commons/gui/services/ServerType;
  #12 = Utf8               $VALUES
  #13 = Utf8               [Lext/mods/commons/gui/services/ServerType;
  #14 = Methodref          #15.#16        // "[Lext/mods/commons/gui/services/ServerType;".clone:()Ljava/lang/Object;
  #15 = Class              #13            // "[Lext/mods/commons/gui/services/ServerType;"
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
  #29 = Fieldref           #1.#30         // ext/mods/commons/gui/services/ServerType.displayName:Ljava/lang/String;
  #30 = NameAndType        #31:#32        // displayName:Ljava/lang/String;
  #31 = Utf8               displayName
  #32 = Utf8               Ljava/lang/String;
  #33 = Fieldref           #1.#34         // ext/mods/commons/gui/services/ServerType.mainClass:Ljava/lang/String;
  #34 = NameAndType        #35:#32        // mainClass:Ljava/lang/String;
  #35 = Utf8               mainClass
  #36 = Fieldref           #1.#37         // ext/mods/commons/gui/services/ServerType.workingDirectory:Ljava/lang/String;
  #37 = NameAndType        #38:#32        // workingDirectory:Ljava/lang/String;
  #38 = Utf8               workingDirectory
  #39 = Methodref          #1.#40         // ext/mods/commons/gui/services/ServerType.values:()[Lext/mods/commons/gui/services/ServerType;
  #40 = NameAndType        #41:#42        // values:()[Lext/mods/commons/gui/services/ServerType;
  #41 = Utf8               values
  #42 = Utf8               ()[Lext/mods/commons/gui/services/ServerType;
  #43 = Methodref          #1.#44         // ext/mods/commons/gui/services/ServerType.getDisplayName:()Ljava/lang/String;
  #44 = NameAndType        #45:#46        // getDisplayName:()Ljava/lang/String;
  #45 = Utf8               getDisplayName
  #46 = Utf8               ()Ljava/lang/String;
  #47 = Methodref          #48.#49        // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
  #48 = Class              #50            // java/lang/String
  #49 = NameAndType        #51:#52        // equalsIgnoreCase:(Ljava/lang/String;)Z
  #50 = Utf8               java/lang/String
  #51 = Utf8               equalsIgnoreCase
  #52 = Utf8               (Ljava/lang/String;)Z
  #53 = String             #5             // GAME_SERVER
  #54 = String             #55            // Game Server
  #55 = Utf8               Game Server
  #56 = String             #57            // ext.mods.gameserver.GameServer
  #57 = Utf8               ext.mods.gameserver.GameServer
  #58 = String             #59            // game
  #59 = Utf8               game
  #60 = Methodref          #1.#61         // ext/mods/commons/gui/services/ServerType."<init>":(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
  #61 = NameAndType        #27:#62        // "<init>":(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
  #62 = Utf8               (Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
  #63 = String             #9             // LOGIN_SERVER
  #64 = String             #65            // Login Server
  #65 = Utf8               Login Server
  #66 = String             #67            // ext.mods.loginserver.LoginServer
  #67 = Utf8               ext.mods.loginserver.LoginServer
  #68 = String             #69            // login
  #69 = Utf8               login
  #70 = Methodref          #1.#71         // ext/mods/commons/gui/services/ServerType.$values:()[Lext/mods/commons/gui/services/ServerType;
  #71 = NameAndType        #72:#42        // $values:()[Lext/mods/commons/gui/services/ServerType;
  #72 = Utf8               $values
  #73 = Utf8               Code
  #74 = Utf8               LineNumberTable
  #75 = Utf8               (Ljava/lang/String;)Lext/mods/commons/gui/services/ServerType;
  #76 = Utf8               LocalVariableTable
  #77 = Utf8               name
  #78 = Utf8               MethodParameters
  #79 = Utf8               this
  #80 = Utf8               Signature
  #81 = Utf8               (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
  #82 = Utf8               getMainClass
  #83 = Utf8               getWorkingDirectory
  #84 = Utf8               fromDisplayName
  #85 = Utf8               type
  #86 = Utf8               StackMapTable
  #87 = Utf8               <clinit>
  #88 = Utf8               ()V
  #89 = Utf8               Ljava/lang/Enum<Lext/mods/commons/gui/services/ServerType;>;
  #90 = Utf8               SourceFile
  #91 = Utf8               ServerType.java
{
  public static final ext.mods.commons.gui.services.ServerType GAME_SERVER;
    descriptor: Lext/mods/commons/gui/services/ServerType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.commons.gui.services.ServerType LOGIN_SERVER;
    descriptor: Lext/mods/commons/gui/services/ServerType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static ext.mods.commons.gui.services.ServerType[] values();
    descriptor: ()[Lext/mods/commons/gui/services/ServerType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #10                 // Field $VALUES:[Lext/mods/commons/gui/services/ServerType;
         3: invokevirtual #14                 // Method "[Lext/mods/commons/gui/services/ServerType;".clone:()Ljava/lang/Object;
         6: checkcast     #15                 // class "[Lext/mods/commons/gui/services/ServerType;"
         9: areturn
      LineNumberTable:
        line 23: 0

  public static ext.mods.commons.gui.services.ServerType valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/commons/gui/services/ServerType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/commons/gui/services/ServerType
         2: aload_0
         3: invokestatic  #19                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/commons/gui/services/ServerType
         9: areturn
      LineNumberTable:
        line 23: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  name   Ljava/lang/String;
    MethodParameters:
      Name                           Flags
      <no name>                      mandated

  public java.lang.String getDisplayName();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #29                 // Field displayName:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 39: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/gui/services/ServerType;

  public java.lang.String getMainClass();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #33                 // Field mainClass:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 43: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/gui/services/ServerType;

  public java.lang.String getWorkingDirectory();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #36                 // Field workingDirectory:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 47: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/gui/services/ServerType;

  public static ext.mods.commons.gui.services.ServerType fromDisplayName(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/commons/gui/services/ServerType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=5, args_size=1
         0: invokestatic  #39                 // Method values:()[Lext/mods/commons/gui/services/ServerType;
         3: astore_1
         4: aload_1
         5: arraylength
         6: istore_2
         7: iconst_0
         8: istore_3
         9: iload_3
        10: iload_2
        11: if_icmpge     40
        14: aload_1
        15: iload_3
        16: aaload
        17: astore        4
        19: aload         4
        21: invokevirtual #43                 // Method getDisplayName:()Ljava/lang/String;
        24: aload_0
        25: invokevirtual #47                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        28: ifeq          34
        31: aload         4
        33: areturn
        34: iinc          3, 1
        37: goto          9
        40: aconst_null
        41: areturn
      LineNumberTable:
        line 56: 0
        line 57: 19
        line 58: 31
        line 56: 34
        line 61: 40
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           19      15     4  type   Lext/mods/commons/gui/services/ServerType;
            0      42     0 displayName   Ljava/lang/String;
      StackMapTable: number_of_entries = 3
        frame_type = 254 /* append */
          offset_delta = 9
          locals = [ class "[Lext/mods/commons/gui/services/ServerType;", int, int ]
        frame_type = 24 /* same */
        frame_type = 248 /* chop */
          offset_delta = 5

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=7, locals=0, args_size=0
         0: new           #1                  // class ext/mods/commons/gui/services/ServerType
         3: dup
         4: ldc           #53                 // String GAME_SERVER
         6: iconst_0
         7: ldc           #54                 // String Game Server
         9: ldc           #56                 // String ext.mods.gameserver.GameServer
        11: ldc           #58                 // String game
        13: invokespecial #60                 // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        16: putstatic     #3                  // Field GAME_SERVER:Lext/mods/commons/gui/services/ServerType;
        19: new           #1                  // class ext/mods/commons/gui/services/ServerType
        22: dup
        23: ldc           #63                 // String LOGIN_SERVER
        25: iconst_1
        26: ldc           #64                 // String Login Server
        28: ldc           #66                 // String ext.mods.loginserver.LoginServer
        30: ldc           #68                 // String login
        32: invokespecial #60                 // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        35: putstatic     #7                  // Field LOGIN_SERVER:Lext/mods/commons/gui/services/ServerType;
        38: invokestatic  #70                 // Method $values:()[Lext/mods/commons/gui/services/ServerType;
        41: putstatic     #10                 // Field $VALUES:[Lext/mods/commons/gui/services/ServerType;
        44: return
      LineNumberTable:
        line 25: 0
        line 26: 19
        line 23: 38
}
Signature: #89                          // Ljava/lang/Enum<Lext/mods/commons/gui/services/ServerType;>;
SourceFile: "ServerType.java"
