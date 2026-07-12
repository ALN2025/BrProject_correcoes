// Bytecode for: ext.mods.commons.gui.ConfigGS$ModFileConfig
// File: ext\mods\commons\gui\ConfigGS$ModFileConfig.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/gui/ConfigGS$ModFileConfig.class
  Last modified 9 de jul de 2026; size 1866 bytes
  MD5 checksum 6a7c86e1ae1cc08cc308a9f9fbd9efb0
  Compiled from "ConfigGS.java"
final class ext.mods.commons.gui.ConfigGS$ModFileConfig extends java.lang.Record
  minor version: 0
  major version: 69
  flags: (0x0030) ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/commons/gui/ConfigGS$ModFileConfig
  super_class: #2                         // java/lang/Record
  interfaces: 0, fields: 3, methods: 7, attributes: 5
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Record."<init>":()V
   #2 = Class              #4             // java/lang/Record
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Record
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/commons/gui/ConfigGS$ModFileConfig.label:Ljava/lang/String;
   #8 = Class              #10            // ext/mods/commons/gui/ConfigGS$ModFileConfig
   #9 = NameAndType        #11:#12        // label:Ljava/lang/String;
  #10 = Utf8               ext/mods/commons/gui/ConfigGS$ModFileConfig
  #11 = Utf8               label
  #12 = Utf8               Ljava/lang/String;
  #13 = Fieldref           #8.#14         // ext/mods/commons/gui/ConfigGS$ModFileConfig.path:Ljava/nio/file/Path;
  #14 = NameAndType        #15:#16        // path:Ljava/nio/file/Path;
  #15 = Utf8               path
  #16 = Utf8               Ljava/nio/file/Path;
  #17 = Fieldref           #8.#18         // ext/mods/commons/gui/ConfigGS$ModFileConfig.key:Ljava/lang/String;
  #18 = NameAndType        #19:#12        // key:Ljava/lang/String;
  #19 = Utf8               key
  #20 = InvokeDynamic      #0:#21         // #0:toString:(Lext/mods/commons/gui/ConfigGS$ModFileConfig;)Ljava/lang/String;
  #21 = NameAndType        #22:#23        // toString:(Lext/mods/commons/gui/ConfigGS$ModFileConfig;)Ljava/lang/String;
  #22 = Utf8               toString
  #23 = Utf8               (Lext/mods/commons/gui/ConfigGS$ModFileConfig;)Ljava/lang/String;
  #24 = InvokeDynamic      #0:#25         // #0:hashCode:(Lext/mods/commons/gui/ConfigGS$ModFileConfig;)I
  #25 = NameAndType        #26:#27        // hashCode:(Lext/mods/commons/gui/ConfigGS$ModFileConfig;)I
  #26 = Utf8               hashCode
  #27 = Utf8               (Lext/mods/commons/gui/ConfigGS$ModFileConfig;)I
  #28 = InvokeDynamic      #0:#29         // #0:equals:(Lext/mods/commons/gui/ConfigGS$ModFileConfig;Ljava/lang/Object;)Z
  #29 = NameAndType        #30:#31        // equals:(Lext/mods/commons/gui/ConfigGS$ModFileConfig;Ljava/lang/Object;)Z
  #30 = Utf8               equals
  #31 = Utf8               (Lext/mods/commons/gui/ConfigGS$ModFileConfig;Ljava/lang/Object;)Z
  #32 = Utf8               (Ljava/lang/String;Ljava/nio/file/Path;Ljava/lang/String;)V
  #33 = Utf8               Code
  #34 = Utf8               LineNumberTable
  #35 = Utf8               LocalVariableTable
  #36 = Utf8               this
  #37 = Utf8               Lext/mods/commons/gui/ConfigGS$ModFileConfig;
  #38 = Utf8               MethodParameters
  #39 = Utf8               ()Ljava/lang/String;
  #40 = Utf8               ()I
  #41 = Utf8               (Ljava/lang/Object;)Z
  #42 = Utf8               o
  #43 = Utf8               Ljava/lang/Object;
  #44 = Utf8               ()Ljava/nio/file/Path;
  #45 = Utf8               SourceFile
  #46 = Utf8               ConfigGS.java
  #47 = Utf8               NestHost
  #48 = Class              #49            // ext/mods/commons/gui/ConfigGS
  #49 = Utf8               ext/mods/commons/gui/ConfigGS
  #50 = Utf8               Record
  #51 = Utf8               BootstrapMethods
  #52 = String             #53            // label;path;key
  #53 = Utf8               label;path;key
  #54 = MethodHandle       1:#7           // REF_getField ext/mods/commons/gui/ConfigGS$ModFileConfig.label:Ljava/lang/String;
  #55 = MethodHandle       1:#13          // REF_getField ext/mods/commons/gui/ConfigGS$ModFileConfig.path:Ljava/nio/file/Path;
  #56 = MethodHandle       1:#17          // REF_getField ext/mods/commons/gui/ConfigGS$ModFileConfig.key:Ljava/lang/String;
  #57 = MethodHandle       6:#58          // REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #58 = Methodref          #59.#60        // java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #59 = Class              #61            // java/lang/runtime/ObjectMethods
  #60 = NameAndType        #62:#63        // bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #61 = Utf8               java/lang/runtime/ObjectMethods
  #62 = Utf8               bootstrap
  #63 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #64 = Utf8               InnerClasses
  #65 = Utf8               ModFileConfig
  #66 = Class              #67            // java/lang/invoke/MethodHandles$Lookup
  #67 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #68 = Class              #69            // java/lang/invoke/MethodHandles
  #69 = Utf8               java/lang/invoke/MethodHandles
  #70 = Utf8               Lookup
{
  public final java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #20,  0             // InvokeDynamic #0:toString:(Lext/mods/commons/gui/ConfigGS$ModFileConfig;)Ljava/lang/String;
         6: areturn
      LineNumberTable:
        line 82: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/commons/gui/ConfigGS$ModFileConfig;

  public final int hashCode();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #24,  0             // InvokeDynamic #0:hashCode:(Lext/mods/commons/gui/ConfigGS$ModFileConfig;)I
         6: ireturn
      LineNumberTable:
        line 82: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/commons/gui/ConfigGS$ModFileConfig;

  public final boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokedynamic #28,  0             // InvokeDynamic #0:equals:(Lext/mods/commons/gui/ConfigGS$ModFileConfig;Ljava/lang/Object;)Z
         7: ireturn
      LineNumberTable:
        line 82: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/commons/gui/ConfigGS$ModFileConfig;
            0       8     1     o   Ljava/lang/Object;

  public java.lang.String label();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field label:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 82: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/gui/ConfigGS$ModFileConfig;

  public java.nio.file.Path path();
    descriptor: ()Ljava/nio/file/Path;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field path:Ljava/nio/file/Path;
         4: areturn
      LineNumberTable:
        line 82: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/gui/ConfigGS$ModFileConfig;

  public java.lang.String key();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field key:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 82: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/gui/ConfigGS$ModFileConfig;
}
SourceFile: "ConfigGS.java"
NestHost: class ext/mods/commons/gui/ConfigGS
  Record: length = 0x14 (unknown attribute)
   00 03 00 0B 00 0C 00 00 00 0F 00 10 00 00 00 13
   00 0C 00 00
BootstrapMethods:
  0: #57 REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
    Method arguments:
      #8 ext/mods/commons/gui/ConfigGS$ModFileConfig
      #52 label;path;key
      #54 REF_getField ext/mods/commons/gui/ConfigGS$ModFileConfig.label:Ljava/lang/String;
      #55 REF_getField ext/mods/commons/gui/ConfigGS$ModFileConfig.path:Ljava/nio/file/Path;
      #56 REF_getField ext/mods/commons/gui/ConfigGS$ModFileConfig.key:Ljava/lang/String;
InnerClasses:
  public static final #70= #66 of #68;    // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
