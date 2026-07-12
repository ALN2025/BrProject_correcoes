// Bytecode for: ext.mods.gameserver.handler.voicedcommandhandlers.Pack
// File: ext\mods\gameserver\handler\voicedcommandhandlers\Pack.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/voicedcommandhandlers/Pack.class
  Last modified 9 de jul de 2026; size 2242 bytes
  MD5 checksum 43ef891ffa87bfe1c510bb62b41e92de
  Compiled from "Pack.java"
public class ext.mods.gameserver.handler.voicedcommandhandlers.Pack implements ext.mods.gameserver.handler.IVoicedCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #7                          // ext/mods/gameserver/handler/voicedcommandhandlers/Pack
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 6, methods: 5, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Class              #8             // ext/mods/gameserver/handler/voicedcommandhandlers/Pack
   #8 = Utf8               ext/mods/gameserver/handler/voicedcommandhandlers/Pack
   #9 = String             #10            // pack
  #10 = Utf8               pack
  #11 = Methodref          #12.#13        // java/lang/String.equals:(Ljava/lang/Object;)Z
  #12 = Class              #14            // java/lang/String
  #13 = NameAndType        #15:#16        // equals:(Ljava/lang/Object;)Z
  #14 = Utf8               java/lang/String
  #15 = Utf8               equals
  #16 = Utf8               (Ljava/lang/Object;)Z
  #17 = String             #18            // ===============
  #18 = Utf8               ===============
  #19 = Methodref          #7.#20         // ext/mods/gameserver/handler/voicedcommandhandlers/Pack.sendLine:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #20 = NameAndType        #21:#22        // sendLine:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #21 = Utf8               sendLine
  #22 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #23 = String             #24            // Brproject — Cronica 6: Interlude
  #24 = Utf8               Brproject — Cronica 6: Interlude
  #25 = String             #26            // Base: RusaCis 3.8
  #26 = Utf8               Base: RusaCis 3.8
  #27 = String             #28            // Versao: 3.8
  #28 = Utf8               Versao: 3.8
  #29 = Methodref          #30.#31        // ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
  #30 = Class              #32            // ext/mods/gameserver/model/actor/Player
  #31 = NameAndType        #33:#34        // getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
  #32 = Utf8               ext/mods/gameserver/model/actor/Player
  #33 = Utf8               getSysString
  #34 = Utf8               (I[Ljava/lang/Object;)Ljava/lang/String;
  #35 = InvokeDynamic      #0:#36         // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #36 = NameAndType        #37:#38        // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #37 = Utf8               makeConcatWithConstants
  #38 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #39 = String             #40            // Colaborador:
  #40 = Utf8               Colaborador:
  #41 = String             #42            // Dev <A.L.N/>
  #42 = Utf8               Dev <A.L.N/>
  #43 = Methodref          #30.#44        // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
  #44 = NameAndType        #45:#46        // sendMessage:(Ljava/lang/String;)V
  #45 = Utf8               sendMessage
  #46 = Utf8               (Ljava/lang/String;)V
  #47 = Fieldref           #7.#48         // ext/mods/gameserver/handler/voicedcommandhandlers/Pack.VOICED_COMMANDS:[Ljava/lang/String;
  #48 = NameAndType        #49:#50        // VOICED_COMMANDS:[Ljava/lang/String;
  #49 = Utf8               VOICED_COMMANDS
  #50 = Utf8               [Ljava/lang/String;
  #51 = Class              #52            // ext/mods/gameserver/handler/IVoicedCommandHandler
  #52 = Utf8               ext/mods/gameserver/handler/IVoicedCommandHandler
  #53 = Utf8               COMMAND
  #54 = Utf8               Ljava/lang/String;
  #55 = Utf8               ConstantValue
  #56 = Utf8               PROJECT_VERSION
  #57 = String             #58            // 3.8
  #58 = Utf8               3.8
  #59 = Utf8               PROJECT_BASE
  #60 = String             #61            // RusaCis 3.8
  #61 = Utf8               RusaCis 3.8
  #62 = Utf8               DEV_CREDIT
  #63 = Utf8               SEPARATOR
  #64 = Utf8               Code
  #65 = Utf8               LineNumberTable
  #66 = Utf8               LocalVariableTable
  #67 = Utf8               this
  #68 = Utf8               Lext/mods/gameserver/handler/voicedcommandhandlers/Pack;
  #69 = Utf8               useVoicedCommand
  #70 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
  #71 = Utf8               command
  #72 = Utf8               player
  #73 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #74 = Utf8               target
  #75 = Utf8               StackMapTable
  #76 = Utf8               text
  #77 = Utf8               getVoicedCommandList
  #78 = Utf8               ()[Ljava/lang/String;
  #79 = Utf8               <clinit>
  #80 = Utf8               SourceFile
  #81 = Utf8               Pack.java
  #82 = Utf8               BootstrapMethods
  #83 = String             #84            // Versao Laboratorio: \u0001
  #84 = Utf8               Versao Laboratorio: \u0001
  #85 = MethodHandle       6:#86          // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #86 = Methodref          #87.#88        // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #87 = Class              #89            // java/lang/invoke/StringConcatFactory
  #88 = NameAndType        #37:#90        // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #89 = Utf8               java/lang/invoke/StringConcatFactory
  #90 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #91 = Utf8               InnerClasses
  #92 = Class              #93            // java/lang/invoke/MethodHandles$Lookup
  #93 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #94 = Class              #95            // java/lang/invoke/MethodHandles
  #95 = Utf8               java/lang/invoke/MethodHandles
  #96 = Utf8               Lookup
{
  public ext.mods.gameserver.handler.voicedcommandhandlers.Pack();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 9: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/Pack;

  public boolean useVoicedCommand(java.lang.String, ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=4
         0: aload_1
         1: ldc           #9                  // String pack
         3: invokevirtual #11                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
         6: ifeq          13
         9: aload_2
        10: ifnonnull     15
        13: iconst_0
        14: ireturn
        15: aload_2
        16: ldc           #17                 // String ===============
        18: invokestatic  #19                 // Method sendLine:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
        21: aload_2
        22: ldc           #23                 // String Brproject — Cronica 6: Interlude
        24: invokestatic  #19                 // Method sendLine:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
        27: aload_2
        28: ldc           #25                 // String Base: RusaCis 3.8
        30: invokestatic  #19                 // Method sendLine:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
        33: aload_2
        34: ldc           #27                 // String Versao: 3.8
        36: invokestatic  #19                 // Method sendLine:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
        39: aload_2
        40: aload_2
        41: sipush        10212
        44: iconst_0
        45: anewarray     #2                  // class java/lang/Object
        48: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
        51: invokedynamic #35,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        56: invokestatic  #19                 // Method sendLine:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
        59: aload_2
        60: ldc           #39                 // String Colaborador:
        62: invokestatic  #19                 // Method sendLine:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
        65: aload_2
        66: ldc           #41                 // String Dev <A.L.N/>
        68: invokestatic  #19                 // Method sendLine:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
        71: aload_2
        72: ldc           #17                 // String ===============
        74: invokestatic  #19                 // Method sendLine:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
        77: iconst_1
        78: ireturn
      LineNumberTable:
        line 23: 0
        line 24: 13
        line 26: 15
        line 27: 21
        line 28: 27
        line 29: 33
        line 30: 39
        line 31: 59
        line 32: 65
        line 33: 71
        line 35: 77
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      79     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/Pack;
            0      79     1 command   Ljava/lang/String;
            0      79     2 player   Lext/mods/gameserver/model/actor/Player;
            0      79     3 target   Ljava/lang/String;
      StackMapTable: number_of_entries = 2
        frame_type = 13 /* same */
        frame_type = 1 /* same */

  public java.lang.String[] getVoicedCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #47                 // Field VOICED_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 46: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/Pack;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #12                 // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #9                  // String pack
         8: aastore
         9: putstatic     #47                 // Field VOICED_COMMANDS:[Ljava/lang/String;
        12: return
      LineNumberTable:
        line 13: 0
}
SourceFile: "Pack.java"
BootstrapMethods:
  0: #85 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #83 Versao Laboratorio: \u0001
InnerClasses:
  public static final #96= #92 of #94;    // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
