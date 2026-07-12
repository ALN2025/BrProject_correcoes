// Bytecode for: ext.mods.gameserver.model.craft.ManufactureList
// File: ext\mods\gameserver\model\craft\ManufactureList.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/craft/ManufactureList.class
  Last modified 9 de jul de 2026; size 1534 bytes
  MD5 checksum 5570467805e0282152131c29fe775379
  Compiled from "ManufactureList.java"
public class ext.mods.gameserver.model.craft.ManufactureList extends java.util.ArrayList<ext.mods.gameserver.model.records.ManufactureItem>
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #14                         // ext/mods/gameserver/model/craft/ManufactureList
  super_class: #2                         // java/util/ArrayList
  interfaces: 0, fields: 4, methods: 8, attributes: 2
Constant pool:
   #1 = Methodref          #2.#3          // java/util/ArrayList."<init>":()V
   #2 = Class              #4             // java/util/ArrayList
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/util/ArrayList
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Methodref          #8.#9          // java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
   #8 = Class              #10            // java/util/Arrays
   #9 = NameAndType        #11:#12        // asList:([Ljava/lang/Object;)Ljava/util/List;
  #10 = Utf8               java/util/Arrays
  #11 = Utf8               asList
  #12 = Utf8               ([Ljava/lang/Object;)Ljava/util/List;
  #13 = Methodref          #14.#15        // ext/mods/gameserver/model/craft/ManufactureList.addAll:(Ljava/util/Collection;)Z
  #14 = Class              #16            // ext/mods/gameserver/model/craft/ManufactureList
  #15 = NameAndType        #17:#18        // addAll:(Ljava/util/Collection;)Z
  #16 = Utf8               ext/mods/gameserver/model/craft/ManufactureList
  #17 = Utf8               addAll
  #18 = Utf8               (Ljava/util/Collection;)Z
  #19 = Fieldref           #14.#20        // ext/mods/gameserver/model/craft/ManufactureList._confirmed:Z
  #20 = NameAndType        #21:#22        // _confirmed:Z
  #21 = Utf8               _confirmed
  #22 = Utf8               Z
  #23 = Fieldref           #14.#24        // ext/mods/gameserver/model/craft/ManufactureList._isDwarven:Z
  #24 = NameAndType        #25:#22        // _isDwarven:Z
  #25 = Utf8               _isDwarven
  #26 = Fieldref           #14.#27        // ext/mods/gameserver/model/craft/ManufactureList._storeName:Ljava/lang/String;
  #27 = NameAndType        #28:#29        // _storeName:Ljava/lang/String;
  #28 = Utf8               _storeName
  #29 = Utf8               Ljava/lang/String;
  #30 = Utf8               serialVersionUID
  #31 = Utf8               J
  #32 = Utf8               ConstantValue
  #33 = Long               1l
  #35 = Utf8               Code
  #36 = Utf8               LineNumberTable
  #37 = Utf8               LocalVariableTable
  #38 = Utf8               this
  #39 = Utf8               Lext/mods/gameserver/model/craft/ManufactureList;
  #40 = Utf8               set
  #41 = Utf8               ([Lext/mods/gameserver/model/records/ManufactureItem;)V
  #42 = Utf8               items
  #43 = Utf8               [Lext/mods/gameserver/model/records/ManufactureItem;
  #44 = Utf8               hasConfirmed
  #45 = Utf8               ()Z
  #46 = Utf8               setConfirmedTrade
  #47 = Utf8               (Z)V
  #48 = Utf8               confirmed
  #49 = Utf8               isDwarven
  #50 = Utf8               setState
  #51 = Utf8               getStoreName
  #52 = Utf8               ()Ljava/lang/String;
  #53 = Utf8               setStoreName
  #54 = Utf8               (Ljava/lang/String;)V
  #55 = Utf8               storeName
  #56 = Utf8               Signature
  #57 = Utf8               Ljava/util/ArrayList<Lext/mods/gameserver/model/records/ManufactureItem;>;
  #58 = Utf8               SourceFile
  #59 = Utf8               ManufactureList.java
{
  public ext.mods.gameserver.model.craft.ManufactureList();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/util/ArrayList."<init>":()V
         4: return
      LineNumberTable:
        line 28: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/craft/ManufactureList;

  public void set(ext.mods.gameserver.model.records.ManufactureItem[]);
    descriptor: ([Lext/mods/gameserver/model/records/ManufactureItem;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokestatic  #7                  // Method java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
         5: invokevirtual #13                 // Method addAll:(Ljava/util/Collection;)Z
         8: pop
         9: return
      LineNumberTable:
        line 39: 0
        line 40: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/craft/ManufactureList;
            0      10     1 items   [Lext/mods/gameserver/model/records/ManufactureItem;

  public boolean hasConfirmed();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field _confirmed:Z
         4: ireturn
      LineNumberTable:
        line 44: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/craft/ManufactureList;

  public void setConfirmedTrade(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #19                 // Field _confirmed:Z
         5: return
      LineNumberTable:
        line 49: 0
        line 50: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/craft/ManufactureList;
            0       6     1 confirmed   Z

  public boolean isDwarven();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field _isDwarven:Z
         4: ireturn
      LineNumberTable:
        line 54: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/craft/ManufactureList;

  public void setState(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #23                 // Field _isDwarven:Z
         5: return
      LineNumberTable:
        line 59: 0
        line 60: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/craft/ManufactureList;
            0       6     1 isDwarven   Z

  public java.lang.String getStoreName();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #26                 // Field _storeName:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 64: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/craft/ManufactureList;

  public void setStoreName(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #26                 // Field _storeName:Ljava/lang/String;
         5: return
      LineNumberTable:
        line 69: 0
        line 70: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/craft/ManufactureList;
            0       6     1 storeName   Ljava/lang/String;
}
Signature: #57                          // Ljava/util/ArrayList<Lext/mods/gameserver/model/records/ManufactureItem;>;
SourceFile: "ManufactureList.java"
