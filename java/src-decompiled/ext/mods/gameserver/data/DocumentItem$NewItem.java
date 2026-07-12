// Bytecode for: ext.mods.gameserver.data.DocumentItem$NewItem
// File: ext\mods\gameserver\data\DocumentItem$NewItem.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/DocumentItem$NewItem.class
  Last modified 9 de jul de 2026; size 863 bytes
  MD5 checksum 1fef81599df0cb47053e5c87b613487a
  Compiled from "DocumentItem.java"
public class ext.mods.gameserver.data.DocumentItem$NewItem
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #13                         // ext/mods/gameserver/data/DocumentItem$NewItem
  super_class: #8                         // java/lang/Object
  interfaces: 0, fields: 6, methods: 1, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #2 = Class              #4             // java/util/Objects
   #3 = NameAndType        #5:#6          // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #4 = Utf8               java/util/Objects
   #5 = Utf8               requireNonNull
   #6 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #7 = Methodref          #8.#9          // java/lang/Object."<init>":()V
   #8 = Class              #10            // java/lang/Object
   #9 = NameAndType        #11:#12        // "<init>":()V
  #10 = Utf8               java/lang/Object
  #11 = Utf8               <init>
  #12 = Utf8               ()V
  #13 = Class              #14            // ext/mods/gameserver/data/DocumentItem$NewItem
  #14 = Utf8               ext/mods/gameserver/data/DocumentItem$NewItem
  #15 = Utf8               id
  #16 = Utf8               I
  #17 = Utf8               type
  #18 = Utf8               Ljava/lang/String;
  #19 = Utf8               name
  #20 = Utf8               set
  #21 = Utf8               Lext/mods/commons/data/StatSet;
  #22 = Utf8               currentLevel
  #23 = Utf8               item
  #24 = Utf8               Lext/mods/gameserver/model/item/kind/Item;
  #25 = Utf8               (Lext/mods/gameserver/data/DocumentItem;)V
  #26 = Utf8               Code
  #27 = Utf8               LineNumberTable
  #28 = Utf8               LocalVariableTable
  #29 = Utf8               this
  #30 = Utf8               Lext/mods/gameserver/data/DocumentItem$NewItem;
  #31 = Utf8               this$0
  #32 = Utf8               Lext/mods/gameserver/data/DocumentItem;
  #33 = Utf8               MethodParameters
  #34 = Utf8               SourceFile
  #35 = Utf8               DocumentItem.java
  #36 = Utf8               NestHost
  #37 = Class              #38            // ext/mods/gameserver/data/DocumentItem
  #38 = Utf8               ext/mods/gameserver/data/DocumentItem
  #39 = Utf8               InnerClasses
  #40 = Utf8               NewItem
{
  public int id;
    descriptor: I
    flags: (0x0001) ACC_PUBLIC

  public java.lang.String type;
    descriptor: Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC

  public java.lang.String name;
    descriptor: Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC

  public ext.mods.commons.data.StatSet set;
    descriptor: Lext/mods/commons/data/StatSet;
    flags: (0x0001) ACC_PUBLIC

  public int currentLevel;
    descriptor: I
    flags: (0x0001) ACC_PUBLIC

  public ext.mods.gameserver.model.item.kind.Item item;
    descriptor: Lext/mods/gameserver/model/item/kind/Item;
    flags: (0x0001) ACC_PUBLIC

  public ext.mods.gameserver.data.DocumentItem$NewItem(ext.mods.gameserver.data.DocumentItem);
    descriptor: (Lext/mods/gameserver/data/DocumentItem;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: dup
         2: invokestatic  #1                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
         5: pop
         6: pop
         7: aload_0
         8: invokespecial #7                  // Method java/lang/Object."<init>":()V
        11: return
      LineNumberTable:
        line 36: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/data/DocumentItem$NewItem;
            0      12     1 this$0   Lext/mods/gameserver/data/DocumentItem;
    MethodParameters:
      Name                           Flags
      <no name>                      final mandated
}
SourceFile: "DocumentItem.java"
NestHost: class ext/mods/gameserver/data/DocumentItem
InnerClasses:
  public #40= #13 of #37;                 // NewItem=class ext/mods/gameserver/data/DocumentItem$NewItem of class ext/mods/gameserver/data/DocumentItem
