// Bytecode for: ext.mods.gameserver.handler.itemhandlers.Books
// File: ext\mods\gameserver\handler\itemhandlers\Books.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/itemhandlers/Books.class
  Last modified 9 de jul de 2026; size 2002 bytes
  MD5 checksum adc723f0d38f629369c3c9eabfe06f6b
  Compiled from "Books.java"
public class ext.mods.gameserver.handler.itemhandlers.Books implements ext.mods.gameserver.handler.IItemHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #45                         // ext/mods/gameserver/handler/itemhandlers/Books
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 0, methods: 2, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Class              #8             // ext/mods/gameserver/model/actor/Player
   #8 = Utf8               ext/mods/gameserver/model/actor/Player
   #9 = Class              #10            // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #10 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #11 = Methodref          #9.#12         // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
  #12 = NameAndType        #5:#13         // "<init>":(I)V
  #13 = Utf8               (I)V
  #14 = Methodref          #7.#15         // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
  #15 = NameAndType        #16:#17        // getLocale:()Ljava/util/Locale;
  #16 = Utf8               getLocale
  #17 = Utf8               ()Ljava/util/Locale;
  #18 = Methodref          #19.#20        // ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
  #19 = Class              #21            // ext/mods/gameserver/model/item/instance/ItemInstance
  #20 = NameAndType        #22:#23        // getItemId:()I
  #21 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #22 = Utf8               getItemId
  #23 = Utf8               ()I
  #24 = InvokeDynamic      #0:#25         // #0:makeConcatWithConstants:(I)Ljava/lang/String;
  #25 = NameAndType        #26:#27        // makeConcatWithConstants:(I)Ljava/lang/String;
  #26 = Utf8               makeConcatWithConstants
  #27 = Utf8               (I)Ljava/lang/String;
  #28 = Methodref          #9.#29         // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #29 = NameAndType        #30:#31        // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #30 = Utf8               setFile
  #31 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
  #32 = Methodref          #9.#33         // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setItemId:(I)V
  #33 = NameAndType        #34:#13        // setItemId:(I)V
  #34 = Utf8               setItemId
  #35 = Methodref          #7.#36         // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #36 = NameAndType        #37:#38        // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #37 = Utf8               sendPacket
  #38 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #39 = Fieldref           #40.#41        // ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #40 = Class              #42            // ext/mods/gameserver/network/serverpackets/ActionFailed
  #41 = NameAndType        #43:#44        // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #42 = Utf8               ext/mods/gameserver/network/serverpackets/ActionFailed
  #43 = Utf8               STATIC_PACKET
  #44 = Utf8               Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #45 = Class              #46            // ext/mods/gameserver/handler/itemhandlers/Books
  #46 = Utf8               ext/mods/gameserver/handler/itemhandlers/Books
  #47 = Class              #48            // ext/mods/gameserver/handler/IItemHandler
  #48 = Utf8               ext/mods/gameserver/handler/IItemHandler
  #49 = Utf8               Code
  #50 = Utf8               LineNumberTable
  #51 = Utf8               LocalVariableTable
  #52 = Utf8               this
  #53 = Utf8               Lext/mods/gameserver/handler/itemhandlers/Books;
  #54 = Utf8               useItem
  #55 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #56 = Utf8               player
  #57 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #58 = Utf8               playable
  #59 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #60 = Utf8               item
  #61 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #62 = Utf8               forceUse
  #63 = Utf8               Z
  #64 = Utf8               html
  #65 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #66 = Utf8               StackMapTable
  #67 = Utf8               SourceFile
  #68 = Utf8               Books.java
  #69 = Utf8               BootstrapMethods
  #70 = String             #71            // html/help/\u0001.htm
  #71 = Utf8               html/help/\u0001.htm
  #72 = MethodHandle       6:#73          // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #73 = Methodref          #74.#75        // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #74 = Class              #76            // java/lang/invoke/StringConcatFactory
  #75 = NameAndType        #26:#77        // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #76 = Utf8               java/lang/invoke/StringConcatFactory
  #77 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #78 = Utf8               InnerClasses
  #79 = Class              #80            // java/lang/invoke/MethodHandles$Lookup
  #80 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #81 = Class              #82            // java/lang/invoke/MethodHandles
  #82 = Utf8               java/lang/invoke/MethodHandles
  #83 = Utf8               Lookup
{
  public ext.mods.gameserver.handler.itemhandlers.Books();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 27: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/itemhandlers/Books;

  public void useItem(ext.mods.gameserver.model.actor.Playable, ext.mods.gameserver.model.item.instance.ItemInstance, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=6, args_size=4
         0: aload_1
         1: instanceof    #7                  // class ext/mods/gameserver/model/actor/Player
         4: ifeq          16
         7: aload_1
         8: checkcast     #7                  // class ext/mods/gameserver/model/actor/Player
        11: astore        4
        13: goto          17
        16: return
        17: new           #9                  // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
        20: dup
        21: iconst_0
        22: invokespecial #11                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
        25: astore        5
        27: aload         5
        29: aload         4
        31: invokevirtual #14                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        34: aload_2
        35: invokevirtual #18                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        38: invokedynamic #24,  0             // InvokeDynamic #0:makeConcatWithConstants:(I)Ljava/lang/String;
        43: invokevirtual #28                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        46: aload         5
        48: aload_2
        49: invokevirtual #18                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        52: invokevirtual #32                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setItemId:(I)V
        55: aload         4
        57: aload         5
        59: invokevirtual #35                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        62: aload         4
        64: getstatic     #39                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
        67: invokevirtual #35                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        70: return
      LineNumberTable:
        line 32: 0
        line 33: 16
        line 35: 17
        line 36: 27
        line 37: 46
        line 38: 55
        line 40: 62
        line 41: 70
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           13       3     4 player   Lext/mods/gameserver/model/actor/Player;
            0      71     0  this   Lext/mods/gameserver/handler/itemhandlers/Books;
            0      71     1 playable   Lext/mods/gameserver/model/actor/Playable;
            0      71     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      71     3 forceUse   Z
           17      54     4 player   Lext/mods/gameserver/model/actor/Player;
           27      44     5  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
      StackMapTable: number_of_entries = 2
        frame_type = 16 /* same */
        frame_type = 252 /* append */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/Player ]
}
SourceFile: "Books.java"
BootstrapMethods:
  0: #72 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #70 html/help/\u0001.htm
InnerClasses:
  public static final #83= #79 of #81;    // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
