// Bytecode for: ext.mods.gameserver.model.multisell.PreparedEntry
// File: ext\mods\gameserver\model\multisell\PreparedEntry.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/multisell/PreparedEntry.class
  Last modified 9 de jul de 2026; size 2325 bytes
  MD5 checksum a594c06a956fa6470182e1305303a29d
  Compiled from "PreparedEntry.java"
public class ext.mods.gameserver.model.multisell.PreparedEntry extends ext.mods.gameserver.model.multisell.Entry
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/multisell/PreparedEntry
  super_class: #2                         // ext/mods/gameserver/model/multisell/Entry
  interfaces: 0, fields: 1, methods: 2, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/multisell/Entry."<init>":()V
    #2 = Class              #4            // ext/mods/gameserver/model/multisell/Entry
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               ext/mods/gameserver/model/multisell/Entry
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/multisell/PreparedEntry._taxAmount:I
    #8 = Class              #10           // ext/mods/gameserver/model/multisell/PreparedEntry
    #9 = NameAndType        #11:#12       // _taxAmount:I
   #10 = Utf8               ext/mods/gameserver/model/multisell/PreparedEntry
   #11 = Utf8               _taxAmount
   #12 = Utf8               I
   #13 = Class              #14           // java/util/ArrayList
   #14 = Utf8               java/util/ArrayList
   #15 = Methodref          #2.#16        // ext/mods/gameserver/model/multisell/Entry.getIngredients:()Ljava/util/List;
   #16 = NameAndType        #17:#18       // getIngredients:()Ljava/util/List;
   #17 = Utf8               getIngredients
   #18 = Utf8               ()Ljava/util/List;
   #19 = InterfaceMethodref #20.#21       // java/util/List.size:()I
   #20 = Class              #22           // java/util/List
   #21 = NameAndType        #23:#24       // size:()I
   #22 = Utf8               java/util/List
   #23 = Utf8               size
   #24 = Utf8               ()I
   #25 = Methodref          #13.#26       // java/util/ArrayList."<init>":(I)V
   #26 = NameAndType        #5:#27        // "<init>":(I)V
   #27 = Utf8               (I)V
   #28 = Fieldref           #8.#29        // ext/mods/gameserver/model/multisell/PreparedEntry._ingredients:Ljava/util/List;
   #29 = NameAndType        #30:#31       // _ingredients:Ljava/util/List;
   #30 = Utf8               _ingredients
   #31 = Utf8               Ljava/util/List;
   #32 = InterfaceMethodref #20.#33       // java/util/List.iterator:()Ljava/util/Iterator;
   #33 = NameAndType        #34:#35       // iterator:()Ljava/util/Iterator;
   #34 = Utf8               iterator
   #35 = Utf8               ()Ljava/util/Iterator;
   #36 = InterfaceMethodref #37.#38       // java/util/Iterator.hasNext:()Z
   #37 = Class              #39           // java/util/Iterator
   #38 = NameAndType        #40:#41       // hasNext:()Z
   #39 = Utf8               java/util/Iterator
   #40 = Utf8               hasNext
   #41 = Utf8               ()Z
   #42 = InterfaceMethodref #37.#43       // java/util/Iterator.next:()Ljava/lang/Object;
   #43 = NameAndType        #44:#45       // next:()Ljava/lang/Object;
   #44 = Utf8               next
   #45 = Utf8               ()Ljava/lang/Object;
   #46 = Class              #47           // ext/mods/gameserver/model/multisell/Ingredient
   #47 = Utf8               ext/mods/gameserver/model/multisell/Ingredient
   #48 = Methodref          #46.#49       // ext/mods/gameserver/model/multisell/Ingredient.getItemId:()I
   #49 = NameAndType        #50:#24       // getItemId:()I
   #50 = Utf8               getItemId
   #51 = Methodref          #46.#52       // ext/mods/gameserver/model/multisell/Ingredient.isTaxIngredient:()Z
   #52 = NameAndType        #53:#41       // isTaxIngredient:()Z
   #53 = Utf8               isTaxIngredient
   #54 = Methodref          #46.#55       // ext/mods/gameserver/model/multisell/Ingredient.getItemCount:()I
   #55 = NameAndType        #56:#24       // getItemCount:()I
   #56 = Utf8               getItemCount
   #57 = Methodref          #58.#59       // java/lang/Math.round:(D)J
   #58 = Class              #60           // java/lang/Math
   #59 = NameAndType        #61:#62       // round:(D)J
   #60 = Utf8               java/lang/Math
   #61 = Utf8               round
   #62 = Utf8               (D)J
   #63 = Methodref          #46.#64       // ext/mods/gameserver/model/multisell/Ingredient.getCopy:()Lext/mods/gameserver/model/multisell/Ingredient;
   #64 = NameAndType        #65:#66       // getCopy:()Lext/mods/gameserver/model/multisell/Ingredient;
   #65 = Utf8               getCopy
   #66 = Utf8               ()Lext/mods/gameserver/model/multisell/Ingredient;
   #67 = Methodref          #46.#68       // ext/mods/gameserver/model/multisell/Ingredient.isArmorOrWeapon:()Z
   #68 = NameAndType        #69:#41       // isArmorOrWeapon:()Z
   #69 = Utf8               isArmorOrWeapon
   #70 = Methodref          #71.#72       // ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
   #71 = Class              #73           // ext/mods/gameserver/model/item/instance/ItemInstance
   #72 = NameAndType        #74:#24       // getEnchantLevel:()I
   #73 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
   #74 = Utf8               getEnchantLevel
   #75 = Methodref          #46.#76       // ext/mods/gameserver/model/multisell/Ingredient.setEnchantLevel:(I)V
   #76 = NameAndType        #77:#27       // setEnchantLevel:(I)V
   #77 = Utf8               setEnchantLevel
   #78 = InterfaceMethodref #20.#79       // java/util/List.add:(Ljava/lang/Object;)Z
   #79 = NameAndType        #80:#81       // add:(Ljava/lang/Object;)Z
   #80 = Utf8               add
   #81 = Utf8               (Ljava/lang/Object;)Z
   #82 = Methodref          #46.#83       // ext/mods/gameserver/model/multisell/Ingredient."<init>":(IIIZZ)V
   #83 = NameAndType        #5:#84        // "<init>":(IIIZZ)V
   #84 = Utf8               (IIIZZ)V
   #85 = Methodref          #2.#86        // ext/mods/gameserver/model/multisell/Entry.getProducts:()Ljava/util/List;
   #86 = NameAndType        #87:#18       // getProducts:()Ljava/util/List;
   #87 = Utf8               getProducts
   #88 = Fieldref           #8.#89        // ext/mods/gameserver/model/multisell/PreparedEntry._products:Ljava/util/List;
   #89 = NameAndType        #90:#31       // _products:Ljava/util/List;
   #90 = Utf8               _products
   #91 = Methodref          #46.#92       // ext/mods/gameserver/model/multisell/Ingredient.isStackable:()Z
   #92 = NameAndType        #93:#41       // isStackable:()Z
   #93 = Utf8               isStackable
   #94 = Fieldref           #8.#95        // ext/mods/gameserver/model/multisell/PreparedEntry._stackable:Z
   #95 = NameAndType        #96:#97       // _stackable:Z
   #96 = Utf8               _stackable
   #97 = Utf8               Z
   #98 = Utf8               (Lext/mods/gameserver/model/multisell/Entry;Lext/mods/gameserver/model/item/instance/ItemInstance;ZZD)V
   #99 = Utf8               Code
  #100 = Utf8               LineNumberTable
  #101 = Utf8               LocalVariableTable
  #102 = Utf8               newIngredient
  #103 = Utf8               Lext/mods/gameserver/model/multisell/Ingredient;
  #104 = Utf8               ing
  #105 = Utf8               newProduct
  #106 = Utf8               this
  #107 = Utf8               Lext/mods/gameserver/model/multisell/PreparedEntry;
  #108 = Utf8               template
  #109 = Utf8               Lext/mods/gameserver/model/multisell/Entry;
  #110 = Utf8               item
  #111 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #112 = Utf8               applyTaxes
  #113 = Utf8               maintainEnchantment
  #114 = Utf8               taxRate
  #115 = Utf8               D
  #116 = Utf8               adenaAmount
  #117 = Utf8               StackMapTable
  #118 = Utf8               getTaxAmount
  #119 = Utf8               SourceFile
  #120 = Utf8               PreparedEntry.java
{
  public ext.mods.gameserver.model.multisell.PreparedEntry(ext.mods.gameserver.model.multisell.Entry, ext.mods.gameserver.model.item.instance.ItemInstance, boolean, boolean, double);
    descriptor: (Lext/mods/gameserver/model/multisell/Entry;Lext/mods/gameserver/model/item/instance/ItemInstance;ZZD)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=11, args_size=6
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/model/multisell/Entry."<init>":()V
         4: aload_0
         5: iconst_0
         6: putfield      #7                  // Field _taxAmount:I
         9: iconst_0
        10: istore        7
        12: aload_0
        13: new           #13                 // class java/util/ArrayList
        16: dup
        17: aload_1
        18: invokevirtual #15                 // Method ext/mods/gameserver/model/multisell/Entry.getIngredients:()Ljava/util/List;
        21: invokeinterface #19,  1           // InterfaceMethod java/util/List.size:()I
        26: invokespecial #25                 // Method java/util/ArrayList."<init>":(I)V
        29: putfield      #28                 // Field _ingredients:Ljava/util/List;
        32: aload_1
        33: invokevirtual #15                 // Method ext/mods/gameserver/model/multisell/Entry.getIngredients:()Ljava/util/List;
        36: invokeinterface #32,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        41: astore        8
        43: aload         8
        45: invokeinterface #36,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        50: ifeq          174
        53: aload         8
        55: invokeinterface #42,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        60: checkcast     #46                 // class ext/mods/gameserver/model/multisell/Ingredient
        63: astore        9
        65: aload         9
        67: invokevirtual #48                 // Method ext/mods/gameserver/model/multisell/Ingredient.getItemId:()I
        70: bipush        57
        72: if_icmpne     126
        75: aload         9
        77: invokevirtual #51                 // Method ext/mods/gameserver/model/multisell/Ingredient.isTaxIngredient:()Z
        80: ifeq          113
        83: iload_3
        84: ifeq          43
        87: aload_0
        88: dup
        89: getfield      #7                  // Field _taxAmount:I
        92: i2l
        93: aload         9
        95: invokevirtual #54                 // Method ext/mods/gameserver/model/multisell/Ingredient.getItemCount:()I
        98: i2d
        99: dload         5
       101: dmul
       102: invokestatic  #57                 // Method java/lang/Math.round:(D)J
       105: ladd
       106: l2i
       107: putfield      #7                  // Field _taxAmount:I
       110: goto          43
       113: iload         7
       115: aload         9
       117: invokevirtual #54                 // Method ext/mods/gameserver/model/multisell/Ingredient.getItemCount:()I
       120: iadd
       121: istore        7
       123: goto          43
       126: aload         9
       128: invokevirtual #63                 // Method ext/mods/gameserver/model/multisell/Ingredient.getCopy:()Lext/mods/gameserver/model/multisell/Ingredient;
       131: astore        10
       133: iload         4
       135: ifeq          159
       138: aload_2
       139: ifnull        159
       142: aload         9
       144: invokevirtual #67                 // Method ext/mods/gameserver/model/multisell/Ingredient.isArmorOrWeapon:()Z
       147: ifeq          159
       150: aload         10
       152: aload_2
       153: invokevirtual #70                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
       156: invokevirtual #75                 // Method ext/mods/gameserver/model/multisell/Ingredient.setEnchantLevel:(I)V
       159: aload_0
       160: getfield      #28                 // Field _ingredients:Ljava/util/List;
       163: aload         10
       165: invokeinterface #78,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       170: pop
       171: goto          43
       174: iload         7
       176: aload_0
       177: getfield      #7                  // Field _taxAmount:I
       180: iadd
       181: istore        7
       183: iload         7
       185: ifle          212
       188: aload_0
       189: getfield      #28                 // Field _ingredients:Ljava/util/List;
       192: new           #46                 // class ext/mods/gameserver/model/multisell/Ingredient
       195: dup
       196: bipush        57
       198: iload         7
       200: iconst_0
       201: iconst_0
       202: iconst_0
       203: invokespecial #82                 // Method ext/mods/gameserver/model/multisell/Ingredient."<init>":(IIIZZ)V
       206: invokeinterface #78,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       211: pop
       212: aload_0
       213: new           #13                 // class java/util/ArrayList
       216: dup
       217: aload_1
       218: invokevirtual #85                 // Method ext/mods/gameserver/model/multisell/Entry.getProducts:()Ljava/util/List;
       221: invokeinterface #19,  1           // InterfaceMethod java/util/List.size:()I
       226: invokespecial #25                 // Method java/util/ArrayList."<init>":(I)V
       229: putfield      #88                 // Field _products:Ljava/util/List;
       232: aload_1
       233: invokevirtual #85                 // Method ext/mods/gameserver/model/multisell/Entry.getProducts:()Ljava/util/List;
       236: invokeinterface #32,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       241: astore        8
       243: aload         8
       245: invokeinterface #36,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       250: ifeq          326
       253: aload         8
       255: invokeinterface #42,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       260: checkcast     #46                 // class ext/mods/gameserver/model/multisell/Ingredient
       263: astore        9
       265: aload         9
       267: invokevirtual #91                 // Method ext/mods/gameserver/model/multisell/Ingredient.isStackable:()Z
       270: ifne          278
       273: aload_0
       274: iconst_0
       275: putfield      #94                 // Field _stackable:Z
       278: aload         9
       280: invokevirtual #63                 // Method ext/mods/gameserver/model/multisell/Ingredient.getCopy:()Lext/mods/gameserver/model/multisell/Ingredient;
       283: astore        10
       285: iload         4
       287: ifeq          311
       290: aload_2
       291: ifnull        311
       294: aload         9
       296: invokevirtual #67                 // Method ext/mods/gameserver/model/multisell/Ingredient.isArmorOrWeapon:()Z
       299: ifeq          311
       302: aload         10
       304: aload_2
       305: invokevirtual #70                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
       308: invokevirtual #75                 // Method ext/mods/gameserver/model/multisell/Ingredient.setEnchantLevel:(I)V
       311: aload_0
       312: getfield      #88                 // Field _products:Ljava/util/List;
       315: aload         10
       317: invokeinterface #78,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       322: pop
       323: goto          243
       326: return
      LineNumberTable:
        line 32: 0
        line 29: 4
        line 33: 9
        line 35: 12
        line 36: 32
        line 38: 65
        line 40: 75
        line 42: 83
        line 43: 87
        line 46: 113
        line 48: 123
        line 51: 126
        line 52: 133
        line 53: 150
        line 55: 159
        line 56: 171
        line 58: 174
        line 59: 183
        line 60: 188
        line 62: 212
        line 63: 232
        line 65: 265
        line 66: 273
        line 68: 278
        line 69: 285
        line 70: 302
        line 72: 311
        line 73: 323
        line 74: 326
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          133      38    10 newIngredient   Lext/mods/gameserver/model/multisell/Ingredient;
           65     106     9   ing   Lext/mods/gameserver/model/multisell/Ingredient;
          285      38    10 newProduct   Lext/mods/gameserver/model/multisell/Ingredient;
          265      58     9   ing   Lext/mods/gameserver/model/multisell/Ingredient;
            0     327     0  this   Lext/mods/gameserver/model/multisell/PreparedEntry;
            0     327     1 template   Lext/mods/gameserver/model/multisell/Entry;
            0     327     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0     327     3 applyTaxes   Z
            0     327     4 maintainEnchantment   Z
            0     327     5 taxRate   D
           12     315     7 adenaAmount   I
      StackMapTable: number_of_entries = 10
        frame_type = 255 /* full_frame */
          offset_delta = 43
          locals = [ class ext/mods/gameserver/model/multisell/PreparedEntry, class ext/mods/gameserver/model/multisell/Entry, class ext/mods/gameserver/model/item/instance/ItemInstance, int, int, double, int, class java/util/Iterator ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 69
          locals = [ class ext/mods/gameserver/model/multisell/Ingredient ]
        frame_type = 12 /* same */
        frame_type = 252 /* append */
          offset_delta = 32
          locals = [ class ext/mods/gameserver/model/multisell/Ingredient ]
        frame_type = 248 /* chop */
          offset_delta = 14
        frame_type = 37 /* same */
        frame_type = 252 /* append */
          offset_delta = 30
          locals = [ class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 34
          locals = [ class ext/mods/gameserver/model/multisell/Ingredient ]
        frame_type = 252 /* append */
          offset_delta = 32
          locals = [ class ext/mods/gameserver/model/multisell/Ingredient ]
        frame_type = 248 /* chop */
          offset_delta = 14

  public final int getTaxAmount();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _taxAmount:I
         4: ireturn
      LineNumberTable:
        line 79: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/multisell/PreparedEntry;
}
SourceFile: "PreparedEntry.java"
