// Bytecode for: ext.mods.gameserver.model.multisell.Entry
// File: ext\mods\gameserver\model\multisell\Entry.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/multisell/Entry.class
  Last modified 9 de jul de 2026; size 2146 bytes
  MD5 checksum e6308887b1e905a55f328157cf241aa0
  Compiled from "Entry.java"
public class ext.mods.gameserver.model.multisell.Entry
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/multisell/Entry
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 3, methods: 6, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/multisell/Entry._stackable:Z
   #8 = Class              #10            // ext/mods/gameserver/model/multisell/Entry
   #9 = NameAndType        #11:#12        // _stackable:Z
  #10 = Utf8               ext/mods/gameserver/model/multisell/Entry
  #11 = Utf8               _stackable
  #12 = Utf8               Z
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/model/multisell/Entry._ingredients:Ljava/util/List;
  #14 = NameAndType        #15:#16        // _ingredients:Ljava/util/List;
  #15 = Utf8               _ingredients
  #16 = Utf8               Ljava/util/List;
  #17 = Fieldref           #8.#18         // ext/mods/gameserver/model/multisell/Entry._products:Ljava/util/List;
  #18 = NameAndType        #19:#16        // _products:Ljava/util/List;
  #19 = Utf8               _products
  #20 = InterfaceMethodref #21.#22        // java/util/List.stream:()Ljava/util/stream/Stream;
  #21 = Class              #23            // java/util/List
  #22 = NameAndType        #24:#25        // stream:()Ljava/util/stream/Stream;
  #23 = Utf8               java/util/List
  #24 = Utf8               stream
  #25 = Utf8               ()Ljava/util/stream/Stream;
  #26 = InvokeDynamic      #0:#27         // #0:test:()Ljava/util/function/Predicate;
  #27 = NameAndType        #28:#29        // test:()Ljava/util/function/Predicate;
  #28 = Utf8               test
  #29 = Utf8               ()Ljava/util/function/Predicate;
  #30 = InterfaceMethodref #31.#32        // java/util/stream/Stream.allMatch:(Ljava/util/function/Predicate;)Z
  #31 = Class              #33            // java/util/stream/Stream
  #32 = NameAndType        #34:#35        // allMatch:(Ljava/util/function/Predicate;)Z
  #33 = Utf8               java/util/stream/Stream
  #34 = Utf8               allMatch
  #35 = Utf8               (Ljava/util/function/Predicate;)Z
  #36 = Utf8               Signature
  #37 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/multisell/Ingredient;>;
  #38 = Utf8               (Ljava/util/List;Ljava/util/List;)V
  #39 = Utf8               Code
  #40 = Utf8               LineNumberTable
  #41 = Utf8               LocalVariableTable
  #42 = Utf8               this
  #43 = Utf8               Lext/mods/gameserver/model/multisell/Entry;
  #44 = Utf8               ingredients
  #45 = Utf8               products
  #46 = Utf8               LocalVariableTypeTable
  #47 = Utf8               (Ljava/util/List<Lext/mods/gameserver/model/multisell/Ingredient;>;Ljava/util/List<Lext/mods/gameserver/model/multisell/Ingredient;>;)V
  #48 = Utf8               getProducts
  #49 = Utf8               ()Ljava/util/List;
  #50 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/model/multisell/Ingredient;>;
  #51 = Utf8               getIngredients
  #52 = Utf8               isStackable
  #53 = Utf8               ()Z
  #54 = Utf8               getTaxAmount
  #55 = Utf8               ()I
  #56 = Utf8               SourceFile
  #57 = Utf8               Entry.java
  #58 = Utf8               BootstrapMethods
  #59 = MethodType         #60            //  (Ljava/lang/Object;)Z
  #60 = Utf8               (Ljava/lang/Object;)Z
  #61 = MethodHandle       5:#62          // REF_invokeVirtual ext/mods/gameserver/model/multisell/Ingredient.isStackable:()Z
  #62 = Methodref          #63.#64        // ext/mods/gameserver/model/multisell/Ingredient.isStackable:()Z
  #63 = Class              #65            // ext/mods/gameserver/model/multisell/Ingredient
  #64 = NameAndType        #52:#53        // isStackable:()Z
  #65 = Utf8               ext/mods/gameserver/model/multisell/Ingredient
  #66 = MethodType         #67            //  (Lext/mods/gameserver/model/multisell/Ingredient;)Z
  #67 = Utf8               (Lext/mods/gameserver/model/multisell/Ingredient;)Z
  #68 = MethodHandle       6:#69          // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #69 = Methodref          #70.#71        // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #70 = Class              #72            // java/lang/invoke/LambdaMetafactory
  #71 = NameAndType        #73:#74        // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #72 = Utf8               java/lang/invoke/LambdaMetafactory
  #73 = Utf8               metafactory
  #74 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #75 = Utf8               InnerClasses
  #76 = Class              #77            // java/lang/invoke/MethodHandles$Lookup
  #77 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #78 = Class              #79            // java/lang/invoke/MethodHandles
  #79 = Utf8               java/lang/invoke/MethodHandles
  #80 = Utf8               Lookup
{
  protected java.util.List<ext.mods.gameserver.model.multisell.Ingredient> _ingredients;
    descriptor: Ljava/util/List;
    flags: (0x0004) ACC_PROTECTED
    Signature: #37                          // Ljava/util/List<Lext/mods/gameserver/model/multisell/Ingredient;>;

  protected java.util.List<ext.mods.gameserver.model.multisell.Ingredient> _products;
    descriptor: Ljava/util/List;
    flags: (0x0004) ACC_PROTECTED
    Signature: #37                          // Ljava/util/List<Lext/mods/gameserver/model/multisell/Ingredient;>;

  protected boolean _stackable;
    descriptor: Z
    flags: (0x0004) ACC_PROTECTED

  public ext.mods.gameserver.model.multisell.Entry(java.util.List<ext.mods.gameserver.model.multisell.Ingredient>, java.util.List<ext.mods.gameserver.model.multisell.Ingredient>);
    descriptor: (Ljava/util/List;Ljava/util/List;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iconst_1
         6: putfield      #7                  // Field _stackable:Z
         9: aload_0
        10: aload_1
        11: putfield      #13                 // Field _ingredients:Ljava/util/List;
        14: aload_0
        15: aload_2
        16: putfield      #17                 // Field _products:Ljava/util/List;
        19: aload_0
        20: aload_2
        21: invokeinterface #20,  1           // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
        26: invokedynamic #26,  0             // InvokeDynamic #0:test:()Ljava/util/function/Predicate;
        31: invokeinterface #30,  2           // InterfaceMethod java/util/stream/Stream.allMatch:(Ljava/util/function/Predicate;)Z
        36: putfield      #7                  // Field _stackable:Z
        39: return
      LineNumberTable:
        line 33: 0
        line 30: 4
        line 34: 9
        line 35: 14
        line 36: 19
        line 37: 39
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      40     0  this   Lext/mods/gameserver/model/multisell/Entry;
            0      40     1 ingredients   Ljava/util/List;
            0      40     2 products   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      40     1 ingredients   Ljava/util/List<Lext/mods/gameserver/model/multisell/Ingredient;>;
            0      40     2 products   Ljava/util/List<Lext/mods/gameserver/model/multisell/Ingredient;>;
    Signature: #47                          // (Ljava/util/List<Lext/mods/gameserver/model/multisell/Ingredient;>;Ljava/util/List<Lext/mods/gameserver/model/multisell/Ingredient;>;)V

  protected ext.mods.gameserver.model.multisell.Entry();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iconst_1
         6: putfield      #7                  // Field _stackable:Z
         9: return
      LineNumberTable:
        line 43: 0
        line 30: 4
        line 44: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/multisell/Entry;

  public java.util.List<ext.mods.gameserver.model.multisell.Ingredient> getProducts();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field _products:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 48: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/multisell/Entry;
    Signature: #50                          // ()Ljava/util/List<Lext/mods/gameserver/model/multisell/Ingredient;>;

  public java.util.List<ext.mods.gameserver.model.multisell.Ingredient> getIngredients();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _ingredients:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 53: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/multisell/Entry;
    Signature: #50                          // ()Ljava/util/List<Lext/mods/gameserver/model/multisell/Ingredient;>;

  public boolean isStackable();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _stackable:Z
         4: ireturn
      LineNumberTable:
        line 58: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/multisell/Entry;

  public int getTaxAmount();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 63: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/multisell/Entry;
}
SourceFile: "Entry.java"
BootstrapMethods:
  0: #68 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #59 (Ljava/lang/Object;)Z
      #61 REF_invokeVirtual ext/mods/gameserver/model/multisell/Ingredient.isStackable:()Z
      #66 (Lext/mods/gameserver/model/multisell/Ingredient;)Z
InnerClasses:
  public static final #80= #76 of #78;    // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
