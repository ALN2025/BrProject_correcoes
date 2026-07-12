// Bytecode for: ext.mods.gameserver.model.multisell.ListContainer
// File: ext\mods\gameserver\model\multisell\ListContainer.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/multisell/ListContainer.class
  Last modified 9 de jul de 2026; size 1951 bytes
  MD5 checksum 12929a0324f4fd01c1641274a30398a9
  Compiled from "ListContainer.java"
public class ext.mods.gameserver.model.multisell.ListContainer
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/model/multisell/ListContainer
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 5, methods: 10, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Class              #8             // java/util/ArrayList
   #8 = Utf8               java/util/ArrayList
   #9 = Methodref          #7.#3          // java/util/ArrayList."<init>":()V
  #10 = Fieldref           #11.#12        // ext/mods/gameserver/model/multisell/ListContainer._entries:Ljava/util/List;
  #11 = Class              #13            // ext/mods/gameserver/model/multisell/ListContainer
  #12 = NameAndType        #14:#15        // _entries:Ljava/util/List;
  #13 = Utf8               ext/mods/gameserver/model/multisell/ListContainer
  #14 = Utf8               _entries
  #15 = Utf8               Ljava/util/List;
  #16 = Fieldref           #11.#17        // ext/mods/gameserver/model/multisell/ListContainer._id:I
  #17 = NameAndType        #18:#19        // _id:I
  #18 = Utf8               _id
  #19 = Utf8               I
  #20 = Fieldref           #11.#21        // ext/mods/gameserver/model/multisell/ListContainer._applyTaxes:Z
  #21 = NameAndType        #22:#23        // _applyTaxes:Z
  #22 = Utf8               _applyTaxes
  #23 = Utf8               Z
  #24 = Fieldref           #11.#25        // ext/mods/gameserver/model/multisell/ListContainer._maintainEnchantment:Z
  #25 = NameAndType        #26:#23        // _maintainEnchantment:Z
  #26 = Utf8               _maintainEnchantment
  #27 = Fieldref           #11.#28        // ext/mods/gameserver/model/multisell/ListContainer._npcsAllowed:Ljava/util/Set;
  #28 = NameAndType        #29:#30        // _npcsAllowed:Ljava/util/Set;
  #29 = Utf8               _npcsAllowed
  #30 = Utf8               Ljava/util/Set;
  #31 = Class              #32            // java/util/HashSet
  #32 = Utf8               java/util/HashSet
  #33 = Methodref          #31.#3         // java/util/HashSet."<init>":()V
  #34 = Methodref          #35.#36        // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #35 = Class              #37            // java/lang/Integer
  #36 = NameAndType        #38:#39        // valueOf:(I)Ljava/lang/Integer;
  #37 = Utf8               java/lang/Integer
  #38 = Utf8               valueOf
  #39 = Utf8               (I)Ljava/lang/Integer;
  #40 = InterfaceMethodref #41.#42        // java/util/Set.add:(Ljava/lang/Object;)Z
  #41 = Class              #43            // java/util/Set
  #42 = NameAndType        #44:#45        // add:(Ljava/lang/Object;)Z
  #43 = Utf8               java/util/Set
  #44 = Utf8               add
  #45 = Utf8               (Ljava/lang/Object;)Z
  #46 = InterfaceMethodref #41.#47        // java/util/Set.contains:(Ljava/lang/Object;)Z
  #47 = NameAndType        #48:#45        // contains:(Ljava/lang/Object;)Z
  #48 = Utf8               contains
  #49 = Utf8               Signature
  #50 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/multisell/Entry;>;
  #51 = Utf8               Ljava/util/Set<Ljava/lang/Integer;>;
  #52 = Utf8               (I)V
  #53 = Utf8               Code
  #54 = Utf8               LineNumberTable
  #55 = Utf8               LocalVariableTable
  #56 = Utf8               this
  #57 = Utf8               Lext/mods/gameserver/model/multisell/ListContainer;
  #58 = Utf8               id
  #59 = Utf8               getEntries
  #60 = Utf8               ()Ljava/util/List;
  #61 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/model/multisell/Entry;>;
  #62 = Utf8               getId
  #63 = Utf8               ()I
  #64 = Utf8               getApplyTaxes
  #65 = Utf8               ()Z
  #66 = Utf8               setApplyTaxes
  #67 = Utf8               (Z)V
  #68 = Utf8               applyTaxes
  #69 = Utf8               getMaintainEnchantment
  #70 = Utf8               setMaintainEnchantment
  #71 = Utf8               maintainEnchantment
  #72 = Utf8               allowNpc
  #73 = Utf8               npcId
  #74 = Utf8               StackMapTable
  #75 = Utf8               isNpcAllowed
  #76 = Utf8               (I)Z
  #77 = Utf8               isNpcOnly
  #78 = Utf8               SourceFile
  #79 = Utf8               ListContainer.java
{
  protected java.util.List<ext.mods.gameserver.model.multisell.Entry> _entries;
    descriptor: Ljava/util/List;
    flags: (0x0004) ACC_PROTECTED
    Signature: #50                          // Ljava/util/List<Lext/mods/gameserver/model/multisell/Entry;>;

  protected java.util.Set<java.lang.Integer> _npcsAllowed;
    descriptor: Ljava/util/Set;
    flags: (0x0004) ACC_PROTECTED
    Signature: #51                          // Ljava/util/Set<Ljava/lang/Integer;>;

  public ext.mods.gameserver.model.multisell.ListContainer(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/ArrayList
         8: dup
         9: invokespecial #9                  // Method java/util/ArrayList."<init>":()V
        12: putfield      #10                 // Field _entries:Ljava/util/List;
        15: aload_0
        16: iload_1
        17: putfield      #16                 // Field _id:I
        20: return
      LineNumberTable:
        line 41: 0
        line 37: 4
        line 42: 15
        line 43: 20
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/model/multisell/ListContainer;
            0      21     1    id   I

  public final java.util.List<ext.mods.gameserver.model.multisell.Entry> getEntries();
    descriptor: ()Ljava/util/List;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _entries:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 47: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/multisell/ListContainer;
    Signature: #61                          // ()Ljava/util/List<Lext/mods/gameserver/model/multisell/Entry;>;

  public final int getId();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field _id:I
         4: ireturn
      LineNumberTable:
        line 52: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/multisell/ListContainer;

  public final boolean getApplyTaxes();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #20                 // Field _applyTaxes:Z
         4: ireturn
      LineNumberTable:
        line 57: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/multisell/ListContainer;

  public final void setApplyTaxes(boolean);
    descriptor: (Z)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #20                 // Field _applyTaxes:Z
         5: return
      LineNumberTable:
        line 62: 0
        line 63: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/multisell/ListContainer;
            0       6     1 applyTaxes   Z

  public final boolean getMaintainEnchantment();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #24                 // Field _maintainEnchantment:Z
         4: ireturn
      LineNumberTable:
        line 67: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/multisell/ListContainer;

  public final void setMaintainEnchantment(boolean);
    descriptor: (Z)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #24                 // Field _maintainEnchantment:Z
         5: return
      LineNumberTable:
        line 72: 0
        line 73: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/multisell/ListContainer;
            0       6     1 maintainEnchantment   Z

  public void allowNpc(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: getfield      #27                 // Field _npcsAllowed:Ljava/util/Set;
         4: ifnonnull     18
         7: aload_0
         8: new           #31                 // class java/util/HashSet
        11: dup
        12: invokespecial #33                 // Method java/util/HashSet."<init>":()V
        15: putfield      #27                 // Field _npcsAllowed:Ljava/util/Set;
        18: aload_0
        19: getfield      #27                 // Field _npcsAllowed:Ljava/util/Set;
        22: iload_1
        23: invokestatic  #34                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        26: invokeinterface #40,  2           // InterfaceMethod java/util/Set.add:(Ljava/lang/Object;)Z
        31: pop
        32: return
      LineNumberTable:
        line 77: 0
        line 78: 7
        line 80: 18
        line 81: 32
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lext/mods/gameserver/model/multisell/ListContainer;
            0      33     1 npcId   I
      StackMapTable: number_of_entries = 1
        frame_type = 18 /* same */

  public boolean isNpcAllowed(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #27                 // Field _npcsAllowed:Ljava/util/Set;
         4: ifnull        23
         7: aload_0
         8: getfield      #27                 // Field _npcsAllowed:Ljava/util/Set;
        11: iload_1
        12: invokestatic  #34                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        15: invokeinterface #46,  2           // InterfaceMethod java/util/Set.contains:(Ljava/lang/Object;)Z
        20: ifeq          27
        23: iconst_1
        24: goto          28
        27: iconst_0
        28: ireturn
      LineNumberTable:
        line 85: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/model/multisell/ListContainer;
            0      29     1 npcId   I
      StackMapTable: number_of_entries = 3
        frame_type = 23 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean isNpcOnly();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #27                 // Field _npcsAllowed:Ljava/util/Set;
         4: ifnull        11
         7: iconst_1
         8: goto          12
        11: iconst_0
        12: ireturn
      LineNumberTable:
        line 90: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/multisell/ListContainer;
      StackMapTable: number_of_entries = 2
        frame_type = 11 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
}
SourceFile: "ListContainer.java"
