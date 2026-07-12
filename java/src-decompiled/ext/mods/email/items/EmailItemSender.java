// Bytecode for: ext.mods.email.items.EmailItemSender
// File: ext\mods\email\items\EmailItemSender.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/email/items/EmailItemSender.class
  Last modified 9 de jul de 2026; size 7874 bytes
  MD5 checksum 497c3bbe7eddf8bd61b1cfb4741cff21
  Compiled from "EmailItemSender.java"
public class ext.mods.email.items.EmailItemSender
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #45                         // ext/mods/email/items/EmailItemSender
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 5, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/model/actor/Player.getSelectedEmailTarget:()Ljava/lang/String;
    #8 = Class              #10           // ext/mods/gameserver/model/actor/Player
    #9 = NameAndType        #11:#12       // getSelectedEmailTarget:()Ljava/lang/String;
   #10 = Utf8               ext/mods/gameserver/model/actor/Player
   #11 = Utf8               getSelectedEmailTarget
   #12 = Utf8               ()Ljava/lang/String;
   #13 = Methodref          #14.#15       // ext/mods/util/Tokenizer.getAsString:(I)Ljava/lang/String;
   #14 = Class              #16           // ext/mods/util/Tokenizer
   #15 = NameAndType        #17:#18       // getAsString:(I)Ljava/lang/String;
   #16 = Utf8               ext/mods/util/Tokenizer
   #17 = Utf8               getAsString
   #18 = Utf8               (I)Ljava/lang/String;
   #19 = Methodref          #14.#20       // ext/mods/util/Tokenizer.getAsInteger:(II)I
   #20 = NameAndType        #21:#22       // getAsInteger:(II)I
   #21 = Utf8               getAsInteger
   #22 = Utf8               (II)I
   #23 = Methodref          #8.#24        // ext/mods/gameserver/model/actor/Player.getSelectedEmailDuration:()Ljava/lang/String;
   #24 = NameAndType        #25:#12       // getSelectedEmailDuration:()Ljava/lang/String;
   #25 = Utf8               getSelectedEmailDuration
   #26 = String             #27           // Você deve selecionar um jogador antes de enviar.
   #27 = Utf8               Você deve selecionar um jogador antes de enviar.
   #28 = Methodref          #8.#29        // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #29 = NameAndType        #30:#31       // sendMessage:(Ljava/lang/String;)V
   #30 = Utf8               sendMessage
   #31 = Utf8               (Ljava/lang/String;)V
   #32 = Methodref          #33.#34       // ext/mods/Crypta/PlayerEmailManager.getInstance:()Lext/mods/Crypta/PlayerEmailManager;
   #33 = Class              #35           // ext/mods/Crypta/PlayerEmailManager
   #34 = NameAndType        #36:#37       // getInstance:()Lext/mods/Crypta/PlayerEmailManager;
   #35 = Utf8               ext/mods/Crypta/PlayerEmailManager
   #36 = Utf8               getInstance
   #37 = Utf8               ()Lext/mods/Crypta/PlayerEmailManager;
   #38 = String             #39           // email_main.htm
   #39 = Utf8               email_main.htm
   #40 = Methodref          #33.#41       // ext/mods/Crypta/PlayerEmailManager.navi:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #41 = NameAndType        #42:#43       // navi:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #42 = Utf8               navi
   #43 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #44 = Methodref          #45.#46       // ext/mods/email/items/EmailItemSender.getTargetObjectId:(Ljava/lang/String;)Ljava/lang/Integer;
   #45 = Class              #47           // ext/mods/email/items/EmailItemSender
   #46 = NameAndType        #48:#49       // getTargetObjectId:(Ljava/lang/String;)Ljava/lang/Integer;
   #47 = Utf8               ext/mods/email/items/EmailItemSender
   #48 = Utf8               getTargetObjectId
   #49 = Utf8               (Ljava/lang/String;)Ljava/lang/Integer;
   #50 = InvokeDynamic      #0:#51        // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #51 = NameAndType        #52:#53       // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #52 = Utf8               makeConcatWithConstants
   #53 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #54 = String             #55           // sim
   #55 = Utf8               sim
   #56 = Methodref          #57.#58       // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
   #57 = Class              #59           // java/lang/String
   #58 = NameAndType        #60:#61       // equalsIgnoreCase:(Ljava/lang/String;)Z
   #59 = Utf8               java/lang/String
   #60 = Utf8               equalsIgnoreCase
   #61 = Utf8               (Ljava/lang/String;)Z
   #62 = Methodref          #45.#63       // ext/mods/email/items/EmailItemSender.parsePaymentItemId:(Ljava/lang/String;)I
   #63 = NameAndType        #64:#65       // parsePaymentItemId:(Ljava/lang/String;)I
   #64 = Utf8               parsePaymentItemId
   #65 = Utf8               (Ljava/lang/String;)I
   #66 = String             #67           // Você marcou como pago, mas não selecionou um item válido de pagamento.
   #67 = Utf8               Você marcou como pago, mas não selecionou um item válido de pagamento.
   #68 = String             #69           // Você marcou como pago, mas não especificou uma quantidade válida.
   #69 = Utf8               Você marcou como pago, mas não especificou uma quantidade válida.
   #70 = Methodref          #45.#71       // ext/mods/email/items/EmailItemSender.calculateExpiration:(Ljava/lang/String;)J
   #71 = NameAndType        #72:#73       // calculateExpiration:(Ljava/lang/String;)J
   #72 = Utf8               calculateExpiration
   #73 = Utf8               (Ljava/lang/String;)J
   #74 = Methodref          #8.#75        // ext/mods/gameserver/model/actor/Player.getTempSelectedItems:()Ljava/util/Map;
   #75 = NameAndType        #76:#77       // getTempSelectedItems:()Ljava/util/Map;
   #76 = Utf8               getTempSelectedItems
   #77 = Utf8               ()Ljava/util/Map;
   #78 = InterfaceMethodref #79.#80       // java/util/Map.isEmpty:()Z
   #79 = Class              #81           // java/util/Map
   #80 = NameAndType        #82:#83       // isEmpty:()Z
   #81 = Utf8               java/util/Map
   #82 = Utf8               isEmpty
   #83 = Utf8               ()Z
   #84 = String             #85           // Nenhum item selecionado para envio.
   #85 = Utf8               Nenhum item selecionado para envio.
   #86 = Methodref          #87.#88       // ext/mods/gameserver/idfactory/IdFactory.getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
   #87 = Class              #89           // ext/mods/gameserver/idfactory/IdFactory
   #88 = NameAndType        #36:#90       // getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
   #89 = Utf8               ext/mods/gameserver/idfactory/IdFactory
   #90 = Utf8               ()Lext/mods/gameserver/idfactory/IdFactory;
   #91 = Methodref          #87.#92       // ext/mods/gameserver/idfactory/IdFactory.getNextId:()I
   #92 = NameAndType        #93:#94       // getNextId:()I
   #93 = Utf8               getNextId
   #94 = Utf8               ()I
   #95 = InterfaceMethodref #79.#96       // java/util/Map.entrySet:()Ljava/util/Set;
   #96 = NameAndType        #97:#98       // entrySet:()Ljava/util/Set;
   #97 = Utf8               entrySet
   #98 = Utf8               ()Ljava/util/Set;
   #99 = InterfaceMethodref #100.#101     // java/util/Set.iterator:()Ljava/util/Iterator;
  #100 = Class              #102          // java/util/Set
  #101 = NameAndType        #103:#104     // iterator:()Ljava/util/Iterator;
  #102 = Utf8               java/util/Set
  #103 = Utf8               iterator
  #104 = Utf8               ()Ljava/util/Iterator;
  #105 = InterfaceMethodref #106.#107     // java/util/Iterator.hasNext:()Z
  #106 = Class              #108          // java/util/Iterator
  #107 = NameAndType        #109:#83      // hasNext:()Z
  #108 = Utf8               java/util/Iterator
  #109 = Utf8               hasNext
  #110 = InterfaceMethodref #106.#111     // java/util/Iterator.next:()Ljava/lang/Object;
  #111 = NameAndType        #112:#113     // next:()Ljava/lang/Object;
  #112 = Utf8               next
  #113 = Utf8               ()Ljava/lang/Object;
  #114 = Class              #115          // java/util/Map$Entry
  #115 = Utf8               java/util/Map$Entry
  #116 = InterfaceMethodref #114.#117     // java/util/Map$Entry.getKey:()Ljava/lang/Object;
  #117 = NameAndType        #118:#113     // getKey:()Ljava/lang/Object;
  #118 = Utf8               getKey
  #119 = Class              #120          // java/lang/Integer
  #120 = Utf8               java/lang/Integer
  #121 = Methodref          #119.#122     // java/lang/Integer.intValue:()I
  #122 = NameAndType        #123:#94      // intValue:()I
  #123 = Utf8               intValue
  #124 = InterfaceMethodref #114.#125     // java/util/Map$Entry.getValue:()Ljava/lang/Object;
  #125 = NameAndType        #126:#113     // getValue:()Ljava/lang/Object;
  #126 = Utf8               getValue
  #127 = Class              #128          // java/lang/Long
  #128 = Utf8               java/lang/Long
  #129 = Methodref          #127.#130     // java/lang/Long.longValue:()J
  #130 = NameAndType        #131:#132     // longValue:()J
  #131 = Utf8               longValue
  #132 = Utf8               ()J
  #133 = Methodref          #8.#134       // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #134 = NameAndType        #135:#136     // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #135 = Utf8               getInventory
  #136 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #137 = Methodref          #138.#139     // ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #138 = Class              #140          // ext/mods/gameserver/model/itemcontainer/PcInventory
  #139 = NameAndType        #141:#142     // getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #140 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
  #141 = Utf8               getItemByObjectId
  #142 = Utf8               (I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #143 = Methodref          #144.#145     // ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
  #144 = Class              #146          // ext/mods/gameserver/model/item/instance/ItemInstance
  #145 = NameAndType        #147:#94      // getCount:()I
  #146 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #147 = Utf8               getCount
  #148 = Methodref          #138.#149     // ext/mods/gameserver/model/itemcontainer/PcInventory.destroyItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #149 = NameAndType        #150:#151     // destroyItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #150 = Utf8               destroyItem
  #151 = Utf8               (II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #152 = Methodref          #144.#153     // ext/mods/gameserver/model/item/instance/ItemInstance.setCount:(I)V
  #153 = NameAndType        #154:#155     // setCount:(I)V
  #154 = Utf8               setCount
  #155 = Utf8               (I)V
  #156 = Methodref          #8.#157       // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #157 = NameAndType        #158:#94      // getObjectId:()I
  #158 = Utf8               getObjectId
  #159 = Methodref          #160.#161     // ext/mods/email/items/EmailStorage.saveEmail:(IIILext/mods/gameserver/model/item/instance/ItemInstance;ZIIJ)V
  #160 = Class              #162          // ext/mods/email/items/EmailStorage
  #161 = NameAndType        #163:#164     // saveEmail:(IIILext/mods/gameserver/model/item/instance/ItemInstance;ZIIJ)V
  #162 = Utf8               ext/mods/email/items/EmailStorage
  #163 = Utf8               saveEmail
  #164 = Utf8               (IIILext/mods/gameserver/model/item/instance/ItemInstance;ZIIJ)V
  #165 = Methodref          #8.#166       // ext/mods/gameserver/model/actor/Player.clearTempSelectedItems:()V
  #166 = NameAndType        #167:#6       // clearTempSelectedItems:()V
  #167 = Utf8               clearTempSelectedItems
  #168 = Methodref          #8.#169       // ext/mods/gameserver/model/actor/Player.setSelectedEmailTarget:(Ljava/lang/String;)V
  #169 = NameAndType        #170:#31      // setSelectedEmailTarget:(Ljava/lang/String;)V
  #170 = Utf8               setSelectedEmailTarget
  #171 = InvokeDynamic      #1:#51        // #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #172 = Methodref          #173.#174     // ext/mods/email/task/EmailDeliveryTask.getInstance:()Lext/mods/email/task/EmailDeliveryTask;
  #173 = Class              #175          // ext/mods/email/task/EmailDeliveryTask
  #174 = NameAndType        #36:#176      // getInstance:()Lext/mods/email/task/EmailDeliveryTask;
  #175 = Utf8               ext/mods/email/task/EmailDeliveryTask
  #176 = Utf8               ()Lext/mods/email/task/EmailDeliveryTask;
  #177 = Methodref          #173.#178     // ext/mods/email/task/EmailDeliveryTask.scheduleExpiration:(Lext/mods/gameserver/model/actor/Player;IJ)V
  #178 = NameAndType        #179:#180     // scheduleExpiration:(Lext/mods/gameserver/model/actor/Player;IJ)V
  #179 = Utf8               scheduleExpiration
  #180 = Utf8               (Lext/mods/gameserver/model/actor/Player;IJ)V
  #181 = Methodref          #182.#183     // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
  #182 = Class              #184          // ext/mods/gameserver/model/World
  #183 = NameAndType        #36:#185      // getInstance:()Lext/mods/gameserver/model/World;
  #184 = Utf8               ext/mods/gameserver/model/World
  #185 = Utf8               ()Lext/mods/gameserver/model/World;
  #186 = Methodref          #182.#187     // ext/mods/gameserver/model/World.getPlayer:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
  #187 = NameAndType        #188:#189     // getPlayer:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
  #188 = Utf8               getPlayer
  #189 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
  #190 = Methodref          #8.#191       // ext/mods/gameserver/model/actor/Player.isOnline:()Z
  #191 = NameAndType        #192:#83      // isOnline:()Z
  #192 = Utf8               isOnline
  #193 = Methodref          #8.#194       // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
  #194 = NameAndType        #195:#12      // getName:()Ljava/lang/String;
  #195 = Utf8               getName
  #196 = InvokeDynamic      #2:#51        // #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #197 = String             #198          // Nenhum Email pôde ser enviado.
  #198 = Utf8               Nenhum Email pôde ser enviado.
  #199 = Methodref          #119.#200     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #200 = NameAndType        #201:#202     // valueOf:(I)Ljava/lang/Integer;
  #201 = Utf8               valueOf
  #202 = Utf8               (I)Ljava/lang/Integer;
  #203 = Methodref          #204.#205     // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
  #204 = Class              #206          // ext/mods/commons/pool/ConnectionPool
  #205 = NameAndType        #207:#208     // getConnection:()Ljava/sql/Connection;
  #206 = Utf8               ext/mods/commons/pool/ConnectionPool
  #207 = Utf8               getConnection
  #208 = Utf8               ()Ljava/sql/Connection;
  #209 = String             #210          // SELECT obj_Id FROM characters WHERE char_name = ?
  #210 = Utf8               SELECT obj_Id FROM characters WHERE char_name = ?
  #211 = InterfaceMethodref #212.#213     // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #212 = Class              #214          // java/sql/Connection
  #213 = NameAndType        #215:#216     // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #214 = Utf8               java/sql/Connection
  #215 = Utf8               prepareStatement
  #216 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #217 = InterfaceMethodref #218.#219     // java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
  #218 = Class              #220          // java/sql/PreparedStatement
  #219 = NameAndType        #221:#222     // setString:(ILjava/lang/String;)V
  #220 = Utf8               java/sql/PreparedStatement
  #221 = Utf8               setString
  #222 = Utf8               (ILjava/lang/String;)V
  #223 = InterfaceMethodref #218.#224     // java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
  #224 = NameAndType        #225:#226     // executeQuery:()Ljava/sql/ResultSet;
  #225 = Utf8               executeQuery
  #226 = Utf8               ()Ljava/sql/ResultSet;
  #227 = InterfaceMethodref #228.#229     // java/sql/ResultSet.next:()Z
  #228 = Class              #230          // java/sql/ResultSet
  #229 = NameAndType        #112:#83      // next:()Z
  #230 = Utf8               java/sql/ResultSet
  #231 = String             #232          // obj_Id
  #232 = Utf8               obj_Id
  #233 = InterfaceMethodref #228.#234     // java/sql/ResultSet.getInt:(Ljava/lang/String;)I
  #234 = NameAndType        #235:#65      // getInt:(Ljava/lang/String;)I
  #235 = Utf8               getInt
  #236 = InterfaceMethodref #228.#237     // java/sql/ResultSet.close:()V
  #237 = NameAndType        #238:#6       // close:()V
  #238 = Utf8               close
  #239 = InterfaceMethodref #218.#237     // java/sql/PreparedStatement.close:()V
  #240 = InterfaceMethodref #212.#237     // java/sql/Connection.close:()V
  #241 = Class              #242          // java/lang/Throwable
  #242 = Utf8               java/lang/Throwable
  #243 = Methodref          #241.#244     // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
  #244 = NameAndType        #245:#246     // addSuppressed:(Ljava/lang/Throwable;)V
  #245 = Utf8               addSuppressed
  #246 = Utf8               (Ljava/lang/Throwable;)V
  #247 = Class              #248          // java/lang/Exception
  #248 = Utf8               java/lang/Exception
  #249 = Methodref          #247.#250     // java/lang/Exception.printStackTrace:()V
  #250 = NameAndType        #251:#6       // printStackTrace:()V
  #251 = Utf8               printStackTrace
  #252 = Methodref          #57.#253      // java/lang/String.trim:()Ljava/lang/String;
  #253 = NameAndType        #254:#12      // trim:()Ljava/lang/String;
  #254 = Utf8               trim
  #255 = Methodref          #57.#256      // java/lang/String.toLowerCase:()Ljava/lang/String;
  #256 = NameAndType        #257:#12      // toLowerCase:()Ljava/lang/String;
  #257 = Utf8               toLowerCase
  #258 = Methodref          #57.#259      // java/lang/String.hashCode:()I
  #259 = NameAndType        #260:#94      // hashCode:()I
  #260 = Utf8               hashCode
  #261 = String             #262          // adena
  #262 = Utf8               adena
  #263 = Methodref          #57.#264      // java/lang/String.equals:(Ljava/lang/Object;)Z
  #264 = NameAndType        #265:#266     // equals:(Ljava/lang/Object;)Z
  #265 = Utf8               equals
  #266 = Utf8               (Ljava/lang/Object;)Z
  #267 = String             #268          // goldbar
  #268 = Utf8               goldbar
  #269 = String             #270          // ticketdonate
  #270 = Utf8               ticketdonate
  #271 = String             #272          // nenhum
  #272 = Utf8               nenhum
  #273 = Methodref          #274.#275     // java/lang/System.currentTimeMillis:()J
  #274 = Class              #276          // java/lang/System
  #275 = NameAndType        #277:#132     // currentTimeMillis:()J
  #276 = Utf8               java/lang/System
  #277 = Utf8               currentTimeMillis
  #278 = Methodref          #57.#80       // java/lang/String.isEmpty:()Z
  #279 = Long               300000l
  #281 = String             #282          // 5minutos
  #282 = Utf8               5minutos
  #283 = String             #284          // 30minutos
  #284 = Utf8               30minutos
  #285 = String             #286          // 2horas
  #286 = Utf8               2horas
  #287 = Long               1800000l
  #289 = Long               7200000l
  #291 = Utf8               Code
  #292 = Utf8               LineNumberTable
  #293 = Utf8               LocalVariableTable
  #294 = Utf8               this
  #295 = Utf8               Lext/mods/email/items/EmailItemSender;
  #296 = Utf8               processSendCommand
  #297 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/util/Tokenizer;)V
  #298 = Utf8               objectId
  #299 = Utf8               I
  #300 = Utf8               quantity
  #301 = Utf8               J
  #302 = Utf8               item
  #303 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #304 = Utf8               removedItem
  #305 = Utf8               entry
  #306 = Utf8               Ljava/util/Map$Entry;
  #307 = Utf8               recipient
  #308 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #309 = Utf8               sender
  #310 = Utf8               tokenizer
  #311 = Utf8               Lext/mods/util/Tokenizer;
  #312 = Utf8               targetName
  #313 = Utf8               Ljava/lang/String;
  #314 = Utf8               paymentOption
  #315 = Utf8               paymentItemName
  #316 = Utf8               paymentAmount
  #317 = Utf8               durationOption
  #318 = Utf8               targetObjectId
  #319 = Utf8               Ljava/lang/Integer;
  #320 = Utf8               isPaid
  #321 = Utf8               Z
  #322 = Utf8               paymentItemId
  #323 = Utf8               expirationTime
  #324 = Utf8               selectedItems
  #325 = Utf8               Ljava/util/Map;
  #326 = Utf8               emailId
  #327 = Utf8               sentCount
  #328 = Utf8               LocalVariableTypeTable
  #329 = Utf8               Ljava/util/Map$Entry<Ljava/lang/Integer;Ljava/lang/Long;>;
  #330 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Long;>;
  #331 = Utf8               StackMapTable
  #332 = Utf8               rs
  #333 = Utf8               Ljava/sql/ResultSet;
  #334 = Utf8               ps
  #335 = Utf8               Ljava/sql/PreparedStatement;
  #336 = Utf8               con
  #337 = Utf8               Ljava/sql/Connection;
  #338 = Utf8               e
  #339 = Utf8               Ljava/lang/Exception;
  #340 = Utf8               target
  #341 = Utf8               itemName
  #342 = Utf8               durationMs
  #343 = Utf8               durationStr
  #344 = Utf8               currentTime
  #345 = Utf8               SourceFile
  #346 = Utf8               EmailItemSender.java
  #347 = Utf8               BootstrapMethods
  #348 = String             #349          // Jogador \'\u0001\' não encontrado.
  #349 = Utf8               Jogador \'\u0001\' não encontrado.
  #350 = String             #351          // Email enviado com sucesso para \u0001.
  #351 = Utf8               Email enviado com sucesso para \u0001.
  #352 = String             #353          // Você recebeu um novo email de \u0001. Use .email inbox para ver.
  #353 = Utf8               Você recebeu um novo email de \u0001. Use .email inbox para ver.
  #354 = MethodHandle       6:#355        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #355 = Methodref          #356.#357     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #356 = Class              #358          // java/lang/invoke/StringConcatFactory
  #357 = NameAndType        #52:#359      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #358 = Utf8               java/lang/invoke/StringConcatFactory
  #359 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #360 = Utf8               InnerClasses
  #361 = Utf8               Entry
  #362 = Class              #363          // java/lang/invoke/MethodHandles$Lookup
  #363 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #364 = Class              #365          // java/lang/invoke/MethodHandles
  #365 = Utf8               java/lang/invoke/MethodHandles
  #366 = Utf8               Lookup
{
  public ext.mods.email.items.EmailItemSender();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 35: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/email/items/EmailItemSender;

  public static void processSendCommand(ext.mods.gameserver.model.actor.Player, ext.mods.util.Tokenizer);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/util/Tokenizer;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=9, locals=22, args_size=2
         0: aload_0
         1: invokevirtual #7                  // Method ext/mods/gameserver/model/actor/Player.getSelectedEmailTarget:()Ljava/lang/String;
         4: astore_2
         5: aload_1
         6: iconst_2
         7: invokevirtual #13                 // Method ext/mods/util/Tokenizer.getAsString:(I)Ljava/lang/String;
        10: astore_3
        11: aload_1
        12: iconst_3
        13: invokevirtual #13                 // Method ext/mods/util/Tokenizer.getAsString:(I)Ljava/lang/String;
        16: astore        4
        18: aload_1
        19: iconst_4
        20: iconst_0
        21: invokevirtual #19                 // Method ext/mods/util/Tokenizer.getAsInteger:(II)I
        24: istore        5
        26: aload_0
        27: invokevirtual #23                 // Method ext/mods/gameserver/model/actor/Player.getSelectedEmailDuration:()Ljava/lang/String;
        30: astore        6
        32: aload_2
        33: ifnonnull     52
        36: aload_0
        37: ldc           #26                 // String Você deve selecionar um jogador antes de enviar.
        39: invokevirtual #28                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        42: invokestatic  #32                 // Method ext/mods/Crypta/PlayerEmailManager.getInstance:()Lext/mods/Crypta/PlayerEmailManager;
        45: aload_0
        46: ldc           #38                 // String email_main.htm
        48: invokevirtual #40                 // Method ext/mods/Crypta/PlayerEmailManager.navi:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
        51: return
        52: aload_2
        53: invokestatic  #44                 // Method getTargetObjectId:(Ljava/lang/String;)Ljava/lang/Integer;
        56: astore        7
        58: aload         7
        60: ifnonnull     83
        63: aload_0
        64: aload_2
        65: invokedynamic #50,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        70: invokevirtual #28                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        73: invokestatic  #32                 // Method ext/mods/Crypta/PlayerEmailManager.getInstance:()Lext/mods/Crypta/PlayerEmailManager;
        76: aload_0
        77: ldc           #38                 // String email_main.htm
        79: invokevirtual #40                 // Method ext/mods/Crypta/PlayerEmailManager.navi:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
        82: return
        83: aload_3
        84: ldc           #54                 // String sim
        86: invokevirtual #56                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        89: istore        8
        91: aload         4
        93: invokestatic  #62                 // Method parsePaymentItemId:(Ljava/lang/String;)I
        96: istore        9
        98: iload         8
       100: ifeq          146
       103: iload         9
       105: iconst_m1
       106: if_icmpne     125
       109: aload_0
       110: ldc           #66                 // String Você marcou como pago, mas não selecionou um item válido de pagamento.
       112: invokevirtual #28                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       115: invokestatic  #32                 // Method ext/mods/Crypta/PlayerEmailManager.getInstance:()Lext/mods/Crypta/PlayerEmailManager;
       118: aload_0
       119: ldc           #38                 // String email_main.htm
       121: invokevirtual #40                 // Method ext/mods/Crypta/PlayerEmailManager.navi:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       124: return
       125: iload         5
       127: ifgt          146
       130: aload_0
       131: ldc           #68                 // String Você marcou como pago, mas não especificou uma quantidade válida.
       133: invokevirtual #28                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       136: invokestatic  #32                 // Method ext/mods/Crypta/PlayerEmailManager.getInstance:()Lext/mods/Crypta/PlayerEmailManager;
       139: aload_0
       140: ldc           #38                 // String email_main.htm
       142: invokevirtual #40                 // Method ext/mods/Crypta/PlayerEmailManager.navi:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       145: return
       146: aload         6
       148: invokestatic  #70                 // Method calculateExpiration:(Ljava/lang/String;)J
       151: lstore        10
       153: aload_0
       154: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getTempSelectedItems:()Ljava/util/Map;
       157: astore        12
       159: aload         12
       161: invokeinterface #78,  1           // InterfaceMethod java/util/Map.isEmpty:()Z
       166: ifeq          185
       169: aload_0
       170: ldc           #84                 // String Nenhum item selecionado para envio.
       172: invokevirtual #28                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       175: invokestatic  #32                 // Method ext/mods/Crypta/PlayerEmailManager.getInstance:()Lext/mods/Crypta/PlayerEmailManager;
       178: aload_0
       179: ldc           #38                 // String email_main.htm
       181: invokevirtual #40                 // Method ext/mods/Crypta/PlayerEmailManager.navi:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       184: return
       185: invokestatic  #86                 // Method ext/mods/gameserver/idfactory/IdFactory.getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
       188: invokevirtual #91                 // Method ext/mods/gameserver/idfactory/IdFactory.getNextId:()I
       191: istore        13
       193: iconst_0
       194: istore        14
       196: aload         12
       198: invokeinterface #95,  1           // InterfaceMethod java/util/Map.entrySet:()Ljava/util/Set;
       203: invokeinterface #99,  1           // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
       208: astore        15
       210: aload         15
       212: invokeinterface #105,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       217: ifeq          357
       220: aload         15
       222: invokeinterface #110,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       227: checkcast     #114                // class java/util/Map$Entry
       230: astore        16
       232: aload         16
       234: invokeinterface #116,  1          // InterfaceMethod java/util/Map$Entry.getKey:()Ljava/lang/Object;
       239: checkcast     #119                // class java/lang/Integer
       242: invokevirtual #121                // Method java/lang/Integer.intValue:()I
       245: istore        17
       247: aload         16
       249: invokeinterface #124,  1          // InterfaceMethod java/util/Map$Entry.getValue:()Ljava/lang/Object;
       254: checkcast     #127                // class java/lang/Long
       257: invokevirtual #129                // Method java/lang/Long.longValue:()J
       260: lstore        18
       262: aload_0
       263: invokevirtual #133                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       266: iload         17
       268: invokevirtual #137                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
       271: astore        20
       273: aload         20
       275: ifnull        210
       278: lload         18
       280: lconst_1
       281: lcmp
       282: iflt          210
       285: lload         18
       287: aload         20
       289: invokevirtual #143                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
       292: i2l
       293: lcmp
       294: ifle          300
       297: goto          210
       300: aload_0
       301: invokevirtual #133                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       304: iload         17
       306: lload         18
       308: l2i
       309: invokevirtual #148                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.destroyItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
       312: astore        21
       314: aload         21
       316: ifnull        354
       319: aload         21
       321: lload         18
       323: l2i
       324: invokevirtual #152                // Method ext/mods/gameserver/model/item/instance/ItemInstance.setCount:(I)V
       327: iload         13
       329: aload_0
       330: invokevirtual #156                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       333: aload         7
       335: invokevirtual #121                // Method java/lang/Integer.intValue:()I
       338: aload         21
       340: iload         8
       342: iload         9
       344: iload         5
       346: lload         10
       348: invokestatic  #159                // Method ext/mods/email/items/EmailStorage.saveEmail:(IIILext/mods/gameserver/model/item/instance/ItemInstance;ZIIJ)V
       351: iinc          14, 1
       354: goto          210
       357: aload_0
       358: invokevirtual #165                // Method ext/mods/gameserver/model/actor/Player.clearTempSelectedItems:()V
       361: aload_0
       362: aconst_null
       363: invokevirtual #168                // Method ext/mods/gameserver/model/actor/Player.setSelectedEmailTarget:(Ljava/lang/String;)V
       366: iload         14
       368: ifle          431
       371: aload_0
       372: aload_2
       373: invokedynamic #171,  0            // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       378: invokevirtual #28                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       381: invokestatic  #172                // Method ext/mods/email/task/EmailDeliveryTask.getInstance:()Lext/mods/email/task/EmailDeliveryTask;
       384: aload_0
       385: iload         13
       387: lload         10
       389: invokevirtual #177                // Method ext/mods/email/task/EmailDeliveryTask.scheduleExpiration:(Lext/mods/gameserver/model/actor/Player;IJ)V
       392: invokestatic  #181                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
       395: aload_2
       396: invokevirtual #186                // Method ext/mods/gameserver/model/World.getPlayer:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
       399: astore        15
       401: aload         15
       403: ifnull        428
       406: aload         15
       408: invokevirtual #190                // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
       411: ifeq          428
       414: aload         15
       416: aload_0
       417: invokevirtual #193                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       420: invokedynamic #196,  0            // InvokeDynamic #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       425: invokevirtual #28                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       428: goto          437
       431: aload_0
       432: ldc           #197                // String Nenhum Email pôde ser enviado.
       434: invokevirtual #28                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       437: return
      LineNumberTable:
        line 40: 0
        line 41: 5
        line 43: 11
        line 44: 18
        line 45: 26
        line 53: 32
        line 55: 36
        line 56: 42
        line 57: 51
        line 60: 52
        line 61: 58
        line 63: 63
        line 64: 73
        line 65: 82
        line 68: 83
        line 69: 91
        line 71: 98
        line 73: 103
        line 75: 109
        line 76: 115
        line 77: 124
        line 79: 125
        line 81: 130
        line 82: 136
        line 83: 145
        line 87: 146
        line 89: 153
        line 90: 159
        line 92: 169
        line 93: 175
        line 94: 184
        line 97: 185
        line 99: 193
        line 100: 196
        line 102: 232
        line 103: 247
        line 105: 262
        line 106: 273
        line 108: 297
        line 111: 300
        line 112: 314
        line 114: 319
        line 116: 327
        line 117: 351
        line 119: 354
        line 121: 357
        line 122: 361
        line 124: 366
        line 125: 371
        line 126: 381
        line 128: 392
        line 129: 401
        line 130: 414
        line 132: 428
        line 135: 431
        line 137: 437
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          247     107    17 objectId   I
          262      92    18 quantity   J
          273      81    20  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
          314      40    21 removedItem   Lext/mods/gameserver/model/item/instance/ItemInstance;
          232     122    16 entry   Ljava/util/Map$Entry;
          401      27    15 recipient   Lext/mods/gameserver/model/actor/Player;
            0     438     0 sender   Lext/mods/gameserver/model/actor/Player;
            0     438     1 tokenizer   Lext/mods/util/Tokenizer;
            5     433     2 targetName   Ljava/lang/String;
           11     427     3 paymentOption   Ljava/lang/String;
           18     420     4 paymentItemName   Ljava/lang/String;
           26     412     5 paymentAmount   I
           32     406     6 durationOption   Ljava/lang/String;
           58     380     7 targetObjectId   Ljava/lang/Integer;
           91     347     8 isPaid   Z
           98     340     9 paymentItemId   I
          153     285    10 expirationTime   J
          159     279    12 selectedItems   Ljava/util/Map;
          193     245    13 emailId   I
          196     242    14 sentCount   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
          232     122    16 entry   Ljava/util/Map$Entry<Ljava/lang/Integer;Ljava/lang/Long;>;
          159     279    12 selectedItems   Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Long;>;
      StackMapTable: number_of_entries = 12
        frame_type = 255 /* full_frame */
          offset_delta = 52
          locals = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/util/Tokenizer, class java/lang/String, class java/lang/String, class java/lang/String, int, class java/lang/String ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 30
          locals = [ class java/lang/Integer ]
        frame_type = 253 /* append */
          offset_delta = 41
          locals = [ int, int ]
        frame_type = 20 /* same */
        frame_type = 253 /* append */
          offset_delta = 38
          locals = [ long, class java/util/Map ]
        frame_type = 254 /* append */
          offset_delta = 24
          locals = [ int, int, class java/util/Iterator ]
        frame_type = 255 /* full_frame */
          offset_delta = 89
          locals = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/util/Tokenizer, class java/lang/String, class java/lang/String, class java/lang/String, int, class java/lang/String, class java/lang/Integer, int, int, long, class java/util/Map, int, int, class java/util/Iterator, class java/util/Map$Entry, int, long, class ext/mods/gameserver/model/item/instance/ItemInstance ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 53
          locals = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/util/Tokenizer, class java/lang/String, class java/lang/String, class java/lang/String, int, class java/lang/String, class java/lang/Integer, int, int, long, class java/util/Map, int, int, class java/util/Iterator ]
          stack = []
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 251 /* same_frame_extended */
          offset_delta = 70
        frame_type = 2 /* same */
        frame_type = 5 /* same */
}
SourceFile: "EmailItemSender.java"
BootstrapMethods:
  0: #354 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #348 Jogador \'\u0001\' não encontrado.
  1: #354 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #350 Email enviado com sucesso para \u0001.
  2: #354 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #352 Você recebeu um novo email de \u0001. Use .email inbox para ver.
InnerClasses:
  public static #361= #114 of #79;        // Entry=class java/util/Map$Entry of class java/util/Map
  public static final #366= #362 of #364; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
