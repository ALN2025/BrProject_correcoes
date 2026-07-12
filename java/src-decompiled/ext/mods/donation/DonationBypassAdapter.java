// Bytecode for: ext.mods.donation.DonationBypassAdapter
// File: ext\mods\donation\DonationBypassAdapter.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/donation/DonationBypassAdapter.class
  Last modified 9 de jul de 2026; size 2581 bytes
  MD5 checksum 46949b17f79924f13e143f6152543bf2
  Compiled from "DonationBypassAdapter.java"
public final class ext.mods.donation.DonationBypassAdapter
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #67                         // ext/mods/donation/DonationBypassAdapter
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 5, attributes: 1
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
   #16 = Methodref          #17.#18       // java/lang/String.trim:()Ljava/lang/String;
   #17 = Class              #19           // java/lang/String
   #18 = NameAndType        #20:#21       // trim:()Ljava/lang/String;
   #19 = Utf8               java/lang/String
   #20 = Utf8               trim
   #21 = Utf8               ()Ljava/lang/String;
   #22 = String             #23           // -h
   #23 = Utf8               -h
   #24 = Methodref          #17.#25       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #25 = NameAndType        #26:#27       // startsWith:(Ljava/lang/String;)Z
   #26 = Utf8               startsWith
   #27 = Utf8               (Ljava/lang/String;)Z
   #28 = Methodref          #17.#29       // java/lang/String.substring:(I)Ljava/lang/String;
   #29 = NameAndType        #30:#31       // substring:(I)Ljava/lang/String;
   #30 = Utf8               substring
   #31 = Utf8               (I)Ljava/lang/String;
   #32 = String             #33           // pix
   #33 = Utf8               pix
   #34 = Methodref          #17.#35       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #35 = NameAndType        #36:#37       // equals:(Ljava/lang/Object;)Z
   #36 = Utf8               equals
   #37 = Utf8               (Ljava/lang/Object;)Z
   #38 = String             #39           // pix
   #39 = Utf8               pix
   #40 = Methodref          #41.#42       // ext/mods/gameserver/model/actor/Player.getMemos:()Lext/mods/gameserver/model/memo/PlayerMemo;
   #41 = Class              #43           // ext/mods/gameserver/model/actor/Player
   #42 = NameAndType        #44:#45       // getMemos:()Lext/mods/gameserver/model/memo/PlayerMemo;
   #43 = Utf8               ext/mods/gameserver/model/actor/Player
   #44 = Utf8               getMemos
   #45 = Utf8               ()Lext/mods/gameserver/model/memo/PlayerMemo;
   #46 = Class              #47           // net/sf/donationmanager/DonationManager
   #47 = Utf8               net/sf/donationmanager/DonationManager
   #48 = String             #49           // donation_html_locale
   #49 = Utf8               donation_html_locale
   #50 = String             #51           // pt
   #51 = Utf8               pt
   #52 = Methodref          #53.#54       // ext/mods/gameserver/model/memo/PlayerMemo.set:(Ljava/lang/String;Ljava/lang/String;)V
   #53 = Class              #55           // ext/mods/gameserver/model/memo/PlayerMemo
   #54 = NameAndType        #56:#57       // set:(Ljava/lang/String;Ljava/lang/String;)V
   #55 = Utf8               ext/mods/gameserver/model/memo/PlayerMemo
   #56 = Utf8               set
   #57 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #58 = Methodref          #46.#59       // net/sf/donationmanager/DonationManager.getInstance:()Lnet/sf/donationmanager/DonationManager;
   #59 = NameAndType        #60:#61       // getInstance:()Lnet/sf/donationmanager/DonationManager;
   #60 = Utf8               getInstance
   #61 = Utf8               ()Lnet/sf/donationmanager/DonationManager;
   #62 = Methodref          #46.#63       // net/sf/donationmanager/DonationManager.prepareShopForLocale:(Lext/mods/gameserver/model/actor/Player;)V
   #63 = NameAndType        #64:#65       // prepareShopForLocale:(Lext/mods/gameserver/model/actor/Player;)V
   #64 = Utf8               prepareShopForLocale
   #65 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #66 = Methodref          #67.#68       // ext/mods/donation/DonationBypassAdapter.extractTail:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #67 = Class              #69           // ext/mods/donation/DonationBypassAdapter
   #68 = NameAndType        #70:#71       // extractTail:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #69 = Utf8               ext/mods/donation/DonationBypassAdapter
   #70 = Utf8               extractTail
   #71 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #72 = Methodref          #67.#73       // ext/mods/donation/DonationBypassAdapter.normalizeLegacyTail:(Ljava/lang/String;)Ljava/lang/String;
   #73 = NameAndType        #74:#75       // normalizeLegacyTail:(Ljava/lang/String;)Ljava/lang/String;
   #74 = Utf8               normalizeLegacyTail
   #75 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #76 = Methodref          #46.#77       // net/sf/donationmanager/DonationManager.handleBypass:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #77 = NameAndType        #78:#79       // handleBypass:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #78 = Utf8               handleBypass
   #79 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #80 = String             #81           // pay
   #81 = Utf8               pay
   #82 = String             #83           // pay
   #83 = Utf8               pay
   #84 = String             #85           // en
   #85 = Utf8               en
   #86 = String             #87           // donation
   #87 = Utf8               donation
   #88 = Methodref          #53.#89       // ext/mods/gameserver/model/memo/PlayerMemo.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #89 = NameAndType        #90:#91       // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #90 = Utf8               get
   #91 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #92 = Methodref          #67.#93       // ext/mods/donation/DonationBypassAdapter.normalizeDonationTail:(Ljava/lang/String;)Ljava/lang/String;
   #93 = NameAndType        #94:#75       // normalizeDonationTail:(Ljava/lang/String;)Ljava/lang/String;
   #94 = Utf8               normalizeDonationTail
   #95 = Methodref          #17.#96       // java/lang/String.length:()I
   #96 = NameAndType        #97:#98       // length:()I
   #97 = Utf8               length
   #98 = Utf8               ()I
   #99 = String             #100          //
  #100 = Utf8
  #101 = Methodref          #17.#102      // java/lang/String.charAt:(I)C
  #102 = NameAndType        #103:#104     // charAt:(I)C
  #103 = Utf8               charAt
  #104 = Utf8               (I)C
  #105 = Methodref          #17.#106      // java/lang/String.isEmpty:()Z
  #106 = NameAndType        #107:#108     // isEmpty:()Z
  #107 = Utf8               isEmpty
  #108 = Utf8               ()Z
  #109 = String             #110          // index
  #110 = Utf8               index
  #111 = String             #112          // htm index.htm
  #112 = Utf8               htm index.htm
  #113 = String             #114          // htm
  #114 = Utf8               htm
  #115 = Utf8               Code
  #116 = Utf8               LineNumberTable
  #117 = Utf8               LocalVariableTable
  #118 = Utf8               this
  #119 = Utf8               Lext/mods/donation/DonationBypassAdapter;
  #120 = Utf8               tryHandle
  #121 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
  #122 = Utf8               player
  #123 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #124 = Utf8               bypass
  #125 = Utf8               Ljava/lang/String;
  #126 = Utf8               b
  #127 = Utf8               StackMapTable
  #128 = Utf8               full
  #129 = Utf8               prefix
  #130 = Utf8               tail
  #131 = Utf8               t
  #132 = Utf8               SourceFile
  #133 = Utf8               DonationBypassAdapter.java
{
  public static boolean tryHandle(ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=4, locals=3, args_size=2
         0: getstatic     #7                  // Field ext/mods/Config.ENABLE_PIX_MOD:Z
         3: ifeq          20
         6: getstatic     #13                 // Field ext/mods/Config.DONATION_ENABLED:Z
         9: ifeq          20
        12: aload_0
        13: ifnull        20
        16: aload_1
        17: ifnonnull     22
        20: iconst_0
        21: ireturn
        22: aload_1
        23: invokevirtual #16                 // Method java/lang/String.trim:()Ljava/lang/String;
        26: astore_2
        27: aload_2
        28: ldc           #22                 // String -h
        30: invokevirtual #24                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        33: ifeq          45
        36: aload_2
        37: iconst_3
        38: invokevirtual #28                 // Method java/lang/String.substring:(I)Ljava/lang/String;
        41: invokevirtual #16                 // Method java/lang/String.trim:()Ljava/lang/String;
        44: astore_2
        45: aload_2
        46: ldc           #32                 // String pix
        48: invokevirtual #34                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        51: ifne          63
        54: aload_2
        55: ldc           #38                 // String pix
        57: invokevirtual #24                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        60: ifeq          99
        63: aload_0
        64: invokevirtual #40                 // Method ext/mods/gameserver/model/actor/Player.getMemos:()Lext/mods/gameserver/model/memo/PlayerMemo;
        67: ldc           #48                 // String donation_html_locale
        69: ldc           #50                 // String pt
        71: invokevirtual #52                 // Method ext/mods/gameserver/model/memo/PlayerMemo.set:(Ljava/lang/String;Ljava/lang/String;)V
        74: invokestatic  #58                 // Method net/sf/donationmanager/DonationManager.getInstance:()Lnet/sf/donationmanager/DonationManager;
        77: aload_0
        78: invokevirtual #62                 // Method net/sf/donationmanager/DonationManager.prepareShopForLocale:(Lext/mods/gameserver/model/actor/Player;)V
        81: invokestatic  #58                 // Method net/sf/donationmanager/DonationManager.getInstance:()Lnet/sf/donationmanager/DonationManager;
        84: aload_0
        85: aload_2
        86: ldc           #32                 // String pix
        88: invokestatic  #66                 // Method extractTail:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        91: invokestatic  #72                 // Method normalizeLegacyTail:(Ljava/lang/String;)Ljava/lang/String;
        94: invokevirtual #76                 // Method net/sf/donationmanager/DonationManager.handleBypass:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
        97: iconst_1
        98: ireturn
        99: aload_2
       100: ldc           #80                 // String pay
       102: invokevirtual #34                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       105: ifne          117
       108: aload_2
       109: ldc           #82                 // String pay
       111: invokevirtual #24                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       114: ifeq          153
       117: aload_0
       118: invokevirtual #40                 // Method ext/mods/gameserver/model/actor/Player.getMemos:()Lext/mods/gameserver/model/memo/PlayerMemo;
       121: ldc           #48                 // String donation_html_locale
       123: ldc           #84                 // String en
       125: invokevirtual #52                 // Method ext/mods/gameserver/model/memo/PlayerMemo.set:(Ljava/lang/String;Ljava/lang/String;)V
       128: invokestatic  #58                 // Method net/sf/donationmanager/DonationManager.getInstance:()Lnet/sf/donationmanager/DonationManager;
       131: aload_0
       132: invokevirtual #62                 // Method net/sf/donationmanager/DonationManager.prepareShopForLocale:(Lext/mods/gameserver/model/actor/Player;)V
       135: invokestatic  #58                 // Method net/sf/donationmanager/DonationManager.getInstance:()Lnet/sf/donationmanager/DonationManager;
       138: aload_0
       139: aload_2
       140: ldc           #80                 // String pay
       142: invokestatic  #66                 // Method extractTail:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       145: invokestatic  #72                 // Method normalizeLegacyTail:(Ljava/lang/String;)Ljava/lang/String;
       148: invokevirtual #76                 // Method net/sf/donationmanager/DonationManager.handleBypass:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       151: iconst_1
       152: ireturn
       153: aload_2
       154: ldc           #86                 // String donation
       156: invokevirtual #24                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       159: ifeq          203
       162: aload_0
       163: invokevirtual #40                 // Method ext/mods/gameserver/model/actor/Player.getMemos:()Lext/mods/gameserver/model/memo/PlayerMemo;
       166: ldc           #48                 // String donation_html_locale
       168: invokevirtual #88                 // Method ext/mods/gameserver/model/memo/PlayerMemo.get:(Ljava/lang/Object;)Ljava/lang/Object;
       171: ifnonnull     185
       174: aload_0
       175: invokevirtual #40                 // Method ext/mods/gameserver/model/actor/Player.getMemos:()Lext/mods/gameserver/model/memo/PlayerMemo;
       178: ldc           #48                 // String donation_html_locale
       180: ldc           #50                 // String pt
       182: invokevirtual #52                 // Method ext/mods/gameserver/model/memo/PlayerMemo.set:(Ljava/lang/String;Ljava/lang/String;)V
       185: invokestatic  #58                 // Method net/sf/donationmanager/DonationManager.getInstance:()Lnet/sf/donationmanager/DonationManager;
       188: aload_0
       189: aload_2
       190: ldc           #86                 // String donation
       192: invokestatic  #66                 // Method extractTail:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       195: invokestatic  #92                 // Method normalizeDonationTail:(Ljava/lang/String;)Ljava/lang/String;
       198: invokevirtual #76                 // Method net/sf/donationmanager/DonationManager.handleBypass:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       201: iconst_1
       202: ireturn
       203: iconst_0
       204: ireturn
      LineNumberTable:
        line 33: 0
        line 34: 20
        line 36: 22
        line 37: 27
        line 38: 36
        line 40: 45
        line 42: 63
        line 43: 74
        line 44: 81
        line 45: 97
        line 48: 99
        line 50: 117
        line 51: 128
        line 52: 135
        line 53: 151
        line 56: 153
        line 58: 162
        line 59: 174
        line 61: 185
        line 62: 201
        line 65: 203
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     205     0 player   Lext/mods/gameserver/model/actor/Player;
            0     205     1 bypass   Ljava/lang/String;
           27     178     2     b   Ljava/lang/String;
      StackMapTable: number_of_entries = 9
        frame_type = 20 /* same */
        frame_type = 1 /* same */
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ class java/lang/String ]
        frame_type = 17 /* same */
        frame_type = 35 /* same */
        frame_type = 17 /* same */
        frame_type = 35 /* same */
        frame_type = 31 /* same */
        frame_type = 17 /* same */
}
SourceFile: "DonationBypassAdapter.java"
