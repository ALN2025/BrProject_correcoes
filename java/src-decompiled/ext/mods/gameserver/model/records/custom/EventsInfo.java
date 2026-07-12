// Bytecode for: ext.mods.gameserver.model.records.custom.EventsInfo
// File: ext\mods\gameserver\model\records\custom\EventsInfo.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/records/custom/EventsInfo.class
  Last modified 9 de jul de 2026; size 2019 bytes
  MD5 checksum e085e686ab72b9f034dd2189e59a6acb
  Compiled from "EventsInfo.java"
public final class ext.mods.gameserver.model.records.custom.EventsInfo extends java.lang.Record
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/records/custom/EventsInfo
  super_class: #2                         // java/lang/Record
  interfaces: 0, fields: 2, methods: 6, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Record."<init>":()V
   #2 = Class              #4             // java/lang/Record
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Record
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/records/custom/EventsInfo.eventName:Ljava/lang/String;
   #8 = Class              #10            // ext/mods/gameserver/model/records/custom/EventsInfo
   #9 = NameAndType        #11:#12        // eventName:Ljava/lang/String;
  #10 = Utf8               ext/mods/gameserver/model/records/custom/EventsInfo
  #11 = Utf8               eventName
  #12 = Utf8               Ljava/lang/String;
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/model/records/custom/EventsInfo.items:Ljava/util/List;
  #14 = NameAndType        #15:#16        // items:Ljava/util/List;
  #15 = Utf8               items
  #16 = Utf8               Ljava/util/List;
  #17 = InvokeDynamic      #0:#18         // #0:toString:(Lext/mods/gameserver/model/records/custom/EventsInfo;)Ljava/lang/String;
  #18 = NameAndType        #19:#20        // toString:(Lext/mods/gameserver/model/records/custom/EventsInfo;)Ljava/lang/String;
  #19 = Utf8               toString
  #20 = Utf8               (Lext/mods/gameserver/model/records/custom/EventsInfo;)Ljava/lang/String;
  #21 = InvokeDynamic      #0:#22         // #0:hashCode:(Lext/mods/gameserver/model/records/custom/EventsInfo;)I
  #22 = NameAndType        #23:#24        // hashCode:(Lext/mods/gameserver/model/records/custom/EventsInfo;)I
  #23 = Utf8               hashCode
  #24 = Utf8               (Lext/mods/gameserver/model/records/custom/EventsInfo;)I
  #25 = InvokeDynamic      #0:#26         // #0:equals:(Lext/mods/gameserver/model/records/custom/EventsInfo;Ljava/lang/Object;)Z
  #26 = NameAndType        #27:#28        // equals:(Lext/mods/gameserver/model/records/custom/EventsInfo;Ljava/lang/Object;)Z
  #27 = Utf8               equals
  #28 = Utf8               (Lext/mods/gameserver/model/records/custom/EventsInfo;Ljava/lang/Object;)Z
  #29 = Utf8               Signature
  #30 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/records/custom/EventItem;>;
  #31 = Utf8               (Ljava/lang/String;Ljava/util/List;)V
  #32 = Utf8               Code
  #33 = Utf8               LineNumberTable
  #34 = Utf8               LocalVariableTable
  #35 = Utf8               this
  #36 = Utf8               Lext/mods/gameserver/model/records/custom/EventsInfo;
  #37 = Utf8               LocalVariableTypeTable
  #38 = Utf8               MethodParameters
  #39 = Utf8               (Ljava/lang/String;Ljava/util/List<Lext/mods/gameserver/model/records/custom/EventItem;>;)V
  #40 = Utf8               ()Ljava/lang/String;
  #41 = Utf8               ()I
  #42 = Utf8               (Ljava/lang/Object;)Z
  #43 = Utf8               o
  #44 = Utf8               Ljava/lang/Object;
  #45 = Utf8               ()Ljava/util/List;
  #46 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/model/records/custom/EventItem;>;
  #47 = Utf8               SourceFile
  #48 = Utf8               EventsInfo.java
  #49 = Utf8               Record
  #50 = Utf8               BootstrapMethods
  #51 = String             #52            // eventName;items
  #52 = Utf8               eventName;items
  #53 = MethodHandle       1:#7           // REF_getField ext/mods/gameserver/model/records/custom/EventsInfo.eventName:Ljava/lang/String;
  #54 = MethodHandle       1:#13          // REF_getField ext/mods/gameserver/model/records/custom/EventsInfo.items:Ljava/util/List;
  #55 = MethodHandle       6:#56          // REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #56 = Methodref          #57.#58        // java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #57 = Class              #59            // java/lang/runtime/ObjectMethods
  #58 = NameAndType        #60:#61        // bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #59 = Utf8               java/lang/runtime/ObjectMethods
  #60 = Utf8               bootstrap
  #61 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #62 = Utf8               InnerClasses
  #63 = Class              #64            // java/lang/invoke/MethodHandles$Lookup
  #64 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #65 = Class              #66            // java/lang/invoke/MethodHandles
  #66 = Utf8               java/lang/invoke/MethodHandles
  #67 = Utf8               Lookup
{
  public ext.mods.gameserver.model.records.custom.EventsInfo(java.lang.String, java.util.List<ext.mods.gameserver.model.records.custom.EventItem>);
    descriptor: (Ljava/lang/String;Ljava/util/List;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Record."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #7                  // Field eventName:Ljava/lang/String;
         9: aload_0
        10: aload_2
        11: putfield      #13                 // Field items:Ljava/util/List;
        14: return
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/model/records/custom/EventsInfo;
            0      15     1 eventName   Ljava/lang/String;
            0      15     2 items   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      15     2 items   Ljava/util/List<Lext/mods/gameserver/model/records/custom/EventItem;>;
    MethodParameters:
      Name                           Flags
      eventName
      items
    Signature: #39                          // (Ljava/lang/String;Ljava/util/List<Lext/mods/gameserver/model/records/custom/EventItem;>;)V

  public final java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #17,  0             // InvokeDynamic #0:toString:(Lext/mods/gameserver/model/records/custom/EventsInfo;)Ljava/lang/String;
         6: areturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/custom/EventsInfo;

  public final int hashCode();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #21,  0             // InvokeDynamic #0:hashCode:(Lext/mods/gameserver/model/records/custom/EventsInfo;)I
         6: ireturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/custom/EventsInfo;

  public final boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokedynamic #25,  0             // InvokeDynamic #0:equals:(Lext/mods/gameserver/model/records/custom/EventsInfo;Ljava/lang/Object;)Z
         7: ireturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/records/custom/EventsInfo;
            0       8     1     o   Ljava/lang/Object;

  public java.lang.String eventName();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field eventName:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/custom/EventsInfo;

  public java.util.List<ext.mods.gameserver.model.records.custom.EventItem> items();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field items:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/custom/EventsInfo;
    Signature: #46                          // ()Ljava/util/List<Lext/mods/gameserver/model/records/custom/EventItem;>;
}
SourceFile: "EventsInfo.java"
  Record: length = 0x16 (unknown attribute)
   00 02 00 0B 00 0C 00 00 00 0F 00 10 00 01 00 1D
   00 00 00 02 00 1E
BootstrapMethods:
  0: #55 REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
    Method arguments:
      #8 ext/mods/gameserver/model/records/custom/EventsInfo
      #51 eventName;items
      #53 REF_getField ext/mods/gameserver/model/records/custom/EventsInfo.eventName:Ljava/lang/String;
      #54 REF_getField ext/mods/gameserver/model/records/custom/EventsInfo.items:Ljava/util/List;
InnerClasses:
  public static final #67= #63 of #65;    // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
