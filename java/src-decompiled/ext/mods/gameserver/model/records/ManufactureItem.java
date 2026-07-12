// Bytecode for: ext.mods.gameserver.model.records.ManufactureItem
// File: ext\mods\gameserver\model\records\ManufactureItem.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/records/ManufactureItem.class
  Last modified 9 de jul de 2026; size 2095 bytes
  MD5 checksum f536a6bbae078051e2c163469794c9bb
  Compiled from "ManufactureItem.java"
public final class ext.mods.gameserver.model.records.ManufactureItem extends java.lang.Record
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/records/ManufactureItem
  super_class: #2                         // java/lang/Record
  interfaces: 0, fields: 3, methods: 8, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Record."<init>":()V
   #2 = Class              #4             // java/lang/Record
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Record
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/records/ManufactureItem.recipeId:I
   #8 = Class              #10            // ext/mods/gameserver/model/records/ManufactureItem
   #9 = NameAndType        #11:#12        // recipeId:I
  #10 = Utf8               ext/mods/gameserver/model/records/ManufactureItem
  #11 = Utf8               recipeId
  #12 = Utf8               I
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/model/records/ManufactureItem.cost:I
  #14 = NameAndType        #15:#12        // cost:I
  #15 = Utf8               cost
  #16 = Fieldref           #8.#17         // ext/mods/gameserver/model/records/ManufactureItem.isDwarven:Z
  #17 = NameAndType        #18:#19        // isDwarven:Z
  #18 = Utf8               isDwarven
  #19 = Utf8               Z
  #20 = Methodref          #21.#22        // ext/mods/gameserver/data/xml/RecipeData.getInstance:()Lext/mods/gameserver/data/xml/RecipeData;
  #21 = Class              #23            // ext/mods/gameserver/data/xml/RecipeData
  #22 = NameAndType        #24:#25        // getInstance:()Lext/mods/gameserver/data/xml/RecipeData;
  #23 = Utf8               ext/mods/gameserver/data/xml/RecipeData
  #24 = Utf8               getInstance
  #25 = Utf8               ()Lext/mods/gameserver/data/xml/RecipeData;
  #26 = Methodref          #21.#27        // ext/mods/gameserver/data/xml/RecipeData.getRecipeList:(I)Lext/mods/gameserver/model/records/Recipe;
  #27 = NameAndType        #28:#29        // getRecipeList:(I)Lext/mods/gameserver/model/records/Recipe;
  #28 = Utf8               getRecipeList
  #29 = Utf8               (I)Lext/mods/gameserver/model/records/Recipe;
  #30 = Methodref          #31.#32        // ext/mods/gameserver/model/records/Recipe.isDwarven:()Z
  #31 = Class              #33            // ext/mods/gameserver/model/records/Recipe
  #32 = NameAndType        #18:#34        // isDwarven:()Z
  #33 = Utf8               ext/mods/gameserver/model/records/Recipe
  #34 = Utf8               ()Z
  #35 = Methodref          #8.#36         // ext/mods/gameserver/model/records/ManufactureItem."<init>":(IIZ)V
  #36 = NameAndType        #5:#37         // "<init>":(IIZ)V
  #37 = Utf8               (IIZ)V
  #38 = InvokeDynamic      #0:#39         // #0:toString:(Lext/mods/gameserver/model/records/ManufactureItem;)Ljava/lang/String;
  #39 = NameAndType        #40:#41        // toString:(Lext/mods/gameserver/model/records/ManufactureItem;)Ljava/lang/String;
  #40 = Utf8               toString
  #41 = Utf8               (Lext/mods/gameserver/model/records/ManufactureItem;)Ljava/lang/String;
  #42 = InvokeDynamic      #0:#43         // #0:hashCode:(Lext/mods/gameserver/model/records/ManufactureItem;)I
  #43 = NameAndType        #44:#45        // hashCode:(Lext/mods/gameserver/model/records/ManufactureItem;)I
  #44 = Utf8               hashCode
  #45 = Utf8               (Lext/mods/gameserver/model/records/ManufactureItem;)I
  #46 = InvokeDynamic      #0:#47         // #0:equals:(Lext/mods/gameserver/model/records/ManufactureItem;Ljava/lang/Object;)Z
  #47 = NameAndType        #48:#49        // equals:(Lext/mods/gameserver/model/records/ManufactureItem;Ljava/lang/Object;)Z
  #48 = Utf8               equals
  #49 = Utf8               (Lext/mods/gameserver/model/records/ManufactureItem;Ljava/lang/Object;)Z
  #50 = Utf8               (II)V
  #51 = Utf8               Code
  #52 = Utf8               LineNumberTable
  #53 = Utf8               LocalVariableTable
  #54 = Utf8               this
  #55 = Utf8               Lext/mods/gameserver/model/records/ManufactureItem;
  #56 = Utf8               MethodParameters
  #57 = Utf8               ()Ljava/lang/String;
  #58 = Utf8               ()I
  #59 = Utf8               (Ljava/lang/Object;)Z
  #60 = Utf8               o
  #61 = Utf8               Ljava/lang/Object;
  #62 = Utf8               SourceFile
  #63 = Utf8               ManufactureItem.java
  #64 = Utf8               Record
  #65 = Utf8               BootstrapMethods
  #66 = String             #67            // recipeId;cost;isDwarven
  #67 = Utf8               recipeId;cost;isDwarven
  #68 = MethodHandle       1:#7           // REF_getField ext/mods/gameserver/model/records/ManufactureItem.recipeId:I
  #69 = MethodHandle       1:#13          // REF_getField ext/mods/gameserver/model/records/ManufactureItem.cost:I
  #70 = MethodHandle       1:#16          // REF_getField ext/mods/gameserver/model/records/ManufactureItem.isDwarven:Z
  #71 = MethodHandle       6:#72          // REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #72 = Methodref          #73.#74        // java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #73 = Class              #75            // java/lang/runtime/ObjectMethods
  #74 = NameAndType        #76:#77        // bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #75 = Utf8               java/lang/runtime/ObjectMethods
  #76 = Utf8               bootstrap
  #77 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #78 = Utf8               InnerClasses
  #79 = Class              #80            // java/lang/invoke/MethodHandles$Lookup
  #80 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #81 = Class              #82            // java/lang/invoke/MethodHandles
  #82 = Utf8               java/lang/invoke/MethodHandles
  #83 = Utf8               Lookup
{
  public ext.mods.gameserver.model.records.ManufactureItem(int, int);
    descriptor: (II)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: iload_2
         3: invokestatic  #20                 // Method ext/mods/gameserver/data/xml/RecipeData.getInstance:()Lext/mods/gameserver/data/xml/RecipeData;
         6: iload_1
         7: invokevirtual #26                 // Method ext/mods/gameserver/data/xml/RecipeData.getRecipeList:(I)Lext/mods/gameserver/model/records/Recipe;
        10: invokevirtual #30                 // Method ext/mods/gameserver/model/records/Recipe.isDwarven:()Z
        13: invokespecial #35                 // Method "<init>":(IIZ)V
        16: return
      LineNumberTable:
        line 26: 0
        line 27: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/records/ManufactureItem;
            0      17     1 recipeId   I
            0      17     2  cost   I

  public ext.mods.gameserver.model.records.ManufactureItem(int, int, boolean);
    descriptor: (IIZ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=4
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Record."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #7                  // Field recipeId:I
         9: aload_0
        10: iload_2
        11: putfield      #13                 // Field cost:I
        14: aload_0
        15: iload_3
        16: putfield      #16                 // Field isDwarven:Z
        19: return
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/model/records/ManufactureItem;
            0      20     1 recipeId   I
            0      20     2  cost   I
            0      20     3 isDwarven   Z
    MethodParameters:
      Name                           Flags
      recipeId
      cost
      isDwarven

  public final java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #38,  0             // InvokeDynamic #0:toString:(Lext/mods/gameserver/model/records/ManufactureItem;)Ljava/lang/String;
         6: areturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/ManufactureItem;

  public final int hashCode();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #42,  0             // InvokeDynamic #0:hashCode:(Lext/mods/gameserver/model/records/ManufactureItem;)I
         6: ireturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/ManufactureItem;

  public final boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokedynamic #46,  0             // InvokeDynamic #0:equals:(Lext/mods/gameserver/model/records/ManufactureItem;Ljava/lang/Object;)Z
         7: ireturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/records/ManufactureItem;
            0       8     1     o   Ljava/lang/Object;

  public int recipeId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field recipeId:I
         4: ireturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/ManufactureItem;

  public int cost();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field cost:I
         4: ireturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/ManufactureItem;

  public boolean isDwarven();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field isDwarven:Z
         4: ireturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/ManufactureItem;
}
SourceFile: "ManufactureItem.java"
  Record: length = 0x14 (unknown attribute)
   00 03 00 0B 00 0C 00 00 00 0F 00 0C 00 00 00 12
   00 13 00 00
BootstrapMethods:
  0: #71 REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
    Method arguments:
      #8 ext/mods/gameserver/model/records/ManufactureItem
      #66 recipeId;cost;isDwarven
      #68 REF_getField ext/mods/gameserver/model/records/ManufactureItem.recipeId:I
      #69 REF_getField ext/mods/gameserver/model/records/ManufactureItem.cost:I
      #70 REF_getField ext/mods/gameserver/model/records/ManufactureItem.isDwarven:Z
InnerClasses:
  public static final #83= #79 of #81;    // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
