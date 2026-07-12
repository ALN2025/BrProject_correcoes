// Bytecode for: ext.mods.CapsuleBox.CapsuleBoxItem
// File: ext\mods\CapsuleBox\CapsuleBoxItem.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/CapsuleBox/CapsuleBoxItem.class
  Last modified 9 de jul de 2026; size 1263 bytes
  MD5 checksum ae5ba93306bbff9c878eab5610d60e18
  Compiled from "CapsuleBoxItem.java"
public class ext.mods.CapsuleBox.CapsuleBoxItem
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/CapsuleBox/CapsuleBoxItem
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 3, methods: 5, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/CapsuleBox/CapsuleBoxItem.id:I
   #8 = Class              #10            // ext/mods/CapsuleBox/CapsuleBoxItem
   #9 = NameAndType        #11:#12        // id:I
  #10 = Utf8               ext/mods/CapsuleBox/CapsuleBoxItem
  #11 = Utf8               id
  #12 = Utf8               I
  #13 = Fieldref           #8.#14         // ext/mods/CapsuleBox/CapsuleBoxItem.playerLevel:I
  #14 = NameAndType        #15:#12        // playerLevel:I
  #15 = Utf8               playerLevel
  #16 = Class              #17            // java/util/ArrayList
  #17 = Utf8               java/util/ArrayList
  #18 = Methodref          #16.#3         // java/util/ArrayList."<init>":()V
  #19 = Fieldref           #8.#20         // ext/mods/CapsuleBox/CapsuleBoxItem.items:Ljava/util/List;
  #20 = NameAndType        #21:#22        // items:Ljava/util/List;
  #21 = Utf8               items
  #22 = Utf8               Ljava/util/List;
  #23 = InterfaceMethodref #24.#25        // java/util/List.add:(Ljava/lang/Object;)Z
  #24 = Class              #26            // java/util/List
  #25 = NameAndType        #27:#28        // add:(Ljava/lang/Object;)Z
  #26 = Utf8               java/util/List
  #27 = Utf8               add
  #28 = Utf8               (Ljava/lang/Object;)Z
  #29 = Utf8               Signature
  #30 = Utf8               Ljava/util/List<Lext/mods/CapsuleBox/CapsuleBoxItem$Item;>;
  #31 = Utf8               (II)V
  #32 = Utf8               Code
  #33 = Utf8               LineNumberTable
  #34 = Utf8               LocalVariableTable
  #35 = Utf8               this
  #36 = Utf8               Lext/mods/CapsuleBox/CapsuleBoxItem;
  #37 = Utf8               getId
  #38 = Utf8               ()I
  #39 = Utf8               getPlayerLevel
  #40 = Utf8               getItems
  #41 = Utf8               ()Ljava/util/List;
  #42 = Utf8               ()Ljava/util/List<Lext/mods/CapsuleBox/CapsuleBoxItem$Item;>;
  #43 = Utf8               addItem
  #44 = Utf8               (Lext/mods/CapsuleBox/CapsuleBoxItem$Item;)V
  #45 = Utf8               item
  #46 = Utf8               Lext/mods/CapsuleBox/CapsuleBoxItem$Item;
  #47 = Utf8               SourceFile
  #48 = Utf8               CapsuleBoxItem.java
  #49 = Utf8               NestMembers
  #50 = Class              #51            // ext/mods/CapsuleBox/CapsuleBoxItem$Item
  #51 = Utf8               ext/mods/CapsuleBox/CapsuleBoxItem$Item
  #52 = Utf8               InnerClasses
  #53 = Utf8               Item
{
  public ext.mods.CapsuleBox.CapsuleBoxItem(int, int);
    descriptor: (II)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #7                  // Field id:I
         9: aload_0
        10: iload_2
        11: putfield      #13                 // Field playerLevel:I
        14: aload_0
        15: new           #16                 // class java/util/ArrayList
        18: dup
        19: invokespecial #18                 // Method java/util/ArrayList."<init>":()V
        22: putfield      #19                 // Field items:Ljava/util/List;
        25: return
      LineNumberTable:
        line 32: 0
        line 33: 4
        line 34: 9
        line 35: 14
        line 36: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/CapsuleBox/CapsuleBoxItem;
            0      26     1    id   I
            0      26     2 playerLevel   I

  public int getId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field id:I
         4: ireturn
      LineNumberTable:
        line 39: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/CapsuleBox/CapsuleBoxItem;

  public int getPlayerLevel();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field playerLevel:I
         4: ireturn
      LineNumberTable:
        line 43: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/CapsuleBox/CapsuleBoxItem;

  public java.util.List<ext.mods.CapsuleBox.CapsuleBoxItem$Item> getItems();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field items:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 47: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/CapsuleBox/CapsuleBoxItem;
    Signature: #42                          // ()Ljava/util/List<Lext/mods/CapsuleBox/CapsuleBoxItem$Item;>;

  public void addItem(ext.mods.CapsuleBox.CapsuleBoxItem$Item);
    descriptor: (Lext/mods/CapsuleBox/CapsuleBoxItem$Item;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #19                 // Field items:Ljava/util/List;
         4: aload_1
         5: invokeinterface #23,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 51: 0
        line 52: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/CapsuleBox/CapsuleBoxItem;
            0      12     1  item   Lext/mods/CapsuleBox/CapsuleBoxItem$Item;
}
SourceFile: "CapsuleBoxItem.java"
NestMembers:
  ext/mods/CapsuleBox/CapsuleBoxItem$Item
InnerClasses:
  public static #53= #50 of #8;           // Item=class ext/mods/CapsuleBox/CapsuleBoxItem$Item of class ext/mods/CapsuleBox/CapsuleBoxItem
