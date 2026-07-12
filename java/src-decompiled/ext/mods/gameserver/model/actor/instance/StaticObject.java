// Bytecode for: ext.mods.gameserver.model.actor.instance.StaticObject
// File: ext\mods\gameserver\model\actor\instance\StaticObject.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/StaticObject.class
  Last modified 9 de jul de 2026; size 3482 bytes
  MD5 checksum 6b2213ea44f7f139db087addb6aa4ea6
  Compiled from "StaticObject.java"
public class ext.mods.gameserver.model.actor.instance.StaticObject extends ext.mods.gameserver.model.WorldObject
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/instance/StaticObject
  super_class: #2                         // ext/mods/gameserver/model/WorldObject
  interfaces: 0, fields: 4, methods: 12, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/WorldObject."<init>":(I)V
    #2 = Class              #4            // ext/mods/gameserver/model/WorldObject
    #3 = NameAndType        #5:#6         // "<init>":(I)V
    #4 = Utf8               ext/mods/gameserver/model/WorldObject
    #5 = Utf8               <init>
    #6 = Utf8               (I)V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/actor/instance/StaticObject._type:I
    #8 = Class              #10           // ext/mods/gameserver/model/actor/instance/StaticObject
    #9 = NameAndType        #11:#12       // _type:I
   #10 = Utf8               ext/mods/gameserver/model/actor/instance/StaticObject
   #11 = Utf8               _type
   #12 = Utf8               I
   #13 = Methodref          #8.#14        // ext/mods/gameserver/model/actor/instance/StaticObject.getType:()I
   #14 = NameAndType        #15:#16       // getType:()I
   #15 = Utf8               getType
   #16 = Utf8               ()I
   #17 = Class              #18           // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #18 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #19 = Methodref          #8.#20        // ext/mods/gameserver/model/actor/instance/StaticObject.getObjectId:()I
   #20 = NameAndType        #21:#16       // getObjectId:()I
   #21 = Utf8               getObjectId
   #22 = Methodref          #17.#3        // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
   #23 = Methodref          #24.#25       // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
   #24 = Class              #26           // ext/mods/gameserver/model/actor/Player
   #25 = NameAndType        #27:#28       // getLocale:()Ljava/util/Locale;
   #26 = Utf8               ext/mods/gameserver/model/actor/Player
   #27 = Utf8               getLocale
   #28 = Utf8               ()Ljava/util/Locale;
   #29 = String             #30           // html/signboard.htm
   #30 = Utf8               html/signboard.htm
   #31 = Methodref          #17.#32       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
   #32 = NameAndType        #33:#34       // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
   #33 = Utf8               setFile
   #34 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
   #35 = Methodref          #24.#36       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #36 = NameAndType        #37:#38       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #37 = Utf8               sendPacket
   #38 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #39 = Methodref          #8.#40        // ext/mods/gameserver/model/actor/instance/StaticObject.getMap:()Lext/mods/gameserver/network/serverpackets/ShowTownMap;
   #40 = NameAndType        #41:#42       // getMap:()Lext/mods/gameserver/network/serverpackets/ShowTownMap;
   #41 = Utf8               getMap
   #42 = Utf8               ()Lext/mods/gameserver/network/serverpackets/ShowTownMap;
   #43 = Methodref          #24.#44       // ext/mods/gameserver/model/actor/Player.getTarget:()Lext/mods/gameserver/model/WorldObject;
   #44 = NameAndType        #45:#46       // getTarget:()Lext/mods/gameserver/model/WorldObject;
   #45 = Utf8               getTarget
   #46 = Utf8               ()Lext/mods/gameserver/model/WorldObject;
   #47 = Methodref          #24.#48       // ext/mods/gameserver/model/actor/Player.setTarget:(Lext/mods/gameserver/model/WorldObject;)V
   #48 = NameAndType        #49:#50       // setTarget:(Lext/mods/gameserver/model/WorldObject;)V
   #49 = Utf8               setTarget
   #50 = Utf8               (Lext/mods/gameserver/model/WorldObject;)V
   #51 = Methodref          #24.#52       // ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
   #52 = NameAndType        #53:#54       // getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
   #53 = Utf8               getAI
   #54 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
   #55 = Methodref          #56.#57       // ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToInteract:(Lext/mods/gameserver/model/WorldObject;ZZ)V
   #56 = Class              #58           // ext/mods/gameserver/model/actor/ai/type/PlayerAI
   #57 = NameAndType        #59:#60       // tryToInteract:(Lext/mods/gameserver/model/WorldObject;ZZ)V
   #58 = Utf8               ext/mods/gameserver/model/actor/ai/type/PlayerAI
   #59 = Utf8               tryToInteract
   #60 = Utf8               (Lext/mods/gameserver/model/WorldObject;ZZ)V
   #61 = Class              #62           // ext/mods/gameserver/network/serverpackets/StaticObjectInfo
   #62 = Utf8               ext/mods/gameserver/network/serverpackets/StaticObjectInfo
   #63 = Methodref          #61.#64       // ext/mods/gameserver/network/serverpackets/StaticObjectInfo."<init>":(Lext/mods/gameserver/model/actor/instance/StaticObject;)V
   #64 = NameAndType        #5:#65        // "<init>":(Lext/mods/gameserver/model/actor/instance/StaticObject;)V
   #65 = Utf8               (Lext/mods/gameserver/model/actor/instance/StaticObject;)V
   #66 = Fieldref           #8.#67        // ext/mods/gameserver/model/actor/instance/StaticObject._staticObjectId:I
   #67 = NameAndType        #68:#12       // _staticObjectId:I
   #68 = Utf8               _staticObjectId
   #69 = Fieldref           #8.#70        // ext/mods/gameserver/model/actor/instance/StaticObject._isBusy:Z
   #70 = NameAndType        #71:#72       // _isBusy:Z
   #71 = Utf8               _isBusy
   #72 = Utf8               Z
   #73 = Fieldref           #8.#74        // ext/mods/gameserver/model/actor/instance/StaticObject._map:Lext/mods/gameserver/network/serverpackets/ShowTownMap;
   #74 = NameAndType        #75:#76       // _map:Lext/mods/gameserver/network/serverpackets/ShowTownMap;
   #75 = Utf8               _map
   #76 = Utf8               Lext/mods/gameserver/network/serverpackets/ShowTownMap;
   #77 = Class              #78           // ext/mods/gameserver/network/serverpackets/ShowTownMap
   #78 = Utf8               ext/mods/gameserver/network/serverpackets/ShowTownMap
   #79 = InvokeDynamic      #0:#80        // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #80 = NameAndType        #81:#82       // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #81 = Utf8               makeConcatWithConstants
   #82 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #83 = Methodref          #77.#84       // ext/mods/gameserver/network/serverpackets/ShowTownMap."<init>":(Ljava/lang/String;II)V
   #84 = NameAndType        #5:#85        // "<init>":(Ljava/lang/String;II)V
   #85 = Utf8               (Ljava/lang/String;II)V
   #86 = Utf8               Code
   #87 = Utf8               LineNumberTable
   #88 = Utf8               LocalVariableTable
   #89 = Utf8               this
   #90 = Utf8               Lext/mods/gameserver/model/actor/instance/StaticObject;
   #91 = Utf8               objectId
   #92 = Utf8               onInteract
   #93 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #94 = Utf8               html
   #95 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
   #96 = Utf8               player
   #97 = Utf8               Lext/mods/gameserver/model/actor/Player;
   #98 = Utf8               StackMapTable
   #99 = Utf8               onAction
  #100 = Utf8               (Lext/mods/gameserver/model/actor/Player;ZZ)V
  #101 = Utf8               isCtrlPressed
  #102 = Utf8               isShiftPressed
  #103 = Utf8               sendInfo
  #104 = Utf8               getStaticObjectId
  #105 = Utf8               setStaticObjectId
  #106 = Utf8               staticObjectId
  #107 = Utf8               setType
  #108 = Utf8               type
  #109 = Utf8               isBusy
  #110 = Utf8               ()Z
  #111 = Utf8               setBusy
  #112 = Utf8               (Z)V
  #113 = Utf8               setMap
  #114 = Utf8               texture
  #115 = Utf8               Ljava/lang/String;
  #116 = Utf8               x
  #117 = Utf8               y
  #118 = Utf8               SourceFile
  #119 = Utf8               StaticObject.java
  #120 = Utf8               BootstrapMethods
  #121 = String             #122          // town_map.\u0001
  #122 = Utf8               town_map.\u0001
  #123 = MethodHandle       6:#124        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #124 = Methodref          #125.#126     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #125 = Class              #127          // java/lang/invoke/StringConcatFactory
  #126 = NameAndType        #81:#128      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #127 = Utf8               java/lang/invoke/StringConcatFactory
  #128 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #129 = Utf8               InnerClasses
  #130 = Class              #131          // java/lang/invoke/MethodHandles$Lookup
  #131 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #132 = Class              #133          // java/lang/invoke/MethodHandles
  #133 = Utf8               java/lang/invoke/MethodHandles
  #134 = Utf8               Lookup
{
  public ext.mods.gameserver.model.actor.instance.StaticObject(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/WorldObject."<init>":(I)V
         5: aload_0
         6: iconst_m1
         7: putfield      #7                  // Field _type:I
        10: return
      LineNumberTable:
        line 38: 0
        line 32: 5
        line 39: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/actor/instance/StaticObject;
            0      11     1 objectId   I

  public void onInteract(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=2
         0: aload_0
         1: invokevirtual #13                 // Method getType:()I
         4: iconst_2
         5: if_icmpne     38
         8: new           #17                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
        11: dup
        12: aload_0
        13: invokevirtual #19                 // Method getObjectId:()I
        16: invokespecial #22                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
        19: astore_2
        20: aload_2
        21: aload_1
        22: invokevirtual #23                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        25: ldc           #29                 // String html/signboard.htm
        27: invokevirtual #31                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        30: aload_1
        31: aload_2
        32: invokevirtual #35                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        35: goto          53
        38: aload_0
        39: invokevirtual #13                 // Method getType:()I
        42: ifne          53
        45: aload_1
        46: aload_0
        47: invokevirtual #39                 // Method getMap:()Lext/mods/gameserver/network/serverpackets/ShowTownMap;
        50: invokevirtual #35                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        53: return
      LineNumberTable:
        line 44: 0
        line 46: 8
        line 47: 20
        line 48: 30
        line 49: 35
        line 50: 38
        line 51: 45
        line 52: 53
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           20      15     2  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
            0      54     0  this   Lext/mods/gameserver/model/actor/instance/StaticObject;
            0      54     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 2
        frame_type = 38 /* same */
        frame_type = 14 /* same */

  public void onAction(ext.mods.gameserver.model.actor.Player, boolean, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Player;ZZ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=4
         0: aload_1
         1: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Player.getTarget:()Lext/mods/gameserver/model/WorldObject;
         4: aload_0
         5: if_acmpeq     16
         8: aload_1
         9: aload_0
        10: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Player.setTarget:(Lext/mods/gameserver/model/WorldObject;)V
        13: goto          26
        16: aload_1
        17: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
        20: aload_0
        21: iload_2
        22: iload_3
        23: invokevirtual #55                 // Method ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToInteract:(Lext/mods/gameserver/model/WorldObject;ZZ)V
        26: return
      LineNumberTable:
        line 57: 0
        line 58: 8
        line 60: 16
        line 61: 26
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lext/mods/gameserver/model/actor/instance/StaticObject;
            0      27     1 player   Lext/mods/gameserver/model/actor/Player;
            0      27     2 isCtrlPressed   Z
            0      27     3 isShiftPressed   Z
      StackMapTable: number_of_entries = 2
        frame_type = 16 /* same */
        frame_type = 9 /* same */

  public void sendInfo(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_1
         1: new           #61                 // class ext/mods/gameserver/network/serverpackets/StaticObjectInfo
         4: dup
         5: aload_0
         6: invokespecial #63                 // Method ext/mods/gameserver/network/serverpackets/StaticObjectInfo."<init>":(Lext/mods/gameserver/model/actor/instance/StaticObject;)V
         9: invokevirtual #35                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        12: return
      LineNumberTable:
        line 66: 0
        line 67: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/actor/instance/StaticObject;
            0      13     1 player   Lext/mods/gameserver/model/actor/Player;

  public int getStaticObjectId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #66                 // Field _staticObjectId:I
         4: ireturn
      LineNumberTable:
        line 71: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/instance/StaticObject;

  public void setStaticObjectId(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #66                 // Field _staticObjectId:I
         5: return
      LineNumberTable:
        line 76: 0
        line 77: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/instance/StaticObject;
            0       6     1 staticObjectId   I

  public int getType();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _type:I
         4: ireturn
      LineNumberTable:
        line 81: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/instance/StaticObject;

  public void setType(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #7                  // Field _type:I
         5: return
      LineNumberTable:
        line 86: 0
        line 87: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/instance/StaticObject;
            0       6     1  type   I

  public boolean isBusy();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #69                 // Field _isBusy:Z
         4: ireturn
      LineNumberTable:
        line 91: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/instance/StaticObject;

  public void setBusy(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #69                 // Field _isBusy:Z
         5: return
      LineNumberTable:
        line 96: 0
        line 97: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/instance/StaticObject;
            0       6     1 isBusy   Z

  public ext.mods.gameserver.network.serverpackets.ShowTownMap getMap();
    descriptor: ()Lext/mods/gameserver/network/serverpackets/ShowTownMap;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #73                 // Field _map:Lext/mods/gameserver/network/serverpackets/ShowTownMap;
         4: areturn
      LineNumberTable:
        line 101: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/instance/StaticObject;

  public void setMap(java.lang.String, int, int);
    descriptor: (Ljava/lang/String;II)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=4, args_size=4
         0: aload_0
         1: new           #77                 // class ext/mods/gameserver/network/serverpackets/ShowTownMap
         4: dup
         5: aload_1
         6: invokedynamic #79,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        11: iload_2
        12: iload_3
        13: invokespecial #83                 // Method ext/mods/gameserver/network/serverpackets/ShowTownMap."<init>":(Ljava/lang/String;II)V
        16: putfield      #73                 // Field _map:Lext/mods/gameserver/network/serverpackets/ShowTownMap;
        19: return
      LineNumberTable:
        line 106: 0
        line 107: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/model/actor/instance/StaticObject;
            0      20     1 texture   Ljava/lang/String;
            0      20     2     x   I
            0      20     3     y   I
}
SourceFile: "StaticObject.java"
BootstrapMethods:
  0: #123 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #121 town_map.\u0001
InnerClasses:
  public static final #134= #130 of #132; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
