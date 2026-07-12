// Bytecode for: ext.mods.gameserver.model.entity.CursedWeapon$DailyTimer
// File: ext\mods\gameserver\model\entity\CursedWeapon$DailyTimer.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/entity/CursedWeapon$DailyTimer.class
  Last modified 9 de jul de 2026; size 2124 bytes
  MD5 checksum dbde5dce2eda65483fd5388c48c782aa
  Compiled from "CursedWeapon.java"
class ext.mods.gameserver.model.entity.CursedWeapon$DailyTimer implements java.lang.Runnable
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/entity/CursedWeapon$DailyTimer
  super_class: #14                        // java/lang/Object
  interfaces: 1, fields: 2, methods: 2, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
    #2 = Class              #4            // java/util/Objects
    #3 = NameAndType        #5:#6         // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
    #4 = Utf8               java/util/Objects
    #5 = Utf8               requireNonNull
    #6 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/entity/CursedWeapon$DailyTimer.this$0:Lext/mods/gameserver/model/entity/CursedWeapon;
    #8 = Class              #10           // ext/mods/gameserver/model/entity/CursedWeapon$DailyTimer
    #9 = NameAndType        #11:#12       // this$0:Lext/mods/gameserver/model/entity/CursedWeapon;
   #10 = Utf8               ext/mods/gameserver/model/entity/CursedWeapon$DailyTimer
   #11 = Utf8               this$0
   #12 = Utf8               Lext/mods/gameserver/model/entity/CursedWeapon;
   #13 = Methodref          #14.#15       // java/lang/Object."<init>":()V
   #14 = Class              #16           // java/lang/Object
   #15 = NameAndType        #17:#18       // "<init>":()V
   #16 = Utf8               java/lang/Object
   #17 = Utf8               <init>
   #18 = Utf8               ()V
   #19 = Fieldref           #8.#20        // ext/mods/gameserver/model/entity/CursedWeapon$DailyTimer._timer:I
   #20 = NameAndType        #21:#22       // _timer:I
   #21 = Utf8               _timer
   #22 = Utf8               I
   #23 = Fieldref           #24.#25       // ext/mods/gameserver/model/entity/CursedWeapon._hungryTime:I
   #24 = Class              #26           // ext/mods/gameserver/model/entity/CursedWeapon
   #25 = NameAndType        #27:#22       // _hungryTime:I
   #26 = Utf8               ext/mods/gameserver/model/entity/CursedWeapon
   #27 = Utf8               _hungryTime
   #28 = Methodref          #24.#29       // ext/mods/gameserver/model/entity/CursedWeapon.endOfLife:()V
   #29 = NameAndType        #30:#18       // endOfLife:()V
   #30 = Utf8               endOfLife
   #31 = Fieldref           #24.#32       // ext/mods/gameserver/model/entity/CursedWeapon._player:Lext/mods/gameserver/model/actor/Player;
   #32 = NameAndType        #33:#34       // _player:Lext/mods/gameserver/model/actor/Player;
   #33 = Utf8               _player
   #34 = Utf8               Lext/mods/gameserver/model/actor/Player;
   #35 = Methodref          #36.#37       // ext/mods/gameserver/model/actor/Player.isOnline:()Z
   #36 = Class              #38           // ext/mods/gameserver/model/actor/Player
   #37 = NameAndType        #39:#40       // isOnline:()Z
   #38 = Utf8               ext/mods/gameserver/model/actor/Player
   #39 = Utf8               isOnline
   #40 = Utf8               ()Z
   #41 = Methodref          #24.#42       // ext/mods/gameserver/model/entity/CursedWeapon.getTimeLeft:()J
   #42 = NameAndType        #43:#44       // getTimeLeft:()J
   #43 = Utf8               getTimeLeft
   #44 = Utf8               ()J
   #45 = Long               60000l
   #47 = Fieldref           #48.#49       // ext/mods/gameserver/network/SystemMessageId.S2_HOUR_OF_USAGE_TIME_ARE_LEFT_FOR_S1:Lext/mods/gameserver/network/SystemMessageId;
   #48 = Class              #50           // ext/mods/gameserver/network/SystemMessageId
   #49 = NameAndType        #51:#52       // S2_HOUR_OF_USAGE_TIME_ARE_LEFT_FOR_S1:Lext/mods/gameserver/network/SystemMessageId;
   #50 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #51 = Utf8               S2_HOUR_OF_USAGE_TIME_ARE_LEFT_FOR_S1
   #52 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #53 = Methodref          #54.#55       // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #54 = Class              #56           // ext/mods/gameserver/network/serverpackets/SystemMessage
   #55 = NameAndType        #57:#58       // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #56 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
   #57 = Utf8               getSystemMessage
   #58 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #59 = Methodref          #36.#60       // ext/mods/gameserver/model/actor/Player.getCursedWeaponEquippedId:()I
   #60 = NameAndType        #61:#62       // getCursedWeaponEquippedId:()I
   #61 = Utf8               getCursedWeaponEquippedId
   #62 = Utf8               ()I
   #63 = Methodref          #54.#64       // ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #64 = NameAndType        #65:#66       // addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #65 = Utf8               addItemName
   #66 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #67 = Float              60.0f
   #68 = Methodref          #69.#70       // java/lang/Math.round:(F)I
   #69 = Class              #71           // java/lang/Math
   #70 = NameAndType        #72:#73       // round:(F)I
   #71 = Utf8               java/lang/Math
   #72 = Utf8               round
   #73 = Utf8               (F)I
   #74 = Methodref          #54.#75       // ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #75 = NameAndType        #76:#66       // addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #76 = Utf8               addNumber
   #77 = Fieldref           #48.#78       // ext/mods/gameserver/network/SystemMessageId.S2_MINUTE_OF_USAGE_TIME_ARE_LEFT_FOR_S1:Lext/mods/gameserver/network/SystemMessageId;
   #78 = NameAndType        #79:#52       // S2_MINUTE_OF_USAGE_TIME_ARE_LEFT_FOR_S1:Lext/mods/gameserver/network/SystemMessageId;
   #79 = Utf8               S2_MINUTE_OF_USAGE_TIME_ARE_LEFT_FOR_S1
   #80 = Methodref          #36.#81       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #81 = NameAndType        #82:#83       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #82 = Utf8               sendPacket
   #83 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #84 = Class              #85           // java/lang/Runnable
   #85 = Utf8               java/lang/Runnable
   #86 = Utf8               (Lext/mods/gameserver/model/entity/CursedWeapon;)V
   #87 = Utf8               Code
   #88 = Utf8               LineNumberTable
   #89 = Utf8               LocalVariableTable
   #90 = Utf8               this
   #91 = Utf8               Lext/mods/gameserver/model/entity/CursedWeapon$DailyTimer;
   #92 = Utf8               MethodParameters
   #93 = Utf8               run
   #94 = Utf8               msg
   #95 = Utf8               Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #96 = Utf8               timeLeft
   #97 = Utf8               StackMapTable
   #98 = Utf8               SourceFile
   #99 = Utf8               CursedWeapon.java
  #100 = Utf8               NestHost
  #101 = Utf8               InnerClasses
  #102 = Utf8               DailyTimer
{
  final ext.mods.gameserver.model.entity.CursedWeapon this$0;
    descriptor: Lext/mods/gameserver/model/entity/CursedWeapon;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  protected ext.mods.gameserver.model.entity.CursedWeapon$DailyTimer(ext.mods.gameserver.model.entity.CursedWeapon);
    descriptor: (Lext/mods/gameserver/model/entity/CursedWeapon;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: dup
         3: invokestatic  #1                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
         6: pop
         7: putfield      #7                  // Field this$0:Lext/mods/gameserver/model/entity/CursedWeapon;
        10: aload_0
        11: invokespecial #13                 // Method java/lang/Object."<init>":()V
        14: aload_0
        15: iconst_0
        16: putfield      #19                 // Field _timer:I
        19: return
      LineNumberTable:
        line 693: 0
        line 690: 14
        line 694: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/model/entity/CursedWeapon$DailyTimer;
    MethodParameters:
      Name                           Flags
      <no name>                      final synthetic

  public void run();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=1
         0: aload_0
         1: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/entity/CursedWeapon;
         4: dup
         5: getfield      #23                 // Field ext/mods/gameserver/model/entity/CursedWeapon._hungryTime:I
         8: iconst_1
         9: isub
        10: putfield      #23                 // Field ext/mods/gameserver/model/entity/CursedWeapon._hungryTime:I
        13: aload_0
        14: dup
        15: getfield      #19                 // Field _timer:I
        18: iconst_1
        19: iadd
        20: putfield      #19                 // Field _timer:I
        23: aload_0
        24: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/entity/CursedWeapon;
        27: getfield      #23                 // Field ext/mods/gameserver/model/entity/CursedWeapon._hungryTime:I
        30: ifgt          43
        33: aload_0
        34: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/entity/CursedWeapon;
        37: invokevirtual #28                 // Method ext/mods/gameserver/model/entity/CursedWeapon.endOfLife:()V
        40: goto          164
        43: aload_0
        44: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/entity/CursedWeapon;
        47: getfield      #31                 // Field ext/mods/gameserver/model/entity/CursedWeapon._player:Lext/mods/gameserver/model/actor/Player;
        50: ifnull        164
        53: aload_0
        54: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/entity/CursedWeapon;
        57: getfield      #31                 // Field ext/mods/gameserver/model/entity/CursedWeapon._player:Lext/mods/gameserver/model/actor/Player;
        60: invokevirtual #35                 // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
        63: ifeq          164
        66: aload_0
        67: getfield      #19                 // Field _timer:I
        70: bipush        60
        72: irem
        73: ifne          164
        76: aload_0
        77: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/entity/CursedWeapon;
        80: invokevirtual #41                 // Method ext/mods/gameserver/model/entity/CursedWeapon.getTimeLeft:()J
        83: ldc2_w        #45                 // long 60000l
        86: ldiv
        87: l2i
        88: istore_2
        89: iload_2
        90: bipush        60
        92: if_icmple     129
        95: getstatic     #47                 // Field ext/mods/gameserver/network/SystemMessageId.S2_HOUR_OF_USAGE_TIME_ARE_LEFT_FOR_S1:Lext/mods/gameserver/network/SystemMessageId;
        98: invokestatic  #53                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       101: aload_0
       102: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/entity/CursedWeapon;
       105: getfield      #31                 // Field ext/mods/gameserver/model/entity/CursedWeapon._player:Lext/mods/gameserver/model/actor/Player;
       108: invokevirtual #59                 // Method ext/mods/gameserver/model/actor/Player.getCursedWeaponEquippedId:()I
       111: invokevirtual #63                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       114: iload_2
       115: i2f
       116: ldc           #67                 // float 60.0f
       118: fdiv
       119: invokestatic  #68                 // Method java/lang/Math.round:(F)I
       122: invokevirtual #74                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       125: astore_1
       126: goto          153
       129: getstatic     #77                 // Field ext/mods/gameserver/network/SystemMessageId.S2_MINUTE_OF_USAGE_TIME_ARE_LEFT_FOR_S1:Lext/mods/gameserver/network/SystemMessageId;
       132: invokestatic  #53                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       135: aload_0
       136: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/entity/CursedWeapon;
       139: getfield      #31                 // Field ext/mods/gameserver/model/entity/CursedWeapon._player:Lext/mods/gameserver/model/actor/Player;
       142: invokevirtual #59                 // Method ext/mods/gameserver/model/actor/Player.getCursedWeaponEquippedId:()I
       145: invokevirtual #63                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       148: iload_2
       149: invokevirtual #74                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       152: astore_1
       153: aload_0
       154: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/entity/CursedWeapon;
       157: getfield      #31                 // Field ext/mods/gameserver/model/entity/CursedWeapon._player:Lext/mods/gameserver/model/actor/Player;
       160: aload_1
       161: invokevirtual #80                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       164: return
      LineNumberTable:
        line 699: 0
        line 700: 13
        line 702: 23
        line 703: 33
        line 704: 43
        line 707: 76
        line 708: 89
        line 709: 95
        line 711: 129
        line 713: 153
        line 715: 164
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          126       3     1   msg   Lext/mods/gameserver/network/serverpackets/SystemMessage;
          153      11     1   msg   Lext/mods/gameserver/network/serverpackets/SystemMessage;
           89      75     2 timeLeft   I
            0     165     0  this   Lext/mods/gameserver/model/entity/CursedWeapon$DailyTimer;
      StackMapTable: number_of_entries = 4
        frame_type = 43 /* same */
        frame_type = 253 /* append */
          offset_delta = 85
          locals = [ top, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/model/entity/CursedWeapon$DailyTimer, class ext/mods/gameserver/network/serverpackets/SystemMessage, int ]
          stack = []
        frame_type = 249 /* chop */
          offset_delta = 10
}
SourceFile: "CursedWeapon.java"
NestHost: class ext/mods/gameserver/model/entity/CursedWeapon
