// Bytecode for: ext.mods.gameserver.model.actor.Player$1
// File: ext\mods\gameserver\model\actor\Player$1.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/Player$1.class
  Last modified 9 de jul de 2026; size 1695 bytes
  MD5 checksum dcdf3eb040753182ff5c497e5d943891
  Compiled from "Player.java"
class ext.mods.gameserver.model.actor.Player$1 extends java.lang.Object implements ext.mods.commons.cached.CachedDataValueObject$Converter<java.util.Locale>
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #34                         // ext/mods/gameserver/model/actor/Player$1
  super_class: #8                         // java/lang/Object
  interfaces: 1, fields: 0, methods: 5, attributes: 5
Constant pool:
   #1 = Methodref          #2.#3          // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #2 = Class              #4             // java/util/Objects
   #3 = NameAndType        #5:#6          // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #4 = Utf8               java/util/Objects
   #5 = Utf8               requireNonNull
   #6 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #7 = Methodref          #8.#9          // java/lang/Object."<init>":()V
   #8 = Class              #10            // java/lang/Object
   #9 = NameAndType        #11:#12        // "<init>":()V
  #10 = Utf8               java/lang/Object
  #11 = Utf8               <init>
  #12 = Utf8               ()V
  #13 = Methodref          #14.#15        // java/util/Locale.forLanguageTag:(Ljava/lang/String;)Ljava/util/Locale;
  #14 = Class              #16            // java/util/Locale
  #15 = NameAndType        #17:#18        // forLanguageTag:(Ljava/lang/String;)Ljava/util/Locale;
  #16 = Utf8               java/util/Locale
  #17 = Utf8               forLanguageTag
  #18 = Utf8               (Ljava/lang/String;)Ljava/util/Locale;
  #19 = Methodref          #14.#20        // java/util/Locale.toString:()Ljava/lang/String;
  #20 = NameAndType        #21:#22        // toString:()Ljava/lang/String;
  #21 = Utf8               toString
  #22 = Utf8               ()Ljava/lang/String;
  #23 = String             #24            // _
  #24 = Utf8               _
  #25 = String             #26            // -
  #26 = Utf8               -
  #27 = Methodref          #28.#29        // java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #28 = Class              #30            // java/lang/String
  #29 = NameAndType        #31:#32        // replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #30 = Utf8               java/lang/String
  #31 = Utf8               replace
  #32 = Utf8               (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #33 = Methodref          #34.#35        // ext/mods/gameserver/model/actor/Player$1.toString:(Ljava/util/Locale;)Ljava/lang/String;
  #34 = Class              #36            // ext/mods/gameserver/model/actor/Player$1
  #35 = NameAndType        #21:#37        // toString:(Ljava/util/Locale;)Ljava/lang/String;
  #36 = Utf8               ext/mods/gameserver/model/actor/Player$1
  #37 = Utf8               (Ljava/util/Locale;)Ljava/lang/String;
  #38 = Methodref          #34.#39        // ext/mods/gameserver/model/actor/Player$1.fromString:(Ljava/lang/String;)Ljava/util/Locale;
  #39 = NameAndType        #40:#18        // fromString:(Ljava/lang/String;)Ljava/util/Locale;
  #40 = Utf8               fromString
  #41 = Class              #42            // ext/mods/commons/cached/CachedDataValueObject$Converter
  #42 = Utf8               ext/mods/commons/cached/CachedDataValueObject$Converter
  #43 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #44 = Utf8               Code
  #45 = Utf8               LineNumberTable
  #46 = Utf8               LocalVariableTable
  #47 = Utf8               this
  #48 = Utf8               Lext/mods/gameserver/model/actor/Player$1;
  #49 = Utf8               this$0
  #50 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #51 = Utf8               MethodParameters
  #52 = Utf8               value
  #53 = Utf8               Ljava/lang/String;
  #54 = Utf8               locale
  #55 = Utf8               Ljava/util/Locale;
  #56 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
  #57 = Utf8               (Ljava/lang/String;)Ljava/lang/Object;
  #58 = Utf8               Signature
  #59 = Utf8               Ljava/lang/Object;Lext/mods/commons/cached/CachedDataValueObject$Converter<Ljava/util/Locale;>;
  #60 = Utf8               SourceFile
  #61 = Utf8               Player.java
  #62 = Utf8               EnclosingMethod
  #63 = Class              #64            // ext/mods/gameserver/model/actor/Player
  #64 = Utf8               ext/mods/gameserver/model/actor/Player
  #65 = Utf8               NestHost
  #66 = Utf8               InnerClasses
  #67 = Class              #68            // ext/mods/commons/cached/CachedDataValueObject
  #68 = Utf8               ext/mods/commons/cached/CachedDataValueObject
  #69 = Utf8               Converter
{
  ext.mods.gameserver.model.actor.Player$1(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0000)
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: dup
         2: invokestatic  #1                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
         5: pop
         6: pop
         7: aload_0
         8: invokespecial #7                  // Method java/lang/Object."<init>":()V
        11: return
      LineNumberTable:
        line 565: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/model/actor/Player$1;
            0      12     1 this$0   Lext/mods/gameserver/model/actor/Player;
    MethodParameters:
      Name                           Flags
      <no name>                      final mandated

  public java.util.Locale fromString(java.lang.String);
    descriptor: (Ljava/lang/String;)Ljava/util/Locale;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=2, args_size=2
         0: aload_1
         1: invokestatic  #13                 // Method java/util/Locale.forLanguageTag:(Ljava/lang/String;)Ljava/util/Locale;
         4: areturn
      LineNumberTable:
        line 569: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Player$1;
            0       5     1 value   Ljava/lang/String;

  public java.lang.String toString(java.util.Locale);
    descriptor: (Ljava/util/Locale;)Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_1
         1: invokevirtual #19                 // Method java/util/Locale.toString:()Ljava/lang/String;
         4: ldc           #23                 // String _
         6: ldc           #25                 // String -
         8: invokevirtual #27                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
        11: areturn
      LineNumberTable:
        line 575: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/model/actor/Player$1;
            0      12     1 locale   Ljava/util/Locale;

  public java.lang.String toString(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Ljava/lang/String;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: checkcast     #14                 // class java/util/Locale
         5: invokevirtual #33                 // Method toString:(Ljava/util/Locale;)Ljava/lang/String;
         8: areturn
      LineNumberTable:
        line 565: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/actor/Player$1;
    MethodParameters:
      Name                           Flags
      <no name>                      synthetic

  public java.lang.Object fromString(java.lang.String);
    descriptor: (Ljava/lang/String;)Ljava/lang/Object;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #38                 // Method fromString:(Ljava/lang/String;)Ljava/util/Locale;
         5: areturn
      LineNumberTable:
        line 565: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/Player$1;
    MethodParameters:
      Name                           Flags
      <no name>                      synthetic
}
Signature: #59                          // Ljava/lang/Object;Lext/mods/commons/cached/CachedDataValueObject$Converter<Ljava/util/Locale;>;
SourceFile: "Player.java"
EnclosingMethod: #63.#0                 // ext.mods.gameserver.model.actor.Player
NestHost: class ext/mods/gameserver/model/actor/Player
InnerClasses:
  #34;                                    // class ext/mods/gameserver/model/actor/Player$1
  public static #69= #41 of #67;          // Converter=class ext/mods/commons/cached/CachedDataValueObject$Converter of class ext/mods/commons/cached/CachedDataValueObject
