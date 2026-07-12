// Bytecode for: ext.mods.gameserver.data.manager.FestivalOfDarknessManager$L2DarknessFestival
// File: ext\mods\gameserver\data\manager\FestivalOfDarknessManager$L2DarknessFestival.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival.class
  Last modified 9 de jul de 2026; size 5400 bytes
  MD5 checksum 32486739e6ca9e811f31420429263eac
  Compiled from "FestivalOfDarknessManager.java"
public class ext.mods.gameserver.data.manager.FestivalOfDarknessManager$L2DarknessFestival
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #10                         // ext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival
  super_class: #16                        // java/lang/Object
  interfaces: 0, fields: 7, methods: 4, attributes: 3
Constant pool:
    #1 = Class              #2            // ext/mods/gameserver/data/manager/FestivalOfDarknessManager
    #2 = Utf8               ext/mods/gameserver/data/manager/FestivalOfDarknessManager
    #3 = Methodref          #4.#5         // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
    #4 = Class              #6            // java/util/Objects
    #5 = NameAndType        #7:#8         // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
    #6 = Utf8               java/util/Objects
    #7 = Utf8               requireNonNull
    #8 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
    #9 = Fieldref           #10.#11       // ext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival.this$0:Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
   #10 = Class              #12           // ext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival
   #11 = NameAndType        #13:#14       // this$0:Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
   #12 = Utf8               ext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival
   #13 = Utf8               this$0
   #14 = Utf8               Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
   #15 = Methodref          #16.#17       // java/lang/Object."<init>":()V
   #16 = Class              #18           // java/lang/Object
   #17 = NameAndType        #19:#20       // "<init>":()V
   #18 = Utf8               java/lang/Object
   #19 = Utf8               <init>
   #20 = Utf8               ()V
   #21 = Fieldref           #10.#22       // ext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival._cabal:Lext/mods/gameserver/enums/CabalType;
   #22 = NameAndType        #23:#24       // _cabal:Lext/mods/gameserver/enums/CabalType;
   #23 = Utf8               _cabal
   #24 = Utf8               Lext/mods/gameserver/enums/CabalType;
   #25 = Fieldref           #10.#26       // ext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival._levelRange:I
   #26 = NameAndType        #27:#28       // _levelRange:I
   #27 = Utf8               _levelRange
   #28 = Utf8               I
   #29 = Class              #30           // java/util/HashMap
   #30 = Utf8               java/util/HashMap
   #31 = Methodref          #29.#17       // java/util/HashMap."<init>":()V
   #32 = Fieldref           #10.#33       // ext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival._originalLocations:Ljava/util/Map;
   #33 = NameAndType        #34:#35       // _originalLocations:Ljava/util/Map;
   #34 = Utf8               _originalLocations
   #35 = Utf8               Ljava/util/Map;
   #36 = Class              #37           // java/util/ArrayList
   #37 = Utf8               java/util/ArrayList
   #38 = Methodref          #36.#17       // java/util/ArrayList."<init>":()V
   #39 = Fieldref           #10.#40       // ext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival._npcInsts:Ljava/util/List;
   #40 = NameAndType        #41:#42       // _npcInsts:Ljava/util/List;
   #41 = Utf8               _npcInsts
   #42 = Utf8               Ljava/util/List;
   #43 = Fieldref           #44.#45       // ext/mods/gameserver/enums/CabalType.DAWN:Lext/mods/gameserver/enums/CabalType;
   #44 = Class              #46           // ext/mods/gameserver/enums/CabalType
   #45 = NameAndType        #47:#24       // DAWN:Lext/mods/gameserver/enums/CabalType;
   #46 = Utf8               ext/mods/gameserver/enums/CabalType
   #47 = Utf8               DAWN
   #48 = Fieldref           #1.#49        // ext/mods/gameserver/data/manager/FestivalOfDarknessManager._dawnFestivalParticipants:Ljava/util/Map;
   #49 = NameAndType        #50:#35       // _dawnFestivalParticipants:Ljava/util/Map;
   #50 = Utf8               _dawnFestivalParticipants
   #51 = Methodref          #52.#53       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #52 = Class              #54           // java/lang/Integer
   #53 = NameAndType        #55:#56       // valueOf:(I)Ljava/lang/Integer;
   #54 = Utf8               java/lang/Integer
   #55 = Utf8               valueOf
   #56 = Utf8               (I)Ljava/lang/Integer;
   #57 = InterfaceMethodref #58.#59       // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #58 = Class              #60           // java/util/Map
   #59 = NameAndType        #61:#8        // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #60 = Utf8               java/util/Map
   #61 = Utf8               get
   #62 = Class              #63           // java/util/List
   #63 = Utf8               java/util/List
   #64 = Fieldref           #10.#65       // ext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival._participants:Ljava/util/List;
   #65 = NameAndType        #66:#42       // _participants:Ljava/util/List;
   #66 = Utf8               _participants
   #67 = Class              #68           // ext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalSpawn
   #68 = Utf8               ext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalSpawn
   #69 = Fieldref           #1.#70        // ext/mods/gameserver/data/manager/FestivalOfDarknessManager.FESTIVAL_DAWN_PLAYER_SPAWNS:[[I
   #70 = NameAndType        #71:#72       // FESTIVAL_DAWN_PLAYER_SPAWNS:[[I
   #71 = Utf8               FESTIVAL_DAWN_PLAYER_SPAWNS
   #72 = Utf8               [[I
   #73 = Methodref          #67.#74       // ext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalSpawn."<init>":([I)V
   #74 = NameAndType        #19:#75       // "<init>":([I)V
   #75 = Utf8               ([I)V
   #76 = Fieldref           #10.#77       // ext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival._startLocation:Lext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalSpawn;
   #77 = NameAndType        #78:#79       // _startLocation:Lext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalSpawn;
   #78 = Utf8               _startLocation
   #79 = Utf8               Lext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalSpawn;
   #80 = Fieldref           #1.#81        // ext/mods/gameserver/data/manager/FestivalOfDarknessManager._duskFestivalParticipants:Ljava/util/Map;
   #81 = NameAndType        #82:#35       // _duskFestivalParticipants:Ljava/util/Map;
   #82 = Utf8               _duskFestivalParticipants
   #83 = Fieldref           #1.#84        // ext/mods/gameserver/data/manager/FestivalOfDarknessManager.FESTIVAL_DUSK_PLAYER_SPAWNS:[[I
   #84 = NameAndType        #85:#72       // FESTIVAL_DUSK_PLAYER_SPAWNS:[[I
   #85 = Utf8               FESTIVAL_DUSK_PLAYER_SPAWNS
   #86 = Methodref          #10.#87       // ext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival.festivalInit:()V
   #87 = NameAndType        #88:#20       // festivalInit:()V
   #88 = Utf8               festivalInit
   #89 = InterfaceMethodref #62.#90       // java/util/List.isEmpty:()Z
   #90 = NameAndType        #91:#92       // isEmpty:()Z
   #91 = Utf8               isEmpty
   #92 = Utf8               ()Z
   #93 = InterfaceMethodref #62.#94       // java/util/List.iterator:()Ljava/util/Iterator;
   #94 = NameAndType        #95:#96       // iterator:()Ljava/util/Iterator;
   #95 = Utf8               iterator
   #96 = Utf8               ()Ljava/util/Iterator;
   #97 = InterfaceMethodref #98.#99       // java/util/Iterator.hasNext:()Z
   #98 = Class              #100          // java/util/Iterator
   #99 = NameAndType        #101:#92      // hasNext:()Z
  #100 = Utf8               java/util/Iterator
  #101 = Utf8               hasNext
  #102 = InterfaceMethodref #98.#103      // java/util/Iterator.next:()Ljava/lang/Object;
  #103 = NameAndType        #104:#105     // next:()Ljava/lang/Object;
  #104 = Utf8               next
  #105 = Utf8               ()Ljava/lang/Object;
  #106 = Methodref          #52.#107      // java/lang/Integer.intValue:()I
  #107 = NameAndType        #108:#109     // intValue:()I
  #108 = Utf8               intValue
  #109 = Utf8               ()I
  #110 = Methodref          #111.#112     // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
  #111 = Class              #113          // ext/mods/gameserver/model/World
  #112 = NameAndType        #114:#115     // getInstance:()Lext/mods/gameserver/model/World;
  #113 = Utf8               ext/mods/gameserver/model/World
  #114 = Utf8               getInstance
  #115 = Utf8               ()Lext/mods/gameserver/model/World;
  #116 = Methodref          #111.#117     // ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
  #117 = NameAndType        #118:#119     // getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
  #118 = Utf8               getPlayer
  #119 = Utf8               (I)Lext/mods/gameserver/model/actor/Player;
  #120 = Methodref          #121.#122     // ext/mods/gameserver/model/actor/Player.getX:()I
  #121 = Class              #123          // ext/mods/gameserver/model/actor/Player
  #122 = NameAndType        #124:#109     // getX:()I
  #123 = Utf8               ext/mods/gameserver/model/actor/Player
  #124 = Utf8               getX
  #125 = Methodref          #121.#126     // ext/mods/gameserver/model/actor/Player.getY:()I
  #126 = NameAndType        #127:#109     // getY:()I
  #127 = Utf8               getY
  #128 = Methodref          #121.#129     // ext/mods/gameserver/model/actor/Player.getZ:()I
  #129 = NameAndType        #130:#109     // getZ:()I
  #130 = Utf8               getZ
  #131 = Methodref          #121.#132     // ext/mods/gameserver/model/actor/Player.getHeading:()I
  #132 = NameAndType        #133:#109     // getHeading:()I
  #133 = Utf8               getHeading
  #134 = Methodref          #67.#135      // ext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalSpawn."<init>":(IIII)V
  #135 = NameAndType        #19:#136      // "<init>":(IIII)V
  #136 = Utf8               (IIII)V
  #137 = InterfaceMethodref #58.#138      // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #138 = NameAndType        #139:#140     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #139 = Utf8               put
  #140 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #141 = Fieldref           #67.#142      // ext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalSpawn._x:I
  #142 = NameAndType        #143:#28      // _x:I
  #143 = Utf8               _x
  #144 = Fieldref           #67.#145      // ext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalSpawn._y:I
  #145 = NameAndType        #146:#28      // _y:I
  #146 = Utf8               _y
  #147 = Methodref          #121.#148     // ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
  #148 = NameAndType        #149:#150     // getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
  #149 = Utf8               getAI
  #150 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
  #151 = Methodref          #152.#153     // ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToIdle:()V
  #152 = Class              #154          // ext/mods/gameserver/model/actor/ai/type/PlayerAI
  #153 = NameAndType        #155:#20      // tryToIdle:()V
  #154 = Utf8               ext/mods/gameserver/model/actor/ai/type/PlayerAI
  #155 = Utf8               tryToIdle
  #156 = Fieldref           #67.#157      // ext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalSpawn._z:I
  #157 = NameAndType        #158:#28      // _z:I
  #158 = Utf8               _z
  #159 = Methodref          #121.#160     // ext/mods/gameserver/model/actor/Player.teleportTo:(IIII)Z
  #160 = NameAndType        #161:#162     // teleportTo:(IIII)Z
  #161 = Utf8               teleportTo
  #162 = Utf8               (IIII)Z
  #163 = Methodref          #121.#164     // ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
  #164 = NameAndType        #165:#166     // getSummon:()Lext/mods/gameserver/model/actor/Summon;
  #165 = Utf8               getSummon
  #166 = Utf8               ()Lext/mods/gameserver/model/actor/Summon;
  #167 = Methodref          #168.#169     // ext/mods/gameserver/model/actor/Summon.unSummon:(Lext/mods/gameserver/model/actor/Player;)V
  #168 = Class              #170          // ext/mods/gameserver/model/actor/Summon
  #169 = NameAndType        #171:#172     // unSummon:(Lext/mods/gameserver/model/actor/Player;)V
  #170 = Utf8               ext/mods/gameserver/model/actor/Summon
  #171 = Utf8               unSummon
  #172 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #173 = Methodref          #121.#174     // ext/mods/gameserver/model/actor/Player.stopAllEffectsExceptThoseThatLastThroughDeath:()V
  #174 = NameAndType        #175:#20      // stopAllEffectsExceptThoseThatLastThroughDeath:()V
  #175 = Utf8               stopAllEffectsExceptThoseThatLastThroughDeath
  #176 = Methodref          #121.#177     // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #177 = NameAndType        #178:#179     // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #178 = Utf8               getInventory
  #179 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #180 = Methodref          #181.#182     // ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #181 = Class              #183          // ext/mods/gameserver/model/itemcontainer/PcInventory
  #182 = NameAndType        #184:#185     // getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #183 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
  #184 = Utf8               getItemByItemId
  #185 = Utf8               (I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #186 = Methodref          #121.#187     // ext/mods/gameserver/model/actor/Player.destroyItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)Z
  #187 = NameAndType        #188:#189     // destroyItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)Z
  #188 = Utf8               destroyItem
  #189 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;Z)Z
  #190 = Methodref          #10.#191      // ext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival.relocatePlayer:(Lext/mods/gameserver/model/actor/Player;Z)V
  #191 = NameAndType        #192:#193     // relocatePlayer:(Lext/mods/gameserver/model/actor/Player;Z)V
  #192 = Utf8               relocatePlayer
  #193 = Utf8               (Lext/mods/gameserver/model/actor/Player;Z)V
  #194 = Methodref          #121.#195     // ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
  #195 = NameAndType        #196:#197     // getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
  #196 = Utf8               getSysString
  #197 = Utf8               (I[Ljava/lang/Object;)Ljava/lang/String;
  #198 = Methodref          #121.#199     // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
  #199 = NameAndType        #200:#201     // sendMessage:(Ljava/lang/String;)V
  #200 = Utf8               sendMessage
  #201 = Utf8               (Ljava/lang/String;)V
  #202 = Fieldref           #1.#203       // ext/mods/gameserver/data/manager/FestivalOfDarknessManager._dawnPreviousParticipants:Ljava/util/Map;
  #203 = NameAndType        #204:#35      // _dawnPreviousParticipants:Ljava/util/Map;
  #204 = Utf8               _dawnPreviousParticipants
  #205 = Fieldref           #1.#206       // ext/mods/gameserver/data/manager/FestivalOfDarknessManager._duskPreviousParticipants:Ljava/util/Map;
  #206 = NameAndType        #207:#35      // _duskPreviousParticipants:Ljava/util/Map;
  #207 = Utf8               _duskPreviousParticipants
  #208 = Methodref          #121.#209     // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #209 = NameAndType        #210:#109     // getObjectId:()I
  #210 = Utf8               getObjectId
  #211 = InterfaceMethodref #58.#212      // java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #212 = NameAndType        #213:#8       // remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #213 = Utf8               remove
  #214 = Class              #215          // java/lang/Exception
  #215 = Utf8               java/lang/Exception
  #216 = Fieldref           #217.#218     // ext/mods/gameserver/enums/RestartType.TOWN:Lext/mods/gameserver/enums/RestartType;
  #217 = Class              #219          // ext/mods/gameserver/enums/RestartType
  #218 = NameAndType        #220:#221     // TOWN:Lext/mods/gameserver/enums/RestartType;
  #219 = Utf8               ext/mods/gameserver/enums/RestartType
  #220 = Utf8               TOWN
  #221 = Utf8               Lext/mods/gameserver/enums/RestartType;
  #222 = Methodref          #121.#223     // ext/mods/gameserver/model/actor/Player.teleportTo:(Lext/mods/gameserver/enums/RestartType;)V
  #223 = NameAndType        #161:#224     // teleportTo:(Lext/mods/gameserver/enums/RestartType;)V
  #224 = Utf8               (Lext/mods/gameserver/enums/RestartType;)V
  #225 = Utf8               Signature
  #226 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/actor/instance/FestivalMonster;>;
  #227 = Utf8               Ljava/util/List<Ljava/lang/Integer;>;
  #228 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalSpawn;>;
  #229 = Utf8               (Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;Lext/mods/gameserver/enums/CabalType;I)V
  #230 = Utf8               Code
  #231 = Utf8               LineNumberTable
  #232 = Utf8               LocalVariableTable
  #233 = Utf8               this
  #234 = Utf8               Lext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival;
  #235 = Utf8               cabal
  #236 = Utf8               levelRange
  #237 = Utf8               StackMapTable
  #238 = Utf8               MethodParameters
  #239 = Utf8               participant
  #240 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #241 = Utf8               x
  #242 = Utf8               y
  #243 = Utf8               bloodOfferings
  #244 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #245 = Utf8               participantObjId
  #246 = Utf8               festivalEnd
  #247 = Utf8               origPosition
  #248 = Utf8               e
  #249 = Utf8               Ljava/lang/Exception;
  #250 = Utf8               isRemoving
  #251 = Utf8               Z
  #252 = Utf8               SourceFile
  #253 = Utf8               FestivalOfDarknessManager.java
  #254 = Utf8               NestHost
  #255 = Utf8               InnerClasses
  #256 = Utf8               L2DarknessFestival
  #257 = Utf8               FestivalSpawn
{
  protected final ext.mods.gameserver.enums.CabalType _cabal;
    descriptor: Lext/mods/gameserver/enums/CabalType;
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL

  protected final int _levelRange;
    descriptor: I
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL

  protected final java.util.List<ext.mods.gameserver.model.actor.instance.FestivalMonster> _npcInsts;
    descriptor: Ljava/util/List;
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Signature: #226                         // Ljava/util/List<Lext/mods/gameserver/model/actor/instance/FestivalMonster;>;

  final ext.mods.gameserver.data.manager.FestivalOfDarknessManager this$0;
    descriptor: Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  public ext.mods.gameserver.data.manager.FestivalOfDarknessManager$L2DarknessFestival(ext.mods.gameserver.data.manager.FestivalOfDarknessManager, ext.mods.gameserver.enums.CabalType, int);
    descriptor: (Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;Lext/mods/gameserver/enums/CabalType;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=4, args_size=4
         0: aload_0
         1: aload_1
         2: dup
         3: invokestatic  #3                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
         6: pop
         7: putfield      #9                  // Field this$0:Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
        10: aload_0
        11: invokespecial #15                 // Method java/lang/Object."<init>":()V
        14: aload_0
        15: aload_2
        16: putfield      #21                 // Field _cabal:Lext/mods/gameserver/enums/CabalType;
        19: aload_0
        20: iload_3
        21: putfield      #25                 // Field _levelRange:I
        24: aload_0
        25: new           #29                 // class java/util/HashMap
        28: dup
        29: invokespecial #31                 // Method java/util/HashMap."<init>":()V
        32: putfield      #32                 // Field _originalLocations:Ljava/util/Map;
        35: aload_0
        36: new           #36                 // class java/util/ArrayList
        39: dup
        40: invokespecial #38                 // Method java/util/ArrayList."<init>":()V
        43: putfield      #39                 // Field _npcInsts:Ljava/util/List;
        46: aload_2
        47: getstatic     #43                 // Field ext/mods/gameserver/enums/CabalType.DAWN:Lext/mods/gameserver/enums/CabalType;
        50: if_acmpne     92
        53: aload_0
        54: aload_1
        55: getfield      #48                 // Field ext/mods/gameserver/data/manager/FestivalOfDarknessManager._dawnFestivalParticipants:Ljava/util/Map;
        58: iload_3
        59: invokestatic  #51                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        62: invokeinterface #57,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        67: checkcast     #62                 // class java/util/List
        70: putfield      #64                 // Field _participants:Ljava/util/List;
        73: aload_0
        74: new           #67                 // class ext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalSpawn
        77: dup
        78: getstatic     #69                 // Field ext/mods/gameserver/data/manager/FestivalOfDarknessManager.FESTIVAL_DAWN_PLAYER_SPAWNS:[[I
        81: iload_3
        82: aaload
        83: invokespecial #73                 // Method ext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalSpawn."<init>":([I)V
        86: putfield      #76                 // Field _startLocation:Lext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalSpawn;
        89: goto          128
        92: aload_0
        93: aload_1
        94: getfield      #80                 // Field ext/mods/gameserver/data/manager/FestivalOfDarknessManager._duskFestivalParticipants:Ljava/util/Map;
        97: iload_3
        98: invokestatic  #51                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       101: invokeinterface #57,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
       106: checkcast     #62                 // class java/util/List
       109: putfield      #64                 // Field _participants:Ljava/util/List;
       112: aload_0
       113: new           #67                 // class ext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalSpawn
       116: dup
       117: getstatic     #83                 // Field ext/mods/gameserver/data/manager/FestivalOfDarknessManager.FESTIVAL_DUSK_PLAYER_SPAWNS:[[I
       120: iload_3
       121: aaload
       122: invokespecial #73                 // Method ext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalSpawn."<init>":([I)V
       125: putfield      #76                 // Field _startLocation:Lext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalSpawn;
       128: aload_0
       129: getfield      #64                 // Field _participants:Ljava/util/List;
       132: ifnonnull     146
       135: aload_0
       136: new           #36                 // class java/util/ArrayList
       139: dup
       140: invokespecial #38                 // Method java/util/ArrayList."<init>":()V
       143: putfield      #64                 // Field _participants:Ljava/util/List;
       146: aload_0
       147: invokevirtual #86                 // Method festivalInit:()V
       150: return
      LineNumberTable:
        line 865: 0
        line 866: 14
        line 867: 19
        line 868: 24
        line 869: 35
        line 871: 46
        line 873: 53
        line 874: 73
        line 878: 92
        line 879: 112
        line 882: 128
        line 883: 135
        line 885: 146
        line 886: 150
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     151     0  this   Lext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival;
            0     151     1 this$0   Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
            0     151     2 cabal   Lext/mods/gameserver/enums/CabalType;
            0     151     3 levelRange   I
      StackMapTable: number_of_entries = 3
        frame_type = 255 /* full_frame */
          offset_delta = 92
          locals = [ class ext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival, class ext/mods/gameserver/data/manager/FestivalOfDarknessManager, class ext/mods/gameserver/enums/CabalType, int ]
          stack = []
        frame_type = 35 /* same */
        frame_type = 17 /* same */
    MethodParameters:
      Name                           Flags
      <no name>                      final mandated
      <no name>
      <no name>

  public void festivalInit();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=7, args_size=1
         0: aload_0
         1: getfield      #64                 // Field _participants:Ljava/util/List;
         4: ifnull        192
         7: aload_0
         8: getfield      #64                 // Field _participants:Ljava/util/List;
        11: invokeinterface #89,  1           // InterfaceMethod java/util/List.isEmpty:()Z
        16: ifne          192
        19: aload_0
        20: getfield      #64                 // Field _participants:Ljava/util/List;
        23: invokeinterface #93,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        28: astore_1
        29: aload_1
        30: invokeinterface #97,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        35: ifeq          192
        38: aload_1
        39: invokeinterface #102,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        44: checkcast     #52                 // class java/lang/Integer
        47: invokevirtual #106                // Method java/lang/Integer.intValue:()I
        50: istore_2
        51: invokestatic  #110                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
        54: iload_2
        55: invokevirtual #116                // Method ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
        58: astore_3
        59: aload_3
        60: ifnonnull     66
        63: goto          29
        66: aload_0
        67: getfield      #32                 // Field _originalLocations:Ljava/util/Map;
        70: iload_2
        71: invokestatic  #51                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        74: new           #67                 // class ext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalSpawn
        77: dup
        78: aload_3
        79: invokevirtual #120                // Method ext/mods/gameserver/model/actor/Player.getX:()I
        82: aload_3
        83: invokevirtual #125                // Method ext/mods/gameserver/model/actor/Player.getY:()I
        86: aload_3
        87: invokevirtual #128                // Method ext/mods/gameserver/model/actor/Player.getZ:()I
        90: aload_3
        91: invokevirtual #131                // Method ext/mods/gameserver/model/actor/Player.getHeading:()I
        94: invokespecial #134                // Method ext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalSpawn."<init>":(IIII)V
        97: invokeinterface #137,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       102: pop
       103: aload_0
       104: getfield      #76                 // Field _startLocation:Lext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalSpawn;
       107: getfield      #141                // Field ext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalSpawn._x:I
       110: istore        4
       112: aload_0
       113: getfield      #76                 // Field _startLocation:Lext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalSpawn;
       116: getfield      #144                // Field ext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalSpawn._y:I
       119: istore        5
       121: aload_3
       122: invokevirtual #147                // Method ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
       125: invokevirtual #151                // Method ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToIdle:()V
       128: aload_3
       129: iload         4
       131: iload         5
       133: aload_0
       134: getfield      #76                 // Field _startLocation:Lext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalSpawn;
       137: getfield      #156                // Field ext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalSpawn._z:I
       140: iconst_0
       141: invokevirtual #159                // Method ext/mods/gameserver/model/actor/Player.teleportTo:(IIII)Z
       144: pop
       145: aload_3
       146: invokevirtual #163                // Method ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
       149: ifnull        160
       152: aload_3
       153: invokevirtual #163                // Method ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
       156: aload_3
       157: invokevirtual #167                // Method ext/mods/gameserver/model/actor/Summon.unSummon:(Lext/mods/gameserver/model/actor/Player;)V
       160: aload_3
       161: invokevirtual #173                // Method ext/mods/gameserver/model/actor/Player.stopAllEffectsExceptThoseThatLastThroughDeath:()V
       164: aload_3
       165: invokevirtual #176                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       168: sipush        5901
       171: invokevirtual #180                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
       174: astore        6
       176: aload         6
       178: ifnull        189
       181: aload_3
       182: aload         6
       184: iconst_1
       185: invokevirtual #186                // Method ext/mods/gameserver/model/actor/Player.destroyItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)Z
       188: pop
       189: goto          29
       192: return
      LineNumberTable:
        line 890: 0
        line 892: 19
        line 894: 51
        line 895: 59
        line 896: 63
        line 898: 66
        line 900: 103
        line 901: 112
        line 903: 121
        line 904: 128
        line 906: 145
        line 907: 152
        line 909: 160
        line 911: 164
        line 912: 176
        line 913: 181
        line 914: 189
        line 916: 192
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           59     130     3 participant   Lext/mods/gameserver/model/actor/Player;
          112      77     4     x   I
          121      68     5     y   I
          176      13     6 bloodOfferings   Lext/mods/gameserver/model/item/instance/ItemInstance;
           51     138     2 participantObjId   I
            0     193     0  this   Lext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival;
      StackMapTable: number_of_entries = 5
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ class java/util/Iterator ]
        frame_type = 253 /* append */
          offset_delta = 36
          locals = [ int, class ext/mods/gameserver/model/actor/Player ]
        frame_type = 253 /* append */
          offset_delta = 93
          locals = [ int, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 28
          locals = [ class ext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival, class java/util/Iterator ]
          stack = []
        frame_type = 250 /* chop */
          offset_delta = 2

  public void festivalEnd();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=1
         0: aload_0
         1: getfield      #64                 // Field _participants:Ljava/util/List;
         4: ifnull        151
         7: aload_0
         8: getfield      #64                 // Field _participants:Ljava/util/List;
        11: invokeinterface #89,  1           // InterfaceMethod java/util/List.isEmpty:()Z
        16: ifne          151
        19: aload_0
        20: getfield      #64                 // Field _participants:Ljava/util/List;
        23: invokeinterface #93,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        28: astore_1
        29: aload_1
        30: invokeinterface #97,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        35: ifeq          90
        38: aload_1
        39: invokeinterface #102,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        44: checkcast     #52                 // class java/lang/Integer
        47: invokevirtual #106                // Method java/lang/Integer.intValue:()I
        50: istore_2
        51: invokestatic  #110                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
        54: iload_2
        55: invokevirtual #116                // Method ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
        58: astore_3
        59: aload_3
        60: ifnonnull     66
        63: goto          29
        66: aload_0
        67: aload_3
        68: iconst_0
        69: invokevirtual #190                // Method relocatePlayer:(Lext/mods/gameserver/model/actor/Player;Z)V
        72: aload_3
        73: aload_3
        74: sipush        10106
        77: iconst_0
        78: anewarray     #16                 // class java/lang/Object
        81: invokevirtual #194                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
        84: invokevirtual #198                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        87: goto          29
        90: aload_0
        91: getfield      #21                 // Field _cabal:Lext/mods/gameserver/enums/CabalType;
        94: getstatic     #43                 // Field ext/mods/gameserver/enums/CabalType.DAWN:Lext/mods/gameserver/enums/CabalType;
        97: if_acmpne     127
       100: aload_0
       101: getfield      #9                  // Field this$0:Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
       104: getfield      #202                // Field ext/mods/gameserver/data/manager/FestivalOfDarknessManager._dawnPreviousParticipants:Ljava/util/Map;
       107: aload_0
       108: getfield      #25                 // Field _levelRange:I
       111: invokestatic  #51                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       114: aload_0
       115: getfield      #64                 // Field _participants:Ljava/util/List;
       118: invokeinterface #137,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       123: pop
       124: goto          151
       127: aload_0
       128: getfield      #9                  // Field this$0:Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
       131: getfield      #205                // Field ext/mods/gameserver/data/manager/FestivalOfDarknessManager._duskPreviousParticipants:Ljava/util/Map;
       134: aload_0
       135: getfield      #25                 // Field _levelRange:I
       138: invokestatic  #51                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       141: aload_0
       142: getfield      #64                 // Field _participants:Ljava/util/List;
       145: invokeinterface #137,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       150: pop
       151: aload_0
       152: aconst_null
       153: putfield      #64                 // Field _participants:Ljava/util/List;
       156: return
      LineNumberTable:
        line 920: 0
        line 922: 19
        line 924: 51
        line 925: 59
        line 926: 63
        line 928: 66
        line 929: 72
        line 930: 87
        line 932: 90
        line 933: 100
        line 935: 127
        line 937: 151
        line 938: 156
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           59      28     3 participant   Lext/mods/gameserver/model/actor/Player;
           51      36     2 participantObjId   I
            0     157     0  this   Lext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival;
      StackMapTable: number_of_entries = 5
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ class java/util/Iterator ]
        frame_type = 253 /* append */
          offset_delta = 36
          locals = [ int, class ext/mods/gameserver/model/actor/Player ]
        frame_type = 248 /* chop */
          offset_delta = 23
        frame_type = 36 /* same */
        frame_type = 23 /* same */

  public void relocatePlayer(ext.mods.gameserver.model.actor.Player, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=4, args_size=3
         0: aload_1
         1: ifnonnull     5
         4: return
         5: aload_0
         6: getfield      #32                 // Field _originalLocations:Ljava/util/Map;
         9: aload_1
        10: invokevirtual #208                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        13: invokestatic  #51                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        16: invokeinterface #57,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        21: checkcast     #67                 // class ext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalSpawn
        24: astore_3
        25: iload_2
        26: ifeq          46
        29: aload_0
        30: getfield      #32                 // Field _originalLocations:Ljava/util/Map;
        33: aload_1
        34: invokevirtual #208                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        37: invokestatic  #51                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        40: invokeinterface #211,  2          // InterfaceMethod java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        45: pop
        46: aload_1
        47: invokevirtual #147                // Method ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
        50: invokevirtual #151                // Method ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToIdle:()V
        53: aload_1
        54: aload_3
        55: getfield      #141                // Field ext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalSpawn._x:I
        58: aload_3
        59: getfield      #144                // Field ext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalSpawn._y:I
        62: aload_3
        63: getfield      #156                // Field ext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalSpawn._z:I
        66: bipush        20
        68: invokevirtual #159                // Method ext/mods/gameserver/model/actor/Player.teleportTo:(IIII)Z
        71: pop
        72: aload_1
        73: aload_1
        74: sipush        10107
        77: iconst_0
        78: anewarray     #16                 // class java/lang/Object
        81: invokevirtual #194                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
        84: invokevirtual #198                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        87: goto          113
        90: astore_3
        91: aload_1
        92: getstatic     #216                // Field ext/mods/gameserver/enums/RestartType.TOWN:Lext/mods/gameserver/enums/RestartType;
        95: invokevirtual #222                // Method ext/mods/gameserver/model/actor/Player.teleportTo:(Lext/mods/gameserver/enums/RestartType;)V
        98: aload_1
        99: aload_1
       100: sipush        10107
       103: iconst_0
       104: anewarray     #16                 // class java/lang/Object
       107: invokevirtual #194                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       110: invokevirtual #198                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       113: return
      Exception table:
         from    to  target type
             5    87    90   Class java/lang/Exception
      LineNumberTable:
        line 942: 0
        line 943: 4
        line 947: 5
        line 949: 25
        line 950: 29
        line 952: 46
        line 953: 53
        line 954: 72
        line 960: 87
        line 956: 90
        line 958: 91
        line 959: 98
        line 961: 113
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           25      62     3 origPosition   Lext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalSpawn;
           91      22     3     e   Ljava/lang/Exception;
            0     114     0  this   Lext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival;
            0     114     1 participant   Lext/mods/gameserver/model/actor/Player;
            0     114     2 isRemoving   Z
      StackMapTable: number_of_entries = 4
        frame_type = 5 /* same */
        frame_type = 252 /* append */
          offset_delta = 40
          locals = [ class ext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalSpawn ]
        frame_type = 255 /* full_frame */
          offset_delta = 43
          locals = [ class ext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival, class ext/mods/gameserver/model/actor/Player, int ]
          stack = [ class java/lang/Exception ]
        frame_type = 22 /* same */
}
SourceFile: "FestivalOfDarknessManager.java"
NestHost: class ext/mods/gameserver/data/manager/FestivalOfDarknessManager
InnerClasses:
  public #256= #10 of #1;                 // L2DarknessFestival=class ext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival of class ext/mods/gameserver/data/manager/FestivalOfDarknessManager
  public static #257= #67 of #1;          // FestivalSpawn=class ext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalSpawn of class ext/mods/gameserver/data/manager/FestivalOfDarknessManager
