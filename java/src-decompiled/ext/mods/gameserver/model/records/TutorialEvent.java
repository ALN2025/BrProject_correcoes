// Bytecode for: ext.mods.gameserver.model.records.TutorialEvent
// File: ext\mods\gameserver\model\records\TutorialEvent.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/records/TutorialEvent.class
  Last modified 9 de jul de 2026; size 2858 bytes
  MD5 checksum bba0b8369a82687c0e0045b37aa99da9
  Compiled from "TutorialEvent.java"
public final class ext.mods.gameserver.model.records.TutorialEvent extends java.lang.Record
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/records/TutorialEvent
  super_class: #2                         // java/lang/Record
  interfaces: 0, fields: 9, methods: 13, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Record."<init>":()V
   #2 = Class              #4             // java/lang/Record
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Record
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/records/TutorialEvent.initialVoice:Ljava/lang/String;
   #8 = Class              #10            // ext/mods/gameserver/model/records/TutorialEvent
   #9 = NameAndType        #11:#12        // initialVoice:Ljava/lang/String;
  #10 = Utf8               ext/mods/gameserver/model/records/TutorialEvent
  #11 = Utf8               initialVoice
  #12 = Utf8               Ljava/lang/String;
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/model/records/TutorialEvent.initialHtm:Ljava/lang/String;
  #14 = NameAndType        #15:#12        // initialHtm:Ljava/lang/String;
  #15 = Utf8               initialHtm
  #16 = Fieldref           #8.#17         // ext/mods/gameserver/model/records/TutorialEvent.ce8Htm:Ljava/lang/String;
  #17 = NameAndType        #18:#12        // ce8Htm:Ljava/lang/String;
  #18 = Utf8               ce8Htm
  #19 = Fieldref           #8.#20         // ext/mods/gameserver/model/records/TutorialEvent.ce8Loc:Lext/mods/gameserver/model/location/Location;
  #20 = NameAndType        #21:#22        // ce8Loc:Lext/mods/gameserver/model/location/Location;
  #21 = Utf8               ce8Loc
  #22 = Utf8               Lext/mods/gameserver/model/location/Location;
  #23 = Fieldref           #8.#24         // ext/mods/gameserver/model/records/TutorialEvent.qmc9Htm:Ljava/lang/String;
  #24 = NameAndType        #25:#12        // qmc9Htm:Ljava/lang/String;
  #25 = Utf8               qmc9Htm
  #26 = Fieldref           #8.#27         // ext/mods/gameserver/model/records/TutorialEvent.qmc9Loc:Lext/mods/gameserver/model/location/Location;
  #27 = NameAndType        #28:#22        // qmc9Loc:Lext/mods/gameserver/model/location/Location;
  #28 = Utf8               qmc9Loc
  #29 = Fieldref           #8.#30         // ext/mods/gameserver/model/records/TutorialEvent.qmc24Htm:Ljava/lang/String;
  #30 = NameAndType        #31:#12        // qmc24Htm:Ljava/lang/String;
  #31 = Utf8               qmc24Htm
  #32 = Fieldref           #8.#33         // ext/mods/gameserver/model/records/TutorialEvent.qmc35Htm:Ljava/lang/String;
  #33 = NameAndType        #34:#12        // qmc35Htm:Ljava/lang/String;
  #34 = Utf8               qmc35Htm
  #35 = Fieldref           #8.#36         // ext/mods/gameserver/model/records/TutorialEvent.ce47Loc:Lext/mods/gameserver/model/location/Location;
  #36 = NameAndType        #37:#22        // ce47Loc:Lext/mods/gameserver/model/location/Location;
  #37 = Utf8               ce47Loc
  #38 = InvokeDynamic      #0:#39         // #0:toString:(Lext/mods/gameserver/model/records/TutorialEvent;)Ljava/lang/String;
  #39 = NameAndType        #40:#41        // toString:(Lext/mods/gameserver/model/records/TutorialEvent;)Ljava/lang/String;
  #40 = Utf8               toString
  #41 = Utf8               (Lext/mods/gameserver/model/records/TutorialEvent;)Ljava/lang/String;
  #42 = InvokeDynamic      #0:#43         // #0:hashCode:(Lext/mods/gameserver/model/records/TutorialEvent;)I
  #43 = NameAndType        #44:#45        // hashCode:(Lext/mods/gameserver/model/records/TutorialEvent;)I
  #44 = Utf8               hashCode
  #45 = Utf8               (Lext/mods/gameserver/model/records/TutorialEvent;)I
  #46 = InvokeDynamic      #0:#47         // #0:equals:(Lext/mods/gameserver/model/records/TutorialEvent;Ljava/lang/Object;)Z
  #47 = NameAndType        #48:#49        // equals:(Lext/mods/gameserver/model/records/TutorialEvent;Ljava/lang/Object;)Z
  #48 = Utf8               equals
  #49 = Utf8               (Lext/mods/gameserver/model/records/TutorialEvent;Ljava/lang/Object;)Z
  #50 = Utf8               (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/location/Location;Ljava/lang/String;Lext/mods/gameserver/model/location/Location;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/location/Location;)V
  #51 = Utf8               Code
  #52 = Utf8               LineNumberTable
  #53 = Utf8               LocalVariableTable
  #54 = Utf8               this
  #55 = Utf8               Lext/mods/gameserver/model/records/TutorialEvent;
  #56 = Utf8               MethodParameters
  #57 = Utf8               ()Ljava/lang/String;
  #58 = Utf8               ()I
  #59 = Utf8               (Ljava/lang/Object;)Z
  #60 = Utf8               o
  #61 = Utf8               Ljava/lang/Object;
  #62 = Utf8               ()Lext/mods/gameserver/model/location/Location;
  #63 = Utf8               SourceFile
  #64 = Utf8               TutorialEvent.java
  #65 = Utf8               Record
  #66 = Utf8               BootstrapMethods
  #67 = String             #68            // initialVoice;initialHtm;ce8Htm;ce8Loc;qmc9Htm;qmc9Loc;qmc24Htm;qmc35Htm;ce47Loc
  #68 = Utf8               initialVoice;initialHtm;ce8Htm;ce8Loc;qmc9Htm;qmc9Loc;qmc24Htm;qmc35Htm;ce47Loc
  #69 = MethodHandle       1:#7           // REF_getField ext/mods/gameserver/model/records/TutorialEvent.initialVoice:Ljava/lang/String;
  #70 = MethodHandle       1:#13          // REF_getField ext/mods/gameserver/model/records/TutorialEvent.initialHtm:Ljava/lang/String;
  #71 = MethodHandle       1:#16          // REF_getField ext/mods/gameserver/model/records/TutorialEvent.ce8Htm:Ljava/lang/String;
  #72 = MethodHandle       1:#19          // REF_getField ext/mods/gameserver/model/records/TutorialEvent.ce8Loc:Lext/mods/gameserver/model/location/Location;
  #73 = MethodHandle       1:#23          // REF_getField ext/mods/gameserver/model/records/TutorialEvent.qmc9Htm:Ljava/lang/String;
  #74 = MethodHandle       1:#26          // REF_getField ext/mods/gameserver/model/records/TutorialEvent.qmc9Loc:Lext/mods/gameserver/model/location/Location;
  #75 = MethodHandle       1:#29          // REF_getField ext/mods/gameserver/model/records/TutorialEvent.qmc24Htm:Ljava/lang/String;
  #76 = MethodHandle       1:#32          // REF_getField ext/mods/gameserver/model/records/TutorialEvent.qmc35Htm:Ljava/lang/String;
  #77 = MethodHandle       1:#35          // REF_getField ext/mods/gameserver/model/records/TutorialEvent.ce47Loc:Lext/mods/gameserver/model/location/Location;
  #78 = MethodHandle       6:#79          // REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #79 = Methodref          #80.#81        // java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #80 = Class              #82            // java/lang/runtime/ObjectMethods
  #81 = NameAndType        #83:#84        // bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #82 = Utf8               java/lang/runtime/ObjectMethods
  #83 = Utf8               bootstrap
  #84 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #85 = Utf8               InnerClasses
  #86 = Class              #87            // java/lang/invoke/MethodHandles$Lookup
  #87 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #88 = Class              #89            // java/lang/invoke/MethodHandles
  #89 = Utf8               java/lang/invoke/MethodHandles
  #90 = Utf8               Lookup
{
  public ext.mods.gameserver.model.records.TutorialEvent(java.lang.String, java.lang.String, java.lang.String, ext.mods.gameserver.model.location.Location, java.lang.String, ext.mods.gameserver.model.location.Location, java.lang.String, java.lang.String, ext.mods.gameserver.model.location.Location);
    descriptor: (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/location/Location;Ljava/lang/String;Lext/mods/gameserver/model/location/Location;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/location/Location;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=10, args_size=10
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Record."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #7                  // Field initialVoice:Ljava/lang/String;
         9: aload_0
        10: aload_2
        11: putfield      #13                 // Field initialHtm:Ljava/lang/String;
        14: aload_0
        15: aload_3
        16: putfield      #16                 // Field ce8Htm:Ljava/lang/String;
        19: aload_0
        20: aload         4
        22: putfield      #19                 // Field ce8Loc:Lext/mods/gameserver/model/location/Location;
        25: aload_0
        26: aload         5
        28: putfield      #23                 // Field qmc9Htm:Ljava/lang/String;
        31: aload_0
        32: aload         6
        34: putfield      #26                 // Field qmc9Loc:Lext/mods/gameserver/model/location/Location;
        37: aload_0
        38: aload         7
        40: putfield      #29                 // Field qmc24Htm:Ljava/lang/String;
        43: aload_0
        44: aload         8
        46: putfield      #32                 // Field qmc35Htm:Ljava/lang/String;
        49: aload_0
        50: aload         9
        52: putfield      #35                 // Field ce47Loc:Lext/mods/gameserver/model/location/Location;
        55: return
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      56     0  this   Lext/mods/gameserver/model/records/TutorialEvent;
            0      56     1 initialVoice   Ljava/lang/String;
            0      56     2 initialHtm   Ljava/lang/String;
            0      56     3 ce8Htm   Ljava/lang/String;
            0      56     4 ce8Loc   Lext/mods/gameserver/model/location/Location;
            0      56     5 qmc9Htm   Ljava/lang/String;
            0      56     6 qmc9Loc   Lext/mods/gameserver/model/location/Location;
            0      56     7 qmc24Htm   Ljava/lang/String;
            0      56     8 qmc35Htm   Ljava/lang/String;
            0      56     9 ce47Loc   Lext/mods/gameserver/model/location/Location;
    MethodParameters:
      Name                           Flags
      initialVoice
      initialHtm
      ce8Htm
      ce8Loc
      qmc9Htm
      qmc9Loc
      qmc24Htm
      qmc35Htm
      ce47Loc

  public final java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #38,  0             // InvokeDynamic #0:toString:(Lext/mods/gameserver/model/records/TutorialEvent;)Ljava/lang/String;
         6: areturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/TutorialEvent;

  public final int hashCode();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #42,  0             // InvokeDynamic #0:hashCode:(Lext/mods/gameserver/model/records/TutorialEvent;)I
         6: ireturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/TutorialEvent;

  public final boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokedynamic #46,  0             // InvokeDynamic #0:equals:(Lext/mods/gameserver/model/records/TutorialEvent;Ljava/lang/Object;)Z
         7: ireturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/records/TutorialEvent;
            0       8     1     o   Ljava/lang/Object;

  public java.lang.String initialVoice();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field initialVoice:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/TutorialEvent;

  public java.lang.String initialHtm();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field initialHtm:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/TutorialEvent;

  public java.lang.String ce8Htm();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field ce8Htm:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/TutorialEvent;

  public ext.mods.gameserver.model.location.Location ce8Loc();
    descriptor: ()Lext/mods/gameserver/model/location/Location;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field ce8Loc:Lext/mods/gameserver/model/location/Location;
         4: areturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/TutorialEvent;

  public java.lang.String qmc9Htm();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field qmc9Htm:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/TutorialEvent;

  public ext.mods.gameserver.model.location.Location qmc9Loc();
    descriptor: ()Lext/mods/gameserver/model/location/Location;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #26                 // Field qmc9Loc:Lext/mods/gameserver/model/location/Location;
         4: areturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/TutorialEvent;

  public java.lang.String qmc24Htm();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #29                 // Field qmc24Htm:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/TutorialEvent;

  public java.lang.String qmc35Htm();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #32                 // Field qmc35Htm:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/TutorialEvent;

  public ext.mods.gameserver.model.location.Location ce47Loc();
    descriptor: ()Lext/mods/gameserver/model/location/Location;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #35                 // Field ce47Loc:Lext/mods/gameserver/model/location/Location;
         4: areturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/TutorialEvent;
}
SourceFile: "TutorialEvent.java"
  Record: length = 0x38 (unknown attribute)
   00 09 00 0B 00 0C 00 00 00 0F 00 0C 00 00 00 12
   00 0C 00 00 00 15 00 16 00 00 00 19 00 0C 00 00
   00 1C 00 16 00 00 00 1F 00 0C 00 00 00 22 00 0C
   00 00 00 25 00 16 00 00
BootstrapMethods:
  0: #78 REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
    Method arguments:
      #8 ext/mods/gameserver/model/records/TutorialEvent
      #67 initialVoice;initialHtm;ce8Htm;ce8Loc;qmc9Htm;qmc9Loc;qmc24Htm;qmc35Htm;ce47Loc
      #69 REF_getField ext/mods/gameserver/model/records/TutorialEvent.initialVoice:Ljava/lang/String;
      #70 REF_getField ext/mods/gameserver/model/records/TutorialEvent.initialHtm:Ljava/lang/String;
      #71 REF_getField ext/mods/gameserver/model/records/TutorialEvent.ce8Htm:Ljava/lang/String;
      #72 REF_getField ext/mods/gameserver/model/records/TutorialEvent.ce8Loc:Lext/mods/gameserver/model/location/Location;
      #73 REF_getField ext/mods/gameserver/model/records/TutorialEvent.qmc9Htm:Ljava/lang/String;
      #74 REF_getField ext/mods/gameserver/model/records/TutorialEvent.qmc9Loc:Lext/mods/gameserver/model/location/Location;
      #75 REF_getField ext/mods/gameserver/model/records/TutorialEvent.qmc24Htm:Ljava/lang/String;
      #76 REF_getField ext/mods/gameserver/model/records/TutorialEvent.qmc35Htm:Ljava/lang/String;
      #77 REF_getField ext/mods/gameserver/model/records/TutorialEvent.ce47Loc:Lext/mods/gameserver/model/location/Location;
InnerClasses:
  public static final #90= #86 of #88;    // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
