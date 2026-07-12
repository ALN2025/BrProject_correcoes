// Bytecode for: ext.mods.gameserver.model.boat.BoatRouteInfo
// File: ext\mods\gameserver\model\boat\BoatRouteInfo.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/boat/BoatRouteInfo.class
  Last modified 9 de jul de 2026; size 4515 bytes
  MD5 checksum 0e25023582beacdc7f28f709984d3987
  Compiled from "BoatRouteInfo.java"
public class ext.mods.gameserver.model.boat.BoatRouteInfo
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/model/boat/BoatRouteInfo
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 5, methods: 7, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/ArrayList
    #8 = Utf8               java/util/ArrayList
    #9 = Methodref          #7.#3         // java/util/ArrayList."<init>":()V
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/model/boat/BoatRouteInfo._scheduledBoatMessages:Ljava/util/List;
   #11 = Class              #13           // ext/mods/gameserver/model/boat/BoatRouteInfo
   #12 = NameAndType        #14:#15       // _scheduledBoatMessages:Ljava/util/List;
   #13 = Utf8               ext/mods/gameserver/model/boat/BoatRouteInfo
   #14 = Utf8               _scheduledBoatMessages
   #15 = Utf8               Ljava/util/List;
   #16 = Fieldref           #11.#17       // ext/mods/gameserver/model/boat/BoatRouteInfo._paths:[Lext/mods/gameserver/model/location/BoatLocation;
   #17 = NameAndType        #18:#19       // _paths:[Lext/mods/gameserver/model/location/BoatLocation;
   #18 = Utf8               _paths
   #19 = Utf8               [Lext/mods/gameserver/model/location/BoatLocation;
   #20 = Fieldref           #11.#21       // ext/mods/gameserver/model/boat/BoatRouteInfo._dock:Lext/mods/gameserver/enums/boats/BoatDock;
   #21 = NameAndType        #22:#23       // _dock:Lext/mods/gameserver/enums/boats/BoatDock;
   #22 = Utf8               _dock
   #23 = Utf8               Lext/mods/gameserver/enums/boats/BoatDock;
   #24 = Fieldref           #11.#25       // ext/mods/gameserver/model/boat/BoatRouteInfo._itemId:I
   #25 = NameAndType        #26:#27       // _itemId:I
   #26 = Utf8               _itemId
   #27 = Utf8               I
   #28 = Methodref          #29.#30       // ext/mods/gameserver/model/location/BoatLocation.getBusyMessage:()Lext/mods/gameserver/network/serverpackets/BoatSay;
   #29 = Class              #31           // ext/mods/gameserver/model/location/BoatLocation
   #30 = NameAndType        #32:#33       // getBusyMessage:()Lext/mods/gameserver/network/serverpackets/BoatSay;
   #31 = Utf8               ext/mods/gameserver/model/location/BoatLocation
   #32 = Utf8               getBusyMessage
   #33 = Utf8               ()Lext/mods/gameserver/network/serverpackets/BoatSay;
   #34 = Fieldref           #11.#35       // ext/mods/gameserver/model/boat/BoatRouteInfo._isBusy:Lext/mods/gameserver/network/serverpackets/BoatSay;
   #35 = NameAndType        #36:#37       // _isBusy:Lext/mods/gameserver/network/serverpackets/BoatSay;
   #36 = Utf8               _isBusy
   #37 = Utf8               Lext/mods/gameserver/network/serverpackets/BoatSay;
   #38 = Methodref          #39.#40       // ext/mods/gameserver/enums/boats/BoatDock.isBusyOnStart:()Z
   #39 = Class              #41           // ext/mods/gameserver/enums/boats/BoatDock
   #40 = NameAndType        #42:#43       // isBusyOnStart:()Z
   #41 = Utf8               ext/mods/gameserver/enums/boats/BoatDock
   #42 = Utf8               isBusyOnStart
   #43 = Utf8               ()Z
   #44 = Methodref          #39.#45       // ext/mods/gameserver/enums/boats/BoatDock.setBusy:(Z)V
   #45 = NameAndType        #46:#47       // setBusy:(Z)V
   #46 = Utf8               setBusy
   #47 = Utf8               (Z)V
   #48 = Methodref          #29.#49       // ext/mods/gameserver/model/location/BoatLocation.getScheduledMessages:()[Lext/mods/gameserver/model/holder/IntIntHolder;
   #49 = NameAndType        #50:#51       // getScheduledMessages:()[Lext/mods/gameserver/model/holder/IntIntHolder;
   #50 = Utf8               getScheduledMessages
   #51 = Utf8               ()[Lext/mods/gameserver/model/holder/IntIntHolder;
   #52 = Class              #53           // ext/mods/gameserver/network/serverpackets/BoatSay
   #53 = Utf8               ext/mods/gameserver/network/serverpackets/BoatSay
   #54 = Methodref          #55.#56       // ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
   #55 = Class              #57           // ext/mods/gameserver/model/holder/IntIntHolder
   #56 = NameAndType        #58:#59       // getId:()I
   #57 = Utf8               ext/mods/gameserver/model/holder/IntIntHolder
   #58 = Utf8               getId
   #59 = Utf8               ()I
   #60 = Methodref          #61.#62       // ext/mods/gameserver/network/SystemMessageId.getSystemMessageId:(I)Lext/mods/gameserver/network/SystemMessageId;
   #61 = Class              #63           // ext/mods/gameserver/network/SystemMessageId
   #62 = NameAndType        #64:#65       // getSystemMessageId:(I)Lext/mods/gameserver/network/SystemMessageId;
   #63 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #64 = Utf8               getSystemMessageId
   #65 = Utf8               (I)Lext/mods/gameserver/network/SystemMessageId;
   #66 = Methodref          #52.#67       // ext/mods/gameserver/network/serverpackets/BoatSay."<init>":(Lext/mods/gameserver/network/SystemMessageId;)V
   #67 = NameAndType        #5:#68        // "<init>":(Lext/mods/gameserver/network/SystemMessageId;)V
   #68 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #69 = InterfaceMethodref #70.#71       // java/util/List.iterator:()Ljava/util/Iterator;
   #70 = Class              #72           // java/util/List
   #71 = NameAndType        #73:#74       // iterator:()Ljava/util/Iterator;
   #72 = Utf8               java/util/List
   #73 = Utf8               iterator
   #74 = Utf8               ()Ljava/util/Iterator;
   #75 = InterfaceMethodref #76.#77       // java/util/Iterator.hasNext:()Z
   #76 = Class              #78           // java/util/Iterator
   #77 = NameAndType        #79:#43       // hasNext:()Z
   #78 = Utf8               java/util/Iterator
   #79 = Utf8               hasNext
   #80 = InterfaceMethodref #76.#81       // java/util/Iterator.next:()Ljava/lang/Object;
   #81 = NameAndType        #82:#83       // next:()Ljava/lang/Object;
   #82 = Utf8               next
   #83 = Utf8               ()Ljava/lang/Object;
   #84 = Class              #85           // ext/mods/gameserver/model/boat/ScheduledBoatMessages
   #85 = Utf8               ext/mods/gameserver/model/boat/ScheduledBoatMessages
   #86 = Methodref          #84.#87       // ext/mods/gameserver/model/boat/ScheduledBoatMessages.getDelay:()I
   #87 = NameAndType        #88:#59       // getDelay:()I
   #88 = Utf8               getDelay
   #89 = Methodref          #55.#90       // ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
   #90 = NameAndType        #91:#59       // getValue:()I
   #91 = Utf8               getValue
   #92 = Methodref          #84.#93       // ext/mods/gameserver/model/boat/ScheduledBoatMessages.getMessages:()Ljava/util/List;
   #93 = NameAndType        #94:#95       // getMessages:()Ljava/util/List;
   #94 = Utf8               getMessages
   #95 = Utf8               ()Ljava/util/List;
   #96 = InterfaceMethodref #70.#97       // java/util/List.add:(Ljava/lang/Object;)Z
   #97 = NameAndType        #98:#99       // add:(Ljava/lang/Object;)Z
   #98 = Utf8               add
   #99 = Utf8               (Ljava/lang/Object;)Z
  #100 = Methodref          #84.#101      // ext/mods/gameserver/model/boat/ScheduledBoatMessages."<init>":(ILjava/util/List;)V
  #101 = NameAndType        #5:#102       // "<init>":(ILjava/util/List;)V
  #102 = Utf8               (ILjava/util/List;)V
  #103 = InvokeDynamic      #0:#104       // #0:makeConcatWithConstants:(I)Ljava/lang/String;
  #104 = NameAndType        #105:#106     // makeConcatWithConstants:(I)Ljava/lang/String;
  #105 = Utf8               makeConcatWithConstants
  #106 = Utf8               (I)Ljava/lang/String;
  #107 = Fieldref           #108.#109     // java/awt/Color.YELLOW:Ljava/awt/Color;
  #108 = Class              #110          // java/awt/Color
  #109 = NameAndType        #111:#112     // YELLOW:Ljava/awt/Color;
  #110 = Utf8               java/awt/Color
  #111 = Utf8               YELLOW
  #112 = Utf8               Ljava/awt/Color;
  #113 = Methodref          #114.#115     // ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZLext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)V
  #114 = Class              #116          // ext/mods/gameserver/network/serverpackets/ExServerPrimitive
  #115 = NameAndType        #117:#118     // addLine:(Ljava/lang/String;Ljava/awt/Color;ZLext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)V
  #116 = Utf8               ext/mods/gameserver/network/serverpackets/ExServerPrimitive
  #117 = Utf8               addLine
  #118 = Utf8               (Ljava/lang/String;Ljava/awt/Color;ZLext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)V
  #119 = Utf8               Signature
  #120 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/boat/ScheduledBoatMessages;>;
  #121 = Utf8               ([Lext/mods/gameserver/model/location/BoatLocation;Lext/mods/gameserver/enums/boats/BoatDock;I)V
  #122 = Utf8               Code
  #123 = Utf8               LineNumberTable
  #124 = Utf8               LocalVariableTable
  #125 = Utf8               sbm
  #126 = Utf8               Lext/mods/gameserver/model/boat/ScheduledBoatMessages;
  #127 = Utf8               bs
  #128 = Utf8               list
  #129 = Utf8               holder
  #130 = Utf8               Lext/mods/gameserver/model/holder/IntIntHolder;
  #131 = Utf8               messages
  #132 = Utf8               [Lext/mods/gameserver/model/holder/IntIntHolder;
  #133 = Utf8               path
  #134 = Utf8               Lext/mods/gameserver/model/location/BoatLocation;
  #135 = Utf8               this
  #136 = Utf8               Lext/mods/gameserver/model/boat/BoatRouteInfo;
  #137 = Utf8               paths
  #138 = Utf8               dock
  #139 = Utf8               itemId
  #140 = Utf8               LocalVariableTypeTable
  #141 = Utf8               Ljava/util/List<Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;>;
  #142 = Utf8               StackMapTable
  #143 = Class              #19           // "[Lext/mods/gameserver/model/location/BoatLocation;"
  #144 = Class              #132          // "[Lext/mods/gameserver/model/holder/IntIntHolder;"
  #145 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/model/boat/ScheduledBoatMessages;>;
  #146 = Utf8               getDock
  #147 = Utf8               ()Lext/mods/gameserver/enums/boats/BoatDock;
  #148 = Utf8               getItemId
  #149 = Utf8               getPaths
  #150 = Utf8               ()[Lext/mods/gameserver/model/location/BoatLocation;
  #151 = Utf8               visualize
  #152 = Utf8               (Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
  #153 = Utf8               nextIndex
  #154 = Utf8               curPoint
  #155 = Utf8               nextPoint
  #156 = Utf8               i
  #157 = Utf8               debug
  #158 = Utf8               Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
  #159 = Utf8               SourceFile
  #160 = Utf8               BoatRouteInfo.java
  #161 = Utf8               BootstrapMethods
  #162 = String             #163          // Segment #\u0001
  #163 = Utf8               Segment #\u0001
  #164 = MethodHandle       6:#165        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #165 = Methodref          #166.#167     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #166 = Class              #168          // java/lang/invoke/StringConcatFactory
  #167 = NameAndType        #105:#169     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #168 = Utf8               java/lang/invoke/StringConcatFactory
  #169 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #170 = Utf8               InnerClasses
  #171 = Class              #172          // java/lang/invoke/MethodHandles$Lookup
  #172 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #173 = Class              #174          // java/lang/invoke/MethodHandles
  #174 = Utf8               java/lang/invoke/MethodHandles
  #175 = Utf8               Lookup
{
  public ext.mods.gameserver.model.boat.BoatRouteInfo(ext.mods.gameserver.model.location.BoatLocation[], ext.mods.gameserver.enums.boats.BoatDock, int);
    descriptor: ([Lext/mods/gameserver/model/location/BoatLocation;Lext/mods/gameserver/enums/boats/BoatDock;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=16, args_size=4
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/ArrayList
         8: dup
         9: invokespecial #9                  // Method java/util/ArrayList."<init>":()V
        12: putfield      #10                 // Field _scheduledBoatMessages:Ljava/util/List;
        15: aload_0
        16: aload_1
        17: putfield      #16                 // Field _paths:[Lext/mods/gameserver/model/location/BoatLocation;
        20: aload_0
        21: aload_2
        22: putfield      #20                 // Field _dock:Lext/mods/gameserver/enums/boats/BoatDock;
        25: aload_0
        26: iload_3
        27: putfield      #24                 // Field _itemId:I
        30: aload_0
        31: aload_0
        32: getfield      #16                 // Field _paths:[Lext/mods/gameserver/model/location/BoatLocation;
        35: aload_0
        36: getfield      #16                 // Field _paths:[Lext/mods/gameserver/model/location/BoatLocation;
        39: arraylength
        40: iconst_1
        41: isub
        42: aaload
        43: invokevirtual #28                 // Method ext/mods/gameserver/model/location/BoatLocation.getBusyMessage:()Lext/mods/gameserver/network/serverpackets/BoatSay;
        46: putfield      #34                 // Field _isBusy:Lext/mods/gameserver/network/serverpackets/BoatSay;
        49: aload_2
        50: invokevirtual #38                 // Method ext/mods/gameserver/enums/boats/BoatDock.isBusyOnStart:()Z
        53: ifeq          61
        56: aload_2
        57: iconst_1
        58: invokevirtual #44                 // Method ext/mods/gameserver/enums/boats/BoatDock.setBusy:(Z)V
        61: aload_0
        62: getfield      #16                 // Field _paths:[Lext/mods/gameserver/model/location/BoatLocation;
        65: astore        4
        67: aload         4
        69: arraylength
        70: istore        5
        72: iconst_0
        73: istore        6
        75: iload         6
        77: iload         5
        79: if_icmpge     265
        82: aload         4
        84: iload         6
        86: aaload
        87: astore        7
        89: aload         7
        91: invokevirtual #48                 // Method ext/mods/gameserver/model/location/BoatLocation.getScheduledMessages:()[Lext/mods/gameserver/model/holder/IntIntHolder;
        94: astore        8
        96: aload         8
        98: ifnonnull     104
       101: goto          259
       104: aload         8
       106: astore        9
       108: aload         9
       110: arraylength
       111: istore        10
       113: iconst_0
       114: istore        11
       116: iload         11
       118: iload         10
       120: if_icmpge     259
       123: aload         9
       125: iload         11
       127: aaload
       128: astore        12
       130: new           #52                 // class ext/mods/gameserver/network/serverpackets/BoatSay
       133: dup
       134: aload         12
       136: invokevirtual #54                 // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
       139: invokestatic  #60                 // Method ext/mods/gameserver/network/SystemMessageId.getSystemMessageId:(I)Lext/mods/gameserver/network/SystemMessageId;
       142: invokespecial #66                 // Method ext/mods/gameserver/network/serverpackets/BoatSay."<init>":(Lext/mods/gameserver/network/SystemMessageId;)V
       145: astore        13
       147: aload_0
       148: getfield      #10                 // Field _scheduledBoatMessages:Ljava/util/List;
       151: invokeinterface #69,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       156: astore        14
       158: aload         14
       160: invokeinterface #75,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       165: ifeq          210
       168: aload         14
       170: invokeinterface #80,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       175: checkcast     #84                 // class ext/mods/gameserver/model/boat/ScheduledBoatMessages
       178: astore        15
       180: aload         15
       182: invokevirtual #86                 // Method ext/mods/gameserver/model/boat/ScheduledBoatMessages.getDelay:()I
       185: aload         12
       187: invokevirtual #89                 // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
       190: if_icmpne     207
       193: aload         15
       195: invokevirtual #92                 // Method ext/mods/gameserver/model/boat/ScheduledBoatMessages.getMessages:()Ljava/util/List;
       198: aload         13
       200: invokeinterface #96,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       205: pop
       206: return
       207: goto          158
       210: new           #7                  // class java/util/ArrayList
       213: dup
       214: invokespecial #9                  // Method java/util/ArrayList."<init>":()V
       217: astore        14
       219: aload         14
       221: aload         13
       223: invokeinterface #96,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       228: pop
       229: aload_0
       230: getfield      #10                 // Field _scheduledBoatMessages:Ljava/util/List;
       233: new           #84                 // class ext/mods/gameserver/model/boat/ScheduledBoatMessages
       236: dup
       237: aload         12
       239: invokevirtual #89                 // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
       242: aload         14
       244: invokespecial #100                // Method ext/mods/gameserver/model/boat/ScheduledBoatMessages."<init>":(ILjava/util/List;)V
       247: invokeinterface #96,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       252: pop
       253: iinc          11, 1
       256: goto          116
       259: iinc          6, 1
       262: goto          75
       265: return
      LineNumberTable:
        line 42: 0
        line 39: 4
        line 43: 15
        line 44: 20
        line 45: 25
        line 47: 30
        line 49: 49
        line 50: 56
        line 52: 61
        line 54: 89
        line 55: 96
        line 56: 101
        line 58: 104
        line 60: 130
        line 62: 147
        line 64: 180
        line 66: 193
        line 67: 206
        line 69: 207
        line 71: 210
        line 72: 219
        line 74: 229
        line 58: 253
        line 52: 259
        line 77: 265
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          180      27    15   sbm   Lext/mods/gameserver/model/boat/ScheduledBoatMessages;
          147     106    13    bs   Lext/mods/gameserver/network/serverpackets/BoatSay;
          219      34    14  list   Ljava/util/List;
          130     123    12 holder   Lext/mods/gameserver/model/holder/IntIntHolder;
           96     163     8 messages   [Lext/mods/gameserver/model/holder/IntIntHolder;
           89     170     7  path   Lext/mods/gameserver/model/location/BoatLocation;
            0     266     0  this   Lext/mods/gameserver/model/boat/BoatRouteInfo;
            0     266     1 paths   [Lext/mods/gameserver/model/location/BoatLocation;
            0     266     2  dock   Lext/mods/gameserver/enums/boats/BoatDock;
            0     266     3 itemId   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
          219      34    14  list   Ljava/util/List<Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;>;
      StackMapTable: number_of_entries = 9
        frame_type = 255 /* full_frame */
          offset_delta = 61
          locals = [ class ext/mods/gameserver/model/boat/BoatRouteInfo, class "[Lext/mods/gameserver/model/location/BoatLocation;", class ext/mods/gameserver/enums/boats/BoatDock, int ]
          stack = []
        frame_type = 254 /* append */
          offset_delta = 13
          locals = [ class "[Lext/mods/gameserver/model/location/BoatLocation;", int, int ]
        frame_type = 253 /* append */
          offset_delta = 28
          locals = [ class ext/mods/gameserver/model/location/BoatLocation, class "[Lext/mods/gameserver/model/holder/IntIntHolder;" ]
        frame_type = 254 /* append */
          offset_delta = 11
          locals = [ class "[Lext/mods/gameserver/model/holder/IntIntHolder;", int, int ]
        frame_type = 254 /* append */
          offset_delta = 41
          locals = [ class ext/mods/gameserver/model/holder/IntIntHolder, class ext/mods/gameserver/network/serverpackets/BoatSay, class java/util/Iterator ]
        frame_type = 48 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 255 /* full_frame */
          offset_delta = 48
          locals = [ class ext/mods/gameserver/model/boat/BoatRouteInfo, class "[Lext/mods/gameserver/model/location/BoatLocation;", class ext/mods/gameserver/enums/boats/BoatDock, int, class "[Lext/mods/gameserver/model/location/BoatLocation;", int, int ]
          stack = []
        frame_type = 248 /* chop */
          offset_delta = 5

  public java.util.List<ext.mods.gameserver.model.boat.ScheduledBoatMessages> getScheduledMessages();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _scheduledBoatMessages:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 81: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/boat/BoatRouteInfo;
    Signature: #145                         // ()Ljava/util/List<Lext/mods/gameserver/model/boat/ScheduledBoatMessages;>;

  public ext.mods.gameserver.enums.boats.BoatDock getDock();
    descriptor: ()Lext/mods/gameserver/enums/boats/BoatDock;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #20                 // Field _dock:Lext/mods/gameserver/enums/boats/BoatDock;
         4: areturn
      LineNumberTable:
        line 86: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/boat/BoatRouteInfo;

  public ext.mods.gameserver.network.serverpackets.BoatSay getBusyMessage();
    descriptor: ()Lext/mods/gameserver/network/serverpackets/BoatSay;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #34                 // Field _isBusy:Lext/mods/gameserver/network/serverpackets/BoatSay;
         4: areturn
      LineNumberTable:
        line 91: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/boat/BoatRouteInfo;

  public int getItemId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #24                 // Field _itemId:I
         4: ireturn
      LineNumberTable:
        line 96: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/boat/BoatRouteInfo;

  public ext.mods.gameserver.model.location.BoatLocation[] getPaths();
    descriptor: ()[Lext/mods/gameserver/model/location/BoatLocation;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field _paths:[Lext/mods/gameserver/model/location/BoatLocation;
         4: areturn
      LineNumberTable:
        line 101: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/boat/BoatRouteInfo;

  public void visualize(ext.mods.gameserver.network.serverpackets.ExServerPrimitive);
    descriptor: (Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=6, args_size=2
         0: iconst_0
         1: istore_2
         2: iload_2
         3: aload_0
         4: getfield      #16                 // Field _paths:[Lext/mods/gameserver/model/location/BoatLocation;
         7: arraylength
         8: if_icmpge     67
        11: iload_2
        12: iconst_1
        13: iadd
        14: istore_3
        15: iload_3
        16: aload_0
        17: getfield      #16                 // Field _paths:[Lext/mods/gameserver/model/location/BoatLocation;
        20: arraylength
        21: if_icmpne     27
        24: goto          61
        27: aload_0
        28: getfield      #16                 // Field _paths:[Lext/mods/gameserver/model/location/BoatLocation;
        31: iload_2
        32: aaload
        33: astore        4
        35: aload_0
        36: getfield      #16                 // Field _paths:[Lext/mods/gameserver/model/location/BoatLocation;
        39: iload_3
        40: aaload
        41: astore        5
        43: aload_1
        44: iload_2
        45: invokedynamic #103,  0            // InvokeDynamic #0:makeConcatWithConstants:(I)Ljava/lang/String;
        50: getstatic     #107                // Field java/awt/Color.YELLOW:Ljava/awt/Color;
        53: iconst_1
        54: aload         4
        56: aload         5
        58: invokevirtual #113                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZLext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)V
        61: iinc          2, 1
        64: goto          2
        67: return
      LineNumberTable:
        line 106: 0
        line 108: 11
        line 110: 15
        line 111: 24
        line 113: 27
        line 114: 35
        line 116: 43
        line 106: 61
        line 118: 67
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           15      46     3 nextIndex   I
           35      26     4 curPoint   Lext/mods/gameserver/model/location/BoatLocation;
           43      18     5 nextPoint   Lext/mods/gameserver/model/location/BoatLocation;
            2      65     2     i   I
            0      68     0  this   Lext/mods/gameserver/model/boat/BoatRouteInfo;
            0      68     1 debug   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
      StackMapTable: number_of_entries = 4
        frame_type = 252 /* append */
          offset_delta = 2
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 33
        frame_type = 250 /* chop */
          offset_delta = 5
}
SourceFile: "BoatRouteInfo.java"
BootstrapMethods:
  0: #164 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #162 Segment #\u0001
InnerClasses:
  public static final #175= #171 of #173; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
