// Bytecode for: ext.mods.gameserver.model.records.MacroCmd
// File: ext\mods\gameserver\model\records\MacroCmd.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/records/MacroCmd.class
  Last modified 9 de jul de 2026; size 1943 bytes
  MD5 checksum d699858da33ee67079e0f178f5cb6eb9
  Compiled from "MacroCmd.java"
public final class ext.mods.gameserver.model.records.MacroCmd extends java.lang.Record
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/records/MacroCmd
  super_class: #2                         // java/lang/Record
  interfaces: 0, fields: 5, methods: 9, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Record."<init>":()V
   #2 = Class              #4             // java/lang/Record
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Record
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/records/MacroCmd.entry:I
   #8 = Class              #10            // ext/mods/gameserver/model/records/MacroCmd
   #9 = NameAndType        #11:#12        // entry:I
  #10 = Utf8               ext/mods/gameserver/model/records/MacroCmd
  #11 = Utf8               entry
  #12 = Utf8               I
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/model/records/MacroCmd.type:I
  #14 = NameAndType        #15:#12        // type:I
  #15 = Utf8               type
  #16 = Fieldref           #8.#17         // ext/mods/gameserver/model/records/MacroCmd.d1:I
  #17 = NameAndType        #18:#12        // d1:I
  #18 = Utf8               d1
  #19 = Fieldref           #8.#20         // ext/mods/gameserver/model/records/MacroCmd.d2:I
  #20 = NameAndType        #21:#12        // d2:I
  #21 = Utf8               d2
  #22 = Fieldref           #8.#23         // ext/mods/gameserver/model/records/MacroCmd.cmd:Ljava/lang/String;
  #23 = NameAndType        #24:#25        // cmd:Ljava/lang/String;
  #24 = Utf8               cmd
  #25 = Utf8               Ljava/lang/String;
  #26 = InvokeDynamic      #0:#27         // #0:toString:(Lext/mods/gameserver/model/records/MacroCmd;)Ljava/lang/String;
  #27 = NameAndType        #28:#29        // toString:(Lext/mods/gameserver/model/records/MacroCmd;)Ljava/lang/String;
  #28 = Utf8               toString
  #29 = Utf8               (Lext/mods/gameserver/model/records/MacroCmd;)Ljava/lang/String;
  #30 = InvokeDynamic      #0:#31         // #0:hashCode:(Lext/mods/gameserver/model/records/MacroCmd;)I
  #31 = NameAndType        #32:#33        // hashCode:(Lext/mods/gameserver/model/records/MacroCmd;)I
  #32 = Utf8               hashCode
  #33 = Utf8               (Lext/mods/gameserver/model/records/MacroCmd;)I
  #34 = InvokeDynamic      #0:#35         // #0:equals:(Lext/mods/gameserver/model/records/MacroCmd;Ljava/lang/Object;)Z
  #35 = NameAndType        #36:#37        // equals:(Lext/mods/gameserver/model/records/MacroCmd;Ljava/lang/Object;)Z
  #36 = Utf8               equals
  #37 = Utf8               (Lext/mods/gameserver/model/records/MacroCmd;Ljava/lang/Object;)Z
  #38 = Utf8               (IIIILjava/lang/String;)V
  #39 = Utf8               Code
  #40 = Utf8               LineNumberTable
  #41 = Utf8               LocalVariableTable
  #42 = Utf8               this
  #43 = Utf8               Lext/mods/gameserver/model/records/MacroCmd;
  #44 = Utf8               MethodParameters
  #45 = Utf8               ()Ljava/lang/String;
  #46 = Utf8               ()I
  #47 = Utf8               (Ljava/lang/Object;)Z
  #48 = Utf8               o
  #49 = Utf8               Ljava/lang/Object;
  #50 = Utf8               SourceFile
  #51 = Utf8               MacroCmd.java
  #52 = Utf8               Record
  #53 = Utf8               BootstrapMethods
  #54 = String             #55            // entry;type;d1;d2;cmd
  #55 = Utf8               entry;type;d1;d2;cmd
  #56 = MethodHandle       1:#7           // REF_getField ext/mods/gameserver/model/records/MacroCmd.entry:I
  #57 = MethodHandle       1:#13          // REF_getField ext/mods/gameserver/model/records/MacroCmd.type:I
  #58 = MethodHandle       1:#16          // REF_getField ext/mods/gameserver/model/records/MacroCmd.d1:I
  #59 = MethodHandle       1:#19          // REF_getField ext/mods/gameserver/model/records/MacroCmd.d2:I
  #60 = MethodHandle       1:#22          // REF_getField ext/mods/gameserver/model/records/MacroCmd.cmd:Ljava/lang/String;
  #61 = MethodHandle       6:#62          // REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #62 = Methodref          #63.#64        // java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #63 = Class              #65            // java/lang/runtime/ObjectMethods
  #64 = NameAndType        #66:#67        // bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #65 = Utf8               java/lang/runtime/ObjectMethods
  #66 = Utf8               bootstrap
  #67 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #68 = Utf8               InnerClasses
  #69 = Class              #70            // java/lang/invoke/MethodHandles$Lookup
  #70 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #71 = Class              #72            // java/lang/invoke/MethodHandles
  #72 = Utf8               java/lang/invoke/MethodHandles
  #73 = Utf8               Lookup
{
  public ext.mods.gameserver.model.records.MacroCmd(int, int, int, int, java.lang.String);
    descriptor: (IIIILjava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=6, args_size=6
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Record."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #7                  // Field entry:I
         9: aload_0
        10: iload_2
        11: putfield      #13                 // Field type:I
        14: aload_0
        15: iload_3
        16: putfield      #16                 // Field d1:I
        19: aload_0
        20: iload         4
        22: putfield      #19                 // Field d2:I
        25: aload_0
        26: aload         5
        28: putfield      #22                 // Field cmd:Ljava/lang/String;
        31: return
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      32     0  this   Lext/mods/gameserver/model/records/MacroCmd;
            0      32     1 entry   I
            0      32     2  type   I
            0      32     3    d1   I
            0      32     4    d2   I
            0      32     5   cmd   Ljava/lang/String;
    MethodParameters:
      Name                           Flags
      entry
      type
      d1
      d2
      cmd

  public final java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #26,  0             // InvokeDynamic #0:toString:(Lext/mods/gameserver/model/records/MacroCmd;)Ljava/lang/String;
         6: areturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/MacroCmd;

  public final int hashCode();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #30,  0             // InvokeDynamic #0:hashCode:(Lext/mods/gameserver/model/records/MacroCmd;)I
         6: ireturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/MacroCmd;

  public final boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokedynamic #34,  0             // InvokeDynamic #0:equals:(Lext/mods/gameserver/model/records/MacroCmd;Ljava/lang/Object;)Z
         7: ireturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/records/MacroCmd;
            0       8     1     o   Ljava/lang/Object;

  public int entry();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field entry:I
         4: ireturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/MacroCmd;

  public int type();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field type:I
         4: ireturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/MacroCmd;

  public int d1();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field d1:I
         4: ireturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/MacroCmd;

  public int d2();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field d2:I
         4: ireturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/MacroCmd;

  public java.lang.String cmd();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field cmd:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/MacroCmd;
}
SourceFile: "MacroCmd.java"
  Record: length = 0x20 (unknown attribute)
   00 05 00 0B 00 0C 00 00 00 0F 00 0C 00 00 00 12
   00 0C 00 00 00 15 00 0C 00 00 00 18 00 19 00 00

BootstrapMethods:
  0: #61 REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
    Method arguments:
      #8 ext/mods/gameserver/model/records/MacroCmd
      #54 entry;type;d1;d2;cmd
      #56 REF_getField ext/mods/gameserver/model/records/MacroCmd.entry:I
      #57 REF_getField ext/mods/gameserver/model/records/MacroCmd.type:I
      #58 REF_getField ext/mods/gameserver/model/records/MacroCmd.d1:I
      #59 REF_getField ext/mods/gameserver/model/records/MacroCmd.d2:I
      #60 REF_getField ext/mods/gameserver/model/records/MacroCmd.cmd:Ljava/lang/String;
InnerClasses:
  public static final #73= #69 of #71;    // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
