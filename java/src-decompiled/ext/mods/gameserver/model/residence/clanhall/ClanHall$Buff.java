// Bytecode for: ext.mods.gameserver.model.residence.clanhall.ClanHall$Buff
// File: ext\mods\gameserver\model\residence\clanhall\ClanHall$Buff.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/residence/clanhall/ClanHall$Buff.class
  Last modified 9 de jul de 2026; size 1996 bytes
  MD5 checksum df1049350ad2147ca7ec8359fceb4686
  Compiled from "ClanHall.java"
public final class ext.mods.gameserver.model.residence.clanhall.ClanHall$Buff extends java.lang.Record
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/residence/clanhall/ClanHall$Buff
  super_class: #2                         // java/lang/Record
  interfaces: 0, fields: 4, methods: 8, attributes: 5
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Record."<init>":()V
   #2 = Class              #4             // java/lang/Record
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Record
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/residence/clanhall/ClanHall$Buff.id:I
   #8 = Class              #10            // ext/mods/gameserver/model/residence/clanhall/ClanHall$Buff
   #9 = NameAndType        #11:#12        // id:I
  #10 = Utf8               ext/mods/gameserver/model/residence/clanhall/ClanHall$Buff
  #11 = Utf8               id
  #12 = Utf8               I
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/model/residence/clanhall/ClanHall$Buff.lvl:I
  #14 = NameAndType        #15:#12        // lvl:I
  #15 = Utf8               lvl
  #16 = Fieldref           #8.#17         // ext/mods/gameserver/model/residence/clanhall/ClanHall$Buff.desc:Ljava/lang/String;
  #17 = NameAndType        #18:#19        // desc:Ljava/lang/String;
  #18 = Utf8               desc
  #19 = Utf8               Ljava/lang/String;
  #20 = Fieldref           #8.#21         // ext/mods/gameserver/model/residence/clanhall/ClanHall$Buff.price:I
  #21 = NameAndType        #22:#12        // price:I
  #22 = Utf8               price
  #23 = InvokeDynamic      #0:#24         // #0:toString:(Lext/mods/gameserver/model/residence/clanhall/ClanHall$Buff;)Ljava/lang/String;
  #24 = NameAndType        #25:#26        // toString:(Lext/mods/gameserver/model/residence/clanhall/ClanHall$Buff;)Ljava/lang/String;
  #25 = Utf8               toString
  #26 = Utf8               (Lext/mods/gameserver/model/residence/clanhall/ClanHall$Buff;)Ljava/lang/String;
  #27 = InvokeDynamic      #0:#28         // #0:hashCode:(Lext/mods/gameserver/model/residence/clanhall/ClanHall$Buff;)I
  #28 = NameAndType        #29:#30        // hashCode:(Lext/mods/gameserver/model/residence/clanhall/ClanHall$Buff;)I
  #29 = Utf8               hashCode
  #30 = Utf8               (Lext/mods/gameserver/model/residence/clanhall/ClanHall$Buff;)I
  #31 = InvokeDynamic      #0:#32         // #0:equals:(Lext/mods/gameserver/model/residence/clanhall/ClanHall$Buff;Ljava/lang/Object;)Z
  #32 = NameAndType        #33:#34        // equals:(Lext/mods/gameserver/model/residence/clanhall/ClanHall$Buff;Ljava/lang/Object;)Z
  #33 = Utf8               equals
  #34 = Utf8               (Lext/mods/gameserver/model/residence/clanhall/ClanHall$Buff;Ljava/lang/Object;)Z
  #35 = Utf8               (IILjava/lang/String;I)V
  #36 = Utf8               Code
  #37 = Utf8               LineNumberTable
  #38 = Utf8               LocalVariableTable
  #39 = Utf8               this
  #40 = Utf8               Lext/mods/gameserver/model/residence/clanhall/ClanHall$Buff;
  #41 = Utf8               MethodParameters
  #42 = Utf8               ()Ljava/lang/String;
  #43 = Utf8               ()I
  #44 = Utf8               (Ljava/lang/Object;)Z
  #45 = Utf8               o
  #46 = Utf8               Ljava/lang/Object;
  #47 = Utf8               SourceFile
  #48 = Utf8               ClanHall.java
  #49 = Utf8               NestHost
  #50 = Class              #51            // ext/mods/gameserver/model/residence/clanhall/ClanHall
  #51 = Utf8               ext/mods/gameserver/model/residence/clanhall/ClanHall
  #52 = Utf8               Record
  #53 = Utf8               BootstrapMethods
  #54 = String             #55            // id;lvl;desc;price
  #55 = Utf8               id;lvl;desc;price
  #56 = MethodHandle       1:#7           // REF_getField ext/mods/gameserver/model/residence/clanhall/ClanHall$Buff.id:I
  #57 = MethodHandle       1:#13          // REF_getField ext/mods/gameserver/model/residence/clanhall/ClanHall$Buff.lvl:I
  #58 = MethodHandle       1:#16          // REF_getField ext/mods/gameserver/model/residence/clanhall/ClanHall$Buff.desc:Ljava/lang/String;
  #59 = MethodHandle       1:#20          // REF_getField ext/mods/gameserver/model/residence/clanhall/ClanHall$Buff.price:I
  #60 = MethodHandle       6:#61          // REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #61 = Methodref          #62.#63        // java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #62 = Class              #64            // java/lang/runtime/ObjectMethods
  #63 = NameAndType        #65:#66        // bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #64 = Utf8               java/lang/runtime/ObjectMethods
  #65 = Utf8               bootstrap
  #66 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #67 = Utf8               InnerClasses
  #68 = Utf8               Buff
  #69 = Class              #70            // java/lang/invoke/MethodHandles$Lookup
  #70 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #71 = Class              #72            // java/lang/invoke/MethodHandles
  #72 = Utf8               java/lang/invoke/MethodHandles
  #73 = Utf8               Lookup
{
  public ext.mods.gameserver.model.residence.clanhall.ClanHall$Buff(int, int, java.lang.String, int);
    descriptor: (IILjava/lang/String;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=5
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Record."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #7                  // Field id:I
         9: aload_0
        10: iload_2
        11: putfield      #13                 // Field lvl:I
        14: aload_0
        15: aload_3
        16: putfield      #16                 // Field desc:Ljava/lang/String;
        19: aload_0
        20: iload         4
        22: putfield      #20                 // Field price:I
        25: return
      LineNumberTable:
        line 501: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/residence/clanhall/ClanHall$Buff;
            0      26     1    id   I
            0      26     2   lvl   I
            0      26     3  desc   Ljava/lang/String;
            0      26     4 price   I
    MethodParameters:
      Name                           Flags
      id
      lvl
      desc
      price

  public final java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #23,  0             // InvokeDynamic #0:toString:(Lext/mods/gameserver/model/residence/clanhall/ClanHall$Buff;)Ljava/lang/String;
         6: areturn
      LineNumberTable:
        line 501: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/residence/clanhall/ClanHall$Buff;

  public final int hashCode();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #27,  0             // InvokeDynamic #0:hashCode:(Lext/mods/gameserver/model/residence/clanhall/ClanHall$Buff;)I
         6: ireturn
      LineNumberTable:
        line 501: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/residence/clanhall/ClanHall$Buff;

  public final boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokedynamic #31,  0             // InvokeDynamic #0:equals:(Lext/mods/gameserver/model/residence/clanhall/ClanHall$Buff;Ljava/lang/Object;)Z
         7: ireturn
      LineNumberTable:
        line 501: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/residence/clanhall/ClanHall$Buff;
            0       8     1     o   Ljava/lang/Object;

  public int id();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field id:I
         4: ireturn
      LineNumberTable:
        line 501: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/clanhall/ClanHall$Buff;

  public int lvl();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field lvl:I
         4: ireturn
      LineNumberTable:
        line 501: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/clanhall/ClanHall$Buff;

  public java.lang.String desc();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field desc:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 501: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/clanhall/ClanHall$Buff;

  public int price();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #20                 // Field price:I
         4: ireturn
      LineNumberTable:
        line 501: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/clanhall/ClanHall$Buff;
}
SourceFile: "ClanHall.java"
NestHost: class ext/mods/gameserver/model/residence/clanhall/ClanHall
  Record: length = 0x1A (unknown attribute)
   00 04 00 0B 00 0C 00 00 00 0F 00 0C 00 00 00 12
   00 13 00 00 00 16 00 0C 00 00
BootstrapMethods:
  0: #60 REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
    Method arguments:
      #8 ext/mods/gameserver/model/residence/clanhall/ClanHall$Buff
      #54 id;lvl;desc;price
      #56 REF_getField ext/mods/gameserver/model/residence/clanhall/ClanHall$Buff.id:I
      #57 REF_getField ext/mods/gameserver/model/residence/clanhall/ClanHall$Buff.lvl:I
      #58 REF_getField ext/mods/gameserver/model/residence/clanhall/ClanHall$Buff.desc:Ljava/lang/String;
      #59 REF_getField ext/mods/gameserver/model/residence/clanhall/ClanHall$Buff.price:I
InnerClasses:
  public static final #68= #8 of #50;     // Buff=class ext/mods/gameserver/model/residence/clanhall/ClanHall$Buff of class ext/mods/gameserver/model/residence/clanhall/ClanHall
  public static final #73= #69 of #71;    // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
