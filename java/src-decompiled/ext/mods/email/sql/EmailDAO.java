// Bytecode for: ext.mods.email.sql.EmailDAO
// File: ext\mods\email\sql\EmailDAO.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/email/sql/EmailDAO.class
  Last modified 9 de jul de 2026; size 16305 bytes
  MD5 checksum e1551d299edd864212f2ca51a089df7e
  Compiled from "EmailDAO.java"
public class ext.mods.email.sql.EmailDAO
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #267                        // ext/mods/email/sql/EmailDAO
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 4, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
    #8 = Class              #10           // ext/mods/commons/pool/ConnectionPool
    #9 = NameAndType        #11:#12       // getConnection:()Ljava/sql/Connection;
   #10 = Utf8               ext/mods/commons/pool/ConnectionPool
   #11 = Utf8               getConnection
   #12 = Utf8               ()Ljava/sql/Connection;
   #13 = String             #14           // SELECT 1 FROM player_emails WHERE email_id=? AND status=\'PENDING\'
   #14 = Utf8               SELECT 1 FROM player_emails WHERE email_id=? AND status=\'PENDING\'
   #15 = InterfaceMethodref #16.#17       // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #16 = Class              #18           // java/sql/Connection
   #17 = NameAndType        #19:#20       // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #18 = Utf8               java/sql/Connection
   #19 = Utf8               prepareStatement
   #20 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #21 = InterfaceMethodref #22.#23       // java/sql/PreparedStatement.setInt:(II)V
   #22 = Class              #24           // java/sql/PreparedStatement
   #23 = NameAndType        #25:#26       // setInt:(II)V
   #24 = Utf8               java/sql/PreparedStatement
   #25 = Utf8               setInt
   #26 = Utf8               (II)V
   #27 = InterfaceMethodref #22.#28       // java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
   #28 = NameAndType        #29:#30       // executeQuery:()Ljava/sql/ResultSet;
   #29 = Utf8               executeQuery
   #30 = Utf8               ()Ljava/sql/ResultSet;
   #31 = InterfaceMethodref #32.#33       // java/sql/ResultSet.next:()Z
   #32 = Class              #34           // java/sql/ResultSet
   #33 = NameAndType        #35:#36       // next:()Z
   #34 = Utf8               java/sql/ResultSet
   #35 = Utf8               next
   #36 = Utf8               ()Z
   #37 = InterfaceMethodref #32.#38       // java/sql/ResultSet.close:()V
   #38 = NameAndType        #39:#6        // close:()V
   #39 = Utf8               close
   #40 = InterfaceMethodref #22.#38       // java/sql/PreparedStatement.close:()V
   #41 = InterfaceMethodref #16.#38       // java/sql/Connection.close:()V
   #42 = Class              #43           // java/lang/Throwable
   #43 = Utf8               java/lang/Throwable
   #44 = Methodref          #42.#45       // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
   #45 = NameAndType        #46:#47       // addSuppressed:(Ljava/lang/Throwable;)V
   #46 = Utf8               addSuppressed
   #47 = Utf8               (Ljava/lang/Throwable;)V
   #48 = Class              #49           // java/lang/Exception
   #49 = Utf8               java/lang/Exception
   #50 = Methodref          #48.#51       // java/lang/Exception.printStackTrace:()V
   #51 = NameAndType        #52:#6        // printStackTrace:()V
   #52 = Utf8               printStackTrace
   #53 = String             #54           // UPDATE player_emails SET status=\'EXPIRED\' WHERE email_id=? AND status=\'PENDING\'
   #54 = Utf8               UPDATE player_emails SET status=\'EXPIRED\' WHERE email_id=? AND status=\'PENDING\'
   #55 = InterfaceMethodref #22.#56       // java/sql/PreparedStatement.executeUpdate:()I
   #56 = NameAndType        #57:#58       // executeUpdate:()I
   #57 = Utf8               executeUpdate
   #58 = Utf8               ()I
   #59 = String             #60           // SELECT sender_id, item_object_id, item_id, count, enchant_level, is_augmented, augment_id FROM player_emails WHERE email_id=?
   #60 = Utf8               SELECT sender_id, item_object_id, item_id, count, enchant_level, is_augmented, augment_id FROM player_emails WHERE email_id=?
   #61 = String             #62           // sender_id
   #62 = Utf8               sender_id
   #63 = InterfaceMethodref #32.#64       // java/sql/ResultSet.getInt:(Ljava/lang/String;)I
   #64 = NameAndType        #65:#66       // getInt:(Ljava/lang/String;)I
   #65 = Utf8               getInt
   #66 = Utf8               (Ljava/lang/String;)I
   #67 = String             #68           // item_object_id
   #68 = Utf8               item_object_id
   #69 = String             #70           // item_id
   #70 = Utf8               item_id
   #71 = String             #72           // count
   #72 = Utf8               count
   #73 = String             #74           // enchant_level
   #74 = Utf8               enchant_level
   #75 = String             #76           // is_augmented
   #76 = Utf8               is_augmented
   #77 = InterfaceMethodref #32.#78       // java/sql/ResultSet.getBoolean:(Ljava/lang/String;)Z
   #78 = NameAndType        #79:#80       // getBoolean:(Ljava/lang/String;)Z
   #79 = Utf8               getBoolean
   #80 = Utf8               (Ljava/lang/String;)Z
   #81 = String             #82           // augment_id
   #82 = Utf8               augment_id
   #83 = Methodref          #84.#85       // ext/mods/gameserver/idfactory/IdFactory.getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
   #84 = Class              #86           // ext/mods/gameserver/idfactory/IdFactory
   #85 = NameAndType        #87:#88       // getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
   #86 = Utf8               ext/mods/gameserver/idfactory/IdFactory
   #87 = Utf8               getInstance
   #88 = Utf8               ()Lext/mods/gameserver/idfactory/IdFactory;
   #89 = Methodref          #84.#90       // ext/mods/gameserver/idfactory/IdFactory.getNextId:()I
   #90 = NameAndType        #91:#58       // getNextId:()I
   #91 = Utf8               getNextId
   #92 = Methodref          #93.#94       // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
   #93 = Class              #95           // ext/mods/gameserver/model/World
   #94 = NameAndType        #87:#96       // getInstance:()Lext/mods/gameserver/model/World;
   #95 = Utf8               ext/mods/gameserver/model/World
   #96 = Utf8               ()Lext/mods/gameserver/model/World;
   #97 = Methodref          #93.#98       // ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
   #98 = NameAndType        #99:#100      // getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
   #99 = Utf8               getPlayer
  #100 = Utf8               (I)Lext/mods/gameserver/model/actor/Player;
  #101 = Methodref          #102.#103     // ext/mods/gameserver/model/actor/Player.addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #102 = Class              #104          // ext/mods/gameserver/model/actor/Player
  #103 = NameAndType        #105:#106     // addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #104 = Utf8               ext/mods/gameserver/model/actor/Player
  #105 = Utf8               addItem
  #106 = Utf8               (IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #107 = Methodref          #108.#109     // ext/mods/gameserver/model/item/instance/ItemInstance.setEnchantLevel:(ILext/mods/gameserver/model/actor/Playable;)V
  #108 = Class              #110          // ext/mods/gameserver/model/item/instance/ItemInstance
  #109 = NameAndType        #111:#112     // setEnchantLevel:(ILext/mods/gameserver/model/actor/Playable;)V
  #110 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #111 = Utf8               setEnchantLevel
  #112 = Utf8               (ILext/mods/gameserver/model/actor/Playable;)V
  #113 = String             #114          // UPDATE augmentations SET item_oid=? WHERE item_oid=?
  #114 = Utf8               UPDATE augmentations SET item_oid=? WHERE item_oid=?
  #115 = String             #116          // SELECT attributes, skill_id, skill_level FROM augmentations WHERE item_oid=?
  #116 = Utf8               SELECT attributes, skill_id, skill_level FROM augmentations WHERE item_oid=?
  #117 = String             #118          // attributes
  #118 = Utf8               attributes
  #119 = String             #120          // skill_id
  #120 = Utf8               skill_id
  #121 = String             #122          // skill_level
  #122 = Utf8               skill_level
  #123 = Methodref          #124.#125     // ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
  #124 = Class              #126          // ext/mods/gameserver/data/SkillTable
  #125 = NameAndType        #87:#127      // getInstance:()Lext/mods/gameserver/data/SkillTable;
  #126 = Utf8               ext/mods/gameserver/data/SkillTable
  #127 = Utf8               ()Lext/mods/gameserver/data/SkillTable;
  #128 = Methodref          #124.#129     // ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #129 = NameAndType        #130:#131     // getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #130 = Utf8               getInfo
  #131 = Utf8               (II)Lext/mods/gameserver/skills/L2Skill;
  #132 = Class              #133          // ext/mods/gameserver/model/Augmentation
  #133 = Utf8               ext/mods/gameserver/model/Augmentation
  #134 = Methodref          #132.#135     // ext/mods/gameserver/model/Augmentation."<init>":(ILext/mods/gameserver/skills/L2Skill;)V
  #135 = NameAndType        #5:#136       // "<init>":(ILext/mods/gameserver/skills/L2Skill;)V
  #136 = Utf8               (ILext/mods/gameserver/skills/L2Skill;)V
  #137 = Methodref          #108.#138     // ext/mods/gameserver/model/item/instance/ItemInstance.setAugmentation:(Lext/mods/gameserver/model/Augmentation;Lext/mods/gameserver/model/actor/Player;)Z
  #138 = NameAndType        #139:#140     // setAugmentation:(Lext/mods/gameserver/model/Augmentation;Lext/mods/gameserver/model/actor/Player;)Z
  #139 = Utf8               setAugmentation
  #140 = Utf8               (Lext/mods/gameserver/model/Augmentation;Lext/mods/gameserver/model/actor/Player;)Z
  #141 = String             #142          // Um item expirado do correio foi devolvido para seu inventário.
  #142 = Utf8               Um item expirado do correio foi devolvido para seu inventário.
  #143 = Methodref          #102.#144     // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
  #144 = NameAndType        #145:#146     // sendMessage:(Ljava/lang/String;)V
  #145 = Utf8               sendMessage
  #146 = Utf8               (Ljava/lang/String;)V
  #147 = String             #148          // SELECT count FROM items WHERE object_id = ? AND owner_id = ? AND item_id = ? AND loc = \'INVENTORY\'
  #148 = Utf8               SELECT count FROM items WHERE object_id = ? AND owner_id = ? AND item_id = ? AND loc = \'INVENTORY\'
  #149 = String             #150          // UPDATE items SET count = ? WHERE object_id = ?
  #150 = Utf8               UPDATE items SET count = ? WHERE object_id = ?
  #151 = String             #152          // SELECT item_oid FROM augmentations WHERE item_oid = ?
  #152 = Utf8               SELECT item_oid FROM augmentations WHERE item_oid = ?
  #153 = Integer            65535
  #154 = String             #155          // INSERT INTO augmentations (item_oid, attributes, skill_id, skill_level) VALUES (?, ?, ?, ?)
  #155 = Utf8               INSERT INTO augmentations (item_oid, attributes, skill_id, skill_level) VALUES (?, ?, ?, ?)
  #156 = String             #157          // INSERT INTO items (owner_id, object_id, item_id, count, enchant_level, loc, loc_data, custom_type1, custom_type2, mana_left, time) VALUES (?, ?, ?, ?, ?, \'INVENTORY\', 0, 0, 0, -1, 0)
  #157 = Utf8               INSERT INTO items (owner_id, object_id, item_id, count, enchant_level, loc, loc_data, custom_type1, custom_type2, mana_left, time) VALUES (?, ?, ?, ?, ?, \'INVENTORY\', 0, 0, 0, -1, 0)
  #158 = Methodref          #159.#160     // java/lang/System.currentTimeMillis:()J
  #159 = Class              #161          // java/lang/System
  #160 = NameAndType        #162:#163     // currentTimeMillis:()J
  #161 = Utf8               java/lang/System
  #162 = Utf8               currentTimeMillis
  #163 = Utf8               ()J
  #164 = String             #165          // SELECT * FROM player_emails WHERE email_id=? AND status=\'PENDING\' AND expiration_time > ? AND target_id=? LIMIT 1
  #165 = Utf8               SELECT * FROM player_emails WHERE email_id=? AND status=\'PENDING\' AND expiration_time > ? AND target_id=? LIMIT 1
  #166 = InterfaceMethodref #22.#167      // java/sql/PreparedStatement.setLong:(IJ)V
  #167 = NameAndType        #168:#169     // setLong:(IJ)V
  #168 = Utf8               setLong
  #169 = Utf8               (IJ)V
  #170 = Methodref          #102.#171     // ext/mods/gameserver/model/actor/Player.isOnline:()Z
  #171 = NameAndType        #172:#36      // isOnline:()Z
  #172 = Utf8               isOnline
  #173 = String             #174          // Email inválido, expirado ou não destinado a você.
  #174 = Utf8               Email inválido, expirado ou não destinado a você.
  #175 = String             #176          // UPDATE player_emails SET status=? WHERE email_id=? AND status=?
  #176 = Utf8               UPDATE player_emails SET status=? WHERE email_id=? AND status=?
  #177 = String             #178          // CLAIMED
  #178 = Utf8               CLAIMED
  #179 = InterfaceMethodref #22.#180      // java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
  #180 = NameAndType        #181:#182     // setString:(ILjava/lang/String;)V
  #181 = Utf8               setString
  #182 = Utf8               (ILjava/lang/String;)V
  #183 = String             #184          // PENDING
  #184 = Utf8               PENDING
  #185 = Fieldref           #159.#186     // java/lang/System.out:Ljava/io/PrintStream;
  #186 = NameAndType        #187:#188     // out:Ljava/io/PrintStream;
  #187 = Utf8               out
  #188 = Utf8               Ljava/io/PrintStream;
  #189 = InvokeDynamic      #0:#190       // #0:makeConcatWithConstants:(I)Ljava/lang/String;
  #190 = NameAndType        #191:#192     // makeConcatWithConstants:(I)Ljava/lang/String;
  #191 = Utf8               makeConcatWithConstants
  #192 = Utf8               (I)Ljava/lang/String;
  #193 = Methodref          #194.#195     // java/io/PrintStream.println:(Ljava/lang/String;)V
  #194 = Class              #196          // java/io/PrintStream
  #195 = NameAndType        #197:#146     // println:(Ljava/lang/String;)V
  #196 = Utf8               java/io/PrintStream
  #197 = Utf8               println
  #198 = InvokeDynamic      #1:#190       // #1:makeConcatWithConstants:(I)Ljava/lang/String;
  #199 = String             #200          // [EmailDAO] Nenhuma linha foi atualizada - email já processado ou inválido
  #200 = Utf8               [EmailDAO] Nenhuma linha foi atualizada - email já processado ou inválido
  #201 = Fieldref           #159.#202     // java/lang/System.err:Ljava/io/PrintStream;
  #202 = NameAndType        #203:#188     // err:Ljava/io/PrintStream;
  #203 = Utf8               err
  #204 = Methodref          #48.#205      // java/lang/Exception.getMessage:()Ljava/lang/String;
  #205 = NameAndType        #206:#207     // getMessage:()Ljava/lang/String;
  #206 = Utf8               getMessage
  #207 = Utf8               ()Ljava/lang/String;
  #208 = InvokeDynamic      #2:#209       // #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #209 = NameAndType        #191:#210     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #210 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #211 = String             #212          // [EmailDAO] Tentando abordagem alternativa...
  #212 = Utf8               [EmailDAO] Tentando abordagem alternativa...
  #213 = String             #214          // UPDATE player_emails SET status=\'CLAIMED\' WHERE email_id=? AND status=\'PENDING\'
  #214 = Utf8               UPDATE player_emails SET status=\'CLAIMED\' WHERE email_id=? AND status=\'PENDING\'
  #215 = InvokeDynamic      #3:#190       // #3:makeConcatWithConstants:(I)Ljava/lang/String;
  #216 = InvokeDynamic      #4:#209       // #4:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #217 = String             #218          // SELECT sender_id, item_object_id, item_id, count, enchant_level, is_augmented, augment_id, is_paid, payment_item_id, payment_item_count FROM player_emails WHERE email_id=?
  #218 = Utf8               SELECT sender_id, item_object_id, item_id, count, enchant_level, is_augmented, augment_id, is_paid, payment_item_id, payment_item_count FROM player_emails WHERE email_id=?
  #219 = String             #220          // is_paid
  #220 = Utf8               is_paid
  #221 = String             #222          // payment_item_id
  #222 = Utf8               payment_item_id
  #223 = String             #224          // payment_item_count
  #224 = Utf8               payment_item_count
  #225 = Methodref          #108.#226     // ext/mods/gameserver/model/item/instance/ItemInstance.getName:()Ljava/lang/String;
  #226 = NameAndType        #227:#207     // getName:()Ljava/lang/String;
  #227 = Utf8               getName
  #228 = InvokeDynamic      #5:#229       // #5:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
  #229 = NameAndType        #191:#230     // makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
  #230 = Utf8               (Ljava/lang/String;I)Ljava/lang/String;
  #231 = Methodref          #102.#232     // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #232 = NameAndType        #233:#234     // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #233 = Utf8               getInventory
  #234 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #235 = Methodref          #236.#237     // ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #236 = Class              #238          // ext/mods/gameserver/model/itemcontainer/PcInventory
  #237 = NameAndType        #239:#240     // getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #238 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
  #239 = Utf8               getItemByItemId
  #240 = Utf8               (I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #241 = Methodref          #108.#242     // ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
  #242 = NameAndType        #243:#58      // getCount:()I
  #243 = Utf8               getCount
  #244 = String             #245          // Pagamento insuficiente. Email não reclamado.
  #245 = Utf8               Pagamento insuficiente. Email não reclamado.
  #246 = String             #247          // UPDATE player_emails SET status=\'PENDING\' WHERE email_id=?
  #247 = Utf8               UPDATE player_emails SET status=\'PENDING\' WHERE email_id=?
  #248 = Methodref          #102.#249     // ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
  #249 = NameAndType        #250:#251     // destroyItemByItemId:(IIZ)Z
  #250 = Utf8               destroyItemByItemId
  #251 = Utf8               (IIZ)Z
  #252 = String             #253          // Você recebeu pagamento de um email reclamado.
  #253 = Utf8               Você recebeu pagamento de um email reclamado.
  #254 = String             #255          // INSERT INTO items (owner_id, object_id, item_id, count, enchant_level, loc, loc_data) VALUES (?, ?, ?, ?, 0, \'INVENTORY\', 0)
  #255 = Utf8               INSERT INTO items (owner_id, object_id, item_id, count, enchant_level, loc, loc_data) VALUES (?, ?, ?, ?, 0, \'INVENTORY\', 0)
  #256 = Methodref          #257.#258     // ext/mods/email/task/EmailDeliveryTask.getInstance:()Lext/mods/email/task/EmailDeliveryTask;
  #257 = Class              #259          // ext/mods/email/task/EmailDeliveryTask
  #258 = NameAndType        #87:#260      // getInstance:()Lext/mods/email/task/EmailDeliveryTask;
  #259 = Utf8               ext/mods/email/task/EmailDeliveryTask
  #260 = Utf8               ()Lext/mods/email/task/EmailDeliveryTask;
  #261 = Methodref          #257.#262     // ext/mods/email/task/EmailDeliveryTask.cancel:(I)V
  #262 = NameAndType        #263:#264     // cancel:(I)V
  #263 = Utf8               cancel
  #264 = Utf8               (I)V
  #265 = String             #266          // Erro ao reclamar email. Tente novamente.
  #266 = Utf8               Erro ao reclamar email. Tente novamente.
  #267 = Class              #268          // ext/mods/email/sql/EmailDAO
  #268 = Utf8               ext/mods/email/sql/EmailDAO
  #269 = Utf8               Code
  #270 = Utf8               LineNumberTable
  #271 = Utf8               LocalVariableTable
  #272 = Utf8               this
  #273 = Utf8               Lext/mods/email/sql/EmailDAO;
  #274 = Utf8               isPending
  #275 = Utf8               (I)Z
  #276 = Utf8               rs
  #277 = Utf8               Ljava/sql/ResultSet;
  #278 = Utf8               ps
  #279 = Utf8               Ljava/sql/PreparedStatement;
  #280 = Utf8               con
  #281 = Utf8               Ljava/sql/Connection;
  #282 = Utf8               e
  #283 = Utf8               Ljava/lang/Exception;
  #284 = Utf8               emailId
  #285 = Utf8               I
  #286 = Utf8               StackMapTable
  #287 = Utf8               expireAndReturnToSender
  #288 = Utf8               rs2
  #289 = Utf8               sel
  #290 = Utf8               skillId
  #291 = Utf8               skillLevel
  #292 = Utf8               fullAugmentId
  #293 = Utf8               skill
  #294 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #295 = Utf8               updateAug
  #296 = Utf8               item
  #297 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #298 = Utf8               updateItem
  #299 = Utf8               insertAug
  #300 = Utf8               rsAug
  #301 = Utf8               checkAug
  #302 = Utf8               currentCount
  #303 = Utf8               newCount
  #304 = Utf8               insertItem
  #305 = Utf8               updated
  #306 = Utf8               rsc
  #307 = Utf8               check
  #308 = Utf8               senderId
  #309 = Utf8               oldObjectId
  #310 = Utf8               itemId
  #311 = Utf8               enchant
  #312 = Utf8               isAug
  #313 = Utf8               Z
  #314 = Utf8               augmentId
  #315 = Utf8               newobjectId
  #316 = Utf8               player
  #317 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #318 = Class              #319          // ext/mods/gameserver/skills/L2Skill
  #319 = Utf8               ext/mods/gameserver/skills/L2Skill
  #320 = Utf8               claimEmail
  #321 = Utf8               recipient
  #322 = Utf8               updated2
  #323 = Utf8               ps2
  #324 = Utf8               e2
  #325 = Utf8               newObjectId
  #326 = Utf8               revert
  #327 = Utf8               insertPayment
  #328 = Utf8               paymentItem
  #329 = Utf8               sender
  #330 = Utf8               now
  #331 = Utf8               J
  #332 = Utf8               isPaid
  #333 = Utf8               paymentItemId
  #334 = Utf8               paymentAmount
  #335 = Utf8               recipientId
  #336 = Utf8               SourceFile
  #337 = Utf8               EmailDAO.java
  #338 = Utf8               BootstrapMethods
  #339 = String             #340          // [EmailDAO] Tentando atualizar status para CLAIMED, emailId: \u0001
  #340 = Utf8               [EmailDAO] Tentando atualizar status para CLAIMED, emailId: \u0001
  #341 = String             #342          // [EmailDAO] Linhas atualizadas: \u0001
  #342 = Utf8               [EmailDAO] Linhas atualizadas: \u0001
  #343 = String             #344          // [EmailDAO] Erro ao atualizar status para CLAIMED: \u0001
  #344 = Utf8               [EmailDAO] Erro ao atualizar status para CLAIMED: \u0001
  #345 = String             #346          // [EmailDAO] Abordagem alternativa - Linhas atualizadas: \u0001
  #346 = Utf8               [EmailDAO] Abordagem alternativa - Linhas atualizadas: \u0001
  #347 = String             #348          // [EmailDAO] Abordagem alternativa também falhou: \u0001
  #348 = Utf8               [EmailDAO] Abordagem alternativa também falhou: \u0001
  #349 = String             #350          // Você recebeu: \u0001 x\u0001
  #350 = Utf8               Você recebeu: \u0001 x\u0001
  #351 = MethodHandle       6:#352        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #352 = Methodref          #353.#354     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #353 = Class              #355          // java/lang/invoke/StringConcatFactory
  #354 = NameAndType        #191:#356     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #355 = Utf8               java/lang/invoke/StringConcatFactory
  #356 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #357 = Utf8               InnerClasses
  #358 = Class              #359          // java/lang/invoke/MethodHandles$Lookup
  #359 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #360 = Class              #361          // java/lang/invoke/MethodHandles
  #361 = Utf8               java/lang/invoke/MethodHandles
  #362 = Utf8               Lookup
{
  public ext.mods.email.sql.EmailDAO();
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
            0       5     0  this   Lext/mods/email/sql/EmailDAO;

  public static boolean isPending(int);
    descriptor: (I)Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=3, locals=6, args_size=1
         0: invokestatic  #7                  // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         3: astore_1
         4: aload_1
         5: ldc           #13                 // String SELECT 1 FROM player_emails WHERE email_id=? AND status=\'PENDING\'
         7: invokeinterface #15,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        12: astore_2
        13: aload_2
        14: iconst_1
        15: iload_0
        16: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        21: aload_2
        22: invokeinterface #27,  1           // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
        27: astore_3
        28: aload_3
        29: invokeinterface #31,  1           // InterfaceMethod java/sql/ResultSet.next:()Z
        34: istore        4
        36: aload_3
        37: ifnull        46
        40: aload_3
        41: invokeinterface #37,  1           // InterfaceMethod java/sql/ResultSet.close:()V
        46: aload_2
        47: ifnull        56
        50: aload_2
        51: invokeinterface #40,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
        56: aload_1
        57: ifnull        66
        60: aload_1
        61: invokeinterface #41,  1           // InterfaceMethod java/sql/Connection.close:()V
        66: iload         4
        68: ireturn
        69: astore        4
        71: aload_3
        72: ifnull        93
        75: aload_3
        76: invokeinterface #37,  1           // InterfaceMethod java/sql/ResultSet.close:()V
        81: goto          93
        84: astore        5
        86: aload         4
        88: aload         5
        90: invokevirtual #44                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        93: aload         4
        95: athrow
        96: astore_3
        97: aload_2
        98: ifnull        118
       101: aload_2
       102: invokeinterface #40,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       107: goto          118
       110: astore        4
       112: aload_3
       113: aload         4
       115: invokevirtual #44                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       118: aload_3
       119: athrow
       120: astore_2
       121: aload_1
       122: ifnull        140
       125: aload_1
       126: invokeinterface #41,  1           // InterfaceMethod java/sql/Connection.close:()V
       131: goto          140
       134: astore_3
       135: aload_2
       136: aload_3
       137: invokevirtual #44                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       140: aload_2
       141: athrow
       142: astore_1
       143: aload_1
       144: invokevirtual #50                 // Method java/lang/Exception.printStackTrace:()V
       147: iconst_0
       148: ireturn
      Exception table:
         from    to  target type
            28    36    69   Class java/lang/Throwable
            75    81    84   Class java/lang/Throwable
            13    46    96   Class java/lang/Throwable
            69    96    96   Class java/lang/Throwable
           101   107   110   Class java/lang/Throwable
             4    56   120   Class java/lang/Throwable
            69   120   120   Class java/lang/Throwable
           125   131   134   Class java/lang/Throwable
             0    66   142   Class java/lang/Exception
            69   142   142   Class java/lang/Exception
      LineNumberTable:
        line 38: 0
        line 39: 4
        line 41: 13
        line 42: 21
        line 44: 28
        line 45: 36
        line 46: 46
        line 44: 66
        line 42: 69
        line 38: 96
        line 47: 142
        line 49: 143
        line 51: 147
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           28      68     3    rs   Ljava/sql/ResultSet;
           13     107     2    ps   Ljava/sql/PreparedStatement;
            4     138     1   con   Ljava/sql/Connection;
          143       4     1     e   Ljava/lang/Exception;
            0     149     0 emailId   I
      StackMapTable: number_of_entries = 13
        frame_type = 255 /* full_frame */
          offset_delta = 46
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, int ]
          stack = []
        frame_type = 9 /* same */
        frame_type = 9 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ int, class java/sql/Connection ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ int, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ int ]
          stack = [ class java/lang/Exception ]

  public static void expireAndReturnToSender(int);
    descriptor: (I)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=5, locals=25, args_size=1
         0: invokestatic  #7                  // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         3: astore_1
         4: aload_1
         5: ldc           #53                 // String UPDATE player_emails SET status=\'EXPIRED\' WHERE email_id=? AND status=\'PENDING\'
         7: invokeinterface #15,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        12: astore_2
        13: aload_2
        14: iconst_1
        15: iload_0
        16: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        21: aload_2
        22: invokeinterface #55,  1           // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
        27: pop
        28: aload_2
        29: ifnull        65
        32: aload_2
        33: invokeinterface #40,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
        38: goto          65
        41: astore_3
        42: aload_2
        43: ifnull        63
        46: aload_2
        47: invokeinterface #40,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
        52: goto          63
        55: astore        4
        57: aload_3
        58: aload         4
        60: invokevirtual #44                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        63: aload_3
        64: athrow
        65: aload_1
        66: ldc           #59                 // String SELECT sender_id, item_object_id, item_id, count, enchant_level, is_augmented, augment_id FROM player_emails WHERE email_id=?
        68: invokeinterface #15,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        73: astore_2
        74: aload_2
        75: iconst_1
        76: iload_0
        77: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        82: aload_2
        83: invokeinterface #27,  1           // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
        88: astore_3
        89: aload_3
        90: invokeinterface #31,  1           // InterfaceMethod java/sql/ResultSet.next:()Z
        95: ifeq          1367
        98: aload_3
        99: ldc           #61                 // String sender_id
       101: invokeinterface #63,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       106: istore        4
       108: aload_3
       109: ldc           #67                 // String item_object_id
       111: invokeinterface #63,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       116: istore        5
       118: aload_3
       119: ldc           #69                 // String item_id
       121: invokeinterface #63,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       126: istore        6
       128: aload_3
       129: ldc           #71                 // String count
       131: invokeinterface #63,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       136: istore        7
       138: aload_3
       139: ldc           #73                 // String enchant_level
       141: invokeinterface #63,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       146: istore        8
       148: aload_3
       149: ldc           #75                 // String is_augmented
       151: invokeinterface #77,  2           // InterfaceMethod java/sql/ResultSet.getBoolean:(Ljava/lang/String;)Z
       156: istore        9
       158: aload_3
       159: ldc           #81                 // String augment_id
       161: invokeinterface #63,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       166: istore        10
       168: invokestatic  #83                 // Method ext/mods/gameserver/idfactory/IdFactory.getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
       171: invokevirtual #89                 // Method ext/mods/gameserver/idfactory/IdFactory.getNextId:()I
       174: istore        11
       176: invokestatic  #92                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
       179: iload         4
       181: invokevirtual #97                 // Method ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
       184: astore        12
       186: aload         12
       188: ifnull        533
       191: aload         12
       193: iload         6
       195: iload         7
       197: iconst_1
       198: invokevirtual #101                // Method ext/mods/gameserver/model/actor/Player.addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
       201: astore        13
       203: iload         8
       205: ifle          217
       208: aload         13
       210: iload         8
       212: aload         12
       214: invokevirtual #107                // Method ext/mods/gameserver/model/item/instance/ItemInstance.setEnchantLevel:(ILext/mods/gameserver/model/actor/Playable;)V
       217: iload         9
       219: ifeq          523
       222: aload_1
       223: ldc           #113                // String UPDATE augmentations SET item_oid=? WHERE item_oid=?
       225: invokeinterface #15,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       230: astore        14
       232: aload         14
       234: iconst_1
       235: iload         11
       237: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       242: aload         14
       244: iconst_2
       245: iload         5
       247: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       252: aload         14
       254: invokeinterface #55,  1           // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
       259: pop
       260: iconst_0
       261: istore        15
       263: iconst_0
       264: istore        16
       266: iconst_1
       267: istore        17
       269: aload_1
       270: ldc           #115                // String SELECT attributes, skill_id, skill_level FROM augmentations WHERE item_oid=?
       272: invokeinterface #15,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       277: astore        18
       279: aload         18
       281: iconst_1
       282: iload         11
       284: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       289: aload         18
       291: invokeinterface #27,  1           // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
       296: astore        19
       298: aload         19
       300: invokeinterface #31,  1           // InterfaceMethod java/sql/ResultSet.next:()Z
       305: ifeq          341
       308: aload         19
       310: ldc           #117                // String attributes
       312: invokeinterface #63,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       317: istore        15
       319: aload         19
       321: ldc           #119                // String skill_id
       323: invokeinterface #63,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       328: istore        16
       330: aload         19
       332: ldc           #121                // String skill_level
       334: invokeinterface #63,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       339: istore        17
       341: aload         19
       343: ifnull        385
       346: aload         19
       348: invokeinterface #37,  1           // InterfaceMethod java/sql/ResultSet.close:()V
       353: goto          385
       356: astore        20
       358: aload         19
       360: ifnull        382
       363: aload         19
       365: invokeinterface #37,  1           // InterfaceMethod java/sql/ResultSet.close:()V
       370: goto          382
       373: astore        21
       375: aload         20
       377: aload         21
       379: invokevirtual #44                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       382: aload         20
       384: athrow
       385: aload         18
       387: ifnull        429
       390: aload         18
       392: invokeinterface #40,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       397: goto          429
       400: astore        19
       402: aload         18
       404: ifnull        426
       407: aload         18
       409: invokeinterface #40,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       414: goto          426
       417: astore        20
       419: aload         19
       421: aload         20
       423: invokevirtual #44                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       426: aload         19
       428: athrow
       429: iload         15
       431: iload         16
       433: bipush        16
       435: ishl
       436: ior
       437: istore        18
       439: iload         16
       441: ifle          457
       444: invokestatic  #123                // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
       447: iload         16
       449: iload         17
       451: invokevirtual #128                // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
       454: goto          458
       457: aconst_null
       458: astore        19
       460: aload         13
       462: new           #132                // class ext/mods/gameserver/model/Augmentation
       465: dup
       466: iload         18
       468: aload         19
       470: invokespecial #134                // Method ext/mods/gameserver/model/Augmentation."<init>":(ILext/mods/gameserver/skills/L2Skill;)V
       473: aload         12
       475: invokevirtual #137                // Method ext/mods/gameserver/model/item/instance/ItemInstance.setAugmentation:(Lext/mods/gameserver/model/Augmentation;Lext/mods/gameserver/model/actor/Player;)Z
       478: pop
       479: aload         14
       481: ifnull        523
       484: aload         14
       486: invokeinterface #40,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       491: goto          523
       494: astore        15
       496: aload         14
       498: ifnull        520
       501: aload         14
       503: invokeinterface #40,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       508: goto          520
       511: astore        16
       513: aload         15
       515: aload         16
       517: invokevirtual #44                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       520: aload         15
       522: athrow
       523: aload         12
       525: ldc           #141                // String Um item expirado do correio foi devolvido para seu inventário.
       527: invokevirtual #143                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       530: goto          1364
       533: aload_1
       534: ldc           #147                // String SELECT count FROM items WHERE object_id = ? AND owner_id = ? AND item_id = ? AND loc = \'INVENTORY\'
       536: invokeinterface #15,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       541: astore        13
       543: aload         13
       545: iconst_1
       546: iload         5
       548: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       553: aload         13
       555: iconst_2
       556: iload         4
       558: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       563: aload         13
       565: iconst_3
       566: iload         6
       568: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       573: aload         13
       575: invokeinterface #27,  1           // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
       580: astore        14
       582: aload         14
       584: invokeinterface #31,  1           // InterfaceMethod java/sql/ResultSet.next:()Z
       589: ifeq          949
       592: aload         14
       594: ldc           #71                 // String count
       596: invokeinterface #63,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       601: istore        15
       603: iload         15
       605: iload         7
       607: iadd
       608: istore        16
       610: aload_1
       611: ldc           #149                // String UPDATE items SET count = ? WHERE object_id = ?
       613: invokeinterface #15,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       618: astore        17
       620: aload         17
       622: iconst_1
       623: iload         16
       625: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       630: aload         17
       632: iconst_2
       633: iload         5
       635: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       640: aload         17
       642: invokeinterface #55,  1           // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
       647: pop
       648: aload         17
       650: ifnull        692
       653: aload         17
       655: invokeinterface #40,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       660: goto          692
       663: astore        18
       665: aload         17
       667: ifnull        689
       670: aload         17
       672: invokeinterface #40,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       677: goto          689
       680: astore        19
       682: aload         18
       684: aload         19
       686: invokevirtual #44                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       689: aload         18
       691: athrow
       692: iload         9
       694: ifeq          946
       697: aload_1
       698: ldc           #151                // String SELECT item_oid FROM augmentations WHERE item_oid = ?
       700: invokeinterface #15,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       705: astore        17
       707: aload         17
       709: iconst_1
       710: iload         5
       712: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       717: aload         17
       719: invokeinterface #27,  1           // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
       724: astore        18
       726: aload         18
       728: invokeinterface #31,  1           // InterfaceMethod java/sql/ResultSet.next:()Z
       733: ifne          858
       736: iload         10
       738: ldc           #153                // int 65535
       740: iand
       741: istore        19
       743: iload         10
       745: bipush        16
       747: ishr
       748: ldc           #153                // int 65535
       750: iand
       751: istore        20
       753: iconst_1
       754: istore        21
       756: aload_1
       757: ldc           #154                // String INSERT INTO augmentations (item_oid, attributes, skill_id, skill_level) VALUES (?, ?, ?, ?)
       759: invokeinterface #15,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       764: astore        22
       766: aload         22
       768: iconst_1
       769: iload         5
       771: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       776: aload         22
       778: iconst_2
       779: iload         19
       781: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       786: aload         22
       788: iconst_3
       789: iload         20
       791: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       796: aload         22
       798: iconst_4
       799: iload         21
       801: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       806: aload         22
       808: invokeinterface #55,  1           // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
       813: pop
       814: aload         22
       816: ifnull        858
       819: aload         22
       821: invokeinterface #40,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       826: goto          858
       829: astore        23
       831: aload         22
       833: ifnull        855
       836: aload         22
       838: invokeinterface #40,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       843: goto          855
       846: astore        24
       848: aload         23
       850: aload         24
       852: invokevirtual #44                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       855: aload         23
       857: athrow
       858: aload         18
       860: ifnull        902
       863: aload         18
       865: invokeinterface #37,  1           // InterfaceMethod java/sql/ResultSet.close:()V
       870: goto          902
       873: astore        19
       875: aload         18
       877: ifnull        899
       880: aload         18
       882: invokeinterface #37,  1           // InterfaceMethod java/sql/ResultSet.close:()V
       887: goto          899
       890: astore        20
       892: aload         19
       894: aload         20
       896: invokevirtual #44                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       899: aload         19
       901: athrow
       902: aload         17
       904: ifnull        946
       907: aload         17
       909: invokeinterface #40,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       914: goto          946
       917: astore        18
       919: aload         17
       921: ifnull        943
       924: aload         17
       926: invokeinterface #40,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       931: goto          943
       934: astore        19
       936: aload         18
       938: aload         19
       940: invokevirtual #44                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       943: aload         18
       945: athrow
       946: goto          1276
       949: aload_1
       950: ldc           #156                // String INSERT INTO items (owner_id, object_id, item_id, count, enchant_level, loc, loc_data, custom_type1, custom_type2, mana_left, time) VALUES (?, ?, ?, ?, ?, \'INVENTORY\', 0, 0, 0, -1, 0)
       952: invokeinterface #15,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       957: astore        15
       959: aload         15
       961: iconst_1
       962: iload         4
       964: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       969: aload         15
       971: iconst_2
       972: iload         11
       974: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       979: aload         15
       981: iconst_3
       982: iload         6
       984: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       989: aload         15
       991: iconst_4
       992: iload         7
       994: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       999: aload         15
      1001: iconst_5
      1002: iload         8
      1004: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
      1009: aload         15
      1011: invokeinterface #55,  1           // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
      1016: pop
      1017: aload         15
      1019: ifnull        1061
      1022: aload         15
      1024: invokeinterface #40,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
      1029: goto          1061
      1032: astore        16
      1034: aload         15
      1036: ifnull        1058
      1039: aload         15
      1041: invokeinterface #40,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
      1046: goto          1058
      1049: astore        17
      1051: aload         16
      1053: aload         17
      1055: invokevirtual #44                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
      1058: aload         16
      1060: athrow
      1061: iload         9
      1063: ifeq          1276
      1066: aload_1
      1067: ldc           #113                // String UPDATE augmentations SET item_oid=? WHERE item_oid=?
      1069: invokeinterface #15,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
      1074: astore        15
      1076: aload         15
      1078: iconst_1
      1079: iload         11
      1081: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
      1086: aload         15
      1088: iconst_2
      1089: iload         5
      1091: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
      1096: aload         15
      1098: invokeinterface #55,  1           // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
      1103: istore        16
      1105: iload         16
      1107: ifne          1232
      1110: iload         10
      1112: ldc           #153                // int 65535
      1114: iand
      1115: istore        17
      1117: iload         10
      1119: bipush        16
      1121: ishr
      1122: ldc           #153                // int 65535
      1124: iand
      1125: istore        18
      1127: iconst_1
      1128: istore        19
      1130: aload_1
      1131: ldc           #154                // String INSERT INTO augmentations (item_oid, attributes, skill_id, skill_level) VALUES (?, ?, ?, ?)
      1133: invokeinterface #15,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
      1138: astore        20
      1140: aload         20
      1142: iconst_1
      1143: iload         11
      1145: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
      1150: aload         20
      1152: iconst_2
      1153: iload         17
      1155: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
      1160: aload         20
      1162: iconst_3
      1163: iload         18
      1165: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
      1170: aload         20
      1172: iconst_4
      1173: iload         19
      1175: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
      1180: aload         20
      1182: invokeinterface #55,  1           // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
      1187: pop
      1188: aload         20
      1190: ifnull        1232
      1193: aload         20
      1195: invokeinterface #40,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
      1200: goto          1232
      1203: astore        21
      1205: aload         20
      1207: ifnull        1229
      1210: aload         20
      1212: invokeinterface #40,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
      1217: goto          1229
      1220: astore        22
      1222: aload         21
      1224: aload         22
      1226: invokevirtual #44                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
      1229: aload         21
      1231: athrow
      1232: aload         15
      1234: ifnull        1276
      1237: aload         15
      1239: invokeinterface #40,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
      1244: goto          1276
      1247: astore        16
      1249: aload         15
      1251: ifnull        1273
      1254: aload         15
      1256: invokeinterface #40,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
      1261: goto          1273
      1264: astore        17
      1266: aload         16
      1268: aload         17
      1270: invokevirtual #44                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
      1273: aload         16
      1275: athrow
      1276: aload         14
      1278: ifnull        1320
      1281: aload         14
      1283: invokeinterface #37,  1           // InterfaceMethod java/sql/ResultSet.close:()V
      1288: goto          1320
      1291: astore        15
      1293: aload         14
      1295: ifnull        1317
      1298: aload         14
      1300: invokeinterface #37,  1           // InterfaceMethod java/sql/ResultSet.close:()V
      1305: goto          1317
      1308: astore        16
      1310: aload         15
      1312: aload         16
      1314: invokevirtual #44                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
      1317: aload         15
      1319: athrow
      1320: aload         13
      1322: ifnull        1364
      1325: aload         13
      1327: invokeinterface #40,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
      1332: goto          1364
      1335: astore        14
      1337: aload         13
      1339: ifnull        1361
      1342: aload         13
      1344: invokeinterface #40,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
      1349: goto          1361
      1352: astore        15
      1354: aload         14
      1356: aload         15
      1358: invokevirtual #44                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
      1361: aload         14
      1363: athrow
      1364: goto          89
      1367: aload_3
      1368: ifnull        1407
      1371: aload_3
      1372: invokeinterface #37,  1           // InterfaceMethod java/sql/ResultSet.close:()V
      1377: goto          1407
      1380: astore        4
      1382: aload_3
      1383: ifnull        1404
      1386: aload_3
      1387: invokeinterface #37,  1           // InterfaceMethod java/sql/ResultSet.close:()V
      1392: goto          1404
      1395: astore        5
      1397: aload         4
      1399: aload         5
      1401: invokevirtual #44                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
      1404: aload         4
      1406: athrow
      1407: aload_2
      1408: ifnull        1444
      1411: aload_2
      1412: invokeinterface #40,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
      1417: goto          1444
      1420: astore_3
      1421: aload_2
      1422: ifnull        1442
      1425: aload_2
      1426: invokeinterface #40,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
      1431: goto          1442
      1434: astore        4
      1436: aload_3
      1437: aload         4
      1439: invokevirtual #44                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
      1442: aload_3
      1443: athrow
      1444: aload_1
      1445: ifnull        1479
      1448: aload_1
      1449: invokeinterface #41,  1           // InterfaceMethod java/sql/Connection.close:()V
      1454: goto          1479
      1457: astore_2
      1458: aload_1
      1459: ifnull        1477
      1462: aload_1
      1463: invokeinterface #41,  1           // InterfaceMethod java/sql/Connection.close:()V
      1468: goto          1477
      1471: astore_3
      1472: aload_2
      1473: aload_3
      1474: invokevirtual #44                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
      1477: aload_2
      1478: athrow
      1479: goto          1487
      1482: astore_1
      1483: aload_1
      1484: invokevirtual #50                 // Method java/lang/Exception.printStackTrace:()V
      1487: return
      Exception table:
         from    to  target type
            13    28    41   Class java/lang/Throwable
            46    52    55   Class java/lang/Throwable
           298   341   356   Class java/lang/Throwable
           363   370   373   Class java/lang/Throwable
           279   385   400   Class java/lang/Throwable
           407   414   417   Class java/lang/Throwable
           232   479   494   Class java/lang/Throwable
           501   508   511   Class java/lang/Throwable
           620   648   663   Class java/lang/Throwable
           670   677   680   Class java/lang/Throwable
           766   814   829   Class java/lang/Throwable
           836   843   846   Class java/lang/Throwable
           726   858   873   Class java/lang/Throwable
           880   887   890   Class java/lang/Throwable
           707   902   917   Class java/lang/Throwable
           924   931   934   Class java/lang/Throwable
           959  1017  1032   Class java/lang/Throwable
          1039  1046  1049   Class java/lang/Throwable
          1140  1188  1203   Class java/lang/Throwable
          1210  1217  1220   Class java/lang/Throwable
          1076  1232  1247   Class java/lang/Throwable
          1254  1261  1264   Class java/lang/Throwable
           582  1276  1291   Class java/lang/Throwable
          1298  1305  1308   Class java/lang/Throwable
           543  1320  1335   Class java/lang/Throwable
          1342  1349  1352   Class java/lang/Throwable
            89  1367  1380   Class java/lang/Throwable
          1386  1392  1395   Class java/lang/Throwable
            74  1407  1420   Class java/lang/Throwable
          1425  1431  1434   Class java/lang/Throwable
             4  1444  1457   Class java/lang/Throwable
          1462  1468  1471   Class java/lang/Throwable
             0  1479  1482   Class java/lang/Exception
      LineNumberTable:
        line 56: 0
        line 58: 4
        line 60: 13
        line 61: 21
        line 62: 28
        line 58: 41
        line 64: 65
        line 66: 74
        line 67: 82
        line 69: 89
        line 71: 98
        line 72: 108
        line 73: 118
        line 74: 128
        line 75: 138
        line 76: 148
        line 77: 158
        line 79: 168
        line 81: 176
        line 82: 186
        line 85: 191
        line 86: 203
        line 87: 208
        line 91: 217
        line 93: 222
        line 95: 232
        line 96: 242
        line 97: 252
        line 99: 260
        line 100: 263
        line 101: 266
        line 103: 269
        line 105: 279
        line 106: 289
        line 108: 298
        line 110: 308
        line 111: 319
        line 112: 330
        line 114: 341
        line 106: 356
        line 115: 385
        line 103: 400
        line 117: 429
        line 118: 439
        line 119: 460
        line 120: 479
        line 93: 494
        line 124: 523
        line 125: 530
        line 130: 533
        line 132: 543
        line 133: 553
        line 134: 563
        line 136: 573
        line 138: 582
        line 141: 592
        line 142: 603
        line 144: 610
        line 146: 620
        line 147: 630
        line 148: 640
        line 149: 648
        line 144: 663
        line 151: 692
        line 153: 697
        line 155: 707
        line 156: 717
        line 158: 726
        line 160: 736
        line 161: 743
        line 162: 753
        line 164: 756
        line 166: 766
        line 167: 776
        line 168: 786
        line 169: 796
        line 170: 806
        line 171: 814
        line 164: 829
        line 173: 858
        line 156: 873
        line 174: 902
        line 153: 917
        line 176: 946
        line 180: 949
        line 182: 959
        line 183: 969
        line 184: 979
        line 185: 989
        line 186: 999
        line 187: 1009
        line 188: 1017
        line 180: 1032
        line 190: 1061
        line 192: 1066
        line 194: 1076
        line 195: 1086
        line 196: 1096
        line 198: 1105
        line 200: 1110
        line 201: 1117
        line 202: 1127
        line 204: 1130
        line 206: 1140
        line 207: 1150
        line 208: 1160
        line 209: 1170
        line 210: 1180
        line 211: 1188
        line 204: 1203
        line 213: 1232
        line 192: 1247
        line 216: 1276
        line 136: 1291
        line 217: 1320
        line 130: 1335
        line 220: 1364
        line 221: 1367
        line 67: 1380
        line 222: 1407
        line 64: 1420
        line 223: 1444
        line 56: 1457
        line 227: 1479
        line 224: 1482
        line 226: 1483
        line 228: 1487
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           13      52     2    ps   Ljava/sql/PreparedStatement;
          298      87    19   rs2   Ljava/sql/ResultSet;
          279     150    18   sel   Ljava/sql/PreparedStatement;
          263     216    15 attributes   I
          266     213    16 skillId   I
          269     210    17 skillLevel   I
          439      40    18 fullAugmentId   I
          460      19    19 skill   Lext/mods/gameserver/skills/L2Skill;
          232     291    14 updateAug   Ljava/sql/PreparedStatement;
          203     327    13  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
          620      72    17 updateItem   Ljava/sql/PreparedStatement;
          766      92    22 insertAug   Ljava/sql/PreparedStatement;
          743     115    19 attributes   I
          753     105    20 skillId   I
          756     102    21 skillLevel   I
          726     176    18 rsAug   Ljava/sql/ResultSet;
          707     239    17 checkAug   Ljava/sql/PreparedStatement;
          603     343    15 currentCount   I
          610     336    16 newCount   I
          959     102    15 insertItem   Ljava/sql/PreparedStatement;
         1140      92    20 insertAug   Ljava/sql/PreparedStatement;
         1117     115    17 attributes   I
         1127     105    18 skillId   I
         1130     102    19 skillLevel   I
         1105     127    16 updated   I
         1076     200    15 updateAug   Ljava/sql/PreparedStatement;
          582     738    14   rsc   Ljava/sql/ResultSet;
          543     821    13 check   Ljava/sql/PreparedStatement;
          108    1256     4 senderId   I
          118    1246     5 oldObjectId   I
          128    1236     6 itemId   I
          138    1226     7 count   I
          148    1216     8 enchant   I
          158    1206     9 isAug   Z
          168    1196    10 augmentId   I
          176    1188    11 newobjectId   I
          186    1178    12 player   Lext/mods/gameserver/model/actor/Player;
           89    1318     3    rs   Ljava/sql/ResultSet;
           74    1370     2    ps   Ljava/sql/PreparedStatement;
            4    1475     1   con   Ljava/sql/Connection;
         1483       4     1     e   Ljava/lang/Exception;
            0    1488     0 emailId   I
      StackMapTable: number_of_entries = 74
        frame_type = 255 /* full_frame */
          offset_delta = 41
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 253 /* append */
          offset_delta = 23
          locals = [ class java/sql/PreparedStatement, class java/sql/ResultSet ]
        frame_type = 255 /* full_frame */
          offset_delta = 127
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, int, int, int, int, int, int, int, int, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/item/instance/ItemInstance ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 123
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, int, int, int, int, int, int, int, int, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/item/instance/ItemInstance, class java/sql/PreparedStatement, int, int, int, class java/sql/PreparedStatement, class java/sql/ResultSet ]
          stack = []
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, int, int, int, int, int, int, int, int, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/item/instance/ItemInstance, class java/sql/PreparedStatement, int, int, int, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, int, int, int, int, int, int, int, int, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/item/instance/ItemInstance, class java/sql/PreparedStatement, int, int, int, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ int ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/skills/L2Skill ]
        frame_type = 255 /* full_frame */
          offset_delta = 35
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, int, int, int, int, int, int, int, int, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/item/instance/ItemInstance, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, int, int, int, int, int, int, int, int, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/item/instance/ItemInstance, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 250 /* chop */
          offset_delta = 9
        frame_type = 255 /* full_frame */
          offset_delta = 129
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, int, int, int, int, int, int, int, int, class ext/mods/gameserver/model/actor/Player, class java/sql/PreparedStatement, class java/sql/ResultSet, int, int, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, int, int, int, int, int, int, int, int, class ext/mods/gameserver/model/actor/Player, class java/sql/PreparedStatement, class java/sql/ResultSet, int, int, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 255 /* full_frame */
          offset_delta = 136
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, int, int, int, int, int, int, int, int, class ext/mods/gameserver/model/actor/Player, class java/sql/PreparedStatement, class java/sql/ResultSet, int, int, class java/sql/PreparedStatement, class java/sql/ResultSet, int, int, int, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, int, int, int, int, int, int, int, int, class ext/mods/gameserver/model/actor/Player, class java/sql/PreparedStatement, class java/sql/ResultSet, int, int, class java/sql/PreparedStatement, class java/sql/ResultSet, int, int, int, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, int, int, int, int, int, int, int, int, class ext/mods/gameserver/model/actor/Player, class java/sql/PreparedStatement, class java/sql/ResultSet, int, int, class java/sql/PreparedStatement, class java/sql/ResultSet ]
          stack = []
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, int, int, int, int, int, int, int, int, class ext/mods/gameserver/model/actor/Player, class java/sql/PreparedStatement, class java/sql/ResultSet, int, int, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, int, int, int, int, int, int, int, int, class ext/mods/gameserver/model/actor/Player, class java/sql/PreparedStatement, class java/sql/ResultSet, int, int, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, int, int, int, int, int, int, int, int, class ext/mods/gameserver/model/actor/Player, class java/sql/PreparedStatement, class java/sql/ResultSet ]
          stack = []
        frame_type = 2 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 82
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, int, int, int, int, int, int, int, int, class ext/mods/gameserver/model/actor/Player, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, int, int, int, int, int, int, int, int, class ext/mods/gameserver/model/actor/Player, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 255 /* full_frame */
          offset_delta = 141
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, int, int, int, int, int, int, int, int, class ext/mods/gameserver/model/actor/Player, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/sql/PreparedStatement, int, int, int, int, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, int, int, int, int, int, int, int, int, class ext/mods/gameserver/model/actor/Player, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/sql/PreparedStatement, int, int, int, int, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, int, int, int, int, int, int, int, int, class ext/mods/gameserver/model/actor/Player, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/sql/PreparedStatement ]
          stack = []
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, int, int, int, int, int, int, int, int, class ext/mods/gameserver/model/actor/Player, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, int, int, int, int, int, int, int, int, class ext/mods/gameserver/model/actor/Player, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, int, int, int, int, int, int, int, int, class ext/mods/gameserver/model/actor/Player, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet ]
          stack = []
        frame_type = 2 /* same */
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ int, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 4 /* same */

  public static void claimEmail(int, int);
    descriptor: (II)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=5, locals=29, args_size=2
         0: invokestatic  #7                  // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         3: astore_2
         4: invokestatic  #158                // Method java/lang/System.currentTimeMillis:()J
         7: lstore_3
         8: aload_2
         9: ldc           #164                // String SELECT * FROM player_emails WHERE email_id=? AND status=\'PENDING\' AND expiration_time > ? AND target_id=? LIMIT 1
        11: invokeinterface #15,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        16: astore        5
        18: aload         5
        20: iconst_1
        21: iload_0
        22: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        27: aload         5
        29: iconst_2
        30: lload_3
        31: invokeinterface #166,  4          // InterfaceMethod java/sql/PreparedStatement.setLong:(IJ)V
        36: aload         5
        38: iconst_3
        39: iload_1
        40: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        45: aload         5
        47: invokeinterface #27,  1           // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
        52: astore        6
        54: aload         6
        56: invokeinterface #31,  1           // InterfaceMethod java/sql/ResultSet.next:()Z
        61: ifne          128
        64: invokestatic  #92                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
        67: iload_1
        68: invokevirtual #97                 // Method ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
        71: astore        7
        73: aload         7
        75: ifnull        93
        78: aload         7
        80: invokevirtual #170                // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
        83: ifeq          93
        86: aload         7
        88: ldc           #173                // String Email inválido, expirado ou não destinado a você.
        90: invokevirtual #143                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        93: aload         6
        95: ifnull        105
        98: aload         6
       100: invokeinterface #37,  1           // InterfaceMethod java/sql/ResultSet.close:()V
       105: aload         5
       107: ifnull        117
       110: aload         5
       112: invokeinterface #40,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       117: aload_2
       118: ifnull        127
       121: aload_2
       122: invokeinterface #41,  1           // InterfaceMethod java/sql/Connection.close:()V
       127: return
       128: aload         6
       130: ifnull        172
       133: aload         6
       135: invokeinterface #37,  1           // InterfaceMethod java/sql/ResultSet.close:()V
       140: goto          172
       143: astore        7
       145: aload         6
       147: ifnull        169
       150: aload         6
       152: invokeinterface #37,  1           // InterfaceMethod java/sql/ResultSet.close:()V
       157: goto          169
       160: astore        8
       162: aload         7
       164: aload         8
       166: invokevirtual #44                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       169: aload         7
       171: athrow
       172: aload         5
       174: ifnull        216
       177: aload         5
       179: invokeinterface #40,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       184: goto          216
       187: astore        6
       189: aload         5
       191: ifnull        213
       194: aload         5
       196: invokeinterface #40,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       201: goto          213
       204: astore        7
       206: aload         6
       208: aload         7
       210: invokevirtual #44                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       213: aload         6
       215: athrow
       216: aload_2
       217: ldc           #175                // String UPDATE player_emails SET status=? WHERE email_id=? AND status=?
       219: invokeinterface #15,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       224: astore        5
       226: aload         5
       228: iconst_1
       229: ldc           #177                // String CLAIMED
       231: invokeinterface #179,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
       236: aload         5
       238: iconst_2
       239: iload_0
       240: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       245: aload         5
       247: iconst_3
       248: ldc           #183                // String PENDING
       250: invokeinterface #179,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
       255: getstatic     #185                // Field java/lang/System.out:Ljava/io/PrintStream;
       258: iload_0
       259: invokedynamic #189,  0            // InvokeDynamic #0:makeConcatWithConstants:(I)Ljava/lang/String;
       264: invokevirtual #193                // Method java/io/PrintStream.println:(Ljava/lang/String;)V
       267: aload         5
       269: invokeinterface #55,  1           // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
       274: istore        6
       276: getstatic     #185                // Field java/lang/System.out:Ljava/io/PrintStream;
       279: iload         6
       281: invokedynamic #198,  0            // InvokeDynamic #1:makeConcatWithConstants:(I)Ljava/lang/String;
       286: invokevirtual #193                // Method java/io/PrintStream.println:(Ljava/lang/String;)V
       289: iload         6
       291: ifne          325
       294: getstatic     #185                // Field java/lang/System.out:Ljava/io/PrintStream;
       297: ldc           #199                // String [EmailDAO] Nenhuma linha foi atualizada - email já processado ou inválido
       299: invokevirtual #193                // Method java/io/PrintStream.println:(Ljava/lang/String;)V
       302: aload         5
       304: ifnull        314
       307: aload         5
       309: invokeinterface #40,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       314: aload_2
       315: ifnull        324
       318: aload_2
       319: invokeinterface #41,  1           // InterfaceMethod java/sql/Connection.close:()V
       324: return
       325: aload         5
       327: ifnull        369
       330: aload         5
       332: invokeinterface #40,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       337: goto          369
       340: astore        6
       342: aload         5
       344: ifnull        366
       347: aload         5
       349: invokeinterface #40,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       354: goto          366
       357: astore        7
       359: aload         6
       361: aload         7
       363: invokevirtual #44                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       366: aload         6
       368: athrow
       369: goto          548
       372: astore        5
       374: getstatic     #201                // Field java/lang/System.err:Ljava/io/PrintStream;
       377: aload         5
       379: invokevirtual #204                // Method java/lang/Exception.getMessage:()Ljava/lang/String;
       382: invokedynamic #208,  0            // InvokeDynamic #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       387: invokevirtual #193                // Method java/io/PrintStream.println:(Ljava/lang/String;)V
       390: aload         5
       392: invokevirtual #50                 // Method java/lang/Exception.printStackTrace:()V
       395: getstatic     #185                // Field java/lang/System.out:Ljava/io/PrintStream;
       398: ldc           #211                // String [EmailDAO] Tentando abordagem alternativa...
       400: invokevirtual #193                // Method java/io/PrintStream.println:(Ljava/lang/String;)V
       403: aload_2
       404: ldc           #213                // String UPDATE player_emails SET status=\'CLAIMED\' WHERE email_id=? AND status=\'PENDING\'
       406: invokeinterface #15,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       411: astore        6
       413: aload         6
       415: iconst_1
       416: iload_0
       417: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       422: aload         6
       424: invokeinterface #55,  1           // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
       429: istore        7
       431: getstatic     #185                // Field java/lang/System.out:Ljava/io/PrintStream;
       434: iload         7
       436: invokedynamic #215,  0            // InvokeDynamic #3:makeConcatWithConstants:(I)Ljava/lang/String;
       441: invokevirtual #193                // Method java/io/PrintStream.println:(Ljava/lang/String;)V
       444: iload         7
       446: ifne          472
       449: aload         6
       451: ifnull        461
       454: aload         6
       456: invokeinterface #40,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       461: aload_2
       462: ifnull        471
       465: aload_2
       466: invokeinterface #41,  1           // InterfaceMethod java/sql/Connection.close:()V
       471: return
       472: aload         6
       474: ifnull        516
       477: aload         6
       479: invokeinterface #40,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       484: goto          516
       487: astore        7
       489: aload         6
       491: ifnull        513
       494: aload         6
       496: invokeinterface #40,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       501: goto          513
       504: astore        8
       506: aload         7
       508: aload         8
       510: invokevirtual #44                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       513: aload         7
       515: athrow
       516: goto          548
       519: astore        6
       521: getstatic     #201                // Field java/lang/System.err:Ljava/io/PrintStream;
       524: aload         6
       526: invokevirtual #204                // Method java/lang/Exception.getMessage:()Ljava/lang/String;
       529: invokedynamic #216,  0            // InvokeDynamic #4:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       534: invokevirtual #193                // Method java/io/PrintStream.println:(Ljava/lang/String;)V
       537: aload_2
       538: ifnull        547
       541: aload_2
       542: invokeinterface #41,  1           // InterfaceMethod java/sql/Connection.close:()V
       547: return
       548: iconst_0
       549: istore        5
       551: iconst_m1
       552: istore        6
       554: iconst_0
       555: istore        7
       557: iconst_0
       558: istore        8
       560: aload_2
       561: ldc           #217                // String SELECT sender_id, item_object_id, item_id, count, enchant_level, is_augmented, augment_id, is_paid, payment_item_id, payment_item_count FROM player_emails WHERE email_id=?
       563: invokeinterface #15,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       568: astore        9
       570: aload         9
       572: iconst_1
       573: iload_0
       574: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       579: aload         9
       581: invokeinterface #27,  1           // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
       586: astore        10
       588: aload         10
       590: invokeinterface #31,  1           // InterfaceMethod java/sql/ResultSet.next:()Z
       595: ifeq          1611
       598: aload         10
       600: ldc           #61                 // String sender_id
       602: invokeinterface #63,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       607: istore        8
       609: aload         10
       611: ldc           #67                 // String item_object_id
       613: invokeinterface #63,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       618: istore        11
       620: aload         10
       622: ldc           #69                 // String item_id
       624: invokeinterface #63,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       629: istore        12
       631: aload         10
       633: ldc           #71                 // String count
       635: invokeinterface #63,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       640: istore        13
       642: aload         10
       644: ldc           #73                 // String enchant_level
       646: invokeinterface #63,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       651: istore        14
       653: aload         10
       655: ldc           #75                 // String is_augmented
       657: invokeinterface #77,  2           // InterfaceMethod java/sql/ResultSet.getBoolean:(Ljava/lang/String;)Z
       662: istore        15
       664: aload         10
       666: ldc           #81                 // String augment_id
       668: invokeinterface #63,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       673: istore        16
       675: aload         10
       677: ldc           #219                // String is_paid
       679: invokeinterface #77,  2           // InterfaceMethod java/sql/ResultSet.getBoolean:(Ljava/lang/String;)Z
       684: istore        5
       686: aload         10
       688: ldc           #221                // String payment_item_id
       690: invokeinterface #63,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       695: istore        6
       697: aload         10
       699: ldc           #223                // String payment_item_count
       701: invokeinterface #63,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       706: istore        7
       708: invokestatic  #83                 // Method ext/mods/gameserver/idfactory/IdFactory.getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
       711: invokevirtual #89                 // Method ext/mods/gameserver/idfactory/IdFactory.getNextId:()I
       714: istore        17
       716: invokestatic  #92                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
       719: iload_1
       720: invokevirtual #97                 // Method ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
       723: astore        18
       725: aload         18
       727: ifnull        1282
       730: aload         18
       732: invokevirtual #170                // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
       735: ifeq          1282
       738: aload         18
       740: iload         12
       742: iload         13
       744: iconst_1
       745: invokevirtual #101                // Method ext/mods/gameserver/model/actor/Player.addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
       748: astore        19
       750: iload         14
       752: ifle          764
       755: aload         19
       757: iload         14
       759: aload         18
       761: invokevirtual #107                // Method ext/mods/gameserver/model/item/instance/ItemInstance.setEnchantLevel:(ILext/mods/gameserver/model/actor/Playable;)V
       764: iload         15
       766: ifeq          1262
       769: aload_2
       770: ldc           #113                // String UPDATE augmentations SET item_oid=? WHERE item_oid=?
       772: invokeinterface #15,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       777: astore        20
       779: aload         20
       781: iconst_1
       782: iload         17
       784: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       789: aload         20
       791: iconst_2
       792: iload         11
       794: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       799: aload         20
       801: invokeinterface #55,  1           // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
       806: istore        21
       808: iload         21
       810: ifle          1046
       813: iload         16
       815: ldc           #153                // int 65535
       817: iand
       818: istore        22
       820: iload         16
       822: bipush        16
       824: ishr
       825: ldc           #153                // int 65535
       827: iand
       828: istore        23
       830: iconst_1
       831: istore        24
       833: aload_2
       834: ldc           #115                // String SELECT attributes, skill_id, skill_level FROM augmentations WHERE item_oid=?
       836: invokeinterface #15,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       841: astore        25
       843: aload         25
       845: iconst_1
       846: iload         17
       848: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       853: aload         25
       855: invokeinterface #27,  1           // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
       860: astore        26
       862: aload         26
       864: invokeinterface #31,  1           // InterfaceMethod java/sql/ResultSet.next:()Z
       869: ifeq          905
       872: aload         26
       874: ldc           #117                // String attributes
       876: invokeinterface #63,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       881: istore        22
       883: aload         26
       885: ldc           #119                // String skill_id
       887: invokeinterface #63,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       892: istore        23
       894: aload         26
       896: ldc           #121                // String skill_level
       898: invokeinterface #63,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       903: istore        24
       905: aload         26
       907: ifnull        949
       910: aload         26
       912: invokeinterface #37,  1           // InterfaceMethod java/sql/ResultSet.close:()V
       917: goto          949
       920: astore        27
       922: aload         26
       924: ifnull        946
       927: aload         26
       929: invokeinterface #37,  1           // InterfaceMethod java/sql/ResultSet.close:()V
       934: goto          946
       937: astore        28
       939: aload         27
       941: aload         28
       943: invokevirtual #44                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       946: aload         27
       948: athrow
       949: aload         25
       951: ifnull        993
       954: aload         25
       956: invokeinterface #40,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       961: goto          993
       964: astore        26
       966: aload         25
       968: ifnull        990
       971: aload         25
       973: invokeinterface #40,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       978: goto          990
       981: astore        27
       983: aload         26
       985: aload         27
       987: invokevirtual #44                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       990: aload         26
       992: athrow
       993: iload         22
       995: iload         23
       997: bipush        16
       999: ishl
      1000: ior
      1001: istore        25
      1003: iload         23
      1005: ifle          1021
      1008: invokestatic  #123                // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
      1011: iload         23
      1013: iload         24
      1015: invokevirtual #128                // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
      1018: goto          1022
      1021: aconst_null
      1022: astore        26
      1024: aload         19
      1026: new           #132                // class ext/mods/gameserver/model/Augmentation
      1029: dup
      1030: iload         25
      1032: aload         26
      1034: invokespecial #134                // Method ext/mods/gameserver/model/Augmentation."<init>":(ILext/mods/gameserver/skills/L2Skill;)V
      1037: aload         18
      1039: invokevirtual #137                // Method ext/mods/gameserver/model/item/instance/ItemInstance.setAugmentation:(Lext/mods/gameserver/model/Augmentation;Lext/mods/gameserver/model/actor/Player;)Z
      1042: pop
      1043: goto          1218
      1046: iload         16
      1048: ldc           #153                // int 65535
      1050: iand
      1051: istore        22
      1053: iload         16
      1055: bipush        16
      1057: ishr
      1058: ldc           #153                // int 65535
      1060: iand
      1061: istore        23
      1063: iconst_1
      1064: istore        24
      1066: aload_2
      1067: ldc           #154                // String INSERT INTO augmentations (item_oid, attributes, skill_id, skill_level) VALUES (?, ?, ?, ?)
      1069: invokeinterface #15,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
      1074: astore        25
      1076: aload         25
      1078: iconst_1
      1079: iload         17
      1081: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
      1086: aload         25
      1088: iconst_2
      1089: iload         22
      1091: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
      1096: aload         25
      1098: iconst_3
      1099: iload         23
      1101: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
      1106: aload         25
      1108: iconst_4
      1109: iload         24
      1111: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
      1116: aload         25
      1118: invokeinterface #55,  1           // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
      1123: pop
      1124: aload         25
      1126: ifnull        1168
      1129: aload         25
      1131: invokeinterface #40,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
      1136: goto          1168
      1139: astore        26
      1141: aload         25
      1143: ifnull        1165
      1146: aload         25
      1148: invokeinterface #40,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
      1153: goto          1165
      1156: astore        27
      1158: aload         26
      1160: aload         27
      1162: invokevirtual #44                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
      1165: aload         26
      1167: athrow
      1168: iload         22
      1170: iload         23
      1172: bipush        16
      1174: ishl
      1175: ior
      1176: istore        25
      1178: iload         23
      1180: ifle          1196
      1183: invokestatic  #123                // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
      1186: iload         23
      1188: iload         24
      1190: invokevirtual #128                // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
      1193: goto          1197
      1196: aconst_null
      1197: astore        26
      1199: aload         19
      1201: new           #132                // class ext/mods/gameserver/model/Augmentation
      1204: dup
      1205: iload         25
      1207: aload         26
      1209: invokespecial #134                // Method ext/mods/gameserver/model/Augmentation."<init>":(ILext/mods/gameserver/skills/L2Skill;)V
      1212: aload         18
      1214: invokevirtual #137                // Method ext/mods/gameserver/model/item/instance/ItemInstance.setAugmentation:(Lext/mods/gameserver/model/Augmentation;Lext/mods/gameserver/model/actor/Player;)Z
      1217: pop
      1218: aload         20
      1220: ifnull        1262
      1223: aload         20
      1225: invokeinterface #40,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
      1230: goto          1262
      1233: astore        21
      1235: aload         20
      1237: ifnull        1259
      1240: aload         20
      1242: invokeinterface #40,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
      1247: goto          1259
      1250: astore        22
      1252: aload         21
      1254: aload         22
      1256: invokevirtual #44                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
      1259: aload         21
      1261: athrow
      1262: aload         18
      1264: aload         19
      1266: invokevirtual #225                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getName:()Ljava/lang/String;
      1269: iload         13
      1271: invokedynamic #228,  0            // InvokeDynamic #5:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
      1276: invokevirtual #143                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1279: goto          1608
      1282: aload_2
      1283: ldc           #156                // String INSERT INTO items (owner_id, object_id, item_id, count, enchant_level, loc, loc_data, custom_type1, custom_type2, mana_left, time) VALUES (?, ?, ?, ?, ?, \'INVENTORY\', 0, 0, 0, -1, 0)
      1285: invokeinterface #15,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
      1290: astore        19
      1292: aload         19
      1294: iconst_1
      1295: iload_1
      1296: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
      1301: aload         19
      1303: iconst_2
      1304: iload         17
      1306: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
      1311: aload         19
      1313: iconst_3
      1314: iload         12
      1316: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
      1321: aload         19
      1323: iconst_4
      1324: iload         13
      1326: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
      1331: aload         19
      1333: iconst_5
      1334: iload         14
      1336: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
      1341: aload         19
      1343: invokeinterface #55,  1           // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
      1348: pop
      1349: aload         19
      1351: ifnull        1393
      1354: aload         19
      1356: invokeinterface #40,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
      1361: goto          1393
      1364: astore        20
      1366: aload         19
      1368: ifnull        1390
      1371: aload         19
      1373: invokeinterface #40,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
      1378: goto          1390
      1381: astore        21
      1383: aload         20
      1385: aload         21
      1387: invokevirtual #44                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
      1390: aload         20
      1392: athrow
      1393: iload         15
      1395: ifeq          1608
      1398: aload_2
      1399: ldc           #113                // String UPDATE augmentations SET item_oid=? WHERE item_oid=?
      1401: invokeinterface #15,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
      1406: astore        19
      1408: aload         19
      1410: iconst_1
      1411: iload         17
      1413: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
      1418: aload         19
      1420: iconst_2
      1421: iload         11
      1423: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
      1428: aload         19
      1430: invokeinterface #55,  1           // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
      1435: istore        20
      1437: iload         20
      1439: ifne          1564
      1442: iload         16
      1444: ldc           #153                // int 65535
      1446: iand
      1447: istore        21
      1449: iload         16
      1451: bipush        16
      1453: ishr
      1454: ldc           #153                // int 65535
      1456: iand
      1457: istore        22
      1459: iconst_1
      1460: istore        23
      1462: aload_2
      1463: ldc           #154                // String INSERT INTO augmentations (item_oid, attributes, skill_id, skill_level) VALUES (?, ?, ?, ?)
      1465: invokeinterface #15,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
      1470: astore        24
      1472: aload         24
      1474: iconst_1
      1475: iload         17
      1477: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
      1482: aload         24
      1484: iconst_2
      1485: iload         21
      1487: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
      1492: aload         24
      1494: iconst_3
      1495: iload         22
      1497: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
      1502: aload         24
      1504: iconst_4
      1505: iload         23
      1507: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
      1512: aload         24
      1514: invokeinterface #55,  1           // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
      1519: pop
      1520: aload         24
      1522: ifnull        1564
      1525: aload         24
      1527: invokeinterface #40,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
      1532: goto          1564
      1535: astore        25
      1537: aload         24
      1539: ifnull        1561
      1542: aload         24
      1544: invokeinterface #40,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
      1549: goto          1561
      1552: astore        26
      1554: aload         25
      1556: aload         26
      1558: invokevirtual #44                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
      1561: aload         25
      1563: athrow
      1564: aload         19
      1566: ifnull        1608
      1569: aload         19
      1571: invokeinterface #40,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
      1576: goto          1608
      1579: astore        20
      1581: aload         19
      1583: ifnull        1605
      1586: aload         19
      1588: invokeinterface #40,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
      1593: goto          1605
      1596: astore        21
      1598: aload         20
      1600: aload         21
      1602: invokevirtual #44                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
      1605: aload         20
      1607: athrow
      1608: goto          588
      1611: aload         10
      1613: ifnull        1655
      1616: aload         10
      1618: invokeinterface #37,  1           // InterfaceMethod java/sql/ResultSet.close:()V
      1623: goto          1655
      1626: astore        11
      1628: aload         10
      1630: ifnull        1652
      1633: aload         10
      1635: invokeinterface #37,  1           // InterfaceMethod java/sql/ResultSet.close:()V
      1640: goto          1652
      1643: astore        12
      1645: aload         11
      1647: aload         12
      1649: invokevirtual #44                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
      1652: aload         11
      1654: athrow
      1655: aload         9
      1657: ifnull        1699
      1660: aload         9
      1662: invokeinterface #40,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
      1667: goto          1699
      1670: astore        10
      1672: aload         9
      1674: ifnull        1696
      1677: aload         9
      1679: invokeinterface #40,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
      1684: goto          1696
      1687: astore        11
      1689: aload         10
      1691: aload         11
      1693: invokevirtual #44                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
      1696: aload         10
      1698: athrow
      1699: iload         5
      1701: ifeq          2098
      1704: iload         6
      1706: ifle          2098
      1709: iload         7
      1711: ifle          2098
      1714: invokestatic  #92                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
      1717: iload_1
      1718: invokevirtual #97                 // Method ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
      1721: astore        9
      1723: aload         9
      1725: ifnull        2016
      1728: aload         9
      1730: invokevirtual #170                // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
      1733: ifeq          2016
      1736: aload         9
      1738: invokevirtual #231                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
      1741: iload         6
      1743: invokevirtual #235                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
      1746: astore        10
      1748: aload         10
      1750: ifnull        1763
      1753: aload         10
      1755: invokevirtual #241                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
      1758: iload         7
      1760: if_icmpge     1852
      1763: aload         9
      1765: ldc           #244                // String Pagamento insuficiente. Email não reclamado.
      1767: invokevirtual #143                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1770: aload_2
      1771: ldc           #246                // String UPDATE player_emails SET status=\'PENDING\' WHERE email_id=?
      1773: invokeinterface #15,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
      1778: astore        11
      1780: aload         11
      1782: iconst_1
      1783: iload_0
      1784: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
      1789: aload         11
      1791: invokeinterface #55,  1           // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
      1796: pop
      1797: aload         11
      1799: ifnull        1841
      1802: aload         11
      1804: invokeinterface #40,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
      1809: goto          1841
      1812: astore        12
      1814: aload         11
      1816: ifnull        1838
      1819: aload         11
      1821: invokeinterface #40,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
      1826: goto          1838
      1829: astore        13
      1831: aload         12
      1833: aload         13
      1835: invokevirtual #44                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
      1838: aload         12
      1840: athrow
      1841: aload_2
      1842: ifnull        1851
      1845: aload_2
      1846: invokeinterface #41,  1           // InterfaceMethod java/sql/Connection.close:()V
      1851: return
      1852: aload         9
      1854: iload         6
      1856: iload         7
      1858: iconst_1
      1859: invokevirtual #248                // Method ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
      1862: pop
      1863: invokestatic  #92                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
      1866: iload         8
      1868: invokevirtual #97                 // Method ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
      1871: astore        11
      1873: aload         11
      1875: ifnull        1907
      1878: aload         11
      1880: invokevirtual #170                // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
      1883: ifeq          1907
      1886: aload         11
      1888: iload         6
      1890: iload         7
      1892: iconst_1
      1893: invokevirtual #101                // Method ext/mods/gameserver/model/actor/Player.addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
      1896: pop
      1897: aload         11
      1899: ldc           #252                // String Você recebeu pagamento de um email reclamado.
      1901: invokevirtual #143                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1904: goto          2013
      1907: aload_2
      1908: ldc           #254                // String INSERT INTO items (owner_id, object_id, item_id, count, enchant_level, loc, loc_data) VALUES (?, ?, ?, ?, 0, \'INVENTORY\', 0)
      1910: invokeinterface #15,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
      1915: astore        12
      1917: aload         12
      1919: iconst_1
      1920: iload         8
      1922: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
      1927: aload         12
      1929: iconst_2
      1930: invokestatic  #83                 // Method ext/mods/gameserver/idfactory/IdFactory.getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
      1933: invokevirtual #89                 // Method ext/mods/gameserver/idfactory/IdFactory.getNextId:()I
      1936: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
      1941: aload         12
      1943: iconst_3
      1944: iload         6
      1946: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
      1951: aload         12
      1953: iconst_4
      1954: iload         7
      1956: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
      1961: aload         12
      1963: invokeinterface #55,  1           // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
      1968: pop
      1969: aload         12
      1971: ifnull        2013
      1974: aload         12
      1976: invokeinterface #40,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
      1981: goto          2013
      1984: astore        13
      1986: aload         12
      1988: ifnull        2010
      1991: aload         12
      1993: invokeinterface #40,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
      1998: goto          2010
      2001: astore        14
      2003: aload         13
      2005: aload         14
      2007: invokevirtual #44                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
      2010: aload         13
      2012: athrow
      2013: goto          2098
      2016: aload_2
      2017: ldc           #246                // String UPDATE player_emails SET status=\'PENDING\' WHERE email_id=?
      2019: invokeinterface #15,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
      2024: astore        10
      2026: aload         10
      2028: iconst_1
      2029: iload_0
      2030: invokeinterface #21,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
      2035: aload         10
      2037: invokeinterface #55,  1           // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
      2042: pop
      2043: aload         10
      2045: ifnull        2087
      2048: aload         10
      2050: invokeinterface #40,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
      2055: goto          2087
      2058: astore        11
      2060: aload         10
      2062: ifnull        2084
      2065: aload         10
      2067: invokeinterface #40,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
      2072: goto          2084
      2075: astore        12
      2077: aload         11
      2079: aload         12
      2081: invokevirtual #44                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
      2084: aload         11
      2086: athrow
      2087: aload_2
      2088: ifnull        2097
      2091: aload_2
      2092: invokeinterface #41,  1           // InterfaceMethod java/sql/Connection.close:()V
      2097: return
      2098: invokestatic  #256                // Method ext/mods/email/task/EmailDeliveryTask.getInstance:()Lext/mods/email/task/EmailDeliveryTask;
      2101: iload_0
      2102: invokevirtual #261                // Method ext/mods/email/task/EmailDeliveryTask.cancel:(I)V
      2105: aload_2
      2106: ifnull        2142
      2109: aload_2
      2110: invokeinterface #41,  1           // InterfaceMethod java/sql/Connection.close:()V
      2115: goto          2142
      2118: astore_3
      2119: aload_2
      2120: ifnull        2140
      2123: aload_2
      2124: invokeinterface #41,  1           // InterfaceMethod java/sql/Connection.close:()V
      2129: goto          2140
      2132: astore        4
      2134: aload_3
      2135: aload         4
      2137: invokevirtual #44                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
      2140: aload_3
      2141: athrow
      2142: goto          2176
      2145: astore_2
      2146: aload_2
      2147: invokevirtual #50                 // Method java/lang/Exception.printStackTrace:()V
      2150: invokestatic  #92                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
      2153: iload_1
      2154: invokevirtual #97                 // Method ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
      2157: astore_3
      2158: aload_3
      2159: ifnull        2176
      2162: aload_3
      2163: invokevirtual #170                // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
      2166: ifeq          2176
      2169: aload_3
      2170: ldc_w         #265                // String Erro ao reclamar email. Tente novamente.
      2173: invokevirtual #143                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      2176: return
      Exception table:
         from    to  target type
            54    93   143   Class java/lang/Throwable
           150   157   160   Class java/lang/Throwable
            18   105   187   Class java/lang/Throwable
           128   172   187   Class java/lang/Throwable
           194   201   204   Class java/lang/Throwable
           226   302   340   Class java/lang/Throwable
           347   354   357   Class java/lang/Throwable
           216   314   372   Class java/lang/Exception
           325   369   372   Class java/lang/Exception
           413   449   487   Class java/lang/Throwable
           494   501   504   Class java/lang/Throwable
           395   461   519   Class java/lang/Exception
           472   516   519   Class java/lang/Exception
           862   905   920   Class java/lang/Throwable
           927   934   937   Class java/lang/Throwable
           843   949   964   Class java/lang/Throwable
           971   978   981   Class java/lang/Throwable
          1076  1124  1139   Class java/lang/Throwable
          1146  1153  1156   Class java/lang/Throwable
           779  1218  1233   Class java/lang/Throwable
          1240  1247  1250   Class java/lang/Throwable
          1292  1349  1364   Class java/lang/Throwable
          1371  1378  1381   Class java/lang/Throwable
          1472  1520  1535   Class java/lang/Throwable
          1542  1549  1552   Class java/lang/Throwable
          1408  1564  1579   Class java/lang/Throwable
          1586  1593  1596   Class java/lang/Throwable
           588  1611  1626   Class java/lang/Throwable
          1633  1640  1643   Class java/lang/Throwable
           570  1655  1670   Class java/lang/Throwable
          1677  1684  1687   Class java/lang/Throwable
          1780  1797  1812   Class java/lang/Throwable
          1819  1826  1829   Class java/lang/Throwable
          1917  1969  1984   Class java/lang/Throwable
          1991  1998  2001   Class java/lang/Throwable
          2026  2043  2058   Class java/lang/Throwable
          2065  2072  2075   Class java/lang/Throwable
             4   117  2118   Class java/lang/Throwable
           128   314  2118   Class java/lang/Throwable
           325   461  2118   Class java/lang/Throwable
           472   537  2118   Class java/lang/Throwable
           548  1841  2118   Class java/lang/Throwable
          1852  2087  2118   Class java/lang/Throwable
          2098  2105  2118   Class java/lang/Throwable
          2123  2129  2132   Class java/lang/Throwable
             0   127  2145   Class java/lang/Exception
           128   324  2145   Class java/lang/Exception
           325   471  2145   Class java/lang/Exception
           472   547  2145   Class java/lang/Exception
           548  1851  2145   Class java/lang/Exception
          1852  2097  2145   Class java/lang/Exception
          2098  2142  2145   Class java/lang/Exception
      LineNumberTable:
        line 231: 0
        line 232: 4
        line 233: 8
        line 235: 18
        line 236: 27
        line 237: 36
        line 238: 45
        line 239: 54
        line 240: 64
        line 241: 73
        line 242: 86
        line 246: 93
        line 247: 105
        line 425: 117
        line 244: 127
        line 246: 128
        line 238: 143
        line 247: 172
        line 233: 187
        line 249: 216
        line 252: 226
        line 253: 236
        line 254: 245
        line 256: 255
        line 258: 267
        line 259: 276
        line 261: 289
        line 262: 294
        line 265: 302
        line 425: 314
        line 263: 324
        line 265: 325
        line 249: 340
        line 282: 369
        line 265: 372
        line 266: 374
        line 267: 390
        line 270: 395
        line 271: 403
        line 273: 413
        line 274: 422
        line 275: 431
        line 276: 444
        line 277: 449
        line 425: 461
        line 276: 471
        line 277: 472
        line 271: 487
        line 281: 516
        line 278: 519
        line 279: 521
        line 425: 537
        line 280: 547
        line 284: 548
        line 285: 551
        line 286: 554
        line 287: 557
        line 289: 560
        line 291: 570
        line 292: 579
        line 293: 588
        line 294: 598
        line 295: 609
        line 296: 620
        line 297: 631
        line 298: 642
        line 299: 653
        line 300: 664
        line 301: 675
        line 302: 686
        line 303: 697
        line 305: 708
        line 306: 716
        line 308: 725
        line 309: 738
        line 310: 750
        line 311: 764
        line 312: 769
        line 313: 779
        line 314: 789
        line 315: 799
        line 316: 808
        line 317: 813
        line 318: 820
        line 319: 830
        line 320: 833
        line 321: 843
        line 322: 853
        line 323: 862
        line 324: 872
        line 325: 883
        line 326: 894
        line 328: 905
        line 322: 920
        line 329: 949
        line 320: 964
        line 330: 993
        line 331: 1003
        line 332: 1024
        line 333: 1043
        line 334: 1046
        line 335: 1053
        line 336: 1063
        line 337: 1066
        line 339: 1076
        line 340: 1086
        line 341: 1096
        line 342: 1106
        line 343: 1116
        line 344: 1124
        line 337: 1139
        line 345: 1168
        line 346: 1178
        line 347: 1199
        line 349: 1218
        line 312: 1233
        line 351: 1262
        line 352: 1279
        line 353: 1282
        line 355: 1292
        line 356: 1301
        line 357: 1311
        line 358: 1321
        line 359: 1331
        line 360: 1341
        line 361: 1349
        line 353: 1364
        line 362: 1393
        line 363: 1398
        line 364: 1408
        line 365: 1418
        line 366: 1428
        line 367: 1437
        line 368: 1442
        line 369: 1449
        line 370: 1459
        line 371: 1462
        line 373: 1472
        line 374: 1482
        line 375: 1492
        line 376: 1502
        line 377: 1512
        line 378: 1520
        line 371: 1535
        line 380: 1564
        line 363: 1579
        line 383: 1608
        line 384: 1611
        line 292: 1626
        line 385: 1655
        line 289: 1670
        line 387: 1699
        line 388: 1714
        line 389: 1723
        line 390: 1736
        line 391: 1748
        line 392: 1763
        line 393: 1770
        line 394: 1780
        line 395: 1789
        line 396: 1797
        line 393: 1812
        line 425: 1841
        line 397: 1851
        line 399: 1852
        line 401: 1863
        line 402: 1873
        line 403: 1886
        line 404: 1897
        line 406: 1907
        line 408: 1917
        line 409: 1927
        line 410: 1941
        line 411: 1951
        line 412: 1961
        line 413: 1969
        line 406: 1984
        line 415: 2013
        line 416: 2016
        line 417: 2026
        line 418: 2035
        line 419: 2043
        line 416: 2058
        line 425: 2087
        line 420: 2097
        line 424: 2098
        line 425: 2105
        line 231: 2118
        line 431: 2142
        line 425: 2145
        line 426: 2146
        line 427: 2150
        line 428: 2158
        line 429: 2169
        line 432: 2176
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           73      55     7 recipient   Lext/mods/gameserver/model/actor/Player;
           54     118     6    rs   Ljava/sql/ResultSet;
           18     198     5 check   Ljava/sql/PreparedStatement;
          276      49     6 updated   I
          226     143     5    ps   Ljava/sql/PreparedStatement;
          431      41     7 updated2   I
          413     103     6   ps2   Ljava/sql/PreparedStatement;
          521      27     6    e2   Ljava/lang/Exception;
          374     174     5     e   Ljava/lang/Exception;
          862      87    26   rs2   Ljava/sql/ResultSet;
          843     150    25   sel   Ljava/sql/PreparedStatement;
          820     223    22 attributes   I
          830     213    23 skillId   I
          833     210    24 skillLevel   I
         1003      40    25 fullAugmentId   I
         1024      19    26 skill   Lext/mods/gameserver/skills/L2Skill;
         1076      92    25 insertAug   Ljava/sql/PreparedStatement;
         1053     165    22 attributes   I
         1063     155    23 skillId   I
         1066     152    24 skillLevel   I
         1178      40    25 fullAugmentId   I
         1199      19    26 skill   Lext/mods/gameserver/skills/L2Skill;
          808     410    21 updated   I
          779     483    20 updateAug   Ljava/sql/PreparedStatement;
          750     529    19  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
         1292     101    19 insertItem   Ljava/sql/PreparedStatement;
         1472      92    24 insertAug   Ljava/sql/PreparedStatement;
         1449     115    21 attributes   I
         1459     105    22 skillId   I
         1462     102    23 skillLevel   I
         1437     127    20 updated   I
         1408     200    19 updateAug   Ljava/sql/PreparedStatement;
          620     988    11 oldObjectId   I
          631     977    12 itemId   I
          642     966    13 count   I
          653     955    14 enchant   I
          664     944    15 isAug   Z
          675     933    16 augmentId   I
          716     892    17 newObjectId   I
          725     883    18 recipient   Lext/mods/gameserver/model/actor/Player;
          588    1067    10    rs   Ljava/sql/ResultSet;
          570    1129     9    ps   Ljava/sql/PreparedStatement;
         1780      61    11 revert   Ljava/sql/PreparedStatement;
         1917      96    12 insertPayment   Ljava/sql/PreparedStatement;
         1748     265    10 paymentItem   Lext/mods/gameserver/model/item/instance/ItemInstance;
         1873     140    11 sender   Lext/mods/gameserver/model/actor/Player;
         2026      61    10 revert   Ljava/sql/PreparedStatement;
         1723     375     9 recipient   Lext/mods/gameserver/model/actor/Player;
            8    2097     3   now   J
          551    1554     5 isPaid   Z
          554    1551     6 paymentItemId   I
          557    1548     7 paymentAmount   I
          560    1545     8 senderId   I
            4    2138     2   con   Ljava/sql/Connection;
         2158      18     3 recipient   Lext/mods/gameserver/model/actor/Player;
         2146      30     2     e   Ljava/lang/Exception;
            0    2177     0 emailId   I
            0    2177     1 recipientId   I
      StackMapTable: number_of_entries = 103
        frame_type = 255 /* full_frame */
          offset_delta = 93
          locals = [ int, int, class java/sql/Connection, long, class java/sql/PreparedStatement, class java/sql/ResultSet, class ext/mods/gameserver/model/actor/Player ]
          stack = []
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 9 /* same */
        frame_type = 250 /* chop */
          offset_delta = 0
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ int, int, class java/sql/Connection, long, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ int, int, class java/sql/Connection, long, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 253 /* append */
          offset_delta = 97
          locals = [ class java/sql/PreparedStatement, int ]
        frame_type = 9 /* same */
        frame_type = 250 /* chop */
          offset_delta = 0
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ int, int, class java/sql/Connection, long, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 254 /* append */
          offset_delta = 88
          locals = [ class java/lang/Exception, class java/sql/PreparedStatement, int ]
        frame_type = 9 /* same */
        frame_type = 250 /* chop */
          offset_delta = 0
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ int, int, class java/sql/Connection, long, class java/lang/Exception, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ class java/lang/Exception ]
        frame_type = 249 /* chop */
          offset_delta = 0
        frame_type = 255 /* full_frame */
          offset_delta = 39
          locals = [ int, int, class java/sql/Connection, long, int, int, int, int, class java/sql/PreparedStatement, class java/sql/ResultSet ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 175
          locals = [ int, int, class java/sql/Connection, long, int, int, int, int, class java/sql/PreparedStatement, class java/sql/ResultSet, int, int, int, int, int, int, int, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/item/instance/ItemInstance ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 140
          locals = [ int, int, class java/sql/Connection, long, int, int, int, int, class java/sql/PreparedStatement, class java/sql/ResultSet, int, int, int, int, int, int, int, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/item/instance/ItemInstance, class java/sql/PreparedStatement, int, int, int, int, class java/sql/PreparedStatement, class java/sql/ResultSet ]
          stack = []
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ int, int, class java/sql/Connection, long, int, int, int, int, class java/sql/PreparedStatement, class java/sql/ResultSet, int, int, int, int, int, int, int, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/item/instance/ItemInstance, class java/sql/PreparedStatement, int, int, int, int, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ int, int, class java/sql/Connection, long, int, int, int, int, class java/sql/PreparedStatement, class java/sql/ResultSet, int, int, int, int, int, int, int, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/item/instance/ItemInstance, class java/sql/PreparedStatement, int, int, int, int, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ int ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/skills/L2Skill ]
        frame_type = 255 /* full_frame */
          offset_delta = 23
          locals = [ int, int, class java/sql/Connection, long, int, int, int, int, class java/sql/PreparedStatement, class java/sql/ResultSet, int, int, int, int, int, int, int, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/item/instance/ItemInstance, class java/sql/PreparedStatement, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 92
          locals = [ int, int, class java/sql/Connection, long, int, int, int, int, class java/sql/PreparedStatement, class java/sql/ResultSet, int, int, int, int, int, int, int, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/item/instance/ItemInstance, class java/sql/PreparedStatement, int, int, int, int, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ int, int, class java/sql/Connection, long, int, int, int, int, class java/sql/PreparedStatement, class java/sql/ResultSet, int, int, int, int, int, int, int, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/item/instance/ItemInstance, class java/sql/PreparedStatement, int, int, int, int, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ int ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/skills/L2Skill ]
        frame_type = 255 /* full_frame */
          offset_delta = 20
          locals = [ int, int, class java/sql/Connection, long, int, int, int, int, class java/sql/PreparedStatement, class java/sql/ResultSet, int, int, int, int, int, int, int, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/item/instance/ItemInstance, class java/sql/PreparedStatement ]
          stack = []
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ int, int, class java/sql/Connection, long, int, int, int, int, class java/sql/PreparedStatement, class java/sql/ResultSet, int, int, int, int, int, int, int, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/item/instance/ItemInstance, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 250 /* chop */
          offset_delta = 19
        frame_type = 255 /* full_frame */
          offset_delta = 81
          locals = [ int, int, class java/sql/Connection, long, int, int, int, int, class java/sql/PreparedStatement, class java/sql/ResultSet, int, int, int, int, int, int, int, class ext/mods/gameserver/model/actor/Player, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ int, int, class java/sql/Connection, long, int, int, int, int, class java/sql/PreparedStatement, class java/sql/ResultSet, int, int, int, int, int, int, int, class ext/mods/gameserver/model/actor/Player, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 255 /* full_frame */
          offset_delta = 141
          locals = [ int, int, class java/sql/Connection, long, int, int, int, int, class java/sql/PreparedStatement, class java/sql/ResultSet, int, int, int, int, int, int, int, class ext/mods/gameserver/model/actor/Player, class java/sql/PreparedStatement, int, int, int, int, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ int, int, class java/sql/Connection, long, int, int, int, int, class java/sql/PreparedStatement, class java/sql/ResultSet, int, int, int, int, int, int, int, class ext/mods/gameserver/model/actor/Player, class java/sql/PreparedStatement, int, int, int, int, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ int, int, class java/sql/Connection, long, int, int, int, int, class java/sql/PreparedStatement, class java/sql/ResultSet, int, int, int, int, int, int, int, class ext/mods/gameserver/model/actor/Player, class java/sql/PreparedStatement ]
          stack = []
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ int, int, class java/sql/Connection, long, int, int, int, int, class java/sql/PreparedStatement, class java/sql/ResultSet, int, int, int, int, int, int, int, class ext/mods/gameserver/model/actor/Player, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ int, int, class java/sql/Connection, long, int, int, int, int, class java/sql/PreparedStatement, class java/sql/ResultSet ]
          stack = []
        frame_type = 2 /* same */
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ int, int, class java/sql/Connection, long, int, int, int, int, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ int, int, class java/sql/Connection, long, int, int, int, int, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 253 /* append */
          offset_delta = 63
          locals = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 255 /* full_frame */
          offset_delta = 48
          locals = [ int, int, class java/sql/Connection, long, int, int, int, int, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/item/instance/ItemInstance, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ int, int, class java/sql/Connection, long, int, int, int, int, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/item/instance/ItemInstance, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 9 /* same */
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 54
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 76
          locals = [ int, int, class java/sql/Connection, long, int, int, int, int, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/model/actor/Player, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ int, int, class java/sql/Connection, long, int, int, int, int, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/model/actor/Player, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ int, int, class java/sql/Connection, long, int, int, int, int, class ext/mods/gameserver/model/actor/Player ]
          stack = []
        frame_type = 2 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 41
          locals = [ int, int, class java/sql/Connection, long, int, int, int, int, class ext/mods/gameserver/model/actor/Player, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ int, int, class java/sql/Connection, long, int, int, int, int, class ext/mods/gameserver/model/actor/Player, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 9 /* same */
        frame_type = 250 /* chop */
          offset_delta = 0
        frame_type = 255 /* full_frame */
          offset_delta = 19
          locals = [ int, int, class java/sql/Connection ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ int, int, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 30 /* same */
}
SourceFile: "EmailDAO.java"
BootstrapMethods:
  0: #351 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #339 [EmailDAO] Tentando atualizar status para CLAIMED, emailId: \u0001
  1: #351 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #341 [EmailDAO] Linhas atualizadas: \u0001
  2: #351 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #343 [EmailDAO] Erro ao atualizar status para CLAIMED: \u0001
  3: #351 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #345 [EmailDAO] Abordagem alternativa - Linhas atualizadas: \u0001
  4: #351 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #347 [EmailDAO] Abordagem alternativa também falhou: \u0001
  5: #351 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #349 Você recebeu: \u0001 x\u0001
InnerClasses:
  public static final #362= #358 of #360; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
