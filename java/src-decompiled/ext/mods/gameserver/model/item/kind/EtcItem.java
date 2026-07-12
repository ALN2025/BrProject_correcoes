// Bytecode for: ext.mods.gameserver.model.item.kind.EtcItem
// File: ext\mods\gameserver\model\item\kind\EtcItem.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/item/kind/EtcItem.class
  Last modified 9 de jul de 2026; size 2477 bytes
  MD5 checksum 2505d076090cbcce81693a908e70a97f
  Compiled from "EtcItem.java"
public final class ext.mods.gameserver.model.item.kind.EtcItem extends ext.mods.gameserver.model.item.kind.Item
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #22                         // ext/mods/gameserver/model/item/kind/EtcItem
  super_class: #2                         // ext/mods/gameserver/model/item/kind/Item
  interfaces: 0, fields: 4, methods: 8, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/item/kind/Item."<init>":(Lext/mods/commons/data/StatSet;)V
    #2 = Class              #4            // ext/mods/gameserver/model/item/kind/Item
    #3 = NameAndType        #5:#6         // "<init>":(Lext/mods/commons/data/StatSet;)V
    #4 = Utf8               ext/mods/gameserver/model/item/kind/Item
    #5 = Utf8               <init>
    #6 = Utf8               (Lext/mods/commons/data/StatSet;)V
    #7 = String             #8            // etcitem_type
    #8 = Utf8               etcitem_type
    #9 = Class              #10           // ext/mods/gameserver/enums/items/EtcItemType
   #10 = Utf8               ext/mods/gameserver/enums/items/EtcItemType
   #11 = Fieldref           #9.#12        // ext/mods/gameserver/enums/items/EtcItemType.NONE:Lext/mods/gameserver/enums/items/EtcItemType;
   #12 = NameAndType        #13:#14       // NONE:Lext/mods/gameserver/enums/items/EtcItemType;
   #13 = Utf8               NONE
   #14 = Utf8               Lext/mods/gameserver/enums/items/EtcItemType;
   #15 = Methodref          #16.#17       // ext/mods/commons/data/StatSet.getEnum:(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Enum;)Ljava/lang/Enum;
   #16 = Class              #18           // ext/mods/commons/data/StatSet
   #17 = NameAndType        #19:#20       // getEnum:(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Enum;)Ljava/lang/Enum;
   #18 = Utf8               ext/mods/commons/data/StatSet
   #19 = Utf8               getEnum
   #20 = Utf8               (Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Enum;)Ljava/lang/Enum;
   #21 = Fieldref           #22.#23       // ext/mods/gameserver/model/item/kind/EtcItem._type:Lext/mods/gameserver/enums/items/EtcItemType;
   #22 = Class              #24           // ext/mods/gameserver/model/item/kind/EtcItem
   #23 = NameAndType        #25:#14       // _type:Lext/mods/gameserver/enums/items/EtcItemType;
   #24 = Utf8               ext/mods/gameserver/model/item/kind/EtcItem
   #25 = Utf8               _type
   #26 = Fieldref           #27.#28       // ext/mods/gameserver/model/item/kind/EtcItem$1.$SwitchMap$ext$mods$gameserver$enums$items$ActionType:[I
   #27 = Class              #29           // ext/mods/gameserver/model/item/kind/EtcItem$1
   #28 = NameAndType        #30:#31       // $SwitchMap$ext$mods$gameserver$enums$items$ActionType:[I
   #29 = Utf8               ext/mods/gameserver/model/item/kind/EtcItem$1
   #30 = Utf8               $SwitchMap$ext$mods$gameserver$enums$items$ActionType
   #31 = Utf8               [I
   #32 = Methodref          #22.#33       // ext/mods/gameserver/model/item/kind/EtcItem.getDefaultAction:()Lext/mods/gameserver/enums/items/ActionType;
   #33 = NameAndType        #34:#35       // getDefaultAction:()Lext/mods/gameserver/enums/items/ActionType;
   #34 = Utf8               getDefaultAction
   #35 = Utf8               ()Lext/mods/gameserver/enums/items/ActionType;
   #36 = Methodref          #37.#38       // ext/mods/gameserver/enums/items/ActionType.ordinal:()I
   #37 = Class              #39           // ext/mods/gameserver/enums/items/ActionType
   #38 = NameAndType        #40:#41       // ordinal:()I
   #39 = Utf8               ext/mods/gameserver/enums/items/ActionType
   #40 = Utf8               ordinal
   #41 = Utf8               ()I
   #42 = Fieldref           #9.#43        // ext/mods/gameserver/enums/items/EtcItemType.SHOT:Lext/mods/gameserver/enums/items/EtcItemType;
   #43 = NameAndType        #44:#14       // SHOT:Lext/mods/gameserver/enums/items/EtcItemType;
   #44 = Utf8               SHOT
   #45 = Fieldref           #22.#46       // ext/mods/gameserver/model/item/kind/EtcItem._type1:I
   #46 = NameAndType        #47:#48       // _type1:I
   #47 = Utf8               _type1
   #48 = Utf8               I
   #49 = Fieldref           #22.#50       // ext/mods/gameserver/model/item/kind/EtcItem._type2:I
   #50 = NameAndType        #51:#48       // _type2:I
   #51 = Utf8               _type2
   #52 = Methodref          #22.#53       // ext/mods/gameserver/model/item/kind/EtcItem.isQuestItem:()Z
   #53 = NameAndType        #54:#55       // isQuestItem:()Z
   #54 = Utf8               isQuestItem
   #55 = Utf8               ()Z
   #56 = Methodref          #22.#57       // ext/mods/gameserver/model/item/kind/EtcItem.getItemId:()I
   #57 = NameAndType        #58:#41       // getItemId:()I
   #58 = Utf8               getItemId
   #59 = Class              #60           // ext/mods/gameserver/model/itemcontainer/PcInventory
   #60 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
   #61 = String             #62           // handler
   #62 = Utf8               handler
   #63 = Methodref          #16.#64       // ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #64 = NameAndType        #65:#66       // getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #65 = Utf8               getString
   #66 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #67 = Fieldref           #22.#68       // ext/mods/gameserver/model/item/kind/EtcItem._handler:Ljava/lang/String;
   #68 = NameAndType        #69:#70       // _handler:Ljava/lang/String;
   #69 = Utf8               _handler
   #70 = Utf8               Ljava/lang/String;
   #71 = String             #72           // shared_reuse_group
   #72 = Utf8               shared_reuse_group
   #73 = Methodref          #16.#74       // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
   #74 = NameAndType        #75:#76       // getInteger:(Ljava/lang/String;I)I
   #75 = Utf8               getInteger
   #76 = Utf8               (Ljava/lang/String;I)I
   #77 = Fieldref           #22.#78       // ext/mods/gameserver/model/item/kind/EtcItem._sharedReuseGroup:I
   #78 = NameAndType        #79:#48       // _sharedReuseGroup:I
   #79 = Utf8               _sharedReuseGroup
   #80 = String             #81           // reuse_delay
   #81 = Utf8               reuse_delay
   #82 = Fieldref           #22.#83       // ext/mods/gameserver/model/item/kind/EtcItem._reuseDelay:I
   #83 = NameAndType        #84:#48       // _reuseDelay:I
   #84 = Utf8               _reuseDelay
   #85 = Methodref          #22.#86       // ext/mods/gameserver/model/item/kind/EtcItem.getItemType:()Lext/mods/gameserver/enums/items/EtcItemType;
   #86 = NameAndType        #87:#88       // getItemType:()Lext/mods/gameserver/enums/items/EtcItemType;
   #87 = Utf8               getItemType
   #88 = Utf8               ()Lext/mods/gameserver/enums/items/EtcItemType;
   #89 = Fieldref           #9.#90        // ext/mods/gameserver/enums/items/EtcItemType.POTION:Lext/mods/gameserver/enums/items/EtcItemType;
   #90 = NameAndType        #91:#14       // POTION:Lext/mods/gameserver/enums/items/EtcItemType;
   #91 = Utf8               POTION
   #92 = Methodref          #9.#93        // ext/mods/gameserver/enums/items/EtcItemType.mask:()I
   #93 = NameAndType        #94:#41       // mask:()I
   #94 = Utf8               mask
   #95 = Utf8               Code
   #96 = Utf8               LineNumberTable
   #97 = Utf8               LocalVariableTable
   #98 = Utf8               this
   #99 = Utf8               Lext/mods/gameserver/model/item/kind/EtcItem;
  #100 = Utf8               set
  #101 = Utf8               Lext/mods/commons/data/StatSet;
  #102 = Utf8               StackMapTable
  #103 = Utf8               isConsumable
  #104 = Utf8               getItemMask
  #105 = Utf8               getHandlerName
  #106 = Utf8               ()Ljava/lang/String;
  #107 = Utf8               getSharedReuseGroup
  #108 = Utf8               getReuseDelay
  #109 = Utf8               ()Lext/mods/gameserver/enums/items/ItemType;
  #110 = Utf8               SourceFile
  #111 = Utf8               EtcItem.java
  #112 = Utf8               NestMembers
  #113 = Utf8               InnerClasses
{
  public ext.mods.gameserver.model.item.kind.EtcItem(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/item/kind/Item."<init>":(Lext/mods/commons/data/StatSet;)V
         5: aload_0
         6: aload_1
         7: ldc           #7                  // String etcitem_type
         9: ldc           #9                  // class ext/mods/gameserver/enums/items/EtcItemType
        11: getstatic     #11                 // Field ext/mods/gameserver/enums/items/EtcItemType.NONE:Lext/mods/gameserver/enums/items/EtcItemType;
        14: invokevirtual #15                 // Method ext/mods/commons/data/StatSet.getEnum:(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Enum;)Ljava/lang/Enum;
        17: checkcast     #9                  // class ext/mods/gameserver/enums/items/EtcItemType
        20: putfield      #21                 // Field _type:Lext/mods/gameserver/enums/items/EtcItemType;
        23: getstatic     #26                 // Field ext/mods/gameserver/model/item/kind/EtcItem$1.$SwitchMap$ext$mods$gameserver$enums$items$ActionType:[I
        26: aload_0
        27: invokevirtual #32                 // Method getDefaultAction:()Lext/mods/gameserver/enums/items/ActionType;
        30: invokevirtual #36                 // Method ext/mods/gameserver/enums/items/ActionType.ordinal:()I
        33: iaload
        34: tableswitch   { // 1 to 4

                       1: 64

                       2: 64

                       3: 64

                       4: 64
                 default: 71
            }
        64: aload_0
        65: getstatic     #42                 // Field ext/mods/gameserver/enums/items/EtcItemType.SHOT:Lext/mods/gameserver/enums/items/EtcItemType;
        68: putfield      #21                 // Field _type:Lext/mods/gameserver/enums/items/EtcItemType;
        71: aload_0
        72: iconst_4
        73: putfield      #45                 // Field _type1:I
        76: aload_0
        77: iconst_5
        78: putfield      #49                 // Field _type2:I
        81: aload_0
        82: invokevirtual #52                 // Method isQuestItem:()Z
        85: ifeq          96
        88: aload_0
        89: iconst_3
        90: putfield      #49                 // Field _type2:I
        93: goto          120
        96: aload_0
        97: invokevirtual #56                 // Method getItemId:()I
       100: bipush        57
       102: if_icmpeq     115
       105: aload_0
       106: invokevirtual #56                 // Method getItemId:()I
       109: sipush        5575
       112: if_icmpne     120
       115: aload_0
       116: iconst_4
       117: putfield      #49                 // Field _type2:I
       120: aload_0
       121: aload_1
       122: ldc           #61                 // String handler
       124: aconst_null
       125: invokevirtual #63                 // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       128: putfield      #67                 // Field _handler:Ljava/lang/String;
       131: aload_0
       132: aload_1
       133: ldc           #71                 // String shared_reuse_group
       135: iconst_m1
       136: invokevirtual #73                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
       139: putfield      #77                 // Field _sharedReuseGroup:I
       142: aload_0
       143: aload_1
       144: ldc           #80                 // String reuse_delay
       146: iconst_0
       147: invokevirtual #73                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
       150: putfield      #82                 // Field _reuseDelay:I
       153: return
      LineNumberTable:
        line 37: 0
        line 39: 5
        line 41: 23
        line 47: 64
        line 51: 71
        line 52: 76
        line 54: 81
        line 55: 88
        line 56: 96
        line 57: 115
        line 59: 120
        line 60: 131
        line 61: 142
        line 62: 153
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     154     0  this   Lext/mods/gameserver/model/item/kind/EtcItem;
            0     154     1   set   Lext/mods/commons/data/StatSet;
      StackMapTable: number_of_entries = 5
        frame_type = 255 /* full_frame */
          offset_delta = 64
          locals = [ class ext/mods/gameserver/model/item/kind/EtcItem, class ext/mods/commons/data/StatSet ]
          stack = []
        frame_type = 6 /* same */
        frame_type = 24 /* same */
        frame_type = 18 /* same */
        frame_type = 4 /* same */

  public ext.mods.gameserver.enums.items.EtcItemType getItemType();
    descriptor: ()Lext/mods/gameserver/enums/items/EtcItemType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #21                 // Field _type:Lext/mods/gameserver/enums/items/EtcItemType;
         4: areturn
      LineNumberTable:
        line 67: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/kind/EtcItem;

  public final boolean isConsumable();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #85                 // Method getItemType:()Lext/mods/gameserver/enums/items/EtcItemType;
         4: getstatic     #42                 // Field ext/mods/gameserver/enums/items/EtcItemType.SHOT:Lext/mods/gameserver/enums/items/EtcItemType;
         7: if_acmpeq     20
        10: aload_0
        11: invokevirtual #85                 // Method getItemType:()Lext/mods/gameserver/enums/items/EtcItemType;
        14: getstatic     #89                 // Field ext/mods/gameserver/enums/items/EtcItemType.POTION:Lext/mods/gameserver/enums/items/EtcItemType;
        17: if_acmpne     24
        20: iconst_1
        21: goto          25
        24: iconst_0
        25: ireturn
      LineNumberTable:
        line 73: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/item/kind/EtcItem;
      StackMapTable: number_of_entries = 3
        frame_type = 20 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public int getItemMask();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #85                 // Method getItemType:()Lext/mods/gameserver/enums/items/EtcItemType;
         4: invokevirtual #92                 // Method ext/mods/gameserver/enums/items/EtcItemType.mask:()I
         7: ireturn
      LineNumberTable:
        line 79: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/item/kind/EtcItem;

  public java.lang.String getHandlerName();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #67                 // Field _handler:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 87: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/kind/EtcItem;

  public int getSharedReuseGroup();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #77                 // Field _sharedReuseGroup:I
         4: ireturn
      LineNumberTable:
        line 92: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/kind/EtcItem;

  public int getReuseDelay();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #82                 // Field _reuseDelay:I
         4: ireturn
      LineNumberTable:
        line 97: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/kind/EtcItem;

  public ext.mods.gameserver.enums.items.ItemType getItemType();
    descriptor: ()Lext/mods/gameserver/enums/items/ItemType;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #85                 // Method getItemType:()Lext/mods/gameserver/enums/items/EtcItemType;
         4: areturn
      LineNumberTable:
        line 28: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/kind/EtcItem;
}
SourceFile: "EtcItem.java"
NestMembers:
  ext/mods/gameserver/model/item/kind/EtcItem$1
InnerClasses:
  static #27;                             // class ext/mods/gameserver/model/item/kind/EtcItem$1
