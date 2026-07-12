// Bytecode for: ext.mods.gameserver.communitybbs.custom.ShopBBSManager
// File: ext\mods\gameserver\communitybbs\custom\ShopBBSManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/communitybbs/custom/ShopBBSManager.class
  Last modified 9 de jul de 2026; size 4314 bytes
  MD5 checksum eea7be1f698266a09474cefd36f50626
  Compiled from "ShopBBSManager.java"
public class ext.mods.gameserver.communitybbs.custom.ShopBBSManager extends ext.mods.gameserver.communitybbs.manager.BaseBBSManager
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #10                         // ext/mods/gameserver/communitybbs/custom/ShopBBSManager
  super_class: #2                         // ext/mods/gameserver/communitybbs/manager/BaseBBSManager
  interfaces: 0, fields: 1, methods: 5, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/communitybbs/manager/BaseBBSManager."<init>":()V
    #2 = Class              #4            // ext/mods/gameserver/communitybbs/manager/BaseBBSManager
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               ext/mods/gameserver/communitybbs/manager/BaseBBSManager
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = String             #8            // index
    #8 = Utf8               index
    #9 = Methodref          #10.#11       // ext/mods/gameserver/communitybbs/custom/ShopBBSManager.showPage:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #10 = Class              #12           // ext/mods/gameserver/communitybbs/custom/ShopBBSManager
   #11 = NameAndType        #13:#14       // showPage:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #12 = Utf8               ext/mods/gameserver/communitybbs/custom/ShopBBSManager
   #13 = Utf8               showPage
   #14 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #15 = String             #16           // _maillist_0_1_0_
   #16 = Utf8               _maillist_0_1_0_
   #17 = Methodref          #18.#19       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #18 = Class              #20           // java/lang/String
   #19 = NameAndType        #21:#22       // equals:(Ljava/lang/Object;)Z
   #20 = Utf8               java/lang/String
   #21 = Utf8               equals
   #22 = Utf8               (Ljava/lang/Object;)Z
   #23 = String             #24           // _maillist_0_1_0_;page
   #24 = Utf8               _maillist_0_1_0_;page
   #25 = Methodref          #18.#26       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #26 = NameAndType        #27:#28       // startsWith:(Ljava/lang/String;)Z
   #27 = Utf8               startsWith
   #28 = Utf8               (Ljava/lang/String;)Z
   #29 = String             #30           //
   #30 = Utf8
   #31 = Methodref          #18.#32       // java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
   #32 = NameAndType        #33:#34       // split:(Ljava/lang/String;)[Ljava/lang/String;
   #33 = Utf8               split
   #34 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
   #35 = String             #36           // _maillist_0_1_0_;crafter
   #36 = Utf8               _maillist_0_1_0_;crafter
   #37 = String             #38           // crafter
   #38 = Utf8               crafter
   #39 = Methodref          #40.#41       // ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
   #40 = Class              #42           // ext/mods/gameserver/data/HTMLData
   #41 = NameAndType        #43:#44       // getInstance:()Lext/mods/gameserver/data/HTMLData;
   #42 = Utf8               ext/mods/gameserver/data/HTMLData
   #43 = Utf8               getInstance
   #44 = Utf8               ()Lext/mods/gameserver/data/HTMLData;
   #45 = Methodref          #46.#47       // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
   #46 = Class              #48           // ext/mods/gameserver/model/actor/Player
   #47 = NameAndType        #49:#50       // getLocale:()Ljava/util/Locale;
   #48 = Utf8               ext/mods/gameserver/model/actor/Player
   #49 = Utf8               getLocale
   #50 = Utf8               ()Ljava/util/Locale;
   #51 = Methodref          #10.#52       // ext/mods/gameserver/communitybbs/custom/ShopBBSManager.getFolder:()Ljava/lang/String;
   #52 = NameAndType        #53:#54       // getFolder:()Ljava/lang/String;
   #53 = Utf8               getFolder
   #54 = Utf8               ()Ljava/lang/String;
   #55 = InvokeDynamic      #0:#56        // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #56 = NameAndType        #57:#58       // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #57 = Utf8               makeConcatWithConstants
   #58 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #59 = Methodref          #40.#60       // ext/mods/gameserver/data/HTMLData.getHtm:(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
   #60 = NameAndType        #61:#62       // getHtm:(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
   #61 = Utf8               getHtm
   #62 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
   #63 = String             #64           // %name%
   #64 = Utf8               %name%
   #65 = Methodref          #46.#66       // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
   #66 = NameAndType        #67:#54       // getName:()Ljava/lang/String;
   #67 = Utf8               getName
   #68 = Methodref          #18.#69       // java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
   #69 = NameAndType        #70:#71       // replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
   #70 = Utf8               replace
   #71 = Utf8               (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
   #72 = Methodref          #10.#73       // ext/mods/gameserver/communitybbs/custom/ShopBBSManager.separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #73 = NameAndType        #74:#14       // separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #74 = Utf8               separateAndSend
   #75 = String             #76           // _maillist_0_1_0_;sell
   #76 = Utf8               _maillist_0_1_0_;sell
   #77 = Methodref          #46.#78       // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #78 = NameAndType        #79:#80       // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #79 = Utf8               getInventory
   #80 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #81 = Methodref          #82.#83       // ext/mods/gameserver/model/itemcontainer/PcInventory.getSellableItems:()Ljava/util/List;
   #82 = Class              #84           // ext/mods/gameserver/model/itemcontainer/PcInventory
   #83 = NameAndType        #85:#86       // getSellableItems:()Ljava/util/List;
   #84 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
   #85 = Utf8               getSellableItems
   #86 = Utf8               ()Ljava/util/List;
   #87 = Class              #88           // ext/mods/gameserver/network/serverpackets/SellList
   #88 = Utf8               ext/mods/gameserver/network/serverpackets/SellList
   #89 = Methodref          #46.#90       // ext/mods/gameserver/model/actor/Player.getAdena:()I
   #90 = NameAndType        #91:#92       // getAdena:()I
   #91 = Utf8               getAdena
   #92 = Utf8               ()I
   #93 = Methodref          #87.#94       // ext/mods/gameserver/network/serverpackets/SellList."<init>":(IILjava/util/List;)V
   #94 = NameAndType        #5:#95        // "<init>":(IILjava/util/List;)V
   #95 = Utf8               (IILjava/util/List;)V
   #96 = Methodref          #46.#97       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #97 = NameAndType        #98:#99       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #98 = Utf8               sendPacket
   #99 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #100 = String             #101          // _maillist_0_1_0_;augment
  #101 = Utf8               _maillist_0_1_0_;augment
  #102 = Methodref          #18.#103      // java/lang/String.substring:(I)Ljava/lang/String;
  #103 = NameAndType        #104:#105     // substring:(I)Ljava/lang/String;
  #104 = Utf8               substring
  #105 = Utf8               (I)Ljava/lang/String;
  #106 = Methodref          #18.#107      // java/lang/String.trim:()Ljava/lang/String;
  #107 = NameAndType        #108:#54      // trim:()Ljava/lang/String;
  #108 = Utf8               trim
  #109 = Methodref          #110.#111     // java/lang/Integer.parseInt:(Ljava/lang/String;)I
  #110 = Class              #112          // java/lang/Integer
  #111 = NameAndType        #113:#114     // parseInt:(Ljava/lang/String;)I
  #112 = Utf8               java/lang/Integer
  #113 = Utf8               parseInt
  #114 = Utf8               (Ljava/lang/String;)I
  #115 = Fieldref           #116.#117     // ext/mods/gameserver/network/SystemMessageId.SELECT_THE_ITEM_TO_BE_AUGMENTED:Lext/mods/gameserver/network/SystemMessageId;
  #116 = Class              #118          // ext/mods/gameserver/network/SystemMessageId
  #117 = NameAndType        #119:#120     // SELECT_THE_ITEM_TO_BE_AUGMENTED:Lext/mods/gameserver/network/SystemMessageId;
  #118 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #119 = Utf8               SELECT_THE_ITEM_TO_BE_AUGMENTED
  #120 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #121 = Methodref          #46.#122      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #122 = NameAndType        #98:#123      // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #123 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #124 = Fieldref           #125.#126     // ext/mods/gameserver/network/serverpackets/ExShowVariationMakeWindow.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ExShowVariationMakeWindow;
  #125 = Class              #127          // ext/mods/gameserver/network/serverpackets/ExShowVariationMakeWindow
  #126 = NameAndType        #128:#129     // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ExShowVariationMakeWindow;
  #127 = Utf8               ext/mods/gameserver/network/serverpackets/ExShowVariationMakeWindow
  #128 = Utf8               STATIC_PACKET
  #129 = Utf8               Lext/mods/gameserver/network/serverpackets/ExShowVariationMakeWindow;
  #130 = Fieldref           #116.#131     // ext/mods/gameserver/network/SystemMessageId.SELECT_THE_ITEM_FROM_WHICH_YOU_WISH_TO_REMOVE_AUGMENTATION:Lext/mods/gameserver/network/SystemMessageId;
  #131 = NameAndType        #132:#120     // SELECT_THE_ITEM_FROM_WHICH_YOU_WISH_TO_REMOVE_AUGMENTATION:Lext/mods/gameserver/network/SystemMessageId;
  #132 = Utf8               SELECT_THE_ITEM_FROM_WHICH_YOU_WISH_TO_REMOVE_AUGMENTATION
  #133 = Fieldref           #134.#135     // ext/mods/gameserver/network/serverpackets/ExShowVariationCancelWindow.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ExShowVariationCancelWindow;
  #134 = Class              #136          // ext/mods/gameserver/network/serverpackets/ExShowVariationCancelWindow
  #135 = NameAndType        #128:#137     // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ExShowVariationCancelWindow;
  #136 = Utf8               ext/mods/gameserver/network/serverpackets/ExShowVariationCancelWindow
  #137 = Utf8               Lext/mods/gameserver/network/serverpackets/ExShowVariationCancelWindow;
  #138 = InvokeDynamic      #1:#139       // #1:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #139 = NameAndType        #57:#140      // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #140 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #141 = String             #142          // custom/shop/
  #142 = Utf8               custom/shop/
  #143 = Fieldref           #144.#145     // ext/mods/gameserver/communitybbs/custom/ShopBBSManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/communitybbs/custom/ShopBBSManager;
  #144 = Class              #146          // ext/mods/gameserver/communitybbs/custom/ShopBBSManager$SingletonHolder
  #145 = NameAndType        #147:#148     // INSTANCE:Lext/mods/gameserver/communitybbs/custom/ShopBBSManager;
  #146 = Utf8               ext/mods/gameserver/communitybbs/custom/ShopBBSManager$SingletonHolder
  #147 = Utf8               INSTANCE
  #148 = Utf8               Lext/mods/gameserver/communitybbs/custom/ShopBBSManager;
  #149 = Utf8               BBS_SELL_LIST_ID
  #150 = Utf8               I
  #151 = Utf8               ConstantValue
  #152 = Integer            9999
  #153 = Utf8               Code
  #154 = Utf8               LineNumberTable
  #155 = Utf8               LocalVariableTable
  #156 = Utf8               this
  #157 = Utf8               parseCmd
  #158 = Utf8               args
  #159 = Utf8               [Ljava/lang/String;
  #160 = Utf8               content
  #161 = Utf8               Ljava/lang/String;
  #162 = Utf8               items
  #163 = Utf8               Ljava/util/List;
  #164 = Utf8               cmdChoice
  #165 = Utf8               command
  #166 = Utf8               player
  #167 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #168 = Utf8               LocalVariableTypeTable
  #169 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/item/instance/ItemInstance;>;
  #170 = Utf8               StackMapTable
  #171 = Utf8               page
  #172 = Utf8               ()Lext/mods/gameserver/communitybbs/custom/ShopBBSManager;
  #173 = Utf8               SourceFile
  #174 = Utf8               ShopBBSManager.java
  #175 = Utf8               NestMembers
  #176 = Utf8               BootstrapMethods
  #177 = String             #178          // html/CommunityBoard/\u0001crafter.htm
  #178 = Utf8               html/CommunityBoard/\u0001crafter.htm
  #179 = String             #180          // html/CommunityBoard/\u0001\u0001.htm
  #180 = Utf8               html/CommunityBoard/\u0001\u0001.htm
  #181 = MethodHandle       6:#182        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #182 = Methodref          #183.#184     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #183 = Class              #185          // java/lang/invoke/StringConcatFactory
  #184 = NameAndType        #57:#186      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #185 = Utf8               java/lang/invoke/StringConcatFactory
  #186 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #187 = Utf8               InnerClasses
  #188 = Utf8               SingletonHolder
  #189 = Class              #190          // java/lang/invoke/MethodHandles$Lookup
  #190 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #191 = Class              #192          // java/lang/invoke/MethodHandles
  #192 = Utf8               java/lang/invoke/MethodHandles
  #193 = Utf8               Lookup
{
  public static final int BBS_SELL_LIST_ID;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 9999

  public ext.mods.gameserver.communitybbs.custom.ShopBBSManager();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/communitybbs/manager/BaseBBSManager."<init>":()V
         4: return
      LineNumberTable:
        line 31: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/communitybbs/custom/ShopBBSManager;

  public void parseCmd(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=4, args_size=3
         0: aload_0
         1: ldc           #7                  // String index
         3: aload_2
         4: invokevirtual #9                  // Method showPage:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
         7: aload_1
         8: ldc           #15                 // String _maillist_0_1_0_
        10: invokevirtual #17                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        13: ifeq          26
        16: aload_0
        17: ldc           #7                  // String index
        19: aload_2
        20: invokevirtual #9                  // Method showPage:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
        23: goto          239
        26: aload_1
        27: ldc           #23                 // String _maillist_0_1_0_;page
        29: invokevirtual #25                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        32: ifeq          66
        35: aload_0
        36: ldc           #7                  // String index
        38: aload_2
        39: invokevirtual #9                  // Method showPage:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
        42: aload_1
        43: ldc           #29                 // String
        45: invokevirtual #31                 // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        48: astore_3
        49: aload_3
        50: arraylength
        51: iconst_1
        52: if_icmple     63
        55: aload_0
        56: aload_3
        57: iconst_1
        58: aaload
        59: aload_2
        60: invokevirtual #9                  // Method showPage:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
        63: goto          239
        66: aload_1
        67: ldc           #35                 // String _maillist_0_1_0_;crafter
        69: invokevirtual #25                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        72: ifeq          121
        75: aload_0
        76: ldc           #37                 // String crafter
        78: aload_2
        79: invokevirtual #9                  // Method showPage:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
        82: invokestatic  #39                 // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
        85: aload_2
        86: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        89: aload_0
        90: invokevirtual #51                 // Method getFolder:()Ljava/lang/String;
        93: invokedynamic #55,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        98: invokevirtual #59                 // Method ext/mods/gameserver/data/HTMLData.getHtm:(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
       101: astore_3
       102: aload_3
       103: ldc           #63                 // String %name%
       105: aload_2
       106: invokevirtual #65                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       109: invokevirtual #68                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       112: astore_3
       113: aload_3
       114: aload_2
       115: invokestatic  #72                 // Method separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       118: goto          239
       121: aload_1
       122: ldc           #75                 // String _maillist_0_1_0_;sell
       124: invokevirtual #25                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       127: ifeq          160
       130: aload_2
       131: invokevirtual #77                 // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       134: invokevirtual #81                 // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getSellableItems:()Ljava/util/List;
       137: astore_3
       138: aload_2
       139: new           #87                 // class ext/mods/gameserver/network/serverpackets/SellList
       142: dup
       143: sipush        9999
       146: aload_2
       147: invokevirtual #89                 // Method ext/mods/gameserver/model/actor/Player.getAdena:()I
       150: aload_3
       151: invokespecial #93                 // Method ext/mods/gameserver/network/serverpackets/SellList."<init>":(IILjava/util/List;)V
       154: invokevirtual #96                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       157: goto          239
       160: aload_1
       161: ldc           #100                // String _maillist_0_1_0_;augment
       163: invokevirtual #25                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       166: ifeq          239
       169: aload_1
       170: bipush        25
       172: invokevirtual #102                // Method java/lang/String.substring:(I)Ljava/lang/String;
       175: invokevirtual #106                // Method java/lang/String.trim:()Ljava/lang/String;
       178: invokestatic  #109                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       181: istore_3
       182: iload_3
       183: lookupswitch  { // 2

                       1: 208

                       2: 225
                 default: 239
            }
       208: aload_2
       209: getstatic     #115                // Field ext/mods/gameserver/network/SystemMessageId.SELECT_THE_ITEM_TO_BE_AUGMENTED:Lext/mods/gameserver/network/SystemMessageId;
       212: invokevirtual #121                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       215: aload_2
       216: getstatic     #124                // Field ext/mods/gameserver/network/serverpackets/ExShowVariationMakeWindow.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ExShowVariationMakeWindow;
       219: invokevirtual #96                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       222: goto          239
       225: aload_2
       226: getstatic     #130                // Field ext/mods/gameserver/network/SystemMessageId.SELECT_THE_ITEM_FROM_WHICH_YOU_WISH_TO_REMOVE_AUGMENTATION:Lext/mods/gameserver/network/SystemMessageId;
       229: invokevirtual #121                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       232: aload_2
       233: getstatic     #133                // Field ext/mods/gameserver/network/serverpackets/ExShowVariationCancelWindow.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ExShowVariationCancelWindow;
       236: invokevirtual #96                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       239: return
      LineNumberTable:
        line 38: 0
        line 40: 7
        line 41: 16
        line 42: 26
        line 44: 35
        line 46: 42
        line 47: 49
        line 48: 55
        line 49: 63
        line 50: 66
        line 52: 75
        line 54: 82
        line 55: 102
        line 56: 113
        line 57: 118
        line 58: 121
        line 60: 130
        line 61: 138
        line 62: 157
        line 63: 160
        line 66: 169
        line 67: 182
        line 70: 208
        line 71: 215
        line 72: 222
        line 74: 225
        line 75: 232
        line 79: 239
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           49      14     3  args   [Ljava/lang/String;
          102      16     3 content   Ljava/lang/String;
          138      19     3 items   Ljava/util/List;
          182      57     3 cmdChoice   I
            0     240     0  this   Lext/mods/gameserver/communitybbs/custom/ShopBBSManager;
            0     240     1 command   Ljava/lang/String;
            0     240     2 player   Lext/mods/gameserver/model/actor/Player;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
          138      19     3 items   Ljava/util/List<Lext/mods/gameserver/model/item/instance/ItemInstance;>;
      StackMapTable: number_of_entries = 8
        frame_type = 26 /* same */
        frame_type = 36 /* same */
        frame_type = 2 /* same */
        frame_type = 54 /* same */
        frame_type = 38 /* same */
        frame_type = 252 /* append */
          offset_delta = 47
          locals = [ int ]
        frame_type = 16 /* same */
        frame_type = 250 /* chop */
          offset_delta = 13

  protected java.lang.String getFolder();
    descriptor: ()Ljava/lang/String;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: ldc           #141                // String custom/shop/
         2: areturn
      LineNumberTable:
        line 91: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       3     0  this   Lext/mods/gameserver/communitybbs/custom/ShopBBSManager;

  public static ext.mods.gameserver.communitybbs.custom.ShopBBSManager getInstance();
    descriptor: ()Lext/mods/gameserver/communitybbs/custom/ShopBBSManager;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #143                // Field ext/mods/gameserver/communitybbs/custom/ShopBBSManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/communitybbs/custom/ShopBBSManager;
         3: areturn
      LineNumberTable:
        line 96: 0
}
SourceFile: "ShopBBSManager.java"
NestMembers:
  ext/mods/gameserver/communitybbs/custom/ShopBBSManager$SingletonHolder
BootstrapMethods:
  0: #181 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #177 html/CommunityBoard/\u0001crafter.htm
  1: #181 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #179 html/CommunityBoard/\u0001\u0001.htm
InnerClasses:
  public static final #193= #189 of #191; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
