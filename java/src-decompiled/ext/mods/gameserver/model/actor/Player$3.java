// Bytecode for: ext.mods.gameserver.model.actor.Player$3
// File: ext\mods\gameserver\model\actor\Player$3.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/Player$3.class
  Last modified 9 de jul de 2026; size 994 bytes
  MD5 checksum d35f77ad57270b22ff38339106877118
  Compiled from "Player.java"
class ext.mods.gameserver.model.actor.Player$3 implements java.lang.Runnable
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/Player$3
  super_class: #14                        // java/lang/Object
  interfaces: 1, fields: 1, methods: 2, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #2 = Class              #4             // java/util/Objects
   #3 = NameAndType        #5:#6          // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #4 = Utf8               java/util/Objects
   #5 = Utf8               requireNonNull
   #6 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/actor/Player$3.this$0:Lext/mods/gameserver/model/actor/Player;
   #8 = Class              #10            // ext/mods/gameserver/model/actor/Player$3
   #9 = NameAndType        #11:#12        // this$0:Lext/mods/gameserver/model/actor/Player;
  #10 = Utf8               ext/mods/gameserver/model/actor/Player$3
  #11 = Utf8               this$0
  #12 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #13 = Methodref          #14.#15        // java/lang/Object."<init>":()V
  #14 = Class              #16            // java/lang/Object
  #15 = NameAndType        #17:#18        // "<init>":()V
  #16 = Utf8               java/lang/Object
  #17 = Utf8               <init>
  #18 = Utf8               ()V
  #19 = Methodref          #20.#21        // ext/mods/gameserver/model/actor/Player.isOnline:()Z
  #20 = Class              #22            // ext/mods/gameserver/model/actor/Player
  #21 = NameAndType        #23:#24        // isOnline:()Z
  #22 = Utf8               ext/mods/gameserver/model/actor/Player
  #23 = Utf8               isOnline
  #24 = Utf8               ()Z
  #25 = Methodref          #20.#26        // ext/mods/gameserver/model/actor/Player.isGM:()Z
  #26 = NameAndType        #27:#24        // isGM:()Z
  #27 = Utf8               isGM
  #28 = Methodref          #20.#29        // ext/mods/gameserver/model/actor/Player.isDeeplApiKeyActive:()Z
  #29 = NameAndType        #30:#24        // isDeeplApiKeyActive:()Z
  #30 = Utf8               isDeeplApiKeyActive
  #31 = Methodref          #20.#32        // ext/mods/gameserver/model/actor/Player.showDeeplLanguageMenu:()V
  #32 = NameAndType        #33:#18        // showDeeplLanguageMenu:()V
  #33 = Utf8               showDeeplLanguageMenu
  #34 = Class              #35            // java/lang/Runnable
  #35 = Utf8               java/lang/Runnable
  #36 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #37 = Utf8               Code
  #38 = Utf8               LineNumberTable
  #39 = Utf8               LocalVariableTable
  #40 = Utf8               this
  #41 = Utf8               Lext/mods/gameserver/model/actor/Player$3;
  #42 = Utf8               MethodParameters
  #43 = Utf8               run
  #44 = Utf8               StackMapTable
  #45 = Utf8               SourceFile
  #46 = Utf8               Player.java
  #47 = Utf8               EnclosingMethod
  #48 = NameAndType        #49:#18        // showLanguageMenuOnLogin:()V
  #49 = Utf8               showLanguageMenuOnLogin
  #50 = Utf8               NestHost
  #51 = Utf8               InnerClasses
{
  final ext.mods.gameserver.model.actor.Player this$0;
    descriptor: Lext/mods/gameserver/model/actor/Player;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  ext.mods.gameserver.model.actor.Player$3(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0000)
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: dup
         3: invokestatic  #1                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
         6: pop
         7: putfield      #7                  // Field this$0:Lext/mods/gameserver/model/actor/Player;
        10: aload_0
        11: invokespecial #13                 // Method java/lang/Object."<init>":()V
        14: return
      LineNumberTable:
        line 8758: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/model/actor/Player$3;
            0      15     1 this$0   Lext/mods/gameserver/model/actor/Player;
    MethodParameters:
      Name                           Flags
      <no name>                      final mandated

  public void run();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/actor/Player;
         4: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
         7: ifeq          37
        10: aload_0
        11: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/actor/Player;
        14: invokevirtual #25                 // Method ext/mods/gameserver/model/actor/Player.isGM:()Z
        17: ifne          37
        20: aload_0
        21: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/actor/Player;
        24: invokevirtual #28                 // Method ext/mods/gameserver/model/actor/Player.isDeeplApiKeyActive:()Z
        27: ifeq          37
        30: aload_0
        31: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/actor/Player;
        34: invokevirtual #31                 // Method ext/mods/gameserver/model/actor/Player.showDeeplLanguageMenu:()V
        37: return
      LineNumberTable:
        line 8762: 0
        line 8764: 20
        line 8765: 30
        line 8769: 37
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      38     0  this   Lext/mods/gameserver/model/actor/Player$3;
      StackMapTable: number_of_entries = 1
        frame_type = 37 /* same */
}
SourceFile: "Player.java"
EnclosingMethod: #20.#48                // ext.mods.gameserver.model.actor.Player.showLanguageMenuOnLogin
NestHost: class ext/mods/gameserver/model/actor/Player
InnerClasses:
  #8;                                     // class ext/mods/gameserver/model/actor/Player$3
