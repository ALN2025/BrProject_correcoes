// Bytecode for: ext.mods.gameserver.data.xml.RecipeData
// File: ext\mods\gameserver\data\xml\RecipeData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/xml/RecipeData.class
  Last modified 9 de jul de 2026; size 3974 bytes
  MD5 checksum e894556fcba67ee08aa0b8973bbc1378
  Compiled from "RecipeData.java"
public class ext.mods.gameserver.data.xml.RecipeData implements ext.mods.commons.data.xml.IXmlReader
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/data/xml/RecipeData
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 9, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/HashMap
    #8 = Utf8               java/util/HashMap
    #9 = Methodref          #7.#3         // java/util/HashMap."<init>":()V
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/data/xml/RecipeData._recipes:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/gameserver/data/xml/RecipeData
   #12 = NameAndType        #14:#15       // _recipes:Ljava/util/Map;
   #13 = Utf8               ext/mods/gameserver/data/xml/RecipeData
   #14 = Utf8               _recipes
   #15 = Utf8               Ljava/util/Map;
   #16 = Methodref          #11.#17       // ext/mods/gameserver/data/xml/RecipeData.load:()V
   #17 = NameAndType        #18:#6        // load:()V
   #18 = Utf8               load
   #19 = String             #20           // xml/recipes.xml
   #20 = Utf8               xml/recipes.xml
   #21 = Methodref          #11.#22       // ext/mods/gameserver/data/xml/RecipeData.parseDataFile:(Ljava/lang/String;)V
   #22 = NameAndType        #23:#24       // parseDataFile:(Ljava/lang/String;)V
   #23 = Utf8               parseDataFile
   #24 = Utf8               (Ljava/lang/String;)V
   #25 = Fieldref           #11.#26       // ext/mods/gameserver/data/xml/RecipeData.LOGGER:Lext/mods/commons/logging/CLogger;
   #26 = NameAndType        #27:#28       // LOGGER:Lext/mods/commons/logging/CLogger;
   #27 = Utf8               LOGGER
   #28 = Utf8               Lext/mods/commons/logging/CLogger;
   #29 = String             #30           // Loaded {} recipes.
   #30 = Utf8               Loaded {} recipes.
   #31 = InterfaceMethodref #32.#33       // java/util/Map.size:()I
   #32 = Class              #34           // java/util/Map
   #33 = NameAndType        #35:#36       // size:()I
   #34 = Utf8               java/util/Map
   #35 = Utf8               size
   #36 = Utf8               ()I
   #37 = Methodref          #38.#39       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #38 = Class              #40           // java/lang/Integer
   #39 = NameAndType        #41:#42       // valueOf:(I)Ljava/lang/Integer;
   #40 = Utf8               java/lang/Integer
   #41 = Utf8               valueOf
   #42 = Utf8               (I)Ljava/lang/Integer;
   #43 = Methodref          #44.#45       // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #44 = Class              #46           // ext/mods/commons/logging/CLogger
   #45 = NameAndType        #47:#48       // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #46 = Utf8               ext/mods/commons/logging/CLogger
   #47 = Utf8               info
   #48 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
   #49 = String             #50           // list
   #50 = Utf8               list
   #51 = InvokeDynamic      #0:#52        // #0:accept:(Lext/mods/gameserver/data/xml/RecipeData;)Ljava/util/function/Consumer;
   #52 = NameAndType        #53:#54       // accept:(Lext/mods/gameserver/data/xml/RecipeData;)Ljava/util/function/Consumer;
   #53 = Utf8               accept
   #54 = Utf8               (Lext/mods/gameserver/data/xml/RecipeData;)Ljava/util/function/Consumer;
   #55 = Methodref          #11.#56       // ext/mods/gameserver/data/xml/RecipeData.forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #56 = NameAndType        #57:#58       // forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #57 = Utf8               forEach
   #58 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #59 = InterfaceMethodref #32.#60       // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #60 = NameAndType        #61:#62       // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #61 = Utf8               get
   #62 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #63 = Class              #64           // ext/mods/gameserver/model/records/Recipe
   #64 = Utf8               ext/mods/gameserver/model/records/Recipe
   #65 = InterfaceMethodref #32.#66       // java/util/Map.values:()Ljava/util/Collection;
   #66 = NameAndType        #67:#68       // values:()Ljava/util/Collection;
   #67 = Utf8               values
   #68 = Utf8               ()Ljava/util/Collection;
   #69 = InterfaceMethodref #70.#71       // java/util/Collection.stream:()Ljava/util/stream/Stream;
   #70 = Class              #72           // java/util/Collection
   #71 = NameAndType        #73:#74       // stream:()Ljava/util/stream/Stream;
   #72 = Utf8               java/util/Collection
   #73 = Utf8               stream
   #74 = Utf8               ()Ljava/util/stream/Stream;
   #75 = InvokeDynamic      #1:#76        // #1:test:(I)Ljava/util/function/Predicate;
   #76 = NameAndType        #77:#78       // test:(I)Ljava/util/function/Predicate;
   #77 = Utf8               test
   #78 = Utf8               (I)Ljava/util/function/Predicate;
   #79 = InterfaceMethodref #80.#81       // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #80 = Class              #82           // java/util/stream/Stream
   #81 = NameAndType        #83:#84       // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #82 = Utf8               java/util/stream/Stream
   #83 = Utf8               filter
   #84 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #85 = InterfaceMethodref #80.#86       // java/util/stream/Stream.findFirst:()Ljava/util/Optional;
   #86 = NameAndType        #87:#88       // findFirst:()Ljava/util/Optional;
   #87 = Utf8               findFirst
   #88 = Utf8               ()Ljava/util/Optional;
   #89 = Methodref          #90.#91       // java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
   #90 = Class              #92           // java/util/Optional
   #91 = NameAndType        #93:#62       // orElse:(Ljava/lang/Object;)Ljava/lang/Object;
   #92 = Utf8               java/util/Optional
   #93 = Utf8               orElse
   #94 = Fieldref           #95.#96       // ext/mods/gameserver/data/xml/RecipeData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/RecipeData;
   #95 = Class              #97           // ext/mods/gameserver/data/xml/RecipeData$SingletonHolder
   #96 = NameAndType        #98:#99       // INSTANCE:Lext/mods/gameserver/data/xml/RecipeData;
   #97 = Utf8               ext/mods/gameserver/data/xml/RecipeData$SingletonHolder
   #98 = Utf8               INSTANCE
   #99 = Utf8               Lext/mods/gameserver/data/xml/RecipeData;
  #100 = Methodref          #63.#101      // ext/mods/gameserver/model/records/Recipe.recipeId:()I
  #101 = NameAndType        #102:#36      // recipeId:()I
  #102 = Utf8               recipeId
  #103 = String             #104          // recipe
  #104 = Utf8               recipe
  #105 = InvokeDynamic      #2:#52        // #2:accept:(Lext/mods/gameserver/data/xml/RecipeData;)Ljava/util/function/Consumer;
  #106 = Methodref          #11.#107      // ext/mods/gameserver/data/xml/RecipeData.parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #107 = NameAndType        #108:#109     // parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #108 = Utf8               parseAttributes
  #109 = Utf8               (Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #110 = String             #111          // id
  #111 = Utf8               id
  #112 = Methodref          #113.#114     // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
  #113 = Class              #115          // ext/mods/commons/data/StatSet
  #114 = NameAndType        #116:#117     // getInteger:(Ljava/lang/String;)I
  #115 = Utf8               ext/mods/commons/data/StatSet
  #116 = Utf8               getInteger
  #117 = Utf8               (Ljava/lang/String;)I
  #118 = Methodref          #63.#119      // ext/mods/gameserver/model/records/Recipe."<init>":(Lext/mods/commons/data/StatSet;)V
  #119 = NameAndType        #5:#120       // "<init>":(Lext/mods/commons/data/StatSet;)V
  #120 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #121 = InterfaceMethodref #32.#122      // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #122 = NameAndType        #123:#124     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #123 = Utf8               put
  #124 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #125 = Class              #126          // ext/mods/commons/data/xml/IXmlReader
  #126 = Utf8               ext/mods/commons/data/xml/IXmlReader
  #127 = Utf8               Signature
  #128 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/records/Recipe;>;
  #129 = Utf8               Code
  #130 = Utf8               LineNumberTable
  #131 = Utf8               LocalVariableTable
  #132 = Utf8               this
  #133 = Utf8               parseDocument
  #134 = Utf8               (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
  #135 = Utf8               doc
  #136 = Utf8               Lorg/w3c/dom/Document;
  #137 = Utf8               path
  #138 = Utf8               Ljava/nio/file/Path;
  #139 = Utf8               getRecipeList
  #140 = Utf8               (I)Lext/mods/gameserver/model/records/Recipe;
  #141 = Utf8               listId
  #142 = Utf8               I
  #143 = Utf8               getRecipeByItemId
  #144 = Utf8               itemId
  #145 = Utf8               getInstance
  #146 = Utf8               ()Lext/mods/gameserver/data/xml/RecipeData;
  #147 = Utf8               lambda$getRecipeByItemId$0
  #148 = Utf8               (ILext/mods/gameserver/model/records/Recipe;)Z
  #149 = Utf8               r
  #150 = Utf8               Lext/mods/gameserver/model/records/Recipe;
  #151 = Utf8               StackMapTable
  #152 = Utf8               lambda$parseDocument$0
  #153 = Utf8               (Lorg/w3c/dom/Node;)V
  #154 = Utf8               listNode
  #155 = Utf8               Lorg/w3c/dom/Node;
  #156 = Utf8               lambda$parseDocument$1
  #157 = Utf8               recipeNode
  #158 = Utf8               set
  #159 = Utf8               Lext/mods/commons/data/StatSet;
  #160 = Utf8               SourceFile
  #161 = Utf8               RecipeData.java
  #162 = Utf8               NestMembers
  #163 = Utf8               BootstrapMethods
  #164 = MethodType         #165          //  (Ljava/lang/Object;)V
  #165 = Utf8               (Ljava/lang/Object;)V
  #166 = MethodHandle       5:#167        // REF_invokeVirtual ext/mods/gameserver/data/xml/RecipeData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #167 = Methodref          #11.#168      // ext/mods/gameserver/data/xml/RecipeData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #168 = NameAndType        #152:#153     // lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #169 = MethodType         #153          //  (Lorg/w3c/dom/Node;)V
  #170 = MethodType         #171          //  (Ljava/lang/Object;)Z
  #171 = Utf8               (Ljava/lang/Object;)Z
  #172 = MethodHandle       6:#173        // REF_invokeStatic ext/mods/gameserver/data/xml/RecipeData.lambda$getRecipeByItemId$0:(ILext/mods/gameserver/model/records/Recipe;)Z
  #173 = Methodref          #11.#174      // ext/mods/gameserver/data/xml/RecipeData.lambda$getRecipeByItemId$0:(ILext/mods/gameserver/model/records/Recipe;)Z
  #174 = NameAndType        #147:#148     // lambda$getRecipeByItemId$0:(ILext/mods/gameserver/model/records/Recipe;)Z
  #175 = MethodType         #176          //  (Lext/mods/gameserver/model/records/Recipe;)Z
  #176 = Utf8               (Lext/mods/gameserver/model/records/Recipe;)Z
  #177 = MethodHandle       5:#178        // REF_invokeVirtual ext/mods/gameserver/data/xml/RecipeData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #178 = Methodref          #11.#179      // ext/mods/gameserver/data/xml/RecipeData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #179 = NameAndType        #156:#153     // lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #180 = MethodHandle       6:#181        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #181 = Methodref          #182.#183     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #182 = Class              #184          // java/lang/invoke/LambdaMetafactory
  #183 = NameAndType        #185:#186     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #184 = Utf8               java/lang/invoke/LambdaMetafactory
  #185 = Utf8               metafactory
  #186 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #187 = Utf8               InnerClasses
  #188 = Utf8               SingletonHolder
  #189 = Class              #190          // java/lang/invoke/MethodHandles$Lookup
  #190 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #191 = Class              #192          // java/lang/invoke/MethodHandles
  #192 = Utf8               java/lang/invoke/MethodHandles
  #193 = Utf8               Lookup
{
  protected ext.mods.gameserver.data.xml.RecipeData();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/HashMap
         8: dup
         9: invokespecial #9                  // Method java/util/HashMap."<init>":()V
        12: putfield      #10                 // Field _recipes:Ljava/util/Map;
        15: aload_0
        16: invokevirtual #16                 // Method load:()V
        19: return
      LineNumberTable:
        line 39: 0
        line 36: 4
        line 40: 15
        line 41: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/data/xml/RecipeData;

  public void load();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: ldc           #19                 // String xml/recipes.xml
         3: invokevirtual #21                 // Method parseDataFile:(Ljava/lang/String;)V
         6: getstatic     #25                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
         9: ldc           #29                 // String Loaded {} recipes.
        11: iconst_1
        12: anewarray     #2                  // class java/lang/Object
        15: dup
        16: iconst_0
        17: aload_0
        18: getfield      #10                 // Field _recipes:Ljava/util/Map;
        21: invokeinterface #31,  1           // InterfaceMethod java/util/Map.size:()I
        26: invokestatic  #37                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        29: aastore
        30: invokevirtual #43                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        33: return
      LineNumberTable:
        line 46: 0
        line 47: 6
        line 48: 33
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      34     0  this   Lext/mods/gameserver/data/xml/RecipeData;

  public void parseDocument(org.w3c.dom.Document, java.nio.file.Path);
    descriptor: (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: ldc           #49                 // String list
         4: aload_0
         5: invokedynamic #51,  0             // InvokeDynamic #0:accept:(Lext/mods/gameserver/data/xml/RecipeData;)Ljava/util/function/Consumer;
        10: invokevirtual #55                 // Method forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
        13: return
      LineNumberTable:
        line 53: 0
        line 58: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/data/xml/RecipeData;
            0      14     1   doc   Lorg/w3c/dom/Document;
            0      14     2  path   Ljava/nio/file/Path;

  public ext.mods.gameserver.model.records.Recipe getRecipeList(int);
    descriptor: (I)Lext/mods/gameserver/model/records/Recipe;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _recipes:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #37                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #59,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #63                 // class ext/mods/gameserver/model/records/Recipe
        16: areturn
      LineNumberTable:
        line 62: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/data/xml/RecipeData;
            0      17     1 listId   I

  public ext.mods.gameserver.model.records.Recipe getRecipeByItemId(int);
    descriptor: (I)Lext/mods/gameserver/model/records/Recipe;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _recipes:Ljava/util/Map;
         4: invokeinterface #65,  1           // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: invokeinterface #69,  1           // InterfaceMethod java/util/Collection.stream:()Ljava/util/stream/Stream;
        14: iload_1
        15: invokedynamic #75,  0             // InvokeDynamic #1:test:(I)Ljava/util/function/Predicate;
        20: invokeinterface #79,  2           // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        25: invokeinterface #85,  1           // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
        30: aconst_null
        31: invokevirtual #89                 // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        34: checkcast     #63                 // class ext/mods/gameserver/model/records/Recipe
        37: areturn
      LineNumberTable:
        line 67: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      38     0  this   Lext/mods/gameserver/data/xml/RecipeData;
            0      38     1 itemId   I

  public static ext.mods.gameserver.data.xml.RecipeData getInstance();
    descriptor: ()Lext/mods/gameserver/data/xml/RecipeData;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #94                 // Field ext/mods/gameserver/data/xml/RecipeData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/RecipeData;
         3: areturn
      LineNumberTable:
        line 72: 0
}
SourceFile: "RecipeData.java"
NestMembers:
  ext/mods/gameserver/data/xml/RecipeData$SingletonHolder
BootstrapMethods:
  0: #180 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #164 (Ljava/lang/Object;)V
      #166 REF_invokeVirtual ext/mods/gameserver/data/xml/RecipeData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
      #169 (Lorg/w3c/dom/Node;)V
  1: #180 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #170 (Ljava/lang/Object;)Z
      #172 REF_invokeStatic ext/mods/gameserver/data/xml/RecipeData.lambda$getRecipeByItemId$0:(ILext/mods/gameserver/model/records/Recipe;)Z
      #175 (Lext/mods/gameserver/model/records/Recipe;)Z
  2: #180 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #164 (Ljava/lang/Object;)V
      #177 REF_invokeVirtual ext/mods/gameserver/data/xml/RecipeData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
      #169 (Lorg/w3c/dom/Node;)V
InnerClasses:
  public static final #193= #189 of #191; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
