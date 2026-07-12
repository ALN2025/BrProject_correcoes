// Bytecode for: ext.mods.gameserver.model.trade.TradeList
// File: ext\mods\gameserver\model\trade\TradeList.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/trade/TradeList.class
  Last modified 9 de jul de 2026; size 14973 bytes
  MD5 checksum 6cf399b9b73c509156a6691c766f07c7
  Compiled from "TradeList.java"
public class ext.mods.gameserver.model.trade.TradeList extends java.util.concurrent.CopyOnWriteArrayList<ext.mods.gameserver.model.trade.TradeItem>
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/model/trade/TradeList
  super_class: #2                         // java/util/concurrent/CopyOnWriteArrayList
  interfaces: 0, fields: 7, methods: 29, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/util/concurrent/CopyOnWriteArrayList."<init>":()V
    #2 = Class              #4            // java/util/concurrent/CopyOnWriteArrayList
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/util/concurrent/CopyOnWriteArrayList
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/concurrent/atomic/AtomicBoolean
    #8 = Utf8               java/util/concurrent/atomic/AtomicBoolean
    #9 = Methodref          #7.#3         // java/util/concurrent/atomic/AtomicBoolean."<init>":()V
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/model/trade/TradeList._isPackaged:Ljava/util/concurrent/atomic/AtomicBoolean;
   #11 = Class              #13           // ext/mods/gameserver/model/trade/TradeList
   #12 = NameAndType        #14:#15       // _isPackaged:Ljava/util/concurrent/atomic/AtomicBoolean;
   #13 = Utf8               ext/mods/gameserver/model/trade/TradeList
   #14 = Utf8               _isPackaged
   #15 = Utf8               Ljava/util/concurrent/atomic/AtomicBoolean;
   #16 = Fieldref           #11.#17       // ext/mods/gameserver/model/trade/TradeList._isConfirmed:Ljava/util/concurrent/atomic/AtomicBoolean;
   #17 = NameAndType        #18:#15       // _isConfirmed:Ljava/util/concurrent/atomic/AtomicBoolean;
   #18 = Utf8               _isConfirmed
   #19 = Fieldref           #11.#20       // ext/mods/gameserver/model/trade/TradeList._isLocked:Ljava/util/concurrent/atomic/AtomicBoolean;
   #20 = NameAndType        #21:#15       // _isLocked:Ljava/util/concurrent/atomic/AtomicBoolean;
   #21 = Utf8               _isLocked
   #22 = Fieldref           #11.#23       // ext/mods/gameserver/model/trade/TradeList._owner:Lext/mods/gameserver/model/actor/Player;
   #23 = NameAndType        #24:#25       // _owner:Lext/mods/gameserver/model/actor/Player;
   #24 = Utf8               _owner
   #25 = Utf8               Lext/mods/gameserver/model/actor/Player;
   #26 = Methodref          #2.#27        // java/util/concurrent/CopyOnWriteArrayList.clear:()V
   #27 = NameAndType        #28:#6        // clear:()V
   #28 = Utf8               clear
   #29 = Fieldref           #11.#30       // ext/mods/gameserver/model/trade/TradeList._partner:Lext/mods/gameserver/model/actor/Player;
   #30 = NameAndType        #31:#25       // _partner:Lext/mods/gameserver/model/actor/Player;
   #31 = Utf8               _partner
   #32 = Methodref          #7.#33        // java/util/concurrent/atomic/AtomicBoolean.set:(Z)V
   #33 = NameAndType        #34:#35       // set:(Z)V
   #34 = Utf8               set
   #35 = Utf8               (Z)V
   #36 = Methodref          #37.#38       // java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
   #37 = Class              #39           // java/lang/String
   #38 = NameAndType        #40:#41       // valueOf:(Ljava/lang/Object;)Ljava/lang/String;
   #39 = Utf8               java/lang/String
   #40 = Utf8               valueOf
   #41 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
   #42 = Fieldref           #11.#43       // ext/mods/gameserver/model/trade/TradeList._title:Ljava/lang/String;
   #43 = NameAndType        #44:#45       // _title:Ljava/lang/String;
   #44 = Utf8               _title
   #45 = Utf8               Ljava/lang/String;
   #46 = Methodref          #7.#47        // java/util/concurrent/atomic/AtomicBoolean.get:()Z
   #47 = NameAndType        #48:#49       // get:()Z
   #48 = Utf8               get
   #49 = Utf8               ()Z
   #50 = InvokeDynamic      #0:#51        // #0:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)Ljava/lang/String;
   #51 = NameAndType        #52:#53       // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)Ljava/lang/String;
   #52 = Utf8               makeConcatWithConstants
   #53 = Utf8               (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)Ljava/lang/String;
   #54 = Methodref          #11.#55       // ext/mods/gameserver/model/trade/TradeList.stream:()Ljava/util/stream/Stream;
   #55 = NameAndType        #56:#57       // stream:()Ljava/util/stream/Stream;
   #56 = Utf8               stream
   #57 = Utf8               ()Ljava/util/stream/Stream;
   #58 = Methodref          #59.#60       // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #59 = Class              #61           // java/util/Objects
   #60 = NameAndType        #62:#63       // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #61 = Utf8               java/util/Objects
   #62 = Utf8               requireNonNull
   #63 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #64 = InvokeDynamic      #1:#65        // #1:accept:(Lext/mods/gameserver/model/itemcontainer/PcInventory;)Ljava/util/function/Consumer;
   #65 = NameAndType        #66:#67       // accept:(Lext/mods/gameserver/model/itemcontainer/PcInventory;)Ljava/util/function/Consumer;
   #66 = Utf8               accept
   #67 = Utf8               (Lext/mods/gameserver/model/itemcontainer/PcInventory;)Ljava/util/function/Consumer;
   #68 = InterfaceMethodref #69.#70       // java/util/stream/Stream.peek:(Ljava/util/function/Consumer;)Ljava/util/stream/Stream;
   #69 = Class              #71           // java/util/stream/Stream
   #70 = NameAndType        #72:#73       // peek:(Ljava/util/function/Consumer;)Ljava/util/stream/Stream;
   #71 = Utf8               java/util/stream/Stream
   #72 = Utf8               peek
   #73 = Utf8               (Ljava/util/function/Consumer;)Ljava/util/stream/Stream;
   #74 = InterfaceMethodref #69.#75       // java/util/stream/Stream.toList:()Ljava/util/List;
   #75 = NameAndType        #76:#77       // toList:()Ljava/util/List;
   #76 = Utf8               toList
   #77 = Utf8               ()Ljava/util/List;
   #78 = Methodref          #11.#79       // ext/mods/gameserver/model/trade/TradeList.isConfirmed:()Z
   #79 = NameAndType        #80:#49       // isConfirmed:()Z
   #80 = Utf8               isConfirmed
   #81 = Methodref          #11.#82       // ext/mods/gameserver/model/trade/TradeList.isLocked:()Z
   #82 = NameAndType        #83:#49       // isLocked:()Z
   #83 = Utf8               isLocked
   #84 = Methodref          #85.#86       // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
   #85 = Class              #87           // ext/mods/gameserver/model/World
   #86 = NameAndType        #88:#89       // getInstance:()Lext/mods/gameserver/model/World;
   #87 = Utf8               ext/mods/gameserver/model/World
   #88 = Utf8               getInstance
   #89 = Utf8               ()Lext/mods/gameserver/model/World;
   #90 = Methodref          #85.#91       // ext/mods/gameserver/model/World.getObject:(I)Lext/mods/gameserver/model/WorldObject;
   #91 = NameAndType        #92:#93       // getObject:(I)Lext/mods/gameserver/model/WorldObject;
   #92 = Utf8               getObject
   #93 = Utf8               (I)Lext/mods/gameserver/model/WorldObject;
   #94 = Class              #95           // ext/mods/gameserver/model/item/instance/ItemInstance
   #95 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
   #96 = Methodref          #94.#97       // ext/mods/gameserver/model/item/instance/ItemInstance.isTradable:()Z
   #97 = NameAndType        #98:#49       // isTradable:()Z
   #98 = Utf8               isTradable
   #99 = Methodref          #94.#100      // ext/mods/gameserver/model/item/instance/ItemInstance.isQuestItem:()Z
  #100 = NameAndType        #101:#49      // isQuestItem:()Z
  #101 = Utf8               isQuestItem
  #102 = Methodref          #94.#103      // ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
  #103 = NameAndType        #104:#105     // getCount:()I
  #104 = Utf8               getCount
  #105 = Utf8               ()I
  #106 = Methodref          #94.#107      // ext/mods/gameserver/model/item/instance/ItemInstance.isStackable:()Z
  #107 = NameAndType        #108:#49      // isStackable:()Z
  #108 = Utf8               isStackable
  #109 = Class              #110          // java/lang/Integer
  #110 = Utf8               java/lang/Integer
  #111 = Integer            2147483647
  #112 = Methodref          #11.#113      // ext/mods/gameserver/model/trade/TradeList.iterator:()Ljava/util/Iterator;
  #113 = NameAndType        #114:#115     // iterator:()Ljava/util/Iterator;
  #114 = Utf8               iterator
  #115 = Utf8               ()Ljava/util/Iterator;
  #116 = InterfaceMethodref #117.#118     // java/util/Iterator.hasNext:()Z
  #117 = Class              #119          // java/util/Iterator
  #118 = NameAndType        #120:#49      // hasNext:()Z
  #119 = Utf8               java/util/Iterator
  #120 = Utf8               hasNext
  #121 = InterfaceMethodref #117.#122     // java/util/Iterator.next:()Ljava/lang/Object;
  #122 = NameAndType        #123:#124     // next:()Ljava/lang/Object;
  #123 = Utf8               next
  #124 = Utf8               ()Ljava/lang/Object;
  #125 = Class              #126          // ext/mods/gameserver/model/trade/TradeItem
  #126 = Utf8               ext/mods/gameserver/model/trade/TradeItem
  #127 = Methodref          #125.#128     // ext/mods/gameserver/model/trade/TradeItem.getObjectId:()I
  #128 = NameAndType        #129:#105     // getObjectId:()I
  #129 = Utf8               getObjectId
  #130 = Methodref          #125.#103     // ext/mods/gameserver/model/trade/TradeItem.getCount:()I
  #131 = Methodref          #125.#132     // ext/mods/gameserver/model/trade/TradeItem.setCount:(I)V
  #132 = NameAndType        #133:#134     // setCount:(I)V
  #133 = Utf8               setCount
  #134 = Utf8               (I)V
  #135 = Methodref          #125.#136     // ext/mods/gameserver/model/trade/TradeItem."<init>":(Lext/mods/gameserver/model/item/instance/ItemInstance;II)V
  #136 = NameAndType        #5:#137       // "<init>":(Lext/mods/gameserver/model/item/instance/ItemInstance;II)V
  #137 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;II)V
  #138 = Methodref          #11.#139      // ext/mods/gameserver/model/trade/TradeList.add:(Ljava/lang/Object;)Z
  #139 = NameAndType        #140:#141     // add:(Ljava/lang/Object;)Z
  #140 = Utf8               add
  #141 = Utf8               (Ljava/lang/Object;)Z
  #142 = Methodref          #143.#144     // ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
  #143 = Class              #145          // ext/mods/gameserver/data/xml/ItemData
  #144 = NameAndType        #88:#146      // getInstance:()Lext/mods/gameserver/data/xml/ItemData;
  #145 = Utf8               ext/mods/gameserver/data/xml/ItemData
  #146 = Utf8               ()Lext/mods/gameserver/data/xml/ItemData;
  #147 = Methodref          #143.#148     // ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
  #148 = NameAndType        #149:#150     // getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
  #149 = Utf8               getTemplate
  #150 = Utf8               (I)Lext/mods/gameserver/model/item/kind/Item;
  #151 = Methodref          #152.#97      // ext/mods/gameserver/model/item/kind/Item.isTradable:()Z
  #152 = Class              #153          // ext/mods/gameserver/model/item/kind/Item
  #153 = Utf8               ext/mods/gameserver/model/item/kind/Item
  #154 = Methodref          #152.#100     // ext/mods/gameserver/model/item/kind/Item.isQuestItem:()Z
  #155 = Methodref          #152.#107     // ext/mods/gameserver/model/item/kind/Item.isStackable:()Z
  #156 = Methodref          #125.#157     // ext/mods/gameserver/model/trade/TradeItem."<init>":(Lext/mods/gameserver/model/item/kind/Item;III)V
  #157 = NameAndType        #5:#158       // "<init>":(Lext/mods/gameserver/model/item/kind/Item;III)V
  #158 = Utf8               (Lext/mods/gameserver/model/item/kind/Item;III)V
  #159 = Methodref          #125.#160     // ext/mods/gameserver/model/trade/TradeItem.getItem:()Lext/mods/gameserver/model/item/kind/Item;
  #160 = NameAndType        #161:#162     // getItem:()Lext/mods/gameserver/model/item/kind/Item;
  #161 = Utf8               getItem
  #162 = Utf8               ()Lext/mods/gameserver/model/item/kind/Item;
  #163 = Methodref          #152.#164     // ext/mods/gameserver/model/item/kind/Item.getItemId:()I
  #164 = NameAndType        #165:#105     // getItemId:()I
  #165 = Utf8               getItemId
  #166 = Methodref          #11.#167      // ext/mods/gameserver/model/trade/TradeList.remove:(Ljava/lang/Object;)Z
  #167 = NameAndType        #168:#141     // remove:(Ljava/lang/Object;)Z
  #168 = Utf8               remove
  #169 = Methodref          #125.#170     // ext/mods/gameserver/model/trade/TradeItem.getQuantity:()I
  #170 = NameAndType        #171:#105     // getQuantity:()I
  #171 = Utf8               getQuantity
  #172 = Methodref          #125.#173     // ext/mods/gameserver/model/trade/TradeItem.setQuantity:(I)V
  #173 = NameAndType        #174:#134     // setQuantity:(I)V
  #174 = Utf8               setQuantity
  #175 = Methodref          #176.#177     // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #176 = Class              #178          // ext/mods/gameserver/model/actor/Player
  #177 = NameAndType        #179:#180     // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #178 = Utf8               ext/mods/gameserver/model/actor/Player
  #179 = Utf8               getInventory
  #180 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #181 = Methodref          #125.#164     // ext/mods/gameserver/model/trade/TradeItem.getItemId:()I
  #182 = Methodref          #183.#184     // ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #183 = Class              #185          // ext/mods/gameserver/model/itemcontainer/PcInventory
  #184 = NameAndType        #186:#187     // getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #185 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
  #186 = Utf8               getItemByItemId
  #187 = Utf8               (I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #188 = Methodref          #183.#189     // ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #189 = NameAndType        #190:#187     // getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #190 = Utf8               getItemByObjectId
  #191 = Methodref          #94.#192      // ext/mods/gameserver/model/item/instance/ItemInstance.isEquipped:()Z
  #192 = NameAndType        #193:#49      // isEquipped:()Z
  #193 = Utf8               isEquipped
  #194 = Methodref          #176.#195     // ext/mods/gameserver/model/actor/Player.cancelActiveTrade:()V
  #195 = NameAndType        #196:#6       // cancelActiveTrade:()V
  #196 = Utf8               cancelActiveTrade
  #197 = Methodref          #176.#198     // ext/mods/gameserver/model/actor/Player.getActiveTradeList:()Lext/mods/gameserver/model/trade/TradeList;
  #198 = NameAndType        #199:#200     // getActiveTradeList:()Lext/mods/gameserver/model/trade/TradeList;
  #199 = Utf8               getActiveTradeList
  #200 = Utf8               ()Lext/mods/gameserver/model/trade/TradeList;
  #201 = Methodref          #7.#202       // java/util/concurrent/atomic/AtomicBoolean.compareAndSet:(ZZ)Z
  #202 = NameAndType        #203:#204     // compareAndSet:(ZZ)Z
  #203 = Utf8               compareAndSet
  #204 = Utf8               (ZZ)Z
  #205 = Methodref          #11.#206      // ext/mods/gameserver/model/trade/TradeList.getLock:()Ljava/util/concurrent/atomic/AtomicBoolean;
  #206 = NameAndType        #207:#208     // getLock:()Ljava/util/concurrent/atomic/AtomicBoolean;
  #207 = Utf8               getLock
  #208 = Utf8               ()Ljava/util/concurrent/atomic/AtomicBoolean;
  #209 = Methodref          #11.#210      // ext/mods/gameserver/model/trade/TradeList.validate:(Lext/mods/gameserver/model/actor/Player;Z)Z
  #210 = NameAndType        #211:#212     // validate:(Lext/mods/gameserver/model/actor/Player;Z)Z
  #211 = Utf8               validate
  #212 = Utf8               (Lext/mods/gameserver/model/actor/Player;Z)Z
  #213 = Methodref          #11.#214      // ext/mods/gameserver/model/trade/TradeList.doExchange:(Lext/mods/gameserver/model/trade/TradeList;)V
  #214 = NameAndType        #215:#216     // doExchange:(Lext/mods/gameserver/model/trade/TradeList;)V
  #215 = Utf8               doExchange
  #216 = Utf8               (Lext/mods/gameserver/model/trade/TradeList;)V
  #217 = Methodref          #176.#218     // ext/mods/gameserver/model/actor/Player.onTradeConfirm:(Lext/mods/gameserver/model/actor/Player;)V
  #218 = NameAndType        #219:#220     // onTradeConfirm:(Lext/mods/gameserver/model/actor/Player;)V
  #219 = Utf8               onTradeConfirm
  #220 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #221 = Methodref          #176.#222     // ext/mods/gameserver/model/actor/Player.isOnline:()Z
  #222 = NameAndType        #223:#49      // isOnline:()Z
  #223 = Utf8               isOnline
  #224 = Class              #225          // ext/mods/gameserver/model/actor/Npc
  #225 = Utf8               ext/mods/gameserver/model/actor/Npc
  #226 = Methodref          #176.#227     // ext/mods/gameserver/model/actor/Player.isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
  #227 = NameAndType        #228:#229     // isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
  #228 = Utf8               isIn3DRadius
  #229 = Utf8               (Lext/mods/gameserver/model/WorldObject;I)Z
  #230 = InvokeDynamic      #2:#231       // #2:test:(Lext/mods/gameserver/model/trade/TradeList;)Ljava/util/function/Predicate;
  #231 = NameAndType        #232:#233     // test:(Lext/mods/gameserver/model/trade/TradeList;)Ljava/util/function/Predicate;
  #232 = Utf8               test
  #233 = Utf8               (Lext/mods/gameserver/model/trade/TradeList;)Ljava/util/function/Predicate;
  #234 = InterfaceMethodref #69.#235      // java/util/stream/Stream.allMatch:(Ljava/util/function/Predicate;)Z
  #235 = NameAndType        #236:#237     // allMatch:(Ljava/util/function/Predicate;)Z
  #236 = Utf8               allMatch
  #237 = Utf8               (Ljava/util/function/Predicate;)Z
  #238 = InvokeDynamic      #3:#239       // #3:accept:(Lext/mods/gameserver/model/trade/TradeList;Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Consumer;
  #239 = NameAndType        #66:#240      // accept:(Lext/mods/gameserver/model/trade/TradeList;Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Consumer;
  #240 = Utf8               (Lext/mods/gameserver/model/trade/TradeList;Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Consumer;
  #241 = Methodref          #11.#242      // ext/mods/gameserver/model/trade/TradeList.forEach:(Ljava/util/function/Consumer;)V
  #242 = NameAndType        #243:#244     // forEach:(Ljava/util/function/Consumer;)V
  #243 = Utf8               forEach
  #244 = Utf8               (Ljava/util/function/Consumer;)V
  #245 = Methodref          #183.#246     // ext/mods/gameserver/model/itemcontainer/PcInventory.validateTradeListWeight:(Lext/mods/gameserver/model/trade/TradeList;)Z
  #246 = NameAndType        #247:#248     // validateTradeListWeight:(Lext/mods/gameserver/model/trade/TradeList;)Z
  #247 = Utf8               validateTradeListWeight
  #248 = Utf8               (Lext/mods/gameserver/model/trade/TradeList;)Z
  #249 = Methodref          #11.#250      // ext/mods/gameserver/model/trade/TradeList.getOwner:()Lext/mods/gameserver/model/actor/Player;
  #250 = NameAndType        #251:#252     // getOwner:()Lext/mods/gameserver/model/actor/Player;
  #251 = Utf8               getOwner
  #252 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #253 = Fieldref           #254.#255     // ext/mods/gameserver/network/SystemMessageId.WEIGHT_LIMIT_EXCEEDED:Lext/mods/gameserver/network/SystemMessageId;
  #254 = Class              #256          // ext/mods/gameserver/network/SystemMessageId
  #255 = NameAndType        #257:#258     // WEIGHT_LIMIT_EXCEEDED:Lext/mods/gameserver/network/SystemMessageId;
  #256 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #257 = Utf8               WEIGHT_LIMIT_EXCEEDED
  #258 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #259 = Methodref          #176.#260     // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #260 = NameAndType        #261:#262     // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #261 = Utf8               sendPacket
  #262 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #263 = Methodref          #183.#264     // ext/mods/gameserver/model/itemcontainer/PcInventory.validateTradeListCapacity:(Lext/mods/gameserver/model/trade/TradeList;)Z
  #264 = NameAndType        #265:#248     // validateTradeListCapacity:(Lext/mods/gameserver/model/trade/TradeList;)Z
  #265 = Utf8               validateTradeListCapacity
  #266 = Fieldref           #254.#267     // ext/mods/gameserver/network/SystemMessageId.SLOTS_FULL:Lext/mods/gameserver/network/SystemMessageId;
  #267 = NameAndType        #268:#258     // SLOTS_FULL:Lext/mods/gameserver/network/SystemMessageId;
  #268 = Utf8               SLOTS_FULL
  #269 = Methodref          #183.#270     // ext/mods/gameserver/model/itemcontainer/PcInventory.validateTradeListCount:(Lext/mods/gameserver/model/trade/TradeList;)Z
  #270 = NameAndType        #271:#248     // validateTradeListCount:(Lext/mods/gameserver/model/trade/TradeList;)Z
  #271 = Utf8               validateTradeListCount
  #272 = Methodref          #11.#273      // ext/mods/gameserver/model/trade/TradeList.isEmpty:()Z
  #273 = NameAndType        #274:#49      // isEmpty:()Z
  #274 = Utf8               isEmpty
  #275 = Methodref          #11.#276      // ext/mods/gameserver/model/trade/TradeList.transferItems:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)V
  #276 = NameAndType        #277:#278     // transferItems:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)V
  #277 = Utf8               transferItems
  #278 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)V
  #279 = Methodref          #176.#280     // ext/mods/gameserver/model/actor/Player.onTradeFinish:(Z)V
  #280 = NameAndType        #281:#35      // onTradeFinish:(Z)V
  #281 = Utf8               onTradeFinish
  #282 = Methodref          #283.#103     // ext/mods/gameserver/model/trade/ItemRequest.getCount:()I
  #283 = Class              #284          // ext/mods/gameserver/model/trade/ItemRequest
  #284 = Utf8               ext/mods/gameserver/model/trade/ItemRequest
  #285 = InvokeDynamic      #4:#286       // #4:test:(Lext/mods/gameserver/model/trade/ItemRequest;)Ljava/util/function/Predicate;
  #286 = NameAndType        #232:#287     // test:(Lext/mods/gameserver/model/trade/ItemRequest;)Ljava/util/function/Predicate;
  #287 = Utf8               (Lext/mods/gameserver/model/trade/ItemRequest;)Ljava/util/function/Predicate;
  #288 = InterfaceMethodref #69.#289      // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #289 = NameAndType        #290:#291     // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #290 = Utf8               filter
  #291 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #292 = InterfaceMethodref #69.#293      // java/util/stream/Stream.findFirst:()Ljava/util/Optional;
  #293 = NameAndType        #294:#295     // findFirst:()Ljava/util/Optional;
  #294 = Utf8               findFirst
  #295 = Utf8               ()Ljava/util/Optional;
  #296 = Methodref          #297.#298     // java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
  #297 = Class              #299          // java/util/Optional
  #298 = NameAndType        #300:#63      // orElse:(Ljava/lang/Object;)Ljava/lang/Object;
  #299 = Utf8               java/util/Optional
  #300 = Utf8               orElse
  #301 = Methodref          #283.#128     // ext/mods/gameserver/model/trade/ItemRequest.getObjectId:()I
  #302 = Methodref          #176.#303     // ext/mods/gameserver/model/actor/Player.checkItemManipulation:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #303 = NameAndType        #304:#305     // checkItemManipulation:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #304 = Utf8               checkItemManipulation
  #305 = Utf8               (II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #306 = Methodref          #283.#307     // ext/mods/gameserver/model/trade/ItemRequest.getPrice:()I
  #307 = NameAndType        #308:#105     // getPrice:()I
  #308 = Utf8               getPrice
  #309 = Long               2147483647l
  #311 = Methodref          #152.#312     // ext/mods/gameserver/model/item/kind/Item.getWeight:()I
  #312 = NameAndType        #313:#105     // getWeight:()I
  #313 = Utf8               getWeight
  #314 = Methodref          #283.#164     // ext/mods/gameserver/model/trade/ItemRequest.getItemId:()I
  #315 = Methodref          #183.#316     // ext/mods/gameserver/model/itemcontainer/PcInventory.getAdena:()I
  #316 = NameAndType        #317:#105     // getAdena:()I
  #317 = Utf8               getAdena
  #318 = Fieldref           #254.#319     // ext/mods/gameserver/network/SystemMessageId.YOU_NOT_ENOUGH_ADENA:Lext/mods/gameserver/network/SystemMessageId;
  #319 = NameAndType        #320:#258     // YOU_NOT_ENOUGH_ADENA:Lext/mods/gameserver/network/SystemMessageId;
  #320 = Utf8               YOU_NOT_ENOUGH_ADENA
  #321 = Methodref          #183.#322     // ext/mods/gameserver/model/itemcontainer/PcInventory.validateWeight:(I)Z
  #322 = NameAndType        #323:#324     // validateWeight:(I)Z
  #323 = Utf8               validateWeight
  #324 = Utf8               (I)Z
  #325 = Methodref          #183.#326     // ext/mods/gameserver/model/itemcontainer/PcInventory.validateCapacity:(I)Z
  #326 = NameAndType        #327:#324     // validateCapacity:(I)Z
  #327 = Utf8               validateCapacity
  #328 = Methodref          #183.#329     // ext/mods/gameserver/model/itemcontainer/PcInventory.transferItem:(IILext/mods/gameserver/model/actor/Playable;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #329 = NameAndType        #330:#331     // transferItem:(IILext/mods/gameserver/model/actor/Playable;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #330 = Utf8               transferItem
  #331 = Utf8               (IILext/mods/gameserver/model/actor/Playable;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #332 = Methodref          #11.#333      // ext/mods/gameserver/model/trade/TradeList.removeItem:(III)V
  #333 = NameAndType        #334:#335     // removeItem:(III)V
  #334 = Utf8               removeItem
  #335 = Utf8               (III)V
  #336 = Fieldref           #254.#337     // ext/mods/gameserver/network/SystemMessageId.S1_PURCHASED_S3_S2_S:Lext/mods/gameserver/network/SystemMessageId;
  #337 = NameAndType        #338:#258     // S1_PURCHASED_S3_S2_S:Lext/mods/gameserver/network/SystemMessageId;
  #338 = Utf8               S1_PURCHASED_S3_S2_S
  #339 = Methodref          #340.#341     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #340 = Class              #342          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #341 = NameAndType        #343:#344     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #342 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #343 = Utf8               getSystemMessage
  #344 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #345 = Methodref          #176.#346     // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
  #346 = NameAndType        #347:#348     // getName:()Ljava/lang/String;
  #347 = Utf8               getName
  #348 = Utf8               ()Ljava/lang/String;
  #349 = Methodref          #340.#350     // ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #350 = NameAndType        #351:#352     // addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #351 = Utf8               addString
  #352 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #353 = Methodref          #94.#164      // ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
  #354 = Methodref          #340.#355     // ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #355 = NameAndType        #356:#357     // addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #356 = Utf8               addItemName
  #357 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #358 = Methodref          #340.#359     // ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #359 = NameAndType        #360:#357     // addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #360 = Utf8               addNumber
  #361 = Methodref          #176.#362     // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #362 = NameAndType        #261:#363     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #363 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #364 = Fieldref           #254.#365     // ext/mods/gameserver/network/SystemMessageId.PURCHASED_S3_S2_S_FROM_S1:Lext/mods/gameserver/network/SystemMessageId;
  #365 = NameAndType        #366:#258     // PURCHASED_S3_S2_S_FROM_S1:Lext/mods/gameserver/network/SystemMessageId;
  #366 = Utf8               PURCHASED_S3_S2_S_FROM_S1
  #367 = Methodref          #94.#368      // ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
  #368 = NameAndType        #369:#105     // getEnchantLevel:()I
  #369 = Utf8               getEnchantLevel
  #370 = Fieldref           #254.#371     // ext/mods/gameserver/network/SystemMessageId.S1_PURCHASED_S2_S3:Lext/mods/gameserver/network/SystemMessageId;
  #371 = NameAndType        #372:#258     // S1_PURCHASED_S2_S3:Lext/mods/gameserver/network/SystemMessageId;
  #372 = Utf8               S1_PURCHASED_S2_S3
  #373 = Fieldref           #254.#374     // ext/mods/gameserver/network/SystemMessageId.PURCHASED_S2_S3_FROM_S1:Lext/mods/gameserver/network/SystemMessageId;
  #374 = NameAndType        #375:#258     // PURCHASED_S2_S3_FROM_S1:Lext/mods/gameserver/network/SystemMessageId;
  #375 = Utf8               PURCHASED_S2_S3_FROM_S1
  #376 = Fieldref           #254.#377     // ext/mods/gameserver/network/SystemMessageId.S1_PURCHASED_S2:Lext/mods/gameserver/network/SystemMessageId;
  #377 = NameAndType        #378:#258     // S1_PURCHASED_S2:Lext/mods/gameserver/network/SystemMessageId;
  #378 = Utf8               S1_PURCHASED_S2
  #379 = Fieldref           #254.#380     // ext/mods/gameserver/network/SystemMessageId.PURCHASED_S2_FROM_S1:Lext/mods/gameserver/network/SystemMessageId;
  #380 = NameAndType        #381:#258     // PURCHASED_S2_FROM_S1:Lext/mods/gameserver/network/SystemMessageId;
  #381 = Utf8               PURCHASED_S2_FROM_S1
  #382 = Methodref          #183.#383     // ext/mods/gameserver/model/itemcontainer/PcInventory.reduceAdena:(I)Z
  #383 = NameAndType        #384:#324     // reduceAdena:(I)Z
  #384 = Utf8               reduceAdena
  #385 = Methodref          #183.#386     // ext/mods/gameserver/model/itemcontainer/PcInventory.addAdena:(I)V
  #386 = NameAndType        #387:#134     // addAdena:(I)V
  #387 = Utf8               addAdena
  #388 = InvokeDynamic      #5:#286       // #5:test:(Lext/mods/gameserver/model/trade/ItemRequest;)Ljava/util/function/Predicate;
  #389 = InterfaceMethodref #69.#390      // java/util/stream/Stream.noneMatch:(Ljava/util/function/Predicate;)Z
  #390 = NameAndType        #391:#237     // noneMatch:(Ljava/util/function/Predicate;)Z
  #391 = Utf8               noneMatch
  #392 = Methodref          #283.#393     // ext/mods/gameserver/model/trade/ItemRequest.getEnchant:()I
  #393 = NameAndType        #394:#105     // getEnchant:()I
  #394 = Utf8               getEnchant
  #395 = Methodref          #125.#307     // ext/mods/gameserver/model/trade/TradeItem.getPrice:()I
  #396 = Utf8               serialVersionUID
  #397 = Utf8               J
  #398 = Utf8               ConstantValue
  #399 = Long               1l
  #401 = Utf8               Code
  #402 = Utf8               LineNumberTable
  #403 = Utf8               LocalVariableTable
  #404 = Utf8               this
  #405 = Utf8               Lext/mods/gameserver/model/trade/TradeList;
  #406 = Utf8               owner
  #407 = Utf8               toString
  #408 = Utf8               getPartner
  #409 = Utf8               setPartner
  #410 = Utf8               partner
  #411 = Utf8               getTitle
  #412 = Utf8               setTitle
  #413 = Utf8               (Ljava/lang/String;)V
  #414 = Utf8               title
  #415 = Utf8               isPackaged
  #416 = Utf8               setPackaged
  #417 = Utf8               value
  #418 = Utf8               Z
  #419 = Utf8               lock
  #420 = Utf8               getAvailableItems
  #421 = Utf8               (Lext/mods/gameserver/model/itemcontainer/PcInventory;)Ljava/util/List;
  #422 = Utf8               inventory
  #423 = Utf8               Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #424 = Utf8               Signature
  #425 = Utf8               (Lext/mods/gameserver/model/itemcontainer/PcInventory;)Ljava/util/List<Lext/mods/gameserver/model/trade/TradeItem;>;
  #426 = Utf8               addItem
  #427 = Utf8               (III)Lext/mods/gameserver/model/trade/TradeItem;
  #428 = Utf8               item
  #429 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #430 = Utf8               newCount
  #431 = Utf8               I
  #432 = Utf8               checkItem
  #433 = Utf8               Lext/mods/gameserver/model/trade/TradeItem;
  #434 = Utf8               objectId
  #435 = Utf8               count
  #436 = Utf8               price
  #437 = Utf8               object
  #438 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #439 = Utf8               tradeItem
  #440 = Utf8               StackMapTable
  #441 = Class              #442          // ext/mods/gameserver/model/WorldObject
  #442 = Utf8               ext/mods/gameserver/model/WorldObject
  #443 = Utf8               addItemByItemId
  #444 = Utf8               (IIII)Lext/mods/gameserver/model/trade/TradeItem;
  #445 = Utf8               itemId
  #446 = Utf8               enchant
  #447 = Utf8               Lext/mods/gameserver/model/item/kind/Item;
  #448 = Utf8               updateItems
  #449 = Utf8               isBuyList
  #450 = Utf8               confirm
  #451 = Utf8               partnerList
  #452 = Utf8               isCheckingItems
  #453 = Utf8               partnerTradeList
  #454 = Utf8               isSuccessful
  #455 = Utf8               privateStoreBuy
  #456 = Utf8               (Lext/mods/gameserver/model/actor/Player;[Lext/mods/gameserver/model/trade/ItemRequest;)Z
  #457 = Utf8               template
  #458 = Utf8               oldItem
  #459 = Utf8               Lext/mods/gameserver/model/trade/ItemRequest;
  #460 = Utf8               newItem
  #461 = Utf8               player
  #462 = Utf8               items
  #463 = Utf8               [Lext/mods/gameserver/model/trade/ItemRequest;
  #464 = Utf8               totalSlots
  #465 = Utf8               totalWeight
  #466 = Utf8               totalPrice
  #467 = Utf8               ownerInventory
  #468 = Utf8               playerInventory
  #469 = Class              #463          // "[Lext/mods/gameserver/model/trade/ItemRequest;"
  #470 = Utf8               privateStoreSell
  #471 = Utf8               lambda$privateStoreSell$0
  #472 = Utf8               (Lext/mods/gameserver/model/trade/ItemRequest;Lext/mods/gameserver/model/trade/TradeItem;)Z
  #473 = Utf8               ti
  #474 = Utf8               lambda$privateStoreBuy$0
  #475 = Utf8               lambda$transferItems$0
  #476 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/trade/TradeItem;)V
  #477 = Utf8               lambda$validate$0
  #478 = Utf8               (Lext/mods/gameserver/model/trade/TradeItem;)Z
  #479 = Utf8               Ljava/util/concurrent/CopyOnWriteArrayList<Lext/mods/gameserver/model/trade/TradeItem;>;
  #480 = Utf8               SourceFile
  #481 = Utf8               TradeList.java
  #482 = Utf8               BootstrapMethods
  #483 = String             #484          // TradeList [owner=\u0001, partner=\u0001, title=\u0001, isPackaged=\u0001, isConfirmed=\u0001, isLocked=\u0001]
  #484 = Utf8               TradeList [owner=\u0001, partner=\u0001, title=\u0001, isPackaged=\u0001, isConfirmed=\u0001, isLocked=\u0001]
  #485 = MethodType         #486          //  (Ljava/lang/Object;)V
  #486 = Utf8               (Ljava/lang/Object;)V
  #487 = MethodHandle       5:#488        // REF_invokeVirtual ext/mods/gameserver/model/itemcontainer/PcInventory.adjustAvailableItem:(Lext/mods/gameserver/model/trade/TradeItem;)V
  #488 = Methodref          #183.#489     // ext/mods/gameserver/model/itemcontainer/PcInventory.adjustAvailableItem:(Lext/mods/gameserver/model/trade/TradeItem;)V
  #489 = NameAndType        #490:#491     // adjustAvailableItem:(Lext/mods/gameserver/model/trade/TradeItem;)V
  #490 = Utf8               adjustAvailableItem
  #491 = Utf8               (Lext/mods/gameserver/model/trade/TradeItem;)V
  #492 = MethodType         #491          //  (Lext/mods/gameserver/model/trade/TradeItem;)V
  #493 = MethodType         #141          //  (Ljava/lang/Object;)Z
  #494 = MethodHandle       5:#495        // REF_invokeVirtual ext/mods/gameserver/model/trade/TradeList.lambda$validate$0:(Lext/mods/gameserver/model/trade/TradeItem;)Z
  #495 = Methodref          #11.#496      // ext/mods/gameserver/model/trade/TradeList.lambda$validate$0:(Lext/mods/gameserver/model/trade/TradeItem;)Z
  #496 = NameAndType        #477:#478     // lambda$validate$0:(Lext/mods/gameserver/model/trade/TradeItem;)Z
  #497 = MethodType         #478          //  (Lext/mods/gameserver/model/trade/TradeItem;)Z
  #498 = MethodHandle       5:#499        // REF_invokeVirtual ext/mods/gameserver/model/trade/TradeList.lambda$transferItems$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/trade/TradeItem;)V
  #499 = Methodref          #11.#500      // ext/mods/gameserver/model/trade/TradeList.lambda$transferItems$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/trade/TradeItem;)V
  #500 = NameAndType        #475:#476     // lambda$transferItems$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/trade/TradeItem;)V
  #501 = MethodHandle       6:#502        // REF_invokeStatic ext/mods/gameserver/model/trade/TradeList.lambda$privateStoreBuy$0:(Lext/mods/gameserver/model/trade/ItemRequest;Lext/mods/gameserver/model/trade/TradeItem;)Z
  #502 = Methodref          #11.#503      // ext/mods/gameserver/model/trade/TradeList.lambda$privateStoreBuy$0:(Lext/mods/gameserver/model/trade/ItemRequest;Lext/mods/gameserver/model/trade/TradeItem;)Z
  #503 = NameAndType        #474:#472     // lambda$privateStoreBuy$0:(Lext/mods/gameserver/model/trade/ItemRequest;Lext/mods/gameserver/model/trade/TradeItem;)Z
  #504 = MethodHandle       6:#505        // REF_invokeStatic ext/mods/gameserver/model/trade/TradeList.lambda$privateStoreSell$0:(Lext/mods/gameserver/model/trade/ItemRequest;Lext/mods/gameserver/model/trade/TradeItem;)Z
  #505 = Methodref          #11.#506      // ext/mods/gameserver/model/trade/TradeList.lambda$privateStoreSell$0:(Lext/mods/gameserver/model/trade/ItemRequest;Lext/mods/gameserver/model/trade/TradeItem;)Z
  #506 = NameAndType        #471:#472     // lambda$privateStoreSell$0:(Lext/mods/gameserver/model/trade/ItemRequest;Lext/mods/gameserver/model/trade/TradeItem;)Z
  #507 = MethodHandle       6:#508        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #508 = Methodref          #509.#510     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #509 = Class              #511          // java/lang/invoke/StringConcatFactory
  #510 = NameAndType        #52:#512      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #511 = Utf8               java/lang/invoke/StringConcatFactory
  #512 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #513 = MethodHandle       6:#514        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #514 = Methodref          #515.#516     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #515 = Class              #517          // java/lang/invoke/LambdaMetafactory
  #516 = NameAndType        #518:#519     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #517 = Utf8               java/lang/invoke/LambdaMetafactory
  #518 = Utf8               metafactory
  #519 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #520 = Utf8               InnerClasses
  #521 = Class              #522          // java/lang/invoke/MethodHandles$Lookup
  #522 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #523 = Class              #524          // java/lang/invoke/MethodHandles
  #524 = Utf8               java/lang/invoke/MethodHandles
  #525 = Utf8               Lookup
{
  public ext.mods.gameserver.model.trade.TradeList(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/util/concurrent/CopyOnWriteArrayList."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/concurrent/atomic/AtomicBoolean
         8: dup
         9: invokespecial #9                  // Method java/util/concurrent/atomic/AtomicBoolean."<init>":()V
        12: putfield      #10                 // Field _isPackaged:Ljava/util/concurrent/atomic/AtomicBoolean;
        15: aload_0
        16: new           #7                  // class java/util/concurrent/atomic/AtomicBoolean
        19: dup
        20: invokespecial #9                  // Method java/util/concurrent/atomic/AtomicBoolean."<init>":()V
        23: putfield      #16                 // Field _isConfirmed:Ljava/util/concurrent/atomic/AtomicBoolean;
        26: aload_0
        27: new           #7                  // class java/util/concurrent/atomic/AtomicBoolean
        30: dup
        31: invokespecial #9                  // Method java/util/concurrent/atomic/AtomicBoolean."<init>":()V
        34: putfield      #19                 // Field _isLocked:Ljava/util/concurrent/atomic/AtomicBoolean;
        37: aload_0
        38: aload_1
        39: putfield      #22                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
        42: return
      LineNumberTable:
        line 49: 0
        line 44: 4
        line 45: 15
        line 46: 26
        line 50: 37
        line 51: 42
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      43     0  this   Lext/mods/gameserver/model/trade/TradeList;
            0      43     1 owner   Lext/mods/gameserver/model/actor/Player;

  public void clear();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokespecial #26                 // Method java/util/concurrent/CopyOnWriteArrayList.clear:()V
         4: aload_0
         5: aconst_null
         6: putfield      #29                 // Field _partner:Lext/mods/gameserver/model/actor/Player;
         9: aload_0
        10: getfield      #10                 // Field _isPackaged:Ljava/util/concurrent/atomic/AtomicBoolean;
        13: iconst_0
        14: invokevirtual #32                 // Method java/util/concurrent/atomic/AtomicBoolean.set:(Z)V
        17: aload_0
        18: getfield      #16                 // Field _isConfirmed:Ljava/util/concurrent/atomic/AtomicBoolean;
        21: iconst_0
        22: invokevirtual #32                 // Method java/util/concurrent/atomic/AtomicBoolean.set:(Z)V
        25: aload_0
        26: getfield      #19                 // Field _isLocked:Ljava/util/concurrent/atomic/AtomicBoolean;
        29: iconst_0
        30: invokevirtual #32                 // Method java/util/concurrent/atomic/AtomicBoolean.set:(Z)V
        33: return
      LineNumberTable:
        line 56: 0
        line 58: 4
        line 60: 9
        line 61: 17
        line 62: 25
        line 63: 33
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      34     0  this   Lext/mods/gameserver/model/trade/TradeList;

  public java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
         4: invokestatic  #36                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
         7: aload_0
         8: getfield      #29                 // Field _partner:Lext/mods/gameserver/model/actor/Player;
        11: invokestatic  #36                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        14: aload_0
        15: getfield      #42                 // Field _title:Ljava/lang/String;
        18: aload_0
        19: getfield      #10                 // Field _isPackaged:Ljava/util/concurrent/atomic/AtomicBoolean;
        22: invokevirtual #46                 // Method java/util/concurrent/atomic/AtomicBoolean.get:()Z
        25: aload_0
        26: getfield      #16                 // Field _isConfirmed:Ljava/util/concurrent/atomic/AtomicBoolean;
        29: invokevirtual #46                 // Method java/util/concurrent/atomic/AtomicBoolean.get:()Z
        32: aload_0
        33: getfield      #19                 // Field _isLocked:Ljava/util/concurrent/atomic/AtomicBoolean;
        36: invokevirtual #46                 // Method java/util/concurrent/atomic/AtomicBoolean.get:()Z
        39: invokedynamic #50,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)Ljava/lang/String;
        44: areturn
      LineNumberTable:
        line 68: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      45     0  this   Lext/mods/gameserver/model/trade/TradeList;

  public ext.mods.gameserver.model.actor.Player getOwner();
    descriptor: ()Lext/mods/gameserver/model/actor/Player;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
         4: areturn
      LineNumberTable:
        line 73: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/trade/TradeList;

  public ext.mods.gameserver.model.actor.Player getPartner();
    descriptor: ()Lext/mods/gameserver/model/actor/Player;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #29                 // Field _partner:Lext/mods/gameserver/model/actor/Player;
         4: areturn
      LineNumberTable:
        line 78: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/trade/TradeList;

  public void setPartner(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #29                 // Field _partner:Lext/mods/gameserver/model/actor/Player;
         5: return
      LineNumberTable:
        line 83: 0
        line 84: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/trade/TradeList;
            0       6     1 partner   Lext/mods/gameserver/model/actor/Player;

  public java.lang.String getTitle();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #42                 // Field _title:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 88: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/trade/TradeList;

  public void setTitle(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #42                 // Field _title:Ljava/lang/String;
         5: return
      LineNumberTable:
        line 93: 0
        line 94: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/trade/TradeList;
            0       6     1 title   Ljava/lang/String;

  public boolean isPackaged();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _isPackaged:Ljava/util/concurrent/atomic/AtomicBoolean;
         4: invokevirtual #46                 // Method java/util/concurrent/atomic/AtomicBoolean.get:()Z
         7: ireturn
      LineNumberTable:
        line 98: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/trade/TradeList;

  public void setPackaged(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _isPackaged:Ljava/util/concurrent/atomic/AtomicBoolean;
         4: iload_1
         5: invokevirtual #32                 // Method java/util/concurrent/atomic/AtomicBoolean.set:(Z)V
         8: return
      LineNumberTable:
        line 103: 0
        line 104: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/trade/TradeList;
            0       9     1 value   Z

  public boolean isConfirmed();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field _isConfirmed:Ljava/util/concurrent/atomic/AtomicBoolean;
         4: invokevirtual #46                 // Method java/util/concurrent/atomic/AtomicBoolean.get:()Z
         7: ireturn
      LineNumberTable:
        line 108: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/trade/TradeList;

  public java.util.concurrent.atomic.AtomicBoolean getLock();
    descriptor: ()Ljava/util/concurrent/atomic/AtomicBoolean;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field _isLocked:Ljava/util/concurrent/atomic/AtomicBoolean;
         4: areturn
      LineNumberTable:
        line 113: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/trade/TradeList;

  public boolean isLocked();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field _isLocked:Ljava/util/concurrent/atomic/AtomicBoolean;
         4: invokevirtual #46                 // Method java/util/concurrent/atomic/AtomicBoolean.get:()Z
         7: ireturn
      LineNumberTable:
        line 118: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/trade/TradeList;

  public void lock();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field _isLocked:Ljava/util/concurrent/atomic/AtomicBoolean;
         4: iconst_1
         5: invokevirtual #32                 // Method java/util/concurrent/atomic/AtomicBoolean.set:(Z)V
         8: return
      LineNumberTable:
        line 126: 0
        line 127: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/trade/TradeList;

  public java.util.List<ext.mods.gameserver.model.trade.TradeItem> getAvailableItems(ext.mods.gameserver.model.itemcontainer.PcInventory);
    descriptor: (Lext/mods/gameserver/model/itemcontainer/PcInventory;)Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #54                 // Method stream:()Ljava/util/stream/Stream;
         4: aload_1
         5: dup
         6: invokestatic  #58                 // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
         9: pop
        10: invokedynamic #64,  0             // InvokeDynamic #1:accept:(Lext/mods/gameserver/model/itemcontainer/PcInventory;)Ljava/util/function/Consumer;
        15: invokeinterface #68,  2           // InterfaceMethod java/util/stream/Stream.peek:(Ljava/util/function/Consumer;)Ljava/util/stream/Stream;
        20: invokeinterface #74,  1           // InterfaceMethod java/util/stream/Stream.toList:()Ljava/util/List;
        25: areturn
      LineNumberTable:
        line 135: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/trade/TradeList;
            0      26     1 inventory   Lext/mods/gameserver/model/itemcontainer/PcInventory;
    Signature: #425                         // (Lext/mods/gameserver/model/itemcontainer/PcInventory;)Ljava/util/List<Lext/mods/gameserver/model/trade/TradeItem;>;

  public ext.mods.gameserver.model.trade.TradeItem addItem(int, int, int);
    descriptor: (III)Lext/mods/gameserver/model/trade/TradeItem;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=9, args_size=4
         0: aload_0
         1: invokevirtual #78                 // Method isConfirmed:()Z
         4: ifne          14
         7: aload_0
         8: invokevirtual #81                 // Method isLocked:()Z
        11: ifeq          16
        14: aconst_null
        15: areturn
        16: invokestatic  #84                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
        19: iload_1
        20: invokevirtual #90                 // Method ext/mods/gameserver/model/World.getObject:(I)Lext/mods/gameserver/model/WorldObject;
        23: astore        4
        25: aload         4
        27: instanceof    #94                 // class ext/mods/gameserver/model/item/instance/ItemInstance
        30: ifeq          43
        33: aload         4
        35: checkcast     #94                 // class ext/mods/gameserver/model/item/instance/ItemInstance
        38: astore        5
        40: goto          45
        43: aconst_null
        44: areturn
        45: aload         5
        47: invokevirtual #96                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.isTradable:()Z
        50: ifeq          61
        53: aload         5
        55: invokevirtual #99                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.isQuestItem:()Z
        58: ifeq          63
        61: aconst_null
        62: areturn
        63: iload_2
        64: ifle          76
        67: iload_2
        68: aload         5
        70: invokevirtual #102                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
        73: if_icmple     78
        76: aconst_null
        77: areturn
        78: aload         5
        80: invokevirtual #106                // Method ext/mods/gameserver/model/item/instance/ItemInstance.isStackable:()Z
        83: ifne          93
        86: iload_2
        87: iconst_1
        88: if_icmple     93
        91: aconst_null
        92: areturn
        93: ldc           #111                // int 2147483647
        95: iload_2
        96: idiv
        97: iload_3
        98: if_icmpge     103
       101: aconst_null
       102: areturn
       103: aload_0
       104: invokevirtual #112                // Method iterator:()Ljava/util/Iterator;
       107: astore        6
       109: aload         6
       111: invokeinterface #116,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       116: ifeq          174
       119: aload         6
       121: invokeinterface #121,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       126: checkcast     #125                // class ext/mods/gameserver/model/trade/TradeItem
       129: astore        7
       131: aload         7
       133: invokevirtual #127                // Method ext/mods/gameserver/model/trade/TradeItem.getObjectId:()I
       136: iload_1
       137: if_icmpne     171
       140: aload         7
       142: invokevirtual #130                // Method ext/mods/gameserver/model/trade/TradeItem.getCount:()I
       145: iload_2
       146: iadd
       147: istore        8
       149: aload         5
       151: invokevirtual #102                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
       154: iload         8
       156: if_icmpge     161
       159: aconst_null
       160: areturn
       161: aload         7
       163: iload         8
       165: invokevirtual #131                // Method ext/mods/gameserver/model/trade/TradeItem.setCount:(I)V
       168: aload         7
       170: areturn
       171: goto          109
       174: new           #125                // class ext/mods/gameserver/model/trade/TradeItem
       177: dup
       178: aload         5
       180: iload_2
       181: iload_3
       182: invokespecial #135                // Method ext/mods/gameserver/model/trade/TradeItem."<init>":(Lext/mods/gameserver/model/item/instance/ItemInstance;II)V
       185: astore        6
       187: aload_0
       188: aload         6
       190: invokevirtual #138                // Method add:(Ljava/lang/Object;)Z
       193: pop
       194: aload         6
       196: areturn
      LineNumberTable:
        line 147: 0
        line 148: 14
        line 150: 16
        line 151: 25
        line 152: 43
        line 154: 45
        line 155: 61
        line 157: 63
        line 158: 76
        line 160: 78
        line 161: 91
        line 163: 93
        line 164: 101
        line 166: 103
        line 168: 131
        line 170: 140
        line 171: 149
        line 172: 159
        line 174: 161
        line 175: 168
        line 177: 171
        line 179: 174
        line 180: 187
        line 182: 194
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           40       3     5  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
          149      22     8 newCount   I
          131      40     7 checkItem   Lext/mods/gameserver/model/trade/TradeItem;
            0     197     0  this   Lext/mods/gameserver/model/trade/TradeList;
            0     197     1 objectId   I
            0     197     2 count   I
            0     197     3 price   I
           25     172     4 object   Lext/mods/gameserver/model/WorldObject;
           45     152     5  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
          187      10     6 tradeItem   Lext/mods/gameserver/model/trade/TradeItem;
      StackMapTable: number_of_entries = 14
        frame_type = 14 /* same */
        frame_type = 1 /* same */
        frame_type = 252 /* append */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/model/WorldObject ]
        frame_type = 252 /* append */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 15 /* same */
        frame_type = 1 /* same */
        frame_type = 12 /* same */
        frame_type = 1 /* same */
        frame_type = 14 /* same */
        frame_type = 9 /* same */
        frame_type = 252 /* append */
          offset_delta = 5
          locals = [ class java/util/Iterator ]
        frame_type = 253 /* append */
          offset_delta = 51
          locals = [ class ext/mods/gameserver/model/trade/TradeItem, int ]
        frame_type = 249 /* chop */
          offset_delta = 9
        frame_type = 250 /* chop */
          offset_delta = 2

  public ext.mods.gameserver.model.trade.TradeItem addItemByItemId(int, int, int, int);
    descriptor: (IIII)Lext/mods/gameserver/model/trade/TradeItem;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=7, args_size=5
         0: aload_0
         1: invokevirtual #78                 // Method isConfirmed:()Z
         4: ifne          14
         7: aload_0
         8: invokevirtual #81                 // Method isLocked:()Z
        11: ifeq          16
        14: aconst_null
        15: areturn
        16: invokestatic  #142                // Method ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
        19: iload_1
        20: invokevirtual #147                // Method ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
        23: astore        5
        25: aload         5
        27: ifnonnull     32
        30: aconst_null
        31: areturn
        32: aload         5
        34: invokevirtual #151                // Method ext/mods/gameserver/model/item/kind/Item.isTradable:()Z
        37: ifeq          48
        40: aload         5
        42: invokevirtual #154                // Method ext/mods/gameserver/model/item/kind/Item.isQuestItem:()Z
        45: ifeq          50
        48: aconst_null
        49: areturn
        50: aload         5
        52: invokevirtual #155                // Method ext/mods/gameserver/model/item/kind/Item.isStackable:()Z
        55: ifne          65
        58: iload_2
        59: iconst_1
        60: if_icmple     65
        63: aconst_null
        64: areturn
        65: ldc           #111                // int 2147483647
        67: iload_2
        68: idiv
        69: iload_3
        70: if_icmpge     75
        73: aconst_null
        74: areturn
        75: new           #125                // class ext/mods/gameserver/model/trade/TradeItem
        78: dup
        79: aload         5
        81: iload_2
        82: iload_3
        83: iload         4
        85: invokespecial #156                // Method ext/mods/gameserver/model/trade/TradeItem."<init>":(Lext/mods/gameserver/model/item/kind/Item;III)V
        88: astore        6
        90: aload_0
        91: aload         6
        93: invokevirtual #138                // Method add:(Ljava/lang/Object;)Z
        96: pop
        97: aload         6
        99: areturn
      LineNumberTable:
        line 195: 0
        line 196: 14
        line 198: 16
        line 199: 25
        line 200: 30
        line 202: 32
        line 203: 48
        line 205: 50
        line 206: 63
        line 208: 65
        line 209: 73
        line 211: 75
        line 212: 90
        line 214: 97
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     100     0  this   Lext/mods/gameserver/model/trade/TradeList;
            0     100     1 itemId   I
            0     100     2 count   I
            0     100     3 price   I
            0     100     4 enchant   I
           25      75     5  item   Lext/mods/gameserver/model/item/kind/Item;
           90      10     6 tradeItem   Lext/mods/gameserver/model/trade/TradeItem;
      StackMapTable: number_of_entries = 7
        frame_type = 14 /* same */
        frame_type = 1 /* same */
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/model/item/kind/Item ]
        frame_type = 15 /* same */
        frame_type = 1 /* same */
        frame_type = 14 /* same */
        frame_type = 9 /* same */

  public void updateItems(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=2
         0: aload_0
         1: invokevirtual #78                 // Method isConfirmed:()Z
         4: ifne          14
         7: aload_0
         8: invokevirtual #81                 // Method isLocked:()Z
        11: ifeq          15
        14: return
        15: aload_0
        16: invokevirtual #112                // Method iterator:()Ljava/util/Iterator;
        19: astore_2
        20: aload_2
        21: invokeinterface #116,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        26: ifeq          143
        29: aload_2
        30: invokeinterface #121,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        35: checkcast     #125                // class ext/mods/gameserver/model/trade/TradeItem
        38: astore_3
        39: iload_1
        40: ifeq          73
        43: aload_0
        44: getfield      #22                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
        47: invokevirtual #175                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        50: aload_3
        51: invokevirtual #181                // Method ext/mods/gameserver/model/trade/TradeItem.getItemId:()I
        54: invokevirtual #182                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
        57: astore        4
        59: aload         4
        61: ifnonnull     70
        64: aload_0
        65: aload_3
        66: invokevirtual #166                // Method remove:(Ljava/lang/Object;)Z
        69: pop
        70: goto          140
        73: aload_0
        74: getfield      #22                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
        77: invokevirtual #175                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        80: aload_3
        81: invokevirtual #127                // Method ext/mods/gameserver/model/trade/TradeItem.getObjectId:()I
        84: invokevirtual #188                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
        87: astore        4
        89: aload         4
        91: ifnull        110
        94: aload_3
        95: invokevirtual #130                // Method ext/mods/gameserver/model/trade/TradeItem.getCount:()I
        98: iconst_1
        99: if_icmplt     110
       102: aload         4
       104: invokevirtual #191                // Method ext/mods/gameserver/model/item/instance/ItemInstance.isEquipped:()Z
       107: ifeq          119
       110: aload_0
       111: aload_3
       112: invokevirtual #166                // Method remove:(Ljava/lang/Object;)Z
       115: pop
       116: goto          140
       119: aload         4
       121: invokevirtual #102                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
       124: aload_3
       125: invokevirtual #130                // Method ext/mods/gameserver/model/trade/TradeItem.getCount:()I
       128: if_icmpge     140
       131: aload_3
       132: aload         4
       134: invokevirtual #102                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
       137: invokevirtual #131                // Method ext/mods/gameserver/model/trade/TradeItem.setCount:(I)V
       140: goto          20
       143: return
      LineNumberTable:
        line 253: 0
        line 254: 14
        line 256: 15
        line 258: 39
        line 260: 43
        line 261: 59
        line 262: 64
        line 263: 70
        line 266: 73
        line 267: 89
        line 268: 110
        line 269: 119
        line 270: 131
        line 272: 140
        line 273: 143
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           59      11     4  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
           89      51     4  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
           39     101     3 tradeItem   Lext/mods/gameserver/model/trade/TradeItem;
            0     144     0  this   Lext/mods/gameserver/model/trade/TradeList;
            0     144     1 isBuyList   Z
      StackMapTable: number_of_entries = 9
        frame_type = 14 /* same */
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 4
          locals = [ class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 49
          locals = [ class ext/mods/gameserver/model/trade/TradeItem ]
        frame_type = 2 /* same */
        frame_type = 252 /* append */
          offset_delta = 36
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 20
        frame_type = 250 /* chop */
          offset_delta = 2

  public void confirm();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=1
         0: aload_0
         1: invokevirtual #78                 // Method isConfirmed:()Z
         4: ifne          14
         7: aload_0
         8: invokevirtual #81                 // Method isLocked:()Z
        11: ifeq          15
        14: return
        15: aload_0
        16: getfield      #29                 // Field _partner:Lext/mods/gameserver/model/actor/Player;
        19: ifnonnull     30
        22: aload_0
        23: getfield      #22                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
        26: invokevirtual #194                // Method ext/mods/gameserver/model/actor/Player.cancelActiveTrade:()V
        29: return
        30: aload_0
        31: getfield      #29                 // Field _partner:Lext/mods/gameserver/model/actor/Player;
        34: invokevirtual #197                // Method ext/mods/gameserver/model/actor/Player.getActiveTradeList:()Lext/mods/gameserver/model/trade/TradeList;
        37: astore_1
        38: aload_1
        39: ifnonnull     50
        42: aload_0
        43: getfield      #22                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
        46: invokevirtual #194                // Method ext/mods/gameserver/model/actor/Player.cancelActiveTrade:()V
        49: return
        50: aload_0
        51: getfield      #16                 // Field _isConfirmed:Ljava/util/concurrent/atomic/AtomicBoolean;
        54: iconst_0
        55: iconst_1
        56: invokevirtual #201                // Method java/util/concurrent/atomic/AtomicBoolean.compareAndSet:(ZZ)Z
        59: ifne          63
        62: return
        63: aload_1
        64: invokevirtual #78                 // Method isConfirmed:()Z
        67: ifeq          134
        70: aload_0
        71: getfield      #19                 // Field _isLocked:Ljava/util/concurrent/atomic/AtomicBoolean;
        74: iconst_0
        75: iconst_1
        76: invokevirtual #201                // Method java/util/concurrent/atomic/AtomicBoolean.compareAndSet:(ZZ)Z
        79: ifeq          177
        82: aload_1
        83: invokevirtual #205                // Method getLock:()Ljava/util/concurrent/atomic/AtomicBoolean;
        86: iconst_0
        87: iconst_1
        88: invokevirtual #201                // Method java/util/concurrent/atomic/AtomicBoolean.compareAndSet:(ZZ)Z
        91: ifeq          177
        94: aload_0
        95: aload_0
        96: getfield      #29                 // Field _partner:Lext/mods/gameserver/model/actor/Player;
        99: iconst_1
       100: invokevirtual #209                // Method validate:(Lext/mods/gameserver/model/actor/Player;Z)Z
       103: ifeq          118
       106: aload_1
       107: aload_0
       108: getfield      #22                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       111: iconst_1
       112: invokevirtual #209                // Method validate:(Lext/mods/gameserver/model/actor/Player;Z)Z
       115: ifne          126
       118: aload_0
       119: getfield      #22                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       122: invokevirtual #194                // Method ext/mods/gameserver/model/actor/Player.cancelActiveTrade:()V
       125: return
       126: aload_0
       127: aload_1
       128: invokevirtual #213                // Method doExchange:(Lext/mods/gameserver/model/trade/TradeList;)V
       131: goto          177
       134: aload_0
       135: aload_0
       136: getfield      #29                 // Field _partner:Lext/mods/gameserver/model/actor/Player;
       139: iconst_0
       140: invokevirtual #209                // Method validate:(Lext/mods/gameserver/model/actor/Player;Z)Z
       143: ifeq          158
       146: aload_1
       147: aload_0
       148: getfield      #22                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       151: iconst_0
       152: invokevirtual #209                // Method validate:(Lext/mods/gameserver/model/actor/Player;Z)Z
       155: ifne          166
       158: aload_0
       159: getfield      #22                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       162: invokevirtual #194                // Method ext/mods/gameserver/model/actor/Player.cancelActiveTrade:()V
       165: return
       166: aload_0
       167: getfield      #29                 // Field _partner:Lext/mods/gameserver/model/actor/Player;
       170: aload_0
       171: getfield      #22                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       174: invokevirtual #217                // Method ext/mods/gameserver/model/actor/Player.onTradeConfirm:(Lext/mods/gameserver/model/actor/Player;)V
       177: return
      LineNumberTable:
        line 282: 0
        line 283: 14
        line 285: 15
        line 287: 22
        line 288: 29
        line 291: 30
        line 292: 38
        line 294: 42
        line 295: 49
        line 298: 50
        line 299: 62
        line 301: 63
        line 303: 70
        line 305: 94
        line 307: 118
        line 308: 125
        line 311: 126
        line 316: 134
        line 318: 158
        line 319: 165
        line 322: 166
        line 324: 177
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     178     0  this   Lext/mods/gameserver/model/trade/TradeList;
           38     140     1 partnerList   Lext/mods/gameserver/model/trade/TradeList;
      StackMapTable: number_of_entries = 11
        frame_type = 14 /* same */
        frame_type = 0 /* same */
        frame_type = 14 /* same */
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/trade/TradeList ]
        frame_type = 12 /* same */
        frame_type = 54 /* same */
        frame_type = 7 /* same */
        frame_type = 7 /* same */
        frame_type = 23 /* same */
        frame_type = 7 /* same */
        frame_type = 10 /* same */

  public boolean privateStoreBuy(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.trade.ItemRequest[]);
    descriptor: (Lext/mods/gameserver/model/actor/Player;[Lext/mods/gameserver/model/trade/ItemRequest;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=16, args_size=3
         0: aload_0
         1: invokevirtual #78                 // Method isConfirmed:()Z
         4: ifne          14
         7: aload_0
         8: invokevirtual #81                 // Method isLocked:()Z
        11: ifeq          16
        14: iconst_0
        15: ireturn
        16: aload_0
        17: aload_1
        18: iconst_0
        19: invokevirtual #209                // Method validate:(Lext/mods/gameserver/model/actor/Player;Z)Z
        22: ifne          27
        25: iconst_0
        26: ireturn
        27: iconst_0
        28: istore_3
        29: iconst_0
        30: istore        4
        32: lconst_0
        33: lstore        5
        35: aload_0
        36: getfield      #22                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
        39: invokevirtual #175                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        42: astore        7
        44: aload_1
        45: invokevirtual #175                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        48: astore        8
        50: aload_2
        51: astore        9
        53: aload         9
        55: arraylength
        56: istore        10
        58: iconst_0
        59: istore        11
        61: iload         11
        63: iload         10
        65: if_icmpge     287
        68: aload         9
        70: iload         11
        72: aaload
        73: astore        12
        75: aload         12
        77: invokevirtual #282                // Method ext/mods/gameserver/model/trade/ItemRequest.getCount:()I
        80: iconst_1
        81: if_icmpge     86
        84: iconst_0
        85: ireturn
        86: aload_0
        87: invokevirtual #54                 // Method stream:()Ljava/util/stream/Stream;
        90: aload         12
        92: invokedynamic #285,  0            // InvokeDynamic #4:test:(Lext/mods/gameserver/model/trade/ItemRequest;)Ljava/util/function/Predicate;
        97: invokeinterface #288,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
       102: invokeinterface #292,  1          // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
       107: aconst_null
       108: invokevirtual #296                // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
       111: checkcast     #125                // class ext/mods/gameserver/model/trade/TradeItem
       114: astore        13
       116: aload         13
       118: ifnonnull     123
       121: iconst_0
       122: ireturn
       123: invokestatic  #142                // Method ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
       126: aload         13
       128: invokevirtual #181                // Method ext/mods/gameserver/model/trade/TradeItem.getItemId:()I
       131: invokevirtual #147                // Method ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
       134: astore        14
       136: aload         14
       138: ifnonnull     143
       141: iconst_0
       142: ireturn
       143: aload_0
       144: getfield      #22                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       147: aload         12
       149: invokevirtual #301                // Method ext/mods/gameserver/model/trade/ItemRequest.getObjectId:()I
       152: aload         12
       154: invokevirtual #282                // Method ext/mods/gameserver/model/trade/ItemRequest.getCount:()I
       157: invokevirtual #302                // Method ext/mods/gameserver/model/actor/Player.checkItemManipulation:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
       160: astore        15
       162: aload         15
       164: ifnull        175
       167: aload         15
       169: invokevirtual #96                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.isTradable:()Z
       172: ifne          177
       175: iconst_0
       176: ireturn
       177: ldc           #111                // int 2147483647
       179: aload         12
       181: invokevirtual #282                // Method ext/mods/gameserver/model/trade/ItemRequest.getCount:()I
       184: idiv
       185: aload         12
       187: invokevirtual #306                // Method ext/mods/gameserver/model/trade/ItemRequest.getPrice:()I
       190: if_icmpge     195
       193: iconst_0
       194: ireturn
       195: lload         5
       197: aload         12
       199: invokevirtual #282                // Method ext/mods/gameserver/model/trade/ItemRequest.getCount:()I
       202: aload         12
       204: invokevirtual #306                // Method ext/mods/gameserver/model/trade/ItemRequest.getPrice:()I
       207: imul
       208: i2l
       209: ladd
       210: lstore        5
       212: ldc2_w        #309                // long 2147483647l
       215: lload         5
       217: lcmp
       218: iflt          228
       221: lload         5
       223: lconst_0
       224: lcmp
       225: ifge          230
       228: iconst_0
       229: ireturn
       230: iload         4
       232: aload         12
       234: invokevirtual #282                // Method ext/mods/gameserver/model/trade/ItemRequest.getCount:()I
       237: aload         14
       239: invokevirtual #311                // Method ext/mods/gameserver/model/item/kind/Item.getWeight:()I
       242: imul
       243: iadd
       244: istore        4
       246: aload         14
       248: invokevirtual #155                // Method ext/mods/gameserver/model/item/kind/Item.isStackable:()Z
       251: ifne          265
       254: iload_3
       255: aload         12
       257: invokevirtual #282                // Method ext/mods/gameserver/model/trade/ItemRequest.getCount:()I
       260: iadd
       261: istore_3
       262: goto          281
       265: aload         8
       267: aload         12
       269: invokevirtual #314                // Method ext/mods/gameserver/model/trade/ItemRequest.getItemId:()I
       272: invokevirtual #182                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
       275: ifnonnull     281
       278: iinc          3, 1
       281: iinc          11, 1
       284: goto          61
       287: lload         5
       289: aload         8
       291: invokevirtual #315                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getAdena:()I
       294: i2l
       295: lcmp
       296: ifle          308
       299: aload_1
       300: getstatic     #318                // Field ext/mods/gameserver/network/SystemMessageId.YOU_NOT_ENOUGH_ADENA:Lext/mods/gameserver/network/SystemMessageId;
       303: invokevirtual #259                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       306: iconst_0
       307: ireturn
       308: aload         8
       310: iload         4
       312: invokevirtual #321                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.validateWeight:(I)Z
       315: ifne          327
       318: aload_1
       319: getstatic     #253                // Field ext/mods/gameserver/network/SystemMessageId.WEIGHT_LIMIT_EXCEEDED:Lext/mods/gameserver/network/SystemMessageId;
       322: invokevirtual #259                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       325: iconst_0
       326: ireturn
       327: aload         8
       329: iload_3
       330: invokevirtual #325                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.validateCapacity:(I)Z
       333: ifne          345
       336: aload_1
       337: getstatic     #266                // Field ext/mods/gameserver/network/SystemMessageId.SLOTS_FULL:Lext/mods/gameserver/network/SystemMessageId;
       340: invokevirtual #259                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       343: iconst_0
       344: ireturn
       345: aload_2
       346: astore        9
       348: aload         9
       350: arraylength
       351: istore        10
       353: iconst_0
       354: istore        11
       356: iload         11
       358: iload         10
       360: if_icmpge     656
       363: aload         9
       365: iload         11
       367: aaload
       368: astore        12
       370: aload         7
       372: aload         12
       374: invokevirtual #301                // Method ext/mods/gameserver/model/trade/ItemRequest.getObjectId:()I
       377: aload         12
       379: invokevirtual #282                // Method ext/mods/gameserver/model/trade/ItemRequest.getCount:()I
       382: aload_1
       383: invokevirtual #328                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.transferItem:(IILext/mods/gameserver/model/actor/Playable;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       386: astore        13
       388: aload         13
       390: ifnonnull     413
       393: lload         5
       395: aload         12
       397: invokevirtual #282                // Method ext/mods/gameserver/model/trade/ItemRequest.getCount:()I
       400: aload         12
       402: invokevirtual #306                // Method ext/mods/gameserver/model/trade/ItemRequest.getPrice:()I
       405: imul
       406: i2l
       407: lsub
       408: lstore        5
       410: goto          650
       413: aload_0
       414: aload         12
       416: invokevirtual #301                // Method ext/mods/gameserver/model/trade/ItemRequest.getObjectId:()I
       419: iconst_m1
       420: aload         12
       422: invokevirtual #282                // Method ext/mods/gameserver/model/trade/ItemRequest.getCount:()I
       425: invokevirtual #332                // Method removeItem:(III)V
       428: aload         13
       430: invokevirtual #106                // Method ext/mods/gameserver/model/item/instance/ItemInstance.isStackable:()Z
       433: ifeq          511
       436: aload_0
       437: getfield      #22                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       440: getstatic     #336                // Field ext/mods/gameserver/network/SystemMessageId.S1_PURCHASED_S3_S2_S:Lext/mods/gameserver/network/SystemMessageId;
       443: invokestatic  #339                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       446: aload_1
       447: invokevirtual #345                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       450: invokevirtual #349                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       453: aload         13
       455: invokevirtual #353                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       458: invokevirtual #354                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       461: aload         12
       463: invokevirtual #282                // Method ext/mods/gameserver/model/trade/ItemRequest.getCount:()I
       466: invokevirtual #358                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       469: invokevirtual #361                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       472: aload_1
       473: getstatic     #364                // Field ext/mods/gameserver/network/SystemMessageId.PURCHASED_S3_S2_S_FROM_S1:Lext/mods/gameserver/network/SystemMessageId;
       476: invokestatic  #339                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       479: aload_0
       480: getfield      #22                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       483: invokevirtual #345                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       486: invokevirtual #349                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       489: aload         13
       491: invokevirtual #353                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       494: invokevirtual #354                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       497: aload         12
       499: invokevirtual #282                // Method ext/mods/gameserver/model/trade/ItemRequest.getCount:()I
       502: invokevirtual #358                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       505: invokevirtual #361                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       508: goto          650
       511: aload         13
       513: invokevirtual #367                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
       516: ifle          594
       519: aload_0
       520: getfield      #22                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       523: getstatic     #370                // Field ext/mods/gameserver/network/SystemMessageId.S1_PURCHASED_S2_S3:Lext/mods/gameserver/network/SystemMessageId;
       526: invokestatic  #339                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       529: aload_1
       530: invokevirtual #345                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       533: invokevirtual #349                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       536: aload         13
       538: invokevirtual #367                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
       541: invokevirtual #358                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       544: aload         13
       546: invokevirtual #353                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       549: invokevirtual #354                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       552: invokevirtual #361                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       555: aload_1
       556: getstatic     #373                // Field ext/mods/gameserver/network/SystemMessageId.PURCHASED_S2_S3_FROM_S1:Lext/mods/gameserver/network/SystemMessageId;
       559: invokestatic  #339                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       562: aload_0
       563: getfield      #22                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       566: invokevirtual #345                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       569: invokevirtual #349                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       572: aload         13
       574: invokevirtual #367                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
       577: invokevirtual #358                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       580: aload         13
       582: invokevirtual #353                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       585: invokevirtual #354                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       588: invokevirtual #361                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       591: goto          650
       594: aload_0
       595: getfield      #22                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       598: getstatic     #376                // Field ext/mods/gameserver/network/SystemMessageId.S1_PURCHASED_S2:Lext/mods/gameserver/network/SystemMessageId;
       601: invokestatic  #339                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       604: aload_1
       605: invokevirtual #345                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       608: invokevirtual #349                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       611: aload         13
       613: invokevirtual #353                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       616: invokevirtual #354                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       619: invokevirtual #361                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       622: aload_1
       623: getstatic     #379                // Field ext/mods/gameserver/network/SystemMessageId.PURCHASED_S2_FROM_S1:Lext/mods/gameserver/network/SystemMessageId;
       626: invokestatic  #339                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       629: aload_0
       630: getfield      #22                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       633: invokevirtual #345                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       636: invokevirtual #349                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       639: aload         13
       641: invokevirtual #353                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       644: invokevirtual #354                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       647: invokevirtual #361                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       650: iinc          11, 1
       653: goto          356
       656: lload         5
       658: lconst_0
       659: lcmp
       660: ifle          680
       663: aload         8
       665: lload         5
       667: l2i
       668: invokevirtual #382                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.reduceAdena:(I)Z
       671: pop
       672: aload         7
       674: lload         5
       676: l2i
       677: invokevirtual #385                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.addAdena:(I)V
       680: iconst_1
       681: ireturn
      LineNumberTable:
        line 400: 0
        line 401: 14
        line 403: 16
        line 404: 25
        line 406: 27
        line 407: 29
        line 408: 32
        line 410: 35
        line 411: 44
        line 413: 50
        line 415: 75
        line 416: 84
        line 418: 86
        line 419: 116
        line 420: 121
        line 422: 123
        line 423: 136
        line 424: 141
        line 426: 143
        line 427: 162
        line 428: 175
        line 430: 177
        line 431: 193
        line 433: 195
        line 435: 212
        line 436: 228
        line 438: 230
        line 440: 246
        line 441: 254
        line 442: 265
        line 443: 278
        line 413: 281
        line 446: 287
        line 448: 299
        line 449: 306
        line 452: 308
        line 454: 318
        line 455: 325
        line 458: 327
        line 460: 336
        line 461: 343
        line 464: 345
        line 466: 370
        line 467: 388
        line 469: 393
        line 470: 410
        line 473: 413
        line 475: 428
        line 477: 436
        line 478: 472
        line 480: 511
        line 482: 519
        line 483: 555
        line 487: 594
        line 488: 622
        line 464: 650
        line 492: 656
        line 494: 663
        line 495: 672
        line 498: 680
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          116     165    13 tradeItem   Lext/mods/gameserver/model/trade/TradeItem;
          136     145    14 template   Lext/mods/gameserver/model/item/kind/Item;
          162     119    15 oldItem   Lext/mods/gameserver/model/item/instance/ItemInstance;
           75     206    12  item   Lext/mods/gameserver/model/trade/ItemRequest;
          388     262    13 newItem   Lext/mods/gameserver/model/item/instance/ItemInstance;
          370     280    12  item   Lext/mods/gameserver/model/trade/ItemRequest;
            0     682     0  this   Lext/mods/gameserver/model/trade/TradeList;
            0     682     1 player   Lext/mods/gameserver/model/actor/Player;
            0     682     2 items   [Lext/mods/gameserver/model/trade/ItemRequest;
           29     653     3 totalSlots   I
           32     650     4 totalWeight   I
           35     647     5 totalPrice   J
           44     638     7 ownerInventory   Lext/mods/gameserver/model/itemcontainer/PcInventory;
           50     632     8 playerInventory   Lext/mods/gameserver/model/itemcontainer/PcInventory;
      StackMapTable: number_of_entries = 25
        frame_type = 14 /* same */
        frame_type = 1 /* same */
        frame_type = 10 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 33
          locals = [ class ext/mods/gameserver/model/trade/TradeList, class ext/mods/gameserver/model/actor/Player, class "[Lext/mods/gameserver/model/trade/ItemRequest;", int, int, long, class ext/mods/gameserver/model/itemcontainer/PcInventory, class ext/mods/gameserver/model/itemcontainer/PcInventory, class "[Lext/mods/gameserver/model/trade/ItemRequest;", int, int ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ class ext/mods/gameserver/model/trade/ItemRequest ]
        frame_type = 252 /* append */
          offset_delta = 36
          locals = [ class ext/mods/gameserver/model/trade/TradeItem ]
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/item/kind/Item ]
        frame_type = 252 /* append */
          offset_delta = 31
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 1 /* same */
        frame_type = 17 /* same */
        frame_type = 32 /* same */
        frame_type = 1 /* same */
        frame_type = 34 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/model/trade/TradeList, class ext/mods/gameserver/model/actor/Player, class "[Lext/mods/gameserver/model/trade/ItemRequest;", int, int, long, class ext/mods/gameserver/model/itemcontainer/PcInventory, class ext/mods/gameserver/model/itemcontainer/PcInventory, class "[Lext/mods/gameserver/model/trade/ItemRequest;", int, int ]
          stack = []
        frame_type = 248 /* chop */
          offset_delta = 5
        frame_type = 20 /* same */
        frame_type = 18 /* same */
        frame_type = 17 /* same */
        frame_type = 254 /* append */
          offset_delta = 10
          locals = [ class "[Lext/mods/gameserver/model/trade/ItemRequest;", int, int ]
        frame_type = 253 /* append */
          offset_delta = 56
          locals = [ class ext/mods/gameserver/model/trade/ItemRequest, class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 97
        frame_type = 251 /* same_frame_extended */
          offset_delta = 82
        frame_type = 249 /* chop */
          offset_delta = 55
        frame_type = 248 /* chop */
          offset_delta = 5
        frame_type = 23 /* same */

  public boolean privateStoreSell(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.trade.ItemRequest[]);
    descriptor: (Lext/mods/gameserver/model/actor/Player;[Lext/mods/gameserver/model/trade/ItemRequest;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=13, args_size=3
         0: aload_0
         1: invokevirtual #78                 // Method isConfirmed:()Z
         4: ifne          14
         7: aload_0
         8: invokevirtual #81                 // Method isLocked:()Z
        11: ifeq          16
        14: iconst_0
        15: ireturn
        16: aload_0
        17: aload_1
        18: iconst_0
        19: invokevirtual #209                // Method validate:(Lext/mods/gameserver/model/actor/Player;Z)Z
        22: ifne          27
        25: iconst_0
        26: ireturn
        27: aload_0
        28: getfield      #22                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
        31: invokevirtual #175                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        34: astore_3
        35: aload_1
        36: invokevirtual #175                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        39: astore        4
        41: lconst_0
        42: lstore        5
        44: aload_2
        45: astore        7
        47: aload         7
        49: arraylength
        50: istore        8
        52: iconst_0
        53: istore        9
        55: iload         9
        57: iload         8
        59: if_icmpge     237
        62: aload         7
        64: iload         9
        66: aaload
        67: astore        10
        69: aload         10
        71: invokevirtual #282                // Method ext/mods/gameserver/model/trade/ItemRequest.getCount:()I
        74: iconst_1
        75: if_icmpge     80
        78: iconst_0
        79: ireturn
        80: invokestatic  #142                // Method ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
        83: aload         10
        85: invokevirtual #314                // Method ext/mods/gameserver/model/trade/ItemRequest.getItemId:()I
        88: invokevirtual #147                // Method ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
        91: astore        11
        93: aload         11
        95: ifnonnull     100
        98: iconst_0
        99: ireturn
       100: aload_0
       101: invokevirtual #54                 // Method stream:()Ljava/util/stream/Stream;
       104: aload         10
       106: invokedynamic #388,  0            // InvokeDynamic #5:test:(Lext/mods/gameserver/model/trade/ItemRequest;)Ljava/util/function/Predicate;
       111: invokeinterface #389,  2          // InterfaceMethod java/util/stream/Stream.noneMatch:(Ljava/util/function/Predicate;)Z
       116: ifeq          121
       119: iconst_0
       120: ireturn
       121: aload_1
       122: aload         10
       124: invokevirtual #301                // Method ext/mods/gameserver/model/trade/ItemRequest.getObjectId:()I
       127: aload         10
       129: invokevirtual #282                // Method ext/mods/gameserver/model/trade/ItemRequest.getCount:()I
       132: invokevirtual #302                // Method ext/mods/gameserver/model/actor/Player.checkItemManipulation:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
       135: astore        12
       137: aload         12
       139: ifnull        176
       142: aload         12
       144: invokevirtual #96                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.isTradable:()Z
       147: ifeq          176
       150: aload         12
       152: invokevirtual #353                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       155: aload         10
       157: invokevirtual #314                // Method ext/mods/gameserver/model/trade/ItemRequest.getItemId:()I
       160: if_icmpne     176
       163: aload         12
       165: invokevirtual #367                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
       168: aload         10
       170: invokevirtual #392                // Method ext/mods/gameserver/model/trade/ItemRequest.getEnchant:()I
       173: if_icmpeq     178
       176: iconst_0
       177: ireturn
       178: ldc           #111                // int 2147483647
       180: aload         10
       182: invokevirtual #282                // Method ext/mods/gameserver/model/trade/ItemRequest.getCount:()I
       185: idiv
       186: aload         10
       188: invokevirtual #306                // Method ext/mods/gameserver/model/trade/ItemRequest.getPrice:()I
       191: if_icmpge     196
       194: iconst_0
       195: ireturn
       196: lload         5
       198: aload         10
       200: invokevirtual #282                // Method ext/mods/gameserver/model/trade/ItemRequest.getCount:()I
       203: aload         10
       205: invokevirtual #306                // Method ext/mods/gameserver/model/trade/ItemRequest.getPrice:()I
       208: imul
       209: i2l
       210: ladd
       211: lstore        5
       213: ldc2_w        #309                // long 2147483647l
       216: lload         5
       218: lcmp
       219: iflt          229
       222: lload         5
       224: lconst_0
       225: lcmp
       226: ifge          231
       229: iconst_0
       230: ireturn
       231: iinc          9, 1
       234: goto          55
       237: lload         5
       239: aload_3
       240: invokevirtual #315                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getAdena:()I
       243: i2l
       244: lcmp
       245: ifle          257
       248: aload_1
       249: getstatic     #318                // Field ext/mods/gameserver/network/SystemMessageId.YOU_NOT_ENOUGH_ADENA:Lext/mods/gameserver/network/SystemMessageId;
       252: invokevirtual #259                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       255: iconst_0
       256: ireturn
       257: aload_2
       258: astore        7
       260: aload         7
       262: arraylength
       263: istore        8
       265: iconst_0
       266: istore        9
       268: iload         9
       270: iload         8
       272: if_icmpge     571
       275: aload         7
       277: iload         9
       279: aaload
       280: astore        10
       282: aload         4
       284: aload         10
       286: invokevirtual #301                // Method ext/mods/gameserver/model/trade/ItemRequest.getObjectId:()I
       289: aload         10
       291: invokevirtual #282                // Method ext/mods/gameserver/model/trade/ItemRequest.getCount:()I
       294: aload_0
       295: getfield      #22                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       298: invokevirtual #328                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.transferItem:(IILext/mods/gameserver/model/actor/Playable;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       301: astore        11
       303: aload         11
       305: ifnonnull     328
       308: lload         5
       310: aload         10
       312: invokevirtual #282                // Method ext/mods/gameserver/model/trade/ItemRequest.getCount:()I
       315: aload         10
       317: invokevirtual #306                // Method ext/mods/gameserver/model/trade/ItemRequest.getPrice:()I
       320: imul
       321: i2l
       322: lsub
       323: lstore        5
       325: goto          565
       328: aload_0
       329: iconst_m1
       330: aload         10
       332: invokevirtual #314                // Method ext/mods/gameserver/model/trade/ItemRequest.getItemId:()I
       335: aload         10
       337: invokevirtual #282                // Method ext/mods/gameserver/model/trade/ItemRequest.getCount:()I
       340: invokevirtual #332                // Method removeItem:(III)V
       343: aload         11
       345: invokevirtual #106                // Method ext/mods/gameserver/model/item/instance/ItemInstance.isStackable:()Z
       348: ifeq          426
       351: aload_0
       352: getfield      #22                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       355: getstatic     #364                // Field ext/mods/gameserver/network/SystemMessageId.PURCHASED_S3_S2_S_FROM_S1:Lext/mods/gameserver/network/SystemMessageId;
       358: invokestatic  #339                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       361: aload_1
       362: invokevirtual #345                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       365: invokevirtual #349                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       368: aload         11
       370: invokevirtual #353                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       373: invokevirtual #354                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       376: aload         10
       378: invokevirtual #282                // Method ext/mods/gameserver/model/trade/ItemRequest.getCount:()I
       381: invokevirtual #358                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       384: invokevirtual #361                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       387: aload_1
       388: getstatic     #336                // Field ext/mods/gameserver/network/SystemMessageId.S1_PURCHASED_S3_S2_S:Lext/mods/gameserver/network/SystemMessageId;
       391: invokestatic  #339                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       394: aload_0
       395: getfield      #22                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       398: invokevirtual #345                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       401: invokevirtual #349                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       404: aload         11
       406: invokevirtual #353                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       409: invokevirtual #354                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       412: aload         10
       414: invokevirtual #282                // Method ext/mods/gameserver/model/trade/ItemRequest.getCount:()I
       417: invokevirtual #358                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       420: invokevirtual #361                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       423: goto          565
       426: aload         11
       428: invokevirtual #367                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
       431: ifle          509
       434: aload_0
       435: getfield      #22                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       438: getstatic     #373                // Field ext/mods/gameserver/network/SystemMessageId.PURCHASED_S2_S3_FROM_S1:Lext/mods/gameserver/network/SystemMessageId;
       441: invokestatic  #339                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       444: aload_1
       445: invokevirtual #345                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       448: invokevirtual #349                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       451: aload         11
       453: invokevirtual #367                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
       456: invokevirtual #358                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       459: aload         11
       461: invokevirtual #353                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       464: invokevirtual #354                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       467: invokevirtual #361                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       470: aload_1
       471: getstatic     #370                // Field ext/mods/gameserver/network/SystemMessageId.S1_PURCHASED_S2_S3:Lext/mods/gameserver/network/SystemMessageId;
       474: invokestatic  #339                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       477: aload_0
       478: getfield      #22                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       481: invokevirtual #345                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       484: invokevirtual #349                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       487: aload         11
       489: invokevirtual #367                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
       492: invokevirtual #358                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       495: aload         11
       497: invokevirtual #353                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       500: invokevirtual #354                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       503: invokevirtual #361                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       506: goto          565
       509: aload_0
       510: getfield      #22                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       513: getstatic     #379                // Field ext/mods/gameserver/network/SystemMessageId.PURCHASED_S2_FROM_S1:Lext/mods/gameserver/network/SystemMessageId;
       516: invokestatic  #339                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       519: aload_1
       520: invokevirtual #345                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       523: invokevirtual #349                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       526: aload         11
       528: invokevirtual #353                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       531: invokevirtual #354                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       534: invokevirtual #361                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       537: aload_1
       538: getstatic     #376                // Field ext/mods/gameserver/network/SystemMessageId.S1_PURCHASED_S2:Lext/mods/gameserver/network/SystemMessageId;
       541: invokestatic  #339                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       544: aload_0
       545: getfield      #22                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       548: invokevirtual #345                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       551: invokevirtual #349                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       554: aload         11
       556: invokevirtual #353                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       559: invokevirtual #354                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       562: invokevirtual #361                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       565: iinc          9, 1
       568: goto          268
       571: lload         5
       573: lconst_0
       574: lcmp
       575: ifle          594
       578: aload_3
       579: lload         5
       581: l2i
       582: invokevirtual #382                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.reduceAdena:(I)Z
       585: pop
       586: aload         4
       588: lload         5
       590: l2i
       591: invokevirtual #385                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.addAdena:(I)V
       594: iconst_1
       595: ireturn
      LineNumberTable:
        line 509: 0
        line 510: 14
        line 512: 16
        line 513: 25
        line 515: 27
        line 516: 35
        line 518: 41
        line 520: 44
        line 522: 69
        line 523: 78
        line 525: 80
        line 526: 93
        line 527: 98
        line 529: 100
        line 530: 119
        line 532: 121
        line 533: 137
        line 534: 176
        line 536: 178
        line 537: 194
        line 539: 196
        line 541: 213
        line 542: 229
        line 520: 231
        line 545: 237
        line 547: 248
        line 548: 255
        line 551: 257
        line 553: 282
        line 554: 303
        line 556: 308
        line 557: 325
        line 560: 328
        line 562: 343
        line 564: 351
        line 565: 387
        line 567: 426
        line 569: 434
        line 570: 470
        line 574: 509
        line 575: 537
        line 551: 565
        line 579: 571
        line 581: 578
        line 582: 586
        line 585: 594
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           93     138    11 template   Lext/mods/gameserver/model/item/kind/Item;
          137      94    12 oldItem   Lext/mods/gameserver/model/item/instance/ItemInstance;
           69     162    10  item   Lext/mods/gameserver/model/trade/ItemRequest;
          303     262    11 newItem   Lext/mods/gameserver/model/item/instance/ItemInstance;
          282     283    10  item   Lext/mods/gameserver/model/trade/ItemRequest;
            0     596     0  this   Lext/mods/gameserver/model/trade/TradeList;
            0     596     1 player   Lext/mods/gameserver/model/actor/Player;
            0     596     2 items   [Lext/mods/gameserver/model/trade/ItemRequest;
           35     561     3 ownerInventory   Lext/mods/gameserver/model/itemcontainer/PcInventory;
           41     555     4 playerInventory   Lext/mods/gameserver/model/itemcontainer/PcInventory;
           44     552     5 totalPrice   J
      StackMapTable: number_of_entries = 21
        frame_type = 14 /* same */
        frame_type = 1 /* same */
        frame_type = 10 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 27
          locals = [ class ext/mods/gameserver/model/trade/TradeList, class ext/mods/gameserver/model/actor/Player, class "[Lext/mods/gameserver/model/trade/ItemRequest;", class ext/mods/gameserver/model/itemcontainer/PcInventory, class ext/mods/gameserver/model/itemcontainer/PcInventory, long, class "[Lext/mods/gameserver/model/trade/ItemRequest;", int, int ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ class ext/mods/gameserver/model/trade/ItemRequest ]
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/item/kind/Item ]
        frame_type = 20 /* same */
        frame_type = 252 /* append */
          offset_delta = 54
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 1 /* same */
        frame_type = 17 /* same */
        frame_type = 32 /* same */
        frame_type = 248 /* chop */
          offset_delta = 1
        frame_type = 248 /* chop */
          offset_delta = 5
        frame_type = 19 /* same */
        frame_type = 254 /* append */
          offset_delta = 10
          locals = [ class "[Lext/mods/gameserver/model/trade/ItemRequest;", int, int ]
        frame_type = 253 /* append */
          offset_delta = 59
          locals = [ class ext/mods/gameserver/model/trade/ItemRequest, class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 97
        frame_type = 251 /* same_frame_extended */
          offset_delta = 82
        frame_type = 249 /* chop */
          offset_delta = 55
        frame_type = 248 /* chop */
          offset_delta = 5
        frame_type = 22 /* same */
}
Signature: #479                         // Ljava/util/concurrent/CopyOnWriteArrayList<Lext/mods/gameserver/model/trade/TradeItem;>;
SourceFile: "TradeList.java"
BootstrapMethods:
  0: #507 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #483 TradeList [owner=\u0001, partner=\u0001, title=\u0001, isPackaged=\u0001, isConfirmed=\u0001, isLocked=\u0001]
  1: #513 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #485 (Ljava/lang/Object;)V
      #487 REF_invokeVirtual ext/mods/gameserver/model/itemcontainer/PcInventory.adjustAvailableItem:(Lext/mods/gameserver/model/trade/TradeItem;)V
      #492 (Lext/mods/gameserver/model/trade/TradeItem;)V
  2: #513 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #493 (Ljava/lang/Object;)Z
      #494 REF_invokeVirtual ext/mods/gameserver/model/trade/TradeList.lambda$validate$0:(Lext/mods/gameserver/model/trade/TradeItem;)Z
      #497 (Lext/mods/gameserver/model/trade/TradeItem;)Z
  3: #513 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #485 (Ljava/lang/Object;)V
      #498 REF_invokeVirtual ext/mods/gameserver/model/trade/TradeList.lambda$transferItems$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/trade/TradeItem;)V
      #492 (Lext/mods/gameserver/model/trade/TradeItem;)V
  4: #513 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #493 (Ljava/lang/Object;)Z
      #501 REF_invokeStatic ext/mods/gameserver/model/trade/TradeList.lambda$privateStoreBuy$0:(Lext/mods/gameserver/model/trade/ItemRequest;Lext/mods/gameserver/model/trade/TradeItem;)Z
      #497 (Lext/mods/gameserver/model/trade/TradeItem;)Z
  5: #513 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #493 (Ljava/lang/Object;)Z
      #504 REF_invokeStatic ext/mods/gameserver/model/trade/TradeList.lambda$privateStoreSell$0:(Lext/mods/gameserver/model/trade/ItemRequest;Lext/mods/gameserver/model/trade/TradeItem;)Z
      #497 (Lext/mods/gameserver/model/trade/TradeItem;)Z
InnerClasses:
  public static final #525= #521 of #523; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
