// Bytecode for: ext.mods.gameserver.handler.itemhandlers.AgathionItems
// File: ext\mods\gameserver\handler\itemhandlers\AgathionItems.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/itemhandlers/AgathionItems.class
  Last modified 9 de jul de 2026; size 5575 bytes
  MD5 checksum c7570adeba7806aae2ea9e38be85764b
  Compiled from "AgathionItems.java"
public class ext.mods.gameserver.handler.itemhandlers.AgathionItems implements ext.mods.gameserver.handler.IItemHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #177                        // ext/mods/gameserver/handler/itemhandlers/AgathionItems
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 0, methods: 3, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // ext/mods/gameserver/model/actor/Player
    #8 = Utf8               ext/mods/gameserver/model/actor/Player
    #9 = Methodref          #10.#11       // ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
   #10 = Class              #12           // ext/mods/gameserver/model/item/instance/ItemInstance
   #11 = NameAndType        #13:#14       // getItemId:()I
   #12 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
   #13 = Utf8               getItemId
   #14 = Utf8               ()I
   #15 = Long               1000l
   #17 = Methodref          #18.#19       // java/lang/System.currentTimeMillis:()J
   #18 = Class              #20           // java/lang/System
   #19 = NameAndType        #21:#22       // currentTimeMillis:()J
   #20 = Utf8               java/lang/System
   #21 = Utf8               currentTimeMillis
   #22 = Utf8               ()J
   #23 = Methodref          #7.#24        // ext/mods/gameserver/model/actor/Player.getLastAgationSummonTime:()J
   #24 = NameAndType        #25:#22       // getLastAgationSummonTime:()J
   #25 = Utf8               getLastAgationSummonTime
   #26 = String             #27           // You must wait before performing this action again.
   #27 = Utf8               You must wait before performing this action again.
   #28 = Methodref          #7.#29        // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #29 = NameAndType        #30:#31       // sendMessage:(Ljava/lang/String;)V
   #30 = Utf8               sendMessage
   #31 = Utf8               (Ljava/lang/String;)V
   #32 = Methodref          #7.#33        // ext/mods/gameserver/model/actor/Player.setLastAgationSummonTime:(J)V
   #33 = NameAndType        #34:#35       // setLastAgationSummonTime:(J)V
   #34 = Utf8               setLastAgationSummonTime
   #35 = Utf8               (J)V
   #36 = Methodref          #37.#38       // ext/mods/Crypta/AgathionData.getInstance:()Lext/mods/Crypta/AgathionData;
   #37 = Class              #39           // ext/mods/Crypta/AgathionData
   #38 = NameAndType        #40:#41       // getInstance:()Lext/mods/Crypta/AgathionData;
   #39 = Utf8               ext/mods/Crypta/AgathionData
   #40 = Utf8               getInstance
   #41 = Utf8               ()Lext/mods/Crypta/AgathionData;
   #42 = String             #43           // AgathionData is not available.
   #43 = Utf8               AgathionData is not available.
   #44 = Methodref          #37.#45       // ext/mods/Crypta/AgathionData.getAgathionsByItemId:(I)Ljava/util/List;
   #45 = NameAndType        #46:#47       // getAgathionsByItemId:(I)Ljava/util/List;
   #46 = Utf8               getAgathionsByItemId
   #47 = Utf8               (I)Ljava/util/List;
   #48 = Class              #49           // java/lang/Exception
   #49 = Utf8               java/lang/Exception
   #50 = String             #51           // Error accessing AgathionData.
   #51 = Utf8               Error accessing AgathionData.
   #52 = Methodref          #48.#53       // java/lang/Exception.printStackTrace:()V
   #53 = NameAndType        #54:#6        // printStackTrace:()V
   #54 = Utf8               printStackTrace
   #55 = InterfaceMethodref #56.#57       // java/util/List.isEmpty:()Z
   #56 = Class              #58           // java/util/List
   #57 = NameAndType        #59:#60       // isEmpty:()Z
   #58 = Utf8               java/util/List
   #59 = Utf8               isEmpty
   #60 = Utf8               ()Z
   #61 = String             #62           // No Agathion is associated with this item.
   #62 = Utf8               No Agathion is associated with this item.
   #63 = InterfaceMethodref #56.#64       // java/util/List.get:(I)Ljava/lang/Object;
   #64 = NameAndType        #65:#66       // get:(I)Ljava/lang/Object;
   #65 = Utf8               get
   #66 = Utf8               (I)Ljava/lang/Object;
   #67 = Class              #68           // ext/mods/aghation/holder/AgathionHolder
   #68 = Utf8               ext/mods/aghation/holder/AgathionHolder
   #69 = Methodref          #7.#70        // ext/mods/gameserver/model/actor/Player.getCurrentAgation:()Lext/mods/gameserver/model/actor/instance/Agathion;
   #70 = NameAndType        #71:#72       // getCurrentAgation:()Lext/mods/gameserver/model/actor/instance/Agathion;
   #71 = Utf8               getCurrentAgation
   #72 = Utf8               ()Lext/mods/gameserver/model/actor/instance/Agathion;
   #73 = Methodref          #7.#74        // ext/mods/gameserver/model/actor/Player.getMemos:()Lext/mods/gameserver/model/memo/PlayerMemo;
   #74 = NameAndType        #75:#76       // getMemos:()Lext/mods/gameserver/model/memo/PlayerMemo;
   #75 = Utf8               getMemos
   #76 = Utf8               ()Lext/mods/gameserver/model/memo/PlayerMemo;
   #77 = String             #78           // agation
   #78 = Utf8               agation
   #79 = Methodref          #80.#81       // ext/mods/gameserver/model/memo/PlayerMemo.getInteger:(Ljava/lang/String;I)I
   #80 = Class              #82           // ext/mods/gameserver/model/memo/PlayerMemo
   #81 = NameAndType        #83:#84       // getInteger:(Ljava/lang/String;I)I
   #82 = Utf8               ext/mods/gameserver/model/memo/PlayerMemo
   #83 = Utf8               getInteger
   #84 = Utf8               (Ljava/lang/String;I)I
   #85 = Methodref          #7.#86        // ext/mods/gameserver/model/actor/Player.deletedAgation:(Lext/mods/gameserver/model/actor/instance/Agathion;)V
   #86 = NameAndType        #87:#88       // deletedAgation:(Lext/mods/gameserver/model/actor/instance/Agathion;)V
   #87 = Utf8               deletedAgation
   #88 = Utf8               (Lext/mods/gameserver/model/actor/instance/Agathion;)V
   #89 = Methodref          #7.#90        // ext/mods/gameserver/model/actor/Player.setCurrentAgation:(Lext/mods/gameserver/model/actor/instance/Agathion;)V
   #90 = NameAndType        #91:#88       // setCurrentAgation:(Lext/mods/gameserver/model/actor/instance/Agathion;)V
   #91 = Utf8               setCurrentAgation
   #92 = Methodref          #80.#93       // ext/mods/gameserver/model/memo/PlayerMemo.unset:(Ljava/lang/String;)V
   #93 = NameAndType        #94:#31       // unset:(Ljava/lang/String;)V
   #94 = Utf8               unset
   #95 = String             #96           // Agathion unsummoned.
   #96 = Utf8               Agathion unsummoned.
   #97 = Methodref          #98.#99       // ext/mods/gameserver/data/xml/NpcData.getInstance:()Lext/mods/gameserver/data/xml/NpcData;
   #98 = Class              #100          // ext/mods/gameserver/data/xml/NpcData
   #99 = NameAndType        #40:#101      // getInstance:()Lext/mods/gameserver/data/xml/NpcData;
  #100 = Utf8               ext/mods/gameserver/data/xml/NpcData
  #101 = Utf8               ()Lext/mods/gameserver/data/xml/NpcData;
  #102 = Methodref          #67.#103      // ext/mods/aghation/holder/AgathionHolder.getNpcId:()I
  #103 = NameAndType        #104:#14      // getNpcId:()I
  #104 = Utf8               getNpcId
  #105 = Methodref          #98.#106      // ext/mods/gameserver/data/xml/NpcData.getTemplate:(I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #106 = NameAndType        #107:#108     // getTemplate:(I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #107 = Utf8               getTemplate
  #108 = Utf8               (I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #109 = String             #110          // Cannot spawn the Agathion. NPC template not found.
  #110 = Utf8               Cannot spawn the Agathion. NPC template not found.
  #111 = Methodref          #112.#113     // ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
  #112 = Class              #114          // ext/mods/gameserver/data/SkillTable
  #113 = NameAndType        #40:#115      // getInstance:()Lext/mods/gameserver/data/SkillTable;
  #114 = Utf8               ext/mods/gameserver/data/SkillTable
  #115 = Utf8               ()Lext/mods/gameserver/data/SkillTable;
  #116 = Methodref          #112.#117     // ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #117 = NameAndType        #118:#119     // getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #118 = Utf8               getInfo
  #119 = Utf8               (II)Lext/mods/gameserver/skills/L2Skill;
  #120 = String             #121          // Summoning skill not found.
  #121 = Utf8               Summoning skill not found.
  #122 = Methodref          #7.#123       // ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
  #123 = NameAndType        #124:#125     // getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
  #124 = Utf8               getAI
  #125 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
  #126 = Methodref          #10.#127      // ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
  #127 = NameAndType        #128:#14      // getObjectId:()I
  #128 = Utf8               getObjectId
  #129 = Methodref          #130.#131     // ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZI)V
  #130 = Class              #132          // ext/mods/gameserver/model/actor/ai/type/PlayerAI
  #131 = NameAndType        #133:#134     // tryToCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZI)V
  #132 = Utf8               ext/mods/gameserver/model/actor/ai/type/PlayerAI
  #133 = Utf8               tryToCast
  #134 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZI)V
  #135 = Fieldref           #136.#137     // ext/mods/gameserver/network/SystemMessageId.SUMMON_A_PET:Lext/mods/gameserver/network/SystemMessageId;
  #136 = Class              #138          // ext/mods/gameserver/network/SystemMessageId
  #137 = NameAndType        #139:#140     // SUMMON_A_PET:Lext/mods/gameserver/network/SystemMessageId;
  #138 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #139 = Utf8               SUMMON_A_PET
  #140 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #141 = Methodref          #7.#142       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #142 = NameAndType        #143:#144     // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #143 = Utf8               sendPacket
  #144 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #145 = InvokeDynamic      #0:#146       // #0:run:(Lext/mods/gameserver/model/actor/Player;Lext/mods/aghation/holder/AgathionHolder;)Ljava/lang/Runnable;
  #146 = NameAndType        #147:#148     // run:(Lext/mods/gameserver/model/actor/Player;Lext/mods/aghation/holder/AgathionHolder;)Ljava/lang/Runnable;
  #147 = Utf8               run
  #148 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/aghation/holder/AgathionHolder;)Ljava/lang/Runnable;
  #149 = Methodref          #150.#151     // ext/mods/gameserver/skills/L2Skill.getHitTime:()I
  #150 = Class              #152          // ext/mods/gameserver/skills/L2Skill
  #151 = NameAndType        #153:#14      // getHitTime:()I
  #152 = Utf8               ext/mods/gameserver/skills/L2Skill
  #153 = Utf8               getHitTime
  #154 = Methodref          #155.#156     // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #155 = Class              #157          // ext/mods/commons/pool/ThreadPool
  #156 = NameAndType        #158:#159     // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #157 = Utf8               ext/mods/commons/pool/ThreadPool
  #158 = Utf8               schedule
  #159 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #160 = Methodref          #7.#161       // ext/mods/gameserver/model/actor/Player.getInstanceMap:()Lext/mods/InstanceMap/MapInstance;
  #161 = NameAndType        #162:#163     // getInstanceMap:()Lext/mods/InstanceMap/MapInstance;
  #162 = Utf8               getInstanceMap
  #163 = Utf8               ()Lext/mods/InstanceMap/MapInstance;
  #164 = Methodref          #165.#166     // ext/mods/gameserver/model/actor/instance/Agathion.setInstanceMap:(Lext/mods/InstanceMap/MapInstance;Z)V
  #165 = Class              #167          // ext/mods/gameserver/model/actor/instance/Agathion
  #166 = NameAndType        #168:#169     // setInstanceMap:(Lext/mods/InstanceMap/MapInstance;Z)V
  #167 = Utf8               ext/mods/gameserver/model/actor/instance/Agathion
  #168 = Utf8               setInstanceMap
  #169 = Utf8               (Lext/mods/InstanceMap/MapInstance;Z)V
  #170 = Methodref          #67.#171      // ext/mods/aghation/holder/AgathionHolder.getRunSpeed:()Z
  #171 = NameAndType        #172:#60      // getRunSpeed:()Z
  #172 = Utf8               getRunSpeed
  #173 = Methodref          #165.#174     // ext/mods/gameserver/model/actor/instance/Agathion.setRunning:(Z)V
  #174 = NameAndType        #175:#176     // setRunning:(Z)V
  #175 = Utf8               setRunning
  #176 = Utf8               (Z)V
  #177 = Class              #178          // ext/mods/gameserver/handler/itemhandlers/AgathionItems
  #178 = Utf8               ext/mods/gameserver/handler/itemhandlers/AgathionItems
  #179 = Class              #180          // ext/mods/gameserver/handler/IItemHandler
  #180 = Utf8               ext/mods/gameserver/handler/IItemHandler
  #181 = Utf8               Code
  #182 = Utf8               LineNumberTable
  #183 = Utf8               LocalVariableTable
  #184 = Utf8               this
  #185 = Utf8               Lext/mods/gameserver/handler/itemhandlers/AgathionItems;
  #186 = Utf8               useItem
  #187 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #188 = Utf8               tempList
  #189 = Utf8               Ljava/util/List;
  #190 = Utf8               e
  #191 = Utf8               Ljava/lang/Exception;
  #192 = Utf8               npcTemplate
  #193 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #194 = Utf8               skillToCast
  #195 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #196 = Utf8               playable
  #197 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #198 = Utf8               item
  #199 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #200 = Utf8               forceUse
  #201 = Utf8               Z
  #202 = Utf8               player
  #203 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #204 = Utf8               itemId
  #205 = Utf8               I
  #206 = Utf8               cooldown
  #207 = Utf8               J
  #208 = Utf8               currentTime
  #209 = Utf8               agathionDataInstance
  #210 = Utf8               Ljava/lang/Object;
  #211 = Utf8               agationList
  #212 = Utf8               agathionInfo
  #213 = Utf8               Lext/mods/aghation/holder/AgathionHolder;
  #214 = Utf8               LocalVariableTypeTable
  #215 = Utf8               Ljava/util/List<Lext/mods/aghation/holder/AgathionHolder;>;
  #216 = Utf8               StackMapTable
  #217 = Class              #218          // ext/mods/gameserver/model/actor/Playable
  #218 = Utf8               ext/mods/gameserver/model/actor/Playable
  #219 = Class              #220          // ext/mods/gameserver/model/actor/template/NpcTemplate
  #220 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
  #221 = Utf8               lambda$useItem$0
  #222 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/aghation/holder/AgathionHolder;)V
  #223 = Utf8               spawnedAgathion
  #224 = Utf8               Lext/mods/gameserver/model/actor/instance/Agathion;
  #225 = Utf8               SourceFile
  #226 = Utf8               AgathionItems.java
  #227 = Utf8               BootstrapMethods
  #228 = MethodType         #6            //  ()V
  #229 = MethodHandle       6:#230        // REF_invokeStatic ext/mods/gameserver/handler/itemhandlers/AgathionItems.lambda$useItem$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/aghation/holder/AgathionHolder;)V
  #230 = Methodref          #177.#231     // ext/mods/gameserver/handler/itemhandlers/AgathionItems.lambda$useItem$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/aghation/holder/AgathionHolder;)V
  #231 = NameAndType        #221:#222     // lambda$useItem$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/aghation/holder/AgathionHolder;)V
  #232 = MethodHandle       6:#233        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #233 = Methodref          #234.#235     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #234 = Class              #236          // java/lang/invoke/LambdaMetafactory
  #235 = NameAndType        #237:#238     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #236 = Utf8               java/lang/invoke/LambdaMetafactory
  #237 = Utf8               metafactory
  #238 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #239 = Utf8               InnerClasses
  #240 = Class              #241          // java/lang/invoke/MethodHandles$Lookup
  #241 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #242 = Class              #243          // java/lang/invoke/MethodHandles
  #243 = Utf8               java/lang/invoke/MethodHandles
  #244 = Utf8               Lookup
{
  public ext.mods.gameserver.handler.itemhandlers.AgathionItems();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 36: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/itemhandlers/AgathionItems;

  public void useItem(ext.mods.gameserver.model.actor.Playable, ext.mods.gameserver.model.item.instance.ItemInstance, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=15, args_size=4
         0: aload_1
         1: instanceof    #7                  // class ext/mods/gameserver/model/actor/Player
         4: ifne          8
         7: return
         8: aload_1
         9: checkcast     #7                  // class ext/mods/gameserver/model/actor/Player
        12: astore        4
        14: aload_2
        15: invokevirtual #9                  // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        18: istore        5
        20: ldc2_w        #15                 // long 1000l
        23: lstore        6
        25: invokestatic  #17                 // Method java/lang/System.currentTimeMillis:()J
        28: lstore        8
        30: lload         8
        32: aload         4
        34: invokevirtual #23                 // Method ext/mods/gameserver/model/actor/Player.getLastAgationSummonTime:()J
        37: lsub
        38: ldc2_w        #15                 // long 1000l
        41: lcmp
        42: ifge          53
        45: aload         4
        47: ldc           #26                 // String You must wait before performing this action again.
        49: invokevirtual #28                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        52: return
        53: aload         4
        55: lload         8
        57: invokevirtual #32                 // Method ext/mods/gameserver/model/actor/Player.setLastAgationSummonTime:(J)V
        60: invokestatic  #36                 // Method ext/mods/Crypta/AgathionData.getInstance:()Lext/mods/Crypta/AgathionData;
        63: astore        10
        65: aload         10
        67: ifnonnull     78
        70: aload         4
        72: ldc           #42                 // String AgathionData is not available.
        74: invokevirtual #28                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        77: return
        78: aconst_null
        79: astore        11
        81: invokestatic  #36                 // Method ext/mods/Crypta/AgathionData.getInstance:()Lext/mods/Crypta/AgathionData;
        84: iload         5
        86: invokevirtual #44                 // Method ext/mods/Crypta/AgathionData.getAgathionsByItemId:(I)Ljava/util/List;
        89: astore        12
        91: aload         12
        93: astore        11
        95: goto          113
        98: astore        12
       100: aload         4
       102: ldc           #50                 // String Error accessing AgathionData.
       104: invokevirtual #28                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       107: aload         12
       109: invokevirtual #52                 // Method java/lang/Exception.printStackTrace:()V
       112: return
       113: aload         11
       115: ifnull        128
       118: aload         11
       120: invokeinterface #55,  1           // InterfaceMethod java/util/List.isEmpty:()Z
       125: ifeq          136
       128: aload         4
       130: ldc           #61                 // String No Agathion is associated with this item.
       132: invokevirtual #28                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       135: return
       136: aload         11
       138: iconst_0
       139: invokeinterface #63,  2           // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
       144: checkcast     #67                 // class ext/mods/aghation/holder/AgathionHolder
       147: astore        12
       149: aload         4
       151: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/Player.getCurrentAgation:()Lext/mods/gameserver/model/actor/instance/Agathion;
       154: ifnull        209
       157: aload         4
       159: invokevirtual #73                 // Method ext/mods/gameserver/model/actor/Player.getMemos:()Lext/mods/gameserver/model/memo/PlayerMemo;
       162: ldc           #77                 // String agation
       164: iconst_0
       165: invokevirtual #79                 // Method ext/mods/gameserver/model/memo/PlayerMemo.getInteger:(Ljava/lang/String;I)I
       168: iload         5
       170: if_icmpne     209
       173: aload         4
       175: aload         4
       177: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/Player.getCurrentAgation:()Lext/mods/gameserver/model/actor/instance/Agathion;
       180: invokevirtual #85                 // Method ext/mods/gameserver/model/actor/Player.deletedAgation:(Lext/mods/gameserver/model/actor/instance/Agathion;)V
       183: aload         4
       185: aconst_null
       186: invokevirtual #89                 // Method ext/mods/gameserver/model/actor/Player.setCurrentAgation:(Lext/mods/gameserver/model/actor/instance/Agathion;)V
       189: aload         4
       191: invokevirtual #73                 // Method ext/mods/gameserver/model/actor/Player.getMemos:()Lext/mods/gameserver/model/memo/PlayerMemo;
       194: ldc           #77                 // String agation
       196: invokevirtual #92                 // Method ext/mods/gameserver/model/memo/PlayerMemo.unset:(Ljava/lang/String;)V
       199: aload         4
       201: ldc           #95                 // String Agathion unsummoned.
       203: invokevirtual #28                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       206: goto          342
       209: aload         4
       211: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/Player.getCurrentAgation:()Lext/mods/gameserver/model/actor/instance/Agathion;
       214: ifnull        243
       217: aload         4
       219: aload         4
       221: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/Player.getCurrentAgation:()Lext/mods/gameserver/model/actor/instance/Agathion;
       224: invokevirtual #85                 // Method ext/mods/gameserver/model/actor/Player.deletedAgation:(Lext/mods/gameserver/model/actor/instance/Agathion;)V
       227: aload         4
       229: aconst_null
       230: invokevirtual #89                 // Method ext/mods/gameserver/model/actor/Player.setCurrentAgation:(Lext/mods/gameserver/model/actor/instance/Agathion;)V
       233: aload         4
       235: invokevirtual #73                 // Method ext/mods/gameserver/model/actor/Player.getMemos:()Lext/mods/gameserver/model/memo/PlayerMemo;
       238: ldc           #77                 // String agation
       240: invokevirtual #92                 // Method ext/mods/gameserver/model/memo/PlayerMemo.unset:(Ljava/lang/String;)V
       243: invokestatic  #97                 // Method ext/mods/gameserver/data/xml/NpcData.getInstance:()Lext/mods/gameserver/data/xml/NpcData;
       246: aload         12
       248: invokevirtual #102                // Method ext/mods/aghation/holder/AgathionHolder.getNpcId:()I
       251: invokevirtual #105                // Method ext/mods/gameserver/data/xml/NpcData.getTemplate:(I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
       254: astore        13
       256: aload         13
       258: ifnonnull     269
       261: aload         4
       263: ldc           #109                // String Cannot spawn the Agathion. NPC template not found.
       265: invokevirtual #28                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       268: return
       269: invokestatic  #111                // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
       272: sipush        2046
       275: iconst_1
       276: invokevirtual #116                // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
       279: astore        14
       281: aload         14
       283: ifnonnull     294
       286: aload         4
       288: ldc           #120                // String Summoning skill not found.
       290: invokevirtual #28                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       293: return
       294: aload         4
       296: invokevirtual #122                // Method ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
       299: aload         4
       301: aload         14
       303: iconst_0
       304: iconst_0
       305: aload_2
       306: invokevirtual #126                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
       309: invokevirtual #129                // Method ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZI)V
       312: aload         4
       314: getstatic     #135                // Field ext/mods/gameserver/network/SystemMessageId.SUMMON_A_PET:Lext/mods/gameserver/network/SystemMessageId;
       317: invokevirtual #141                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       320: aload         4
       322: aload         12
       324: invokedynamic #145,  0            // InvokeDynamic #0:run:(Lext/mods/gameserver/model/actor/Player;Lext/mods/aghation/holder/AgathionHolder;)Ljava/lang/Runnable;
       329: aload         14
       331: invokevirtual #149                // Method ext/mods/gameserver/skills/L2Skill.getHitTime:()I
       334: bipush        100
       336: iadd
       337: i2l
       338: invokestatic  #154                // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
       341: pop
       342: return
      Exception table:
         from    to  target type
            81    95    98   Class java/lang/Exception
      LineNumberTable:
        line 41: 0
        line 42: 7
        line 44: 8
        line 45: 14
        line 46: 20
        line 48: 25
        line 49: 30
        line 51: 45
        line 52: 52
        line 54: 53
        line 56: 60
        line 57: 65
        line 59: 70
        line 60: 77
        line 63: 78
        line 67: 81
        line 68: 91
        line 75: 95
        line 70: 98
        line 72: 100
        line 73: 107
        line 74: 112
        line 77: 113
        line 79: 128
        line 80: 135
        line 83: 136
        line 85: 149
        line 87: 173
        line 88: 183
        line 89: 189
        line 90: 199
        line 94: 209
        line 96: 217
        line 97: 227
        line 98: 233
        line 101: 243
        line 102: 256
        line 104: 261
        line 105: 268
        line 108: 269
        line 109: 281
        line 111: 286
        line 112: 293
        line 115: 294
        line 116: 312
        line 118: 320
        line 130: 331
        line 118: 338
        line 132: 342
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           91       4    12 tempList   Ljava/util/List;
          100      13    12     e   Ljava/lang/Exception;
          256      86    13 npcTemplate   Lext/mods/gameserver/model/actor/template/NpcTemplate;
          281      61    14 skillToCast   Lext/mods/gameserver/skills/L2Skill;
            0     343     0  this   Lext/mods/gameserver/handler/itemhandlers/AgathionItems;
            0     343     1 playable   Lext/mods/gameserver/model/actor/Playable;
            0     343     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0     343     3 forceUse   Z
           14     329     4 player   Lext/mods/gameserver/model/actor/Player;
           20     323     5 itemId   I
           25     318     6 cooldown   J
           30     313     8 currentTime   J
           65     278    10 agathionDataInstance   Ljava/lang/Object;
           81     262    11 agationList   Ljava/util/List;
          149     194    12 agathionInfo   Lext/mods/aghation/holder/AgathionHolder;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           91       4    12 tempList   Ljava/util/List<Lext/mods/aghation/holder/AgathionHolder;>;
           81     262    11 agationList   Ljava/util/List<Lext/mods/aghation/holder/AgathionHolder;>;
      StackMapTable: number_of_entries = 12
        frame_type = 8 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 44
          locals = [ class ext/mods/gameserver/handler/itemhandlers/AgathionItems, class ext/mods/gameserver/model/actor/Playable, class ext/mods/gameserver/model/item/instance/ItemInstance, int, class ext/mods/gameserver/model/actor/Player, int, long, long ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ class java/lang/Object ]
        frame_type = 255 /* full_frame */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/handler/itemhandlers/AgathionItems, class ext/mods/gameserver/model/actor/Playable, class ext/mods/gameserver/model/item/instance/ItemInstance, int, class ext/mods/gameserver/model/actor/Player, int, long, long, class java/lang/Object, class java/util/List ]
          stack = [ class java/lang/Exception ]
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 7 /* same */
        frame_type = 252 /* append */
          offset_delta = 72
          locals = [ class ext/mods/aghation/holder/AgathionHolder ]
        frame_type = 33 /* same */
        frame_type = 252 /* append */
          offset_delta = 25
          locals = [ class ext/mods/gameserver/model/actor/template/NpcTemplate ]
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ class ext/mods/gameserver/skills/L2Skill ]
        frame_type = 249 /* chop */
          offset_delta = 47
}
SourceFile: "AgathionItems.java"
BootstrapMethods:
  0: #232 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #228 ()V
      #229 REF_invokeStatic ext/mods/gameserver/handler/itemhandlers/AgathionItems.lambda$useItem$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/aghation/holder/AgathionHolder;)V
      #228 ()V
InnerClasses:
  public static final #244= #240 of #242; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
