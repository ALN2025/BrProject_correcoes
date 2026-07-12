// Bytecode for: ext.mods.gameserver.communitybbs.custom.model.Function
// File: ext\mods\gameserver\communitybbs\custom\model\Function.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/communitybbs/custom/model/Function.class
  Last modified 9 de jul de 2026; size 2484 bytes
  MD5 checksum 56f2c4207a0f13c5b5fc9f80690e038c
  Compiled from "Function.java"
public class ext.mods.gameserver.communitybbs.custom.model.Function
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #10                         // ext/mods/gameserver/communitybbs/custom/model/Function
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 8, methods: 19, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = String             #8             // ALL
   #8 = Utf8               ALL
   #9 = Fieldref           #10.#11        // ext/mods/gameserver/communitybbs/custom/model/Function._itemType:Ljava/lang/String;
  #10 = Class              #12            // ext/mods/gameserver/communitybbs/custom/model/Function
  #11 = NameAndType        #13:#14        // _itemType:Ljava/lang/String;
  #12 = Utf8               ext/mods/gameserver/communitybbs/custom/model/Function
  #13 = Utf8               _itemType
  #14 = Utf8               Ljava/lang/String;
  #15 = Fieldref           #10.#16        // ext/mods/gameserver/communitybbs/custom/model/Function._itemGrade:Ljava/lang/String;
  #16 = NameAndType        #17:#14        // _itemGrade:Ljava/lang/String;
  #17 = Utf8               _itemGrade
  #18 = Fieldref           #10.#19        // ext/mods/gameserver/communitybbs/custom/model/Function._currency:Ljava/lang/String;
  #19 = NameAndType        #20:#14        // _currency:Ljava/lang/String;
  #20 = Utf8               _currency
  #21 = String             #22            //
  #22 = Utf8
  #23 = Fieldref           #10.#24        // ext/mods/gameserver/communitybbs/custom/model/Function._search:Ljava/lang/String;
  #24 = NameAndType        #25:#14        // _search:Ljava/lang/String;
  #25 = Utf8               _search
  #26 = Methodref          #27.#28        // java/lang/String.toUpperCase:()Ljava/lang/String;
  #27 = Class              #29            // java/lang/String
  #28 = NameAndType        #30:#31        // toUpperCase:()Ljava/lang/String;
  #29 = Utf8               java/lang/String
  #30 = Utf8               toUpperCase
  #31 = Utf8               ()Ljava/lang/String;
  #32 = Methodref          #27.#33        // java/lang/String.equals:(Ljava/lang/Object;)Z
  #33 = NameAndType        #34:#35        // equals:(Ljava/lang/Object;)Z
  #34 = Utf8               equals
  #35 = Utf8               (Ljava/lang/Object;)Z
  #36 = Fieldref           #10.#37        // ext/mods/gameserver/communitybbs/custom/model/Function._lastPage:I
  #37 = NameAndType        #38:#39        // _lastPage:I
  #38 = Utf8               _lastPage
  #39 = Utf8               I
  #40 = Class              #41            // java/lang/Integer
  #41 = Utf8               java/lang/Integer
  #42 = Integer            2147483647
  #43 = Methodref          #44.#45        // java/lang/Math.clamp:(JII)I
  #44 = Class              #46            // java/lang/Math
  #45 = NameAndType        #47:#48        // clamp:(JII)I
  #46 = Utf8               java/lang/Math
  #47 = Utf8               clamp
  #48 = Utf8               (JII)I
  #49 = Fieldref           #10.#50        // ext/mods/gameserver/communitybbs/custom/model/Function._viewId:I
  #50 = NameAndType        #51:#39        // _viewId:I
  #51 = Utf8               _viewId
  #52 = Fieldref           #10.#53        // ext/mods/gameserver/communitybbs/custom/model/Function._editId:I
  #53 = NameAndType        #54:#39        // _editId:I
  #54 = Utf8               _editId
  #55 = Fieldref           #10.#56        // ext/mods/gameserver/communitybbs/custom/model/Function._itemId:I
  #56 = NameAndType        #57:#39        // _itemId:I
  #57 = Utf8               _itemId
  #58 = Utf8               Code
  #59 = Utf8               LineNumberTable
  #60 = Utf8               LocalVariableTable
  #61 = Utf8               this
  #62 = Utf8               Lext/mods/gameserver/communitybbs/custom/model/Function;
  #63 = Utf8               getItemType
  #64 = Utf8               isItemType
  #65 = Utf8               (Ljava/lang/String;)Z
  #66 = Utf8               type
  #67 = Utf8               setItemType
  #68 = Utf8               (Ljava/lang/String;)V
  #69 = Utf8               val
  #70 = Utf8               getItemGrade
  #71 = Utf8               isItemGrade
  #72 = Utf8               grade
  #73 = Utf8               setItemGrade
  #74 = Utf8               getCurrency
  #75 = Utf8               setCurrency
  #76 = Utf8               currency
  #77 = Utf8               getSearch
  #78 = Utf8               setSearch
  #79 = Utf8               getLastPage
  #80 = Utf8               ()I
  #81 = Utf8               setLastPage
  #82 = Utf8               (I)V
  #83 = Utf8               lastPage
  #84 = Utf8               getViewId
  #85 = Utf8               setViewId
  #86 = Utf8               viewId
  #87 = Utf8               getEditId
  #88 = Utf8               setEditId
  #89 = Utf8               editId
  #90 = Utf8               getItemId
  #91 = Utf8               setItemId
  #92 = Utf8               itemId
  #93 = Utf8               SourceFile
  #94 = Utf8               Function.java
{
  public ext.mods.gameserver.communitybbs.custom.model.Function();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: ldc           #7                  // String ALL
         7: putfield      #9                  // Field _itemType:Ljava/lang/String;
        10: aload_0
        11: ldc           #7                  // String ALL
        13: putfield      #15                 // Field _itemGrade:Ljava/lang/String;
        16: aload_0
        17: ldc           #7                  // String ALL
        19: putfield      #18                 // Field _currency:Ljava/lang/String;
        22: aload_0
        23: ldc           #21                 // String
        25: putfield      #23                 // Field _search:Ljava/lang/String;
        28: return
      LineNumberTable:
        line 33: 0
        line 34: 4
        line 35: 10
        line 36: 16
        line 37: 22
        line 38: 28
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/communitybbs/custom/model/Function;

  public final java.lang.String getItemType();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #9                  // Field _itemType:Ljava/lang/String;
         4: invokevirtual #26                 // Method java/lang/String.toUpperCase:()Ljava/lang/String;
         7: areturn
      LineNumberTable:
        line 42: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/communitybbs/custom/model/Function;

  public final boolean isItemType(java.lang.String);
    descriptor: (Ljava/lang/String;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #9                  // Field _itemType:Ljava/lang/String;
         4: invokevirtual #26                 // Method java/lang/String.toUpperCase:()Ljava/lang/String;
         7: aload_1
         8: invokevirtual #26                 // Method java/lang/String.toUpperCase:()Ljava/lang/String;
        11: invokevirtual #32                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        14: ireturn
      LineNumberTable:
        line 47: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/communitybbs/custom/model/Function;
            0      15     1  type   Ljava/lang/String;

  public void setItemType(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #9                  // Field _itemType:Ljava/lang/String;
         5: return
      LineNumberTable:
        line 52: 0
        line 53: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/communitybbs/custom/model/Function;
            0       6     1   val   Ljava/lang/String;

  public final java.lang.String getItemGrade();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #15                 // Field _itemGrade:Ljava/lang/String;
         4: invokevirtual #26                 // Method java/lang/String.toUpperCase:()Ljava/lang/String;
         7: areturn
      LineNumberTable:
        line 57: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/communitybbs/custom/model/Function;

  public final boolean isItemGrade(java.lang.String);
    descriptor: (Ljava/lang/String;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #15                 // Field _itemGrade:Ljava/lang/String;
         4: invokevirtual #26                 // Method java/lang/String.toUpperCase:()Ljava/lang/String;
         7: aload_1
         8: invokevirtual #26                 // Method java/lang/String.toUpperCase:()Ljava/lang/String;
        11: invokevirtual #32                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        14: ireturn
      LineNumberTable:
        line 62: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/communitybbs/custom/model/Function;
            0      15     1 grade   Ljava/lang/String;

  public void setItemGrade(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #15                 // Field _itemGrade:Ljava/lang/String;
         5: return
      LineNumberTable:
        line 67: 0
        line 68: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/communitybbs/custom/model/Function;
            0       6     1   val   Ljava/lang/String;

  public final java.lang.String getCurrency();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #18                 // Field _currency:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 72: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/communitybbs/custom/model/Function;

  public void setCurrency(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #18                 // Field _currency:Ljava/lang/String;
         5: return
      LineNumberTable:
        line 77: 0
        line 78: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/communitybbs/custom/model/Function;
            0       6     1 currency   Ljava/lang/String;

  public final java.lang.String getSearch();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field _search:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 82: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/communitybbs/custom/model/Function;

  public void setSearch(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #23                 // Field _search:Ljava/lang/String;
         5: return
      LineNumberTable:
        line 87: 0
        line 88: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/communitybbs/custom/model/Function;
            0       6     1   val   Ljava/lang/String;

  public final int getLastPage();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: getfield      #36                 // Field _lastPage:I
         4: i2l
         5: iconst_1
         6: ldc           #42                 // int 2147483647
         8: invokestatic  #43                 // Method java/lang/Math.clamp:(JII)I
        11: ireturn
      LineNumberTable:
        line 92: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/communitybbs/custom/model/Function;

  public void setLastPage(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #36                 // Field _lastPage:I
         5: return
      LineNumberTable:
        line 97: 0
        line 98: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/communitybbs/custom/model/Function;
            0       6     1 lastPage   I

  public final int getViewId();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #49                 // Field _viewId:I
         4: ireturn
      LineNumberTable:
        line 102: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/communitybbs/custom/model/Function;

  public void setViewId(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #49                 // Field _viewId:I
         5: return
      LineNumberTable:
        line 107: 0
        line 108: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/communitybbs/custom/model/Function;
            0       6     1 viewId   I

  public final int getEditId();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #52                 // Field _editId:I
         4: ireturn
      LineNumberTable:
        line 112: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/communitybbs/custom/model/Function;

  public void setEditId(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #52                 // Field _editId:I
         5: return
      LineNumberTable:
        line 117: 0
        line 118: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/communitybbs/custom/model/Function;
            0       6     1 editId   I

  public final int getItemId();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #55                 // Field _itemId:I
         4: ireturn
      LineNumberTable:
        line 122: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/communitybbs/custom/model/Function;

  public void setItemId(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #55                 // Field _itemId:I
         5: return
      LineNumberTable:
        line 127: 0
        line 128: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/communitybbs/custom/model/Function;
            0       6     1 itemId   I
}
SourceFile: "Function.java"
