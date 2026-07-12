// Bytecode for: ext.mods.gameserver.network.clientpackets.RequestChangePetName
// File: ext\mods\gameserver\network\clientpackets\RequestChangePetName.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/network/clientpackets/RequestChangePetName.class
  Last modified 9 de jul de 2026; size 4316 bytes
  MD5 checksum 6a937b61657e7e875ab5daffb01db670
  Compiled from "RequestChangePetName.java"
public final class ext.mods.gameserver.network.clientpackets.RequestChangePetName extends ext.mods.gameserver.network.clientpackets.L2GameClientPacket
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/network/clientpackets/RequestChangePetName
  super_class: #2                         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
  interfaces: 0, fields: 2, methods: 4, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
    #2 = Class              #4            // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               ext/mods/gameserver/network/clientpackets/L2GameClientPacket
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/network/clientpackets/RequestChangePetName.readS:()Ljava/lang/String;
    #8 = Class              #10           // ext/mods/gameserver/network/clientpackets/RequestChangePetName
    #9 = NameAndType        #11:#12       // readS:()Ljava/lang/String;
   #10 = Utf8               ext/mods/gameserver/network/clientpackets/RequestChangePetName
   #11 = Utf8               readS
   #12 = Utf8               ()Ljava/lang/String;
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/network/clientpackets/RequestChangePetName._name:Ljava/lang/String;
   #14 = NameAndType        #15:#16       // _name:Ljava/lang/String;
   #15 = Utf8               _name
   #16 = Utf8               Ljava/lang/String;
   #17 = Methodref          #8.#18        // ext/mods/gameserver/network/clientpackets/RequestChangePetName.getClient:()Lext/mods/commons/mmocore/MMOClient;
   #18 = NameAndType        #19:#20       // getClient:()Lext/mods/commons/mmocore/MMOClient;
   #19 = Utf8               getClient
   #20 = Utf8               ()Lext/mods/commons/mmocore/MMOClient;
   #21 = Class              #22           // ext/mods/gameserver/network/GameClient
   #22 = Utf8               ext/mods/gameserver/network/GameClient
   #23 = Methodref          #21.#24       // ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
   #24 = NameAndType        #25:#26       // getPlayer:()Lext/mods/gameserver/model/actor/Player;
   #25 = Utf8               getPlayer
   #26 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #27 = Methodref          #28.#29       // ext/mods/gameserver/model/actor/Player.hasPet:()Z
   #28 = Class              #30           // ext/mods/gameserver/model/actor/Player
   #29 = NameAndType        #31:#32       // hasPet:()Z
   #30 = Utf8               ext/mods/gameserver/model/actor/Player
   #31 = Utf8               hasPet
   #32 = Utf8               ()Z
   #33 = Methodref          #34.#35       // java/lang/String.length:()I
   #34 = Class              #36           // java/lang/String
   #35 = NameAndType        #37:#38       // length:()I
   #36 = Utf8               java/lang/String
   #37 = Utf8               length
   #38 = Utf8               ()I
   #39 = Fieldref           #40.#41       // ext/mods/gameserver/network/SystemMessageId.NAMING_CHARNAME_UP_TO_16CHARS:Lext/mods/gameserver/network/SystemMessageId;
   #40 = Class              #42           // ext/mods/gameserver/network/SystemMessageId
   #41 = NameAndType        #43:#44       // NAMING_CHARNAME_UP_TO_16CHARS:Lext/mods/gameserver/network/SystemMessageId;
   #42 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #43 = Utf8               NAMING_CHARNAME_UP_TO_16CHARS
   #44 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #45 = Methodref          #28.#46       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #46 = NameAndType        #47:#48       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #47 = Utf8               sendPacket
   #48 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #49 = Methodref          #28.#50       // ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
   #50 = NameAndType        #51:#52       // getSummon:()Lext/mods/gameserver/model/actor/Summon;
   #51 = Utf8               getSummon
   #52 = Utf8               ()Lext/mods/gameserver/model/actor/Summon;
   #53 = Class              #54           // ext/mods/gameserver/model/actor/instance/Pet
   #54 = Utf8               ext/mods/gameserver/model/actor/instance/Pet
   #55 = Methodref          #53.#56       // ext/mods/gameserver/model/actor/instance/Pet.getName:()Ljava/lang/String;
   #56 = NameAndType        #57:#12       // getName:()Ljava/lang/String;
   #57 = Utf8               getName
   #58 = Fieldref           #40.#59       // ext/mods/gameserver/network/SystemMessageId.NAMING_YOU_CANNOT_SET_NAME_OF_THE_PET:Lext/mods/gameserver/network/SystemMessageId;
   #59 = NameAndType        #60:#44       // NAMING_YOU_CANNOT_SET_NAME_OF_THE_PET:Lext/mods/gameserver/network/SystemMessageId;
   #60 = Utf8               NAMING_YOU_CANNOT_SET_NAME_OF_THE_PET
   #61 = Fieldref           #62.#63       // ext/mods/Config.PET_NAME_TEMPLATE:Ljava/lang/String;
   #62 = Class              #64           // ext/mods/Config
   #63 = NameAndType        #65:#16       // PET_NAME_TEMPLATE:Ljava/lang/String;
   #64 = Utf8               ext/mods/Config
   #65 = Utf8               PET_NAME_TEMPLATE
   #66 = Methodref          #67.#68       // ext/mods/commons/lang/StringUtil.isValidString:(Ljava/lang/String;Ljava/lang/String;)Z
   #67 = Class              #69           // ext/mods/commons/lang/StringUtil
   #68 = NameAndType        #70:#71       // isValidString:(Ljava/lang/String;Ljava/lang/String;)Z
   #69 = Utf8               ext/mods/commons/lang/StringUtil
   #70 = Utf8               isValidString
   #71 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Z
   #72 = Fieldref           #40.#73       // ext/mods/gameserver/network/SystemMessageId.NAMING_PETNAME_CONTAINS_INVALID_CHARS:Lext/mods/gameserver/network/SystemMessageId;
   #73 = NameAndType        #74:#44       // NAMING_PETNAME_CONTAINS_INVALID_CHARS:Lext/mods/gameserver/network/SystemMessageId;
   #74 = Utf8               NAMING_PETNAME_CONTAINS_INVALID_CHARS
   #75 = Methodref          #76.#77       // ext/mods/gameserver/data/xml/NpcData.getInstance:()Lext/mods/gameserver/data/xml/NpcData;
   #76 = Class              #78           // ext/mods/gameserver/data/xml/NpcData
   #77 = NameAndType        #79:#80       // getInstance:()Lext/mods/gameserver/data/xml/NpcData;
   #78 = Utf8               ext/mods/gameserver/data/xml/NpcData
   #79 = Utf8               getInstance
   #80 = Utf8               ()Lext/mods/gameserver/data/xml/NpcData;
   #81 = Methodref          #76.#82       // ext/mods/gameserver/data/xml/NpcData.getTemplateByName:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #82 = NameAndType        #83:#84       // getTemplateByName:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #83 = Utf8               getTemplateByName
   #84 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #85 = Methodref          #8.#86        // ext/mods/gameserver/network/clientpackets/RequestChangePetName.doesPetNameExist:(Ljava/lang/String;)Z
   #86 = NameAndType        #87:#88       // doesPetNameExist:(Ljava/lang/String;)Z
   #87 = Utf8               doesPetNameExist
   #88 = Utf8               (Ljava/lang/String;)Z
   #89 = Fieldref           #40.#90       // ext/mods/gameserver/network/SystemMessageId.NAMING_ALREADY_IN_USE_BY_ANOTHER_PET:Lext/mods/gameserver/network/SystemMessageId;
   #90 = NameAndType        #91:#44       // NAMING_ALREADY_IN_USE_BY_ANOTHER_PET:Lext/mods/gameserver/network/SystemMessageId;
   #91 = Utf8               NAMING_ALREADY_IN_USE_BY_ANOTHER_PET
   #92 = Methodref          #53.#93       // ext/mods/gameserver/model/actor/instance/Pet.setName:(Ljava/lang/String;)V
   #93 = NameAndType        #94:#95       // setName:(Ljava/lang/String;)V
   #94 = Utf8               setName
   #95 = Utf8               (Ljava/lang/String;)V
   #96 = Methodref          #53.#97       // ext/mods/gameserver/model/actor/instance/Pet.getControlItem:()Lext/mods/gameserver/model/item/instance/ItemInstance;
   #97 = NameAndType        #98:#99       // getControlItem:()Lext/mods/gameserver/model/item/instance/ItemInstance;
   #98 = Utf8               getControlItem
   #99 = Utf8               ()Lext/mods/gameserver/model/item/instance/ItemInstance;
  #100 = Methodref          #101.#102     // ext/mods/gameserver/model/item/instance/ItemInstance.setCustomType2:(I)V
  #101 = Class              #103          // ext/mods/gameserver/model/item/instance/ItemInstance
  #102 = NameAndType        #104:#105     // setCustomType2:(I)V
  #103 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #104 = Utf8               setCustomType2
  #105 = Utf8               (I)V
  #106 = Fieldref           #107.#108     // ext/mods/gameserver/enums/items/ItemState.MODIFIED:Lext/mods/gameserver/enums/items/ItemState;
  #107 = Class              #109          // ext/mods/gameserver/enums/items/ItemState
  #108 = NameAndType        #110:#111     // MODIFIED:Lext/mods/gameserver/enums/items/ItemState;
  #109 = Utf8               ext/mods/gameserver/enums/items/ItemState
  #110 = Utf8               MODIFIED
  #111 = Utf8               Lext/mods/gameserver/enums/items/ItemState;
  #112 = Methodref          #101.#113     // ext/mods/gameserver/model/item/instance/ItemInstance.updateState:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/items/ItemState;)V
  #113 = NameAndType        #114:#115     // updateState:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/items/ItemState;)V
  #114 = Utf8               updateState
  #115 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/items/ItemState;)V
  #116 = Methodref          #53.#117      // ext/mods/gameserver/model/actor/instance/Pet.sendPetInfosToOwner:()V
  #117 = NameAndType        #118:#6       // sendPetInfosToOwner:()V
  #118 = Utf8               sendPetInfosToOwner
  #119 = Methodref          #120.#121     // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
  #120 = Class              #122          // ext/mods/commons/pool/ConnectionPool
  #121 = NameAndType        #123:#124     // getConnection:()Ljava/sql/Connection;
  #122 = Utf8               ext/mods/commons/pool/ConnectionPool
  #123 = Utf8               getConnection
  #124 = Utf8               ()Ljava/sql/Connection;
  #125 = String             #126          // SELECT name FROM pets WHERE name=?
  #126 = Utf8               SELECT name FROM pets WHERE name=?
  #127 = InterfaceMethodref #128.#129     // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #128 = Class              #130          // java/sql/Connection
  #129 = NameAndType        #131:#132     // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #130 = Utf8               java/sql/Connection
  #131 = Utf8               prepareStatement
  #132 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #133 = InterfaceMethodref #134.#135     // java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
  #134 = Class              #136          // java/sql/PreparedStatement
  #135 = NameAndType        #137:#138     // setString:(ILjava/lang/String;)V
  #136 = Utf8               java/sql/PreparedStatement
  #137 = Utf8               setString
  #138 = Utf8               (ILjava/lang/String;)V
  #139 = InterfaceMethodref #134.#140     // java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
  #140 = NameAndType        #141:#142     // executeQuery:()Ljava/sql/ResultSet;
  #141 = Utf8               executeQuery
  #142 = Utf8               ()Ljava/sql/ResultSet;
  #143 = InterfaceMethodref #144.#145     // java/sql/ResultSet.next:()Z
  #144 = Class              #146          // java/sql/ResultSet
  #145 = NameAndType        #147:#32      // next:()Z
  #146 = Utf8               java/sql/ResultSet
  #147 = Utf8               next
  #148 = InterfaceMethodref #144.#149     // java/sql/ResultSet.close:()V
  #149 = NameAndType        #150:#6       // close:()V
  #150 = Utf8               close
  #151 = Class              #152          // java/lang/Throwable
  #152 = Utf8               java/lang/Throwable
  #153 = Methodref          #151.#154     // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
  #154 = NameAndType        #155:#156     // addSuppressed:(Ljava/lang/Throwable;)V
  #155 = Utf8               addSuppressed
  #156 = Utf8               (Ljava/lang/Throwable;)V
  #157 = InterfaceMethodref #134.#149     // java/sql/PreparedStatement.close:()V
  #158 = InterfaceMethodref #128.#149     // java/sql/Connection.close:()V
  #159 = Class              #160          // java/lang/Exception
  #160 = Utf8               java/lang/Exception
  #161 = Fieldref           #8.#162       // ext/mods/gameserver/network/clientpackets/RequestChangePetName.LOGGER:Lext/mods/commons/logging/CLogger;
  #162 = NameAndType        #163:#164     // LOGGER:Lext/mods/commons/logging/CLogger;
  #163 = Utf8               LOGGER
  #164 = Utf8               Lext/mods/commons/logging/CLogger;
  #165 = String             #166          // Couldn\'t check existing petname.
  #166 = Utf8               Couldn\'t check existing petname.
  #167 = Methodref          #168.#169     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #168 = Class              #170          // ext/mods/commons/logging/CLogger
  #169 = NameAndType        #171:#172     // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #170 = Utf8               ext/mods/commons/logging/CLogger
  #171 = Utf8               error
  #172 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
  #173 = Utf8               SEARCH_NAME
  #174 = Utf8               ConstantValue
  #175 = Utf8               Code
  #176 = Utf8               LineNumberTable
  #177 = Utf8               LocalVariableTable
  #178 = Utf8               this
  #179 = Utf8               Lext/mods/gameserver/network/clientpackets/RequestChangePetName;
  #180 = Utf8               readImpl
  #181 = Utf8               runImpl
  #182 = Utf8               player
  #183 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #184 = Utf8               pet
  #185 = Utf8               Lext/mods/gameserver/model/actor/instance/Pet;
  #186 = Utf8               controlItem
  #187 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #188 = Utf8               StackMapTable
  #189 = Utf8               rs
  #190 = Utf8               Ljava/sql/ResultSet;
  #191 = Utf8               ps
  #192 = Utf8               Ljava/sql/PreparedStatement;
  #193 = Utf8               con
  #194 = Utf8               Ljava/sql/Connection;
  #195 = Utf8               e
  #196 = Utf8               Ljava/lang/Exception;
  #197 = Utf8               name
  #198 = Utf8               result
  #199 = Utf8               Z
  #200 = Utf8               SourceFile
  #201 = Utf8               RequestChangePetName.java
{
  public ext.mods.gameserver.network.clientpackets.RequestChangePetName();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
         4: return
      LineNumberTable:
        line 35: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/network/clientpackets/RequestChangePetName;

  protected void readImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: aload_0
         2: invokevirtual #7                  // Method readS:()Ljava/lang/String;
         5: putfield      #13                 // Field _name:Ljava/lang/String;
         8: return
      LineNumberTable:
        line 44: 0
        line 45: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/network/clientpackets/RequestChangePetName;

  protected void runImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=4, args_size=1
         0: aload_0
         1: invokevirtual #17                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
         4: checkcast     #21                 // class ext/mods/gameserver/network/GameClient
         7: invokevirtual #23                 // Method ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        10: astore_1
        11: aload_1
        12: ifnonnull     16
        15: return
        16: aload_1
        17: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/Player.hasPet:()Z
        20: ifne          24
        23: return
        24: aload_0
        25: getfield      #13                 // Field _name:Ljava/lang/String;
        28: invokevirtual #33                 // Method java/lang/String.length:()I
        31: iconst_1
        32: if_icmplt     47
        35: aload_0
        36: getfield      #13                 // Field _name:Ljava/lang/String;
        39: invokevirtual #33                 // Method java/lang/String.length:()I
        42: bipush        16
        44: if_icmple     55
        47: aload_1
        48: getstatic     #39                 // Field ext/mods/gameserver/network/SystemMessageId.NAMING_CHARNAME_UP_TO_16CHARS:Lext/mods/gameserver/network/SystemMessageId;
        51: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        54: return
        55: aload_1
        56: invokevirtual #49                 // Method ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
        59: checkcast     #53                 // class ext/mods/gameserver/model/actor/instance/Pet
        62: astore_2
        63: aload_2
        64: invokevirtual #55                 // Method ext/mods/gameserver/model/actor/instance/Pet.getName:()Ljava/lang/String;
        67: ifnull        78
        70: aload_1
        71: getstatic     #58                 // Field ext/mods/gameserver/network/SystemMessageId.NAMING_YOU_CANNOT_SET_NAME_OF_THE_PET:Lext/mods/gameserver/network/SystemMessageId;
        74: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        77: return
        78: aload_0
        79: getfield      #13                 // Field _name:Ljava/lang/String;
        82: getstatic     #61                 // Field ext/mods/Config.PET_NAME_TEMPLATE:Ljava/lang/String;
        85: invokestatic  #66                 // Method ext/mods/commons/lang/StringUtil.isValidString:(Ljava/lang/String;Ljava/lang/String;)Z
        88: ifne          99
        91: aload_1
        92: getstatic     #72                 // Field ext/mods/gameserver/network/SystemMessageId.NAMING_PETNAME_CONTAINS_INVALID_CHARS:Lext/mods/gameserver/network/SystemMessageId;
        95: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        98: return
        99: invokestatic  #75                 // Method ext/mods/gameserver/data/xml/NpcData.getInstance:()Lext/mods/gameserver/data/xml/NpcData;
       102: aload_0
       103: getfield      #13                 // Field _name:Ljava/lang/String;
       106: invokevirtual #81                 // Method ext/mods/gameserver/data/xml/NpcData.getTemplateByName:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/template/NpcTemplate;
       109: ifnull        113
       112: return
       113: aload_0
       114: getfield      #13                 // Field _name:Ljava/lang/String;
       117: invokestatic  #85                 // Method doesPetNameExist:(Ljava/lang/String;)Z
       120: ifeq          131
       123: aload_1
       124: getstatic     #89                 // Field ext/mods/gameserver/network/SystemMessageId.NAMING_ALREADY_IN_USE_BY_ANOTHER_PET:Lext/mods/gameserver/network/SystemMessageId;
       127: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       130: return
       131: aload_2
       132: aload_0
       133: getfield      #13                 // Field _name:Ljava/lang/String;
       136: invokevirtual #92                 // Method ext/mods/gameserver/model/actor/instance/Pet.setName:(Ljava/lang/String;)V
       139: aload_2
       140: invokevirtual #96                 // Method ext/mods/gameserver/model/actor/instance/Pet.getControlItem:()Lext/mods/gameserver/model/item/instance/ItemInstance;
       143: astore_3
       144: aload_3
       145: ifnull        161
       148: aload_3
       149: iconst_1
       150: invokevirtual #100                // Method ext/mods/gameserver/model/item/instance/ItemInstance.setCustomType2:(I)V
       153: aload_3
       154: aload_1
       155: getstatic     #106                // Field ext/mods/gameserver/enums/items/ItemState.MODIFIED:Lext/mods/gameserver/enums/items/ItemState;
       158: invokevirtual #112                // Method ext/mods/gameserver/model/item/instance/ItemInstance.updateState:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/items/ItemState;)V
       161: aload_2
       162: invokevirtual #116                // Method ext/mods/gameserver/model/actor/instance/Pet.sendPetInfosToOwner:()V
       165: return
      LineNumberTable:
        line 50: 0
        line 51: 11
        line 52: 15
        line 54: 16
        line 55: 23
        line 57: 24
        line 59: 47
        line 60: 54
        line 63: 55
        line 64: 63
        line 66: 70
        line 67: 77
        line 70: 78
        line 72: 91
        line 73: 98
        line 76: 99
        line 77: 112
        line 79: 113
        line 81: 123
        line 82: 130
        line 85: 131
        line 87: 139
        line 88: 144
        line 90: 148
        line 91: 153
        line 94: 161
        line 95: 165
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     166     0  this   Lext/mods/gameserver/network/clientpackets/RequestChangePetName;
           11     155     1 player   Lext/mods/gameserver/model/actor/Player;
           63     103     2   pet   Lext/mods/gameserver/model/actor/instance/Pet;
          144      22     3 controlItem   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 9
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 7 /* same */
        frame_type = 22 /* same */
        frame_type = 7 /* same */
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ class ext/mods/gameserver/model/actor/instance/Pet ]
        frame_type = 20 /* same */
        frame_type = 13 /* same */
        frame_type = 17 /* same */
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
}
SourceFile: "RequestChangePetName.java"
