// Bytecode for: ext.mods.gameserver.model.Shortcut
// File: ext\mods\gameserver\model\Shortcut.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/Shortcut.class
  Last modified 9 de jul de 2026; size 1553 bytes
  MD5 checksum 98f88cda32f2a8000eb426174f0946d1
  Compiled from "Shortcut.java"
public class ext.mods.gameserver.model.Shortcut
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/Shortcut
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 7, methods: 10, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/Shortcut._sharedReuseGroup:I
   #8 = Class              #10            // ext/mods/gameserver/model/Shortcut
   #9 = NameAndType        #11:#12        // _sharedReuseGroup:I
  #10 = Utf8               ext/mods/gameserver/model/Shortcut
  #11 = Utf8               _sharedReuseGroup
  #12 = Utf8               I
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/model/Shortcut._slot:I
  #14 = NameAndType        #15:#12        // _slot:I
  #15 = Utf8               _slot
  #16 = Fieldref           #8.#17         // ext/mods/gameserver/model/Shortcut._page:I
  #17 = NameAndType        #18:#12        // _page:I
  #18 = Utf8               _page
  #19 = Fieldref           #8.#20         // ext/mods/gameserver/model/Shortcut._type:Lext/mods/gameserver/enums/ShortcutType;
  #20 = NameAndType        #21:#22        // _type:Lext/mods/gameserver/enums/ShortcutType;
  #21 = Utf8               _type
  #22 = Utf8               Lext/mods/gameserver/enums/ShortcutType;
  #23 = Fieldref           #8.#24         // ext/mods/gameserver/model/Shortcut._id:I
  #24 = NameAndType        #25:#12        // _id:I
  #25 = Utf8               _id
  #26 = Fieldref           #8.#27         // ext/mods/gameserver/model/Shortcut._level:I
  #27 = NameAndType        #28:#12        // _level:I
  #28 = Utf8               _level
  #29 = Fieldref           #8.#30         // ext/mods/gameserver/model/Shortcut._characterType:I
  #30 = NameAndType        #31:#12        // _characterType:I
  #31 = Utf8               _characterType
  #32 = Utf8               (IILext/mods/gameserver/enums/ShortcutType;III)V
  #33 = Utf8               Code
  #34 = Utf8               LineNumberTable
  #35 = Utf8               LocalVariableTable
  #36 = Utf8               this
  #37 = Utf8               Lext/mods/gameserver/model/Shortcut;
  #38 = Utf8               slotId
  #39 = Utf8               pageId
  #40 = Utf8               type
  #41 = Utf8               id
  #42 = Utf8               level
  #43 = Utf8               characterType
  #44 = Utf8               getId
  #45 = Utf8               ()I
  #46 = Utf8               getLevel
  #47 = Utf8               setLevel
  #48 = Utf8               (I)V
  #49 = Utf8               getPage
  #50 = Utf8               getSlot
  #51 = Utf8               getType
  #52 = Utf8               ()Lext/mods/gameserver/enums/ShortcutType;
  #53 = Utf8               getCharacterType
  #54 = Utf8               getSharedReuseGroup
  #55 = Utf8               setSharedReuseGroup
  #56 = Utf8               group
  #57 = Utf8               SourceFile
  #58 = Utf8               Shortcut.java
{
  public ext.mods.gameserver.model.Shortcut(int, int, ext.mods.gameserver.enums.ShortcutType, int, int, int);
    descriptor: (IILext/mods/gameserver/enums/ShortcutType;III)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=7, args_size=7
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iconst_m1
         6: putfield      #7                  // Field _sharedReuseGroup:I
         9: aload_0
        10: iload_1
        11: putfield      #13                 // Field _slot:I
        14: aload_0
        15: iload_2
        16: putfield      #16                 // Field _page:I
        19: aload_0
        20: aload_3
        21: putfield      #19                 // Field _type:Lext/mods/gameserver/enums/ShortcutType;
        24: aload_0
        25: iload         4
        27: putfield      #23                 // Field _id:I
        30: aload_0
        31: iload         5
        33: putfield      #26                 // Field _level:I
        36: aload_0
        37: iload         6
        39: putfield      #29                 // Field _characterType:I
        42: return
      LineNumberTable:
        line 34: 0
        line 31: 4
        line 35: 9
        line 36: 14
        line 37: 19
        line 38: 24
        line 39: 30
        line 40: 36
        line 41: 42
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      43     0  this   Lext/mods/gameserver/model/Shortcut;
            0      43     1 slotId   I
            0      43     2 pageId   I
            0      43     3  type   Lext/mods/gameserver/enums/ShortcutType;
            0      43     4    id   I
            0      43     5 level   I
            0      43     6 characterType   I

  public int getId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field _id:I
         4: ireturn
      LineNumberTable:
        line 45: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/Shortcut;

  public int getLevel();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #26                 // Field _level:I
         4: ireturn
      LineNumberTable:
        line 50: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/Shortcut;

  public void setLevel(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #26                 // Field _level:I
         5: return
      LineNumberTable:
        line 55: 0
        line 56: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/Shortcut;
            0       6     1 level   I

  public int getPage();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field _page:I
         4: ireturn
      LineNumberTable:
        line 60: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/Shortcut;

  public int getSlot();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _slot:I
         4: ireturn
      LineNumberTable:
        line 65: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/Shortcut;

  public ext.mods.gameserver.enums.ShortcutType getType();
    descriptor: ()Lext/mods/gameserver/enums/ShortcutType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field _type:Lext/mods/gameserver/enums/ShortcutType;
         4: areturn
      LineNumberTable:
        line 70: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/Shortcut;

  public int getCharacterType();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #29                 // Field _characterType:I
         4: ireturn
      LineNumberTable:
        line 75: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/Shortcut;

  public int getSharedReuseGroup();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _sharedReuseGroup:I
         4: ireturn
      LineNumberTable:
        line 80: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/Shortcut;

  public void setSharedReuseGroup(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #7                  // Field _sharedReuseGroup:I
         5: return
      LineNumberTable:
        line 85: 0
        line 86: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/Shortcut;
            0       6     1 group   I
}
SourceFile: "Shortcut.java"
