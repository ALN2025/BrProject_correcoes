// Bytecode for: ext.mods.commons.gui.ConfigDiversosFrame$ConfigField
// File: ext\mods\commons\gui\ConfigDiversosFrame$ConfigField.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/gui/ConfigDiversosFrame$ConfigField.class
  Last modified 9 de jul de 2026; size 2196 bytes
  MD5 checksum d38566d58768aca710ec6d75ab343d67
  Compiled from "ConfigDiversosFrame.java"
final class ext.mods.commons.gui.ConfigDiversosFrame$ConfigField extends java.lang.Record
  minor version: 0
  major version: 69
  flags: (0x0030) ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/commons/gui/ConfigDiversosFrame$ConfigField
  super_class: #2                         // java/lang/Record
  interfaces: 0, fields: 5, methods: 9, attributes: 5
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Record."<init>":()V
   #2 = Class              #4             // java/lang/Record
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Record
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/commons/gui/ConfigDiversosFrame$ConfigField.label:Ljava/lang/String;
   #8 = Class              #10            // ext/mods/commons/gui/ConfigDiversosFrame$ConfigField
   #9 = NameAndType        #11:#12        // label:Ljava/lang/String;
  #10 = Utf8               ext/mods/commons/gui/ConfigDiversosFrame$ConfigField
  #11 = Utf8               label
  #12 = Utf8               Ljava/lang/String;
  #13 = Fieldref           #8.#14         // ext/mods/commons/gui/ConfigDiversosFrame$ConfigField.key:Ljava/lang/String;
  #14 = NameAndType        #15:#12        // key:Ljava/lang/String;
  #15 = Utf8               key
  #16 = Fieldref           #8.#17         // ext/mods/commons/gui/ConfigDiversosFrame$ConfigField.defaultValue:Ljava/lang/String;
  #17 = NameAndType        #18:#12        // defaultValue:Ljava/lang/String;
  #18 = Utf8               defaultValue
  #19 = Fieldref           #8.#20         // ext/mods/commons/gui/ConfigDiversosFrame$ConfigField.isBoolean:Z
  #20 = NameAndType        #21:#22        // isBoolean:Z
  #21 = Utf8               isBoolean
  #22 = Utf8               Z
  #23 = Fieldref           #8.#24         // ext/mods/commons/gui/ConfigDiversosFrame$ConfigField.description:Ljava/lang/String;
  #24 = NameAndType        #25:#12        // description:Ljava/lang/String;
  #25 = Utf8               description
  #26 = InvokeDynamic      #0:#27         // #0:toString:(Lext/mods/commons/gui/ConfigDiversosFrame$ConfigField;)Ljava/lang/String;
  #27 = NameAndType        #28:#29        // toString:(Lext/mods/commons/gui/ConfigDiversosFrame$ConfigField;)Ljava/lang/String;
  #28 = Utf8               toString
  #29 = Utf8               (Lext/mods/commons/gui/ConfigDiversosFrame$ConfigField;)Ljava/lang/String;
  #30 = InvokeDynamic      #0:#31         // #0:hashCode:(Lext/mods/commons/gui/ConfigDiversosFrame$ConfigField;)I
  #31 = NameAndType        #32:#33        // hashCode:(Lext/mods/commons/gui/ConfigDiversosFrame$ConfigField;)I
  #32 = Utf8               hashCode
  #33 = Utf8               (Lext/mods/commons/gui/ConfigDiversosFrame$ConfigField;)I
  #34 = InvokeDynamic      #0:#35         // #0:equals:(Lext/mods/commons/gui/ConfigDiversosFrame$ConfigField;Ljava/lang/Object;)Z
  #35 = NameAndType        #36:#37        // equals:(Lext/mods/commons/gui/ConfigDiversosFrame$ConfigField;Ljava/lang/Object;)Z
  #36 = Utf8               equals
  #37 = Utf8               (Lext/mods/commons/gui/ConfigDiversosFrame$ConfigField;Ljava/lang/Object;)Z
  #38 = Utf8               (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V
  #39 = Utf8               Code
  #40 = Utf8               LineNumberTable
  #41 = Utf8               LocalVariableTable
  #42 = Utf8               this
  #43 = Utf8               Lext/mods/commons/gui/ConfigDiversosFrame$ConfigField;
  #44 = Utf8               MethodParameters
  #45 = Utf8               ()Ljava/lang/String;
  #46 = Utf8               ()I
  #47 = Utf8               (Ljava/lang/Object;)Z
  #48 = Utf8               o
  #49 = Utf8               Ljava/lang/Object;
  #50 = Utf8               ()Z
  #51 = Utf8               SourceFile
  #52 = Utf8               ConfigDiversosFrame.java
  #53 = Utf8               NestHost
  #54 = Class              #55            // ext/mods/commons/gui/ConfigDiversosFrame
  #55 = Utf8               ext/mods/commons/gui/ConfigDiversosFrame
  #56 = Utf8               Record
  #57 = Utf8               BootstrapMethods
  #58 = String             #59            // label;key;defaultValue;isBoolean;description
  #59 = Utf8               label;key;defaultValue;isBoolean;description
  #60 = MethodHandle       1:#7           // REF_getField ext/mods/commons/gui/ConfigDiversosFrame$ConfigField.label:Ljava/lang/String;
  #61 = MethodHandle       1:#13          // REF_getField ext/mods/commons/gui/ConfigDiversosFrame$ConfigField.key:Ljava/lang/String;
  #62 = MethodHandle       1:#16          // REF_getField ext/mods/commons/gui/ConfigDiversosFrame$ConfigField.defaultValue:Ljava/lang/String;
  #63 = MethodHandle       1:#19          // REF_getField ext/mods/commons/gui/ConfigDiversosFrame$ConfigField.isBoolean:Z
  #64 = MethodHandle       1:#23          // REF_getField ext/mods/commons/gui/ConfigDiversosFrame$ConfigField.description:Ljava/lang/String;
  #65 = MethodHandle       6:#66          // REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #66 = Methodref          #67.#68        // java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #67 = Class              #69            // java/lang/runtime/ObjectMethods
  #68 = NameAndType        #70:#71        // bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #69 = Utf8               java/lang/runtime/ObjectMethods
  #70 = Utf8               bootstrap
  #71 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #72 = Utf8               InnerClasses
  #73 = Utf8               ConfigField
  #74 = Class              #75            // java/lang/invoke/MethodHandles$Lookup
  #75 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #76 = Class              #77            // java/lang/invoke/MethodHandles
  #77 = Utf8               java/lang/invoke/MethodHandles
  #78 = Utf8               Lookup
{
  public final java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #26,  0             // InvokeDynamic #0:toString:(Lext/mods/commons/gui/ConfigDiversosFrame$ConfigField;)Ljava/lang/String;
         6: areturn
      LineNumberTable:
        line 65: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/commons/gui/ConfigDiversosFrame$ConfigField;

  public final int hashCode();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #30,  0             // InvokeDynamic #0:hashCode:(Lext/mods/commons/gui/ConfigDiversosFrame$ConfigField;)I
         6: ireturn
      LineNumberTable:
        line 65: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/commons/gui/ConfigDiversosFrame$ConfigField;

  public final boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokedynamic #34,  0             // InvokeDynamic #0:equals:(Lext/mods/commons/gui/ConfigDiversosFrame$ConfigField;Ljava/lang/Object;)Z
         7: ireturn
      LineNumberTable:
        line 65: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/commons/gui/ConfigDiversosFrame$ConfigField;
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
        line 65: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/gui/ConfigDiversosFrame$ConfigField;

  public java.lang.String key();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field key:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 65: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/gui/ConfigDiversosFrame$ConfigField;

  public java.lang.String defaultValue();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field defaultValue:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 65: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/gui/ConfigDiversosFrame$ConfigField;

  public boolean isBoolean();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field isBoolean:Z
         4: ireturn
      LineNumberTable:
        line 65: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/gui/ConfigDiversosFrame$ConfigField;

  public java.lang.String description();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field description:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 65: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/gui/ConfigDiversosFrame$ConfigField;
}
SourceFile: "ConfigDiversosFrame.java"
NestHost: class ext/mods/commons/gui/ConfigDiversosFrame
  Record: length = 0x20 (unknown attribute)
   00 05 00 0B 00 0C 00 00 00 0F 00 0C 00 00 00 12
   00 0C 00 00 00 15 00 16 00 00 00 19 00 0C 00 00

BootstrapMethods:
  0: #65 REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
    Method arguments:
      #8 ext/mods/commons/gui/ConfigDiversosFrame$ConfigField
      #58 label;key;defaultValue;isBoolean;description
      #60 REF_getField ext/mods/commons/gui/ConfigDiversosFrame$ConfigField.label:Ljava/lang/String;
      #61 REF_getField ext/mods/commons/gui/ConfigDiversosFrame$ConfigField.key:Ljava/lang/String;
      #62 REF_getField ext/mods/commons/gui/ConfigDiversosFrame$ConfigField.defaultValue:Ljava/lang/String;
      #63 REF_getField ext/mods/commons/gui/ConfigDiversosFrame$ConfigField.isBoolean:Z
      #64 REF_getField ext/mods/commons/gui/ConfigDiversosFrame$ConfigField.description:Ljava/lang/String;
InnerClasses:
  public static final #78= #74 of #76;    // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
