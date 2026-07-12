// Bytecode for: ext.mods.gameserver.model.location.BoatLocation
// File: ext\mods\gameserver\model\location\BoatLocation.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/location/BoatLocation.class
  Last modified 9 de jul de 2026; size 4065 bytes
  MD5 checksum f975208189b3b365b5d7a10003036395
  Compiled from "BoatLocation.java"
public class ext.mods.gameserver.model.location.BoatLocation extends ext.mods.gameserver.model.location.Location
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/location/BoatLocation
  super_class: #2                         // ext/mods/gameserver/model/location/Location
  interfaces: 0, fields: 6, methods: 11, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/location/Location."<init>":(III)V
    #2 = Class              #4            // ext/mods/gameserver/model/location/Location
    #3 = NameAndType        #5:#6         // "<init>":(III)V
    #4 = Utf8               ext/mods/gameserver/model/location/Location
    #5 = Utf8               <init>
    #6 = Utf8               (III)V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/location/BoatLocation._moveSpeed:I
    #8 = Class              #10           // ext/mods/gameserver/model/location/BoatLocation
    #9 = NameAndType        #11:#12       // _moveSpeed:I
   #10 = Utf8               ext/mods/gameserver/model/location/BoatLocation
   #11 = Utf8               _moveSpeed
   #12 = Utf8               I
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/model/location/BoatLocation._rotationSpeed:I
   #14 = NameAndType        #15:#12       // _rotationSpeed:I
   #15 = Utf8               _rotationSpeed
   #16 = Methodref          #2.#17        // ext/mods/gameserver/model/location/Location."<init>":(Lext/mods/commons/data/StatSet;)V
   #17 = NameAndType        #5:#18        // "<init>":(Lext/mods/commons/data/StatSet;)V
   #18 = Utf8               (Lext/mods/commons/data/StatSet;)V
   #19 = String             #20           // speed
   #20 = Utf8               speed
   #21 = Methodref          #22.#23       // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
   #22 = Class              #24           // ext/mods/commons/data/StatSet
   #23 = NameAndType        #25:#26       // getInteger:(Ljava/lang/String;I)I
   #24 = Utf8               ext/mods/commons/data/StatSet
   #25 = Utf8               getInteger
   #26 = Utf8               (Ljava/lang/String;I)I
   #27 = String             #28           // rotation
   #28 = Utf8               rotation
   #29 = String             #30           // busy
   #30 = Utf8               busy
   #31 = Class              #32           // ext/mods/gameserver/network/serverpackets/BoatSay
   #32 = Utf8               ext/mods/gameserver/network/serverpackets/BoatSay
   #33 = Methodref          #34.#35       // ext/mods/gameserver/network/SystemMessageId.getSystemMessageId:(I)Lext/mods/gameserver/network/SystemMessageId;
   #34 = Class              #36           // ext/mods/gameserver/network/SystemMessageId
   #35 = NameAndType        #37:#38       // getSystemMessageId:(I)Lext/mods/gameserver/network/SystemMessageId;
   #36 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #37 = Utf8               getSystemMessageId
   #38 = Utf8               (I)Lext/mods/gameserver/network/SystemMessageId;
   #39 = Methodref          #31.#40       // ext/mods/gameserver/network/serverpackets/BoatSay."<init>":(Lext/mods/gameserver/network/SystemMessageId;)V
   #40 = NameAndType        #5:#41        // "<init>":(Lext/mods/gameserver/network/SystemMessageId;)V
   #41 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #42 = Fieldref           #8.#43        // ext/mods/gameserver/model/location/BoatLocation._busyMessage:Lext/mods/gameserver/network/serverpackets/BoatSay;
   #43 = NameAndType        #44:#45       // _busyMessage:Lext/mods/gameserver/network/serverpackets/BoatSay;
   #44 = Utf8               _busyMessage
   #45 = Utf8               Lext/mods/gameserver/network/serverpackets/BoatSay;
   #46 = String             #47           // arrival
   #47 = Utf8               arrival
   #48 = Methodref          #22.#49       // ext/mods/commons/data/StatSet.getStringArray:(Ljava/lang/String;[Ljava/lang/String;)[Ljava/lang/String;
   #49 = NameAndType        #50:#51       // getStringArray:(Ljava/lang/String;[Ljava/lang/String;)[Ljava/lang/String;
   #50 = Utf8               getStringArray
   #51 = Utf8               (Ljava/lang/String;[Ljava/lang/String;)[Ljava/lang/String;
   #52 = Methodref          #8.#53        // ext/mods/gameserver/model/location/BoatLocation.getBoatSayArray:([Ljava/lang/String;)[Lext/mods/gameserver/network/serverpackets/BoatSay;
   #53 = NameAndType        #54:#55       // getBoatSayArray:([Ljava/lang/String;)[Lext/mods/gameserver/network/serverpackets/BoatSay;
   #54 = Utf8               getBoatSayArray
   #55 = Utf8               ([Ljava/lang/String;)[Lext/mods/gameserver/network/serverpackets/BoatSay;
   #56 = Fieldref           #8.#57        // ext/mods/gameserver/model/location/BoatLocation._arrivalMessages:[Lext/mods/gameserver/network/serverpackets/BoatSay;
   #57 = NameAndType        #58:#59       // _arrivalMessages:[Lext/mods/gameserver/network/serverpackets/BoatSay;
   #58 = Utf8               _arrivalMessages
   #59 = Utf8               [Lext/mods/gameserver/network/serverpackets/BoatSay;
   #60 = String             #61           // departure
   #61 = Utf8               departure
   #62 = Fieldref           #8.#63        // ext/mods/gameserver/model/location/BoatLocation._departureMessages:[Lext/mods/gameserver/network/serverpackets/BoatSay;
   #63 = NameAndType        #64:#59       // _departureMessages:[Lext/mods/gameserver/network/serverpackets/BoatSay;
   #64 = Utf8               _departureMessages
   #65 = String             #66           // scheduled
   #66 = Utf8               scheduled
   #67 = Methodref          #22.#68       // ext/mods/commons/data/StatSet.getIntIntHolderArray:(Ljava/lang/String;[Lext/mods/gameserver/model/holder/IntIntHolder;)[Lext/mods/gameserver/model/holder/IntIntHolder;
   #68 = NameAndType        #69:#70       // getIntIntHolderArray:(Ljava/lang/String;[Lext/mods/gameserver/model/holder/IntIntHolder;)[Lext/mods/gameserver/model/holder/IntIntHolder;
   #69 = Utf8               getIntIntHolderArray
   #70 = Utf8               (Ljava/lang/String;[Lext/mods/gameserver/model/holder/IntIntHolder;)[Lext/mods/gameserver/model/holder/IntIntHolder;
   #71 = Fieldref           #8.#72        // ext/mods/gameserver/model/location/BoatLocation._scheduledMessages:[Lext/mods/gameserver/model/holder/IntIntHolder;
   #72 = NameAndType        #73:#74       // _scheduledMessages:[Lext/mods/gameserver/model/holder/IntIntHolder;
   #73 = Utf8               _scheduledMessages
   #74 = Utf8               [Lext/mods/gameserver/model/holder/IntIntHolder;
   #75 = InterfaceMethodref #76.#77       // java/util/stream/Stream.of:([Ljava/lang/Object;)Ljava/util/stream/Stream;
   #76 = Class              #78           // java/util/stream/Stream
   #77 = NameAndType        #79:#80       // of:([Ljava/lang/Object;)Ljava/util/stream/Stream;
   #78 = Utf8               java/util/stream/Stream
   #79 = Utf8               of
   #80 = Utf8               ([Ljava/lang/Object;)Ljava/util/stream/Stream;
   #81 = InvokeDynamic      #0:#82        // #0:apply:()Ljava/util/function/Function;
   #82 = NameAndType        #83:#84       // apply:()Ljava/util/function/Function;
   #83 = Utf8               apply
   #84 = Utf8               ()Ljava/util/function/Function;
   #85 = InterfaceMethodref #76.#86       // java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
   #86 = NameAndType        #87:#88       // map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
   #87 = Utf8               map
   #88 = Utf8               (Ljava/util/function/Function;)Ljava/util/stream/Stream;
   #89 = InvokeDynamic      #1:#90        // #1:apply:()Ljava/util/function/IntFunction;
   #90 = NameAndType        #83:#91       // apply:()Ljava/util/function/IntFunction;
   #91 = Utf8               ()Ljava/util/function/IntFunction;
   #92 = InterfaceMethodref #76.#93       // java/util/stream/Stream.toArray:(Ljava/util/function/IntFunction;)[Ljava/lang/Object;
   #93 = NameAndType        #94:#95       // toArray:(Ljava/util/function/IntFunction;)[Ljava/lang/Object;
   #94 = Utf8               toArray
   #95 = Utf8               (Ljava/util/function/IntFunction;)[Ljava/lang/Object;
   #96 = Class              #59           // "[Lext/mods/gameserver/network/serverpackets/BoatSay;"
   #97 = Methodref          #98.#99       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #98 = Class              #100          // java/lang/Integer
   #99 = NameAndType        #101:#102     // parseInt:(Ljava/lang/String;)I
  #100 = Utf8               java/lang/Integer
  #101 = Utf8               parseInt
  #102 = Utf8               (Ljava/lang/String;)I
  #103 = Utf8               (IIIII)V
  #104 = Utf8               Code
  #105 = Utf8               LineNumberTable
  #106 = Utf8               LocalVariableTable
  #107 = Utf8               this
  #108 = Utf8               Lext/mods/gameserver/model/location/BoatLocation;
  #109 = Utf8               x
  #110 = Utf8               y
  #111 = Utf8               z
  #112 = Utf8               moveSpeed
  #113 = Utf8               rotationSpeed
  #114 = Utf8               set
  #115 = Utf8               Lext/mods/commons/data/StatSet;
  #116 = Utf8               StackMapTable
  #117 = Utf8               messages
  #118 = Utf8               [Ljava/lang/String;
  #119 = Utf8               getMoveSpeed
  #120 = Utf8               ()I
  #121 = Utf8               getRotationSpeed
  #122 = Utf8               getBusyMessage
  #123 = Utf8               ()Lext/mods/gameserver/network/serverpackets/BoatSay;
  #124 = Utf8               getArrivalMessages
  #125 = Utf8               ()[Lext/mods/gameserver/network/serverpackets/BoatSay;
  #126 = Utf8               getDepartureMessages
  #127 = Utf8               getScheduledMessages
  #128 = Utf8               ()[Lext/mods/gameserver/model/holder/IntIntHolder;
  #129 = Utf8               lambda$getBoatSayArray$1
  #130 = Utf8               (I)[Lext/mods/gameserver/network/serverpackets/BoatSay;
  #131 = Utf8               x$0
  #132 = Utf8               lambda$getBoatSayArray$0
  #133 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/BoatSay;
  #134 = Utf8               message
  #135 = Utf8               Ljava/lang/String;
  #136 = Utf8               SourceFile
  #137 = Utf8               BoatLocation.java
  #138 = Utf8               BootstrapMethods
  #139 = MethodType         #140          //  (Ljava/lang/Object;)Ljava/lang/Object;
  #140 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #141 = MethodHandle       6:#142        // REF_invokeStatic ext/mods/gameserver/model/location/BoatLocation.lambda$getBoatSayArray$0:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/BoatSay;
  #142 = Methodref          #8.#143       // ext/mods/gameserver/model/location/BoatLocation.lambda$getBoatSayArray$0:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/BoatSay;
  #143 = NameAndType        #132:#133     // lambda$getBoatSayArray$0:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/BoatSay;
  #144 = MethodType         #133          //  (Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/BoatSay;
  #145 = MethodType         #146          //  (I)Ljava/lang/Object;
  #146 = Utf8               (I)Ljava/lang/Object;
  #147 = MethodHandle       6:#148        // REF_invokeStatic ext/mods/gameserver/model/location/BoatLocation.lambda$getBoatSayArray$1:(I)[Lext/mods/gameserver/network/serverpackets/BoatSay;
  #148 = Methodref          #8.#149       // ext/mods/gameserver/model/location/BoatLocation.lambda$getBoatSayArray$1:(I)[Lext/mods/gameserver/network/serverpackets/BoatSay;
  #149 = NameAndType        #129:#130     // lambda$getBoatSayArray$1:(I)[Lext/mods/gameserver/network/serverpackets/BoatSay;
  #150 = MethodType         #130          //  (I)[Lext/mods/gameserver/network/serverpackets/BoatSay;
  #151 = MethodHandle       6:#152        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #152 = Methodref          #153.#154     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #153 = Class              #155          // java/lang/invoke/LambdaMetafactory
  #154 = NameAndType        #156:#157     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #155 = Utf8               java/lang/invoke/LambdaMetafactory
  #156 = Utf8               metafactory
  #157 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #158 = Utf8               InnerClasses
  #159 = Class              #160          // java/lang/invoke/MethodHandles$Lookup
  #160 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #161 = Class              #162          // java/lang/invoke/MethodHandles
  #162 = Utf8               java/lang/invoke/MethodHandles
  #163 = Utf8               Lookup
{
  public ext.mods.gameserver.model.location.BoatLocation(int, int, int, int, int);
    descriptor: (IIIII)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=6, args_size=6
         0: aload_0
         1: iload_1
         2: iload_2
         3: iload_3
         4: invokespecial #1                  // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
         7: aload_0
         8: iload         4
        10: putfield      #7                  // Field _moveSpeed:I
        13: aload_0
        14: iload         5
        16: putfield      #13                 // Field _rotationSpeed:I
        19: return
      LineNumberTable:
        line 44: 0
        line 46: 7
        line 47: 13
        line 48: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/model/location/BoatLocation;
            0      20     1     x   I
            0      20     2     y   I
            0      20     3     z   I
            0      20     4 moveSpeed   I
            0      20     5 rotationSpeed   I

  public ext.mods.gameserver.model.location.BoatLocation(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #16                 // Method ext/mods/gameserver/model/location/Location."<init>":(Lext/mods/commons/data/StatSet;)V
         5: aload_0
         6: aload_1
         7: ldc           #19                 // String speed
         9: sipush        350
        12: invokevirtual #21                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        15: putfield      #7                  // Field _moveSpeed:I
        18: aload_0
        19: aload_1
        20: ldc           #27                 // String rotation
        22: sipush        4000
        25: invokevirtual #21                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        28: putfield      #13                 // Field _rotationSpeed:I
        31: aload_1
        32: ldc           #29                 // String busy
        34: iconst_0
        35: invokevirtual #21                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        38: istore_2
        39: iload_2
        40: ifeq          58
        43: aload_0
        44: new           #31                 // class ext/mods/gameserver/network/serverpackets/BoatSay
        47: dup
        48: iload_2
        49: invokestatic  #33                 // Method ext/mods/gameserver/network/SystemMessageId.getSystemMessageId:(I)Lext/mods/gameserver/network/SystemMessageId;
        52: invokespecial #39                 // Method ext/mods/gameserver/network/serverpackets/BoatSay."<init>":(Lext/mods/gameserver/network/SystemMessageId;)V
        55: putfield      #42                 // Field _busyMessage:Lext/mods/gameserver/network/serverpackets/BoatSay;
        58: aload_0
        59: aload_1
        60: ldc           #46                 // String arrival
        62: aconst_null
        63: invokevirtual #48                 // Method ext/mods/commons/data/StatSet.getStringArray:(Ljava/lang/String;[Ljava/lang/String;)[Ljava/lang/String;
        66: invokestatic  #52                 // Method getBoatSayArray:([Ljava/lang/String;)[Lext/mods/gameserver/network/serverpackets/BoatSay;
        69: putfield      #56                 // Field _arrivalMessages:[Lext/mods/gameserver/network/serverpackets/BoatSay;
        72: aload_0
        73: aload_1
        74: ldc           #60                 // String departure
        76: aconst_null
        77: invokevirtual #48                 // Method ext/mods/commons/data/StatSet.getStringArray:(Ljava/lang/String;[Ljava/lang/String;)[Ljava/lang/String;
        80: invokestatic  #52                 // Method getBoatSayArray:([Ljava/lang/String;)[Lext/mods/gameserver/network/serverpackets/BoatSay;
        83: putfield      #62                 // Field _departureMessages:[Lext/mods/gameserver/network/serverpackets/BoatSay;
        86: aload_0
        87: aload_1
        88: ldc           #65                 // String scheduled
        90: aconst_null
        91: invokevirtual #67                 // Method ext/mods/commons/data/StatSet.getIntIntHolderArray:(Ljava/lang/String;[Lext/mods/gameserver/model/holder/IntIntHolder;)[Lext/mods/gameserver/model/holder/IntIntHolder;
        94: putfield      #71                 // Field _scheduledMessages:[Lext/mods/gameserver/model/holder/IntIntHolder;
        97: return
      LineNumberTable:
        line 52: 0
        line 54: 5
        line 55: 18
        line 57: 31
        line 58: 39
        line 59: 43
        line 61: 58
        line 62: 72
        line 64: 86
        line 65: 97
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      98     0  this   Lext/mods/gameserver/model/location/BoatLocation;
            0      98     1   set   Lext/mods/commons/data/StatSet;
           39      59     2  busy   I
      StackMapTable: number_of_entries = 1
        frame_type = 255 /* full_frame */
          offset_delta = 58
          locals = [ class ext/mods/gameserver/model/location/BoatLocation, class ext/mods/commons/data/StatSet, int ]
          stack = []

  public int getMoveSpeed();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _moveSpeed:I
         4: ireturn
      LineNumberTable:
        line 77: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/location/BoatLocation;

  public int getRotationSpeed();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _rotationSpeed:I
         4: ireturn
      LineNumberTable:
        line 82: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/location/BoatLocation;

  public ext.mods.gameserver.network.serverpackets.BoatSay getBusyMessage();
    descriptor: ()Lext/mods/gameserver/network/serverpackets/BoatSay;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #42                 // Field _busyMessage:Lext/mods/gameserver/network/serverpackets/BoatSay;
         4: areturn
      LineNumberTable:
        line 87: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/location/BoatLocation;

  public ext.mods.gameserver.network.serverpackets.BoatSay[] getArrivalMessages();
    descriptor: ()[Lext/mods/gameserver/network/serverpackets/BoatSay;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #56                 // Field _arrivalMessages:[Lext/mods/gameserver/network/serverpackets/BoatSay;
         4: areturn
      LineNumberTable:
        line 92: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/location/BoatLocation;

  public ext.mods.gameserver.network.serverpackets.BoatSay[] getDepartureMessages();
    descriptor: ()[Lext/mods/gameserver/network/serverpackets/BoatSay;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #62                 // Field _departureMessages:[Lext/mods/gameserver/network/serverpackets/BoatSay;
         4: areturn
      LineNumberTable:
        line 97: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/location/BoatLocation;

  public ext.mods.gameserver.model.holder.IntIntHolder[] getScheduledMessages();
    descriptor: ()[Lext/mods/gameserver/model/holder/IntIntHolder;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #71                 // Field _scheduledMessages:[Lext/mods/gameserver/model/holder/IntIntHolder;
         4: areturn
      LineNumberTable:
        line 102: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/location/BoatLocation;
}
SourceFile: "BoatLocation.java"
BootstrapMethods:
  0: #151 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #139 (Ljava/lang/Object;)Ljava/lang/Object;
      #141 REF_invokeStatic ext/mods/gameserver/model/location/BoatLocation.lambda$getBoatSayArray$0:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/BoatSay;
      #144 (Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/BoatSay;
  1: #151 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #145 (I)Ljava/lang/Object;
      #147 REF_invokeStatic ext/mods/gameserver/model/location/BoatLocation.lambda$getBoatSayArray$1:(I)[Lext/mods/gameserver/network/serverpackets/BoatSay;
      #150 (I)[Lext/mods/gameserver/network/serverpackets/BoatSay;
InnerClasses:
  public static final #163= #159 of #161; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
