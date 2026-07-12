// Bytecode for: ext.mods.gameserver.model.records.Recipe
// File: ext\mods\gameserver\model\records\Recipe.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/records/Recipe.class
  Last modified 9 de jul de 2026; size 3700 bytes
  MD5 checksum 87aaf7d1c17ba8b414e542719f708642
  Compiled from "Recipe.java"
public final class ext.mods.gameserver.model.records.Recipe extends java.lang.Record
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/records/Recipe
  super_class: #2                         // java/lang/Record
  interfaces: 0, fields: 9, methods: 14, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Record."<init>":()V
    #2 = Class              #4            // java/lang/Record
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Record
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/records/Recipe.materials:Ljava/util/List;
    #8 = Class              #10           // ext/mods/gameserver/model/records/Recipe
    #9 = NameAndType        #11:#12       // materials:Ljava/util/List;
   #10 = Utf8               ext/mods/gameserver/model/records/Recipe
   #11 = Utf8               materials
   #12 = Utf8               Ljava/util/List;
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/model/records/Recipe.product:Lext/mods/gameserver/model/holder/IntIntHolder;
   #14 = NameAndType        #15:#16       // product:Lext/mods/gameserver/model/holder/IntIntHolder;
   #15 = Utf8               product
   #16 = Utf8               Lext/mods/gameserver/model/holder/IntIntHolder;
   #17 = Fieldref           #8.#18        // ext/mods/gameserver/model/records/Recipe.id:I
   #18 = NameAndType        #19:#20       // id:I
   #19 = Utf8               id
   #20 = Utf8               I
   #21 = Fieldref           #8.#22        // ext/mods/gameserver/model/records/Recipe.level:I
   #22 = NameAndType        #23:#20       // level:I
   #23 = Utf8               level
   #24 = Fieldref           #8.#25        // ext/mods/gameserver/model/records/Recipe.recipeId:I
   #25 = NameAndType        #26:#20       // recipeId:I
   #26 = Utf8               recipeId
   #27 = Fieldref           #8.#28        // ext/mods/gameserver/model/records/Recipe.alias:Ljava/lang/String;
   #28 = NameAndType        #29:#30       // alias:Ljava/lang/String;
   #29 = Utf8               alias
   #30 = Utf8               Ljava/lang/String;
   #31 = Fieldref           #8.#32        // ext/mods/gameserver/model/records/Recipe.successRate:I
   #32 = NameAndType        #33:#20       // successRate:I
   #33 = Utf8               successRate
   #34 = Fieldref           #8.#35        // ext/mods/gameserver/model/records/Recipe.mpCost:I
   #35 = NameAndType        #36:#20       // mpCost:I
   #36 = Utf8               mpCost
   #37 = Fieldref           #8.#38        // ext/mods/gameserver/model/records/Recipe.isDwarven:Z
   #38 = NameAndType        #39:#40       // isDwarven:Z
   #39 = Utf8               isDwarven
   #40 = Utf8               Z
   #41 = String             #42           // material
   #42 = Utf8               material
   #43 = Methodref          #44.#45       // ext/mods/commons/data/StatSet.getIntIntHolderList:(Ljava/lang/String;)Ljava/util/List;
   #44 = Class              #46           // ext/mods/commons/data/StatSet
   #45 = NameAndType        #47:#48       // getIntIntHolderList:(Ljava/lang/String;)Ljava/util/List;
   #46 = Utf8               ext/mods/commons/data/StatSet
   #47 = Utf8               getIntIntHolderList
   #48 = Utf8               (Ljava/lang/String;)Ljava/util/List;
   #49 = String             #15           // product
   #50 = Methodref          #44.#51       // ext/mods/commons/data/StatSet.getIntIntHolder:(Ljava/lang/String;)Lext/mods/gameserver/model/holder/IntIntHolder;
   #51 = NameAndType        #52:#53       // getIntIntHolder:(Ljava/lang/String;)Lext/mods/gameserver/model/holder/IntIntHolder;
   #52 = Utf8               getIntIntHolder
   #53 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/model/holder/IntIntHolder;
   #54 = String             #19           // id
   #55 = Methodref          #44.#56       // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
   #56 = NameAndType        #57:#58       // getInteger:(Ljava/lang/String;)I
   #57 = Utf8               getInteger
   #58 = Utf8               (Ljava/lang/String;)I
   #59 = String             #23           // level
   #60 = String             #61           // itemId
   #61 = Utf8               itemId
   #62 = String             #29           // alias
   #63 = Methodref          #44.#64       // ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
   #64 = NameAndType        #65:#66       // getString:(Ljava/lang/String;)Ljava/lang/String;
   #65 = Utf8               getString
   #66 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #67 = String             #33           // successRate
   #68 = String             #69           // mpConsume
   #69 = Utf8               mpConsume
   #70 = String             #39           // isDwarven
   #71 = Methodref          #44.#72       // ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;)Z
   #72 = NameAndType        #73:#74       // getBool:(Ljava/lang/String;)Z
   #73 = Utf8               getBool
   #74 = Utf8               (Ljava/lang/String;)Z
   #75 = Methodref          #8.#76        // ext/mods/gameserver/model/records/Recipe."<init>":(Ljava/util/List;Lext/mods/gameserver/model/holder/IntIntHolder;IIILjava/lang/String;IIZ)V
   #76 = NameAndType        #5:#77        // "<init>":(Ljava/util/List;Lext/mods/gameserver/model/holder/IntIntHolder;IIILjava/lang/String;IIZ)V
   #77 = Utf8               (Ljava/util/List;Lext/mods/gameserver/model/holder/IntIntHolder;IIILjava/lang/String;IIZ)V
   #78 = InvokeDynamic      #0:#79        // #0:toString:(Lext/mods/gameserver/model/records/Recipe;)Ljava/lang/String;
   #79 = NameAndType        #80:#81       // toString:(Lext/mods/gameserver/model/records/Recipe;)Ljava/lang/String;
   #80 = Utf8               toString
   #81 = Utf8               (Lext/mods/gameserver/model/records/Recipe;)Ljava/lang/String;
   #82 = InvokeDynamic      #0:#83        // #0:hashCode:(Lext/mods/gameserver/model/records/Recipe;)I
   #83 = NameAndType        #84:#85       // hashCode:(Lext/mods/gameserver/model/records/Recipe;)I
   #84 = Utf8               hashCode
   #85 = Utf8               (Lext/mods/gameserver/model/records/Recipe;)I
   #86 = InvokeDynamic      #0:#87        // #0:equals:(Lext/mods/gameserver/model/records/Recipe;Ljava/lang/Object;)Z
   #87 = NameAndType        #88:#89       // equals:(Lext/mods/gameserver/model/records/Recipe;Ljava/lang/Object;)Z
   #88 = Utf8               equals
   #89 = Utf8               (Lext/mods/gameserver/model/records/Recipe;Ljava/lang/Object;)Z
   #90 = Utf8               Signature
   #91 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/holder/IntIntHolder;>;
   #92 = Utf8               (Lext/mods/commons/data/StatSet;)V
   #93 = Utf8               Code
   #94 = Utf8               LineNumberTable
   #95 = Utf8               LocalVariableTable
   #96 = Utf8               this
   #97 = Utf8               Lext/mods/gameserver/model/records/Recipe;
   #98 = Utf8               set
   #99 = Utf8               Lext/mods/commons/data/StatSet;
  #100 = Utf8               LocalVariableTypeTable
  #101 = Utf8               MethodParameters
  #102 = Utf8               (Ljava/util/List<Lext/mods/gameserver/model/holder/IntIntHolder;>;Lext/mods/gameserver/model/holder/IntIntHolder;IIILjava/lang/String;IIZ)V
  #103 = Utf8               ()Ljava/lang/String;
  #104 = Utf8               ()I
  #105 = Utf8               (Ljava/lang/Object;)Z
  #106 = Utf8               o
  #107 = Utf8               Ljava/lang/Object;
  #108 = Utf8               ()Ljava/util/List;
  #109 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/model/holder/IntIntHolder;>;
  #110 = Utf8               ()Lext/mods/gameserver/model/holder/IntIntHolder;
  #111 = Utf8               ()Z
  #112 = Utf8               SourceFile
  #113 = Utf8               Recipe.java
  #114 = Utf8               Record
  #115 = Utf8               BootstrapMethods
  #116 = String             #117          // materials;product;id;level;recipeId;alias;successRate;mpCost;isDwarven
  #117 = Utf8               materials;product;id;level;recipeId;alias;successRate;mpCost;isDwarven
  #118 = MethodHandle       1:#7          // REF_getField ext/mods/gameserver/model/records/Recipe.materials:Ljava/util/List;
  #119 = MethodHandle       1:#13         // REF_getField ext/mods/gameserver/model/records/Recipe.product:Lext/mods/gameserver/model/holder/IntIntHolder;
  #120 = MethodHandle       1:#17         // REF_getField ext/mods/gameserver/model/records/Recipe.id:I
  #121 = MethodHandle       1:#21         // REF_getField ext/mods/gameserver/model/records/Recipe.level:I
  #122 = MethodHandle       1:#24         // REF_getField ext/mods/gameserver/model/records/Recipe.recipeId:I
  #123 = MethodHandle       1:#27         // REF_getField ext/mods/gameserver/model/records/Recipe.alias:Ljava/lang/String;
  #124 = MethodHandle       1:#31         // REF_getField ext/mods/gameserver/model/records/Recipe.successRate:I
  #125 = MethodHandle       1:#34         // REF_getField ext/mods/gameserver/model/records/Recipe.mpCost:I
  #126 = MethodHandle       1:#37         // REF_getField ext/mods/gameserver/model/records/Recipe.isDwarven:Z
  #127 = MethodHandle       6:#128        // REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #128 = Methodref          #129.#130     // java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #129 = Class              #131          // java/lang/runtime/ObjectMethods
  #130 = NameAndType        #132:#133     // bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #131 = Utf8               java/lang/runtime/ObjectMethods
  #132 = Utf8               bootstrap
  #133 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #134 = Utf8               InnerClasses
  #135 = Class              #136          // java/lang/invoke/MethodHandles$Lookup
  #136 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #137 = Class              #138          // java/lang/invoke/MethodHandles
  #138 = Utf8               java/lang/invoke/MethodHandles
  #139 = Utf8               Lookup
{
  public ext.mods.gameserver.model.records.Recipe(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=11, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: ldc           #41                 // String material
         4: invokevirtual #43                 // Method ext/mods/commons/data/StatSet.getIntIntHolderList:(Ljava/lang/String;)Ljava/util/List;
         7: aload_1
         8: ldc           #49                 // String product
        10: invokevirtual #50                 // Method ext/mods/commons/data/StatSet.getIntIntHolder:(Ljava/lang/String;)Lext/mods/gameserver/model/holder/IntIntHolder;
        13: aload_1
        14: ldc           #54                 // String id
        16: invokevirtual #55                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        19: aload_1
        20: ldc           #59                 // String level
        22: invokevirtual #55                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        25: aload_1
        26: ldc           #60                 // String itemId
        28: invokevirtual #55                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        31: aload_1
        32: ldc           #62                 // String alias
        34: invokevirtual #63                 // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
        37: aload_1
        38: ldc           #67                 // String successRate
        40: invokevirtual #55                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        43: aload_1
        44: ldc           #68                 // String mpConsume
        46: invokevirtual #55                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        49: aload_1
        50: ldc           #70                 // String isDwarven
        52: invokevirtual #71                 // Method ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;)Z
        55: invokespecial #75                 // Method "<init>":(Ljava/util/List;Lext/mods/gameserver/model/holder/IntIntHolder;IIILjava/lang/String;IIZ)V
        58: return
      LineNumberTable:
        line 30: 0
        line 31: 58
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      59     0  this   Lext/mods/gameserver/model/records/Recipe;
            0      59     1   set   Lext/mods/commons/data/StatSet;

  public ext.mods.gameserver.model.records.Recipe(java.util.List<ext.mods.gameserver.model.holder.IntIntHolder>, ext.mods.gameserver.model.holder.IntIntHolder, int, int, int, java.lang.String, int, int, boolean);
    descriptor: (Ljava/util/List;Lext/mods/gameserver/model/holder/IntIntHolder;IIILjava/lang/String;IIZ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=10, args_size=10
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Record."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #7                  // Field materials:Ljava/util/List;
         9: aload_0
        10: aload_2
        11: putfield      #13                 // Field product:Lext/mods/gameserver/model/holder/IntIntHolder;
        14: aload_0
        15: iload_3
        16: putfield      #17                 // Field id:I
        19: aload_0
        20: iload         4
        22: putfield      #21                 // Field level:I
        25: aload_0
        26: iload         5
        28: putfield      #24                 // Field recipeId:I
        31: aload_0
        32: aload         6
        34: putfield      #27                 // Field alias:Ljava/lang/String;
        37: aload_0
        38: iload         7
        40: putfield      #31                 // Field successRate:I
        43: aload_0
        44: iload         8
        46: putfield      #34                 // Field mpCost:I
        49: aload_0
        50: iload         9
        52: putfield      #37                 // Field isDwarven:Z
        55: return
      LineNumberTable:
        line 26: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      56     0  this   Lext/mods/gameserver/model/records/Recipe;
            0      56     1 materials   Ljava/util/List;
            0      56     2 product   Lext/mods/gameserver/model/holder/IntIntHolder;
            0      56     3    id   I
            0      56     4 level   I
            0      56     5 recipeId   I
            0      56     6 alias   Ljava/lang/String;
            0      56     7 successRate   I
            0      56     8 mpCost   I
            0      56     9 isDwarven   Z
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      56     1 materials   Ljava/util/List<Lext/mods/gameserver/model/holder/IntIntHolder;>;
    MethodParameters:
      Name                           Flags
      materials
      product
      id
      level
      recipeId
      alias
      successRate
      mpCost
      isDwarven
    Signature: #102                         // (Ljava/util/List<Lext/mods/gameserver/model/holder/IntIntHolder;>;Lext/mods/gameserver/model/holder/IntIntHolder;IIILjava/lang/String;IIZ)V

  public final java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #78,  0             // InvokeDynamic #0:toString:(Lext/mods/gameserver/model/records/Recipe;)Ljava/lang/String;
         6: areturn
      LineNumberTable:
        line 26: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/Recipe;

  public final int hashCode();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #82,  0             // InvokeDynamic #0:hashCode:(Lext/mods/gameserver/model/records/Recipe;)I
         6: ireturn
      LineNumberTable:
        line 26: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/Recipe;

  public final boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokedynamic #86,  0             // InvokeDynamic #0:equals:(Lext/mods/gameserver/model/records/Recipe;Ljava/lang/Object;)Z
         7: ireturn
      LineNumberTable:
        line 26: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/records/Recipe;
            0       8     1     o   Ljava/lang/Object;

  public java.util.List<ext.mods.gameserver.model.holder.IntIntHolder> materials();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field materials:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 26: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/Recipe;
    Signature: #109                         // ()Ljava/util/List<Lext/mods/gameserver/model/holder/IntIntHolder;>;

  public ext.mods.gameserver.model.holder.IntIntHolder product();
    descriptor: ()Lext/mods/gameserver/model/holder/IntIntHolder;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field product:Lext/mods/gameserver/model/holder/IntIntHolder;
         4: areturn
      LineNumberTable:
        line 26: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/Recipe;

  public int id();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field id:I
         4: ireturn
      LineNumberTable:
        line 26: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/Recipe;

  public int level();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #21                 // Field level:I
         4: ireturn
      LineNumberTable:
        line 26: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/Recipe;

  public int recipeId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #24                 // Field recipeId:I
         4: ireturn
      LineNumberTable:
        line 26: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/Recipe;

  public java.lang.String alias();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #27                 // Field alias:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 26: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/Recipe;

  public int successRate();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #31                 // Field successRate:I
         4: ireturn
      LineNumberTable:
        line 26: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/Recipe;

  public int mpCost();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #34                 // Field mpCost:I
         4: ireturn
      LineNumberTable:
        line 26: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/Recipe;

  public boolean isDwarven();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #37                 // Field isDwarven:Z
         4: ireturn
      LineNumberTable:
        line 26: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/Recipe;
}
SourceFile: "Recipe.java"
  Record: length = 0x40 (unknown attribute)
   00 09 00 0B 00 0C 00 01 00 5A 00 00 00 02 00 5B
   00 0F 00 10 00 00 00 13 00 14 00 00 00 17 00 14
   00 00 00 1A 00 14 00 00 00 1D 00 1E 00 00 00 21
   00 14 00 00 00 24 00 14 00 00 00 27 00 28 00 00

BootstrapMethods:
  0: #127 REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
    Method arguments:
      #8 ext/mods/gameserver/model/records/Recipe
      #116 materials;product;id;level;recipeId;alias;successRate;mpCost;isDwarven
      #118 REF_getField ext/mods/gameserver/model/records/Recipe.materials:Ljava/util/List;
      #119 REF_getField ext/mods/gameserver/model/records/Recipe.product:Lext/mods/gameserver/model/holder/IntIntHolder;
      #120 REF_getField ext/mods/gameserver/model/records/Recipe.id:I
      #121 REF_getField ext/mods/gameserver/model/records/Recipe.level:I
      #122 REF_getField ext/mods/gameserver/model/records/Recipe.recipeId:I
      #123 REF_getField ext/mods/gameserver/model/records/Recipe.alias:Ljava/lang/String;
      #124 REF_getField ext/mods/gameserver/model/records/Recipe.successRate:I
      #125 REF_getField ext/mods/gameserver/model/records/Recipe.mpCost:I
      #126 REF_getField ext/mods/gameserver/model/records/Recipe.isDwarven:Z
InnerClasses:
  public static final #139= #135 of #137; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
