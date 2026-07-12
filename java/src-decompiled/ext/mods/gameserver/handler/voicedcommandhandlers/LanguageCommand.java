// Bytecode for: ext.mods.gameserver.handler.voicedcommandhandlers.LanguageCommand
// File: ext\mods\gameserver\handler\voicedcommandhandlers\LanguageCommand.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/voicedcommandhandlers/LanguageCommand.class
  Last modified 9 de jul de 2026; size 2281 bytes
  MD5 checksum 8a1b4df2884fb9f033223b5b99a3963f
  Compiled from "LanguageCommand.java"
public class ext.mods.gameserver.handler.voicedcommandhandlers.LanguageCommand implements ext.mods.gameserver.handler.IVoicedCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #55                         // ext/mods/gameserver/handler/voicedcommandhandlers/LanguageCommand
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = String             #8             // translation
   #8 = Utf8               translation
   #9 = Methodref          #10.#11        // java/lang/String.equals:(Ljava/lang/Object;)Z
  #10 = Class              #12            // java/lang/String
  #11 = NameAndType        #13:#14        // equals:(Ljava/lang/Object;)Z
  #12 = Utf8               java/lang/String
  #13 = Utf8               equals
  #14 = Utf8               (Ljava/lang/Object;)Z
  #15 = String             #16            // trans
  #16 = Utf8               trans
  #17 = Methodref          #18.#19        // ext/mods/Crypta/DeeplTranslator.getInstance:()Lext/mods/Crypta/DeeplTranslator;
  #18 = Class              #20            // ext/mods/Crypta/DeeplTranslator
  #19 = NameAndType        #21:#22        // getInstance:()Lext/mods/Crypta/DeeplTranslator;
  #20 = Utf8               ext/mods/Crypta/DeeplTranslator
  #21 = Utf8               getInstance
  #22 = Utf8               ()Lext/mods/Crypta/DeeplTranslator;
  #23 = Methodref          #18.#24        // ext/mods/Crypta/DeeplTranslator.showLanguageMenu:(Lext/mods/gameserver/model/actor/Player;)V
  #24 = NameAndType        #25:#26        // showLanguageMenu:(Lext/mods/gameserver/model/actor/Player;)V
  #25 = Utf8               showLanguageMenu
  #26 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #27 = String             #28            // Sistema de tradução não disponível no momento.
  #28 = Utf8               Sistema de tradução não disponível no momento.
  #29 = Methodref          #30.#31        // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
  #30 = Class              #32            // ext/mods/gameserver/model/actor/Player
  #31 = NameAndType        #33:#34        // sendMessage:(Ljava/lang/String;)V
  #32 = Utf8               ext/mods/gameserver/model/actor/Player
  #33 = Utf8               sendMessage
  #34 = Utf8               (Ljava/lang/String;)V
  #35 = String             #36            // toggletrans
  #36 = Utf8               toggletrans
  #37 = String             #38            // toggletranslation
  #38 = Utf8               toggletranslation
  #39 = Methodref          #30.#40        // ext/mods/gameserver/model/actor/Player.switchTranslatePreference:()V
  #40 = NameAndType        #41:#6         // switchTranslatePreference:()V
  #41 = Utf8               switchTranslatePreference
  #42 = Methodref          #30.#43        // ext/mods/gameserver/model/actor/Player.isHtmlTranslationEnabled:()Z
  #43 = NameAndType        #44:#45        // isHtmlTranslationEnabled:()Z
  #44 = Utf8               isHtmlTranslationEnabled
  #45 = Utf8               ()Z
  #46 = String             #47            // habilitada
  #47 = Utf8               habilitada
  #48 = String             #49            // desabilitada
  #49 = Utf8               desabilitada
  #50 = InvokeDynamic      #0:#51         // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #51 = NameAndType        #52:#53        // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #52 = Utf8               makeConcatWithConstants
  #53 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #54 = Fieldref           #55.#56        // ext/mods/gameserver/handler/voicedcommandhandlers/LanguageCommand.COMMANDS:[Ljava/lang/String;
  #55 = Class              #57            // ext/mods/gameserver/handler/voicedcommandhandlers/LanguageCommand
  #56 = NameAndType        #58:#59        // COMMANDS:[Ljava/lang/String;
  #57 = Utf8               ext/mods/gameserver/handler/voicedcommandhandlers/LanguageCommand
  #58 = Utf8               COMMANDS
  #59 = Utf8               [Ljava/lang/String;
  #60 = Class              #61            // ext/mods/gameserver/handler/IVoicedCommandHandler
  #61 = Utf8               ext/mods/gameserver/handler/IVoicedCommandHandler
  #62 = Utf8               Code
  #63 = Utf8               LineNumberTable
  #64 = Utf8               LocalVariableTable
  #65 = Utf8               this
  #66 = Utf8               Lext/mods/gameserver/handler/voicedcommandhandlers/LanguageCommand;
  #67 = Utf8               useVoicedCommand
  #68 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
  #69 = Utf8               deeplTranslator
  #70 = Utf8               Ljava/lang/Object;
  #71 = Utf8               enabled
  #72 = Utf8               Z
  #73 = Utf8               command
  #74 = Utf8               Ljava/lang/String;
  #75 = Utf8               player
  #76 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #77 = Utf8               target
  #78 = Utf8               StackMapTable
  #79 = Utf8               getVoicedCommandList
  #80 = Utf8               ()[Ljava/lang/String;
  #81 = Utf8               <clinit>
  #82 = Utf8               SourceFile
  #83 = Utf8               LanguageCommand.java
  #84 = Utf8               BootstrapMethods
  #85 = String             #86            // Tradução HTML \u0001.
  #86 = Utf8               Tradução HTML \u0001.
  #87 = MethodHandle       6:#88          // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #88 = Methodref          #89.#90        // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #89 = Class              #91            // java/lang/invoke/StringConcatFactory
  #90 = NameAndType        #52:#92        // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #91 = Utf8               java/lang/invoke/StringConcatFactory
  #92 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #93 = Utf8               InnerClasses
  #94 = Class              #95            // java/lang/invoke/MethodHandles$Lookup
  #95 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #96 = Class              #97            // java/lang/invoke/MethodHandles
  #97 = Utf8               java/lang/invoke/MethodHandles
  #98 = Utf8               Lookup
{
  public ext.mods.gameserver.handler.voicedcommandhandlers.LanguageCommand();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 27: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/LanguageCommand;

  public boolean useVoicedCommand(java.lang.String, ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=4
         0: aload_1
         1: ldc           #7                  // String translation
         3: invokevirtual #9                  // Method java/lang/String.equals:(Ljava/lang/Object;)Z
         6: ifne          18
         9: aload_1
        10: ldc           #15                 // String trans
        12: invokevirtual #9                  // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        15: ifeq          45
        18: invokestatic  #17                 // Method ext/mods/Crypta/DeeplTranslator.getInstance:()Lext/mods/Crypta/DeeplTranslator;
        21: astore        4
        23: aload         4
        25: ifnull        37
        28: invokestatic  #17                 // Method ext/mods/Crypta/DeeplTranslator.getInstance:()Lext/mods/Crypta/DeeplTranslator;
        31: aload_2
        32: invokevirtual #23                 // Method ext/mods/Crypta/DeeplTranslator.showLanguageMenu:(Lext/mods/gameserver/model/actor/Player;)V
        35: iconst_1
        36: ireturn
        37: aload_2
        38: ldc           #27                 // String Sistema de tradução não disponível no momento.
        40: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        43: iconst_0
        44: ireturn
        45: aload_1
        46: ldc           #35                 // String toggletrans
        48: invokevirtual #9                  // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        51: ifne          63
        54: aload_1
        55: ldc           #37                 // String toggletranslation
        57: invokevirtual #9                  // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        60: ifeq          96
        63: aload_2
        64: invokevirtual #39                 // Method ext/mods/gameserver/model/actor/Player.switchTranslatePreference:()V
        67: aload_2
        68: invokevirtual #42                 // Method ext/mods/gameserver/model/actor/Player.isHtmlTranslationEnabled:()Z
        71: istore        4
        73: aload_2
        74: iload         4
        76: ifeq          84
        79: ldc           #46                 // String habilitada
        81: goto          86
        84: ldc           #48                 // String desabilitada
        86: invokedynamic #50,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        91: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        94: iconst_1
        95: ireturn
        96: iconst_0
        97: ireturn
      LineNumberTable:
        line 34: 0
        line 36: 18
        line 37: 23
        line 39: 28
        line 40: 35
        line 44: 37
        line 45: 43
        line 48: 45
        line 50: 63
        line 51: 67
        line 52: 73
        line 53: 94
        line 55: 96
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           23      22     4 deeplTranslator   Ljava/lang/Object;
           73      23     4 enabled   Z
            0      98     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/LanguageCommand;
            0      98     1 command   Ljava/lang/String;
            0      98     2 player   Lext/mods/gameserver/model/actor/Player;
            0      98     3 target   Ljava/lang/String;
      StackMapTable: number_of_entries = 7
        frame_type = 18 /* same */
        frame_type = 252 /* append */
          offset_delta = 18
          locals = [ class java/lang/Object ]
        frame_type = 250 /* chop */
          offset_delta = 7
        frame_type = 17 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/handler/voicedcommandhandlers/LanguageCommand, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String, int ]
          stack = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/handler/voicedcommandhandlers/LanguageCommand, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String, int ]
          stack = [ class ext/mods/gameserver/model/actor/Player, class java/lang/String ]
        frame_type = 250 /* chop */
          offset_delta = 9

  public java.lang.String[] getVoicedCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #54                 // Field COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 61: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/LanguageCommand;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_4
         1: anewarray     #10                 // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #7                  // String translation
         8: aastore
         9: dup
        10: iconst_1
        11: ldc           #15                 // String trans
        13: aastore
        14: dup
        15: iconst_2
        16: ldc           #35                 // String toggletrans
        18: aastore
        19: dup
        20: iconst_3
        21: ldc           #37                 // String toggletranslation
        23: aastore
        24: putstatic     #54                 // Field COMMANDS:[Ljava/lang/String;
        27: return
      LineNumberTable:
        line 29: 0
}
SourceFile: "LanguageCommand.java"
BootstrapMethods:
  0: #87 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #85 Tradução HTML \u0001.
InnerClasses:
  public static final #98= #94 of #96;    // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
