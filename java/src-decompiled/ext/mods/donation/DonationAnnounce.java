// Bytecode for: ext.mods.donation.DonationAnnounce
// File: ext\mods\donation\DonationAnnounce.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/donation/DonationAnnounce.class
  Last modified 9 de jul de 2026; size 2561 bytes
  MD5 checksum c03cd9b1b4a67c530deb69c1bfe03574
  Compiled from "DonationAnnounce.java"
public final class ext.mods.donation.DonationAnnounce
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #62                         // ext/mods/donation/DonationAnnounce
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 3, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/Config.ANNOUNCE_DONATOR_ITEM_GLOBAL:Z
    #8 = Class              #10           // ext/mods/Config
    #9 = NameAndType        #11:#12       // ANNOUNCE_DONATOR_ITEM_GLOBAL:Z
   #10 = Utf8               ext/mods/Config
   #11 = Utf8               ANNOUNCE_DONATOR_ITEM_GLOBAL
   #12 = Utf8               Z
   #13 = Methodref          #14.#15       // java/lang/String.isEmpty:()Z
   #14 = Class              #16           // java/lang/String
   #15 = NameAndType        #17:#18       // isEmpty:()Z
   #16 = Utf8               java/lang/String
   #17 = Utf8               isEmpty
   #18 = Utf8               ()Z
   #19 = Class              #20           // ext/mods/gameserver/network/serverpackets/CreatureSay
   #20 = Utf8               ext/mods/gameserver/network/serverpackets/CreatureSay
   #21 = Fieldref           #22.#23       // ext/mods/gameserver/enums/SayType.ANNOUNCEMENT:Lext/mods/gameserver/enums/SayType;
   #22 = Class              #24           // ext/mods/gameserver/enums/SayType
   #23 = NameAndType        #25:#26       // ANNOUNCEMENT:Lext/mods/gameserver/enums/SayType;
   #24 = Utf8               ext/mods/gameserver/enums/SayType
   #25 = Utf8               ANNOUNCEMENT
   #26 = Utf8               Lext/mods/gameserver/enums/SayType;
   #27 = String             #28           // PIX
   #28 = Utf8               PIX
   #29 = InvokeDynamic      #0:#30        // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #30 = NameAndType        #31:#32       // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #31 = Utf8               makeConcatWithConstants
   #32 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #33 = Methodref          #19.#34       // ext/mods/gameserver/network/serverpackets/CreatureSay."<init>":(Lext/mods/gameserver/enums/SayType;Ljava/lang/String;Ljava/lang/String;)V
   #34 = NameAndType        #5:#35        // "<init>":(Lext/mods/gameserver/enums/SayType;Ljava/lang/String;Ljava/lang/String;)V
   #35 = Utf8               (Lext/mods/gameserver/enums/SayType;Ljava/lang/String;Ljava/lang/String;)V
   #36 = Methodref          #37.#38       // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
   #37 = Class              #39           // ext/mods/gameserver/model/World
   #38 = NameAndType        #40:#41       // getInstance:()Lext/mods/gameserver/model/World;
   #39 = Utf8               ext/mods/gameserver/model/World
   #40 = Utf8               getInstance
   #41 = Utf8               ()Lext/mods/gameserver/model/World;
   #42 = Methodref          #37.#43       // ext/mods/gameserver/model/World.getPlayers:()Ljava/util/Collection;
   #43 = NameAndType        #44:#45       // getPlayers:()Ljava/util/Collection;
   #44 = Utf8               getPlayers
   #45 = Utf8               ()Ljava/util/Collection;
   #46 = InvokeDynamic      #1:#47        // #1:accept:(Lext/mods/gameserver/network/serverpackets/CreatureSay;)Ljava/util/function/Consumer;
   #47 = NameAndType        #48:#49       // accept:(Lext/mods/gameserver/network/serverpackets/CreatureSay;)Ljava/util/function/Consumer;
   #48 = Utf8               accept
   #49 = Utf8               (Lext/mods/gameserver/network/serverpackets/CreatureSay;)Ljava/util/function/Consumer;
   #50 = InterfaceMethodref #51.#52       // java/util/Collection.forEach:(Ljava/util/function/Consumer;)V
   #51 = Class              #53           // java/util/Collection
   #52 = NameAndType        #54:#55       // forEach:(Ljava/util/function/Consumer;)V
   #53 = Utf8               java/util/Collection
   #54 = Utf8               forEach
   #55 = Utf8               (Ljava/util/function/Consumer;)V
   #56 = Methodref          #57.#58       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #57 = Class              #59           // ext/mods/gameserver/model/actor/Player
   #58 = NameAndType        #60:#61       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #59 = Utf8               ext/mods/gameserver/model/actor/Player
   #60 = Utf8               sendPacket
   #61 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #62 = Class              #63           // ext/mods/donation/DonationAnnounce
   #63 = Utf8               ext/mods/donation/DonationAnnounce
   #64 = Utf8               Code
   #65 = Utf8               LineNumberTable
   #66 = Utf8               LocalVariableTable
   #67 = Utf8               this
   #68 = Utf8               Lext/mods/donation/DonationAnnounce;
   #69 = Utf8               announceCompleted
   #70 = Utf8               (Ljava/lang/String;)V
   #71 = Utf8               playerName
   #72 = Utf8               Ljava/lang/String;
   #73 = Utf8               cs
   #74 = Utf8               Lext/mods/gameserver/network/serverpackets/CreatureSay;
   #75 = Utf8               StackMapTable
   #76 = Utf8               lambda$announceCompleted$0
   #77 = Utf8               (Lext/mods/gameserver/network/serverpackets/CreatureSay;Lext/mods/gameserver/model/actor/Player;)V
   #78 = Utf8               p
   #79 = Utf8               Lext/mods/gameserver/model/actor/Player;
   #80 = Utf8               SourceFile
   #81 = Utf8               DonationAnnounce.java
   #82 = Utf8               BootstrapMethods
   #83 = String             #84           // \u0001 concluiu uma doacao via PIX.
   #84 = Utf8               \u0001 concluiu uma doacao via PIX.
   #85 = MethodType         #86           //  (Ljava/lang/Object;)V
   #86 = Utf8               (Ljava/lang/Object;)V
   #87 = MethodHandle       6:#88         // REF_invokeStatic ext/mods/donation/DonationAnnounce.lambda$announceCompleted$0:(Lext/mods/gameserver/network/serverpackets/CreatureSay;Lext/mods/gameserver/model/actor/Player;)V
   #88 = Methodref          #62.#89       // ext/mods/donation/DonationAnnounce.lambda$announceCompleted$0:(Lext/mods/gameserver/network/serverpackets/CreatureSay;Lext/mods/gameserver/model/actor/Player;)V
   #89 = NameAndType        #76:#77       // lambda$announceCompleted$0:(Lext/mods/gameserver/network/serverpackets/CreatureSay;Lext/mods/gameserver/model/actor/Player;)V
   #90 = MethodType         #91           //  (Lext/mods/gameserver/model/actor/Player;)V
   #91 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #92 = MethodHandle       6:#93         // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #93 = Methodref          #94.#95       // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #94 = Class              #96           // java/lang/invoke/StringConcatFactory
   #95 = NameAndType        #31:#97       // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #96 = Utf8               java/lang/invoke/StringConcatFactory
   #97 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #98 = MethodHandle       6:#99         // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
   #99 = Methodref          #100.#101     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #100 = Class              #102          // java/lang/invoke/LambdaMetafactory
  #101 = NameAndType        #103:#104     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #102 = Utf8               java/lang/invoke/LambdaMetafactory
  #103 = Utf8               metafactory
  #104 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #105 = Utf8               InnerClasses
  #106 = Class              #107          // java/lang/invoke/MethodHandles$Lookup
  #107 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #108 = Class              #109          // java/lang/invoke/MethodHandles
  #109 = Utf8               java/lang/invoke/MethodHandles
  #110 = Utf8               Lookup
{
  public static void announceCompleted(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=5, locals=2, args_size=1
         0: getstatic     #7                  // Field ext/mods/Config.ANNOUNCE_DONATOR_ITEM_GLOBAL:Z
         3: ifeq          17
         6: aload_0
         7: ifnull        17
        10: aload_0
        11: invokevirtual #13                 // Method java/lang/String.isEmpty:()Z
        14: ifeq          18
        17: return
        18: new           #19                 // class ext/mods/gameserver/network/serverpackets/CreatureSay
        21: dup
        22: getstatic     #21                 // Field ext/mods/gameserver/enums/SayType.ANNOUNCEMENT:Lext/mods/gameserver/enums/SayType;
        25: ldc           #27                 // String PIX
        27: aload_0
        28: invokedynamic #29,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        33: invokespecial #33                 // Method ext/mods/gameserver/network/serverpackets/CreatureSay."<init>":(Lext/mods/gameserver/enums/SayType;Ljava/lang/String;Ljava/lang/String;)V
        36: astore_1
        37: invokestatic  #36                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
        40: invokevirtual #42                 // Method ext/mods/gameserver/model/World.getPlayers:()Ljava/util/Collection;
        43: aload_1
        44: invokedynamic #46,  0             // InvokeDynamic #1:accept:(Lext/mods/gameserver/network/serverpackets/CreatureSay;)Ljava/util/function/Consumer;
        49: invokeinterface #50,  2           // InterfaceMethod java/util/Collection.forEach:(Ljava/util/function/Consumer;)V
        54: return
      LineNumberTable:
        line 26: 0
        line 27: 17
        line 29: 18
        line 30: 37
        line 31: 54
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      55     0 playerName   Ljava/lang/String;
           37      18     1    cs   Lext/mods/gameserver/network/serverpackets/CreatureSay;
      StackMapTable: number_of_entries = 2
        frame_type = 17 /* same */
        frame_type = 0 /* same */
}
SourceFile: "DonationAnnounce.java"
BootstrapMethods:
  0: #92 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #83 \u0001 concluiu uma doacao via PIX.
  1: #98 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #85 (Ljava/lang/Object;)V
      #87 REF_invokeStatic ext/mods/donation/DonationAnnounce.lambda$announceCompleted$0:(Lext/mods/gameserver/network/serverpackets/CreatureSay;Lext/mods/gameserver/model/actor/Player;)V
      #90 (Lext/mods/gameserver/model/actor/Player;)V
InnerClasses:
  public static final #110= #106 of #108; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
