// Bytecode for: ext.mods.gameserver.model.buylist.NpcBuyList
// File: ext\mods\gameserver\model\buylist\NpcBuyList.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/buylist/NpcBuyList.class
  Last modified 9 de jul de 2026; size 1398 bytes
  MD5 checksum 3a371e2a2844375ca5a9e3df01517a31
  Compiled from "NpcBuyList.java"
public class ext.mods.gameserver.model.buylist.NpcBuyList extends java.util.LinkedHashMap<java.lang.Integer, ext.mods.gameserver.model.buylist.Product>
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/buylist/NpcBuyList
  super_class: #2                         // java/util/LinkedHashMap
  interfaces: 0, fields: 3, methods: 6, attributes: 2
Constant pool:
   #1 = Methodref          #2.#3          // java/util/LinkedHashMap."<init>":()V
   #2 = Class              #4             // java/util/LinkedHashMap
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/util/LinkedHashMap
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/buylist/NpcBuyList._listId:I
   #8 = Class              #10            // ext/mods/gameserver/model/buylist/NpcBuyList
   #9 = NameAndType        #11:#12        // _listId:I
  #10 = Utf8               ext/mods/gameserver/model/buylist/NpcBuyList
  #11 = Utf8               _listId
  #12 = Utf8               I
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/model/buylist/NpcBuyList._npcId:I
  #14 = NameAndType        #15:#12        // _npcId:I
  #15 = Utf8               _npcId
  #16 = Methodref          #17.#18        // ext/mods/gameserver/model/buylist/Product.getItemId:()I
  #17 = Class              #19            // ext/mods/gameserver/model/buylist/Product
  #18 = NameAndType        #20:#21        // getItemId:()I
  #19 = Utf8               ext/mods/gameserver/model/buylist/Product
  #20 = Utf8               getItemId
  #21 = Utf8               ()I
  #22 = Methodref          #23.#24        // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #23 = Class              #25            // java/lang/Integer
  #24 = NameAndType        #26:#27        // valueOf:(I)Ljava/lang/Integer;
  #25 = Utf8               java/lang/Integer
  #26 = Utf8               valueOf
  #27 = Utf8               (I)Ljava/lang/Integer;
  #28 = Methodref          #8.#29         // ext/mods/gameserver/model/buylist/NpcBuyList.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #29 = NameAndType        #30:#31        // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #30 = Utf8               put
  #31 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #32 = Utf8               serialVersionUID
  #33 = Utf8               J
  #34 = Utf8               ConstantValue
  #35 = Long               1l
  #37 = Utf8               (I)V
  #38 = Utf8               Code
  #39 = Utf8               LineNumberTable
  #40 = Utf8               LocalVariableTable
  #41 = Utf8               this
  #42 = Utf8               Lext/mods/gameserver/model/buylist/NpcBuyList;
  #43 = Utf8               listId
  #44 = Utf8               getListId
  #45 = Utf8               getNpcId
  #46 = Utf8               setNpcId
  #47 = Utf8               id
  #48 = Utf8               addProduct
  #49 = Utf8               (Lext/mods/gameserver/model/buylist/Product;)V
  #50 = Utf8               product
  #51 = Utf8               Lext/mods/gameserver/model/buylist/Product;
  #52 = Utf8               isNpcAllowed
  #53 = Utf8               (I)Z
  #54 = Utf8               npcId
  #55 = Utf8               StackMapTable
  #56 = Utf8               Signature
  #57 = Utf8               Ljava/util/LinkedHashMap<Ljava/lang/Integer;Lext/mods/gameserver/model/buylist/Product;>;
  #58 = Utf8               SourceFile
  #59 = Utf8               NpcBuyList.java
{
  public ext.mods.gameserver.model.buylist.NpcBuyList(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/util/LinkedHashMap."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #7                  // Field _listId:I
         9: return
      LineNumberTable:
        line 35: 0
        line 36: 4
        line 37: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/buylist/NpcBuyList;
            0      10     1 listId   I

  public int getListId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _listId:I
         4: ireturn
      LineNumberTable:
        line 41: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/buylist/NpcBuyList;

  public int getNpcId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _npcId:I
         4: ireturn
      LineNumberTable:
        line 46: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/buylist/NpcBuyList;

  public void setNpcId(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #13                 // Field _npcId:I
         5: return
      LineNumberTable:
        line 51: 0
        line 52: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/buylist/NpcBuyList;
            0       6     1    id   I

  public void addProduct(ext.mods.gameserver.model.buylist.Product);
    descriptor: (Lext/mods/gameserver/model/buylist/Product;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #16                 // Method ext/mods/gameserver/model/buylist/Product.getItemId:()I
         5: invokestatic  #22                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: aload_1
         9: invokevirtual #28                 // Method put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        12: pop
        13: return
      LineNumberTable:
        line 56: 0
        line 57: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/model/buylist/NpcBuyList;
            0      14     1 product   Lext/mods/gameserver/model/buylist/Product;

  public boolean isNpcAllowed(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #13                 // Field _npcId:I
         4: iload_1
         5: if_icmpne     12
         8: iconst_1
         9: goto          13
        12: iconst_0
        13: ireturn
      LineNumberTable:
        line 61: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/model/buylist/NpcBuyList;
            0      14     1 npcId   I
      StackMapTable: number_of_entries = 2
        frame_type = 12 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
}
Signature: #57                          // Ljava/util/LinkedHashMap<Ljava/lang/Integer;Lext/mods/gameserver/model/buylist/Product;>;
SourceFile: "NpcBuyList.java"
