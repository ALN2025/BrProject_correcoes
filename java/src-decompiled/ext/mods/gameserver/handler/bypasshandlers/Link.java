// Bytecode for: ext.mods.gameserver.handler.bypasshandlers.Link
// File: ext\mods\gameserver\handler\bypasshandlers\Link.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/bypasshandlers/Link.class
  Last modified 9 de jul de 2026; size 2231 bytes
  MD5 checksum 2c7f265385f8c59095cd3f6f211602ea
  Compiled from "Link.java"
public class ext.mods.gameserver.handler.bypasshandlers.Link implements ext.mods.gameserver.handler.IBypassHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #59                         // ext/mods/gameserver/handler/bypasshandlers/Link
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // java/lang/String.substring:(I)Ljava/lang/String;
    #8 = Class              #10           // java/lang/String
    #9 = NameAndType        #11:#12       // substring:(I)Ljava/lang/String;
   #10 = Utf8               java/lang/String
   #11 = Utf8               substring
   #12 = Utf8               (I)Ljava/lang/String;
   #13 = Methodref          #8.#14        // java/lang/String.trim:()Ljava/lang/String;
   #14 = NameAndType        #15:#16       // trim:()Ljava/lang/String;
   #15 = Utf8               trim
   #16 = Utf8               ()Ljava/lang/String;
   #17 = String             #18           // ..
   #18 = Utf8               ..
   #19 = Methodref          #8.#20        // java/lang/String.indexOf:(Ljava/lang/String;)I
   #20 = NameAndType        #21:#22       // indexOf:(Ljava/lang/String;)I
   #21 = Utf8               indexOf
   #22 = Utf8               (Ljava/lang/String;)I
   #23 = Class              #24           // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #24 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #25 = Methodref          #26.#27       // ext/mods/gameserver/model/actor/Creature.getObjectId:()I
   #26 = Class              #28           // ext/mods/gameserver/model/actor/Creature
   #27 = NameAndType        #29:#30       // getObjectId:()I
   #28 = Utf8               ext/mods/gameserver/model/actor/Creature
   #29 = Utf8               getObjectId
   #30 = Utf8               ()I
   #31 = Methodref          #23.#32       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
   #32 = NameAndType        #5:#33        // "<init>":(I)V
   #33 = Utf8               (I)V
   #34 = Methodref          #35.#36       // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
   #35 = Class              #37           // ext/mods/gameserver/model/actor/Player
   #36 = NameAndType        #38:#39       // getLocale:()Ljava/util/Locale;
   #37 = Utf8               ext/mods/gameserver/model/actor/Player
   #38 = Utf8               getLocale
   #39 = Utf8               ()Ljava/util/Locale;
   #40 = InvokeDynamic      #0:#41        // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #41 = NameAndType        #42:#43       // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #42 = Utf8               makeConcatWithConstants
   #43 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #44 = Methodref          #23.#45       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
   #45 = NameAndType        #46:#47       // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
   #46 = Utf8               setFile
   #47 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
   #48 = String             #49           // %objectId%
   #49 = Utf8               %objectId%
   #50 = Methodref          #23.#51       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
   #51 = NameAndType        #52:#53       // replace:(Ljava/lang/String;I)V
   #52 = Utf8               replace
   #53 = Utf8               (Ljava/lang/String;I)V
   #54 = Methodref          #35.#55       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #55 = NameAndType        #56:#57       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #56 = Utf8               sendPacket
   #57 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #58 = Fieldref           #59.#60       // ext/mods/gameserver/handler/bypasshandlers/Link.COMMANDS:[Ljava/lang/String;
   #59 = Class              #61           // ext/mods/gameserver/handler/bypasshandlers/Link
   #60 = NameAndType        #62:#63       // COMMANDS:[Ljava/lang/String;
   #61 = Utf8               ext/mods/gameserver/handler/bypasshandlers/Link
   #62 = Utf8               COMMANDS
   #63 = Utf8               [Ljava/lang/String;
   #64 = String             #65           // Link
   #65 = Utf8               Link
   #66 = Class              #67           // ext/mods/gameserver/handler/IBypassHandler
   #67 = Utf8               ext/mods/gameserver/handler/IBypassHandler
   #68 = Utf8               Code
   #69 = Utf8               LineNumberTable
   #70 = Utf8               LocalVariableTable
   #71 = Utf8               this
   #72 = Utf8               Lext/mods/gameserver/handler/bypasshandlers/Link;
   #73 = Utf8               useBypass
   #74 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)Z
   #75 = Utf8               command
   #76 = Utf8               Ljava/lang/String;
   #77 = Utf8               player
   #78 = Utf8               Lext/mods/gameserver/model/actor/Player;
   #79 = Utf8               target
   #80 = Utf8               Lext/mods/gameserver/model/actor/Creature;
   #81 = Utf8               path
   #82 = Utf8               html
   #83 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
   #84 = Utf8               StackMapTable
   #85 = Utf8               getBypassList
   #86 = Utf8               ()[Ljava/lang/String;
   #87 = Utf8               <clinit>
   #88 = Utf8               SourceFile
   #89 = Utf8               Link.java
   #90 = Utf8               BootstrapMethods
   #91 = String             #92           // html/\u0001
   #92 = Utf8               html/\u0001
   #93 = MethodHandle       6:#94         // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #94 = Methodref          #95.#96       // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #95 = Class              #97           // java/lang/invoke/StringConcatFactory
   #96 = NameAndType        #42:#98       // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #97 = Utf8               java/lang/invoke/StringConcatFactory
   #98 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #99 = Utf8               InnerClasses
  #100 = Class              #101          // java/lang/invoke/MethodHandles$Lookup
  #101 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #102 = Class              #103          // java/lang/invoke/MethodHandles
  #103 = Utf8               java/lang/invoke/MethodHandles
  #104 = Utf8               Lookup
{
  public ext.mods.gameserver.handler.bypasshandlers.Link();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 25: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/bypasshandlers/Link;

  public boolean useBypass(java.lang.String, ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.actor.Creature);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=6, args_size=4
         0: aload_1
         1: iconst_5
         2: invokevirtual #7                  // Method java/lang/String.substring:(I)Ljava/lang/String;
         5: invokevirtual #13                 // Method java/lang/String.trim:()Ljava/lang/String;
         8: astore        4
        10: aload         4
        12: ldc           #17                 // String ..
        14: invokevirtual #19                 // Method java/lang/String.indexOf:(Ljava/lang/String;)I
        17: iconst_m1
        18: if_icmpeq     23
        21: iconst_0
        22: ireturn
        23: new           #23                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
        26: dup
        27: aload_3
        28: invokevirtual #25                 // Method ext/mods/gameserver/model/actor/Creature.getObjectId:()I
        31: invokespecial #31                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
        34: astore        5
        36: aload         5
        38: aload_2
        39: invokevirtual #34                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        42: aload         4
        44: invokedynamic #40,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        49: invokevirtual #44                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        52: aload         5
        54: ldc           #48                 // String %objectId%
        56: aload_3
        57: invokevirtual #25                 // Method ext/mods/gameserver/model/actor/Creature.getObjectId:()I
        60: invokevirtual #50                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
        63: aload_2
        64: aload         5
        66: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        69: iconst_1
        70: ireturn
      LineNumberTable:
        line 32: 0
        line 33: 10
        line 34: 21
        line 36: 23
        line 37: 36
        line 38: 52
        line 39: 63
        line 40: 69
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      71     0  this   Lext/mods/gameserver/handler/bypasshandlers/Link;
            0      71     1 command   Ljava/lang/String;
            0      71     2 player   Lext/mods/gameserver/model/actor/Player;
            0      71     3 target   Lext/mods/gameserver/model/actor/Creature;
           10      61     4  path   Ljava/lang/String;
           36      35     5  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ class java/lang/String ]

  public java.lang.String[] getBypassList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #58                 // Field COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 46: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/bypasshandlers/Link;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #8                  // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #64                 // String Link
         8: aastore
         9: putstatic     #58                 // Field COMMANDS:[Ljava/lang/String;
        12: return
      LineNumberTable:
        line 27: 0
}
SourceFile: "Link.java"
BootstrapMethods:
  0: #93 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #91 html/\u0001
InnerClasses:
  public static final #104= #100 of #102; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
