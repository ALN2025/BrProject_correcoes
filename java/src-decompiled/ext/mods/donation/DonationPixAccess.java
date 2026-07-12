// Bytecode for: ext.mods.donation.DonationPixAccess
// File: ext\mods\donation\DonationPixAccess.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/donation/DonationPixAccess.class
  Last modified 9 de jul de 2026; size 2530 bytes
  MD5 checksum 19f6b2ed43b48cd012bb3349b144ff70
  Compiled from "DonationPixAccess.java"
public final class ext.mods.donation.DonationPixAccess
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #72                         // ext/mods/donation/DonationPixAccess
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 1, methods: 3, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/Config.ENABLE_PIX_MOD:Z
    #8 = Class              #10           // ext/mods/Config
    #9 = NameAndType        #11:#12       // ENABLE_PIX_MOD:Z
   #10 = Utf8               ext/mods/Config
   #11 = Utf8               ENABLE_PIX_MOD
   #12 = Utf8               Z
   #13 = Fieldref           #8.#14        // ext/mods/Config.DONATION_ENABLED:Z
   #14 = NameAndType        #15:#12       // DONATION_ENABLED:Z
   #15 = Utf8               DONATION_ENABLED
   #16 = String             #17           // Sistema PIX desativado.
   #17 = Utf8               Sistema PIX desativado.
   #18 = Methodref          #19.#20       // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #19 = Class              #21           // ext/mods/gameserver/model/actor/Player
   #20 = NameAndType        #22:#23       // sendMessage:(Ljava/lang/String;)V
   #21 = Utf8               ext/mods/gameserver/model/actor/Player
   #22 = Utf8               sendMessage
   #23 = Utf8               (Ljava/lang/String;)V
   #24 = String             #25           // en
   #25 = Utf8               en
   #26 = Methodref          #27.#28       // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
   #27 = Class              #29           // java/lang/String
   #28 = NameAndType        #30:#31       // equalsIgnoreCase:(Ljava/lang/String;)Z
   #29 = Utf8               java/lang/String
   #30 = Utf8               equalsIgnoreCase
   #31 = Utf8               (Ljava/lang/String;)Z
   #32 = String             #33           // pt
   #33 = Utf8               pt
   #34 = Methodref          #19.#35       // ext/mods/gameserver/model/actor/Player.getMemos:()Lext/mods/gameserver/model/memo/PlayerMemo;
   #35 = NameAndType        #36:#37       // getMemos:()Lext/mods/gameserver/model/memo/PlayerMemo;
   #36 = Utf8               getMemos
   #37 = Utf8               ()Lext/mods/gameserver/model/memo/PlayerMemo;
   #38 = Class              #39           // net/sf/donationmanager/DonationManager
   #39 = Utf8               net/sf/donationmanager/DonationManager
   #40 = String             #41           // donation_html_locale
   #41 = Utf8               donation_html_locale
   #42 = Methodref          #43.#44       // ext/mods/gameserver/model/memo/PlayerMemo.set:(Ljava/lang/String;Ljava/lang/String;)V
   #43 = Class              #45           // ext/mods/gameserver/model/memo/PlayerMemo
   #44 = NameAndType        #46:#47       // set:(Ljava/lang/String;Ljava/lang/String;)V
   #45 = Utf8               ext/mods/gameserver/model/memo/PlayerMemo
   #46 = Utf8               set
   #47 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #48 = Methodref          #38.#49       // net/sf/donationmanager/DonationManager.getInstance:()Lnet/sf/donationmanager/DonationManager;
   #49 = NameAndType        #50:#51       // getInstance:()Lnet/sf/donationmanager/DonationManager;
   #50 = Utf8               getInstance
   #51 = Utf8               ()Lnet/sf/donationmanager/DonationManager;
   #52 = Methodref          #38.#53       // net/sf/donationmanager/DonationManager.prepareShopForLocale:(Lext/mods/gameserver/model/actor/Player;)V
   #53 = NameAndType        #54:#55       // prepareShopForLocale:(Lext/mods/gameserver/model/actor/Player;)V
   #54 = Utf8               prepareShopForLocale
   #55 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #56 = Fieldref           #57.#58       // ext/mods/gameserver/network/serverpackets/ShowBoard.STATIC_CLOSE:Lext/mods/gameserver/network/serverpackets/ShowBoard;
   #57 = Class              #59           // ext/mods/gameserver/network/serverpackets/ShowBoard
   #58 = NameAndType        #60:#61       // STATIC_CLOSE:Lext/mods/gameserver/network/serverpackets/ShowBoard;
   #59 = Utf8               ext/mods/gameserver/network/serverpackets/ShowBoard
   #60 = Utf8               STATIC_CLOSE
   #61 = Utf8               Lext/mods/gameserver/network/serverpackets/ShowBoard;
   #62 = Methodref          #19.#63       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #63 = NameAndType        #64:#65       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #64 = Utf8               sendPacket
   #65 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #66 = Methodref          #38.#67       // net/sf/donationmanager/DonationManager.showIndexWindow:(Lext/mods/gameserver/model/actor/Player;)V
   #67 = NameAndType        #68:#55       // showIndexWindow:(Lext/mods/gameserver/model/actor/Player;)V
   #68 = Utf8               showIndexWindow
   #69 = Class              #70           // java/lang/Exception
   #70 = Utf8               java/lang/Exception
   #71 = Fieldref           #72.#73       // ext/mods/donation/DonationPixAccess.LOGGER:Lext/mods/commons/logging/CLogger;
   #72 = Class              #74           // ext/mods/donation/DonationPixAccess
   #73 = NameAndType        #75:#76       // LOGGER:Lext/mods/commons/logging/CLogger;
   #74 = Utf8               ext/mods/donation/DonationPixAccess
   #75 = Utf8               LOGGER
   #76 = Utf8               Lext/mods/commons/logging/CLogger;
   #77 = String             #78           // Falha ao abrir loja PIX para {}.
   #78 = Utf8               Falha ao abrir loja PIX para {}.
   #79 = Methodref          #19.#80       // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
   #80 = NameAndType        #81:#82       // getName:()Ljava/lang/String;
   #81 = Utf8               getName
   #82 = Utf8               ()Ljava/lang/String;
   #83 = Methodref          #84.#85       // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
   #84 = Class              #86           // ext/mods/commons/logging/CLogger
   #85 = NameAndType        #87:#88       // warn:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
   #86 = Utf8               ext/mods/commons/logging/CLogger
   #87 = Utf8               warn
   #88 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
   #89 = Methodref          #27.#90       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #90 = NameAndType        #91:#92       // equals:(Ljava/lang/Object;)Z
   #91 = Utf8               equals
   #92 = Utf8               (Ljava/lang/Object;)Z
   #93 = String             #94           // Could not open the shop. Check GameServer log.
   #94 = Utf8               Could not open the shop. Check GameServer log.
   #95 = String             #96           // Nao foi possivel abrir a loja. Veja o log do GameServer.
   #96 = Utf8               Nao foi possivel abrir a loja. Veja o log do GameServer.
   #97 = Fieldref           #98.#99       // ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #98 = Class              #100          // ext/mods/gameserver/network/serverpackets/ActionFailed
   #99 = NameAndType        #101:#102     // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #100 = Utf8               ext/mods/gameserver/network/serverpackets/ActionFailed
  #101 = Utf8               STATIC_PACKET
  #102 = Utf8               Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #103 = Methodref          #104.#80      // java/lang/Class.getName:()Ljava/lang/String;
  #104 = Class              #105          // java/lang/Class
  #105 = Utf8               java/lang/Class
  #106 = Methodref          #84.#107      // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #107 = NameAndType        #5:#23        // "<init>":(Ljava/lang/String;)V
  #108 = Utf8               Code
  #109 = Utf8               LineNumberTable
  #110 = Utf8               LocalVariableTable
  #111 = Utf8               this
  #112 = Utf8               Lext/mods/donation/DonationPixAccess;
  #113 = Utf8               openShop
  #114 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
  #115 = Utf8               e
  #116 = Utf8               Ljava/lang/Exception;
  #117 = Utf8               player
  #118 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #119 = Utf8               locale
  #120 = Utf8               Ljava/lang/String;
  #121 = Utf8               lang
  #122 = Utf8               StackMapTable
  #123 = Utf8               <clinit>
  #124 = Utf8               SourceFile
  #125 = Utf8               DonationPixAccess.java
{
  public static boolean openShop(ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=7, locals=4, args_size=2
         0: aload_0
         1: ifnonnull     6
         4: iconst_0
         5: ireturn
         6: getstatic     #7                  // Field ext/mods/Config.ENABLE_PIX_MOD:Z
         9: ifeq          18
        12: getstatic     #13                 // Field ext/mods/Config.DONATION_ENABLED:Z
        15: ifne          26
        18: aload_0
        19: ldc           #16                 // String Sistema PIX desativado.
        21: invokevirtual #18                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        24: iconst_0
        25: ireturn
        26: ldc           #24                 // String en
        28: aload_1
        29: invokevirtual #26                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        32: ifeq          40
        35: ldc           #24                 // String en
        37: goto          42
        40: ldc           #32                 // String pt
        42: astore_2
        43: aload_0
        44: invokevirtual #34                 // Method ext/mods/gameserver/model/actor/Player.getMemos:()Lext/mods/gameserver/model/memo/PlayerMemo;
        47: ldc           #40                 // String donation_html_locale
        49: aload_2
        50: invokevirtual #42                 // Method ext/mods/gameserver/model/memo/PlayerMemo.set:(Ljava/lang/String;Ljava/lang/String;)V
        53: invokestatic  #48                 // Method net/sf/donationmanager/DonationManager.getInstance:()Lnet/sf/donationmanager/DonationManager;
        56: aload_0
        57: invokevirtual #52                 // Method net/sf/donationmanager/DonationManager.prepareShopForLocale:(Lext/mods/gameserver/model/actor/Player;)V
        60: aload_0
        61: getstatic     #56                 // Field ext/mods/gameserver/network/serverpackets/ShowBoard.STATIC_CLOSE:Lext/mods/gameserver/network/serverpackets/ShowBoard;
        64: invokevirtual #62                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        67: invokestatic  #48                 // Method net/sf/donationmanager/DonationManager.getInstance:()Lnet/sf/donationmanager/DonationManager;
        70: aload_0
        71: invokevirtual #66                 // Method net/sf/donationmanager/DonationManager.showIndexWindow:(Lext/mods/gameserver/model/actor/Player;)V
        74: goto          127
        77: astore_3
        78: getstatic     #71                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        81: ldc           #77                 // String Falha ao abrir loja PIX para {}.
        83: aload_3
        84: iconst_1
        85: anewarray     #2                  // class java/lang/Object
        88: dup
        89: iconst_0
        90: aload_0
        91: invokevirtual #79                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
        94: aastore
        95: invokevirtual #83                 // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
        98: aload_0
        99: ldc           #24                 // String en
       101: aload_2
       102: invokevirtual #89                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       105: ifeq          113
       108: ldc           #93                 // String Could not open the shop. Check GameServer log.
       110: goto          115
       113: ldc           #95                 // String Nao foi possivel abrir a loja. Veja o log do GameServer.
       115: invokevirtual #18                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       118: aload_0
       119: getstatic     #97                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       122: invokevirtual #62                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       125: iconst_0
       126: ireturn
       127: iconst_1
       128: ireturn
      Exception table:
         from    to  target type
            67    74    77   Class java/lang/Exception
      LineNumberTable:
        line 32: 0
        line 33: 4
        line 35: 6
        line 37: 18
        line 38: 24
        line 41: 26
        line 42: 43
        line 43: 53
        line 46: 60
        line 50: 67
        line 58: 74
        line 52: 77
        line 54: 78
        line 55: 98
        line 56: 118
        line 57: 125
        line 60: 127
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           78      49     3     e   Ljava/lang/Exception;
            0     129     0 player   Lext/mods/gameserver/model/actor/Player;
            0     129     1 locale   Ljava/lang/String;
           43      86     2  lang   Ljava/lang/String;
      StackMapTable: number_of_entries = 9
        frame_type = 6 /* same */
        frame_type = 11 /* same */
        frame_type = 7 /* same */
        frame_type = 13 /* same */
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 34
          locals = [ class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/lang/String ]
          stack = [ class java/lang/Exception ]
        frame_type = 255 /* full_frame */
          offset_delta = 35
          locals = [ class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/lang/String, class java/lang/Exception ]
          stack = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/lang/String, class java/lang/Exception ]
          stack = [ class ext/mods/gameserver/model/actor/Player, class java/lang/String ]
        frame_type = 250 /* chop */
          offset_delta = 11

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #84                 // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #72                 // class ext/mods/donation/DonationPixAccess
         6: invokevirtual #103                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #106                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #71                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 19: 0
}
SourceFile: "DonationPixAccess.java"
