// Bytecode for: ext.mods.gameserver.handler.itemhandlers.Recipes
// File: ext\mods\gameserver\handler\itemhandlers\Recipes.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/itemhandlers/Recipes.class
  Last modified 9 de jul de 2026; size 4496 bytes
  MD5 checksum 9e8004bc452d782bd0abf19365e17390
  Compiled from "Recipes.java"
public class ext.mods.gameserver.handler.itemhandlers.Recipes implements ext.mods.gameserver.handler.IItemHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #179                        // ext/mods/gameserver/handler/itemhandlers/Recipes
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 0, methods: 2, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // ext/mods/gameserver/model/actor/Player
    #8 = Utf8               ext/mods/gameserver/model/actor/Player
    #9 = Fieldref           #10.#11       // ext/mods/Config.IS_CRAFTING_ENABLED:Z
   #10 = Class              #12           // ext/mods/Config
   #11 = NameAndType        #13:#14       // IS_CRAFTING_ENABLED:Z
   #12 = Utf8               ext/mods/Config
   #13 = Utf8               IS_CRAFTING_ENABLED
   #14 = Utf8               Z
   #15 = String             #16           // Crafting is disabled, you cannot register this recipe.
   #16 = Utf8               Crafting is disabled, you cannot register this recipe.
   #17 = Methodref          #7.#18        // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #18 = NameAndType        #19:#20       // sendMessage:(Ljava/lang/String;)V
   #19 = Utf8               sendMessage
   #20 = Utf8               (Ljava/lang/String;)V
   #21 = Methodref          #7.#22        // ext/mods/gameserver/model/actor/Player.isCrafting:()Z
   #22 = NameAndType        #23:#24       // isCrafting:()Z
   #23 = Utf8               isCrafting
   #24 = Utf8               ()Z
   #25 = Fieldref           #26.#27       // ext/mods/gameserver/network/SystemMessageId.CANT_ALTER_RECIPEBOOK_WHILE_CRAFTING:Lext/mods/gameserver/network/SystemMessageId;
   #26 = Class              #28           // ext/mods/gameserver/network/SystemMessageId
   #27 = NameAndType        #29:#30       // CANT_ALTER_RECIPEBOOK_WHILE_CRAFTING:Lext/mods/gameserver/network/SystemMessageId;
   #28 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #29 = Utf8               CANT_ALTER_RECIPEBOOK_WHILE_CRAFTING
   #30 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #31 = Methodref          #7.#32        // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #32 = NameAndType        #33:#34       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #33 = Utf8               sendPacket
   #34 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #35 = Methodref          #36.#37       // ext/mods/gameserver/data/xml/RecipeData.getInstance:()Lext/mods/gameserver/data/xml/RecipeData;
   #36 = Class              #38           // ext/mods/gameserver/data/xml/RecipeData
   #37 = NameAndType        #39:#40       // getInstance:()Lext/mods/gameserver/data/xml/RecipeData;
   #38 = Utf8               ext/mods/gameserver/data/xml/RecipeData
   #39 = Utf8               getInstance
   #40 = Utf8               ()Lext/mods/gameserver/data/xml/RecipeData;
   #41 = Methodref          #42.#43       // ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
   #42 = Class              #44           // ext/mods/gameserver/model/item/instance/ItemInstance
   #43 = NameAndType        #45:#46       // getItemId:()I
   #44 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
   #45 = Utf8               getItemId
   #46 = Utf8               ()I
   #47 = Methodref          #36.#48       // ext/mods/gameserver/data/xml/RecipeData.getRecipeByItemId:(I)Lext/mods/gameserver/model/records/Recipe;
   #48 = NameAndType        #49:#50       // getRecipeByItemId:(I)Lext/mods/gameserver/model/records/Recipe;
   #49 = Utf8               getRecipeByItemId
   #50 = Utf8               (I)Lext/mods/gameserver/model/records/Recipe;
   #51 = Methodref          #7.#52        // ext/mods/gameserver/model/actor/Player.getRecipeBook:()Lext/mods/gameserver/model/actor/container/player/RecipeBook;
   #52 = NameAndType        #53:#54       // getRecipeBook:()Lext/mods/gameserver/model/actor/container/player/RecipeBook;
   #53 = Utf8               getRecipeBook
   #54 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/RecipeBook;
   #55 = Methodref          #56.#57       // ext/mods/gameserver/model/records/Recipe.id:()I
   #56 = Class              #58           // ext/mods/gameserver/model/records/Recipe
   #57 = NameAndType        #59:#46       // id:()I
   #58 = Utf8               ext/mods/gameserver/model/records/Recipe
   #59 = Utf8               id
   #60 = Methodref          #61.#62       // ext/mods/gameserver/model/actor/container/player/RecipeBook.hasRecipe:(I)Z
   #61 = Class              #63           // ext/mods/gameserver/model/actor/container/player/RecipeBook
   #62 = NameAndType        #64:#65       // hasRecipe:(I)Z
   #63 = Utf8               ext/mods/gameserver/model/actor/container/player/RecipeBook
   #64 = Utf8               hasRecipe
   #65 = Utf8               (I)Z
   #66 = Fieldref           #26.#67       // ext/mods/gameserver/network/SystemMessageId.RECIPE_ALREADY_REGISTERED:Lext/mods/gameserver/network/SystemMessageId;
   #67 = NameAndType        #68:#30       // RECIPE_ALREADY_REGISTERED:Lext/mods/gameserver/network/SystemMessageId;
   #68 = Utf8               RECIPE_ALREADY_REGISTERED
   #69 = Methodref          #56.#70       // ext/mods/gameserver/model/records/Recipe.isDwarven:()Z
   #70 = NameAndType        #71:#24       // isDwarven:()Z
   #71 = Utf8               isDwarven
   #72 = Methodref          #7.#73        // ext/mods/gameserver/model/actor/Player.hasDwarvenCraft:()Z
   #73 = NameAndType        #74:#24       // hasDwarvenCraft:()Z
   #74 = Utf8               hasDwarvenCraft
   #75 = Fieldref           #26.#76       // ext/mods/gameserver/network/SystemMessageId.CANT_REGISTER_NO_ABILITY_TO_CRAFT:Lext/mods/gameserver/network/SystemMessageId;
   #76 = NameAndType        #77:#30       // CANT_REGISTER_NO_ABILITY_TO_CRAFT:Lext/mods/gameserver/network/SystemMessageId;
   #77 = Utf8               CANT_REGISTER_NO_ABILITY_TO_CRAFT
   #78 = Methodref          #7.#79        // ext/mods/gameserver/model/actor/Player.getOperateType:()Lext/mods/gameserver/enums/actors/OperateType;
   #79 = NameAndType        #80:#81       // getOperateType:()Lext/mods/gameserver/enums/actors/OperateType;
   #80 = Utf8               getOperateType
   #81 = Utf8               ()Lext/mods/gameserver/enums/actors/OperateType;
   #82 = Fieldref           #83.#84       // ext/mods/gameserver/enums/actors/OperateType.MANUFACTURE:Lext/mods/gameserver/enums/actors/OperateType;
   #83 = Class              #85           // ext/mods/gameserver/enums/actors/OperateType
   #84 = NameAndType        #86:#87       // MANUFACTURE:Lext/mods/gameserver/enums/actors/OperateType;
   #85 = Utf8               ext/mods/gameserver/enums/actors/OperateType
   #86 = Utf8               MANUFACTURE
   #87 = Utf8               Lext/mods/gameserver/enums/actors/OperateType;
   #88 = Methodref          #56.#89       // ext/mods/gameserver/model/records/Recipe.level:()I
   #89 = NameAndType        #90:#46       // level:()I
   #90 = Utf8               level
   #91 = Class              #92           // ext/mods/gameserver/skills/L2Skill
   #92 = Utf8               ext/mods/gameserver/skills/L2Skill
   #93 = Methodref          #7.#94        // ext/mods/gameserver/model/actor/Player.getSkillLevel:(I)I
   #94 = NameAndType        #95:#96       // getSkillLevel:(I)I
   #95 = Utf8               getSkillLevel
   #96 = Utf8               (I)I
   #97 = Fieldref           #26.#98       // ext/mods/gameserver/network/SystemMessageId.CREATE_LVL_TOO_LOW_TO_REGISTER:Lext/mods/gameserver/network/SystemMessageId;
   #98 = NameAndType        #99:#30       // CREATE_LVL_TOO_LOW_TO_REGISTER:Lext/mods/gameserver/network/SystemMessageId;
   #99 = Utf8               CREATE_LVL_TOO_LOW_TO_REGISTER
  #100 = Methodref          #61.#101      // ext/mods/gameserver/model/actor/container/player/RecipeBook.get:(Z)Ljava/util/Collection;
  #101 = NameAndType        #102:#103     // get:(Z)Ljava/util/Collection;
  #102 = Utf8               get
  #103 = Utf8               (Z)Ljava/util/Collection;
  #104 = InterfaceMethodref #105.#106     // java/util/Collection.size:()I
  #105 = Class              #107          // java/util/Collection
  #106 = NameAndType        #108:#46      // size:()I
  #107 = Utf8               java/util/Collection
  #108 = Utf8               size
  #109 = Methodref          #7.#110       // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #110 = NameAndType        #111:#112     // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #111 = Utf8               getStatus
  #112 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #113 = Methodref          #114.#115     // ext/mods/gameserver/model/actor/status/PlayerStatus.getDwarfRecipeLimit:()I
  #114 = Class              #116          // ext/mods/gameserver/model/actor/status/PlayerStatus
  #115 = NameAndType        #117:#46      // getDwarfRecipeLimit:()I
  #116 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
  #117 = Utf8               getDwarfRecipeLimit
  #118 = Fieldref           #26.#119      // ext/mods/gameserver/network/SystemMessageId.UP_TO_S1_RECIPES_CAN_REGISTER:Lext/mods/gameserver/network/SystemMessageId;
  #119 = NameAndType        #120:#30      // UP_TO_S1_RECIPES_CAN_REGISTER:Lext/mods/gameserver/network/SystemMessageId;
  #120 = Utf8               UP_TO_S1_RECIPES_CAN_REGISTER
  #121 = Methodref          #122.#123     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #122 = Class              #124          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #123 = NameAndType        #125:#126     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #124 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #125 = Utf8               getSystemMessage
  #126 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #127 = Methodref          #122.#128     // ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #128 = NameAndType        #129:#130     // addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #129 = Utf8               addNumber
  #130 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #131 = Methodref          #7.#132       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #132 = NameAndType        #33:#133      // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #133 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #134 = Methodref          #42.#135      // ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
  #135 = NameAndType        #136:#46      // getObjectId:()I
  #136 = Utf8               getObjectId
  #137 = Methodref          #7.#138       // ext/mods/gameserver/model/actor/Player.destroyItem:(IIZ)Z
  #138 = NameAndType        #139:#140     // destroyItem:(IIZ)Z
  #139 = Utf8               destroyItem
  #140 = Utf8               (IIZ)Z
  #141 = Methodref          #61.#142      // ext/mods/gameserver/model/actor/container/player/RecipeBook.putRecipe:(Lext/mods/gameserver/model/records/Recipe;ZZ)V
  #142 = NameAndType        #143:#144     // putRecipe:(Lext/mods/gameserver/model/records/Recipe;ZZ)V
  #143 = Utf8               putRecipe
  #144 = Utf8               (Lext/mods/gameserver/model/records/Recipe;ZZ)V
  #145 = Fieldref           #26.#146      // ext/mods/gameserver/network/SystemMessageId.S1_ADDED:Lext/mods/gameserver/network/SystemMessageId;
  #146 = NameAndType        #147:#30      // S1_ADDED:Lext/mods/gameserver/network/SystemMessageId;
  #147 = Utf8               S1_ADDED
  #148 = Methodref          #122.#149     // ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #149 = NameAndType        #150:#151     // addItemName:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #150 = Utf8               addItemName
  #151 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #152 = Class              #153          // ext/mods/gameserver/network/serverpackets/RecipeBookItemList
  #153 = Utf8               ext/mods/gameserver/network/serverpackets/RecipeBookItemList
  #154 = Methodref          #152.#155     // ext/mods/gameserver/network/serverpackets/RecipeBookItemList."<init>":(Lext/mods/gameserver/model/actor/Player;Z)V
  #155 = NameAndType        #5:#156       // "<init>":(Lext/mods/gameserver/model/actor/Player;Z)V
  #156 = Utf8               (Lext/mods/gameserver/model/actor/Player;Z)V
  #157 = Methodref          #7.#158       // ext/mods/gameserver/model/actor/Player.getMissions:()Lext/mods/gameserver/model/actor/container/player/MissionList;
  #158 = NameAndType        #159:#160     // getMissions:()Lext/mods/gameserver/model/actor/container/player/MissionList;
  #159 = Utf8               getMissions
  #160 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/MissionList;
  #161 = Fieldref           #162.#163     // ext/mods/gameserver/enums/actors/MissionType.RECIPE_LEARN:Lext/mods/gameserver/enums/actors/MissionType;
  #162 = Class              #164          // ext/mods/gameserver/enums/actors/MissionType
  #163 = NameAndType        #165:#166     // RECIPE_LEARN:Lext/mods/gameserver/enums/actors/MissionType;
  #164 = Utf8               ext/mods/gameserver/enums/actors/MissionType
  #165 = Utf8               RECIPE_LEARN
  #166 = Utf8               Lext/mods/gameserver/enums/actors/MissionType;
  #167 = Methodref          #168.#169     // ext/mods/gameserver/model/actor/container/player/MissionList.update:(Lext/mods/gameserver/enums/actors/MissionType;)V
  #168 = Class              #170          // ext/mods/gameserver/model/actor/container/player/MissionList
  #169 = NameAndType        #171:#172     // update:(Lext/mods/gameserver/enums/actors/MissionType;)V
  #170 = Utf8               ext/mods/gameserver/model/actor/container/player/MissionList
  #171 = Utf8               update
  #172 = Utf8               (Lext/mods/gameserver/enums/actors/MissionType;)V
  #173 = Methodref          #7.#174       // ext/mods/gameserver/model/actor/Player.hasCommonCraft:()Z
  #174 = NameAndType        #175:#24      // hasCommonCraft:()Z
  #175 = Utf8               hasCommonCraft
  #176 = Methodref          #114.#177     // ext/mods/gameserver/model/actor/status/PlayerStatus.getCommonRecipeLimit:()I
  #177 = NameAndType        #178:#46      // getCommonRecipeLimit:()I
  #178 = Utf8               getCommonRecipeLimit
  #179 = Class              #180          // ext/mods/gameserver/handler/itemhandlers/Recipes
  #180 = Utf8               ext/mods/gameserver/handler/itemhandlers/Recipes
  #181 = Class              #182          // ext/mods/gameserver/handler/IItemHandler
  #182 = Utf8               ext/mods/gameserver/handler/IItemHandler
  #183 = Utf8               Code
  #184 = Utf8               LineNumberTable
  #185 = Utf8               LocalVariableTable
  #186 = Utf8               this
  #187 = Utf8               Lext/mods/gameserver/handler/itemhandlers/Recipes;
  #188 = Utf8               useItem
  #189 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #190 = Utf8               player
  #191 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #192 = Utf8               playable
  #193 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #194 = Utf8               item
  #195 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #196 = Utf8               forceUse
  #197 = Utf8               recipe
  #198 = Utf8               Lext/mods/gameserver/model/records/Recipe;
  #199 = Utf8               StackMapTable
  #200 = Utf8               SourceFile
  #201 = Utf8               Recipes.java
{
  public ext.mods.gameserver.handler.itemhandlers.Recipes();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 34: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/itemhandlers/Recipes;

  public void useItem(ext.mods.gameserver.model.actor.Playable, ext.mods.gameserver.model.item.instance.ItemInstance, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=7, args_size=4
         0: aload_1
         1: instanceof    #7                  // class ext/mods/gameserver/model/actor/Player
         4: ifeq          16
         7: aload_1
         8: checkcast     #7                  // class ext/mods/gameserver/model/actor/Player
        11: astore        4
        13: goto          17
        16: return
        17: getstatic     #9                  // Field ext/mods/Config.IS_CRAFTING_ENABLED:Z
        20: ifne          31
        23: aload         4
        25: ldc           #15                 // String Crafting is disabled, you cannot register this recipe.
        27: invokevirtual #17                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        30: return
        31: aload         4
        33: invokevirtual #21                 // Method ext/mods/gameserver/model/actor/Player.isCrafting:()Z
        36: ifeq          48
        39: aload         4
        41: getstatic     #25                 // Field ext/mods/gameserver/network/SystemMessageId.CANT_ALTER_RECIPEBOOK_WHILE_CRAFTING:Lext/mods/gameserver/network/SystemMessageId;
        44: invokevirtual #31                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        47: return
        48: invokestatic  #35                 // Method ext/mods/gameserver/data/xml/RecipeData.getInstance:()Lext/mods/gameserver/data/xml/RecipeData;
        51: aload_2
        52: invokevirtual #41                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        55: invokevirtual #47                 // Method ext/mods/gameserver/data/xml/RecipeData.getRecipeByItemId:(I)Lext/mods/gameserver/model/records/Recipe;
        58: astore        5
        60: aload         5
        62: ifnonnull     66
        65: return
        66: aload         4
        68: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Player.getRecipeBook:()Lext/mods/gameserver/model/actor/container/player/RecipeBook;
        71: aload         5
        73: invokevirtual #55                 // Method ext/mods/gameserver/model/records/Recipe.id:()I
        76: invokevirtual #60                 // Method ext/mods/gameserver/model/actor/container/player/RecipeBook.hasRecipe:(I)Z
        79: ifeq          91
        82: aload         4
        84: getstatic     #66                 // Field ext/mods/gameserver/network/SystemMessageId.RECIPE_ALREADY_REGISTERED:Lext/mods/gameserver/network/SystemMessageId;
        87: invokevirtual #31                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        90: return
        91: aload         5
        93: invokevirtual #69                 // Method ext/mods/gameserver/model/records/Recipe.isDwarven:()Z
        96: istore        6
        98: iload         6
       100: ifeq          294
       103: aload         4
       105: invokevirtual #72                 // Method ext/mods/gameserver/model/actor/Player.hasDwarvenCraft:()Z
       108: ifne          122
       111: aload         4
       113: getstatic     #75                 // Field ext/mods/gameserver/network/SystemMessageId.CANT_REGISTER_NO_ABILITY_TO_CRAFT:Lext/mods/gameserver/network/SystemMessageId;
       116: invokevirtual #31                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       119: goto          482
       122: aload         4
       124: invokevirtual #78                 // Method ext/mods/gameserver/model/actor/Player.getOperateType:()Lext/mods/gameserver/enums/actors/OperateType;
       127: getstatic     #82                 // Field ext/mods/gameserver/enums/actors/OperateType.MANUFACTURE:Lext/mods/gameserver/enums/actors/OperateType;
       130: if_acmpne     144
       133: aload         4
       135: getstatic     #25                 // Field ext/mods/gameserver/network/SystemMessageId.CANT_ALTER_RECIPEBOOK_WHILE_CRAFTING:Lext/mods/gameserver/network/SystemMessageId;
       138: invokevirtual #31                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       141: goto          482
       144: aload         5
       146: invokevirtual #88                 // Method ext/mods/gameserver/model/records/Recipe.level:()I
       149: aload         4
       151: sipush        172
       154: invokevirtual #93                 // Method ext/mods/gameserver/model/actor/Player.getSkillLevel:(I)I
       157: if_icmple     171
       160: aload         4
       162: getstatic     #97                 // Field ext/mods/gameserver/network/SystemMessageId.CREATE_LVL_TOO_LOW_TO_REGISTER:Lext/mods/gameserver/network/SystemMessageId;
       165: invokevirtual #31                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       168: goto          482
       171: aload         4
       173: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Player.getRecipeBook:()Lext/mods/gameserver/model/actor/container/player/RecipeBook;
       176: iload         6
       178: invokevirtual #100                // Method ext/mods/gameserver/model/actor/container/player/RecipeBook.get:(Z)Ljava/util/Collection;
       181: invokeinterface #104,  1          // InterfaceMethod java/util/Collection.size:()I
       186: aload         4
       188: invokevirtual #109                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       191: invokevirtual #113                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getDwarfRecipeLimit:()I
       194: if_icmplt     222
       197: aload         4
       199: getstatic     #118                // Field ext/mods/gameserver/network/SystemMessageId.UP_TO_S1_RECIPES_CAN_REGISTER:Lext/mods/gameserver/network/SystemMessageId;
       202: invokestatic  #121                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       205: aload         4
       207: invokevirtual #109                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       210: invokevirtual #113                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getDwarfRecipeLimit:()I
       213: invokevirtual #127                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       216: invokevirtual #131                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       219: goto          482
       222: aload         4
       224: aload_2
       225: invokevirtual #134                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
       228: iconst_1
       229: iconst_0
       230: invokevirtual #137                // Method ext/mods/gameserver/model/actor/Player.destroyItem:(IIZ)Z
       233: ifeq          482
       236: aload         4
       238: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Player.getRecipeBook:()Lext/mods/gameserver/model/actor/container/player/RecipeBook;
       241: aload         5
       243: iload         6
       245: iconst_1
       246: invokevirtual #141                // Method ext/mods/gameserver/model/actor/container/player/RecipeBook.putRecipe:(Lext/mods/gameserver/model/records/Recipe;ZZ)V
       249: aload         4
       251: getstatic     #145                // Field ext/mods/gameserver/network/SystemMessageId.S1_ADDED:Lext/mods/gameserver/network/SystemMessageId;
       254: invokestatic  #121                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       257: aload_2
       258: invokevirtual #148                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       261: invokevirtual #131                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       264: aload         4
       266: new           #152                // class ext/mods/gameserver/network/serverpackets/RecipeBookItemList
       269: dup
       270: aload         4
       272: iload         6
       274: invokespecial #154                // Method ext/mods/gameserver/network/serverpackets/RecipeBookItemList."<init>":(Lext/mods/gameserver/model/actor/Player;Z)V
       277: invokevirtual #131                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       280: aload         4
       282: invokevirtual #157                // Method ext/mods/gameserver/model/actor/Player.getMissions:()Lext/mods/gameserver/model/actor/container/player/MissionList;
       285: getstatic     #161                // Field ext/mods/gameserver/enums/actors/MissionType.RECIPE_LEARN:Lext/mods/gameserver/enums/actors/MissionType;
       288: invokevirtual #167                // Method ext/mods/gameserver/model/actor/container/player/MissionList.update:(Lext/mods/gameserver/enums/actors/MissionType;)V
       291: goto          482
       294: aload         4
       296: invokevirtual #173                // Method ext/mods/gameserver/model/actor/Player.hasCommonCraft:()Z
       299: ifne          313
       302: aload         4
       304: getstatic     #75                 // Field ext/mods/gameserver/network/SystemMessageId.CANT_REGISTER_NO_ABILITY_TO_CRAFT:Lext/mods/gameserver/network/SystemMessageId;
       307: invokevirtual #31                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       310: goto          482
       313: aload         4
       315: invokevirtual #78                 // Method ext/mods/gameserver/model/actor/Player.getOperateType:()Lext/mods/gameserver/enums/actors/OperateType;
       318: getstatic     #82                 // Field ext/mods/gameserver/enums/actors/OperateType.MANUFACTURE:Lext/mods/gameserver/enums/actors/OperateType;
       321: if_acmpne     335
       324: aload         4
       326: getstatic     #25                 // Field ext/mods/gameserver/network/SystemMessageId.CANT_ALTER_RECIPEBOOK_WHILE_CRAFTING:Lext/mods/gameserver/network/SystemMessageId;
       329: invokevirtual #31                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       332: goto          482
       335: aload         5
       337: invokevirtual #88                 // Method ext/mods/gameserver/model/records/Recipe.level:()I
       340: aload         4
       342: sipush        1320
       345: invokevirtual #93                 // Method ext/mods/gameserver/model/actor/Player.getSkillLevel:(I)I
       348: if_icmple     362
       351: aload         4
       353: getstatic     #97                 // Field ext/mods/gameserver/network/SystemMessageId.CREATE_LVL_TOO_LOW_TO_REGISTER:Lext/mods/gameserver/network/SystemMessageId;
       356: invokevirtual #31                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       359: goto          482
       362: aload         4
       364: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Player.getRecipeBook:()Lext/mods/gameserver/model/actor/container/player/RecipeBook;
       367: iload         6
       369: invokevirtual #100                // Method ext/mods/gameserver/model/actor/container/player/RecipeBook.get:(Z)Ljava/util/Collection;
       372: invokeinterface #104,  1          // InterfaceMethod java/util/Collection.size:()I
       377: aload         4
       379: invokevirtual #109                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       382: invokevirtual #176                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getCommonRecipeLimit:()I
       385: if_icmplt     413
       388: aload         4
       390: getstatic     #118                // Field ext/mods/gameserver/network/SystemMessageId.UP_TO_S1_RECIPES_CAN_REGISTER:Lext/mods/gameserver/network/SystemMessageId;
       393: invokestatic  #121                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       396: aload         4
       398: invokevirtual #109                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       401: invokevirtual #176                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getCommonRecipeLimit:()I
       404: invokevirtual #127                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       407: invokevirtual #131                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       410: goto          482
       413: aload         4
       415: aload_2
       416: invokevirtual #134                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
       419: iconst_1
       420: iconst_0
       421: invokevirtual #137                // Method ext/mods/gameserver/model/actor/Player.destroyItem:(IIZ)Z
       424: ifeq          482
       427: aload         4
       429: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Player.getRecipeBook:()Lext/mods/gameserver/model/actor/container/player/RecipeBook;
       432: aload         5
       434: iload         6
       436: iconst_1
       437: invokevirtual #141                // Method ext/mods/gameserver/model/actor/container/player/RecipeBook.putRecipe:(Lext/mods/gameserver/model/records/Recipe;ZZ)V
       440: aload         4
       442: getstatic     #145                // Field ext/mods/gameserver/network/SystemMessageId.S1_ADDED:Lext/mods/gameserver/network/SystemMessageId;
       445: invokestatic  #121                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       448: aload_2
       449: invokevirtual #148                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       452: invokevirtual #131                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       455: aload         4
       457: new           #152                // class ext/mods/gameserver/network/serverpackets/RecipeBookItemList
       460: dup
       461: aload         4
       463: iload         6
       465: invokespecial #154                // Method ext/mods/gameserver/network/serverpackets/RecipeBookItemList."<init>":(Lext/mods/gameserver/model/actor/Player;Z)V
       468: invokevirtual #131                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       471: aload         4
       473: invokevirtual #157                // Method ext/mods/gameserver/model/actor/Player.getMissions:()Lext/mods/gameserver/model/actor/container/player/MissionList;
       476: getstatic     #161                // Field ext/mods/gameserver/enums/actors/MissionType.RECIPE_LEARN:Lext/mods/gameserver/enums/actors/MissionType;
       479: invokevirtual #167                // Method ext/mods/gameserver/model/actor/container/player/MissionList.update:(Lext/mods/gameserver/enums/actors/MissionType;)V
       482: return
      LineNumberTable:
        line 39: 0
        line 40: 16
        line 42: 17
        line 44: 23
        line 45: 30
        line 48: 31
        line 50: 39
        line 51: 47
        line 54: 48
        line 55: 60
        line 56: 65
        line 58: 66
        line 60: 82
        line 61: 90
        line 64: 91
        line 65: 98
        line 67: 103
        line 68: 111
        line 69: 122
        line 70: 133
        line 71: 144
        line 72: 160
        line 73: 171
        line 74: 197
        line 75: 222
        line 77: 236
        line 78: 249
        line 79: 264
        line 80: 280
        line 85: 294
        line 86: 302
        line 87: 313
        line 88: 324
        line 89: 335
        line 90: 351
        line 91: 362
        line 92: 388
        line 93: 413
        line 95: 427
        line 96: 440
        line 97: 455
        line 98: 471
        line 101: 482
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           13       3     4 player   Lext/mods/gameserver/model/actor/Player;
            0     483     0  this   Lext/mods/gameserver/handler/itemhandlers/Recipes;
            0     483     1 playable   Lext/mods/gameserver/model/actor/Playable;
            0     483     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0     483     3 forceUse   Z
           17     466     4 player   Lext/mods/gameserver/model/actor/Player;
           60     423     5 recipe   Lext/mods/gameserver/model/records/Recipe;
           98     385     6 isDwarven   Z
      StackMapTable: number_of_entries = 16
        frame_type = 16 /* same */
        frame_type = 252 /* append */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 13 /* same */
        frame_type = 16 /* same */
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/model/records/Recipe ]
        frame_type = 24 /* same */
        frame_type = 252 /* append */
          offset_delta = 30
          locals = [ int ]
        frame_type = 21 /* same */
        frame_type = 26 /* same */
        frame_type = 50 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 71
        frame_type = 18 /* same */
        frame_type = 21 /* same */
        frame_type = 26 /* same */
        frame_type = 50 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 68
}
SourceFile: "Recipes.java"
