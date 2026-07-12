// Bytecode for: ext.mods.gameserver.model.actor.container.player.RecipeBook
// File: ext\mods\gameserver\model\actor\container\player\RecipeBook.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/container/player/RecipeBook.class
  Last modified 9 de jul de 2026; size 6146 bytes
  MD5 checksum f56afbe053bdf631692757306e247881
  Compiled from "RecipeBook.java"
public class ext.mods.gameserver.model.actor.container.player.RecipeBook
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/model/actor/container/player/RecipeBook
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 7, methods: 10, attributes: 1
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
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/model/actor/container/player/RecipeBook._dwarvenRecipes:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/gameserver/model/actor/container/player/RecipeBook
   #12 = NameAndType        #14:#15       // _dwarvenRecipes:Ljava/util/Map;
   #13 = Utf8               ext/mods/gameserver/model/actor/container/player/RecipeBook
   #14 = Utf8               _dwarvenRecipes
   #15 = Utf8               Ljava/util/Map;
   #16 = Fieldref           #11.#17       // ext/mods/gameserver/model/actor/container/player/RecipeBook._commonRecipes:Ljava/util/Map;
   #17 = NameAndType        #18:#15       // _commonRecipes:Ljava/util/Map;
   #18 = Utf8               _commonRecipes
   #19 = Fieldref           #11.#20       // ext/mods/gameserver/model/actor/container/player/RecipeBook._owner:Lext/mods/gameserver/model/actor/Player;
   #20 = NameAndType        #21:#22       // _owner:Lext/mods/gameserver/model/actor/Player;
   #21 = Utf8               _owner
   #22 = Utf8               Lext/mods/gameserver/model/actor/Player;
   #23 = InterfaceMethodref #24.#25       // java/util/Map.values:()Ljava/util/Collection;
   #24 = Class              #26           // java/util/Map
   #25 = NameAndType        #27:#28       // values:()Ljava/util/Collection;
   #26 = Utf8               java/util/Map
   #27 = Utf8               values
   #28 = Utf8               ()Ljava/util/Collection;
   #29 = InterfaceMethodref #24.#30       // java/util/Map.clear:()V
   #30 = NameAndType        #31:#6        // clear:()V
   #31 = Utf8               clear
   #32 = Methodref          #33.#34       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #33 = Class              #35           // java/lang/Integer
   #34 = NameAndType        #36:#37       // valueOf:(I)Ljava/lang/Integer;
   #35 = Utf8               java/lang/Integer
   #36 = Utf8               valueOf
   #37 = Utf8               (I)Ljava/lang/Integer;
   #38 = InterfaceMethodref #24.#39       // java/util/Map.containsKey:(Ljava/lang/Object;)Z
   #39 = NameAndType        #40:#41       // containsKey:(Ljava/lang/Object;)Z
   #40 = Utf8               containsKey
   #41 = Utf8               (Ljava/lang/Object;)Z
   #42 = Methodref          #43.#44       // ext/mods/gameserver/model/records/ManufactureItem.recipeId:()I
   #43 = Class              #45           // ext/mods/gameserver/model/records/ManufactureItem
   #44 = NameAndType        #46:#47       // recipeId:()I
   #45 = Utf8               ext/mods/gameserver/model/records/ManufactureItem
   #46 = Utf8               recipeId
   #47 = Utf8               ()I
   #48 = Methodref          #43.#49       // ext/mods/gameserver/model/records/ManufactureItem.isDwarven:()Z
   #49 = NameAndType        #50:#51       // isDwarven:()Z
   #50 = Utf8               isDwarven
   #51 = Utf8               ()Z
   #52 = Methodref          #11.#53       // ext/mods/gameserver/model/actor/container/player/RecipeBook.hasRecipeOnSpecificBook:(IZ)Z
   #53 = NameAndType        #54:#55       // hasRecipeOnSpecificBook:(IZ)Z
   #54 = Utf8               hasRecipeOnSpecificBook
   #55 = Utf8               (IZ)Z
   #56 = Methodref          #57.#58       // ext/mods/gameserver/model/actor/Player.isSubClassActive:()Z
   #57 = Class              #59           // ext/mods/gameserver/model/actor/Player
   #58 = NameAndType        #60:#51       // isSubClassActive:()Z
   #59 = Utf8               ext/mods/gameserver/model/actor/Player
   #60 = Utf8               isSubClassActive
   #61 = Methodref          #62.#63       // ext/mods/gameserver/model/records/Recipe.id:()I
   #62 = Class              #64           // ext/mods/gameserver/model/records/Recipe
   #63 = NameAndType        #65:#47       // id:()I
   #64 = Utf8               ext/mods/gameserver/model/records/Recipe
   #65 = Utf8               id
   #66 = InterfaceMethodref #24.#67       // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #67 = NameAndType        #68:#69       // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #68 = Utf8               put
   #69 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #70 = Methodref          #71.#72       // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
   #71 = Class              #73           // ext/mods/commons/pool/ConnectionPool
   #72 = NameAndType        #74:#75       // getConnection:()Ljava/sql/Connection;
   #73 = Utf8               ext/mods/commons/pool/ConnectionPool
   #74 = Utf8               getConnection
   #75 = Utf8               ()Ljava/sql/Connection;
   #76 = String             #77           // INSERT INTO character_recipebook (charId, recipeId) VALUES (?,?)
   #77 = Utf8               INSERT INTO character_recipebook (charId, recipeId) VALUES (?,?)
   #78 = InterfaceMethodref #79.#80       // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #79 = Class              #81           // java/sql/Connection
   #80 = NameAndType        #82:#83       // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #81 = Utf8               java/sql/Connection
   #82 = Utf8               prepareStatement
   #83 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #84 = Methodref          #57.#85       // ext/mods/gameserver/model/actor/Player.getObjectId:()I
   #85 = NameAndType        #86:#47       // getObjectId:()I
   #86 = Utf8               getObjectId
   #87 = InterfaceMethodref #88.#89       // java/sql/PreparedStatement.setInt:(II)V
   #88 = Class              #90           // java/sql/PreparedStatement
   #89 = NameAndType        #91:#92       // setInt:(II)V
   #90 = Utf8               java/sql/PreparedStatement
   #91 = Utf8               setInt
   #92 = Utf8               (II)V
   #93 = InterfaceMethodref #88.#94       // java/sql/PreparedStatement.execute:()Z
   #94 = NameAndType        #95:#51       // execute:()Z
   #95 = Utf8               execute
   #96 = InterfaceMethodref #88.#97       // java/sql/PreparedStatement.close:()V
   #97 = NameAndType        #98:#6        // close:()V
   #98 = Utf8               close
   #99 = Class              #100          // java/lang/Throwable
  #100 = Utf8               java/lang/Throwable
  #101 = Methodref          #99.#102      // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
  #102 = NameAndType        #103:#104     // addSuppressed:(Ljava/lang/Throwable;)V
  #103 = Utf8               addSuppressed
  #104 = Utf8               (Ljava/lang/Throwable;)V
  #105 = InterfaceMethodref #79.#97       // java/sql/Connection.close:()V
  #106 = Class              #107          // java/lang/Exception
  #107 = Utf8               java/lang/Exception
  #108 = Fieldref           #11.#109      // ext/mods/gameserver/model/actor/container/player/RecipeBook.LOGGER:Lext/mods/commons/logging/CLogger;
  #109 = NameAndType        #110:#111     // LOGGER:Lext/mods/commons/logging/CLogger;
  #110 = Utf8               LOGGER
  #111 = Utf8               Lext/mods/commons/logging/CLogger;
  #112 = String             #113          // Couldn\'t store recipe.
  #113 = Utf8               Couldn\'t store recipe.
  #114 = Methodref          #115.#116     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #115 = Class              #117          // ext/mods/commons/logging/CLogger
  #116 = NameAndType        #118:#119     // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #117 = Utf8               ext/mods/commons/logging/CLogger
  #118 = Utf8               error
  #119 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
  #120 = InterfaceMethodref #24.#121      // java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #121 = NameAndType        #122:#123     // remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #122 = Utf8               remove
  #123 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #124 = Methodref          #57.#125      // ext/mods/gameserver/model/actor/Player.getShortcutList:()Lext/mods/gameserver/model/actor/container/player/ShortcutList;
  #125 = NameAndType        #126:#127     // getShortcutList:()Lext/mods/gameserver/model/actor/container/player/ShortcutList;
  #126 = Utf8               getShortcutList
  #127 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/ShortcutList;
  #128 = Fieldref           #129.#130     // ext/mods/gameserver/enums/ShortcutType.RECIPE:Lext/mods/gameserver/enums/ShortcutType;
  #129 = Class              #131          // ext/mods/gameserver/enums/ShortcutType
  #130 = NameAndType        #132:#133     // RECIPE:Lext/mods/gameserver/enums/ShortcutType;
  #131 = Utf8               ext/mods/gameserver/enums/ShortcutType
  #132 = Utf8               RECIPE
  #133 = Utf8               Lext/mods/gameserver/enums/ShortcutType;
  #134 = Methodref          #135.#136     // ext/mods/gameserver/model/actor/container/player/ShortcutList.deleteShortcuts:(ILext/mods/gameserver/enums/ShortcutType;)V
  #135 = Class              #137          // ext/mods/gameserver/model/actor/container/player/ShortcutList
  #136 = NameAndType        #138:#139     // deleteShortcuts:(ILext/mods/gameserver/enums/ShortcutType;)V
  #137 = Utf8               ext/mods/gameserver/model/actor/container/player/ShortcutList
  #138 = Utf8               deleteShortcuts
  #139 = Utf8               (ILext/mods/gameserver/enums/ShortcutType;)V
  #140 = String             #141          // DELETE FROM character_recipebook WHERE charId=? AND recipeId=?
  #141 = Utf8               DELETE FROM character_recipebook WHERE charId=? AND recipeId=?
  #142 = String             #143          // Couldn\'t remove recipe.
  #143 = Utf8               Couldn\'t remove recipe.
  #144 = String             #145          // SELECT recipeId FROM character_recipebook WHERE charId=?
  #145 = Utf8               SELECT recipeId FROM character_recipebook WHERE charId=?
  #146 = InterfaceMethodref #88.#147      // java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
  #147 = NameAndType        #148:#149     // executeQuery:()Ljava/sql/ResultSet;
  #148 = Utf8               executeQuery
  #149 = Utf8               ()Ljava/sql/ResultSet;
  #150 = InterfaceMethodref #151.#152     // java/sql/ResultSet.next:()Z
  #151 = Class              #153          // java/sql/ResultSet
  #152 = NameAndType        #154:#51      // next:()Z
  #153 = Utf8               java/sql/ResultSet
  #154 = Utf8               next
  #155 = Methodref          #156.#157     // ext/mods/gameserver/data/xml/RecipeData.getInstance:()Lext/mods/gameserver/data/xml/RecipeData;
  #156 = Class              #158          // ext/mods/gameserver/data/xml/RecipeData
  #157 = NameAndType        #159:#160     // getInstance:()Lext/mods/gameserver/data/xml/RecipeData;
  #158 = Utf8               ext/mods/gameserver/data/xml/RecipeData
  #159 = Utf8               getInstance
  #160 = Utf8               ()Lext/mods/gameserver/data/xml/RecipeData;
  #161 = String             #46           // recipeId
  #162 = InterfaceMethodref #151.#163     // java/sql/ResultSet.getInt:(Ljava/lang/String;)I
  #163 = NameAndType        #164:#165     // getInt:(Ljava/lang/String;)I
  #164 = Utf8               getInt
  #165 = Utf8               (Ljava/lang/String;)I
  #166 = Methodref          #156.#167     // ext/mods/gameserver/data/xml/RecipeData.getRecipeList:(I)Lext/mods/gameserver/model/records/Recipe;
  #167 = NameAndType        #168:#169     // getRecipeList:(I)Lext/mods/gameserver/model/records/Recipe;
  #168 = Utf8               getRecipeList
  #169 = Utf8               (I)Lext/mods/gameserver/model/records/Recipe;
  #170 = Methodref          #62.#49       // ext/mods/gameserver/model/records/Recipe.isDwarven:()Z
  #171 = Methodref          #11.#172      // ext/mods/gameserver/model/actor/container/player/RecipeBook.putRecipe:(Lext/mods/gameserver/model/records/Recipe;ZZ)V
  #172 = NameAndType        #173:#174     // putRecipe:(Lext/mods/gameserver/model/records/Recipe;ZZ)V
  #173 = Utf8               putRecipe
  #174 = Utf8               (Lext/mods/gameserver/model/records/Recipe;ZZ)V
  #175 = InterfaceMethodref #151.#97      // java/sql/ResultSet.close:()V
  #176 = String             #177          // Couldn\'t restore recipe book data.
  #177 = Utf8               Couldn\'t restore recipe book data.
  #178 = Methodref          #179.#180     // java/lang/Class.getName:()Ljava/lang/String;
  #179 = Class              #181          // java/lang/Class
  #180 = NameAndType        #182:#183     // getName:()Ljava/lang/String;
  #181 = Utf8               java/lang/Class
  #182 = Utf8               getName
  #183 = Utf8               ()Ljava/lang/String;
  #184 = Methodref          #115.#185     // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #185 = NameAndType        #5:#186       // "<init>":(Ljava/lang/String;)V
  #186 = Utf8               (Ljava/lang/String;)V
  #187 = Utf8               INSERT_RECIPE
  #188 = Utf8               Ljava/lang/String;
  #189 = Utf8               ConstantValue
  #190 = Utf8               DELETE_RECIPE
  #191 = Utf8               LOAD_RECIPE_BOOK
  #192 = Utf8               Signature
  #193 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/records/Recipe;>;
  #194 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #195 = Utf8               Code
  #196 = Utf8               LineNumberTable
  #197 = Utf8               LocalVariableTable
  #198 = Utf8               this
  #199 = Utf8               Lext/mods/gameserver/model/actor/container/player/RecipeBook;
  #200 = Utf8               owner
  #201 = Utf8               get
  #202 = Utf8               (Z)Ljava/util/Collection;
  #203 = Utf8               Z
  #204 = Utf8               StackMapTable
  #205 = Class              #206          // java/util/Collection
  #206 = Utf8               java/util/Collection
  #207 = Utf8               (Z)Ljava/util/Collection<Lext/mods/gameserver/model/records/Recipe;>;
  #208 = Utf8               hasRecipe
  #209 = Utf8               (I)Z
  #210 = Utf8               I
  #211 = Utf8               canPassManufactureProcess
  #212 = Utf8               ([Lext/mods/gameserver/model/records/ManufactureItem;)Z
  #213 = Utf8               itemToCheck
  #214 = Utf8               Lext/mods/gameserver/model/records/ManufactureItem;
  #215 = Utf8               itemsToCheck
  #216 = Utf8               [Lext/mods/gameserver/model/records/ManufactureItem;
  #217 = Class              #216          // "[Lext/mods/gameserver/model/records/ManufactureItem;"
  #218 = Utf8               ps
  #219 = Utf8               Ljava/sql/PreparedStatement;
  #220 = Utf8               con
  #221 = Utf8               Ljava/sql/Connection;
  #222 = Utf8               e
  #223 = Utf8               Ljava/lang/Exception;
  #224 = Utf8               recipe
  #225 = Utf8               Lext/mods/gameserver/model/records/Recipe;
  #226 = Utf8               saveOnDb
  #227 = Utf8               removeRecipe
  #228 = Utf8               (I)V
  #229 = Utf8               restore
  #230 = Utf8               rs
  #231 = Utf8               Ljava/sql/ResultSet;
  #232 = Utf8               <clinit>
  #233 = Utf8               SourceFile
  #234 = Utf8               RecipeBook.java
{
  public ext.mods.gameserver.model.actor.container.player.RecipeBook(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/HashMap
         8: dup
         9: invokespecial #9                  // Method java/util/HashMap."<init>":()V
        12: putfield      #10                 // Field _dwarvenRecipes:Ljava/util/Map;
        15: aload_0
        16: new           #7                  // class java/util/HashMap
        19: dup
        20: invokespecial #9                  // Method java/util/HashMap."<init>":()V
        23: putfield      #16                 // Field _commonRecipes:Ljava/util/Map;
        26: aload_0
        27: aload_1
        28: putfield      #19                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
        31: return
      LineNumberTable:
        line 51: 0
        line 47: 4
        line 48: 15
        line 52: 26
        line 53: 31
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      32     0  this   Lext/mods/gameserver/model/actor/container/player/RecipeBook;
            0      32     1 owner   Lext/mods/gameserver/model/actor/Player;

  public java.util.Collection<ext.mods.gameserver.model.records.Recipe> get(boolean);
    descriptor: (Z)Ljava/util/Collection;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=2, args_size=2
         0: iload_1
         1: ifeq          16
         4: aload_0
         5: getfield      #10                 // Field _dwarvenRecipes:Ljava/util/Map;
         8: invokeinterface #23,  1           // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        13: goto          25
        16: aload_0
        17: getfield      #16                 // Field _commonRecipes:Ljava/util/Map;
        20: invokeinterface #23,  1           // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        25: areturn
      LineNumberTable:
        line 61: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/actor/container/player/RecipeBook;
            0      26     1 isDwarven   Z
      StackMapTable: number_of_entries = 2
        frame_type = 16 /* same */
        frame_type = 72 /* same_locals_1_stack_item */
          stack = [ class java/util/Collection ]
    Signature: #207                         // (Z)Ljava/util/Collection<Lext/mods/gameserver/model/records/Recipe;>;

  public void clear();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field _commonRecipes:Ljava/util/Map;
         4: invokeinterface #29,  1           // InterfaceMethod java/util/Map.clear:()V
         9: aload_0
        10: getfield      #10                 // Field _dwarvenRecipes:Ljava/util/Map;
        13: invokeinterface #29,  1           // InterfaceMethod java/util/Map.clear:()V
        18: return
      LineNumberTable:
        line 69: 0
        line 70: 9
        line 71: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/actor/container/player/RecipeBook;

  public boolean hasRecipe(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _dwarvenRecipes:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #32                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #38,  2           // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
        13: ifne          32
        16: aload_0
        17: getfield      #16                 // Field _commonRecipes:Ljava/util/Map;
        20: iload_1
        21: invokestatic  #32                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        24: invokeinterface #38,  2           // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
        29: ifeq          36
        32: iconst_1
        33: goto          37
        36: iconst_0
        37: ireturn
      LineNumberTable:
        line 79: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      38     0  this   Lext/mods/gameserver/model/actor/container/player/RecipeBook;
            0      38     1 recipeId   I
      StackMapTable: number_of_entries = 3
        frame_type = 32 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean hasRecipeOnSpecificBook(int, boolean);
    descriptor: (IZ)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: iload_2
         1: ifeq          20
         4: aload_0
         5: getfield      #10                 // Field _dwarvenRecipes:Ljava/util/Map;
         8: iload_1
         9: invokestatic  #32                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        12: invokeinterface #38,  2           // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
        17: goto          33
        20: aload_0
        21: getfield      #16                 // Field _commonRecipes:Ljava/util/Map;
        24: iload_1
        25: invokestatic  #32                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        28: invokeinterface #38,  2           // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
        33: ireturn
      LineNumberTable:
        line 89: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      34     0  this   Lext/mods/gameserver/model/actor/container/player/RecipeBook;
            0      34     1 recipeId   I
            0      34     2 isDwarven   Z
      StackMapTable: number_of_entries = 2
        frame_type = 20 /* same */
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean canPassManufactureProcess(ext.mods.gameserver.model.records.ManufactureItem[]);
    descriptor: ([Lext/mods/gameserver/model/records/ManufactureItem;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=6, args_size=2
         0: aload_1
         1: astore_2
         2: aload_2
         3: arraylength
         4: istore_3
         5: iconst_0
         6: istore        4
         8: iload         4
        10: iload_3
        11: if_icmpge     45
        14: aload_2
        15: iload         4
        17: aaload
        18: astore        5
        20: aload_0
        21: aload         5
        23: invokevirtual #42                 // Method ext/mods/gameserver/model/records/ManufactureItem.recipeId:()I
        26: aload         5
        28: invokevirtual #48                 // Method ext/mods/gameserver/model/records/ManufactureItem.isDwarven:()Z
        31: invokevirtual #52                 // Method hasRecipeOnSpecificBook:(IZ)Z
        34: ifne          39
        37: iconst_0
        38: ireturn
        39: iinc          4, 1
        42: goto          8
        45: iconst_1
        46: ireturn
      LineNumberTable:
        line 98: 0
        line 100: 20
        line 101: 37
        line 98: 39
        line 103: 45
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           20      19     5 itemToCheck   Lext/mods/gameserver/model/records/ManufactureItem;
            0      47     0  this   Lext/mods/gameserver/model/actor/container/player/RecipeBook;
            0      47     1 itemsToCheck   [Lext/mods/gameserver/model/records/ManufactureItem;
      StackMapTable: number_of_entries = 3
        frame_type = 254 /* append */
          offset_delta = 8
          locals = [ class "[Lext/mods/gameserver/model/records/ManufactureItem;", int, int ]
        frame_type = 30 /* same */
        frame_type = 248 /* chop */
          offset_delta = 5

  public void putRecipe(ext.mods.gameserver.model.records.Recipe, boolean, boolean);
    descriptor: (Lext/mods/gameserver/model/records/Recipe;ZZ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=8, args_size=4
         0: aload_0
         1: getfield      #19                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
         4: invokevirtual #56                 // Method ext/mods/gameserver/model/actor/Player.isSubClassActive:()Z
         7: ifeq          11
        10: return
        11: iload_2
        12: ifeq          36
        15: aload_0
        16: getfield      #10                 // Field _dwarvenRecipes:Ljava/util/Map;
        19: aload_1
        20: invokevirtual #61                 // Method ext/mods/gameserver/model/records/Recipe.id:()I
        23: invokestatic  #32                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        26: aload_1
        27: invokeinterface #66,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        32: pop
        33: goto          54
        36: aload_0
        37: getfield      #16                 // Field _commonRecipes:Ljava/util/Map;
        40: aload_1
        41: invokevirtual #61                 // Method ext/mods/gameserver/model/records/Recipe.id:()I
        44: invokestatic  #32                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        47: aload_1
        48: invokeinterface #66,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        53: pop
        54: iload_3
        55: ifeq          212
        58: invokestatic  #70                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        61: astore        4
        63: aload         4
        65: ldc           #76                 // String INSERT INTO character_recipebook (charId, recipeId) VALUES (?,?)
        67: invokeinterface #78,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        72: astore        5
        74: aload         5
        76: iconst_1
        77: aload_0
        78: getfield      #19                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
        81: invokevirtual #84                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        84: invokeinterface #87,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        89: aload         5
        91: iconst_2
        92: aload_1
        93: invokevirtual #61                 // Method ext/mods/gameserver/model/records/Recipe.id:()I
        96: invokeinterface #87,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       101: aload         5
       103: invokeinterface #93,  1           // InterfaceMethod java/sql/PreparedStatement.execute:()Z
       108: pop
       109: aload         5
       111: ifnull        153
       114: aload         5
       116: invokeinterface #96,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       121: goto          153
       124: astore        6
       126: aload         5
       128: ifnull        150
       131: aload         5
       133: invokeinterface #96,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       138: goto          150
       141: astore        7
       143: aload         6
       145: aload         7
       147: invokevirtual #101                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       150: aload         6
       152: athrow
       153: aload         4
       155: ifnull        197
       158: aload         4
       160: invokeinterface #105,  1          // InterfaceMethod java/sql/Connection.close:()V
       165: goto          197
       168: astore        5
       170: aload         4
       172: ifnull        194
       175: aload         4
       177: invokeinterface #105,  1          // InterfaceMethod java/sql/Connection.close:()V
       182: goto          194
       185: astore        6
       187: aload         5
       189: aload         6
       191: invokevirtual #101                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       194: aload         5
       196: athrow
       197: goto          212
       200: astore        4
       202: getstatic     #108                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       205: ldc           #112                // String Couldn\'t store recipe.
       207: aload         4
       209: invokevirtual #114                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       212: return
      Exception table:
         from    to  target type
            74   109   124   Class java/lang/Throwable
           131   138   141   Class java/lang/Throwable
            63   153   168   Class java/lang/Throwable
           175   182   185   Class java/lang/Throwable
            58   197   200   Class java/lang/Exception
      LineNumberTable:
        line 114: 0
        line 115: 10
        line 117: 11
        line 118: 15
        line 120: 36
        line 122: 54
        line 124: 58
        line 125: 63
        line 127: 74
        line 128: 89
        line 129: 101
        line 130: 109
        line 124: 124
        line 130: 153
        line 124: 168
        line 134: 197
        line 131: 200
        line 133: 202
        line 136: 212
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           74      79     5    ps   Ljava/sql/PreparedStatement;
           63     134     4   con   Ljava/sql/Connection;
          202      10     4     e   Ljava/lang/Exception;
            0     213     0  this   Lext/mods/gameserver/model/actor/container/player/RecipeBook;
            0     213     1 recipe   Lext/mods/gameserver/model/records/Recipe;
            0     213     2 isDwarven   Z
            0     213     3 saveOnDb   Z
      StackMapTable: number_of_entries = 13
        frame_type = 11 /* same */
        frame_type = 24 /* same */
        frame_type = 17 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 69
          locals = [ class ext/mods/gameserver/model/actor/container/player/RecipeBook, class ext/mods/gameserver/model/records/Recipe, int, int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/container/player/RecipeBook, class ext/mods/gameserver/model/records/Recipe, int, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/container/player/RecipeBook, class ext/mods/gameserver/model/records/Recipe, int, int, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 11 /* same */

  public void removeRecipe(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=6, args_size=2
         0: aload_0
         1: getfield      #19                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
         4: invokevirtual #56                 // Method ext/mods/gameserver/model/actor/Player.isSubClassActive:()Z
         7: ifeq          11
        10: return
        11: aload_0
        12: getfield      #10                 // Field _dwarvenRecipes:Ljava/util/Map;
        15: iload_1
        16: invokestatic  #32                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        19: invokeinterface #38,  2           // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
        24: ifeq          44
        27: aload_0
        28: getfield      #10                 // Field _dwarvenRecipes:Ljava/util/Map;
        31: iload_1
        32: invokestatic  #32                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        35: invokeinterface #120,  2          // InterfaceMethod java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        40: pop
        41: goto          74
        44: aload_0
        45: getfield      #16                 // Field _commonRecipes:Ljava/util/Map;
        48: iload_1
        49: invokestatic  #32                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        52: invokeinterface #38,  2           // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
        57: ifeq          74
        60: aload_0
        61: getfield      #16                 // Field _commonRecipes:Ljava/util/Map;
        64: iload_1
        65: invokestatic  #32                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        68: invokeinterface #120,  2          // InterfaceMethod java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        73: pop
        74: aload_0
        75: getfield      #19                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
        78: invokevirtual #124                // Method ext/mods/gameserver/model/actor/Player.getShortcutList:()Lext/mods/gameserver/model/actor/container/player/ShortcutList;
        81: iload_1
        82: getstatic     #128                // Field ext/mods/gameserver/enums/ShortcutType.RECIPE:Lext/mods/gameserver/enums/ShortcutType;
        85: invokevirtual #134                // Method ext/mods/gameserver/model/actor/container/player/ShortcutList.deleteShortcuts:(ILext/mods/gameserver/enums/ShortcutType;)V
        88: invokestatic  #70                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        91: astore_2
        92: aload_2
        93: ldc           #140                // String DELETE FROM character_recipebook WHERE charId=? AND recipeId=?
        95: invokeinterface #78,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       100: astore_3
       101: aload_3
       102: iconst_1
       103: aload_0
       104: getfield      #19                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       107: invokevirtual #84                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       110: invokeinterface #87,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       115: aload_3
       116: iconst_2
       117: iload_1
       118: invokeinterface #87,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       123: aload_3
       124: invokeinterface #93,  1           // InterfaceMethod java/sql/PreparedStatement.execute:()Z
       129: pop
       130: aload_3
       131: ifnull        170
       134: aload_3
       135: invokeinterface #96,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       140: goto          170
       143: astore        4
       145: aload_3
       146: ifnull        167
       149: aload_3
       150: invokeinterface #96,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       155: goto          167
       158: astore        5
       160: aload         4
       162: aload         5
       164: invokevirtual #101                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       167: aload         4
       169: athrow
       170: aload_2
       171: ifnull        207
       174: aload_2
       175: invokeinterface #105,  1          // InterfaceMethod java/sql/Connection.close:()V
       180: goto          207
       183: astore_3
       184: aload_2
       185: ifnull        205
       188: aload_2
       189: invokeinterface #105,  1          // InterfaceMethod java/sql/Connection.close:()V
       194: goto          205
       197: astore        4
       199: aload_3
       200: aload         4
       202: invokevirtual #101                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       205: aload_3
       206: athrow
       207: goto          220
       210: astore_2
       211: getstatic     #108                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       214: ldc           #142                // String Couldn\'t remove recipe.
       216: aload_2
       217: invokevirtual #114                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       220: return
      Exception table:
         from    to  target type
           101   130   143   Class java/lang/Throwable
           149   155   158   Class java/lang/Throwable
            92   170   183   Class java/lang/Throwable
           188   194   197   Class java/lang/Throwable
            88   207   210   Class java/lang/Exception
      LineNumberTable:
        line 144: 0
        line 145: 10
        line 147: 11
        line 148: 27
        line 149: 44
        line 150: 60
        line 152: 74
        line 154: 88
        line 155: 92
        line 157: 101
        line 158: 115
        line 159: 123
        line 160: 130
        line 154: 143
        line 160: 170
        line 154: 183
        line 164: 207
        line 161: 210
        line 163: 211
        line 165: 220
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          101      69     3    ps   Ljava/sql/PreparedStatement;
           92     115     2   con   Ljava/sql/Connection;
          211       9     2     e   Ljava/lang/Exception;
            0     221     0  this   Lext/mods/gameserver/model/actor/container/player/RecipeBook;
            0     221     1 recipeId   I
      StackMapTable: number_of_entries = 13
        frame_type = 11 /* same */
        frame_type = 32 /* same */
        frame_type = 29 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 68
          locals = [ class ext/mods/gameserver/model/actor/container/player/RecipeBook, int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/actor/container/player/RecipeBook, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/actor/container/player/RecipeBook, int, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 9 /* same */

  public void restore();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=6, args_size=1
         0: invokestatic  #70                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         3: astore_1
         4: aload_1
         5: ldc           #144                // String SELECT recipeId FROM character_recipebook WHERE charId=?
         7: invokeinterface #78,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        12: astore_2
        13: aload_2
        14: iconst_1
        15: aload_0
        16: getfield      #19                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
        19: invokevirtual #84                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        22: invokeinterface #87,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        27: aload_2
        28: invokeinterface #146,  1          // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
        33: astore_3
        34: aload_3
        35: invokeinterface #150,  1          // InterfaceMethod java/sql/ResultSet.next:()Z
        40: ifeq          74
        43: invokestatic  #155                // Method ext/mods/gameserver/data/xml/RecipeData.getInstance:()Lext/mods/gameserver/data/xml/RecipeData;
        46: aload_3
        47: ldc           #161                // String recipeId
        49: invokeinterface #162,  2          // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        54: invokevirtual #166                // Method ext/mods/gameserver/data/xml/RecipeData.getRecipeList:(I)Lext/mods/gameserver/model/records/Recipe;
        57: astore        4
        59: aload_0
        60: aload         4
        62: aload         4
        64: invokevirtual #170                // Method ext/mods/gameserver/model/records/Recipe.isDwarven:()Z
        67: iconst_0
        68: invokevirtual #171                // Method putRecipe:(Lext/mods/gameserver/model/records/Recipe;ZZ)V
        71: goto          34
        74: aload_3
        75: ifnull        114
        78: aload_3
        79: invokeinterface #175,  1          // InterfaceMethod java/sql/ResultSet.close:()V
        84: goto          114
        87: astore        4
        89: aload_3
        90: ifnull        111
        93: aload_3
        94: invokeinterface #175,  1          // InterfaceMethod java/sql/ResultSet.close:()V
        99: goto          111
       102: astore        5
       104: aload         4
       106: aload         5
       108: invokevirtual #101                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       111: aload         4
       113: athrow
       114: aload_2
       115: ifnull        151
       118: aload_2
       119: invokeinterface #96,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       124: goto          151
       127: astore_3
       128: aload_2
       129: ifnull        149
       132: aload_2
       133: invokeinterface #96,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       138: goto          149
       141: astore        4
       143: aload_3
       144: aload         4
       146: invokevirtual #101                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       149: aload_3
       150: athrow
       151: aload_1
       152: ifnull        186
       155: aload_1
       156: invokeinterface #105,  1          // InterfaceMethod java/sql/Connection.close:()V
       161: goto          186
       164: astore_2
       165: aload_1
       166: ifnull        184
       169: aload_1
       170: invokeinterface #105,  1          // InterfaceMethod java/sql/Connection.close:()V
       175: goto          184
       178: astore_3
       179: aload_2
       180: aload_3
       181: invokevirtual #101                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       184: aload_2
       185: athrow
       186: goto          199
       189: astore_1
       190: getstatic     #108                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       193: ldc           #176                // String Couldn\'t restore recipe book data.
       195: aload_1
       196: invokevirtual #114                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       199: return
      Exception table:
         from    to  target type
            34    74    87   Class java/lang/Throwable
            93    99   102   Class java/lang/Throwable
            13   114   127   Class java/lang/Throwable
           132   138   141   Class java/lang/Throwable
             4   151   164   Class java/lang/Throwable
           169   175   178   Class java/lang/Throwable
             0   186   189   Class java/lang/Exception
      LineNumberTable:
        line 172: 0
        line 173: 4
        line 175: 13
        line 177: 27
        line 179: 34
        line 181: 43
        line 182: 59
        line 183: 71
        line 184: 74
        line 177: 87
        line 185: 114
        line 172: 127
        line 185: 151
        line 172: 164
        line 189: 186
        line 186: 189
        line 188: 190
        line 190: 199
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           59      12     4 recipe   Lext/mods/gameserver/model/records/Recipe;
           34      80     3    rs   Ljava/sql/ResultSet;
           13     138     2    ps   Ljava/sql/PreparedStatement;
            4     182     1   con   Ljava/sql/Connection;
          190       9     1     e   Ljava/lang/Exception;
            0     200     0  this   Lext/mods/gameserver/model/actor/container/player/RecipeBook;
      StackMapTable: number_of_entries = 16
        frame_type = 254 /* append */
          offset_delta = 34
          locals = [ class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet ]
        frame_type = 39 /* same */
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/actor/container/player/RecipeBook, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/actor/container/player/RecipeBook, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/actor/container/player/RecipeBook, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 9 /* same */

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #115                // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #11                 // class ext/mods/gameserver/model/actor/container/player/RecipeBook
         6: invokevirtual #178                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #184                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #108                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 39: 0
}
SourceFile: "RecipeBook.java"
